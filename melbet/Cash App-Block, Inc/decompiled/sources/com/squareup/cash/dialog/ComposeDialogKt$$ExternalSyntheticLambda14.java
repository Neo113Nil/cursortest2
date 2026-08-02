package com.squareup.cash.dialog;

import android.content.Context;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmRetailerEvent;
import com.squareup.cash.deposits.physical.viewmodels.map.LimitReachedDialogEvent;
import com.squareup.cash.earnings.applets.viewmodels.EarnerAppletTileModel;
import com.squareup.cash.earnings.backend.api.EarningsSyncStateRepositoryKt$WhenMappings;
import com.squareup.cash.earnings.presenters.home.EarningsHomeAnalytics;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.payers.PayerCustomerRowModel;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Huffman;
import squareup.cash.earnings.EarningsAppletState;
import squareup.cash.earnings.EarningsAppletUIState;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposeDialogKt$$ExternalSyntheticLambda14 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposeDialogKt$$ExternalSyntheticLambda14(EarningsHomeAnalytics earningsHomeAnalytics) {
        this.$r8$classId = 23;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                return new AlertDialogView(context, null, false, 6);
            case 1:
                ((AtmRetailerEvent) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                ((LimitReachedDialogEvent) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return Strings.fadeAndScaleLoadingTransition(animatedContentTransitionScopeImpl);
            case 4:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                return Strings.fadeAndScaleLoadingTransition(animatedContentTransitionScopeImpl2);
            case 5:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 6:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 7:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 8:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve());
            case 9:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 10:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt((int) (((Huffman.Node) r7.getParent().appLaunchedCallback).resolve() * 0.9f));
            case 11:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 12:
                ((TextLayoutResult) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 14:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 15:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 16:
                ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                layoutSpec2.getClass();
                return new XInt(((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve());
            case 17:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 18:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 19:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl.maxLineSpan));
            case 20:
                ((TextLayoutResult) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                EarnerAppletTileModel earnerAppletTileModel = (EarnerAppletTileModel) obj;
                earnerAppletTileModel.getClass();
                if (earnerAppletTileModel instanceof EarnerAppletTileModel.Installed) {
                    return AppletTileInstallationState.Installed.INSTANCE;
                }
                if (earnerAppletTileModel instanceof EarnerAppletTileModel.Uninstalled) {
                    return AppletTileInstallationState.Uninstalled.INSTANCE;
                }
                if (Intrinsics.areEqual(earnerAppletTileModel, EarnerAppletTileModel.Hidden.INSTANCE) || Intrinsics.areEqual(earnerAppletTileModel, EarnerAppletTileModel.Loading.INSTANCE)) {
                    return AppletTileInstallationState.Loading.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 22:
                EarningsAppletUIState earningsAppletUIState = (EarningsAppletUIState) obj;
                EarningsAppletState earningsAppletState = earningsAppletUIState != null ? earningsAppletUIState.applet_state : null;
                int i = earningsAppletState == null ? -1 : EarningsSyncStateRepositoryKt$WhenMappings.$EnumSwitchMapping$0[earningsAppletState.ordinal()];
                if (i != -1) {
                    if (i == 1 || i == 2) {
                        return AppletAvailabilityState.AVAILABLE;
                    }
                    if (i == 3) {
                        return AppletAvailabilityState.UNAVAILABLE;
                    }
                    if (i != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return AppletAvailabilityState.LOADING;
            case 23:
                EarningsHomeViewModel.EarningToolsItem earningToolsItem = (EarningsHomeViewModel.EarningToolsItem) obj;
                earningToolsItem.getClass();
                int ordinal = earningToolsItem.f1128type.ordinal();
                if (ordinal == 0) {
                    return "EARNER_MODE";
                }
                if (ordinal == 1) {
                    return "ONBOARDING";
                }
                if (ordinal == 2) {
                    return "MANAGE_CUSTOMERS";
                }
                if (ordinal == 3) {
                    return "ADD_PAYCHECK";
                }
                if (ordinal == 4) {
                    return "PAYCHECK_DISTRIBUTION";
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 24:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 25:
                List list = (List) obj;
                list.getClass();
                long longValue = ((Number) CollectionsKt.maxOrThrow(list)).longValue();
                if (longValue == 0) {
                    longValue = 10000;
                } else if (longValue <= 100) {
                    longValue = 100;
                } else {
                    long j = longValue % 200;
                    if (j != 0) {
                        longValue = (longValue + 200) - j;
                    }
                }
                return Long.valueOf(longValue);
            case 26:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.invisibleToUser(semanticsPropertyReceiver2);
                return Unit.INSTANCE;
            case 27:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 28:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl3.getClass();
                return Strings.inPlaceLoadingTransition(animatedContentTransitionScopeImpl3);
            default:
                ((PayerCustomerRowModel) obj).getClass();
                return "payer_row";
        }
    }

    public /* synthetic */ ComposeDialogKt$$ExternalSyntheticLambda14(int i) {
        this.$r8$classId = i;
    }
}
