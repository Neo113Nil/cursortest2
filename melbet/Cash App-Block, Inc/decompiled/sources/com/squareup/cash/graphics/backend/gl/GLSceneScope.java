package com.squareup.cash.graphics.backend.gl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.view.TextureView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.backend.engine.CameraState;
import com.squareup.cash.graphics.backend.engine.EntityState;
import com.squareup.cash.graphics.backend.engine.EntityStateImpl;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.graphics.backend.gl.core.ObjMesh;
import com.squareup.cash.graphics.backend.gl.core.PBRMaterial;
import com.squareup.cash.graphics.backend.math.Matrix4;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda33;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda4;
import com.stripe.android.uicore.image.StripeImageKt$StripeImage$3$1$1;
import java.util.List;
import java.util.ListIterator;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class GLSceneScope implements TextureView.SurfaceTextureListener {
    public final DerivedSnapshotState _glAttached;
    public final SnapshotStateList _lights;
    public final SnapshotStateList _renderables;
    public final ParcelableSnapshotMutableState _screenSize;
    public final ParcelableSnapshotMutableState _windowSurface;
    public final CoroutineContext backgroundContext;
    public CameraState cameraState;
    public final Context context;
    public final CoroutineScope engineScope;
    public CoroutineScope glScope;
    public final HeroCardViewKt$$ExternalSyntheticLambda33 onLowFps;

    public GLSceneScope(Context context, CoroutineScope coroutineScope, HeroCardViewKt$$ExternalSyntheticLambda33 heroCardViewKt$$ExternalSyntheticLambda33, CoroutineContext coroutineContext) {
        context.getClass();
        coroutineScope.getClass();
        coroutineContext.getClass();
        this.context = context;
        this.engineScope = coroutineScope;
        this.onLowFps = heroCardViewKt$$ExternalSyntheticLambda33;
        this.backgroundContext = coroutineContext;
        this._screenSize = Updater.mutableStateOf$default(new IntSize(0L));
        this._windowSurface = Updater.mutableStateOf$default(null);
        this._renderables = new SnapshotStateList();
        this._lights = new SnapshotStateList();
        this._glAttached = Updater.derivedStateOf(new GLSceneScope$$ExternalSyntheticLambda1(this, 1));
        this.cameraState = new CameraState(0L, new Matrix4(), new Matrix4(), new Vector4(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE));
    }

    public final void FrameRenderer(Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        Object heroCardViewKt$$ExternalSyntheticLambda4;
        Matrix4 matrix4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-941240450);
        int i2 = 4;
        int i3 = 2;
        int i4 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        int i5 = 1;
        final int i6 = 0;
        if (!gapComposer.shouldExecute(i4 & 1, (i4 & 3) != 2)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (!((Boolean) this._glAttached.getValue()).booleanValue()) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(this, i, i6) { // from class: com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ GLSceneScope f$0;

                        {
                            this.$r8$classId = i6;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = this.$r8$classId;
                            GLSceneScope gLSceneScope = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i7) {
                                case 0:
                                    gLSceneScope.FrameRenderer(composer2, Updater.updateChangedFlags(9));
                                    break;
                                default:
                                    gLSceneScope.FrameRenderer(composer2, Updater.updateChangedFlags(9));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new RealKeyStoreProvider$load$2(this, null, i5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, this._screenSize, (Function2) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Updater.derivedStateOf(new GLSceneScope$$ExternalSyntheticLambda1(this, i6));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            State state = (State) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            Object obj2 = rememberedValue3;
            if (rememberedValue3 == obj) {
                Matrix4 matrix42 = new Matrix4();
                float[] fArr = this.cameraState.position.vector;
                Matrix.setLookAtM(matrix42.matrix, 0, fArr[0], fArr[1], fArr[2], RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE);
                gapComposer.updateRememberedValue(matrix42);
                obj2 = matrix42;
            }
            Matrix4 matrix43 = (Matrix4) obj2;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = Updater.derivedStateOf(new GLSceneScope$$ExternalSyntheticLambda2(i6, this, matrix43, state));
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            this.cameraState = (CameraState) ((State) rememberedValue4).getValue();
            boolean changedInstance2 = gapComposer.changedInstance(this);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue5 == obj) {
                rememberedValue5 = new GLSceneScope$$ExternalSyntheticLambda1(this, i3);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Updater.SideEffect((Function0) rememberedValue5, gapComposer);
            gapComposer.startReplaceGroup(1706082881);
            ListIterator listIterator = this._renderables.listIterator();
            while (true) {
                StateListIterator stateListIterator = (StateListIterator) listIterator;
                if (!stateListIterator.hasNext()) {
                    break;
                }
                Triple triple = (Triple) stateListIterator.next();
                EntityState entityState = (EntityState) triple.first;
                Object obj3 = (ObjMesh) triple.second;
                PBRMaterial.PBRMaterialInstance pBRMaterialInstance = (PBRMaterial.PBRMaterialInstance) triple.third;
                Matrix4 matrix44 = (Matrix4) entityState.getTransformMatrix().getValue();
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == obj) {
                    rememberedValue6 = Updater.derivedStateOf(new GLSceneScope$$ExternalSyntheticLambda4(i6, matrix43, matrix44));
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                Object obj4 = (Matrix4) ((State) rememberedValue6).getValue();
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (rememberedValue7 == obj) {
                    rememberedValue7 = Updater.derivedStateOf(new GLSceneScope$$ExternalSyntheticLambda2(matrix43, matrix44, state));
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
                Object obj5 = (Matrix4) ((State) rememberedValue7).getValue();
                gapComposer.startReplaceGroup(1706092361);
                pBRMaterialInstance.getClass();
                pBRMaterialInstance.invalidator.getIntValue();
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (rememberedValue8 == obj) {
                    rememberedValue8 = Updater.derivedStateOf(new GLSceneScope$$ExternalSyntheticLambda1(this, 3));
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                Object obj6 = (List) ((State) rememberedValue8).getValue();
                boolean changedInstance3 = gapComposer.changedInstance(this) | gapComposer.changedInstance(pBRMaterialInstance) | gapComposer.changedInstance(obj3) | gapComposer.changedInstance(matrix44) | gapComposer.changedInstance(obj4) | gapComposer.changedInstance(obj5) | gapComposer.changedInstance(obj6);
                Object rememberedValue9 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue9 == obj) {
                    matrix4 = matrix43;
                    heroCardViewKt$$ExternalSyntheticLambda4 = new HeroCardViewKt$$ExternalSyntheticLambda4(this, pBRMaterialInstance, obj3, matrix44, obj4, obj5, obj6, 4);
                    gapComposer.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda4);
                } else {
                    matrix4 = matrix43;
                    heroCardViewKt$$ExternalSyntheticLambda4 = rememberedValue9;
                }
                Updater.SideEffect((Function0) heroCardViewKt$$ExternalSyntheticLambda4, gapComposer);
                gapComposer.end(false);
                matrix43 = matrix4;
            }
            gapComposer.end(false);
            boolean changedInstance4 = gapComposer.changedInstance(this);
            Object rememberedValue10 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue10 == obj) {
                rememberedValue10 = new GLSceneScope$$ExternalSyntheticLambda1(this, i2);
                gapComposer.updateRememberedValue(rememberedValue10);
            }
            Updater.SideEffect((Function0) rememberedValue10, gapComposer);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i7 = 1;
            function2 = new Function2(this, i, i7) { // from class: com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ GLSceneScope f$0;

                {
                    this.$r8$classId = i7;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj22) {
                    int i72 = this.$r8$classId;
                    GLSceneScope gLSceneScope = this.f$0;
                    Composer composer2 = (Composer) obj7;
                    ((Integer) obj22).getClass();
                    switch (i72) {
                        case 0:
                            gLSceneScope.FrameRenderer(composer2, Updater.updateChangedFlags(9));
                            break;
                        default:
                            gLSceneScope.FrameRenderer(composer2, Updater.updateChangedFlags(9));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public final void Light(LightStateImpl lightStateImpl, Composer composer, int i) {
        int i2;
        lightStateImpl.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-9015383);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(lightStateImpl) : gapComposer.changedInstance(lightStateImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        int i3 = 0;
        boolean z = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean changedInstance = gapComposer.changedInstance(this);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !gapComposer.changedInstance(lightStateImpl))) {
                z = false;
            }
            boolean z2 = changedInstance | z;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda10(i3, this, lightStateImpl);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(lightStateImpl, (Function1) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(this, lightStateImpl, i, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        JobKt.launch$default(this.engineScope, null, null, new StripeImageKt$StripeImage$3$1$1(this, surfaceTexture, i, i2, null), 3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        JobKt.launch$default(this.engineScope, null, null, new RingtoneView$playRingtone$1(this, i, i2, (Continuation) null), 3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
    }

    public final MutableState produceTexture(TextureType textureType, Flow flow, GapComposer gapComposer, int i) {
        Flow flow2;
        flow.getClass();
        gapComposer.startReplaceGroup(-1266937853);
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(flow) | ((((i & 14) ^ 6) > 4 && gapComposer.changed(textureType.ordinal())) || (i & 6) == 4);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            flow2 = flow;
            RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$1 = new RealFidesmoClient$observeDeviceState$1(flow2, this, textureType, continuation, 27);
            gapComposer.updateRememberedValue(realFidesmoClient$observeDeviceState$1);
            rememberedValue = realFidesmoClient$observeDeviceState$1;
        } else {
            flow2 = flow;
        }
        MutableState produceState = Updater.produceState(null, flow2, (Function2) rememberedValue, gapComposer, (i & 112) | 6);
        gapComposer.end(false);
        return produceState;
    }

    public final MutableState rememberMaterial(String str, GapComposer gapComposer, int i) {
        gapComposer.startReplaceGroup(1083424470);
        boolean changedInstance = gapComposer.changedInstance(this) | ((((i & 14) ^ 6) > 4 && gapComposer.changed(str)) || (i & 6) == 4);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new RealFidesmoClient$observeDeviceState$1(this, str, continuation, 28);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState produceState = Updater.produceState(null, str, (Function2) rememberedValue, gapComposer, ((i << 3) & 112) | 6);
        gapComposer.end(false);
        return produceState;
    }

    public final MutableState rememberMaterialInstance(MutableState mutableState, GapComposer gapComposer) {
        mutableState.getClass();
        gapComposer.startReplaceGroup(-390358721);
        PBRMaterial pBRMaterial = (PBRMaterial) mutableState.getValue();
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(pBRMaterial);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new RealFidesmoClient$observeDeviceState$1(this, pBRMaterial, continuation, 29);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState produceState = Updater.produceState(null, pBRMaterial, (Function2) rememberedValue, gapComposer, 6);
        gapComposer.end(false);
        return produceState;
    }

    public final void rememberMesh(MutableState mutableState, EntityStateImpl entityStateImpl, GapComposer gapComposer, int i) {
        entityStateImpl.getClass();
        gapComposer.startReplaceGroup(243270519);
        boolean changedInstance = gapComposer.changedInstance(this) | ((((i & 14) ^ 6) > 4 && gapComposer.changed("flat_cube")) || (i & 6) == 4);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new AnimationsKt$takeUntil$1$1.AnonymousClass1(this, null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState produceState = Updater.produceState(null, "flat_cube", (Function2) rememberedValue, gapComposer, ((i << 3) & 112) | 6);
        if (((ObjMesh) produceState.getValue()) == null || ((PBRMaterial.PBRMaterialInstance) mutableState.getValue()) == null) {
            gapComposer.end(false);
            return;
        }
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            ObjMesh objMesh = (ObjMesh) produceState.getValue();
            objMesh.getClass();
            PBRMaterial.PBRMaterialInstance pBRMaterialInstance = (PBRMaterial.PBRMaterialInstance) mutableState.getValue();
            pBRMaterialInstance.getClass();
            rememberedValue2 = new Triple(entityStateImpl, objMesh, pBRMaterialInstance);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Triple triple = (Triple) rememberedValue2;
        ObjMesh objMesh2 = (ObjMesh) produceState.getValue();
        boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changedInstance(triple);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new GLSceneScope$$ExternalSyntheticLambda10(10, this, triple);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.DisposableEffect(objMesh2, (Function1) rememberedValue3, gapComposer);
        gapComposer.end(false);
    }
}
