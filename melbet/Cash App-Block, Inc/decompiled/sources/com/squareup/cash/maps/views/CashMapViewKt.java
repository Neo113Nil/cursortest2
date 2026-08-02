package com.squareup.cash.maps.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda22;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.SpacesPagerInteractionManagerKt;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.molecule.PlatformKt;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;
import com.squareup.cash.maps.engine.providers.GoogleMapEngineProvider;
import com.squareup.cash.maps.engine.providers.MapEngineProviderKt;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.MarkerLocation;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.util.Strings;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class CashMapViewKt {

    /* renamed from: lambda$-405940144, reason: not valid java name */
    public static final ComposableLambdaImpl f463lambda$405940144 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(0), false, -405940144);
    public static final ComposableLambdaImpl lambda$741206307 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(5), false, 741206307);

    public static final void ArcadeMapIconButton(int i, int i2, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0, boolean z) {
        boolean z2;
        int i3;
        ComposableLambdaImpl composableLambdaImpl2;
        boolean z3;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1468464748);
        int i4 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (gapComposer.changed(z2) ? 2048 : 1024);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z4 = i5 != 0 ? true : z2;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BorderStroke m173BorderStrokecXLIe8U = CanvasKt.m173BorderStrokecXLIe8U(colors.semantic.border.subtle, 1.0f);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(ImageKt.m179borderziNgDLE(modifier, m173BorderStrokecXLIe8U.width, m173BorderStrokecXLIe8U.brush, roundedCornerShape), 52.0f), roundedCornerShape);
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, colors2.semantic.background.f1047app, ColorKt.RectangleShape);
            Role role = new Role(0);
            boolean z5 = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z5 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda10(25, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m177backgroundbw27NRU, z4, null, role, (Function0) rememberedValue, 10);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
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
            z3 = z4;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
            z3 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda22(function0, modifier, z3, composableLambdaImpl2, i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x024b, code lost:
    
        if (r14.getTransition().targetState$delegate.getValue() == r4) goto L158;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0298  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CashMapView(final Modifier modifier, final List list, CashMapViewModel cashMapViewModel, final Function3 function3, final ComposableLambdaImpl composableLambdaImpl, Function1 function1, Function2 function2, SelectedLocationCameraReframe selectedLocationCameraReframe, Function3 function32, Function5 function5, Function1 function12, boolean z, boolean z2, final Function1 function13, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        final Function2 function22;
        int i6;
        SelectedLocationCameraReframe selectedLocationCameraReframe2;
        int i7;
        int i8;
        Function3 function33;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        CashMapViewModel cashMapViewModel2;
        final Function1 function14;
        final Function5 function52;
        final boolean z3;
        final SelectedLocationCameraReframe selectedLocationCameraReframe3;
        final Function3 function34;
        final Function1 function15;
        final boolean z4;
        RecomposeScopeImpl endRestartGroup;
        int i20;
        int i21;
        Function1 function16;
        int i22;
        Function2 function23;
        int i23;
        int i24;
        boolean z5;
        boolean changed;
        boolean z6;
        Object obj;
        FiniteAnimationSpec finiteAnimationSpec;
        Object obj2;
        MutableState mutableState;
        FiniteAnimationSpec finiteAnimationSpec2;
        Object obj3;
        Modifier.Companion companion;
        MutableState mutableState2;
        Function1 function17;
        Function2 function24;
        SelectedLocationCameraReframe selectedLocationCameraReframe4;
        Function3 function35;
        boolean z7;
        ?? r1;
        Function1 function18;
        Object obj4;
        MutableState mutableState3;
        Object obj5;
        Function5 function53;
        Function1 function19;
        Object obj6;
        Object obj7;
        Object obj8;
        list.getClass();
        cashMapViewModel.getClass();
        function3.getClass();
        function13.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-421585938);
        if ((i & 6) == 0) {
            i4 = i | (gapComposer.changed(modifier) ? 4 : 2);
        } else {
            i4 = i;
        }
        int i25 = i4 | (gapComposer.changedInstance(list) ? 32 : 16) | (gapComposer.changedInstance(cashMapViewModel) ? 256 : 128);
        int i26 = i25 | 3072;
        int i27 = i3 & 64;
        if (i27 != 0) {
            i26 = 1575936 | i25;
        } else if ((i & 1572864) == 0) {
            i26 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            i5 = i3 & 128;
            if (i5 == 0) {
                i26 |= 12582912;
                function22 = function2;
            } else {
                function22 = function2;
                if ((i & 12582912) == 0) {
                    i26 |= gapComposer.changedInstance(function22) ? 8388608 : 4194304;
                }
            }
            i6 = i3 & 256;
            if (i6 == 0) {
                i7 = i26 | 100663296;
                selectedLocationCameraReframe2 = selectedLocationCameraReframe;
            } else {
                selectedLocationCameraReframe2 = selectedLocationCameraReframe;
                i7 = i26 | (gapComposer.changed(selectedLocationCameraReframe2) ? 67108864 : 33554432);
            }
            i8 = i3 & 512;
            if (i8 == 0) {
                i7 |= 805306368;
                function33 = function32;
            } else {
                function33 = function32;
                if ((i & 805306368) == 0) {
                    i7 |= gapComposer.changedInstance(function33) ? PKIFailureInfo.duplicateCertReq : 268435456;
                }
            }
            i9 = i3 & 1024;
            if (i9 == 0) {
                i11 = i2 | 6;
                i10 = i9;
            } else if ((i2 & 6) == 0) {
                i10 = i9;
                i11 = i2 | (gapComposer.changedInstance(function5) ? 4 : 2);
            } else {
                i10 = i9;
                i11 = i2;
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
                i14 = i11 | 48;
                i13 = i12;
            } else {
                i13 = i12;
                i14 = i11 | (gapComposer.changedInstance(function12) ? 32 : 16);
            }
            int i28 = i14;
            i15 = i3 & 4096;
            if (i15 == 0) {
                i16 = i28 | MLKEMEngine.KyberPolyBytes;
            } else {
                int i29 = i28;
                if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i29 |= gapComposer.changed(z) ? 256 : 128;
                }
                i16 = i29;
            }
            i17 = i3 & PKIFailureInfo.certRevoked;
            if (i17 == 0) {
                i18 = i16 | 3072;
            } else {
                i18 = i16 | (gapComposer.changed(z2) ? 2048 : 1024);
            }
            i19 = i18 | (!gapComposer.changedInstance(function13) ? 16384 : PKIFailureInfo.certRevoked);
            if (gapComposer.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
                cashMapViewModel2 = cashMapViewModel;
                gapComposer.skipToGroupEnd();
                function14 = function1;
                function52 = function5;
                z3 = z;
                selectedLocationCameraReframe3 = selectedLocationCameraReframe2;
                function34 = function33;
                function15 = function12;
                z4 = z2;
            } else {
                Object obj9 = Composer.Companion.Empty;
                if (i27 != 0) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == obj9) {
                        i20 = 0;
                        Object cashMapViewKt$$ExternalSyntheticLambda0 = new CashMapViewKt$$ExternalSyntheticLambda0(0);
                        gapComposer.updateRememberedValue(cashMapViewKt$$ExternalSyntheticLambda0);
                        obj8 = cashMapViewKt$$ExternalSyntheticLambda0;
                    } else {
                        i20 = 0;
                        obj8 = rememberedValue;
                    }
                    int i30 = i7;
                    function16 = (Function1) obj8;
                    i21 = i30;
                } else {
                    i20 = 0;
                    i21 = i7;
                    function16 = function1;
                }
                if (i5 != 0) {
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    Object obj10 = rememberedValue2;
                    if (rememberedValue2 == obj9) {
                        Object cashMapViewKt$$ExternalSyntheticLambda1 = new CashMapViewKt$$ExternalSyntheticLambda1(i20);
                        gapComposer.updateRememberedValue(cashMapViewKt$$ExternalSyntheticLambda1);
                        obj10 = cashMapViewKt$$ExternalSyntheticLambda1;
                    }
                    function23 = (Function2) obj10;
                    i22 = i6;
                } else {
                    i22 = i6;
                    function23 = function22;
                }
                if (i22 != 0) {
                    selectedLocationCameraReframe2 = null;
                }
                Function3 function36 = i8 != 0 ? null : function33;
                Function5 function54 = i10 != 0 ? null : function5;
                Function1 function110 = i13 != 0 ? null : function12;
                boolean z8 = i15 != 0 ? false : z;
                boolean z9 = i17 != 0 ? true : z2;
                Object rememberedValue3 = gapComposer.rememberedValue();
                Object obj11 = rememberedValue3;
                if (rememberedValue3 == obj9) {
                    Object mutableStateOf$default = Updater.mutableStateOf$default(Boolean.TRUE);
                    gapComposer.updateRememberedValue(mutableStateOf$default);
                    obj11 = mutableStateOf$default;
                }
                MutableState mutableState4 = (MutableState) obj11;
                gapComposer.startReplaceGroup(-1417126887);
                ((GoogleMapEngineProvider) gapComposer.consume(MapEngineProviderKt.LocalMapEngineProvider)).getClass();
                gapComposer.startReplaceGroup(40084340);
                Object rememberedValue4 = gapComposer.rememberedValue();
                Object obj12 = rememberedValue4;
                if (rememberedValue4 == obj9) {
                    Object googleMapEngine = new GoogleMapEngine();
                    gapComposer.updateRememberedValue(googleMapEngine);
                    obj12 = googleMapEngine;
                }
                GoogleMapEngine googleMapEngine2 = (GoogleMapEngine) obj12;
                gapComposer.end(false);
                gapComposer.end(false);
                AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) gapComposer.consume(UiScopeKt.LocalContainerAnimatedVisibilityScope);
                Boolean bool = (Boolean) gapComposer.consume(SpacesPagerInteractionManagerKt.LocalSpacesPagerPageVisible);
                boolean booleanValue = bool.booleanValue();
                if (booleanValue) {
                    if (!z8 || animatedVisibilityScope == null) {
                        i23 = i19;
                        i24 = i21;
                    } else {
                        i23 = i19;
                        Object currentState = animatedVisibilityScope.getTransition().transitionState.getCurrentState();
                        i24 = i21;
                        EnterExitState enterExitState = EnterExitState.Visible;
                        if (currentState == enterExitState) {
                        }
                    }
                    z5 = true;
                    changed = gapComposer.changed(booleanValue);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (!changed || rememberedValue5 == obj9) {
                        z6 = false;
                        Object cashMapViewKt$CashMapView$3$1 = new CashMapViewKt$CashMapView$3$1(booleanValue, mutableState4, null, false ? 1 : 0);
                        gapComposer.updateRememberedValue(cashMapViewKt$CashMapView$3$1);
                        obj = cashMapViewKt$CashMapView$3$1;
                    } else {
                        z6 = false;
                        obj = rememberedValue5;
                    }
                    Updater.LaunchedEffect(gapComposer, bool, (Function2) obj);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z6);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier != null) {
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
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (rememberedValue6 == obj9) {
                        finiteAnimationSpec = null;
                        Object mutableStateOf$default2 = Updater.mutableStateOf$default(null);
                        gapComposer.updateRememberedValue(mutableStateOf$default2);
                        obj2 = mutableStateOf$default2;
                    } else {
                        finiteAnimationSpec = null;
                        obj2 = rememberedValue6;
                    }
                    MutableState mutableState5 = (MutableState) obj2;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    if (booleanValue) {
                        gapComposer.startReplaceGroup(957074779);
                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                        Object rememberedValue7 = gapComposer.rememberedValue();
                        Object obj13 = rememberedValue7;
                        if (rememberedValue7 == obj9) {
                            Object cashMapViewKt$$ExternalSyntheticLambda2 = new CashMapViewKt$$ExternalSyntheticLambda2(0, mutableState4);
                            gapComposer.updateRememberedValue(cashMapViewKt$$ExternalSyntheticLambda2);
                            obj13 = cashMapViewKt$$ExternalSyntheticLambda2;
                        }
                        Function0 function0 = (Function0) obj13;
                        boolean z10 = (i23 & 57344) == 16384;
                        Object rememberedValue8 = gapComposer.rememberedValue();
                        if (z10 || rememberedValue8 == obj9) {
                            Object cashMapViewKt$$ExternalSyntheticLambda3 = new CashMapViewKt$$ExternalSyntheticLambda3(function13, mutableState5, 0);
                            gapComposer.updateRememberedValue(cashMapViewKt$$ExternalSyntheticLambda3);
                            obj7 = cashMapViewKt$$ExternalSyntheticLambda3;
                        } else {
                            obj7 = rememberedValue8;
                        }
                        int i31 = ((i24 >> 3) & 112) | 6 | ((i24 << 3) & 896) | 221184 | (i24 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | (i24 & 1879048192);
                        mutableState = mutableState5;
                        obj3 = obj9;
                        companion = companion2;
                        mutableState2 = mutableState4;
                        z7 = z5;
                        finiteAnimationSpec2 = null;
                        r1 = 0;
                        googleMapEngine2.Map(fillMaxSize, cashMapViewModel, list, z7, function3, composableLambdaImpl, function16, function23, selectedLocationCameraReframe2, function36, function0, (Function1) obj7, gapComposer, i31);
                        cashMapViewModel2 = cashMapViewModel;
                        function17 = function16;
                        function24 = function23;
                        selectedLocationCameraReframe4 = selectedLocationCameraReframe2;
                        function35 = function36;
                        gapComposer.end(false);
                    } else {
                        mutableState = mutableState5;
                        finiteAnimationSpec2 = finiteAnimationSpec;
                        obj3 = obj9;
                        companion = companion2;
                        mutableState2 = mutableState4;
                        function17 = function16;
                        function24 = function23;
                        selectedLocationCameraReframe4 = selectedLocationCameraReframe2;
                        function35 = function36;
                        z7 = z5;
                        r1 = 0;
                        cashMapViewModel2 = cashMapViewModel;
                        gapComposer.startReplaceGroup(958857434);
                        gapComposer.end(false);
                    }
                    AnimatedContentKt.AnimatedVisibility((((Boolean) mutableState2.getValue()).booleanValue() || !z7) ? true : r1, (Modifier) null, EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec2, 3), EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec2, 3), (String) null, (Function3) f463lambda$405940144, (Composer) gapComposer, 200064, 18);
                    if (z9) {
                        gapComposer.startReplaceGroup(959227698);
                        ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        Modifier align = BoxScopeInstance.INSTANCE.align(SpacerKt.m298padding3ABfNKs(companion, 16.0f), Alignment.Companion.BottomEnd);
                        boolean z11 = (i23 & 57344) == 16384 ? true : r1;
                        Object rememberedValue9 = gapComposer.rememberedValue();
                        obj4 = obj3;
                        if (z11 || rememberedValue9 == obj4) {
                            function18 = function13;
                            Object cashMapViewKt$$ExternalSyntheticLambda4 = new CashMapViewKt$$ExternalSyntheticLambda4(r1, function18);
                            gapComposer.updateRememberedValue(cashMapViewKt$$ExternalSyntheticLambda4);
                            obj6 = cashMapViewKt$$ExternalSyntheticLambda4;
                        } else {
                            function18 = function13;
                            obj6 = rememberedValue9;
                        }
                        ArcadeMapIconButton(MLKEMEngine.KyberPolyBytes, 8, gapComposer, Expect_jvmKt.rememberComposableLambda(-715876116, new CashMapViewKt$$ExternalSyntheticLambda5(cashMapViewModel2, r1), gapComposer), align, (Function0) obj6, false);
                        gapComposer.end(r1);
                    } else {
                        function18 = function13;
                        obj4 = obj3;
                        gapComposer.startReplaceGroup(959819674);
                        gapComposer.end(r1);
                    }
                    List list2 = (List) mutableState.getValue();
                    if (list2 == null) {
                        gapComposer.startReplaceGroup(959878232);
                        gapComposer.end(r1);
                        function53 = function54;
                        function19 = function110;
                    } else {
                        gapComposer.startReplaceGroup(959878233);
                        Object rememberedValue10 = gapComposer.rememberedValue();
                        if (rememberedValue10 == obj4) {
                            mutableState3 = mutableState;
                            Object cashMapViewKt$$ExternalSyntheticLambda22 = new CashMapViewKt$$ExternalSyntheticLambda2(10, mutableState3);
                            gapComposer.updateRememberedValue(cashMapViewKt$$ExternalSyntheticLambda22);
                            obj5 = cashMapViewKt$$ExternalSyntheticLambda22;
                        } else {
                            mutableState3 = mutableState;
                            obj5 = rememberedValue10;
                        }
                        Function5 function55 = function54;
                        Function1 function111 = function110;
                        SwipeToDismissKt$$ExternalSyntheticLambda2 swipeToDismissKt$$ExternalSyntheticLambda2 = new SwipeToDismissKt$$ExternalSyntheticLambda2(10, function55, list2, function111, mutableState3, function18);
                        function53 = function55;
                        function19 = function111;
                        SheetKt.Sheet((Function0) obj5, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1541111682, swipeToDismissKt$$ExternalSyntheticLambda2, gapComposer), gapComposer, 100663302, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        gapComposer.end(r1);
                    }
                    gapComposer.end(true);
                    function52 = function53;
                    function14 = function17;
                    function22 = function24;
                    z4 = z9;
                    function15 = function19;
                    z3 = z8;
                    selectedLocationCameraReframe3 = selectedLocationCameraReframe4;
                    function34 = function35;
                } else {
                    i23 = i19;
                    i24 = i21;
                }
                z5 = false;
                changed = gapComposer.changed(booleanValue);
                Object rememberedValue52 = gapComposer.rememberedValue();
                if (changed) {
                }
                z6 = false;
                Object cashMapViewKt$CashMapView$3$12 = new CashMapViewKt$CashMapView$3$1(booleanValue, mutableState4, null, false ? 1 : 0);
                gapComposer.updateRememberedValue(cashMapViewKt$CashMapView$3$12);
                obj = cashMapViewKt$CashMapView$3$12;
                Updater.LaunchedEffect(gapComposer, bool, (Function2) obj);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z6);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier != null) {
                }
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                final CashMapViewModel cashMapViewModel3 = cashMapViewModel2;
                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj14, Object obj15) {
                        ((Integer) obj15).getClass();
                        int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                        int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                        CashMapViewKt.CashMapView(Modifier.this, list, cashMapViewModel3, function3, composableLambdaImpl, function14, function22, selectedLocationCameraReframe3, function34, function52, function15, z3, z4, function13, (Composer) obj14, updateChangedFlags, updateChangedFlags2, i3);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i3 & 1024;
        if (i9 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        int i282 = i14;
        i15 = i3 & 4096;
        if (i15 == 0) {
        }
        i17 = i3 & PKIFailureInfo.certRevoked;
        if (i17 == 0) {
        }
        i19 = i18 | (!gapComposer.changedInstance(function13) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void MarkerLocationSelectorSheetContent(Modifier modifier, List list, Function1 function1, Function1 function12, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer;
        function1.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1449728414);
        int i2 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(list) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128) | (gapComposer2.changedInstance(function12) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(modifier, 1.0f), Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape), ImageKt.rememberScrollState(gapComposer2), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
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
            String stringResource = Room.stringResource(gapComposer2, R.string.marker_location_selector_sheet_title);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer2).getClass();
            Strings.getSizes(gapComposer2).getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            GapComposer gapComposer3 = gapComposer2;
            Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3824, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, 2), Strings.getTypography(gapComposer2).pageTitle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            gapComposer3.startReplaceGroup(-752101121);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MarkerLocation markerLocation = (MarkerLocation) it.next();
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1876907032, new CashMapViewKt$$ExternalSyntheticLambda5(markerLocation, 15), gapComposer3);
                boolean changedInstance = gapComposer3.changedInstance(markerLocation) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
                Object rememberedValue = gapComposer3.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    l2$$ExternalSyntheticLambda7 l2__externalsyntheticlambda7 = new l2$$ExternalSyntheticLambda7(markerLocation, function12, function1, function0, 29);
                    gapComposer3.updateRememberedValue(l2__externalsyntheticlambda7);
                    rememberedValue = l2__externalsyntheticlambda7;
                }
                GapComposer gapComposer4 = gapComposer3;
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue, false, false, null, null, 0L, null, null, gapComposer4, 6, 2042);
                gapComposer3 = gapComposer4;
            }
            gapComposer3.end(false);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            GapComposer gapComposer5 = gapComposer3;
            coil3.size.SizeKt.ButtonCta(function0, SpacerKt.m298padding3ABfNKs(fillMaxWidth, 16.0f), ButtonProminence.STANDARD, false, false, null, lambda$741206307, gapComposer5, 1573254, 56);
            gapComposer = gapComposer5;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(modifier, list, function1, function12, function0, i, 0);
        }
    }
}
