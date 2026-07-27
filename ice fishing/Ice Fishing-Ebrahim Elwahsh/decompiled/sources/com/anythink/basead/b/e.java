package com.anythink.basead.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bi;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public final class e {
    public static int a(Context context, w wVar) {
        int K8 = wVar.K();
        return (K8 == 1 || K8 == 4) ? q.a(context, "myoffer_cta_install_now", com.anythink.expressad.foundation.h.k.f19794g) : q.a(context, "myoffer_cta_learn_more", com.anythink.expressad.foundation.h.k.f19794g);
    }

    public static boolean b(w wVar) {
        return wVar != null && wVar.n();
    }

    public static boolean c(w wVar, x xVar) {
        y yVar;
        if (xVar != null && (yVar = xVar.f14325o) != null) {
            String valueOf = String.valueOf(yVar.F());
            valueOf.getClass();
            switch (valueOf) {
                case "0":
                case "2":
                case "4":
                    if (wVar != null && wVar.L()) {
                        return true;
                    }
                    break;
                default:
                    return false;
            }
        }
        return false;
    }

    public static int d(w wVar, x xVar) {
        if ((!(wVar instanceof r) || TextUtils.isEmpty(((r) wVar).d())) && wVar != null && xVar != null) {
            boolean L8 = wVar.L();
            boolean z8 = (TextUtils.isEmpty(wVar.B()) && TextUtils.isEmpty(wVar.d((w) wVar.r()))) ? false : true;
            int ao = wVar.ao();
            if (ao == 3) {
                return L8 ? 7 : 8;
            }
            if (ao == 2) {
                return L8 ? 6 : 5;
            }
            if (L8 && z8) {
                return 3;
            }
            if (L8) {
                return 2;
            }
            if (z8) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean e(w wVar, x xVar) {
        if (wVar != null && xVar != null) {
            String valueOf = String.valueOf(xVar.f14320j);
            valueOf.getClass();
            if (valueOf.equals("3") && !a(wVar, xVar)) {
                return true;
            }
        }
        return false;
    }

    public static int f(w wVar, x xVar) {
        y yVar;
        boolean z8 = false;
        if (xVar == null || (yVar = xVar.f14325o) == null || wVar == null) {
            return 0;
        }
        int i = xVar.f14320j;
        int i4 = 4;
        if ((i == 3 || i == 4) && yVar.aG()) {
            return 0;
        }
        String H6 = wVar.H();
        if (xVar.f14325o.bC() == 1) {
            boolean isEmpty = TextUtils.isEmpty(H6);
            int i9 = isEmpty ? 2 : 1;
            boolean z9 = !isEmpty;
            if (!isEmpty && !H6.startsWith("http")) {
                z9 = false;
                i9 = 3;
            }
            if (!z9 || wVar.K() == 2 || wVar.K() == 3) {
                i4 = i9;
                z8 = z9;
            }
            if (z8 && TextUtils.isEmpty(wVar.G())) {
                return 5;
            }
            return i4;
        }
        return 0;
    }

    private static boolean g(w wVar, x xVar) {
        if (xVar != null && wVar != null) {
            String valueOf = String.valueOf(xVar.f14320j);
            valueOf.getClass();
            if (!valueOf.equals("1")) {
                if (valueOf.equals("3")) {
                    return a(wVar, xVar);
                }
                return false;
            }
            if (!TextUtils.isEmpty(wVar.E())) {
                return true;
            }
        }
        return false;
    }

    private static boolean h(w wVar, x xVar) {
        if (wVar != null && xVar != null) {
            String valueOf = String.valueOf(xVar.f14320j);
            valueOf.getClass();
            if (valueOf.equals("4") && (wVar instanceof bj)) {
                boolean z8 = 1 == ((bj) wVar).aJ();
                if (xVar.f14325o.C() == 1 && ((!z8 && xVar.f14325o.bw() == 2) || (z8 && xVar.f14325o.bx() == 2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(w wVar, x xVar) {
        if (wVar != null && xVar != null) {
            String valueOf = String.valueOf(xVar.f14320j);
            valueOf.getClass();
            if (valueOf.equals("4") && xVar.f14325o.aD() > 0 && (!TextUtils.isEmpty(wVar.B()) || !TextUtils.isEmpty(wVar.z()))) {
                return true;
            }
        }
        return false;
    }

    public static int a(Context context, int i) {
        return (i == 1 || i == 4) ? q.a(context, "myoffer_shake_full_title_download_type", com.anythink.expressad.foundation.h.k.f19794g) : q.a(context, "myoffer_shake_full_title", com.anythink.expressad.foundation.h.k.f19794g);
    }

    public static boolean c(w wVar) {
        if (wVar == null) {
            return false;
        }
        if (wVar.t() != 42) {
            return (wVar instanceof bi) && ((bi) wVar).d() == 42;
        }
        return true;
    }

    public static boolean a(w wVar) {
        return (TextUtils.isEmpty(wVar.z()) && TextUtils.isEmpty(wVar.x()) && TextUtils.isEmpty(wVar.y())) ? false : true;
    }

    public static boolean a(w wVar, x xVar) {
        if (wVar != null && xVar != null) {
            String valueOf = String.valueOf(xVar.f14320j);
            valueOf.getClass();
            switch (valueOf) {
                case "0":
                case "2":
                case "4":
                    if (!wVar.n() && wVar.L() && com.anythink.basead.b.c.d.a(wVar, xVar.f14325o)) {
                        return true;
                    }
                    break;
                case "1":
                    return true;
                case "3":
                    return wVar.J() == 1 && wVar.L();
                default:
                    return false;
            }
        }
        return false;
    }

    public static boolean a(x xVar) {
        return (xVar == null || xVar.f14325o == null || t.b().c("sensor_deny") || !com.anythink.core.express.c.a.a().b() || xVar.f14325o.W() != 1) ? false : true;
    }

    public static int a(x xVar, Context context) {
        if (xVar == null) {
            return 1;
        }
        y yVar = xVar.f14325o;
        if (yVar != null && xVar.f14320j == 4) {
            return yVar.C();
        }
        return m.f(context);
    }

    public static boolean a(w wVar, y yVar, com.anythink.basead.d.j jVar, int i) {
        int i4;
        if (wVar == null || yVar == null || jVar == null || jVar.i == null) {
            return false;
        }
        int K8 = wVar.K();
        if (yVar.y() != 1 || i != K8) {
            return false;
        }
        com.anythink.basead.d.a aVar = jVar.i;
        int z8 = i == 4 ? yVar.z() : 0;
        if (i == 1) {
            z8 = yVar.A();
        }
        if (z8 != 1) {
            if (z8 != 2) {
                if (z8 != 3) {
                    return false;
                }
                if (aVar.f6277n == 0 && ((i4 = aVar.f6278o) == 1 || i4 == 5 || i4 == 6 || i4 == 24 || i4 == 25 || i4 == 40 || i4 == 41)) {
                    return false;
                }
            }
        } else if (aVar.f6277n != 2) {
            return false;
        }
        return true;
    }
}
