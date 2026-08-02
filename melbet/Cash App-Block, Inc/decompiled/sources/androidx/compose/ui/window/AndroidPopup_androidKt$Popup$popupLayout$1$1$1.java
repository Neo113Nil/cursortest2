package androidx.compose.ui.window;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1 extends Lambda implements Function2 {
    public final /* synthetic */ MutableState $currentContent$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PopupLayout $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidPopup_androidKt$Popup$popupLayout$1$1$1(PopupLayout popupLayout, MutableState mutableState, int i) {
        super(2);
        this.$r8$classId = i;
        this.$this_apply = popupLayout;
        this.$currentContent$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$currentContent$delegate;
        PopupLayout popupLayout = this.$this_apply;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(AndroidPopup_androidKt.LocalIsInPopupLayout.defaultProvidedValue$runtime(Boolean.TRUE), Expect_jvmKt.rememberComposableLambda(1022273628, new AndroidPopup_androidKt$Popup$popupLayout$1$1$1(popupLayout, mutableState, i2), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = AndroidPopup_androidKt$Popup$5$1$1.INSTANCE$3;
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue);
                    boolean changedInstance = gapComposer2.changedInstance(popupLayout);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new AndroidPopup_androidKt$Popup$7$1(popupLayout, 1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Modifier alpha = AlphaKt.alpha(RulerKt.onSizeChanged(semantics, (Function1) rememberedValue2), ((Boolean) popupLayout.canCalculatePosition$delegate.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE);
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidPopup_androidKt.LocalPopupTestTag;
                    Function2 function2 = (Function2) mutableState.getValue();
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = AndroidPopup_androidKt$SimpleStack$1$1.INSTANCE;
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, alpha);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline1.m(0, function2, gapComposer2, true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
