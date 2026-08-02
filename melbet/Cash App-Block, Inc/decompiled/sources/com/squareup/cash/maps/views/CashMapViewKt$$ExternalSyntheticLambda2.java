package com.squareup.cash.maps.views;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.investing.viewmodels.families.DependentAutoInvestViewModel;
import com.squareup.cash.localization.views.Language;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class CashMapViewKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda2(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 1:
                break;
            case 2:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                break;
            case 3:
                DependentAutoInvestViewModel dependentAutoInvestViewModel = (DependentAutoInvestViewModel) mutableState.getValue();
                if (dependentAutoInvestViewModel.recurringPurchaseModel != null) {
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                mutableState.setValue(Language.English);
                break;
            case 7:
                mutableState.setValue(Language.Spanish);
                break;
            case 8:
                mutableState.setValue(null);
                break;
            case 9:
                mutableState.setValue(null);
                break;
            case 10:
                mutableState.setValue(null);
                break;
            case 11:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 12:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 13:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 14:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 15:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 16:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 17:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 18:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                break;
            case 19:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 20:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 21:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 22:
                ((Function0) mutableState.getValue()).invoke();
                break;
            case 23:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 24:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 25:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 26:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 27:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 28:
                mutableState.setValue(Boolean.TRUE);
                break;
            default:
                mutableState.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
