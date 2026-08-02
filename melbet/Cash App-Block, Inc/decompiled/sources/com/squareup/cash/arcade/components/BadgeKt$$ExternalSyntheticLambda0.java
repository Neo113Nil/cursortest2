package com.squareup.cash.arcade.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes.dex */
public final /* synthetic */ class BadgeKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ ComposableLambdaImpl f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ BadgeKt$$ExternalSyntheticLambda0(Modifier modifier, boolean z, ButtonCtaGroupOrientation buttonCtaGroupOrientation, Function3 function3, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = 2;
        this.f$2 = modifier;
        this.f$3 = z;
        this.f$0 = buttonCtaGroupOrientation;
        this.f$1 = function3;
        this.f$4 = composableLambdaImpl;
        this.f$5 = i;
        this.f$6 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                Room.BadgeAssetLayout((Badge) obj4, (BadgePlacement) obj3, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$6);
                break;
            case 1:
                ((Integer) obj2).getClass();
                Room.BadgeAssetLayout((Badge) obj4, (BadgePlacement) obj3, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$6);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                Modifier modifier = this.f$2;
                boolean z = this.f$3;
                DimensionKt.ButtonCtaGroup(modifier, z, (ButtonCtaGroupOrientation) obj4, (Function3) obj3, this.f$4, (Composer) obj, updateChangedFlags, this.f$6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BadgeKt$$ExternalSyntheticLambda0(Badge badge, BadgePlacement badgePlacement, Modifier modifier, boolean z, ComposableLambdaImpl composableLambdaImpl, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = badge;
        this.f$1 = badgePlacement;
        this.f$2 = modifier;
        this.f$3 = z;
        this.f$4 = composableLambdaImpl;
        this.f$5 = i;
        this.f$6 = i2;
    }
}
