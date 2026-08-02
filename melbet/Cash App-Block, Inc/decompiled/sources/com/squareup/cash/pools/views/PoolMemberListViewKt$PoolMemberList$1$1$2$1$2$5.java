package com.squareup.cash.pools.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.pools.viewmodels.PoolListSection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final class PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$5 implements Function2 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ PoolListSection.PoolListPerson $person;
    public final /* synthetic */ String $photoUrl;
    public final /* synthetic */ int $r8$classId = 0;

    /* renamed from: com.squareup.cash.pools.views.PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$5$2, reason: invalid class name */
    public final class AnonymousClass2 implements Function3 {
        public final /* synthetic */ int $r8$classId;
        public static final AnonymousClass2 INSTANCE$1 = new AnonymousClass2(1);
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2(0);

        public /* synthetic */ AnonymousClass2(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            switch (this.$r8$classId) {
                case 0:
                    PainterRequest painterRequest = (PainterRequest) obj;
                    int intValue = ((Number) obj3).intValue();
                    painterRequest.getClass();
                    GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                    gapComposer.startReplaceGroup(-596501674);
                    AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, null, gapComposer, intValue & 14, 1);
                    gapComposer.end(false);
                    return rememberAsyncImagePainter;
                default:
                    PainterRequest painterRequest2 = (PainterRequest) obj;
                    int intValue2 = ((Number) obj3).intValue();
                    painterRequest2.getClass();
                    GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                    gapComposer2.startReplaceGroup(240865375);
                    AsyncImagePainter rememberAsyncImagePainter2 = AsyncImageKt.rememberAsyncImagePainter(painterRequest2, null, gapComposer2, intValue2 & 14, 1);
                    gapComposer2.end(false);
                    return rememberAsyncImagePainter2;
            }
        }
    }

    public PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$5(PoolListSection.PoolListPerson poolListPerson, Function1 function1, String str) {
        this.$person = poolListPerson;
        this.$onEvent = function1;
        this.$photoUrl = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Color m;
        long j;
        AvatarImage.Remote.Image image;
        AvatarOverlay.LocalIcon localIcon;
        Color m2;
        long j2;
        AvatarImage.Remote.Image image2;
        AvatarOverlay.LocalIcon localIcon2;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        PoolListSection.PoolListPerson poolListPerson = this.$person;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    boolean z = poolListPerson.isAvatarTappable;
                    boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(poolListPerson);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$2$1$1(function1, poolListPerson, 2);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, z, null, null, (Function0) rememberedValue, 14);
                    AvatarSize avatarSize = AvatarSize.Size48;
                    String str = poolListPerson.monogram;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    com.squareup.protos.cash.ui.Color color = poolListPerson.accentColor;
                    if (color == null) {
                        gapComposer.startReplaceGroup(899614553);
                        gapComposer.end(false);
                        m = null;
                    } else {
                        m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -248074840, color, gapComposer, false);
                    }
                    if (m == null) {
                        gapComposer.startReplaceGroup(-248073148);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors.semantic.background.subtle;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-248075411);
                        gapComposer.end(false);
                        j = m.value;
                    }
                    long j3 = j;
                    if (poolListPerson.photoImage != null) {
                        String str3 = this.$photoUrl;
                        str3.getClass();
                        image = new AvatarImage.Remote.Image(str3, false, null, 0L, AnonymousClass2.INSTANCE, 62);
                    } else {
                        image = null;
                    }
                    if (poolListPerson.isFavorite) {
                        gapComposer.startReplaceGroup(900069014);
                        Icons icons = Icons.FavoriteFill24;
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        AvatarOverlay.LocalIcon localIcon3 = new AvatarOverlay.LocalIcon(4, colors2.semantic.background.subtle, 0L, icons);
                        gapComposer.end(false);
                        localIcon = localIcon3;
                    } else {
                        gapComposer.startReplaceGroup(900335862);
                        gapComposer.end(false);
                        localIcon = null;
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, str2, j3, "", m183clickableoSLSa3U$default, (AvatarImage) image, (Function2) null, (AvatarOverlay) localIcon, false, 0L, (Composer) gapComposer, 3078, 0, 1856);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean changed2 = gapComposer2.changed(function1) | gapComposer2.changedInstance(poolListPerson);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$2$1$1(function1, poolListPerson, 1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Modifier m183clickableoSLSa3U$default2 = ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, null, (Function0) rememberedValue2, 15);
                    AvatarSize avatarSize2 = AvatarSize.Size48;
                    String valueOf = String.valueOf(poolListPerson.monogram);
                    com.squareup.protos.cash.ui.Color color2 = poolListPerson.accentColor;
                    if (color2 == null) {
                        gapComposer2.startReplaceGroup(-986970336);
                        gapComposer2.end(false);
                        m2 = null;
                    } else {
                        m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, 1907824897, color2, gapComposer2, false);
                    }
                    if (m2 == null) {
                        gapComposer2.startReplaceGroup(1907827293);
                        Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j2 = colors3.semantic.background.subtle;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1907824317);
                        gapComposer2.end(false);
                        j2 = m2.value;
                    }
                    long j4 = j2;
                    if (poolListPerson.photoImage != null) {
                        String str4 = this.$photoUrl;
                        str4.getClass();
                        image2 = new AvatarImage.Remote.Image(str4, false, null, 0L, AnonymousClass2.INSTANCE$1, 62);
                    } else {
                        image2 = null;
                    }
                    if (poolListPerson.isFavorite) {
                        gapComposer2.startReplaceGroup(-986469871);
                        Icons icons2 = Icons.FavoriteFill24;
                        Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        AvatarOverlay.LocalIcon localIcon4 = new AvatarOverlay.LocalIcon(4, colors4.semantic.background.subtle, 0L, icons2);
                        gapComposer2.end(false);
                        localIcon2 = localIcon4;
                    } else {
                        gapComposer2.startReplaceGroup(-986191367);
                        gapComposer2.end(false);
                        localIcon2 = null;
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize2, valueOf, j4, Room.stringResource(gapComposer2, R.string.pools_invite_view_profile_content_desc), m183clickableoSLSa3U$default2, (AvatarImage) image2, (Function2) null, (AvatarOverlay) localIcon2, false, 0L, (Composer) gapComposer2, 6, 0, 1856);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$5(Function1 function1, PoolListSection.PoolListPerson poolListPerson, String str) {
        this.$onEvent = function1;
        this.$person = poolListPerson;
        this.$photoUrl = str;
    }
}
