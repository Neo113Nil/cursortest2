package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.address_map_picker.navigation.b;
import com.yandex.go.address.address_map_picker.navigation.d;
import com.yandex.go.address.address_map_picker.navigation.f;
import com.yandex.go.payments.yape.navigation.c;
import com.yandex.go.user_profile.ui.am.AmActions$CloseAndDeeplink;
import com.yandex.go.user_profile.ui.am.AmActions$Command;
import com.yandex.go.user_profile.ui.am.AmActions$Deeplink;
import com.yandex.go.user_profile.ui.am.AmActions$Uri;
import com.yandex.go.user_profile.ui.am.e;
import com.yandex.go.user_profile.ui.am.g;
import com.yandex.go.user_profile.ui.am.h;
import com.yandex.go.user_profile.ui.am.o;
import com.yandex.go.user_profile.ui.am.s;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.VoiceMessageData;
import com.yandex.mobile.drive.view.AlertButtonView;
import com.yandex.mobile.drive.view.AlertView;
import com.yandex.passport.api.a3;
import com.yandex.passport.api.b3;
import com.yandex.passport.api.v2;
import com.yandex.passport.api.w2;
import com.yandex.passport.api.x2;
import com.yandex.passport.api.y2;
import com.yandex.passport.api.z2;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsResultScreenShownResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsShortCutLimitsChangeVersion;
import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitPermissionListLoadedResult;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupPaymentStatusResultDataEntity;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupLogoResultStatus;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.state.AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSettingType;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.domain.AutoPullPermissionEntity$Status;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.autotopup.AutoFundEditView;
import com.ybsdk.widgets.common.autotopup.state.AutoTopupType;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.m5;
import defpackage.sls;
import defpackage.tje;
import defpackage.u4y;
import defpackage.z5;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.address.clarification.AddressClarificationCloseReason;
import ru.yandex.taxi.widget.AnimatedCircularHoleFogView;

/* loaded from: classes3.dex */
public final /* synthetic */ class v5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v5(tls tlsVar, m5f m5fVar) {
        this.a = 5;
        this.c = tlsVar;
        this.b = m5fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [l51, r71] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.ybsdk.core.utils.ui.RequestStatus$Data$Source] */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.yandex.go.address.models.Address] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 bindButton$lambda$10;
        g gVar;
        zy11 showStaticFogAnimated$lambda$0;
        String str;
        zy11 lambda$1$lambda$0;
        zy11 showDayOfMonthBottomSheet$lambda$59$lambda$58;
        AutoTopupLogoResultStatus autoTopupLogoResultStatus;
        Text title;
        AutoTopupLogoResultStatus autoTopupLogoResultStatus2;
        MoneyEntity moneyEntity;
        AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput autoTopupBottomSheetV2State$AutoTopupEdit$FocusInput;
        MoneyEntity moneyEntity2;
        MoneyEntity moneyEntity3;
        MoneyEntity moneyEntity4;
        int i = this.a;
        int i2 = 3;
        int i3 = 0;
        int i4 = 1;
        zy11 zy11Var = zy11.a;
        r9 = null;
        String str2 = null;
        r9 = null;
        su3 lu3Var = null;
        r9 = null;
        r9 = null;
        Object obj2 = null;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                final tls tlsVar = (tls) obj3;
                final ArrayList arrayList = ((n6) obj4).a;
                ((m6y) ((u6y) obj)).f(arrayList.size(), null, new tls() { // from class: com.ybsdk.feature.about.internal.presentation.AboutScreenKt$AboutScreenContent$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        arrayList.get(((Number) obj5).intValue());
                        return null;
                    }
                }, new a(-1091073711, new bms() { // from class: com.ybsdk.feature.about.internal.presentation.AboutScreenKt$AboutScreenContent$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.bms
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        int i5;
                        u4y u4yVar = (u4y) obj5;
                        int intValue = ((Number) obj6).intValue();
                        fid fidVar = (fid) obj7;
                        int intValue2 = ((Number) obj8).intValue();
                        if ((intValue2 & 6) == 0) {
                            i5 = (((bts) fidVar).k(u4yVar) ? 4 : 2) | intValue2;
                        } else {
                            i5 = intValue2;
                        }
                        if ((intValue2 & 48) == 0) {
                            i5 |= fidVar.c(intValue) ? 32 : 16;
                        }
                        int i6 = 0;
                        bts btsVar = (bts) fidVar;
                        if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
                            m5 m5Var = (m5) arrayList.get(intValue);
                            btsVar.e0(-745551312);
                            String str3 = "about_screen.menu_item." + intValue;
                            btsVar.e0(-1633490746);
                            boolean k = btsVar.k(tlsVar) | btsVar.e(m5Var);
                            Object Q = btsVar.Q();
                            if (k || Q == did.a) {
                                Q = new z5(i6, tlsVar, m5Var);
                                btsVar.o0(Q);
                            }
                            btsVar.t(false);
                            a.b(m5Var, str3, (sls) Q, btsVar, 0);
                            btsVar.t(false);
                        } else {
                            btsVar.Y();
                        }
                        return zy11.a;
                    }
                }, true));
                return zy11Var;
            case 1:
                n70 n70Var = (n70) obj4;
                t161 t161Var = (t161) n70Var.N;
                xty0.d(t161Var.c, ((m5) n70Var.Z()).a);
                exa1.e(t161Var.b, new k5(i4, (y4) obj3, n70Var));
                return zy11Var;
            case 2:
                ((ay40) ((zx40) obj4)).b((ixe0) obj3);
                return zy11Var;
            case 3:
                ((com.yandex.go.payments.acceptance.navigation.a) obj4).G.d.g(new pe((String) obj3, (ve) obj));
                return zy11Var;
            case 4:
                n70 n70Var2 = (n70) obj4;
                k061 k061Var = (k061) n70Var2.N;
                k061Var.a.render((qaq0) n70Var2.Z());
                k061Var.a.setSelectCategoryListener(new d10(((g10) obj3).a));
                return zy11Var;
            case 5:
                ((tls) obj3).invoke(((m5f) obj4).a);
                return zy11Var;
            case 6:
                ((a60) ((c) obj4).D).b((Intent) obj3);
                ((sy60) obj).a();
                return zy11Var;
            case 7:
                ((AtomicReference) obj4).set((AddressClarificationCloseReason) obj);
                ((op0) obj3).G.c();
                return zy11Var;
            case 8:
                ((lp0) obj).I((xp0) obj4, (AddressClarificationCloseReason) obj3);
                return zy11Var;
            case 9:
                f fVar = (f) obj4;
                lf00 lf00Var = (lf00) obj;
                lf00Var.b().i(fVar.F, fVar.G);
                bc bcVar = lf00Var.a;
                pey peyVar = (pey) bcVar.a;
                sey seyVar = new sey(peyVar);
                c9v c9vVar = new c9v(peyVar, seyVar, (wtr) ((xvf0) bcVar.w).get());
                b bVar = new b(i3, (m01) obj3, fVar);
                Lifecycle.State b = peyVar.getLifecycle().b();
                Lifecycle.State state = Lifecycle.State.DESTROYED;
                if (b == state) {
                    jst.e.r("Why you try to register MapApi on destroyed lifecycleOwner?", new IllegalStateException());
                } else {
                    seyVar.b(new g700(i2, c9vVar, bVar));
                }
                wjm a = lf00Var.a();
                a.v(new d(fVar));
                a.u(new m6(i2, fVar));
                ah00 z2 = ((c0g) ((i6r) bcVar.b)).z2();
                q5z.h(z2);
                sey seyVar2 = new sey(peyVar);
                e100 e100Var = new e100(z2, peyVar, seyVar2);
                y4 y4Var = new y4(19, fVar);
                if (peyVar.getLifecycle().b() == state) {
                    jst.e.r("Why you try to register MapApi on destroyed lifecycleOwner?", new IllegalStateException());
                } else {
                    seyVar2.b(new g700(9, e100Var, y4Var));
                }
                return zy11Var;
            case 10:
                pv0 pv0Var = (pv0) obj3;
                ((r71) obj).h(((s71) obj4).b, pv0Var != null ? pv0Var.a : 0, pv0Var);
                return zy11Var;
            case 11:
                return Long.valueOf(((gc1) obj4).b.e((oll0) obj, (cc1) obj3));
            case 12:
                bindButton$lambda$10 = AlertView.bindButton$lambda$10((AlertButtonView) obj4, (AlertView) obj3, (zy11) obj);
                return bindButton$lambda$10;
            case 13:
                s sVar = (s) obj4;
                o oVar = (o) obj3;
                Object obj5 = (b3) obj;
                if (obj5 != null) {
                    h hVar = sVar.P;
                    hVar.getClass();
                    if (obj5 instanceof v2) {
                        String str3 = ((v2) obj5).b;
                        gVar = jl40.l(str3, "needLogout") ? jjo.h : hVar.a(str3);
                    } else if (obj5 instanceof y2) {
                        gVar = new AmActions$Uri(((y2) obj5).a);
                    } else if (obj5 instanceof x2) {
                        String str4 = ((x2) obj5).a;
                        gVar = jl40.l(str4, "close") ? jjo.a : hVar.a(str4);
                    } else {
                        if (!(obj5 instanceof z2) && !(obj5 instanceof w2) && !obj5.equals(a3.a)) {
                            w511.b();
                            return null;
                        }
                        gVar = e.INSTANCE;
                    }
                    if (gVar instanceof AmActions$Command) {
                        String str5 = ((AmActions$Command) gVar).a;
                        if (jl40.l(str5, "action.change_account")) {
                            obj2 = scf0.a;
                        } else if (jl40.l(str5, "action.change_email")) {
                            obj2 = tcf0.a;
                        } else if (jl40.l(str5, "action.change_name")) {
                            obj2 = ocf0.a;
                        } else if (jl40.l(str5, "action.change_phone")) {
                            obj2 = qcf0.a;
                        } else if (jl40.l(str5, "action.create_name")) {
                            obj2 = new ycf0(false);
                        } else if (jl40.l(str5, "action.close")) {
                            obj2 = ncf0.a;
                        } else if (jl40.l(str5, "action.upload_photo")) {
                            obj2 = vcf0.a;
                        } else if (jl40.l(str5, "action.logout")) {
                            obj2 = rcf0.a;
                        }
                    } else if (gVar instanceof AmActions$Uri) {
                        obj2 = new ucf0(((AmActions$Uri) gVar).a);
                    } else if (gVar instanceof com.yandex.go.user_profile.ui.am.d) {
                        obj2 = zcf0.a;
                    } else if (gVar instanceof AmActions$Deeplink) {
                        obj2 = new ucf0(((AmActions$Deeplink) gVar).a);
                    } else if (gVar instanceof AmActions$CloseAndDeeplink) {
                        obj2 = new ucf0(((AmActions$CloseAndDeeplink) gVar).a);
                    } else if (!(gVar instanceof e)) {
                        w511.b();
                        return null;
                    }
                } else if (obj5 instanceof adf0) {
                    obj2 = (adf0) obj5;
                }
                if (obj2 == null) {
                    return zy11Var;
                }
                oVar.invoke(obj2);
                return zy11Var;
            case 14:
                androidx.compose.foundation.gestures.d dVar = (androidx.compose.foundation.gestures.d) obj4;
                o62 o62Var = (o62) obj3;
                long j = ((k9m) obj).a;
                dVar.getClass();
                long g = wu60.g((qje.P(dVar).S == LayoutDirection.Rtl && dVar.P == Orientation.Horizontal) ? -1.0f : 1.0f, j);
                o62Var.a(dVar.O.f(Float.intBitsToFloat((int) (dVar.P == Orientation.Vertical ? g & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : g >> 32))), 0.0f);
                return zy11Var;
            case 15:
                showStaticFogAnimated$lambda$0 = AnimatedCircularHoleFogView.showStaticFogAnimated$lambda$0((AnimatedCircularHoleFogView) obj4, (Runnable) obj3, ((Boolean) obj).booleanValue());
                return showStaticFogAnimated$lambda$0;
            case 16:
                zo2 zo2Var = (zo2) obj3;
                ((qx60) obj4).b(zo2Var);
                return new w50(4, zo2Var);
            case 17:
                final com.ybsdk.common.repositiories.applications.b bVar2 = (com.ybsdk.common.repositiories.applications.b) obj4;
                final String str6 = (String) obj3;
                ((l8x) obj).w(new tls() { // from class: com.ybsdk.common.repositiories.applications.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj6) {
                        b bVar3 = b.this;
                        tje.N(bVar3.b, null, null, new ApplicationRepositoryImpl$removeApplication$1(bVar3, str6, null), 3);
                        return zy11.a;
                    }
                });
                return zy11Var;
            case 18:
                va3 va3Var = (va3) obj4;
                String str7 = (String) obj3;
                yab yabVar = (yab) obj;
                va3Var.getClass();
                MessageData R = yabVar.R();
                VoiceMessageData voiceMessageData = R instanceof VoiceMessageData ? (VoiceMessageData) R : null;
                if (voiceMessageData == null || (str = voiceMessageData.fileId) == null) {
                    return null;
                }
                b00 b00Var = va3Var.c;
                oy31 oy31Var = va3Var.b;
                ServerMessageRef q0 = yabVar.q0();
                String str8 = voiceMessageData.fileName;
                return new az31(str, q0, str7, new ly31(p8b.a(str7), b00Var, oy31Var, str, str8 == null ? "" : str8), voiceMessageData.duration);
            case 19:
                ((wh6) obj4).submit(new hc(24, (tls) obj, (sls) obj3));
                return zy11Var;
            case 20:
                xqi0 S = ((ccg) ((kt11) obj)).a.S();
                q5z.h(S);
                S.f(((un90) obj4).b);
                Activity activity = ((do3) obj3).b;
                activity.setResult(-1);
                activity.finish();
                return zy11Var;
            case 21:
                lambda$1$lambda$0 = AutoFundEditView.lambda$1$lambda$0((LoadableInput) obj4, (AutoFundEditView) obj3, (Editable) obj);
                return lambda$1$lambda$0;
            case 22:
                String str9 = (String) obj4;
                AutoPullPermissionEntity$Status autoPullPermissionEntity$Status = (AutoPullPermissionEntity$Status) obj3;
                ls3 ls3Var = (ls3) obj;
                List<ks3> list = ls3Var.a;
                ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                for (ks3 ks3Var : list) {
                    arrayList2.add(new ks3(ks3Var.a, ks3Var.b, ks3Var.c, ks3Var.d, jl40.l(ks3Var.a, str9) ? autoPullPermissionEntity$Status : AutoPullPermissionEntity$Status.DEFAULT));
                }
                return ls3.a(ls3Var, arrayList2);
            case 23:
                Object obj6 = (dqg) obj4;
                com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation.a aVar = (com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation.a) obj3;
                if (obj6 instanceof bqg) {
                    aVar.D.n(EmptyList.a, Me2mePullDebitEvents$Me2mePullDebitPermissionListLoadedResult.ERROR);
                    return new s8j0(new FailDataException((ct11) obj6));
                }
                if (!(obj6 instanceof cqg)) {
                    w511.b();
                    return null;
                }
                us3 us3Var = aVar.D;
                Object obj7 = ((cqg) obj6).a;
                us3Var.n(((ls3) obj7).a, Me2mePullDebitEvents$Me2mePullDebitPermissionListLoadedResult.OK);
                return new r8j0(obj7, r9, 14);
            case 24:
                showDayOfMonthBottomSheet$lambda$59$lambda$58 = AutoTopupRegularFragment.showDayOfMonthBottomSheet$lambda$59$lambda$58((yx3) obj4, (AutoTopupRegularFragment) obj3, (x630) obj);
                return showDayOfMonthBottomSheet$lambda$59$lambda$58;
            case 25:
                AutotopupPaymentStatusResultDataEntity autotopupPaymentStatusResultDataEntity = (AutotopupPaymentStatusResultDataEntity) obj4;
                com.ybsdk.feature.autotopup.internal.presentation.result.b bVar3 = (com.ybsdk.feature.autotopup.internal.presentation.result.b) obj3;
                wy3 wy3Var = (wy3) obj;
                List list2 = wy3Var.k;
                ThemedImageUrlEntity logo = autotopupPaymentStatusResultDataEntity != null ? autotopupPaymentStatusResultDataEntity.getLogo() : null;
                Text title2 = autotopupPaymentStatusResultDataEntity != null ? autotopupPaymentStatusResultDataEntity.getTitle() : null;
                Text description = autotopupPaymentStatusResultDataEntity != null ? autotopupPaymentStatusResultDataEntity.getDescription() : null;
                Text amount = autotopupPaymentStatusResultDataEntity != null ? autotopupPaymentStatusResultDataEntity.getAmount() : null;
                ActionButtonEntity primaryButton = autotopupPaymentStatusResultDataEntity != null ? autotopupPaymentStatusResultDataEntity.getPrimaryButton() : null;
                ActionButtonEntity secondaryButton = autotopupPaymentStatusResultDataEntity != null ? autotopupPaymentStatusResultDataEntity.getSecondaryButton() : null;
                if (autotopupPaymentStatusResultDataEntity == null || autotopupPaymentStatusResultDataEntity.isLogoWithStatus()) {
                    AutotopupPaymentStatusResultDataEntity.Status status = autotopupPaymentStatusResultDataEntity != null ? autotopupPaymentStatusResultDataEntity.getStatus() : null;
                    int i5 = status == null ? -1 : yy3.a[status.ordinal()];
                    if (i5 != -1) {
                        if (i5 == 1) {
                            bVar3.F.d(list2);
                            autoTopupLogoResultStatus = AutoTopupLogoResultStatus.SUCCESS;
                        } else if (i5 != 2) {
                            if (i5 != 3) {
                                w511.b();
                                return null;
                            }
                            bVar3.F.a.e.d(AutotopupEvents$AutoTopupSettingsResultScreenShownResult.TIMEOUT, null, list2);
                            autoTopupLogoResultStatus = AutoTopupLogoResultStatus.TIMEOUT;
                        }
                    }
                    bVar3.F.a.e.d(AutotopupEvents$AutoTopupSettingsResultScreenShownResult.ERROR, String.valueOf((autotopupPaymentStatusResultDataEntity == null || (title = autotopupPaymentStatusResultDataEntity.getTitle()) == null) ? null : com.ybsdk.core.utils.text.d.a(bVar3.G, title)), list2);
                    autoTopupLogoResultStatus = AutoTopupLogoResultStatus.FAILED;
                } else {
                    autoTopupLogoResultStatus = AutoTopupLogoResultStatus.HIDDEN;
                }
                AutoTopupLogoResultStatus autoTopupLogoResultStatus3 = autoTopupLogoResultStatus;
                ba4 ba4Var = wy3Var.i;
                return wy3.a(wy3Var, logo, title2, description, primaryButton, secondaryButton, null, autoTopupLogoResultStatus3, false, ba4Var != null ? new ba4(ba4Var.a, ba4Var.b, ba4Var.c, autotopupPaymentStatusResultDataEntity != null ? autotopupPaymentStatusResultDataEntity.getSaveAutoTopupRequest() : null, autotopupPaymentStatusResultDataEntity != null ? autotopupPaymentStatusResultDataEntity.getLoadingData() : null, autotopupPaymentStatusResultDataEntity != null ? autotopupPaymentStatusResultDataEntity.getFailedPaymentId() : null, autotopupPaymentStatusResultDataEntity != null ? autotopupPaymentStatusResultDataEntity.getRegularAutotopup() : null) : null, amount, 1024);
            case 26:
                ca4 ca4Var = (ca4) obj4;
                com.ybsdk.feature.autotopup.internal.presentation.result.b bVar4 = (com.ybsdk.feature.autotopup.internal.presentation.result.b) obj3;
                wy3 wy3Var2 = (wy3) obj;
                ThemedImageUrlEntity themedImageUrlEntity = ca4Var.c;
                Text text = ca4Var.a;
                Text text2 = ca4Var.b;
                ActionButtonEntity actionButtonEntity = ca4Var.e;
                int i6 = zy3.a[ca4Var.d.ordinal()];
                if (i6 == 1) {
                    bVar4.F.d(wy3Var2.k);
                    autoTopupLogoResultStatus2 = AutoTopupLogoResultStatus.SUCCESS;
                } else {
                    if (i6 != 2) {
                        w511.b();
                        return null;
                    }
                    bVar4.F.a.e.d(AutotopupEvents$AutoTopupSettingsResultScreenShownResult.ERROR, com.ybsdk.core.utils.text.d.a(bVar4.G, ca4Var.a).toString(), wy3Var2.k);
                    autoTopupLogoResultStatus2 = AutoTopupLogoResultStatus.FAILED;
                }
                return wy3.a(wy3Var2, themedImageUrlEntity, text, text2, actionButtonEntity, null, null, autoTopupLogoResultStatus2, false, null, null, 1968);
            case 27:
                ArrayList arrayList3 = (ArrayList) obj3;
                u04 u04Var = (u04) obj;
                iaa0 iaa0Var = ((u04) ((com.ybsdk.feature.autotopup.internal.presentation.setup.v2.b) obj4).X()).i;
                return u04.a(u04Var, null, null, null, null, null, null, null, null, iaa0Var != null ? new iaa0(iaa0Var.a, new uda0(arrayList3, iaa0Var.b.b)) : null, null, null, null, null, null, false, 32511);
            case 28:
                com.ybsdk.feature.autotopup.internal.presentation.setup.v2.b bVar5 = (com.ybsdk.feature.autotopup.internal.presentation.setup.v2.b) obj3;
                m04 m04Var = bVar5.J;
                u04 u04Var2 = (u04) obj;
                int i7 = z04.a[((AutoTopupSettingType) obj4).ordinal()];
                if (i7 == 1) {
                    r24 r24Var = ((u04) bVar5.X()).e;
                    if (r24Var != null) {
                        MoneyEntity moneyEntity5 = ((u04) bVar5.X()).f;
                        if (moneyEntity5 != null) {
                            Locale locale = tm60.a;
                            r24Var = r24.a(r24Var, null, MoneyEntity.copy$default(moneyEntity5, null, null, tm60.b(moneyEntity5.getAmount()), 3, null), 1);
                        }
                    } else {
                        r24Var = null;
                    }
                    m04Var.a.e.h("autofund", (r24Var == null || (moneyEntity = r24Var.b) == null) ? null : moneyEntity.getFormattedAmount(), null, AutotopupEvents$AutoTopupSettingsShortCutLimitsChangeVersion.V2);
                    if (r24Var != null) {
                        lu3Var = new lu3(new ou3(r24Var.b.getFormattedAmount(), false));
                    }
                } else {
                    if (i7 != 2) {
                        w511.b();
                        return null;
                    }
                    s24 s24Var = ((u04) bVar5.X()).d;
                    m04Var.a.e.h("autotopup", (s24Var == null || (moneyEntity3 = s24Var.d) == null) ? null : moneyEntity3.getFormattedAmount(), (s24Var == null || (moneyEntity2 = s24Var.c) == null) ? null : moneyEntity2.getFormattedAmount(), AutotopupEvents$AutoTopupSettingsShortCutLimitsChangeVersion.V2);
                    s24 s24Var2 = ((u04) bVar5.X()).d;
                    if (s24Var2 != null) {
                        ou3 ou3Var = new ou3(s24Var2.c.getFormattedAmount(), false);
                        ou3 ou3Var2 = new ou3(s24Var2.d.getFormattedAmount(), false);
                        AutoTopupType autoTopupType = s24Var2.b;
                        int i8 = autoTopupType == null ? -1 : kv3.b[autoTopupType.ordinal()];
                        if (i8 == -1) {
                            autoTopupBottomSheetV2State$AutoTopupEdit$FocusInput = AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput.NONE;
                        } else if (i8 == 1) {
                            autoTopupBottomSheetV2State$AutoTopupEdit$FocusInput = AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput.THRESHOLD;
                        } else {
                            if (i8 != 2) {
                                w511.b();
                                return null;
                            }
                            autoTopupBottomSheetV2State$AutoTopupEdit$FocusInput = AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput.AMOUNT;
                        }
                        lu3Var = new mu3(ou3Var, ou3Var2, autoTopupBottomSheetV2State$AutoTopupEdit$FocusInput);
                    }
                }
                return u04.a(u04Var2, null, null, null, null, null, null, lu3Var, null, null, null, null, null, null, null, false, 32671);
            default:
                nr3 nr3Var = (nr3) obj4;
                u04 u04Var3 = (u04) obj;
                r24 r24Var2 = ((u04) ((com.ybsdk.feature.autotopup.internal.presentation.setup.v2.b) obj3).X()).e;
                if (r24Var2 != null && (moneyEntity4 = r24Var2.b) != null) {
                    str2 = moneyEntity4.getFormattedAmount();
                }
                return u04.a(u04Var3, null, null, null, null, z1b1.d(nr3Var, str2 != null ? str2 : ""), null, null, null, null, null, null, null, null, null, false, 32751);
        }
    }

    public /* synthetic */ v5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
