package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zn implements db7 {
    public final db7 a;
    public final byte[] b;
    public ma c;

    public zn(byte[] bArr, db7 db7Var) {
        this.a = db7Var;
        this.b = bArr;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        long a = this.a.a(nb7Var);
        byte[] bArr = this.b;
        String str = nb7Var.h;
        long j = nb7Var.b + nb7Var.f;
        long j2 = 0;
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                long charAt = j2 ^ str.charAt(i);
                j2 = charAt + (charAt << 1) + (charAt << 4) + (charAt << 5) + (charAt << 7) + (charAt << 8) + (charAt << 40);
            }
        }
        ma maVar = new ma();
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            maVar.c = cipher;
            int blockSize = cipher.getBlockSize();
            maVar.a = blockSize;
            maVar.d = new byte[blockSize];
            maVar.e = new byte[blockSize];
            long j3 = blockSize;
            long j4 = j / j3;
            int i2 = (int) (j % j3);
            String algorithm = cipher.getAlgorithm();
            int i3 = dvt.a;
            cipher.init(2, new SecretKeySpec(bArr, algorithm.split("/", 2)[0]), new IvParameterSpec(ma.e(j2, j4)));
            if (i2 != 0) {
                maVar.k(new byte[i2], 0, i2);
            }
            this.c = maVar;
            return a;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            b6e.q(e);
            throw null;
        }
    }

    @Override // defpackage.db7
    public final Map b() {
        return this.a.b();
    }

    @Override // defpackage.db7
    public final void close() {
        this.c = null;
        this.a.close();
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        this.a.q(t6tVar);
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int read = this.a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        ma maVar = this.c;
        int i3 = dvt.a;
        maVar.k(bArr, i, read);
        return read;
    }
}
