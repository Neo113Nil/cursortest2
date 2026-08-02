package com.squareup.cash.formview.components.arcade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import com.squareup.address.typeahead.backend.api.AddressState;
import com.squareup.address.typeahead.views.AddressTypeaheadKt;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.address.typeahead.views.AddressTypeaheadStateKt;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeFormAddressView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ArcadeFormAddressView f$0;

    public /* synthetic */ ArcadeFormAddressView$$ExternalSyntheticLambda0(ArcadeFormAddressView arcadeFormAddressView) {
        this.f$0 = arcadeFormAddressView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ArcadeFormAddressView arcadeFormAddressView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AddressTypeaheadState rememberAddressTypeaheadState = AddressTypeaheadStateKt.rememberAddressTypeaheadState(arcadeFormAddressView.searcher, arcadeFormAddressView.country, arcadeFormAddressView.locationType, arcadeFormAddressView.prefill, arcadeFormAddressView.autofill, null, gapComposer, 0, 32);
                    AddressTypeaheadKt.AddressTypeahead(rememberAddressTypeaheadState, null, null, gapComposer, 0, 6);
                    AddressState address = rememberAddressTypeaheadState.getAddress();
                    boolean changedInstance = gapComposer.changedInstance(arcadeFormAddressView) | gapComposer.changedInstance(address);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new GLSceneScope$$ExternalSyntheticLambda4(15, arcadeFormAddressView, address);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Updater.SideEffect((Function0) rememberedValue, gapComposer);
                    if (address instanceof AddressState.Valid) {
                        gapComposer.startReplaceGroup(1673776011);
                        boolean changedInstance2 = gapComposer.changedInstance(arcadeFormAddressView) | gapComposer.changedInstance(address);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new CheckStatusPresenter.AnonymousClass1.C00611(arcadeFormAddressView, (AddressState.Valid) address, null, 11);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        Updater.LaunchedEffect(gapComposer, address, (Function2) rememberedValue2);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1673924005);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                arcadeFormAddressView.Content(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeFormAddressView$$ExternalSyntheticLambda0(ArcadeFormAddressView arcadeFormAddressView, int i) {
        this.f$0 = arcadeFormAddressView;
    }
}
