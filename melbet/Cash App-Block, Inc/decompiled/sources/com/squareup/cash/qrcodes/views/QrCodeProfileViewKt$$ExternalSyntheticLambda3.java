package com.squareup.cash.qrcodes.views;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.room.Room;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountUiViewKt$QrCode$1$1$1$1$1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import com.squareup.cash.qrcodes.viewmodels.QrCodeProfileViewModel;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes7.dex */
public final /* synthetic */ class QrCodeProfileViewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ QrCodeProfileViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ QrCodeProfileViewKt$$ExternalSyntheticLambda3(QrCodeProfileViewModel qrCodeProfileViewModel, Function1 function1) {
        this.f$0 = qrCodeProfileViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = Composer.Companion.Empty;
        QrCodeProfileViewModel qrCodeProfileViewModel = this.f$0;
        switch (i) {
            case 0:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    gapComposer.skipToGroupEnd();
                } else if (!qrCodeProfileViewModel.shareEnabled || qrCodeProfileViewModel.showUpdatedSharingUi) {
                    gapComposer.startReplaceGroup(587809441);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(587598021);
                    Icons icons = Icons.NavigationShareAndroid;
                    String stringResource = Room.stringResource(gapComposer, R.string.profile_share_description);
                    Function1 function1 = this.f$1;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new CashtagQrScanView$$ExternalSyntheticLambda0(28, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue, null, null, null, null, null, null, false, gapComposer, (intValue & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    gapComposer.end(false);
                }
                break;
            default:
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer2.consume(providableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(colors.semantic.background.f1047app);
                    Colors colors2 = (Colors) gapComposer2.consume(providableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    int m694toArgb8_81llA2 = ColorKt.m694toArgb8_81llA(colors2.semantic.icon.brand);
                    int mo236toPx0680j_4 = (int) ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM());
                    Unit unit = Unit.INSTANCE;
                    Function1 function12 = this.f$1;
                    boolean changed2 = gapComposer2.changed(function12) | gapComposer2.changed(m694toArgb8_81llA) | gapComposer2.changed(m694toArgb8_81llA2) | gapComposer2.changed(mo236toPx0680j_4);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        Object accountUiViewKt$QrCode$1$1$1$1$1 = new AccountUiViewKt$QrCode$1$1$1$1$1(function12, m694toArgb8_81llA, m694toArgb8_81llA2, mo236toPx0680j_4, null, 2);
                        gapComposer2.updateRememberedValue(accountUiViewKt$QrCode$1$1$1$1$1);
                        rememberedValue2 = accountUiViewKt$QrCode$1$1$1$1$1;
                    }
                    Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue2);
                    Bitmap bitmap = qrCodeProfileViewModel.qrImage;
                    boolean z = bitmap == null;
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == obj4) {
                        rememberedValue3 = new OpenSourceKt$$ExternalSyntheticLambda8(20);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Strings.LoadableFullScreenContent(bitmap, z, null, (Function1) rememberedValue3, null, CameraXPreviewKt.lambda$2061577958, gapComposer2, 199680, 20);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ QrCodeProfileViewKt$$ExternalSyntheticLambda3(Function1 function1, QrCodeProfileViewModel qrCodeProfileViewModel) {
        this.f$1 = function1;
        this.f$0 = qrCodeProfileViewModel;
    }
}
