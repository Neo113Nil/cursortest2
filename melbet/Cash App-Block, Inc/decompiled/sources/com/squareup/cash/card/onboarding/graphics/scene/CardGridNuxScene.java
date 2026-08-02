package com.squareup.cash.card.onboarding.graphics.scene;

import android.content.Context;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.card.onboarding.core.instancing.InstancedCardBatch;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.graphics.swampgl.components.Transform;
import com.squareup.cash.graphics.swampgl.components.ibl.IblComponent;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class CardGridNuxScene extends Scene {
    public static final Quat CAMERA_ROTATION;
    public static final Vector3 CARD_SCALE_VECTOR;
    public static final List TEXTURE_INDICES;
    public static final float[] X_AXIS;
    public static final float[] Y_AXIS;
    public static final float[] Z_AXIS;
    public final StateFlowImpl _ready;
    public final ArrayList cachedFades;
    public final List cardDelays;
    public final float[] cardProgress;
    public final Context context;
    public final List endStates;
    public final Engine engine;
    public boolean entityAdded;
    public boolean heroAnimationComplete;
    public Quat heroWobbleRotation;
    public Vector4 heroWobbleTranslation;
    public final InstancedCardBatch instancedBatch;
    public final StateFlowImpl ready;
    public final ArrayList reusedTransforms;
    public final List startStates;
    public List viewModels;

    static {
        float[] fArr = {1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        X_AXIS = fArr;
        Y_AXIS = new float[]{RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE};
        Z_AXIS = new float[]{RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f};
        CAMERA_ROTATION = new Quat((float) Math.toRadians(-90.0d), fArr);
        CARD_SCALE_VECTOR = new Vector3(0.2f, 0.2f, 0.2f);
        TEXTURE_INDICES = CollectionsKt.toList(RangesKt___RangesKt.until(0, 6));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardGridNuxScene(Context context, Engine engine) {
        super(engine);
        context.getClass();
        engine.getClass();
        this.context = context;
        this.engine = engine;
        this.instancedBatch = new InstancedCardBatch(context, engine);
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        this._ready = MutableStateFlow;
        this.ready = MutableStateFlow;
        this.cardDelays = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{367, 417, 450, 450, 484, Integer.valueOf(HttpStatusCode.BAD_GATEWAY_502)});
        this.endStates = CollectionsKt__CollectionsKt.listOf((Object[]) new float[][]{new float[]{0.5685354f, 2.8178737f, -0.36443326f, 0.98469543f, RecyclerView.DECELERATION_RATE, 121.921455f}, new float[]{-2.3298526f, 1.7457933f, -1.0f, RecyclerView.DECELERATION_RATE, 16.257278f, 19.099579f}, new float[]{2.0005565f, 0.6947999f, -0.05f, -2.3011017f, -0.4124527f, 84.59708f}, new float[]{0.08709043f, -0.025630353f, 1.0187986f, RecyclerView.DECELERATION_RATE, -7.253189f, 67.9187f}, new float[]{-1.9367917f, -1.501967f, -0.1f, -24.5253f, -11.53566f, -30.8684f}, new float[]{1.5778834f, -2.376829f, 0.2967595f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 43.370102f}});
        this.startStates = CollectionsKt__CollectionsKt.listOf((Object[]) new float[][]{new float[]{1.025209f, -4.4248857f, 1.9268034f, 9.969025f, -12.349281f, -9.890762f}, new float[]{-1.28266f, -5.219751f, 1.0f, -27.407806f, -86.59247f, -21.833832f}, new float[]{1.407497f, -5.5020375f, -0.13485268f, -2.2046509f, -23.468704f, 108.18616f}, new float[]{-0.12945937f, -5.9899297f, -0.061788023f, -1.8068161f, -8.857422f, -4.44265f}, new float[]{-1.6371053f, -7.020084f, -0.1f, -46.345917f, 32.53363f, 25.204056f}, new float[]{1.648349f, -7.6820693f, 0.81323946f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 101.11263f}});
        float[] fArr = new float[6];
        for (int i = 0; i < 6; i++) {
            fArr[i] = 0.0f;
        }
        this.cardProgress = fArr;
        this.heroWobbleRotation = new Quat(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        this.heroWobbleTranslation = new Vector4();
        ArrayList arrayList = new ArrayList(6);
        for (int i2 = 0; i2 < 6; i2++) {
            arrayList.add(new Transform());
        }
        this.reusedTransforms = arrayList;
        ArrayList arrayList2 = new ArrayList(6);
        for (int i3 = 0; i3 < 6; i3++) {
            arrayList2.add(Float.valueOf(RecyclerView.DECELERATION_RATE));
        }
        this.cachedFades = arrayList2;
        this.viewModels = EmptyList.INSTANCE;
        this.camera.setPosition(new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 6.0f));
        this.camera.setTarget(new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
        this.camera.setUp(new Vector3(RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE));
        this.camera.setFov(35.0f);
        this.camera.setFovIsHorizontal(true);
        this.camera.setNear(0.1f);
        this.camera.setFar(40.0f);
        IblComponent iblComponent = new IblComponent(this.context, this.engine);
        iblComponent.setIntensity(1.6f);
        setIblData(iblComponent);
    }

    public static final void access$updateCardTransforms(CardGridNuxScene cardGridNuxScene) {
        ArrayList arrayList = cardGridNuxScene.cachedFades;
        ArrayList arrayList2 = cardGridNuxScene.reusedTransforms;
        float[] fArr = cardGridNuxScene.cardProgress;
        if (cardGridNuxScene.viewModels.isEmpty()) {
            return;
        }
        char c = 0;
        int i = 0;
        while (i < 6) {
            float f = fArr[i];
            float[] fArr2 = (float[]) cardGridNuxScene.startStates.get(i);
            float[] fArr3 = (float[]) cardGridNuxScene.endStates.get(i);
            float lerp = lerp(fArr2[c], fArr3[c], f);
            float lerp2 = lerp(fArr2[1], fArr3[1], f);
            float lerp3 = lerp(fArr2[2], fArr3[2], f);
            float lerp4 = lerp(fArr2[3], fArr3[3], f);
            float lerp5 = lerp(fArr2[4], fArr3[4], f);
            float lerp6 = lerp(fArr2[5], fArr3[5], f);
            Quat times = CAMERA_ROTATION.times(new Quat((float) Math.toRadians(lerp4), X_AXIS)).times(new Quat((float) Math.toRadians(lerp5), Y_AXIS)).times(new Quat((float) Math.toRadians(lerp6), Z_AXIS));
            boolean z = i == 3 && cardGridNuxScene.heroAnimationComplete;
            if (z) {
                times = times.times(cardGridNuxScene.heroWobbleRotation);
            }
            if (z) {
                lerp2 += cardGridNuxScene.heroWobbleTranslation.vector[1];
            }
            float f2 = z ? lerp3 + cardGridNuxScene.heroWobbleTranslation.vector[2] : lerp3;
            Transform transform = (Transform) arrayList2.get(i);
            transform.setPosition(new Vector3(lerp, lerp2, f2));
            transform.setScale(CARD_SCALE_VECTOR);
            transform.setRotation(times);
            arrayList.set(i, Float.valueOf(fArr[i]));
            i++;
            c = 0;
        }
        cardGridNuxScene.instancedBatch.updateInstanceBuffer(arrayList2, TEXTURE_INDICES, arrayList);
    }

    public static float lerp(float f, float f2, float f3) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(f2, f, f3, f);
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Scene
    public final void dispose() {
        this.instancedBatch.dispose();
        IblComponent iblComponent = this._iblData;
        if (iblComponent != null) {
            iblComponent.release();
        }
        super.dispose();
    }

    public final void setCards(List list) {
        if (list.size() != 6) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "CardGridNuxScene requires exactly 6 cards, got "));
        } else {
            if (Intrinsics.areEqual(this.viewModels, list)) {
                return;
            }
            this.viewModels = list;
            this.glLauncher.launch(new RealMRIFactory$sign$2.AnonymousClass1(this, list, null, 3));
        }
    }
}
