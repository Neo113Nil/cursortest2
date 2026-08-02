package com.squareup.cash.card.onboarding.graphics;

import android.content.Context;
import android.graphics.Color;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.RequestQueue;
import com.google.mlkit.vision.text.zzb;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.components.AABB;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.graphics.swampgl.components.MaterialPlugin;
import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.graphics.swampgl.components.SubMesh;
import com.squareup.cash.graphics.swampgl.components.Transform;
import com.squareup.cash.graphics.swampgl.components.ibl.IblComponent;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class HeartScene extends Scene {
    public final HeartEdition edition;
    public final Engine engine;
    public final MeshGeometry firstEditionGeometry;
    public volatile JobSupport firstEditionLoadJob;
    public volatile JobSupport geometryLoadJob;
    public final MeshGeometry heartGeometry;
    public final Transform heartTransform;
    public final ConcurrentHashMap materials;
    public volatile float pendingDarkening;
    public volatile float pendingLightIntensity;
    public volatile float pendingOpacity;
    public volatile float pendingSaturation;
    public final ContouredTextRing ring;
    public final Transform ringTransform;
    public static final Quat DEFAULT_ROTATION = new Quat((float) Math.toRadians(-90.0d), new float[]{1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE});
    public static final List SUBMESH_NAMES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Heart_Body_Mat", "Flame_Silver_Mat", "Ring_Silver_Mat"});
    public static final Map SUBMESH_MATERIALS = MapsKt__MapsKt.mapOf(new Pair("Heart_Body_Mat", new HeartScene$Companion$HeartMaterialSpec(0.567f, RecyclerView.DECELERATION_RATE, Color.rgb(14, 14, 16))), new Pair("Flame_Silver_Mat", new HeartScene$Companion$HeartMaterialSpec(0.509f, 1.0f, Color.rgb(16, 16, 18))), new Pair("Ring_Silver_Mat", new HeartScene$Companion$HeartMaterialSpec(0.602f, 1.0f, Color.rgb(EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE))), new Pair("FirstEdition_Mat", new HeartScene$Companion$HeartMaterialSpec(0.15f, RecyclerView.DECELERATION_RATE, Color.rgb(8, 8, 10))));
    public static final HeartScene$Companion$HeartMaterialSpec DEFAULT_MATERIAL_SPEC = new HeartScene$Companion$HeartMaterialSpec(0.4f, RecyclerView.DECELERATION_RATE, -1);

    /* renamed from: com.squareup.cash.card.onboarding.graphics.HeartScene$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ HeartScene this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(HeartScene heartScene, Continuation continuation, int i) {
            super(1, continuation);
            this.$r8$classId = i;
            this.this$0 = heartScene;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            int i = this.$r8$classId;
            HeartScene heartScene = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass2(heartScene, continuation, 0);
                default:
                    return new AnonymousClass2(heartScene, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Continuation continuation = (Continuation) obj;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            HeartScene heartScene = this.this$0;
            switch (i) {
                case 0:
                    MeshGeometry meshGeometry = heartScene.heartGeometry;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlyStateFlow readonlyStateFlow = meshGeometry.ready;
                        SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(2, null, 8);
                        this.label = 1;
                        if (FlowKt.first(readonlyStateFlow, sessionWorkerKt$runSession$5, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    List list = meshGeometry.subMeshes;
                    List<SubMesh> list2 = list.isEmpty() ? null : list;
                    if (list2 == null) {
                        list2 = CollectionsKt__CollectionsJVMKt.listOf(new SubMesh("heart", 0, meshGeometry.indexCount));
                    }
                    for (SubMesh subMesh : list2) {
                        ConcurrentHashMap concurrentHashMap = heartScene.materials;
                        String str = subMesh.name;
                        String str2 = subMesh.name;
                        Object obj2 = concurrentHashMap.get(str);
                        if (obj2 == null) {
                            Quat quat = HeartScene.DEFAULT_ROTATION;
                            obj2 = zzb.materialFor(heartScene.engine, str2, false);
                            concurrentHashMap.put(str, obj2);
                        }
                        heartScene.addEntity(new Entity("heart_".concat(str2), meshGeometry.subMeshes.isEmpty() ? meshGeometry : new EglCore(meshGeometry, subMesh), (SolidColorPBRMaterial) obj2, heartScene.heartTransform));
                    }
                    heartScene.applyPendingOpacity();
                    heartScene.markDirty();
                    break;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlyStateFlow readonlyStateFlow2 = heartScene.heartGeometry.ready;
                        SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$52 = new SessionWorkerKt$runSession$5(2, null, 10);
                        this.label = 1;
                        if (FlowKt.first(readonlyStateFlow2, sessionWorkerKt$runSession$52, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeartScene(Context context, Engine engine, HeartEdition heartEdition) {
        super(engine);
        context.getClass();
        engine.getClass();
        heartEdition.getClass();
        this.engine = engine;
        this.edition = heartEdition;
        this.heartTransform = new Transform();
        Transform transform = new Transform();
        this.ringTransform = transform;
        this.pendingOpacity = 1.0f;
        this.pendingLightIntensity = 1.0f;
        this.pendingSaturation = 1.0f;
        this.materials = new ConcurrentHashMap();
        this.heartGeometry = new MeshGeometry(context, engine, "heart.cashmesh");
        Continuation continuation = null;
        this.firstEditionGeometry = heartEdition == HeartEdition.FIRST_EDITION ? new MeshGeometry(context, engine, "heart_first_edition.cashmesh") : null;
        this.ring = new ContouredTextRing(context, engine, "heart_ring", transform, new AnonymousClass2(this, continuation, 1), new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 6), new WandScene$ring$3(0, this, HeartScene.class, "markDirty", "markDirty()V", 0, 16));
        this.camera.setPosition(new Vector3(RecyclerView.DECELERATION_RATE, 0.5f, 5.0f));
        this.camera.setTarget(new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
        this.camera.setUp(new Vector3(RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE));
        this.camera.setFov(38.0f);
        this.camera.setNear(1.0f);
        this.camera.setFar(50.0f);
        int i = 0;
        try {
            IblComponent iblComponent = new IblComponent(context, engine);
            iblComponent.setIntensity(0.5f);
            setIblData(iblComponent);
        } catch (Exception e) {
            Timber.Forest forest = Timber.Forest;
            forest.tag("HeartScene");
            forest.w("Failed to load IBL, continuing without", new Object[0], e);
        }
        this.heartTransform.setScale(new Vector3(70.0f, 70.0f, 70.0f));
        Transform transform2 = this.heartTransform;
        Quat quat = DEFAULT_ROTATION;
        transform2.setRotation(quat);
        this.ringTransform.setScale(new Vector3(0.0425f, 0.0425f, 0.02f));
        this.ringTransform.setRotation(quat);
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        createListBuilder.addAll(SUBMESH_NAMES);
        if (this.edition == HeartEdition.FIRST_EDITION) {
            createListBuilder.add("FirstEdition_Mat");
        }
        ListIterator listIterator = CollectionsKt__CollectionsJVMKt.build(createListBuilder).listIterator(0);
        while (true) {
            ListBuilder.Itr itr = (ListBuilder.Itr) listIterator;
            if (!itr.hasNext()) {
                break;
            }
            String str = (String) itr.next();
            this.materials.put(str, zzb.materialFor(this.engine, str, false));
        }
        this.geometryLoadJob = (JobSupport) this.engine.launch(new AnonymousClass2(this, continuation, i));
        MeshGeometry meshGeometry = this.firstEditionGeometry;
        if (meshGeometry != null) {
            this.firstEditionLoadJob = (JobSupport) this.engine.launch(new RealMRIFactory$sign$2.AnonymousClass1(meshGeometry, this, continuation, 2));
        }
    }

    public final void applyPendingOpacity() {
        for (SolidColorPBRMaterial solidColorPBRMaterial : this.materials.values()) {
            solidColorPBRMaterial.setOpacity(this.pendingOpacity);
            solidColorPBRMaterial.setDimmer(this.pendingDarkening);
            solidColorPBRMaterial.setLightIntensityMultiplier(this.pendingLightIntensity);
            solidColorPBRMaterial.setSaturation(this.pendingSaturation);
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Scene
    public final void dispose() {
        this.ring.dispose();
        JobSupport jobSupport = this.geometryLoadJob;
        if (jobSupport != null) {
            jobSupport.cancel(null);
        }
        this.geometryLoadJob = null;
        JobSupport jobSupport2 = this.firstEditionLoadJob;
        if (jobSupport2 != null) {
            jobSupport2.cancel(null);
        }
        this.firstEditionLoadJob = null;
        this.heartGeometry.dispose();
        MeshGeometry meshGeometry = this.firstEditionGeometry;
        if (meshGeometry != null) {
            meshGeometry.dispose();
        }
        Iterator it = this.materials.values().iterator();
        while (it.hasNext()) {
            MaterialPlugin materialPlugin = ((SolidColorPBRMaterial) it.next()).plugin;
            if (materialPlugin != null) {
                materialPlugin.dispose();
            }
        }
        this.materials.clear();
        super.dispose();
    }

    public final void setOpacity(float f) {
        this.pendingOpacity = f;
        Iterator it = this.materials.values().iterator();
        while (it.hasNext()) {
            ((SolidColorPBRMaterial) it.next()).setOpacity(f);
        }
        ContouredTextRing contouredTextRing = this.ring;
        contouredTextRing.baseOpacity = f;
        contouredTextRing.applyOpacity();
        markDirty();
    }

    public final void setScale(float f) {
        float f2 = 70.0f * f;
        this.heartTransform.setScale(new Vector3(f2, f2, f2));
        float f3 = 0.0425f * f;
        this.ringTransform.setScale(new Vector3(f3, f3, f * 0.02f));
        markDirty();
    }

    public final boolean touchIntersectsHeart(float f, float f2, float f3, float f4) {
        MeshGeometry meshGeometry = this.heartGeometry;
        if (!((Boolean) meshGeometry.ready.$$delegate_0.getValue()).booleanValue()) {
            return true;
        }
        AABB inflated = FlowsKt.inflated(meshGeometry.getAABB(), 1.05f, 1.05f, 1.05f);
        float[] computeModelMatrix = this.heartTransform.computeModelMatrix();
        RequestQueue requestQueue = this.camera;
        return FlowsKt.projectedAabbContainsPoint(inflated, computeModelMatrix, (float[]) requestQueue.mFinishedListeners, (float[]) requestQueue.mEventListeners, f, f2, f3, f4);
    }
}
