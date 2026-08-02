package androidx.appcompat.app;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.core.os.LocaleListCompat;
import androidx.room.Room;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda6;
import com.squareup.workflow1.InterceptedRenderContext$send$1;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;

/* loaded from: classes3.dex */
public abstract class LocaleOverlayHelper {
    public static final void BusinessAccountInfo(Modifier modifier, BusinessInfoViewModel businessInfoViewModel, Function1 function1, Composer composer, int i) {
        businessInfoViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(964910249);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(businessInfoViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-772169666, new MenuPickerSheetKt$$ExternalSyntheticLambda4(function1, businessInfoViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 23, modifier2, businessInfoViewModel, function1);
        }
    }

    public static final void BusinessAddressSection(String str, Function1 function1, Composer composer, int i) {
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1675401993);
        int i2 = (gapComposer.changed(str) ? 32 : 16) | i | (gapComposer.changedInstance(function1) ? 256 : 128);
        int i3 = 3;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            BusinessInfoHeader(0, gapComposer, null, Room.stringResource(gapComposer, R.string.business_info_business_address_header));
            String stringResource = Room.stringResource(gapComposer, R.string.business_info_business_address_hint);
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str, 8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            str2 = str;
            AccountToDoKt.AccountSectionRowNoIcon(6 | ((i2 << 3) & 896), 25, gapComposer, null, str2, stringResource, (Function0) rememberedValue);
        } else {
            str2 = str;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda6(str2, function1, i, i3);
        }
    }

    public static final void BusinessInfoHeader(int i, Composer composer, Modifier modifier, String str) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1901407865);
        int i2 = i | 6 | (gapComposer.changed(str) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            AccountToDoKt.AccountSectionHeader(i2 & 112, gapComposer, SpacerKt.m301paddingqDBjuR0(companion, 24.0f, 36.0f, 24.0f, 12.0f), str);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(modifier, str, i, 2);
        }
    }

    public static final void LimitsSection(LimitViewModel limitViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Colors m1468withTint4WTKRHQ;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1896978460);
        int i2 = (gapComposer.changedInstance(limitViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Color forTheme = ThemablesKt.forTheme(limitViewModel.accentColor, gapComposer);
            if (forTheme == null) {
                gapComposer.startReplaceGroup(-294211042);
                gapComposer.end(false);
                m1468withTint4WTKRHQ = null;
            } else {
                gapComposer.startReplaceGroup(-294211041);
                long j = forTheme.value;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                m1468withTint4WTKRHQ = DimensionKt.m1468withTint4WTKRHQ(colors, j);
                gapComposer.end(false);
            }
            if (m1468withTint4WTKRHQ == null) {
                gapComposer.startReplaceGroup(1930173698);
                m1468withTint4WTKRHQ = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (m1468withTint4WTKRHQ == null) {
                    m1468withTint4WTKRHQ = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
            } else {
                gapComposer.startReplaceGroup(1930171063);
            }
            gapComposer.end(false);
            ArcadeThemeKt.ArcadeTheme(m1468withTint4WTKRHQ, null, null, Expect_jvmKt.rememberComposableLambda(1615506279, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(function1, limitViewModel), gapComposer), gapComposer, 3072, 6);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(i, 18, modifier2, limitViewModel, function1);
        }
    }

    public static int calcNumberOfConsequentEols(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        commonMarkdownConstraints.getClass();
        if (lookaheadText$Position.localPos != -1) {
            throw new MarkdownParsingException("");
        }
        InterceptedRenderContext$send$1 interceptedRenderContext$send$1 = new InterceptedRenderContext$send$1(commonMarkdownConstraints, 10);
        int i = 1;
        while (((Boolean) interceptedRenderContext$send$1.invoke(lookaheadText$Position)).booleanValue() && (lookaheadText$Position = lookaheadText$Position.nextLinePosition()) != null && (i = i + 1) <= 4) {
        }
        return i;
    }

    public static LocaleListCompat combineLocalesIfOverlayExists(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        if (localeListCompat == null || localeListCompat.isEmpty()) {
            return LocaleListCompat.getEmptyLocaleList();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < localeListCompat2.size() + localeListCompat.size()) {
            Locale locale = i < localeListCompat.size() ? localeListCompat.get(i) : localeListCompat2.get(i - localeListCompat.size());
            if (locale != null) {
                linkedHashSet.add(locale);
            }
            i++;
        }
        return LocaleListCompat.create((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static LookaheadText$Position getFirstNonWhitespaceLinePos(LookaheadText$Position lookaheadText$Position, int i) {
        int i2 = i - 1;
        LookaheadText$Position lookaheadText$Position2 = lookaheadText$Position;
        for (int i3 = 0; i3 < i2; i3++) {
            lookaheadText$Position2 = lookaheadText$Position.nextLinePosition();
            if (lookaheadText$Position2 == null) {
                return null;
            }
        }
        while (lookaheadText$Position2.charsToNonWhitespace() == null) {
            lookaheadText$Position2 = lookaheadText$Position2.nextLinePosition();
            if (lookaheadText$Position2 == null) {
                return null;
            }
        }
        return lookaheadText$Position2;
    }
}
