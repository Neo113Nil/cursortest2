package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class m2o implements daf {
    public static final ck7 j = new ck7(50);
    public final z98 b;
    public final daf c;
    public final daf d;
    public final int e;
    public final int f;
    public final Class g;
    public final pwj h;
    public final d7t i;

    public m2o(z98 z98Var, daf dafVar, daf dafVar2, int i, int i2, d7t d7tVar, Class cls, pwj pwjVar) {
        this.b = z98Var;
        this.c = dafVar;
        this.d = dafVar2;
        this.e = i;
        this.f = i2;
        this.i = d7tVar;
        this.g = cls;
        this.h = pwjVar;
    }

    @Override // defpackage.daf
    public final void b(MessageDigest messageDigest) {
        Object i;
        z98 z98Var = this.b;
        synchronized (z98Var) {
            b0h b0hVar = (b0h) z98Var.d;
            sgm sgmVar = (sgm) ((ArrayDeque) b0hVar.a).poll();
            if (sgmVar == null) {
                sgmVar = b0hVar.G();
            }
            a0h a0hVar = (a0h) sgmVar;
            a0hVar.b = 8;
            a0hVar.c = byte[].class;
            i = z98Var.i(a0hVar, byte[].class);
        }
        byte[] bArr = (byte[]) i;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        d7t d7tVar = this.i;
        if (d7tVar != null) {
            d7tVar.b(messageDigest);
        }
        this.h.b(messageDigest);
        ck7 ck7Var = j;
        Class cls = this.g;
        byte[] bArr2 = (byte[]) ck7Var.a(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(daf.a);
            ck7Var.d(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.b.l(bArr);
    }

    @Override // defpackage.daf
    public final boolean equals(Object obj) {
        if (obj instanceof m2o) {
            m2o m2oVar = (m2o) obj;
            if (this.f == m2oVar.f && this.e == m2oVar.e && xut.b(this.i, m2oVar.i) && this.g.equals(m2oVar.g) && this.c.equals(m2oVar.c) && this.d.equals(m2oVar.d) && this.h.equals(m2oVar.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.daf
    public final int hashCode() {
        int hashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        d7t d7tVar = this.i;
        if (d7tVar != null) {
            hashCode = (hashCode * 31) + d7tVar.hashCode();
        }
        return this.h.b.hashCode() + ((this.g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
