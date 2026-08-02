package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.bricks.Brick;
import com.yandex.bricks.BrickSlotView;
import com.yandex.go.benefits_center.activation.analytics.AddBenefitAnalytics$AddBenefitCloseAction;
import com.yandex.go.benefits_center.benefits.router.d;
import com.yandex.go.benefits_center.data.model.BenefitsCenterBanner;
import com.yandex.go.navigator.map_interactions.parkings.h;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.SearchType;
import com.yandex.mapkit.search.Session;
import com.yandex.messaging.views.WaveformView;
import com.yandex.payment.sdk.ui.payment.sbp.c;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.Acquirer;
import com.yandex.xplat.payment.sdk.BindingServiceError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import com.yandex.xplat.payment.sdk.PaymethodMarkup;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.b;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationFragment;
import com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueFragment;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes3.dex */
public final /* synthetic */ class w04 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w04(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MoneyEntity moneyEntity;
        MoneyEntity moneyEntity2;
        float f;
        float f2;
        float floatValue;
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        g updateInput$lambda$24$lambda$22;
        YbButtonView.a render$lambda$7$lambda$4$lambda$2;
        int i = this.a;
        int i2 = 9;
        int i3 = 4;
        int i4 = 2;
        int i5 = 1;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        String str2 = null;
        zy11 zy11Var = zy11.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                b24 b24Var = (b24) obj6;
                b bVar = (b) obj5;
                u04 u04Var = (u04) obj;
                s24 s24Var = ((u04) bVar.X()).d;
                String formattedAmount = (s24Var == null || (moneyEntity2 = s24Var.c) == null) ? null : moneyEntity2.getFormattedAmount();
                if (formattedAmount == null) {
                    formattedAmount = "";
                }
                s24 s24Var2 = ((u04) bVar.X()).d;
                String formattedAmount2 = (s24Var2 == null || (moneyEntity = s24Var2.d) == null) ? null : moneyEntity.getFormattedAmount();
                return u04.a(u04Var, null, null, null, z1b1.e(b24Var, formattedAmount, formattedAmount2 != null ? formattedAmount2 : ""), null, null, null, null, null, null, null, null, null, null, false, 32759);
            case 1:
                zb4 zb4Var = (zb4) obj6;
                ac4 ac4Var = (ac4) obj5;
                a0z0 a0z0Var = zb4Var.a;
                if (a0z0Var != null) {
                    a0z0Var.b();
                }
                zb4Var.a = null;
                fyc fycVar = ac4Var.b;
                if (fycVar != null) {
                    fycVar.T(zy11Var);
                }
                ac4Var.b = null;
                return zy11Var;
            case 2:
                qe4 qe4Var = (qe4) obj6;
                sfd sfdVar = (sfd) obj5;
                j750 j750Var = qe4Var.a;
                if (j750Var != null) {
                    j750.a(j750Var, sfdVar.b);
                } else {
                    qx60 qx60Var = qe4Var.b;
                    if (qx60Var == null) {
                        ny61.r("Unreachable");
                        return null;
                    }
                    qx60Var.b(sfdVar.a);
                }
                return new te4(0, qe4Var, sfdVar);
            case 3:
                nf4 nf4Var = (nf4) obj6;
                rs20 rs20Var = (rs20) obj5;
                String str3 = (String) obj;
                nf4Var.f = str3;
                if (str3.equals(rs20Var.a)) {
                    ((y22) nf4Var.e).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "При обновлении токена авторизации получен такой же токен", "received_same_oauth_token"));
                }
                return new rs20(str3, rs20Var.b);
            case 4:
                k6w k6wVar = (k6w) obj;
                ((yx40) obj6).setIntValue((int) (k6wVar.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                ((yx40) obj5).setIntValue((int) (k6wVar.a >> 32));
                return zy11Var;
            case 5:
                LayoutDirection layoutDirection = (LayoutDirection) obj5;
                qam qamVar = (qam) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                k0u k0uVar = ((tg4) obj6).a;
                j0u j0uVar = k0uVar.a;
                Float f3 = j0uVar.c;
                if (f3 != null) {
                    float floatValue2 = f3.floatValue();
                    if (floatValue2 > intBitsToFloat) {
                        floatValue2 = intBitsToFloat;
                    }
                    if (floatValue2 < 0.0f) {
                        floatValue2 = 0.0f;
                    }
                    f = qamVar.w0(floatValue2);
                } else {
                    f = intBitsToFloat;
                }
                Float f4 = j0uVar.d;
                if (f4 != null) {
                    float floatValue3 = f4.floatValue();
                    if (floatValue3 > intBitsToFloat2) {
                        floatValue3 = intBitsToFloat2;
                    }
                    if (floatValue3 < 0.0f) {
                        floatValue3 = 0.0f;
                    }
                    f2 = qamVar.w0(floatValue3);
                } else {
                    f2 = intBitsToFloat2;
                }
                Float f5 = j0uVar.a;
                Float valueOf = f5 != null ? Float.valueOf(qamVar.w0(f5.floatValue())) : null;
                int i6 = mh4.a[layoutDirection.ordinal()];
                if (i6 == 1) {
                    if (valueOf != null) {
                        floatValue = (intBitsToFloat - valueOf.floatValue()) - f;
                    }
                    floatValue = (intBitsToFloat - f) / 2.0f;
                } else {
                    if (i6 != 2) {
                        w511.b();
                        return null;
                    }
                    if (valueOf != null) {
                        floatValue = valueOf.floatValue();
                    }
                    floatValue = (intBitsToFloat - f) / 2.0f;
                }
                Float f6 = j0uVar.b;
                float w0 = f6 != null ? qamVar.w0(f6.floatValue()) : (intBitsToFloat2 - f2) / 2.0f;
                Float f7 = j0uVar.e;
                float w02 = f7 != null ? qamVar.w0(f7.floatValue()) : 0.0f;
                ldc ldcVar = k0uVar.b;
                qam.g0(qamVar, ldcVar != null ? ldcVar.a : ldc.l, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(w0) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(w02) << 32) | (Float.floatToRawIntBits(w02) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), null, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
                Float f8 = k0uVar.c;
                if (f8 != null) {
                    float floatValue4 = f8.floatValue();
                    ldc ldcVar2 = k0uVar.d;
                    qam.g0(qamVar, ldcVar2 != null ? ldcVar2.a : ldc.l, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(w0) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(w02) << 32) | (Float.floatToRawIntBits(w02) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), new jvu0(0, 0, 30, qamVar.w0(floatValue4), 0.0f), 224);
                }
                return zy11Var;
            case 6:
                c cVar = (c) obj5;
                List list = (List) obj;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://qr.nspk.ru/"));
                intent.addCategory("android.intent.category.BROWSABLE");
                Context context = ((up4) obj6).a;
                PackageManager packageManager = context.getPackageManager();
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0);
                List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent, 64);
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : queryIntentActivities2) {
                    ResolveInfo resolveInfo = (ResolveInfo) obj7;
                    Iterator<T> it = queryIntentActivities.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj4 = it.next();
                            if (jl40.l(resolveInfo.activityInfo.packageName, ((ResolveInfo) obj4).activityInfo.packageName)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    if (obj4 == null) {
                        arrayList.add(obj7);
                    }
                }
                PackageManager packageManager2 = context.getPackageManager();
                ArrayList arrayList2 = new ArrayList();
                for (ApplicationInfo applicationInfo : packageManager2.getInstalledApplications(0)) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj8 : list) {
                        String str4 = ((ml60) obj8).d;
                        if (str4 != null ? evu0.y(applicationInfo.packageName, str4, z) : z) {
                            arrayList3.add(obj8);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (jl40.l(((ml60) obj2).d, applicationInfo.packageName)) {
                            }
                        } else {
                            obj2 = str2;
                        }
                    }
                    ml60 ml60Var = (ml60) obj2;
                    if (ml60Var == null) {
                        ml60Var = (ml60) a.R(arrayList3);
                    }
                    if (ml60Var != null) {
                        String str5 = ml60Var.h;
                        String str6 = ml60Var.c;
                        Boolean bool = ml60Var.g;
                        Boolean bool2 = ml60Var.f;
                        String str7 = ml60Var.e;
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj3 = it3.next();
                                if (jl40.l(((ResolveInfo) obj3).activityInfo.packageName, applicationInfo.packageName)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        ResolveInfo resolveInfo2 = (ResolveInfo) obj3;
                        if (resolveInfo2 != null) {
                            arrayList2.add(new kp4(resolveInfo2.activityInfo.loadLabel(packageManager2).toString(), str6, resolveInfo2, str7 == null ? "" : str7, n891.o(bool2), str5, n891.p(bool)));
                        } else {
                            Intent intent2 = new Intent();
                            intent2.setPackage(applicationInfo.packageName);
                            intent2.addCategory("android.intent.category.LAUNCHER");
                            ResolveInfo resolveActivity = packageManager2.resolveActivity(intent2, 0);
                            if (resolveActivity != null) {
                                arrayList2.add(new kp4(resolveActivity.activityInfo.loadLabel(packageManager2).toString(), str6, resolveActivity, str7 == null ? "" : str7, n891.o(bool2), str5, n891.p(bool)));
                            }
                        }
                    }
                    z = false;
                    str2 = null;
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    if (hashSet.add(((kp4) next).b)) {
                        arrayList4.add(next);
                    }
                }
                n891.n(new mw2(14, cVar, arrayList4));
                return zy11Var;
            case 7:
                return new vp4((ListItemComponent) obj, (tls) obj6, (g1a0) obj5, objArr == true ? 1 : 0);
            case 8:
                Float f9 = (Float) obj;
                f9.getClass();
                ((wls) obj6).invoke((View) obj5, f9);
                return zy11Var;
            case 9:
                WaveformView.a aVar = (WaveformView.a) obj;
                aVar.b = (byte[]) obj6;
                sh3 sh3Var = (sh3) ((dd5) obj5).T2.h;
                aVar.a = Float.valueOf(sh3Var.c / sh3Var.b);
                return zy11Var;
            case 10:
                tls tlsVar = (tls) obj5;
                hoy0 hoy0Var = (hoy0) obj;
                if (!jl40.l((hoy0) obj6, hoy0Var)) {
                    tlsVar.invoke(hoy0Var);
                }
                return zy11Var;
            case 11:
                BenefitsCenterBanner benefitsCenterBanner = (BenefitsCenterBanner) obj5;
                in5 in5Var = (in5) obj;
                b1 b1Var = ((dm5) obj6).G;
                String str8 = benefitsCenterBanner.d.a;
                b1Var.b(str8 != null ? str8 : "", AddBenefitAnalytics$AddBenefitCloseAction.ApplyButton);
                String str9 = benefitsCenterBanner.d.a;
                ru.yandex.taxi.communications.api.dto.ticket.a aVar2 = benefitsCenterBanner.e;
                d dVar = in5Var.a;
                dVar.T.J(aVar2, str9, new gn5(dVar, in5Var.b, i4));
                return zy11Var;
            case 12:
                bt5 bt5Var = (bt5) obj6;
                mka0 mka0Var = (mka0) obj5;
                fvv fvvVar = (fvv) obj;
                bg11.a = fvvVar.k;
                y22 y22Var = bt5Var.h;
                y22Var.b.b("purchase_token", fvvVar.h);
                km0 km0Var = y22Var.b;
                Acquirer acquirer = fvvVar.j;
                if (acquirer != null) {
                    km0Var.b("acquirer", acquirer.getValue());
                }
                String str10 = fvvVar.l;
                PaymethodMarkup paymethodMarkup = fvvVar.o;
                String card = paymethodMarkup != null ? paymethodMarkup.getCard() : null;
                String str11 = fvvVar.m;
                km0Var.b("purchase_total_amount", str10);
                if (card != null) {
                    km0Var.b("purchase_card_amount", card);
                }
                km0Var.b("purchase_currency", str11);
                km0Var.b("initialization_id", String.valueOf(System.currentTimeMillis()));
                bt5Var.l = fvvVar;
                bt5Var.m = mka0Var.b;
                bt5Var.p = fvvVar.g.equals("psp");
                bt5Var.q = fvvVar.q;
                q7w q7wVar = fvvVar.t;
                bt5Var.k.invoke(q7wVar);
                rwo rwoVar = bt5Var.g;
                sv90 sv90Var = qv90.a;
                if (q7wVar != null && (str = q7wVar.a) != null) {
                    str2 = str;
                }
                sv90Var.getClass();
                ((y22) rwoVar).a(sv90.t(str2));
                return zmx.d(fvvVar);
            case 13:
                bx5 bx5Var = (bx5) obj6;
                sr4 sr4Var = (sr4) obj5;
                ny21 ny21Var = (ny21) obj;
                String str12 = ny21Var.c;
                rwo rwoVar2 = bx5Var.l;
                sv90 sv90Var2 = qv90.a;
                String str13 = ny21Var.b;
                String str14 = ny21Var.a;
                String str15 = ny21Var.d;
                String str16 = str15 == null ? "" : str15;
                String str17 = str12 == null ? "" : str12;
                sv90Var2.getClass();
                String p = g8e.p(g8e.p(g8e.p("Начало верификации новой карты при привязке через Vera: bind_card_binding_id = ".concat(str13), ", bind_card_verification_id = ", str14), ", bind_card_message_code = ", str16), ", bind_card_status = ", str17);
                wj00 i7 = vfc.i(0, "bind_card_binding_id", str13, "bind_card_verification_id", str14);
                i7.k("bind_card_message_code", str16);
                i7.k("bind_card_status", str17);
                i7.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p);
                ((y22) rwoVar2).a(y891.c("new_card_binding_psp_verification_started", i7));
                if (!jl40.l(str12, "warning")) {
                    return bx5Var.a(str14, sr4Var).h(new kv5(6, ny21Var));
                }
                ((y22) rwoVar2).a(sv90.b0(str15 == null ? "" : str15));
                return zmx.c(new BindingServiceError(ExternalErrorKind.warning, ExternalErrorTrigger.mobile_backend, null, ny21Var.c, str15 == null ? "" : str15));
            case 14:
                bx5 bx5Var2 = (bx5) obj6;
                n560 n560Var = (n560) obj;
                String str18 = n560Var.a;
                bib bibVar = new bib(str18, bx5Var2.h, i4);
                rwo rwoVar3 = bx5Var2.l;
                qv90.a.getClass();
                y22 y22Var2 = (y22) rwoVar3;
                y22Var2.a(y891.c("bind_new_card_binding_completed", vfc.i(0, "bind_card_binding_id", str18, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Завершение привязки: bind_card_binding_id = ".concat(str18))));
                wj00 wj00Var = new wj00(0);
                wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Запрос на верификацию новой карты");
                iho c = y891.c("bind_new_card_verify_verify", wj00Var);
                md51 f10 = bx5Var2.f.a.f(bibVar, new rv10(26), NetworkServiceRetryingStrategy.retryOnce);
                y22Var2.b(c, f10);
                return f10.g(new q(21, bx5Var2, n560Var, (hh5) obj5));
            case 15:
                bx5 bx5Var3 = (bx5) obj5;
                wvb1 wvb1Var = new wvb1((mu5) obj6);
                rwo rwoVar4 = bx5Var3.l;
                sv90 sv90Var3 = qv90.a;
                String str19 = ((uv5) obj).d;
                sv90Var3.getClass();
                ((y22) rwoVar4).a(y891.c("bind_sbp_token_received_purchase_token", vfc.i(0, "sbp_bind_purchase_token", str19, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Получен purchase token привязочного платежа: ".concat(str19))));
                w18 w18Var = new w18();
                bx5Var3.q = w18Var;
                return mz91.c(new zw5(bx5Var3, str19, objArr2 == true ? 1 : 0), new kv5(i3, wvb1Var), new kdd0(str2, new wdz(), bx5Var3.o.a, w18Var)).f(new ar5(7)).g(new ar5(8)).d(new yw5(bx5Var3, 1));
            case 16:
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                qam.p(c1yVar, (jb2) obj6, (ml6) obj5, 0.0f, null, 60);
                return zy11Var;
            case 17:
                c1y c1yVar2 = (c1y) obj;
                c1yVar2.a();
                qam.p(c1yVar2, ((fx80) obj6).a, (ml6) obj5, 0.0f, null, 60);
                return zy11Var;
            case 18:
                com.yandex.bricks.c cVar2 = (com.yandex.bricks.c) obj6;
                fk6 insert = ((BrickSlotView) obj).insert((Brick) obj5);
                insert.isUsed();
                z83.i();
                insert.setOnInsertListener(new m6(23, cVar2));
                cVar2.d = null;
                return zy11Var;
            case 19:
                ((ok6) obj6).a.j((gge) obj5);
                return zy11Var;
            case 20:
                uv6 uv6Var = (uv6) ((pm5) obj5).b;
                rv6 rv6Var = (rv6) obj;
                ((sv6) ((uv6) obj6).I).getClass();
                if (jl40.l(rv6Var, pv6.a)) {
                    uv6Var.r(new qu(i2));
                } else {
                    if (!(rv6Var instanceof qv6)) {
                        w511.b();
                        return null;
                    }
                    uv6Var.r(new wk6(5));
                }
                return zy11Var;
            case 21:
                return Long.valueOf(((uc7) obj6).b.e((oll0) obj, (vc7) obj5));
            case 22:
                ((Boolean) obj).getClass();
                ((gs7) obj6).b.g((ScreenPoint) obj5);
                return zy11Var;
            case 23:
                ry7 ry7Var = (ry7) obj6;
                jy7 jy7Var = (jy7) obj5;
                qy7 qy7Var = (qy7) obj;
                String str20 = qy7Var.b;
                String str21 = ry7Var.b;
                String str22 = ry7Var.a;
                boolean l = jl40.l(str20, str21);
                if (l && jl40.l(qy7Var.a, str22)) {
                    jy7Var.a.e(str22, str21, false);
                    return qy7.a(qy7Var, null, null, null, null, 8);
                }
                if (l) {
                    jy7Var.a.e(str22, str21, true);
                    return qy7.a(qy7Var, ry7Var.a, ry7Var.b, null, null, 12);
                }
                jy7Var.a.e(str22, str21, true);
                return qy7.a(qy7Var, ry7Var.a, ry7Var.b, null, null, 8);
            case 24:
                cz7 cz7Var = (cz7) obj6;
                tls tlsVar2 = (tls) obj5;
                u6y u6yVar = (u6y) obj;
                String str23 = cz7Var.a;
                if (str23 != null) {
                    u6y.b(u6yVar, null, new androidx.compose.runtime.internal.a(-1182961929, new le(str23, 15), true), 3);
                }
                ArrayList arrayList5 = cz7Var.b;
                m6y m6yVar = (m6y) u6yVar;
                m6yVar.f(arrayList5.size(), null, new ly7(arrayList5, (int) (objArr3 == true ? 1 : 0)), new androidx.compose.runtime.internal.a(2039820996, new yc0(arrayList5, tlsVar2, i5, cz7Var), true));
                xy7 xy7Var = cz7Var.c;
                if (xy7Var != null) {
                    u6y.b(m6yVar, null, new androidx.compose.runtime.internal.a(1163586504, new sp5(i2, xy7Var, tlsVar2), true), 3);
                }
                return zy11Var;
            case 25:
                ((tls) obj6).invoke(new vy7(((Integer) obj).intValue(), ((az7) obj5).c));
                return zy11Var;
            case 26:
                h hVar = (h) obj6;
                String str24 = (String) obj5;
                SearchManager searchManager = (SearchManager) obj;
                Session session = hVar.h;
                if (session != null) {
                    session.cancel();
                }
                SearchOptions searchOptions = new SearchOptions();
                searchOptions.setSearchTypes(SearchType.BIZ.value);
                hVar.h = searchManager.resolveURI(str24, searchOptions, hVar.j);
                return zy11Var;
            case 27:
                updateInput$lambda$24$lambda$22 = CardActivationFragment.updateInput$lambda$24$lambda$22((ia8) obj6, (CardActivationFragment) obj5, (g) obj);
                return updateInput$lambda$24$lambda$22;
            case 28:
                yb8 yb8Var = (yb8) obj6;
                yb8Var.a.b = yb8Var.c;
                shb1.e(new u08(i3, (lh8) obj5, (YSError) obj));
                return zy11Var;
            default:
                render$lambda$7$lambda$4$lambda$2 = CardIssueFragment.render$lambda$7$lambda$4$lambda$2((CardIssueFragment) obj6, (yh8) obj5, (YbButtonView.a) obj);
                return render$lambda$7$lambda$4$lambda$2;
        }
    }
}
