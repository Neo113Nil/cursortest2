package com.squareup.cash.history.treehouse.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class MooncakeActivitySectionHeader$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ MooncakeActivitySectionHeader f$0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        MooncakeActivitySectionHeader mooncakeActivitySectionHeader = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = MooncakeActivitySectionHeader.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ConvertFromJavaKt.ActivitySectionHeader((String) mooncakeActivitySectionHeader.title$delegate.getValue(), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                int i3 = MooncakeActivitySectionHeader.$r8$clinit;
                mooncakeActivitySectionHeader.Content(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
