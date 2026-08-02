package com.squareup.cash.sheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.moneybot.widgets.UtilsKt;
import com.squareup.util.compose.SquircleShape;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class BasicShieetScope$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Modifier f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Function f$6;
    public final /* synthetic */ Function f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda7(Modifier modifier, String str, String str2, String str3, Function0 function0, String str4, Function0 function02, long j, int i, int i2) {
        this.f$4 = modifier;
        this.f$0 = str;
        this.f$2 = str2;
        this.f$3 = str3;
        this.f$7 = function0;
        this.f$5 = str4;
        this.f$6 = function02;
        this.f$1 = j;
        this.f$8 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function function = this.f$6;
        Object obj3 = this.f$5;
        Function function2 = this.f$7;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(this.f$8 | 1);
                ((BasicShieetScope) obj6).m3747SheetContainerPd0RII(this.f$1, (SquircleShape) obj5, (ComposableLambdaImpl) obj4, this.f$4, (SheetTopCornerBehavior) obj3, (Function3) function, (ComposableLambdaImpl) function2, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(7);
                UtilsKt.m3636FullscreenNotice6RhP_wg(this.f$4, (String) obj6, (String) obj5, (String) obj4, (Function0) function2, (String) obj3, (Function0) function, this.f$1, (Composer) obj, updateChangedFlags2, this.f$8);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda7(BasicShieetScope basicShieetScope, long j, SquircleShape squircleShape, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, SheetTopCornerBehavior sheetTopCornerBehavior, Function3 function3, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.f$0 = basicShieetScope;
        this.f$1 = j;
        this.f$2 = squircleShape;
        this.f$3 = composableLambdaImpl;
        this.f$4 = modifier;
        this.f$5 = sheetTopCornerBehavior;
        this.f$6 = function3;
        this.f$7 = composableLambdaImpl2;
        this.f$8 = i;
    }
}
