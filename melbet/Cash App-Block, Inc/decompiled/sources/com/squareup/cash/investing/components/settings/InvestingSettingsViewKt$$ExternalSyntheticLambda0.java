package com.squareup.cash.investing.components.settings;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewModel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import net.idrnd.face.iad.capture.internal.s;

/* loaded from: classes9.dex */
public final /* synthetic */ class InvestingSettingsViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ InvestingSettingsViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ InvestingSettingsViewKt$$ExternalSyntheticLambda0(InvestingSettingsViewModel investingSettingsViewModel, Function1 function1) {
        this.f$0 = investingSettingsViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        InvestingSettingsViewModel investingSettingsViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, MooncakeTheme.getColors(gapComposer).secondaryBackground, ColorKt.RectangleShape));
                    boolean changedInstance = gapComposer.changedInstance(investingSettingsViewModel) | gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new GLSceneScope$$ExternalSyntheticLambda10(28, investingSettingsViewModel, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    LazyDslKt.LazyColumn(systemBarsPadding, null, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 0, 510);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                s.InvestSettings(investingSettingsViewModel, function1, (Composer) obj, Updater.updateChangedFlags(9));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingSettingsViewKt$$ExternalSyntheticLambda0(InvestingSettingsViewModel investingSettingsViewModel, Function1 function1, int i) {
        this.f$0 = investingSettingsViewModel;
        this.f$1 = function1;
    }
}
