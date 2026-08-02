package com.squareup.cash.savings.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.google.android.gms.internal.common.zzj;
import com.squareup.cash.arcade.Icons;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class SavingsScreenHeaderKt$$ExternalSyntheticLambda18 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ Modifier f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Function f$5;

    public /* synthetic */ SavingsScreenHeaderKt$$ExternalSyntheticLambda18(float f, long j, long j2, Modifier modifier, String str, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = f;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = modifier;
        this.f$4 = str;
        this.f$5 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function function = this.f$5;
        Object obj3 = this.f$4;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(196609);
                SavingsScreenHeaderKt.m3739GoalProgressqi6gXK8(this.f$0, this.f$1, this.f$2, this.f$3, (String) obj3, (ComposableLambdaImpl) function, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(7);
                zzj.m2004ImageButtonY0xEhic((Icons) obj3, this.f$0, this.f$1, this.f$2, (Function0) function, this.f$3, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SavingsScreenHeaderKt$$ExternalSyntheticLambda18(Icons icons, float f, long j, long j2, Function0 function0, Modifier modifier, int i) {
        this.f$4 = icons;
        this.f$0 = f;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$5 = function0;
        this.f$3 = modifier;
    }
}
