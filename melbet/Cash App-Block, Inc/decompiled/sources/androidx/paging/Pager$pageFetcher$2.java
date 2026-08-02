package androidx.paging;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.compat.CaptureSessionState;
import androidx.camera.camera2.pipe.compat.OpenCameraResult;
import androidx.compose.animation.core.Animatable;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.card.onboarding.core.CardAssetManager;
import com.squareup.cash.card.onboarding.core.HeatMaskRenderer;
import com.squareup.cash.card.onboarding.core.instancing.BackgroundPlaneMaterial;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.card.onboarding.core.instancing.InstancedCardBatch;
import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import com.squareup.cash.graphics.swampgl.components.PBRMaterial;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.work.tinygraph.EntityStore;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.IBaseEntity;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.repository.AccountUpdateRequiredContentRepository;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.brotli.dec.HuffmanTreeGroup;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class Pager$pageFetcher$2 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Object $pagingSourceFactory;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Pager$pageFetcher$2(Object obj, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$pagingSourceFactory = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$pagingSourceFactory;
        switch (i) {
            case 0:
                return new Pager$pageFetcher$2((Function0) obj, continuation, 0);
            case 1:
                return new Pager$pageFetcher$2((Ref$ObjectRef) obj, continuation, 1);
            case 2:
                return new Pager$pageFetcher$2((CaptureSessionState) obj, continuation, 2);
            case 3:
                return new Pager$pageFetcher$2((Animatable) obj, continuation, 3);
            case 4:
                return new Pager$pageFetcher$2((CardAssetManager) obj, continuation, 4);
            case 5:
                return new Pager$pageFetcher$2((JWECryptoParts) obj, continuation, 5);
            case 6:
                return new Pager$pageFetcher$2((HuffmanTreeGroup) obj, continuation, 6);
            case 7:
                return new Pager$pageFetcher$2((CardDesignLibraryScene) obj, continuation, 7);
            case 8:
                return new Pager$pageFetcher$2((InstancedCardBatch) obj, continuation, 8);
            case 9:
                return new Pager$pageFetcher$2((MeshGeometry) obj, continuation, 9);
            case 10:
                return new Pager$pageFetcher$2((PBRMaterial) obj, continuation, 10);
            case 11:
                return new Pager$pageFetcher$2((Scene) obj, continuation, 11);
            case 12:
                return new Pager$pageFetcher$2((RealKeyStoreProvider) obj, continuation, 12);
            case 13:
                return new Pager$pageFetcher$2((RealMerchantRepository) obj, continuation, 13);
            case 14:
                return new Pager$pageFetcher$2((AccountUpdateRequiredViewModel) obj, continuation, 14);
            default:
                return new Pager$pageFetcher$2((SelfieStepStateManager) obj, continuation, 15);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((Pager$pageFetcher$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$pagingSourceFactory;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return ((Function0) obj2).invoke();
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Log.d("CXCP", "tryOpenCamera: Camera open cancelled");
                ((Ref$ObjectRef) obj2).element = null;
                return new OpenCameraResult(null, new CameraError(13), 1);
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CaptureSessionState) obj2).captureSessionAttemptCompleted.await();
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Animatable.access$endAnimation((Animatable) obj2);
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardAssetManager cardAssetManager = (CardAssetManager) obj2;
                Iterator it = cardAssetManager.assets.values().iterator();
                while (it.hasNext()) {
                    GLES20.glDeleteTextures(1, new int[]{((CardAssetManager.Asset) it.next()).textureId}, 0);
                }
                cardAssetManager.assets.clear();
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JWECryptoParts jWECryptoParts = (JWECryptoParts) obj2;
                BackgroundPlaneMaterial backgroundPlaneMaterial = (BackgroundPlaneMaterial) jWECryptoParts.iv;
                int i2 = backgroundPlaneMaterial.previousTextureId;
                if (i2 != 0) {
                    GLES20.glDeleteTextures(1, new int[]{i2}, 0);
                    backgroundPlaneMaterial.previousTextureId = 0;
                }
                int i3 = backgroundPlaneMaterial.currentTextureId;
                if (i3 != 0) {
                    GLES20.glDeleteTextures(1, new int[]{i3}, 0);
                    backgroundPlaneMaterial.currentTextureId = 0;
                }
                StateFlowImpl stateFlowImpl = backgroundPlaneMaterial._ready;
                Boolean bool = Boolean.FALSE;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, bool);
                HuffmanTreeGroup huffmanTreeGroup = (HuffmanTreeGroup) jWECryptoParts.encryptedKey;
                int i4 = huffmanTreeGroup.alphabetSize;
                if (i4 != 0) {
                    GLES20.glDeleteBuffers(1, new int[]{i4}, 0);
                    huffmanTreeGroup.alphabetSize = 0;
                }
                StateFlowImpl stateFlowImpl2 = (StateFlowImpl) huffmanTreeGroup.codes;
                stateFlowImpl2.getClass();
                stateFlowImpl2.updateState(null, bool);
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                HuffmanTreeGroup huffmanTreeGroup2 = (HuffmanTreeGroup) obj2;
                float[] fArr = {-1.0f, -1.0f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE, -1.0f, -1.0f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE, -1.0f, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
                FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(96).order(ByteOrder.nativeOrder()).asFloatBuffer();
                asFloatBuffer.put(fArr);
                asFloatBuffer.position(0);
                int[] iArr = new int[1];
                GLES20.glGenBuffers(1, iArr, 0);
                int i5 = iArr[0];
                huffmanTreeGroup2.alphabetSize = i5;
                GLES20.glBindBuffer(34962, i5);
                GLES20.glBufferData(34962, 96, asFloatBuffer, 35044);
                GLES20.glBindBuffer(34962, 0);
                StateFlowImpl stateFlowImpl3 = (StateFlowImpl) huffmanTreeGroup2.codes;
                Boolean bool2 = Boolean.TRUE;
                stateFlowImpl3.getClass();
                stateFlowImpl3.updateState(null, bool2);
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) obj2;
                List list = CardDesignLibraryScene.MINI_CARD_FORM_FACTORS;
                cardDesignLibraryScene.updateVisibleCards(RecyclerView.DECELERATION_RATE);
                cardDesignLibraryScene.markDirty();
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InstancedCardBatch instancedCardBatch = (InstancedCardBatch) obj2;
                instancedCardBatch.albedoArray.dispose();
                instancedCardBatch.normalArray.dispose();
                instancedCardBatch.inkMetalHeatArray.dispose();
                instancedCardBatch.holoBaseArray.dispose();
                instancedCardBatch.holoReflectArray.dispose();
                HeatMaskRenderer heatMaskRenderer = instancedCardBatch.heatMaskRenderer;
                if (heatMaskRenderer != null) {
                    heatMaskRenderer.release();
                }
                instancedCardBatch.heatMaskRenderer = null;
                MeshGeometry meshGeometry = instancedCardBatch.sharedGeometry;
                if (meshGeometry != null) {
                    meshGeometry.dispose();
                }
                int i6 = instancedCardBatch.instanceVboId;
                if (i6 != 0) {
                    GLES20.glDeleteBuffers(1, new int[]{i6}, 0);
                    instancedCardBatch.instanceVboId = 0;
                }
                int i7 = instancedCardBatch.uboId;
                if (i7 != 0) {
                    GLES20.glDeleteBuffers(1, new int[]{i7}, 0);
                    instancedCardBatch.uboId = 0;
                }
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{new Integer(instancedCardBatch.heatColorsTextureId), new Integer(instancedCardBatch.shimmerTextureId), new Integer(instancedCardBatch.snakeSkinTextureId), new Integer(instancedCardBatch.placeholderTextureId)});
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listOf) {
                    if (((Number) obj3).intValue() != 0) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    GLES20.glDeleteTextures(1, new int[]{((Number) it2.next()).intValue()}, 0);
                }
                StateFlowImpl stateFlowImpl4 = instancedCardBatch._ready;
                Boolean bool3 = Boolean.FALSE;
                stateFlowImpl4.getClass();
                stateFlowImpl4.updateState(null, bool3);
                StateFlowImpl stateFlowImpl5 = instancedCardBatch._texturesReady;
                stateFlowImpl5.getClass();
                stateFlowImpl5.updateState(null, bool3);
                instancedCardBatch._loadedCardIndices.setValue(EmptySet.INSTANCE);
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MeshGeometry meshGeometry2 = (MeshGeometry) obj2;
                LinkedHashMap linkedHashMap = meshGeometry2.vaosByProgram;
                Iterator it3 = linkedHashMap.values().iterator();
                while (it3.hasNext()) {
                    int intValue = ((Number) it3.next()).intValue();
                    if (intValue != 0) {
                        GLES30.glDeleteVertexArrays(1, new int[]{intValue}, 0);
                    }
                }
                linkedHashMap.clear();
                int i8 = meshGeometry2.vboId;
                if (i8 != 0) {
                    if (i8 != 0) {
                        GLES20.glDeleteBuffers(1, new int[]{i8}, 0);
                    }
                    meshGeometry2.vboId = 0;
                }
                int i9 = meshGeometry2.iboId;
                if (i9 != 0) {
                    if (i9 != 0) {
                        GLES20.glDeleteBuffers(1, new int[]{i9}, 0);
                    }
                    meshGeometry2.iboId = 0;
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PBRMaterial pBRMaterial = (PBRMaterial) obj2;
                pBRMaterial.plugin = pBRMaterial.createPlugin();
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Scene scene = (Scene) obj2;
                scene._entities.clear();
                RealStrongMemoryCache realStrongMemoryCache = scene.shaderManager;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) realStrongMemoryCache.weakMemoryCache;
                Iterator it4 = linkedHashMap2.values().iterator();
                while (it4.hasNext()) {
                    GLES20.glDeleteProgram(((Number) it4.next()).intValue());
                }
                linkedHashMap2.clear();
                ((LinkedHashMap) realStrongMemoryCache.cache).clear();
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((KeyStore) ((RealKeyStoreProvider) obj2).keyStore.delegate).load(null);
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List<IBaseEntity> allByType = ((EntityStore) ((RealMerchantRepository) obj2).dao.pool).getAllByType(EntityType.MERCHANT_WRAPPER);
                ArrayList arrayList2 = new ArrayList();
                for (IBaseEntity iBaseEntity : allByType) {
                    Merchant merchant = iBaseEntity instanceof Merchant ? (Merchant) iBaseEntity : null;
                    if (merchant != null) {
                        arrayList2.add(merchant);
                    }
                }
                return arrayList2;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AccountUpdateRequiredContentRepository.State state = (AccountUpdateRequiredContentRepository.State) ((AccountUpdateRequiredViewModel) obj2).updateRequiredContentRepository.get();
                NoticeSheetState.NoticeSheetContent.UpdateRequired updateRequired = state != null ? state.payload : null;
                if (updateRequired != null) {
                    return updateRequired;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            default:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((SelfieStepStateManager) obj2).setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
                return Unit.INSTANCE;
        }
    }
}
