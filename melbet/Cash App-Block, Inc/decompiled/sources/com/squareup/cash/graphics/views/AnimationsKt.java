package com.squareup.cash.graphics.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.TextureView;
import android.view.ViewGroup;
import androidx.collection.internal.Lock;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.fillr.e;
import com.google.android.renderscript.ToolkitKt;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.io.Files;
import com.google.common.primitives.UnsignedBytes;
import com.squareup.cash.R;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.backend.engine.EntityStateImpl;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.recipients.data.UtilsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SafeFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class AnimationsKt {
    public static final float[] X_AXIS = {1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
    public static final float[] Y_AXIS = {RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE};

    public static final void CashEngineTextureView(Modifier modifier, String str, e eVar, Function1 function1, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-242076283);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer2.changed(eVar) : gapComposer2.changedInstance(eVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i3 = i2;
        int i4 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj = rememberedValue;
            if (rememberedValue == neverEqualPolicy) {
                TextureView textureView = new TextureView(context);
                textureView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                textureView.setOpaque(false);
                gapComposer2.updateRememberedValue(textureView);
                obj = textureView;
            }
            TextureView textureView2 = (TextureView) obj;
            boolean changedInstance = gapComposer2.changedInstance(textureView2);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GpsConfigQueries$$ExternalSyntheticLambda2(textureView2, 12);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView((Function1) rememberedValue2, modifier, null, gapComposer2, (i3 << 3) & 112, 4);
            gapComposer = gapComposer2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
            boolean z = (i3 & 7168) == 2048;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(i4, function1);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            ToolkitKt.SingleThreadMoleculeEffect(str, (Function1) rememberedValue4, Expect_jvmKt.rememberComposableLambda(1640073517, new MoneyUiFactory$$ExternalSyntheticLambda1(eVar, textureView2, coroutineScope, composableLambdaImpl, 10), gapComposer), gapComposer, ((i3 >> 3) & 14) | MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(modifier, str, eVar, function1, composableLambdaImpl, i, 27);
        }
    }

    public static final void GlitterBackground(int i, int i2, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        boolean z;
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1578843832);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier4 = i4 != 0 ? companion : modifier2;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ColorKt.m694toArgb8_81llA(ColorResources_androidKt.colorResource(gapComposer, R.color.glitter_start)), ColorKt.m694toArgb8_81llA(ColorResources_androidKt.colorResource(gapComposer, R.color.glitter_middle)), ColorKt.m694toArgb8_81llA(ColorResources_androidKt.colorResource(gapComposer, R.color.glitter_end))});
            Modifier background$default = ImageKt.background$default(SizeKt.fillMaxSize(modifier4, 1.0f), Lock.m133verticalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(ColorResources_androidKt.colorResource(gapComposer, R.color.glitter_start)), new Color(ColorResources_androidKt.colorResource(gapComposer, R.color.glitter_middle)), new Color(ColorResources_androidKt.colorResource(gapComposer, R.color.glitter_end))})), null, 6);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            Modifier modifier5 = modifier4;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, background$default);
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
            if (((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                modifier3 = modifier5;
                z = true;
                gapComposer.startReplaceGroup(-2111280768);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2112443578);
                MutableState produceLightSource = SlidingWindowKt.produceLightSource(gapComposer);
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                Bitmap bitmap$default = UtilsKt.toBitmap$default(gradientDrawable, 4);
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(valueOf, gapComposer);
                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Float.valueOf(0.5f), gapComposer);
                MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(Float.valueOf(0.2f), gapComposer);
                MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(valueOf, gapComposer);
                MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(Float.valueOf(3.0f), gapComposer);
                MutableState rememberUpdatedState6 = Updater.rememberUpdatedState(valueOf, gapComposer);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(produceLightSource, 27));
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState rememberUpdatedState7 = Updater.rememberUpdatedState(CollectionsKt__CollectionsKt.listOf((Object[]) new LightStateImpl[]{rememberLightState((State) rememberedValue, gapComposer, 6), rememberLightState(Updater.rememberUpdatedState(new Vector4(-0.5f, -0.5f, 0.5f, RecyclerView.DECELERATION_RATE), gapComposer), gapComposer, 0), rememberLightState(Updater.rememberUpdatedState(new Vector4(0.5f, -0.5f, 0.5f, RecyclerView.DECELERATION_RATE), gapComposer), gapComposer, 0), rememberLightState(Updater.rememberUpdatedState(new Vector4(0.5f, 0.5f, 0.5f, RecyclerView.DECELERATION_RATE), gapComposer), gapComposer, 0), rememberLightState(Updater.rememberUpdatedState(new Vector4(-0.5f, 0.5f, 0.5f, RecyclerView.DECELERATION_RATE), gapComposer), gapComposer, 0)}), gapComposer);
                z = true;
                modifier3 = modifier5;
                UnsignedBytes.GlitterEffect(fillMaxSize, bitmap$default, rememberUpdatedState, rememberUpdatedState2, rememberUpdatedState3, rememberUpdatedState4, rememberUpdatedState5, rememberUpdatedState6, rememberUpdatedState7, gapComposer, 6);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SnackbarHostKt$$ExternalSyntheticLambda3(modifier3, i, i2, 7);
        }
    }

    /* renamed from: flingTo-38CYSgM, reason: not valid java name */
    public static final SafeFlow m3563flingTo38CYSgM(Quat quat, Quat quat2, long j, SpringSpec springSpec, float f) {
        quat.getClass();
        quat2.getClass();
        return new SafeFlow(new AnimationsKt$flingTo$1(quat, quat2, j, f, springSpec, null));
    }

    /* renamed from: flingTo-38CYSgM$default, reason: not valid java name */
    public static SafeFlow m3564flingTo38CYSgM$default(Quat quat, Quat quat2, long j, SpringSpec springSpec, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return m3563flingTo38CYSgM(quat, quat2, j, springSpec, 60.0f);
    }

    public static final LightStateImpl rememberLightState(State state, Composer composer, int i) {
        EntityStateImpl rememberEntityState = AbstractHashFunction.rememberEntityState(null, state, null, composer, 5);
        Vector4 vector4 = new Vector4(RecyclerView.DECELERATION_RATE, -1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(Float.valueOf(RecyclerView.DECELERATION_RATE), composer);
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Float.valueOf(7500.0f), composer);
        Float valueOf = Float.valueOf(1.0f);
        return Files.rememberLightState(rememberEntityState, vector4, rememberUpdatedState, rememberUpdatedState2, Updater.rememberUpdatedState(CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{valueOf, valueOf, valueOf}), composer), composer);
    }
}
