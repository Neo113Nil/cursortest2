package com.squareup.cash.card.onboarding.graphics;

import android.content.Context;
import android.graphics.Color;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.RequestQueue;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.components.AABB;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.graphics.swampgl.components.SubMesh;
import com.squareup.cash.graphics.swampgl.components.Transform;
import com.squareup.cash.graphics.swampgl.components.ibl.IblComponent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class WandScene extends Scene {
    public volatile FresnelPBRMaterial bodyFresnel;
    public final Context context;
    public final WandEdition edition;
    public final Engine engine;
    public final ConcurrentHashMap materials;
    public volatile float pendingDarkening;
    public volatile float pendingLightIntensity;
    public volatile float pendingOpacity;
    public volatile float pendingSaturation;
    public volatile float requestedScale;
    public final ContouredTextRing ring;
    public final Transform ringTransform;
    public volatile float viewportScale;
    public final MeshGeometry wandGeometry;
    public volatile JobSupport wandGeometryLoadJob;
    public final Transform wandTransform;
    public static final Quat DEFAULT_ROTATION = new Quat((float) Math.toRadians(-90.0d), new float[]{1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE});
    public static final Map SUBMESH_MATERIALS = MapsKt__MapsJVMKt.mapOf(new Pair("Wand_Body", new WandScene$Companion$WandMaterialSpec(0.3f, RecyclerView.DECELERATION_RATE, Color.rgb(EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))));
    public static final WandScene$Companion$WandMaterialSpec DEFAULT_MATERIAL_SPEC = new WandScene$Companion$WandMaterialSpec(0.4f, RecyclerView.DECELERATION_RATE, -1);

    /* renamed from: com.squareup.cash.card.onboarding.graphics.WandScene$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ WandScene this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(WandScene wandScene, Continuation continuation, int i) {
            super(1, continuation);
            this.$r8$classId = i;
            this.this$0 = wandScene;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            int i = this.$r8$classId;
            WandScene wandScene = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(wandScene, continuation, 0);
                default:
                    return new AnonymousClass1(wandScene, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Continuation continuation = (Continuation) obj;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        SafeTrace.throwOnFailure(obj);
                        MeshGeometry meshGeometry = this.this$0.wandGeometry;
                        if (meshGeometry == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("wandGeometry");
                            throw null;
                        }
                        ReadonlyStateFlow readonlyStateFlow = meshGeometry.ready;
                        SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(2, null, 13);
                        this.label = 1;
                        if (FlowKt.first(readonlyStateFlow, sessionWorkerKt$runSession$5, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    this.this$0.viewportScale = 1.0f;
                    this.this$0.applyScale();
                    WandScene wandScene = this.this$0;
                    MeshGeometry meshGeometry2 = wandScene.wandGeometry;
                    if (meshGeometry2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("wandGeometry");
                        throw null;
                    }
                    List<SubMesh> list = meshGeometry2.subMeshes;
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list == null) {
                        list = CollectionsKt__CollectionsJVMKt.listOf(new SubMesh("wand", 0, meshGeometry2.indexCount));
                    }
                    for (SubMesh subMesh : list) {
                        boolean equals = subMesh.name.equals("Wand_Body");
                        Quat quat = WandScene.DEFAULT_ROTATION;
                        WandPBRMaterial materialFor = FlowsKt.materialFor(wandScene.engine, subMesh.name, false, wandScene.edition);
                        if (equals) {
                            wandScene.bodyFresnel = materialFor instanceof FresnelPBRMaterial ? (FresnelPBRMaterial) materialFor : null;
                        } else {
                            SolidColorPBRMaterial solidColorPBRMaterial = materialFor instanceof SolidColorPBRMaterial ? (SolidColorPBRMaterial) materialFor : null;
                            if (solidColorPBRMaterial != null) {
                                wandScene.materials.put(subMesh.name, solidColorPBRMaterial);
                            }
                        }
                        wandScene.addEntity(new Entity("wand_".concat(subMesh.name), meshGeometry2.subMeshes.isEmpty() ? meshGeometry2 : new EglCore(meshGeometry2, subMesh), materialFor, wandScene.wandTransform));
                    }
                    for (SolidColorPBRMaterial solidColorPBRMaterial2 : wandScene.materials.values()) {
                        solidColorPBRMaterial2.setOpacity(wandScene.pendingOpacity);
                        solidColorPBRMaterial2.setDimmer(wandScene.pendingDarkening);
                        solidColorPBRMaterial2.setLightIntensityMultiplier(wandScene.pendingLightIntensity);
                        solidColorPBRMaterial2.setSaturation(wandScene.pendingSaturation);
                    }
                    FresnelPBRMaterial fresnelPBRMaterial = wandScene.bodyFresnel;
                    if (fresnelPBRMaterial != null) {
                        fresnelPBRMaterial.setOpacity(wandScene.pendingOpacity);
                        fresnelPBRMaterial.setDimmer(wandScene.pendingDarkening);
                        fresnelPBRMaterial.setLightIntensityMultiplier(wandScene.pendingLightIntensity);
                        fresnelPBRMaterial.setSaturation(wandScene.pendingSaturation);
                    }
                    wandScene.markDirty();
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        MeshGeometry meshGeometry3 = this.this$0.wandGeometry;
                        if (meshGeometry3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("wandGeometry");
                            throw null;
                        }
                        ReadonlyStateFlow readonlyStateFlow2 = meshGeometry3.ready;
                        SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$52 = new SessionWorkerKt$runSession$5(2, null, 14);
                        this.label = 1;
                        if (FlowKt.first(readonlyStateFlow2, sessionWorkerKt$runSession$52, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WandScene(Context context, Engine engine, WandEdition wandEdition) {
        super(engine);
        context.getClass();
        engine.getClass();
        wandEdition.getClass();
        this.context = context;
        this.engine = engine;
        this.edition = wandEdition;
        this.wandTransform = new Transform();
        this.requestedScale = 1.0f;
        this.viewportScale = 1.0f;
        Transform transform = new Transform();
        this.ringTransform = transform;
        this.pendingOpacity = 1.0f;
        this.pendingLightIntensity = 1.0f;
        this.pendingSaturation = 1.0f;
        this.materials = new ConcurrentHashMap();
        int i = 0;
        this.ring = new ContouredTextRing(context, engine, "wand_ring", transform, new AnonymousClass1(this, null, 1), new WandScene$$ExternalSyntheticLambda0(this, i), new WandScene$ring$3(i, this, WandScene.class, "markDirty", "markDirty()V", 0, 0));
        this.camera.setPosition(new Vector3(RecyclerView.DECELERATION_RATE, 0.5f, 5.0f));
        this.camera.setTarget(new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
        this.camera.setUp(new Vector3(RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE));
        this.camera.setFov(38.0f);
        this.camera.setNear(1.0f);
        this.camera.setFar(50.0f);
        try {
            IblComponent iblComponent = new IblComponent(context, engine);
            iblComponent.setIntensity(0.6f);
            setIblData(iblComponent);
        } catch (Exception e) {
            Timber.Forest forest = Timber.Forest;
            forest.tag("WandScene");
            forest.w("Failed to load IBL, continuing without", new Object[0], e);
        }
        this.wandTransform.setScale(new Vector3(0.28f, 0.28f, 0.28f));
        Transform transform2 = this.wandTransform;
        Quat quat = DEFAULT_ROTATION;
        transform2.setRotation(quat);
        this.ringTransform.setScale(new Vector3(0.21000001f, 0.21000001f, 0.098f));
        this.ringTransform.setRotation(quat);
        this.wandGeometry = new MeshGeometry(this.context, this.engine, "wand.cashmesh");
        this.wandGeometryLoadJob = (JobSupport) this.engine.launch(new AnonymousClass1(this, null, i));
    }

    public final void applyScale() {
        float f = this.requestedScale * 0.28f * this.viewportScale;
        this.wandTransform.setScale(new Vector3(f, f, f));
        float f2 = 0.75f * f;
        this.ringTransform.setScale(new Vector3(f2, f2, f * 0.35f));
        markDirty();
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Scene
    public final void dispose() {
        this.ring.dispose();
        JobSupport jobSupport = this.wandGeometryLoadJob;
        if (jobSupport != null) {
            jobSupport.cancel(null);
        }
        this.wandGeometryLoadJob = null;
        super.dispose();
    }

    public final void setOpacity(float f) {
        this.pendingOpacity = f;
        Iterator it = this.materials.values().iterator();
        while (it.hasNext()) {
            ((SolidColorPBRMaterial) it.next()).setOpacity(f);
        }
        FresnelPBRMaterial fresnelPBRMaterial = this.bodyFresnel;
        if (fresnelPBRMaterial != null) {
            fresnelPBRMaterial.setOpacity(f);
        }
        ContouredTextRing contouredTextRing = this.ring;
        contouredTextRing.baseOpacity = f;
        contouredTextRing.applyOpacity();
        markDirty();
    }

    public final void setPosition(Vector3 vector3) {
        vector3.getClass();
        this.wandTransform.setPosition(vector3);
        this.ringTransform.setPosition(vector3);
        markDirty();
    }

    public final void setRotation(Quat quat) {
        quat.getClass();
        this.wandTransform.setRotation(quat);
        this.ringTransform.setRotation(quat);
        markDirty();
    }

    public final boolean touchIntersectsWand(float f, float f2, float f3, float f4) {
        MeshGeometry meshGeometry = this.wandGeometry;
        if (meshGeometry == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wandGeometry");
            throw null;
        }
        if (!((Boolean) meshGeometry.ready.$$delegate_0.getValue()).booleanValue()) {
            return true;
        }
        AABB inflated = FlowsKt.inflated(meshGeometry.getAABB(), 1.15f, 1.15f, 1.15f);
        float[] computeModelMatrix = this.wandTransform.computeModelMatrix();
        RequestQueue requestQueue = this.camera;
        return FlowsKt.projectedAabbContainsPoint(inflated, computeModelMatrix, (float[]) requestQueue.mFinishedListeners, (float[]) requestQueue.mEventListeners, f, f2, f3, f4);
    }
}
