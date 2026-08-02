package com.squareup.cash.activity.views.compact;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.ErrorActivityItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class CompactActivityScopesKt {

    /* renamed from: lambda$-1931533675, reason: not valid java name */
    public static final ComposableLambdaImpl f127lambda$1931533675;

    /* renamed from: lambda$-313147839, reason: not valid java name */
    public static final ComposableLambdaImpl f128lambda$313147839 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(23), false, -313147839);

    /* renamed from: lambda$-1446971905, reason: not valid java name */
    public static final ComposableLambdaImpl f126lambda$1446971905 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(24), false, -1446971905);

    static {
        new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(25), false, 1114929862);
        new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(6), false, 1934221856);
        f127lambda$1931533675 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(26), false, -1931533675);
        new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(7), false, -2018765680);
    }

    public static final void CompactBadgeAvatar(AvatarBadgeViewModel avatarBadgeViewModel, String str, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Color m;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1271195902);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(avatarBadgeViewModel) : gapComposer.changedInstance(avatarBadgeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startReplaceGroup(-1469676280);
            AvatarSize avatarSize = AvatarSize.Size32;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.subtle;
            if (avatarBadgeViewModel instanceof AvatarBadgeViewModel.CardUrl) {
                gapComposer.startReplaceGroup(-339867892);
                gapComposer.end(false);
            } else if (avatarBadgeViewModel instanceof AvatarBadgeViewModel.IconRes) {
                gapComposer.startReplaceGroup(-1945865960);
                Color forTheme = ThemablesKt.forTheme(((AvatarBadgeViewModel.IconRes) avatarBadgeViewModel).backgroundColor, gapComposer);
                if (forTheme != null) {
                    j = forTheme.value;
                }
                gapComposer.end(false);
            } else if (avatarBadgeViewModel instanceof AvatarBadgeViewModel.IconToken) {
                gapComposer.startReplaceGroup(-1945798473);
                gapComposer.startReplaceGroup(-1945782788);
                gapComposer.end(false);
                gapComposer.end(false);
            } else {
                if (!(avatarBadgeViewModel instanceof AvatarBadgeViewModel.IconUrl)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -339868570, false);
                }
                gapComposer.startReplaceGroup(-1945732009);
                ColorModel colorModel = ((AvatarBadgeViewModel.IconUrl) avatarBadgeViewModel).backgroundColor;
                if (colorModel == null) {
                    gapComposer.startReplaceGroup(-1945716324);
                    gapComposer.end(false);
                    m = null;
                } else {
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -339859707, colorModel, gapComposer, false);
                }
                if (m != null) {
                    j = m.value;
                }
                gapComposer.end(false);
            }
            int i3 = i2 << 6;
            TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", j, str, modifier2, (AvatarImage) null, (Function2) Expect_jvmKt.rememberComposableLambda(1856100271, new CompactActivityScopesKt$$ExternalSyntheticLambda0(avatarBadgeViewModel), gapComposer), (AvatarOverlay) null, false, 0L, (Composer) gapComposer, (i3 & 7168) | 1572918 | (i3 & 57344), 0, 1952);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(avatarBadgeViewModel, str, modifier, i, 27);
        }
    }

    public static final void CompactBadgeAvatarContent(AvatarBadgeViewModel avatarBadgeViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1731140911);
        int i2 = (gapComposer.changed(avatarBadgeViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean z = avatarBadgeViewModel instanceof AvatarBadgeViewModel.CardUrl;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.Crop;
            if (z) {
                gapComposer.startReplaceGroup(1548519579);
                AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(((AvatarBadgeViewModel.CardUrl) avatarBadgeViewModel).image, gapComposer), null, SizeKt.fillMaxSize(companion, 1.0f), null, contentScale$Companion$Fit$1, null, gapComposer, 1573296, 1976);
                gapComposer.end(false);
            } else if (avatarBadgeViewModel instanceof AvatarBadgeViewModel.IconRes) {
                gapComposer.startReplaceGroup(1548927973);
                int i3 = ((AvatarBadgeViewModel.IconRes) avatarBadgeViewModel).resId;
                gapComposer.startReplaceGroup(1549024134);
                gapComposer.end(false);
                gapComposer.startReplaceGroup(-1474050631);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.icon.standard;
                gapComposer.end(false);
                m2973LocalDrawableBadgeRPmYEkk(i3, j, gapComposer, 0);
                gapComposer.end(false);
            } else if (avatarBadgeViewModel instanceof AvatarBadgeViewModel.IconToken) {
                gapComposer.startReplaceGroup(1549129628);
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxSize(companion, 1.0f), 8.0f);
                Icons icons = ((AvatarBadgeViewModel.IconToken) avatarBadgeViewModel).icon;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Trace.m1191Iconww6aTOc(icons, (String) null, m298padding3ABfNKs, colors2.semantic.icon.standard, gapComposer, 432, 0);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                if (!(avatarBadgeViewModel instanceof AvatarBadgeViewModel.IconUrl)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1474068703, false);
                }
                gapComposer.startReplaceGroup(1549373691);
                AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(((AvatarBadgeViewModel.IconUrl) avatarBadgeViewModel).image, gapComposer), null, SizeKt.fillMaxSize(companion, 1.0f), null, contentScale$Companion$Fit$1, null, gapComposer, 1573296, 1976);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CompactActivityScopesKt$$ExternalSyntheticLambda0(avatarBadgeViewModel, i);
        }
    }

    /* renamed from: LocalDrawableBadge-RPmYEkk, reason: not valid java name */
    public static final void m2973LocalDrawableBadgeRPmYEkk(final int i, final long j, Composer composer, final int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-763748569);
        int i3 = (gapComposer.changed(i) ? 4 : 2) | i2 | (gapComposer.changed(j) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ImageKt.Image(Countries.painterResource(i, i3 & 14, gapComposer), null, SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), 8.0f), null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 432, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(i, i2, j) { // from class: com.squareup.cash.activity.views.compact.CompactActivityScopesKt$$ExternalSyntheticLambda3
                public final /* synthetic */ int f$0;
                public final /* synthetic */ long f$1;

                {
                    this.f$1 = j;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    CompactActivityScopesKt.m2973LocalDrawableBadgeRPmYEkk(this.f$0, this.f$1, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
