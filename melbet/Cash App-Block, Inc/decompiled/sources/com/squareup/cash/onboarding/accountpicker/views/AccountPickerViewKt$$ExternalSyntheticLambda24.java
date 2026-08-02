package com.squareup.cash.onboarding.accountpicker.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.offers.views.OffersAvatarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Image;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class AccountPickerViewKt$$ExternalSyntheticLambda24 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccountViewModel f$0;

    public /* synthetic */ AccountPickerViewKt$$ExternalSyntheticLambda24(AccountViewModel accountViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = accountViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Color m;
        long j;
        AvatarImage.Remote.Image image;
        Color m2;
        long j2;
        AvatarImage.Remote.Image image2;
        int i = this.$r8$classId;
        AccountViewModel accountViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    StackedAvatarViewModel.Avatar avatar = accountViewModel.avatarViewModel.avatar;
                    if (avatar != null) {
                        gapComposer.startReplaceGroup(-919497205);
                        AvatarSize avatarSize = AvatarSize.Size48;
                        String valueOf = String.valueOf(avatar.character);
                        ColorModel colorModel = avatar.backgroundColor;
                        if (colorModel == null) {
                            gapComposer.startReplaceGroup(-919354048);
                            gapComposer.end(false);
                            m = null;
                        } else {
                            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -860940575, colorModel, gapComposer, false);
                        }
                        if (m == null) {
                            gapComposer.startReplaceGroup(-860939073);
                            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j = colors.semantic.icon.standard;
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-860941274);
                            gapComposer.end(false);
                            j = m.value;
                        }
                        long j3 = j;
                        Image image3 = avatar.remoteImage;
                        if (image3 == null) {
                            gapComposer.startReplaceGroup(-919232311);
                            gapComposer.end(false);
                            image = null;
                        } else {
                            gapComposer.startReplaceGroup(-919232310);
                            AvatarImage.Remote.Image image4 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image3, gapComposer), false, null, 0L, new OffersAvatarKt$$ExternalSyntheticLambda0(10), 62);
                            gapComposer.end(false);
                            image = image4;
                        }
                        TextViewKt.m3613AvatarB_rZmmc(avatarSize, valueOf, j3, avatar.contentDescription, (Modifier) null, (AvatarImage) image, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, 6, 0, 2000);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-918964501);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AliasPickerViewKt.NameTitle(0, gapComposer2, null, accountViewModel.title, accountViewModel.isBusiness);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, accountViewModel.subtitle, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                    StackedAvatarViewModel.Avatar avatar2 = accountViewModel.avatarViewModel.avatar;
                    if (avatar2 != null) {
                        gapComposer4.startReplaceGroup(542104869);
                        AvatarSize avatarSize2 = AvatarSize.Size48;
                        String valueOf2 = String.valueOf(avatar2.character);
                        ColorModel colorModel2 = avatar2.backgroundColor;
                        if (colorModel2 == null) {
                            gapComposer4.startReplaceGroup(542255156);
                            gapComposer4.end(false);
                            m2 = null;
                        } else {
                            m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer4, -813791891, colorModel2, gapComposer4, false);
                        }
                        if (m2 == null) {
                            gapComposer4.startReplaceGroup(-813790389);
                            Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                            } else {
                                gapComposer4.startReplaceGroup(-1762997739);
                                gapComposer4.end(false);
                            }
                            j2 = colors2.semantic.icon.standard;
                            gapComposer4.end(false);
                        } else {
                            gapComposer4.startReplaceGroup(-813792590);
                            gapComposer4.end(false);
                            j2 = m2.value;
                        }
                        long j4 = j2;
                        Image image5 = avatar2.remoteImage;
                        if (image5 == null) {
                            gapComposer4.startReplaceGroup(542381171);
                            gapComposer4.end(false);
                            image2 = null;
                        } else {
                            gapComposer4.startReplaceGroup(542381172);
                            AvatarImage.Remote.Image image6 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image5, gapComposer4), false, null, 0L, new OffersAvatarKt$$ExternalSyntheticLambda0(11), 62);
                            gapComposer4.end(false);
                            image2 = image6;
                        }
                        TextViewKt.m3613AvatarB_rZmmc(avatarSize2, valueOf2, j4, avatar2.contentDescription, (Modifier) null, (AvatarImage) image2, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer4, 6, 0, 2000);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(542664543);
                        gapComposer4.end(false);
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    AliasPickerViewKt.NameTitle(0, gapComposer5, null, accountViewModel.title, accountViewModel.isBusiness);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            default:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, accountViewModel.subtitle, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
