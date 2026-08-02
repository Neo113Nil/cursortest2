package com.squareup.cash.agents.applets.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.family.applets.views.FamilyAppletTileKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AgentsAppletTileKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ AvatarSize f$1;
    public final /* synthetic */ Modifier f$2;

    public /* synthetic */ AgentsAppletTileKt$$ExternalSyntheticLambda1(int i, AvatarSize avatarSize, Modifier modifier, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = i;
        this.f$1 = avatarSize;
        this.f$2 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AgentsHomeViewKt.OverflowBadge(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
            default:
                FamilyAppletTileKt.OverflowBadge(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
