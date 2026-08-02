package com.squareup.cash.marketing.components;

import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import app.cash.local.viewmodels.internal.MenuSelectorOption;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt$CardSceneEffect$touchModifier$1$1$2$1;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.util.Strings;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes6.dex */
public final /* synthetic */ class TooltipBoxKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ TooltipBoxKt$$ExternalSyntheticLambda8(SheetAppMessageModel sheetAppMessageModel, float f, SheetAppMessageView sheetAppMessageView, Function1 function1, PaddingValues paddingValues, RealSheetState realSheetState) {
        this.$r8$classId = 2;
        this.f$0 = sheetAppMessageModel;
        this.f$2 = f;
        this.f$1 = sheetAppMessageView;
        this.f$3 = function1;
        this.f$4 = paddingValues;
        this.f$5 = realSheetState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$5;
        Object obj4 = this.f$4;
        Object obj5 = this.f$3;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                CardUpsellKt.m3597TooltiposbwsH8((Modifier) obj7, (String) obj6, this.f$2, (Function0) obj5, (Alignment.Horizontal) obj4, (ArrowOrientation) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.ToolbarWithMenuSelector((List) obj7, (MenuSelectorOption) obj6, this.f$2, (Function0) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                SheetAppMessageModel sheetAppMessageModel = (SheetAppMessageModel) obj7;
                final SheetAppMessageView sheetAppMessageView = (SheetAppMessageView) obj6;
                final Function1 function1 = (Function1) obj5;
                final PaddingValues paddingValues = (PaddingValues) obj4;
                final RealSheetState realSheetState = (RealSheetState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    boolean z = sheetAppMessageModel instanceof SheetAppMessageModel.Loading;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new CopyCodeKt$$ExternalSyntheticLambda5(23);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    final float f = this.f$2;
                    Strings.m3984LoadableSheetContentosbwsH8(sheetAppMessageModel, z, f, null, (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(971093971, new Function4() { // from class: com.squareup.cash.appmessages.views.sheet.SheetAppMessageView$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                            SheetAppMessageModel sheetAppMessageModel2 = (SheetAppMessageModel) obj9;
                            Composer composer2 = (Composer) obj10;
                            int intValue2 = ((Integer) obj11).intValue();
                            ((AnimatedContentScopeImpl) obj8).getClass();
                            sheetAppMessageModel2.getClass();
                            if (sheetAppMessageModel2 instanceof SheetAppMessageModel.Loaded) {
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                gapComposer2.startReplaceGroup(-1039145733);
                                SheetAppMessageView.this.m2983SheetContent3xixttE((SheetAppMessageModel.Loaded) sheetAppMessageModel2, function1, paddingValues, realSheetState, f, gapComposer2, (intValue2 >> 3) & 14);
                                gapComposer2.end(false);
                            } else {
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                gapComposer3.startReplaceGroup(-1038911249);
                                gapComposer3.end(false);
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 221184, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                pointerInputChange.getClass();
                JobKt.launch$default((CoroutineScope) obj7, null, null, new CardSceneEffectKt$CardSceneEffect$touchModifier$1$1$2$1((MutableSharedFlow) obj6, (Offset) obj2, this.f$2, (MutableState) obj5, pointerInputChange, (CardScene) obj4, (PointerInputScope) obj3, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TooltipBoxKt$$ExternalSyntheticLambda8(Object obj, Object obj2, float f, Function0 function0, Object obj3, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = f;
        this.f$3 = function0;
        this.f$4 = obj3;
        this.f$5 = obj4;
    }

    public /* synthetic */ TooltipBoxKt$$ExternalSyntheticLambda8(CoroutineScope coroutineScope, MutableSharedFlow mutableSharedFlow, float f, MutableState mutableState, CardScene cardScene, PointerInputScope pointerInputScope) {
        this.$r8$classId = 3;
        this.f$0 = coroutineScope;
        this.f$1 = mutableSharedFlow;
        this.f$2 = f;
        this.f$3 = mutableState;
        this.f$4 = cardScene;
        this.f$5 = pointerInputScope;
    }
}
