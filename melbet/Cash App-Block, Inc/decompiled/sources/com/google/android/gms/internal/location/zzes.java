package com.google.android.gms.internal.location;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.earnings.applets.viewmodels.EarnerAppletTileModel;
import com.squareup.cash.earnings.applets.views.EarnerAppletTileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledServiceAppletTileContentModel;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class zzes implements ModelJsonParser {
    public static final void InstalledEarnerAppletTileContent(EarnerAppletTileModel.Installed installed, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        int i2;
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12;
        InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(374928909);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(installed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(appletTileAppearance) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            i2 |= gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda12) ? 256 : 128;
        } else {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        }
        byte b = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            StackedAvatarViewModel stackedAvatarViewModel = installed.streamAvatars;
            String str = installed.title;
            if (str == null) {
                str = re$$ExternalSyntheticOutline0.m(gapComposer, -470562456, R.string.earnings_applets_earner_tile_title, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-470562921);
                gapComposer.end(false);
            }
            ComposableLambdaImpl composableLambdaImpl = null;
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(str, null, null, 14);
            String str2 = installed.subtitle;
            List listOf = (str2 == null && stackedAvatarViewModel == null) ? EmptyList.INSTANCE : CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, null, new InstalledServiceAppletTileContentModel.BriefState.Loaded(str2), null, 11));
            if (appletTileAppearance.useRedesignedTiles) {
                gapComposer.startReplaceGroup(-1702172848);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
                InstalledServiceAppletTileLayoutConfig.VisualPosition visualPosition = InstalledServiceAppletTileLayoutConfig.VisualPosition.START;
                installedServiceAppletTileLayoutConfig = new InstalledServiceAppletTileLayoutConfig(16.0f, textStyle, i3);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1702098541);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                installedServiceAppletTileLayoutConfig = new InstalledServiceAppletTileLayoutConfig(8.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 24);
                gapComposer.end(false);
            }
            if (stackedAvatarViewModel != null) {
                gapComposer.startReplaceGroup(-1701976184);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1955050084, new EarnerAppletTileKt$$ExternalSyntheticLambda0(stackedAvatarViewModel, b, b), gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1701803297);
                gapComposer.end(false);
            }
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, listOf, taxesAppletViewsModule$$ExternalSyntheticLambda12, false, null, installedServiceAppletTileLayoutConfig, composableLambdaImpl, gapComposer, i2 & 896, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(installed, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 2);
        }
    }

    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String m = Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(m.length() + 8, 1, name2));
                    sb2.append("<");
                    sb2.append(m);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    sb = sb2.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i3, indexOf);
            sb3.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb3.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb3.append(", ");
                sb3.append(objArr[i4]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
