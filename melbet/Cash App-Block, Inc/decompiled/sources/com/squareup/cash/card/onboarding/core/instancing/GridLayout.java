package com.squareup.cash.card.onboarding.core.instancing;

import android.content.Context;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda6;
import androidx.compose.material3.SliderKt$SliderImpl$2$1;
import androidx.compose.material3.SliderKt$sliderTapModifier$1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.ta$$ExternalSyntheticLambda1;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cardcustomizations.signature.SignaturesKt$Signature$1$1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda47;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.views.effect.GLSurfaceConfig$SurfaceView;
import com.squareup.cash.tax.views.TaxToolTipViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$rotateDragFlow$2;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class GridLayout {

    /* renamed from: lambda$-1761980698, reason: not valid java name */
    public static final ComposableLambdaImpl f344lambda$1761980698;

    static {
        new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(1), false, -2022414944);
        f344lambda$1761980698 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(25), false, -1761980698);
    }

    public static final void AccessibleCardCell(int i, int i2, String str, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i3) {
        ComposableLambdaImpl composableLambdaImpl2;
        Modifier clearAndSetSemantics;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-206839440);
        int i4 = i3 | (gapComposer.changed(i) ? 4 : 2) | (gapComposer.changed(i2) ? 32 : 16) | (gapComposer.changed(str) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            float mo233toDpu2uoSUM = density.mo233toDpu2uoSUM(i);
            float mo233toDpu2uoSUM2 = density.mo233toDpu2uoSUM(i2);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (str == null) {
                gapComposer.startReplaceGroup(1325015740);
                gapComposer.end(false);
                clearAndSetSemantics = companion;
            } else {
                gapComposer.startReplaceGroup(1325048445);
                boolean z = ((i4 & 7168) == 2048) | ((i4 & 896) == 256);
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ModalBottomSheetKt$$ExternalSyntheticLambda6(str, function0, 2);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue);
                gapComposer.end(false);
            }
            Modifier then = SizeKt.m290width3ABfNKs(companion, mo233toDpu2uoSUM).then(clearAndSetSemantics);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
            SpacerKt.Spacer(gapComposer, SizeKt.m287sizeVpY3zN4(companion, mo233toDpu2uoSUM, mo233toDpu2uoSUM2));
            composableLambdaImpl2 = composableLambdaImpl;
            composableLambdaImpl2.invoke((Object) gapComposer, (Object) 6);
            gapComposer.end(true);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(i, i2, str, function0, composableLambdaImpl2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext] */
    /* renamed from: CardDesignLibraryEffect-OkTjGUA, reason: not valid java name */
    public static final void m3440CardDesignLibraryEffectOkTjGUA(final Modifier modifier, final List list, final CardDesignLibraryState cardDesignLibraryState, final Function0 function0, final Function1 function1, final boolean z, final long j, final String str, final Function1 function12, final String str2, final String str3, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        ComposableLambdaImpl composableLambdaImpl2;
        Function1 function13;
        GapComposer gapComposer;
        Object hero3DCardViewKt$rotateDragFlow$2;
        Object obj;
        Context context;
        CardDesignLibraryScene cardDesignLibraryScene;
        Continuation continuation;
        int i2;
        String str4;
        Object setNameViewKt$SetName$2$1;
        int i3;
        CardDesignLibraryState cardDesignLibraryState2;
        List list2;
        CardDesignLibraryScene cardDesignLibraryScene2;
        ?? r8;
        Applier applier;
        boolean z2;
        List list3;
        MutableState mutableState;
        MutableState mutableState2;
        CardDesignLibraryScene cardDesignLibraryScene3;
        MutableState mutableState3;
        int i4;
        MutableState mutableState4;
        float f;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        CardDesignLibraryScene cardDesignLibraryScene4;
        MutableState mutableState5;
        boolean z3;
        boolean z4;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2;
        CardDesignLibraryScene cardDesignLibraryScene5;
        MutableState mutableState6;
        list.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1318161028);
        Applier applier2 = gapComposer2.applier;
        int i5 = (gapComposer2.changedInstance(function12) ? PKIFailureInfo.duplicateCertReq : 268435456) | i | (gapComposer2.changedInstance(list) ? 32 : 16) | (gapComposer2.changed(cardDesignLibraryState) ? 256 : 128) | (gapComposer2.changedInstance(function0) ? 2048 : 1024) | 1572864 | (gapComposer2.changed(j) ? 8388608 : 4194304) | (gapComposer2.changed(str) ? 67108864 : 33554432);
        if (gapComposer2.shouldExecute(i5 & 1, ((306783379 & i5) == 306783378 && ((((gapComposer2.changed(str2) ? (char) 4 : (char) 2) | 384) | (gapComposer2.changed(str3) ? 32 : 16)) & 147) == 146) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            if (list.isEmpty()) {
                RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i6 = 1;
                    endRestartGroup.block = new Function2(modifier, list, cardDesignLibraryState, function0, function1, z, j, str, function12, str2, str3, composableLambdaImpl, i, i6) { // from class: com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryEffectKt$$ExternalSyntheticLambda4
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ Modifier f$0;
                        public final /* synthetic */ List f$1;
                        public final /* synthetic */ String f$10;
                        public final /* synthetic */ String f$11;
                        public final /* synthetic */ ComposableLambdaImpl f$12;
                        public final /* synthetic */ CardDesignLibraryState f$2;
                        public final /* synthetic */ Function0 f$3;
                        public final /* synthetic */ Function1 f$4;
                        public final /* synthetic */ boolean f$5;
                        public final /* synthetic */ long f$7;
                        public final /* synthetic */ String f$8;
                        public final /* synthetic */ Function1 f$9;

                        {
                            this.$r8$classId = i6;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (this.$r8$classId) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(221191);
                                    GridLayout.m3440CardDesignLibraryEffectOkTjGUA(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, (Composer) obj2, updateChangedFlags);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int updateChangedFlags2 = Updater.updateChangedFlags(221191);
                                    GridLayout.m3440CardDesignLibraryEffectOkTjGUA(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, (Composer) obj2, updateChangedFlags2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            Context context2 = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(function1, gapComposer2);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            Object obj3 = rememberedValue2;
            if (rememberedValue2 == obj2) {
                Engine engine = new Engine(coroutineScope, new CashCardKt$$ExternalSyntheticLambda0(28, rememberUpdatedState));
                engine.initialize();
                gapComposer2.updateRememberedValue(engine);
                obj3 = engine;
            }
            Engine engine2 = (Engine) obj3;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == obj2) {
                rememberedValue3 = new CardDesignLibraryScene(context2, engine2);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            CardDesignLibraryScene cardDesignLibraryScene6 = (CardDesignLibraryScene) rememberedValue3;
            Color color = new Color(j);
            boolean changedInstance = ((29360128 & i5) == 8388608) | gapComposer2.changedInstance(cardDesignLibraryScene6);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            Continuation continuation2 = null;
            if (changedInstance || rememberedValue4 == obj2) {
                obj = obj2;
                context = context2;
                hero3DCardViewKt$rotateDragFlow$2 = new Hero3DCardViewKt$rotateDragFlow$2(cardDesignLibraryScene6, j, continuation2, 4);
                cardDesignLibraryScene = cardDesignLibraryScene6;
                continuation = null;
                gapComposer2.updateRememberedValue(hero3DCardViewKt$rotateDragFlow$2);
            } else {
                cardDesignLibraryScene = cardDesignLibraryScene6;
                hero3DCardViewKt$rotateDragFlow$2 = rememberedValue4;
                continuation = null;
                context = context2;
                obj = obj2;
            }
            Updater.LaunchedEffect(cardDesignLibraryScene, color, (Function2) hero3DCardViewKt$rotateDragFlow$2, gapComposer2);
            RealImageLoader realImageLoader = (RealImageLoader) gapComposer2.consume(LocalImageLoaderKt.LocalImageLoader);
            boolean changedInstance2 = ((234881024 & i5) == 67108864) | gapComposer2.changedInstance(cardDesignLibraryScene) | gapComposer2.changedInstance(realImageLoader) | gapComposer2.changedInstance(context);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue5 == obj) {
                i2 = i5;
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$1 = new VerifyCheckDepositPresenter$models$3$1(str, cardDesignLibraryScene, realImageLoader, context, (Continuation) null, 2);
                str4 = str;
                gapComposer2.updateRememberedValue(verifyCheckDepositPresenter$models$3$1);
                rememberedValue5 = verifyCheckDepositPresenter$models$3$1;
            } else {
                str4 = str;
                i2 = i5;
            }
            Updater.LaunchedEffect(cardDesignLibraryScene, str4, (Function2) rememberedValue5, gapComposer2);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance3 = gapComposer2.changedInstance(cardDesignLibraryScene) | gapComposer2.changedInstance(engine2);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue6 == obj) {
                rememberedValue6 = new BorrowHomeKt$$ExternalSyntheticLambda1(17, cardDesignLibraryScene, engine2);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue6, gapComposer2);
            int i7 = (i2 & 896) ^ MLKEMEngine.KyberPolyBytes;
            boolean changedInstance4 = ((i7 > 256 && gapComposer2.changed(cardDesignLibraryState)) || (i2 & MLKEMEngine.KyberPolyBytes) == 256) | gapComposer2.changedInstance(list) | gapComposer2.changedInstance(cardDesignLibraryScene);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changedInstance4 || rememberedValue7 == obj) {
                Continuation continuation3 = continuation;
                i3 = i7;
                setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1(cardDesignLibraryState, cardDesignLibraryScene, list, continuation3, 24);
                CardDesignLibraryScene cardDesignLibraryScene7 = cardDesignLibraryScene;
                cardDesignLibraryState2 = cardDesignLibraryState;
                list2 = list;
                cardDesignLibraryScene2 = cardDesignLibraryScene7;
                r8 = continuation3;
                gapComposer2.updateRememberedValue(setNameViewKt$SetName$2$1);
            } else {
                list2 = list;
                i3 = i7;
                setNameViewKt$SetName$2$1 = rememberedValue7;
                cardDesignLibraryScene2 = cardDesignLibraryScene;
                cardDesignLibraryState2 = cardDesignLibraryState;
                r8 = continuation;
            }
            Updater.LaunchedEffect(gapComposer2, list2, (Function2) setNameViewKt$SetName$2$1);
            MutableState collectAsState = Updater.collectAsState(cardDesignLibraryScene2.cardScreenBounds, r8, gapComposer2, 1);
            MutableState collectAsState2 = Updater.collectAsState(cardDesignLibraryScene2.currentZoomLevel, r8, gapComposer2, 1);
            MutableState collectAsState3 = Updater.collectAsState(cardDesignLibraryScene2.focusedCardIndex, r8, gapComposer2, 1);
            MutableState collectAsState4 = Updater.collectAsState(cardDesignLibraryScene2.contentReady, r8, gapComposer2, 1);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (rememberedValue8 == obj) {
                rememberedValue8 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue8);
            }
            MutableState mutableState7 = (MutableState) rememberedValue8;
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (rememberedValue9 == obj) {
                applier = applier2;
                rememberedValue9 = new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState7, r8, 4);
                gapComposer2.updateRememberedValue(rememberedValue9);
            } else {
                applier = applier2;
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue9);
            boolean changed = gapComposer2.changed(collectAsState2) | ((i3 > 256 && gapComposer2.changed(cardDesignLibraryState2)) || (i2 & MLKEMEngine.KyberPolyBytes) == 256);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (changed || rememberedValue10 == obj) {
                rememberedValue10 = new CardDesignLibraryEffectKt$CardDesignLibraryEffect$8$1(collectAsState2, cardDesignLibraryState2, null, 0);
                gapComposer2.updateRememberedValue(rememberedValue10);
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue10);
            boolean changed2 = gapComposer2.changed(collectAsState3) | ((i3 > 256 && gapComposer2.changed(cardDesignLibraryState2)) || (i2 & MLKEMEngine.KyberPolyBytes) == 256);
            Object rememberedValue11 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue11 == obj) {
                rememberedValue11 = new CardDesignLibraryEffectKt$CardDesignLibraryEffect$8$1(collectAsState3, cardDesignLibraryState2, null, 1);
                gapComposer2.updateRememberedValue(rememberedValue11);
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue11);
            boolean changedInstance5 = gapComposer2.changedInstance(cardDesignLibraryScene2);
            Object rememberedValue12 = gapComposer2.rememberedValue();
            if (changedInstance5 || rememberedValue12 == obj) {
                z2 = true;
                rememberedValue12 = new CardDesignLibraryScene$$ExternalSyntheticLambda0(cardDesignLibraryScene2, 1);
                gapComposer2.updateRememberedValue(rememberedValue12);
            } else {
                z2 = true;
            }
            cardDesignLibraryState2.onZoomOut = (Function0) rememberedValue12;
            boolean changedInstance6 = gapComposer2.changedInstance(cardDesignLibraryScene2);
            Object rememberedValue13 = gapComposer2.rememberedValue();
            if (changedInstance6 || rememberedValue13 == obj) {
                rememberedValue13 = new CardDesignLibraryScene$$ExternalSyntheticLambda0(cardDesignLibraryScene2, 2);
                gapComposer2.updateRememberedValue(rememberedValue13);
            }
            cardDesignLibraryState2.onZoomIn = (Function0) rememberedValue13;
            boolean z5 = (((ZoomLevel) collectAsState2.getValue()) == ZoomLevel.NEAR || function0 != null) ? z2 : false;
            boolean changed3 = gapComposer2.changed(collectAsState2) | gapComposer2.changedInstance(cardDesignLibraryScene2) | ((i2 & 7168) == 2048 ? z2 : false);
            Object rememberedValue14 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue14 == obj) {
                list3 = list;
                mutableState = mutableState7;
                CardDesignLibraryScene cardDesignLibraryScene8 = cardDesignLibraryScene2;
                mutableState2 = collectAsState;
                CopyCodeKt$$ExternalSyntheticLambda4 copyCodeKt$$ExternalSyntheticLambda4 = new CopyCodeKt$$ExternalSyntheticLambda4(cardDesignLibraryScene8, function0, collectAsState2, false, 25);
                cardDesignLibraryScene3 = cardDesignLibraryScene8;
                mutableState3 = collectAsState2;
                gapComposer2.updateRememberedValue(copyCodeKt$$ExternalSyntheticLambda4);
                rememberedValue14 = copyCodeKt$$ExternalSyntheticLambda4;
            } else {
                list3 = list;
                mutableState = mutableState7;
                cardDesignLibraryScene3 = cardDesignLibraryScene2;
                mutableState3 = collectAsState2;
                mutableState2 = collectAsState;
            }
            DBUtil.BackHandler(z5, (Function0) rememberedValue14, gapComposer2, 0, 0);
            Object rememberedValue15 = gapComposer2.rememberedValue();
            if (rememberedValue15 == obj) {
                rememberedValue15 = Updater.derivedStateOf(new HeroCardViewKt$$ExternalSyntheticLambda2(mutableState3, (State) mutableState2, 2));
                gapComposer2.updateRememberedValue(rememberedValue15);
            }
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState((ZoomLevel) mutableState3.getValue(), gapComposer2);
            MutableState rememberUpdatedState3 = Updater.rememberUpdatedState((CardScreenBounds) ((State) rememberedValue15).getValue(), gapComposer2);
            boolean z6 = (!((Boolean) collectAsState4.getValue()).booleanValue() || ((List) mutableState2.getValue()).isEmpty()) ? false : z2;
            Object rememberedValue16 = gapComposer2.rememberedValue();
            if (rememberedValue16 == obj) {
                i4 = 0;
                rememberedValue16 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
            } else {
                i4 = 0;
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) rememberedValue16;
            Object rememberedValue17 = gapComposer2.rememberedValue();
            if (rememberedValue17 == obj) {
                rememberedValue17 = Boxes$$ExternalSyntheticOutline1.m(i4, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = (ParcelableSnapshotMutableIntState) rememberedValue17;
            if (z6) {
                mutableState4 = rememberUpdatedState3;
                f = 1.0f;
            } else {
                mutableState4 = rememberUpdatedState3;
                f = 0.0f;
            }
            MutableState mutableState8 = mutableState3;
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState5 = parcelableSnapshotMutableIntState3;
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState6 = parcelableSnapshotMutableIntState4;
            MutableState mutableState9 = mutableState2;
            MutableState mutableState10 = mutableState4;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, AnimatableKt.tween$default(150, i4, null, 6), "overlayAlpha", null, gapComposer2, 3120, 20);
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, i4);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            GLSurfaceConfig$SurfaceView gLSurfaceConfig$SurfaceView = new GLSurfaceConfig$SurfaceView();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
            boolean changedInstance7 = gapComposer2.changedInstance(cardDesignLibraryScene3);
            Object rememberedValue18 = gapComposer2.rememberedValue();
            if (changedInstance7 || rememberedValue18 == obj) {
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                rememberedValue18 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(12, cardDesignLibraryScene3, parcelableSnapshotMutableIntState5, parcelableSnapshotMutableIntState6);
                gapComposer2.updateRememberedValue(rememberedValue18);
            } else {
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
            }
            Modifier onSizeChanged = RulerKt.onSizeChanged(fillMaxSize2, (Function1) rememberedValue18);
            boolean changedInstance8 = gapComposer2.changedInstance(cardDesignLibraryScene3);
            Object rememberedValue19 = gapComposer2.rememberedValue();
            if (changedInstance8 || rememberedValue19 == obj) {
                rememberedValue19 = new SliderKt$sliderTapModifier$1(cardDesignLibraryScene3, 4);
                gapComposer2.updateRememberedValue(rememberedValue19);
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(onSizeChanged, list3, (PointerInputEventHandler) rememberedValue19);
            boolean changed4 = gapComposer2.changed(rememberUpdatedState2) | gapComposer2.changed(mutableState10) | gapComposer2.changedInstance(cardDesignLibraryScene3);
            Object rememberedValue20 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue20 == obj) {
                rememberedValue20 = new SignaturesKt$Signature$1$1(cardDesignLibraryScene3, rememberUpdatedState2, mutableState10);
                gapComposer2.updateRememberedValue(rememberedValue20);
            }
            Modifier pointerInput2 = SuspendingPointerInputFilterKt.pointerInput(pointerInput, list3, (PointerInputEventHandler) rememberedValue20);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$1;
            int i8 = 4;
            CardDesignLibraryScene cardDesignLibraryScene9 = cardDesignLibraryScene3;
            ByteStreamsKt.SwampGLEffect(pointerInput2, engine2, cardDesignLibraryScene9, gLSurfaceConfig$SurfaceView, z, null, null, gapComposer2, 24640, 96);
            gapComposer = gapComposer2;
            Modifier alpha = AlphaKt.alpha(SizeKt.fillMaxSize(companion, 1.0f), ((Number) animateFloatAsState.getValue()).floatValue());
            gapComposer.startReplaceGroup(-1810469698);
            gapComposer.end(false);
            Modifier then = alpha.then(companion);
            boolean changed5 = gapComposer.changed(mutableState9);
            Object rememberedValue21 = gapComposer.rememberedValue();
            if (changed5 || rememberedValue21 == obj) {
                rememberedValue21 = new SliderKt$SliderImpl$2$1(mutableState9, i8);
                gapComposer.updateRememberedValue(rememberedValue21);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue21;
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, then);
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
            Updater.m576setimpl(gapComposer, measurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            if (((Number) animateFloatAsState.getValue()).floatValue() > RecyclerView.DECELERATION_RATE) {
                gapComposer.startReplaceGroup(947230876);
                for (CardScreenBounds cardScreenBounds : (List) mutableState9.getValue()) {
                    gapComposer.startMovableGroup(146461053, Integer.valueOf(cardScreenBounds.canonicalIndex));
                    int roundToInt = MathKt__MathJVMKt.roundToInt(cardScreenBounds.right - cardScreenBounds.left);
                    if (roundToInt < 1) {
                        roundToInt = 1;
                    }
                    int roundToInt2 = MathKt__MathJVMKt.roundToInt(cardScreenBounds.bottom - cardScreenBounds.top);
                    if (roundToInt2 < 1) {
                        roundToInt2 = 1;
                    }
                    String str5 = function12 != null ? (String) function12.invoke(Integer.valueOf(cardScreenBounds.canonicalIndex)) : null;
                    MutableState mutableState11 = mutableState8;
                    boolean changed6 = gapComposer.changed(mutableState11) | gapComposer.changed(cardScreenBounds) | gapComposer.changedInstance(cardDesignLibraryScene9);
                    Object rememberedValue22 = gapComposer.rememberedValue();
                    if (changed6 || rememberedValue22 == obj) {
                        CardDesignLibraryScene cardDesignLibraryScene10 = cardDesignLibraryScene9;
                        parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState5;
                        parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState6;
                        rememberedValue22 = new ta$$ExternalSyntheticLambda1(cardScreenBounds, cardDesignLibraryScene10, mutableState11, parcelableSnapshotMutableIntState, parcelableSnapshotMutableIntState2, 9);
                        cardDesignLibraryScene5 = cardDesignLibraryScene10;
                        mutableState6 = mutableState11;
                        gapComposer.updateRememberedValue(rememberedValue22);
                    } else {
                        cardDesignLibraryScene5 = cardDesignLibraryScene9;
                        parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState5;
                        parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState6;
                        mutableState6 = mutableState11;
                    }
                    GapComposer gapComposer3 = gapComposer;
                    AccessibleCardCell(roundToInt, roundToInt2, str5, (Function0) rememberedValue22, Expect_jvmKt.rememberComposableLambda(-911133226, new CashCardKt$$ExternalSyntheticLambda1(13, cardScreenBounds, composableLambdaImpl, mutableState6), gapComposer), gapComposer3, 24576);
                    gapComposer = gapComposer3;
                    gapComposer.end(false);
                    mutableState8 = mutableState6;
                    cardDesignLibraryScene9 = cardDesignLibraryScene5;
                    parcelableSnapshotMutableIntState5 = parcelableSnapshotMutableIntState;
                    parcelableSnapshotMutableIntState6 = parcelableSnapshotMutableIntState2;
                }
                function13 = function12;
                composableLambdaImpl2 = composableLambdaImpl;
                cardDesignLibraryScene4 = cardDesignLibraryScene9;
                mutableState5 = mutableState8;
                z3 = false;
                z4 = true;
                gapComposer.end(false);
            } else {
                function13 = function12;
                composableLambdaImpl2 = composableLambdaImpl;
                cardDesignLibraryScene4 = cardDesignLibraryScene9;
                mutableState5 = mutableState8;
                z3 = false;
                z4 = true;
                gapComposer.startReplaceGroup(948859771);
                gapComposer.end(false);
            }
            gapComposer.end(z4);
            boolean z7 = (!((Boolean) mutableState.getValue()).booleanValue() || ((Boolean) collectAsState4.getValue()).booleanValue()) ? z3 : z4;
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            AnimatedContentKt.AnimatedVisibility(z7, boxScopeInstance.align(companion, biasAlignment), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) f344lambda$1761980698, (Composer) gapComposer, 200064, 16);
            AnimatedContentKt.AnimatedVisibility(((Boolean) collectAsState4.getValue()).booleanValue() && ((ZoomLevel) mutableState5.getValue()) != ZoomLevel.NEAR, SpacerKt.m302paddingqDBjuR0$default(boxScopeInstance.align(companion, Alignment.Companion.BottomCenter), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 50.0f, 7), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-1121608305, new ComposeDialogKt$$ExternalSyntheticLambda12(str2, str3, mutableState5, cardDesignLibraryScene4, 26), gapComposer), (Composer) gapComposer, 200064, 16);
            gapComposer.end(true);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            function13 = function12;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i9 = 0;
            final Function1 function14 = function13;
            final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
            endRestartGroup2.block = new Function2(modifier, list, cardDesignLibraryState, function0, function1, z, j, str, function14, str2, str3, composableLambdaImpl3, i, i9) { // from class: com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryEffectKt$$ExternalSyntheticLambda4
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ Modifier f$0;
                public final /* synthetic */ List f$1;
                public final /* synthetic */ String f$10;
                public final /* synthetic */ String f$11;
                public final /* synthetic */ ComposableLambdaImpl f$12;
                public final /* synthetic */ CardDesignLibraryState f$2;
                public final /* synthetic */ Function0 f$3;
                public final /* synthetic */ Function1 f$4;
                public final /* synthetic */ boolean f$5;
                public final /* synthetic */ long f$7;
                public final /* synthetic */ String f$8;
                public final /* synthetic */ Function1 f$9;

                {
                    this.$r8$classId = i9;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj22, Object obj32) {
                    switch (this.$r8$classId) {
                        case 0:
                            ((Integer) obj32).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(221191);
                            GridLayout.m3440CardDesignLibraryEffectOkTjGUA(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, (Composer) obj22, updateChangedFlags);
                            break;
                        default:
                            ((Integer) obj32).getClass();
                            int updateChangedFlags2 = Updater.updateChangedFlags(221191);
                            GridLayout.m3440CardDesignLibraryEffectOkTjGUA(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, (Composer) obj22, updateChangedFlags2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void GridZoomToggle(ZoomLevel zoomLevel, String str, String str2, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(992811234);
        int i2 = i | (gapComposer.changed(zoomLevel.ordinal()) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier clip = ClipKt.clip(Modifier.Companion.$$INSTANCE, RoundedCornerShapeKt.CircleShape);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m183clickableoSLSa3U$default(ImageKt.m177backgroundbw27NRU(clip, colors.component.button.standard.background.f163default, ColorKt.RectangleShape), false, null, null, function0, 15), 12.0f);
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
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            CrossfadeKt.Crossfade(zoomLevel, (Modifier) null, (FiniteAnimationSpec) null, "gridToggle", Expect_jvmKt.rememberComposableLambda(-2096390608, new TaxToolTipViewKt$$ExternalSyntheticLambda3(str, colors2.component.button.standard.icon.f164default, str2, 2), gapComposer), gapComposer, (i2 & 14) | 27648, 6);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(zoomLevel, str, str2, function0, i);
        }
    }

    public static final int[] brickNeighborSlots(int i, int i2, int i3) {
        int[][] iArr;
        if ((i2 & 1) != 0) {
            int i4 = i + 1;
            int i5 = i2 - 1;
            int i6 = i2 + 1;
            iArr = new int[][]{new int[]{i - 1, i2}, new int[]{i4, i2}, new int[]{i, i5}, new int[]{i4, i5}, new int[]{i, i6}, new int[]{i4, i6}};
        } else {
            int i7 = i - 1;
            int i8 = i2 - 1;
            int i9 = i2 + 1;
            iArr = new int[][]{new int[]{i7, i2}, new int[]{i + 1, i2}, new int[]{i7, i8}, new int[]{i, i8}, new int[]{i7, i9}, new int[]{i, i9}};
        }
        int[] iArr2 = new int[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = (emod(iArr[i10][0], i3) * 4) + emod(iArr[i10][1], 4);
        }
        return iArr2;
    }

    public static Integer cardMetadataIndex(int i, int i2, GridConfig gridConfig) {
        gridConfig.getClass();
        int i3 = gridConfig.cardCount;
        int[] iArr = gridConfig.tileCards;
        if (i3 <= 0 || iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[(emod(i, gridConfig.rows) * 4) + emod(i2, 4)]);
    }

    public static List computeVisibleCells(GridConfig gridConfig, GridRenderParams gridRenderParams, float f, float f2, ZoomLevel zoomLevel, float f3) {
        float f4;
        int i;
        float f5;
        int i2;
        GridConfig gridConfig2 = gridConfig;
        gridConfig2.getClass();
        zoomLevel.getClass();
        float f6 = gridRenderParams.stepX;
        float f7 = gridRenderParams.cameraZ;
        float f8 = gridRenderParams.stepY;
        float f9 = RecyclerView.DECELERATION_RATE;
        if (f6 <= RecyclerView.DECELERATION_RATE || f8 <= RecyclerView.DECELERATION_RATE) {
            return EmptyList.INSTANCE;
        }
        double radians = (float) Math.toRadians(25.0d);
        float tan = ((float) Math.tan(radians)) * f7 * 1.2f;
        int i3 = gridConfig2.rows;
        float f10 = (3.0f * f6) / 2.0f;
        float f11 = ((i3 - 1) * f8) / 2.0f;
        float tan2 = (((float) Math.tan(radians)) * f7 * f3 * 0.8f) + (2.0f * f6);
        float f12 = tan + (2.0f * f8);
        int floor = (int) Math.floor(((f - tan2) + f10) / f6);
        int ceil = (int) Math.ceil(((f + tan2) + f10) / f6);
        int floor2 = (int) Math.floor(((f2 - f12) + f11) / f8);
        int ceil2 = (int) Math.ceil(((f2 + f12) + f11) / f8);
        int roundToInt = MathKt__MathJVMKt.roundToInt((f + f10) / f6);
        int i4 = roundToInt / 4;
        if ((roundToInt ^ 4) < 0 && i4 * 4 != roundToInt) {
            i4--;
        }
        int i5 = i4 * 4;
        int roundToInt2 = MathKt__MathJVMKt.roundToInt((f2 + f11) / f8);
        int i6 = roundToInt2 / i3;
        if ((roundToInt2 ^ i3) < 0 && i6 * i3 != roundToInt2) {
            i6--;
        }
        int i7 = i6 * i3;
        ArrayList arrayList = new ArrayList();
        if (floor2 <= ceil2) {
            while (true) {
                if (floor <= ceil) {
                    f5 = f9;
                    int i8 = floor;
                    while (true) {
                        Integer cardMetadataIndex = cardMetadataIndex(floor2, i8, gridConfig2);
                        if (cardMetadataIndex != null) {
                            int intValue = cardMetadataIndex.intValue();
                            f4 = f6;
                            i = i7;
                            boolean z = (i7 <= floor2 && floor2 < i7 + i3 && i5 <= i8 && i8 < i5 + 4) && !((emod(floor2, i3) * 4) + emod(i8, 4) >= gridConfig2.cardCount);
                            if (zoomLevel != ZoomLevel.FAR || z) {
                                float f13 = z ? 1.0f : gridRenderParams.nonCanonicalOpacity;
                                if (z || f13 > f5) {
                                    float f14 = (i8 * f4) - f10;
                                    float f15 = ((-floor2) * f8) + f11;
                                    if ((i8 & 1) != 0) {
                                        f15 -= (f8 / 2.0f) * gridRenderParams.staggerAmount;
                                    }
                                    int i9 = i8;
                                    i2 = i9;
                                    arrayList.add(new GridCell(i9, floor2, intValue, f14 - f, f15 + f2, f13, z));
                                }
                            }
                            i2 = i8;
                        } else {
                            f4 = f6;
                            i = i7;
                            i2 = i8;
                        }
                        if (i2 == ceil) {
                            break;
                        }
                        i8 = i2 + 1;
                        gridConfig2 = gridConfig;
                        f6 = f4;
                        i7 = i;
                    }
                } else {
                    f4 = f6;
                    i = i7;
                    f5 = f9;
                }
                if (floor2 == ceil2) {
                    break;
                }
                floor2++;
                gridConfig2 = gridConfig;
                f9 = f5;
                f6 = f4;
                i7 = i;
            }
        }
        return arrayList;
    }

    public static final Quat defaultRotation(TagFormFactor tagFormFactor) {
        int ordinal = tagFormFactor.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                    }
                }
                return MiniCardScene.DEFAULT_ROTATION;
            }
            return HeartScene.DEFAULT_ROTATION;
        }
        return WandScene.DEFAULT_ROTATION;
    }

    public static final int emod(int i, int i2) {
        return ((i % i2) + i2) % i2;
    }

    public static Pair findNearestCanonicalOrigin(float f, float f2, GridRenderParams gridRenderParams, GridConfig gridConfig, GridRenderParams gridRenderParams2) {
        gridConfig.getClass();
        float f3 = gridRenderParams.stepX;
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        if (f3 > RecyclerView.DECELERATION_RATE) {
            float f4 = gridRenderParams.stepY;
            if (f4 > RecyclerView.DECELERATION_RATE) {
                int i = gridConfig.rows;
                float f5 = 4.0f * f3;
                float f6 = i * f4;
                if (gridRenderParams2 == null || gridRenderParams2.staggerAmount <= RecyclerView.DECELERATION_RATE) {
                    return new Pair(Float.valueOf(MathKt__MathJVMKt.roundToInt(f / f5) * f5), Float.valueOf(MathKt__MathJVMKt.roundToInt(f2 / f6) * f6));
                }
                Pair findNearestCellIndices = findNearestCellIndices(f, f2, gridConfig, gridRenderParams2);
                int intValue = ((Number) findNearestCellIndices.first).intValue();
                int intValue2 = ((Number) findNearestCellIndices.second).intValue();
                int i2 = intValue / 4;
                if ((intValue ^ 4) < 0 && i2 * 4 != intValue) {
                    i2--;
                }
                int i3 = intValue2 / i;
                if ((intValue2 ^ i) < 0 && i * i3 != intValue2) {
                    i3--;
                }
                return new Pair(Float.valueOf(i2 * f5), Float.valueOf(i3 * f6));
            }
        }
        return new Pair(valueOf, valueOf);
    }

    public static Pair findNearestCellIndices(float f, float f2, GridConfig gridConfig, GridRenderParams gridRenderParams) {
        gridConfig.getClass();
        gridRenderParams.getClass();
        float f3 = gridRenderParams.stepX;
        float f4 = gridRenderParams.stepY;
        int roundToInt = MathKt__MathJVMKt.roundToInt((((3.0f * f3) / 2.0f) + f) / f3);
        int roundToInt2 = MathKt__MathJVMKt.roundToInt((f2 + (((gridConfig.rows - 1) * f4) / 2.0f)) / f4);
        float f5 = Float.MAX_VALUE;
        int i = roundToInt;
        int i2 = roundToInt2;
        for (int i3 = -1; i3 < 2; i3++) {
            for (int i4 = -1; i4 < 2; i4++) {
                int i5 = roundToInt + i3;
                int i6 = roundToInt2 + i4;
                Pair position = position(i5, i6, gridConfig, gridRenderParams);
                float floatValue = ((Number) position.first).floatValue() - f;
                float floatValue2 = ((Number) position.second).floatValue() + f2;
                float f6 = (floatValue2 * floatValue2) + (floatValue * floatValue);
                if (f6 < f5) {
                    i = i5;
                    i2 = i6;
                    f5 = f6;
                }
            }
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static GridRenderParams getRenderParams(ZoomLevel zoomLevel, GridConfig gridConfig) {
        zoomLevel.getClass();
        gridConfig.getClass();
        int ordinal = zoomLevel.ordinal();
        if (ordinal == 0) {
            return new GridRenderParams(gridConfig.farStepX, gridConfig.farStepY, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 25.0f, 1.0f);
        }
        if (ordinal == 1) {
            return new GridRenderParams(gridConfig.mediumStepX, gridConfig.mediumStepY, 1.0f, 1.0f, 9.25f, 1.2f);
        }
        if (ordinal == 2) {
            return new GridRenderParams(gridConfig.mediumStepX, gridConfig.mediumStepY, 1.0f, 1.0f, 5.0f, 1.2f);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static float lerp(float f, float f2, float f3) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(f2, f, f3, f);
    }

    public static Pair nearestVirtualCellForCanonical(int i, int i2, int i3, GridConfig gridConfig) {
        gridConfig.getClass();
        int i4 = i % 4;
        int i5 = i / 4;
        int i6 = (((i4 - i2) % 4) + 4) % 4;
        if (i6 * 2 > 4) {
            i6 -= 4;
        }
        Integer valueOf = Integer.valueOf(i2 + i6);
        int i7 = gridConfig.rows;
        if (i7 > 0) {
            int i8 = (((i5 - i3) % i7) + i7) % i7;
            if (i8 * 2 > i7) {
                i8 -= i7;
            }
            i3 += i8;
        }
        return new Pair(valueOf, Integer.valueOf(i3));
    }

    public static Pair position(int i, int i2, GridConfig gridConfig, GridRenderParams gridRenderParams) {
        gridConfig.getClass();
        gridRenderParams.getClass();
        float f = gridRenderParams.stepX;
        float f2 = (i * f) - ((3.0f * f) / 2.0f);
        float f3 = gridRenderParams.stepY;
        float f4 = (((gridConfig.rows - 1) * f3) / 2.0f) + ((-i2) * f3);
        if ((i & 1) != 0) {
            f4 -= (f3 / 2.0f) * gridRenderParams.staggerAmount;
        }
        return new Pair(Float.valueOf(f2), Float.valueOf(f4));
    }

    public static final void springStep(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr) {
        fArr.getClass();
        float f7 = ((((-f4) * (f - f2)) - (f5 * f3)) * f6) + f3;
        fArr[0] = (f6 * f7) + f;
        fArr[1] = f7;
    }
}
