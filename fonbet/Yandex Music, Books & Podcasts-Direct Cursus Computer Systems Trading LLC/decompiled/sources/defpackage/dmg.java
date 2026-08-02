package defpackage;

import android.app.Service;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Looper;
import androidx.compose.foundation.layout.a;
import androidx.fragment.app.t;
import androidx.media3.session.MediaSessionService;
import com.yandex.music.shared.network.retrofit.MusicBackendResponseCall$newBackendFormatErrorConverter$2$1;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.AppMetricaYandex;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.mediabrowser.MusicBrowserService;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes6.dex */
public final /* synthetic */ class dmg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dmg(whi whiVar, Type type) {
        this.a = 20;
        this.b = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 3;
        int i2 = 6;
        int i3 = 1;
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.a) {
            case 0:
                return l1b.g(((fmg) this.b).a);
            case 1:
                return (bou) ((tmg) this.b).e.getValue();
            case 2:
                lcc lccVar = new lcc(jhp.e(xz0.r((Pair[]) this.b)), true, new brg(i3));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                kcc kccVar = new kcc(lccVar);
                while (kccVar.hasNext()) {
                    Pair pair = (Pair) kccVar.next();
                    linkedHashMap.put(pair.a, new uqg(String.valueOf(pair.b)));
                }
                return linkedHashMap;
            case 3:
                hgp hgpVar = (hgp) this.b;
                return ((c9k) hgpVar.f).k().h((etg) hgpVar.c, (qyf) hgpVar.g);
            case 4:
                q0h q0hVar = (q0h) this.b;
                frt frtVar = (frt) q0hVar.f.getValue();
                Function1 function1 = q0hVar.c;
                zxc a = yrt.a((byc) frtVar.d().getValue());
                Boolean bool = (Boolean) function1.invoke(a != null ? a.a : null);
                bool.getClass();
                return ydr.a(bool);
            case 5:
                oc7 oc7Var = (oc7) this.b;
                bdt I = hag.I(o9w.class);
                qdc qdcVar = oc7Var.a;
                qdcVar.getClass();
                return Boolean.valueOf(o9w.a());
            case 6:
                ((qy4) ((t5h) this.b).k.getValue()).getClass();
                return new vy4();
            case 7:
                Object invoke = ((e6h) this.b).h.b.invoke();
                s6h s6hVar = invoke instanceof s6h ? (s6h) invoke : null;
                z5h z5hVar = s6hVar != null ? s6hVar.b : null;
                if (z5hVar != null) {
                    return z5hVar.a;
                }
                return null;
            case 8:
                nbh nbhVar = (nbh) this.b;
                if (nbhVar.s.h() <= nbhVar.t.h()) {
                    return null;
                }
                ((fbh) nbhVar.x.getValue()).getClass();
                return Float.valueOf(nbhVar.T0() + r2.h());
            case 9:
                return Float.valueOf(((Number) ((obh) this.b).b.c.b.getValue()).floatValue());
            case 10:
                Service service = (Service) this.b;
                try {
                    Field declaredField = MediaSessionService.class.getDeclaredField("mediaNotificationManager");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(service);
                    if (obj != null) {
                        Field declaredField2 = obj.getClass().getDeclaredField("startedInForeground");
                        declaredField2.setAccessible(true);
                        declaredField2.setBoolean(obj, false);
                        ssg.a(3, "Media3SessionService", "Successfully set startedInForeground to false via reflection", null);
                    }
                } catch (Exception e) {
                    ssg.a(6, "Media3SessionService", "Failed to reflectively set startedInForeground to false", e);
                }
                return Unit.a;
            case 11:
                mzb mzbVar = ((jgh) this.b).f;
                if (mzbVar != null) {
                    return mzbVar.a();
                }
                return null;
            case 12:
                return Integer.valueOf(wct.F(((wnh) this.b).a));
            case 13:
                ly4 ly4Var = ((psh) this.b).a;
                bdt I2 = hag.I(oq7.class);
                qdc qdcVar2 = ly4Var.a;
                qdcVar2.getClass();
                return ((oq7) qdcVar2.C(I2)).a;
            case 14:
                d4i d4iVar = (d4i) this.b;
                if (Intrinsics.d(Looper.getMainLooper(), Looper.myLooper())) {
                    su4.s(2, null, "In Application thread", null);
                }
                String uuid = AppMetricaYandex.getUuid(d4iVar.a);
                if (uuid == null) {
                    ssg.a(7, null, "YandexMetricaInternal.getUuid() should not return null", null);
                }
                return uuid == null ? "" : uuid;
            case 15:
                t tVar = (t) ((j6i) this.b).a.a;
                jyr jyrVar = VideoClipActivity.y;
                tVar.startActivity(l3l.e(tVar, null, 6));
                return Unit.a;
            case 16:
                return (b5p) this.b;
            case 17:
                v8i v8iVar = (v8i) this.b;
                v7i v7iVar = (v7i) v8iVar.j.getValue();
                Context requireContext = v8iVar.requireContext();
                requireContext.getClass();
                v7iVar.getClass();
                return new k7i(requireContext, null);
            case 18:
                eci eciVar = (eci) this.b;
                gos gosVar = dci.b;
                String str = eciVar.a;
                gosVar.getClass();
                str.getClass();
                dci[] values = dci.values();
                int length = values.length;
                while (i4 < length) {
                    dci dciVar = values[i4];
                    if (dciVar.a.equals(str)) {
                        return dciVar;
                    }
                    i4++;
                }
                return null;
            case 19:
                return ((vhi) this.b).b.d(new MusicBackendResponseCall$newBackendFormatErrorConverter$2$1().getType(), new Annotation[0]);
            case 20:
                Type type = (Type) this.b;
                if (!(type instanceof ParameterizedType)) {
                    xq0.x("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
                    return null;
                }
                Type H = jf0.H(0, (ParameterizedType) type);
                H.getClass();
                return H;
            case 21:
                MusicBrowserService musicBrowserService = (MusicBrowserService) this.b;
                boolean z = MusicBrowserService.n;
                Context applicationContext = musicBrowserService.getApplicationContext();
                applicationContext.getClass();
                Object systemService = applicationContext.getSystemService("uimode");
                systemService.getClass();
                return (UiModeManager) systemService;
            case 22:
                return new h0h(((kxi) ((hgp) this.b).c).a, wjb.MusicHistoryScreen);
            case 23:
                ek ekVar = (ek) this.b;
                return a.c(0.0f, (1.0f - (ekVar.a ? 1.0f : ekVar.b.a())) * mu0.i, 0.0f, 0.0f, 13);
            case 24:
                vli vliVar = (vli) this.b;
                hv0 hv0Var = new hv0(vliVar, objArr == true ? 1 : 0, 20);
                l18 l18Var = l18.b;
                bdt I3 = hag.I(nli.class);
                qdc qdcVar3 = l18Var.a;
                qdcVar3.getClass();
                nli nliVar = (nli) qdcVar3.C(I3);
                bdt I4 = hag.I(q0h.class);
                qdc qdcVar4 = l18Var.a;
                qdcVar4.getClass();
                q0h q0hVar2 = (q0h) qdcVar4.C(I4);
                bdt I5 = hag.I(no6.class);
                qdc qdcVar5 = l18Var.a;
                qdcVar5.getClass();
                no6 no6Var = (no6) qdcVar5.C(I5);
                bdt I6 = hag.I(hwl.class);
                qdc qdcVar6 = l18Var.a;
                qdcVar6.getClass();
                hwl hwlVar = (hwl) qdcVar6.C(I6);
                bdt I7 = hag.I(sy7.class);
                qdc qdcVar7 = l18Var.a;
                qdcVar7.getClass();
                sy7 sy7Var = (sy7) qdcVar7.C(I7);
                bdt I8 = hag.I(d20.class);
                qdc qdcVar8 = l18Var.a;
                qdcVar8.getClass();
                d20 d20Var = (d20) qdcVar8.C(I8);
                kxi d = vliVar.d();
                cvo cvoVar = vliVar.l;
                cvoVar.getClass();
                return new gmi(new aqd(nliVar), q0hVar2, d20Var, no6Var, hwlVar, sy7Var, new p1i(24), new d6h(i), hv0Var, d, cvoVar);
            case 25:
                rvi rviVar = ((dvi) this.b).a;
                rviVar.getClass();
                x97.y(ot0.F(rviVar), null, null, new ovi(rviVar, objArr2 == true ? 1 : 0, i4), 3);
                return Unit.a;
            case 26:
                jac jacVar = (jac) this.b;
                return ((dc7) ((cc7) jacVar.c)).c(((frt) jacVar.b).c().a, "my_shelf_fragment");
            case 27:
                return asq.K(((azi) ((yyi) ((bzi) this.b).a.getValue())).d, new coi(9));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                m0j m0jVar = (m0j) this.b;
                dwt.a(m0jVar.e, new ps(m0jVar, m0jVar.a(), i2));
                return Unit.a;
            default:
                return ((q76) ((up3) this.b).b).a();
        }
    }

    public /* synthetic */ dmg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
