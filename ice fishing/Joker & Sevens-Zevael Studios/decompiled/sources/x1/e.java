package x1;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends pc.k implements oc.c {

    /* renamed from: h, reason: collision with root package name */
    public static final e f8006h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f8007i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f8008j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f8009k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f8010l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f8011m;

    /* renamed from: n, reason: collision with root package name */
    public static final e f8012n;

    /* renamed from: o, reason: collision with root package name */
    public static final e f8013o;

    /* renamed from: p, reason: collision with root package name */
    public static final e f8014p;

    /* renamed from: q, reason: collision with root package name */
    public static final e f8015q;

    /* renamed from: r, reason: collision with root package name */
    public static final e f8016r;

    /* renamed from: s, reason: collision with root package name */
    public static final e f8017s;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8018g;

    static {
        int i10 = 1;
        f8006h = new e(i10, 0);
        f8007i = new e(i10, 1);
        f8008j = new e(i10, 2);
        f8009k = new e(i10, 3);
        f8010l = new e(i10, 4);
        f8011m = new e(i10, 5);
        f8012n = new e(i10, 6);
        f8013o = new e(i10, 7);
        f8014p = new e(i10, 8);
        f8015q = new e(i10, 9);
        f8016r = new e(i10, 10);
        f8017s = new e(i10, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        super(i10);
        this.f8018g = i11;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f8018g) {
            case 0:
                ((c) obj).t0();
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                q1 q1Var = (q1) obj;
                if (q1Var.y()) {
                    o0 o0Var = q1Var.f8155h;
                    if (!o0Var.f8126q) {
                        oc.c d10 = q1Var.f8154g.d();
                        s.g0 g0Var = o0Var.f8129t;
                        if (d10 != null) {
                            o0Var.X(q1Var, 9223372034707292159L, 0L);
                            o0Var.f8122m = d10;
                        } else if (g0Var != null) {
                            Object[] objArr = g0Var.f6268c;
                            long[] jArr = g0Var.f6266a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j3 = jArr[i10];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((255 & j3) < 128) {
                                                o0Var.o0((s.h0) objArr[(i10 << 3) + i12]);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i11 != 8) {
                                        }
                                    }
                                    if (i10 != length) {
                                        i10++;
                                    }
                                }
                            }
                            g0Var.a();
                        }
                    }
                }
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                l1 l1Var = ((f1) obj).O;
                if (l1Var != null) {
                    l1Var.invalidate();
                }
                break;
            case 3:
                f1 f1Var = (f1) obj;
                if (f1Var.y() && f1Var.X0(true)) {
                    g0 g0Var2 = f1Var.f8033u;
                    k0 k0Var = g0Var2.J;
                    if (k0Var.f8099l > 0) {
                        if (k0Var.f8098k || k0Var.f8097j) {
                            g0Var2.S(false);
                        }
                        k0Var.f8103p.a0();
                    }
                    g0Var2.D();
                    y1.r rVar = (y1.r) j0.a(g0Var2);
                    rVar.getRectManager().e(g0Var2);
                    if (g0Var2.Q > 0) {
                        x4.e eVar = rVar.T.f8193e;
                        eVar.getClass();
                        if (g0Var2.Q > 0) {
                            ((o0.e) eVar.f8294g).b(g0Var2);
                            g0Var2.P = true;
                        }
                        rVar.E(null);
                    }
                }
                break;
            case 4:
                i1 i1Var = (i1) obj;
                if (i1Var.y()) {
                    i1Var.f8083g.C();
                }
                break;
            case 5:
                g0 g0Var3 = (g0) obj;
                if (g0Var3.G()) {
                    g0Var3.S(false);
                }
                break;
            case 6:
                g0 g0Var4 = (g0) obj;
                if (g0Var4.G()) {
                    g0Var4.S(false);
                }
                break;
            case 7:
                g0 g0Var5 = (g0) obj;
                if (g0Var5.G()) {
                    g0Var5.Q(false);
                }
                break;
            case 8:
                g0 g0Var6 = (g0) obj;
                if (g0Var6.G()) {
                    g0Var6.Q(false);
                }
                break;
            case 9:
                g0 g0Var7 = (g0) obj;
                if (g0Var7.G()) {
                    g0.R(g0Var7, false, 7);
                }
                break;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                g0 g0Var8 = (g0) obj;
                if (g0Var8.G()) {
                    g0.T(g0Var8, false, 7);
                }
                break;
            default:
                g0 g0Var9 = (g0) obj;
                if (g0Var9.G()) {
                    g0Var9.E();
                }
                break;
        }
        return ac.o.f277a;
    }
}
