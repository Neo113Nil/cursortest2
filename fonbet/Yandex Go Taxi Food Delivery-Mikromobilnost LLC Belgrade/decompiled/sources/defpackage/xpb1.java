package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.yandex.go.lootbox.impl.domain.interactors.animation.e;
import com.yandex.go.payments.di.a;
import com.yandex.go.taxi.order.infosharing.data.TaxiOrderSharingApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import ru.yandex.logistics.sdk.order_validation.impl.data.ValidationApi;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes12.dex */
public final class xpb1 implements jm0, mh2, ii6, ihg0, izc0, sxv, q5u, r3t0, yy20, c5c0, m8j0, opm0, e8p0, k1t0 {
    public static volatile sg8 B;
    public static final xpb1 I;
    public static final xpb1 J;
    public static xpb1 b;
    public static final le4 x;
    public static final ne4 y;
    public final /* synthetic */ int a;
    public static final xpb1 c = new xpb1(1);
    public static final xpb1 w = new xpb1(2);
    public static final xpb1 z = new xpb1(4);
    public static final xpb1 A = new xpb1(5);
    public static final xpb1 C = new xpb1(6);
    public static final /* synthetic */ xpb1 D = new xpb1(8);
    public static final xpb1 E = new xpb1(9);
    public static final xpb1 F = new xpb1(10);
    public static final xpb1 G = new xpb1(11);
    public static final xpb1 H = new xpb1(12);
    public static final xpb1 K = new xpb1(16);
    public static final xpb1 L = new xpb1(17);
    public static final xpb1 M = new xpb1(18);
    public static final xpb1 N = new xpb1(21);
    public static final xpb1 O = new xpb1(23);
    public static final xpb1 P = new xpb1(24);
    public static final xpb1 Q = new xpb1(25);
    public static final xpb1 R = new xpb1(27);

    static {
        int i = 12;
        x = new le4(new bgc(i));
        y = new ne4(new bgc(i));
        int i2 = 13;
        I = new xpb1(i2);
        J = new xpb1(i2);
    }

    public /* synthetic */ xpb1(int i) {
        this.a = i;
    }

    public static sx90 A(ju6 ju6Var) {
        return new sx90(ju6Var, 0);
    }

    public static sx90 B(ju6 ju6Var) {
        return new sx90(ju6Var, 1);
    }

    public static egq0 C(Calendar calendar, Calendar calendar2, Calendar calendar3) {
        Calendar calendar4 = Calendar.getInstance();
        Calendar calendar5 = null;
        Calendar calendar6 = calendar != null ? kdb1.i(calendar, calendar3) ? (Calendar) calendar3.clone() : kdb1.h(calendar, calendar4) ? (Calendar) calendar4.clone() : (Calendar) calendar.clone() : null;
        if (calendar2 != null) {
            calendar5 = kdb1.i(calendar2, calendar3) ? (Calendar) calendar3.clone() : kdb1.h(calendar2, calendar4) ? (Calendar) calendar4.clone() : (Calendar) calendar2.clone();
        }
        return new egq0(calendar6, calendar5);
    }

    public static ValidationApi D(t0k0 t0k0Var) {
        return (ValidationApi) t0k0Var.b(ValidationApi.class);
    }

    public static synchronized void E() {
        synchronized (xpb1.class) {
            if (b == null) {
                b = new xpb1(0);
            }
        }
    }

    public static a b(ru.yandex.taxi.am.token.a aVar, h hVar, to90 to90Var) {
        return new a(aVar, hVar, to90Var);
    }

    public static Typeface l(vl51 vl51Var) {
        return ngd0.s(vl51Var.a, vl51Var.b);
    }

    public static ity n() {
        return new ity();
    }

    public static Typeface o(vl51 vl51Var) {
        return ngd0.s(vl51Var.a, vl51Var.b);
    }

    public static c1m0 p(jjl jjlVar) {
        return (c1m0) jjlVar.a.get();
    }

    public static com.yandex.go.lootbox.impl.domain.interactors.activation.a q(t2g t2gVar) {
        return (com.yandex.go.lootbox.impl.domain.interactors.activation.a) t2gVar.k.get();
    }

    public static apz r(t2g t2gVar) {
        ypz ypzVar = t2gVar.a;
        pho phoVar = ypzVar.m;
        q5z.h(phoVar);
        u8w u8wVar = new u8w(phoVar);
        pho phoVar2 = ypzVar.m;
        q5z.h(phoVar2);
        return new apz(u8wVar, new o61(phoVar2), new o61(phoVar2), new pj(phoVar2));
    }

    public static e s(t2g t2gVar) {
        return (e) t2gVar.i.get();
    }

    public static jpz t(t2g t2gVar) {
        return (jpz) t2gVar.l.get();
    }

    public static t2g u(ypz ypzVar) {
        ypzVar.getClass();
        return new t2g(ypzVar);
    }

    public static dqz v(t2g t2gVar) {
        ypz ypzVar = t2gVar.a;
        uq1 uq1Var = ypzVar.j;
        q5z.h(uq1Var);
        zuj0 zuj0Var = ypzVar.n;
        q5z.h(zuj0Var);
        return new dqz(uq1Var, zuj0Var);
    }

    public static iqz w(t2g t2gVar) {
        return (iqz) t2gVar.m.get();
    }

    public static qqz x(t2g t2gVar) {
        return (qqz) t2gVar.u.get();
    }

    public static ra9 y(m7w0 m7w0Var, w030 w030Var) {
        return m7w0Var.a(w030Var);
    }

    public static TaxiOrderSharingApi z(on2 on2Var) {
        on2Var.getClass();
        return (TaxiOrderSharingApi) on2Var.a(GoApiName.TaxiV4, TaxiOrderSharingApi.class);
    }

    @Override // defpackage.ii6
    public Rect a(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            return new Rect((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            ii6.Y0.getClass();
            h2b1 h2b1Var = h2b1.x;
            return dab1.x.a(activity);
        }
    }

    @Override // defpackage.k1t0
    public int c(int i, int i2, int i3, int i4) {
        return (((i - i3) - i4) / 2) - (i2 / 2);
    }

    @Override // defpackage.ii6
    public Rect d(Activity activity) {
        Display defaultDisplay = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Rect(0, 0, point.x, point.y);
    }

    @Override // defpackage.izc0
    public rh3 f() {
        Uri uri = Uri.EMPTY;
        return new wwu0(uri != null ? new bwu0(uri) : nm60.a, 0L);
    }

    @Override // defpackage.mh2
    public void g(View view, gtg gtgVar, gtg gtgVar2, long j) {
        cma1.b(1.0f, view).setDuration(j).setListener(new AnimUtils$AnimationStartEndListener(new hh2(gtgVar, 0), new ih2(gtgVar2, 0)));
    }

    @Override // defpackage.m8j0
    public String i() {
        return "Changed includeDeliveryIntervals";
    }

    @Override // defpackage.izc0
    public rh3 j() {
        return null;
    }

    @Override // defpackage.e8p0
    public String k() {
        return "jet_abroad";
    }

    @Override // defpackage.mh2
    public void m(View view, gtg gtgVar, gtg gtgVar2, long j) {
        cma1.b(0.0f, view).setDuration(j).setListener(new AnimUtils$AnimationStartEndListener(new fh2(gtgVar, 0), new gh2(gtgVar2, 0)));
    }

    public String toString() {
        switch (this.a) {
            case 17:
                return "coil.request.NullRequestData";
            case 27:
                return "Center";
            default:
                return super.toString();
        }
    }
}
