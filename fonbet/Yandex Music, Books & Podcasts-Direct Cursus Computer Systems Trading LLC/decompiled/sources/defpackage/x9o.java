package defpackage;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class x9o implements rmh {
    public final rmh a;

    public x9o(rmh rmhVar) {
        this.a = rmhVar;
    }

    @Override // defpackage.rmh
    public final byte[] a(l6e l6eVar, String str, byte[] bArr, UUID uuid) {
        l6eVar.getClass();
        bArr.getClass();
        uuid.getClass();
        return d(0, new w9o(this, l6eVar, str, bArr, uuid, 0));
    }

    @Override // defpackage.rmh
    public final void b(String str) {
        str.getClass();
        this.a.b(str);
    }

    @Override // defpackage.rmh
    public final byte[] c(l6e l6eVar, String str, byte[] bArr, UUID uuid) {
        l6eVar.getClass();
        bArr.getClass();
        uuid.getClass();
        return d(0, new w9o(this, l6eVar, str, bArr, uuid, 1));
    }

    public final byte[] d(int i, Function0 function0) {
        long j;
        long j2;
        try {
            return (byte[]) function0.invoke();
        } catch (PlaybackException.DrmThrowable.ErrorDrmProxyConnection e) {
            if (e.getResponseCode() != 429 || i >= 3) {
                throw e;
            }
            int i2 = i + 1;
            phn.a.getClass();
            int e2 = phn.b.e(-500, 500);
            if (i2 == 1) {
                j = 1000;
            } else if (i2 == 2) {
                j = 3000;
            } else {
                if (i2 != 3) {
                    j2 = 0;
                    Thread.sleep(j2);
                    return d(i2, function0);
                }
                j = 7000;
            }
            j2 = j + e2;
            Thread.sleep(j2);
            return d(i2, function0);
        }
    }
}
