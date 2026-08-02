package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class wnd {
    public static final vnd Companion = new vnd();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ wnd(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, und.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnd)) {
            return false;
        }
        wnd wndVar = (wnd) obj;
        return jl40.l(this.a, wndVar.a) && jl40.l(this.b, wndVar.b) && jl40.l(this.c, wndVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Asset(buttonText=");
        sb.append(this.a);
        sb.append(", buttonTextWithDetails=");
        sb.append(this.b);
        sb.append(", subscriptionName=");
        return b64.p(sb, this.c, ')');
    }
}
