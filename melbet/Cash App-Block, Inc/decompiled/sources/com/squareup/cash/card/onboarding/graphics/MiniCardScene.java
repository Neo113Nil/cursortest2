package com.squareup.cash.card.onboarding.graphics;

import android.content.Context;
import android.graphics.Color;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.RequestQueue;
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
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.kotterknife.Lazy;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class MiniCardScene extends Scene {
    public final MeshGeometry cardGeometry;
    public final Transform cardTransform;
    public final MiniCardEdition edition;
    public final Engine engine;
    public final ConcurrentHashMap materials;
    public final ContouredTextRing ring;
    public final Transform ringTransform;
    public final float[] shadowLightAimScratch;
    public final float[] shadowLightPositionScratch;
    public static final float[] LIGHT_KEY_OFFSET = {5.05f, 5.1f, 5.65f};
    public static final Quat DEFAULT_ROTATION = new Quat(3.1415927f, new float[]{RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE});
    public static final Quat RING_BASE_ROTATION = new Quat((float) Math.toRadians(-90.0d), new float[]{1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE});
    public static final Map LOGICAL_MATERIALS = MapsKt__MapsKt.mapOf(new Pair("Card_Body_VDI33", new MaterialSpec(0.72f, RecyclerView.DECELERATION_RATE, Color.rgb(EnumC0170g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE))), new Pair("Card_Polish_SPIA2", new MaterialSpec(0.5f, 0.08f, Color.rgb(EnumC0170g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE))), new Pair("Chip_Body", FlowsKt.chipSpecFor(MiniCardEdition.STANDARD)), new Pair("Chip_Surround", new MaterialSpec(0.85f, RecyclerView.DECELERATION_RATE, Color.rgb(30, 18, 10))));

    /* renamed from: com.squareup.cash.card.onboarding.graphics.MiniCardScene$4, reason: invalid class name */
    public final class AnonymousClass4 extends SuspendLambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ MiniCardScene this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass4(MiniCardScene miniCardScene, Continuation continuation, int i) {
            super(1, continuation);
            this.$r8$classId = i;
            this.this$0 = miniCardScene;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            int i = this.$r8$classId;
            MiniCardScene miniCardScene = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass4(miniCardScene, continuation, 0);
                default:
                    return new AnonymousClass4(miniCardScene, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Continuation continuation = (Continuation) obj;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass4) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlyStateFlow readonlyStateFlow = this.this$0.cardGeometry.ready;
                        SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(2, null, 11);
                        this.label = 1;
                        if (FlowKt.first(readonlyStateFlow, sessionWorkerKt$runSession$5, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    MiniCardScene miniCardScene = this.this$0;
                    MeshGeometry meshGeometry = miniCardScene.cardGeometry;
                    List<SubMesh> list = meshGeometry.subMeshes;
                    if (list.isEmpty()) {
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("MiniCardScene");
                        forest.w("minicard.cashmesh has no submeshes", new Object[0]);
                    } else {
                        for (SubMesh subMesh : list) {
                            SolidColorPBRMaterial solidColorPBRMaterial = (SolidColorPBRMaterial) miniCardScene.materials.get(subMesh.name);
                            if (solidColorPBRMaterial != null || (solidColorPBRMaterial = (SolidColorPBRMaterial) miniCardScene.materials.get("Card_Body_VDI33")) != null) {
                                Entity entity = new Entity("minicard_".concat(subMesh.name), new EglCore(meshGeometry, subMesh), solidColorPBRMaterial, miniCardScene.cardTransform);
                                entity.setNeedsDoubleSidedRendering(true);
                                entity.castsShadow = true;
                                entity.receivesShadows = true;
                                entity.castsShadowFromBackFacesOnly = true;
                                miniCardScene.addEntity(entity);
                            }
                        }
                        for (SolidColorPBRMaterial solidColorPBRMaterial2 : miniCardScene.materials.values()) {
                            solidColorPBRMaterial2.keyCastsShadow = true;
                            solidColorPBRMaterial2.markDirty$1();
                        }
                        miniCardScene.markDirty();
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlyStateFlow readonlyStateFlow2 = this.this$0.cardGeometry.ready;
                        SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$52 = new SessionWorkerKt$runSession$5(2, null, 12);
                        this.label = 1;
                        if (FlowKt.first(readonlyStateFlow2, sessionWorkerKt$runSession$52, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i2 != 1) {
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

    public final class MaterialSpec {
        public final int baseColor;
        public final float metallic;
        public final float roughness;

        public MaterialSpec(float f, float f2, int i) {
            this.baseColor = i;
            this.roughness = f;
            this.metallic = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MaterialSpec)) {
                return false;
            }
            MaterialSpec materialSpec = (MaterialSpec) obj;
            return this.baseColor == materialSpec.baseColor && Float.compare(this.roughness, materialSpec.roughness) == 0 && Float.compare(this.metallic, materialSpec.metallic) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.metallic) + CameraState$Type$EnumUnboxingLocalUtility.m(this.roughness, Integer.hashCode(this.baseColor) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaterialSpec(baseColor=");
            sb.append(this.baseColor);
            sb.append(", roughness=");
            sb.append(this.roughness);
            sb.append(", metallic=");
            return Recorder$$ExternalSyntheticOutline1.m(this.metallic, ")", sb);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniCardScene(Context context, Engine engine, MiniCardEdition miniCardEdition) {
        super(engine);
        context.getClass();
        engine.getClass();
        miniCardEdition.getClass();
        this.engine = engine;
        this.edition = miniCardEdition;
        this.cardTransform = new Transform();
        Transform transform = new Transform();
        this.ringTransform = transform;
        this.materials = new ConcurrentHashMap();
        this.cardGeometry = new MeshGeometry(context, engine, "minicard.cashmesh");
        this.shadowLightPositionScratch = new float[3];
        this.shadowLightAimScratch = new float[3];
        Continuation continuation = null;
        this.ring = new ContouredTextRing(context, engine, "minicard_ring", transform, new AnonymousClass4(this, continuation, 1), new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 8), new WandScene$ring$3(0, this, MiniCardScene.class, "markDirty", "markDirty()V", 0, 17));
        this.camera.setPosition(new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 5.0f));
        this.camera.setTarget(new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
        this.camera.setUp(new Vector3(RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE));
        this.camera.setFov(32.0f);
        this.camera.setNear(0.1f);
        this.camera.setFar(50.0f);
        int i = 0;
        try {
            IblComponent iblComponent = new IblComponent(context, engine);
            iblComponent.setIntensity(0.6f);
            setIblData(iblComponent);
        } catch (Exception e) {
            Timber.Forest forest = Timber.Forest;
            forest.tag("MiniCardScene");
            forest.w("Failed to load IBL", new Object[0], e);
        }
        float[] fArr = LIGHT_KEY_OFFSET;
        float[] fArr2 = this.shadowLightPositionScratch;
        fArr2[0] = fArr[0] + RecyclerView.DECELERATION_RATE;
        fArr2[1] = fArr[1] + RecyclerView.DECELERATION_RATE;
        fArr2[2] = fArr[2] + RecyclerView.DECELERATION_RATE;
        float[] fArr3 = this.shadowLightAimScratch;
        fArr3[0] = 0.0f;
        fArr3[1] = 0.0f;
        fArr3[2] = 0.0f;
        setShadowConfig(new ToolbarTuckTargets(fArr2, fArr3));
        this.cardTransform.setScale(new Vector3(70.0f, 70.0f, 70.0f));
        Transform transform2 = this.cardTransform;
        Quat quat = DEFAULT_ROTATION;
        transform2.setRotation(quat);
        this.ringTransform.setScale(new Vector3(0.0375f, 0.0375f, 0.015f));
        this.ringTransform.setRotation(RING_BASE_ROTATION.times(quat));
        for (Map.Entry entry : LOGICAL_MATERIALS.entrySet()) {
            String str = (String) entry.getKey();
            MaterialSpec chipSpecFor = Intrinsics.areEqual(str, "Chip_Body") ? FlowsKt.chipSpecFor(this.edition) : (MaterialSpec) entry.getValue();
            ConcurrentHashMap concurrentHashMap = this.materials;
            boolean areEqual = Intrinsics.areEqual(str, "Card_Body_VDI33");
            Engine engine2 = this.engine;
            concurrentHashMap.put(str, areEqual ? new BumpNoisePBRMaterial(engine2, chipSpecFor.baseColor, chipSpecFor.roughness, chipSpecFor.metallic, false, 496) : new SolidColorPBRMaterial(engine2, chipSpecFor.baseColor, chipSpecFor.roughness, chipSpecFor.metallic, false, 48));
        }
        for (SolidColorPBRMaterial solidColorPBRMaterial : this.materials.values()) {
            solidColorPBRMaterial.keyCastsShadow = true;
            solidColorPBRMaterial.markDirty$1();
        }
        this.engine.launch(new AnonymousClass4(this, continuation, i));
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Scene
    public final void dispose() {
        this.ring.dispose();
        ConcurrentHashMap concurrentHashMap = this.materials;
        Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            MaterialPlugin materialPlugin = ((SolidColorPBRMaterial) it.next()).plugin;
            if (materialPlugin != null) {
                materialPlugin.dispose();
            }
        }
        concurrentHashMap.clear();
        super.dispose();
    }

    public final void setOpacity(float f) {
        Iterator it = this.materials.values().iterator();
        while (it.hasNext()) {
            ((SolidColorPBRMaterial) it.next()).setOpacity(f);
        }
        ContouredTextRing contouredTextRing = this.ring;
        contouredTextRing.baseOpacity = f;
        contouredTextRing.applyOpacity();
        markDirty();
    }

    public final void setPosition(Vector3 vector3) {
        ToolbarTuckTargets toolbarTuckTargets;
        vector3.getClass();
        this.cardTransform.setPosition(vector3);
        this.ringTransform.setPosition(vector3);
        Lazy lazy = this.shadowState;
        ToolbarTuckTargets toolbarTuckTargets2 = lazy != null ? (ToolbarTuckTargets) lazy.initializer : null;
        if (toolbarTuckTargets2 != null) {
            float[] fArr = this.shadowLightPositionScratch;
            float f = vector3.x;
            float[] fArr2 = (float[]) toolbarTuckTargets2.startCornerCenterX$delegate;
            float f2 = fArr2[0];
            float[] fArr3 = (float[]) toolbarTuckTargets2.endCornerCenterX$delegate;
            fArr[0] = (f2 - fArr3[0]) + f;
            float f3 = vector3.y;
            fArr[1] = (fArr2[1] - fArr3[1]) + f3;
            float f4 = vector3.z;
            fArr[2] = (fArr2[2] - fArr3[2]) + f4;
            float[] fArr4 = this.shadowLightAimScratch;
            fArr4[0] = f;
            fArr4[1] = f3;
            fArr4[2] = f4;
            toolbarTuckTargets = new ToolbarTuckTargets(fArr, fArr4);
        } else {
            float[] fArr5 = LIGHT_KEY_OFFSET;
            float[] fArr6 = this.shadowLightPositionScratch;
            float f5 = vector3.x;
            fArr6[0] = fArr5[0] + f5;
            float f6 = vector3.y;
            fArr6[1] = fArr5[1] + f6;
            float f7 = vector3.z;
            fArr6[2] = fArr5[2] + f7;
            float[] fArr7 = this.shadowLightAimScratch;
            fArr7[0] = f5;
            fArr7[1] = f6;
            fArr7[2] = f7;
            toolbarTuckTargets = new ToolbarTuckTargets(fArr6, fArr7);
        }
        setShadowConfig(toolbarTuckTargets);
        markDirty();
    }

    public final void setScale(float f) {
        float f2 = 70.0f * f;
        this.cardTransform.setScale(new Vector3(f2, f2, f2));
        float f3 = 0.0375f * f;
        this.ringTransform.setScale(new Vector3(f3, f3, f * 0.015f));
        markDirty();
    }

    public final boolean touchIntersectsMiniCard(float f, float f2, float f3, float f4) {
        MeshGeometry meshGeometry = this.cardGeometry;
        if (!((Boolean) meshGeometry.ready.$$delegate_0.getValue()).booleanValue()) {
            return true;
        }
        AABB inflated = FlowsKt.inflated(meshGeometry.getAABB(), 1.1f, 1.1f, 1.1f);
        float[] computeModelMatrix = this.cardTransform.computeModelMatrix();
        RequestQueue requestQueue = this.camera;
        return FlowsKt.projectedAabbContainsPoint(inflated, computeModelMatrix, (float[]) requestQueue.mFinishedListeners, (float[]) requestQueue.mEventListeners, f, f2, f3, f4);
    }
}
