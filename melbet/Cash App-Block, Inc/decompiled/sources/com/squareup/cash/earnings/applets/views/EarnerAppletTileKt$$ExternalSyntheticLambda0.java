package com.squareup.cash.earnings.applets.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.DiagonalAvatarValues;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class EarnerAppletTileKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StackedAvatarViewModel f$0;

    public /* synthetic */ EarnerAppletTileKt$$ExternalSyntheticLambda0(StackedAvatarViewModel stackedAvatarViewModel, int i) {
        this.$r8$classId = 1;
        this.f$0 = stackedAvatarViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.$r8$classId) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AvatarsKt.HorizontalStackedAvatars(AvatarSize.Size32, this.f$0, null, null, gapComposer, 6, 28);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                num.getClass();
                LegalSectionKt.RetroAvatar(this.f$0, composer, Updater.updateChangedFlags(1));
                break;
            default:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AvatarsKt.DiagonalStackedAvatars(DiagonalAvatarValues.Size48, this.f$0, null, AvatarSize.Size48, null, gapComposer2, 3078);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EarnerAppletTileKt$$ExternalSyntheticLambda0(StackedAvatarViewModel stackedAvatarViewModel, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = stackedAvatarViewModel;
    }
}
