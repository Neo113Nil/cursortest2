package com.squareup.cash.maps.views;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.genericelements.components.GenericTreeElementsView;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.money.applets.sections.AppletTileItem;
import com.squareup.cash.money.applets.sections.CustomResult;
import com.squareup.cash.money.core.ids.AppletTileInstallationSectionId;
import com.squareup.cash.money.core.ids.AppletTileUninstallationSectionId;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CashMapViewKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((CashCluster) obj).getClass();
                return ColorKt.RectangleShape;
            case 1:
                ((InviteContactsViewModel.Contact) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                ((InviteContactsViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("localizationConfig");
                return Unit.INSTANCE;
            case 4:
                List list = (List) obj;
                list.getClass();
                Object obj2 = list.get(0);
                obj2.getClass();
                double doubleValue = ((Double) obj2).doubleValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                double doubleValue2 = ((Double) obj3).doubleValue();
                Object obj4 = list.get(2);
                obj4.getClass();
                return new LocationViewModel(doubleValue, doubleValue2, ((Float) obj4).floatValue());
            case 5:
                ((TextLayoutResult) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("marketCapabilitiesConfig");
                return Unit.INSTANCE;
            case 7:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 8:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver2);
                return Unit.INSTANCE;
            case 9:
                ((AppMessageViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                ((AppMessageViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                ((AppMessageViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                ((AppMessageViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                ((AppMessageViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                ((AppMessageViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                ((AppMessageViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 16:
                ((AppMessageViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                ((AppMessageViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver3);
                return Unit.INSTANCE;
            case 19:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return Strings.fadeAndScaleLoadingTransition(animatedContentTransitionScopeImpl);
            case 20:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 21:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 22:
                GenericTreeElementsView genericTreeElementsView = (GenericTreeElementsView) obj;
                genericTreeElementsView.getClass();
                genericTreeElementsView.setOnEventListener(new CashMapViewKt$$ExternalSyntheticLambda0(23));
                return Unit.INSTANCE;
            case 23:
                ((GenericTreeElementsViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.with(EnterExitTransitionKt.slideInVertically$default(1, new CashMapViewKt$$ExternalSyntheticLambda0(20)), EnterExitTransitionKt.slideOutVertically$default(1, new CashMapViewKt$$ExternalSyntheticLambda0(21)));
            case 25:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("promotedAppletTiles");
                return Unit.INSTANCE;
            case 26:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("promotedAppletTiles");
                return Unit.INSTANCE;
            case 27:
                AppletTileInstallationSectionId appletTileInstallationSectionId = (AppletTileInstallationSectionId) obj;
                appletTileInstallationSectionId.getClass();
                return new CustomResult.Success(new AppletTileItem.Section.Installed(appletTileInstallationSectionId));
            case 28:
                AppletTileUninstallationSectionId appletTileUninstallationSectionId = (AppletTileUninstallationSectionId) obj;
                appletTileUninstallationSectionId.getClass();
                return new CustomResult.Success(new AppletTileItem.Section.Uninstalled(appletTileUninstallationSectionId));
            default:
                AppletTileInstallationSectionId appletTileInstallationSectionId2 = (AppletTileInstallationSectionId) obj;
                appletTileInstallationSectionId2.getClass();
                int ordinal = appletTileInstallationSectionId2.ordinal();
                if (ordinal == 0) {
                    return AppletTileUninstallationSectionId.CARD_UNINSTALLED;
                }
                if (ordinal == 1) {
                    return AppletTileUninstallationSectionId.BANKING;
                }
                if (ordinal == 2 || ordinal == 3) {
                    return AppletTileUninstallationSectionId.DEFAULT;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
