package com.braze.support;

import androidx.compose.ui.graphics.Color;
import com.squareup.cash.tabs.views.SharedToolbarSwipePalette;
import com.squareup.cash.tabs.views.SharedToolbarSwipeScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes7.dex */
public final /* synthetic */ class BrazeImageUtils$$ExternalSyntheticLambda22 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ BrazeImageUtils$$ExternalSyntheticLambda22(Object obj, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String calculateInSampleSize$lambda$2;
        int i = this.$r8$classId;
        long j = this.f$2;
        long j2 = this.f$1;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                calculateInSampleSize$lambda$2 = BrazeImageUtils.calculateInSampleSize$lambda$2((Ref$IntRef) obj, j2, j);
                return calculateInSampleSize$lambda$2;
            default:
                SharedToolbarSwipeScope sharedToolbarSwipeScope = (SharedToolbarSwipeScope) obj;
                boolean z = sharedToolbarSwipeScope.isMoneybotToolbar;
                SharedToolbarSwipePalette sharedToolbarSwipePalette = sharedToolbarSwipeScope.palette;
                if (z) {
                    sharedToolbarSwipePalette.moneybotIconColor$delegate.setValue(new Color(j2));
                    sharedToolbarSwipePalette.moneybotTextColor$delegate.setValue(new Color(j));
                } else {
                    sharedToolbarSwipePalette.tabsIconColor$delegate.setValue(new Color(j2));
                    sharedToolbarSwipePalette.tabsTextColor$delegate.setValue(new Color(j));
                }
                return Unit.INSTANCE;
        }
    }
}
