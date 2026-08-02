package com.squareup.cash.common.composeui;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt;
import com.squareup.cash.charting.viewmodels.EarningsBarViewModel;
import com.squareup.cash.deposits.physical.screens.AddressResult;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.views.effect.LightSource;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.Instrument;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class DrawerViewKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ DrawerViewKt$$ExternalSyntheticLambda2(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        Object obj2;
        Object obj3;
        int i = this.$r8$classId;
        FormViewModel.SubmissionState.SubmissionFailed submissionFailed = FormViewModel.SubmissionState.SubmissionFailed.INSTANCE;
        Object obj4 = null;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 1:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 2:
                return Integer.valueOf(((Number) mutableState.getValue()).intValue());
            case 3:
                return Integer.valueOf(((Number) mutableState.getValue()).intValue());
            case 4:
                float[] fArr = CardSceneEffectKt.X_AXIS;
                return (Quat) mutableState.getValue();
            case 5:
                float[] fArr2 = CardSceneEffectKt.X_AXIS;
                return (Quat) mutableState.getValue();
            case 6:
                float[] fArr3 = CardSceneEffectKt.X_AXIS;
                return Boolean.valueOf(((Quat) mutableState.getValue()).angleShortestPath(CardSceneEffectKt.forwardResting) < ((Quat) mutableState.getValue()).angleShortestPath(CardSceneEffectKt.backwardResting));
            case 7:
                return new Vector4(((LightSource) mutableState.getValue()).x, ((LightSource) mutableState.getValue()).y, 1.0f, RecyclerView.DECELERATION_RATE);
            case 8:
                return (EarningsBarViewModel) mutableState.getValue();
            case 9:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 10:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 11:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 12:
                return (AddressResult) mutableState.getValue();
            case 13:
                return (AddressResult) mutableState.getValue();
            case 14:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                return (Disclosure) mutableState.getValue();
            case 16:
                return (String) mutableState.getValue();
            case 17:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 18:
                Iterator it = ((List) mutableState.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((Instrument) next).cash_instrument_type == CashInstrumentType.CASH_BALANCE) {
                            obj4 = next;
                        }
                    }
                }
                return (Instrument) obj4;
            case 19:
                Iterator it2 = ((List) mutableState.getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (((Instrument) next2).cash_instrument_type == CashInstrumentType.CASH_BALANCE) {
                            obj4 = next2;
                        }
                    }
                }
                return (Instrument) obj4;
            case 20:
                List list = (List) mutableState.getValue();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (((Instrument) it3.next()).cash_instrument_type != CashInstrumentType.CASH_BALANCE) {
                            return Boolean.valueOf(r1);
                        }
                    }
                }
                r1 = true;
                return Boolean.valueOf(r1);
            case 21:
                Iterator it4 = ((List) mutableState.getValue()).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj = it4.next();
                        Instrument instrument = (Instrument) obj;
                        if (!Intrinsics.areEqual(instrument.is_default_for_instrument_type, Boolean.TRUE) || instrument.cash_instrument_type != CashInstrumentType.DEBIT_CARD) {
                        }
                    } else {
                        obj = null;
                    }
                }
                Instrument instrument2 = (Instrument) obj;
                if (instrument2 != null) {
                    return instrument2;
                }
                Iterator it5 = ((List) mutableState.getValue()).iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj2 = it5.next();
                        if (((Instrument) obj2).cash_instrument_type == CashInstrumentType.DEBIT_CARD) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Instrument instrument3 = (Instrument) obj2;
                if (instrument3 != null) {
                    return instrument3;
                }
                Iterator it6 = ((List) mutableState.getValue()).iterator();
                while (true) {
                    if (it6.hasNext()) {
                        obj3 = it6.next();
                        if (((Instrument) obj3).cash_instrument_type == CashInstrumentType.BANK_ACCOUNT) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                Instrument instrument4 = (Instrument) obj3;
                if (instrument4 != null) {
                    return instrument4;
                }
                Iterator it7 = ((List) mutableState.getValue()).iterator();
                while (true) {
                    if (it7.hasNext()) {
                        Object next3 = it7.next();
                        if (((Instrument) next3).cash_instrument_type != CashInstrumentType.CASH_BALANCE) {
                            obj4 = next3;
                        }
                    }
                }
                return (Instrument) obj4;
            case 22:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 23:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 24:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 25:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 26:
                mutableState.setValue(submissionFailed);
                return Unit.INSTANCE;
            case 27:
                mutableState.setValue(submissionFailed);
                return Unit.INSTANCE;
            case 28:
                int i2 = ArcadeFormDateInputView.$r8$clinit;
                return (TextFieldValue) mutableState.getValue();
            default:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
        }
    }
}
