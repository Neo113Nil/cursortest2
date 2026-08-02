package com.squareup.cash.account.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.EarnerUpsellBlockerViewKt;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.protos.cash.ui.Image;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ProfilePreviewKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Image f$0;

    public /* synthetic */ ProfilePreviewKt$$ExternalSyntheticLambda9(Image image, int i) {
        this.$r8$classId = i;
        this.f$0 = image;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Image image = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    String urlForTheme = ThemablesKt.urlForTheme(image, gapComposer);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 16.0f);
                    long j = ((Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value;
                    AsyncImageKt.m1438AsyncImage10Xjiaw(urlForTheme, null, m285size3ABfNKs, null, null, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, 432, 1784);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.ImageHero(image, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                EarnerUpsellBlockerViewKt.EarnerUpsellHeroImage(image, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                LocaleToggleKt.OverviewHeaderImage(image, companion, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String urlForTheme2 = ThemablesKt.urlForTheme(image, gapComposer2);
                    Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 16.0f);
                    long j2 = ((Color) gapComposer2.consume(ArcadeThemeKt.LocalIconColor)).value;
                    AsyncImageKt.m1438AsyncImage10Xjiaw(urlForTheme2, null, m285size3ABfNKs2, null, null, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, 432, 1784);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ProfilePreviewKt$$ExternalSyntheticLambda9(Image image, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = image;
    }
}
