package com.squareup.cash.arcade.components.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ListOrderedKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ ComposableLambdaImpl f$1;
    public final /* synthetic */ ListOrderedColors$Subtle f$2;
    public final /* synthetic */ Modifier f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ ListOrderedKt$$ExternalSyntheticLambda10(String str, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, ListOrderedColors$Subtle listOrderedColors$Subtle, int i) {
        this.f$0 = str;
        this.f$1 = composableLambdaImpl;
        this.f$3 = modifier;
        this.f$2 = listOrderedColors$Subtle;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ListOrderedKt.ItemWithoutBody(Updater.updateChangedFlags(i2 | 1), (Composer) obj, this.f$1, this.f$3, this.f$2, this.f$0);
                break;
            default:
                ((Integer) obj2).getClass();
                ListOrderedKt.OrderedListItemStandard(Updater.updateChangedFlags(i2 | 1), (Composer) obj, this.f$1, this.f$3, this.f$2, this.f$0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ListOrderedKt$$ExternalSyntheticLambda10(String str, ComposableLambdaImpl composableLambdaImpl, ListOrderedColors$Subtle listOrderedColors$Subtle, Modifier modifier, int i) {
        this.f$0 = str;
        this.f$1 = composableLambdaImpl;
        this.f$2 = listOrderedColors$Subtle;
        this.f$3 = modifier;
        this.f$4 = i;
    }
}
