package com.squareup.cash.arcade.components.button;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import coil3.size.SizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class ButtonKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ ButtonProminence f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ MutableInteractionSourceImpl f$5;
    public final /* synthetic */ Function3 f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda1(Function0 function0, Modifier modifier, ButtonProminence buttonProminence, boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function3 function3, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = buttonProminence;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$5 = mutableInteractionSourceImpl;
        this.f$6 = function3;
        this.f$7 = i;
        this.f$8 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                SizeKt.Button(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj, Updater.updateChangedFlags(this.f$7 | 1), this.f$8);
                break;
            default:
                ((Integer) obj2).getClass();
                SizeKt.ButtonCompact(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj, Updater.updateChangedFlags(this.f$7 | 1), this.f$8);
                break;
        }
        return Unit.INSTANCE;
    }
}
