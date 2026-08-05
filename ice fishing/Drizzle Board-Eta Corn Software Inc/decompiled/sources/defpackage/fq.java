package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class fq extends f3 implements ok, zn {
    public final boolean Qr9iLBAD;

    public fq(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.Qr9iLBAD = false;
    }

    @Override // defpackage.f3
    public final wn MdtA4re8() {
        m20.qoPGr6Ce.getClass();
        return this;
    }

    public final wn P7K7Inc8() {
        if (this.Qr9iLBAD) {
            return this;
        }
        wn wnVar = this.NCTxEWno;
        if (wnVar != null) {
            return wnVar;
        }
        MdtA4re8();
        this.NCTxEWno = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fq) {
            fq fqVar = (fq) obj;
            return wxUZMvaN().equals(fqVar.wxUZMvaN()) && this.VgvYg0wo.equals(fqVar.VgvYg0wo) && this.P7K7Inc8.equals(fqVar.P7K7Inc8) && fn.qoPGr6Ce(this.MdtA4re8, fqVar.MdtA4re8);
        }
        if (obj instanceof zn) {
            return obj.equals(P7K7Inc8());
        }
        return false;
    }

    public final int hashCode() {
        return this.P7K7Inc8.hashCode() + q70.MdtA4re8(this.VgvYg0wo, wxUZMvaN().hashCode() * 31, 31);
    }

    @Override // defpackage.ok
    public final Object qoPGr6Ce() {
        return this.MdtA4re8.getClass().getSimpleName();
    }

    public final String toString() {
        wn P7K7Inc8 = P7K7Inc8();
        if (P7K7Inc8 != this) {
            return P7K7Inc8.toString();
        }
        return "property " + this.VgvYg0wo + " (Kotlin reflection is not available)";
    }
}
