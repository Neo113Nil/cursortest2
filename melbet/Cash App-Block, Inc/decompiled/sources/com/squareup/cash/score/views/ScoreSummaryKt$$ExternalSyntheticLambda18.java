package com.squareup.cash.score.views;

import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes7.dex */
public final /* synthetic */ class ScoreSummaryKt$$ExternalSyntheticLambda18 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextStyle f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ ScoreSummaryKt$$ExternalSyntheticLambda18(int i, long j, TextStyle textStyle) {
        this.$r8$classId = i;
        this.f$0 = textStyle;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, this.f$1, (Composer) gapComposer, (Modifier) null, this.f$0, (TextLineBalancing) null, String.valueOf(intValue % 10), (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                String str = (String) obj2;
                int intValue3 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                str.getClass();
                Room.m1165Text25TpFw(0, 0, 0, 0, (intValue3 >> 3) & 14, 0, 4082, this.f$1, (Composer) obj3, (Modifier) null, this.f$0, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                break;
        }
        return Unit.INSTANCE;
    }
}
