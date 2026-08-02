package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import com.google.android.gms.tasks.Task;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.chargers.discounts.api.data.model.ChargersProgressImageParamsDto;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoPayload$Origin;
import com.yandex.go.pickup_from_photo.navigation.c;
import com.yandex.messaging.internal.net.a;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import kotlin.text.Regex;
import retrofit2.Call;
import retrofit2.Response;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes15.dex */
public final class yfa implements fc3, q710, dqb, wwc, yk7, s2h, b070, hen, dy60, hwe, h3v0, m11 {
    public final Object a;

    public yfa(vwc vwcVar) {
        this.a = vwcVar;
        if (vwcVar.x == null) {
            bwu bwuVar = vwcVar.z.b;
            String str = vwcVar.b;
            hfy hfyVar = vwcVar.c;
            xf7 xf7Var = bwuVar.a;
            a aVar = bwuVar.b;
            c370 c370Var = bwuVar.c;
            x22 x22Var = bwuVar.d;
            String str2 = bwuVar.e.c;
            vwcVar.x = new awu(xf7Var, aVar, c370Var, x22Var, str2 != null ? "android_".concat(str2) : ConstantDeviceInfo.APP_PLATFORM, str, vwcVar, hfyVar);
        }
    }

    public static yfa b(kj7 kj7Var) {
        return new yfa(kj7Var);
    }

    public static ldc j(String str) {
        Character w0 = gvu0.w0(0, str);
        if (w0 == null) {
            return null;
        }
        try {
            return new ldc(w0.charValue() != '#' ? rzo.d(Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(str))) : rzo.d(Color.parseColor(str)));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // defpackage.fc3
    public void a(heb hebVar, tkb1 tkb1Var) {
        krw krwVar = ((d1b) this.a).c;
        if (tkb1Var.equals(deb.c) || tkb1Var.equals(deb.b) || tkb1Var.equals(deb.a)) {
            return;
        }
        if (tkb1Var instanceof eeb) {
            krwVar.a(false, "web", ((eeb) tkb1Var).a);
            return;
        }
        if (tkb1Var instanceof ceb) {
            krwVar.a(false, "web", ((ceb) tkb1Var).a);
        } else if (tkb1Var instanceof feb) {
            krwVar.a(false, "system", ((feb) tkb1Var).a);
        } else {
            w511.b();
        }
    }

    public g9e c(Object obj, g0c g0cVar, Activity activity, tls tlsVar) {
        f9e f9eVar = new f9e(g0cVar, tlsVar);
        ClassLoader classLoader = (ClassLoader) this.a;
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{classLoader.loadClass("java.util.function.Consumer")}, f9eVar);
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, classLoader.loadClass("java.util.function.Consumer")).invoke(obj, activity, newProxyInstance);
        return new g9e(obj.getClass().getMethod("removeWindowLayoutInfoListener", classLoader.loadClass("java.util.function.Consumer")), obj, newProxyInstance);
    }

    public a2 d() {
        t3 t3Var = (t3) this.a;
        if (t3Var == null) {
            return null;
        }
        z3.a(t3Var, 0);
        return t3Var.g();
    }

    public ldc e(qfc qfcVar, boolean z) {
        String str = qfcVar.c;
        if (str != null) {
            return f(str);
        }
        if (z) {
            ldc j = j(qfcVar.b);
            if (j == null) {
                return null;
            }
            long j2 = j.a;
            Float f = qfcVar.e;
            return new ldc(ldc.b(j2, f != null ? f.floatValue() : 1.0f, 0.0f, 0.0f, 0.0f, 14));
        }
        ldc j3 = j(qfcVar.a);
        if (j3 == null) {
            return null;
        }
        long j4 = j3.a;
        Float f2 = qfcVar.d;
        return new ldc(ldc.b(j4, f2 != null ? f2.floatValue() : 1.0f, 0.0f, 0.0f, 0.0f, 14));
    }

    public ldc f(String str) {
        Integer b = ((qdc) this.a).b(str);
        if (b != null) {
            return new ldc(rzo.d(b.intValue()));
        }
        return null;
    }

    @Override // defpackage.h3v0
    public Task g(Object obj) {
        m6r0 m6r0Var = (m6r0) obj;
        p1b p1bVar = (p1b) this.a;
        if (m6r0Var == null) {
            return udq0.p(null);
        }
        com.google.firebase.crashlytics.internal.common.a aVar = (com.google.firebase.crashlytics.internal.common.a) p1bVar.b;
        com.google.firebase.crashlytics.internal.common.a.a(aVar);
        aVar.m.g(null, aVar.e.a);
        aVar.q.c(null);
        return udq0.p(null);
    }

    @Override // defpackage.s2h
    public void h(String str) {
        ((zid) this.a).r(new wwb(str, 1));
    }

    @Override // defpackage.wwc
    public wwc i(boolean z) {
        vwc vwcVar = (vwc) this.a;
        return z ? new yfa(vwcVar) : new c29(vwcVar);
    }

    @Override // defpackage.yk7
    public void k(Call call, Throwable th) {
        ((hyc) this.a).completeExceptionally(th);
    }

    public lna l(ChargersProgressImageParamsDto chargersProgressImageParamsDto, String str) {
        String str2;
        String str3;
        e eVar = (e) this.a;
        if ((chargersProgressImageParamsDto != null ? chargersProgressImageParamsDto.a : null) == null) {
            return new lna(str, (chargersProgressImageParamsDto == null || (str3 = chargersProgressImageParamsDto.b) == null) ? null : Integer.valueOf(eVar.u(xng0.textMain, str3)), null, (chargersProgressImageParamsDto == null || (str2 = chargersProgressImageParamsDto.c) == null) ? null : Integer.valueOf(eVar.b(xng0.bgTransparent, str2)));
        }
        String str4 = chargersProgressImageParamsDto.a;
        String str5 = chargersProgressImageParamsDto.b;
        Integer valueOf = str5 != null ? Integer.valueOf(eVar.u(xng0.bgTransparent, str5)) : null;
        String str6 = chargersProgressImageParamsDto.c;
        return new lna(null, valueOf, str4, str6 != null ? Integer.valueOf(eVar.b(xng0.bgTransparent, str6)) : null);
    }

    public void m() {
        rue rueVar = (rue) this.a;
        rueVar.getClass();
        rueVar.a.a("CorpAntiFraudScreen.RoleFound", new HashMap(), 1, new HashMap());
    }

    public void n() {
        rue rueVar = (rue) this.a;
        rueVar.getClass();
        rueVar.a.a("CorpAntiFraudScreen.RoleNotFound", new HashMap(), 1, new HashMap());
    }

    @Override // defpackage.yk7
    public void o(Call call, Response response) {
        ((hyc) this.a).complete(response);
    }

    @Override // defpackage.m11
    public void openPickupFromPhoto() {
        ru.yandex.taxi.search.router.a aVar = (ru.yandex.taxi.search.router.a) this.a;
        ((umb0) aVar.K).b(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.CLARIFY);
        aVar.E((c) aVar.L.getValue(), new cob0(PickupFromPhotoPayload$Origin.CLARIFY, true), sy60.Q2, hxx.a);
    }

    public boolean p(String str) {
        rme rmeVar = (rme) this.a;
        String str2 = rmeVar.g().i;
        boolean z = ((str.length() == 0) || jl40.l(str, rmeVar.h) || (str2.length() == 0) || new Regex(str2).h(str)) ? false : true;
        if (z) {
            xby.d.n("Url '" + str + "' is not allowed");
        }
        return z;
    }

    @Override // defpackage.hwe
    public void q0() {
        ((z880) ((w3i) this.a).x).a();
    }

    @Override // defpackage.hwe
    public String r0() {
        return ((Context) ((w3i) this.a).b).getString(kyh0.summary_confirm);
    }

    public /* synthetic */ yfa(Object obj) {
        this.a = obj;
    }

    public yfa(j3 j3Var) {
        this.a = (t3) j3Var.readObject();
    }
}
