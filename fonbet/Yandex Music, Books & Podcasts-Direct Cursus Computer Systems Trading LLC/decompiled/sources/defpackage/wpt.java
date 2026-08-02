package defpackage;

import kotlin.text.c;

/* loaded from: classes6.dex */
public final class wpt {
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ wpt(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public u7e a() {
        s7e s7eVar = new s7e();
        s7eVar.n(this.a);
        s7eVar.g(this.b);
        String str = this.c;
        if (c.v(str, "/", false)) {
            s7eVar.m(0, str.length(), str);
            return s7eVar.e();
        }
        xq0.o("unexpected encodedPath: ".concat(str));
        return null;
    }
}
