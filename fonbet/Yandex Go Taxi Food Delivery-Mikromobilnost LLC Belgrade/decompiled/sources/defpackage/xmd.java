package defpackage;

/* loaded from: classes2.dex */
public final class xmd {
    public final String a;
    public final String b;
    public final wmd c;

    public xmd(String str, String str2, wmd wmdVar) {
        this.a = str;
        this.b = str2;
        this.c = wmdVar;
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
        if (!(obj instanceof xmd)) {
            return false;
        }
        xmd xmdVar = (xmd) obj;
        return this.a.equals(xmdVar.a) && this.b.equals(xmdVar.b) && jl40.l(this.c, xmdVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        wmd wmdVar = this.c;
        return b + (wmdVar == null ? 0 : wmdVar.hashCode());
    }

    public final String toString() {
        return "WidgetUrls(lightTheme=" + this.a + ", darkTheme=" + this.b + ", widgetPollingParameters=" + this.c + ')';
    }
}
