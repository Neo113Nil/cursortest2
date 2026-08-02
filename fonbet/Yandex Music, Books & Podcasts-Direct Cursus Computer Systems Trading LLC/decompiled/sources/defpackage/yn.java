package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class yn implements db7 {
    public final db7 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public yn(db7 db7Var, byte[] bArr, byte[] bArr2) {
        this.a = db7Var;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                kb7 kb7Var = new kb7(this.a, nb7Var);
                this.d = new CipherInputStream(kb7Var, cipher);
                kb7Var.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                b6e.q(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            b6e.q(e2);
            return 0L;
        }
    }

    @Override // defpackage.db7
    public final Map b() {
        return this.a.b();
    }

    @Override // defpackage.db7
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
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
        this.d.getClass();
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
