package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.p;
import androidx.compose.material3.w;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;
import com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.a;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.transport.Transport;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.internal.authorized.chat.j;
import com.yandex.messaging.internal.entities.Message;
import com.yandex.xplat.common.NetworkMethod;
import com.ybsdk.core.common.data.network.dto.SpoilerParamDto;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.analytics.q;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$EntryPointSource;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.video.m3.ott.data.net.impl.ManifestApiImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class vmz implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vmz(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 3;
        int i3 = 19;
        int i4 = 0;
        wgu0 wgu0Var = null;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj3;
                List list = (List) obj2;
                li6 li6Var = (li6) obj;
                Point point = aVar.Q;
                ah00 ah00Var = (ah00) aVar.b;
                if (point != null) {
                    li6Var.a(point);
                }
                ScreenRect screenRect = aVar.N;
                if (screenRect != null) {
                    ScreenPoint screenPoint = new ScreenPoint(screenRect.getTopLeft().getX() - aVar.L, screenRect.getTopLeft().getY() - aVar.M);
                    ScreenPoint screenPoint2 = new ScreenPoint(screenRect.getBottomRight().getX() + aVar.L, screenRect.getBottomRight().getY() + aVar.M);
                    gh00 gh00Var = (gh00) ah00Var;
                    Point d = gh00Var.e.d(screenPoint);
                    if (d != null) {
                        li6Var.a(d);
                    }
                    Point d2 = gh00Var.e.d(screenPoint2);
                    if (d2 != null) {
                        li6Var.a(d2);
                    }
                }
                li6Var.c(list);
                break;
            case 1:
                Point point2 = (Point) obj3;
                coz cozVar = ((boz) obj).a;
                cozVar.D((m950) cozVar.E.get(), new wjg(new Point(point2.getLatitude(), point2.getLongitude()), (Address) obj2, false), new aoz(cozVar, i4));
                break;
            case 2:
                kxz kxzVar = (kxz) obj3;
                List list2 = kxzVar.b;
                ((m6y) ((u6y) obj)).f(list2.size(), null, new qc0(list2, 18), new androidx.compose.runtime.internal.a(2039820996, new yc0(i2, list2, kxzVar, (tls) obj2), true));
                break;
            case 3:
                ru.yandex.taxi.maas.impl.account.a aVar2 = (ru.yandex.taxi.maas.impl.account.a) obj3;
                String str = (String) obj2;
                Result result = (Result) obj;
                Object value = result.getValue();
                if (!(value instanceof Result.Failure)) {
                    aVar2.getClass();
                    rs2 rs2Var = aVar2.E;
                    aVar2.A(aVar2.I.a(aVar2.F), new k7w0(str, true, false, null, new i7w0(gw00.e(new Pair(rs2Var.b(), Collections.singletonList(rs2Var.c())))), new h2t(aVar2), 0, false, null, 1048512), new wui(aVar2, i3));
                }
                Throwable a = Result.a(result.getValue());
                if (a != null) {
                    hst hstVar = jst.e;
                    xby.l(hstVar, "MAAS:ACCOUNT:AUTH_FAILED", null, a, "Can't open maas without auth", 2);
                    if (!aVar2.u()) {
                        xby.l(hstVar, "MAAS:ACCOUNT:CLOSE_DETACHED_ROUTER", null, null, "Maas router is detached but should not be shown", 6);
                        aVar2.i();
                        break;
                    } else {
                        aVar2.r(new qu(9));
                        break;
                    }
                }
                break;
            case 4:
                Activity activity = (Activity) obj3;
                tls tlsVar = (tls) obj2;
                Exception exc = (Exception) obj;
                int i5 = exc instanceof UnavailableUserDeclinedInstallationException ? azh0.smartcamera_ar_hint_user_declined_installation : exc instanceof UnavailableApkTooOldException ? azh0.smartcamera_ar_hint_apk_old : exc instanceof UnavailableSdkTooOldException ? azh0.smartcamera_ar_hint_sdk_old : exc instanceof UnavailableDeviceNotCompatibleException ? azh0.smartcamera_ar_hint_device_not_compatible : exc instanceof CameraNotAvailableException ? azh0.smartcamera_ar_hint_camera_not_available : azh0.smartcamera_ar_hint_failed_to_create_session;
                Log.e("ArCore", "ARCore threw an exception", exc);
                tlsVar.invoke(activity.getString(i5));
                break;
            case 5:
                ((gh00) obj3).g.d((CameraPosition) obj2, null, null);
                break;
            case 6:
                ScreenPoint screenPoint3 = (ScreenPoint) obj2;
                TaxiMapView c = ((gh00) obj3).g.c();
                if (c != null) {
                    c.setFocusPoint(screenPoint3);
                    break;
                }
                break;
            case 7:
                ((gh00) obj3).g.l((Point) obj2);
                break;
            case 8:
                h0c h0cVar = (h0c) obj;
                h0cVar.a("key", ((KSerializer) obj3).getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("value", ((KSerializer) obj2).getDescriptor(), (r3 & 8) == 0);
                break;
            case 9:
                sj00 sj00Var = (sj00) obj2;
                flm flmVar = (flm) obj;
                int i6 = rj00.a[((OpenNavigatorActionSubtype) obj3).ordinal()];
                if (i6 == 1) {
                    wgu0Var = wgu0.a;
                } else if (i6 != 2) {
                    w511.b();
                    break;
                }
                flmVar.n1(new o8g0(new b8l0(new uhu0(wgu0Var)), (PlainAddress) sj00Var.c));
                break;
            case 10:
                si3 si3Var = (si3) obj2;
                if (kotlinx.coroutines.a.p((fse) obj3)) {
                    si3Var.invoke(obj);
                    break;
                }
                break;
            case 11:
                x4c.h("Failed to parse spoilerParam.particleColor in product", new srp0[]{lrp0.g}, "particleColor=" + ((SpoilerParamDto) obj3).getParticleColor() + " product=" + ((String) obj2), 4);
                break;
            case 12:
                break;
            case 13:
                ((j24) obj3).invoke(((Transport) obj).createMasstransitLayer(((fz00) obj2).d.getValue().getMapWindow()));
                break;
            case 14:
                j010 j010Var = (j010) obj3;
                String str2 = (String) obj2;
                Object value2 = ((Result) obj).getValue();
                if (!(value2 instanceof Result.Failure)) {
                    ((pep0) j010Var.e).f(((x740) j010Var.b.get()).a(TransportRouteAnalytics$EntryPointSource.Deeplink).V(), new m840(str2), hxx.a);
                    break;
                }
                break;
            case 15:
                break;
            case 16:
                mt10 mt10Var = (mt10) obj3;
                kt10 kt10Var = (kt10) obj2;
                mt10Var.s = true;
                Drawable drawable = mt10Var.a.getDrawable();
                pzt0 pzt0Var = mt10Var.n;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                if (drawable instanceof AnimatedImageDrawable) {
                    ((AnimatedImageDrawable) drawable).start();
                } else {
                    mt10Var.d.reportEvent("tech_animated_image_not_parsed", b.i(new Pair("url", kt10Var.a), new Pair("image_size", Long.valueOf(kt10Var.e))));
                }
                mt10Var.c();
                break;
            case 17:
                j jVar = (j) obj3;
                Pair pair = (Pair) obj;
                ServerMessage serverMessage = (ServerMessage) pair.getFirst();
                Message c2 = jVar.g.c(serverMessage, (PlainMessage) pair.getSecond(), false);
                oab oabVar = jVar.c;
                z83.g(null, oabVar.c, Looper.myLooper());
                ((l020) obj2).b0(oabVar.b, c2, true);
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                ((q) obj3).k((Context) obj2);
                break;
            case 23:
                u6y.b((u6y) obj, null, new androidx.compose.runtime.internal.a(1180492076, new nfj(i3, (ak20) obj3, (tls) obj2), true), 3);
                break;
            case 24:
                hz50 hz50Var = (hz50) obj3;
                ts20 ts20Var = (ts20) obj2;
                rs20 rs20Var = (rs20) obj;
                NetworkMethod method = hz50Var.method();
                String c3 = hz50Var.c();
                wj00 a2 = hz50Var.a();
                wj00 b = hz50Var.b();
                wj00 d3 = hz50Var.d();
                d3.k("X-Service-Token", ts20Var.b);
                String str3 = ts20Var.c;
                if (str3 != null) {
                    d3.k(ManifestApiImpl.HEADER_DEVICE_ID, str3);
                }
                if (rs20Var != null) {
                    d3.k("Authorization", "OAuth " + rs20Var.a);
                    d3.k("X-Uid", rs20Var.b);
                }
                break;
            case 25:
                androidx.compose.animation.core.a aVar3 = (androidx.compose.animation.core.a) obj2;
                m2k0 m2k0Var = (m2k0) obj;
                float floatValue = ((w) obj3).e.j.getFloatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (m2k0Var.J & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                if (!Float.isNaN(floatValue) && !Float.isNaN(intBitsToFloat) && intBitsToFloat != 0.0f) {
                    float floatValue2 = ((Number) aVar3.e()).floatValue();
                    m2k0Var.u(p.d(m2k0Var, floatValue2));
                    m2k0Var.v(p.e(m2k0Var, floatValue2));
                    m2k0Var.B(jl40.b(0.5f, (floatValue + intBitsToFloat) / intBitsToFloat));
                    break;
                }
                break;
            case 26:
                ((a050) obj3).a.setValue(new ako((p651) obj2, (p651) obj));
                break;
            case 27:
                sls slsVar = (sls) obj2;
                if (((w) obj3).e.g.getValue() == SheetValue.Hidden) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 28:
                c230 c230Var = (c230) obj3;
                ModalView modalView = (ModalView) obj2;
                t1w t1wVar = (t1w) obj;
                View view = (View) c230Var.c.invoke();
                if (view == null) {
                    view = modalView.contentViewInternal();
                }
                modalView.setPadding(modalView.getPaddingLeft(), t1wVar.b, modalView.getPaddingRight(), modalView.getPaddingBottom());
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (c230Var.a || !t1wVar.f) ? ((Number) c230Var.d.getValue()).intValue() + t1wVar.g : view.getPaddingBottom());
                break;
            default:
                ModalView modalView2 = (ModalView) obj3;
                t1w t1wVar2 = (t1w) obj;
                modalView2.setPadding(modalView2.getPaddingLeft(), t1wVar2.b, modalView2.getPaddingRight(), (((v130) obj2).a || !t1wVar2.f) ? t1wVar2.g : modalView2.getPaddingBottom());
                break;
        }
        return zy11Var;
    }
}
