package com.squareup.cash.payments.views.nearby;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.payments.screens.NearbyAvatarInfo;
import com.squareup.cash.payments.screens.NearbyPayer;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.protos.cash.ui.Image;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class NearbyPayersSheetViewKt$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NearbyPayer f$0;

    public /* synthetic */ NearbyPayersSheetViewKt$$ExternalSyntheticLambda7(NearbyPayer nearbyPayer, int i) {
        this.$r8$classId = 1;
        this.f$0 = nearbyPayer;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        String m;
        int i = this.$r8$classId;
        NearbyPayer nearbyPayer = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size48;
                    NearbyAvatarInfo nearbyAvatarInfo = nearbyPayer.avatar;
                    Character ch = nearbyAvatarInfo.monogram;
                    String valueOf = ch != null ? String.valueOf(ch.charValue()) : null;
                    if (valueOf == null) {
                        valueOf = "";
                    }
                    String str = valueOf;
                    Color forTheme = ThemablesKt.forTheme(nearbyAvatarInfo.accentColor, gapComposer);
                    if (forTheme == null) {
                        gapComposer.startReplaceGroup(-130680731);
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
                        gapComposer.startReplaceGroup(-130683149);
                        gapComposer.end(false);
                        j = forTheme.value;
                    }
                    Image image = nearbyAvatarInfo.image;
                    if (image == null) {
                        gapComposer.startReplaceGroup(243924373);
                        gapComposer.end(false);
                        m = null;
                    } else {
                        m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, -130678804, image, gapComposer, false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, str, j, (String) null, (Modifier) null, (AvatarImage) (m != null ? new AvatarImage.Remote.Image(m, false, null, 0L, new SheetKt$$ExternalSyntheticLambda8(m, 9), 62) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, 3078, 0, 2000);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.NearbyPayerRow(nearbyPayer, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPayer.displayName, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPayer.cashtag, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ NearbyPayersSheetViewKt$$ExternalSyntheticLambda7(NearbyPayer nearbyPayer, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = nearbyPayer;
    }
}
