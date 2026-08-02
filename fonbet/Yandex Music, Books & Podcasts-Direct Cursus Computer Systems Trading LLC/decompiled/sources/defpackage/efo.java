package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yandex.plus.log.api.a;
import com.yandex.plus.log.api.b;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import retrofit2.Call;
import retrofit2.Response;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class efo implements fxh, fyh, nwu, jr2, mv3, d6w, pur, u97, tj4, jpj, os3, x7o, ogg, cmr {
    public static efo c;
    public static final ffo d = new ffo(0, 0, 0, false, false);
    public static final efo e = new efo(1, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public static final Object f = new Object();
    public static final wwq g = new wwq(4);
    public static efo h;
    public final /* synthetic */ int a;
    public Object b;

    public efo(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = new knn(3, new aaw(16));
                break;
            case 19:
                this.b = new CopyOnWriteArrayList();
                break;
            case 25:
                this.b = new ArrayList();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                this.b = new LinkedHashSet();
                break;
            default:
                this.b = new ciq(0);
                h = this;
                break;
        }
    }

    public static synchronized efo g() {
        efo efoVar;
        synchronized (efo.class) {
            try {
                if (c == null) {
                    c = new efo(0, false);
                }
                efoVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return efoVar;
    }

    public static void i(efo efoVar, String str, String str2, String str3, Throwable th, Map map, Map map2, int i) {
        if ((i & 32) != 0) {
            map = e5b.a;
            map.getClass();
        }
        if ((i & 64) != 0) {
            map2 = e5b.a;
            map2.getClass();
        }
        c5b c5bVar = c5b.a;
        b bVar = ((com.yandex.plus.bdui.o) efoVar.b).a;
        a aVar = a.e;
        if (bVar.b(aVar)) {
            StringBuilder m = f1d.m("\n                        message = ", str2, "\n                        type = ", str, "\n                        locator = ");
            m.append(str3);
            m.append("\n                        fails = ");
            m.append(c5bVar);
            m.append("\n                        context = ");
            m.append(map2);
            m.append("\n                        payload = ");
            m.append(map);
            m.append("\n                    ");
            bVar.a(aVar, "DocumentEngine", hlr.d(m.toString()), th);
        }
    }

    @Override // defpackage.os3
    public void A(Call call, Throwable th) {
        ((hm5) this.b).completeExceptionally(th);
    }

    @Override // defpackage.fxh
    public boolean B(hxh hxhVar, MenuItem menuItem) {
        boolean onMenuItemClick;
        gg ggVar = ((ActionMenuView) this.b).A;
        if (ggVar != null) {
            Toolbar toolbar = (Toolbar) ((uiq) ggVar).b;
            if (toolbar.G.a(menuItem)) {
                onMenuItemClick = true;
            } else {
                ros rosVar = toolbar.I;
                onMenuItemClick = rosVar != null ? rosVar.onMenuItemClick(menuItem) : false;
            }
            if (onMenuItemClick) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.os3
    public void D(Call call, Response response) {
        boolean b = response.a.b();
        hm5 hm5Var = (hm5) this.b;
        if (b) {
            hm5Var.complete(response.b);
        } else {
            hm5Var.completeExceptionally(new wp3(response));
        }
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.b;
        kqv kqvVar2 = collapsingToolbarLayout.getFitsSystemWindows() ? kqvVar : null;
        if (!Objects.equals(collapsingToolbarLayout.E, kqvVar2)) {
            collapsingToolbarLayout.E = kqvVar2;
            collapsingToolbarLayout.requestLayout();
        }
        return kqvVar.a.c();
    }

    @Override // defpackage.nwu
    public void O(boolean z) {
        ((b21) this.b).d.e.invoke();
    }

    @Override // defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        gw0 gw0Var = (gw0) ((le3) this.b).b;
        gw0Var.l.getClass();
        gw0.p = new Date().getTime();
        short s = om3Var.k(2).getShort();
        om3Var.c -= 2;
        om3 om3Var2 = new om3();
        om3Var.g(om3Var2, s);
        om3Var2.b = om3Var.b;
        String l = om3Var2.l(null);
        int i = om3Var.c;
        byte[] bArr = new byte[i];
        om3Var.e(i, bArr);
        try {
            gw0Var.j(null, u2x.O(l), bArr);
        } catch (Exception e2) {
            Log.e("Channel", "handleBinaryMessage error: " + e2.getMessage());
        }
    }

    @Override // defpackage.fxh
    public void a(hxh hxhVar) {
        fxh fxhVar = ((ActionMenuView) this.b).v;
        if (fxhVar != null) {
            fxhVar.a(hxhVar);
        }
    }

    @Override // defpackage.ogg
    public void b() {
        n97 n97Var = (n97) this.b;
        n97Var.A.b();
        g97 g97Var = n97Var.C;
        if (g97Var != null) {
            throw g97Var;
        }
    }

    public f4c c(ff7 ff7Var) {
        if (ff7Var.equals(z3c.p)) {
            return new o6c(23);
        }
        if (ff7Var instanceof a4c) {
            return new au1((mka) ((oxo) this.b).invoke(), ((a4c) ff7Var).p);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.fyh
    public void e(hxh hxhVar, boolean z) {
        ((er0) this.b).v(hxhVar);
    }

    public void h(hgp hgpVar, Thread thread, Throwable th) {
        Task f2;
        gp6 gp6Var = (gp6) this.b;
        synchronized (gp6Var) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            long currentTimeMillis = System.currentTimeMillis();
            vq6 vq6Var = (vq6) gp6Var.e.a;
            ep6 ep6Var = new ep6(gp6Var, currentTimeMillis, th, thread, hgpVar);
            synchronized (vq6Var.c) {
                f2 = ((Task) vq6Var.d).f((ExecutorService) vq6Var.b, new n(22, ep6Var));
                vq6Var.d = f2;
            }
            try {
                try {
                    nvt.a(f2);
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e2) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e2);
            }
        }
    }

    @Override // defpackage.mv3
    public void j(lv3 lv3Var) {
        lv3Var.getClass();
        ((z03) this.b).l.l(lv3Var);
    }

    @Override // defpackage.jr2
    public void k(or2 or2Var) {
        ((lgu) this.b).setCurrentItem(or2Var.b);
    }

    @Override // defpackage.pur
    public void l(zco zcoVar, float f2) {
        zcoVar.getClass();
        ((knn) this.b).l(zcoVar, f2);
    }

    @Override // defpackage.cmr
    public ywh n(xwh xwhVar) {
        return null;
    }

    @Override // defpackage.d6w
    public void o() {
        ((dj3) this.b).c();
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        w17 w17Var;
        mpo mpoVar = (mpo) obj;
        c27 c27Var = (c27) this.b;
        o6c o6cVar = c27Var.m;
        g0c g0cVar = c27Var.l;
        voi voiVar = c27Var.o;
        mpoVar.getClass();
        int i = mpoVar.b;
        lpo lpoVar = mpoVar.a;
        if (i == 0 && !lpoVar.a()) {
            qne X0 = gut.X0(c27Var.G());
            x60 x60Var = (x60) g0cVar;
            x60Var.getClass();
            x60Var.a(X0);
            o6cVar.getClass();
            voiVar.m(new y17());
            return;
        }
        qne a1 = gut.a1(c27Var.G(), lpoVar.a());
        x60 x60Var2 = (x60) g0cVar;
        x60Var2.getClass();
        x60Var2.a(a1);
        c27Var.u.m(lpoVar);
        if (lpoVar.a()) {
            voiVar.m(z17.a);
            return;
        }
        kpo kpoVar = c27Var.s;
        if (qdq.B(kpoVar != null ? Boolean.valueOf(kpoVar.d()) : null)) {
            o6cVar.getClass();
            w17Var = new w17(R.string.paymentsdk_challenger_wrong_sms);
        } else {
            o6cVar.getClass();
            w17Var = new w17(R.string.paymentsdk_challenger_wrong_amount);
        }
        voiVar.m(w17Var);
    }

    @Override // defpackage.mv3
    public void p(k5 k5Var) {
        ((z03) this.b).n = k5Var;
    }

    @Override // defpackage.cmr
    public void q(xwh xwhVar, Bitmap bitmap, Map map) {
        ((j4x) this.b).C(xwhVar, bitmap, map, fx1.e(bitmap));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Bradford";
            case 6:
                sr1 sr1Var = (sr1) this.b;
                if (sr1Var.f != null) {
                    return String.format(Locale.ENGLISH, "%s %s HTTP/1.1", sr1Var.a, sr1Var.b);
                }
                String encodedPath = sr1Var.b.getEncodedPath();
                if (encodedPath == null || encodedPath.length() == 0) {
                    encodedPath = "/";
                }
                String encodedQuery = sr1Var.b.getEncodedQuery();
                if (encodedQuery != null && encodedQuery.length() != 0) {
                    encodedPath = ouj.o(encodedPath, "?", encodedQuery);
                }
                Locale locale = Locale.ENGLISH;
                return k5r.m(sr1Var.a, StringUtil.SPACE, encodedPath, " HTTP/1.1");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fyh
    public boolean w(hxh hxhVar) {
        Window.Callback callback = ((er0) this.b).l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, hxhVar);
        return true;
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        ((c27) this.b).o.m(new x17(bfkVar));
    }

    @Override // defpackage.nwu
    public void d() {
    }

    @Override // defpackage.jr2
    public void f(or2 or2Var) {
    }

    @Override // defpackage.cmr
    public void m(int i) {
    }

    public /* synthetic */ efo(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ efo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public efo(l13 l13Var) {
        this.a = 23;
        this.b = new vy7(l13Var);
    }
}
