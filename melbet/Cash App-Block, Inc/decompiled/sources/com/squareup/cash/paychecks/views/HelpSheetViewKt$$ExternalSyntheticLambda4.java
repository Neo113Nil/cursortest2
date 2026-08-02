package com.squareup.cash.paychecks.views;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.backend.api.model.MultipleAllocationBlocker;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelContentEvent;
import com.squareup.cash.paychecks.viewmodels.PaycheckAlertDialogViewEvent$TapPrimaryButton;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;

/* loaded from: classes6.dex */
public final /* synthetic */ class HelpSheetViewKt$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ HelpSheetViewKt$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                PaychecksUiState.Deduction deduction = (PaychecksUiState.Deduction) obj;
                deduction.getClass();
                return deduction.amount;
            case 2:
                PaycheckAllocationDistribution.DestinationAndShare destinationAndShare = (PaycheckAllocationDistribution.DestinationAndShare) obj;
                destinationAndShare.getClass();
                return destinationAndShare.destination;
            case 3:
                PaychecksUiState.RealizedAllocationAmount realizedAllocationAmount = (PaychecksUiState.RealizedAllocationAmount) obj;
                realizedAllocationAmount.getClass();
                return realizedAllocationAmount.realizedAmount;
            case 4:
                MultipleAllocationBlocker.Allocation allocation = (MultipleAllocationBlocker.Allocation) obj;
                allocation.getClass();
                return String.valueOf(allocation.destination.shareInBasisPoints);
            case 5:
                MultipleAllocationBlocker.Allocation allocation2 = (MultipleAllocationBlocker.Allocation) obj;
                allocation2.getClass();
                MultipleAllocationBlocker.Allocation.Editability editability = allocation2.editability;
                editability.getClass();
                return ((MultipleAllocationBlocker.Allocation.Editable) editability).displayName;
            case 6:
                PaycheckAllocationDistribution.DestinationAndShare destinationAndShare2 = (PaycheckAllocationDistribution.DestinationAndShare) obj;
                destinationAndShare2.getClass();
                return destinationAndShare2.destination;
            case 7:
                EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration = (EditDistributionConfiguration.DestinationUiConfiguration) obj;
                destinationUiConfiguration.getClass();
                return destinationUiConfiguration.destination;
            case 8:
                EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration2 = (EditDistributionConfiguration.DestinationUiConfiguration) obj;
                destinationUiConfiguration2.getClass();
                return Long.valueOf(destinationUiConfiguration2.shareInBasisPoints);
            case 9:
                List list = (List) obj;
                list.getClass();
                return CollectionsKt__CollectionsKt.getIndices(list);
            case 10:
                List list2 = (List) obj;
                list2.getClass();
                IntRange indices = CollectionsKt__CollectionsKt.getIndices(list2);
                IntProgression.Companion companion = IntProgression.Companion;
                int i = indices.last;
                int i2 = indices.first;
                int i3 = -indices.step;
                companion.getClass();
                return new IntProgression(i, i2, i3);
            case 11:
                MultipleAllocationBlocker.Allocation allocation3 = (MultipleAllocationBlocker.Allocation) obj;
                allocation3.getClass();
                return allocation3.destination.destination;
            case 12:
                MultipleAllocationBlocker.Allocation allocation4 = (MultipleAllocationBlocker.Allocation) obj;
                allocation4.getClass();
                return Long.valueOf(allocation4.destination.shareInBasisPoints);
            case 13:
                PaycheckAllocationDistribution.DestinationAndShare destinationAndShare3 = (PaycheckAllocationDistribution.DestinationAndShare) obj;
                destinationAndShare3.getClass();
                return destinationAndShare3.destination;
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver, 0);
                return Unit.INSTANCE;
            case 15:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver2);
                return Unit.INSTANCE;
            case 16:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver3);
                return Unit.INSTANCE;
            case 17:
                ((PaycheckAlertDialogViewEvent$TapPrimaryButton) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                ((DistributionWheelContentEvent) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                ((DistributionWheelContentEvent) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 25:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = (FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) obj;
                featureFlag$ControlTreatmentAmplitudeExperiment$Options.getClass();
                return Boolean.valueOf(featureFlag$ControlTreatmentAmplitudeExperiment$Options.enabled());
            case 28:
                FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options2 = (FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) obj;
                featureFlag$ControlTreatmentAmplitudeExperiment$Options2.getClass();
                return Boolean.valueOf(featureFlag$ControlTreatmentAmplitudeExperiment$Options2.enabled());
            default:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}
