package com.squareup.cash.arcade.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.core.graphics.PathParser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ToggleKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ ToggleKt$$ExternalSyntheticLambda2(Modifier modifier, boolean z, boolean z2, int i, int i2) {
        this.f$1 = modifier;
        this.f$0 = z;
        this.f$2 = z2;
        this.f$3 = i;
        this.f$4 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                ModalKt.Toggle(Updater.updateChangedFlags(this.f$3 | 1), this.f$4, (Composer) obj, this.f$1, this.f$0, this.f$2);
                break;
            default:
                ((Integer) obj2).getClass();
                PathParser.RecipientBadge(Updater.updateChangedFlags(this.f$3 | 1), this.f$4, (Composer) obj, this.f$1, this.f$0, this.f$2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ToggleKt$$ExternalSyntheticLambda2(boolean z, Modifier modifier, boolean z2, int i, int i2) {
        this.f$0 = z;
        this.f$1 = modifier;
        this.f$2 = z2;
        this.f$3 = i;
        this.f$4 = i2;
    }
}
