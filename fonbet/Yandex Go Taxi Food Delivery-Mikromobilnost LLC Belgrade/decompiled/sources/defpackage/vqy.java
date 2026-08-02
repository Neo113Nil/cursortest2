package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.foundation.gestures.q;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.semantics.f;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.taxi.order.details.v2.analytics.g;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_reasons.RideCardRatingReasonsSelectorView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.h;
import com.yandex.go.top_modal.api.priority.PopupPriorityLauncher$PopupType;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.messaging.core.net.entities.proto.message.AiBotAction;
import com.yandex.messaging.core.net.entities.proto.message.AiBotActionIcon;
import com.yandex.messaging.core.net.entities.proto.message.AiBotDirective;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.passport.api.x;
import com.yandex.passport.internal.properties.AuthorizationUrlProperties;
import com.yandex.plus.home.feature.panel.internal.sections.PlusPanelDailySectionView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.PlusPanelDailyView;
import com.yandex.plus.home.repository.api.model.panel.DailyShortcut;
import com.yandex.plus.home.repository.api.model.panel.Section;
import com.yandex.plus.home.repository.api.model.panel.ShortcutAction;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.common.c;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.NetworkServiceError;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.pfm.internal.ui.widgets.PFMCalendarView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmCategoriesView;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsShelfView;
import com.ybsdk.widgets.common.ColorFilterConstraintLayout;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.lbh0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.am.internal.e;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.o;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$EntryPointSource;
import ru.yandex.taxi.masstransit.d;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;

/* loaded from: classes3.dex */
public final /* synthetic */ class vqy implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ vqy(PlusPanelDailySectionView plusPanelDailySectionView, cb90 cb90Var, Section section, DailyShortcut dailyShortcut, PlusPanelDailyView plusPanelDailyView) {
        this.a = 17;
        this.b = plusPanelDailySectionView;
        this.c = section;
        this.w = dailyShortcut;
        this.x = plusPanelDailyView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x031b  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, hbv] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        tyj0 i;
        NetworkServiceError h;
        l59 categoriesAdapter$lambda$4;
        zy11 extractView$lambda$5;
        Object[] objArr;
        boolean z;
        rr51 rr51Var;
        xvz0 xvz0Var;
        RenderEffect renderEffect;
        RenderEffect createBlendModeEffect;
        RenderEffect createBlendModeEffect2;
        RenderEffect createBlendModeEffect3;
        int i2 = this.a;
        int i3 = 3;
        char c = 1;
        char c2 = 1;
        int i4 = 0;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        Object obj3 = this.x;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i2) {
            case 0:
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) obj5;
                n70 n70Var = (n70) obj4;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                tja1.b(shimmerFrameLayout);
                exa1.e(shimmerFrameLayout, new vsn(24, n70Var, (but0) obj3));
                zo31 zo31Var = n70Var.N;
                Context context = n70Var.P;
                xty0.d(((a361) zo31Var).e, ((bry) n70Var.Z()).b);
                a361 a361Var = (a361) n70Var.N;
                xty0.d(a361Var.d, ((bry) n70Var.Z()).c);
                a361Var.d.setVisibility(((bry) n70Var.Z()).c != null ? 0 : 8);
                hbv hbvVar = (hbv) ref$ObjectRef.element;
                if (hbvVar != null) {
                    hbvVar.dispose();
                }
                ref$ObjectRef.element = v4b1.k(((bry) n70Var.Z()).d.g(context, context.getResources().getDimensionPixelSize(vvg0.ybsdk_clickable_icon_size), context.getResources().getDimensionPixelSize(vvg0.ybsdk_clickable_icon_size)), a361Var.c, null, null, 6);
                ImageView imageView = a361Var.b;
                Integer num = ((bry) n70Var.Z()).e;
                imageView.setImageDrawable(num != null ? vng.t(num.intValue(), a361Var.a.getContext()) : null);
                b.y(shimmerFrameLayout, ((bry) n70Var.Z()).f);
                if (((bry) n70Var.Z()).h) {
                    shimmerFrameLayout.startShimmer();
                } else {
                    shimmerFrameLayout.stopShimmer();
                }
                return zy11Var;
            case 1:
                o oVar = (o) obj5;
                oVar.d = ((DrivingRouter) obj).requestRoutes((List) obj4, (DrivingOptions) obj2, (VehicleOptions) obj3, new ev00(oVar));
                return zy11Var;
            case 2:
                o oVar2 = (o) obj5;
                oVar2.d = ((DrivingRouter) obj).matchRoute((Polyline) obj4, (DrivingOptions) obj2, (VehicleOptions) obj3, new dv00(oVar2));
                return zy11Var;
            case 3:
                o oVar3 = (o) obj5;
                oVar3.d = ((DrivingRouter) obj).resolveUri((String) obj4, (DrivingOptions) obj2, (VehicleOptions) obj3, new fv00(oVar3));
                return zy11Var;
            case 4:
                d dVar = (d) obj5;
                String str = (String) obj4;
                yq30 yq30Var = (yq30) obj2;
                e310 e310Var = (e310) obj3;
                Object value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    dVar.D(dVar.b0.a(TransportRouteAnalytics$EntryPointSource.Deeplink).V(), new m840(str), new gpa(4, yq30Var, dVar, e310Var));
                }
                return zy11Var;
            case 5:
                AiBotAction aiBotAction = (AiBotAction) obj4;
                AiBotDirective aiBotDirective = (AiBotDirective) obj2;
                PlainMessage plainMessage = (PlainMessage) obj3;
                sm1 sm1Var = ((ks10) obj5).c;
                String payloadId = plainMessage.getPayloadId();
                String chatId = plainMessage.getChatId();
                x22 x22Var = sm1Var.a;
                Pair pair = new Pair("action_title", aiBotAction.getTitle());
                AiBotActionIcon icon = aiBotAction.getIcon();
                x22Var.reportEvent("ai_bot_action_directive_parse_error", kotlin.collections.b.i(pair, new Pair("action_icon", icon.getType() + "-" + icon.getValue()), new Pair("action_elementId", aiBotAction.getButtonId()), new Pair("message_id", payloadId), new Pair("chat_id", chatId), new Pair("wrong_directive_type", aiBotDirective.getType()), new Pair("wrong_directive_name", aiBotDirective.getName()), new Pair("wrong_directive_payload", aiBotDirective.getPayload()), new Pair("error_message", ((Throwable) obj).getMessage())));
                return zy11Var;
            case 6:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj5;
                q qVar = (q) obj4;
                clp0 clp0Var = (clp0) obj2;
                u50 u50Var = (u50) obj3;
                xi2 xi2Var = (xi2) obj;
                float floatValue = ((Number) xi2Var.e.getValue()).floatValue() - ref$FloatRef.element;
                if (!iob1.a(floatValue)) {
                    if (!iob1.a(floatValue - qVar.e(clp0Var, floatValue))) {
                        xi2Var.a();
                        return zy11Var;
                    }
                    ref$FloatRef.element += floatValue;
                }
                if (((Boolean) u50Var.invoke(Float.valueOf(ref$FloatRef.element))).booleanValue()) {
                    xi2Var.a();
                }
                return zy11Var;
            case 7:
                ((ie30) obj).a.invoke((String) obj5, (String) obj4, (String) obj2, obj3);
                return zy11Var;
            case 8:
                CompositePaymentIconsView compositePaymentIconsView = (CompositePaymentIconsView) obj;
                CompositePaymentIconsView.update$default(compositePaymentIconsView, (m1a0) obj5, (z0a0) obj4, true, null, 8, null);
                compositePaymentIconsView.setOnClickListener(new fx00(7, (tls) obj2, (lv90) obj3));
                return zy11Var;
            case 9:
                com.yandex.go.navigator.ui.b bVar = (com.yandex.go.navigator.ui.b) obj5;
                new ru.yandex.taxi.map_common.map.b((el00) bVar.H.a.a.get(), ((TaxiMapView) obj4).getMapWindow(), bVar.E, (ga50) obj, (Navigation) obj2).b(new t130(28, bVar, (ad50) obj3), true);
                return zy11Var;
            case 10:
                e100 e100Var = (e100) obj5;
                qdh qdhVar = (qdh) e100Var.c;
                h060 h060Var = (h060) e100Var.w;
                tls tlsVar = (tls) obj4;
                NetworkServiceRetryingStrategy networkServiceRetryingStrategy = (NetworkServiceRetryingStrategy) obj2;
                hz50 hz50Var = (hz50) obj3;
                ofh ofhVar = (ofh) obj;
                j0g j0gVar = ofhVar.c;
                if (!ofhVar.b) {
                    int i5 = ofhVar.a;
                    if (j0gVar == null) {
                        h = new NetworkServiceError(ExternalErrorKind.network, ExternalErrorTrigger.internal_sdk, Integer.valueOf(i5), oyr.j(i5, "Bad status code: ", ": empty body"), (String) null, 48);
                    } else {
                        String str2 = new String((byte[]) ((ddf) j0gVar.b).b, (Charset) j0gVar.a);
                        tyj0 a = qdhVar.a(str2);
                        if (a.b()) {
                            YSError ySError = a.b;
                            c.b(ySError);
                            h = new NetworkServiceError(ExternalErrorKind.network, ExternalErrorTrigger.internal_sdk, Integer.valueOf(i5), oyr.k(i5, "Bad status code: ", Extension.COLON_SPACE, unr0.p("Failed to parse error body: \"", str2, "\", error: \"", ySError.getMessage(), "\"")), (String) null, 48);
                        } else {
                            y3x y3xVar = (y3x) a.a();
                            h = h060Var.h(y3xVar, i5);
                            if (h == null) {
                                h = new NetworkServiceError(ExternalErrorKind.network, ExternalErrorTrigger.internal_sdk, Integer.valueOf(i5), oyr.k(i5, "Bad status code: ", Extension.COLON_SPACE, unr0.p("Failed to extract error body: \"", str2, "\", json: \"", mbb1.a(y3xVar), "\"")), (String) null, 48);
                            }
                        }
                    }
                    NetworkServiceError networkServiceError = h;
                    return h060Var.m(networkServiceError).f(new g060(e100Var, c == true ? 1 : 0)).g(new u50(networkServiceRetryingStrategy, e100Var, hz50Var, tlsVar, networkServiceError, 15));
                }
                if (j0gVar == null) {
                    return zmx.c(h060Var.i(new NetworkServiceError(ExternalErrorKind.network, ExternalErrorTrigger.internal_sdk, (Integer) null, "No payload in network response", (String) null, 48)));
                }
                tyj0 a2 = qdhVar.a(new String((byte[]) ((ddf) j0gVar.b).b, (Charset) j0gVar.a));
                if (a2.b()) {
                    YSError ySError2 = a2.b;
                    c.b(ySError2);
                    i = coa1.h(h060Var.i(new NetworkServiceError(ExternalErrorKind.network, ExternalErrorTrigger.internal_sdk, (Integer) null, g8e.o("Unable to deserialize JSON object: ", ySError2.getMessage()), (String) null, 48)));
                } else {
                    y3x y3xVar2 = (y3x) a2.a();
                    NetworkServiceError n = h060Var.n(y3xVar2);
                    if (n != null) {
                        i = coa1.h(h060Var.i(n));
                    } else {
                        tyj0 tyj0Var = (tyj0) tlsVar.invoke(y3xVar2);
                        if (tyj0Var.b()) {
                            YSError ySError3 = tyj0Var.b;
                            c.b(ySError3);
                            i = coa1.h(h060Var.i(new NetworkServiceError(ExternalErrorKind.network, ExternalErrorTrigger.internal_sdk, (Integer) null, b64.l("Unable to parse JSON object: ", mbb1.a(y3xVar2), ", error: ", ySError3.getMessage()), (String) null, 48)));
                        } else {
                            i = coa1.i(tyj0Var.a());
                        }
                    }
                }
                return ooa1.d(i);
            case 11:
                co60 co60Var = (co60) obj4;
                wls wlsVar = (wls) obj2;
                oz40 oz40Var = (oz40) obj3;
                hoy0 hoy0Var = (hoy0) obj;
                kk2 kk2Var = hoy0Var.a;
                if (((Boolean) ((wls) obj5).invoke(kk2Var.b, new mkx(co60Var.l))).booleanValue()) {
                    oz40Var.setValue(hoy0Var);
                    wlsVar.invoke(kk2Var.b, co60Var.i);
                }
                return zy11Var;
            case 12:
                AuthorizationUrlProperties.a aVar = (AuthorizationUrlProperties.a) ((x) obj);
                aVar.a = gtq0.h(((e) obj5).c, ((kj) obj4).a);
                aVar.b = (String) obj2;
                aVar.c = (String) obj3;
                return zy11Var;
            case 13:
                x2b0.h((x2b0) obj5, (String) obj4, (String) obj2, (byte[]) obj3);
                return zy11Var;
            case 14:
                v4b0 v4b0Var = (v4b0) obj5;
                tls tlsVar2 = (tls) obj4;
                oz40 oz40Var2 = (oz40) obj2;
                u6y u6yVar = (u6y) obj;
                u6y.b(u6yVar, null, new a(-1625277884, new k4b0(v4b0Var, c2 == true ? 1 : 0), true), 3);
                List list = v4b0Var.c;
                m6y m6yVar = (m6y) u6yVar;
                m6yVar.f(list.size(), null, new rc0(list, 9, n4b0.a), new a(802480018, new sc0(list, v4b0Var, tlsVar2, oz40Var2), true));
                jad.a.getClass();
                u6y.b(m6yVar, null, jad.d, 3);
                u6y.b(m6yVar, null, new a(910570508, new r5y((Object) v4b0Var, (Object) tlsVar2, (oz40) obj3, (Object) oz40Var2, 12), true), 3);
                return zy11Var;
            case 15:
                n70 n70Var2 = (n70) obj4;
                i4b0 i4b0Var = (i4b0) obj5;
                z8b0 z8b0Var = (z8b0) obj2;
                z8b0 z8b0Var2 = (z8b0) obj3;
                i261 i261Var = (i261) n70Var2.N;
                l9b0 l9b0Var = (l9b0) n70Var2.Z();
                FrameLayout frameLayout = i261Var.b;
                final ColorFilterConstraintLayout colorFilterConstraintLayout = i261Var.a;
                ImageView imageView2 = i261Var.e;
                ImageView imageView3 = i261Var.c;
                frameLayout.setClipToOutline(true);
                j9b0 j9b0Var = l9b0Var.h;
                he60 he60Var = l9b0Var.f;
                rbv rbvVar = l9b0Var.g;
                ColorModel colorModel = j9b0Var.a;
                rbv rbvVar2 = j9b0Var.b;
                FrameLayout frameLayout2 = i261Var.b;
                Drawable background = frameLayout2.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(colorModel != null ? ColorStateList.valueOf(colorModel.get(sm91.c(i261Var))) : null);
                }
                k9b0 k9b0Var = l9b0Var.i;
                Drawable mutate = frameLayout2.getBackground().mutate();
                GradientDrawable gradientDrawable2 = mutate instanceof GradientDrawable ? (GradientDrawable) mutate : null;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setStroke(k9b0Var != null ? sm91.c(i261Var).getResources().getDimensionPixelSize(k9b0.b) : 0, k9b0Var != null ? ColorStateList.valueOf(k9b0Var.a.get(sm91.c(i261Var))) : null);
                }
                i261Var.d.setFilter(l9b0Var.j);
                imageView3.setVisibility(rbvVar2 != null ? 0 : 8);
                if (rbvVar2 != null) {
                    v4b1.k(rbvVar2, imageView3, null, null, 6);
                }
                if (rbvVar != null) {
                    v4b1.k(rbvVar, imageView2, null, null, 6);
                }
                imageView2.setVisibility(rbvVar != null ? 0 : 8);
                com.ybsdk.feature.pfm.internal.ui.delegates.a.e(he60Var, i261Var);
                com.ybsdk.feature.pfm.internal.ui.delegates.a.d(he60Var, i261Var);
                colorFilterConstraintLayout.setOnClickListener(new nl(12, i261Var, i4b0Var, l9b0Var));
                categoriesAdapter$lambda$4 = PfmCategoriesView.categoriesAdapter$lambda$4(z8b0Var.b);
                int i6 = categoriesAdapter$lambda$4.b;
                ViewGroup.LayoutParams layoutParams = colorFilterConstraintLayout.getLayoutParams();
                layoutParams.height = i6;
                colorFilterConstraintLayout.setLayoutParams(layoutParams);
                final int i7 = categoriesAdapter$lambda$4.a;
                boolean booleanValue = ((Boolean) z8b0Var2.invoke()).booleanValue();
                int width = colorFilterConstraintLayout.getWidth();
                if (!booleanValue || width == 0) {
                    ViewGroup.LayoutParams layoutParams2 = colorFilterConstraintLayout.getLayoutParams();
                    layoutParams2.width = i7;
                    colorFilterConstraintLayout.setLayoutParams(layoutParams2);
                } else {
                    Object tag = colorFilterConstraintLayout.getTag(lbh0.ybsdk_pfm_category_width_animator_tag);
                    ValueAnimator valueAnimator = tag instanceof ValueAnimator ? (ValueAnimator) tag : null;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(width, i7);
                    ofInt.setDuration(250L);
                    ofInt.setInterpolator(y8b0.u);
                    ofInt.addUpdateListener(new wd2(colorFilterConstraintLayout, 7));
                    ofInt.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.pfm.internal.ui.delegates.PfmCategoriesDelegateKt$animateWidthChange$lambda$15$$inlined$addListener$default$1
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                            colorFilterConstraintLayout.setTag(lbh0.ybsdk_pfm_category_width_animator_tag, null);
                            View view = colorFilterConstraintLayout;
                            if (view.isAttachedToWindow()) {
                                int i8 = i7;
                                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                                layoutParams3.width = i8;
                                view.setLayoutParams(layoutParams3);
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            colorFilterConstraintLayout.setTag(lbh0.ybsdk_pfm_category_width_animator_tag, null);
                            View view = colorFilterConstraintLayout;
                            if (view.isAttachedToWindow()) {
                                int i8 = i7;
                                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                                layoutParams3.width = i8;
                                view.setLayoutParams(layoutParams3);
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                        }
                    });
                    colorFilterConstraintLayout.setTag(lbh0.ybsdk_pfm_category_width_animator_tag, ofInt);
                    ofInt.start();
                }
                return zy11Var;
            case 16:
                PFMCalendarView pFMCalendarView = (PFMCalendarView) obj5;
                y390 y390Var = (y390) obj4;
                q6i0 q6i0Var = (q6i0) obj;
                pFMCalendarView.render(y390.a(y390Var, q6i0.a(y390Var.c, null, q6i0Var.b, q6i0Var.c, q6i0Var.d, 1)));
                ((BottomSheetDialogView) obj2).updatePrimaryButton(YbButtonView.a.a((YbButtonView.a) obj3, null, null, pFMCalendarView.hasValidRangeDate(), false, 3583));
                return zy11Var;
            case 17:
                extractView$lambda$5 = PlusPanelDailySectionView.extractView$lambda$5((PlusPanelDailySectionView) obj5, null, (Section) obj4, (DailyShortcut) obj2, (PlusPanelDailyView) obj3, (ShortcutAction) obj);
                return extractView$lambda$5;
            case 18:
                sls slsVar = (sls) obj4;
                qn41 qn41Var = (qn41) obj;
                qn41Var.a(new q3d0((p3d0) obj5));
                qn41Var.a(new phd0(new j2n(2, (vhw0) obj2), false));
                qn41Var.a(new khd0(new j2n(i3, (sls) obj3)));
                if (slsVar != null) {
                    qn41Var.a(new bsd0(slsVar));
                }
                return zy11Var;
            case 19:
                dae0 dae0Var = (dae0) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj2;
                q5r q5rVar = (q5r) obj3;
                cae0 cae0Var = (cae0) obj;
                qez qezVar = cae0Var.c;
                qez qezVar2 = cae0Var.c;
                v9e0 v9e0Var = qezVar instanceof v9e0 ? (v9e0) qezVar : null;
                if ((v9e0Var != null ? v9e0Var.a() : null) != null) {
                    v9e0 v9e0Var2 = qezVar2 instanceof v9e0 ? (v9e0) qezVar2 : null;
                    if (str3.equals(v9e0Var2 != null ? v9e0Var2.a() : null)) {
                        objArr = true;
                        z = ((qezVar2 instanceof v9e0) || objArr != true || jl40.l(cae0Var.a, str4)) ? false : true;
                        if (z) {
                            yo40 yo40Var = dae0Var.a;
                            String c3 = cae0Var.c();
                            PopupPriorityLauncher$PopupType e = cae0Var.e();
                            aae0 b = cae0Var.b();
                            Map a3 = b != null ? b.a() : null;
                            dei0 dei0Var = (dei0) yo40Var.a;
                            CreativeType m = yo40.m(e);
                            r5r r5rVar = new r5r(q5rVar.a(), yo40.m(q5rVar.b()));
                            if (a3 != null) {
                                ((com.yandex.go.analytics.realtime.a) dei0Var).d(new kei0(m, c3, r5rVar, a3));
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                }
                objArr = false;
                if (qezVar2 instanceof v9e0) {
                }
                if (z) {
                }
                return Boolean.valueOf(z);
            case 20:
                mnq0 mnq0Var = (mnq0) obj;
                f.p(mnq0Var, 0);
                f.f(mnq0Var, null, new sq0((lhg) obj5, (String) obj4, this.w, (ky) obj3, 3));
                return zy11Var;
            case 21:
                com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.a aVar2 = (com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.a) obj5;
                v031 v031Var = (v031) obj4;
                d9g0 d9g0Var = (d9g0) obj2;
                String str5 = (String) obj3;
                aVar2.getClass();
                boolean z2 = v031Var instanceof q031;
                o031 o031Var = o031.a;
                if (z2) {
                    rr51Var = ((q031) v031Var).b;
                } else if (v031Var instanceof l031) {
                    rr51Var = ((l031) v031Var).d;
                } else if (v031Var instanceof r031) {
                    rr51Var = ((r031) v031Var).c;
                } else {
                    if (!jl40.l(v031Var, o031Var) && !(v031Var instanceof n031)) {
                        w511.b();
                        return null;
                    }
                    rr51Var = null;
                }
                if (z2) {
                    xvz0Var = ((q031) v031Var).a;
                } else if (v031Var instanceof l031) {
                    xvz0Var = ((l031) v031Var).b;
                } else if (v031Var instanceof r031) {
                    xvz0Var = ((r031) v031Var).b;
                } else {
                    if (!jl40.l(v031Var, o031Var) && !(v031Var instanceof n031)) {
                        w511.b();
                        return null;
                    }
                    xvz0Var = null;
                }
                r031 r031Var = new r031(v031Var, xvz0Var, rr51Var);
                d9g0 d9g0Var2 = (d9g0) aVar2.b.a.getValue();
                return d9g0.c(d9g0Var, null, null, str5, d9g0Var2 != null ? d9g0Var2.i : null, null, null, r031Var, false, null, 56959);
            case 22:
                String str6 = (String) obj5;
                String str7 = (String) obj4;
                ay21 ay21Var = (ay21) obj2;
                String str8 = (String) obj3;
                f010 f010Var = (f010) obj;
                yq30 yq30Var2 = f010Var.a;
                if (!(yq30Var2 instanceof xq30) || !((xq30) yq30Var2).b) {
                    yq30Var2 = wq30.a;
                }
                f010Var.c.X(f010Var.w, str6, str7, str8, null, new pj40(ay21Var.a, ay21Var.b), TransportPaymentAnalytics$CheckoutScreenOpenReason.QrCode, yq30Var2, null);
                return zy11Var;
            case 23:
                a76 a76Var = (a76) obj5;
                com.yandex.go.blur.view.internal.rendereffect.b bVar2 = (com.yandex.go.blur.view.internal.rendereffect.b) obj4;
                String str9 = (String) obj2;
                View view = (View) obj3;
                if (!(a76Var instanceof z66)) {
                    if (a76Var instanceof y66) {
                        return bVar2.i(str9, (y66) a76Var, view);
                    }
                    w511.b();
                    return null;
                }
                z66 z66Var = (z66) a76Var;
                float w = tje.w(z66Var.a, bVar2.e);
                if (w > 0.0f) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    renderEffect = RenderEffect.createBlurEffect(w, w, Shader.TileMode.CLAMP);
                } else {
                    renderEffect = com.yandex.go.blur.view.internal.rendereffect.b.k;
                }
                Set set = z66Var.b;
                if (set.isEmpty()) {
                    return renderEffect;
                }
                Set set2 = set;
                ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
                Iterator it = set2.iterator();
                if (it.hasNext()) {
                    throw unr0.i(it);
                }
                RenderEffect j = bVar2.j(str9, arrayList, view);
                if (j == null) {
                    return null;
                }
                RenderEffect renderEffect2 = com.yandex.go.blur.view.internal.rendereffect.b.k;
                BlendMode blendMode = BlendMode.DST_OUT;
                createBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffect2, j, BlendMode.DST_OUT);
                BlendMode blendMode2 = BlendMode.DST_IN;
                createBlendModeEffect2 = RenderEffect.createBlendModeEffect(renderEffect, j, BlendMode.DST_IN);
                BlendMode blendMode3 = BlendMode.SRC_OVER;
                createBlendModeEffect3 = RenderEffect.createBlendModeEffect(createBlendModeEffect, createBlendModeEffect2, BlendMode.SRC_OVER);
                return createBlendModeEffect3;
            case 24:
                g gVar = (g) obj2;
                RecyclerView recyclerView = (RecyclerView) obj;
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                com.yandex.go.taxi.order.communications.g a4 = ((jtc) ((htc) obj5)).a(new zdk0(i4, ref$ObjectRef2, (hpf0) obj3, gVar));
                recyclerView.setAdapter(a4);
                return new h(recyclerView, (o2y0) obj4, a4, gVar, new h12(5, ref$ObjectRef2));
            case 25:
                RideCardRatingReasonsSelectorView rideCardRatingReasonsSelectorView = new RideCardRatingReasonsSelectorView(((ViewGroup) obj).getContext(), new pmk0((ru.yandex.taxi.utils.c) obj5, (pav) obj4, (k7x0) obj2, (qmp) obj3));
                rideCardRatingReasonsSelectorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return rideCardRatingReasonsSelectorView;
            case 26:
                n70 n70Var3 = (n70) obj4;
                String str10 = (String) obj5;
                String str11 = (String) obj2;
                xty0.d(((u161) n70Var3.N).a, ((wyk0) n70Var3.Z()).d);
                u161 u161Var = (u161) n70Var3.N;
                u161Var.a.setOnClickListener(new tai0(i3, (tyk0) obj3, n70Var3));
                AppCompatTextView appCompatTextView = u161Var.a;
                boolean z3 = ((wyk0) n70Var3.Z()).e;
                Context context2 = n70Var3.P;
                appCompatTextView.setBackground(z3 ? vng.t(xxg0.ybsdk_autotopup_regular_frequency_selected_background, context2) : vng.t(xxg0.ybsdk_autotopup_regular_frequency_base_background, context2));
                CharSequence a5 = com.ybsdk.core.utils.text.d.a(context2, ((wyk0) n70Var3.Z()).d);
                appCompatTextView.setContentDescription(((Object) a5) + (((wyk0) n70Var3.Z()).e ? Extension.FIX_SPACE.concat(str10) : Extension.FIX_SPACE.concat(str11)));
                return zy11Var;
            case 27:
                tls tlsVar3 = (tls) obj4;
                oz40 oz40Var3 = (oz40) obj2;
                oz40 oz40Var4 = (oz40) obj3;
                String str12 = (String) obj;
                if (((e0m0) obj5).f.b != null) {
                    tlsVar3.invoke(c0m0.a);
                }
                oz40Var3.setValue(Boolean.FALSE);
                oz40Var4.setValue(str12);
                return zy11Var;
            case 28:
                x4c.g("Can't change goal of savings account", (Throwable) obj, scc.g((String) obj5, (MoneyEntity) obj4, (Date) obj2), null, 8);
                ((com.ybsdk.feature.savings.internal.helpers.a) obj3).d.c(unr0.h(Text.Companion, dzh0.ybsdk_savings_goal_snackbar_saving_error), new Text.Resource(dzh0.ybsdk_common_error_try_again));
                return zy11Var;
            default:
                n70 n70Var4 = (n70) obj;
                SavingsShelfView savingsShelfView = ((o561) n70Var4.N).a;
                savingsShelfView.setDivActionHandler((tls) obj5);
                savingsShelfView.setShelfCallbacks((ftr0) obj4);
                savingsShelfView.setAccountCallbacks((zj) obj2, (com.ybsdk.feature.savings.internal.screens.dashboard.v4.a) obj3);
                n70Var4.W(new ns3(n70Var4, 11));
                return zy11Var;
        }
    }

    public /* synthetic */ vqy(n70 n70Var, Object obj, Object obj2, cms cmsVar, int i) {
        this.a = i;
        this.c = n70Var;
        this.b = obj;
        this.w = obj2;
        this.x = cmsVar;
    }

    public /* synthetic */ vqy(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }
}
