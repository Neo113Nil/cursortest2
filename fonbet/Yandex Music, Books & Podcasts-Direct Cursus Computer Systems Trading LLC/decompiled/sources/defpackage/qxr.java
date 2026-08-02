package defpackage;

/* loaded from: classes5.dex */
public abstract class qxr {
    public static final jyr a;
    public static final jyr b;
    public static final jyr c;

    static {
        bdt I = hag.I(frt.class);
        l18 l18Var = l18.b;
        a = l18Var.b(I, true);
        b = l18Var.b(hag.I(z66.class), true);
        c = l18Var.b(hag.I(u2f.class), true);
    }

    public static void a() {
        jyr jyrVar = a;
        if (!v3g.E((frt) jyrVar.getValue()).a.d) {
            ssg.a(3, "SyncServiceController", "skip sync, not authorized", null);
            pxr.a();
        } else if (!v3g.E((frt) jyrVar.getValue()).d) {
            ssg.a(3, "SyncServiceController", "skip sync, service not available", null);
            pxr.a();
        } else if (((z66) b.getValue()).g()) {
            ssg.a(3, "SyncServiceController", "startSync()", null);
            ((u2f) c.getValue()).a(ksw.l, true);
        } else {
            ssg.a(3, "SyncServiceController", "skip sync, no network", null);
            pxr.a();
        }
    }
}
