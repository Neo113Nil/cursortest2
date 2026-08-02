package com.squareup.cash.arcade.components;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import app.cash.local.views.brand.checkout.CheckoutExpandableReviewRowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class FilterBarKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ int f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ FilterBarKt$$ExternalSyntheticLambda3(Modifier modifier, String str, AnnotatedString annotatedString, boolean z, Function0 function0, PaddingValues paddingValues, boolean z2, boolean z3, int i, int i2) {
        this.f$1 = modifier;
        this.f$4 = str;
        this.f$5 = annotatedString;
        this.f$2 = z;
        this.f$0 = function0;
        this.f$7 = paddingValues;
        this.f$3 = z2;
        this.f$6 = z3;
        this.f$8 = i;
        this.f$9 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$8;
        Object obj3 = this.f$7;
        Object obj4 = this.f$4;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                FilterBarKt.Chip(this.f$0, this.f$1, this.f$2, this.f$3, (FilterBarChipType) obj4, this.f$5, this.f$6, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags, this.f$9);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                CheckoutExpandableReviewRowKt.CheckoutReviewRow(this.f$1, (String) obj4, (AnnotatedString) this.f$5, this.f$2, this.f$0, (PaddingValues) obj3, this.f$3, this.f$6, (Composer) obj, updateChangedFlags2, this.f$9);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FilterBarKt$$ExternalSyntheticLambda3(Function0 function0, Modifier modifier, boolean z, boolean z2, FilterBarChipType filterBarChipType, Object obj, boolean z3, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = filterBarChipType;
        this.f$5 = obj;
        this.f$6 = z3;
        this.f$7 = composableLambdaImpl;
        this.f$8 = i;
        this.f$9 = i2;
    }
}
