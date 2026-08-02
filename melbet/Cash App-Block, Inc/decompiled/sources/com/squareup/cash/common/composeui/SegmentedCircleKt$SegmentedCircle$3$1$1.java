package com.squareup.cash.common.composeui;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class SegmentedCircleKt$SegmentedCircle$3$1$1 implements Function1 {
    public final /* synthetic */ SegmentedCircleConfig $config;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SegmentedCircleKt$SegmentedCircle$3$1$1(SegmentedCircleConfig segmentedCircleConfig, int i) {
        this.$r8$classId = i;
        this.$config = segmentedCircleConfig;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        SegmentedCircleConfig segmentedCircleConfig = this.$config;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                String str = segmentedCircleConfig.accessibilityLabel;
                if (str != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                }
                break;
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                String str2 = segmentedCircleConfig.accessibilityLabel;
                if (str2 != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, str2);
                }
                break;
            default:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                String str3 = segmentedCircleConfig.accessibilityLabel;
                if (str3 != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver3, str3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
