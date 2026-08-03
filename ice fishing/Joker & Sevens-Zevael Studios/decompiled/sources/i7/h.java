package i7;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d8.t;
import java.util.concurrent.Executor;
import l7.r;
import pc.j;
import yc.u0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements l7.e {

    /* renamed from: h, reason: collision with root package name */
    public static final h f3240h = new h(0);

    /* renamed from: i, reason: collision with root package name */
    public static final h f3241i = new h(1);

    /* renamed from: j, reason: collision with root package name */
    public static final h f3242j = new h(2);

    /* renamed from: k, reason: collision with root package name */
    public static final h f3243k = new h(3);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3244g;

    public /* synthetic */ h(int i10) {
        this.f3244g = i10;
    }

    @Override // l7.e
    public final Object e(t tVar) {
        switch (this.f3244g) {
            case 0:
                Object b2 = tVar.b(new r(k7.a.class, Executor.class));
                j.d(b2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new u0((Executor) b2);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Object b10 = tVar.b(new r(k7.c.class, Executor.class));
                j.d(b10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new u0((Executor) b10);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                Object b11 = tVar.b(new r(k7.b.class, Executor.class));
                j.d(b11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new u0((Executor) b11);
            default:
                Object b12 = tVar.b(new r(k7.d.class, Executor.class));
                j.d(b12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new u0((Executor) b12);
        }
    }
}
