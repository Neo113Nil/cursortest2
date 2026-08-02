package com.google.android.gms.maps.internal;

import android.graphics.Rect;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import com.withpersona.sdk2.camera.ImageToAnalyzeKt$toImageToAnalyze$1;

/* loaded from: classes4.dex */
public abstract class zza {
    public static final void GenericArcadeText(GenericBaseViewModel.ArcadeTextViewModel arcadeTextViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        TextStyle textStyle;
        arcadeTextViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(821440603);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(arcadeTextViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeTextElement.Style style = arcadeTextViewModel.style;
            Integer num = arcadeTextViewModel.maxLineNumber;
            if (style == null) {
                gapComposer.startReplaceGroup(-1186535143);
                gapComposer.end(false);
                textStyle = null;
            } else {
                gapComposer.startReplaceGroup(-869559320);
                switch (style.ordinal()) {
                    case 0:
                        gapComposer.startReplaceGroup(-700402468);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).keypadTotal;
                        gapComposer.end(false);
                        break;
                    case 1:
                        gapComposer.startReplaceGroup(-700400675);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralLarge;
                        gapComposer.end(false);
                        break;
                    case 2:
                        gapComposer.startReplaceGroup(-700399147);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).hero;
                        gapComposer.end(false);
                        break;
                    case 3:
                        gapComposer.startReplaceGroup(-700397801);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header;
                        gapComposer.end(false);
                        break;
                    case 4:
                        gapComposer.startReplaceGroup(-700396130);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).keypadNumbers;
                        gapComposer.end(false);
                        break;
                    case 5:
                        gapComposer.startReplaceGroup(-700394339);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralSmall;
                        gapComposer.end(false);
                        break;
                    case 6:
                        gapComposer.startReplaceGroup(-700392641);
                        textStyle = LazyGridKt.getLegacyTabTitle((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography));
                        gapComposer.end(false);
                        break;
                    case 7:
                        gapComposer.startReplaceGroup(-700390755);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                        gapComposer.end(false);
                        break;
                    case 8:
                        gapComposer.startReplaceGroup(-700389022);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle;
                        gapComposer.end(false);
                        break;
                    case 9:
                        gapComposer.startReplaceGroup(-700387300);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                        gapComposer.end(false);
                        break;
                    case 10:
                        gapComposer.startReplaceGroup(-700385797);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                        gapComposer.end(false);
                        break;
                    case 11:
                        gapComposer.startReplaceGroup(-700384165);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).linkMedium;
                        gapComposer.end(false);
                        break;
                    case 12:
                        gapComposer.startReplaceGroup(-700381898);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).input;
                        gapComposer.end(false);
                        break;
                    case 13:
                        gapComposer.startReplaceGroup(-700380521);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).button;
                        gapComposer.end(false);
                        break;
                    case 14:
                        gapComposer.startReplaceGroup(-700378850);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).buttonCompact;
                        gapComposer.end(false);
                        break;
                    case 15:
                        gapComposer.startReplaceGroup(-700377126);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                        gapComposer.end(false);
                        break;
                    case 16:
                        gapComposer.startReplaceGroup(-700375527);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).helpText;
                        gapComposer.end(false);
                        break;
                    case 17:
                        gapComposer.startReplaceGroup(-700373925);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                        gapComposer.end(false);
                        break;
                    case 18:
                        gapComposer.startReplaceGroup(-700372101);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).linkXSmall;
                        gapComposer.end(false);
                        break;
                    case 19:
                        gapComposer.startReplaceGroup(-700370469);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                        gapComposer.end(false);
                        break;
                    case 20:
                        gapComposer.startReplaceGroup(-700368576);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).badgeLargeAsset;
                        gapComposer.end(false);
                        break;
                    case 21:
                        gapComposer.startReplaceGroup(-700366495);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).badgeLargeInline;
                        gapComposer.end(false);
                        break;
                    default:
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -700403102, false);
                }
                gapComposer.end(false);
            }
            if (textStyle == null) {
                gapComposer.startReplaceGroup(-869558389);
                textStyle = (TextStyle) gapComposer.consume(ArcadeThemeKt.LocalTextStyle);
                if (textStyle == null) {
                    gapComposer.startReplaceGroup(-1100573765);
                    textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                } else {
                    gapComposer.startReplaceGroup(-1100574912);
                }
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-869559691);
            }
            gapComposer.end(false);
            int intValue = num != null ? num.intValue() : 1;
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            long j = textStyle.paragraphStyle.lineHeight;
            Room.m1167checkArithmeticR2X_6o(j);
            float mo231toDpGaN1DYA = density.mo231toDpGaN1DYA(Room.pack(1095216660480L & j, TextUnit.m1059getValueimpl(j) * intValue));
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = num != null ? SizeKt.m277height3ABfNKs(companion, mo231toDpGaN1DYA) : SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-71363635, new FormRemoteImageKt$$ExternalSyntheticLambda0(arcadeTextViewModel, modifier, textStyle, 26), gapComposer);
            if (arcadeTextViewModel.selectable) {
                gapComposer.startReplaceGroup(-1496941651);
                SimpleLayoutKt.SelectionContainer(null, rememberComposableLambda, gapComposer, 48, 1);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1496884983);
                rememberComposableLambda.invoke((Object) gapComposer, (Object) 6);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(arcadeTextViewModel, modifier, i, 20);
        }
    }

    public static final Rect getBoundingBox(ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$1, Rect rect, boolean z) {
        imageToAnalyzeKt$toImageToAnalyze$1.getClass();
        if (!z || rect == null) {
            return new Rect(0, 0, imageToAnalyzeKt$toImageToAnalyze$1.getInputImage().zzd, imageToAnalyzeKt$toImageToAnalyze$1.getInputImage().zze);
        }
        int i = imageToAnalyzeKt$toImageToAnalyze$1.rotationDegrees;
        return (i == 90 || i == 270) ? new Rect(rect.top, rect.left, rect.bottom, rect.right) : rect;
    }

    public static final long toArcadeColor(ArcadeTextElement.SemanticTextColor semanticTextColor, Composer composer) {
        semanticTextColor.getClass();
        switch (semanticTextColor.ordinal()) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1953970553);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.text.brand;
                gapComposer.end(false);
                return j;
            case 1:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1953968856);
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                long j2 = colors2.semantic.text.danger;
                gapComposer2.end(false);
                return j2;
            case 2:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-1953967062);
                Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                long j3 = colors3.semantic.text.disabled;
                gapComposer3.end(false);
                return j3;
            case 3:
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-1953965239);
                Colors colors4 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                } else {
                    gapComposer4.startReplaceGroup(-1762997739);
                    gapComposer4.end(false);
                }
                long j4 = colors4.semantic.text.inverse;
                gapComposer4.end(false);
                return j4;
            case 4:
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(-1953963546);
                Colors colors5 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                if (colors5 == null) {
                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                } else {
                    gapComposer5.startReplaceGroup(-1762997739);
                    gapComposer5.end(false);
                }
                long j5 = colors5.semantic.text.link;
                gapComposer5.end(false);
                return j5;
            case 5:
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(-1953961683);
                Colors colors6 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                if (colors6 == null) {
                    colors6 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                } else {
                    gapComposer6.startReplaceGroup(-1762997739);
                    gapComposer6.end(false);
                }
                long j6 = colors6.semantic.text.linkVisited;
                gapComposer6.end(false);
                return j6;
            case 6:
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(-1953959635);
                Colors colors7 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                if (colors7 == null) {
                    colors7 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                } else {
                    gapComposer7.startReplaceGroup(-1762997739);
                    gapComposer7.end(false);
                }
                long j7 = colors7.semantic.text.placeholder;
                gapComposer7.end(false);
                return j7;
            case 7:
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(-1953957653);
                Colors colors8 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                if (colors8 == null) {
                    colors8 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                } else {
                    gapComposer8.startReplaceGroup(-1762997739);
                    gapComposer8.end(false);
                }
                long j8 = colors8.semantic.text.prominent;
                gapComposer8.end(false);
                return j8;
            case 8:
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(-1953955766);
                Colors colors9 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                if (colors9 == null) {
                    colors9 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                } else {
                    gapComposer9.startReplaceGroup(-1762997739);
                    gapComposer9.end(false);
                }
                long j9 = colors9.semantic.text.standard;
                gapComposer9.end(false);
                return j9;
            case 9:
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(-1953953976);
                Colors colors10 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                if (colors10 == null) {
                    colors10 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                } else {
                    gapComposer10.startReplaceGroup(-1762997739);
                    gapComposer10.end(false);
                }
                long j10 = colors10.semantic.text.subtle;
                gapComposer10.end(false);
                return j10;
            case 10:
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(-1953952215);
                Colors colors11 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                if (colors11 == null) {
                    colors11 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                } else {
                    gapComposer11.startReplaceGroup(-1762997739);
                    gapComposer11.end(false);
                }
                long j11 = colors11.semantic.text.success;
                gapComposer11.end(false);
                return j11;
            case 11:
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(-1953950423);
                Colors colors12 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                if (colors12 == null) {
                    colors12 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                } else {
                    gapComposer12.startReplaceGroup(-1762997739);
                    gapComposer12.end(false);
                }
                long j12 = colors12.semantic.text.warning;
                gapComposer12.end(false);
                return j12;
            default:
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, -1953971778, false);
        }
    }

    public static byte zza(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean zzb(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
