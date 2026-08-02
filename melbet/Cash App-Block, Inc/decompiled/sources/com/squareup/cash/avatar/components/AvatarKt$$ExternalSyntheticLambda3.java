package com.squareup.cash.avatar.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AvatarKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function2 f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ TextStyle f$3;
    public final /* synthetic */ long f$5;

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda3(String str, Function2 function2, long j, TextStyle textStyle, long j2) {
        this.f$0 = str;
        this.f$1 = function2;
        this.f$2 = j;
        this.f$3 = textStyle;
        this.f$5 = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AvatarKt.m3406MonogramOrPlaceholderXxnsNlY(this.f$0, this.f$1, this.f$2, this.f$3, this.f$5, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AvatarKt.m3406MonogramOrPlaceholderXxnsNlY(this.f$0, this.f$1, this.f$2, this.f$3, this.f$5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda3(String str, Function2 function2, long j, TextStyle textStyle, long j2, int i) {
        this.f$0 = str;
        this.f$1 = function2;
        this.f$2 = j;
        this.f$3 = textStyle;
        this.f$5 = j2;
    }
}
