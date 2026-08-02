package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.collection.internal.Lock;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.io.Files;
import com.google.common.primitives.UnsignedBytes;
import com.squareup.cash.R;
import com.squareup.cash.blockers.views.PasscodeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.graphics.backend.engine.EntityStateImpl;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.protos.franklin.cards.PaymentMethod;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class GlitterCardEffectKt {
    public static final Rect CARD_BOUNDS;
    public static final CardModelView.CardBack DEFAULT_CARD_BACK;

    static {
        Rect rect = CardsKt.CARD_RECT;
        CARD_BOUNDS = new Rect(0, 0, 1024, (int) ((1024.0f / rect.width()) * rect.height()));
        DEFAULT_CARD_BACK = new CardModelView.CardBack("Reese Hills", "0123 4567 8901 2345", "123", "10/27", null, PaymentMethod.PREPAID, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GlitterCardEffect(Modifier modifier, CoroutineContext coroutineContext, boolean z, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        CoroutineContext coroutineContext2;
        RecomposeScopeImpl endRestartGroup;
        CoroutineContext coroutineContext3;
        int i4;
        boolean z3;
        Object rememberedValue;
        Object obj;
        MutableState mutableState;
        boolean changedInstance;
        Object rememberedValue2;
        CoroutineContext coroutineContext4;
        boolean z4;
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(921406407);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 16;
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 = i3 | 400;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i5 |= gapComposer.changed(z2) ? 256 : 128;
            if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) == 146)) {
                gapComposer.skipToGroupEnd();
                coroutineContext2 = coroutineContext;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    coroutineContext3 = DefaultIoScheduler.INSTANCE;
                    i4 = i5 & (-113);
                    if (i6 != 0) {
                        z3 = false;
                        gapComposer.endDefaults();
                        Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                        MutableState produceLightSource = SlidingWindowKt.produceLightSource(gapComposer);
                        rememberedValue = gapComposer.rememberedValue();
                        obj = Composer.Companion.Empty;
                        if (rememberedValue == obj) {
                            rememberedValue = Updater.mutableStateOf$default(null);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        mutableState = (MutableState) rememberedValue;
                        Unit unit = Unit.INSTANCE;
                        changedInstance = ((i4 & 896) != 256) | gapComposer.changedInstance(coroutineContext3) | gapComposer.changedInstance(context);
                        rememberedValue2 = gapComposer.rememberedValue();
                        if (!changedInstance || rememberedValue2 == obj) {
                            coroutineContext4 = coroutineContext3;
                            Object realPayDataLoader$fetchData$1 = new RealPayDataLoader$fetchData$1(mutableState, coroutineContext4, z3, context, (Continuation) null);
                            gapComposer.updateRememberedValue(realPayDataLoader$fetchData$1);
                            rememberedValue2 = realPayDataLoader$fetchData$1;
                        } else {
                            coroutineContext4 = coroutineContext3;
                        }
                        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
                        Modifier clip = ClipKt.clip(ImageKt.background$default(SizeKt.fillMaxSize(modifier, 1.0f), Lock.m131horizontalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(ColorResources_androidKt.colorResource(gapComposer, R.color.card_glitter_start)), new Color(ColorResources_androidKt.colorResource(gapComposer, R.color.card_glitter_middle)), new Color(ColorResources_androidKt.colorResource(gapComposer, R.color.card_glitter_end))}), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), null, 6), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.card_design_shadow_radius)));
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clip);
                        ComposeUiNode.Companion.getClass();
                        Function0 function0 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer.applier != null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(function0);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        Bitmap bitmap = (Bitmap) mutableState.getValue();
                        if (bitmap == null) {
                            gapComposer.startReplaceGroup(1734239950);
                            gapComposer.end(false);
                            z4 = true;
                        } else {
                            gapComposer.startReplaceGroup(1734239951);
                            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                            MutableState rememberUpdatedState = Updater.rememberUpdatedState(valueOf, gapComposer);
                            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Float.valueOf(0.5f), gapComposer);
                            MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(Float.valueOf(0.2f), gapComposer);
                            MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(valueOf, gapComposer);
                            MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(Float.valueOf(3.0f), gapComposer);
                            MutableState rememberUpdatedState6 = Updater.rememberUpdatedState(valueOf, gapComposer);
                            Object rememberedValue3 = gapComposer.rememberedValue();
                            if (rememberedValue3 == obj) {
                                rememberedValue3 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(produceLightSource, 16));
                                gapComposer.updateRememberedValue(rememberedValue3);
                            }
                            z4 = true;
                            UnsignedBytes.GlitterEffect(fillMaxSize, bitmap, rememberUpdatedState, rememberUpdatedState2, rememberUpdatedState3, rememberUpdatedState4, rememberUpdatedState5, rememberUpdatedState6, Updater.rememberUpdatedState(CollectionsKt__CollectionsKt.listOf((Object[]) new LightStateImpl[]{rememberLightState((State) rememberedValue3, gapComposer, 6), rememberLightState(Updater.rememberUpdatedState(new Vector4(-0.5f, -0.5f, 0.5f, RecyclerView.DECELERATION_RATE), gapComposer), gapComposer, 0), rememberLightState(Updater.rememberUpdatedState(new Vector4(0.5f, -0.5f, 0.5f, RecyclerView.DECELERATION_RATE), gapComposer), gapComposer, 0), rememberLightState(Updater.rememberUpdatedState(new Vector4(0.5f, 0.5f, 0.5f, RecyclerView.DECELERATION_RATE), gapComposer), gapComposer, 0), rememberLightState(Updater.rememberUpdatedState(new Vector4(-0.5f, 0.5f, 0.5f, RecyclerView.DECELERATION_RATE), gapComposer), gapComposer, 0)}), gapComposer), gapComposer, 6);
                            gapComposer.end(false);
                        }
                        gapComposer.end(z4);
                        coroutineContext2 = coroutineContext4;
                        z2 = z3;
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    i4 = i5 & (-113);
                    coroutineContext3 = coroutineContext;
                }
                z3 = z2;
                gapComposer.endDefaults();
                Context context2 = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                MutableState produceLightSource2 = SlidingWindowKt.produceLightSource(gapComposer);
                rememberedValue = gapComposer.rememberedValue();
                obj = Composer.Companion.Empty;
                if (rememberedValue == obj) {
                }
                mutableState = (MutableState) rememberedValue;
                Unit unit2 = Unit.INSTANCE;
                changedInstance = ((i4 & 896) != 256) | gapComposer.changedInstance(coroutineContext3) | gapComposer.changedInstance(context2);
                rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance) {
                }
                coroutineContext4 = coroutineContext3;
                Object realPayDataLoader$fetchData$12 = new RealPayDataLoader$fetchData$1(mutableState, coroutineContext4, z3, context2, (Continuation) null);
                gapComposer.updateRememberedValue(realPayDataLoader$fetchData$12);
                rememberedValue2 = realPayDataLoader$fetchData$12;
                Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue2);
                Modifier clip2 = ClipKt.clip(ImageKt.background$default(SizeKt.fillMaxSize(modifier, 1.0f), Lock.m131horizontalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(ColorResources_androidKt.colorResource(gapComposer, R.color.card_glitter_start)), new Color(ColorResources_androidKt.colorResource(gapComposer, R.color.card_glitter_middle)), new Color(ColorResources_androidKt.colorResource(gapComposer, R.color.card_glitter_end))}), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), null, 6), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.card_design_shadow_radius)));
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, clip2);
                ComposeUiNode.Companion.getClass();
                Function0 function02 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier != null) {
                }
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new PasscodeKt$$ExternalSyntheticLambda2(modifier, (Object) coroutineContext2, z2, i, i2, 2);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
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
