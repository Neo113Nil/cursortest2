package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Bundle;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.DslConstraintSet;
import androidx.constraintlayout.compose.Measurer2;
import androidx.glance.ImageKt$Image$3;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda17;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.trace.internal.data.CoreTraceWriter$write$1;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$BadgeAssetLayout$3$2$1;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.upsell.viewmodels.UiGroupElementViewModel;
import com.squareup.cash.upsell.viewmodels.UiGroupViewModel;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import com.squareup.util.cash.Countries;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt__ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class zzrl {
    public static final void ActualImage(Painter painter, Modifier modifier, ContentScale contentScale, Composer composer, int i, int i2) {
        int i3;
        ContentScale contentScale2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1305115832);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(painter) : gapComposer.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(contentScale) ? 256 : 128;
        }
        int i5 = i3 | 3072;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
            ContentScale contentScale3 = i4 != 0 ? ContentScale.Companion.Fit : contentScale;
            ImageKt.Image(painter, null, modifier, null, contentScale3, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 48 | (i5 & 14) | ((i5 << 3) & 896) | (57344 & (i5 << 6)) | ((i5 << 9) & 3670016), 40);
            contentScale2 = contentScale3;
        } else {
            gapComposer.skipToGroupEnd();
            contentScale2 = contentScale;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) painter, modifier, (Object) contentScale2, i, i2, 24);
        }
    }

    public static final void DrawableImage(UiGroupElementViewModel.DrawableViewModel drawableViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(599442819);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(drawableViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            drawableViewModel.getClass();
            ActualImage(Countries.painterResource(R.drawable.stablecoin_null_state_carousel_image, 0, gapComposer), SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2), null, gapComposer, Painter.$stable, 12);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(drawableViewModel, modifier, i, 23);
        }
    }

    public static final void ImageOrVisual(UiGroupElementViewModel uiGroupElementViewModel, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(389349781);
        int i2 = (gapComposer.changedInstance(uiGroupElementViewModel) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (uiGroupElementViewModel instanceof UiGroupElementViewModel.DrawableViewModel) {
            gapComposer.startReplaceGroup(-1587222830);
            DrawableImage((UiGroupElementViewModel.DrawableViewModel) uiGroupElementViewModel, modifier, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1587073875);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda12(uiGroupElementViewModel, modifier, i, 15);
        }
    }

    public static final void NullStateText(UiGroupElementViewModel.TextViewModel textViewModel, Modifier modifier, Composer composer, int i) {
        Pair pair;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2078978392);
        int i2 = (gapComposer.changedInstance(textViewModel) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int ordinal = textViewModel.style.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(738446504);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(new Color(colors.semantic.text.standard), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle);
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(738449666);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(new Color(colors2.semantic.text.standard), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header);
                gapComposer.end(false);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 738445582, false);
                }
                gapComposer.startReplaceGroup(738452644);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(new Color(colors3.semantic.text.subtle), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, ((Color) pair.first).value, (Composer) gapComposer, SizeKt.fillMaxWidth(modifier, 1.0f), (TextStyle) pair.second, (TextLineBalancing) null, textViewModel.text, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda12(textViewModel, modifier, i, 16);
        }
    }

    public static final void NullStateUiGroupContent(UiGroupViewModel uiGroupViewModel, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        Function2 workViewFactory$$ExternalSyntheticLambda12;
        BiasAlignment biasAlignment;
        Modifier.Companion companion;
        boolean z;
        uiGroupViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-528340007);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(uiGroupViewModel) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            List list = uiGroupViewModel.elements;
            if (list.isEmpty()) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    workViewFactory$$ExternalSyntheticLambda12 = new FieldBinding$$ExternalSyntheticLambda4(uiGroupViewModel, i, 12);
                    endRestartGroup.block = workViewFactory$$ExternalSyntheticLambda12;
                }
                return;
            }
            boolean changed = gapComposer.changed(list);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                CollectionsKt.firstOrNull(list);
                rememberedValue = Boolean.valueOf(CollectionsKt.firstOrNull(list) instanceof UiGroupElementViewModel.DrawableViewModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            boolean booleanValue = ((Boolean) rememberedValue).booleanValue();
            boolean changed2 = gapComposer.changed(list);
            Object rememberedValue2 = gapComposer.rememberedValue();
            Object obj = rememberedValue2;
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    UiGroupElementViewModel uiGroupElementViewModel = (UiGroupElementViewModel) obj2;
                    if ((uiGroupElementViewModel instanceof UiGroupElementViewModel.TextViewModel) || (uiGroupElementViewModel instanceof UiGroupElementViewModel.SpaceViewModel)) {
                        arrayList.add(obj2);
                    }
                }
                gapComposer.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            List list2 = (List) obj;
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
            BiasAlignment biasAlignment2 = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion2, 1.0f), rememberScrollState, false, 14);
            DslConstraintSet dslConstraintSet = booleanValue ? new DslConstraintSet(new CardAppletTile$$ExternalSyntheticLambda0(5)) : new DslConstraintSet(new CardAppletTile$$ExternalSyntheticLambda0(6));
            gapComposer.startReplaceGroup(-1998673515);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                biasAlignment = biasAlignment2;
                rememberedValue3 = new ParcelableSnapshotMutableLongState(0L);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                biasAlignment = biasAlignment2;
            }
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Unit.INSTANCE, NeverEqualPolicy.INSTANCE);
                gapComposer.updateRememberedValue(parcelableSnapshotMutableState);
                rememberedValue4 = parcelableSnapshotMutableState;
            }
            MutableState mutableState = (MutableState) rememberedValue4;
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new Measurer2(density);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Measurer2 measurer2 = (Measurer2) rememberedValue5;
            boolean changedInstance = gapComposer.changedInstance(measurer2) | gapComposer.changed(dslConstraintSet) | gapComposer.changed(EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object rememberedValue6 = gapComposer.rememberedValue();
            int i3 = 3;
            if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new BadgeKt$BadgeAssetLayout$3$2$1(i3, mutableState, measurer2, dslConstraintSet);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue6;
            measurer2.getClass();
            if (Float.isNaN(measurer2.forcedScaleFactor)) {
                companion = companion2;
                gapComposer.startReplaceGroup(-1996827620);
                boolean changedInstance2 = gapComposer.changedInstance(measurer2);
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4(measurer2, 9);
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
                z = false;
                RulerKt.MultiMeasureLayout(SemanticsModifierKt.semantics(verticalScroll$default, false, (Function1) rememberedValue7), Expect_jvmKt.rememberComposableLambda(-207512644, new ImageKt$Image$3(i3, mutableState, uiGroupViewModel, list2), gapComposer), measurePolicy, gapComposer, 48);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1997256040);
                float f = measurer2.forcedScaleFactor;
                Modifier scale = ScaleKt.scale(verticalScroll$default, f, f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion2);
                gapComposer.startReusableNode();
                companion = companion2;
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$13);
                }
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                boolean changedInstance3 = gapComposer.changedInstance(measurer2);
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4(measurer2, 8);
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                RulerKt.MultiMeasureLayout(SemanticsModifierKt.semantics(scale, false, (Function1) rememberedValue8), Expect_jvmKt.rememberComposableLambda(1131308473, new CoreTraceWriter$write$1(4, uiGroupViewModel, list2), gapComposer), measurePolicy, gapComposer, 48);
                gapComposer.end(true);
                gapComposer.end(false);
                z = false;
            }
            gapComposer.end(z);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            workViewFactory$$ExternalSyntheticLambda12 = new WorkViewFactory$$ExternalSyntheticLambda12(uiGroupViewModel, modifier2, i, 14);
            endRestartGroup.block = workViewFactory$$ExternalSyntheticLambda12;
        }
    }

    public static final void TextAndSpaceElements(int i, Composer composer, Modifier modifier, List list) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(405924971);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            gapComposer.startReplaceGroup(-2025371333);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UiGroupElementViewModel uiGroupElementViewModel = (UiGroupElementViewModel) it.next();
                boolean z = uiGroupElementViewModel instanceof UiGroupElementViewModel.TextViewModel;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (z) {
                    gapComposer.startReplaceGroup(1450580546);
                    NullStateText((UiGroupElementViewModel.TextViewModel) uiGroupElementViewModel, SpacerKt.m300paddingVpY3zN4$default(companion, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.blockers_padding), RecyclerView.DECELERATION_RATE, 2), gapComposer, 0);
                    gapComposer.end(false);
                } else if (uiGroupElementViewModel instanceof UiGroupElementViewModel.SpaceViewModel) {
                    re$$ExternalSyntheticOutline0.m(gapComposer, 1450828143, companion, 24.0f, gapComposer);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1450932489);
                    gapComposer.end(false);
                }
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda17(list, modifier, i, 11, false);
        }
    }

    public static final boolean contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !Intrinsics.areEqual(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!ArraysKt__ArraysKt.contentDeepEquals((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final int contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            i = (i * 31) + (obj instanceof Bundle ? contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt((Bundle) obj) : obj instanceof Object[] ? Arrays.deepHashCode((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return i;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBnplLoan.deepLinkSpecs;
    }
}
