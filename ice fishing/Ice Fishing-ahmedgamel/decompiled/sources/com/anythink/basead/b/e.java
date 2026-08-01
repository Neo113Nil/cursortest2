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
        int K7 = wVar.K();
        return (K7 == 1 || K7 == 4) ? q.a(context, "myoffer_cta_install_now", com.anythink.expressad.foundation.h.k.f19636g) : q.a(context, "myoffer_cta_learn_more", com.anythink.expressad.foundation.h.k.f19636g);
    }

    public static boolean b(w wVar) {
        return wVar != null && wVar.n();
    }

    public static boolean c(w wVar, x xVar) {
        y yVar;
        if (xVar != null && (yVar = xVar.f14168o) != null) {
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
            boolean L6 = wVar.L();
            boolean z3 = (TextUtils.isEmpty(wVar.B()) && TextUtils.isEmpty(wVar.d((w) wVar.r()))) ? false : true;
            int ao = wVar.ao();
            if (ao == 3) {
                return L6 ? 7 : 8;
            }
            if (ao == 2) {
                return L6 ? 6 : 5;
            }
            if (L6 && z3) {
                return 3;
            }
            if (L6) {
                return 2;
            }
            if (z3) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean e(w wVar, x xVar) {
        if (wVar != null && xVar != null) {
            String valueOf = String.valueOf(xVar.f14163j);
            valueOf.getClass();
            if (valueOf.equals("3") && !a(wVar, xVar)) {
                return true;
            }
        }
        return false;
    }

    public static int f(w wVar, x xVar) {
        y yVar;
        boolean z3 = false;
        if (xVar == null || (yVar = xVar.f14168o) == null || wVar == null) {
            return 0;
        }
        int i = xVar.f14163j;
        int i6 = 4;
        if ((i == 3 || i == 4) && yVar.aG()) {
            return 0;
        }
        String H8 = wVar.H();
        if (xVar.f14168o.bC() == 1) {
            boolean isEmpty = TextUtils.isEmpty(H8);
            int i9 = isEmpty ? 2 : 1;
            boolean z6 = !isEmpty;
            if (!isEmpty && !H8.startsWith("http")) {
                z6 = false;
                i9 = 3;
            }
            if (!z6 || wVar.K() == 2 || wVar.K() == 3) {
                i6 = i9;
                z3 = z6;
            }
            if (z3 && TextUtils.isEmpty(wVar.G())) {
                return 5;
            }
            return i6;
        }
        return 0;
    }

    private static boolean g(w wVar, x xVar) {
        if (xVar != null && wVar != null) {
            String valueOf = String.valueOf(xVar.f14163j);
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
            String valueOf = String.valueOf(xVar.f14163j);
            valueOf.getClass();
            if (valueOf.equals("4") && (wVar instanceof bj)) {
                boolean z3 = 1 == ((bj) wVar).aJ();
                if (xVar.f14168o.C() == 1 && ((!z3 && xVar.f14168o.bw() == 2) || (z3 && xVar.f14168o.bx() == 2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(w wVar, x xVar) {
        if (wVar != null && xVar != null) {
            String valueOf = String.valueOf(xVar.f14163j);
            valueOf.getClass();
            if (valueOf.equals("4") && xVar.f14168o.aD() > 0 && (!TextUtils.isEmpty(wVar.B()) || !TextUtils.isEmpty(wVar.z()))) {
                return true;
            }
        }
        return false;
    }

    public static int a(Context context, int i) {
        return (i == 1 || i == 4) ? q.a(context, "myoffer_shake_full_title_download_type", com.anythink.expressad.foundation.h.k.f19636g) : q.a(context, "myoffer_shake_full_title", com.anythink.expressad.foundation.h.k.f19636g);
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
            String valueOf = String.valueOf(xVar.f14163j);
            valueOf.getClass();
            switch (valueOf) {
                case "0":
                case "2":
                case "4":
                    if (!wVar.n() && wVar.L() && com.anythink.basead.b.c.d.a(wVar, xVar.f14168o)) {
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
        return (xVar == null || xVar.f14168o == null || t.b().c("sensor_deny") || !com.anythink.core.express.c.a.a().b() || xVar.f14168o.W() != 1) ? false : true;
    }

    public static int a(x xVar, Context context) {
        if (xVar == null) {
            return 1;
        }
        y yVar = xVar.f14168o;
        if (yVar != null && xVar.f14163j == 4) {
            return yVar.C();
        }
        return m.f(context);
    }

    public static boolean a(w wVar, y yVar, com.anythink.basead.d.j jVar, int i) {
        int i6;
        if (wVar == null || yVar == null || jVar == null || jVar.i == null) {
            return false;
        }
        int K7 = wVar.K();
        if (yVar.y() != 1 || i != K7) {
            return false;
        }
        com.anythink.basead.d.a aVar = jVar.i;
        int z3 = i == 4 ? yVar.z() : 0;
        if (i == 1) {
            z3 = yVar.A();
        }
        if (z3 != 1) {
            if (z3 != 2) {
                if (z3 != 3) {
                    return false;
                }
                if (aVar.f6120n == 0 && ((i6 = aVar.f6121o) == 1 || i6 == 5 || i6 == 6 || i6 == 24 || i6 == 25 || i6 == 40 || i6 == 41)) {
                    return false;
                }
            }
        } else if (aVar.f6120n != 2) {
            return false;
        }
        return true;
    }
}
