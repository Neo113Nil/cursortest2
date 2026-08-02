package androidx.compose.ui.graphics.painter;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Illustrations;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsInfoViewModel;
import com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsInfoView$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsInfoViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.offers.viewmodels.itemviewmodels.InfoTileViewModel;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class BitmapPainterKt {
    public static final void BitcoinStackingToolsInfoViewContent(BitcoinStackingToolsInfoViewModel bitcoinStackingToolsInfoViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        bitcoinStackingToolsInfoViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(784185303);
        int i2 = (gapComposer.changed(bitcoinStackingToolsInfoViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(-556446814, new BitcoinStackingToolsInfoView$$ExternalSyntheticLambda1(bitcoinStackingToolsInfoViewModel, function1, i3), gapComposer), gapComposer, 3072, 6);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinStackingToolsInfoViewKt$$ExternalSyntheticLambda1(bitcoinStackingToolsInfoViewModel, function1, modifier2, i, 0);
        }
    }

    /* renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static BitmapPainter m760BitmapPainterQZhYCtY$default(AndroidImageBitmap androidImageBitmap, int i) {
        BitmapPainter bitmapPainter = new BitmapPainter(androidImageBitmap, (androidImageBitmap.bitmap.getHeight() & BodyPartID.bodyIdMax) | (androidImageBitmap.bitmap.getWidth() << 32));
        bitmapPainter.filterQuality = i;
        return bitmapPainter;
    }

    public static final void InfoCollectionItem(Modifier modifier, InfoTileViewModel infoTileViewModel, Function0 function0, Composer composer, int i) {
        Color m;
        long j;
        infoTileViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(616284321);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(infoTileViewModel) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startReplaceGroup(-456247910);
            long mo238toSp0xMU5do = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo238toSp0xMU5do(PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.offers_info_tile_title_text_size));
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, 0L, mo238toSp0xMU5do, null, null, 0L, null, 0L, null, null, null, 0, mo238toSp0xMU5do, null, null, 0, 16646141);
            gapComposer.end(false);
            Modifier clip = ClipKt.clip(modifier, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(20.0f));
            com.squareup.protos.cash.ui.Color color = infoTileViewModel.backgroundColor;
            Color color2 = null;
            if (color == null) {
                gapComposer.startReplaceGroup(-1258542730);
                gapComposer.end(false);
                m = null;
            } else {
                m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -456240149, color, gapComposer, false);
            }
            if (m == null) {
                gapComposer.startReplaceGroup(-456237432);
                j = Strings.getColors(gapComposer).component.button.prominent.background.f160default;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-456240780);
                gapComposer.end(false);
                j = m.value;
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j, ColorKt.RectangleShape);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier testTag = TestTagKt.testTag(ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 6, 0L, true), false, null, null, function0, 28), "CollectionTile");
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, testTag);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f, true), PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.offers_info_tile_title_start_padding), RecyclerView.DECELERATION_RATE, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.offers_info_tile_title_end_padding), RecyclerView.DECELERATION_RATE, 10);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            UtilsKt.m3678ScalableOffersStyledTextY1HBRDA(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.offers_info_tile_title_top_padding), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), infoTileViewModel.titleText, null, m994copyp1EtxEg$default, Strings.getColors(gapComposer).semantic.background.standard, 3, 0L, 0, 0, gapComposer, 196608, 964);
            gapComposer.startReplaceGroup(-2101109477);
            gapComposer.end(false);
            gapComposer.end(true);
            gapComposer.startReplaceGroup(753498705);
            Button button = infoTileViewModel.button;
            Colors colors = Strings.getColors(gapComposer).isLight ? ColorsDarkKt.colorsDark : ColorsLightKt.colorsLight;
            com.squareup.protos.cash.ui.Color color3 = button.background_color;
            if (color3 == null) {
                gapComposer.startReplaceGroup(-1510844084);
                gapComposer.end(false);
            } else {
                color2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1157115563, color3, gapComposer, false);
            }
            Color color4 = color2;
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1467overrideButtonPrimaryBackgroundWkMShQ$default(colors, color4 != null ? color4.value : colors.component.button.prominent.background.f160default), null, null, Expect_jvmKt.rememberComposableLambda(2060386976, new HelpSheetView$$ExternalSyntheticLambda0(2, function0, button, colors), gapComposer), gapComposer, 3072, 6);
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(modifier, infoTileViewModel, function0, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    public static final void StackingToolsInfoContent(BitcoinStackingToolsInfoViewModel bitcoinStackingToolsInfoViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        boolean z;
        NeverEqualPolicy neverEqualPolicy;
        Illustrations illustrations;
        Modifier.Companion companion;
        GapComposer gapComposer2;
        char c;
        Function0 function0;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1336741990);
        int i2 = i | (gapComposer3.changed(bitcoinStackingToolsInfoViewModel) ? 4 : 2) | (gapComposer3.changedInstance(function1) ? 32 : 16) | (gapComposer3.changed(modifier) ? 256 : 128);
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(modifier, 1.0f), ImageKt.rememberScrollState(gapComposer3), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, verticalScroll$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType bitcoinStackingToolsInfoType = bitcoinStackingToolsInfoViewModel.f1057type;
            BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType bitcoinStackingToolsInfoType2 = BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType.RECEIVE_P2P_AS_BITCOIN;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.Fit;
            if (bitcoinStackingToolsInfoType == bitcoinStackingToolsInfoType2) {
                gapComposer3.startReplaceGroup(1850409498);
                Painter painterResource = Countries.painterResource(2131231129, 0, gapComposer3);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                companion = companion2;
                z = false;
                neverEqualPolicy = neverEqualPolicy2;
                ImageKt.Image(painterResource, null, SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 32.0f, 16.0f), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer3, Painter.$stable | 24624, 104);
                gapComposer3.end(false);
                gapComposer2 = gapComposer3;
            } else {
                z = false;
                neverEqualPolicy = neverEqualPolicy2;
                gapComposer3.startReplaceGroup(1850804624);
                boolean changed = gapComposer3.changed(bitcoinStackingToolsInfoType.ordinal());
                Object rememberedValue = gapComposer3.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    int ordinal = bitcoinStackingToolsInfoType.ordinal();
                    if (ordinal == 0) {
                        illustrations = Illustrations.BitcoinCoaster;
                    } else if (ordinal == 1) {
                        illustrations = Illustrations.BitcoinGolf;
                    } else if (ordinal == 2) {
                        illustrations = Illustrations.CurvyPaycheckBtc;
                    } else {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$1("RECEIVE_P2P_AS_BITCOIN uses a local drawable");
                                return;
                            }
                        }
                        illustrations = Illustrations.PruniningBitcoin;
                    }
                    rememberedValue = illustrations;
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                Illustrations illustrations2 = (Illustrations) rememberedValue;
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                String str = colors.isLight ? illustrations2.lightUrl : illustrations2.darkUrl;
                Modifier aspectRatio = OffsetKt.aspectRatio(illustrations2.width / illustrations2.height, SizeKt.fillMaxWidth(companion2, 1.0f), false);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal2)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal2)).getClass();
                companion = companion2;
                AsyncImageKt.m1438AsyncImage10Xjiaw(str, null, SpacerKt.m299paddingVpY3zN4(aspectRatio, 64.0f, 16.0f), null, contentScale$Companion$Fit$1, null, gapComposer3, 1572912, 1976);
                GapComposer gapComposer4 = gapComposer3;
                gapComposer4.end(false);
                gapComposer2 = gapComposer4;
            }
            ViewfinderKt.HeroHeader(bitcoinStackingToolsInfoViewModel.title, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), bitcoinStackingToolsInfoViewModel.subtitle, (TextStyle) null, gapComposer2, 48, 8);
            gapComposer2.startReplaceGroup(-910106532);
            GapComposer gapComposer5 = gapComposer2;
            final boolean z2 = z;
            for (final BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem bitcoinStackingToolsInfoItem : bitcoinStackingToolsInfoViewModel.items) {
                BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType bitcoinStackingToolsInfoType3 = bitcoinStackingToolsInfoItem.itemType;
                if (bitcoinStackingToolsInfoType3 == null) {
                    gapComposer5.startReplaceGroup(2071788540);
                    gapComposer5.end(z2);
                    function0 = null;
                    c = ' ';
                } else {
                    gapComposer5.startReplaceGroup(2071788541);
                    c = ' ';
                    boolean changed2 = ((i2 & 112) == 32 ? true : z2) | gapComposer5.changed(bitcoinStackingToolsInfoType3.ordinal());
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BulletinTileKt$$ExternalSyntheticLambda12(4, function1, bitcoinStackingToolsInfoType3);
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    function0 = (Function0) rememberedValue2;
                    gapComposer5.end(z2);
                }
                final int i3 = 1;
                final int i4 = 2;
                boolean z3 = z2;
                GapComposer gapComposer6 = gapComposer5;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-525969649, new Function2() { // from class: com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsInfoViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = z2;
                        BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem bitcoinStackingToolsInfoItem2 = bitcoinStackingToolsInfoItem;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer7 = (GapComposer) composer2;
                                if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Trace.m1191Iconww6aTOc(bitcoinStackingToolsInfoItem2.icon, (String) null, (Modifier) null, 0L, gapComposer7, 48, 12);
                                } else {
                                    gapComposer7.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer8 = (GapComposer) composer3;
                                if (gapComposer8.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinStackingToolsInfoItem2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer8.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer9 = (GapComposer) composer4;
                                if (gapComposer9.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinStackingToolsInfoItem2.subtitle, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer9.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer5), Expect_jvmKt.rememberComposableLambda(-984605168, new Function2() { // from class: com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsInfoViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i3;
                        BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem bitcoinStackingToolsInfoItem2 = bitcoinStackingToolsInfoItem;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer7 = (GapComposer) composer2;
                                if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Trace.m1191Iconww6aTOc(bitcoinStackingToolsInfoItem2.icon, (String) null, (Modifier) null, 0L, gapComposer7, 48, 12);
                                } else {
                                    gapComposer7.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer8 = (GapComposer) composer3;
                                if (gapComposer8.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinStackingToolsInfoItem2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer8.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer9 = (GapComposer) composer4;
                                if (gapComposer9.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinStackingToolsInfoItem2.subtitle, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer9.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer5), null, function0, false, false, Expect_jvmKt.rememberComposableLambda(558549014, new Function2() { // from class: com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsInfoViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i4;
                        BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem bitcoinStackingToolsInfoItem2 = bitcoinStackingToolsInfoItem;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer7 = (GapComposer) composer2;
                                if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Trace.m1191Iconww6aTOc(bitcoinStackingToolsInfoItem2.icon, (String) null, (Modifier) null, 0L, gapComposer7, 48, 12);
                                } else {
                                    gapComposer7.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer8 = (GapComposer) composer3;
                                if (gapComposer8.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinStackingToolsInfoItem2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer8.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer9 = (GapComposer) composer4;
                                if (gapComposer9.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinStackingToolsInfoItem2.subtitle, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer9.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer5), null, bitcoinStackingToolsInfoItem.itemType != null ? CellDefaultAccessory.Push.INSTANCE : null, 0L, gapComposer6, 12582966, 3444);
                gapComposer5 = gapComposer6;
                neverEqualPolicy = neverEqualPolicy;
                z2 = z3;
                i2 = i2;
            }
            gapComposer5.end(z2);
            gapComposer5.end(true);
            gapComposer = gapComposer5;
        } else {
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinStackingToolsInfoViewKt$$ExternalSyntheticLambda1(bitcoinStackingToolsInfoViewModel, function1, modifier, i, 1);
        }
    }
}
