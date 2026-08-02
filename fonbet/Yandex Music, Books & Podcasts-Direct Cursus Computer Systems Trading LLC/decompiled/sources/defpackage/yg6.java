package defpackage;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.h;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class yg6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yg6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                ((xg6) this.b).invoke();
                return Unit.a;
            case 1:
                IOException iOException = (IOException) this.b;
                return iOException == null ? new IOException("parse error") : iOException;
            case 2:
                ((wqr) this.b).g(null);
                return Unit.a;
            case 3:
                um6 um6Var = (um6) this.b;
                CoroutineContext coroutineContext = um6Var.c;
                rjq rjqVar = um6Var.b;
                rjqVar.getClass();
                wqr n = a4g.n();
                rjqVar.D(new yg6(2, n));
                um6Var.a = coroutineContext.plus(n);
                return Unit.a;
            case 4:
                ((er6) this.b).dismissAllowingStateLoss();
                return Unit.a;
            case 5:
                Parcelable parcelable = ((vh7) this.b).requireArguments().getParcelable("paymentScreen:args");
                if (parcelable != null) {
                    return new di7((rh7) parcelable);
                }
                xq0.x("Required value was null.");
                return null;
            case 6:
                nq7 nq7Var = (nq7) this.b;
                xdr xdrVar = nq7Var.t;
                s7q s7qVar = new s7q(nq7Var);
                xdrVar.getClass();
                xdrVar.m(null, s7qVar);
                return Unit.a;
            case 7:
                return Boolean.valueOf(!((((lwc) ((wy7) this.b).a.getValue()).b.a() ? hni.a : ini.a) instanceof hni));
            case 8:
                return new l13((qdc) this.b, null);
            case 9:
                n78 n78Var = ((o78) this.b).a;
                t tVar = n78Var.a;
                n78Var.b.a();
                try {
                    tVar.startActivity(new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
                } catch (Exception unused) {
                    tVar.startActivity(new Intent("android.settings.SETTINGS"));
                }
                return Unit.a;
            case 10:
                d98 d98Var = (d98) this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(a98.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = d98Var.requireActivity();
                requireActivity.getClass();
                kxi d = d98Var.d();
                y supportFragmentManager = requireActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                return new v88(requireActivity, supportFragmentManager, new h(Page.DISLIKES), d);
            case 11:
                return ((b39) this.b).b;
            case 12:
                return (qy2) this.b;
            case 13:
                return ((t2a) this.b).z();
            case 14:
                return ((e3a) this.b).y();
            case 15:
                suh suhVar = (suh) this.b;
                ((cir) suhVar.b).e.remove((g3) suhVar.c);
                return Unit.a;
            case 16:
                yfx yfxVar = (yfx) this.b;
                return new v5f(quj.r(x3f.d, new ny2(16, (m) yfxVar.b, new c68(yfxVar))));
            case 17:
                return l1b.g((Context) ((es6) this.b).a);
            case 18:
                Object systemService = ((Activity) ((rdk) this.b).b).getSystemService("download");
                if (systemService != null) {
                    return (DownloadManager) systemService;
                }
                return null;
            case 19:
                LinkedHashMap linkedHashMap = ((fba) this.b).a;
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((mqs) ((Map.Entry) it.next()).getKey());
                }
                return arrayList;
            case 20:
                ((zx4) ((ida) this.b).m.getValue()).getClass();
                return new bda();
            case 21:
                aea aeaVar = ((yda) this.b).b;
                if (!((Boolean) ((fkn) aeaVar.n.b).a.getValue()).booleanValue()) {
                    x97.y(ot0.F(aeaVar), null, null, new g68(aeaVar, continuation, 6), 3);
                }
                return Unit.a;
            case 22:
                ((zx4) ((aea) this.b).p.getValue()).getClass();
                return new rda();
            case 23:
                ((zx4) ((yea) this.b).k.getValue()).getClass();
                return new jea();
            case 24:
                ((zx4) ((ufa) this.b).k.getValue()).getClass();
                return new qfa();
            case 25:
                ((zx4) ((gha) this.b).m.getValue()).getClass();
                return new dha();
            case 26:
                ((zx4) ((zha) this.b).k.getValue()).getClass();
                return new wha();
            case 27:
                lja ljaVar = (lja) this.b;
                return wop.i(ljaVar.d, ljaVar.e);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                rja rjaVar = (rja) this.b;
                rmb.j(rjaVar.b, wjb.DownloadedContentScreen, null, null, 14);
                gs4 gs4Var = rjaVar.a;
                int i = CollectionMainActivity.v0;
                Activity activity = (Activity) gs4Var.a;
                activity.startActivity(men.B(activity, v35.o));
                return Unit.a;
            default:
                return new xka((yka) this.b);
        }
    }
}
