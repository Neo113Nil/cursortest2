package com.squareup.cash.family.fixtures;

import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.family.familyhub.viewmodels.BadgeName;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.ColorsKt;
import com.squareup.wire.MoshiJsonIntegration;
import designsystem.arcade.ArcadeColors;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public abstract class FamilyAvatarFixtures {
    public static final StackedAvatarViewModel.Avatar AVATAR_A;
    public static final List HEADER_AVATARS;
    public static final List LOADING_AVATARS;
    public static final BadgeName TEEN_A_BADGE;

    static {
        StackedAvatarViewModel.Avatar avatar = new StackedAvatarViewModel.Avatar(null, 'J', null, new Image("fake:///BlueBottle.png", "fake:///profile.png", 4), null, null, null, null, false, false, null, false, null, null, 131061);
        new Image("fake:///BlueBottle.png", "fake:///profile.png", 4);
        StackedAvatarViewModel.Avatar avatar2 = new StackedAvatarViewModel.Avatar(new ColorModel.Accented(ColorsKt.toColor("#FFB3BA")), 'A', null, null, null, null, null, null, false, false, null, false, null, null, 131068);
        AVATAR_A = avatar2;
        ColorsKt.toColor("#BAFFC9");
        StackedAvatarViewModel.Avatar avatar3 = new StackedAvatarViewModel.Avatar(new ColorModel.Accented(ColorsKt.toColor("#BAE1FF")), 'C', null, null, null, null, null, null, false, false, null, false, null, null, 131068);
        ColorsKt.toColor("#FFB3F7");
        ColorsKt.toColor("#FFFFBA");
        HEADER_AVATARS = CollectionsKt__CollectionsKt.listOf((Object[]) new StackedAvatarViewModel.Avatar[]{avatar2, avatar, avatar3});
        StackedAvatarViewModel.Avatar avatar4 = new StackedAvatarViewModel.Avatar(MoshiJsonIntegration.toModel$default(ArcadeColors.BackgroundSubtle), ' ', null, null, null, null, null, null, false, false, null, false, null, null, 131068);
        LOADING_AVATARS = CollectionsKt__CollectionsKt.listOf((Object[]) new StackedAvatarViewModel.Avatar[]{avatar4, avatar4});
        TEEN_A_BADGE = new BadgeName("Josh", "Josh Allen", false, false);
    }
}
