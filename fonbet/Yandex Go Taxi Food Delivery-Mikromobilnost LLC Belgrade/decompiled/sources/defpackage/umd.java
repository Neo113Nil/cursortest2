package defpackage;

/* loaded from: classes2.dex */
public final class umd {
    public final String a;
    public final String b;
    public final vmd c;

    public umd(String str, String str2, vmd vmdVar) {
        this.a = str;
        this.b = str2;
        this.c = vmdVar;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umd)) {
            return false;
        }
        umd umdVar = (umd) obj;
        return this.a.equals(umdVar.a) && this.b.equals(umdVar.b) && jl40.l(this.c, umdVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        vmd vmdVar = this.c;
        return b + (vmdVar == null ? 0 : vmdVar.hashCode());
    }

    public final String toString() {
        return "WidgetOpenCardUrls(lightTheme=" + this.a + ", darkTheme=" + this.b + ", widgetPollingParameters=" + this.c + ')';
    }
}
