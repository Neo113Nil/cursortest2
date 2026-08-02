package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.ExtensionsKt;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityImpl;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.local.views.toolbar.LocalToolbarKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.zzd;
import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.ionspin.kotlin.bignum.decimal.DecimalMode;
import com.ionspin.kotlin.bignum.decimal.RoundingMode;
import com.ionspin.kotlin.bignum.integer.BigInteger;
import com.ionspin.kotlin.bignum.integer.Sign;
import com.ionspin.kotlin.bignum.integer.base63.array.BigInteger63Arithmetic;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel;
import com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel$Installed$Default;
import com.squareup.cash.benefits.applets.viewmodels.Subtitle;
import com.squareup.cash.benefits.components.viewmodels.GreenStatus;
import com.squareup.cash.benefits.components.views.Style;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.viewmodels.InstalledServiceAppletTileContentModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda12;
import com.squareup.cash.multiplatform.investing.CustomOrderPriceTickCalculator$RoundingRule;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.util.compose.ProgressBarKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class zzadn {
    public static final void Applet(BankingBenefitsAppletTileModel bankingBenefitsAppletTileModel, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(789829552);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(bankingBenefitsAppletTileModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(appletTileAppearance) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 256 : 128;
        }
        if (!gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer = gapComposer2;
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            gapComposer.skipToGroupEnd();
        } else if (bankingBenefitsAppletTileModel instanceof BankingBenefitsAppletTileModel$Installed$Default) {
            gapComposer2.startReplaceGroup(-1183006621);
            BankingBenefitsAppletTileModel$Installed$Default bankingBenefitsAppletTileModel$Installed$Default = (BankingBenefitsAppletTileModel$Installed$Default) bankingBenefitsAppletTileModel;
            int i3 = i2;
            AppletContentUI(bankingBenefitsAppletTileModel$Installed$Default.title, bankingBenefitsAppletTileModel$Installed$Default.greenStatus, bankingBenefitsAppletTileModel$Installed$Default.subtitle, bankingBenefitsAppletTileModel$Installed$Default.progress, bankingBenefitsAppletTileModel$Installed$Default.previousProgress, taxesAppletViewsModule$$ExternalSyntheticLambda1, appletTileAppearance, gapComposer2, ((i3 << 15) & 3670016) | (458752 & (i3 << 9)));
            gapComposer2.end(false);
            gapComposer = gapComposer2;
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        } else {
            int i4 = i2;
            if (bankingBenefitsAppletTileModel instanceof BankingBenefitsAppletTileModel.Uninstalled) {
                gapComposer2.startReplaceGroup(-1182996893);
                BankingBenefitsAppletTileModel.Uninstalled uninstalled = (BankingBenefitsAppletTileModel.Uninstalled) bankingBenefitsAppletTileModel;
                AppletContentUI(uninstalled.title, uninstalled.greenStatus, uninstalled.subtitle, uninstalled.progress, uninstalled.previousProgress, taxesAppletViewsModule$$ExternalSyntheticLambda1, appletTileAppearance, gapComposer2, ((i4 << 9) & 458752) | ((i4 << 15) & 3670016));
                gapComposer = gapComposer2;
                taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer2;
                taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
                if (bankingBenefitsAppletTileModel instanceof BankingBenefitsAppletTileModel.Loading) {
                    gapComposer.startReplaceGroup(-1182987693);
                    SharedUIKt.m3606LoadingServiceAppletTile942rkJo(((BankingBenefitsAppletTileModel.Loading) bankingBenefitsAppletTileModel).title, null, RecyclerView.DECELERATION_RATE, false, gapComposer, 48, 12);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else {
                    if (!(bankingBenefitsAppletTileModel instanceof BankingBenefitsAppletTileModel.Failed)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1183007356, false);
                    }
                    gapComposer.startReplaceGroup(-1182984978);
                    SharedUIKt.FailedAppletTile((i4 >> 3) & 112, gapComposer, ((BankingBenefitsAppletTileModel.Failed) bankingBenefitsAppletTileModel).title, taxesAppletViewsModule$$ExternalSyntheticLambda12);
                    gapComposer.end(false);
                }
            }
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(bankingBenefitsAppletTileModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda12, i, 19);
        }
    }

    public static final void AppletContentUI(String str, GreenStatus greenStatus, Subtitle subtitle, Float f, Float f2, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        InstalledServiceAppletTileContentModel installedServiceAppletTileContentModel;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-594753712);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(greenStatus.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(subtitle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(f2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i4 = i2;
        if (gapComposer2.shouldExecute(i4 & 1, (74899 & i4) != 74898)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            InstalledServiceAppletTileContentModel installedServiceAppletTileContentModel2 = new InstalledServiceAppletTileContentModel(null, null, null, Expect_jvmKt.rememberComposableLambda(-1331451466, new ComposeDialogKt$$ExternalSyntheticLambda12(str, greenStatus, subtitle, f, 14), gapComposer2), 7);
            if (f == null) {
                gapComposer2.startReplaceGroup(206767548);
                gapComposer2.end(false);
                installedServiceAppletTileContentModel = null;
            } else {
                gapComposer2.startReplaceGroup(206767549);
                installedServiceAppletTileContentModel = new InstalledServiceAppletTileContentModel(null, null, null, Expect_jvmKt.rememberComposableLambda(1445254701, new MoneyTabUIKt$$ExternalSyntheticLambda12(f.floatValue(), f2, i3), gapComposer2), 7);
                gapComposer2.end(false);
            }
            SharedUIKt.InstalledServiceAppletTile(null, ArraysKt___ArraysKt.filterNotNull(new InstalledServiceAppletTileContentModel[]{installedServiceAppletTileContentModel2, installedServiceAppletTileContentModel}), taxesAppletViewsModule$$ExternalSyntheticLambda1, true, null, null, null, gapComposer2, 3142 | ((i4 >> 9) & 896), 112);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScaffoldKt$$ExternalSyntheticLambda5(str, greenStatus, subtitle, f, f2, taxesAppletViewsModule$$ExternalSyntheticLambda1, appletTileAppearance, i, 5);
        }
    }

    public static final void CashGreenProgressBarVisual(float f, Float f2, Composer composer, int i) {
        float f3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-108945293);
        int i2 = (gapComposer.changed(f) ? 4 : 2) | i | (gapComposer.changed(f2) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            f3 = f;
            ProgressBarKt.m3992ProgressBarjt2gSs(SizeKt.fillMaxWidth(companion, 1.0f), f2 != null ? f2.floatValue() : f, f3, 4.0f, gapComposer, ((i2 << 6) & 896) | 3078, 0);
            gapComposer.end(true);
        } else {
            f3 = f;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalToolbarKt$$ExternalSyntheticLambda0(f3, f2, i);
        }
    }

    public static final void CashGreenStatusVisual(String str, GreenStatus greenStatus, Subtitle subtitle, boolean z, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(455675261);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(greenStatus.ordinal()) ? 32 : 16) | (gapComposer.changedInstance(subtitle) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            if (z) {
                gapComposer.startReplaceGroup(-1369671165);
            } else {
                gapComposer.startReplaceGroup(-1369629873);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                modifier = SpacerKt.m300paddingVpY3zN4$default(modifier, RecyclerView.DECELERATION_RATE, 8.0f, 1);
            }
            gapComposer.end(false);
            ExtensionsKt.CashGreenRectangleRow(greenStatus, fillMaxWidth.then(modifier), null, Style.SMALL, Expect_jvmKt.rememberComposableLambda(1862331585, new BankingDialogKt$$ExternalSyntheticLambda2(15, str, subtitle), gapComposer), gapComposer, ((i2 >> 3) & 14) | 27648, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(str, greenStatus, subtitle, z, i, 13);
        }
    }

    public static MinLinesConstrainer from(MinLinesConstrainer minLinesConstrainer, LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamilyResolverImpl fontFamilyResolverImpl) {
        if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.layoutDirection && BundleKt.resolveDefaults(textStyle, layoutDirection).equals(minLinesConstrainer.inputTextStyle) && density.getDensity() == minLinesConstrainer.density.density && fontFamilyResolverImpl == minLinesConstrainer.fontFamilyResolver) {
            return minLinesConstrainer;
        }
        MinLinesConstrainer minLinesConstrainer2 = MinLinesConstrainer.last;
        if (minLinesConstrainer2 != null && layoutDirection == minLinesConstrainer2.layoutDirection && BundleKt.resolveDefaults(textStyle, layoutDirection).equals(minLinesConstrainer2.inputTextStyle) && density.getDensity() == minLinesConstrainer2.density.density && fontFamilyResolverImpl == minLinesConstrainer2.fontFamilyResolver) {
            return minLinesConstrainer2;
        }
        MinLinesConstrainer minLinesConstrainer3 = new MinLinesConstrainer(layoutDirection, BundleKt.resolveDefaults(textStyle, layoutDirection), new DensityImpl(density.getDensity(), density.getFontScale()), fontFamilyResolverImpl);
        MinLinesConstrainer.last = minLinesConstrainer3;
        return minLinesConstrainer3;
    }

    /* renamed from: roundedPrice-3Fu-aEw$investing_release, reason: not valid java name */
    public static long m2015roundedPrice3FuaEw$investing_release(long j, CustomOrderPriceTickCalculator$RoundingRule customOrderPriceTickCalculator$RoundingRule) {
        RoundingMode roundingMode;
        BigDecimal roundToDigitPosition;
        long j2;
        BigDecimal bigDecimal;
        long j3;
        BigDecimal bigDecimal2;
        Pair pair;
        long j4 = 1000000;
        if (Intrinsics.compare(j, 25000000L) < 0) {
            if (Intrinsics.compare(j, 10000000L) >= 0) {
                j4 = 100000;
            } else if (Intrinsics.compare(j, 1000000L) >= 0) {
                j4 = 10000;
            } else {
                j4 = 5000;
                if (Intrinsics.compare(j, 100000L) < 0) {
                    j4 = Intrinsics.compare(j, 25000L) >= 0 ? 1000L : Intrinsics.compare(j, 5000L) >= 0 ? 500L : 100L;
                }
            }
        }
        int ordinal = customOrderPriceTickCalculator$RoundingRule.ordinal();
        if (ordinal == 0) {
            roundingMode = RoundingMode.CEILING;
        } else if (ordinal == 1) {
            roundingMode = RoundingMode.FLOOR;
        } else if (ordinal == 2) {
            roundingMode = RoundingMode.AWAY_FROM_ZERO;
        } else {
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0L;
            }
            roundingMode = RoundingMode.ROUND_HALF_TO_EVEN;
        }
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        BigDecimal fromDouble = com.google.mlkit.vision.text.zzc.fromDouble(j / j4);
        long j5 = fromDouble.exponent;
        if (j5 >= 0) {
            roundToDigitPosition = fromDouble.roundToDigitPosition(j5 + 1, roundingMode);
        } else {
            if (j5 >= 0) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1("Unexpected state");
                return 0L;
            }
            roundToDigitPosition = fromDouble.roundToDigitPosition(1L, roundingMode);
        }
        long j6 = roundToDigitPosition.exponent;
        DecimalMode decimalMode = fromDouble.decimalMode;
        BigInteger bigInteger = roundToDigitPosition.significand;
        BigDecimal bigDecimal4 = decimalMode == null ? new BigDecimal(bigInteger, j6, 4) : new BigDecimal(bigInteger, j6, decimalMode);
        BigInteger bigInteger2 = bigDecimal4.significand;
        if (bigInteger2.isZero()) {
            return 0L;
        }
        BigDecimal bigDecimal5 = new BigDecimal(new BigInteger(bigInteger2.magnitude, Sign.POSITIVE), bigDecimal4.exponent, bigDecimal4.decimalMode);
        BigDecimal bigDecimal6 = BigDecimal.ONE;
        bigDecimal6.getClass();
        BigDecimal bigDecimal7 = BigDecimal.ZERO;
        bigDecimal6.getClass();
        long j7 = bigDecimal6.exponent;
        long j8 = bigDecimal5.exponent;
        if (j8 < 0) {
            pair = new Pair(bigDecimal7, bigDecimal5);
            bigDecimal = bigDecimal4;
            j3 = j4;
            j2 = 0;
        } else {
            j2 = 0;
            long[] jArr = bigDecimal6.significand.magnitude;
            Sign sign = Sign.POSITIVE;
            BigDecimal bigDecimal8 = new BigDecimal(new BigInteger(jArr, sign), j7, bigDecimal6.decimalMode);
            BigInteger bigInteger3 = bigDecimal5.significand;
            BigInteger bigInteger4 = new BigInteger(bigInteger3.magnitude, sign);
            DecimalMode decimalMode2 = bigDecimal5.decimalMode;
            if (bigDecimal8.compareTo(new BigDecimal(bigInteger4, j8, decimalMode2)) > 0) {
                pair = new Pair(bigDecimal7, bigDecimal5);
                bigDecimal = bigDecimal4;
                j3 = j4;
            } else {
                DecimalMode copy$default = decimalMode2 != null ? DecimalMode.copy$default(decimalMode2, (j8 - j7) + 1) : new DecimalMode((j8 - j7) + 1, RoundingMode.FLOOR, 4);
                bigDecimal6.getClass();
                DecimalMode decimalMode3 = bigDecimal6.decimalMode;
                BigInteger bigInteger5 = bigDecimal6.significand;
                long j9 = bigDecimal6.exponent;
                long j10 = bigDecimal6.precision;
                DecimalMode access$resolveDecimalMode = com.google.mlkit.vision.text.zzc.access$resolveDecimalMode(decimalMode2, decimalMode3, copy$default);
                long j11 = access$resolveDecimalMode.decimalPrecision;
                bigDecimal = bigDecimal4;
                if (!access$resolveDecimalMode.isPrecisionUnlimited || access$resolveDecimalMode.usingScale) {
                    long j12 = j8 - j9;
                    long j13 = j12 - 1;
                    j3 = j4;
                    long j14 = (j11 - bigDecimal5.precision) + j10;
                    if (j14 > 0) {
                        BigInteger63Arithmetic bigInteger63Arithmetic = BigInteger.arithmetic;
                        bigInteger3 = bigInteger3.times(zzd.fromInt(10).pow(j14));
                    } else if (j14 < 0) {
                        BigInteger63Arithmetic bigInteger63Arithmetic2 = BigInteger.arithmetic;
                        BigInteger pow = zzd.fromInt(10).pow(Math.abs(j14));
                        bigInteger3.getClass();
                        pow.getClass();
                        bigInteger3 = (BigInteger) bigInteger3.divide(pow);
                    }
                    BigInteger.QuotientAndRemainder divrem = bigInteger3.divrem(bigInteger5);
                    BigInteger bigInteger6 = divrem.quotient;
                    if (Intrinsics.areEqual(bigInteger6, BigInteger.ZERO)) {
                        j13 = j12 - 2;
                    }
                    long numberOfDecimalDigits = bigInteger6.numberOfDecimalDigits() - j11;
                    BigInteger bigInteger7 = divrem.remainder;
                    bigDecimal2 = bigDecimal5.usingScale ? new BigDecimal(com.google.mlkit.vision.text.zzc.roundDiscarded(bigInteger6, bigInteger7, access$resolveDecimalMode), j13 + numberOfDecimalDigits, DecimalMode.copy$default(access$resolveDecimalMode, bigInteger6.numberOfDecimalDigits())) : new BigDecimal(com.google.mlkit.vision.text.zzc.roundDiscarded(bigInteger6, bigInteger7, access$resolveDecimalMode), j13 + numberOfDecimalDigits, access$resolveDecimalMode);
                } else {
                    long j15 = j8 - j9;
                    BigInteger times = bigInteger3.times(BigInteger.TEN.pow((2 * j10) + 6));
                    BigInteger.QuotientAndRemainder divrem2 = times.divrem(bigInteger5);
                    BigInteger bigInteger8 = divrem2.quotient;
                    long numberOfDecimalDigits2 = (bigInteger8.numberOfDecimalDigits() - times.numberOfDecimalDigits()) + (j10 - 1);
                    if (Intrinsics.areEqual(divrem2.remainder, BigInteger.ZERO)) {
                        bigDecimal2 = new BigDecimal(bigInteger8, j15 + numberOfDecimalDigits2, access$resolveDecimalMode);
                    } else {
                        Mod$$ExternalSyntheticBUOutline0.m$2("Non-terminating result of division operation (i.e. 1/3 = 0.3333... library needs to know when to stop and how to round up at that point). Specify decimalPrecision inside your decimal mode.");
                        bigDecimal2 = null;
                    }
                    j3 = j4;
                }
                DecimalMode decimalMode4 = DecimalMode.DEFAULT;
                BigInteger bigInteger9 = bigDecimal2.significand;
                long j16 = (3 & 2) != 0 ? bigDecimal2.exponent : 0L;
                if ((3 & 4) != 0) {
                    decimalMode4 = bigDecimal2.decimalMode;
                }
                bigDecimal2.getClass();
                bigInteger9.getClass();
                BigDecimal bigDecimal9 = new BigDecimal(bigInteger9, j16, decimalMode4);
                BigDecimal.ScaleOps[] scaleOpsArr = BigDecimal.ScaleOps.$VALUES;
                DecimalMode computeMode = bigDecimal9.computeMode(bigDecimal6);
                bigDecimal6.getClass();
                DecimalMode access$resolveDecimalMode2 = com.google.mlkit.vision.text.zzc.access$resolveDecimalMode(bigDecimal9.decimalMode, bigDecimal6.decimalMode, computeMode);
                BigInteger bigInteger10 = bigDecimal9.significand;
                long numberOfDecimalDigits3 = bigInteger10.numberOfDecimalDigits();
                BigInteger bigInteger11 = bigDecimal6.significand;
                long numberOfDecimalDigits4 = bigInteger11.numberOfDecimalDigits();
                BigInteger times2 = bigInteger10.times(bigInteger11);
                long numberOfDecimalDigits5 = times2.numberOfDecimalDigits();
                long j17 = bigDecimal9.exponent + bigDecimal6.exponent + (numberOfDecimalDigits5 - (numberOfDecimalDigits3 + numberOfDecimalDigits4)) + 1;
                BigDecimal access$roundOrDont = access$resolveDecimalMode2.usingScale ? com.google.mlkit.vision.text.zzc.access$roundOrDont(times2, j17, DecimalMode.copy$default(access$resolveDecimalMode2, numberOfDecimalDigits5)) : com.google.mlkit.vision.text.zzc.access$roundOrDont(times2, j17, access$resolveDecimalMode2);
                pair = new Pair(bigDecimal2, bigDecimal5.subtract(access$roundOrDont, bigDecimal5.computeMode(access$roundOrDont)));
            }
        }
        if (((BigDecimal) pair.second).significand.isZero()) {
            return bigDecimal.toBigInteger().intValue() * j3;
        }
        Mod$$ExternalSyntheticBUOutline0.m$2("Cannot convert to int and provide exact value");
        return j2;
    }
}
