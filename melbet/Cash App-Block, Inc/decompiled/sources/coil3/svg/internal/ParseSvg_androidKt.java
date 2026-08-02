package coil3.svg.internal;

import android.content.res.Configuration;
import android.util.Log;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.y0$$ExternalSyntheticLambda0;
import com.caverock.androidsvg.SVGParser;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.limits.viewmodels.LimitItem;
import com.squareup.cash.limits.viewmodels.LimitItemViewModel;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.limits.viewmodels.LimitsCategoryViewModel$LimitsCategory;
import com.squareup.cash.limits.viewmodels.LimitsViewModel;
import com.squareup.cash.limits.views.arcade.FlatLimitsViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.limits.views.arcade.FlatLimitsViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.util.Strings;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okio.BufferedSource;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;

/* loaded from: classes3.dex */
public abstract class ParseSvg_androidKt {
    public static final void BusinessInfoConfirmationSheet(Modifier modifier, BusinessInfoViewModel.ConfirmationSheetViewModel confirmationSheetViewModel, Function1 function1, Composer composer, int i) {
        confirmationSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1719782691);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(confirmationSheetViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1987722392, new MenuPickerSheetKt$$ExternalSyntheticLambda4(confirmationSheetViewModel, function1), gapComposer), gapComposer, 6);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 22, modifier2, confirmationSheetViewModel, function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmationButton(Modifier modifier, String str, TextStyle textStyle, Function0 function0, Composer composer, int i, int i2) {
        TextStyle textStyle2;
        int i3;
        int i4;
        TextStyle textStyle3;
        Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        TextStyle textStyle4;
        int i5;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2126501832);
        int i6 = i | 6 | (gapComposer.changed(str) ? 32 : 16);
        if ((i2 & 4) == 0) {
            textStyle2 = textStyle;
            if (gapComposer.changed(textStyle2)) {
                i3 = 256;
                i4 = i6 | i3 | (!gapComposer.changedInstance(function0) ? 2048 : 1024);
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
                    gapComposer.skipToGroupEnd();
                    textStyle3 = textStyle2;
                    modifier2 = modifier;
                } else {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        int i7 = i2 & 4;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        if (i7 != 0) {
                            MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                            if (mooncakeTypography == null) {
                                mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                            }
                            textStyle2 = mooncakeTypography.mainBody;
                            i4 &= -897;
                        }
                        textStyle4 = textStyle2;
                        i5 = i4;
                        modifier3 = companion;
                    } else {
                        gapComposer.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i4 &= -897;
                        }
                        textStyle4 = textStyle2;
                        i5 = i4;
                        modifier3 = modifier;
                    }
                    gapComposer.endDefaults();
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(modifier3, 16.0f);
                    boolean z = (i5 & 7168) == 2048;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (z || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new y0$$ExternalSyntheticLambda0(14, function0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, ((i5 >> 3) & 14) | (i5 & 896), 0, 3824, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SizeKt.fillMaxWidth(ImageKt.m183clickableoSLSa3U$default(m298padding3ABfNKs, false, null, null, (Function0) rememberedValue, 15), 1.0f), textStyle4, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    modifier2 = modifier3;
                    textStyle3 = textStyle4;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(modifier2, str, textStyle3, function0, i, i2);
                    return;
                }
                return;
            }
        } else {
            textStyle2 = textStyle;
        }
        i3 = 128;
        i4 = i6 | i3 | (!gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlatLimitSection(LimitViewModel limitViewModel, boolean z, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        List<LimitItem> list;
        List list2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1590324629);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(limitViewModel) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = limitViewModel.title;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier modifier3 = null;
            Modifier.Companion companion2 = companion;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.prominent, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            List list3 = limitViewModel.categories;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list3) {
                if (obj instanceof LimitsCategoryViewModel$LimitsCategory) {
                    arrayList.add(obj);
                }
            }
            LimitsCategoryViewModel$LimitsCategory limitsCategoryViewModel$LimitsCategory = (LimitsCategoryViewModel$LimitsCategory) CollectionsKt.firstOrNull((List) arrayList);
            if (limitsCategoryViewModel$LimitsCategory != null && (list2 = limitsCategoryViewModel$LimitsCategory.limits) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof LimitItemViewModel.StaticLimit) {
                        arrayList2.add(obj2);
                    }
                }
                LimitItemViewModel.StaticLimit staticLimit = (LimitItemViewModel.StaticLimit) CollectionsKt.firstOrNull((List) arrayList2);
                if (staticLimit != null) {
                    list = staticLimit.parsedItems;
                    if (list != null) {
                        gapComposer.startReplaceGroup(-624600606);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-624600605);
                        for (LimitItem limitItem : list) {
                            Modifier.Companion companion3 = companion2;
                            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion3, 1.0f), RecyclerView.DECELERATION_RATE, 4.0f, 1);
                            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Top, gapComposer, 6);
                            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default2);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                            companion2 = companion3;
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, limitItem.label, (Map) null, (Function1) null, false);
                            if (limitItem.amount.length() > 0) {
                                gapComposer.startReplaceGroup(2100622248);
                                Room.m1165Text25TpFw(0, 0, 0, 6, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, limitItem.amount, (Map) null, (Function1) null, false);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(2100859615);
                                gapComposer.end(false);
                            }
                            gapComposer.end(true);
                        }
                        gapComposer.end(false);
                        modifier3 = null;
                    }
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, modifier3);
                    if (z) {
                        gapComposer.startReplaceGroup(-623902144);
                        ModalKt.HorizontalDivider(0, 1, gapComposer, modifier3);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, modifier3);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-623837757);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    modifier2 = companion2;
                }
            }
            list = null;
            if (list != null) {
            }
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, modifier3);
            if (z) {
            }
            gapComposer.end(true);
            modifier2 = companion2;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(limitViewModel, z, modifier2, i, 22);
        }
    }

    public static final void FlatLimitsContent(LimitsViewModel limitsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        limitsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1333431142);
        int i2 = (gapComposer.changedInstance(limitsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2074933819, new FlatLimitsViewKt$$ExternalSyntheticLambda0(function1, limitsViewModel, i3), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FlatLimitsViewKt$$ExternalSyntheticLambda1(limitsViewModel, function1, modifier2, i, 0);
        }
    }

    public static final CommonMarkdownConstraints applyToNextLineAndAddModifiers(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        commonMarkdownConstraints.getClass();
        if (lookaheadText$Position.localPos != -1) {
            throw new MarkdownParsingException("");
        }
        CommonMarkdownConstraints applyToNextLine$1 = commonMarkdownConstraints.applyToNextLine$1(lookaheadText$Position);
        String str = lookaheadText$Position.currentLine;
        while (true) {
            CommonMarkdownConstraints addModifierIfNeeded$1 = applyToNextLine$1.addModifierIfNeeded$1(lookaheadText$Position.nextPosition(getCharsEaten(applyToNextLine$1, str) + 1));
            if (addModifierIfNeeded$1 == null) {
                return applyToNextLine$1;
            }
            applyToNextLine$1 = addModifierIfNeeded$1;
        }
    }

    public static final CharSequence eatItselfFromString(CommonMarkdownConstraints commonMarkdownConstraints, CharSequence charSequence) {
        commonMarkdownConstraints.getClass();
        charSequence.getClass();
        int length = charSequence.length();
        int i = commonMarkdownConstraints.charsEaten;
        return length < i ? "" : charSequence.subSequence(i, charSequence.length());
    }

    public static final boolean extendsPrev(CommonMarkdownConstraints commonMarkdownConstraints, CommonMarkdownConstraints commonMarkdownConstraints2) {
        commonMarkdownConstraints.getClass();
        commonMarkdownConstraints2.getClass();
        return commonMarkdownConstraints.startsWith(commonMarkdownConstraints2) && !commonMarkdownConstraints.containsListMarkers(commonMarkdownConstraints2.types.length);
    }

    public static void generateConfigDelta_colorMode(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.colorMode & 3;
        int i2 = configuration2.colorMode & 3;
        if (i != i2) {
            configuration3.colorMode |= i2;
        }
        int i3 = configuration.colorMode & 12;
        int i4 = configuration2.colorMode & 12;
        if (i3 != i4) {
            configuration3.colorMode |= i4;
        }
    }

    public static final int getCharsEaten(CommonMarkdownConstraints commonMarkdownConstraints, CharSequence charSequence) {
        commonMarkdownConstraints.getClass();
        charSequence.getClass();
        return Math.min(commonMarkdownConstraints.charsEaten, charSequence.length());
    }

    public static final AndroidSvg parseSvg(BufferedSource bufferedSource) {
        InputStream inputStream = bufferedSource.inputStream();
        SVGParser sVGParser = new SVGParser();
        sVGParser.svgDocument = null;
        sVGParser.currentElement = null;
        sVGParser.ignoring = false;
        sVGParser.inMetadataElement = false;
        sVGParser.metadataTag = null;
        sVGParser.metadataElementContents = null;
        sVGParser.inStyleElement = false;
        sVGParser.styleElementContents = null;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            sVGParser.parseUsingXmlPullParser(inputStream);
            return new AndroidSvg(sVGParser.svgDocument);
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public static final boolean upstreamWith(CommonMarkdownConstraints commonMarkdownConstraints, CommonMarkdownConstraints commonMarkdownConstraints2) {
        commonMarkdownConstraints2.getClass();
        return commonMarkdownConstraints2.startsWith(commonMarkdownConstraints) && !commonMarkdownConstraints.containsListMarkers(commonMarkdownConstraints.types.length);
    }
}
