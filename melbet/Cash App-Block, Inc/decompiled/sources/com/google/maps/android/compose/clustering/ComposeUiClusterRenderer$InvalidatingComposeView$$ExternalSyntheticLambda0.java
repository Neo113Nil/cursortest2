package com.google.maps.android.compose.clustering;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.google.maps.android.compose.clustering.ComposeUiClusterRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ComposeUiClusterRenderer$InvalidatingComposeView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ComposeUiClusterRenderer.InvalidatingComposeView f$0;

    public /* synthetic */ ComposeUiClusterRenderer$InvalidatingComposeView$$ExternalSyntheticLambda0(ComposeUiClusterRenderer.InvalidatingComposeView invalidatingComposeView) {
        this.f$0 = invalidatingComposeView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ComposeUiClusterRenderer.InvalidatingComposeView invalidatingComposeView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    invalidatingComposeView.content.invoke((Object) gapComposer, (Object) 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                invalidatingComposeView.Content(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ComposeUiClusterRenderer$InvalidatingComposeView$$ExternalSyntheticLambda0(ComposeUiClusterRenderer.InvalidatingComposeView invalidatingComposeView, int i) {
        this.f$0 = invalidatingComposeView;
    }
}
