package com.squareup.cash.mooncake.compose_ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class ToolbarKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ NavigationIconType f$4;
    public final /* synthetic */ long f$5;
    public final /* synthetic */ Function0 f$7;
    public final /* synthetic */ Function3 f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ ToolbarKt$$ExternalSyntheticLambda2(Object obj, Modifier modifier, NavigationIconType navigationIconType, long j, Function0 function0, Function3 function3, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = modifier;
        this.f$4 = navigationIconType;
        this.f$5 = j;
        this.f$7 = function0;
        this.f$8 = function3;
        this.f$9 = i;
        this.f$10 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$9;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                KeypadKt.m3654ToolbarA_Dysh8((String) obj3, this.f$1, this.f$4, this.f$5, this.f$7, this.f$8, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$10);
                break;
            default:
                ((Integer) obj2).getClass();
                KeypadKt.m3653Toolbar7ZsnBMk((ComposableLambdaImpl) obj3, this.f$1, this.f$4, this.f$5, this.f$7, this.f$8, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$10);
                break;
        }
        return Unit.INSTANCE;
    }
}
