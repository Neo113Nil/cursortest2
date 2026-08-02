package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewKt$$ExternalSyntheticLambda20 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ long f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ Function0 f$7;
    public final /* synthetic */ int f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda20(Modifier modifier, int i, int i2, long j, long j2, boolean z, boolean z2, Function0 function0, int i3, int i4, int i5) {
        this.$r8$classId = i5;
        this.f$0 = modifier;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = j;
        this.f$4 = j2;
        this.f$5 = z;
        this.f$6 = z2;
        this.f$7 = function0;
        this.f$8 = i3;
        this.f$9 = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(this.f$8 | 1);
                CardStudioViewKt.m3432StudioButtonXz6DiA(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, updateChangedFlags, this.f$9);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$8 | 1);
                CardStudioViewKt.m3430ClipStudioButtonXz6DiA(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, updateChangedFlags2, this.f$9);
                break;
        }
        return Unit.INSTANCE;
    }
}
