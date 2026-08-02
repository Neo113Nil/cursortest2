package com.squareup.cash.graphics.views.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.TransformableStateKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewModel;
import com.squareup.cash.card.onboarding.PaymentDeviceItemViewModel;
import com.squareup.cash.card.onboarding.PdpPanelState;
import com.squareup.cash.card.onboarding.ProductDetailsPageViewModel;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryState;
import com.squareup.cash.card.onboarding.core.instancing.GridLayout;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.graphics.backend.engine.EntityStateImpl;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.backend.gl.core.PBRMaterial;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda28;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda21;
import com.squareup.protos.cash.ui.Image;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class TortoiseCardEffectKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ MutableState f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;

    public /* synthetic */ TortoiseCardEffectKt$$ExternalSyntheticLambda2(State state, State state2, State state3, MutableState mutableState, Bitmap bitmap, Context context, State state4, State state5, State state6) {
        this.f$0 = state;
        this.f$1 = state2;
        this.f$2 = state3;
        this.f$3 = mutableState;
        this.f$4 = bitmap;
        this.f$5 = context;
        this.f$6 = state4;
        this.f$7 = state5;
        this.f$8 = state6;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        State state;
        State state2;
        EntityStateImpl entityStateImpl;
        MutableState mutableState;
        int i;
        CardDesignLibraryState cardDesignLibraryState;
        Image image;
        boolean z;
        String m;
        MutableState mutableState2;
        BiasAlignment biasAlignment;
        String str;
        int i2;
        ProductDetailsPageViewModel productDetailsPageViewModel;
        int i3 = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$8;
        MutableState mutableState3 = this.f$3;
        Object obj7 = this.f$7;
        Object obj8 = this.f$6;
        Object obj9 = this.f$2;
        Object obj10 = this.f$1;
        Object obj11 = this.f$0;
        switch (i3) {
            case 0:
                State state3 = (State) obj11;
                State state4 = (State) obj10;
                State state5 = (State) obj9;
                Bitmap bitmap = (Bitmap) obj5;
                Context context = (Context) obj4;
                State state6 = (State) obj8;
                State state7 = (State) obj7;
                State state8 = (State) obj6;
                GLSceneScope gLSceneScope = (GLSceneScope) obj;
                int intValue = ((Integer) obj3).intValue();
                gLSceneScope.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(new Quat((float) Math.toRadians(-90.0d), new float[]{1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE}));
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                EntityStateImpl rememberEntityState = AbstractHashFunction.rememberEntityState((MutableState) rememberedValue, null, Updater.rememberUpdatedState(Float.valueOf(1.0f), gapComposer), gapComposer, 2);
                int i4 = (intValue << 3) & 112;
                MutableState rememberMaterialInstance = gLSceneScope.rememberMaterialInstance(gLSceneScope.rememberMaterial("pbr", gapComposer, i4 | 6), gapComposer);
                TextureType textureType = TextureType.COLOR;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new AppLockMonitor$special$$inlined$map$2(bitmap, 19);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                int i5 = ((intValue << 6) & 896) | 6;
                MutableState produceTexture = gLSceneScope.produceTexture(textureType, (Flow) rememberedValue2, gapComposer, i5);
                TextureType textureType2 = TextureType.NORMAL;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    Bitmap createBitmap = Bitmap.createBitmap(1024, 1024, Bitmap.Config.ARGB_8888);
                    state = state5;
                    state2 = state4;
                    new Canvas(createBitmap).drawColor(Color.rgb(127, 127, 255));
                    AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(createBitmap, 19);
                    gapComposer.updateRememberedValue(appLockMonitor$special$$inlined$map$2);
                    rememberedValue3 = appLockMonitor$special$$inlined$map$2;
                } else {
                    state = state5;
                    state2 = state4;
                }
                MutableState produceTexture2 = gLSceneScope.produceTexture(textureType2, (Flow) rememberedValue3, gapComposer, i5);
                boolean changed = gapComposer.changed(((Number) state3.getValue()).floatValue()) | gapComposer.changed(((Number) state2.getValue()).floatValue()) | gapComposer.changed(((Number) state.getValue()).floatValue());
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed || rememberedValue4 == neverEqualPolicy) {
                    Bitmap createBitmap2 = Bitmap.createBitmap(1024, 1024, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap2);
                    int floatValue = (int) (((Number) state2.getValue()).floatValue() * 255.0f);
                    int floatValue2 = (int) (((Number) state3.getValue()).floatValue() * 63.0f);
                    float floatValue3 = ((Number) state.getValue()).floatValue();
                    entityStateImpl = rememberEntityState;
                    int i6 = (int) (floatValue3 * 255.0f);
                    mutableState = rememberMaterialInstance;
                    canvas.drawColor(Color.argb(255, floatValue, floatValue2, i6));
                    int saveLayer = canvas.saveLayer(null, TortoiseCardEffectKt.ADD_XFER_PAINT);
                    try {
                        i = i4;
                        canvas.drawBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.card_tortoise_roughness), (Rect) null, new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1024.0f, 1024.0f), TortoiseCardEffectKt.INVERSE_PAINT);
                        canvas.drawColor(Color.argb(255, 0, (int) (((Number) state3.getValue()).floatValue() * 190.0f), 0), PorterDuff.Mode.MULTIPLY);
                        canvas.restoreToCount(saveLayer);
                        rememberedValue4 = new AppLockMonitor$special$$inlined$map$2(createBitmap2, 19);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    } catch (Throwable th) {
                        canvas.restoreToCount(saveLayer);
                        throw th;
                    }
                } else {
                    entityStateImpl = rememberEntityState;
                    i = i4;
                    mutableState = rememberMaterialInstance;
                }
                MutableState produceTexture3 = gLSceneScope.produceTexture(textureType2, (Flow) rememberedValue4, gapComposer, i5);
                PBRMaterial.PBRMaterialInstance pBRMaterialInstance = (PBRMaterial.PBRMaterialInstance) mutableState.getValue();
                if (pBRMaterialInstance == null) {
                    gapComposer.startReplaceGroup(112758879);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(112758880);
                    pBRMaterialInstance.bindTexture("albedoMap", produceTexture, gapComposer, 6);
                    pBRMaterialInstance.bindTexture("normalMap", produceTexture2, gapComposer, 6);
                    pBRMaterialInstance.bindTexture("metalRoughnessAoMap", produceTexture3, gapComposer, 6);
                    pBRMaterialInstance.bindFloat("roughnessScale", state6, gapComposer, 6);
                    pBRMaterialInstance.bindFloat("exposure", state7, gapComposer, 6);
                    pBRMaterialInstance.bindFloat("normalScale", state8, gapComposer, 6);
                    gapComposer.end(false);
                }
                gapComposer.startReplaceGroup(-1243275438);
                Iterator it = ((Iterable) mutableState3.getValue()).iterator();
                while (it.hasNext()) {
                    gLSceneScope.Light((LightStateImpl) it.next(), gapComposer, i);
                }
                gapComposer.end(false);
                gLSceneScope.rememberMesh(mutableState, entityStateImpl, gapComposer, ((intValue << 9) & 7168) | 6);
                return Unit.INSTANCE;
            default:
                CardDesignLibraryState cardDesignLibraryState2 = (CardDesignLibraryState) obj11;
                PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel = (PaymentDeviceCustomizationViewModel) obj10;
                final PdpPanelState pdpPanelState = (PdpPanelState) obj9;
                final Function1 function1 = (Function1) obj8;
                EnterTransitionImpl enterTransitionImpl = (EnterTransitionImpl) obj7;
                List list = (List) obj6;
                MutableState mutableState4 = (MutableState) obj5;
                final MutableState mutableState5 = (MutableState) obj4;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                BiasAlignment biasAlignment2 = Alignment.Companion.BottomCenter;
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    final float m258getMaxHeightD9Ej5fM = boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM();
                    ZoomLevel zoomLevel = cardDesignLibraryState2.getZoomLevel();
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = cardDesignLibraryState2.focusedCardIndex$delegate;
                    ZoomLevel zoomLevel2 = ZoomLevel.NEAR;
                    if (zoomLevel == zoomLevel2) {
                        cardDesignLibraryState = cardDesignLibraryState2;
                        PaymentDeviceItemViewModel paymentDeviceItemViewModel = (PaymentDeviceItemViewModel) CollectionsKt.getOrNull(parcelableSnapshotMutableIntState.getIntValue(), (List) mutableState3.getValue());
                        image = paymentDeviceItemViewModel != null ? paymentDeviceItemViewModel.backgroundImage : null;
                    } else {
                        cardDesignLibraryState = cardDesignLibraryState2;
                        image = paymentDeviceCustomizationViewModel.backgroundImage;
                    }
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    final long j = colors.semantic.background.f1047app;
                    final long m675copywmQWz5c$default = androidx.compose.ui.graphics.Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j, 14);
                    ScrollState scrollState = pdpPanelState.scrollState;
                    boolean visible = pdpPanelState.getVisible();
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, scrollState, visible, 12);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
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
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion, m258getMaxHeightD9Ej5fM);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m277height3ABfNKs);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new GrantSheetKt$$ExternalSyntheticLambda4(1, function1);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function0 = (Function0) rememberedValue5;
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new CashCardKt$$ExternalSyntheticLambda0(22, mutableState4);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    Function1 function12 = (Function1) rememberedValue6;
                    Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        z = false;
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        z = false;
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    long j2 = colors2.semantic.background.f1047app;
                    if (image == null) {
                        gapComposer2.startReplaceGroup(106332348);
                        gapComposer2.end(z);
                        m = null;
                    } else {
                        m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer2, 1388903397, image, gapComposer2, z);
                    }
                    boolean changed3 = gapComposer2.changed(mutableState3);
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new CashCardKt$$ExternalSyntheticLambda0(23, mutableState3);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    GridLayout.m3440CardDesignLibraryEffectOkTjGUA(fillMaxSize, list, cardDesignLibraryState, function0, function12, false, j2, m, (Function1) rememberedValue7, Room.stringResource(gapComposer2, R.string.payment_device_grid_a11y_explore_grid), Room.stringResource(gapComposer2, R.string.payment_device_grid_a11y_all_grid), Expect_jvmKt.rememberComposableLambda(-38822212, new TransformableStateKt$$ExternalSyntheticLambda1(1, mutableState3), gapComposer2), gapComposer2, 221190);
                    CardDesignLibraryState cardDesignLibraryState3 = cardDesignLibraryState;
                    gapComposer2.end(true);
                    boolean visible2 = pdpPanelState.getVisible();
                    Object rememberedValue8 = gapComposer2.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new SvgDecoder$$ExternalSyntheticLambda0(1);
                        gapComposer2.updateRememberedValue(rememberedValue8);
                    }
                    AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, visible2, null, enterTransitionImpl, EnterExitTransitionKt.slideOutVertically$default(1, (Function1) rememberedValue8), null, Expect_jvmKt.rememberComposableLambda(1528432010, new Function3() { // from class: com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj12, Object obj13, Object obj14) {
                            LinearGradient m132linearGradientmHitzGk;
                            ((Integer) obj14).getClass();
                            ((AnimatedVisibilityScope) obj12).getClass();
                            Unit unit = Unit.INSTANCE;
                            GapComposer gapComposer3 = (GapComposer) ((Composer) obj13);
                            Object rememberedValue9 = gapComposer3.rememberedValue();
                            Object obj15 = Composer.Companion.Empty;
                            if (rememberedValue9 == obj15) {
                                rememberedValue9 = new ToastKt$Toast$7$1(mutableState5, null, 7);
                                gapComposer3.updateRememberedValue(rememberedValue9);
                            }
                            Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue9);
                            int mo230roundToPx0680j_4 = ((Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity)).mo230roundToPx0680j_4(m258getMaxHeightD9Ej5fM * 0.4f);
                            PdpPanelState pdpPanelState2 = PdpPanelState.this;
                            ProductDetailsPageViewModel productDetailsPageViewModel2 = (ProductDetailsPageViewModel) pdpPanelState2.displayedModel$delegate.getValue();
                            if (productDetailsPageViewModel2 == null) {
                                gapComposer3.startReplaceGroup(-1724999494);
                                gapComposer3.end(false);
                                return unit;
                            }
                            gapComposer3.startReplaceGroup(-1724999493);
                            String str2 = productDetailsPageViewModel2.paymentDeviceId;
                            Function1 function13 = function1;
                            boolean changed4 = gapComposer3.changed(function13) | gapComposer3.changedInstance(productDetailsPageViewModel2);
                            Object rememberedValue10 = gapComposer3.rememberedValue();
                            if (changed4 || rememberedValue10 == obj15) {
                                rememberedValue10 = new PaymentDeviceCustomizationViewKt$PaymentDeviceCustomizationView$5$1$1$3$2$1$1(function13, productDetailsPageViewModel2, null, 0);
                                gapComposer3.updateRememberedValue(rememberedValue10);
                            }
                            Updater.LaunchedEffect(gapComposer3, str2, (Function2) rememberedValue10);
                            float f = ((Dp) pdpPanelState2.overlayHeight$delegate.getValue()).value;
                            boolean changed5 = gapComposer3.changed(mo230roundToPx0680j_4);
                            Object rememberedValue11 = gapComposer3.rememberedValue();
                            if (changed5 || rememberedValue11 == obj15) {
                                rememberedValue11 = new TabToolbarsKt$$ExternalSyntheticLambda21(mo230roundToPx0680j_4, 4);
                                gapComposer3.updateRememberedValue(rememberedValue11);
                            }
                            Modifier layout = ValueInsets.layout(Modifier.Companion.$$INSTANCE, (Function3) rememberedValue11);
                            Pair pair = new Pair(Float.valueOf(RecyclerView.DECELERATION_RATE), new androidx.compose.ui.graphics.Color(m675copywmQWz5c$default));
                            Float valueOf2 = Float.valueOf(0.05f);
                            long j3 = j;
                            m132linearGradientmHitzGk = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r12, new Pair[]{pair, new Pair(valueOf2, new androidx.compose.ui.graphics.Color(j3)), new Pair(Float.valueOf(1.0f), new androidx.compose.ui.graphics.Color(j3))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                            Modifier background$default = ImageKt.background$default(layout, m132linearGradientmHitzGk, null, 6);
                            boolean changed6 = gapComposer3.changed(function13);
                            Object rememberedValue12 = gapComposer3.rememberedValue();
                            if (changed6 || rememberedValue12 == obj15) {
                                rememberedValue12 = new SsnViewKt$$ExternalSyntheticLambda1(20, function13);
                                gapComposer3.updateRememberedValue(rememberedValue12);
                            }
                            Function1 function14 = (Function1) rememberedValue12;
                            boolean changed7 = gapComposer3.changed(function13) | gapComposer3.changedInstance(productDetailsPageViewModel2);
                            Object rememberedValue13 = gapComposer3.rememberedValue();
                            if (changed7 || rememberedValue13 == obj15) {
                                rememberedValue13 = new PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda27(function13, productDetailsPageViewModel2, 0);
                                gapComposer3.updateRememberedValue(rememberedValue13);
                            }
                            HeroSectionKt.m3444ProductDetailsPageContentjIwJxvA(productDetailsPageViewModel2, background$default, true, f, function14, (Function1) rememberedValue13, gapComposer3, MLKEMEngine.KyberPolyBytes, 0);
                            gapComposer3.end(false);
                            return unit;
                        }
                    }, gapComposer2), gapComposer2, 1597446, 18);
                    gapComposer2.end(true);
                    boolean visible3 = pdpPanelState.getVisible();
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (visible3) {
                        mutableState2 = mutableState3;
                        biasAlignment = biasAlignment2;
                        gapComposer2.startReplaceGroup(1991500838);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1991061661);
                        ChromeConfigKt.ChromeConfig(null, null, null, Boolean.TRUE, null, null, null, gapComposer2, 3072, 119);
                        biasAlignment = biasAlignment2;
                        mutableState2 = mutableState3;
                        BoxKt.Box(ImageKt.background$default(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(boxScopeInstance.align(companion, biasAlignment), 1.0f), 120.0f), Lock.m133verticalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.Color[]{new androidx.compose.ui.graphics.Color(m675copywmQWz5c$default), new androidx.compose.ui.graphics.Color(j)})), null, 6), gapComposer2, 0);
                        gapComposer2.end(false);
                    }
                    float mo236toPx0680j_4 = ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(8.0f);
                    Object rememberedValue9 = gapComposer2.rememberedValue();
                    if (rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = Updater.derivedStateOf(new MoneyTabUIKt$$ExternalSyntheticLambda28(cardDesignLibraryState3, pdpPanelState, mo236toPx0680j_4));
                        gapComposer2.updateRememberedValue(rememberedValue9);
                    }
                    State m153animateColorAsStateeuL9pac = SingleValueAnimationKt.m153animateColorAsStateeuL9pac((cardDesignLibraryState3.getZoomLevel() == zoomLevel2 && ((Boolean) ((State) rememberedValue9).getValue()).booleanValue()) ? j : m675copywmQWz5c$default, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, null, 5), "toolbarGradientEnd", gapComposer2, 432, 8);
                    if (cardDesignLibraryState3.getZoomLevel() == zoomLevel2) {
                        PaymentDeviceItemViewModel paymentDeviceItemViewModel2 = (PaymentDeviceItemViewModel) CollectionsKt.getOrNull(parcelableSnapshotMutableIntState.getIntValue(), (List) mutableState2.getValue());
                        str = (paymentDeviceItemViewModel2 == null || (productDetailsPageViewModel = paymentDeviceItemViewModel2.productDetailsPage) == null) ? null : productDetailsPageViewModel.pageTitle;
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        str = paymentDeviceCustomizationViewModel.title;
                    }
                    Modifier background$default = ImageKt.background$default(companion, Lock.m133verticalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.Color[]{new androidx.compose.ui.graphics.Color(j), new androidx.compose.ui.graphics.Color(((androidx.compose.ui.graphics.Color) m153animateColorAsStateeuL9pac.getValue()).value)})), null, 6);
                    NavigationType navigationType = cardDesignLibraryState3.getZoomLevel() == zoomLevel2 ? NavigationType.BACK : NavigationType.CLOSE;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(326455350, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, 18), gapComposer2);
                    boolean changed4 = gapComposer2.changed(cardDesignLibraryState3) | gapComposer2.changed(function1);
                    Object rememberedValue10 = gapComposer2.rememberedValue();
                    if (changed4 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(16, (Object) cardDesignLibraryState3, (Object) function1);
                        gapComposer2.updateRememberedValue(rememberedValue10);
                    }
                    DBUtil.TitleBarSub(rememberComposableLambda, navigationType, background$default, (DynamicColorConfiguration) null, (Function0) rememberedValue10, (Modifier) null, (Function3) null, gapComposer2, 6, 104);
                    boolean visible4 = pdpPanelState.getVisible();
                    Modifier align = boxScopeInstance.align(companion, biasAlignment);
                    Object rememberedValue11 = gapComposer2.rememberedValue();
                    if (rememberedValue11 == neverEqualPolicy) {
                        i2 = 1;
                        rememberedValue11 = new SvgDecoder$$ExternalSyntheticLambda0(1);
                        gapComposer2.updateRememberedValue(rememberedValue11);
                    } else {
                        i2 = 1;
                    }
                    AnimatedContentKt.AnimatedVisibility(visible4, align, enterTransitionImpl, EnterExitTransitionKt.slideOutVertically$default(i2, (Function1) rememberedValue11), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(686443924, new CheckDepositAmountKt$$ExternalSyntheticLambda6(11, (Object) pdpPanelState, (Object) function1), gapComposer2), (Composer) gapComposer2, 199680, 16);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TortoiseCardEffectKt$$ExternalSyntheticLambda2(CardDesignLibraryState cardDesignLibraryState, PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel, PdpPanelState pdpPanelState, Function1 function1, EnterTransitionImpl enterTransitionImpl, MutableState mutableState, List list, MutableState mutableState2, MutableState mutableState3) {
        this.f$0 = cardDesignLibraryState;
        this.f$1 = paymentDeviceCustomizationViewModel;
        this.f$2 = pdpPanelState;
        this.f$6 = function1;
        this.f$7 = enterTransitionImpl;
        this.f$3 = mutableState;
        this.f$8 = list;
        this.f$4 = mutableState2;
        this.f$5 = mutableState3;
    }
}
