package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.appset.b;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.internal.a;
import com.yandex.delivery.mapper.model.Expansion;
import com.yandex.go.promocodes.base.impl.promo_codes.data.experiments.PromoCodeListRequestServicesExperiment;
import com.yandex.go.shortcuts.dto.response.PromoMode;
import com.yandex.go.superapp.order_tracking.api.data.OrderTrackingService$External$PreferredTrackingType;
import com.yandex.go.yb.domain.r;
import com.yandex.plus.treasury.impl.c;
import com.ybsdk.api.YBSdk;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.atx0;
import defpackage.qw2;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.eats_orders.domain.entities.order.status.EatsOrderStatus;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes8.dex */
public final class va90 implements lqd0, fkm0, t52, ofy0, tw, wj2, pi, a25, pui0, f5b1, pke {
    public final Object a;

    public va90(ike ikeVar, js1 js1Var, bg3 bg3Var) {
        j10 j10Var = new j10(js1Var.b, this, bg3Var, 5);
        xsr0.a.getClass();
        this.a = e.R(j10Var, ikeVar, wsr0.c, ag3.a);
    }

    @Override // defpackage.f5b1
    public boolean a(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((f5b1[]) this.a)[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pui0
    public /* synthetic */ void accept(Object obj, Object obj2) {
        ((a) obj).s((IsReadyToPayRequest) this.a, (atx0) obj2);
    }

    @Override // defpackage.f5b1
    public i7b1 c(Class cls) {
        for (int i = 0; i < 2; i++) {
            f5b1 f5b1Var = ((f5b1[]) this.a)[i];
            if (f5b1Var.a(cls)) {
                return f5b1Var.c(cls);
            }
        }
        w511.x("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.t52
    public void d(int i, boolean z) {
        SlideableModalView slideableModalView = (SlideableModalView) this.a;
        if (i == 4) {
            slideableModalView.onCollapsedStateInternal();
        }
        slideableModalView.updateArrow();
        slideableModalView.onBehaviorStateChanged(i, z);
    }

    @Override // defpackage.fkm0
    public void e(zjm0 zjm0Var) {
        qeu qeuVar = (qeu) this.a;
        if (zjm0Var instanceof yjm0) {
            yjm0 yjm0Var = (yjm0) zjm0Var;
            qeuVar.m(yjm0Var.a(), yjm0Var.b());
        } else if (!(zjm0Var instanceof xjm0)) {
            w511.b();
        } else {
            xjm0 xjm0Var = (xjm0) zjm0Var;
            qeuVar.j(xjm0Var.a(), xjm0Var.b(), xjm0Var.c());
        }
    }

    public void g(w201 w201Var) {
        EatsOrderStatus eatsOrderStatus;
        Object obj;
        Expansion expansion;
        o4w0 o4w0Var = (o4w0) this.a;
        boolean z = w201Var instanceof bjz;
        hxx hxxVar = hxx.a;
        c21 c21Var = sy60.Q2;
        if (z) {
            bjz bjzVar = (bjz) w201Var;
            String str = bjzVar.b;
            int i = l4w0.a[bjzVar.l.a().ordinal()];
            if (i == 1) {
                expansion = Expansion.EXPANDED;
            } else if (i == 2) {
                expansion = Expansion.ANCHORED;
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                expansion = Expansion.COLLAPSED;
            }
            o4w0Var.E((m950) o4w0Var.a0.get(), new rui(str, (Map) null, expansion, (UUID) null, 26), c21Var, hxxVar);
            return;
        }
        boolean z2 = w201Var instanceof d3p;
        uz70 uz70Var = null;
        d3p d3pVar = z2 ? (d3p) w201Var : null;
        if (d3pVar != null && (eatsOrderStatus = d3pVar.f) != null && eatsOrderStatus.getIsActive()) {
            d3p d3pVar2 = (d3p) w201Var;
            y2p y2pVar = d3pVar2.l;
            h1p h1pVar = d3pVar2.c;
            if (y2pVar == null && ((a6w0) o4w0Var.K).a(h1pVar).a() != OrderTrackingService$External$PreferredTrackingType.WEB) {
                Iterator it = o4w0Var.L.a().k(h1pVar).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (jl40.l(d3pVar2.a, ((ren) obj).g())) {
                            break;
                        }
                    }
                }
                ren renVar = (ren) obj;
                if (renVar != null && renVar.r()) {
                    o4w0Var.O.a(h1pVar.getValue());
                    if (z2) {
                        d3p d3pVar3 = (d3p) w201Var;
                        uz70Var = new uz70(d3pVar3.a, new vz70(d3pVar3.c.getValue()));
                    }
                    if (uz70Var == null) {
                        return;
                    }
                    o4w0Var.E((m950) o4w0Var.H.get(), uz70Var, c21Var, hxxVar);
                    return;
                }
            }
        }
        if (z2) {
            ru.yandex.taxi.service.a aVar = o4w0Var.R;
            h1p h1pVar2 = ((d3p) w201Var).c;
            w6w0 w6w0Var = aVar.a;
            szv0 a = aVar.b.a();
            t1p t1pVar = (t1p) aVar.c.a.c();
            PromoMode a2 = aVar.d.a();
            sdn.Companion.getClass();
            x6w0 a3 = ru.yandex.taxi.service.a.a(w6w0Var.a(a, t1pVar, a2, sdn.e), h1pVar2);
            String c = a3 != null ? a3.c() : null;
            if (c == null || evu0.J(c)) {
                jst.e.q("Incorrect serviceUrl '" + c + "' for service=" + h1pVar2.getValue());
            } else if (!og21.b(Uri.parse(c))) {
                ((a60) o4w0Var.S).c(c, v770.c);
                return;
            }
        }
        o4w0Var.F.a(w201Var);
    }

    @Override // defpackage.ofy0
    public hex get(String str) {
        return (hex) ((w53) this.a).get(str);
    }

    @Override // defpackage.pke
    public Object h(Task task) {
        rfw0 rfw0Var = (rfw0) this.a;
        if (!task.o() && !task.m()) {
            Exception j = task.j();
            if (j instanceof ApiException) {
                int b = ((ApiException) j).b();
                if (b == 43001 || b == 43002 || b == 43003 || b == 17) {
                    final b bVar = (b) rfw0Var.b;
                    bVar.getClass();
                    final atx0 atx0Var = new atx0();
                    bVar.b.execute(new Runnable() { // from class: com.google.android.gms.internal.appset.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            atx0 atx0Var2 = atx0Var;
                            zzw zzwVar = atx0Var2.a;
                            Context context = b.this.a;
                            String string = b.a(context).getString(CommonUrlParts.APP_SET_ID, null);
                            long j2 = b.a(context).getLong("app_set_id_last_used_time", -1L);
                            long j3 = j2 != -1 ? j2 + 33696000000L : -1L;
                            if (string == null || System.currentTimeMillis() > j3) {
                                string = UUID.randomUUID().toString();
                                try {
                                    if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString(CommonUrlParts.APP_SET_ID, string).commit()) {
                                        String valueOf = String.valueOf(context.getPackageName());
                                        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                                        throw new zzk("Failed to store the app set ID.");
                                    }
                                    b.b(context);
                                    if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                                        String valueOf2 = String.valueOf(context.getPackageName());
                                        Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                                        throw new zzk("Failed to store the app set ID creation time.");
                                    }
                                } catch (zzk e) {
                                    zzwVar.r(e);
                                    return;
                                }
                            } else {
                                try {
                                    b.b(context);
                                } catch (zzk e2) {
                                    zzwVar.r(e2);
                                    return;
                                }
                            }
                            atx0Var2.a(new qw2(string, 1));
                        }
                    });
                    return atx0Var.a;
                }
                if (b == 43000) {
                    return udq0.o(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (b == 15) {
                    return udq0.o(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    @Override // defpackage.t52
    public void i(float f, boolean z, View view) {
        SlideableModalView slideableModalView = (SlideableModalView) this.a;
        if ((!z || f == 1.0f) && !slideableModalView.isTransiting()) {
            slideableModalView.onDialogSlide(f);
        }
    }

    public void j(String str) {
        em3 em3Var = ((AppAnalyticsReporter) this.a).S;
        em3Var.a.a("pin_code.get_passport_stash_2", g8e.w(1, "raw_stash", str));
    }

    public void k(String str) {
        em3 em3Var = ((AppAnalyticsReporter) this.a).S;
        em3Var.a.a("pin_code.set_passport_stash_2", g8e.w(1, "raw_stash", str));
    }

    public void l(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void m(int i, String str, List list, boolean z, boolean z2) {
        l1a1 l1a1Var;
        p8a1 p8a1Var = (p8a1) this.a;
        int i2 = i - 1;
        if (i2 == 0) {
            y1a1 y1a1Var = ((g) p8a1Var.b).y;
            g.g(y1a1Var);
            l1a1Var = y1a1Var.G;
        } else if (i2 != 1) {
            if (i2 == 3) {
                y1a1 y1a1Var2 = ((g) p8a1Var.b).y;
                g.g(y1a1Var2);
                l1a1Var = y1a1Var2.H;
            } else if (i2 != 4) {
                y1a1 y1a1Var3 = ((g) p8a1Var.b).y;
                g.g(y1a1Var3);
                l1a1Var = y1a1Var3.F;
            } else if (z) {
                y1a1 y1a1Var4 = ((g) p8a1Var.b).y;
                g.g(y1a1Var4);
                l1a1Var = y1a1Var4.D;
            } else if (z2) {
                y1a1 y1a1Var5 = ((g) p8a1Var.b).y;
                g.g(y1a1Var5);
                l1a1Var = y1a1Var5.C;
            } else {
                y1a1 y1a1Var6 = ((g) p8a1Var.b).y;
                g.g(y1a1Var6);
                l1a1Var = y1a1Var6.E;
            }
        } else if (z) {
            y1a1 y1a1Var7 = ((g) p8a1Var.b).y;
            g.g(y1a1Var7);
            l1a1Var = y1a1Var7.A;
        } else if (z2) {
            y1a1 y1a1Var8 = ((g) p8a1Var.b).y;
            g.g(y1a1Var8);
            l1a1Var = y1a1Var8.z;
        } else {
            y1a1 y1a1Var9 = ((g) p8a1Var.b).y;
            g.g(y1a1Var9);
            l1a1Var = y1a1Var9.B;
        }
        int size = list.size();
        if (size == 1) {
            l1a1Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            l1a1Var.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            l1a1Var.a(str);
        } else {
            l1a1Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    @Override // defpackage.pi
    public boolean o(View view, hi hiVar) {
        h hVar = (h) this.a;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = hVar.d;
        if (viewPager2.isUserInputEnabled()) {
            viewPager2.setCurrentItemInternal(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.a25
    public void onConnectionFailed(ConnectionResult connectionResult) {
        ((yx60) this.a).onConnectionFailed(connectionResult);
    }

    @Override // defpackage.lqd0
    public kqd0 q() {
        return (c) this.a;
    }

    @Override // defpackage.wj2
    public ynr get(int i) {
        return (ynr) this.a;
    }

    public va90(rqo rqoVar) {
        PromoCodeListRequestServicesExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).c(PromoCodeListRequestServicesExperiment.d);
    }

    public /* synthetic */ va90(Object obj) {
        this.a = obj;
    }

    public va90(com.yandex.div.core.expression.variables.a aVar, fx51 fx51Var) {
        this.a = aVar;
    }

    public va90(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            w5t0 w5t0Var = new w5t0(view);
            w5t0Var.b = view;
            this.a = w5t0Var;
            return;
        }
        this.a = new ez2(view);
    }

    public va90(WindowInsetsController windowInsetsController) {
        w5t0 w5t0Var = new w5t0(null);
        w5t0Var.c = windowInsetsController;
        this.a = w5t0Var;
    }

    public va90(ag61 ag61Var) {
        this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), ag61Var);
    }

    public va90(isd0 isd0Var, r rVar) {
        isd0Var.getClass();
        this.a = new c(YBSdk.INSTANCE, new com.yandex.go.plus.yb.integration.a(rVar));
    }
}
