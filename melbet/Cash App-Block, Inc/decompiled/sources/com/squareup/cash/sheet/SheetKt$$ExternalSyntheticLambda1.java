package com.squareup.cash.sheet;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.CardKt;
import androidx.compose.material.DefaultButtonColors;
import androidx.compose.material.DefaultButtonElevation;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.MenuItemColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.squareup.cash.pools.views.StartPoolAmountKt;
import com.squareup.protos.common.CurrencyCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class SheetKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda1(ComposableLambdaImpl composableLambdaImpl, Function0 function0, Modifier modifier, Function2 function2, Function2 function22, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, int i, int i2) {
        this.f$8 = composableLambdaImpl;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = function2;
        this.f$3 = function22;
        this.f$6 = z;
        this.f$4 = menuItemColors;
        this.f$7 = paddingValues;
        this.f$9 = i;
        this.f$10 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$9;
        Object obj3 = this.f$8;
        Object obj4 = this.f$7;
        Object obj5 = this.f$3;
        Object obj6 = this.f$4;
        Object obj7 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                SheetKt.Sheet(this.f$0, this.f$1, (RealSheetState) obj7, (SheetPeekPosition$FixedHeight) obj5, (String) obj6, this.f$6, (SheetTopCornerBehavior) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags, this.f$10);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                CardKt.Button(this.f$0, this.f$1, this.f$6, (DefaultButtonElevation) obj7, (Shape) obj5, (DefaultButtonColors) obj6, (PaddingValues) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags2, this.f$10);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                AndroidMenu_androidKt.DropdownMenuItem((ComposableLambdaImpl) obj3, this.f$0, this.f$1, (Function2) obj7, (Function2) obj5, this.f$6, (MenuItemColors) obj6, (PaddingValues) obj4, (Composer) obj, updateChangedFlags3, this.f$10);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                StartPoolAmountKt.StartPoolAmount((CurrencyCode) obj7, (String) obj6, this.f$6, (Function1) obj5, this.f$0, (Function0) obj4, this.f$1, (String) obj3, (Composer) obj, updateChangedFlags4, this.f$10);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda1(CurrencyCode currencyCode, String str, boolean z, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, String str2, int i, int i2) {
        this.f$2 = currencyCode;
        this.f$4 = str;
        this.f$6 = z;
        this.f$3 = function1;
        this.f$0 = function0;
        this.f$7 = function02;
        this.f$1 = modifier;
        this.f$8 = str2;
        this.f$9 = i;
        this.f$10 = i2;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda1(Function0 function0, Modifier modifier, RealSheetState realSheetState, SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight, String str, boolean z, SheetTopCornerBehavior sheetTopCornerBehavior, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = realSheetState;
        this.f$3 = sheetPeekPosition$FixedHeight;
        this.f$4 = str;
        this.f$6 = z;
        this.f$7 = sheetTopCornerBehavior;
        this.f$8 = composableLambdaImpl;
        this.f$9 = i;
        this.f$10 = i2;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda1(Function0 function0, Modifier modifier, boolean z, DefaultButtonElevation defaultButtonElevation, Shape shape, DefaultButtonColors defaultButtonColors, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$6 = z;
        this.f$2 = defaultButtonElevation;
        this.f$3 = shape;
        this.f$4 = defaultButtonColors;
        this.f$7 = paddingValues;
        this.f$8 = composableLambdaImpl;
        this.f$9 = i;
        this.f$10 = i2;
    }
}
