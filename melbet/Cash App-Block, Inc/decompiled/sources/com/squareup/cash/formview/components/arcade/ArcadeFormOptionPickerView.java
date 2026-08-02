package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.IndividualFormRequirementProvider;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class ArcadeFormOptionPickerView extends ComposeUiView implements IndividualFormRequirementProvider {
    public final FormBlocker.Element.OptionPickerElement element;
    public final String formElementId;
    public final int horizontalPaddingPx;
    public final ParcelableSnapshotMutableState selectedOptionId$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormOptionPickerView(Context context, String str, FormBlocker.Element.OptionPickerElement optionPickerElement) {
        super(context);
        String str2;
        context.getClass();
        this.formElementId = str;
        this.horizontalPaddingPx = 16;
        this.element = optionPickerElement;
        Integer num = optionPickerElement.selected_option;
        if (num != null) {
            FormBlocker.Element.OptionPickerElement.Option option = (FormBlocker.Element.OptionPickerElement.Option) CollectionsKt.getOrNull(num.intValue(), optionPickerElement.options);
            if (option != null) {
                str2 = option.id;
                this.selectedOptionId$delegate = Updater.mutableStateOf$default(str2);
            }
        }
        str2 = null;
        this.selectedOptionId$delegate = Updater.mutableStateOf$default(str2);
    }

    public final void Content(Unit unit, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1119879403);
        int i2 = 16;
        int i3 = (gapComposer.changedInstance(function1) ? 32 : 16) | i | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            String str = (String) this.selectedOptionId$delegate.getValue();
            boolean changedInstance = gapComposer.changedInstance(this) | ((i3 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CheckStatusPresenter.AnonymousClass1.C00611(function1, this, null, 15);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-485461974, new ErrorView$$ExternalSyntheticLambda1(i2, this, function1), gapComposer), gapComposer, 3072, 7);
            boolean changedInstance2 = gapComposer.changedInstance(this);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GpsConfigQueries$$ExternalSyntheticLambda2(this, 8);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormRemoteImageKt$$ExternalSyntheticLambda0(this, unit, function1, i, 19);
        }
    }

    @Override // com.squareup.cash.formview.components.IndividualFormRequirementProvider
    public final Flow isRequirementFulfilled() {
        Boolean bool = this.element.is_optional;
        return bool != null ? bool.booleanValue() : false ? new AppLockMonitor$special$$inlined$map$2(Boolean.TRUE, 19) : new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new RealGooglePayer$$ExternalSyntheticLambda0(this, 3)), 7);
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((Unit) obj, function1, gapComposer, 0);
    }
}
