package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class v6t extends lq2 implements bio {
    public final LinkedBlockingQueue e;
    public final long f;
    public byte[] g;
    public int h;

    public v6t() {
        super(true);
        this.f = 8000L;
        this.e = new LinkedBlockingQueue();
        this.g = new byte[0];
        this.h = -1;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        this.h = nb7Var.a.getPort();
        return -1L;
    }

    @Override // defpackage.bio
    public final String e() {
        vq1.A(this.h != -1);
        int i = this.h;
        int i2 = this.h + 1;
        int i3 = dvt.a;
        Locale locale = Locale.US;
        return f1d.e(i, i2, "RTP/AVP/TCP;unicast;interleaved=", "-");
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return null;
    }

    @Override // defpackage.bio
    public final int h() {
        return this.h;
    }

    @Override // defpackage.bio
    public final boolean r() {
        return false;
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int min = Math.min(i2, this.g.length);
        System.arraycopy(this.g, 0, bArr, i, min);
        byte[] bArr2 = this.g;
        this.g = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i2) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.e.poll(this.f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i2 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i + min, min2);
            if (min2 < bArr3.length) {
                this.g = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // defpackage.db7
    public final void close() {
    }

    @Override // defpackage.bio
    public final v6t t() {
        return this;
    }
}
