package app.cash.local.views.brand.checkout;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.Lock;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.viewmodels.CurbsidePickupCarViewModel;
import app.cash.local.viewmodels.VehicleColorOption;
import app.cash.local.viewmodels.VehicleColorSpec;
import app.cash.local.viewmodels.VehicleTypeOption;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.datefilterbar.views.DateFilterChipKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class CurbsidePickupCarSheetKt {
    public static final List previewColorOptions = CollectionsKt__CollectionsKt.listOf((Object[]) new VehicleColorOption[]{new VehicleColorOption("Black", new VehicleColorSpec.Solid(4278190080L)), new VehicleColorOption("Gray", new VehicleColorSpec.Solid(4287137928L)), new VehicleColorOption("Silver", new VehicleColorSpec.Solid(4291611852L)), new VehicleColorOption("White", new VehicleColorSpec.Solid(BodyPartID.bodyIdMax)), new VehicleColorOption("Blue", new VehicleColorSpec.Solid(4278190335L)), new VehicleColorOption("Green", new VehicleColorSpec.Solid(4278255360L)), new VehicleColorOption("Red", new VehicleColorSpec.Solid(4294901760L)), new VehicleColorOption("Brown", new VehicleColorSpec.Solid(4284893742L)), new VehicleColorOption("Other", new VehicleColorSpec.Gradient(CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(Float.valueOf(0.05f), 4280527316L), new Pair(Float.valueOf(0.17f), 4286538229L), new Pair(Float.valueOf(0.29f), 4292759285L), new Pair(Float.valueOf(0.49f), 4294235496L), new Pair(Float.valueOf(0.76f), 4294228519L)})))});
    public static final List previewTypeOptions = CollectionsKt__CollectionsKt.listOf((Object[]) new VehicleTypeOption[]{new VehicleTypeOption("Sedan"), new VehicleTypeOption("SUV"), new VehicleTypeOption("Truck"), new VehicleTypeOption("Van"), new VehicleTypeOption("Bicycle"), new VehicleTypeOption("Other")});

    public static final void CurbsidePickupCarSheet(Modifier modifier, CurbsidePickupCarViewModel curbsidePickupCarViewModel, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        curbsidePickupCarViewModel.getClass();
        String str = curbsidePickupCarViewModel.initialNote;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1145226233);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(curbsidePickupCarViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(str, 0L, gapComposer, 0, 2);
            boolean changed = gapComposer.changed(m382rememberTextFieldStateLepunE) | gapComposer.changedInstance(curbsidePickupCarViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new EventBridge$sendEvent$1(m382rememberTextFieldStateLepunE, curbsidePickupCarViewModel, null, 14);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 4);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SheetKt.Sheet((Function0) rememberedValue2, fillMaxSize, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(199428638, new LocalViewFactory$$ExternalSyntheticLambda6(function1, m382rememberTextFieldStateLepunE, curbsidePickupCarViewModel), gapComposer), gapComposer, 100663344, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) modifier2, (Object) curbsidePickupCarViewModel, function1, i, 14);
        }
    }

    public static final void VehicleChip(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0, boolean z) {
        ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-783610394);
        int i2 = i | (gapComposer.changed(z) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m289sizeInqDBjuR0$default(modifier, 84.0f, 56.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12), m340RoundedCornerShape0680j_4), Strings.getColors(gapComposer).semantic.background.subtle, m340RoundedCornerShape0680j_4);
            Modifier modifier2 = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-1389530380);
                Strings.getSizes(gapComposer).getClass();
                BorderStroke m173BorderStrokecXLIe8U = CanvasKt.m173BorderStrokecXLIe8U(Strings.getColors(gapComposer).semantic.text.prominent, 2.0f);
                modifier2 = ImageKt.m179borderziNgDLE(modifier2, m173BorderStrokecXLIe8U.width, m173BorderStrokecXLIe8U.brush, m340RoundedCornerShape0680j_4);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1389238918);
                gapComposer.end(false);
            }
            Modifier then = m177backgroundbw27NRU.then(modifier2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m182clickableO2vRcR0$default(then, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15), false, null, new Role(0), function0, 12), 8.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            composableLambdaImpl2 = composableLambdaImpl;
            Recorder$$ExternalSyntheticOutline2.m(6, composableLambdaImpl2, gapComposer, true);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateFilterChipKt$$ExternalSyntheticLambda1(z, function0, modifier, composableLambdaImpl2, i, 1);
        }
    }

    public static final void VehicleChipSection(String str, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1211140063);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | 48;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, colors.semantic.text.prominent, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Modifier.Companion companion2 = companion;
            OffsetKt.FlowRow(Request$Priority$EnumUnboxingLocalUtility.m(companion2, 16.0f, gapComposer2, companion2, 1.0f), new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), null, 3, 0, composableLambdaImpl, gapComposer2, 1597878, 40);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            modifier2 = companion2;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(str, modifier2, composableLambdaImpl, i);
        }
    }

    public static final void VehicleColorIndicator(String str, VehicleColorSpec vehicleColorSpec, Composer composer, int i) {
        LinearGradient m132linearGradientmHitzGk;
        Modifier background$default;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1038947177);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(vehicleColorSpec) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 20.0f);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier clip = ClipKt.clip(m285size3ABfNKs, roundedCornerShape);
            if (vehicleColorSpec instanceof VehicleColorSpec.Solid) {
                background$default = ImageKt.m177backgroundbw27NRU(clip, ColorKt.Color(((VehicleColorSpec.Solid) vehicleColorSpec).colorValue), roundedCornerShape);
            } else {
                if (!(vehicleColorSpec instanceof VehicleColorSpec.Gradient)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                List<Pair> list = ((VehicleColorSpec.Gradient) vehicleColorSpec).colorStops;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (Pair pair : list) {
                    arrayList.add(new Pair(Float.valueOf(((Number) pair.first).floatValue()), new Color(ColorKt.Color(((Number) pair.second).longValue()))));
                }
                Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                m132linearGradientmHitzGk = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r7, ((Pair[]) Arrays.copyOf(pairArr, pairArr.length)).length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                background$default = ImageKt.background$default(clip, m132linearGradientmHitzGk, roundedCornerShape, 4);
            }
            BoxKt.Box(background$default, gapComposer, 0);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, colors.semantic.text.prominent, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(str, vehicleColorSpec, i, 3);
        }
    }
}
