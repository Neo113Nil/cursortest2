package com.squareup.cash.formview.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.formview.viewmodels.ClientScenarioAndFlowToken;
import com.squareup.cash.formview.viewmodels.FormCashtagViewModel;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.Signal;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class FormCashtagPresenter implements MoleculePresenter {
    public final AppService appService;
    public final FormBlocker.Element.CashtagElement cashtagElement;
    public final ClientScenario clientScenario;
    public final String flowToken;
    public final Signal signOut;

    /* loaded from: classes.dex */
    public interface Factory extends TransformerFactory {

        public final class Impl implements Factory {
            public final MetroFactory delegateFactory;

            public Impl(MetroFactory metroFactory) {
                this.delegateFactory = metroFactory;
            }
        }
    }

    public final class LookupResult {
        public final boolean isSubmittable;
        public final String previewText;
        public final boolean updatePreviewText;

        public LookupResult(String str, boolean z, boolean z2) {
            this.isSubmittable = z;
            this.updatePreviewText = z2;
            this.previewText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LookupResult)) {
                return false;
            }
            LookupResult lookupResult = (LookupResult) obj;
            return this.isSubmittable == lookupResult.isSubmittable && this.updatePreviewText == lookupResult.updatePreviewText && Intrinsics.areEqual(this.previewText, lookupResult.previewText);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isSubmittable) * 31, 31, this.updatePreviewText);
            String str = this.previewText;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("LookupResult(isSubmittable=", ", updatePreviewText=", ", previewText=", this.isSubmittable, this.updatePreviewText), this.previewText, ")");
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider appService;
        public final Provider signOut;

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2) {
            this.appService = doubleCheck;
            this.signOut = doubleCheck2;
        }
    }

    /* loaded from: classes.dex */
    public interface TransformerFactory {
    }

    public FormCashtagPresenter(AppService appService, Signal signal, ClientScenarioAndFlowToken clientScenarioAndFlowToken, FormBlocker.Element.CashtagElement cashtagElement) {
        clientScenarioAndFlowToken.getClass();
        cashtagElement.getClass();
        this.appService = appService;
        this.signOut = signal;
        this.cashtagElement = cashtagElement;
        ClientScenario clientScenario = clientScenarioAndFlowToken.clientScenario;
        clientScenario.getClass();
        this.clientScenario = clientScenario;
        this.flowToken = clientScenarioAndFlowToken.flowToken;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1928225413);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        FormBlocker.Element.CashtagElement cashtagElement = this.cashtagElement;
        Continuation continuation = null;
        if (rememberedValue == neverEqualPolicy) {
            String str = cashtagElement.prefill_text;
            rememberedValue = Updater.mutableStateOf$default(new LookupResult(null, !(str == null || str.length() == 0), true));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Updater.LaunchedEffect(gapComposer, flow, new RealFidesmoClient$observeDeviceState$1(flow, continuation, this, mutableState, 24));
        FormCashtagViewModel formCashtagViewModel = new FormCashtagViewModel(cashtagElement.prefix_symbol, cashtagElement.prefill_text, cashtagElement.hint_text, ((LookupResult) mutableState.getValue()).previewText, ((LookupResult) mutableState.getValue()).isSubmittable);
        gapComposer.end(false);
        return formCashtagViewModel;
    }
}
