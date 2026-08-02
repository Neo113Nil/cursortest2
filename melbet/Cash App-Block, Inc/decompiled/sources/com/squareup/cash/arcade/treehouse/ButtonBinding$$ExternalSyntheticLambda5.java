package com.squareup.cash.arcade.treehouse;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import app.cash.arcade.values.ButtonProminence;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ButtonBinding$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ButtonBinding f$0;
    public final /* synthetic */ ButtonProminence f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ ComposableLambdaImpl f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ ButtonBinding$$ExternalSyntheticLambda5(ButtonBinding buttonBinding, ButtonProminence buttonProminence, Function0 function0, boolean z, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = buttonBinding;
        this.f$1 = buttonProminence;
        this.f$2 = function0;
        this.f$3 = z;
        this.f$4 = composableLambdaImpl;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                int i3 = ButtonBinding.$r8$clinit;
                this.f$0.CTAButton(this.f$1, this.f$2, this.f$3, this.f$4, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                ((Integer) obj2).getClass();
                int i4 = ButtonBinding.$r8$clinit;
                this.f$0.DefaultButton(this.f$1, this.f$2, this.f$3, this.f$4, composer2, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                Composer composer3 = (Composer) obj;
                ((Integer) obj2).getClass();
                int i5 = ButtonBinding.$r8$clinit;
                this.f$0.CompactButton(this.f$1, this.f$2, this.f$3, this.f$4, composer3, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
