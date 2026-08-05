package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class nl extends f3 implements ml, wn, ll {
    public final int Qr9iLBAD;

    public nl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.Qr9iLBAD = i;
    }

    @Override // defpackage.f3
    public final wn MdtA4re8() {
        m20.qoPGr6Ce.getClass();
        return this;
    }

    @Override // defpackage.ml
    public final int NCTxEWno() {
        return this.Qr9iLBAD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [wn] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nl) {
            nl nlVar = (nl) obj;
            return this.VgvYg0wo.equals(nlVar.VgvYg0wo) && this.P7K7Inc8.equals(nlVar.P7K7Inc8) && fn.qoPGr6Ce(this.MdtA4re8, nlVar.MdtA4re8) && wxUZMvaN().equals(nlVar.wxUZMvaN());
        }
        if (!(obj instanceof nl)) {
            return false;
        }
        ?? r0 = this.NCTxEWno;
        if (r0 == 0) {
            MdtA4re8();
            this.NCTxEWno = this;
        } else {
            this = r0;
        }
        return obj.equals(this);
    }

    public final int hashCode() {
        wxUZMvaN();
        return this.P7K7Inc8.hashCode() + q70.MdtA4re8(this.VgvYg0wo, wxUZMvaN().hashCode() * 31, 31);
    }

    public final String toString() {
        wn wnVar = this.NCTxEWno;
        if (wnVar == null) {
            MdtA4re8();
            this.NCTxEWno = this;
            wnVar = this;
        }
        if (wnVar != this) {
            return wnVar.toString();
        }
        String str = this.VgvYg0wo;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : q70.P7K7Inc8("function ", str, " (Kotlin reflection is not available)");
    }

    public nl(int i, Class cls, String str, String str2, int i2) {
        this(i, e3.NCTxEWno, cls, str, str2, i2);
    }
}
