package com.squareup.cash.merchant.presenters;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.viewmodels.VerifyMagicViewEvent$Retry;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class MerchantProfilePresenter$models$4$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $tryLoadingMerchantProfileCount$delegate;

    public MerchantProfilePresenter$models$4$1$1(ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$tryLoadingMerchantProfileCount$delegate = parcelableSnapshotMutableIntState;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                NavAction$$ExternalSyntheticOutline0.m(1, this.$tryLoadingMerchantProfileCount$delegate);
                return Unit.INSTANCE;
            default:
                if (((VerifyMagicViewEvent$Retry) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$tryLoadingMerchantProfileCount$delegate;
                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                return Unit.INSTANCE;
        }
    }

    public MerchantProfilePresenter$models$4$1$1(CoroutineScope coroutineScope, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$tryLoadingMerchantProfileCount$delegate = parcelableSnapshotMutableIntState;
    }
}
