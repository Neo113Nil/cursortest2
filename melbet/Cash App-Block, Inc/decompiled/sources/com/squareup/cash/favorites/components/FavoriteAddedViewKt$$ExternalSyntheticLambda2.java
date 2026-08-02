package com.squareup.cash.favorites.components;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.favorites.viewmodels.FavoriteAddedViewModel;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.protos.cash.ui.Image;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class FavoriteAddedViewKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FavoriteAddedViewModel f$0;

    public /* synthetic */ FavoriteAddedViewKt$$ExternalSyntheticLambda2(FavoriteAddedViewModel favoriteAddedViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = favoriteAddedViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String m;
        long j;
        int i;
        int i2;
        int i3 = this.$r8$classId;
        FavoriteAddedViewModel favoriteAddedViewModel = this.f$0;
        switch (i3) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Image image = favoriteAddedViewModel.photo;
                    Color color = null;
                    if (image == null) {
                        gapComposer.startReplaceGroup(1325974961);
                        gapComposer.end(false);
                        m = null;
                    } else {
                        m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, -1896889264, image, gapComposer, false);
                    }
                    if (m == null) {
                        m = "";
                    }
                    String str = m;
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 32.0f));
                    AvatarSize avatarSize = AvatarSize.Size48;
                    String valueOf = String.valueOf(favoriteAddedViewModel.monogram);
                    com.squareup.protos.cash.ui.Color color2 = favoriteAddedViewModel.accentColor;
                    if (color2 == null) {
                        gapComposer.startReplaceGroup(1326194100);
                        gapComposer.end(false);
                    } else {
                        color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1896882195, color2, gapComposer, false);
                    }
                    if (color == null) {
                        gapComposer.startReplaceGroup(-1896880503);
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
                        gapComposer.startReplaceGroup(-1896882735);
                        gapComposer.end(false);
                        j = color.value;
                    }
                    long j2 = j;
                    Icons icons = Icons.FavoriteFill24;
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, valueOf, j2, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.Remote.Image(str, false, null, 0L, new AddFavoritesViewKt$$ExternalSyntheticLambda15(29), 62), (Function2) null, (AvatarOverlay) new AvatarOverlay.LocalIcon(12, colors2.semantic.background.subtle, 0L, icons), false, 0L, (Composer) gapComposer, 3078, 0, 1872);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (favoriteAddedViewModel.showViewFavorites) {
                        i = 1720423921;
                        i2 = R.string.view_favorites;
                    } else {
                        i = 1720504087;
                        i2 = R.string.close;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, re$$ExternalSyntheticOutline0.m(gapComposer2, i, i2, gapComposer2, false), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
