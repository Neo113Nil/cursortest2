package com.squareup.cash.agents.applets.views;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.family.applets.views.FamilyAppletTileKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class AgentsAppletTile$$ExternalSyntheticLambda5 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ AvatarSize f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ AgentsAppletTile$$ExternalSyntheticLambda5(List list, AvatarSize avatarSize, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = list;
        this.f$1 = avatarSize;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        AvatarSize avatarSize = this.f$1;
        List list = this.f$0;
        RowScope rowScope = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                rowScope.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    AgentsHomeViewKt.AvatarStackVisual(list, avatarSize, i2, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                rowScope.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    FamilyAppletTileKt.AvatarStackVisual(list, avatarSize, i2, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
