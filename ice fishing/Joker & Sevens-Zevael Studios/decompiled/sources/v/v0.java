package v;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v0 extends pc.k implements oc.c {
    public static final v0 A;

    /* renamed from: h, reason: collision with root package name */
    public static final v0 f6982h;

    /* renamed from: i, reason: collision with root package name */
    public static final v0 f6983i;

    /* renamed from: j, reason: collision with root package name */
    public static final v0 f6984j;

    /* renamed from: k, reason: collision with root package name */
    public static final v0 f6985k;

    /* renamed from: l, reason: collision with root package name */
    public static final v0 f6986l;

    /* renamed from: m, reason: collision with root package name */
    public static final v0 f6987m;

    /* renamed from: n, reason: collision with root package name */
    public static final v0 f6988n;

    /* renamed from: o, reason: collision with root package name */
    public static final v0 f6989o;

    /* renamed from: p, reason: collision with root package name */
    public static final v0 f6990p;

    /* renamed from: q, reason: collision with root package name */
    public static final v0 f6991q;

    /* renamed from: r, reason: collision with root package name */
    public static final v0 f6992r;

    /* renamed from: s, reason: collision with root package name */
    public static final v0 f6993s;

    /* renamed from: t, reason: collision with root package name */
    public static final v0 f6994t;

    /* renamed from: u, reason: collision with root package name */
    public static final v0 f6995u;

    /* renamed from: v, reason: collision with root package name */
    public static final v0 f6996v;

    /* renamed from: w, reason: collision with root package name */
    public static final v0 f6997w;

    /* renamed from: x, reason: collision with root package name */
    public static final v0 f6998x;

    /* renamed from: y, reason: collision with root package name */
    public static final v0 f6999y;

    /* renamed from: z, reason: collision with root package name */
    public static final v0 f7000z;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7001g;

    static {
        int i10 = 1;
        f6982h = new v0(i10, 0);
        f6983i = new v0(i10, 1);
        f6984j = new v0(i10, 2);
        f6985k = new v0(i10, 3);
        f6986l = new v0(i10, 4);
        f6987m = new v0(i10, 5);
        f6988n = new v0(i10, 6);
        f6989o = new v0(i10, 7);
        f6990p = new v0(i10, 8);
        f6991q = new v0(i10, 9);
        f6992r = new v0(i10, 10);
        f6993s = new v0(i10, 11);
        f6994t = new v0(i10, 12);
        f6995u = new v0(i10, 13);
        f6996v = new v0(i10, 14);
        f6997w = new v0(i10, 15);
        f6998x = new v0(i10, 16);
        f6999y = new v0(i10, 17);
        f7000z = new v0(i10, 18);
        A = new v0(i10, 19);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i10, int i11) {
        super(i10);
        this.f7001g = i11;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f7001g) {
            case 0:
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((oc.a) obj).invoke();
                return ac.o.f277a;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                long j3 = ((s2.g) obj).f6388a;
                return new k(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
            case 3:
                k kVar = (k) obj;
                return new s2.g((Float.floatToRawIntBits(kVar.f6874a) << 32) | (Float.floatToRawIntBits(kVar.f6875b) & 4294967295L));
            case 4:
                return new j(((s2.f) obj).f6387g);
            case 5:
                return new s2.f(((j) obj).f6872a);
            case 6:
                return new j(((Number) obj).floatValue());
            case 7:
                return Float.valueOf(((j) obj).f6872a);
            case 8:
                long j6 = ((s2.i) obj).f6389a;
                return new k((int) (j6 >> 32), (int) (j6 & 4294967295L));
            case 9:
                k kVar2 = (k) obj;
                return new s2.i(x4.f.j(Math.round(kVar2.f6874a), Math.round(kVar2.f6875b)));
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                long j10 = ((s2.k) obj).f6395a;
                return new k((int) (j10 >> 32), (int) (j10 & 4294967295L));
            case 11:
                k kVar3 = (k) obj;
                int round = Math.round(kVar3.f6874a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(kVar3.f6875b);
                return new s2.k(i7.b.e(round, round2 >= 0 ? round2 : 0));
            case 12:
                return new j(((Number) obj).intValue());
            case 13:
                return Integer.valueOf((int) ((j) obj).f6872a);
            case 14:
                long j11 = ((e1.b) obj).f1929a;
                return new k(e1.b.d(j11), e1.b.e(j11));
            case 15:
                k kVar4 = (k) obj;
                return new e1.b(v6.a.h(kVar4.f6874a, kVar4.f6875b));
            case 16:
                e1.c cVar = (e1.c) obj;
                return new m(cVar.f1931a, cVar.f1932b, cVar.f1933c, cVar.f1934d);
            case 17:
                m mVar = (m) obj;
                return new e1.c(mVar.f6889a, mVar.f6890b, mVar.f6891c, mVar.f6892d);
            case 18:
                long j12 = ((e1.e) obj).f1943a;
                return new k(e1.e.d(j12), e1.e.b(j12));
            default:
                k kVar5 = (k) obj;
                return new e1.e(i7.b.g(kVar5.f6874a, kVar5.f6875b));
        }
    }
}
