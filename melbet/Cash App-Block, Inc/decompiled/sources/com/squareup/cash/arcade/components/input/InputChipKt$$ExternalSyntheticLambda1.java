package com.squareup.cash.arcade.components.input;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class InputChipKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ InputChipKt$$ExternalSyntheticLambda1(int i, int i2, int i3, ComposableLambdaImpl composableLambdaImpl, Modifier modifier) {
        this.f$0 = modifier;
        this.f$1 = i;
        this.f$2 = composableLambdaImpl;
        this.f$3 = i2;
        this.f$4 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                int i3 = this.f$1;
                InputChipKt.InputChipGrid((Modifier) obj4, i3, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags, this.f$4);
                break;
            case 1:
                ((Integer) obj2).getClass();
                MeasureScopeWithLayoutNodeKt.m888ConfirmationSheetBody8iNrtrE((String) obj4, (Function1) obj3, this.f$1, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                int i4 = this.f$1;
                LocaleToggleKt.LoadingTextShimmerBox(i4, (Modifier) obj4, (TextStyle) obj3, (Composer) obj, updateChangedFlags2, this.f$4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InputChipKt$$ExternalSyntheticLambda1(int i, Modifier modifier, TextStyle textStyle, int i2, int i3) {
        this.f$1 = i;
        this.f$0 = modifier;
        this.f$2 = textStyle;
        this.f$3 = i2;
        this.f$4 = i3;
    }

    public /* synthetic */ InputChipKt$$ExternalSyntheticLambda1(String str, Function1 function1, int i, int i2, int i3) {
        this.f$0 = str;
        this.f$2 = function1;
        this.f$1 = i;
        this.f$3 = i2;
        this.f$4 = i3;
    }
}
