package com.yandex.passport.internal.ui.sloth.authsdk;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.yandex.passport.R;
import com.yandex.passport.api.d2;
import com.yandex.passport.api.w1;
import com.yandex.passport.internal.social.VkNativeSocialAuthActivity;
import com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationActivity;
import com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardComposeActivity;
import com.yandex.passport.internal.ui.sloth.webcard.z0;
import com.yandex.passport.internal.widget.ErrorView;
import com.yandex.passport.sloth.ui.a1;
import com.yandex.passport.sloth.ui.e1;
import defpackage.a4g;
import defpackage.aw5;
import defpackage.b6e;
import defpackage.bjt;
import defpackage.ca8;
import defpackage.dq7;
import defpackage.ern;
import defpackage.fm6;
import defpackage.gfu;
import defpackage.gld;
import defpackage.im6;
import defpackage.is6;
import defpackage.j5;
import defpackage.j5h;
import defpackage.jfu;
import defpackage.lm4;
import defpackage.mip;
import defpackage.mn7;
import defpackage.mw3;
import defpackage.tah;
import defpackage.u75;
import defpackage.vwb;
import defpackage.x97;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h0(fm6 fm6Var) {
        this.a = 15;
        this.b = (kotlin.coroutines.a) fm6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.yandex.passport.internal.l lVar;
        Integer num;
        String num2;
        String str;
        com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a aVar;
        int i = this.a;
        int i2 = 1;
        Continuation continuation = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                i0 i0Var = (i0) obj;
                com.yandex.passport.data.network.l lVar2 = new com.yandex.passport.data.network.l();
                lVar2.a = com.yandex.passport.internal.ui.sloth.h.b(i0Var.a, i0Var.b, null, 6);
                return lVar2.s().f();
            case 1:
                int i3 = BiometricVerificationActivity.a;
                ((BiometricVerificationActivity) obj).finish();
                return Unit.a;
            case 2:
                com.yandex.passport.internal.ui.sloth.ebs.j0 j0Var = (com.yandex.passport.internal.ui.sloth.ebs.j0) obj;
                return new com.yandex.passport.internal.ui.sloth.ebs.a0(j0Var.a, j0Var.c, j0Var.d, j0Var.e, j0Var.f, j0Var.g, j0Var.i, j0Var.h, j0Var.j);
            case 3:
                int i4 = UserMenuActivity.d;
                com.yandex.passport.internal.ui.a.r((UserMenuActivity) obj, com.yandex.plus.core.network.api.utils.a.G(d2.a));
                return Unit.a;
            case 4:
                com.yandex.passport.internal.ui.sloth.menu.o oVar = (com.yandex.passport.internal.ui.sloth.menu.o) obj;
                com.yandex.passport.data.network.l lVar3 = new com.yandex.passport.data.network.l();
                com.yandex.passport.internal.ui.sloth.menu.m mVar = oVar.a;
                com.yandex.passport.internal.ui.sloth.menu.u uVar = oVar.c;
                com.yandex.passport.internal.ui.bouncer.sloth.a aVar2 = oVar.b;
                int i5 = R.color.passport_roundabout_background;
                aVar2.getClass();
                aVar2.d.c = Integer.valueOf(i5);
                mVar.getClass();
                uVar.getClass();
                lVar3.a = new com.yandex.passport.sloth.ui.dependencies.m(mVar.a, mVar.b, uVar, mVar.c, mVar.d, mVar.e, aVar2, mVar.f, new com.yandex.passport.internal.ui.sloth.j(), mVar.g, mVar.h);
                return lVar3.s().f();
            case 5:
                int i6 = ManagingPlusDevicesActivity.a;
                ((ManagingPlusDevicesActivity) obj).finish();
                return Unit.a;
            case 6:
                ManagingPlusDevicesHelperActivity managingPlusDevicesHelperActivity = (ManagingPlusDevicesHelperActivity) obj;
                int i7 = ManagingPlusDevicesHelperActivity.g;
                jfu viewModelStore = managingPlusDevicesHelperActivity.getViewModelStore();
                gfu defaultViewModelProviderFactory = managingPlusDevicesHelperActivity.getDefaultViewModelProviderFactory();
                is6 defaultViewModelCreationExtras = managingPlusDevicesHelperActivity.getDefaultViewModelCreationExtras();
                viewModelStore.getClass();
                defaultViewModelProviderFactory.getClass();
                defaultViewModelCreationExtras.getClass();
                bjt bjtVar = new bjt(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                lm4 a = ern.a(com.yandex.passport.internal.ui.sloth.plusdevices.j.class);
                String f = a.f();
                if (f != null) {
                    return (com.yandex.passport.internal.ui.sloth.plusdevices.j) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
                }
                xq0.x("Local and anonymous classes can not be ViewModels");
                return null;
            case 7:
                com.yandex.passport.internal.ui.sloth.plusdevices.e0 e0Var = (com.yandex.passport.internal.ui.sloth.plusdevices.e0) obj;
                return new com.yandex.passport.internal.ui.challenge.changecurrent.y(e0Var.b, e0Var.c, e0Var.d, e0Var.e);
            case 8:
                int i8 = RegisterWebAuthNActivity.a;
                ((RegisterWebAuthNActivity) obj).finish();
                return Unit.a;
            case 9:
                com.yandex.passport.internal.ui.sloth.webauthn.p pVar = (com.yandex.passport.internal.ui.sloth.webauthn.p) obj;
                return new com.yandex.passport.internal.ui.sloth.webauthn.k(pVar.b, pVar.c, pVar.d);
            case 10:
                int i9 = WebCardComposeActivity.a;
                ((WebCardComposeActivity) obj).finish();
                return Unit.a;
            case 11:
                com.yandex.passport.internal.ui.sloth.webcard.x xVar = (com.yandex.passport.internal.ui.sloth.webcard.x) obj;
                return new com.yandex.passport.internal.social.esia.o(xVar.c, xVar.d, xVar.e, xVar.f, xVar.g);
            case 12:
                z0 z0Var = (z0) obj;
                com.yandex.passport.data.network.l lVar4 = new com.yandex.passport.data.network.l();
                lVar4.a = com.yandex.passport.internal.ui.sloth.h.b(z0Var.a, z0Var.b, z0Var.c, 4);
                return lVar4.s().f();
            case 13:
                com.yandex.passport.internal.ui.social.j jVar = (com.yandex.passport.internal.ui.social.j) obj;
                Bundle arguments = jVar.getArguments();
                if (arguments == null) {
                    xq0.q("Internal error: arguments can't be null");
                    return null;
                }
                com.yandex.passport.internal.properties.l lVar5 = (com.yandex.passport.internal.properties.l) com.appsflyer.internal.k.h(arguments, com.yandex.passport.internal.util.p.class, "passport-login-properties");
                if (lVar5 == null) {
                    xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.l.class));
                    return null;
                }
                boolean z = arguments.getBoolean("use-native");
                Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(arguments, com.yandex.passport.internal.l.class, "master-account") : arguments.getParcelable("master-account");
                if (parcelable == null) {
                    xq0.q("can't get required parcelable master-account");
                    return null;
                }
                com.yandex.passport.internal.l lVar6 = (com.yandex.passport.internal.l) parcelable;
                Bundle bundle = jVar.i;
                com.yandex.passport.internal.a0 a0Var = jVar.g;
                if (a0Var == null) {
                    Intrinsics.j("configuration");
                    throw null;
                }
                Context requireContext = jVar.requireContext();
                requireContext.getClass();
                return new com.yandex.passport.internal.ui.social.factory.a(lVar5, bundle, lVar6, a0Var, requireContext, z).c();
            case 14:
                com.yandex.passport.internal.ui.social.o oVar2 = (com.yandex.passport.internal.ui.social.o) obj;
                String str2 = com.yandex.passport.internal.ui.social.o.k;
                Bundle arguments2 = oVar2.getArguments();
                if (arguments2 == null) {
                    xq0.q("Internal error: arguments can't be null");
                    return null;
                }
                boolean z2 = arguments2.getBoolean("use-native");
                Bundle bundle2 = arguments2.containsKey("master-account") ? arguments2 : null;
                if (bundle2 != null) {
                    Parcelable parcelable2 = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(bundle2, com.yandex.passport.internal.l.class, "master-account") : bundle2.getParcelable("master-account");
                    if (parcelable2 == null) {
                        xq0.q("can't get required parcelable master-account");
                        return null;
                    }
                    lVar = (com.yandex.passport.internal.l) parcelable2;
                } else {
                    lVar = null;
                }
                com.yandex.passport.internal.a0 a0Var2 = oVar2.g;
                if (a0Var2 == null) {
                    Intrinsics.j("configuration");
                    throw null;
                }
                w1 w1Var = a0Var2.a;
                Context requireContext2 = oVar2.requireContext();
                requireContext2.getClass();
                w1Var.getClass();
                int ordinal = w1Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 5) {
                            num2 = requireContext2.getResources().getString(R.string.passport_default_google_client_id);
                        }
                        str = null;
                    } else {
                        num2 = requireContext2.getResources().getString(R.string.passport_facebook_application_id_override);
                        num2.getClass();
                        if (num2.length() == 0) {
                            ApplicationInfo applicationInfo = requireContext2.getPackageManager().getApplicationInfo(requireContext2.getPackageName(), 128);
                            applicationInfo.getClass();
                            num2 = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationId");
                        }
                    }
                    str = num2;
                } else {
                    List list = VkNativeSocialAuthActivity.b;
                    try {
                        num = Integer.valueOf(requireContext2.getResources().getInteger(R.integer.passport_vk_application_id));
                    } catch (Resources.NotFoundException unused) {
                        num = (Integer) VkNativeSocialAuthActivity.c.get(requireContext2.getPackageName());
                    }
                    if (num != null) {
                        num2 = num.toString();
                        str = num2;
                    }
                    str = null;
                }
                Parcelable parcelable3 = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(arguments2, com.yandex.passport.internal.ui.domik.d.class, "track") : arguments2.getParcelable("track");
                if (parcelable3 == null) {
                    xq0.q("can't get required parcelable track");
                    return null;
                }
                com.yandex.passport.internal.ui.domik.d dVar = (com.yandex.passport.internal.ui.domik.d) parcelable3;
                Bundle bundle3 = oVar2.i;
                com.yandex.passport.internal.a0 a0Var3 = oVar2.g;
                if (a0Var3 == null) {
                    Intrinsics.j("configuration");
                    throw null;
                }
                Context requireContext3 = oVar2.requireContext();
                requireContext3.getClass();
                return new com.yandex.passport.internal.ui.social.factory.a(dVar, str, bundle3, a0Var3, requireContext3, z2, lVar).c();
            case 15:
                dq7 dq7Var = ca8.a;
                return gld.e(j5h.a.g.plus(a4g.n()).plus(new im6("com.yandex.passport.internal.ui.util.ForegroundDetector")).plus((kotlin.coroutines.a) obj));
            case 16:
                return ((com.yandex.passport.internal.usecase.o) obj).a.getSharedPreferences("ebs_initialization_pref", 0);
            case 17:
                com.yandex.passport.internal.usecase.vpn.e eVar = (com.yandex.passport.internal.usecase.vpn.e) obj;
                ((com.yandex.passport.common.coroutine.f) eVar.b).getClass();
                dq7 dq7Var2 = ca8.a;
                x97.y(gld.e(mn7.d), ((com.yandex.passport.common.coroutine.b) eVar.a).c, null, new com.yandex.passport.internal.usecase.vpn.a(eVar, continuation, i2), 2);
                return Unit.a;
            case 18:
                com.yandex.passport.common.network.n nVar = (com.yandex.passport.common.network.n) obj;
                FrameLayout frameLayout = (FrameLayout) nVar.b;
                int paddingTop = frameLayout.getPaddingTop();
                ErrorView[] errorViewArr = (ErrorView[]) nVar.c;
                ArrayList arrayList = new ArrayList(2);
                for (int i10 = 0; i10 < 2; i10++) {
                    arrayList.add(Float.valueOf(errorViewArr[i10].getTranslationY() + r5.getMeasuredHeight()));
                }
                Float a0 = CollectionsKt.a0(arrayList);
                a0.getClass();
                float floatValue = a0.floatValue();
                float f2 = paddingTop;
                if (f2 <= floatValue) {
                    float f3 = floatValue - f2;
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    layoutParams.getClass();
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = (int) f3;
                    frameLayout.setLayoutParams(layoutParams2);
                } else {
                    ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                    layoutParams3.getClass();
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = (int) 0.0f;
                    frameLayout.setLayoutParams(layoutParams4);
                }
                return Unit.a;
            case 19:
                com.yandex.passport.internal.core.accounts.h hVar = (com.yandex.passport.internal.core.accounts.h) obj;
                return new com.yandex.passport.internal.ui.challenge.changecurrent.y((a1) hVar.c, (com.yandex.passport.sloth.ui.g) hVar.d, (com.yandex.passport.sloth.dependencies.i) hVar.e);
            case 20:
                ((com.yandex.passport.sloth.ui.d2) ((com.yandex.passport.internal.flags.experiments.p) obj).c).a(e1.b);
                return Unit.a;
            case 21:
                com.yandex.plus.acquisition.adapter.api.a aVar3 = (com.yandex.plus.acquisition.adapter.api.a) obj;
                return new com.yandex.plus.acquisition.adapter.internal.adapter.a(aVar3.a, aVar3.b);
            case 22:
                j5 j5Var = (j5) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(200L);
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.playTogether(CollectionsKt.g0(u75.h((ValueAnimator) j5Var.a, (ObjectAnimator) j5Var.b, (ObjectAnimator) j5Var.c), j5Var.k()));
                return animatorSet;
            case 23:
                mw3 mw3Var = (mw3) obj;
                Float valueOf = Float.valueOf(1.0f);
                Float valueOf2 = Float.valueOf(0.0f);
                Context context = ((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.f) mw3Var.a).getView().getContext();
                context.getClass();
                float dimensionPixelSize = context.getResources().getDimensionPixelSize(ru.yandex.music.R.dimen.acquisition_sdk_plus_brand_button_corner_radius);
                int ordinal2 = ((com.yandex.plus.core.strings.a) mw3Var.d).ordinal();
                if (ordinal2 == 0) {
                    aVar = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a(new com.yandex.plus.core.gradient.api.b(90.0f, u75.h(Integer.valueOf(Color.parseColor("#FF5C4D")), Integer.valueOf(Color.parseColor("#EB469F")), Integer.valueOf(Color.parseColor("#8341EF")), Integer.valueOf(Color.parseColor("#3F68F9"))), u75.h(valueOf2, Float.valueOf(0.27f), Float.valueOf(0.75f), valueOf)), ru.yandex.music.R.style.AcquisitionSdk_TextAppearance_Button_M, ru.yandex.music.R.style.AcquisitionSdk_TextAppearance_Label_S);
                } else {
                    if (ordinal2 != 1) {
                        b6e.s();
                        return null;
                    }
                    aVar = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a(new com.yandex.plus.core.gradient.api.b(90.0f, u75.h(Integer.valueOf(Color.parseColor("#9C38FF")), Integer.valueOf(Color.parseColor("#9C38FF")), Integer.valueOf(Color.parseColor("#A832F7")), Integer.valueOf(Color.parseColor("#B72AEC")), Integer.valueOf(Color.parseColor("#C537D6")), Integer.valueOf(Color.parseColor("#D445BF")), Integer.valueOf(Color.parseColor("#E656A2")), Integer.valueOf(Color.parseColor("#EF7487")), Integer.valueOf(Color.parseColor("#FFA858"))), u75.h(valueOf2, Float.valueOf(0.38f), Float.valueOf(0.54f), Float.valueOf(0.66f), Float.valueOf(0.74f), Float.valueOf(0.81f), Float.valueOf(0.87f), Float.valueOf(0.93f), valueOf)), ru.yandex.music.R.style.AcquisitionSdk_Yango_TextAppearance_Button_Title5, ru.yandex.music.R.style.AcquisitionSdk_Yango_TextAppearance_Legals_Caption);
                }
                return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a(com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.I(com.yandex.plus.bdui.plus.analytics.b.y(aVar.a, dimensionPixelSize), context.getColor(ru.yandex.music.R.color.acquisition_sdk_color_control_highlight), dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize), aVar.b, aVar.c);
            case 24:
                com.yandex.passport.internal.core.accounts.h hVar2 = (com.yandex.passport.internal.core.accounts.h) obj;
                return new com.yandex.plus.acquisition.sdk.pay.impl.b((com.yandex.plus.pay.a) hVar2.b, (com.yandex.plus.pay.ui.core.a) hVar2.c, (kotlinx.coroutines.a) hVar2.d);
            case 25:
                com.yandex.plus.bdui.flex.utils.b bVar = (com.yandex.plus.bdui.flex.utils.b) obj;
                mip mipVar = new mip();
                mipVar.l(ern.a(com.yandex.plus.bdui.query.e.class), new com.yandex.plus.bdui.flex.factory.o(bVar, 2));
                mipVar.l(ern.a(com.yandex.plus.bdui.query.b.class), new com.yandex.plus.bdui.flex.factory.o(bVar, 0));
                mipVar.l(ern.a(com.yandex.plus.bdui.action.a.class), new com.yandex.plus.bdui.flex.factory.o(bVar, 1));
                return mipVar.c();
            case 26:
                return new com.yandex.plus.bdui.flex.ui.t((com.yandex.passport.internal.entities.j) obj);
            case 27:
                ((aw5) obj).invoke();
                return Unit.a;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return gld.e((kotlinx.coroutines.a) obj);
            default:
                Set keySet = ((com.yandex.plus.bdui.plus.analytics.c) obj).c.keySet();
                keySet.getClass();
                return tah.b(new Pair(com.yandex.plus.bdui.u.a, keySet));
        }
    }

    public /* synthetic */ h0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ h0(com.yandex.plus.bdui.flex.ui.content.e eVar, aw5 aw5Var) {
        this.a = 27;
        this.b = aw5Var;
    }
}
