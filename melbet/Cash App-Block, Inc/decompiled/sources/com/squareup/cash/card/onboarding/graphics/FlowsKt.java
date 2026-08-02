package com.squareup.cash.card.onboarding.graphics;

import android.content.Context;
import android.opengl.Matrix;
import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.molecule.PlatformKt;
import com.fillr.e;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.io.Files;
import com.google.common.primitives.Longs;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.anim.CashAnimPlayer;
import com.squareup.cash.graphics.swampgl.anim.TransformFrame;
import com.squareup.cash.graphics.swampgl.components.AABB;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.graphics.swampgl.components.Transform;
import com.squareup.cash.graphics.views.AnimationsKt;
import com.squareup.cash.graphics.views.effect.GLSurfaceConfig$TextureView;
import com.squareup.cash.graphics.views.effect.LightSource;
import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda26;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda17;
import com.squareup.cash.wallet.views.InteractiveCardState$animateLock$2;
import com.squareup.util.cash.Countries;
import dagger.internal.Preconditions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.RenderScriptBlurEffect$updateSurface$2$2$1;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.random.Random;
import kotlin.ranges.ClosedFloatRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class FlowsKt {
    public static final float[] scratchVp = new float[16];
    public static final float[] scratchMvp = new float[16];
    public static final float[] scratchCorner = new float[4];
    public static final float[] scratchClip = new float[4];
    public static final float[] scratchHitPoints = new float[16];
    public static final int[] scratchHullIndices = new int[17];
    public static final int[] scratchSortIndices = new int[8];

    public static final void CardGridNux(final Modifier modifier, ArrayList arrayList, final Engine engine, final CardGridNuxScene cardGridNuxScene, final Function0 function0, Composer composer, int i) {
        engine.getClass();
        cardGridNuxScene.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1743247546);
        int i2 = i | (gapComposer.changedInstance(arrayList) ? 32 : 16) | (gapComposer.changedInstance(engine) ? 256 : 128) | (gapComposer.changedInstance(cardGridNuxScene) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (arrayList.size() != 6) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(arrayList.size(), "CardGridNux requires exactly 6 cards, got "));
                return;
            }
            Object obj = ((Motion) gapComposer.consume(MotionKt.LocalMotion)).springs.text;
            final SpringSpec springSpec = new SpringSpec(1.0f, 50.0f, Float.valueOf(1.0E-4f));
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Long.valueOf(System.currentTimeMillis());
                gapComposer.updateRememberedValue(rememberedValue);
            }
            final long longValue = ((Number) rememberedValue).longValue();
            final MutableState collectAsState = Updater.collectAsState(cardGridNuxScene.ready, null, gapComposer, 1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            final Animatable animatable = (Animatable) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue4;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new CardWobbleState();
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            final CardWobbleState cardWobbleState = (CardWobbleState) rememberedValue5;
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(771619945, new Function3() { // from class: com.squareup.cash.card.onboarding.graphics.CardGridNuxKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    UiScope uiScope = (UiScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    uiScope.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(uiScope) ? 4 : 2;
                    }
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        Transition transition = uiScope.$$delegate_0.getTransition();
                        State state = collectAsState;
                        boolean booleanValue = ((Boolean) state.getValue()).booleanValue();
                        Animatable animatable2 = Animatable.this;
                        SpringSpec springSpec2 = springSpec;
                        MutableState mutableState3 = mutableState;
                        MutableState mutableState4 = mutableState2;
                        Object obj5 = Composer.Companion.Empty;
                        if (booleanValue && ((Boolean) mutableState3.getValue()).booleanValue()) {
                            gapComposer2.startReplaceGroup(664984394);
                            Unit unit = Unit.INSTANCE;
                            boolean changed = gapComposer2.changed(transition) | gapComposer2.changedInstance(animatable2) | gapComposer2.changed(springSpec2);
                            Object rememberedValue6 = gapComposer2.rememberedValue();
                            if (changed || rememberedValue6 == obj5) {
                                rememberedValue6 = new CardGridNuxKt$CardGridNux$6$1$1(longValue, transition, animatable2, springSpec2, mutableState4, null);
                                gapComposer2.updateRememberedValue(rememberedValue6);
                            }
                            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue6);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(665429337);
                            gapComposer2.end(false);
                        }
                        Object value = transition.targetState$delegate.getValue();
                        EnterExitState enterExitState = EnterExitState.PostExit;
                        CardGridNuxScene cardGridNuxScene2 = cardGridNuxScene;
                        if (value == enterExitState) {
                            gapComposer2.startReplaceGroup(665603743);
                            Unit unit2 = Unit.INSTANCE;
                            boolean changedInstance = gapComposer2.changedInstance(cardGridNuxScene2) | gapComposer2.changedInstance(animatable2) | gapComposer2.changed(springSpec2);
                            Object rememberedValue7 = gapComposer2.rememberedValue();
                            if (changedInstance || rememberedValue7 == obj5) {
                                rememberedValue7 = new VerifyCheckDepositPresenter$models$3$1((Object) cardGridNuxScene2, (Object) animatable2, (Object) springSpec2, mutableState4, (Continuation) null, 3);
                                gapComposer2.updateRememberedValue(rememberedValue7);
                            }
                            Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue7);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(665843993);
                            gapComposer2.end(false);
                        }
                        Continuation continuation = null;
                        if (((Boolean) mutableState4.getValue()).booleanValue()) {
                            gapComposer2.startReplaceGroup(665941674);
                            Unit unit3 = Unit.INSTANCE;
                            boolean changedInstance2 = gapComposer2.changedInstance(cardGridNuxScene2);
                            Object rememberedValue8 = gapComposer2.rememberedValue();
                            if (changedInstance2 || rememberedValue8 == obj5) {
                                rememberedValue8 = new CardStudioPresenter$models$1$1(cardGridNuxScene2, cardWobbleState, (Continuation) null);
                                gapComposer2.updateRememberedValue(rememberedValue8);
                            }
                            Updater.LaunchedEffect(gapComposer2, unit3, (Function2) rememberedValue8);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(666232857);
                            gapComposer2.end(false);
                        }
                        if (((Boolean) state.getValue()).booleanValue() && ((Boolean) mutableState3.getValue()).booleanValue()) {
                            gapComposer2.startReplaceGroup(666314356);
                            Unit unit4 = Unit.INSTANCE;
                            boolean changedInstance3 = gapComposer2.changedInstance(animatable2) | gapComposer2.changedInstance(cardGridNuxScene2);
                            Object rememberedValue9 = gapComposer2.rememberedValue();
                            if (changedInstance3 || rememberedValue9 == obj5) {
                                rememberedValue9 = new PlaidLinkView.AnonymousClass2(animatable2, cardGridNuxScene2, continuation, 28);
                                gapComposer2.updateRememberedValue(rememberedValue9);
                            }
                            Updater.LaunchedEffect(gapComposer2, unit4, (Function2) rememberedValue9);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(666472921);
                            gapComposer2.end(false);
                        }
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
                        ComposeUiNode.Companion.getClass();
                        Function0 function02 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer2.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(function02);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
                        Function0 function03 = function0;
                        boolean changed2 = gapComposer2.changed(function03);
                        Object rememberedValue10 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue10 == obj5) {
                            rememberedValue10 = new ArticleViewKt$$ExternalSyntheticLambda26(function03, mutableState3, 1);
                            gapComposer2.updateRememberedValue(rememberedValue10);
                        }
                        ByteStreamsKt.SwampGLEffect(matchParentSize, engine, cardGridNuxScene2, null, false, null, (Function1) rememberedValue10, gapComposer2, 24640, 40);
                        gapComposer2.end(true);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 6);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(modifier, (Object) arrayList, (Object) engine, (Object) cardGridNuxScene, (Object) function0, i, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fb  */
    /* renamed from: HeartEffect-37dI38Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3441HeartEffect37dI38Q(final Modifier modifier, final float f, final Quat quat, final Vector3 vector3, float f2, String str, long j, boolean z, float f3, float f4, float f5, final HeartEdition heartEdition, Longs longs, Engine engine, HeartScene heartScene, Function1 function1, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        float f6;
        int i5;
        String str2;
        int i6;
        long j2;
        int i7;
        int i8;
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
        final boolean z2;
        final float f7;
        final float f8;
        final HeartScene heartScene2;
        final Function1 function12;
        GapComposer gapComposer;
        final float f9;
        final long j3;
        final String str3;
        final float f10;
        final Longs longs2;
        final Engine engine2;
        RecomposeScopeImpl endRestartGroup;
        Function1 function13;
        float f11;
        int i20;
        float f12;
        long j4;
        boolean z3;
        final String str4;
        HeartScene heartScene3;
        float f13;
        Engine engine3;
        float f14;
        Longs longs3;
        Object obj;
        String str5;
        HeartScene heartScene4;
        long j5;
        HeartScene heartScene5;
        String str6;
        boolean z4;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1372469399);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= (i & 512) == 0 ? gapComposer2.changed(quat) : gapComposer2.changedInstance(quat) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= (i & 4096) == 0 ? gapComposer2.changed(vector3) : gapComposer2.changedInstance(vector3) ? 2048 : 1024;
        }
        int i21 = i3 & 16;
        if (i21 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            f6 = f2;
            i4 |= gapComposer2.changed(f6) ? 16384 : PKIFailureInfo.certRevoked;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
                str2 = str;
            } else {
                str2 = str;
                if ((i & 196608) == 0) {
                    i4 |= gapComposer2.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
            }
            i6 = i3 & 64;
            int i22 = PKIFailureInfo.signerNotTrusted;
            if (i6 == 0) {
                i4 |= 1572864;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 1572864) == 0) {
                    i4 |= gapComposer2.changed(j2) ? PKIFailureInfo.badCertTemplate : 524288;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= gapComposer2.changed(z) ? 8388608 : 4194304;
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i9 = i8;
                i4 |= gapComposer2.changed(f3) ? 67108864 : 33554432;
                i10 = i3 & 512;
                if (i10 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i11 = i10;
                    i4 |= gapComposer2.changed(f4) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                        i14 = i2 | 6;
                        i13 = i12;
                    } else if ((i2 & 6) == 0) {
                        i13 = i12;
                        i14 = i2 | (gapComposer2.changed(f5) ? 4 : 2);
                    } else {
                        i13 = i12;
                        i14 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i14 |= gapComposer2.changed(heartEdition == null ? -1 : heartEdition.ordinal()) ? 32 : 16;
                    }
                    int i23 = i14;
                    if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                        i23 |= 128;
                    }
                    int i24 = i23 | 3072;
                    i15 = i3 & 16384;
                    if (i15 == 0) {
                        i16 = i23 | 27648;
                    } else if ((i2 & 24576) == 0) {
                        i16 = i24 | ((i2 & 32768) == 0 ? gapComposer2.changed(engine) : gapComposer2.changedInstance(engine) ? 16384 : PKIFailureInfo.certRevoked);
                    } else {
                        i16 = i24;
                    }
                    i17 = i3 & 32768;
                    if (i17 == 0) {
                        i16 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i16 |= gapComposer2.changedInstance(heartScene) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                    i18 = i3 & 65536;
                    if (i18 == 0) {
                        i16 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (gapComposer2.changedInstance(function1)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        }
                        i16 |= i22;
                    }
                    i19 = i4;
                    if (gapComposer2.shouldExecute(i19 & 1, (i4 & 306783379) == 306783378 || (599187 & i16) != 599186)) {
                        gapComposer2.skipToGroupEnd();
                        z2 = z;
                        f7 = f3;
                        f8 = f5;
                        heartScene2 = heartScene;
                        function12 = function1;
                        gapComposer = gapComposer2;
                        f9 = f6;
                        j3 = j2;
                        str3 = str2;
                        f10 = f4;
                        longs2 = longs;
                        engine2 = engine;
                    } else {
                        gapComposer2.startDefaults();
                        int i25 = i & 1;
                        Object obj2 = Composer.Companion.Empty;
                        Continuation continuation = null;
                        if (i25 == 0 || gapComposer2.getDefaultsInvalid()) {
                            if (i21 != 0) {
                                f6 = 1.0f;
                            }
                            if (i5 != 0) {
                                str2 = null;
                            }
                            long j6 = i6 != 0 ? Color.White : j2;
                            boolean z5 = i7 != 0 ? false : z;
                            float f15 = i9 != 0 ? RecyclerView.DECELERATION_RATE : f3;
                            float f16 = i11 != 0 ? 1.0f : f4;
                            float f17 = i13 == 0 ? f5 : 1.0f;
                            int i26 = i16 & (-897);
                            Engine engine4 = i15 != 0 ? null : engine;
                            HeartScene heartScene6 = i17 != 0 ? null : heartScene;
                            GLSurfaceConfig$TextureView gLSurfaceConfig$TextureView = GLSurfaceConfig$TextureView.INSTANCE;
                            if (i18 != 0) {
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (rememberedValue == obj2) {
                                    rememberedValue = new CardStudioQueries$$ExternalSyntheticLambda3(8);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                f11 = f17;
                                function13 = (Function1) rememberedValue;
                                f12 = f6;
                                j4 = j6;
                                str4 = str2;
                                heartScene3 = heartScene6;
                                f13 = f15;
                                engine3 = engine4;
                                f14 = f16;
                                longs3 = gLSurfaceConfig$TextureView;
                                i20 = i26;
                                z3 = z5;
                            } else {
                                function13 = function1;
                                f11 = f17;
                                i20 = i26;
                                f12 = f6;
                                j4 = j6;
                                z3 = z5;
                                str4 = str2;
                                heartScene3 = heartScene6;
                                f13 = f15;
                                engine3 = engine4;
                                f14 = f16;
                                longs3 = gLSurfaceConfig$TextureView;
                            }
                        } else {
                            gapComposer2.skipToGroupEnd();
                            int i27 = i16 & (-897);
                            z3 = z;
                            f13 = f3;
                            f14 = f4;
                            f11 = f5;
                            longs3 = longs;
                            engine3 = engine;
                            heartScene3 = heartScene;
                            function13 = function1;
                            i20 = i27;
                            f12 = f6;
                            j4 = j2;
                            str4 = str2;
                        }
                        gapComposer2.endDefaults();
                        if (((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                            gapComposer2.startReplaceGroup(-852060678);
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
                            ComposeUiNode.Companion.getClass();
                            Function0 function0 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer2.applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer2.startReusableNode();
                            if (gapComposer2.inserting) {
                                gapComposer2.createNode(function0);
                            } else {
                                gapComposer2.useNode();
                            }
                            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                            Room.m1165Text25TpFw(0, 0, 0, 0, 3462, 0, 4082, Color.White, (Composer) gapComposer2, (Modifier) null, new TextStyle(0L, Room.getSp(24), null, null, 0L, 0L, 0, 0, 0L, null, 16777213), (TextLineBalancing) null, "♥ Heart", (Map) null, (Function1) null, false);
                            gapComposer2.end(true);
                            gapComposer2.end(false);
                            RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                            if (endRestartGroup2 != null) {
                                final float f18 = f12;
                                final int i28 = 0;
                                final boolean z6 = z3;
                                final long j7 = j4;
                                final float f19 = f13;
                                final float f20 = f14;
                                final float f21 = f11;
                                final Longs longs4 = longs3;
                                final Engine engine5 = engine3;
                                final HeartScene heartScene7 = heartScene3;
                                final Function1 function14 = function13;
                                endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.card.onboarding.graphics.HeartEffectKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        int i29 = i28;
                                        int i30 = i2;
                                        int i31 = i;
                                        switch (i29) {
                                            case 0:
                                                ((Integer) obj4).getClass();
                                                int updateChangedFlags = Updater.updateChangedFlags(i31 | 1);
                                                int updateChangedFlags2 = Updater.updateChangedFlags(i30);
                                                FlowsKt.m3441HeartEffect37dI38Q(modifier, f, quat, vector3, f18, str4, j7, z6, f19, f20, f21, heartEdition, longs4, engine5, heartScene7, function14, (Composer) obj3, updateChangedFlags, updateChangedFlags2, i3);
                                                break;
                                            default:
                                                ((Integer) obj4).getClass();
                                                int updateChangedFlags3 = Updater.updateChangedFlags(i31 | 1);
                                                int updateChangedFlags4 = Updater.updateChangedFlags(i30);
                                                FlowsKt.m3441HeartEffect37dI38Q(modifier, f, quat, vector3, f18, str4, j7, z6, f19, f20, f21, heartEdition, longs4, engine5, heartScene7, function14, (Composer) obj3, updateChangedFlags3, updateChangedFlags4, i3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        boolean z7 = z3;
                        long j8 = j4;
                        float f22 = f13;
                        float f23 = f14;
                        float f24 = f11;
                        Longs longs5 = longs3;
                        engine2 = engine3;
                        HeartScene heartScene8 = heartScene3;
                        Function1 function15 = function13;
                        gapComposer2.startReplaceGroup(-851890581);
                        gapComposer2.end(false);
                        Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == obj2) {
                            rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
                        String str7 = str4;
                        int i29 = i20 & 57344;
                        int i30 = i20;
                        boolean changed = gapComposer2.changed(coroutineScope) | (i29 == 16384 || ((i30 & 32768) != 0 && gapComposer2.changed(engine2)));
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        Object obj3 = rememberedValue3;
                        if (changed || rememberedValue3 == obj2) {
                            if (engine2 == null) {
                                Engine engine6 = new Engine(coroutineScope);
                                engine6.initialize();
                                obj = engine6;
                            } else {
                                obj = engine2;
                            }
                            gapComposer2.updateRememberedValue(obj);
                            obj3 = obj;
                        }
                        Engine engine7 = (Engine) obj3;
                        boolean changedInstance = (i29 == 16384 || ((i30 & 32768) != 0 && gapComposer2.changedInstance(engine2))) | gapComposer2.changedInstance(engine7);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (changedInstance || rememberedValue4 == obj2) {
                            rememberedValue4 = new WandEffectKt$$ExternalSyntheticLambda2(engine2, engine7, 1);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        Updater.DisposableEffect(engine7, engine2, (Function1) rememberedValue4, gapComposer2);
                        boolean changed2 = gapComposer2.changed(engine7) | ((i30 & 112) == 32) | gapComposer2.changed(heartScene8);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue5 == obj2) {
                            HeartScene heartScene9 = heartScene8 == null ? new HeartScene(context, engine7, heartEdition) : heartScene8;
                            Transform transform = heartScene9.ringTransform;
                            Transform transform2 = heartScene9.heartTransform;
                            heartScene9.setScale(f);
                            quat.getClass();
                            transform2.setRotation(quat);
                            transform.setRotation(quat);
                            heartScene9.markDirty();
                            vector3.getClass();
                            transform2.setPosition(vector3);
                            transform.setPosition(vector3);
                            heartScene9.markDirty();
                            heartScene9.setOpacity(f12);
                            function15.invoke(heartScene9);
                            gapComposer2.updateRememberedValue(heartScene9);
                            rememberedValue5 = heartScene9;
                        }
                        HeartScene heartScene10 = (HeartScene) rememberedValue5;
                        boolean changedInstance2 = gapComposer2.changedInstance(heartScene8) | gapComposer2.changedInstance(heartScene10);
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        if (changedInstance2 || rememberedValue6 == obj2) {
                            rememberedValue6 = new BorrowHomeKt$$ExternalSyntheticLambda1(23, heartScene8, heartScene10);
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        }
                        Updater.DisposableEffect(heartScene10, heartScene8, (Function1) rememberedValue6, gapComposer2);
                        Object rememberUpdatedState = Updater.rememberUpdatedState(Float.valueOf(f), gapComposer2);
                        Object rememberUpdatedState2 = Updater.rememberUpdatedState(quat, gapComposer2);
                        float f25 = f12;
                        Object rememberUpdatedState3 = Updater.rememberUpdatedState(vector3, gapComposer2);
                        Object rememberUpdatedState4 = Updater.rememberUpdatedState(Float.valueOf(f25), gapComposer2);
                        boolean changed3 = gapComposer2.changed(rememberUpdatedState) | gapComposer2.changed(rememberUpdatedState2) | gapComposer2.changed(rememberUpdatedState3) | gapComposer2.changed(rememberUpdatedState4) | gapComposer2.changedInstance(heartScene10);
                        Object rememberedValue7 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue7 == obj2) {
                            rememberedValue7 = new RealBlockersHelper$skipBlocker$1(rememberUpdatedState, rememberUpdatedState2, rememberUpdatedState3, rememberUpdatedState4, heartScene10, null, 10);
                            gapComposer2.updateRememberedValue(rememberedValue7);
                        }
                        Updater.LaunchedEffect(gapComposer2, heartScene10, (Function2) rememberedValue7);
                        Color color = new Color(j8);
                        int i31 = i19 & 458752;
                        boolean changedInstance3 = ((i19 & 3670016) == 1048576) | (i31 == 131072) | gapComposer2.changedInstance(heartScene10);
                        Object rememberedValue8 = gapComposer2.rememberedValue();
                        if (changedInstance3 || rememberedValue8 == obj2) {
                            rememberedValue8 = new FlashControl$applyScreenFlash$2(str7, heartScene10, j8, (Continuation) null, 5);
                            str5 = str7;
                            heartScene4 = heartScene10;
                            j5 = j8;
                            gapComposer2.updateRememberedValue(rememberedValue8);
                        } else {
                            j5 = j8;
                            heartScene4 = heartScene10;
                            str5 = str7;
                        }
                        Updater.LaunchedEffect(heartScene4, str5, color, (Function2) rememberedValue8, gapComposer2);
                        Boolean valueOf = Boolean.valueOf(z7);
                        boolean changedInstance4 = gapComposer2.changedInstance(heartScene4) | (i31 == 131072) | ((i19 & 29360128) == 8388608);
                        Object rememberedValue9 = gapComposer2.rememberedValue();
                        if (changedInstance4 || rememberedValue9 == obj2) {
                            HeartScene heartScene11 = heartScene4;
                            String str8 = str5;
                            rememberedValue9 = new InteractiveCardState$animateLock$2(heartScene11, str8, z7, continuation, 4);
                            heartScene5 = heartScene11;
                            str6 = str8;
                            z4 = z7;
                            gapComposer2.updateRememberedValue(rememberedValue9);
                        } else {
                            z4 = z7;
                            heartScene5 = heartScene4;
                            str6 = str5;
                        }
                        Updater.LaunchedEffect(heartScene5, str6, valueOf, (Function2) rememberedValue9, gapComposer2);
                        MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(Float.valueOf(f22), gapComposer2);
                        MutableState rememberUpdatedState6 = Updater.rememberUpdatedState(Float.valueOf(f23), gapComposer2);
                        MutableState rememberUpdatedState7 = Updater.rememberUpdatedState(Float.valueOf(f24), gapComposer2);
                        boolean changed4 = gapComposer2.changed(rememberUpdatedState5) | gapComposer2.changed(rememberUpdatedState6) | gapComposer2.changed(rememberUpdatedState7) | gapComposer2.changedInstance(heartScene5);
                        Object rememberedValue10 = gapComposer2.rememberedValue();
                        if (changed4 || rememberedValue10 == obj2) {
                            rememberedValue10 = new VerifyCheckDepositPresenter$models$3$1(rememberUpdatedState5, rememberUpdatedState6, rememberUpdatedState7, (Scene) heartScene5, (Continuation) null, 4);
                            gapComposer2.updateRememberedValue(rememberedValue10);
                        }
                        Updater.LaunchedEffect(gapComposer2, heartScene5, (Function2) rememberedValue10);
                        ByteStreamsKt.SwampGLEffect(modifier, engine7, heartScene5, longs5, false, null, null, gapComposer2, (i19 & 14) | 64 | ((i30 << 3) & 57344), 96);
                        longs2 = longs5;
                        gapComposer = gapComposer2;
                        f8 = f24;
                        z2 = z4;
                        f9 = f25;
                        str3 = str6;
                        f10 = f23;
                        j3 = j5;
                        heartScene2 = heartScene8;
                        f7 = f22;
                        function12 = function15;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        final int i32 = 1;
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.card.onboarding.graphics.HeartEffectKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj32, Object obj4) {
                                int i292 = i32;
                                int i302 = i2;
                                int i312 = i;
                                switch (i292) {
                                    case 0:
                                        ((Integer) obj4).getClass();
                                        int updateChangedFlags = Updater.updateChangedFlags(i312 | 1);
                                        int updateChangedFlags2 = Updater.updateChangedFlags(i302);
                                        FlowsKt.m3441HeartEffect37dI38Q(modifier, f, quat, vector3, f9, str3, j3, z2, f7, f10, f8, heartEdition, longs2, engine2, heartScene2, function12, (Composer) obj32, updateChangedFlags, updateChangedFlags2, i3);
                                        break;
                                    default:
                                        ((Integer) obj4).getClass();
                                        int updateChangedFlags3 = Updater.updateChangedFlags(i312 | 1);
                                        int updateChangedFlags4 = Updater.updateChangedFlags(i302);
                                        FlowsKt.m3441HeartEffect37dI38Q(modifier, f, quat, vector3, f9, str3, j3, z2, f7, f10, f8, heartEdition, longs2, engine2, heartScene2, function12, (Composer) obj32, updateChangedFlags3, updateChangedFlags4, i3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i232 = i14;
                if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                }
                int i242 = i232 | 3072;
                i15 = i3 & 16384;
                if (i15 == 0) {
                }
                i17 = i3 & 32768;
                if (i17 == 0) {
                }
                i18 = i3 & 65536;
                if (i18 == 0) {
                }
                i19 = i4;
                if (gapComposer2.shouldExecute(i19 & 1, (i4 & 306783379) == 306783378 || (599187 & i16) != 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i9 = i8;
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i2322 = i14;
            if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            }
            int i2422 = i2322 | 3072;
            i15 = i3 & 16384;
            if (i15 == 0) {
            }
            i17 = i3 & 32768;
            if (i17 == 0) {
            }
            i18 = i3 & 65536;
            if (i18 == 0) {
            }
            i19 = i4;
            if (gapComposer2.shouldExecute(i19 & 1, (i4 & 306783379) == 306783378 || (599187 & i16) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f6 = f2;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        int i222 = PKIFailureInfo.signerNotTrusted;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i23222 = i14;
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        int i24222 = i23222 | 3072;
        i15 = i3 & 16384;
        if (i15 == 0) {
        }
        i17 = i3 & 32768;
        if (i17 == 0) {
        }
        i18 = i3 & 65536;
        if (i18 == 0) {
        }
        i19 = i4;
        if (gapComposer2.shouldExecute(i19 & 1, (i4 & 306783379) == 306783378 || (599187 & i16) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void HoloBackground(Modifier modifier, Composer composer, int i) {
        int i2;
        int i3;
        MutableState produceLightSource;
        char c;
        Float valueOf = Float.valueOf(1.0f);
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(253183340);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (booleanValue) {
                gapComposer.startReplaceGroup(1965672348);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(LightSource.Default);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                produceLightSource = (MutableState) rememberedValue;
            } else {
                gapComposer.startReplaceGroup(756146774);
                produceLightSource = SlidingWindowKt.produceLightSource(gapComposer);
            }
            gapComposer.end(false);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(1.52f, gapComposer);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue2;
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{valueOf, valueOf, valueOf}), gapComposer);
            float[] fArr = {((LightSource) produceLightSource.getValue()).x * 0.2f, ((LightSource) produceLightSource.getValue()).y * 0.2f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                c = 2;
                rememberedValue3 = Updater.derivedStateOf(new DrawerViewKt$$ExternalSyntheticLambda2(7, produceLightSource));
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                c = 2;
            }
            State state = (State) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new HoloEffectState();
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            HoloEffectState holoEffectState = (HoloEffectState) rememberedValue4;
            Vector4 vector4 = (Vector4) state.getValue();
            holoEffectState.getClass();
            vector4.getClass();
            holoEffectState.forwardDirection$delegate.setValue(vector4);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = Updater.derivedStateOf(new CaptureCheckFaceKt$$ExternalSyntheticLambda15(19, produceLightSource, mutableFloatState));
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            LightStateImpl rememberLightState = rememberLightState((State) rememberedValue5, rememberUpdatedState, gapComposer, 6);
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
            float floatValue = parcelableSnapshotMutableFloatState.getFloatValue();
            float[] fArr2 = new float[4];
            fArr2[0] = -0.5f;
            fArr2[1] = -0.5f;
            fArr2[c] = floatValue;
            fArr2[3] = 0.0f;
            i3 = 3;
            LightStateImpl rememberLightState2 = rememberLightState(Updater.rememberUpdatedState(new Vector4(fArr2[0] + fArr[0], fArr2[1] + fArr[1], fArr2[c] + fArr[c], fArr2[3] + fArr[3]), gapComposer), rememberUpdatedState, gapComposer, 0);
            float floatValue2 = parcelableSnapshotMutableFloatState.getFloatValue();
            float[] fArr3 = new float[4];
            fArr3[0] = 0.5f;
            fArr3[1] = -0.5f;
            fArr3[c] = floatValue2;
            fArr3[3] = 0.0f;
            LightStateImpl rememberLightState3 = rememberLightState(Updater.rememberUpdatedState(new Vector4(fArr3[0] + fArr[0], fArr3[1] + fArr[1], fArr3[c] + fArr[c], fArr3[3] + fArr[3]), gapComposer), rememberUpdatedState, gapComposer, 0);
            float floatValue3 = parcelableSnapshotMutableFloatState.getFloatValue();
            float[] fArr4 = new float[4];
            fArr4[0] = 0.5f;
            fArr4[1] = 0.5f;
            fArr4[c] = floatValue3;
            fArr4[3] = 0.0f;
            LightStateImpl rememberLightState4 = rememberLightState(Updater.rememberUpdatedState(new Vector4(fArr4[0] + fArr[0], fArr4[1] + fArr[1], fArr4[c] + fArr[c], fArr4[3] + fArr[3]), gapComposer), rememberUpdatedState, gapComposer, 0);
            float floatValue4 = parcelableSnapshotMutableFloatState.getFloatValue();
            float[] fArr5 = new float[4];
            fArr5[0] = -0.5f;
            fArr5[1] = 0.5f;
            fArr5[c] = floatValue4;
            fArr5[3] = 0.0f;
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new LightStateImpl[]{rememberLightState, rememberLightState2, rememberLightState3, rememberLightState4, rememberLightState(Updater.rememberUpdatedState(new Vector4(fArr5[0] + fArr[0], fArr5[1] + fArr[1], fArr5[c] + fArr[c], fArr5[3] + fArr[3]), gapComposer), rememberUpdatedState, gapComposer, 0)});
            listOf.getClass();
            holoEffectState.lights$delegate.setValue(listOf);
            HoloEffect(SizeKt.fillMaxSize(modifier, 1.0f), holoEffectState, gapComposer, 48);
        } else {
            i3 = 3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SnackbarHostKt$$ExternalSyntheticLambda3(modifier, i, i3, b);
        }
    }

    public static final void HoloEffect(final Modifier modifier, final HoloEffectState holoEffectState, Composer composer, final int i) {
        final Modifier modifier2;
        boolean booleanValue;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(73591813);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            if (((Boolean) holoEffectState.error$delegate.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(1940542213);
                gapComposer.end(false);
                booleanValue = true;
            } else {
                gapComposer.startReplaceGroup(2002261676);
                booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                gapComposer.end(false);
            }
            if (booleanValue) {
                gapComposer.startReplaceGroup(1940584787);
                ImageKt.Image(Countries.painterResource(R.drawable.card_holo, 0, gapComposer), null, SizeKt.fillMaxSize(modifier, 1.0f), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 24624, 104);
                gapComposer.end(false);
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2(modifier, holoEffectState, i, i3) { // from class: com.squareup.cash.card.onboarding.graphics.HoloEffectKt$$ExternalSyntheticLambda3
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ Modifier f$0;
                        public final /* synthetic */ HoloEffectState f$1;

                        {
                            this.$r8$classId = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            HoloEffectState holoEffectState2 = this.f$1;
                            Modifier modifier3 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    FlowsKt.HoloEffect(modifier3, holoEffectState2, composer2, Updater.updateChangedFlags(49));
                                    break;
                                default:
                                    FlowsKt.HoloEffect(modifier3, holoEffectState2, composer2, Updater.updateChangedFlags(49));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            gapComposer.startReplaceGroup(1940778909);
            gapComposer.end(false);
            if (((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                modifier2 = modifier;
                gapComposer.startReplaceGroup(1943568413);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1940902599);
                e eVar = new e();
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda12(holoEffectState, 7);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modifier2 = modifier;
                AnimationsKt.CashEngineTextureView(modifier2, "HoloEffect", eVar, (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(-600437747, new CheckDepositAmountKt$$ExternalSyntheticLambda6(13, holoEffectState, context), gapComposer), gapComposer, (i2 & 14) | 24624);
                gapComposer.end(false);
            }
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new Function2(modifier2, holoEffectState, i, i4) { // from class: com.squareup.cash.card.onboarding.graphics.HoloEffectKt$$ExternalSyntheticLambda3
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ Modifier f$0;
                public final /* synthetic */ HoloEffectState f$1;

                {
                    this.$r8$classId = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.$r8$classId;
                    HoloEffectState holoEffectState2 = this.f$1;
                    Modifier modifier3 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            FlowsKt.HoloEffect(modifier3, holoEffectState2, composer2, Updater.updateChangedFlags(49));
                            break;
                        default:
                            FlowsKt.HoloEffect(modifier3, holoEffectState2, composer2, Updater.updateChangedFlags(49));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fd  */
    /* renamed from: MiniCardEffect-37dI38Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3442MiniCardEffect37dI38Q(final Modifier modifier, final float f, final Quat quat, final Vector3 vector3, float f2, String str, long j, boolean z, float f3, float f4, float f5, final MiniCardEdition miniCardEdition, Longs longs, Engine engine, MiniCardScene miniCardScene, Function1 function1, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        float f6;
        int i5;
        int i6;
        long j2;
        int i7;
        boolean z2;
        int i8;
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
        final String str2;
        final float f7;
        final float f8;
        final MiniCardScene miniCardScene2;
        final Function1 function12;
        GapComposer gapComposer;
        final boolean z3;
        final float f9;
        final long j3;
        final float f10;
        final Longs longs2;
        final Engine engine2;
        RecomposeScopeImpl endRestartGroup;
        Function1 function13;
        float f11;
        int i20;
        boolean z4;
        final String str3;
        float f12;
        long j4;
        MiniCardScene miniCardScene3;
        float f13;
        Engine engine3;
        float f14;
        Longs longs3;
        Object obj;
        String str4;
        MiniCardScene miniCardScene4;
        long j5;
        String str5;
        boolean z5;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-336405205);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= (i & 512) == 0 ? gapComposer2.changed(quat) : gapComposer2.changedInstance(quat) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= (i & 4096) == 0 ? gapComposer2.changed(vector3) : gapComposer2.changedInstance(vector3) ? 2048 : 1024;
        }
        int i21 = i3 & 16;
        if (i21 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            f6 = f2;
            i4 |= gapComposer2.changed(f6) ? 16384 : PKIFailureInfo.certRevoked;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                i4 |= gapComposer2.changed(str) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            i6 = i3 & 64;
            int i22 = PKIFailureInfo.signerNotTrusted;
            if (i6 == 0) {
                i4 |= 1572864;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 1572864) == 0) {
                    i4 |= gapComposer2.changed(j2) ? PKIFailureInfo.badCertTemplate : 524288;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 12582912) == 0) {
                    i4 |= gapComposer2.changed(z2) ? 8388608 : 4194304;
                }
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i9 = i8;
                i4 |= gapComposer2.changed(f3) ? 67108864 : 33554432;
                i10 = i3 & 512;
                if (i10 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i11 = i10;
                    i4 |= gapComposer2.changed(f4) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                        i14 = i2 | 6;
                        i13 = i12;
                    } else if ((i2 & 6) == 0) {
                        i13 = i12;
                        i14 = i2 | (gapComposer2.changed(f5) ? 4 : 2);
                    } else {
                        i13 = i12;
                        i14 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i14 |= gapComposer2.changed(miniCardEdition == null ? -1 : miniCardEdition.ordinal()) ? 32 : 16;
                    }
                    int i23 = i14;
                    if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                        i23 |= 128;
                    }
                    int i24 = i23 | 3072;
                    i15 = i3 & 16384;
                    if (i15 == 0) {
                        i16 = i23 | 27648;
                    } else if ((i2 & 24576) == 0) {
                        i16 = i24 | ((i2 & 32768) == 0 ? gapComposer2.changed(engine) : gapComposer2.changedInstance(engine) ? 16384 : PKIFailureInfo.certRevoked);
                    } else {
                        i16 = i24;
                    }
                    i17 = i3 & 32768;
                    if (i17 == 0) {
                        i16 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i16 |= gapComposer2.changedInstance(miniCardScene) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                    i18 = i3 & 65536;
                    if (i18 == 0) {
                        i16 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (gapComposer2.changedInstance(function1)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        }
                        i16 |= i22;
                    }
                    i19 = i4;
                    if (gapComposer2.shouldExecute(i19 & 1, (i4 & 306783379) == 306783378 || (599187 & i16) != 599186)) {
                        gapComposer2.skipToGroupEnd();
                        str2 = str;
                        f7 = f3;
                        f8 = f5;
                        miniCardScene2 = miniCardScene;
                        function12 = function1;
                        gapComposer = gapComposer2;
                        z3 = z2;
                        f9 = f6;
                        j3 = j2;
                        f10 = f4;
                        longs2 = longs;
                        engine2 = engine;
                    } else {
                        gapComposer2.startDefaults();
                        int i25 = i & 1;
                        Object obj2 = Composer.Companion.Empty;
                        Continuation continuation = null;
                        if (i25 == 0 || gapComposer2.getDefaultsInvalid()) {
                            if (i21 != 0) {
                                f6 = 1.0f;
                            }
                            String str6 = i5 != 0 ? null : str;
                            if (i6 != 0) {
                                j2 = Color.White;
                            }
                            if (i7 != 0) {
                                z2 = false;
                            }
                            float f15 = i9 != 0 ? RecyclerView.DECELERATION_RATE : f3;
                            float f16 = i11 != 0 ? 1.0f : f4;
                            float f17 = i13 == 0 ? f5 : 1.0f;
                            int i26 = i16 & (-897);
                            Engine engine4 = i15 != 0 ? null : engine;
                            MiniCardScene miniCardScene5 = i17 != 0 ? null : miniCardScene;
                            GLSurfaceConfig$TextureView gLSurfaceConfig$TextureView = GLSurfaceConfig$TextureView.INSTANCE;
                            if (i18 != 0) {
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (rememberedValue == obj2) {
                                    rememberedValue = new CardStudioQueries$$ExternalSyntheticLambda3(9);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                f11 = f17;
                                function13 = (Function1) rememberedValue;
                                str3 = str6;
                                f12 = f6;
                                j4 = j2;
                                miniCardScene3 = miniCardScene5;
                                f13 = f15;
                                engine3 = engine4;
                                f14 = f16;
                                longs3 = gLSurfaceConfig$TextureView;
                                i20 = i26;
                                z4 = z2;
                            } else {
                                function13 = function1;
                                f11 = f17;
                                i20 = i26;
                                z4 = z2;
                                str3 = str6;
                                f12 = f6;
                                j4 = j2;
                                miniCardScene3 = miniCardScene5;
                                f13 = f15;
                                engine3 = engine4;
                                f14 = f16;
                                longs3 = gLSurfaceConfig$TextureView;
                            }
                        } else {
                            gapComposer2.skipToGroupEnd();
                            str3 = str;
                            f13 = f3;
                            f14 = f4;
                            f11 = f5;
                            longs3 = longs;
                            engine3 = engine;
                            miniCardScene3 = miniCardScene;
                            function13 = function1;
                            i20 = i16 & (-897);
                            z4 = z2;
                            f12 = f6;
                            j4 = j2;
                        }
                        gapComposer2.endDefaults();
                        if (((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                            gapComposer2.startReplaceGroup(-1688010974);
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
                            ComposeUiNode.Companion.getClass();
                            Function0 function0 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer2.applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer2.startReusableNode();
                            if (gapComposer2.inserting) {
                                gapComposer2.createNode(function0);
                            } else {
                                gapComposer2.useNode();
                            }
                            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                            Room.m1165Text25TpFw(0, 0, 0, 0, 3462, 0, 4082, Color.White, (Composer) gapComposer2, (Modifier) null, new TextStyle(0L, Room.getSp(24), null, null, 0L, 0L, 0, 0, 0L, null, 16777213), (TextLineBalancing) null, "▭ Mini Card", (Map) null, (Function1) null, false);
                            gapComposer2.end(true);
                            gapComposer2.end(false);
                            RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                            if (endRestartGroup2 != null) {
                                final float f18 = f12;
                                final int i27 = 0;
                                final boolean z6 = z4;
                                final long j6 = j4;
                                final float f19 = f13;
                                final float f20 = f14;
                                final float f21 = f11;
                                final Longs longs4 = longs3;
                                final Engine engine5 = engine3;
                                final MiniCardScene miniCardScene6 = miniCardScene3;
                                final Function1 function14 = function13;
                                endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.card.onboarding.graphics.MiniCardEffectKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        int i28 = i27;
                                        int i29 = i2;
                                        int i30 = i;
                                        switch (i28) {
                                            case 0:
                                                ((Integer) obj4).getClass();
                                                int updateChangedFlags = Updater.updateChangedFlags(i30 | 1);
                                                int updateChangedFlags2 = Updater.updateChangedFlags(i29);
                                                FlowsKt.m3442MiniCardEffect37dI38Q(modifier, f, quat, vector3, f18, str3, j6, z6, f19, f20, f21, miniCardEdition, longs4, engine5, miniCardScene6, function14, (Composer) obj3, updateChangedFlags, updateChangedFlags2, i3);
                                                break;
                                            default:
                                                ((Integer) obj4).getClass();
                                                int updateChangedFlags3 = Updater.updateChangedFlags(i30 | 1);
                                                int updateChangedFlags4 = Updater.updateChangedFlags(i29);
                                                FlowsKt.m3442MiniCardEffect37dI38Q(modifier, f, quat, vector3, f18, str3, j6, z6, f19, f20, f21, miniCardEdition, longs4, engine5, miniCardScene6, function14, (Composer) obj3, updateChangedFlags3, updateChangedFlags4, i3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        float f22 = f12;
                        boolean z7 = z4;
                        long j7 = j4;
                        float f23 = f13;
                        float f24 = f14;
                        float f25 = f11;
                        Longs longs5 = longs3;
                        engine2 = engine3;
                        MiniCardScene miniCardScene7 = miniCardScene3;
                        Function1 function15 = function13;
                        gapComposer2.startReplaceGroup(-1687837033);
                        gapComposer2.end(false);
                        Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == obj2) {
                            rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
                        String str7 = str3;
                        int i28 = i20 & 57344;
                        int i29 = i20;
                        boolean changed = gapComposer2.changed(coroutineScope) | (i28 == 16384 || ((i29 & 32768) != 0 && gapComposer2.changed(engine2)));
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        Object obj3 = rememberedValue3;
                        if (changed || rememberedValue3 == obj2) {
                            if (engine2 == null) {
                                Engine engine6 = new Engine(coroutineScope);
                                engine6.initialize();
                                obj = engine6;
                            } else {
                                obj = engine2;
                            }
                            gapComposer2.updateRememberedValue(obj);
                            obj3 = obj;
                        }
                        Engine engine7 = (Engine) obj3;
                        boolean changedInstance = (i28 == 16384 || ((i29 & 32768) != 0 && gapComposer2.changedInstance(engine2))) | gapComposer2.changedInstance(engine7);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (changedInstance || rememberedValue4 == obj2) {
                            rememberedValue4 = new WandEffectKt$$ExternalSyntheticLambda2(engine2, engine7, 2);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        Updater.DisposableEffect(engine7, engine2, (Function1) rememberedValue4, gapComposer2);
                        boolean changed2 = gapComposer2.changed(engine7) | ((i29 & 112) == 32) | gapComposer2.changed(miniCardScene7);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue5 == obj2) {
                            MiniCardScene miniCardScene8 = miniCardScene7 == null ? new MiniCardScene(context, engine7, miniCardEdition) : miniCardScene7;
                            miniCardScene8.setScale(f);
                            quat.getClass();
                            miniCardScene8.cardTransform.setRotation(quat);
                            miniCardScene8.ringTransform.setRotation(MiniCardScene.RING_BASE_ROTATION.times(quat));
                            miniCardScene8.markDirty();
                            miniCardScene8.setPosition(vector3);
                            miniCardScene8.setOpacity(f22);
                            function15.invoke(miniCardScene8);
                            gapComposer2.updateRememberedValue(miniCardScene8);
                            rememberedValue5 = miniCardScene8;
                        }
                        MiniCardScene miniCardScene9 = (MiniCardScene) rememberedValue5;
                        boolean changedInstance2 = gapComposer2.changedInstance(miniCardScene7) | gapComposer2.changedInstance(miniCardScene9);
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        if (changedInstance2 || rememberedValue6 == obj2) {
                            rememberedValue6 = new BorrowHomeKt$$ExternalSyntheticLambda1(24, miniCardScene7, miniCardScene9);
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        }
                        Updater.DisposableEffect(miniCardScene9, miniCardScene7, (Function1) rememberedValue6, gapComposer2);
                        Object rememberUpdatedState = Updater.rememberUpdatedState(Float.valueOf(f), gapComposer2);
                        Object rememberUpdatedState2 = Updater.rememberUpdatedState(quat, gapComposer2);
                        Object rememberUpdatedState3 = Updater.rememberUpdatedState(vector3, gapComposer2);
                        Object rememberUpdatedState4 = Updater.rememberUpdatedState(Float.valueOf(f22), gapComposer2);
                        boolean changed3 = gapComposer2.changed(rememberUpdatedState) | gapComposer2.changed(rememberUpdatedState2) | gapComposer2.changed(rememberUpdatedState3) | gapComposer2.changed(rememberUpdatedState4) | gapComposer2.changedInstance(miniCardScene9);
                        Object rememberedValue7 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue7 == obj2) {
                            rememberedValue7 = new RealBlockersHelper$skipBlocker$1(rememberUpdatedState, rememberUpdatedState2, rememberUpdatedState3, rememberUpdatedState4, miniCardScene9, null, 11);
                            gapComposer2.updateRememberedValue(rememberedValue7);
                        }
                        Updater.LaunchedEffect(gapComposer2, miniCardScene9, (Function2) rememberedValue7);
                        Color color = new Color(j7);
                        int i30 = i19 & 458752;
                        boolean changedInstance3 = ((i19 & 3670016) == 1048576) | (i30 == 131072) | gapComposer2.changedInstance(miniCardScene9);
                        Object rememberedValue8 = gapComposer2.rememberedValue();
                        if (changedInstance3 || rememberedValue8 == obj2) {
                            rememberedValue8 = new FlashControl$applyScreenFlash$2(str7, miniCardScene9, j7, (Continuation) null, 6);
                            str4 = str7;
                            miniCardScene4 = miniCardScene9;
                            j5 = j7;
                            gapComposer2.updateRememberedValue(rememberedValue8);
                        } else {
                            str4 = str7;
                            j5 = j7;
                            miniCardScene4 = miniCardScene9;
                        }
                        Updater.LaunchedEffect(miniCardScene4, str4, color, (Function2) rememberedValue8, gapComposer2);
                        Boolean valueOf = Boolean.valueOf(z7);
                        boolean changedInstance4 = (i30 == 131072) | gapComposer2.changedInstance(miniCardScene4) | ((i19 & 29360128) == 8388608);
                        Object rememberedValue9 = gapComposer2.rememberedValue();
                        if (changedInstance4 || rememberedValue9 == obj2) {
                            String str8 = str4;
                            rememberedValue9 = new InteractiveCardState$animateLock$2(miniCardScene4, str8, z7, continuation, 5);
                            str5 = str8;
                            z5 = z7;
                            gapComposer2.updateRememberedValue(rememberedValue9);
                        } else {
                            z5 = z7;
                            str5 = str4;
                        }
                        Updater.LaunchedEffect(miniCardScene4, str5, valueOf, (Function2) rememberedValue9, gapComposer2);
                        MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(Float.valueOf(f23), gapComposer2);
                        MutableState rememberUpdatedState6 = Updater.rememberUpdatedState(Float.valueOf(f24), gapComposer2);
                        MutableState rememberUpdatedState7 = Updater.rememberUpdatedState(Float.valueOf(f25), gapComposer2);
                        boolean changed4 = gapComposer2.changed(rememberUpdatedState5) | gapComposer2.changed(rememberUpdatedState6) | gapComposer2.changed(rememberUpdatedState7) | gapComposer2.changedInstance(miniCardScene4);
                        Object rememberedValue10 = gapComposer2.rememberedValue();
                        if (changed4 || rememberedValue10 == obj2) {
                            rememberedValue10 = new VerifyCheckDepositPresenter$models$3$1(rememberUpdatedState5, rememberUpdatedState6, rememberUpdatedState7, (Scene) miniCardScene4, (Continuation) null, 5);
                            gapComposer2.updateRememberedValue(rememberedValue10);
                        }
                        Updater.LaunchedEffect(gapComposer2, miniCardScene4, (Function2) rememberedValue10);
                        ByteStreamsKt.SwampGLEffect(modifier, engine7, miniCardScene4, longs5, false, null, null, gapComposer2, (i19 & 14) | 64 | ((i29 << 3) & 57344), 96);
                        longs2 = longs5;
                        gapComposer = gapComposer2;
                        str2 = str5;
                        f8 = f25;
                        z3 = z5;
                        f9 = f22;
                        f10 = f24;
                        j3 = j5;
                        miniCardScene2 = miniCardScene7;
                        f7 = f23;
                        function12 = function15;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        final int i31 = 1;
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.card.onboarding.graphics.MiniCardEffectKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj32, Object obj4) {
                                int i282 = i31;
                                int i292 = i2;
                                int i302 = i;
                                switch (i282) {
                                    case 0:
                                        ((Integer) obj4).getClass();
                                        int updateChangedFlags = Updater.updateChangedFlags(i302 | 1);
                                        int updateChangedFlags2 = Updater.updateChangedFlags(i292);
                                        FlowsKt.m3442MiniCardEffect37dI38Q(modifier, f, quat, vector3, f9, str2, j3, z3, f7, f10, f8, miniCardEdition, longs2, engine2, miniCardScene2, function12, (Composer) obj32, updateChangedFlags, updateChangedFlags2, i3);
                                        break;
                                    default:
                                        ((Integer) obj4).getClass();
                                        int updateChangedFlags3 = Updater.updateChangedFlags(i302 | 1);
                                        int updateChangedFlags4 = Updater.updateChangedFlags(i292);
                                        FlowsKt.m3442MiniCardEffect37dI38Q(modifier, f, quat, vector3, f9, str2, j3, z3, f7, f10, f8, miniCardEdition, longs2, engine2, miniCardScene2, function12, (Composer) obj32, updateChangedFlags3, updateChangedFlags4, i3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i232 = i14;
                if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                }
                int i242 = i232 | 3072;
                i15 = i3 & 16384;
                if (i15 == 0) {
                }
                i17 = i3 & 32768;
                if (i17 == 0) {
                }
                i18 = i3 & 65536;
                if (i18 == 0) {
                }
                i19 = i4;
                if (gapComposer2.shouldExecute(i19 & 1, (i4 & 306783379) == 306783378 || (599187 & i16) != 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i9 = i8;
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i2322 = i14;
            if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            }
            int i2422 = i2322 | 3072;
            i15 = i3 & 16384;
            if (i15 == 0) {
            }
            i17 = i3 & 32768;
            if (i17 == 0) {
            }
            i18 = i3 & 65536;
            if (i18 == 0) {
            }
            i19 = i4;
            if (gapComposer2.shouldExecute(i19 & 1, (i4 & 306783379) == 306783378 || (599187 & i16) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f6 = f2;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        int i222 = PKIFailureInfo.signerNotTrusted;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i23222 = i14;
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        int i24222 = i23222 | 3072;
        i15 = i3 & 16384;
        if (i15 == 0) {
        }
        i17 = i3 & 32768;
        if (i17 == 0) {
        }
        i18 = i3 & 65536;
        if (i18 == 0) {
        }
        i19 = i4;
        if (gapComposer2.shouldExecute(i19 & 1, (i4 & 306783379) == 306783378 || (599187 & i16) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void WandActivationSuccessAnimation(Modifier modifier, boolean z, WandEdition wandEdition, ActivationSuccessConfig activationSuccessConfig, Composer composer, int i) {
        int i2;
        boolean z2;
        ActivationSuccessConfig activationSuccessConfig2;
        int i3;
        ActivationSuccessConfig activationSuccessConfig3;
        boolean z3;
        MutableFloatState mutableFloatState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2060648635);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changed(wandEdition.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= 1024;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                i3 = i4 & (-7169);
                activationSuccessConfig3 = new ActivationSuccessConfig();
                z3 = true;
            } else {
                gapComposer.skipToGroupEnd();
                i3 = i4 & (-7169);
                z3 = z;
                activationSuccessConfig3 = activationSuccessConfig;
            }
            gapComposer.endDefaults();
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer);
            }
            MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer);
            }
            MutableFloatState mutableFloatState3 = (MutableFloatState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer);
            }
            MutableFloatState mutableFloatState4 = (MutableFloatState) rememberedValue3;
            Boolean valueOf = Boolean.valueOf(z3);
            boolean changed = ((i3 & 112) == 32) | gapComposer.changed(activationSuccessConfig3);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed || rememberedValue4 == neverEqualPolicy) {
                ActivationSuccessConfig activationSuccessConfig4 = activationSuccessConfig3;
                WandActivationSuccessEffectKt$WandActivationSuccessAnimation$1$1 wandActivationSuccessEffectKt$WandActivationSuccessAnimation$1$1 = new WandActivationSuccessEffectKt$WandActivationSuccessAnimation$1$1(z3, activationSuccessConfig4, mutableFloatState2, mutableFloatState3, mutableFloatState4, null);
                z2 = z3;
                mutableFloatState = mutableFloatState3;
                activationSuccessConfig3 = activationSuccessConfig4;
                gapComposer.updateRememberedValue(wandActivationSuccessEffectKt$WandActivationSuccessAnimation$1$1);
                rememberedValue4 = wandActivationSuccessEffectKt$WandActivationSuccessAnimation$1$1;
            } else {
                mutableFloatState = mutableFloatState3;
                z2 = z3;
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue4);
            WandActivationSuccessEffect(modifier, ((ParcelableSnapshotMutableFloatState) mutableFloatState2).getFloatValue(), ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue(), ((ParcelableSnapshotMutableFloatState) mutableFloatState4).getFloatValue(), wandEdition, activationSuccessConfig3, null, null, gapComposer, (i3 & 14) | ((i3 << 6) & 57344), 448);
            activationSuccessConfig2 = activationSuccessConfig3;
        } else {
            gapComposer.skipToGroupEnd();
            z2 = z;
            activationSuccessConfig2 = activationSuccessConfig;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(modifier, z2, wandEdition, activationSuccessConfig2, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WandActivationSuccessEffect(final Modifier modifier, final float f, final float f2, final float f3, final WandEdition wandEdition, ActivationSuccessConfig activationSuccessConfig, Longs longs, Function1 function1, Composer composer, final int i, final int i2) {
        int i3;
        float f4;
        float f5;
        ActivationSuccessConfig activationSuccessConfig2;
        final Longs longs2;
        GapComposer gapComposer;
        final Function1 function12;
        ActivationSuccessConfig activationSuccessConfig3;
        int i4;
        Function1 function13;
        ActivationSuccessConfig activationSuccessConfig4;
        final Longs longs3;
        int i5;
        boolean z;
        boolean changedInstance;
        Object rememberedValue;
        boolean changedInstance2;
        Object rememberedValue2;
        int i6;
        int i7;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2035407317);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            f4 = f;
            i3 |= gapComposer2.changed(f4) ? 32 : 16;
        } else {
            f4 = f;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            f5 = f2;
            i3 |= gapComposer2.changed(f5) ? 256 : 128;
        } else {
            f5 = f2;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(f3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer2.changed(wandEdition.ordinal()) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i & 196608) == 0) {
            if ((i2 & 32) == 0) {
                activationSuccessConfig2 = activationSuccessConfig;
                if (gapComposer2.changed(activationSuccessConfig2)) {
                    i7 = 131072;
                    i3 |= i7;
                }
            } else {
                activationSuccessConfig2 = activationSuccessConfig;
            }
            i7 = 65536;
            i3 |= i7;
        } else {
            activationSuccessConfig2 = activationSuccessConfig;
        }
        if ((1572864 & i) == 0) {
            i3 |= PKIFailureInfo.signerNotTrusted;
        }
        int i8 = i3 | 113246208;
        int i9 = 1;
        if (gapComposer2.shouldExecute(i8 & 1, (38347923 & i8) != 38347922)) {
            gapComposer2.startDefaults();
            int i10 = i & 1;
            Object obj = Composer.Companion.Empty;
            if (i10 == 0 || gapComposer2.getDefaultsInvalid()) {
                if ((i2 & 32) != 0) {
                    activationSuccessConfig3 = new ActivationSuccessConfig();
                    i8 &= -458753;
                } else {
                    activationSuccessConfig3 = activationSuccessConfig2;
                }
                i4 = i8 & (-3670017);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == obj) {
                    rememberedValue3 = new CardStudioQueries$$ExternalSyntheticLambda3(10);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                function13 = (Function1) rememberedValue3;
                activationSuccessConfig4 = activationSuccessConfig3;
                longs3 = GLSurfaceConfig$TextureView.INSTANCE;
            } else {
                gapComposer2.skipToGroupEnd();
                if ((i2 & 32) != 0) {
                    i8 &= -458753;
                }
                i4 = i8 & (-3670017);
                longs3 = longs;
                function13 = function1;
                activationSuccessConfig4 = activationSuccessConfig2;
            }
            int i11 = i4;
            gapComposer2.endDefaults();
            Continuation continuation = null;
            if (((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                gapComposer2.startReplaceGroup(-470666219);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
                ComposeUiNode.Companion.getClass();
                Function0 function0 = ComposeUiNode.Companion.Constructor;
                if (gapComposer2.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(function0);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Room.m1165Text25TpFw(0, 0, 0, 0, 3462, 0, 4082, Color.White, (Composer) gapComposer2, (Modifier) null, new TextStyle(0L, Room.getSp(24), null, null, 0L, 0L, 0, 0, 0L, null, 16777213), (TextLineBalancing) null, "Wand Activation Success", (Map) null, (Function1) null, false);
                gapComposer2.end(true);
                gapComposer2.end(false);
                RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i12 = 0;
                    final float f6 = f4;
                    final float f7 = f5;
                    final ActivationSuccessConfig activationSuccessConfig5 = activationSuccessConfig4;
                    final Function1 function14 = function13;
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.card.onboarding.graphics.WandActivationSuccessEffectKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i13 = i12;
                            int i14 = i;
                            switch (i13) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    FlowsKt.WandActivationSuccessEffect(modifier, f6, f7, f3, wandEdition, activationSuccessConfig5, longs3, function14, (Composer) obj2, Updater.updateChangedFlags(i14 | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    FlowsKt.WandActivationSuccessEffect(modifier, f6, f7, f3, wandEdition, activationSuccessConfig5, longs3, function14, (Composer) obj2, Updater.updateChangedFlags(i14 | 1), i2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            activationSuccessConfig2 = activationSuccessConfig4;
            Function1 function15 = function13;
            gapComposer2.startReplaceGroup(-470449033);
            gapComposer2.end(false);
            Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue4;
            boolean changed = gapComposer2.changed(coroutineScope);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            Object obj2 = rememberedValue5;
            if (changed || rememberedValue5 == obj) {
                Engine engine = new Engine(coroutineScope);
                engine.initialize();
                gapComposer2.updateRememberedValue(engine);
                obj2 = engine;
            }
            Engine engine2 = (Engine) obj2;
            boolean changedInstance3 = gapComposer2.changedInstance(engine2);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue6 == obj) {
                rememberedValue6 = new CardTransitionKt$$ExternalSyntheticLambda17(engine2, 1);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            Updater.DisposableEffect(engine2, (Function1) rememberedValue6, gapComposer2);
            boolean changed2 = gapComposer2.changed(engine2) | ((i11 & 57344) == 16384);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue7 == obj) {
                rememberedValue7 = new WandScene(context, engine2, wandEdition);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            WandScene wandScene = (WandScene) rememberedValue7;
            boolean changedInstance4 = gapComposer2.changedInstance(wandScene);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changedInstance4 || rememberedValue8 == obj) {
                rememberedValue8 = new WandScene$$ExternalSyntheticLambda0(wandScene, i9);
                gapComposer2.updateRememberedValue(rememberedValue8);
            }
            Updater.DisposableEffect(wandScene, (Function1) rememberedValue8, gapComposer2);
            boolean changed3 = gapComposer2.changed(wandScene);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue9 == obj) {
                try {
                    InputStream open = context.getAssets().open("wand_activation_success.cashanim");
                    try {
                        open.getClass();
                        Object cashAnimPlayer = new CashAnimPlayer(Preconditions.load(open));
                        open.close();
                        rememberedValue9 = cashAnimPlayer;
                    } finally {
                    }
                } catch (Exception e) {
                    Timber.Forest.e("Failed to load wand animation", new Object[0], e);
                    rememberedValue9 = null;
                }
                gapComposer2.updateRememberedValue(rememberedValue9);
            }
            CashAnimPlayer cashAnimPlayer2 = (CashAnimPlayer) rememberedValue9;
            boolean changed4 = gapComposer2.changed(cashAnimPlayer2);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue10 == obj) {
                rememberedValue10 = cashAnimPlayer2 != null ? cashAnimPlayer2.evaluate(2.6333334f) : null;
                gapComposer2.updateRememberedValue(rememberedValue10);
            }
            TransformFrame transformFrame = (TransformFrame) rememberedValue10;
            int i13 = (i11 & 458752) ^ 196608;
            if (i13 <= 131072 || !gapComposer2.changed(activationSuccessConfig2)) {
                i5 = 458752;
                if ((i11 & 196608) != 131072) {
                    z = false;
                    changedInstance = z | gapComposer2.changedInstance(wandScene);
                    rememberedValue = gapComposer2.rememberedValue();
                    if (!changedInstance || rememberedValue == obj) {
                        rememberedValue = new RealAppConfigManager$update$2$2(activationSuccessConfig2, wandScene, continuation, 4);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer2, activationSuccessConfig2, (Function2) rememberedValue);
                    Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), activationSuccessConfig2};
                    changedInstance2 = gapComposer2.changedInstance(cashAnimPlayer2) | gapComposer2.changedInstance(transformFrame) | gapComposer2.changedInstance(wandScene) | ((i11 & 112) != 32) | ((i11 & 896) != 256) | ((i11 & 7168) != 2048) | ((i13 <= 131072 && gapComposer2.changed(activationSuccessConfig2)) || (i11 & 196608) == 131072);
                    rememberedValue2 = gapComposer2.rememberedValue();
                    if (!changedInstance2 || rememberedValue2 == obj) {
                        i6 = i11;
                        Object wandActivationSuccessEffectKt$WandActivationSuccessEffect$7$1 = new WandActivationSuccessEffectKt$WandActivationSuccessEffect$7$1(cashAnimPlayer2, transformFrame, wandScene, f, f2, f3, activationSuccessConfig2, null);
                        activationSuccessConfig2 = activationSuccessConfig2;
                        gapComposer2.updateRememberedValue(wandActivationSuccessEffectKt$WandActivationSuccessEffect$7$1);
                        rememberedValue2 = wandActivationSuccessEffectKt$WandActivationSuccessEffect$7$1;
                    } else {
                        i6 = i11;
                    }
                    Updater.LaunchedEffect(objArr, (Function2) rememberedValue2, gapComposer2);
                    int i14 = i6 >> 9;
                    int i15 = (i6 & 14) | 64 | (i14 & 57344) | (i14 & i5);
                    Longs longs4 = longs3;
                    ByteStreamsKt.SwampGLEffect(modifier, engine2, wandScene, longs4, false, function15, null, gapComposer2, i15, 64);
                    longs2 = longs4;
                    gapComposer = gapComposer2;
                    function12 = function15;
                }
            } else {
                i5 = 458752;
            }
            z = true;
            changedInstance = z | gapComposer2.changedInstance(wandScene);
            rememberedValue = gapComposer2.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new RealAppConfigManager$update$2$2(activationSuccessConfig2, wandScene, continuation, 4);
            gapComposer2.updateRememberedValue(rememberedValue);
            Updater.LaunchedEffect(gapComposer2, activationSuccessConfig2, (Function2) rememberedValue);
            Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), activationSuccessConfig2};
            changedInstance2 = gapComposer2.changedInstance(cashAnimPlayer2) | gapComposer2.changedInstance(transformFrame) | gapComposer2.changedInstance(wandScene) | ((i11 & 112) != 32) | ((i11 & 896) != 256) | ((i11 & 7168) != 2048) | ((i13 <= 131072 && gapComposer2.changed(activationSuccessConfig2)) || (i11 & 196608) == 131072);
            rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance2) {
            }
            i6 = i11;
            Object wandActivationSuccessEffectKt$WandActivationSuccessEffect$7$12 = new WandActivationSuccessEffectKt$WandActivationSuccessEffect$7$1(cashAnimPlayer2, transformFrame, wandScene, f, f2, f3, activationSuccessConfig2, null);
            activationSuccessConfig2 = activationSuccessConfig2;
            gapComposer2.updateRememberedValue(wandActivationSuccessEffectKt$WandActivationSuccessEffect$7$12);
            rememberedValue2 = wandActivationSuccessEffectKt$WandActivationSuccessEffect$7$12;
            Updater.LaunchedEffect(objArr2, (Function2) rememberedValue2, gapComposer2);
            int i142 = i6 >> 9;
            int i152 = (i6 & 14) | 64 | (i142 & 57344) | (i142 & i5);
            Longs longs42 = longs3;
            ByteStreamsKt.SwampGLEffect(modifier, engine2, wandScene, longs42, false, function15, null, gapComposer2, i152, 64);
            longs2 = longs42;
            gapComposer = gapComposer2;
            function12 = function15;
        } else {
            gapComposer2.skipToGroupEnd();
            longs2 = longs;
            gapComposer = gapComposer2;
            function12 = function1;
        }
        final ActivationSuccessConfig activationSuccessConfig6 = activationSuccessConfig2;
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i16 = 1;
            endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.card.onboarding.graphics.WandActivationSuccessEffectKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj22, Object obj3) {
                    int i132 = i16;
                    int i143 = i;
                    switch (i132) {
                        case 0:
                            ((Integer) obj3).getClass();
                            FlowsKt.WandActivationSuccessEffect(modifier, f, f2, f3, wandEdition, activationSuccessConfig6, longs2, function12, (Composer) obj22, Updater.updateChangedFlags(i143 | 1), i2);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            FlowsKt.WandActivationSuccessEffect(modifier, f, f2, f3, wandEdition, activationSuccessConfig6, longs2, function12, (Composer) obj22, Updater.updateChangedFlags(i143 | 1), i2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f3  */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34, types: [kotlin.coroutines.Continuation] */
    /* renamed from: WandEffect-37dI38Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3443WandEffect37dI38Q(final Modifier modifier, final float f, final Quat quat, final Vector3 vector3, float f2, String str, long j, final boolean z, float f3, float f4, float f5, final WandEdition wandEdition, Longs longs, Engine engine, WandScene wandScene, Function1 function1, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        String str2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Quat quat2;
        final float f6;
        final float f7;
        final float f8;
        final float f9;
        final Engine engine2;
        final WandScene wandScene2;
        final Function1 function12;
        GapComposer gapComposer;
        final String str3;
        final long j2;
        final Longs longs2;
        RecomposeScopeImpl endRestartGroup;
        float f10;
        Throwable th;
        Function1 function13;
        float f11;
        int i18;
        long j3;
        String str4;
        float f12;
        WandScene wandScene3;
        float f13;
        Engine engine3;
        Longs longs3;
        Engine engine4;
        String str5;
        long j4;
        Boolean bool;
        WandScene wandScene4;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1202518489);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= (i & 512) == 0 ? gapComposer2.changed(quat) : gapComposer2.changedInstance(quat) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= (i & 4096) == 0 ? gapComposer2.changed(vector3) : gapComposer2.changedInstance(vector3) ? 2048 : 1024;
        }
        int i19 = i3 & 16;
        int i20 = PKIFailureInfo.certRevoked;
        if (i19 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= gapComposer2.changed(f2) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
                str2 = str;
            } else {
                str2 = str;
                if ((i & 196608) == 0) {
                    i4 |= gapComposer2.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
            }
            i6 = i3 & 64;
            int i21 = PKIFailureInfo.signerNotTrusted;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= gapComposer2.changed(j) ? PKIFailureInfo.badCertTemplate : 524288;
            }
            if ((i & 12582912) != 0) {
                i7 = i4 | (gapComposer2.changed(z) ? 8388608 : 4194304);
            } else {
                i7 = i4;
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i7 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i7 |= gapComposer2.changed(f3) ? 67108864 : 33554432;
            }
            i9 = i3 & 512;
            if (i9 == 0) {
                i7 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i10 = i9;
                i7 |= gapComposer2.changed(f4) ? PKIFailureInfo.duplicateCertReq : 268435456;
                i11 = i3 & 1024;
                if (i11 != 0) {
                    i13 = i2 | 6;
                    i12 = i11;
                } else if ((i2 & 6) == 0) {
                    i12 = i11;
                    i13 = i2 | (gapComposer2.changed(f5) ? 4 : 2);
                } else {
                    i12 = i11;
                    i13 = i2;
                }
                if ((i2 & 48) == 0) {
                    i13 |= gapComposer2.changed(wandEdition == null ? -1 : wandEdition.ordinal()) ? 32 : 16;
                }
                int i22 = i13;
                if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i22 |= 128;
                }
                int i23 = i22 | 3072;
                i14 = i3 & 16384;
                if (i14 != 0) {
                    i15 = i22 | 27648;
                } else if ((i2 & 24576) == 0) {
                    if ((i2 & 32768) == 0 ? gapComposer2.changed(engine) : gapComposer2.changedInstance(engine)) {
                        i20 = 16384;
                    }
                    i15 = i23 | i20;
                } else {
                    i15 = i23;
                }
                i16 = i3 & 32768;
                if (i16 != 0) {
                    i15 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i15 |= gapComposer2.changedInstance(wandScene) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                i17 = i3 & 65536;
                if (i17 != 0) {
                    i15 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (gapComposer2.changedInstance(function1)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    }
                    i15 |= i21;
                }
                if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (599187 & i15) != 599186)) {
                    gapComposer2.startDefaults();
                    if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                        f10 = i19 != 0 ? 1.0f : f2;
                        if (i5 != 0) {
                            str2 = null;
                        }
                        long j5 = i6 != 0 ? Color.White : j;
                        float f14 = i8 != 0 ? RecyclerView.DECELERATION_RATE : f3;
                        float f15 = i10 != 0 ? 1.0f : f4;
                        float f16 = i12 == 0 ? f5 : 1.0f;
                        GLSurfaceConfig$TextureView gLSurfaceConfig$TextureView = GLSurfaceConfig$TextureView.INSTANCE;
                        int i24 = i15 & (-897);
                        Engine engine5 = i14 != 0 ? null : engine;
                        WandScene wandScene5 = i16 != 0 ? null : wandScene;
                        th = null;
                        if (i17 != 0) {
                            Object rememberedValue = gapComposer2.rememberedValue();
                            if (rememberedValue == neverEqualPolicy) {
                                rememberedValue = new CardStudioQueries$$ExternalSyntheticLambda3(12);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            i18 = i24;
                            function13 = (Function1) rememberedValue;
                            j3 = j5;
                            str4 = str2;
                            wandScene3 = wandScene5;
                            f13 = f15;
                            engine3 = engine5;
                            longs3 = gLSurfaceConfig$TextureView;
                            f11 = f16;
                            f12 = f14;
                        } else {
                            function13 = function1;
                            f11 = f16;
                            i18 = i24;
                            j3 = j5;
                            str4 = str2;
                            f12 = f14;
                            wandScene3 = wandScene5;
                            f13 = f15;
                            engine3 = engine5;
                            longs3 = gLSurfaceConfig$TextureView;
                        }
                    } else {
                        gapComposer2.skipToGroupEnd();
                        int i25 = i15 & (-897);
                        f10 = f2;
                        j3 = j;
                        f13 = f4;
                        f11 = f5;
                        longs3 = longs;
                        engine3 = engine;
                        wandScene3 = wandScene;
                        function13 = function1;
                        i18 = i25;
                        str4 = str2;
                        th = null;
                        f12 = f3;
                    }
                    gapComposer2.endDefaults();
                    if (((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                        gapComposer2.startReplaceGroup(-92567432);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer2.applier == null) {
                            Updater.invalidApplier();
                            throw th;
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
                        Room.m1165Text25TpFw(0, 0, 0, 0, 3462, 0, 4082, Color.White, (Composer) gapComposer2, (Modifier) null, new TextStyle(0L, Room.getSp(24), null, null, 0L, 0L, 0, 0, 0L, null, 16777213), (TextLineBalancing) null, "🪄 Wand", (Map) null, (Function1) null, false);
                        gapComposer2.end(true);
                        gapComposer2.end(false);
                        RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                        if (endRestartGroup2 != null) {
                            final float f17 = f12;
                            final int i26 = 0;
                            final float f18 = f13;
                            final float f19 = f11;
                            final Longs longs4 = longs3;
                            final Engine engine6 = engine3;
                            final String str6 = str4;
                            final WandScene wandScene6 = wandScene3;
                            final long j6 = j3;
                            final Function1 function14 = function13;
                            final float f20 = f10;
                            endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.card.onboarding.graphics.WandEffectKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    int i27 = i26;
                                    int i28 = i2;
                                    int i29 = i;
                                    switch (i27) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int updateChangedFlags = Updater.updateChangedFlags(i29 | 1);
                                            int updateChangedFlags2 = Updater.updateChangedFlags(i28);
                                            FlowsKt.m3443WandEffect37dI38Q(modifier, f, quat, vector3, f20, str6, j6, z, f17, f18, f19, wandEdition, longs4, engine6, wandScene6, function14, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int updateChangedFlags3 = Updater.updateChangedFlags(i29 | 1);
                                            int updateChangedFlags4 = Updater.updateChangedFlags(i28);
                                            FlowsKt.m3443WandEffect37dI38Q(modifier, f, quat, vector3, f20, str6, j6, z, f17, f18, f19, wandEdition, longs4, engine6, wandScene6, function14, (Composer) obj, updateChangedFlags3, updateChangedFlags4, i3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    quat2 = quat;
                    float f21 = f12;
                    float f22 = f13;
                    float f23 = f10;
                    float f24 = f11;
                    Longs longs5 = longs3;
                    engine2 = engine3;
                    WandScene wandScene7 = wandScene3;
                    long j7 = j3;
                    Function1 function15 = function13;
                    gapComposer2.startReplaceGroup(-92397335);
                    gapComposer2.end(false);
                    Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
                    int i27 = i18 & 57344;
                    int i28 = i18;
                    boolean changed = gapComposer2.changed(coroutineScope) | (i27 == 16384 || ((i28 & 32768) != 0 && gapComposer2.changed(engine2)));
                    ?? rememberedValue3 = gapComposer2.rememberedValue();
                    Engine engine7 = rememberedValue3;
                    if (changed || rememberedValue3 == neverEqualPolicy) {
                        if (engine2 == null) {
                            Engine engine8 = new Engine(coroutineScope);
                            engine8.initialize();
                            engine4 = engine8;
                        } else {
                            engine4 = engine2;
                        }
                        gapComposer2.updateRememberedValue(engine4);
                        engine7 = engine4;
                    }
                    Engine engine9 = engine7;
                    boolean changedInstance = (i27 == 16384 || ((i28 & 32768) != 0 && gapComposer2.changedInstance(engine2))) | gapComposer2.changedInstance(engine9);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new WandEffectKt$$ExternalSyntheticLambda2(engine2, engine9, 0);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    Updater.DisposableEffect(engine9, engine2, (Function1) rememberedValue4, gapComposer2);
                    boolean changed2 = gapComposer2.changed(engine9) | ((i28 & 112) == 32) | gapComposer2.changed(wandScene7);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue5 == neverEqualPolicy) {
                        WandScene wandScene8 = wandScene7 == null ? new WandScene(context, engine9, wandEdition) : wandScene7;
                        wandScene8.requestedScale = f;
                        wandScene8.applyScale();
                        wandScene8.setRotation(quat2);
                        wandScene8.setPosition(vector3);
                        wandScene8.setOpacity(f23);
                        function15.invoke(wandScene8);
                        gapComposer2.updateRememberedValue(wandScene8);
                        rememberedValue5 = wandScene8;
                    }
                    WandScene wandScene9 = (WandScene) rememberedValue5;
                    boolean changedInstance2 = gapComposer2.changedInstance(wandScene7) | gapComposer2.changedInstance(wandScene9);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new BorrowHomeKt$$ExternalSyntheticLambda1(26, wandScene7, wandScene9);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    Updater.DisposableEffect(wandScene9, wandScene7, (Function1) rememberedValue6, gapComposer2);
                    MutableState rememberUpdatedState = Updater.rememberUpdatedState(Float.valueOf(f), gapComposer2);
                    MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(quat2, gapComposer2);
                    MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(vector3, gapComposer2);
                    MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(Float.valueOf(f23), gapComposer2);
                    boolean changed3 = gapComposer2.changed(rememberUpdatedState) | gapComposer2.changed(rememberUpdatedState2) | gapComposer2.changed(rememberUpdatedState3) | gapComposer2.changed(rememberUpdatedState4) | gapComposer2.changedInstance(wandScene9);
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new RealBlockersHelper$skipBlocker$1(rememberUpdatedState, rememberUpdatedState2, rememberUpdatedState3, rememberUpdatedState4, wandScene9, null, 12);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    Updater.LaunchedEffect(gapComposer2, wandScene9, (Function2) rememberedValue7);
                    Color color = new Color(j7);
                    int i29 = i7 & 458752;
                    boolean changedInstance3 = ((i7 & 3670016) == 1048576) | (i29 == 131072) | gapComposer2.changedInstance(wandScene9);
                    Object rememberedValue8 = gapComposer2.rememberedValue();
                    if (changedInstance3 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new FlashControl$applyScreenFlash$2(str4, wandScene9, j7, (Continuation) null, 7);
                        str5 = str4;
                        j4 = j7;
                        gapComposer2.updateRememberedValue(rememberedValue8);
                    } else {
                        str5 = str4;
                        j4 = j7;
                    }
                    Updater.LaunchedEffect(wandScene9, str5, color, (Function2) rememberedValue8, gapComposer2);
                    Boolean valueOf = Boolean.valueOf(z);
                    boolean changedInstance4 = gapComposer2.changedInstance(wandScene9) | (i29 == 131072) | ((i7 & 29360128) == 8388608);
                    Object rememberedValue9 = gapComposer2.rememberedValue();
                    if (changedInstance4 || rememberedValue9 == neverEqualPolicy) {
                        String str7 = str5;
                        bool = valueOf;
                        InteractiveCardState$animateLock$2 interactiveCardState$animateLock$2 = new InteractiveCardState$animateLock$2((Object) wandScene9, (Object) str7, z, (Continuation) th, 6);
                        wandScene4 = wandScene9;
                        str5 = str7;
                        gapComposer2.updateRememberedValue(interactiveCardState$animateLock$2);
                        rememberedValue9 = interactiveCardState$animateLock$2;
                    } else {
                        wandScene4 = wandScene9;
                        bool = valueOf;
                    }
                    Updater.LaunchedEffect(wandScene4, str5, bool, (Function2) rememberedValue9, gapComposer2);
                    MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(Float.valueOf(f21), gapComposer2);
                    MutableState rememberUpdatedState6 = Updater.rememberUpdatedState(Float.valueOf(f22), gapComposer2);
                    MutableState rememberUpdatedState7 = Updater.rememberUpdatedState(Float.valueOf(f24), gapComposer2);
                    boolean changed4 = gapComposer2.changed(rememberUpdatedState5) | gapComposer2.changed(rememberUpdatedState6) | gapComposer2.changed(rememberUpdatedState7) | gapComposer2.changedInstance(wandScene4);
                    Object rememberedValue10 = gapComposer2.rememberedValue();
                    if (changed4 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new VerifyCheckDepositPresenter$models$3$1(rememberUpdatedState5, rememberUpdatedState6, rememberUpdatedState7, (Scene) wandScene4, (Continuation) null, 6);
                        gapComposer2.updateRememberedValue(rememberedValue10);
                    }
                    Updater.LaunchedEffect(gapComposer2, wandScene4, (Function2) rememberedValue10);
                    ByteStreamsKt.SwampGLEffect(modifier, engine9, wandScene4, longs5, false, null, null, gapComposer2, (i7 & 14) | 64 | ((i28 << 3) & 57344), 96);
                    wandScene2 = wandScene7;
                    f7 = f21;
                    longs2 = longs5;
                    f9 = f24;
                    f8 = f22;
                    f6 = f23;
                    function12 = function15;
                    str3 = str5;
                    gapComposer = gapComposer2;
                    j2 = j4;
                } else {
                    quat2 = quat;
                    gapComposer2.skipToGroupEnd();
                    f6 = f2;
                    f7 = f3;
                    f8 = f4;
                    f9 = f5;
                    engine2 = engine;
                    wandScene2 = wandScene;
                    function12 = function1;
                    gapComposer = gapComposer2;
                    str3 = str2;
                    j2 = j;
                    longs2 = longs;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i30 = 1;
                    final Quat quat3 = quat2;
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.card.onboarding.graphics.WandEffectKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i272 = i30;
                            int i282 = i2;
                            int i292 = i;
                            switch (i272) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(i292 | 1);
                                    int updateChangedFlags2 = Updater.updateChangedFlags(i282);
                                    FlowsKt.m3443WandEffect37dI38Q(modifier, f, quat3, vector3, f6, str3, j2, z, f7, f8, f9, wandEdition, longs2, engine2, wandScene2, function12, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags3 = Updater.updateChangedFlags(i292 | 1);
                                    int updateChangedFlags4 = Updater.updateChangedFlags(i282);
                                    FlowsKt.m3443WandEffect37dI38Q(modifier, f, quat3, vector3, f6, str3, j2, z, f7, f8, f9, wandEdition, longs2, engine2, wandScene2, function12, (Composer) obj, updateChangedFlags3, updateChangedFlags4, i3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i10 = i9;
            i11 = i3 & 1024;
            if (i11 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i222 = i13;
            if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            }
            int i232 = i222 | 3072;
            i14 = i3 & 16384;
            if (i14 != 0) {
            }
            i16 = i3 & 32768;
            if (i16 != 0) {
            }
            i17 = i3 & 65536;
            if (i17 != 0) {
            }
            if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (599187 & i15) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        int i212 = PKIFailureInfo.signerNotTrusted;
        if (i6 == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & 1024;
        if (i11 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i2222 = i13;
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        int i2322 = i2222 | 3072;
        i14 = i3 & 16384;
        if (i14 != 0) {
        }
        i16 = i3 & 32768;
        if (i16 != 0) {
        }
        i17 = i3 & 65536;
        if (i17 != 0) {
        }
        if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (599187 & i15) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final FlowKt__MergeKt$flatMapMerge$$inlined$map$1 animatedFlow(State state, long j, long j2) {
        state.getClass();
        Continuation continuation = null;
        int i = 0;
        FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(FlowKt.transformLatest(Updater.snapshotFlow(new NavHostKt$$ExternalSyntheticLambda8(state, 21)), new FlowsKt$tickerFlow$2(j, null)), new FlowsKt$animatedFlow$1(j2, continuation, i), i);
        int i2 = 1;
        return new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(4, FlowKt.mapLatest(new FlowsKt$animatedFlow$1(j2, continuation, i2), flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1), new DataStoreImpl$data$1.AnonymousClass5(3, continuation, i2));
    }

    public static WandStatePose blend(WandStatePose wandStatePose, WandStatePose wandStatePose2, float f) {
        wandStatePose.getClass();
        float max = Math.max(RecyclerView.DECELERATION_RATE, Math.min(1.0f, f));
        Vector3 vector3 = wandStatePose.positionOffset;
        float f2 = vector3.x;
        Vector3 vector32 = wandStatePose2.positionOffset;
        Vector3 vector33 = new Vector3(lerp(f2, vector32.x, max), lerp(vector3.y, vector32.y, max), lerp(vector3.z, vector32.z, max));
        Vector3 vector34 = wandStatePose.eulerOffset;
        float f3 = vector34.x;
        Vector3 vector35 = wandStatePose2.eulerOffset;
        return new WandStatePose(vector33, new Vector3(slerpAngle(f3, vector35.x, max), slerpAngle(vector34.y, vector35.y, max), slerpAngle(vector34.z, vector35.z, max)), lerp(wandStatePose.scale, wandStatePose2.scale, max), lerp(wandStatePose.opacity, wandStatePose2.opacity, max), lerp(wandStatePose.darkening, wandStatePose2.darkening, max), lerp(wandStatePose.lightIntensity, wandStatePose2.lightIntensity, max), lerp(wandStatePose.saturation, wandStatePose2.saturation, max));
    }

    public static String buildFragmentShader(String str, String str2, boolean z) {
        String str3 = z ? "varying float vInstanceOpacity;" : "";
        String str4 = z ? "" : "uniform float uOpacity;";
        String str5 = z ? "vInstanceOpacity" : "uOpacity";
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n    precision mediump float;\n\n    // No OES_depth_texture #extension: it's core in GLES 3 and the emulator rejects the directive.\n\n    // Varyings (from vertex shader)\n    varying vec3 vPosition;\n    varying vec3 vObjectPosition;  // pre-transform aPosition (model space) for procedural noise\n    varying vec3 vNormal;\n    varying vec3 vTangent;\n    varying vec3 vBitangent;\n    varying vec2 vUV;\n    ", str3, "\n\n    // Camera + standard PBR uniforms (bound by PBRMaterial.bindStandardPBRUniforms).\n    uniform vec3 uCameraPosition;\n    ", str4, "\n    uniform float uDimmer;\n    uniform float uSaturation;\n    uniform float uCrossfadeMultiplier;\n    uniform vec3 uBaseColor;\n    uniform float uRoughness;\n    uniform float uMetallic;\n    uniform float uClearCoat;\n    uniform float uClearCoatRoughness;\n    uniform vec3 uEmissive;\n    uniform float uDiffuseIBL;  // Bound by PBRMaterial; ignored here — the wand rig uses fixed directional + IBL specular.\n\n    // IBL uniforms (declarations live in [IblShaders.UNIFORMS]).\n    \n    uniform samplerCube uIblCubemapMip0;\n    uniform samplerCube uIblCubemapMip1;\n    uniform samplerCube uIblCubemapMip2;\n    uniform samplerCube uIblCubemapMip3;\n    uniform float uIblNumMipLevels;\n    uniform float uIblIntensity;\n    \n\n    // uShadowsEnabled = scene gate; uKeyCastsShadow = per-material opt-in. Depth comes back in .r.\n    uniform sampler2D uShadowMap;\n    uniform mat4 uLightViewProjection;\n    // Packed-atlas mode (uShadowAtlasGrid > 1.5): one draw per card, uShadowCellIndex picks the\n    // cell the receiver remaps NDC into.\n    uniform float uShadowAtlasGrid;\n    uniform float uShadowCellIndex;\n    // Cell extent in atlas-UV; integer-floored cellPx means this can differ from 1/grid.\n    uniform float uShadowCellScale;\n    uniform float uShadowsEnabled;\n    uniform float uKeyCastsShadow;\n    uniform float uShadowMapTexel;\n    uniform float uShadowBiasMin;\n    uniform float uShadowBiasMax;\n    // Shadow factor gamma; >1 darkens partial PCF averages on coarse texels.\n    uniform float uShadowStrength;\n    uniform int uUsePcf;\n\n    // Material-specific uniforms.\n    ");
        Boxes$$ExternalSyntheticOutline1.m(m, str, "\n\n    \n    struct MaterialInputs {\n      vec3 baseColor;\n      float opacity;\n      float roughness;\n      float metallic;\n      float clearCoat;\n      float clearCoatRoughness;\n      vec3 emissive;\n      vec3 normal;  // Tangent-space normal offset from texture (set by material)\n    };\n  \n\n    // -- Lighting rig (matches iOS WandLighting.swift; see WandLightingShaders.kt comment) --\n    const float PI = 3.14159265359;\n\n    // TOWARD-light dirs; KEY = LIGHT_KEY_L. Shading stays directional (decoupled from the shadow\n    // VP) to avoid spotlight saturation on metallics.\n    const vec3 LIGHT_KEY_L     = vec3( 0.5529,  0.5584,  0.6186);\n    const vec3 LIGHT_FILL_L    = vec3(-0.7500, -0.5000,  0.4330);\n    const vec3 LIGHT_RIM_L     = vec3( 0.0000, -0.5878, -0.8090);\n    const vec3 LIGHT_ACCENT_L  = vec3(-0.9239, -0.3827,  0.0000);\n\n    const vec3  LIGHT_KEY_COLOR     = vec3(1.00, 1.00, 1.00);\n    const vec3  LIGHT_FILL_COLOR    = vec3(0.90, 0.90, 0.90);\n    const vec3  LIGHT_RIM_COLOR     = vec3(1.00, 1.00, 1.00);\n    const vec3  LIGHT_ACCENT_COLOR  = vec3(0.95, 0.95, 0.95);\n    const vec3  AMBIENT_COLOR       = vec3(1.00, 1.00, 1.00);\n\n    // Light intensities — per-material uniforms so the demo app can sweep them. Defaults\n    // (set by [WandPBRMaterial]) are SceneKit's lumens-equivalent values × π to compensate\n    // for the explicit Lambertian /π divide our shader does (SceneKit pre-applies that\n    // internally). Without this scale, the wand renders ~3× too dark vs iOS.\n    uniform float uKeyIntensity;\n    uniform float uFillIntensity;\n    uniform float uRimIntensity;\n    uniform float uAccentIntensity;\n    uniform float uAmbientIntensity;\n\n    // Set by prepareMaterial — world-space shading normal after TBN.\n    vec3 shading_normal;\n\n    void prepareMaterial(inout MaterialInputs inputs) {\n      vec3 N = normalize(vNormal);\n      vec3 T = normalize(vTangent);\n      vec3 B = normalize(vBitangent);\n      mat3 TBN = mat3(T, B, N);\n      shading_normal = normalize(TBN * inputs.normal);\n    }\n\n    // IBL helpers — shared with [PBRShaders] via [IblShaders.FUNCTIONS]; only used if iblData\n    // is bound (samplers default to texture unit 0 and return zero otherwise).\n    \n    // Decode RGBM-encoded HDR color: alpha carries an exponent over an 8.0 range, RGB is sRGB.\n    vec3 decodeRGBM(vec4 rgbm) {\n      float range = 8.0;\n      vec3 rgb = pow(rgbm.rgb, vec3(1.0 / 2.2)); // sRGB to linear\n      return rgb * rgbm.a * range;\n    }\n\n    // Sample IBL cubemap with mip-level selection. Lower mips = more blurred / lower frequency,\n    // used for matte diffuse lookups; higher mips for sharp specular reflections.\n    vec3 sampleCubemapLod(vec3 dir, float lod) {\n      // Flip X axis to match coordinate system used by exported cubemaps.\n      dir.x = -dir.x;\n\n      float mipLevel = clamp(lod, 0.0, uIblNumMipLevels - 1.0);\n      float mipLower = floor(mipLevel);\n      float mipUpper = ceil(mipLevel);\n      float mipBlend = fract(mipLevel);\n\n      vec3 colorLower = vec3(0.0);\n      vec3 colorUpper = vec3(0.0);\n\n      if (mipLower == 0.0) colorLower = decodeRGBM(textureCube(uIblCubemapMip0, dir));\n      else if (mipLower == 1.0) colorLower = decodeRGBM(textureCube(uIblCubemapMip1, dir));\n      else if (mipLower == 2.0) colorLower = decodeRGBM(textureCube(uIblCubemapMip2, dir));\n      else if (mipLower == 3.0) colorLower = decodeRGBM(textureCube(uIblCubemapMip3, dir));\n\n      if (mipUpper == 0.0) colorUpper = decodeRGBM(textureCube(uIblCubemapMip0, dir));\n      else if (mipUpper == 1.0) colorUpper = decodeRGBM(textureCube(uIblCubemapMip1, dir));\n      else if (mipUpper == 2.0) colorUpper = decodeRGBM(textureCube(uIblCubemapMip2, dir));\n      else if (mipUpper == 3.0) colorUpper = decodeRGBM(textureCube(uIblCubemapMip3, dir));\n\n      return mix(colorLower, colorUpper, mipBlend);\n    }\n\n    // Convert perceptual roughness in [0..1] to a mip level for [sampleCubemapLod].\n    float perceptualRoughnessToMip(float perceptualRoughness) {\n      return perceptualRoughness * (uIblNumMipLevels - 1.0);\n    }\n    \n\n    // 1.0 = lit, 0.0 = shadowed. Atlas mode remaps NDC → cell UV; single-map uses the full map.\n    float computeKeyShadowFactor(vec3 worldPos, vec3 N, vec3 L) {\n      if (uShadowsEnabled < 0.5 || uKeyCastsShadow < 0.5) return 1.0;\n\n      bool atlasMode = uShadowAtlasGrid > 1.5;\n      float cellU = 0.0;\n      float cellV = 0.0;\n      // Offset + extent both use uShadowCellScale so sampling matches the depth pass viewport.\n      float cellExtent = 1.0;\n      if (atlasMode) {\n        float grid = uShadowAtlasGrid;\n        cellExtent = uShadowCellScale;\n        float idx = clamp(uShadowCellIndex, 0.0, grid * grid - 1.0);\n        float col = mod(idx, grid);\n        float row = floor(idx / grid);\n        cellU = col * cellExtent;\n        cellV = row * cellExtent;\n      }\n\n      vec4 lightClip = uLightViewProjection * vec4(worldPos, 1.0);\n      vec3 ndc = lightClip.xyz / lightClip.w;\n      vec3 cellUV = ndc * 0.5 + 0.5;\n      // Cull receivers outside their cell-local frustum (saves an out-of-cell atlas sample).\n      if (cellUV.x < 0.0 || cellUV.x > 1.0 ||\n          cellUV.y < 0.0 || cellUV.y > 1.0 ||\n          cellUV.z < 0.0 || cellUV.z > 1.0) return 1.0;\n\n      // Compress cell-local [0,1] → [cellU, cellU+extent]; identity in single-map mode.\n      vec2 atlasUV = vec2(cellU + cellUV.x * cellExtent, cellV + cellUV.y * cellExtent);\n\n      float nDotL = max(dot(N, L), 0.0);\n      // Slope-scaled bias — mirrors ShadowConfig.slopeScaledBias (test-pinned); keep in sync.\n      float bias = max(uShadowBiasMax * (1.0 - nDotL), uShadowBiasMin);\n      float receiverDepth = cellUV.z - bias;\n\n      float texelStep = uShadowMapTexel;\n      // Inset taps half a texel: a boundary tap (cellUV == 1.0) can resolve into the neighbor cell.\n      float halfTexel = 0.5 * uShadowMapTexel;\n      vec2 cellMin = vec2(cellU, cellV) + halfTexel;\n      vec2 cellMax = vec2(cellU + cellExtent, cellV + cellExtent) - halfTexel;\n      if (uUsePcf == 1) {\n        float sum = 0.0;\n        for (int dy = -1; dy <= 1; ++dy) {\n          for (int dx = -1; dx <= 1; ++dx) {\n            vec2 offset = vec2(float(dx), float(dy)) * texelStep;\n            vec2 sampleUV = clamp(atlasUV + offset, cellMin, cellMax);\n            float sampled = texture2D(uShadowMap, sampleUV).r;\n            sum += (receiverDepth > sampled) ? 0.0 : 1.0;\n          }\n        }\n        return sum * (1.0 / 9.0);\n      } else {\n        float sampled = texture2D(uShadowMap, clamp(atlasUV, cellMin, cellMax)).r;\n        return (receiverDepth > sampled) ? 0.0 : 1.0;\n      }\n    }\n\n    // Cook-Torrance BRDF for one directional light.\n    vec3 evalDirectional(\n      vec3 L, vec3 lightColor, float intensity,\n      vec3 N, vec3 V,\n      vec3 baseColor, float roughness, float metallic\n    ) {\n      float NdotL = max(dot(N, L), 0.0);\n      if (NdotL < 0.0001) return vec3(0.0);\n\n      vec3 H = normalize(L + V);\n      float NdotV = max(dot(N, V), 0.0001);\n      float NdotH = max(dot(N, H), 0.0);\n      float HdotV = max(dot(H, V), 0.0);\n\n      // Filament cross(N,H) GGX: avoids the mediump 1-NdotH² cancellation (low-roughness chip\n      // flickered black/white); the (NdotH*alpha)² term also bounds D away from Inf.\n      float alpha = roughness * roughness;\n      vec3 nxh = cross(N, H);\n      float ndfA = NdotH * alpha;\n      float ndfK = alpha / (dot(nxh, nxh) + ndfA * ndfA);\n      float D = ndfK * ndfK * (1.0 / PI);\n\n      // Smith / Schlick-GGX geometry term.\n      float k = (roughness + 1.0) * (roughness + 1.0) / 8.0;\n      float Gv = NdotV / (NdotV * (1.0 - k) + k);\n      float Gl = NdotL / (NdotL * (1.0 - k) + k);\n      float G = Gv * Gl;\n\n      // Schlick fresnel.\n      vec3 F0 = mix(vec3(0.04), baseColor, metallic);\n      vec3 F = F0 + (1.0 - F0) * pow(1.0 - HdotV, 5.0);\n\n      vec3 specular = (D * G * F) / max(4.0 * NdotL * NdotV, 0.001);\n\n      vec3 kS = F;\n      vec3 kD = (vec3(1.0) - kS) * (1.0 - metallic);\n      vec3 diffuse = kD * baseColor / PI;\n\n      return (diffuse + specular) * lightColor * intensity * NdotL;\n    }\n\n    vec3 evaluateWandLighting(MaterialInputs inputs) {\n      vec3 N = normalize(shading_normal);\n      vec3 V = normalize(uCameraPosition - vPosition);\n      vec3 baseColor = inputs.baseColor;\n      float roughness = inputs.roughness;\n      float metallic = inputs.metallic;\n\n      // Shadow bias uses the un-perturbed normal so slope-bias doesn't track bump noise.\n      vec3 N_geom = normalize(vNormal);\n      vec3 color = vec3(0.0);\n      float keyShadow = computeKeyShadowFactor(vPosition, N_geom, LIGHT_KEY_L);\n      // pow keeps 0 and 1 fixed; only PCF partials darken when uShadowStrength > 1.\n      keyShadow = pow(keyShadow, uShadowStrength);\n      color += keyShadow * evalDirectional(\n        LIGHT_KEY_L, LIGHT_KEY_COLOR, uKeyIntensity,\n        N, V, baseColor, roughness, metallic\n      );\n      color += evalDirectional(\n        LIGHT_FILL_L, LIGHT_FILL_COLOR, uFillIntensity,\n        N, V, baseColor, roughness, metallic\n      );\n      color += evalDirectional(\n        LIGHT_RIM_L, LIGHT_RIM_COLOR, uRimIntensity,\n        N, V, baseColor, roughness, metallic\n      );\n      color += evalDirectional(\n        LIGHT_ACCENT_L, LIGHT_ACCENT_COLOR, uAccentIntensity,\n        N, V, baseColor, roughness, metallic\n      );\n\n      // Ambient — cheap approximation (no per-fragment hemispheric term).\n      color += baseColor * AMBIENT_COLOR * uAmbientIntensity;\n\n      // IBL specular on top of the directional rig — gives environment-coupled highlights\n      // without doubling diffuse (the directionals + ambient already cover diffuse). When the\n      // host scene doesn't bind an IBL, the samplers return zero and contribute nothing.\n      float NdotV = clamp(dot(N, V), 0.001, 1.0);\n      vec3 F0 = mix(vec3(0.04), baseColor, metallic);\n      vec3 fresnel = F0 + (1.0 - F0) * pow(1.0 - NdotV, 5.0);\n      vec3 reflectDir = reflect(-V, N);\n      vec3 specularIBL =\n        sampleCubemapLod(reflectDir, perceptualRoughnessToMip(roughness)) * uIblIntensity;\n      color += specularIBL * fresnel;\n\n      color += inputs.emissive;\n      return color;\n    }\n\n    // Material function (provided by material plugin).\n    ", str2, "\n\n    void main() {\n      MaterialInputs inputs;\n      inputs.baseColor = uBaseColor;\n      inputs.opacity = ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, str5, ";\n      inputs.roughness = uRoughness;\n      inputs.metallic = uMetallic;\n      inputs.clearCoat = uClearCoat;\n      inputs.clearCoatRoughness = uClearCoatRoughness;\n      inputs.emissive = uEmissive;\n      inputs.normal = vec3(0.0, 0.0, 1.0);\n\n      material(inputs);\n\n      vec3 litColor = evaluateWandLighting(inputs);\n      litColor = mix(litColor, vec3(0.0), uDimmer);\n\n      // Luma-preserving desaturation (uSaturation == 1 → mix is a no-op).\n      float luma = dot(litColor, vec3(0.2126, 0.7152, 0.0722));\n      litColor = mix(vec3(luma), litColor, uSaturation);\n\n      float finalOpacity = inputs.opacity * uCrossfadeMultiplier;\n      gl_FragColor = vec4(litColor * finalOpacity, finalOpacity);\n    }\n    ");
    }

    public static MiniCardScene.MaterialSpec chipSpecFor(MiniCardEdition miniCardEdition) {
        miniCardEdition.getClass();
        int ordinal = miniCardEdition.ordinal();
        if (ordinal == 0) {
            return new MiniCardScene.MaterialSpec(0.2f, 0.6f, android.graphics.Color.rgb(EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC0170g.SDK_ASSET_ICON_QUESTION_VALUE, 224));
        }
        if (ordinal == 1) {
            return new MiniCardScene.MaterialSpec(0.2f, 0.6f, android.graphics.Color.rgb(EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, 91));
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final float crossSign(float[] fArr, int i, int i2, int i3) {
        int i4 = i * 2;
        float f = fArr[i4];
        float f2 = fArr[i4 + 1];
        int i5 = i2 * 2;
        float f3 = fArr[i5];
        float f4 = fArr[i5 + 1];
        int i6 = i3 * 2;
        float f5 = fArr[i6];
        return ((fArr[i6 + 1] - f2) * (f3 - f)) - ((f5 - f) * (f4 - f2));
    }

    public static Vector3 euler(float f, float f2, float f3) {
        return new Vector3(f * 0.017453292f, f2 * 0.017453292f, f3 * 0.017453292f);
    }

    public static final AABB inflated(AABB aabb, float f, float f2, float f3) {
        float f4 = aabb.minX;
        float f5 = aabb.maxX;
        float f6 = (f4 + f5) * 0.5f;
        float f7 = aabb.minY;
        float f8 = aabb.maxY;
        float f9 = (f7 + f8) * 0.5f;
        float f10 = aabb.minZ;
        float f11 = aabb.maxZ;
        float f12 = (f10 + f11) * 0.5f;
        float f13 = (f5 - f4) * 0.5f * f;
        float f14 = (f8 - f7) * 0.5f * f2;
        float f15 = (f11 - f10) * 0.5f * f3;
        return new AABB(f6 - f13, f9 - f14, f12 - f15, f6 + f13, f9 + f14, f12 + f15);
    }

    public static float lerp(float f, float f2, float f3) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(f2, f, f3, f);
    }

    public static WandPBRMaterial materialFor(Engine engine, String str, boolean z, WandEdition wandEdition) {
        WandScene$Companion$WandMaterialSpec wandScene$Companion$WandMaterialSpec;
        engine.getClass();
        wandEdition.getClass();
        if (str.equals("Wand_Body")) {
            wandScene$Companion$WandMaterialSpec = (WandScene$Companion$WandMaterialSpec) MapsKt__MapsKt.getValue(WandScene.SUBMESH_MATERIALS, "Wand_Body");
        } else if (str.equals("Gem")) {
            int ordinal = wandEdition.ordinal();
            if (ordinal == 0) {
                wandScene$Companion$WandMaterialSpec = new WandScene$Companion$WandMaterialSpec(0.27f, 0.15f, android.graphics.Color.rgb(EnumC0170g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC0170g.SDK_ASSET_ICON_PIN_VALUE, EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE));
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                wandScene$Companion$WandMaterialSpec = new WandScene$Companion$WandMaterialSpec(0.27f, 0.15f, android.graphics.Color.rgb(EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
            }
        } else {
            wandScene$Companion$WandMaterialSpec = (WandScene$Companion$WandMaterialSpec) WandScene.SUBMESH_MATERIALS.get(str);
            if (wandScene$Companion$WandMaterialSpec == null) {
                wandScene$Companion$WandMaterialSpec = WandScene.DEFAULT_MATERIAL_SPEC;
            }
        }
        return str.equals("Wand_Body") ? new FresnelPBRMaterial(engine, wandScene$Companion$WandMaterialSpec.roughness, wandScene$Companion$WandMaterialSpec.metallic, z) : new SolidColorPBRMaterial(engine, wandScene$Companion$WandMaterialSpec.baseColor, wandScene$Companion$WandMaterialSpec.roughness, wandScene$Companion$WandMaterialSpec.metallic, z, 16);
    }

    public static WandStatePose pose(WandPose wandPose, float f, WandPoseConfig wandPoseConfig, float f2) {
        wandPose.getClass();
        wandPoseConfig.getClass();
        float max = Math.max(RecyclerView.DECELERATION_RATE, Math.min(1.0f, f2));
        switch (wandPose.ordinal()) {
            case 0:
                return new WandStatePose(new Vector3(RecyclerView.DECELERATION_RATE, (1.0f - ((float) Math.cos(((f / Math.max(wandPoseConfig.floatPeriod, 0.01f)) * 2.0f) * 3.1415927f))) * (-wandPoseConfig.floatAmplitude) * max, RecyclerView.DECELERATION_RATE), euler(wandPoseConfig.floatPitch, wandPoseConfig.floatYaw, wandPoseConfig.floatRoll), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            case 1:
                float max2 = (f / Math.max(wandPoseConfig.stillSwayPeriod, 0.01f)) * 2.0f * 3.1415927f;
                Vector3 euler = euler(wandPoseConfig.stillPitch, wandPoseConfig.stillYaw, wandPoseConfig.stillRoll);
                return new WandStatePose(null, new Vector3(euler.x, euler.y, euler.z + (RecyclerView.DECELERATION_RATE * max * 0.017453292f * ((float) Math.sin(max2)))), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 125);
            case 2:
                float max3 = (f / Math.max(wandPoseConfig.activePeriod, 0.01f)) * 2.0f * 3.1415927f;
                return new WandStatePose(new Vector3(RecyclerView.DECELERATION_RATE, (1.0f - ((float) Math.cos(max3))) * (-wandPoseConfig.activeAmplitude) * max, RecyclerView.DECELERATION_RATE), euler(wandPoseConfig.activePitch, wandPoseConfig.activeYaw, wandPoseConfig.activeRoll), wandPoseConfig.activeScale, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 120);
            case 3:
                float f3 = (wandPoseConfig.twirlRPM / 60.0f) * 2.0f * 3.1415927f;
                Vector3 euler2 = euler(wandPoseConfig.twirlPitch, wandPoseConfig.twirlYaw, wandPoseConfig.twirlRoll);
                return new WandStatePose(null, new Vector3(euler2.x, (f * f3 * max) + euler2.y, euler2.z), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 125);
            case 4:
                return new WandStatePose(null, euler(wandPoseConfig.lockedPitch, wandPoseConfig.lockedYaw, wandPoseConfig.lockedRoll), wandPoseConfig.lockedScale, wandPoseConfig.lockedOpacity, wandPoseConfig.lockedDarkening, wandPoseConfig.lockedLightIntensity, wandPoseConfig.lockedSaturation, 1);
            case 5:
                float max4 = (f / Math.max(wandPoseConfig.leanSwayPeriod, 0.01f)) * 2.0f * 3.1415927f;
                Vector3 euler3 = euler(wandPoseConfig.leanPitch, wandPoseConfig.leanYaw, wandPoseConfig.leanRoll);
                return new WandStatePose(null, new Vector3(euler3.x, euler3.y, euler3.z + (wandPoseConfig.leanSwayAmpDeg * max * 0.017453292f * ((float) Math.sin(max4)))), wandPoseConfig.leanScale, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 121);
            case 6:
                return new WandStatePose(null, euler(wandPoseConfig.reviewPitch, wandPoseConfig.reviewYaw, wandPoseConfig.reviewRoll), wandPoseConfig.reviewScale, wandPoseConfig.reviewOpacity, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 113);
            case 7:
                return new WandStatePose(null, euler(wandPoseConfig.inactivePitch, wandPoseConfig.inactiveYaw, wandPoseConfig.inactiveRoll), wandPoseConfig.inactiveScale, wandPoseConfig.inactiveOpacity, wandPoseConfig.inactiveDarkening, wandPoseConfig.inactiveLightIntensity, wandPoseConfig.inactiveSaturation, 1);
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8, types: [int] */
    public static final boolean projectedAabbContainsPoint(AABB aabb, float[] fArr, float[] fArr2, float[] fArr3, float f, float f2, float f3, float f4) {
        ?? r1;
        ?? r4;
        fArr.getClass();
        fArr2.getClass();
        fArr3.getClass();
        float f5 = aabb.maxX;
        float f6 = RecyclerView.DECELERATION_RATE;
        ?? r5 = 0;
        if (f3 > RecyclerView.DECELERATION_RATE && f4 > RecyclerView.DECELERATION_RATE) {
            float f7 = aabb.minZ;
            float f8 = aabb.maxZ;
            float f9 = aabb.minY;
            float f10 = aabb.maxY;
            float f11 = aabb.minX;
            if (f5 > f11 && f10 > f9 && f8 > f7) {
                float[] fArr4 = scratchVp;
                Matrix.multiplyMM(fArr4, 0, fArr3, 0, fArr2, 0);
                float[] fArr5 = scratchMvp;
                Matrix.multiplyMM(fArr5, 0, fArr4, 0, fArr, 0);
                int i = 0;
                while (true) {
                    float[] fArr6 = scratchHitPoints;
                    if (i >= 8) {
                        float f12 = f6;
                        boolean z = r5;
                        ?? r0 = z;
                        while (true) {
                            r1 = scratchSortIndices;
                            if (r0 >= 8) {
                                break;
                            }
                            r1[r0] = r0;
                            r0++;
                        }
                        for (int i2 = 1; i2 < 8; i2++) {
                            ?? r2 = r1[i2];
                            int i3 = r2 * 2;
                            float f13 = fArr6[i3];
                            float f14 = fArr6[i3 + 1];
                            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                                ?? r8 = r1[i4];
                                int i5 = r8 * 2;
                                float f15 = fArr6[i5];
                                float f16 = fArr6[i5 + 1];
                                if (f15 >= f13 && (f15 != f13 || f16 >= f14)) {
                                    r1[i4 + 1] = r8;
                                }
                                r1[i4 + 1] = r2;
                            }
                            r1[i4 + 1] = r2;
                        }
                        boolean z2 = z;
                        ?? r22 = z2;
                        ?? r02 = z2;
                        while (true) {
                            r4 = scratchHullIndices;
                            if (r02 >= 8) {
                                break;
                            }
                            ?? r6 = r1[r02];
                            while (r22 >= 2 && crossSign(fArr6, r4[r22 - 2], r4[r22 - 1], r6) <= f12) {
                                r22--;
                            }
                            r4[r22] = r6;
                            r22++;
                            r02++;
                        }
                        int i6 = r22 + 1;
                        int i7 = 6;
                        while (-1 < i7) {
                            ?? r7 = r1[i7];
                            while (r22 >= i6 && crossSign(fArr6, r4[r22 - 2], r4[r22 - 1], r7) <= f12) {
                                r22--;
                            }
                            r4[r22] = r7;
                            i7--;
                            r22++;
                        }
                        int i8 = r22 - 1;
                        if (i8 < 3) {
                            return z;
                        }
                        ?? r03 = z;
                        char c = r03;
                        while (r03 < i8) {
                            ?? r52 = r4[r03];
                            r03++;
                            ?? r62 = r4[r03 % i8];
                            int i9 = r52 * 2;
                            float f17 = fArr6[i9];
                            float f18 = fArr6[i9 + 1];
                            int i10 = r62 * 2;
                            float f19 = ((f2 - f18) * (fArr6[i10] - f17)) - ((f - f17) * (fArr6[i10 + 1] - f18));
                            if (f19 > f12) {
                                if (c < 0) {
                                    return z;
                                }
                                c = 1;
                            } else if (f19 >= f12) {
                                continue;
                            } else {
                                if (c > 0) {
                                    return z;
                                }
                                c = 65535;
                            }
                        }
                        return true;
                    }
                    float f20 = (i & 1) == 0 ? f11 : f5;
                    float[] fArr7 = scratchCorner;
                    fArr7[r5] = f20;
                    fArr7[1] = (i & 2) == 0 ? f9 : f10;
                    fArr7[2] = (i & 4) == 0 ? f7 : f8;
                    fArr7[3] = 1.0f;
                    float[] fArr8 = scratchClip;
                    boolean z3 = r5;
                    float f21 = f6;
                    Matrix.multiplyMV(fArr8, 0, fArr5, 0, fArr7, 0);
                    float f22 = fArr8[3];
                    if (f22 <= f21) {
                        return z3;
                    }
                    float f23 = fArr8[z3 ? 1 : 0] / f22;
                    float f24 = fArr8[1] / f22;
                    int i11 = i * 2;
                    fArr6[i11] = Recorder$$ExternalSyntheticOutline2.m$1(f23, 0.5f, 0.5f, f3);
                    fArr6[i11 + 1] = (1.0f - ((f24 * 0.5f) + 0.5f)) * f4;
                    i++;
                    r5 = z3 ? 1 : 0;
                    f6 = f21;
                }
            }
        }
        return false;
    }

    public static final float random(ClosedFloatRange closedFloatRange) {
        Random.Default r0 = Random.Default;
        double floatValue = Float.valueOf(closedFloatRange._start).floatValue();
        double floatValue2 = Float.valueOf(closedFloatRange._endInclusive).floatValue();
        r0.getClass();
        return (float) Random.defaultRandom.nextDouble(floatValue, floatValue2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((androidx.compose.runtime.GapComposer) r7).changed(r6.ordinal()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Pair rememberHeartController(WandPose wandPose, Composer composer, int i) {
        boolean z;
        boolean z2;
        Object rememberedValue;
        wandPose.getClass();
        boolean z3 = true;
        if (((i & 14) ^ 6) > 4) {
        }
        if ((i & 6) != 4) {
            z = false;
            if ((((i & 112) ^ 48) > 32 || !((GapComposer) composer).changed(0.028f)) && (i & 48) != 32) {
                z3 = false;
            }
            z2 = z | z3;
            GapComposer gapComposer = (GapComposer) composer;
            rememberedValue = gapComposer.rememberedValue();
            if (!z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new WandComposeBindingsKt$$ExternalSyntheticLambda0(wandPose, 2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            return rememberTagController((Function0) rememberedValue, gapComposer);
        }
        z = true;
        if (((i & 112) ^ 48) > 32) {
        }
        z3 = false;
        z2 = z | z3;
        GapComposer gapComposer2 = (GapComposer) composer;
        rememberedValue = gapComposer2.rememberedValue();
        if (!z2) {
        }
        rememberedValue = new WandComposeBindingsKt$$ExternalSyntheticLambda0(wandPose, 2);
        gapComposer2.updateRememberedValue(rememberedValue);
        return rememberTagController((Function0) rememberedValue, gapComposer2);
    }

    public static final LightStateImpl rememberLightState(State state, MutableState mutableState, Composer composer, int i) {
        return Files.rememberLightState(AbstractHashFunction.rememberEntityState(null, state, null, composer, 5), new Vector4(RecyclerView.DECELERATION_RATE, -1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE), Updater.rememberUpdatedState(Float.valueOf(RecyclerView.DECELERATION_RATE), composer), Updater.rememberUpdatedState(Float.valueOf(7500.0f), composer), mutableState, composer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((androidx.compose.runtime.GapComposer) r7).changed(r6.ordinal()) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Pair rememberMiniCardController(WandPose wandPose, Composer composer, int i) {
        boolean z;
        boolean z2;
        Object rememberedValue;
        wandPose.getClass();
        int i2 = 1;
        if (((i & 14) ^ 6) > 4) {
        }
        if ((i & 6) != 4) {
            z = false;
            z2 = z | ((((i & 112) ^ 48) > 32 && ((GapComposer) composer).changed(0.028f)) || (i & 48) == 32);
            GapComposer gapComposer = (GapComposer) composer;
            rememberedValue = gapComposer.rememberedValue();
            if (!z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new WandComposeBindingsKt$$ExternalSyntheticLambda0(wandPose, i2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            return rememberTagController((Function0) rememberedValue, gapComposer);
        }
        z = true;
        if (((i & 112) ^ 48) > 32) {
            z2 = z | ((((i & 112) ^ 48) > 32 && ((GapComposer) composer).changed(0.028f)) || (i & 48) == 32);
            GapComposer gapComposer2 = (GapComposer) composer;
            rememberedValue = gapComposer2.rememberedValue();
            if (!z2) {
            }
            rememberedValue = new WandComposeBindingsKt$$ExternalSyntheticLambda0(wandPose, i2);
            gapComposer2.updateRememberedValue(rememberedValue);
            return rememberTagController((Function0) rememberedValue, gapComposer2);
        }
        z2 = z | ((((i & 112) ^ 48) > 32 && ((GapComposer) composer).changed(0.028f)) || (i & 48) == 32);
        GapComposer gapComposer22 = (GapComposer) composer;
        rememberedValue = gapComposer22.rememberedValue();
        if (!z2) {
        }
        rememberedValue = new WandComposeBindingsKt$$ExternalSyntheticLambda0(wandPose, i2);
        gapComposer22.updateRememberedValue(rememberedValue);
        return rememberTagController((Function0) rememberedValue, gapComposer22);
    }

    public static final Pair rememberTagController(Function0 function0, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        float density = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).getDensity();
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = (TagPoseController) function0.invoke();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        TagPoseController tagPoseController = (TagPoseController) rememberedValue;
        Float valueOf = Float.valueOf(density);
        boolean changedInstance = gapComposer.changedInstance(tagPoseController) | gapComposer.changed(density);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new RenderScriptBlurEffect$updateSurface$2$2$1(tagPoseController, density, continuation, 1);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(tagPoseController, valueOf, (Function2) rememberedValue2, gapComposer);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(tagPoseController.tick(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        boolean changedInstance2 = gapComposer.changedInstance(tagPoseController);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new WandComposeBindingsKt$rememberTagController$2$1(tagPoseController, mutableState, null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, tagPoseController, (Function2) rememberedValue4);
        return new Pair(tagPoseController, mutableState);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (((androidx.compose.runtime.GapComposer) r5).changed(r4.ordinal()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Pair rememberWandController(WandPose wandPose, Composer composer, int i) {
        boolean z;
        Object rememberedValue;
        wandPose.getClass();
        int i2 = 0;
        if (((i & 14) ^ 6) > 4) {
        }
        if ((i & 6) != 4) {
            z = false;
            GapComposer gapComposer = (GapComposer) composer;
            rememberedValue = gapComposer.rememberedValue();
            if (!z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new WandComposeBindingsKt$$ExternalSyntheticLambda0(wandPose, i2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            return rememberTagController((Function0) rememberedValue, gapComposer);
        }
        z = true;
        GapComposer gapComposer2 = (GapComposer) composer;
        rememberedValue = gapComposer2.rememberedValue();
        if (!z) {
        }
        rememberedValue = new WandComposeBindingsKt$$ExternalSyntheticLambda0(wandPose, i2);
        gapComposer2.updateRememberedValue(rememberedValue);
        return rememberTagController((Function0) rememberedValue, gapComposer2);
    }

    public static float slerpAngle(float f, float f2, float f3) {
        float f4 = (f2 - f) % 6.2831855f;
        if (f4 > 3.1415927f) {
            f4 -= 6.2831855f;
        }
        if (f4 < -3.1415927f) {
            f4 += 6.2831855f;
        }
        return (f4 * f3) + f;
    }

    public static final Modifier tagDragGestures(Modifier modifier, TagPoseController tagPoseController, Function2 function2) {
        modifier.getClass();
        tagPoseController.getClass();
        return SuspendingPointerInputFilterKt.pointerInput(modifier, tagPoseController, function2, new LocalViewFactory$createUi$view$3$1$1$1(7, function2, tagPoseController));
    }

    public static SolidColorPBRMaterial materialFor(Engine engine, String str, MiniCardEdition miniCardEdition) {
        MiniCardScene.MaterialSpec materialSpec;
        engine.getClass();
        if (str.equals("Chip_Body")) {
            materialSpec = chipSpecFor(miniCardEdition);
        } else {
            Map map = MiniCardScene.LOGICAL_MATERIALS;
            MiniCardScene.MaterialSpec materialSpec2 = (MiniCardScene.MaterialSpec) map.get(str);
            materialSpec = materialSpec2 == null ? (MiniCardScene.MaterialSpec) MapsKt__MapsKt.getValue(map, "Card_Body_VDI33") : materialSpec2;
        }
        boolean z = true;
        if (str.equals("Card_Body_VDI33")) {
            return new BumpNoisePBRMaterial(engine, materialSpec.baseColor, materialSpec.roughness, materialSpec.metallic, true, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        }
        return new SolidColorPBRMaterial(engine, materialSpec.baseColor, materialSpec.roughness, materialSpec.metallic, z, 16);
    }
}
