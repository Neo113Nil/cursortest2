package com.squareup.cash.agents.applets.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.family.applets.views.FamilyAppletTileKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AgentsAppletTileKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ AvatarSize f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ AgentsAppletTileKt$$ExternalSyntheticLambda0(List list, AvatarSize avatarSize, int i) {
        this.$r8$classId = 2;
        this.f$0 = list;
        this.f$1 = avatarSize;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        AvatarSize avatarSize = this.f$1;
        List list = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                AgentsHomeViewKt.AvatarStackVisual(list, avatarSize, i2, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                num.getClass();
                FamilyAppletTileKt.AvatarStackVisual(list, avatarSize, i2, composer, Updater.updateChangedFlags(1));
                break;
            default:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    FamilyAppletTileKt.AvatarStackVisual(list, avatarSize, i2, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AgentsAppletTileKt$$ExternalSyntheticLambda0(List list, AvatarSize avatarSize, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = list;
        this.f$1 = avatarSize;
        this.f$2 = i;
    }
}
