package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public final class qtj0 implements khx {
    public static final v9u j = new v9u(50);
    public final g63 b;
    public final khx c;
    public final khx d;
    public final int e;
    public final int f;
    public final Class g;
    public final mg70 h;
    public final nw01 i;

    public qtj0(g63 g63Var, khx khxVar, khx khxVar2, int i, int i2, nw01 nw01Var, Class cls, mg70 mg70Var) {
        this.b = g63Var;
        this.c = khxVar;
        this.d = khxVar2;
        this.e = i;
        this.f = i2;
        this.i = nw01Var;
        this.g = cls;
        this.h = mg70Var;
    }

    @Override // defpackage.khx
    public final void a(MessageDigest messageDigest) {
        Object e;
        izz izzVar = (izz) this.b;
        synchronized (izzVar) {
            hzz hzzVar = izzVar.b;
            c6e0 c6e0Var = (c6e0) ((ArrayDeque) hzzVar.b).poll();
            if (c6e0Var == null) {
                c6e0Var = hzzVar.Ug();
            }
            gzz gzzVar = (gzz) c6e0Var;
            gzzVar.b = 8;
            gzzVar.c = byte[].class;
            e = izzVar.e(gzzVar, byte[].class);
        }
        byte[] bArr = (byte[]) e;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        nw01 nw01Var = this.i;
        if (nw01Var != null) {
            nw01Var.a(messageDigest);
        }
        this.h.a(messageDigest);
        v9u v9uVar = j;
        Class cls = this.g;
        byte[] bArr2 = (byte[]) v9uVar.c(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(khx.a);
            v9uVar.f(cls, bArr2);
        }
        messageDigest.update(bArr2);
        ((izz) this.b).g(bArr);
    }

    @Override // defpackage.khx
    public final boolean equals(Object obj) {
        if (obj instanceof qtj0) {
            qtj0 qtj0Var = (qtj0) obj;
            if (this.f == qtj0Var.f && this.e == qtj0Var.e && pw21.b(this.i, qtj0Var.i) && this.g.equals(qtj0Var.g) && this.c.equals(qtj0Var.c) && this.d.equals(qtj0Var.d) && this.h.equals(qtj0Var.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.khx
    public final int hashCode() {
        int hashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        nw01 nw01Var = this.i;
        if (nw01Var != null) {
            hashCode = (hashCode * 31) + nw01Var.hashCode();
        }
        int hashCode2 = this.g.hashCode();
        return this.h.b.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
