package com.squareup.cash.activity.views;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.sqldelight.driver.android.AndroidCursor;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewEvent;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ReceiptViewEvent;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.db.AfterpayApplet;
import com.squareup.cash.afterpayapplet.presenters.AfterpaySearchPresenterKt;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.afterpayapplet.views.SwipeState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes5.dex */
public final /* synthetic */ class ActivityTabViewKt$$ExternalSyntheticLambda17 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ActivityTabViewKt$$ExternalSyntheticLambda17(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long duration;
        switch (this.$r8$classId) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                break;
            case 1:
                ((ThemeSwitcherViewEvent) obj).getClass();
                break;
            case 2:
                Size size = (Size) obj;
                break;
            case 3:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                break;
            case 4:
                ActivityItem activityItem = (ActivityItem) obj;
                activityItem.getClass();
                break;
            case 5:
                ((ActivityItemViewEvent) obj).getClass();
                break;
            case 6:
                ((ActivityEmbeddedViewEvent) obj).getClass();
                break;
            case 7:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 8:
                ((ReceiptViewEvent) obj).getClass();
                break;
            case 9:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                AfterpayAppletTileViewModel afterpayAppletTileViewModel = (AfterpayAppletTileViewModel) obj;
                afterpayAppletTileViewModel.getClass();
                if (!(afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Loading)) {
                    if (!(afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Installed)) {
                        if (!(afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Uninstalled) && !(afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.V3Uninstalled)) {
                            if (!(afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Installed.V3Installed)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else if (!((AfterpayAppletTileViewModel.Loading) afterpayAppletTileViewModel).isInstalled) {
                    break;
                }
                break;
            case 15:
                AfterpayApplet afterpayApplet = (AfterpayApplet) obj;
                if (afterpayApplet != null && (r6 = afterpayApplet.afterpay_applet_response) != null) {
                    break;
                }
                break;
            case 16:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("afterpayAppletMerchantSheet");
                break;
            case 17:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("afterpayAppletMerchantSheet");
                break;
            case 18:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("afterpayApplet");
                break;
            case 19:
                AndroidCursor androidCursor = (AndroidCursor) obj;
                break;
            case 20:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("afterpayRecentlyViewedMerchant");
                break;
            case 21:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("afterpayRecentlyViewedMerchant");
                break;
            case 22:
                if (((AfterpaySearchViewEvent.QueryUpdated) obj).query.getValue().length() > 0) {
                    duration = AfterpaySearchPresenterKt.DEBOUNCE_DURATION;
                } else {
                    Duration.Companion companion = Duration.Companion;
                    duration = DurationKt.toDuration(0, DurationUnit.MILLISECONDS);
                }
                break;
            case 23:
                AfterpayAppletHomeContentViewModel.HomeSection homeSection = (AfterpayAppletHomeContentViewModel.HomeSection) obj;
                homeSection.getClass();
                String str = homeSection.id;
                if (str == null) {
                    break;
                }
                break;
            case 24:
                AfterpayAppletHomeContentViewModel.HomeSection homeSection2 = (AfterpayAppletHomeContentViewModel.HomeSection) obj;
                homeSection2.getClass();
                break;
            case 25:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver2, 0);
                break;
            case 26:
                DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
                draggableAnchorsConfig.getClass();
                draggableAnchorsConfig.at(SwipeState.UP, -200.0f);
                draggableAnchorsConfig.at(SwipeState.START, RecyclerView.DECELERATION_RATE);
                break;
            case 27:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver3, 0);
                break;
            case 28:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            default:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver4);
                break;
        }
        return Unit.INSTANCE;
    }
}
