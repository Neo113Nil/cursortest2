package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import com.yandex.messenger.websdk.api.UserUnreadCounters;
import com.yandex.music.shared.wave.shader.api.component.WaveGlShaderView;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.Vh;
import ru.yandex.video.m3.ott.data.dto.c;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;

/* loaded from: classes.dex */
public final /* synthetic */ class r3s implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r3s(i1u i1uVar, Vh.VhResponse vhResponse) {
        this.a = 17;
        this.b = vhResponse;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x034e, code lost:
    
        if (r11.c == (!r0.c)) goto L100;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        DrmRequestParams drmRequestParams;
        switch (this.a) {
            case 0:
                r3s r3sVar = (r3s) this.b;
                hoi hoiVar = (hoi) obj;
                hoiVar.getClass();
                r3sVar.invoke(hoiVar.b);
                break;
            case 1:
                v3s v3sVar = (v3s) this.b;
                z3s z3sVar = (z3s) obj;
                z3sVar.getClass();
                y3s y3sVar = v3sVar.a;
                y3sVar.getClass();
                if (y3sVar.n != z3sVar) {
                    y3sVar.n = z3sVar;
                    y3sVar.s.d();
                    y3sVar.o = false;
                    n3s n3sVar = y3sVar.p;
                    if (n3sVar != null) {
                        n3sVar.d();
                    }
                }
                break;
            case 2:
                mn0 mn0Var = (mn0) this.b;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.k(jfpVar, mn0Var.b);
                break;
            case 3:
                jfs jfsVar = (jfs) this.b;
                kn0 kn0Var = (kn0) obj;
                kn0Var.getClass();
                glr.a(kn0Var, new CharSequence[0]);
                kn0Var.d(" • ".concat(jfsVar.c));
                break;
            case 4:
                lls llsVar = (lls) this.b;
                rar rarVar = llsVar.l;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                llsVar.l = null;
                ValueAnimator valueAnimator = llsVar.k;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                llsVar.m = null;
                llsVar.n = 0;
                llsVar.o = 0;
                break;
            case 5:
                ((uob) this.b).close();
                break;
            case 6:
                z3t z3tVar = (z3t) this.b;
                z3t z3tVar2 = (z3t) obj;
                z3tVar2.getClass();
                if (z3tVar2.a.equals(z3tVar.a) && z3tVar2.b.equals(z3tVar.b)) {
                    z = true;
                    break;
                }
                z = false;
                break;
            case 7:
                e6t e6tVar = (e6t) this.b;
                ((Boolean) obj).booleanValue();
                e6tVar.H(new x6s(19));
                break;
            case 8:
                h5t h5tVar = (h5t) this.b;
                r4t r4tVar = (r4t) obj;
                r4tVar.getClass();
                t4t t4tVar = h5tVar.a.k;
                t4tVar.getClass();
                nmb b = t4tVar.b();
                String G = t4tVar.a.a.G();
                wjb wjbVar = wjb.TrailerScreen;
                nmb.x(b, G, wjbVar, pkb.Trailer, t4tVar.a(), wjbVar, r4tVar.b, 228);
                break;
            case 9:
                p5t p5tVar = (p5t) this.b;
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.x(jfpVar2, p5tVar.g ? 3.0f : 2.0f);
                break;
            case 10:
                zf6 zf6Var = (zf6) this.b;
                mm4 mm4Var = (mm4) obj;
                mm4Var.getClass();
                mm4.a(mm4Var, "first", zf6Var.b.getDescriptor());
                mm4.a(mm4Var, "second", ((t9f) zf6Var.c).getDescriptor());
                mm4.a(mm4Var, "third", ((t9f) zf6Var.d).getDescriptor());
                break;
            case 11:
                njt njtVar = (njt) this.b;
                ((Boolean) obj).getClass();
                jkt jktVar = njtVar.d;
                xdr xdrVar = jktVar.f;
                qjt qjtVar = new qjt(null, new djt());
                xdrVar.getClass();
                xdrVar.m(null, qjtVar);
                x97.y(jktVar.a, null, null, new hkt(jktVar, null, 3), 3);
                break;
            case 12:
                nlt nltVar = (nlt) this.b;
                klt kltVar = (klt) obj;
                kltVar.getClass();
                nltVar.getClass();
                Handler handler = kltVar.c;
                if (handler != null) {
                    handler.post(new xlr(10, kltVar, nltVar));
                }
                break;
            case 13:
                CancellationException cancellationException = (CancellationException) this.b;
                klt kltVar2 = (klt) obj;
                kltVar2.getClass();
                Handler handler2 = kltVar2.c;
                if (handler2 != null) {
                    handler2.post(new xlr(11, kltVar2, cancellationException));
                }
                kltVar2.c = null;
                break;
            case 14:
                qrr qrrVar = (qrr) this.b;
                nlt nltVar2 = (nlt) obj;
                nltVar2.getClass();
                Integer num = nltVar2.a;
                int intValue = num != null ? num.intValue() : 0;
                Integer num2 = nltVar2.c;
                qrrVar.invoke(new UserUnreadCounters(intValue, num2 != null ? num2.intValue() : 0, nltVar2.b, nltVar2.d, nltVar2.e));
                break;
            case 15:
                apo apoVar = (apo) this.b;
                fos fosVar = (fos) obj;
                fosVar.getClass();
                break;
            case 16:
                v48 v48Var = (v48) this.b;
                wof wofVar = (wof) obj;
                wofVar.getClass();
                ynn y = ltg.D(wofVar).y(wofVar, true);
                v48Var.invoke(new hqe(wofVar.j()), Float.valueOf((y.d() * (y.g() / ((int) (r2 >> 32)))) / ((int) (4294967295L & r2))));
                break;
            case 17:
                Vh.VhResponse vhResponse = (Vh.VhResponse) this.b;
                c cVar = (c) obj;
                cVar.getClass();
                DrmProxy drmProxy = cVar.d;
                String watchSessionId = (drmProxy == null || (drmRequestParams = drmProxy.getDrmRequestParams()) == null) ? null : drmRequestParams.getWatchSessionId();
                Map<String, Object> ottParams = vhResponse.getContent().getOttParams();
                ottParams.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(ottParams);
                linkedHashMap.remove("licenses");
                Object obj2 = linkedHashMap.get("fromBlock");
                String str = obj2 instanceof String ? (String) obj2 : null;
                Object obj3 = linkedHashMap.get("kpId");
                String str2 = obj3 instanceof String ? (String) obj3 : null;
                Object obj4 = linkedHashMap.get(SSDPDeviceDescriptionParser.TAG_DEVICE_TYPE);
                Ott.DeviceType deviceType = obj4 instanceof Ott.DeviceType ? (Ott.DeviceType) obj4 : null;
                if (deviceType == null) {
                    deviceType = Ott.DeviceType.App;
                }
                cVar.m = new Ott.TrackingData(linkedHashMap, false, str, watchSessionId, str2, deviceType);
                break;
            case 18:
                x2u x2uVar = (x2u) this.b;
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                x2uVar.getClass();
                bjt bjtVar = x2uVar.d;
                ((dda) bjtVar.d).invoke();
                ((m) bjtVar.b).x(u51Var);
                break;
            case 19:
                h8u h8uVar = (h8u) this.b;
                ((Boolean) obj).booleanValue();
                h8uVar.a.s.invoke();
                break;
            case 20:
                i9u i9uVar = (i9u) this.b;
                ((Throwable) obj).getClass();
                xdr xdrVar2 = i9uVar.v;
                a9u a9uVar = a9u.a;
                xdrVar2.getClass();
                xdrVar2.m(null, a9uVar);
                break;
            case 21:
                paw pawVar = (paw) this.b;
                ((oa8) obj).getClass();
                break;
            case 22:
                pbu pbuVar = (pbu) this.b;
                ((oa8) obj).getClass();
                ((obu) pbuVar).a.d();
                break;
            case 23:
                mpu mpuVar = (mpu) this.b;
                ((is6) obj).getClass();
                pzl pzlVar = (pzl) mpuVar.a.c;
                bdt I = hag.I(squ.class);
                qdc qdcVar = pzlVar.a;
                qdcVar.getClass();
                break;
            case 24:
                pzl pzlVar2 = (pzl) this.b;
                ((l13) obj).getClass();
                break;
            case 25:
                hsu hsuVar = (hsu) this.b;
                sru sruVar = (sru) obj;
                List list = sruVar.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    if (!Intrinsics.d(((hsu) obj5).getId(), hsuVar.getId())) {
                        arrayList.add(obj5);
                    }
                }
                break;
            case 26:
                asu asuVar = (asu) this.b;
                String str3 = (String) obj;
                str3.getClass();
                rmb.k(asuVar.c, str3, y7g.I(0, 0, str3), null, 4);
                asuVar.b.a(str3);
                break;
            case 27:
                jsu jsuVar = (jsu) this.b;
                ((Context) obj).getClass();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((l0v) ((ftu) this.b).B.getValue()).g = ((Boolean) obj).booleanValue();
                break;
            default:
                l0v l0vVar = (l0v) this.b;
                ((WaveGlShaderView) obj).getClass();
                l0vVar.a();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ r3s(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
