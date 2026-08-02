package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.yandex.music.shared.splash.screen.cache.serialization.InternalSplashScreenJsonAdapter;
import com.yandex.music.shared.splash.screen.network.SplashScreenApi;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class g5r implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ g5r(e8r e8rVar) {
        this.a = 17;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                bht bhtVar = (bht) obj;
                bhtVar.getClass();
                return bhtVar.getClass();
            case 1:
                JsonArray jsonArray = (JsonArray) obj;
                jsonArray.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator<JsonElement> it = jsonArray.iterator();
                while (it.hasNext()) {
                    JsonElement next = it.next();
                    next.getClass();
                    Integer F = cxb.F(next);
                    if (F != null) {
                        arrayList.add(F);
                    }
                }
                return Boolean.valueOf(arrayList.contains(Integer.valueOf(Build.VERSION.SDK_INT)));
            case 2:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(yve.class, new InternalSplashScreenJsonAdapter());
                return Unit.a;
            case 3:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return (SplashScreenApi) ((e0j) l13Var.a.D(hag.I(e0j.class), l13Var, l13Var.b)).a.b(SplashScreenApi.class);
            case 4:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new n7r(((e0j) l13Var2.a.D(hag.I(e0j.class), l13Var2, l13Var2.b)).b);
            case 5:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new u6r(((e0j) l13Var3.a.D(hag.I(e0j.class), l13Var3, l13Var3.b)).b);
            case 6:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, w6r.class).D(new g5r(8));
                o18Var.b(hag.I(j7r.class)).D(new g5r(9));
                o18Var.b(hag.I(h7r.class)).E(new g5r(10));
                o18Var.b(hag.I(g8r.class)).D(new g5r(11));
                o18Var.b(hag.I(k7r.class)).D(new g5r(12));
                o18Var.b(hag.I(z7r.class)).E(new g5r(13));
                o18Var.b(hag.I(l7r.class)).D(new g5r(14));
                o18Var.b(hag.I(x7r.class)).E(new g5r(15));
                o18Var.b(hag.I(x6r.class)).E(new g5r(16));
                o18Var.b(hag.I(y7r.class)).D(new g5r(7));
                return Unit.a;
            case 7:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return (y7r) ((x7r) l13Var4.a.D(hag.I(x7r.class), l13Var4, l13Var4.b)).a.getValue();
            case 8:
                ((l13) obj).getClass();
                return new w6r();
            case 9:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new j7r(l13Var5);
            case 10:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new h7r((j7r) l13Var6.a.D(hag.I(j7r.class), l13Var6, l13Var6.b));
            case 11:
                ((l13) obj).getClass();
                return new g8r();
            case 12:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new k7r(l13Var7);
            case 13:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return new z7r((k7r) l13Var8.a.D(hag.I(k7r.class), l13Var8, l13Var8.b));
            case 14:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return new l7r(l13Var9);
            case 15:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return new x7r((l7r) l13Var10.a.D(hag.I(l7r.class), l13Var10, l13Var10.b));
            case 16:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                return (x6r) ((h7r) l13Var11.a.D(hag.I(h7r.class), l13Var11, l13Var11.b)).a.getValue();
            case 17:
                w7r w7rVar = (w7r) obj;
                w7rVar.getClass();
                b8r b8rVar = b8r.a;
                if (w7rVar.equals(u7r.a) || w7rVar.equals(t7r.a)) {
                    return b8rVar;
                }
                if (w7rVar instanceof v7r) {
                    z6r z6rVar = ((v7r) w7rVar).a;
                    return new a8r(z6rVar.b, z6rVar.d);
                }
                b6e.s();
                return null;
            case 18:
                return new ym0(((Long) obj).longValue());
            case 19:
                ym0 ym0Var = (ym0) obj;
                ym0Var.getClass();
                return Long.valueOf((long) ym0Var.a);
            case 20:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, kgr.class).E(new g5r(21));
                o18Var2.b(hag.I(crs.class)).E(new g5r(22));
                return Unit.a;
            case 21:
                l13 l13Var12 = (l13) obj;
                l13Var12.getClass();
                return new kgr((y60) l13Var12.a.D(hag.I(y60.class), l13Var12, l13Var12.b));
            case 22:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(Context.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                Context context = (Context) qdcVar.C(I);
                bdt I2 = hag.I(cc7.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                return new crs(context, ((dc7) ((cc7) qdcVar2.C(I2))).b("track_events_config"));
            case 23:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                float density = np3Var.getDensity() * 8;
                long i = a4g.i(density, nmq.b(np3Var.a.e()));
                long j = d85.b;
                d85 d85Var = new d85(j);
                long j2 = d85.m;
                return np3Var.b(new ahr(y9w.F(u75.h(d85Var, new d85(j2)), 0.0f, density, 10), i, density, y9w.F(u75.h(new d85(j2), new d85(j)), nmq.d(np3Var.a.e()) - density, 0.0f, 12), 0));
            case 24:
                vz1.e((o18) obj, qnr.class).D(new g5r(25));
                return Unit.a;
            case 25:
                l13 l13Var13 = (l13) obj;
                l13Var13.getClass();
                return new qnr(l13Var13);
            case 26:
                vz1.e((o18) obj, ior.class).D(new g5r(27));
                return Unit.a;
            case 27:
                ((l13) obj).getClass();
                return new ior();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                e6l e6lVar = (e6l) obj;
                return new Pair(p6g.z(e6lVar), Boolean.valueOf(p6g.C(e6lVar)));
            default:
                ((Throwable) obj).getClass();
                ssg.a(6, "ChatCenter", "Auth error", null);
                return Unit.a;
        }
    }

    public /* synthetic */ g5r(int i) {
        this.a = i;
    }
}
