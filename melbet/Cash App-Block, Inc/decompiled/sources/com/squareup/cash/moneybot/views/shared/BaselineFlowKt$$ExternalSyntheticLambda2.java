package com.squareup.cash.moneybot.views.shared;

import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class BaselineFlowKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ CharSequence f$0;
    public final /* synthetic */ TextStyle f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ int f$11;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ TextMeasurer f$4;
    public final /* synthetic */ String f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ long f$7;
    public final /* synthetic */ Function0 f$8;
    public final /* synthetic */ Function0 f$9;

    public /* synthetic */ BaselineFlowKt$$ExternalSyntheticLambda2(AnnotatedString annotatedString, TextStyle textStyle, Modifier modifier, long j, TextMeasurer textMeasurer, String str, boolean z, long j2, Function0 function0, Function0 function02, int i, int i2) {
        this.f$0 = annotatedString;
        this.f$1 = textStyle;
        this.f$2 = modifier;
        this.f$3 = j;
        this.f$4 = textMeasurer;
        this.f$5 = str;
        this.f$6 = z;
        this.f$7 = j2;
        this.f$8 = function0;
        this.f$9 = function02;
        this.f$10 = i;
        this.f$11 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$10;
        CharSequence charSequence = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                LazyGridDslKt.m314BaselineFlowhkzSW1g((AnnotatedString) charSequence, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, (Composer) obj, updateChangedFlags, this.f$11);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                LazyGridDslKt.m315BaselineFlowhkzSW1g(this.f$5, this.f$1, this.f$2, this.f$3, this.f$4, (String) charSequence, this.f$6, this.f$7, this.f$8, this.f$9, (Composer) obj, updateChangedFlags2, this.f$11);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BaselineFlowKt$$ExternalSyntheticLambda2(String str, TextStyle textStyle, Modifier modifier, long j, TextMeasurer textMeasurer, String str2, boolean z, long j2, Function0 function0, Function0 function02, int i, int i2) {
        this.f$5 = str;
        this.f$1 = textStyle;
        this.f$2 = modifier;
        this.f$3 = j;
        this.f$4 = textMeasurer;
        this.f$0 = str2;
        this.f$6 = z;
        this.f$7 = j2;
        this.f$8 = function0;
        this.f$9 = function02;
        this.f$10 = i;
        this.f$11 = i2;
    }
}
