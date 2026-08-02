package com.squareup.cash.arcade.components.button;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ButtonDefaultGroupKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ ComposableLambdaImpl f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ ButtonDefaultGroupKt$$ExternalSyntheticLambda0(int i, int i2, int i3, ComposableLambdaImpl composableLambdaImpl, Modifier modifier) {
        this.$r8$classId = i3;
        this.f$0 = modifier;
        this.f$1 = composableLambdaImpl;
        this.f$2 = i;
        this.f$3 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        int i3 = this.f$2;
        ComposableLambdaImpl composableLambdaImpl = this.f$1;
        Modifier modifier = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                zzabx.ButtonDefaultGroupVertical(modifier, composableLambdaImpl, composer, Updater.updateChangedFlags(i3 | 1), i2);
                break;
            default:
                zzabx.ButtonDefaultGroupHorizontal(modifier, composableLambdaImpl, composer, Updater.updateChangedFlags(i3 | 1), i2);
                break;
        }
        return Unit.INSTANCE;
    }
}
