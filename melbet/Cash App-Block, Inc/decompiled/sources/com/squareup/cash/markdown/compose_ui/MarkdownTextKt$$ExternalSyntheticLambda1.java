package com.squareup.cash.markdown.compose_ui;

import androidx.biometric.KeyguardUtils;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MarkdownTextKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function2 f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ int f$11;
    public final /* synthetic */ int f$13;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ TextStyle f$3;
    public final /* synthetic */ long f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Function1 f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;
    public final /* synthetic */ TextLineBalancing f$9;

    public /* synthetic */ MarkdownTextKt$$ExternalSyntheticLambda1(String str, Function2 function2, Modifier modifier, TextStyle textStyle, long j, SpanStyle spanStyle, Function1 function1, int i, int i2, TextLineBalancing textLineBalancing, int i3, int i4, int i5) {
        this.f$0 = str;
        this.f$1 = function2;
        this.f$2 = modifier;
        this.f$3 = textStyle;
        this.f$4 = j;
        this.f$5 = spanStyle;
        this.f$6 = function1;
        this.f$7 = i;
        this.f$8 = i2;
        this.f$9 = textLineBalancing;
        this.f$10 = i3;
        this.f$11 = i4;
        this.f$13 = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(this.f$11 | 1);
                KeyguardUtils.m14MarkdownTextnvClB8o(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (SpanStyle) this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, (Composer) obj, updateChangedFlags, this.f$13);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$11 | 1);
                LazyDslKt.m304MarkdownTextpCuZGqc(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (MarkdownSpanValues) this.f$5, this.f$6, this.f$9, this.f$7, this.f$8, this.f$10, (Composer) obj, updateChangedFlags2, this.f$13);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MarkdownTextKt$$ExternalSyntheticLambda1(String str, Function2 function2, Modifier modifier, TextStyle textStyle, long j, MarkdownSpanValues markdownSpanValues, Function1 function1, TextLineBalancing textLineBalancing, int i, int i2, int i3, int i4, int i5) {
        this.f$0 = str;
        this.f$1 = function2;
        this.f$2 = modifier;
        this.f$3 = textStyle;
        this.f$4 = j;
        this.f$5 = markdownSpanValues;
        this.f$6 = function1;
        this.f$9 = textLineBalancing;
        this.f$7 = i;
        this.f$8 = i2;
        this.f$10 = i3;
        this.f$11 = i4;
        this.f$13 = i5;
    }
}
