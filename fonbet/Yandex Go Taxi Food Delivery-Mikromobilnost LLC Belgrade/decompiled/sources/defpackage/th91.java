package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Objects;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class th91 {
    public static final wly0 a = new wly0();
    public static final zoy0 b = new zoy0();
    public static final m501 c;
    public static final q501 d;

    static {
        int i = 24;
        c = new m501(i);
        d = new q501(i);
    }

    public static final void a(int i, fid fidVar, f530 f530Var, String str) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1064901626);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            v0b1.a(mja1.a(str, null, 6), f530Var, null, null, wwg.S(-973911766, true, new os(f530Var, 15), btsVar), null, null, null, 0.0f, 0, btsVar, ((i2 << 3) & 112) | HProv.ALG_CLASS_DATA_ENCRYPT, 1004);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new doj(f530Var, str, i, i3);
        }
    }

    public static final void b(f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1682675608);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530Var2 = f530Var;
            o4b1.b(mt71.m(q1h0.ic_coupon_24, 0, btsVar), null, f530Var2, null, null, 0.0f, new c36(tje.n(AppColor$Palette.Text, btsVar), 5), btsVar, 56 | ((i2 << 6) & 896), 56);
        } else {
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dc0(f530Var2, i, 10);
        }
    }

    public static final void c(f530 f530Var, x7a x7aVar, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        CharSequence charSequence;
        c530 c530Var;
        boolean z;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(262498857);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = i | 6 | (btsVar2.e(x7aVar) ? 32 : 16) | (btsVar2.e(slsVar) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var2 = c530.a;
            f530 m = ljs0.m(c530Var2, 56.0f);
            boolean z2 = (i2 & 896) == 256;
            Object Q = btsVar2.Q();
            if (z2 || Q == did.a) {
                Q = new jc0(24, slsVar);
                btsVar2.o0(Q);
            }
            f530 b2 = q791.b(m, null, null, false, null, new awk0(0), (sls) Q, 12);
            uo5 uo5Var = x4c.b;
            z910 d2 = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = b.d(btsVar2, b2);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, d2);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar2, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d3);
            f530 k = an91.k(ljs0.m(c530Var2, 56.0f), 16.0f);
            String str = x7aVar.b;
            tn9 tn9Var = x7aVar.c;
            d(6, btsVar2, k, str);
            if (tn9Var == null || (charSequence = tn9Var.a) == null || charSequence.length() <= 0) {
                charSequence = null;
            }
            if (charSequence == null) {
                btsVar2.e0(-1569506042);
                btsVar2.t(false);
                btsVar = btsVar2;
                c530Var = c530Var2;
                z = true;
            } else {
                btsVar2.e0(-1569506041);
                f530 b3 = m4m0.b(an91.o(cj6.a.a(c530Var2, x4c.w), 0.0f, 9.0f, 8.0f, 0.0f, 9), rzo.d(tn9Var.b), cyk0.a);
                z910 d4 = pi6.d(uo5Var, false);
                int hashCode2 = Long.hashCode(btsVar2.T);
                r1b0 o2 = btsVar2.o();
                f530 d5 = b.d(btsVar2, b3);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar2);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar, d4);
                qje.W(btsVar2, wlsVar2, o2);
                vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar);
                qje.W(btsVar2, wlsVar4, d5);
                c530Var = c530Var2;
                z = true;
                qgy.b(charSequence, null, an91.l(c530Var2, 4.0f, 2.0f), AppColor$Palette.EverFront, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).i.b, null, btsVar2, 3456, 0, 12274);
                btsVar = btsVar2;
                btsVar.t(true);
                btsVar.t(false);
            }
            btsVar.t(z);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(f530Var2, x7aVar, slsVar, i, 25);
        }
    }

    public static final void d(int i, fid fidVar, f530 f530Var, String str) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1383624198);
        int i2 = (btsVar.k(str) ? 32 : 16) | i;
        int i3 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (str != null) {
            btsVar.e0(-747242588);
            a(i2 & HProv.PP_DELETE_SAVED_PASSWD, btsVar, f530Var, str);
            btsVar.t(false);
        } else {
            btsVar.e0(-747169707);
            b(f530Var, btsVar, 6);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kga(f530Var, str, i, i3);
        }
    }

    public static int e(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, context.getOpPackageName()) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final void f(ViewGroup viewGroup, Long l) {
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(l.longValue());
        TransitionManager.beginDelayedTransition(viewGroup, changeBounds);
    }

    public static final void g(View view, boolean z) {
        view.setClickable(!z);
        view.setEnabled(!z);
        if (view instanceof EditText) {
            return;
        }
        view.setAlpha(z ? 0.4f : 1.0f);
    }
}
