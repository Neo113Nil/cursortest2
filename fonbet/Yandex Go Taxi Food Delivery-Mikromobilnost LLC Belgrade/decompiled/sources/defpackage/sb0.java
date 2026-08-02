package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.widget.FrameLayout;
import androidx.compose.foundation.gestures.b0;
import androidx.compose.foundation.gestures.f;
import androidx.compose.foundation.relocation.b;
import androidx.compose.ui.node.s;
import com.adjust.sdk.Constants;
import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;
import com.yandex.go.chargers.notification.ChargersNotification;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferModalView;
import com.yandex.go.promocodes.a;
import com.yandex.go.shortcuts.impl.view.adapter.c;
import com.yandex.go.taxi.order.change.source.interactor.e;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.user_profile.ui.am.u;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.ui.settings.folder.addChat.i;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelContainer;
import com.yandex.xplat.common.Encoding;
import com.yandex.xplat.common.FileSystemError;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import com.ybsdk.feature.dashboard.api.DashboardScreenParams;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.dashboard.api.model.SupportState;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.HeaderType;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Params;
import com.ybsdk.rconfig.MainScreen;
import com.ybsdk.rconfig.configs.ResponseCacheConfigExperiment;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFragment;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.ShowAlertInteractor$AnalyticsTrigger;

/* loaded from: classes5.dex */
public final /* synthetic */ class sb0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ sb0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0198, code lost:
    
        if (r1 != null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0740 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v22, types: [T, ix80] */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String str;
        String str2;
        j5s j5sVar;
        at0 at0Var;
        Iterator it;
        Object obj;
        qg90 qg90Var;
        Object obj2;
        zy11 renderSuccess$lambda$1$0;
        zy11 render$lambda$15;
        zii0 zii0Var;
        u8j0 t8j0Var;
        zy11 showDialog$lambda$3;
        Charset charset;
        List W;
        List W2;
        int i = this.a;
        int i2 = 10;
        String str3 = null;
        str3 = null;
        int i3 = 0;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                r0 r0Var = ((i) obj4).B;
                ((tls) obj5).invoke(new ec0(((ad0) r0Var.getValue()).b, ((ad0) r0Var.getValue()).a));
                ((sls) obj3).invoke();
                return zy11Var;
            case 1:
                ((pep0) ((oep0) obj5)).f((m950) ((a) obj4).c.get(), new qrf0((mrf0) obj3), hxx.a);
                return zy11Var;
            case 2:
                ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a aVar = (ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a) obj5;
                Integer num = (Integer) obj4;
                g8l0 g8l0Var = (g8l0) obj3;
                o5s o5sVar = (o5s) aVar.g.a;
                j5s j5sVar2 = (j5s) o5sVar.c.a.getValue();
                List list = j5sVar2 != null ? j5sVar2.f : null;
                if (num != null) {
                    int intValue = num.intValue();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                g8l0 g8l0Var2 = ((qg90) obj2).b;
                                int i4 = g8l0Var2.a;
                                if (intValue > g8l0Var2.b || i4 > intValue) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        qg90 qg90Var2 = (qg90) obj2;
                        if (qg90Var2 != null) {
                            str = qg90Var2.a.g;
                            if (g8l0Var != null && list != null) {
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj = null;
                                    } else {
                                        obj = it.next();
                                        if (((qg90) obj).b.equals(g8l0Var)) {
                                        }
                                    }
                                }
                                qg90Var = (qg90) obj;
                                if (qg90Var != null) {
                                    str2 = qg90Var.a.g;
                                    j5sVar = (j5s) o5sVar.c.a.getValue();
                                    if (j5sVar != null && (at0Var = j5sVar.d) != null) {
                                        str3 = at0Var.g;
                                    }
                                    if (str == null) {
                                        str = str2 == null ? str3 : str2;
                                    }
                                    if (str != null) {
                                        aVar.f.c(Boolean.TRUE, str);
                                    }
                                    return zy11Var;
                                }
                            }
                            str2 = null;
                            j5sVar = (j5s) o5sVar.c.a.getValue();
                            if (j5sVar != null) {
                                str3 = at0Var.g;
                            }
                            if (str == null) {
                            }
                            if (str != null) {
                            }
                            return zy11Var;
                        }
                    }
                }
                str = null;
                if (g8l0Var != null) {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    qg90Var = (qg90) obj;
                    if (qg90Var != null) {
                    }
                }
                str2 = null;
                j5sVar = (j5s) o5sVar.c.a.getValue();
                if (j5sVar != null) {
                }
                if (str == null) {
                }
                if (str != null) {
                }
                return zy11Var;
            case 3:
                ((oz40) obj3).setValue(Boolean.FALSE);
                ((tls) obj5).invoke(((hw0) obj4).j);
                return zy11Var;
            case 4:
                String str4 = (String) obj4;
                e12 e12Var = (e12) ((oz40) obj3).getValue();
                ((u) obj5).getClass();
                return e12Var instanceof b12 ? b12.a : ((e12Var instanceof c12) || str4 == null) ? c12.a : d12.a;
            case 5:
                th4 th4Var = (th4) obj4;
                c1y c1yVar = (c1y) obj3;
                ((Ref$ObjectRef) obj5).element = th4Var.b.a(c1yVar.a.c(), c1yVar.getLayoutDirection(), c1yVar);
                th4Var.E0();
                return zy11Var;
            case 6:
                ((Ref$BooleanRef) obj5).element = true;
                ((c) obj4).o0((ga5) obj3);
                return zy11Var;
            case 7:
                ((tls) obj5).invoke(new qim0(((anh) obj4).a, (String) obj3));
                return zy11Var;
            case 8:
                return ((bx5) obj5).f.a.f(new bib((String) obj4, (String) obj3, 0), new rv10(18), NetworkServiceRetryingStrategy.noRetry);
            case 9:
                b bVar = (b) obj5;
                zii0 E0 = b.E0(bVar, (s) obj4, (sls) obj3);
                if (E0 == null) {
                    return null;
                }
                f fVar = bVar.a;
                if (k6w.a(fVar.A, -1L)) {
                    lxv.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return E0.j(fVar.I0(E0, fVar.F0(), 0L) ^ (-9223372034707292160L));
            case 10:
                e eVar = (e) obj5;
                eVar.c.b((o2y0) obj4, (ChangeOrderNotificationActionResponse) obj3);
                eVar.b.c("ChangeSourcePointNotification");
                return zy11Var;
            case 11:
                ((tls) obj5).invoke(new j0a(((x0a) obj4).c, (ChargersFeedbackCompletedOrder$FinishingStage) obj3));
                return zy11Var;
            case 12:
                sls slsVar = (sls) obj3;
                j6a j6aVar = (j6a) obj5;
                ChargersNotification chargersNotification = (ChargersNotification) obj4;
                if (slsVar != null) {
                    slsVar.invoke();
                }
                j6aVar.c.c(chargersNotification.getUid());
                return zy11Var;
            case 13:
                renderSuccess$lambda$1$0 = ChargersOfferModalView.renderSuccess$lambda$1$0((ChargersOfferModalView) obj5, (vr60) obj4, (oaa) obj3);
                return renderSuccess$lambda$1$0;
            case 14:
                ((x08) obj5).cancel();
                ((i7b) obj4).b((LocalMessageRef) obj3);
                return zy11Var;
            case 15:
                xlj xljVar = new xlj(0);
                return new ss9((Context) obj5, (w030) obj4, xljVar, new plj(), (w310) obj3, new ie(new zlj(), xljVar));
            case 16:
                super/*ru.yandex.taxi.widget.ModalView*/.animateDismiss((l7a) obj4, (Runnable) obj3);
                return zy11Var;
            case 17:
                render$lambda$15 = CodeConfirmationFragment.render$lambda$15((CodeConfirmationFragment) obj5, (v9c) obj4, (p661) obj3);
                return render$lambda$15;
            case 18:
                com.yandex.go.taxi.order.promotions.notification.ui.a aVar2 = (com.yandex.go.taxi.order.promotions.notification.ui.a) obj5;
                aVar2.e.d((String) obj4);
                aVar2.d.a(Uri.parse(((isc) obj3).c), DeeplinkSource.TOTW_COMMUNICATIONS);
                return zy11Var;
            case 19:
                sls slsVar2 = (sls) obj3;
                exx0 exx0Var = (exx0) ((com.yandex.go.taxi.order.promotions.notification.ui.a) obj5).f.b;
                exx0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("id", (String) obj4);
                exx0Var.a.a("TaxiOnTheWay.PromoblockNotification.Tapped", hashMap, 1, new HashMap());
                if (slsVar2 != null) {
                    slsVar2.invoke();
                }
                return zy11Var;
            case 20:
                f fVar2 = (f) obj5;
                b0 b0Var = (b0) obj4;
                vk6 vk6Var = (vk6) obj3;
                ok6 ok6Var = fVar2.y;
                while (true) {
                    wz40 wz40Var = ok6Var.a;
                    int i5 = wz40Var.c;
                    if (i5 != 0) {
                        if (i5 == 0) {
                            w511.i("MutableVector is empty.");
                            return null;
                        }
                        zii0 zii0Var2 = (zii0) ((gge) wz40Var.a[i5 - 1]).a.invoke();
                        if (zii0Var2 == null ? true : f.G0(fVar2, zii0Var2, 0L, 0L, 3)) {
                            wz40 wz40Var2 = ok6Var.a;
                            ((gge) wz40Var2.k(wz40Var2.c - 1)).b.resumeWith(zy11Var);
                        }
                    }
                }
                if (fVar2.z && (zii0Var = (zii0) fVar2.x.invoke()) != null && f.G0(fVar2, zii0Var, 0L, 0L, 3)) {
                    fVar2.z = false;
                }
                b0Var.e = f.E0(fVar2, vk6Var, 0L);
                return zy11Var;
            case 21:
                ((tls) obj5).invoke(new r531((String) obj4, (String) obj3));
                return zy11Var;
            case 22:
                ((zch) ((apf) obj5).x).m((akl0) obj4, (ShowAlertInteractor$AnalyticsTrigger) obj3);
                return zy11Var;
            case 23:
                com.ybsdk.feature.dashboard.internal.domain.interactor.a aVar3 = (com.ybsdk.feature.dashboard.internal.domain.interactor.a) obj3;
                mmg a = com.ybsdk.feature.dashboard.internal.ui.dashboard3.b.a((DashboardV3Params) obj5);
                if (((j0g) ((dlg) obj4)).e(a.getProductId())) {
                    String productId = a.getProductId();
                    com.ybsdk.core.common.data.cache.b bVar2 = aVar3.b.b;
                    vvj0 a2 = com.ybsdk.feature.dashboard.internal.data.c.a(productId);
                    bVar2.getClass();
                    e5z0 e5z0Var = i5z0.a;
                    e5z0Var.m("ResponseCache");
                    e5z0Var.a("Get cached mapped value", new Object[0]);
                    if (((ResponseCacheConfigExperiment) bVar2.b.a.d(tvj0.a).getData()).getEnabled()) {
                        pz40 pz40Var = (pz40) bVar2.k.get(a2.b);
                        u8j0 u8j0Var = pz40Var != null ? (u8j0) ((r0) pz40Var).getValue() : null;
                        u8j0 u8j0Var2 = u8j0Var != null ? u8j0Var : null;
                        t8j0Var = u8j0Var2 != null ? bVar2.l(u8j0Var2, a2) : new t8j0();
                    } else {
                        t8j0Var = new t8j0();
                    }
                    if (!(t8j0Var instanceof r8j0) || !((r8j0) t8j0Var).c) {
                        t8j0Var = new t8j0();
                    }
                } else {
                    t8j0Var = new t8j0();
                }
                return new nmg(a, t8j0Var, null, false, false, EmptyList.a, false, true, false, false, null, false);
            case 24:
                DashboardScreenParams dashboardScreenParams = (DashboardScreenParams) obj5;
                dlg dlgVar = (dlg) obj4;
                djg djgVar = (djg) obj3;
                ProductId productId2 = dashboardScreenParams.getProductId();
                String productType = dashboardScreenParams.getProductType();
                com.ybsdk.rconfig.b bVar3 = (com.ybsdk.rconfig.b) ((j0g) dlgVar).a;
                boolean z = bVar3.r().isEnabled() && jl40.l(bVar3.r().isEnabledOnCreditDashboardV1Screen(), Boolean.TRUE);
                com.ybsdk.rconfig.b bVar4 = (com.ybsdk.rconfig.b) ((j0g) dlgVar).a;
                xlg xlgVar = new xlg(z, bVar4.r().isEnabled() && jl40.l(bVar4.r().isEnabledOnCreditAccountDashboardV1Screen(), Boolean.TRUE));
                SupportState supportState = SupportState.DEFAULT;
                kg51 kg51Var = djgVar.a;
                return new plg(productId2, productType, xlgVar, new t8j0(), supportState, true, null, null, ((MainScreen) bVar4.d(bVar4.i.h).getData()).isEnabled() ? HeaderType.ACCOUNT_HEADER : HeaderType.PLUS_BALANCE, EmptySet.a, null);
            case 25:
                showDialog$lambda$3 = DebugPanelContainer.showDialog$lambda$3((sls) obj3, (sls) obj5, (DebugPanelContainer) obj4);
                return showDialog$lambda$3;
            case 26:
                dtt dttVar = (dtt) obj3;
                return kotlin.collections.b.i(new Pair("plus_sdk_version", Collections.singleton("110.0.2")), new Pair("plus_sdk_client_app_version", u4r0.e((String) obj5)), new Pair("plus_sdk_service_name", u4r0.e((String) obj4)), new Pair("plus_sdk_is_native_payment_available", u4r0.e(String.valueOf(dttVar.b))), new Pair("plus_sdk_inapp_country_code", u4r0.e(dttVar.a)));
            case 27:
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                File file = new File(str5);
                Encoding encoding = (Encoding) ((aj31) obj3).b;
                try {
                    if (file.exists()) {
                        if (!file.isFile()) {
                            return new tyj0(null, new FileSystemError("File item already exists at destination path: '" + str5 + "'", null));
                        }
                        if (!file.delete()) {
                            return new tyj0(null, new FileSystemError("Received unexpected error when accessing file item at path: '" + str5 + "'", null));
                        }
                    }
                    if (pbh.a[encoding.ordinal()] == 1) {
                        byte[] decode = Base64.decode(str6, 0);
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
                        try {
                            bufferedOutputStream.write(decode);
                            bufferedOutputStream.close();
                        } finally {
                        }
                    } else {
                        int i6 = qbh.a[encoding.ordinal()];
                        if (i6 == 1) {
                            charset = null;
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            charset = StandardCharsets.UTF_8;
                        }
                        if (charset == null) {
                            charset = StandardCharsets.UTF_8;
                        }
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192);
                        try {
                            bufferedWriter.write(str6);
                            bufferedWriter.close();
                        } finally {
                        }
                    }
                    return new tyj0(zy11Var, null);
                } catch (Throwable th) {
                    return new tyj0(null, new FileSystemError(oyr.p("Received unexpected error when accessing file item at path: '", str5, "'"), th));
                }
            case 28:
                ru.yandex.taxi.delivery.ui.form.e eVar2 = (ru.yandex.taxi.delivery.ui.form.e) obj5;
                gci gciVar = eVar2.O;
                gciVar.getClass();
                gciVar.a("IncompleteAddressAlert.Tapped", (DeliveryFormStepType) obj4, new wwb("insert", i2));
                wai waiVar = (wai) eVar2.Dg();
                nji0 nji0Var = eVar2.R;
                hki hkiVar = ((fm2) obj3).a;
                mji0 mji0Var = (mji0) nji0Var.a.a.getValue();
                if (mji0Var != null) {
                    for (Object obj6 : mji0Var.a) {
                        int i7 = i3 + 1;
                        if (i3 < 0) {
                            scc.m();
                            throw null;
                        }
                        hai haiVar = (hai) obj6;
                        if ((haiVar instanceof nq0) && jl40.l(((nq0) haiVar).a(), hkiVar)) {
                            waiVar.scrollToPosition(i3);
                            return zy11Var;
                        }
                        i3 = i7;
                    }
                }
                i3 = -1;
                waiVar.scrollToPosition(i3);
                return zy11Var;
            default:
                oep0 oep0Var = (oep0) obj4;
                Uri uri = (Uri) obj3;
                yxh yxhVar = (yxh) ((yfi) obj5).c.get();
                yxhVar.getClass();
                String queryParameter = uri.getQueryParameter("mode");
                if (queryParameter != null) {
                    MapBuilder mapBuilder = new MapBuilder();
                    String queryParameter2 = uri.getQueryParameter("client_state");
                    if (queryParameter2 != null) {
                        W = evu0.W(queryParameter2, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                        Iterator it3 = W.iterator();
                        while (it3.hasNext()) {
                            W2 = evu0.W((String) it3.next(), new String[]{"="}, (r2 & 4) != 0 ? 0 : 2);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj7 : W2) {
                                if (!evu0.J((String) obj7)) {
                                    arrayList.add(obj7);
                                }
                            }
                            if (arrayList.size() != 2) {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                mapBuilder.put(arrayList.get(0), arrayList.get(1));
                            }
                        }
                    }
                    yxhVar.b.a(queryParameter, uri.getQueryParameter("client_state_64"), mapBuilder.j());
                    String queryParameter3 = uri.getQueryParameter("src_lat");
                    String queryParameter4 = uri.getQueryParameter("src_lon");
                    String queryParameter5 = uri.getQueryParameter("src_comment");
                    String queryParameter6 = uri.getQueryParameter("src_uri");
                    String queryParameter7 = uri.getQueryParameter("src_mode");
                    String queryParameter8 = uri.getQueryParameter("dst_name");
                    String queryParameter9 = uri.getQueryParameter("dst_lat");
                    String queryParameter10 = uri.getQueryParameter("dst_lon");
                    String queryParameter11 = uri.getQueryParameter("dst_comment");
                    String queryParameter12 = uri.getQueryParameter("dest_uri");
                    String queryParameter13 = uri.getQueryParameter("dst_mode");
                    uzs uzsVar = zzs.Companion;
                    if (queryParameter3 == null) {
                        queryParameter3 = "";
                    }
                    if (queryParameter4 == null) {
                        queryParameter4 = "";
                    }
                    uzsVar.getClass();
                    zzs c = uzs.c(queryParameter3, queryParameter4, null);
                    mud0 mud0Var = c != null ? new mud0(0, 4, c, queryParameter6, queryParameter7, queryParameter5) : null;
                    if (queryParameter9 == null) {
                        queryParameter9 = "";
                    }
                    if (queryParameter10 == null) {
                        queryParameter10 = "";
                    }
                    List A = j73.A(new mud0[]{mud0Var, new mud0(uzs.c(queryParameter9, queryParameter10, null), 1, queryParameter8, queryParameter12, queryParameter13, queryParameter11)});
                    String queryParameter14 = uri.getQueryParameter("pickup_src_lat");
                    String queryParameter15 = uri.getQueryParameter("pickup_src_lon");
                    String queryParameter16 = uri.getQueryParameter("pickup_dst_lat");
                    String queryParameter17 = uri.getQueryParameter("pickup_dst_lon");
                    if (queryParameter14 == null) {
                        queryParameter14 = "";
                    }
                    if (queryParameter15 == null) {
                        queryParameter15 = "";
                    }
                    zzs c2 = uzs.c(queryParameter14, queryParameter15, null);
                    mud0 mud0Var2 = c2 != null ? new mud0(0, 60, c2, (String) null, (String) null, (String) null) : null;
                    if (queryParameter16 == null) {
                        queryParameter16 = "";
                    }
                    if (queryParameter17 == null) {
                        queryParameter17 = "";
                    }
                    zzs c3 = uzs.c(queryParameter16, queryParameter17, null);
                    List A2 = j73.A(new mud0[]{mud0Var2, c3 != null ? new mud0(1, 60, c3, (String) null, (String) null, (String) null) : null});
                    String queryParameter18 = uri.getQueryParameter("scenario");
                    String queryParameter19 = uri.getQueryParameter("input_point");
                    if (queryParameter19 != null) {
                        if (queryParameter19.length() == 0) {
                            queryParameter19 = null;
                            break;
                        }
                    }
                    queryParameter19 = "direct_deeplink";
                    String queryParameter20 = uri.getQueryParameter("select_destination_policy");
                    MapBuilder mapBuilder2 = new MapBuilder();
                    if (queryParameter19.equals("direct_deeplink")) {
                        mapBuilder2.put(Constants.DEEPLINK, uri.toString());
                    }
                    MapBuilder j = mapBuilder2.j();
                    boolean booleanQueryParameter = uri.getBooleanQueryParameter("force_open_address_details", false);
                    String queryParameter21 = uri.getQueryParameter("force_address_details_index");
                    ((pep0) oep0Var).f((m950) yxhVar.a.get(), new gyh(queryParameter, A, A2, queryParameter20, new t4s(queryParameter19), !j.isEmpty() ? j : null, true, booleanQueryParameter, queryParameter21 != null ? bvu0.l(10, queryParameter21) : null, queryParameter18, null, 1024), hxx.a);
                }
                return zy11Var;
        }
    }

    public /* synthetic */ sb0(sls slsVar, Object obj, FrameLayout frameLayout, int i) {
        this.a = i;
        this.w = slsVar;
        this.b = obj;
        this.c = frameLayout;
    }

    public /* synthetic */ sb0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
        this.w = obj4;
    }
}
