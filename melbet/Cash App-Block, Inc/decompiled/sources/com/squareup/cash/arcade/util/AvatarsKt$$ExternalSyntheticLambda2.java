package com.squareup.cash.arcade.util;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.components.RealSegmentedControlScope;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.backstack.api.BackStack$ScreenEntry;
import com.squareup.cash.backstack.real.RealBackStackEditor;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewEvent;
import com.squareup.cash.banking.viewmodels.BankingSectionsViewEvent;
import com.squareup.cash.banking.views.BankingDialogKt;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.cash.money.viewmodels.api.SectionAvailabilityState;
import com.squareup.cash.treehouse.qr.QrScanResult;
import com.squareup.protos.franklin.ui.InputtedLegalName;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class AvatarsKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((AvatarImage.State) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                ((QrScanResult) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                BackStack$ScreenEntry backStack$ScreenEntry = (BackStack$ScreenEntry) obj;
                backStack$ScreenEntry.getClass();
                return new RealBackStackEditor.PushEntry(backStack$ScreenEntry);
            case 3:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("badgeCount");
                return Unit.INSTANCE;
            case 4:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("badgeGroup");
                return Unit.INSTANCE;
            case 5:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("badgeGroup");
                return Unit.INSTANCE;
            case 6:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 7:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("badge");
                return Unit.INSTANCE;
            case 8:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 9:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("badge");
                function15.invoke("badgeGroup");
                return Unit.INSTANCE;
            case 10:
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                Boolean bool = androidCursor.getBoolean(0);
                bool.getClass();
                return bool;
            case 11:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("badge");
                return Unit.INSTANCE;
            case 12:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("badge");
                function17.invoke("badgeGroup");
                return Unit.INSTANCE;
            case 13:
                Function1 function18 = (Function1) obj;
                function18.getClass();
                function18.invoke("badge");
                return Unit.INSTANCE;
            case 14:
                Function1 function19 = (Function1) obj;
                function19.getClass();
                function19.invoke("badge");
                return Unit.INSTANCE;
            case 15:
                FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj;
                featureFlag$EnabledDisabledAmplitudeExperiment$Options.getClass();
                return Boolean.valueOf(featureFlag$EnabledDisabledAmplitudeExperiment$Options.enabled());
            case 16:
                FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options2 = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj;
                featureFlag$EnabledDisabledAmplitudeExperiment$Options2.getClass();
                return Boolean.valueOf(featureFlag$EnabledDisabledAmplitudeExperiment$Options2.enabled());
            case 17:
                BalanceAppletTileViewModel balanceAppletTileViewModel = (BalanceAppletTileViewModel) obj;
                balanceAppletTileViewModel.getClass();
                if (balanceAppletTileViewModel instanceof BalanceAppletTileViewModel.Loaded.Lite.Uninstalled) {
                    return AppletTileInstallationState.Uninstalled.INSTANCE;
                }
                if ((balanceAppletTileViewModel instanceof BalanceAppletTileViewModel.Loading) || (balanceAppletTileViewModel instanceof BalanceAppletTileViewModel.Loaded)) {
                    return AppletTileInstallationState.Installed.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 18:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 4.0f);
                return Unit.INSTANCE;
            case 19:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver2, 2.0f);
                return Unit.INSTANCE;
            case 20:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver3, 3.0f);
                return Unit.INSTANCE;
            case 21:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = (FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) obj;
                featureFlag$ControlTreatmentAmplitudeExperiment$Options.getClass();
                return Boolean.valueOf(featureFlag$ControlTreatmentAmplitudeExperiment$Options.enabled());
            case 23:
                InputtedLegalName inputtedLegalName = (InputtedLegalName) obj;
                inputtedLegalName.getClass();
                return inputtedLegalName.inputted_legal_name;
            case 24:
                FamilyProfile familyProfile = (FamilyProfile) obj;
                familyProfile.getClass();
                if (Intrinsics.areEqual(familyProfile, FamilyProfile.Standard.INSTANCE)) {
                    return SectionAvailabilityState.AVAILABLE;
                }
                if (familyProfile instanceof FamilyProfile.ManagedAccount) {
                    return SectionAvailabilityState.UNAVAILABLE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 25:
                ((BankingSectionsViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver4);
                return Unit.INSTANCE;
            case 27:
                ((BalanceHomeViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                RealSegmentedControlScope realSegmentedControlScope = (RealSegmentedControlScope) obj;
                realSegmentedControlScope.getClass();
                ComposableLambdaImpl composableLambdaImpl = BankingDialogKt.f240lambda$1825287989;
                SnapshotStateList snapshotStateList = realSegmentedControlScope.segments;
                snapshotStateList.add(composableLambdaImpl);
                snapshotStateList.add(BankingDialogKt.lambda$133404354);
                return Unit.INSTANCE;
            default:
                return 50;
        }
    }
}
