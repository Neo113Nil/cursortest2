package com.squareup.cash.arcade.components.button;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import coil3.size.DimensionKt;
import com.squareup.cash.mooncake.compose_ui.ComposeColorPalette;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes.dex */
public final /* synthetic */ class ButtonCtaGroupKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ ComposableLambdaImpl f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ ButtonCtaGroupKt$$ExternalSyntheticLambda4(Context context, ComposeColorPalette composeColorPalette, boolean z, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = context;
        this.f$2 = composeColorPalette;
        this.f$1 = z;
        this.f$3 = composableLambdaImpl;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                boolean z = this.f$1;
                DimensionKt.BaseButtonCtaGroup((Modifier) obj4, z, (Function3) obj3, this.f$3, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                ComposeMooncakeThemeKt.ProvideMooncakeTheme((Context) obj4, (ComposeColorPalette) obj3, this.f$1, this.f$3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ButtonCtaGroupKt$$ExternalSyntheticLambda4(Modifier modifier, boolean z, Function3 function3, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = modifier;
        this.f$1 = z;
        this.f$2 = function3;
        this.f$3 = composableLambdaImpl;
        this.f$4 = i;
    }
}
