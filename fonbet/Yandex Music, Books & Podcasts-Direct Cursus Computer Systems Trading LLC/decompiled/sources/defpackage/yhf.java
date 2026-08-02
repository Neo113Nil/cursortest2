package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class yhf implements un {
    public static final byte[] c = new byte[0];
    public final hbf a;
    public final wn b;

    public yhf(hbf hbfVar, wn wnVar) {
        this.a = hbfVar;
        this.b = wnVar;
    }

    @Override // defpackage.un
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        d8 d8Var;
        hbf hbfVar = this.a;
        Logger logger = msn.a;
        synchronized (msn.class) {
            try {
                j5 j5Var = msn.b(hbfVar.r()).a;
                Class cls = (Class) j5Var.c;
                if (!((Map) j5Var.b).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + j5Var.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) msn.d.get(hbfVar.r())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + hbfVar.r());
                }
                mn3 s = hbfVar.s();
                try {
                    b1 p = j5Var.p();
                    d8 g = p.g(s);
                    p.h(g);
                    d8Var = (d8) p.b(g);
                } catch (aye e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(j5Var.p().b.getName()), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] c2 = d8Var.c();
        byte[] a = this.b.a(c2, c);
        byte[] a2 = ((un) msn.c(this.a.r(), c2)).a(bArr, bArr2);
        return ByteBuffer.allocate(a.length + 4 + a2.length).putInt(a.length).put(a).put(a2).array();
    }

    @Override // defpackage.un
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((un) msn.c(this.a.r(), this.b.b(bArr3, c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
