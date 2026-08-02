package com.squareup.cash.arcade.components.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.squareup.workflow1.Snapshots;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class AutoScaleTextKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ TextStyle f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ long f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ Function1 f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ AutoScaleTextKt$$ExternalSyntheticLambda0(String str, Modifier modifier, TextStyle textStyle, long j, int i, int i2, long j2, int i3, Function1 function1, int i4, int i5) {
        this.f$0 = str;
        this.f$1 = modifier;
        this.f$2 = textStyle;
        this.f$3 = j;
        this.f$4 = i;
        this.f$5 = i2;
        this.f$6 = j2;
        this.f$7 = i3;
        this.f$8 = function1;
        this.f$9 = i4;
        this.f$10 = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(this.f$9 | 1);
                zzacn.m2012AutoScaleTextZLomxE(this.f$4, this.f$5, this.f$7, updateChangedFlags, this.f$10, this.f$3, this.f$6, (Composer) obj, this.f$1, this.f$2, this.f$0, this.f$8);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$9 | 1);
                Snapshots.m4002FoundationAutoScaleTextZLomxE(this.f$4, this.f$5, this.f$7, updateChangedFlags2, this.f$10, this.f$3, this.f$6, (Composer) obj, this.f$1, this.f$2, this.f$0, this.f$8);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AutoScaleTextKt$$ExternalSyntheticLambda0(String str, TextStyle textStyle, Modifier modifier, long j, int i, int i2, long j2, int i3, Function1 function1, int i4, int i5) {
        this.f$0 = str;
        this.f$2 = textStyle;
        this.f$1 = modifier;
        this.f$3 = j;
        this.f$4 = i;
        this.f$5 = i2;
        this.f$6 = j2;
        this.f$7 = i3;
        this.f$8 = function1;
        this.f$9 = i4;
        this.f$10 = i5;
    }
}
