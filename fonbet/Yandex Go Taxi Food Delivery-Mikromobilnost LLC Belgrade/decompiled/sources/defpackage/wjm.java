package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.core.ImageCaptureException;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.core.bdui.api.state.BduiStateTag;
import com.yandex.go.due.data.api.dto.DayLowPriceInfo;
import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.dynamic.impl.DynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2;
import com.yandex.go.platform.web_view_client.GoWebViewClient;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.ui.selector.model.WideTariffAppearanceExperiment;
import com.yandex.go.zone.dto.objects.SummaryStyle;
import com.yandex.go.zone.dto.objects.SurgeIconStyle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.messaging.internal.view.input.UnderKeyboardLinearLayout;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteScreenParams;
import java.io.File;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.linked_order.map.b;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$CloseReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$TransportTypeV2;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.plus.badge.CashbackHorizontalView;
import ru.yandex.taxi.router.f;
import ru.yandex.taxi.router.g;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class wjm implements wni, iy60, rt41, u8v {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;

    public wjm(ViewGroup viewGroup) {
        this.a = 16;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(vrh0.optimised_high_tariff_card_item_holder, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) inflate;
        int i = vfh0.optimised_info_icons_container;
        View O = cma1.O(i, inflate);
        if (O != null) {
            int i2 = vfh0.branding_icon_stub;
            ViewStub viewStub = (ViewStub) cma1.O(i2, O);
            if (viewStub != null) {
                i2 = vfh0.coupon_icon_stub;
                ViewStub viewStub2 = (ViewStub) cma1.O(i2, O);
                if (viewStub2 != null) {
                    i2 = vfh0.text_plus_cash_back;
                    CashbackHorizontalView cashbackHorizontalView = (CashbackHorizontalView) cma1.O(i2, O);
                    if (cashbackHorizontalView != null) {
                        m2y m2yVar = new m2y((FrameLayout) O, viewStub, viewStub2, cashbackHorizontalView, 3);
                        i = vfh0.optimised_tariff_card_class_and_price_container;
                        View O2 = cma1.O(i, inflate);
                        if (O2 != null) {
                            int i3 = vfh0.additional_price_icon_stub;
                            ViewStub viewStub3 = (ViewStub) cma1.O(i3, O2);
                            if (viewStub3 != null) {
                                i3 = vfh0.surge_icon_stub;
                                ViewStub viewStub4 = (ViewStub) cma1.O(i3, O2);
                                if (viewStub4 != null) {
                                    i3 = vfh0.tariff_cost;
                                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, O2);
                                    if (robotoTextView != null) {
                                        i3 = vfh0.tariff_original_cost_stub;
                                        ViewStub viewStub5 = (ViewStub) cma1.O(i3, O2);
                                        if (viewStub5 != null) {
                                            i3 = vfh0.tariff_title;
                                            ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) cma1.O(i3, O2);
                                            if (shimmeringRobotoTextView != null) {
                                                i3 = vfh0.time_text_stub;
                                                ViewStub viewStub6 = (ViewStub) cma1.O(i3, O2);
                                                if (viewStub6 != null) {
                                                    qzm qzmVar = new qzm((ConstraintLayout) O2, viewStub3, viewStub4, robotoTextView, viewStub5, shimmeringRobotoTextView, viewStub6, 3);
                                                    i = vfh0.tariff_card_eta;
                                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                                    if (robotoTextView2 != null) {
                                                        i = vfh0.tariff_class_icon;
                                                        ImageView imageView = (ImageView) cma1.O(i, inflate);
                                                        if (imageView != null) {
                                                            i = vfh0.tariff_class_icon_container;
                                                            FrameLayout frameLayout2 = (FrameLayout) cma1.O(i, inflate);
                                                            if (frameLayout2 != null) {
                                                                i = vfh0.touch_area;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
                                                                if (constraintLayout != null) {
                                                                    this.b = new qzm(frameLayout, m2yVar, qzmVar, robotoTextView2, imageView, frameLayout2, constraintLayout);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i3)));
                            throw null;
                        }
                    }
                }
            }
            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
            throw null;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public static sa90 c(Calendar calendar) {
        wf7 wf7Var = wf7.a;
        Calendar c = wf7.c(calendar, calendar.getTimeZone());
        c.set(13, 0);
        c.set(14, 0);
        Calendar c2 = wf7.c(c, c.getTimeZone());
        c2.set(11, 23);
        c2.set(12, 59);
        return new sa90(c, c2);
    }

    public static String p(List list, Calendar calendar) {
        DayLowPriceInfo dayLowPriceInfo;
        Object obj;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Calendar calendar2 = ((DayLowPriceInfo) obj).a;
                if (calendar2 == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                calendar2.setTimeZone(calendar.getTimeZone());
                if (wf7.e(calendar2, calendar)) {
                    break;
                }
            }
            dayLowPriceInfo = (DayLowPriceInfo) obj;
        } else {
            dayLowPriceInfo = null;
        }
        String str = dayLowPriceInfo != null ? dayLowPriceInfo.b : null;
        return str == null ? "" : str;
    }

    public void A(boolean z, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        r0 r0Var = (r0) this.x;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        j4y0.a((j4y0) this.b, new g(new f(((d6i) this.c).a.a(), this, z, runnable, runnable2, runnable3), this), null, 2);
    }

    public tou a() {
        Integer num = (Integer) this.b;
        if (num == null) {
            kbs.v("key size is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            kbs.v("tag size is not set");
            return null;
        }
        if (((ag1) this.w) == null) {
            kbs.v("hash type is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.b));
        }
        Integer num2 = (Integer) this.c;
        int intValue = num2.intValue();
        ag1 ag1Var = (ag1) this.w;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (ag1Var == ag1.m) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (ag1Var == ag1.n) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (ag1Var == ag1.o) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (ag1Var == ag1.p) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (ag1Var != ag1.q) {
                kbs.v("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new tou(((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (bg1) this.x, (ag1) this.w);
    }

    public Serializable b(Map map) {
        try {
            MapBuilder mapBuilder = new MapBuilder();
            map.forEach(new th5(3, new mjf(25, this, mapBuilder)));
            return mapBuilder.j();
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public void d() {
        UnderKeyboardLinearLayout underKeyboardLinearLayout = (UnderKeyboardLinearLayout) this.w;
        if (underKeyboardLinearLayout == null) {
            return;
        }
        if (underKeyboardLinearLayout != null) {
            underKeyboardLinearLayout.hide();
        }
        UnderKeyboardLinearLayout underKeyboardLinearLayout2 = (UnderKeyboardLinearLayout) this.w;
        if (underKeyboardLinearLayout2 != null) {
            underKeyboardLinearLayout2.requestLayout();
        }
    }

    public boolean e(zzs zzsVar) {
        zzs zzsVar2 = (zzs) this.b;
        zzs zzsVar3 = (zzs) this.c;
        Polyline polyline = a.b;
        if (zzsVar == null || !a.v(zzsVar3.a, zzsVar.a, zzsVar2.a)) {
            return false;
        }
        if (a.v(zzsVar2.b, zzsVar.b, zzsVar3.b)) {
            return true;
        }
        if (a.v(zzsVar3.b, 0.0d, zzsVar2.b)) {
            return a.v(zzsVar2.b, zzsVar.b, 180.0d) || a.v(-180.0d, zzsVar.b, zzsVar3.b);
        }
        return false;
    }

    public boolean f(Point point) {
        Polyline polyline = a.b;
        Point point2 = (Point) this.w;
        Point point3 = (Point) this.x;
        if (point == null || point2 == null || point3 == null || !a.v(point3.getLatitude(), point.getLatitude(), point2.getLatitude())) {
            return false;
        }
        if (a.v(point2.getLongitude(), point.getLongitude(), point3.getLongitude())) {
            return true;
        }
        if (a.v(point3.getLongitude(), 0.0d, point2.getLongitude())) {
            return a.v(point2.getLongitude(), point.getLongitude(), 180.0d) || a.v(-180.0d, point.getLongitude(), point3.getLongitude());
        }
        return false;
    }

    public b g() {
        eoy eoyVar = (eoy) ((h3y) this.b).get();
        lly llyVar = (lly) this.x;
        ru.yandex.taxi.linked_order.map.utils.a aVar = (ru.yandex.taxi.linked_order.map.utils.a) this.w;
        ul00 ul00Var = (ul00) this.c;
        eoyVar.getClass();
        llyVar.getClass();
        aVar.getClass();
        ul00Var.getClass();
        return new boj0(eoyVar, llyVar, aVar, ul00Var).o();
    }

    public Object h(kis0 kis0Var) {
        try {
            if (kis0Var.equals(pum.a)) {
                return null;
            }
            if (kis0Var instanceof rum) {
                return bia1.i(((rum) kis0Var).a);
            }
            if (kis0Var instanceof p131) {
                return ((mum) this.x).d((p131) kis0Var);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public zzs i() {
        return (zzs) this.c;
    }

    @Override // defpackage.u8v
    public void j(ImageCaptureException imageCaptureException) {
        v3x0 v3x0Var = (v3x0) this.w;
        n52 n52Var = (n52) this.x;
        int a = imageCaptureException.a();
        n52Var.getClass();
        v3x0Var.b.a.O(new l52(2, v3x0Var, a != 1 ? a != 2 ? a != 3 ? a != 4 ? "An unknown error has occurred while attempting to take a picture. Check the logs for more details." : "The ImageCapture use case was bound to an invalid camera by the Flutter camera plugin. If you see this error, please file an issue if you cannot find one that already exists: https://github.com/flutter/flutter/issues/." : "Image capture failed due to the camera being closed." : "The camera framework failed to fulfill the image capture request." : "An error occurred while attempting to save the captured image to a file."));
        czj0.a((wrb0) this.c, imageCaptureException);
    }

    @Override // defpackage.u8v
    public void k(reu reuVar) {
        czj0.b(((File) this.b).getAbsolutePath(), (wrb0) this.c);
    }

    @Override // defpackage.rt41
    public void l() {
        ((SslErrorHandler) this.b).proceed();
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        switch (this.a) {
            case 2:
                ComposeView composeView = new ComposeView((Context) this.b, null, 0, 6, null);
                composeView.setContent(new androidx.compose.runtime.internal.a(-1125281338, new bxm(this, 0), true));
                return composeView;
            default:
                ComposeView composeView2 = new ComposeView((Context) this.b, null, 0, 6, null);
                composeView2.setContent(new androidx.compose.runtime.internal.a(-611972568, new vj20(this, (uj20) vniVar, (wj20) uniVar, 2), true));
                return composeView2;
        }
    }

    public n15 n() {
        tq01 b = ((zq01) ((n4u0) this.b).getValue()).b();
        if ((b instanceof sq01) || b == null) {
            return (f3b0) this.c;
        }
        if (b instanceof qq01) {
            return (uay) this.w;
        }
        if (b instanceof oq01) {
            return (o8u) this.x;
        }
        w511.b();
        return null;
    }

    public int o() {
        h920 h920Var = (h920) this.b;
        int a = h920Var.a(4);
        if (a != 0) {
            return h920Var.b.getInt(a + h920Var.a);
        }
        return 0;
    }

    @Override // defpackage.rt41
    public void onCanceled() {
        ((GoWebViewClient) this.c).handleSslErrorNormally((WebView) this.w, (SslErrorHandler) this.b, (SslError) this.x);
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        ((DynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2) this.b).invoke(zy11.a);
        g7n g7nVar = ((com.yandex.go.dynamic.impl.b) this.c).c;
        String id = ((DynamicFeature) this.w).getId();
        g7nVar.a.d(id);
        xby.l(jst.e, "DynamicFeature.Download.Error", null, exc, id, 2);
        pz40 pz40Var = (pz40) this.x;
        y7n y7nVar = new y7n(exc);
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, y7nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String q() {
        String str;
        o dVar;
        FormattedText.d dVar2;
        String str2;
        String str3;
        String str4;
        o[] oVarArr;
        String sb;
        String str5;
        SurgeIconStyle surgeIconStyle;
        wlq0 wlq0Var;
        FormattedText formattedText;
        c cVar = (c) this.x;
        pex0 m = ((k) ((wiq0) this.w)).m();
        if (m == null) {
            return null;
        }
        qze0 qze0Var = m.m;
        if (qze0Var == null || (wlq0Var = qze0Var.l) == null || (formattedText = wlq0Var.b.a) == null) {
            str = null;
        } else {
            kgx[] kgxVarArr = c.g;
            Map f = kotlin.collections.b.f();
            cVar.getClass();
            StringBuilder sb2 = new StringBuilder();
            c.b(sb2, formattedText.a, f);
            str = sb2.toString();
        }
        if (str != null) {
            return str;
        }
        if (qze0Var == null) {
            sb = null;
        } else {
            bg4 bg4Var = (bg4) this.c;
            SummaryUiDelegate$TariffCardStyle c = ((mqv0) this.b).c();
            bg4Var.getClass();
            String str6 = qze0Var != null ? qze0Var.j : null;
            wu1 wu1Var = m.O;
            if (str6 != null) {
                dVar = new FormattedText.e(str6, 14);
            } else if ((wu1Var instanceof uy1) || (wu1Var instanceof pl2) || (wu1Var instanceof ojc) || (wu1Var instanceof qnx0)) {
                dVar = new FormattedText.d("alternative_green_prices_discount", null, null, 0, 62);
            } else {
                if (!(wu1Var instanceof ur40) && !(wu1Var instanceof u0h) && !(wu1Var instanceof py1) && !(wu1Var instanceof zo40) && !(wu1Var instanceof yu1) && !(wu1Var instanceof gid0) && !(wu1Var instanceof jjj0) && !(wu1Var instanceof p8f) && !(wu1Var instanceof yx00) && !(wu1Var instanceof vmd0) && !(wu1Var instanceof j2d0) && wu1Var != null) {
                    w511.b();
                    return null;
                }
                dVar = null;
            }
            ynm0 ynm0Var = bg4Var.c;
            if (ynm0Var.c(((k) ynm0Var.a).m()) || (wu1Var instanceof ojc) || !m.e0.a()) {
                dVar2 = null;
            } else {
                SummaryStyle summaryStyle = m.v0;
                if (summaryStyle == null || (surgeIconStyle = summaryStyle.a) == null || (str5 = surgeIconStyle.b) == null) {
                    str5 = "#FA3E2C";
                }
                dVar2 = new FormattedText.d("price_small_surge_icon", FormattedText.VerticalAlignment.CENTER, str5, 0, 56);
            }
            if (c == SummaryUiDelegate$TariffCardStyle.WIDE) {
                WideTariffAppearanceExperiment wideTariffAppearanceExperiment = (WideTariffAppearanceExperiment) ((jbh) bg4Var.b).c(WideTariffAppearanceExperiment.f).b();
                if (wideTariffAppearanceExperiment.b && wideTariffAppearanceExperiment.d) {
                    str2 = "#57595C";
                    String str7 = str2;
                    String str8 = qze0Var.a;
                    str3 = qze0Var.d;
                    FormattedText.h hVar = new FormattedText.h(str8, null, FormattedText.FontWeight.REGULAR, null, null, str7, 1978);
                    String str9 = qze0Var.g;
                    FormattedText.h hVar2 = new FormattedText.h(str9.length() != 0 ? str8 : str9, null, FormattedText.FontWeight.MEDIUM, null, null, "textMain", 1978);
                    int i = 11;
                    str4 = ag4.a[c.ordinal()] != 1 ? qze0Var.e : str3;
                    if (str4 != null || str4.length() == 0) {
                        oVarArr = new o[0];
                    } else {
                        FormattedText.FontStyle fontStyle = null;
                        FormattedText.FontWeight fontWeight = null;
                        oVarArr = new o[]{new FormattedText.h(" ", fontStyle, fontWeight, i, null, null, 2038), new FormattedText.h(str4, fontStyle, fontWeight, i, Collections.singletonList(new FormattedText.f(null, 3)), "textMinor", 1942)};
                    }
                    if (dVar2 == null) {
                        ((avj0) bg4Var.a).h(kyh0.tariff_card_surge_note);
                    }
                    if (str3 != null) {
                        str3.length();
                    }
                    new FormattedText(j73.A(new o[]{dVar, hVar})).d();
                    c2r0 c2r0Var = new c2r0(4, 1);
                    c2r0Var.a(dVar);
                    c2r0Var.a(dVar2);
                    c2r0Var.a(hVar2);
                    c2r0Var.b(oVarArr);
                    ArrayList arrayList = c2r0Var.b;
                    FormattedText formattedText2 = new FormattedText(j73.A(arrayList.toArray(new o[arrayList.size()])));
                    formattedText2.d();
                    kgx[] kgxVarArr2 = c.g;
                    Map f2 = kotlin.collections.b.f();
                    cVar.getClass();
                    StringBuilder sb3 = new StringBuilder();
                    c.b(sb3, formattedText2.a, f2);
                    sb = sb3.toString();
                }
            }
            str2 = "textMain";
            String str72 = str2;
            String str82 = qze0Var.a;
            str3 = qze0Var.d;
            FormattedText.h hVar3 = new FormattedText.h(str82, null, FormattedText.FontWeight.REGULAR, null, null, str72, 1978);
            String str92 = qze0Var.g;
            FormattedText.h hVar22 = new FormattedText.h(str92.length() != 0 ? str82 : str92, null, FormattedText.FontWeight.MEDIUM, null, null, "textMain", 1978);
            int i2 = 11;
            if (ag4.a[c.ordinal()] != 1) {
            }
            if (str4 != null) {
            }
            oVarArr = new o[0];
            if (dVar2 == null) {
            }
            if (str3 != null) {
            }
            new FormattedText(j73.A(new o[]{dVar, hVar3})).d();
            c2r0 c2r0Var2 = new c2r0(4, 1);
            c2r0Var2.a(dVar);
            c2r0Var2.a(dVar2);
            c2r0Var2.a(hVar22);
            c2r0Var2.b(oVarArr);
            ArrayList arrayList2 = c2r0Var2.b;
            FormattedText formattedText22 = new FormattedText(j73.A(arrayList2.toArray(new o[arrayList2.size()])));
            formattedText22.d();
            kgx[] kgxVarArr22 = c.g;
            Map f22 = kotlin.collections.b.f();
            cVar.getClass();
            StringBuilder sb32 = new StringBuilder();
            c.b(sb32, formattedText22.a, f22);
            sb = sb32.toString();
        }
        if (sb != null) {
            return sb;
        }
        String str10 = qze0Var != null ? qze0Var.g : null;
        if (str10 == null) {
            str10 = m.e();
        }
        String str11 = qze0Var != null ? qze0Var.d : null;
        StringBuilder sb4 = new StringBuilder();
        if (str10 != null) {
            sb4.append(evu0.k0(str10).toString());
        }
        sb4.append(" ");
        if (str11 != null && !evu0.J(str11)) {
            sb4.append("~~" + evu0.k0(str11).toString() + "~~");
        }
        return sb4.toString();
    }

    public zzs r() {
        return (zzs) this.b;
    }

    public Object s(Map map, Map map2) {
        sh5 stateManager;
        try {
            fq90 fq90Var = new fq90();
            map2.forEach(new th5(2, new j9a(29, this, map, fq90Var)));
            FlexAdapter flexAdapter = (FlexAdapter) this.w;
            zy11 zy11Var = zy11.a;
            if (flexAdapter != null && (stateManager = flexAdapter.getStateManager()) != null) {
                LinkedHashMap linkedHashMap = fq90Var.a;
                if (linkedHashMap == null) {
                    linkedHashMap = null;
                }
                if (linkedHashMap != null) {
                    stateManager.update(linkedHashMap, Collections.singletonList(BduiStateTag.SEND_TO_BACKEND));
                }
            }
            return zy11Var;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public void t(MultiTransportChooseStationCardAnalytics$CloseReasonV2 multiTransportChooseStationCardAnalytics$CloseReasonV2) {
        bo40 bo40Var = (bo40) ((r1s) this.b).c;
        ru.yandex.taxi.maas.impl.ride.metropick.a aVar = (ru.yandex.taxi.maas.impl.ride.metropick.a) this.x;
        MultiTransportChooseStationCardAnalytics$OpenReasonV2 j = ((n100) aVar.Dg()).j();
        MultiTransportChooseStationCardAnalytics$TransportTypeV2 multiTransportChooseStationCardAnalytics$TransportTypeV2 = (MultiTransportChooseStationCardAnalytics$TransportTypeV2) this.w;
        List list = aVar.J.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(khb1.f((j7u0) it.next()));
        }
        j7u0 j7u0Var = (j7u0) this.c;
        ao40 ao40Var = j7u0Var != null ? new ao40(j7u0Var.c, j7u0Var.b) : null;
        bo40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", j.getEventValue());
        hashMap.put("type", multiTransportChooseStationCardAnalytics$TransportTypeV2.getEventValue());
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ao40) it2.next()).c);
        }
        hashMap.put("available_stations", arrayList2);
        if (ao40Var != null) {
            hashMap.put("selected_station", ao40Var.c);
        }
        hashMap.put("close_reason", multiTransportChooseStationCardAnalytics$CloseReasonV2.getEventValue());
        bo40Var.a.a("MultiTransportChooseStationCard.Closed", hashMap, 2, new HashMap());
    }

    public void u(vl00 vl00Var) {
        if (((pey) this.w).getLifecycle().b() == Lifecycle.State.DESTROYED) {
            jst.e.r("Why you try to register MapApi on destroyed lifecycleOwner?", new IllegalStateException());
        } else {
            ((sey) this.x).b(new g700(5, this, vl00Var));
        }
    }

    public g18 v(wl00 wl00Var) {
        if (((pey) this.w).getLifecycle().b() != Lifecycle.State.DESTROYED) {
            return ((sey) this.x).b(new g700(6, this, wl00Var));
        }
        jst.e.r("Why you try to register MapApi on destroyed lifecycleOwner?", new IllegalStateException());
        return g18.u1;
    }

    public void w(ag1 ag1Var) {
        this.w = ag1Var;
    }

    public void x(int i) {
        this.b = Integer.valueOf(i);
    }

    public void y(int i) {
        this.c = Integer.valueOf(i);
    }

    public void z(bg1 bg1Var) {
        this.x = bg1Var;
    }

    public wjm(zzs zzsVar, zzs zzsVar2) {
        this.a = 12;
        this.b = zzsVar;
        this.c = zzsVar2;
        Polyline polyline = a.b;
        this.w = new Point(zzsVar.a, zzsVar.b);
        this.x = new Point(zzsVar2.a, zzsVar2.b);
    }

    public wjm(SharedPreferences sharedPreferences) {
        this.a = 21;
        this.b = sharedPreferences;
    }

    public wjm(pz40 pz40Var, eg01 eg01Var, TransferRequisiteScreenParams transferRequisiteScreenParams, g3b0 g3b0Var, vay vayVar, p8u p8uVar) {
        this.a = 9;
        this.b = pz40Var;
        this.c = new f3b0(pz40Var, eg01Var, transferRequisiteScreenParams, (crj0) g3b0Var.a.a.get());
        this.w = new uay(pz40Var, eg01Var, transferRequisiteScreenParams, (crj0) vayVar.a.a.get());
        this.x = new o8u(pz40Var, eg01Var, transferRequisiteScreenParams, (crj0) p8uVar.a.a.get());
    }

    public wjm(Looper looper, k020 k020Var, at2 at2Var, ogu oguVar) {
        this.a = 15;
        this.b = looper;
        this.c = k020Var;
        this.w = at2Var;
        this.x = oguVar;
        z83.g(null, looper, Looper.myLooper());
    }

    public wjm(j4y0 j4y0Var, d6i d6iVar, zuj0 zuj0Var) {
        this.a = 23;
        this.b = j4y0Var;
        this.c = d6iVar;
        this.w = zuj0Var;
        this.x = bvf0.c(Boolean.FALSE);
    }

    public wjm(Context context, Looper looper, w3i w3iVar) {
        this.a = 7;
        this.b = context;
        this.c = w3iVar;
        this.w = new Handler();
        this.x = new Handler(looper);
    }

    public wjm(ru.yandex.taxi.maas.impl.ride.metropick.a aVar) {
        this.a = 24;
        this.x = aVar;
        this.b = aVar.A;
        this.w = MultiTransportChooseStationCardAnalytics$TransportTypeV2.ToStation;
    }

    public wjm(sl3 sl3Var, tum tumVar, FlexAdapter flexAdapter) {
        this.a = 1;
        this.b = sl3Var;
        this.c = tumVar;
        this.w = flexAdapter;
        this.x = new mum(this);
    }

    public wjm(Context context) {
        this.a = 19;
        this.c = new ConcurrentHashMap(64);
        this.w = new AtomicBoolean(false);
        this.b = context.getSharedPreferences("alicekit_images_banhammer_preferences", 0);
    }

    public /* synthetic */ wjm(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    public wjm(Typeface typeface, h920 h920Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.a = 27;
        this.x = typeface;
        this.b = h920Var;
        this.w = new m920(1024);
        int a = h920Var.a(6);
        if (a != 0) {
            int i5 = a + h920Var.a;
            i = h920Var.b.getInt(h920Var.b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.c = new char[i * 2];
        int a2 = h920Var.a(6);
        if (a2 != 0) {
            int i6 = a2 + h920Var.a;
            i2 = h920Var.b.getInt(h920Var.b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            jp11 jp11Var = new jp11(this, i7);
            Character.toChars(jp11Var.c(), (char[]) this.c, i7 * 2);
            g920 d = jp11Var.d();
            int a3 = d.a(16);
            if (a3 != 0) {
                int i8 = a3 + d.a;
                i3 = d.b.getInt(d.b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            d6z.m("invalid metadata codepoint length", i3 > 0);
            m920 m920Var = (m920) this.w;
            g920 d2 = jp11Var.d();
            int a4 = d2.a(16);
            if (a4 != 0) {
                int i9 = a4 + d2.a;
                i4 = d2.b.getInt(d2.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            m920Var.a(jp11Var, 0, i4 - 1);
        }
    }

    public wjm() {
        this.a = 17;
        this.b = null;
        this.c = null;
        this.w = null;
        this.x = bg1.G;
    }

    public wjm(n52 n52Var, File file, wrb0 wrb0Var, v3x0 v3x0Var) {
        this.a = 18;
        this.x = n52Var;
        this.b = file;
        this.c = wrb0Var;
        this.w = v3x0Var;
    }
}
