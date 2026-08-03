package x1;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.x2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends pc.k implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public static final h f8062h;

    /* renamed from: i, reason: collision with root package name */
    public static final h f8063i;

    /* renamed from: j, reason: collision with root package name */
    public static final h f8064j;

    /* renamed from: k, reason: collision with root package name */
    public static final h f8065k;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8066g;

    static {
        int i10 = 2;
        f8062h = new h(i10, 0);
        f8063i = new h(i10, 1);
        f8064j = new h(i10, 2);
        f8065k = new h(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11) {
        super(i10);
        this.f8066g = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8066g) {
            case 0:
                ((Number) obj2).intValue();
                ((j) obj).getClass();
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                v1.e0 e0Var = (v1.e0) obj2;
                g0 g0Var = (g0) ((j) obj);
                if (!pc.j.a(g0Var.A, e0Var)) {
                    g0Var.A = e0Var;
                    g0Var.C();
                }
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((g0) ((j) obj)).a0((y0.n) obj2);
                break;
            default:
                m0.c0 c0Var = (m0.c0) obj2;
                g0 g0Var2 = (g0) ((j) obj);
                g0Var2.E = c0Var;
                c1 c1Var = g0Var2.I;
                x2 x2Var = y1.y0.f8709h;
                u0.i iVar = (u0.i) c0Var;
                iVar.getClass();
                g0Var2.X((s2.c) m0.z.t(iVar, x2Var));
                s2.l lVar = (s2.l) m0.z.t(iVar, y1.y0.f8715n);
                if (g0Var2.C != lVar) {
                    g0Var2.C = lVar;
                    g0Var2.C();
                    g0 s10 = g0Var2.s();
                    if (s10 != null) {
                        s10.A();
                    }
                    g0Var2.B();
                    for (y0.m mVar = c1Var.f7991f; mVar != null; mVar = mVar.f8448l) {
                        mVar.b0();
                    }
                }
                g0Var2.b0((y1.o1) m0.z.t(iVar, y1.y0.f8720s));
                y0.m mVar2 = c1Var.f7991f;
                if ((mVar2.f8446j & 32768) != 0) {
                    while (mVar2 != null) {
                        if ((mVar2.f8445i & 32768) != 0) {
                            m mVar3 = mVar2;
                            ?? r22 = 0;
                            while (mVar3 != 0) {
                                if (mVar3 instanceof k) {
                                    y0.m mVar4 = ((y0.m) ((k) mVar3)).f8443g;
                                    if (mVar4.f8456t) {
                                        g1.c(mVar4);
                                    } else {
                                        mVar4.f8452p = true;
                                    }
                                } else if ((mVar3.f8445i & 32768) != 0 && (mVar3 instanceof m)) {
                                    y0.m mVar5 = mVar3.f8110v;
                                    int i10 = 0;
                                    mVar3 = mVar3;
                                    r22 = r22;
                                    while (mVar5 != null) {
                                        if ((mVar5.f8445i & 32768) != 0) {
                                            i10++;
                                            r22 = r22;
                                            if (i10 == 1) {
                                                mVar3 = mVar5;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar3 != 0) {
                                                    r22.b(mVar3);
                                                    mVar3 = 0;
                                                }
                                                r22.b(mVar5);
                                            }
                                        }
                                        mVar5 = mVar5.f8448l;
                                        mVar3 = mVar3;
                                        r22 = r22;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                mVar3 = f.f(r22);
                            }
                        }
                        if ((mVar2.f8446j & 32768) != 0) {
                            mVar2 = mVar2.f8448l;
                        }
                    }
                }
                break;
        }
        return ac.o.f277a;
    }
}
