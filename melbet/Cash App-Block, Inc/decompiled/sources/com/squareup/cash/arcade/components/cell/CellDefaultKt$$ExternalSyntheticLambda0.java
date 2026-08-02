package com.squareup.cash.arcade.components.cell;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.Badge;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class CellDefaultKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function2 f$0;
    public final /* synthetic */ Function2 f$1;
    public final /* synthetic */ long f$10;
    public final /* synthetic */ int f$12;
    public final /* synthetic */ int f$14;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ Function0 f$3;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ Function f$7;
    public final /* synthetic */ Badge f$8;
    public final /* synthetic */ CellDefaultAccessory f$9;

    public /* synthetic */ CellDefaultKt$$ExternalSyntheticLambda0(Function2 function2, Modifier modifier, Function0 function0, boolean z, boolean z2, Function2 function22, Badge badge, long j, CellDefaultAccessory cellDefaultAccessory, Function0 function02, int i, int i2) {
        this.f$0 = function2;
        this.f$2 = modifier;
        this.f$3 = function0;
        this.f$5 = z;
        this.f$6 = z2;
        this.f$1 = function22;
        this.f$8 = badge;
        this.f$10 = j;
        this.f$9 = cellDefaultAccessory;
        this.f$7 = function02;
        this.f$12 = i;
        this.f$14 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(this.f$12 | 1);
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(this.f$0, this.f$1, this.f$2, this.f$3, this.f$5, this.f$6, (Function2) this.f$7, this.f$8, this.f$9, this.f$10, (Composer) obj, updateChangedFlags, this.f$14);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$12 | 1);
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(this.f$0, this.f$2, this.f$3, this.f$5, this.f$6, this.f$1, this.f$8, this.f$10, this.f$9, (Function0) this.f$7, (Composer) obj, updateChangedFlags2, this.f$14);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CellDefaultKt$$ExternalSyntheticLambda0(Function2 function2, Function2 function22, Modifier modifier, Function0 function0, boolean z, boolean z2, Function2 function23, Badge badge, CellDefaultAccessory cellDefaultAccessory, long j, int i, int i2) {
        this.f$0 = function2;
        this.f$1 = function22;
        this.f$2 = modifier;
        this.f$3 = function0;
        this.f$5 = z;
        this.f$6 = z2;
        this.f$7 = function23;
        this.f$8 = badge;
        this.f$9 = cellDefaultAccessory;
        this.f$10 = j;
        this.f$12 = i;
        this.f$14 = i2;
    }
}
