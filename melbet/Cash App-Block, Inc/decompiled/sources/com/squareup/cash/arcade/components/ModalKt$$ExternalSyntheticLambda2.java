package com.squareup.cash.arcade.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class ModalKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ ComposableLambdaImpl f$3;
    public final /* synthetic */ Function3 f$4;
    public final /* synthetic */ Function3 f$5;
    public final /* synthetic */ int f$6;
    public final /* synthetic */ int f$7;

    public /* synthetic */ ModalKt$$ExternalSyntheticLambda2(Modifier modifier, String str, String str2, ComposableLambdaImpl composableLambdaImpl, Function3 function3, Function3 function32, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = modifier;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = composableLambdaImpl;
        this.f$4 = function3;
        this.f$5 = function32;
        this.f$6 = i;
        this.f$7 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$6;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ModalKt.Modal(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$7);
                break;
            default:
                ((Integer) obj2).getClass();
                ModalKt.InlineMessage(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$7);
                break;
        }
        return Unit.INSTANCE;
    }
}
