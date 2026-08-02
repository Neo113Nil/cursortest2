package defpackage;

import android.os.Looper;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.time.Instant;
import okhttp3.Protocol;

/* loaded from: classes9.dex */
public final class rms implements ams, x3c, j0r, wi00, ese, ofy0, vm11, o9r, ga91 {
    public final /* synthetic */ int a;
    public static final /* synthetic */ rms b = new rms(16);
    public static final /* synthetic */ rms c = new rms(17);
    public static final /* synthetic */ rms w = new rms(18);
    public static final /* synthetic */ rms x = new rms(19);
    public static final /* synthetic */ rms y = new rms(20);
    public static final /* synthetic */ rms z = new rms(21);
    public static final /* synthetic */ rms A = new rms(22);
    public static final /* synthetic */ rms B = new rms(23);
    public static final /* synthetic */ rms C = new rms(24);
    public static final /* synthetic */ rms D = new rms(25);
    public static final /* synthetic */ rms E = new rms(26);
    public static final /* synthetic */ rms F = new rms(27);
    public static final /* synthetic */ rms G = new rms(28);
    public static final /* synthetic */ rms H = new rms(29);

    public rms(hrq0 hrq0Var) {
        this.a = 2;
    }

    public static ArrayList h(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Protocol) obj) != Protocol.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Protocol) it.next()).getProtocol());
        }
        return arrayList2;
    }

    public static byte[] i(List list) {
        yp6 yp6Var = new yp6();
        Iterator it = h(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            yp6Var.e0(str.length());
            yp6Var.x0(str);
        }
        return yp6Var.B(yp6Var.b);
    }

    public static ls31 j(rs31 rs31Var, hs31 hs31Var, int i) {
        ks31 ks31Var = ls31.b;
        if ((i & 2) != 0) {
            hs31Var = rs31Var instanceof q7u ? ((q7u) rs31Var).getDefaultViewModelProviderFactory() : nnh.a;
        }
        return new ls31(rs31Var.getViewModelStore(), hs31Var, rs31Var instanceof q7u ? ((q7u) rs31Var).getDefaultViewModelCreationExtras() : w8f.b);
    }

    public static final boolean k() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // defpackage.j0r
    public byte[] a() {
        return null;
    }

    @Override // defpackage.j0r
    public void c() {
    }

    @Override // defpackage.ams
    public Object d(jje jjeVar, inj injVar) {
        switch (this.a) {
            case 0:
                if (injVar.c == 2) {
                    Object[] objArr = injVar.a;
                    return Boolean.valueOf(ihb1.k(objArr[0], objArr[1]));
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"startswith\" requires 2 argument but "));
            default:
                if (injVar.c == 3) {
                    Object[] objArr2 = injVar.a;
                    return ihb1.l(objArr2[0], objArr2[1], objArr2[2]);
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"substring\" requires 3 argument but "));
        }
    }

    @Override // defpackage.j0r
    public void e(long j, String str) {
    }

    @Override // defpackage.j0r
    public void f() {
    }

    @Override // defpackage.j0r
    public String g() {
        return null;
    }

    @Override // defpackage.ofy0
    public hex get(String str) {
        return null;
    }

    @Override // defpackage.x3c
    public Instant now() {
        java.time.Instant now = java.time.Instant.now();
        Instant instant = Instant.a;
        return vng.m(now.getNano(), now.getEpochSecond());
    }

    @Override // defpackage.vm11
    public /* bridge */ /* synthetic */ Object q() {
        return Integer.valueOf(ModalContentViewContainer.BASE_SHADOW_COLOR);
    }

    @Override // defpackage.vm11
    public boolean t(Object obj) {
        return obj instanceof Integer;
    }

    @Override // defpackage.ga91
    public Object zza() {
        switch (this.a) {
            case 16:
                return new Boolean(nfb1.a());
            case 17:
                List list = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.e.b();
            case 18:
                List list2 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.q0.b()).longValue());
            case 19:
                List list3 = nw91.a;
                hcb1.b.get().getClass();
                Long l = (Long) qcb1.T.b();
                l.getClass();
                return l;
            case 20:
                List list4 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.P.b()).longValue());
            case 21:
                List list5 = nw91.a;
                hcb1.b.get().getClass();
                Long l2 = (Long) qcb1.f.b();
                l2.getClass();
                return l2;
            case 22:
                List list6 = nw91.a;
                hcb1.b.get().getClass();
                Long l3 = (Long) qcb1.z.b();
                l3.getClass();
                return l3;
            case 23:
                List list7 = nw91.a;
                hcb1.b.get().getClass();
                Long l4 = (Long) qcb1.t0.b();
                l4.getClass();
                return l4;
            case 24:
                List list8 = nw91.a;
                hcb1.b.get().getClass();
                Long l5 = (Long) qcb1.G.b();
                l5.getClass();
                return l5;
            case 25:
                List list9 = nw91.a;
                uhb1.b.get().getClass();
                Long l6 = (Long) bib1.b.b();
                l6.getClass();
                return l6;
            case 26:
                List list10 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.d.b()).longValue());
            case 27:
                List list11 = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.c0.b();
            case 28:
                List list12 = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.k.b();
            default:
                List list13 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.w.b()).longValue());
        }
    }

    public /* synthetic */ rms(int i) {
        this.a = i;
    }
}
