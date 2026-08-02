package defpackage;

/* loaded from: classes6.dex */
public final class lvn extends hjq {
    public static final lvn b = new lvn(1);

    public final void g(String str, long j, String str2, String str3) {
        y60 e = e();
        z70 z70Var = new z70();
        z70Var.a("remote", "type");
        if (str == null) {
            str = "";
        }
        z70Var.a(str, "link1");
        z70Var.a(Long.valueOf(j), "timestamp");
        if (str2 == null) {
            str2 = "";
        }
        z70Var.a(str2, "pushTitle");
        z70Var.a(1, str3);
        tlm.o(e, "Push_Notification", z70Var.b());
    }
}
