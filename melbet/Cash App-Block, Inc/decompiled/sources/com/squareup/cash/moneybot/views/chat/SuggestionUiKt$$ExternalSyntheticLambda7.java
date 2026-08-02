package com.squareup.cash.moneybot.views.chat;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.moneybot.viewmodels.SuggestionRowModel;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class SuggestionUiKt$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Function f$6;
    public final /* synthetic */ Function f$7;
    public final /* synthetic */ int f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ SuggestionUiKt$$ExternalSyntheticLambda7(Modifier modifier, PaddingValues paddingValues, boolean z, Arrangement$Vertical arrangement$Vertical, boolean z2, ScrollState scrollState, Function2 function2, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = paddingValues;
        this.f$3 = z;
        this.f$2 = arrangement$Vertical;
        this.f$4 = z2;
        this.f$5 = scrollState;
        this.f$6 = function2;
        this.f$7 = composableLambdaImpl;
        this.f$8 = i;
        this.f$9 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$8;
        Function function = this.f$7;
        Function function2 = this.f$6;
        Object obj3 = this.f$5;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                SuggestionUiKt.SuggestionRow(this.f$0, (SuggestionRowModel) obj5, (SuggestionRowStyle) obj4, this.f$3, this.f$4, (TextStyle) obj3, (Function0) function2, (Function0) function, (Composer) obj, updateChangedFlags, this.f$9);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                LayoutKt.Layout(this.f$0, (PaddingValues) obj5, this.f$3, (Arrangement$Vertical) obj4, this.f$4, (ScrollState) obj3, (Function2) function2, (ComposableLambdaImpl) function, (Composer) obj, updateChangedFlags2, this.f$9);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SuggestionUiKt$$ExternalSyntheticLambda7(Modifier modifier, SuggestionRowModel suggestionRowModel, SuggestionRowStyle suggestionRowStyle, boolean z, boolean z2, TextStyle textStyle, Function0 function0, Function0 function02, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = suggestionRowModel;
        this.f$2 = suggestionRowStyle;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$5 = textStyle;
        this.f$6 = function0;
        this.f$7 = function02;
        this.f$8 = i;
        this.f$9 = i2;
    }
}
