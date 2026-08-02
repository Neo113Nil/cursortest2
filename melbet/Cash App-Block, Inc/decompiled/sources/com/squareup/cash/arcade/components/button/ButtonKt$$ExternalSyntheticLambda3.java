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
public final /* synthetic */ class ButtonKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ MutableInteractionSourceImpl f$3;
    public final /* synthetic */ Function3 f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda3(Function0 function0, Modifier modifier, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function3 function3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$3 = mutableInteractionSourceImpl;
        this.f$4 = function3;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                SizeKt.SecondaryModalButton(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(this.f$5 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SizeKt.PrimaryModalButton(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(this.f$5 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
