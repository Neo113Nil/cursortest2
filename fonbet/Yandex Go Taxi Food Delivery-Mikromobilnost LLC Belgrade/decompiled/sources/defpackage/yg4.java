package defpackage;

import defpackage.owx;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes10.dex */
public final class yg4 {
    public static final /* synthetic */ kgx[] c = {new MutablePropertyReference1Impl("isBackgroundDataSyncDisabled", 0, "isBackgroundDataSyncDisabled()Z", yg4.class)};
    public final cne0 a;
    public final qme0 b;

    public yg4(dne0 dne0Var, fwx fwxVar) {
        this.a = dne0Var.b();
        if (qyy0.a()) {
            jst.e.s(new IllegalStateException("Illegal thread invocation"));
        }
        String applicationId = fwxVar.b.getApplicationId();
        cne0 a = fwxVar.a.a(applicationId + ".startup.launch.LAUNCH_PREFERENCES");
        String j = b64.j(applicationId, ".startup.launch.LAUNCH_PARAMETERS");
        if (a.c(j)) {
            String l = a.l(j, null);
            a.a();
            if (l != null && !evu0.J(l)) {
                try {
                    this.b.setValue(this, c[0], Boolean.valueOf(((owx.f) ((xnt) fwxVar.c).c(l, owx.f.Companion.serializer())).a));
                } catch (Exception e) {
                    jst.e.k(e, "Failed to parse launch parameters during migration");
                }
            }
        }
        cne0 cne0Var = this.a;
        this.b = new qme0(0, cne0Var, cne0Var, "startup.launch.BACKGROUND_DATA_SYNC_DISABLED");
    }
}
