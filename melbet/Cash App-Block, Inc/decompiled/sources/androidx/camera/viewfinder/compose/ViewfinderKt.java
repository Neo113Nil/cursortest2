package androidx.camera.viewfinder.compose;

import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ImplementationMode;
import androidx.camera.viewfinder.core.TransformationInfo;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.ViewfinderSurfaceRequest;
import androidx.camera.viewfinder.core.impl.TransformationsKt;
import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxMeasurePolicy;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bugsnag.android.TombstoneEventEnhancer$invoke$2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ViewfinderKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HeroHeader(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function2 function2, TextStyle textStyle, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function22;
        TextStyle textStyle2;
        RecomposeScopeImpl endRestartGroup;
        int i5;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1375061232);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                function22 = function2;
                i3 |= gapComposer.changedInstance(function22) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        textStyle2 = textStyle;
                        if (gapComposer.changed(textStyle2)) {
                            i5 = 2048;
                            i3 |= i5;
                        }
                    } else {
                        textStyle2 = textStyle;
                    }
                    i5 = 1024;
                    i3 |= i5;
                } else {
                    textStyle2 = textStyle;
                }
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
                    gapComposer.startDefaults();
                    int i7 = i & 1;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (i7 == 0 || gapComposer.getDefaultsInvalid()) {
                        if (i6 != 0) {
                            modifier2 = companion;
                        }
                        if (i4 != 0) {
                            function22 = null;
                        }
                        if ((i2 & 8) != 0) {
                            textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).headlineLarge;
                        }
                    } else {
                        gapComposer.skipToGroupEnd();
                    }
                    gapComposer.endDefaults();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier2, ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                    ProvidedValue defaultProvidedValue$runtime = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(textStyle2);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                    Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(-1824726534, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 3), gapComposer), gapComposer, 56);
                    if (function22 != null) {
                        re$$ExternalSyntheticOutline0.m(gapComposer, 444640673, companion, 16.0f, gapComposer);
                        Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).bodyMedium), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(-2050856897, new ToastKt$$ExternalSyntheticLambda11(9, function22), gapComposer), gapComposer, 56);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(444893416);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                Modifier modifier3 = modifier2;
                Function2 function23 = function22;
                TextStyle textStyle3 = textStyle2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(composableLambdaImpl, modifier3, function23, textStyle3, i, i2, 10);
                    return;
                }
                return;
            }
            function22 = function2;
            if ((i & 3072) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            }
            Modifier modifier32 = modifier2;
            Function2 function232 = function22;
            TextStyle textStyle32 = textStyle2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((i & 3072) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
        }
        Modifier modifier322 = modifier2;
        Function2 function2322 = function22;
        TextStyle textStyle322 = textStyle2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void TransformedSurface(int i, int i2, TransformationInfo transformationInfo, ImplementationMode implementationMode, Modifier modifier, Function1 function1, Composer composer, int i3) {
        int i4;
        int i5;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1937073252);
        if ((i3 & 6) == 0) {
            i4 = (gapComposer.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= gapComposer.changed(i2) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changedInstance(transformationInfo) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= gapComposer.changed(implementationMode.ordinal()) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i3) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((74899 & i4) == 74898 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            int ordinal = implementationMode.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-168337169);
                EmptyChatKt.m3629ViewfinderExternalSurfaceJQLjw8(modifier, false, function1, gapComposer, ((i4 >> 3) & 57344) | ((i4 >> 12) & 14));
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1806546617, false);
                }
                gapComposer.startReplaceGroup(-168184029);
                gapComposer.startMovableGroup(-1806539482, gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration));
                int rotation = ((View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView)).getDisplay().getRotation();
                if (rotation == 0) {
                    i5 = 0;
                } else if (rotation == 1) {
                    i5 = 90;
                } else if (rotation == 2) {
                    i5 = EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
                } else {
                    if (rotation != 3) {
                        a$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(rotation, "Unsupported surface rotation: "));
                        return;
                    }
                    i5 = EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
                }
                gapComposer.end(false);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    Matrix matrix = new Matrix(Matrix.m699constructorimpl$default());
                    gapComposer.updateRememberedValue(matrix);
                    rememberedValue = matrix;
                }
                float[] fArr = ((Matrix) rememberedValue).values;
                RectF rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, i, i2);
                android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                RectF rectF2 = TransformationsKt.NORMALIZED_RECT;
                Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
                matrix2.setRectToRect(rectF, rectF2, scaleToFit);
                matrix2.postRotate(-i5);
                android.graphics.Matrix matrix3 = new android.graphics.Matrix();
                matrix3.setRectToRect(rectF2, rectF, scaleToFit);
                matrix2.postConcat(matrix3);
                ColorKt.m692setFromtUYjHk(matrix2, fArr);
                zzacg.m2011ViewfinderEmbeddedExternalSurfacesv6N_fY(modifier, false, fArr, function1, gapComposer, ((i4 >> 3) & 57344) | ((i4 >> 12) & 14));
                gapComposer.end(false);
            }
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ViewfinderKt$$ExternalSyntheticLambda6(i, i2, transformationInfo, implementationMode, modifier, function1, i3);
        }
    }

    public static final void Viewfinder(ViewfinderSurfaceRequest viewfinderSurfaceRequest, Modifier modifier, final TransformationInfo transformationInfo, Function1 function1, Composer composer, int i) {
        int i2;
        BoxMeasurePolicy boxMeasurePolicy;
        final int i3;
        final int i4;
        Object obj = Alignment.Companion.Center;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2052669900);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(viewfinderSurfaceRequest) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(transformationInfo) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? gapComposer.changed((Object) null) : gapComposer.changedInstance(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(obj) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(ContentScale.Companion.Crop) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i5 = i2;
        if ((599187 & i5) == 599186 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Modifier fillMaxSize = SizeKt.fillMaxSize(ClipKt.clipToBounds(modifier), 1.0f);
            gapComposer.startReplaceableGroup(733328855);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MutableScatterMap mutableScatterMap = BoxKt.Cache1;
            boolean equals = biasAlignment.equals(biasAlignment);
            Object obj2 = Composer.Companion.Empty;
            if (equals) {
                gapComposer.startReplaceGroup(244332343);
                gapComposer.end(false);
                boxMeasurePolicy = BoxKt.DefaultBoxMeasurePolicy;
            } else {
                gapComposer.startReplaceGroup(244380021);
                boolean changed = gapComposer.changed(biasAlignment) | gapComposer.changed(false);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == obj2) {
                    rememberedValue = new BoxMeasurePolicy(biasAlignment, false);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                boxMeasurePolicy = (BoxMeasurePolicy) rememberedValue;
                gapComposer.end(false);
            }
            gapComposer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new TombstoneEventEnhancer$invoke$2(fillMaxSize, 3), true, -511438721);
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, boxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
            }
            composableLambdaImpl.invoke(new SkippableUpdater(gapComposer), (Object) gapComposer, (Object) 0);
            gapComposer.startReplaceableGroup(2058660585);
            gapComposer.startMovableGroup(-782850610, viewfinderSurfaceRequest);
            final int layoutDirection = ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).getLayoutDirection();
            int i6 = viewfinderSurfaceRequest.width;
            ImplementationMode implementationMode = viewfinderSurfaceRequest.implementationMode;
            int i7 = viewfinderSurfaceRequest.height;
            boolean changed2 = gapComposer.changed(implementationMode == null ? -1 : implementationMode.ordinal());
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj2) {
                if (implementationMode == null) {
                    implementationMode = ViewfinderDefaults.getImplementationMode();
                }
                gapComposer.updateRememberedValue(implementationMode);
                rememberedValue2 = implementationMode;
            }
            ImplementationMode implementationMode2 = (ImplementationMode) rememberedValue2;
            boolean changed3 = gapComposer.changed(implementationMode2.ordinal());
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == obj2) {
                rememberedValue3 = Recorder$$ExternalSyntheticOutline1.m(implementationMode2 == ImplementationMode.EMBEDDED, gapComposer);
            }
            final MutableState mutableState = (MutableState) rememberedValue3;
            boolean changed4 = gapComposer.changed(i6) | gapComposer.changed(i7) | gapComposer.changed(mutableState) | gapComposer.changedInstance(transformationInfo) | gapComposer.changed(layoutDirection) | ((458752 & i5) == 131072) | ((57344 & i5) == 16384) | ((i5 & 7168) == 2048 || ((i5 & 4096) != 0 && gapComposer.changedInstance(null)));
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue4 == obj2) {
                i3 = i6;
                i4 = i7;
                Object obj3 = new Function3() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        MeasureScope measureScope = (MeasureScope) obj4;
                        Measurable measurable = (Measurable) obj5;
                        final Constraints constraints = (Constraints) obj6;
                        final int i8 = i3;
                        boolean z = i8 >= 0;
                        final int i9 = i4;
                        if (!((i9 >= 0) & z)) {
                            InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
                        }
                        final Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(ConstraintsKt.createConstraints(i8, i8, i9, i9));
                        int m1025getMaxWidthimpl = (mo833measureBRTryo0.width - Constraints.m1025getMaxWidthimpl(constraints.value)) / 2;
                        final int i10 = m1025getMaxWidthimpl > 0 ? m1025getMaxWidthimpl : 0;
                        int m1024getMaxHeightimpl = (mo833measureBRTryo0.height - Constraints.m1024getMaxHeightimpl(constraints.value)) / 2;
                        final int i11 = m1024getMaxHeightimpl > 0 ? m1024getMaxHeightimpl : 0;
                        int i12 = mo833measureBRTryo0.width;
                        int i13 = mo833measureBRTryo0.height;
                        final TransformationInfo transformationInfo2 = transformationInfo;
                        final int i14 = layoutDirection;
                        final MutableState mutableState2 = mutableState;
                        return MeasureScope.layout$default(measureScope, i12, i13, new Function1() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                Placeable.PlacementScope.placeWithLayer$default((Placeable.PlacementScope) obj7, Placeable.this, i10, i11, new ViewfinderKt$$ExternalSyntheticLambda8(constraints, i8, i9, transformationInfo2, i14, mutableState2, 0), 4);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                };
                gapComposer.updateRememberedValue(obj3);
                rememberedValue4 = obj3;
            } else {
                i3 = i6;
                i4 = i7;
            }
            Modifier layout = ValueInsets.layout(Modifier.Companion.$$INSTANCE, (Function3) rememberedValue4);
            boolean changedInstance = gapComposer.changedInstance(viewfinderSurfaceRequest) | ((3670016 & i5) == 1048576) | gapComposer.changed(mutableState);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue5 == obj2) {
                rememberedValue5 = new MenuKt$$ExternalSyntheticLambda0(viewfinderSurfaceRequest, function1, mutableState, 3);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            TransformedSurface(i3, i4, transformationInfo, implementationMode2, layout, (Function1) rememberedValue5, gapComposer, i5 & 896);
            gapComposer.end(false);
            gapComposer.end(false);
            gapComposer.end(true);
            gapComposer.end(false);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(viewfinderSurfaceRequest, i, modifier, transformationInfo, function1, 1);
        }
    }

    public static final void HeroHeader(String str, Modifier modifier, String str2, TextStyle textStyle, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        TextStyle textStyle2;
        int i4;
        TextStyle textStyle3;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(589200508);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        int i7 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            ComposableLambdaImpl composableLambdaImpl = null;
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
                i4 = i3 & (-7169);
                textStyle3 = textStyle;
            } else {
                if (i5 != 0) {
                    modifier = Modifier.Companion.$$INSTANCE;
                }
                if (i6 != 0) {
                    str2 = null;
                }
                i4 = i3 & (-7169);
                textStyle3 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).headlineLarge;
            }
            gapComposer.endDefaults();
            if (str2 == null) {
                gapComposer.startReplaceGroup(-658752118);
            } else {
                gapComposer.startReplaceGroup(-658752117);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1901189384, new ToastKt$$ExternalSyntheticLambda1(str2, 29), gapComposer);
            }
            gapComposer.end(false);
            Modifier modifier3 = modifier;
            HeroHeader(Expect_jvmKt.rememberComposableLambda(1613709896, new TransfersViewKt$$ExternalSyntheticLambda5(str, i7), gapComposer), modifier3, composableLambdaImpl, textStyle3, gapComposer, (i4 & 112) | 6, 0);
            modifier2 = modifier3;
            textStyle2 = textStyle3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            textStyle2 = textStyle;
        }
        String str3 = str2;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(str, modifier2, str3, textStyle2, i, i2, 9);
        }
    }
}
