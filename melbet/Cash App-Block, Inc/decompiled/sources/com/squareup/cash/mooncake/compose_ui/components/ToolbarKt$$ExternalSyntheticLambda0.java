package com.squareup.cash.mooncake.compose_ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ToolbarKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NavigationIconType f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Function0 f$3;

    public /* synthetic */ ToolbarKt$$ExternalSyntheticLambda0(int i, long j, NavigationIconType navigationIconType, Function0 function0) {
        this.$r8$classId = 2;
        this.f$0 = navigationIconType;
        this.f$1 = j;
        this.f$3 = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    NavigationIconType navigationIconType = this.f$0;
                    if (navigationIconType == null) {
                        gapComposer.startReplaceGroup(735178318);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(735178319);
                        KeypadKt.m3646NavigationIconbfVYXPE(0, this.f$1, gapComposer, navigationIconType, this.f$3);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    NavigationIconType navigationIconType2 = this.f$0;
                    if (navigationIconType2 == null) {
                        gapComposer2.startReplaceGroup(-1841595428);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1841595427);
                        KeypadKt.m3646NavigationIconbfVYXPE(0, this.f$1, gapComposer2, navigationIconType2, this.f$3);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                KeypadKt.m3646NavigationIconbfVYXPE(Updater.updateChangedFlags(1), this.f$1, (Composer) obj, this.f$0, this.f$3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ToolbarKt$$ExternalSyntheticLambda0(NavigationIconType navigationIconType, long j, Function0 function0, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = navigationIconType;
        this.f$1 = j;
        this.f$3 = function0;
    }
}
