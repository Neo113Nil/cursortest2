package com.emeraldpulse.kyra;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: MainActivity.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final class MainActivityKt$EmeraldPulseApp$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableIntState $selectedTab$delegate;

    MainActivityKt$EmeraldPulseApp$1(MutableIntState mutableIntState) {
        this.$selectedTab$delegate = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int EmeraldPulseApp$lambda$2;
        ComposerKt.sourceInformation(composer, "C169@6293L20,167@6205L122:MainActivity.kt#f5odrr");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1760277580, i, -1, "com.emeraldpulse.kyra.EmeraldPulseApp.<anonymous> (MainActivity.kt:167)");
        }
        EmeraldPulseApp$lambda$2 = MainActivityKt.EmeraldPulseApp$lambda$2(this.$selectedTab$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableIntState mutableIntState = this.$selectedTab$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = MainActivityKt$EmeraldPulseApp$1.invoke$lambda$1$lambda$0(MutableIntState.this, ((Integer) obj).intValue());
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        MainActivityKt.PulseBottomBar(EmeraldPulseApp$lambda$2, (Function1) rememberedValue, composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }
}
