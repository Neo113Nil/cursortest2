package defpackage;

/* loaded from: classes9.dex */
public final class qsu {
    public final String a() {
        String str = d6z.d;
        if (str == null || evu0.J(str)) {
            jst.e.w(new IllegalStateException("no taxiHost defined"));
            str = "tc.mobile.yandex.net";
        }
        return oyr.p("https://", str, "/3.0/");
    }

    public final String b() {
        String str = d6z.d;
        if (str == null || evu0.J(str)) {
            jst.e.w(new IllegalStateException("no taxiHost defined"));
            str = "tc.mobile.yandex.net";
        }
        return oyr.p("https://", str, "/4.0/");
    }
}
