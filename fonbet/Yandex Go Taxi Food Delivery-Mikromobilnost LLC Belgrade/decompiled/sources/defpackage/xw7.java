package defpackage;

/* loaded from: classes14.dex */
public final class xw7 extends yw7 {
    public final String a;
    public final String b;

    public xw7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.yw7
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw7)) {
            return false;
        }
        xw7 xw7Var = (xw7) obj;
        return this.a.equals(xw7Var.a) && jl40.l(this.b, xw7Var.b);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return "more";
    }

    @Override // defpackage.yw7
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return unr0.b(unr0.b(104083275, 31, this.a), 31, this.b);
    }

    @Override // defpackage.yw7
    public final String m() {
        return "";
    }

    public final String toString() {
        return unr0.p("TextItem(id=more, iconUrl=", this.a, ", title=", this.b, ", subtitle=)");
    }
}
