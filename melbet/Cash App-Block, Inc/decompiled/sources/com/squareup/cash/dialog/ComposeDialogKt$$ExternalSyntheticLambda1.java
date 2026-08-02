package com.squareup.cash.dialog;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.squareup.cash.arcade.components.FilterBarChipType;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.overlays.OverlayLayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposeDialogKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ ComposableLambdaImpl f$5;
    public final /* synthetic */ Function0 f$6;
    public final /* synthetic */ Object f$7;

    public /* synthetic */ ComposeDialogKt$$ExternalSyntheticLambda1(Object obj, int i, Object obj2, boolean z, boolean z2, ComposableLambdaImpl composableLambdaImpl, Function0 function0, Function0 function02) {
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$5 = composableLambdaImpl;
        this.f$6 = function0;
        this.f$7 = function02;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.f$7;
        Object obj5 = this.f$2;
        switch (i) {
            case 0:
                final Function0 function0 = (Function0) obj4;
                final OverlayLayer overlayLayer = (OverlayLayer) obj;
                ((Integer) obj3).getClass();
                overlayLayer.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                final Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                final MutableState rememberUpdatedState = Updater.rememberUpdatedState(this.f$0, gapComposer);
                final boolean z = this.f$3;
                Boolean valueOf = Boolean.valueOf(z);
                final boolean z2 = this.f$4;
                Boolean valueOf2 = Boolean.valueOf(z2);
                boolean changedInstance = gapComposer.changedInstance(context);
                final ComposableLambdaImpl composableLambdaImpl = this.f$5;
                boolean changed = changedInstance | gapComposer.changed(composableLambdaImpl) | gapComposer.changed(rememberUpdatedState);
                final Function0 function02 = this.f$6;
                boolean changed2 = gapComposer.changed(function02) | changed | gapComposer.changed(z) | gapComposer.changed(z2) | gapComposer.changed(function0) | gapComposer.changedInstance(overlayLayer);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed2 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new Function1() { // from class: com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            ((DisposableEffectScope) obj6).getClass();
                            Context context2 = context;
                            ComposeDialogKt$Modal$3$1$1$dialog$1 composeDialogKt$Modal$3$1$1$dialog$1 = new ComposeDialogKt$Modal$3$1$1$dialog$1(context2, composableLambdaImpl, rememberUpdatedState, function02, 0);
                            ArcadeModal arcadeModal = new ArcadeModal(context2, z, z2);
                            arcadeModal.content.addView(composeDialogKt$Modal$3$1$1$dialog$1);
                            arcadeModal.setOnClickOutsideListener(new ComposeDialogKt$$ExternalSyntheticLambda10(0, function0));
                            return new ComposeDialogKt$Modal$lambda$2$0$0$$inlined$onDispose$1(overlayLayer.show(arcadeModal), 0);
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.DisposableEffect(obj5, valueOf, valueOf2, (Function1) rememberedValue, gapComposer);
                break;
            default:
                Modifier modifier = (Modifier) obj5;
                FilterBarChipType filterBarChipType = (FilterBarChipType) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    FilterBarKt.Chip(this.f$6, modifier, this.f$3, this.f$4, filterBarChipType, this.f$0, true, this.f$5, gapComposer2, 1572864, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ComposeDialogKt$$ExternalSyntheticLambda1(Function0 function0, Modifier modifier, boolean z, boolean z2, FilterBarChipType filterBarChipType, Object obj, ComposableLambdaImpl composableLambdaImpl) {
        this.f$6 = function0;
        this.f$2 = modifier;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$7 = filterBarChipType;
        this.f$0 = obj;
        this.f$5 = composableLambdaImpl;
    }
}
