package com.squareup.cash.arcade.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class ModalButtonScope$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ModalButtonScope f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Function3 f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ ModalButtonScope$$ExternalSyntheticLambda0(ModalButtonScope modalButtonScope, Function0 function0, Modifier modifier, boolean z, Function3 function3, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = modalButtonScope;
        this.f$1 = function0;
        this.f$2 = modifier;
        this.f$3 = z;
        this.f$4 = function3;
        this.f$5 = i;
        this.f$6 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                this.f$0.SecondaryModalButton(this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$6);
                break;
            default:
                ((Integer) obj2).getClass();
                this.f$0.PrimaryModalButton(this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$6);
                break;
        }
        return Unit.INSTANCE;
    }
}
