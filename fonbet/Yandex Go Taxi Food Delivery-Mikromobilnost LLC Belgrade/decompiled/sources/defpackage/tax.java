package defpackage;

import android.location.LocationManager;
import android.os.SystemClock;
import com.yandex.go.platform.analytics.JsAdjustEventInfoParam;
import com.yandex.go.platform.analytics.JsAdjustEventRevenue;
import com.yandex.go.platform.js_api.JsNativeApi;
import com.yandex.go.platform.js_api.JsNativeApi$saveContent$$inlined$handleActionWithCallbackResult$1;
import com.yandex.go.platform.js_api.JsNativeApi$shareContent$$inlined$handleActionWithCallbackResult$1;
import com.yandex.go.platform.js_api.JsNativeApi$shareText$$inlined$handleActionWithCallbackResult$1;
import com.yandex.go.platform.js_api.g;
import com.yandex.go.platform.js_api.h;
import com.yandex.go.platform.js_api.models.JsFile;
import com.yandex.go.platform.js_api.models.JsGooglePayCanMakePaymentResponse;
import com.yandex.go.platform.js_api.models.JsPermission;
import com.yandex.go.platform.js_api.models.JsPermissionState;
import com.yandex.go.platform.js_api.models.JsTextContent;
import com.yandex.go.platform.utils.a;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes13.dex */
public final /* synthetic */ class tax implements iyw, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tax(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.iyw
    public final void a(String str, String[] strArr) {
        boolean areNotificationsEnabled;
        JsPermissionState jsPermissionState;
        int i = this.a;
        int i2 = 0;
        JsPermission jsPermission = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((JsNativeApi) obj).e("goplatform.private.payments.googlePayCanMakePayment", str, new JsGooglePayCanMakePaymentResponse(), JsGooglePayCanMakePaymentResponse.Companion.serializer(), false);
                break;
            case 1:
                JsNativeApi jsNativeApi = (JsNativeApi) obj;
                i32 i32Var = jsNativeApi.n;
                i32Var.getClass();
                if (strArr.length != 0) {
                    JsAdjustEventInfoParam jsAdjustEventInfoParam = strArr.length > 1 ? (JsAdjustEventInfoParam) sbx.d.b(JsAdjustEventInfoParam.Companion.serializer(), strArr[1]) : new JsAdjustEventInfoParam(0);
                    oa1 oa1Var = i32Var.b;
                    String str2 = strArr[0];
                    Map map = jsAdjustEventInfoParam.a;
                    Map map2 = jsAdjustEventInfoParam.b;
                    JsAdjustEventRevenue jsAdjustEventRevenue = jsAdjustEventInfoParam.c;
                    xa1 xa1Var = jsAdjustEventRevenue != null ? new xa1(jsAdjustEventRevenue.a, jsAdjustEventRevenue.b) : null;
                    String str3 = jsAdjustEventInfoParam.d;
                    String str4 = jsAdjustEventInfoParam.e;
                    oa1Var.getClass();
                    jx4 jx4Var = new jx4(str2);
                    jx4Var.b = map;
                    jx4Var.c = map2;
                    jx4Var.e = str3;
                    jx4Var.f = str4;
                    Double d = xa1Var != null ? xa1Var.a : null;
                    String str5 = xa1Var != null ? xa1Var.b : null;
                    if (d != null && str5 != null) {
                        jx4Var.d = new ix4(d.doubleValue(), str5);
                    }
                    ((j) oa1Var.a).i().a(jx4Var);
                }
                sbx.d.getClass();
                jsNativeApi.e("goplatform.app.sendAdjustEvent", str, null, auu0.a, false);
                break;
            case 2:
                JsNativeApi jsNativeApi2 = (JsNativeApi) obj;
                i32 i32Var2 = jsNativeApi2.n;
                i32Var2.getClass();
                if (strArr.length != 0) {
                    strArr.toString();
                    Long l = i32Var2.c.a;
                    Pair pair = l != null ? new Pair("timesinceapplaunch", String.valueOf(SystemClock.elapsedRealtime() - l.longValue())) : null;
                    if (pair != null) {
                        i32Var2.b(pair, strArr);
                    }
                }
                sbx.d.getClass();
                jsNativeApi2.e("goplatform.app.sendPerformanceEvent", str, null, auu0.a, false);
                break;
            case 3:
                JsNativeApi jsNativeApi3 = (JsNativeApi) obj;
                if (strArr.length != 0) {
                    g gVar = jsNativeApi3.d;
                    String str6 = strArr[0];
                    a aVar = gVar.a;
                    JsPermission.Companion.getClass();
                    JsPermission[] values = JsPermission.values();
                    int length = values.length;
                    while (true) {
                        if (i2 < length) {
                            JsPermission jsPermission2 = values[i2];
                            if (jl40.l(jsPermission2.getJsName(), str6)) {
                                jsPermission = jsPermission2;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (jsPermission == null) {
                        ((mb20) gVar.c).a("JsPermissionsHandler", "Wrong permission name: ".concat(str6), null);
                        jsPermissionState = JsPermissionState.DENIED;
                    } else {
                        int i3 = wax.a[jsPermission.ordinal()];
                        if (i3 == 1) {
                            areNotificationsEnabled = aVar.h.b.areNotificationsEnabled();
                        } else if (i3 == 2) {
                            LocationManager locationManager = aVar.g;
                            WeakHashMap weakHashMap = androidx.core.location.j.a;
                            areNotificationsEnabled = locationManager.isLocationEnabled();
                        } else if (i3 != 3) {
                            w511.b();
                            break;
                        } else {
                            areNotificationsEnabled = aVar.a();
                        }
                        jsPermissionState = areNotificationsEnabled ? JsPermissionState.GRANTED : JsPermissionState.DENIED;
                    }
                    String stateName = jsPermissionState.getStateName();
                    sbx.d.getClass();
                    jsNativeApi3.e("goplatform.private.systemPermissions.query", str, stateName, auu0.a, false);
                    break;
                } else {
                    jsNativeApi3.f("goplatform.private.systemPermissions.query", str, "permission required");
                    break;
                }
            case 4:
                JsNativeApi jsNativeApi4 = (JsNativeApi) obj;
                String str7 = (String) j73.D(strArr);
                KSerializer serializer = JsTextContent.Companion.serializer();
                if (str7 != null) {
                    tse tseVar = jsNativeApi4.b;
                    sjh sjhVar = uyj.a;
                    tje.N(tseVar, mdh.b, null, new JsNativeApi$shareContent$$inlined$handleActionWithCallbackResult$1(jsNativeApi4, serializer, str7, "goplatform.app.shareContent", str, null, strArr, jsNativeApi4), 2);
                    break;
                } else {
                    jsNativeApi4.f("goplatform.app.shareContent", str, "Empty param");
                    break;
                }
            case 5:
                JsNativeApi jsNativeApi5 = (JsNativeApi) obj;
                String str8 = (String) j73.D(strArr);
                KSerializer serializer2 = JsFile.Companion.serializer();
                h hVar = jsNativeApi5.j;
                if (str8 != null) {
                    tse tseVar2 = jsNativeApi5.b;
                    sjh sjhVar2 = uyj.a;
                    tje.N(tseVar2, mdh.b, null, new JsNativeApi$saveContent$$inlined$handleActionWithCallbackResult$1(jsNativeApi5, serializer2, str8, "goplatform.app.saveContent", str, null, hVar), 2);
                    break;
                } else {
                    jsNativeApi5.f("goplatform.app.saveContent", str, "Empty param");
                    break;
                }
            case 6:
                JsNativeApi jsNativeApi6 = (JsNativeApi) obj;
                String str9 = (String) j73.D(strArr);
                KSerializer serializer3 = JsTextContent.Companion.serializer();
                if (str9 != null) {
                    tse tseVar3 = jsNativeApi6.b;
                    sjh sjhVar3 = uyj.a;
                    tje.N(tseVar3, mdh.b, null, new JsNativeApi$shareText$$inlined$handleActionWithCallbackResult$1(jsNativeApi6, serializer3, str9, "goplatform.app.requestShareMethod", str, null, jsNativeApi6), 2);
                    break;
                } else {
                    jsNativeApi6.f("goplatform.app.requestShareMethod", str, "Empty param");
                    break;
                }
            case 7:
                JsNativeApi jsNativeApi7 = (JsNativeApi) obj;
                jsNativeApi7.n.b(null, strArr);
                sbx.d.getClass();
                jsNativeApi7.e("goplatform.app.reportGoalReached", str, null, auu0.a, false);
                break;
            default:
                ((wls) ((ymu) obj).b).invoke(str, strArr);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 6:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 7:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof iyw) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return getFunctionDelegate().equals(((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new FunctionReferenceImpl(2, (JsNativeApi) obj, JsNativeApi.class, "canMakeGooglePayPayment", "canMakeGooglePayPayment(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 1:
                return new FunctionReferenceImpl(2, (JsNativeApi) obj, JsNativeApi.class, "reportAdjustEvent", "reportAdjustEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 2:
                return new FunctionReferenceImpl(2, (JsNativeApi) obj, JsNativeApi.class, "reportTimestampedEvent", "reportTimestampedEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 3:
                return new FunctionReferenceImpl(2, (JsNativeApi) obj, JsNativeApi.class, "checkPermission", "checkPermission(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 4:
                return new FunctionReferenceImpl(2, (JsNativeApi) obj, JsNativeApi.class, "shareContent", "shareContent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 5:
                return new FunctionReferenceImpl(2, (JsNativeApi) obj, JsNativeApi.class, "saveContent", "saveContent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 6:
                return new FunctionReferenceImpl(2, (JsNativeApi) obj, JsNativeApi.class, "shareText", "shareText(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 7:
                return new FunctionReferenceImpl(2, (JsNativeApi) obj, JsNativeApi.class, "reportEvent", "reportEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            default:
                return new FunctionReferenceImpl(2, (ymu) obj, ymu.class, "close", "close(Ljava/lang/String;[Ljava/lang/String;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
