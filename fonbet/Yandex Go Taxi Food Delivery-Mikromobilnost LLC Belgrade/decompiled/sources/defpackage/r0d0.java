package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.ComposeShader;
import android.graphics.PorterDuff;
import android.view.View;
import com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView;
import com.yandex.go.promocodes.base.impl.ui.share.PromoCodeSharingModalView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.progress_bar.ProgressBarView;
import com.yandex.go.taxi.order.recalculation.ui.PriceRecalculationModalView;
import com.yandex.go.ultima_mode.profile.mvp.ProfileUltimaModeView;
import com.yandex.go.user_profile.ui.primary.ProfileModalView;
import com.yandex.go.vault.ui.PrizeModalView;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuDialog;
import com.yandex.messaging.ui.polloptioninfo.PollOptionInfoActivity;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.panel.internal.sections.PlusPanelFullDailySectionView;
import com.yandex.plus.home.feature.panel.internal.sections.PlusPanelMiniDailySectionView;
import com.yandex.plus.home.feature.panel.internal.sections.PlusPanelPlusCardSectionView;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitProgressBar;
import com.ybsdk.common.repositiories.plus.a;
import com.ybsdk.core.design.spoiler.d;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.TsarButtonConfigV2;
import com.ybsdk.rconfig.configs.YbMobileTabBarConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.address.entrances.ui.v1.PorchNumberInputModalView;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.surge.api.PriceComplainApi;

/* loaded from: classes2.dex */
public final /* synthetic */ class r0d0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0d0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        m7d0 stubConfig_delegate$lambda$0;
        m7d0 stubConfig_delegate$lambda$02;
        m7d0 stubConfig_delegate$lambda$03;
        ObjectAnimator animator_delegate$lambda$1;
        qs11 ui_delegate$lambda$0;
        zy11 _init_$lambda$0;
        View insetsType$lambda$0;
        FloatButtonIconComponent floatBackButton_delegate$lambda$0;
        View insetsType$lambda$02;
        jj11 hj11Var;
        View insetsType$lambda$03;
        zy11 renderContentState$lambda$3;
        ValueAnimator loadingAnimator_delegate$lambda$0;
        View insetsType$lambda$04;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new dnd0(0, (arx0) ((oy80) obj).b);
            case 1:
                return new dnd0(0, (hvg) ((oy80) obj).b);
            case 2:
                i4d0 i4d0Var = (i4d0) obj;
                return new yv41(i4d0Var.a, i4d0Var.b, i4d0Var.c, i4d0Var.d, i4d0Var.e, i4d0Var.f, i4d0Var.g);
            case 3:
                stubConfig_delegate$lambda$0 = PlusPanelFullDailySectionView.stubConfig_delegate$lambda$0((PlusPanelFullDailySectionView) obj);
                return stubConfig_delegate$lambda$0;
            case 4:
                stubConfig_delegate$lambda$02 = PlusPanelMiniDailySectionView.stubConfig_delegate$lambda$0((PlusPanelMiniDailySectionView) obj);
                return stubConfig_delegate$lambda$02;
            case 5:
                stubConfig_delegate$lambda$03 = PlusPanelPlusCardSectionView.stubConfig_delegate$lambda$0((PlusPanelPlusCardSectionView) obj);
                return stubConfig_delegate$lambda$03;
            case 6:
                Set set = (Set) ((ccd0) ((ecd0) ((dbd0) obj).c.invoke())).h.getValue();
                return set == null ? EmptySet.a : set;
            case 7:
                animator_delegate$lambda$1 = PlusPayUiKitProgressBar.animator_delegate$lambda$1((PlusPayUiKitProgressBar) obj);
                return animator_delegate$lambda$1;
            case 8:
                return xz50.a(((a) obj).c);
            case 9:
                return new com.yandex.plus.home.feature.webviews.internal.smart.a((yld0) obj);
            case 10:
                com.yandex.plus.home.feature.webviews.internal.a aVar = (com.yandex.plus.home.feature.webviews.internal.a) obj;
                skd0.b(PlusLogTag.UI, "open starting url=" + aVar.a);
                aVar.k(aVar.g);
                return zy11Var;
            case 11:
                return ((com.yandex.messaging.ui.pollinfo.a) obj).b.c(false);
            case 12:
                ui_delegate$lambda$0 = PollOptionInfoActivity.ui_delegate$lambda$0((PollOptionInfoActivity) obj);
                return ui_delegate$lambda$0;
            case 13:
                v5e0 v5e0Var = (v5e0) obj;
                return new pje(d6z.h("kotlinx.serialization.Polymorphic", q5e0.g, new SerialDescriptor[0], new k7d0(12, v5e0Var)), v5e0Var.a);
            case 14:
                _init_$lambda$0 = PorchNumberInputModalView._init_$lambda$0((PorchNumberInputModalView) obj);
                return _init_$lambda$0;
            case 15:
                kdd0 kdd0Var = (kdd0) obj;
                return new ComposeShader(((fes0) kdd0Var.a).b(), ((fes0) kdd0Var.b).b(), (PorterDuff.Mode) kdd0Var.d);
            case 16:
                q6c0 q6c0Var = (q6c0) obj;
                return new ComposeShader(((ges0) q6c0Var.b).b(), ((ges0) q6c0Var.c).b(), PorterDuff.Mode.SRC_OVER);
            case 17:
                insetsType$lambda$0 = PreGeoAuthOnboardingModalView.insetsType$lambda$0((PreGeoAuthOnboardingModalView) obj);
                return insetsType$lambda$0;
            case 18:
                ((spe0) obj).b.getClass();
                sjh sjhVar = uyj.a;
                return mdh.b;
            case 19:
                on2 on2Var = ((ru.yandex.taxi.surge.repository.a) obj).b;
                on2Var.getClass();
                return (PriceComplainApi) on2Var.a(GoApiName.TaxiV4, PriceComplainApi.class);
            case 20:
                floatBackButton_delegate$lambda$0 = PriceRecalculationModalView.floatBackButton_delegate$lambda$0((PriceRecalculationModalView) obj);
                return floatBackButton_delegate$lambda$0;
            case 21:
                insetsType$lambda$02 = PrizeModalView.insetsType$lambda$0((PrizeModalView) obj);
                return insetsType$lambda$02;
            case 22:
                rb00 rb00Var = (rb00) obj;
                List<YbMobileTabBarConfig.TabBarItem> items = ((t400) rb00Var).a.q().getItems();
                ArrayList arrayList = new ArrayList(tcc.n(items, 10));
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    arrayList.add(((YbMobileTabBarConfig.TabBarItem) it.next()).toEntity());
                }
                b bVar = ((t400) rb00Var).a;
                aj11 entity = ((TsarButtonConfigV2) bVar.d(zi11.a).getData()).toEntity();
                if (entity != null) {
                    hj11Var = new ij11(entity);
                } else {
                    YbMobileTabBarConfig.TsarButtonConfig tsarButton = bVar.q().getTsarButton();
                    bj11 entity2 = tsarButton != null ? tsarButton.toEntity() : null;
                    hj11Var = entity2 != null ? new hj11(entity2) : null;
                }
                return new dbf0(new t8j0(), false, false, null, null, false, arrayList, hj11Var, EmptyList.a, false, true, ((Boolean) d.b.getValue()).booleanValue(), false);
            case 23:
                im imVar = com.yandex.messaging.ui.profile.config.a.c;
                return new pm(imVar, Collections.singletonList(new ql(imVar, ((com.yandex.messaging.ui.profile.config.a) obj).a.getString(oyh0.anonymous_user_name), null, "messenger://avatar_placeholder_uri", null, 896)));
            case 24:
                insetsType$lambda$03 = ProfileModalView.insetsType$lambda$0((ProfileModalView) obj);
                return insetsType$lambda$03;
            case 25:
                return ((gsu) obj).a();
            case 26:
                renderContentState$lambda$3 = ProfileUltimaModeView.renderContentState$lambda$3((ProfileUltimaModeView) obj);
                return renderContentState$lambda$3;
            case 27:
                loadingAnimator_delegate$lambda$0 = ProgressBarView.loadingAnimator_delegate$lambda$0((ProgressBarView) obj);
                return loadingAnimator_delegate$lambda$0;
            case 28:
                insetsType$lambda$04 = PromoCodeSharingModalView.insetsType$lambda$0((PromoCodeSharingModalView) obj);
                return insetsType$lambda$04;
            default:
                MessageMenuDialog messageMenuDialog = ((com.yandex.messaging.ui.reactions.a) obj).y;
                if (messageMenuDialog != null) {
                    messageMenuDialog.goBack();
                }
                return zy11Var;
        }
    }
}
