package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vnb implements xnb {
    public final q6o a;
    public final nib b;
    public final zkb c;

    public vnb(q6o q6oVar, nib nibVar, zkb zkbVar) {
        this.a = q6oVar;
        this.b = nibVar;
        this.c = zkbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnb)) {
            return false;
        }
        vnb vnbVar = (vnb) obj;
        return this.a.equals(vnbVar.a) && this.b.equals(vnbVar.b) && this.c.equals(vnbVar.c);
    }

    @Override // defpackage.xnb
    public final blb getNavigation() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Error(state=" + this.a + ", backAction=" + this.b + ", navigation=" + this.c + Extension.C_BRAKE;
    }
}
