package j0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.x2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends pc.k implements oc.a {

    /* renamed from: h, reason: collision with root package name */
    public static final k f3386h;

    /* renamed from: i, reason: collision with root package name */
    public static final k f3387i;

    /* renamed from: j, reason: collision with root package name */
    public static final k f3388j;

    /* renamed from: k, reason: collision with root package name */
    public static final k f3389k;

    /* renamed from: l, reason: collision with root package name */
    public static final k f3390l;

    /* renamed from: m, reason: collision with root package name */
    public static final k f3391m;

    /* renamed from: n, reason: collision with root package name */
    public static final k f3392n;

    /* renamed from: o, reason: collision with root package name */
    public static final k f3393o;

    /* renamed from: p, reason: collision with root package name */
    public static final k f3394p;

    /* renamed from: q, reason: collision with root package name */
    public static final k f3395q;

    /* renamed from: r, reason: collision with root package name */
    public static final k f3396r;

    /* renamed from: s, reason: collision with root package name */
    public static final k f3397s;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3398g;

    static {
        int i10 = 0;
        f3386h = new k(i10, 0);
        f3387i = new k(i10, 1);
        f3388j = new k(i10, 2);
        f3389k = new k(i10, 3);
        f3390l = new k(i10, 4);
        f3391m = new k(i10, 5);
        f3392n = new k(i10, 6);
        f3393o = new k(i10, 7);
        f3394p = new k(i10, 8);
        f3395q = new k(i10, 9);
        f3396r = new k(i10, 10);
        f3397s = new k(i10, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f3398g = i11;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f3398g) {
            case 0:
                x2 x2Var = l.f3404a;
                long j3 = l0.b.f3802t;
                return new j(j3, l0.b.f3792j, l0.b.f3803u, l0.b.f3793k, l0.b.f3787e, l0.b.f3805w, l0.b.f3794l, l0.b.f3806x, l0.b.f3795m, l0.b.H, l0.b.f3798p, l0.b.I, l0.b.f3799q, l0.b.f3783a, l0.b.f3789g, l0.b.f3807y, l0.b.f3796n, l0.b.G, l0.b.f3797o, j3, l0.b.f3788f, l0.b.f3786d, l0.b.f3784b, l0.b.f3790h, l0.b.f3785c, l0.b.f3791i, l0.b.f3800r, l0.b.f3801s, l0.b.f3804v, l0.b.f3808z, l0.b.F, l0.b.A, l0.b.B, l0.b.C, l0.b.D, l0.b.E);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return Boolean.TRUE;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new f1.q(f1.q.f2277b);
            case 3:
                return Boolean.TRUE;
            case 4:
                return new s2.f(48);
            case 5:
                return Boolean.FALSE;
            case 6:
                return new f0();
            case 7:
                return Boolean.FALSE;
            case 8:
                return new k0();
            case 9:
                return new s2.f(0);
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return l0.m.f3923a;
            default:
                return new s0(null, 32767);
        }
    }
}
