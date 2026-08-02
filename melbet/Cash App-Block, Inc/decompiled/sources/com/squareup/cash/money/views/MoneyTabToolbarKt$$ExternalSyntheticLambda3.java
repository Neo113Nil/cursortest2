package com.squareup.cash.money.views;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.VisualTransformation;
import app.cash.broadway.ui.compose.UiScope;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.protos.franklin.cards.CardTheme;
import com.stripe.android.financialconnections.ui.components.TextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabToolbarKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$10;
    public final /* synthetic */ int f$11;
    public final /* synthetic */ int f$12;
    public final /* synthetic */ int f$13;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Function1 f$7;
    public final /* synthetic */ Modifier f$8;
    public final /* synthetic */ boolean f$9;

    public /* synthetic */ MoneyTabToolbarKt$$ExternalSyntheticLambda3(UiScope uiScope, TabToolbarInternalViewModel tabToolbarInternalViewModel, String str, CardTheme.Identifier identifier, ToolbarNestedScrollExpander toolbarNestedScrollExpander, CardNestedScrollExpander cardNestedScrollExpander, ElementBoundsRegistry elementBoundsRegistry, Function1 function1, Modifier modifier, boolean z, boolean z2, int i, int i2, int i3) {
        this.f$0 = uiScope;
        this.f$1 = tabToolbarInternalViewModel;
        this.f$2 = str;
        this.f$3 = identifier;
        this.f$4 = toolbarNestedScrollExpander;
        this.f$5 = cardNestedScrollExpander;
        this.f$6 = elementBoundsRegistry;
        this.f$7 = function1;
        this.f$8 = modifier;
        this.f$9 = z;
        this.f$10 = z2;
        this.f$11 = i;
        this.f$12 = i2;
        this.f$13 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$12;
        int i3 = this.f$11;
        Object obj3 = this.f$6;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                MoneyTabToolbarKt.MoneyTabToolbar((UiScope) obj8, (TabToolbarInternalViewModel) obj7, this.f$2, (CardTheme.Identifier) obj6, (ToolbarNestedScrollExpander) obj5, (CardNestedScrollExpander) obj4, (ElementBoundsRegistry) obj3, this.f$7, this.f$8, this.f$9, this.f$10, (Composer) obj, updateChangedFlags, updateChangedFlags2, this.f$13);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags4 = Updater.updateChangedFlags(i2);
                TextKt.FinancialConnectionsOutlinedTextField(this.f$2, this.f$9, this.f$8, this.f$7, this.f$10, (KeyboardOptions) obj8, (KeyboardActions) obj7, (Function2) obj6, (VisualTransformation) obj5, (Function2) obj4, (Function2) obj3, (Composer) obj, updateChangedFlags3, updateChangedFlags4, this.f$13);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneyTabToolbarKt$$ExternalSyntheticLambda3(String str, boolean z, Modifier modifier, Function1 function1, boolean z2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, Function2 function2, VisualTransformation visualTransformation, Function2 function22, Function2 function23, int i, int i2, int i3) {
        this.f$2 = str;
        this.f$9 = z;
        this.f$8 = modifier;
        this.f$7 = function1;
        this.f$10 = z2;
        this.f$0 = keyboardOptions;
        this.f$1 = keyboardActions;
        this.f$3 = function2;
        this.f$4 = visualTransformation;
        this.f$5 = function22;
        this.f$6 = function23;
        this.f$11 = i;
        this.f$12 = i2;
        this.f$13 = i3;
    }
}
