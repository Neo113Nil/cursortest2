package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.address.typeahead.backend.api.LocationType;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.IndividualFormRequirementProvider;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class ArcadeFormAddressView extends AbstractComposeView implements IndividualFormRequirementProvider {
    public final boolean autofill;
    public final Country country;
    public final String formElementId;
    public final LocationType locationType;
    public final Function1 onEvent;
    public final GlobalAddress prefill;
    public final PlacesAddressSearcher searcher;
    public final StateFlowImpl validated;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormAddressView(Context context, Country country, String str, LocationType locationType, Function1 function1, GlobalAddress globalAddress, PlacesAddressSearcher placesAddressSearcher, boolean z) {
        super(context, null, 6, 0);
        context.getClass();
        country.getClass();
        this.country = country;
        this.formElementId = str;
        this.locationType = locationType;
        this.onEvent = function1;
        this.prefill = globalAddress;
        this.searcher = placesAddressSearcher;
        this.autofill = z;
        this.validated = FlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1362988232);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(595045597, new ArcadeFormAddressView$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormAddressView$$ExternalSyntheticLambda0(this, i);
        }
    }

    @Override // com.squareup.cash.formview.components.IndividualFormRequirementProvider
    public final Flow isRequirementFulfilled() {
        return this.validated;
    }
}
