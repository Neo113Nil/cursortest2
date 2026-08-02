package com.squareup.cash.activity.views.compact;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class CompactActivityScopesKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ AvatarBadgeViewModel f$0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        AvatarBadgeViewModel avatarBadgeViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CompactActivityScopesKt.CompactBadgeAvatarContent(avatarBadgeViewModel, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                CompactActivityScopesKt.CompactBadgeAvatarContent(avatarBadgeViewModel, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
