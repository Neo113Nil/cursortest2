package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class ws01 extends nz4 implements jil0 {
    public final LinkedBlockingQueue a;
    public final long b;
    public byte[] c;
    public int w;

    public ws01() {
        super(true);
        this.b = 8000L;
        this.a = new LinkedBlockingQueue();
        this.c = new byte[0];
        this.w = -1;
    }

    @Override // defpackage.jil0
    public final String D() {
        d6z.x(this.w != -1);
        int i = this.w;
        int i2 = this.w + 1;
        int i3 = tw21.a;
        Locale locale = Locale.US;
        return oyr.h(i, i2, "RTP/AVP/TCP;unicast;interleaved=", "-");
    }

    @Override // defpackage.jil0
    public final boolean K() {
        return false;
    }

    @Override // defpackage.jil0
    public final ws01 M() {
        return this;
    }

    @Override // defpackage.kpg
    public final void close() {
    }

    @Override // defpackage.jil0
    public final int getLocalPort() {
        return this.w;
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public final Uri getInflatedUri() {
        return null;
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        this.w = npgVar.a.getPort();
        return -1L;
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int min = Math.min(i2, this.c.length);
        System.arraycopy(this.c, 0, bArr, i, min);
        byte[] bArr2 = this.c;
        this.c = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i2) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.a.poll(this.b, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i2 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i + min, min2);
            if (min2 < bArr3.length) {
                this.c = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
