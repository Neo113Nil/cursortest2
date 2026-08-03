package d;

import android.os.Build;
import android.view.View;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import s.h0;
import x1.c1;
import x1.g0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class x extends pc.h implements oc.a {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1549o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10, Object obj, Class cls, String str, String str2, int i11, int i12, int i13) {
        super(i10, obj, cls, str, str2, i11, i12);
        this.f1549o = i13;
    }

    @Override // oc.a
    public final Object invoke() {
        c1 c1Var;
        char c3;
        char c7;
        switch (this.f1549o) {
            case 0:
                ((y) this.f5665h).d();
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((y) this.f5665h).d();
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                d1.f fVar = (d1.f) this.f5665h;
                h0 h0Var = fVar.f1572c;
                h0 h0Var2 = fVar.f1573d;
                d1.i iVar = fVar.f1570a;
                d1.r rVar = iVar.f1583h;
                d1.p pVar = d1.p.f1606j;
                if (rVar == null) {
                    Object[] objArr = h0Var2.f6275b;
                    long[] jArr = h0Var2.f6274a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        char c10 = 7;
                        while (true) {
                            long j3 = jArr[i10];
                            if ((((~j3) << c10) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                int i12 = 0;
                                while (i12 < i11) {
                                    if ((j3 & 255) < 128) {
                                        c7 = c10;
                                        ((d1.d) objArr[(i10 << 3) + i12]).n(pVar);
                                    } else {
                                        c7 = c10;
                                    }
                                    j3 >>= 8;
                                    i12++;
                                    c10 = c7;
                                }
                                c3 = c10;
                                if (i11 != 8) {
                                }
                            } else {
                                c3 = c10;
                            }
                            if (i10 != length) {
                                i10++;
                                c10 = c3;
                            }
                        }
                    }
                } else if (rVar.f8456t) {
                    if (h0Var.c(rVar)) {
                        rVar.u0();
                    }
                    d1.p t02 = rVar.t0();
                    if (!rVar.f8443g.f8456t) {
                        u1.a.b("visitAncestors called on an unattached node");
                    }
                    y0.m mVar = rVar.f8443g;
                    g0 v10 = x1.f.v(rVar);
                    int i13 = 0;
                    while (v10 != null) {
                        if ((v10.I.f7991f.f8446j & 5120) != 0) {
                            while (mVar != null) {
                                int i14 = mVar.f8445i;
                                if ((i14 & 5120) != 0) {
                                    if ((i14 & 1024) != 0) {
                                        i13++;
                                    }
                                    if ((mVar instanceof d1.d) && h0Var2.c(mVar)) {
                                        if (i13 <= 1) {
                                            ((d1.d) mVar).n(t02);
                                        } else {
                                            ((d1.d) mVar).n(d1.p.f1604h);
                                        }
                                        h0Var2.k(mVar);
                                    }
                                }
                                mVar = mVar.f8447k;
                            }
                        }
                        v10 = v10.s();
                        mVar = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
                    }
                    Object[] objArr2 = h0Var2.f6275b;
                    long[] jArr2 = h0Var2.f6274a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j6 = jArr2[i15];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j6 & 255) < 128) {
                                        ((d1.d) objArr2[(i15 << 3) + i17]).n(pVar);
                                    }
                                    j6 >>= 8;
                                }
                                if (i16 != 8) {
                                }
                            }
                            if (i15 != length2) {
                                i15++;
                            }
                        }
                    }
                }
                if (iVar.f1583h == null || iVar.f1578c.t0() == pVar) {
                    iVar.c();
                }
                h0Var.b();
                h0Var2.b();
                fVar.f1574e = false;
                break;
            default:
                View view = (View) this.f5665h;
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 30) {
                    a2.c.f(view);
                }
                if (i18 >= 29 && (r2 = a2.b.a(view)) != null) {
                    break;
                }
                break;
        }
        return ac.o.f277a;
    }
}
