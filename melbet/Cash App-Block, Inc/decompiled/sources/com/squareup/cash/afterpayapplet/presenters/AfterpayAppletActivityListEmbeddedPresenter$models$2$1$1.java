package com.squareup.cash.afterpayapplet.presenters;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen;
import com.squareup.cash.afterpayapplet.viewmodels.FooterSection;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletActivityListEmbeddedViewEvent;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.screens.Back;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletPurchaseHistoryResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.Footer;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.util.cash.StringsKt;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes5.dex */
public final class AfterpayAppletActivityListEmbeddedPresenter$models$2$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ LocalHomePresenter this$0;

    public AfterpayAppletActivityListEmbeddedPresenter$models$2$1$1(LocalHomePresenter localHomePresenter) {
        this.this$0 = localHomePresenter;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Icon icon;
        LocalizedString localizedString;
        int i = this.$r8$classId;
        String str = null;
        LocalHomePresenter localHomePresenter = this.this$0;
        switch (i) {
            case 0:
                AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse = (AfterpayAppletPurchaseHistoryResponse) obj;
                afterpayAppletPurchaseHistoryResponse.getClass();
                Footer footer = afterpayAppletPurchaseHistoryResponse.footer;
                String translated = (footer == null || (localizedString = footer.footer_markdown_text) == null) ? null : StringsKt.translated(localizedString);
                if (footer != null && (icon = footer.arcade_icon) != null) {
                    str = icon.arcade_id;
                }
                ((ParcelableSnapshotMutableState) localHomePresenter.neighborhoodsTabContentEnabled$delegate).setValue(new FooterSection(translated, str));
                return Unit.INSTANCE;
            default:
                AfterpayAppletActivityListEmbeddedViewEvent afterpayAppletActivityListEmbeddedViewEvent = (AfterpayAppletActivityListEmbeddedViewEvent) obj;
                if (Intrinsics.areEqual(afterpayAppletActivityListEmbeddedViewEvent, AfterpayAppletActivityListEmbeddedViewEvent.TapBack.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(Back.INSTANCE);
                } else {
                    if (!(afterpayAppletActivityListEmbeddedViewEvent instanceof AfterpayAppletActivityListEmbeddedViewEvent.FooterLinkTapped)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RealRouter realRouter = (RealRouter) localHomePresenter.tabContentPresenterFactory;
                    String str2 = ((AfterpayAppletActivityListEmbeddedViewEvent.FooterLinkTapped) afterpayAppletActivityListEmbeddedViewEvent).actionUrl;
                    AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen afterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen = (AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen) localHomePresenter.syncer;
                    realRouter.route(new RoutingParams(afterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen, null, afterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str2);
                }
                return Unit.INSTANCE;
        }
    }

    public AfterpayAppletActivityListEmbeddedPresenter$models$2$1$1(CoroutineScope coroutineScope, LocalHomePresenter localHomePresenter) {
        this.this$0 = localHomePresenter;
    }
}
