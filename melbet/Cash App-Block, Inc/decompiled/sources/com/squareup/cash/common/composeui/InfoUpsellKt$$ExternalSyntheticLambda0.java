package com.squareup.cash.common.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.DpSize;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.shopping.views.ShopErrorKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class InfoUpsellKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Function0 f$6;
    public final /* synthetic */ Function f$7;
    public final /* synthetic */ Function2 f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ InfoUpsellKt$$ExternalSyntheticLambda0(String str, Painter painter, Modifier modifier, DpSize dpSize, String str2, NavigationType navigationType, Function0 function0, Function3 function3, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$0 = str;
        this.f$1 = painter;
        this.f$2 = modifier;
        this.f$3 = dpSize;
        this.f$4 = str2;
        this.f$5 = navigationType;
        this.f$6 = function0;
        this.f$7 = function3;
        this.f$8 = composableLambdaImpl;
        this.f$9 = i;
        this.f$10 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$9;
        Function function = this.f$7;
        Object obj3 = this.f$5;
        Object obj4 = this.f$3;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                VisibleKt.m3492InfoUpsellvCkY0N0(this.f$0, (Painter) obj5, this.f$2, (DpSize) obj4, this.f$4, (NavigationType) obj3, this.f$6, (Function3) function, (ComposableLambdaImpl) this.f$8, (Composer) obj, updateChangedFlags, this.f$10);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                ShopErrorKt.ShopHubToolbar(this.f$0, this.f$4, (Function1) obj5, this.f$2, (FocusRequester) obj4, (Function1) obj3, this.f$6, (Function0) function, this.f$8, (Composer) obj, updateChangedFlags2, this.f$10);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InfoUpsellKt$$ExternalSyntheticLambda0(String str, String str2, Function1 function1, Modifier modifier, FocusRequester focusRequester, Function1 function12, Function0 function0, Function0 function02, Function2 function2, int i, int i2) {
        this.f$0 = str;
        this.f$4 = str2;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$3 = focusRequester;
        this.f$5 = function12;
        this.f$6 = function0;
        this.f$7 = function02;
        this.f$8 = function2;
        this.f$9 = i;
        this.f$10 = i2;
    }
}
