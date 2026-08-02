package com.squareup.cash.card.onboarding.core.instancing;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Display;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.exoplayer.RendererHolder;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.RequestQueue;
import com.fillr.e0;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzd;
import com.miteksystems.misnap.camera.a.b;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.CardGeometry;
import com.squareup.cash.card.onboarding.core.instancing.GridInteractionController;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.graphics.HeartPoseController;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardEdition;
import com.squareup.cash.card.onboarding.graphics.MiniCardPoseController;
import com.squareup.cash.card.onboarding.graphics.MiniCardPoseControllerKt;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.SolidColorPBRMaterial;
import com.squareup.cash.card.onboarding.graphics.TagPoseController;
import com.squareup.cash.card.onboarding.graphics.WandEdition;
import com.squareup.cash.card.onboarding.graphics.WandPBRMaterial;
import com.squareup.cash.card.onboarding.graphics.WandPose;
import com.squareup.cash.card.onboarding.graphics.WandPoseController;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.components.AABB;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.graphics.swampgl.components.MaterialPlugin;
import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import com.squareup.cash.graphics.swampgl.components.RealUniformBinder;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.graphics.swampgl.components.SubMesh;
import com.squareup.cash.graphics.swampgl.components.Transform;
import com.squareup.cash.graphics.swampgl.components.ibl.IblComponent;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$Factory$create$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.utils.ColorUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.brotli.dec.HuffmanTreeGroup;
import papa.PapaEvent;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class CardDesignLibraryScene extends Scene {
    public static final Quat CARD_HOME_FACE_UP_RESTING;
    public static final Quat NEAR_CARD_BACK_ROTATION;
    public static final Quat NEAR_CARD_ROTATION;
    public static final float[] X_AXIS;
    public static final float[] Y_AXIS;
    public final StateFlowImpl _animationTime;
    public final StateFlowImpl _cardScreenBounds;
    public final StateFlowImpl _contentReady;
    public final StateFlowImpl _currentZoomLevel;
    public final StateFlowImpl _focusedCardIndex;
    public JobSupport animationJob;
    public final BufferedChannel animationWake;
    public final JWECryptoParts backgroundPlane;
    public Job batchJob;
    public int[] cardBatchIndex;
    public float cardCellShortAxis;
    public CardGeometry cardGeometry;
    public Vector3 cardScale;
    public final StateFlowImpl cardScreenBounds;
    public List cards;
    public final HashMap cellTagControllers;
    public int centerCardCol;
    public boolean centerCardLiftEngaged;
    public int centerCardRow;
    public final float centerCardSettleDelay;
    public float centerCardSettleTime;
    public float centerCardZCurrent;
    public float centerCardZLeaveStart;
    public float centerCardZVelocity;
    public final float centerZSpringDamping;
    public final float[] centerZSpringScratch;
    public final float centerZSpringStiffness;
    public final Transform centeredOverlayTransform;
    public final StateFlowImpl contentReady;
    public final Context context;
    public int currentPerCardCellIdx;
    public float currentPerCardCellScale;
    public int currentPerCardGridDim;
    public float[] currentPerCardVp;
    public final StateFlowImpl currentZoomLevel;
    public final Engine engine;
    public MeshGeometry firstEditionDecalGeometry;
    public float[] firstEditionDecalOpacityScratch;
    public InstancedTagPool firstEditionDecalPool;
    public final ArrayList firstEditionDecalTransformsThisFrame;
    public Set firstEditionHeartSlots;
    public final StateFlowImpl focusedCardIndex;
    public final long frameIntervalMs;
    public GridConfig gridConfig;
    public boolean hasActiveTag;
    public InstancedCardBatch instancedBatch;
    public final GridInteractionController interactionController;
    public boolean isInitialized;
    public List items;
    public float lastAnimationTime;
    public float lastDragDeltaX;
    public float lastDragDeltaY;
    public float lastTagTickTime;
    public final ArrayList mediumOverlayTransformPool;
    public int miniCardShadowDepthProgram;
    public boolean miniCardShadowProgramLinkFailed;
    public final float[] miniCardShadowVpScratch;
    public Quat nearDragRotation;
    public final float[] nearEulerCurrent;
    public final float[] nearEulerTarget;
    public final float[] nearEulerVelocity;
    public boolean nearRotationSettling;
    public final float[] nearRotationSpringScratch;
    public final ArrayList overlayTextureIndices;
    public final ArrayList overlayTransforms;
    public Integer pendingSnapIndex;
    public ZoomLevel pendingSnapZoom;
    public final ArrayList perCardFormFactorCache;
    public float[] perCardOpacityCache;
    public RendererHolder perCardShadowAtlas;
    public int perCardShadowAtlasAllocatedSize;
    public final e0 perCardShadowProjector;
    public final float[] perCardSingleOpacityScratch;
    public final ArrayList perCardSingleTransformScratch;
    public final ArrayList perCardTransformCache;
    public float[] perCardVpCache;
    public float poseTranslationScale;
    public final MarkwonConfiguration projection;
    public Job renderJob;
    public final float[] scratchProjMatrix;
    public final float[] scratchViewMatrix;
    public float screenAspectRatio;
    public float screenHeight;
    public float screenWidth;
    public final LinkedHashMap tagGeometries;
    public final HashMap tagInstanceOpacityScratch;
    public final HashMap tagInstanceTransformPool;
    public final HashMap tagInstanceTransformsThisFrame;
    public Map tagInstancedPools;
    public final LinkedHashMap tagScales;
    public Map tagSlotFormFactors;
    public Map tagSlotMetadata;
    public final ArrayList transformPool;
    public final ArrayList updateCanonicalIndices;
    public final ArrayList updateFadeMultipliers;
    public final ArrayList updateTextureIndices;
    public final ArrayList updateTransforms;
    public final ArrayList visibleTagCells;
    public final HashSet visibleTagControllerKeys;
    public boolean wasZoomAnimating;
    public final ZoomAnimator zoomAnimator;
    public static final List MINI_CARD_FORM_FACTORS = CollectionsKt__CollectionsKt.listOf((Object[]) new TagFormFactor[]{TagFormFactor.MINI_CARD, TagFormFactor.MINI_CARD_FIRST_EDITION});
    public static final float[] LIGHT_KEY_L_DIR = {0.5529f, 0.5584f, 0.6186f};
    public static final Vector3 IDENTITY_SCALE = new Vector3(1.0f, 1.0f, 1.0f);
    public static final float[] EMPTY_FLOATS = new float[0];

    public final class InstancedTagPool {
        public final ArrayList entities;
        public final ArrayList geometries;
        public final ArrayList materials;

        public InstancedTagPool(TagFormFactor tagFormFactor, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            this.geometries = arrayList;
            this.materials = arrayList2;
            this.entities = arrayList3;
        }
    }

    public final class TagSlotMetadata {
        public final int col;
        public final Transform overlayTransform = new Transform();
        public final int row;

        public TagSlotMetadata(int i, int i2, TagFormFactor tagFormFactor) {
            this.col = i;
            this.row = i2;
        }
    }

    static {
        float[] fArr = {1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        X_AXIS = fArr;
        Y_AXIS = new float[]{RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE};
        float[] fArr2 = {RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f};
        CARD_HOME_FACE_UP_RESTING = new Quat((float) Math.toRadians(-90.0d), fArr).times(new Quat((float) Math.toRadians(90.0d), fArr2));
        Quat times = new Quat(0.055956185f, 0.084961325f, -0.083761916f, 0.9912797f).times(CardModelView.CARD_CAMERA_ROTATION);
        NEAR_CARD_ROTATION = times;
        NEAR_CARD_BACK_ROTATION = new Quat((float) Math.toRadians(180.0d), fArr2).times(times);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDesignLibraryScene(Context context, Engine engine) {
        super(engine);
        context.getClass();
        engine.getClass();
        this.context = context;
        this.engine = engine;
        this.tagGeometries = new LinkedHashMap();
        this.tagScales = new LinkedHashMap();
        EmptyList emptyList = EmptyList.INSTANCE;
        this.items = emptyList;
        this.cards = emptyList;
        this.cardBatchIndex = new int[0];
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.tagSlotFormFactors = emptyMap;
        this.tagInstancedPools = emptyMap;
        this.firstEditionHeartSlots = EmptySet.INSTANCE;
        this.tagSlotMetadata = emptyMap;
        this.tagInstanceTransformPool = new HashMap();
        this.tagInstanceOpacityScratch = new HashMap();
        this.tagInstanceTransformsThisFrame = new HashMap();
        this.firstEditionDecalTransformsThisFrame = new ArrayList();
        this.firstEditionDecalOpacityScratch = EMPTY_FLOATS;
        this.cardScale = new Vector3(1.0f, 1.0f, 1.0f);
        this.cardCellShortAxis = 1.0f;
        this.poseTranslationScale = 1.0f;
        this.screenAspectRatio = 0.5f;
        this.projection = new MarkwonConfiguration(1);
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(emptyList);
        this._cardScreenBounds = MutableStateFlow;
        this.cardScreenBounds = MutableStateFlow;
        ZoomLevel zoomLevel = ZoomLevel.FAR;
        StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(zoomLevel);
        this._currentZoomLevel = MutableStateFlow2;
        this.currentZoomLevel = MutableStateFlow2;
        StateFlowImpl MutableStateFlow3 = FlowKt.MutableStateFlow(0);
        this._focusedCardIndex = MutableStateFlow3;
        this.focusedCardIndex = MutableStateFlow3;
        StateFlowImpl MutableStateFlow4 = FlowKt.MutableStateFlow(Boolean.FALSE);
        this._contentReady = MutableStateFlow4;
        this.contentReady = MutableStateFlow4;
        ZoomAnimator zoomAnimator = new ZoomAnimator();
        zoomAnimator.currentZoom = zoomLevel;
        zoomAnimator.targetZoom = zoomLevel;
        zoomAnimator.transitionProgress = 1.0f;
        zoomAnimator.panSettleDuration = 0.5f;
        zoomAnimator.panAnimProgress = 1.0f;
        this.zoomAnimator = zoomAnimator;
        GridInteractionController gridInteractionController = new GridInteractionController(zoomAnimator);
        gridInteractionController.onInteractionChanged = new CardDesignLibraryScene$$ExternalSyntheticLambda0(this, 0);
        this.interactionController = gridInteractionController;
        this.centerCardCol = PKIFailureInfo.systemUnavail;
        this.centerCardRow = PKIFailureInfo.systemUnavail;
        this.centerCardZCurrent = -3.0f;
        this.centerCardSettleDelay = 0.08f;
        this.centerCardZLeaveStart = Float.NaN;
        this.centerZSpringStiffness = 50.0f;
        this.centerZSpringDamping = ((float) Math.sqrt(50.0d)) * 2.0f;
        this.centerZSpringScratch = new float[2];
        this.nearDragRotation = NEAR_CARD_ROTATION;
        this.cellTagControllers = new HashMap();
        this.visibleTagControllerKeys = new HashSet();
        this.lastTagTickTime = -1.0f;
        this.nearEulerCurrent = new float[3];
        this.nearEulerTarget = new float[3];
        this.nearEulerVelocity = new float[3];
        this.nearRotationSpringScratch = new float[2];
        this._animationTime = FlowKt.MutableStateFlow(Float.valueOf(RecyclerView.DECELERATION_RATE));
        this.animationWake = PapaEvent.Channel$default(-1, null, null, 6);
        Object systemService = context.getSystemService("display");
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        long refreshRate = (long) (1000.0f / (display != null ? display.getRefreshRate() : 60.0f));
        this.frameIntervalMs = refreshRate < 1 ? 1L : refreshRate;
        engine.getClass();
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        jWECryptoParts.header = engine;
        HuffmanTreeGroup huffmanTreeGroup = new HuffmanTreeGroup(engine);
        jWECryptoParts.encryptedKey = huffmanTreeGroup;
        BackgroundPlaneMaterial backgroundPlaneMaterial = new BackgroundPlaneMaterial();
        jWECryptoParts.iv = backgroundPlaneMaterial;
        Entity entity = new Entity("background-plane", huffmanTreeGroup, backgroundPlaneMaterial, new Transform());
        entity.depthWrite = false;
        jWECryptoParts.cipherText = entity;
        this.backgroundPlane = jWECryptoParts;
        this.currentPerCardCellIdx = -1;
        this.currentPerCardGridDim = 1;
        this.currentPerCardCellScale = 1.0f;
        this.perCardSingleTransformScratch = new ArrayList();
        this.perCardSingleOpacityScratch = new float[1];
        this.miniCardShadowVpScratch = new float[16];
        this.perCardShadowProjector = new e0(LIGHT_KEY_L_DIR);
        this.perCardVpCache = new float[512];
        this.perCardTransformCache = new ArrayList(32);
        this.perCardOpacityCache = new float[32];
        this.perCardFormFactorCache = new ArrayList(32);
        this.camera.setFov(50.0f);
        this.camera.setFovIsHorizontal(false);
        this.camera.setNear(0.1f);
        this.camera.setFar(100.0f);
        this.camera.setUp(new Vector3(RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE));
        this.camera.setAspectRatio(this.screenAspectRatio);
        addEntity((Entity) jWECryptoParts.cipherText);
        IblComponent iblComponent = new IblComponent(context, engine);
        iblComponent.setIntensity(1.6f);
        setIblData(iblComponent);
        this.pendingSnapZoom = ZoomLevel.NEAR;
        this.transformPool = new ArrayList();
        this.updateTransforms = new ArrayList();
        this.updateTextureIndices = new ArrayList();
        this.updateCanonicalIndices = new ArrayList();
        this.updateFadeMultipliers = new ArrayList();
        this.overlayTransforms = new ArrayList();
        this.overlayTextureIndices = new ArrayList();
        this.centeredOverlayTransform = new Transform();
        this.visibleTagCells = new ArrayList();
        this.mediumOverlayTransformPool = new ArrayList();
        this.scratchViewMatrix = new float[16];
        this.scratchProjMatrix = new float[16];
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0139, code lost:
    
        r13 = r16;
        r7 = new com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1(r5.ready, r13, 0);
        r3.L$1 = r1;
        r3.L$2 = r13;
        r3.L$3 = r14;
        r3.L$4 = r2;
        r3.L$5 = r5;
        r3.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0155, code lost:
    
        if (kotlinx.coroutines.JobKt.withTimeout(5000, r7, r3) != r4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0159, code lost:
    
        r15 = r1;
        r1 = r5;
        r5 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.squareup.cash.card.onboarding.core.instancing.InstancedCardBatch, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene, com.squareup.cash.graphics.swampgl.components.Scene, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, kotlin.collections.EmptyMap] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0159 -> B:49:0x015c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$initializeBatch(CardDesignLibraryScene cardDesignLibraryScene, List list, ContinuationImpl continuationImpl) {
        CardDesignLibraryScene$initializeBatch$1 cardDesignLibraryScene$initializeBatch$1;
        int i;
        GridConfig gridConfig;
        InstancedCardBatch instancedCardBatch;
        float f;
        boolean z;
        Iterator it;
        GridConfig gridConfig2;
        InstancedCardBatch instancedCardBatch2;
        ?? hashMap;
        int i2;
        TagFormFactor tagFormFactor;
        Iterator it2;
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons;
        WandPBRMaterial materialFor;
        boolean z2;
        String str;
        GridConfig gridConfig3;
        Object obj;
        String str2;
        Integer num;
        JobSupport jobSupport;
        Job job;
        GridConfig gridConfig4;
        GridConfig gridConfig5;
        cardDesignLibraryScene.getClass();
        if (continuationImpl instanceof CardDesignLibraryScene$initializeBatch$1) {
            cardDesignLibraryScene$initializeBatch$1 = (CardDesignLibraryScene$initializeBatch$1) continuationImpl;
            int i3 = cardDesignLibraryScene$initializeBatch$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                cardDesignLibraryScene$initializeBatch$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = cardDesignLibraryScene$initializeBatch$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardDesignLibraryScene$initializeBatch$1.label;
                int i4 = 4;
                int i5 = 3;
                int i6 = 2;
                int i7 = 1;
                Object obj3 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    gridConfig = cardDesignLibraryScene.gridConfig;
                    if (gridConfig == null) {
                        return Unit.INSTANCE;
                    }
                    if (!list.isEmpty()) {
                        InstancedCardBatch instancedCardBatch3 = new InstancedCardBatch(cardDesignLibraryScene.context, cardDesignLibraryScene.engine);
                        instancedCardBatch3.iblIntensity = 1.6f;
                        instancedCardBatch3.holoReflectionDirOffsetX = 0.111f;
                        instancedCardBatch3.holoReflectionDirOffsetY = 0.636f;
                        try {
                            cardDesignLibraryScene$initializeBatch$1.L$1 = gridConfig;
                            cardDesignLibraryScene$initializeBatch$1.L$2 = instancedCardBatch3;
                            cardDesignLibraryScene$initializeBatch$1.label = 1;
                            if (instancedCardBatch3.setUniqueCards(list, cardDesignLibraryScene$initializeBatch$1) != coroutineSingletons2) {
                                instancedCardBatch = instancedCardBatch3;
                            }
                            return coroutineSingletons2;
                        } catch (CancellationException e) {
                            e = e;
                            instancedCardBatch = instancedCardBatch3;
                            instancedCardBatch.dispose();
                            throw e;
                        }
                    }
                    if (!cardDesignLibraryScene.tagSlotFormFactors.isEmpty()) {
                        it = SetsKt___SetsKt.plus(CollectionsKt.toSet(cardDesignLibraryScene.tagSlotFormFactors.values()), TagFormFactor.WAND).iterator();
                        gridConfig2 = gridConfig;
                        while (true) {
                            int i8 = 5;
                            if (!it.hasNext()) {
                            }
                            obj3 = obj;
                        }
                        return coroutineSingletons2;
                    }
                    f = RecyclerView.DECELERATION_RATE;
                    z = true;
                    cardDesignLibraryScene.isInitialized = z;
                    cardDesignLibraryScene.interactionController.isInitialized = z;
                    num = cardDesignLibraryScene.pendingSnapIndex;
                    if (num != null) {
                    }
                    cardDesignLibraryScene.updateCamera(GridLayout.getRenderParams(cardDesignLibraryScene.zoomAnimator.targetZoom, gridConfig));
                    cardDesignLibraryScene.updateVisibleCards(f);
                    cardDesignLibraryScene.markDirty();
                    jobSupport = cardDesignLibraryScene.animationJob;
                    Continuation continuation = null;
                    if (jobSupport != null) {
                    }
                    job = cardDesignLibraryScene.renderJob;
                    if (job != null) {
                    }
                    cardDesignLibraryScene.animationJob = (JobSupport) cardDesignLibraryScene.engine.launch(new CardDesignLibraryScene$centerOnCardIndex$1((CardDesignLibraryScene) cardDesignLibraryScene, continuation, 1));
                    cardDesignLibraryScene.renderJob = cardDesignLibraryScene.glLauncher.launch(new CardDesignLibraryScene$centerOnCardIndex$1((CardDesignLibraryScene) cardDesignLibraryScene, continuation, 2));
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gridConfig3 = cardDesignLibraryScene$initializeBatch$1.L$1;
                        SafeTrace.throwOnFailure(obj2);
                        f = RecyclerView.DECELERATION_RATE;
                        gridConfig = gridConfig3;
                        z = true;
                        cardDesignLibraryScene.isInitialized = z;
                        cardDesignLibraryScene.interactionController.isInitialized = z;
                        num = cardDesignLibraryScene.pendingSnapIndex;
                        if (num != null) {
                            ZoomLevel zoomLevel = cardDesignLibraryScene.pendingSnapZoom;
                            cardDesignLibraryScene.pendingSnapIndex = null;
                            ZoomLevel zoomLevel2 = ZoomLevel.NEAR;
                            cardDesignLibraryScene.pendingSnapZoom = zoomLevel2;
                            int ordinal = zoomLevel.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == z) {
                                    GridInteractionController gridInteractionController = cardDesignLibraryScene.interactionController;
                                    int intValue = num.intValue();
                                    ZoomAnimator zoomAnimator = gridInteractionController.zoomAnimator;
                                    if (gridInteractionController.isInitialized && (gridConfig4 = gridInteractionController.gridConfig) != null) {
                                        ZoomLevel zoomLevel3 = ZoomLevel.MEDIUM;
                                        zoomAnimator.currentZoom = zoomLevel3;
                                        zoomAnimator.targetZoom = zoomLevel3;
                                        zoomAnimator.transitionProgress = 1.0f;
                                        zoomAnimator.isPinchDriven = false;
                                        zoomAnimator.panAnimProgress = 1.0f;
                                        gridInteractionController.lastExploredCanonicalIndex = num;
                                        Pair position = GridLayout.position(intValue % 4, intValue / 4, gridConfig4, GridLayout.getRenderParams(zoomLevel3, gridConfig4));
                                        float floatValue = ((Number) position.first).floatValue();
                                        float floatValue2 = ((Number) position.second).floatValue();
                                        zoomAnimator.panX = floatValue;
                                        zoomAnimator.panY = -floatValue2;
                                        CardDesignLibraryScene$$ExternalSyntheticLambda0 cardDesignLibraryScene$$ExternalSyntheticLambda0 = gridInteractionController.onInteractionChanged;
                                        if (cardDesignLibraryScene$$ExternalSyntheticLambda0 != null) {
                                            cardDesignLibraryScene$$ExternalSyntheticLambda0.invoke();
                                        }
                                    }
                                } else {
                                    if (ordinal != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    GridInteractionController gridInteractionController2 = cardDesignLibraryScene.interactionController;
                                    int intValue2 = num.intValue();
                                    ZoomAnimator zoomAnimator2 = gridInteractionController2.zoomAnimator;
                                    if (gridInteractionController2.isInitialized && (gridConfig5 = gridInteractionController2.gridConfig) != null) {
                                        int i9 = intValue2 % 4;
                                        int i10 = intValue2 / 4;
                                        gridInteractionController2.zoomOriginBeforeNear = ZoomLevel.MEDIUM;
                                        gridInteractionController2.lastExploredCanonicalIndex = num;
                                        zoomAnimator2.focusedCol = i9;
                                        zoomAnimator2.focusedRow = i10;
                                        zoomAnimator2.focusedCardIndex = intValue2;
                                        zoomAnimator2.currentZoom = zoomLevel2;
                                        zoomAnimator2.targetZoom = zoomLevel2;
                                        zoomAnimator2.transitionProgress = 1.0f;
                                        zoomAnimator2.isPinchDriven = false;
                                        zoomAnimator2.panAnimProgress = 1.0f;
                                        Pair position2 = GridLayout.position(i9, i10, gridConfig5, GridLayout.getRenderParams(zoomLevel2, gridConfig5));
                                        float floatValue3 = ((Number) position2.first).floatValue();
                                        float floatValue4 = ((Number) position2.second).floatValue();
                                        zoomAnimator2.panX = floatValue3;
                                        zoomAnimator2.panY = (-floatValue4) + 1.0f;
                                        CardDesignLibraryScene$$ExternalSyntheticLambda0 cardDesignLibraryScene$$ExternalSyntheticLambda02 = gridInteractionController2.onInteractionChanged;
                                        if (cardDesignLibraryScene$$ExternalSyntheticLambda02 != null) {
                                            cardDesignLibraryScene$$ExternalSyntheticLambda02.invoke();
                                        }
                                    }
                                }
                            }
                        }
                        cardDesignLibraryScene.updateCamera(GridLayout.getRenderParams(cardDesignLibraryScene.zoomAnimator.targetZoom, gridConfig));
                        cardDesignLibraryScene.updateVisibleCards(f);
                        cardDesignLibraryScene.markDirty();
                        jobSupport = cardDesignLibraryScene.animationJob;
                        Continuation continuation2 = null;
                        if (jobSupport != null) {
                            jobSupport.cancel(null);
                        }
                        job = cardDesignLibraryScene.renderJob;
                        if (job != null) {
                            job.cancel(null);
                        }
                        cardDesignLibraryScene.animationJob = (JobSupport) cardDesignLibraryScene.engine.launch(new CardDesignLibraryScene$centerOnCardIndex$1((CardDesignLibraryScene) cardDesignLibraryScene, continuation2, 1));
                        cardDesignLibraryScene.renderJob = cardDesignLibraryScene.glLauncher.launch(new CardDesignLibraryScene$centerOnCardIndex$1((CardDesignLibraryScene) cardDesignLibraryScene, continuation2, 2));
                        return Unit.INSTANCE;
                    }
                    MeshGeometry meshGeometry = cardDesignLibraryScene$initializeBatch$1.L$5;
                    TagFormFactor tagFormFactor2 = cardDesignLibraryScene$initializeBatch$1.L$4;
                    it = cardDesignLibraryScene$initializeBatch$1.L$3;
                    GridConfig gridConfig6 = cardDesignLibraryScene$initializeBatch$1.L$1;
                    SafeTrace.throwOnFailure(obj2);
                    float f2 = RecyclerView.DECELERATION_RATE;
                    float f3 = (tagFormFactor2 == TagFormFactor.WAND || tagFormFactor2 == TagFormFactor.WAND_FIRST_EDITION) ? 3.0f : cardDesignLibraryScene.cardCellShortAxis * 0.75f;
                    AABB aabb = meshGeometry.getAABB();
                    float max = Math.max((aabb.maxX - aabb.minX) / 2.0f, Math.max((aabb.maxY - aabb.minY) / 2.0f, (aabb.maxZ - aabb.minZ) / 2.0f));
                    float f4 = max > f2 ? f3 / (max * 2.0f) : 1.0f;
                    cardDesignLibraryScene.tagScales.put(tagFormFactor2, new Vector3(f4, f4, f4));
                    gridConfig2 = gridConfig6;
                    i4 = 4;
                    obj3 = null;
                    while (true) {
                        int i82 = 5;
                        if (!it.hasNext()) {
                            TagFormFactor tagFormFactor3 = (TagFormFactor) it.next();
                            if (cardDesignLibraryScene.tagGeometries.get(tagFormFactor3) == null) {
                                LinkedHashMap linkedHashMap = cardDesignLibraryScene.tagGeometries;
                                f2 = RecyclerView.DECELERATION_RATE;
                                Context context = cardDesignLibraryScene.context;
                                Engine engine = cardDesignLibraryScene.engine;
                                tagFormFactor3.getClass();
                                obj = obj3;
                                int ordinal2 = tagFormFactor3.ordinal();
                                if (ordinal2 != 0) {
                                    if (ordinal2 != 1) {
                                        if (ordinal2 != 2) {
                                            if (ordinal2 != 3) {
                                                if (ordinal2 != i4) {
                                                    if (ordinal2 != 5) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return obj;
                                                    }
                                                }
                                            }
                                        }
                                        str2 = "minicard.cashmesh";
                                        linkedHashMap.put(tagFormFactor3, new MeshGeometry(context, engine, str2));
                                    }
                                    str2 = "heart.cashmesh";
                                    linkedHashMap.put(tagFormFactor3, new MeshGeometry(context, engine, str2));
                                }
                                str2 = "wand.cashmesh";
                                linkedHashMap.put(tagFormFactor3, new MeshGeometry(context, engine, str2));
                            } else {
                                obj = obj3;
                                f2 = RecyclerView.DECELERATION_RATE;
                            }
                            MeshGeometry meshGeometry2 = (MeshGeometry) cardDesignLibraryScene.tagGeometries.get(tagFormFactor3);
                            if (meshGeometry2 != null) {
                                break;
                            }
                            obj3 = obj;
                        } else {
                            f = RecyclerView.DECELERATION_RATE;
                            Vector3 vector3 = (Vector3) cardDesignLibraryScene.tagScales.get(TagFormFactor.WAND);
                            cardDesignLibraryScene.poseTranslationScale = vector3 != null ? vector3.x : 1.0f;
                            cardDesignLibraryScene.disposeTagPools();
                            if (cardDesignLibraryScene.engine.glesVersion < 3) {
                                Timber.Forest.w("Skipping tag pools (%s): engine on GLES %d, need 3", CollectionsKt.toSet(cardDesignLibraryScene.tagSlotFormFactors.values()), Integer.valueOf(cardDesignLibraryScene.engine.glesVersion));
                                hashMap = EmptyMap.INSTANCE;
                                hashMap.getClass();
                            } else {
                                hashMap = new HashMap();
                                Iterator it3 = CollectionsKt.toSet(cardDesignLibraryScene.tagSlotFormFactors.values()).iterator();
                                while (it3.hasNext()) {
                                    TagFormFactor tagFormFactor4 = (TagFormFactor) it3.next();
                                    MeshGeometry meshGeometry3 = (MeshGeometry) cardDesignLibraryScene.tagGeometries.get(tagFormFactor4);
                                    if (meshGeometry3 != null) {
                                        ?? r13 = (tagFormFactor4 == TagFormFactor.MINI_CARD || tagFormFactor4 == TagFormFactor.MINI_CARD_FIRST_EDITION) ? i7 : 0;
                                        List list2 = meshGeometry3.subMeshes;
                                        if (list2.isEmpty()) {
                                            list2 = null;
                                        }
                                        if (list2 == null) {
                                            tagFormFactor4.getClass();
                                            int ordinal3 = tagFormFactor4.ordinal();
                                            if (ordinal3 != 0) {
                                                if (ordinal3 != i7) {
                                                    if (ordinal3 != i6) {
                                                        if (ordinal3 != i5) {
                                                            if (ordinal3 != 4) {
                                                                if (ordinal3 != i82) {
                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                    return null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    str = "Card_Body_VDI33";
                                                    list2 = CollectionsKt__CollectionsJVMKt.listOf(new SubMesh(str, 0, meshGeometry3.indexCount));
                                                }
                                                str = "heart";
                                                list2 = CollectionsKt__CollectionsJVMKt.listOf(new SubMesh(str, 0, meshGeometry3.indexCount));
                                            }
                                            str = "wand";
                                            list2 = CollectionsKt__CollectionsJVMKt.listOf(new SubMesh(str, 0, meshGeometry3.indexCount));
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        ArrayList arrayList3 = new ArrayList();
                                        ArrayList arrayList4 = new ArrayList();
                                        Transform transform = new Transform();
                                        Iterator it4 = list2.iterator();
                                        while (it4.hasNext()) {
                                            SubMesh subMesh = (SubMesh) it4.next();
                                            Engine engine2 = cardDesignLibraryScene.engine;
                                            ArrayList arrayList5 = arrayList4;
                                            String str3 = subMesh.name;
                                            Iterator it5 = it3;
                                            int ordinal4 = tagFormFactor4.ordinal();
                                            if (ordinal4 != 0) {
                                                it2 = it4;
                                                if (ordinal4 == 1) {
                                                    z2 = true;
                                                } else if (ordinal4 == 2) {
                                                    arrayList = arrayList5;
                                                    coroutineSingletons = coroutineSingletons2;
                                                    float[] fArr = MiniCardScene.LIGHT_KEY_OFFSET;
                                                    materialFor = FlowsKt.materialFor(engine2, str3, MiniCardEdition.STANDARD);
                                                } else if (ordinal4 == 3) {
                                                    arrayList = arrayList5;
                                                    coroutineSingletons = coroutineSingletons2;
                                                    Quat quat = WandScene.DEFAULT_ROTATION;
                                                    materialFor = FlowsKt.materialFor(engine2, str3, true, WandEdition.FIRST_EDITION);
                                                } else if (ordinal4 != 4) {
                                                    arrayList = arrayList5;
                                                    coroutineSingletons = coroutineSingletons2;
                                                    if (ordinal4 != 5) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    float[] fArr2 = MiniCardScene.LIGHT_KEY_OFFSET;
                                                    materialFor = FlowsKt.materialFor(engine2, str3, MiniCardEdition.FIRST_EDITION);
                                                } else {
                                                    z2 = true;
                                                }
                                                arrayList = arrayList5;
                                                coroutineSingletons = coroutineSingletons2;
                                                Quat quat2 = HeartScene.DEFAULT_ROTATION;
                                                materialFor = zzb.materialFor(engine2, str3, z2);
                                            } else {
                                                it2 = it4;
                                                arrayList = arrayList5;
                                                coroutineSingletons = coroutineSingletons2;
                                                Quat quat3 = WandScene.DEFAULT_ROTATION;
                                                materialFor = FlowsKt.materialFor(engine2, str3, true, WandEdition.STANDARD);
                                            }
                                            materialFor.setOpacity(1.0f);
                                            InstancedTagSubMeshGeometry instancedTagSubMeshGeometry = new InstancedTagSubMeshGeometry(meshGeometry3, subMesh, cardDesignLibraryScene.engine);
                                            MeshGeometry meshGeometry4 = meshGeometry3;
                                            String lowerCase = tagFormFactor4.name().toLowerCase(Locale.ROOT);
                                            lowerCase.getClass();
                                            GridConfig gridConfig7 = gridConfig2;
                                            CardDesignLibraryScene$initializeBatch$1 cardDesignLibraryScene$initializeBatch$12 = cardDesignLibraryScene$initializeBatch$1;
                                            Entity entity = new Entity(Boxes$$ExternalSyntheticOutline1.m("tag_", lowerCase, "_", subMesh.name, "_instanced"), instancedTagSubMeshGeometry, materialFor, transform);
                                            if (r13 != 0) {
                                                entity.setNeedsDoubleSidedRendering(true);
                                            }
                                            entity.receivesShadows = r13;
                                            if (r13 != 0) {
                                                entity.setVisible(false);
                                            }
                                            arrayList2.add(instancedTagSubMeshGeometry);
                                            arrayList3.add(materialFor);
                                            arrayList.add(entity);
                                            cardDesignLibraryScene.addEntity(entity);
                                            meshGeometry3 = meshGeometry4;
                                            arrayList4 = arrayList;
                                            coroutineSingletons2 = coroutineSingletons;
                                            it3 = it5;
                                            it4 = it2;
                                            gridConfig2 = gridConfig7;
                                            cardDesignLibraryScene$initializeBatch$1 = cardDesignLibraryScene$initializeBatch$12;
                                        }
                                        GridConfig gridConfig8 = gridConfig2;
                                        CardDesignLibraryScene$initializeBatch$1 cardDesignLibraryScene$initializeBatch$13 = cardDesignLibraryScene$initializeBatch$1;
                                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                                        ArrayList arrayList6 = arrayList4;
                                        Iterator it6 = it3;
                                        if (r13 != 0) {
                                            Iterator it7 = arrayList3.iterator();
                                            while (it7.hasNext()) {
                                                WandPBRMaterial wandPBRMaterial = (WandPBRMaterial) it7.next();
                                                wandPBRMaterial.keyCastsShadow = true;
                                                wandPBRMaterial.markDirty$1();
                                            }
                                        }
                                        tagFormFactor4.getClass();
                                        int ordinal5 = tagFormFactor4.ordinal();
                                        if (ordinal5 != 0) {
                                            if (ordinal5 != 1) {
                                                if (ordinal5 == 2) {
                                                    i2 = 5;
                                                } else if (ordinal5 != 3) {
                                                    if (ordinal5 != 4) {
                                                        i2 = 5;
                                                        if (ordinal5 != 5) {
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            return null;
                                                        }
                                                    }
                                                }
                                                tagFormFactor = TagFormFactor.MINI_CARD;
                                                if (tagFormFactor == TagFormFactor.HEART) {
                                                    Iterator it8 = arrayList3.iterator();
                                                    while (it8.hasNext()) {
                                                        WandPBRMaterial wandPBRMaterial2 = (WandPBRMaterial) it8.next();
                                                        wandPBRMaterial2.iblIntensityOverride = Float.valueOf(0.5f);
                                                        wandPBRMaterial2.markDirty$1();
                                                    }
                                                }
                                                hashMap.put(tagFormFactor4, new InstancedTagPool(tagFormFactor4, arrayList2, arrayList3, arrayList6));
                                                i82 = i2;
                                                coroutineSingletons2 = coroutineSingletons3;
                                                it3 = it6;
                                                gridConfig2 = gridConfig8;
                                                cardDesignLibraryScene$initializeBatch$1 = cardDesignLibraryScene$initializeBatch$13;
                                                i5 = 3;
                                                i6 = 2;
                                                i7 = 1;
                                            }
                                            i2 = 5;
                                            tagFormFactor = TagFormFactor.HEART;
                                            if (tagFormFactor == TagFormFactor.HEART) {
                                            }
                                            hashMap.put(tagFormFactor4, new InstancedTagPool(tagFormFactor4, arrayList2, arrayList3, arrayList6));
                                            i82 = i2;
                                            coroutineSingletons2 = coroutineSingletons3;
                                            it3 = it6;
                                            gridConfig2 = gridConfig8;
                                            cardDesignLibraryScene$initializeBatch$1 = cardDesignLibraryScene$initializeBatch$13;
                                            i5 = 3;
                                            i6 = 2;
                                            i7 = 1;
                                        }
                                        i2 = 5;
                                        tagFormFactor = TagFormFactor.WAND;
                                        if (tagFormFactor == TagFormFactor.HEART) {
                                        }
                                        hashMap.put(tagFormFactor4, new InstancedTagPool(tagFormFactor4, arrayList2, arrayList3, arrayList6));
                                        i82 = i2;
                                        coroutineSingletons2 = coroutineSingletons3;
                                        it3 = it6;
                                        gridConfig2 = gridConfig8;
                                        cardDesignLibraryScene$initializeBatch$1 = cardDesignLibraryScene$initializeBatch$13;
                                        i5 = 3;
                                        i6 = 2;
                                        i7 = 1;
                                    }
                                }
                            }
                            GridConfig gridConfig9 = gridConfig2;
                            CardDesignLibraryScene$initializeBatch$1 cardDesignLibraryScene$initializeBatch$14 = cardDesignLibraryScene$initializeBatch$1;
                            CoroutineSingletons coroutineSingletons4 = coroutineSingletons2;
                            cardDesignLibraryScene.tagInstancedPools = hashMap;
                            HashMap hashMap2 = new HashMap();
                            Iterator it9 = CollectionsKt.sorted(cardDesignLibraryScene.tagSlotFormFactors.keySet()).iterator();
                            while (it9.hasNext()) {
                                int intValue3 = ((Number) it9.next()).intValue();
                                TagFormFactor tagFormFactor5 = (TagFormFactor) cardDesignLibraryScene.tagSlotFormFactors.get(Integer.valueOf(intValue3));
                                if (tagFormFactor5 != null) {
                                    Integer valueOf = Integer.valueOf(intValue3);
                                    gridConfig9.getClass();
                                    hashMap2.put(valueOf, new TagSlotMetadata(intValue3 % 4, intValue3 / 4, tagFormFactor5));
                                }
                            }
                            cardDesignLibraryScene.tagSlotMetadata = hashMap2;
                            cardDesignLibraryScene$initializeBatch$14.L$1 = gridConfig9;
                            cardDesignLibraryScene$initializeBatch$14.L$2 = null;
                            cardDesignLibraryScene$initializeBatch$14.L$3 = null;
                            cardDesignLibraryScene$initializeBatch$14.L$4 = null;
                            cardDesignLibraryScene$initializeBatch$14.L$5 = null;
                            cardDesignLibraryScene$initializeBatch$14.label = 3;
                            if (cardDesignLibraryScene.buildFirstEditionDecalPool(cardDesignLibraryScene$initializeBatch$14) == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            gridConfig3 = gridConfig9;
                        }
                    }
                    return coroutineSingletons2;
                }
                instancedCardBatch = cardDesignLibraryScene$initializeBatch$1.L$2;
                gridConfig = cardDesignLibraryScene$initializeBatch$1.L$1;
                try {
                    SafeTrace.throwOnFailure(obj2);
                } catch (CancellationException e2) {
                    e = e2;
                    instancedCardBatch.dispose();
                    throw e;
                }
                instancedCardBatch2 = cardDesignLibraryScene.instancedBatch;
                if (instancedCardBatch2 != null) {
                    cardDesignLibraryScene.removeEntity(instancedCardBatch2.getEntity().id);
                    instancedCardBatch2.dispose();
                }
                cardDesignLibraryScene.instancedBatch = instancedCardBatch;
                cardDesignLibraryScene.addEntity(instancedCardBatch.getEntity());
                if (!cardDesignLibraryScene.tagSlotFormFactors.isEmpty()) {
                }
            }
        }
        cardDesignLibraryScene$initializeBatch$1 = new CardDesignLibraryScene$initializeBatch$1(cardDesignLibraryScene, continuationImpl);
        Object obj22 = cardDesignLibraryScene$initializeBatch$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardDesignLibraryScene$initializeBatch$1.label;
        int i42 = 4;
        int i52 = 3;
        int i62 = 2;
        int i72 = 1;
        Object obj32 = null;
        if (i != 0) {
        }
        instancedCardBatch2 = cardDesignLibraryScene.instancedBatch;
        if (instancedCardBatch2 != null) {
        }
        cardDesignLibraryScene.instancedBatch = instancedCardBatch;
        cardDesignLibraryScene.addEntity(instancedCardBatch.getEntity());
        if (!cardDesignLibraryScene.tagSlotFormFactors.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$initializeGeometryAndSpacing(CardDesignLibraryScene cardDesignLibraryScene, ContinuationImpl continuationImpl) {
        CardDesignLibraryScene$initializeGeometryAndSpacing$1 cardDesignLibraryScene$initializeGeometryAndSpacing$1;
        int i;
        CardGeometry cardGeometry;
        cardDesignLibraryScene.getClass();
        if (continuationImpl instanceof CardDesignLibraryScene$initializeGeometryAndSpacing$1) {
            cardDesignLibraryScene$initializeGeometryAndSpacing$1 = (CardDesignLibraryScene$initializeGeometryAndSpacing$1) continuationImpl;
            int i2 = cardDesignLibraryScene$initializeGeometryAndSpacing$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cardDesignLibraryScene$initializeGeometryAndSpacing$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cardDesignLibraryScene$initializeGeometryAndSpacing$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardDesignLibraryScene$initializeGeometryAndSpacing$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (cardDesignLibraryScene.cardGeometry == null) {
                        cardDesignLibraryScene.cardGeometry = new CardGeometry(cardDesignLibraryScene.context, cardDesignLibraryScene.engine);
                    }
                    CardGeometry cardGeometry2 = cardDesignLibraryScene.cardGeometry;
                    if (cardGeometry2 == null) {
                        return Unit.INSTANCE;
                    }
                    CardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1 cardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1 = new CardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1(cardGeometry2.ready, continuation, 2);
                    cardDesignLibraryScene$initializeGeometryAndSpacing$1.L$0 = cardGeometry2;
                    cardDesignLibraryScene$initializeGeometryAndSpacing$1.label = 1;
                    if (JobKt.withTimeout(5000L, cardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1, cardDesignLibraryScene$initializeGeometryAndSpacing$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cardGeometry = cardGeometry2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cardGeometry = cardDesignLibraryScene$initializeGeometryAndSpacing$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                AABB aabb = cardGeometry.getAABB();
                float f = aabb.minZ;
                float f2 = aabb.maxZ;
                float f3 = aabb.maxX - aabb.minX;
                float f4 = f2 - f;
                float max = Math.max(f3 / 2.0f, Math.max((aabb.maxY - aabb.minY) / 2.0f, f4 / 2.0f));
                float f5 = max <= RecyclerView.DECELERATION_RATE ? 3.0f / (max * 2.0f) : 1.0f;
                cardDesignLibraryScene.cardScale = new Vector3(f5, f5, f5);
                Timber.Forest forest = Timber.Forest;
                forest.d("Card scale computed: " + f5, new Object[0]);
                float f6 = f3 * f5;
                float f7 = f4 * f5;
                cardDesignLibraryScene.cardCellShortAxis = Math.min(f6, f7);
                GridConfig create$default = zzd.create$default(f6, f7, cardDesignLibraryScene.items.size());
                cardDesignLibraryScene.gridConfig = create$default;
                GridInteractionController gridInteractionController = cardDesignLibraryScene.interactionController;
                gridInteractionController.gridConfig = create$default;
                gridInteractionController.applyFarRestOffset();
                forest.d("GridConfig: " + cardDesignLibraryScene.gridConfig, new Object[0]);
                return Unit.INSTANCE;
            }
        }
        cardDesignLibraryScene$initializeGeometryAndSpacing$1 = new CardDesignLibraryScene$initializeGeometryAndSpacing$1(cardDesignLibraryScene, continuationImpl);
        Object obj2 = cardDesignLibraryScene$initializeGeometryAndSpacing$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardDesignLibraryScene$initializeGeometryAndSpacing$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        AABB aabb2 = cardGeometry.getAABB();
        float f8 = aabb2.minZ;
        float f22 = aabb2.maxZ;
        float f32 = aabb2.maxX - aabb2.minX;
        float f42 = f22 - f8;
        float max2 = Math.max(f32 / 2.0f, Math.max((aabb2.maxY - aabb2.minY) / 2.0f, f42 / 2.0f));
        if (max2 <= RecyclerView.DECELERATION_RATE) {
        }
        cardDesignLibraryScene.cardScale = new Vector3(f5, f5, f5);
        Timber.Forest forest2 = Timber.Forest;
        forest2.d("Card scale computed: " + f5, new Object[0]);
        float f62 = f32 * f5;
        float f72 = f42 * f5;
        cardDesignLibraryScene.cardCellShortAxis = Math.min(f62, f72);
        GridConfig create$default2 = zzd.create$default(f62, f72, cardDesignLibraryScene.items.size());
        cardDesignLibraryScene.gridConfig = create$default2;
        GridInteractionController gridInteractionController2 = cardDesignLibraryScene.interactionController;
        gridInteractionController2.gridConfig = create$default2;
        gridInteractionController2.applyFarRestOffset();
        forest2.d("GridConfig: " + cardDesignLibraryScene.gridConfig, new Object[0]);
        return Unit.INSTANCE;
    }

    public final void appendFirstEditionDecalIfNeeded(int i, Transform transform, float f) {
        if (this.firstEditionHeartSlots.contains(Integer.valueOf(i)) && this.firstEditionDecalPool != null) {
            ArrayList arrayList = this.firstEditionDecalTransformsThisFrame;
            arrayList.add(transform);
            int size = arrayList.size();
            float[] fArr = this.firstEditionDecalOpacityScratch;
            if (fArr.length < size) {
                int length = fArr.length;
                if (length < 16) {
                    length = 16;
                }
                while (length < size) {
                    length *= 2;
                }
                this.firstEditionDecalOpacityScratch = new float[length];
            }
            this.firstEditionDecalOpacityScratch[size - 1] = f;
        }
    }

    public final void appendTagInstance(TagFormFactor tagFormFactor, Transform transform, float f) {
        HashMap hashMap = this.tagInstanceTransformsThisFrame;
        Object obj = hashMap.get(tagFormFactor);
        if (obj == null) {
            obj = new ArrayList();
            hashMap.put(tagFormFactor, obj);
        }
        List list = (List) obj;
        list.add(transform);
        int size = list.size();
        HashMap hashMap2 = this.tagInstanceOpacityScratch;
        float[] fArr = (float[]) hashMap2.get(tagFormFactor);
        if (fArr == null || fArr.length < size) {
            int length = fArr != null ? fArr.length : 16;
            int i = length >= 16 ? length : 16;
            while (i < size) {
                i *= 2;
            }
            fArr = new float[i];
            hashMap2.put(tagFormFactor, fArr);
        }
        fArr[list.size() - 1] = f;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Scene
    public final void bindShadowUniforms(RealUniformBinder realUniformBinder, boolean z) {
        float[] fArr = this.currentPerCardVp;
        RendererHolder rendererHolder = this.perCardShadowAtlas;
        if (!z || fArr == null || rendererHolder == null || !rendererHolder.primaryRequiresReset) {
            super.bindShadowUniforms(realUniformBinder, z);
            return;
        }
        int i = this.perCardShadowAtlasAllocatedSize;
        if (i < 1) {
            i = 1;
        }
        realUniformBinder.setFloat("uShadowsEnabled", 1.0f);
        realUniformBinder.setFloat("uShadowMapTexel", 1.0f / i);
        realUniformBinder.setFloat("uShadowBiasMin", 1.0E-4f);
        realUniformBinder.setFloat("uShadowBiasMax", 5.0E-4f);
        realUniformBinder.setFloat("uShadowStrength", 4.0f);
        realUniformBinder.setFloat("uShadowAtlasGrid", this.currentPerCardGridDim);
        realUniformBinder.setFloat("uShadowCellIndex", this.currentPerCardCellIdx);
        realUniformBinder.setFloat("uShadowCellScale", this.currentPerCardCellScale);
        realUniformBinder.setInt(1, "uUsePcf");
        realUniformBinder.setInt(11, "uShadowMap");
        int uniformLocation = realUniformBinder.getUniformLocation("uLightViewProjection");
        if (uniformLocation >= 0) {
            GLES20.glUniformMatrix4fv(uniformLocation, 1, false, fArr, 0);
        }
        GLES20.glActiveTexture(33995);
        GLES20.glBindTexture(3553, rendererHolder.index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0 A[LOOP:0: B:16:0x009a->B:18:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buildFirstEditionDecalPool(ContinuationImpl continuationImpl) {
        CardDesignLibraryScene$buildFirstEditionDecalPool$1 cardDesignLibraryScene$buildFirstEditionDecalPool$1;
        int i;
        MeshGeometry meshGeometry;
        List<SubMesh> list;
        if (continuationImpl instanceof CardDesignLibraryScene$buildFirstEditionDecalPool$1) {
            cardDesignLibraryScene$buildFirstEditionDecalPool$1 = (CardDesignLibraryScene$buildFirstEditionDecalPool$1) continuationImpl;
            int i2 = cardDesignLibraryScene$buildFirstEditionDecalPool$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cardDesignLibraryScene$buildFirstEditionDecalPool$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cardDesignLibraryScene$buildFirstEditionDecalPool$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardDesignLibraryScene$buildFirstEditionDecalPool$1.label;
                int i3 = 1;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.engine.glesVersion < 3 || this.firstEditionHeartSlots.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    MeshGeometry meshGeometry2 = new MeshGeometry(this.context, this.engine, "heart_first_edition.cashmesh");
                    this.firstEditionDecalGeometry = meshGeometry2;
                    CardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1 cardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1 = new CardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1(meshGeometry2.ready, objArr == true ? 1 : 0, i3);
                    cardDesignLibraryScene$buildFirstEditionDecalPool$1.L$0 = meshGeometry2;
                    cardDesignLibraryScene$buildFirstEditionDecalPool$1.label = 1;
                    if (JobKt.withTimeout(5000L, cardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1, cardDesignLibraryScene$buildFirstEditionDecalPool$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    meshGeometry = meshGeometry2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    meshGeometry = cardDesignLibraryScene$buildFirstEditionDecalPool$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                List list2 = meshGeometry.subMeshes;
                list = list2.isEmpty() ? null : list2;
                if (list == null) {
                    list = CollectionsKt__CollectionsJVMKt.listOf(new SubMesh("FirstEdition_Mat", 0, meshGeometry.indexCount));
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Transform transform = new Transform();
                for (SubMesh subMesh : list) {
                    Quat quat = HeartScene.DEFAULT_ROTATION;
                    SolidColorPBRMaterial materialFor = zzb.materialFor(this.engine, subMesh.name, true);
                    materialFor.setOpacity(1.0f);
                    materialFor.iblIntensityOverride = new Float(0.5f);
                    materialFor.markDirty$1();
                    InstancedTagSubMeshGeometry instancedTagSubMeshGeometry = new InstancedTagSubMeshGeometry(meshGeometry, subMesh, this.engine);
                    Entity entity = new Entity(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("tag_heart_first_edition_", subMesh.name, "_instanced"), instancedTagSubMeshGeometry, materialFor, transform);
                    arrayList.add(instancedTagSubMeshGeometry);
                    arrayList2.add(materialFor);
                    arrayList3.add(entity);
                    addEntity(entity);
                }
                this.firstEditionDecalPool = new InstancedTagPool(TagFormFactor.HEART_FIRST_EDITION, arrayList, arrayList2, arrayList3);
                return Unit.INSTANCE;
            }
        }
        cardDesignLibraryScene$buildFirstEditionDecalPool$1 = new CardDesignLibraryScene$buildFirstEditionDecalPool$1(this, continuationImpl);
        Object obj2 = cardDesignLibraryScene$buildFirstEditionDecalPool$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardDesignLibraryScene$buildFirstEditionDecalPool$1.label;
        int i32 = 1;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        List list22 = meshGeometry.subMeshes;
        if (list22.isEmpty()) {
        }
        if (list == null) {
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList22 = new ArrayList();
        ArrayList arrayList32 = new ArrayList();
        Transform transform2 = new Transform();
        while (r4.hasNext()) {
        }
        this.firstEditionDecalPool = new InstancedTagPool(TagFormFactor.HEART_FIRST_EDITION, arrayList4, arrayList22, arrayList32);
        return Unit.INSTANCE;
    }

    public final void disposeTagPools() {
        Iterator it = this.tagInstancedPools.entrySet().iterator();
        while (it.hasNext()) {
            InstancedTagPool instancedTagPool = (InstancedTagPool) ((Map.Entry) it.next()).getValue();
            Iterator it2 = instancedTagPool.entities.iterator();
            while (it2.hasNext()) {
                removeEntity(((Entity) it2.next()).id);
            }
            Iterator it3 = instancedTagPool.geometries.iterator();
            while (it3.hasNext()) {
                InstancedTagSubMeshGeometry instancedTagSubMeshGeometry = (InstancedTagSubMeshGeometry) it3.next();
                int i = instancedTagSubMeshGeometry.instanceVboId;
                int i2 = instancedTagSubMeshGeometry.vaoId;
                instancedTagSubMeshGeometry.instanceVboId = 0;
                instancedTagSubMeshGeometry.vaoId = 0;
                if (i != 0 || i2 != 0) {
                    instancedTagSubMeshGeometry.glLauncher.launch(new UiStepFileSelectWorker$Factory$create$2(i, i2, (Continuation) null));
                }
            }
            Iterator it4 = instancedTagPool.materials.iterator();
            while (it4.hasNext()) {
                MaterialPlugin materialPlugin = ((WandPBRMaterial) it4.next()).plugin;
                if (materialPlugin != null) {
                    materialPlugin.dispose();
                }
            }
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.tagInstancedPools = emptyMap;
        InstancedTagPool instancedTagPool2 = this.firstEditionDecalPool;
        if (instancedTagPool2 != null) {
            Iterator it5 = instancedTagPool2.entities.iterator();
            while (it5.hasNext()) {
                removeEntity(((Entity) it5.next()).id);
            }
            Iterator it6 = instancedTagPool2.geometries.iterator();
            while (it6.hasNext()) {
                InstancedTagSubMeshGeometry instancedTagSubMeshGeometry2 = (InstancedTagSubMeshGeometry) it6.next();
                int i3 = instancedTagSubMeshGeometry2.instanceVboId;
                int i4 = instancedTagSubMeshGeometry2.vaoId;
                instancedTagSubMeshGeometry2.instanceVboId = 0;
                instancedTagSubMeshGeometry2.vaoId = 0;
                if (i3 != 0 || i4 != 0) {
                    instancedTagSubMeshGeometry2.glLauncher.launch(new UiStepFileSelectWorker$Factory$create$2(i3, i4, (Continuation) null));
                }
            }
            Iterator it7 = instancedTagPool2.materials.iterator();
            while (it7.hasNext()) {
                MaterialPlugin materialPlugin2 = ((WandPBRMaterial) it7.next()).plugin;
                if (materialPlugin2 != null) {
                    materialPlugin2.dispose();
                }
            }
        }
        this.firstEditionDecalPool = null;
        MeshGeometry meshGeometry = this.firstEditionDecalGeometry;
        if (meshGeometry != null) {
            meshGeometry.dispose();
        }
        this.firstEditionDecalGeometry = null;
        this.firstEditionDecalTransformsThisFrame.clear();
        EmptyMap emptyMap2 = EmptyMap.INSTANCE;
        emptyMap2.getClass();
        this.tagSlotMetadata = emptyMap2;
        this.tagInstanceTransformPool.clear();
        this.tagInstanceOpacityScratch.clear();
        this.tagInstanceTransformsThisFrame.clear();
        this.cellTagControllers.clear();
        this.lastTagTickTime = -1.0f;
        this.hasActiveTag = false;
    }

    public final void drawPackedAtlasReceivers(int i, boolean z) {
        for (int i2 = 0; i2 < i; i2++) {
            InstancedTagPool instancedTagPool = (InstancedTagPool) this.tagInstancedPools.get((TagFormFactor) this.perCardFormFactorCache.get(i2));
            if (instancedTagPool != null) {
                Transform transform = (Transform) this.perCardTransformCache.get(i2);
                ArrayList arrayList = this.perCardSingleTransformScratch;
                arrayList.clear();
                arrayList.add(transform);
                float f = this.perCardOpacityCache[i2];
                float[] fArr = this.perCardSingleOpacityScratch;
                fArr[0] = f;
                Iterator it = instancedTagPool.geometries.iterator();
                while (it.hasNext()) {
                    ((InstancedTagSubMeshGeometry) it.next()).setInstances(arrayList, fArr);
                }
                if (z) {
                    float[] fArr2 = this.miniCardShadowVpScratch;
                    System.arraycopy(this.perCardVpCache, i2 * 16, fArr2, 0, 16);
                    this.currentPerCardVp = fArr2;
                    this.currentPerCardCellIdx = i2;
                }
                Iterator it2 = instancedTagPool.entities.iterator();
                while (it2.hasNext()) {
                    Entity entity = (Entity) it2.next();
                    if (entity.getNeedsDoubleSidedRendering()) {
                        GLES20.glCullFace(IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA);
                        GLES20.glDepthMask(false);
                        renderEntity(entity);
                        GLES20.glCullFace(IptcConstants.IMAGE_RESOURCE_BLOCK_RAW_IMAGE_MODE);
                        GLES20.glDepthMask(entity.depthWrite);
                        renderEntity(entity);
                    } else {
                        GLES20.glCullFace(IptcConstants.IMAGE_RESOURCE_BLOCK_RAW_IMAGE_MODE);
                        GLES20.glDepthMask(entity.depthWrite);
                        renderEntity(entity);
                    }
                    GLES20.glDepthMask(true);
                }
                this.currentPerCardCellIdx = -1;
                this.currentPerCardVp = null;
            }
        }
    }

    public final TagPoseController focusedTagController() {
        if (!this.tagSlotFormFactors.containsKey(Integer.valueOf(this.zoomAnimator.focusedCardIndex))) {
            return null;
        }
        return (TagPoseController) this.cellTagControllers.get(Long.valueOf((r1.focusedRow & BodyPartID.bodyIdMax) | (r1.focusedCol << 32)));
    }

    public final boolean isCenterZAnimating() {
        if (this.centerCardCol != Integer.MIN_VALUE) {
            return Math.abs(this.centerCardZCurrent - (-0.05f)) > 0.001f || Math.abs(this.centerCardZVelocity) > 0.001f || this.centerCardSettleTime < this.centerCardSettleDelay;
        }
        return false;
    }

    public final boolean isFocusedOnWand() {
        ZoomAnimator zoomAnimator = this.zoomAnimator;
        return zoomAnimator.targetZoom == ZoomLevel.NEAR && !zoomAnimator.isAnimating() && this.tagSlotFormFactors.containsKey(Integer.valueOf(zoomAnimator.focusedCardIndex));
    }

    public final float nearFade(boolean z, boolean z2, boolean z3) {
        if (!z || !z2 || z3) {
            return 1.0f;
        }
        ZoomAnimator zoomAnimator = this.zoomAnimator;
        return zoomAnimator.targetZoom == ZoomLevel.NEAR ? 1.0f - zoomAnimator.getEasedProgress() : zoomAnimator.getEasedProgress();
    }

    public final TagPoseController obtainController(long j, WandPose wandPose, TagFormFactor tagFormFactor) {
        TagPoseController heartPoseController;
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.cellTagControllers;
        TagPoseController tagPoseController = (TagPoseController) hashMap.get(valueOf);
        if (tagPoseController != null) {
            return tagPoseController;
        }
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
                heartPoseController = new MiniCardPoseController(wandPose, MiniCardPoseControllerKt.MINI_CARD_GRID_POSE_CONFIG, this.poseTranslationScale);
                heartPoseController.snapToPose(wandPose);
                hashMap.put(Long.valueOf(j), heartPoseController);
                return heartPoseController;
            }
            heartPoseController = new HeartPoseController(wandPose, this.poseTranslationScale);
            heartPoseController.snapToPose(wandPose);
            hashMap.put(Long.valueOf(j), heartPoseController);
            return heartPoseController;
        }
        heartPoseController = new HeartPoseController(wandPose, this.poseTranslationScale);
        heartPoseController.snapToPose(wandPose);
        hashMap.put(Long.valueOf(j), heartPoseController);
        return heartPoseController;
    }

    public final Transform obtainInstanceTransform(TagFormFactor tagFormFactor) {
        HashMap hashMap = this.tagInstanceTransformPool;
        Object obj = hashMap.get(tagFormFactor);
        if (obj == null) {
            obj = new ArrayList();
            hashMap.put(tagFormFactor, obj);
        }
        List list = (List) obj;
        HashMap hashMap2 = this.tagInstanceTransformsThisFrame;
        Object obj2 = hashMap2.get(tagFormFactor);
        if (obj2 == null) {
            obj2 = new ArrayList();
            hashMap2.put(tagFormFactor, obj2);
        }
        int size = ((List) obj2).size();
        while (list.size() <= size) {
            list.add(new Transform());
        }
        return (Transform) list.get(size);
    }

    public final void onTap(float f, float f2, float f3, float f4) {
        GridConfig gridConfig;
        ZoomLevel zoomLevel;
        GridInteractionController.TappedCell findCellAtScreenPosition;
        GridInteractionController gridInteractionController = this.interactionController;
        ZoomAnimator zoomAnimator = gridInteractionController.zoomAnimator;
        if (!gridInteractionController.isInitialized || zoomAnimator.isAnimating() || (gridConfig = gridInteractionController.gridConfig) == null || (zoomLevel = zoomAnimator.targetZoom) == ZoomLevel.NEAR || (findCellAtScreenPosition = gridInteractionController.findCellAtScreenPosition(f, f2, f3, f4, gridConfig, gridInteractionController.currentRenderParams$views(), zoomLevel)) == null) {
            return;
        }
        gridInteractionController.zoomToNear(findCellAtScreenPosition, zoomLevel);
        CardDesignLibraryScene$$ExternalSyntheticLambda0 cardDesignLibraryScene$$ExternalSyntheticLambda0 = gridInteractionController.onInteractionChanged;
        if (cardDesignLibraryScene$$ExternalSyntheticLambda0 != null) {
            cardDesignLibraryScene$$ExternalSyntheticLambda0.invoke();
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Scene
    public final void render(int i, int i2) {
        int i3;
        int i4;
        int i5;
        float[] fArr;
        MeshGeometry meshGeometry;
        float[] fArr2;
        List list;
        int i6;
        super.render(i, i2);
        if (i <= 0 || i2 <= 0 || !isSceneReady()) {
            return;
        }
        float[] fArr3 = this.miniCardShadowVpScratch;
        ArrayList arrayList = this.perCardTransformCache;
        arrayList.clear();
        ArrayList arrayList2 = this.perCardFormFactorCache;
        arrayList2.clear();
        Iterator it = MINI_CARD_FORM_FACTORS.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            TagFormFactor tagFormFactor = (TagFormFactor) it.next();
            List list2 = (List) this.tagInstanceTransformsThisFrame.get(tagFormFactor);
            if (list2 == null || list2.isEmpty() || (fArr = (float[]) this.tagInstanceOpacityScratch.get(tagFormFactor)) == null || (meshGeometry = (MeshGeometry) this.tagGeometries.get(tagFormFactor)) == null || !((Boolean) meshGeometry.ready.$$delegate_0.getValue()).booleanValue()) {
                it = it;
            } else {
                AABB aabb = meshGeometry.getAABB();
                int size = list2.size();
                int i8 = i7;
                int i9 = 0;
                while (i9 < size) {
                    Transform transform = (Transform) list2.get(i9);
                    int i10 = i8 + 1;
                    float[] fArr4 = this.perCardVpCache;
                    int i11 = i9;
                    int length = fArr4.length / 16;
                    if (i10 <= length) {
                        fArr2 = fArr3;
                        list = list2;
                    } else {
                        int i12 = length * 2;
                        if (i12 < i10) {
                            i12 = i10;
                        }
                        float[] fArr5 = new float[i12 * 16];
                        fArr2 = fArr3;
                        list = list2;
                        System.arraycopy(fArr4, 0, fArr5, 0, fArr4.length);
                        this.perCardVpCache = fArr5;
                        float[] fArr6 = this.perCardOpacityCache;
                        if (fArr6.length < i12) {
                            float[] fArr7 = new float[i12];
                            System.arraycopy(fArr6, 0, fArr7, 0, fArr6.length);
                            this.perCardOpacityCache = fArr7;
                        }
                    }
                    e0 e0Var = this.perCardShadowProjector;
                    float[] fArr8 = transform._modelMatrix;
                    e0Var.getClass();
                    float[] fArr9 = (float[]) e0Var.a;
                    float[] fArr10 = (float[]) e0Var.h;
                    fArr8.getClass();
                    fArr2.getClass();
                    float f = Float.NEGATIVE_INFINITY;
                    float f2 = Float.NEGATIVE_INFINITY;
                    float f3 = Float.NEGATIVE_INFINITY;
                    float f4 = Float.NEGATIVE_INFINITY;
                    int i13 = 0;
                    float f5 = Float.POSITIVE_INFINITY;
                    float f6 = Float.POSITIVE_INFINITY;
                    float f7 = Float.POSITIVE_INFINITY;
                    while (true) {
                        if (i13 >= 8) {
                            break;
                        }
                        e0Var.projectCorner(aabb, i13, fArr8);
                        float f8 = fArr10[0];
                        float f9 = fArr10[1];
                        float f10 = fArr10[2];
                        if (f8 < f5) {
                            f5 = f8;
                        }
                        if (f9 < f6) {
                            f6 = f9;
                        }
                        if (f10 < f7) {
                            f7 = f10;
                        }
                        if (f8 > f2) {
                            f2 = f8;
                        }
                        if (f9 > f3) {
                            f3 = f9;
                        }
                        if (f10 > f4) {
                            f4 = f10;
                        }
                        i13++;
                    }
                    float f11 = (f5 + f2) * 0.5f;
                    float f12 = (f6 + f3) * 0.5f;
                    float f13 = (f7 + f4) * 0.5f;
                    float f14 = (fArr9[0] * 5.0f) + f11;
                    float f15 = fArr9[1];
                    Matrix.setLookAtM((float[]) e0Var.b, 0, f14, (f15 * 5.0f) + f12, (fArr9[2] * 5.0f) + f13, f11, f12, f13, RecyclerView.DECELERATION_RATE, Math.abs(f15) > 0.99f ? 0.0f : 1.0f, Math.abs(fArr9[1]) > 0.99f ? 1.0f : 0.0f);
                    Matrix.multiplyMM((float[]) e0Var.i, 0, (float[]) e0Var.b, 0, fArr8, 0);
                    float f16 = Float.NEGATIVE_INFINITY;
                    float f17 = Float.NEGATIVE_INFINITY;
                    int i14 = 0;
                    float f18 = Float.POSITIVE_INFINITY;
                    float f19 = Float.POSITIVE_INFINITY;
                    float f20 = Float.POSITIVE_INFINITY;
                    for (i6 = 8; i14 < i6; i6 = 8) {
                        e0Var.projectCorner(aabb, i14, (float[]) e0Var.i);
                        float f21 = fArr10[0];
                        float f22 = fArr10[1];
                        int i15 = i14;
                        float f23 = -fArr10[2];
                        if (f21 < f20) {
                            f20 = f21;
                        }
                        if (f21 > f16) {
                            f16 = f21;
                        }
                        if (f22 < f19) {
                            f19 = f22;
                        }
                        if (f22 > f17) {
                            f17 = f22;
                        }
                        if (f23 < f18) {
                            f18 = f23;
                        }
                        if (f23 > f) {
                            f = f23;
                        }
                        i14 = i15 + 1;
                    }
                    float f24 = f18 - 0.1f;
                    Matrix.orthoM((float[]) e0Var.c, 0, f20 - 0.1f, f16 + 0.1f, f19 - 0.1f, f17 + 0.1f, f24 < 0.01f ? 0.01f : f24, f + 0.1f);
                    float[] fArr11 = (float[]) e0Var.c;
                    float[] fArr12 = (float[]) e0Var.b;
                    fArr3 = fArr2;
                    Matrix.multiplyMM(fArr3, 0, fArr11, 0, fArr12, 0);
                    System.arraycopy(fArr3, 0, this.perCardVpCache, i8 * 16, 16);
                    arrayList.add(transform);
                    this.perCardOpacityCache[i8] = fArr[i11];
                    arrayList2.add(tagFormFactor);
                    i9 = i11 + 1;
                    aabb = aabb;
                    i8 = i10;
                    it = it;
                    size = size;
                    list2 = list;
                }
                i7 = i8;
            }
        }
        if (i7 == 0) {
            return;
        }
        char c = 3;
        RendererHolder rendererHolder = null;
        if (this.engine.glesVersion >= 3) {
            RendererHolder rendererHolder2 = this.perCardShadowAtlas;
            if (rendererHolder2 == null) {
                rendererHolder2 = new RendererHolder();
                rendererHolder2.initialize();
                this.perCardShadowAtlas = rendererHolder2;
                this.perCardShadowAtlasAllocatedSize = 2048;
            }
            if (this.miniCardShadowDepthProgram == 0 && !this.miniCardShadowProgramLinkFailed) {
                int linkProgram = ColorUtils.linkProgram("\n    precision highp float;\n    attribute vec3 aPosition;\n    uniform mat4 uModelMatrix;\n    uniform mat4 uLightViewProjection;\n    void main() {\n      gl_Position = uLightViewProjection * uModelMatrix * vec4(aPosition, 1.0);\n    }\n  ");
                this.miniCardShadowDepthProgram = linkProgram;
                this.miniCardShadowProgramLinkFailed = linkProgram == 0;
            }
            if (rendererHolder2.primaryRequiresReset) {
                rendererHolder = rendererHolder2;
            }
        }
        if (rendererHolder == null || this.miniCardShadowDepthProgram == 0) {
            drawPackedAtlasReceivers(i7, false);
            return;
        }
        int sqrt = (int) Math.sqrt(i7);
        if (sqrt * sqrt < i7) {
            sqrt++;
        }
        if (sqrt < 1) {
            sqrt = 1;
        }
        int i16 = this.perCardShadowAtlasAllocatedSize;
        int i17 = i16 / sqrt;
        this.currentPerCardGridDim = sqrt;
        this.currentPerCardCellScale = i17 / i16;
        int i18 = this.miniCardShadowDepthProgram;
        rendererHolder.bindForWriting();
        int i19 = 2929;
        GLES20.glEnable(2929);
        int i20 = 3042;
        GLES20.glDisable(3042);
        int i21 = 32823;
        GLES20.glEnable(32823);
        GLES20.glPolygonOffset(2.0f, 4.0f);
        int i22 = 2884;
        GLES20.glEnable(2884);
        GLES20.glCullFace(IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA);
        GLES20.glUseProgram(i18);
        int glGetUniformLocation = GLES20.glGetUniformLocation(i18, "uLightViewProjection");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i18, "uModelMatrix");
        int i23 = 0;
        while (i23 < i7) {
            char c2 = c;
            GLES20.glViewport((i23 % sqrt) * i17, (i23 / sqrt) * i17, i17, i17);
            Transform transform2 = (Transform) this.perCardTransformCache.get(i23);
            int i24 = i19;
            MeshGeometry meshGeometry2 = (MeshGeometry) this.tagGeometries.get((TagFormFactor) this.perCardFormFactorCache.get(i23));
            if (meshGeometry2 == null) {
                i3 = i20;
                i4 = i21;
                i5 = i22;
            } else {
                i3 = i20;
                i4 = i21;
                i5 = i22;
                GLES20.glUniformMatrix4fv(glGetUniformLocation, 1, false, this.perCardVpCache, i23 * 16);
                GLES20.glUniformMatrix4fv(glGetUniformLocation2, 1, false, transform2._modelMatrix, 0);
                meshGeometry2.draw();
            }
            i23++;
            i19 = i24;
            c = c2;
            i22 = i5;
            i20 = i3;
            i21 = i4;
        }
        GLES20.glDisable(i21);
        GLES20.glCullFace(IptcConstants.IMAGE_RESOURCE_BLOCK_RAW_IMAGE_MODE);
        GLES20.glBindFramebuffer(36160, ((int[]) rendererHolder.secondaryRenderer)[0]);
        int[] iArr = (int[]) rendererHolder.primaryRenderer;
        GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[c]);
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glEnable(i22);
        GLES20.glEnable(i20);
        GLES20.glBlendFunc(770, 771);
        GLES20.glEnable(i19);
        GLES20.glDepthMask(true);
        drawPackedAtlasReceivers(i7, true);
    }

    public final void updateCamera(GridRenderParams gridRenderParams) {
        float f = gridRenderParams.cameraZ;
        Vector3 vector3 = new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f);
        RequestQueue requestQueue = this.camera;
        requestQueue.setPosition(vector3);
        requestQueue.setTarget(new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, -3.0f));
        requestQueue.setFar(f + 30.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateOverlayBounds(GridConfig gridConfig, GridRenderParams gridRenderParams) {
        char c;
        StateFlowImpl stateFlowImpl;
        AABB aabb;
        float f;
        int i;
        int i2;
        Pair pair;
        char c2;
        int i3;
        ArrayList arrayList;
        int i4;
        ArrayList arrayList2;
        Transform transform;
        Iterator it;
        GridConfig gridConfig2 = gridConfig;
        GridRenderParams gridRenderParams2 = gridRenderParams;
        GridInteractionController gridInteractionController = this.interactionController;
        boolean z = gridInteractionController.isFlingSettling;
        StateFlowImpl stateFlowImpl2 = this._cardScreenBounds;
        ZoomAnimator zoomAnimator = this.zoomAnimator;
        if ((z && zoomAnimator.panAnimProgress < 0.9f) || ((zoomAnimator.transitionProgress < 0.9f && !zoomAnimator.isPinchDriven) || gridInteractionController.isUserInteracting() || this.screenWidth <= RecyclerView.DECELERATION_RATE || this.screenHeight <= RecyclerView.DECELERATION_RATE)) {
            if (((Collection) stateFlowImpl2.getValue()).isEmpty()) {
                return;
            }
            stateFlowImpl2.setValue(EmptyList.INSTANCE);
            return;
        }
        CardGeometry cardGeometry = this.cardGeometry;
        if (cardGeometry != null) {
            AABB aabb2 = cardGeometry.getAABB();
            int ordinal = zoomAnimator.targetZoom.ordinal();
            Quat quat = CARD_HOME_FACE_UP_RESTING;
            ArrayList arrayList3 = this.overlayTransforms;
            ArrayList arrayList4 = this.overlayTextureIndices;
            if (ordinal != 0) {
                f = 2.0f;
                Transform transform2 = this.centeredOverlayTransform;
                if (ordinal == 1) {
                    i = 0;
                    Pair findNearestCellIndices = GridLayout.findNearestCellIndices(zoomAnimator.panX, zoomAnimator.panY, gridConfig2, gridRenderParams2);
                    int intValue = ((Number) findNearestCellIndices.first).intValue();
                    int intValue2 = ((Number) findNearestCellIndices.second).intValue();
                    Integer cardMetadataIndex = GridLayout.cardMetadataIndex(intValue2, intValue, gridConfig2);
                    if (cardMetadataIndex != null) {
                        i2 = 4;
                        int intValue3 = cardMetadataIndex.intValue();
                        Pair position = GridLayout.position(intValue, intValue2, gridConfig2, gridRenderParams2);
                        transform2.setPosition(new Vector3(((Number) position.first).floatValue() - zoomAnimator.panX, ((Number) position.second).floatValue() + zoomAnimator.panY, (intValue == this.centerCardCol && intValue2 == this.centerCardRow) ? this.centerCardZCurrent : -3.0f));
                        transform2.setScale(this.cardScale);
                        transform2.setRotation(quat);
                        aabb = aabb2;
                        c = 1;
                        gridConfig2 = gridConfig;
                        gridRenderParams2 = gridRenderParams;
                        List computeVisibleCells = GridLayout.computeVisibleCells(gridConfig2, gridRenderParams2, zoomAnimator.panX, zoomAnimator.panY, ZoomLevel.MEDIUM, this.screenAspectRatio);
                        HashMap hashMap = new HashMap();
                        Iterator it2 = computeVisibleCells.iterator();
                        while (it2.hasNext()) {
                            GridCell gridCell = (GridCell) it2.next();
                            int i5 = gridCell.canonicalIndex;
                            Iterator it3 = it2;
                            int i6 = gridCell.virtualRow;
                            StateFlowImpl stateFlowImpl3 = stateFlowImpl2;
                            int i7 = gridCell.virtualCol;
                            if (i5 != intValue3) {
                                GridCell gridCell2 = (GridCell) hashMap.get(Integer.valueOf(i5));
                                if (gridCell2 != null) {
                                    int i8 = i7 - intValue;
                                    int i9 = i6 - intValue2;
                                    int i10 = (i9 * i9) + (i8 * i8);
                                    int i11 = gridCell2.virtualCol - intValue;
                                    int i12 = gridCell2.virtualRow - intValue2;
                                    if (i10 >= (i12 * i12) + (i11 * i11)) {
                                    }
                                }
                                hashMap.put(Integer.valueOf(gridCell.canonicalIndex), gridCell);
                            } else if (i7 == intValue && i6 == intValue2) {
                                hashMap.put(Integer.valueOf(i5), gridCell);
                            }
                            it2 = it3;
                            stateFlowImpl2 = stateFlowImpl3;
                        }
                        stateFlowImpl = stateFlowImpl2;
                        Collection values = hashMap.values();
                        values.getClass();
                        List sortedWith = CollectionsKt.sortedWith(values, ComparisonsKt__ComparisonsKt.compareBy(new CalendarRowKt$$ExternalSyntheticLambda10(28), new CalendarRowKt$$ExternalSyntheticLambda10(29)));
                        arrayList3.clear();
                        arrayList4.clear();
                        if (hashMap.containsKey(cardMetadataIndex)) {
                            arrayList = arrayList3;
                        } else {
                            arrayList = arrayList3;
                            arrayList.add(transform2);
                            arrayList4.add(cardMetadataIndex);
                        }
                        Iterator it4 = sortedWith.iterator();
                        int i13 = 0;
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            next.getClass();
                            GridCell gridCell3 = (GridCell) next;
                            int i14 = gridCell3.canonicalIndex;
                            if (i14 == intValue3) {
                                it = it4;
                                i4 = i13;
                                transform = transform2;
                            } else {
                                i4 = i13 + 1;
                                while (true) {
                                    arrayList2 = this.mediumOverlayTransformPool;
                                    if (arrayList2.size() > i13) {
                                        break;
                                    } else {
                                        arrayList2.add(new Transform());
                                    }
                                }
                                transform = (Transform) arrayList2.get(i13);
                                it = it4;
                                transform.setPosition(new Vector3(gridCell3.worldX, gridCell3.worldY, -3.0f));
                                transform.setScale(this.cardScale);
                                transform.setRotation(quat);
                            }
                            arrayList.add(transform);
                            arrayList4.add(Integer.valueOf(i14));
                            i13 = i4;
                            it4 = it;
                        }
                        pair = new Pair(arrayList, arrayList4);
                    } else {
                        stateFlowImpl = stateFlowImpl2;
                        aabb = aabb2;
                        c = 1;
                        i2 = 4;
                        EmptyList emptyList = EmptyList.INSTANCE;
                        pair = new Pair(emptyList, emptyList);
                    }
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    Pair position2 = GridLayout.position(zoomAnimator.focusedCol, zoomAnimator.focusedRow, gridConfig2, gridRenderParams2);
                    i = 0;
                    transform2.setPosition(new Vector3(((Number) position2.first).floatValue() - zoomAnimator.panX, ((Number) position2.second).floatValue() + zoomAnimator.panY, -3.0f));
                    transform2.setScale(this.cardScale);
                    transform2.setRotation(NEAR_CARD_ROTATION);
                    int i15 = zoomAnimator.focusedCardIndex;
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList3.add(transform2);
                    arrayList4.add(Integer.valueOf(i15));
                    pair = new Pair(arrayList3, arrayList4);
                    stateFlowImpl = stateFlowImpl2;
                    aabb = aabb2;
                    c = 1;
                    i2 = 4;
                }
            } else {
                c = 1;
                stateFlowImpl = stateFlowImpl2;
                aabb = aabb2;
                f = 2.0f;
                i = 0;
                i2 = 4;
                boolean isEmpty = this.tagSlotMetadata.isEmpty();
                ArrayList arrayList5 = this.updateCanonicalIndices;
                ArrayList arrayList6 = this.updateTransforms;
                if (isEmpty) {
                    pair = new Pair(arrayList6, arrayList5);
                } else {
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList3.addAll(arrayList6);
                    arrayList4.addAll(arrayList5);
                    gridConfig2.getClass();
                    int i16 = gridConfig2.rows;
                    float f2 = gridRenderParams2.stepX;
                    float f3 = gridRenderParams2.stepY;
                    float f4 = ((i16 - 1) * f3) / 2.0f;
                    int roundToInt = MathKt__MathJVMKt.roundToInt((zoomAnimator.panX + ((3.0f * f2) / 2.0f)) / f2);
                    int i17 = roundToInt / 4;
                    if ((roundToInt ^ 4) < 0 && i17 * 4 != roundToInt) {
                        i17--;
                    }
                    int i18 = i17 * 4;
                    int roundToInt2 = MathKt__MathJVMKt.roundToInt((zoomAnimator.panY + f4) / f3);
                    int i19 = roundToInt2 / i16;
                    if ((roundToInt2 ^ i16) < 0 && i19 * i16 != roundToInt2) {
                        i19--;
                    }
                    int i20 = i19 * i16;
                    for (Map.Entry entry : this.tagSlotMetadata.entrySet()) {
                        int intValue4 = ((Number) entry.getKey()).intValue();
                        TagSlotMetadata tagSlotMetadata = (TagSlotMetadata) entry.getValue();
                        int i21 = tagSlotMetadata.col;
                        Transform transform3 = tagSlotMetadata.overlayTransform;
                        Pair position3 = GridLayout.position(i21 + i18, tagSlotMetadata.row + i20, gridConfig2, gridRenderParams2);
                        transform3.setPosition(new Vector3(((Number) position3.first).floatValue() - zoomAnimator.panX, ((Number) position3.second).floatValue() + zoomAnimator.panY, -3.0f));
                        transform3.setScale(this.cardScale);
                        transform3.setRotation(quat);
                        arrayList3.add(transform3);
                        arrayList4.add(Integer.valueOf(intValue4));
                    }
                    pair = new Pair(arrayList3, arrayList4);
                }
            }
            List list = (List) pair.first;
            List list2 = (List) pair.second;
            if (list.isEmpty()) {
                if (((Collection) stateFlowImpl.getValue()).isEmpty()) {
                    return;
                }
                stateFlowImpl.setValue(EmptyList.INSTANCE);
                return;
            }
            StateFlowImpl stateFlowImpl4 = stateFlowImpl;
            int i22 = -1;
            if (zoomAnimator.targetZoom == ZoomLevel.MEDIUM) {
                Pair findNearestCellIndices2 = GridLayout.findNearestCellIndices(zoomAnimator.panX, zoomAnimator.panY, gridConfig2, gridRenderParams2);
                Integer cardMetadataIndex2 = GridLayout.cardMetadataIndex(((Number) findNearestCellIndices2.second).intValue(), ((Number) findNearestCellIndices2.first).intValue(), gridConfig2);
                if (cardMetadataIndex2 != null) {
                    i22 = cardMetadataIndex2.intValue();
                }
            }
            RequestQueue requestQueue = this.camera;
            Matrix.setLookAtM(this.scratchViewMatrix, 0, requestQueue.getPosition().x, requestQueue.getPosition().y, requestQueue.getPosition().z, requestQueue.getTarget().x, requestQueue.getTarget().y, requestQueue.getTarget().z, requestQueue.getUp().x, requestQueue.getUp().y, requestQueue.getUp().z);
            Matrix.perspectiveM(this.scratchProjMatrix, 0, ((Number) ((StateFlowImpl) requestQueue.mNetworkQueue).getValue()).floatValue(), this.screenAspectRatio, requestQueue.getNear(), ((Number) ((StateFlowImpl) requestQueue.mNetwork).getValue()).floatValue());
            float f5 = this.screenWidth;
            float f6 = this.screenHeight;
            MarkwonConfiguration markwonConfiguration = this.projection;
            markwonConfiguration.getClass();
            float[] fArr = (float[]) markwonConfiguration.linkResolver;
            float[] fArr2 = (float[]) markwonConfiguration.syntaxHighlight;
            float[] fArr3 = (float[]) markwonConfiguration.theme;
            list2.getClass();
            float[] fArr4 = this.scratchViewMatrix;
            fArr4.getClass();
            float[] fArr5 = this.scratchProjMatrix;
            fArr5.getClass();
            Matrix.multiplyMM(fArr3, 0, fArr5, 0, fArr4, 0);
            AABB aabb3 = aabb;
            if (aabb3.equals((AABB) markwonConfiguration.spansFactory)) {
                c2 = 3;
            } else {
                float f7 = aabb3.minX;
                float f8 = aabb3.minY;
                float f9 = aabb3.minZ;
                int i23 = i2;
                float[] fArr6 = new float[i23];
                fArr6[i] = f7;
                fArr6[c] = f8;
                fArr6[2] = f9;
                fArr6[3] = 1.0f;
                c2 = 3;
                float f10 = aabb3.maxX;
                float[] fArr7 = new float[i23];
                fArr7[i] = f10;
                fArr7[c] = f8;
                fArr7[2] = f9;
                fArr7[3] = 1.0f;
                float f11 = aabb3.maxY;
                float[] fArr8 = new float[i23];
                fArr8[i] = f7;
                fArr8[c] = f11;
                fArr8[2] = f9;
                fArr8[3] = 1.0f;
                float[] fArr9 = new float[i23];
                fArr9[i] = f10;
                fArr9[c] = f11;
                fArr9[2] = f9;
                fArr9[3] = 1.0f;
                float f12 = aabb3.maxZ;
                float[] fArr10 = new float[i23];
                fArr10[i] = f7;
                fArr10[c] = f8;
                fArr10[2] = f12;
                fArr10[3] = 1.0f;
                float[] fArr11 = new float[i23];
                fArr11[i] = f10;
                fArr11[c] = f8;
                fArr11[2] = f12;
                fArr11[3] = 1.0f;
                float[] fArr12 = new float[i23];
                fArr12[i] = f7;
                fArr12[c] = f11;
                fArr12[2] = f12;
                fArr12[3] = 1.0f;
                float[] fArr13 = new float[i23];
                fArr13[i] = f10;
                fArr13[c] = f11;
                fArr13[2] = f12;
                fArr13[3] = 1.0f;
                markwonConfiguration.imageDestinationProcessor = new float[][]{fArr6, fArr7, fArr8, fArr9, fArr10, fArr11, fArr12, fArr13};
                markwonConfiguration.spansFactory = aabb3;
            }
            float[][] fArr14 = (float[][]) markwonConfiguration.imageDestinationProcessor;
            fArr14.getClass();
            ArrayList arrayList7 = new ArrayList(list.size());
            int size = list.size();
            int i24 = i;
            while (i24 < size) {
                float[] fArr15 = fArr3;
                Matrix.multiplyMM(fArr2, 0, fArr15, 0, ((Transform) list.get(i24)).computeModelMatrix(), 0);
                fArr3 = fArr15;
                int length = fArr14.length;
                float f13 = -3.4028235E38f;
                float f14 = -3.4028235E38f;
                float f15 = Float.MAX_VALUE;
                float f16 = Float.MAX_VALUE;
                int i25 = i;
                while (true) {
                    if (i25 >= length) {
                        int intValue5 = ((Number) list2.get(i24)).intValue();
                        i3 = i24;
                        arrayList7.add(new CardScreenBounds(i3, intValue5, f15, f16, f13, f14, intValue5 == i22 ? c : i));
                    } else {
                        int i26 = length;
                        int i27 = i25;
                        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr14[i25], 0);
                        float f17 = fArr[c2];
                        if (f17 <= RecyclerView.DECELERATION_RATE) {
                            i3 = i24;
                            break;
                        }
                        float f18 = fArr[i] / f17;
                        float f19 = fArr[c] / f17;
                        float f20 = f5 / f;
                        float f21 = (f18 * f20) + f20;
                        float f22 = f6 / f;
                        float f23 = f6 - ((f19 * f22) + f22);
                        if (f21 < f15) {
                            f15 = f21;
                        }
                        if (f23 < f16) {
                            f16 = f23;
                        }
                        if (f21 > f13) {
                            f13 = f21;
                        }
                        if (f23 > f14) {
                            f14 = f23;
                        }
                        i25 = i27 + 1;
                        length = i26;
                    }
                }
                i24 = i3 + 1;
            }
            stateFlowImpl4.getClass();
            stateFlowImpl4.updateState(null, arrayList7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:486:0x0158, code lost:
    
        if (r5 == false) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0b5e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0b6f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0b80  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0bb2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0c2c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0bdc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b7c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x01e1  */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateVisibleCards(float f) {
        GridConfig gridConfig;
        float f2;
        ZoomLevel zoomLevel;
        float coerceIn;
        GridConfig gridConfig2;
        ZoomLevel zoomLevel2;
        ZoomLevel zoomLevel3;
        int i;
        int i2;
        GridConfig gridConfig3;
        float f3;
        float f4;
        ?? r24;
        float f5;
        float f6;
        ZoomLevel zoomLevel4;
        ZoomLevel zoomLevel5;
        GridRenderParams gridRenderParams;
        GridConfig gridConfig4;
        Iterator it;
        boolean z;
        float f7;
        float f8;
        List list;
        boolean z2;
        float f9;
        int i3;
        HashMap hashMap;
        Vector3 vector3;
        float coerceIn2;
        char c;
        GridConfig gridConfig5;
        ArrayList arrayList;
        boolean z3;
        boolean z4;
        boolean z5;
        Vector3 vector32;
        boolean z6;
        boolean z7;
        ZoomAnimator zoomAnimator;
        InstancedTagPool instancedTagPool;
        Iterator it2;
        InstancedCardBatch instancedCardBatch;
        ZoomLevel zoomLevel6;
        ZoomLevel zoomLevel7;
        float f10;
        boolean z8;
        float easedProgress;
        ZoomAnimator zoomAnimator2;
        GridConfig gridConfig6;
        int i4;
        Iterator it3;
        float f11;
        GridConfig gridConfig7 = this.gridConfig;
        if (gridConfig7 == null || this.items.isEmpty()) {
            return;
        }
        GridInteractionController gridInteractionController = this.interactionController;
        ZoomAnimator zoomAnimator3 = gridInteractionController.zoomAnimator;
        if (gridInteractionController.isPinching && (gridConfig = gridInteractionController.gridConfig) != null) {
            float coerceIn3 = RangesKt___RangesKt.coerceIn(f, RecyclerView.DECELERATION_RATE, 0.1f);
            if (coerceIn3 > RecyclerView.DECELERATION_RATE) {
                while (coerceIn3 > RecyclerView.DECELERATION_RATE) {
                    float f12 = coerceIn3 > 0.008f ? 0.008f : coerceIn3;
                    GridLayout.springStep(gridInteractionController.pinchCurrentLogZoom, gridInteractionController.pinchTargetLogZoom, gridInteractionController.pinchLogZoomVelocity, 1500.0f, GridInteractionController.PINCH_SPRING_DAMPING, f12, gridInteractionController.pinchSpringScratch);
                    float[] fArr = gridInteractionController.pinchSpringScratch;
                    gridInteractionController.pinchCurrentLogZoom = fArr[0];
                    gridInteractionController.pinchLogZoomVelocity = fArr[1];
                    coerceIn3 -= f12;
                }
            }
            f2 = -3.0f;
            float f13 = gridInteractionController.pinchCurrentLogZoom;
            boolean z9 = f13 >= RecyclerView.DECELERATION_RATE;
            ZoomLevel zoomLevel8 = gridInteractionController.pinchBaseZoom;
            if (z9) {
                int ordinal = zoomLevel8.ordinal();
                if (ordinal == 0) {
                    zoomLevel = ZoomLevel.MEDIUM;
                } else if (ordinal == 1) {
                    zoomLevel = ZoomLevel.NEAR;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    zoomLevel = ZoomLevel.MEDIUM;
                }
                if (gridInteractionController.pinchBaseZoom != ZoomLevel.NEAR) {
                    coerceIn = RangesKt___RangesKt.coerceIn(f13 / 0.693f, RecyclerView.DECELERATION_RATE, 1.0f);
                    float f14 = coerceIn;
                    if (!gridInteractionController.pinchHasTargetCard && f14 > 0.02f) {
                        if (gridInteractionController.pinchBaseZoom != ZoomLevel.NEAR) {
                            gridInteractionController.pinchTargetCardCol = zoomAnimator3.focusedCol;
                            gridInteractionController.pinchTargetCardRow = zoomAnimator3.focusedRow;
                            gridInteractionController.pinchHasTargetCard = true;
                        } else {
                            zoomLevel2 = zoomLevel;
                            gridConfig2 = gridConfig;
                            Pair screenToWorldOffset = gridInteractionController.screenToWorldOffset(gridInteractionController.pinchLastCentroidX, gridInteractionController.pinchLastCentroidY, gridInteractionController.pinchLastScreenWidth, gridInteractionController.pinchLastScreenHeight, gridInteractionController.currentRenderParams$views().cameraZ);
                            float floatValue = ((Number) screenToWorldOffset.first).floatValue();
                            float floatValue2 = ((Number) screenToWorldOffset.second).floatValue();
                            float f15 = gridInteractionController.pinchStartPanX + floatValue;
                            float f16 = gridInteractionController.pinchStartPanY - floatValue2;
                            GridRenderParams renderParams = GridLayout.getRenderParams(gridInteractionController.pinchBaseZoom, gridConfig2);
                            Pair findNearestCellIndices = GridLayout.findNearestCellIndices(f15, f16, gridConfig2, renderParams);
                            int intValue = ((Number) findNearestCellIndices.first).intValue();
                            int intValue2 = ((Number) findNearestCellIndices.second).intValue();
                            if (GridLayout.cardMetadataIndex(intValue2, intValue, gridConfig2) != null) {
                                if (gridInteractionController.pinchBaseZoom == ZoomLevel.FAR) {
                                    boolean isInsideVisibleFarTile = GridInteractionController.isInsideVisibleFarTile(gridInteractionController.pinchStartPanX, gridInteractionController.pinchStartPanY, intValue, intValue2, gridConfig2, renderParams);
                                    i2 = intValue;
                                    i = intValue2;
                                } else {
                                    i = intValue2;
                                    i2 = intValue;
                                }
                                gridInteractionController.pinchTargetCardCol = i2;
                                gridInteractionController.pinchTargetCardRow = i;
                                gridInteractionController.pinchHasTargetCard = true;
                            }
                            if (gridInteractionController.pinchHasTargetCard && zoomLevel2 == (zoomLevel3 = ZoomLevel.NEAR) && gridInteractionController.pinchBaseZoom != zoomLevel3) {
                                int i5 = gridInteractionController.pinchTargetCardCol;
                                int i6 = gridInteractionController.pinchTargetCardRow;
                                int i7 = gridConfig2.cardCount;
                                int[] iArr = gridConfig2.tileCards;
                                Integer valueOf = (i7 > 0 || iArr.length == 0) ? null : Integer.valueOf(iArr[(GridLayout.emod(i6, gridConfig2.rows) * 4) + GridLayout.emod(i5, 4)]);
                                int intValue3 = valueOf == null ? valueOf.intValue() : 0;
                                zoomAnimator3.focusedCol = i5;
                                zoomAnimator3.focusedRow = i6;
                                zoomAnimator3.focusedCardIndex = intValue3;
                            }
                            ZoomLevel zoomLevel9 = gridInteractionController.pinchBaseZoom;
                            zoomLevel9.getClass();
                            zoomLevel2.getClass();
                            zoomAnimator3.currentZoom = zoomLevel9;
                            zoomAnimator3.targetZoom = zoomLevel2;
                            zoomAnimator3.transitionProgress = RangesKt___RangesKt.coerceIn(f14, RecyclerView.DECELERATION_RATE, 1.0f);
                            if (zoomLevel2 == ZoomLevel.FAR) {
                                float f17 = 1.0f - (((gridInteractionController.currentRenderParams$views().cameraZ - (-3.0f)) / (gridInteractionController.pinchStartCameraZ - (-3.0f))) * (1.0f - f14));
                                float f18 = gridInteractionController.pinchStartPanX;
                                zoomAnimator3.panX = CameraState$Type$EnumUnboxingLocalUtility.m(gridInteractionController.pinchFarTargetPanX, f18, f17, f18);
                                float f19 = gridInteractionController.pinchStartPanY;
                                zoomAnimator3.panY = CameraState$Type$EnumUnboxingLocalUtility.m(gridInteractionController.pinchFarTargetPanY, f19, f17, f19);
                            } else if (gridInteractionController.pinchHasTargetCard) {
                                Pair position = GridLayout.position(gridInteractionController.pinchTargetCardCol, gridInteractionController.pinchTargetCardRow, gridConfig2, GridLayout.getRenderParams(zoomLevel2, gridConfig2));
                                float floatValue3 = ((Number) position.first).floatValue();
                                float floatValue4 = ((Number) position.second).floatValue();
                                ZoomLevel zoomLevel10 = gridInteractionController.pinchBaseZoom;
                                ZoomLevel zoomLevel11 = ZoomLevel.NEAR;
                                float f20 = zoomLevel10 == zoomLevel11 ? 1.0f : 0.0f;
                                float m = CameraState$Type$EnumUnboxingLocalUtility.m(zoomLevel2 == zoomLevel11 ? 1.0f : 0.0f, f20, f14, f20);
                                float f21 = 1.0f - (((gridInteractionController.currentRenderParams$views().cameraZ - (-3.0f)) / (gridInteractionController.pinchStartCameraZ - (-3.0f))) * (1.0f - f14));
                                float f22 = gridInteractionController.pinchStartPanX;
                                zoomAnimator3.panX = CameraState$Type$EnumUnboxingLocalUtility.m(floatValue3, f22, f21, f22);
                                float f23 = gridInteractionController.pinchStartPanY;
                                zoomAnimator3.panY = ((((-floatValue4) + m) - f23) * f21) + f23;
                            }
                        }
                    }
                    gridConfig2 = gridConfig;
                    zoomLevel2 = zoomLevel;
                    if (gridInteractionController.pinchHasTargetCard) {
                        int i52 = gridInteractionController.pinchTargetCardCol;
                        int i62 = gridInteractionController.pinchTargetCardRow;
                        int i72 = gridConfig2.cardCount;
                        int[] iArr2 = gridConfig2.tileCards;
                        if (i72 > 0) {
                        }
                        if (valueOf == null) {
                        }
                        zoomAnimator3.focusedCol = i52;
                        zoomAnimator3.focusedRow = i62;
                        zoomAnimator3.focusedCardIndex = intValue3;
                    }
                    ZoomLevel zoomLevel92 = gridInteractionController.pinchBaseZoom;
                    zoomLevel92.getClass();
                    zoomLevel2.getClass();
                    zoomAnimator3.currentZoom = zoomLevel92;
                    zoomAnimator3.targetZoom = zoomLevel2;
                    zoomAnimator3.transitionProgress = RangesKt___RangesKt.coerceIn(f14, RecyclerView.DECELERATION_RATE, 1.0f);
                    if (zoomLevel2 == ZoomLevel.FAR) {
                    }
                }
                coerceIn = 0.0f;
                float f142 = coerceIn;
                if (!gridInteractionController.pinchHasTargetCard) {
                    if (gridInteractionController.pinchBaseZoom != ZoomLevel.NEAR) {
                    }
                }
                gridConfig2 = gridConfig;
                zoomLevel2 = zoomLevel;
                if (gridInteractionController.pinchHasTargetCard) {
                }
                ZoomLevel zoomLevel922 = gridInteractionController.pinchBaseZoom;
                zoomLevel922.getClass();
                zoomLevel2.getClass();
                zoomAnimator3.currentZoom = zoomLevel922;
                zoomAnimator3.targetZoom = zoomLevel2;
                zoomAnimator3.transitionProgress = RangesKt___RangesKt.coerceIn(f142, RecyclerView.DECELERATION_RATE, 1.0f);
                if (zoomLevel2 == ZoomLevel.FAR) {
                }
            } else {
                int ordinal2 = zoomLevel8.ordinal();
                if (ordinal2 == 0) {
                    zoomLevel = ZoomLevel.MEDIUM;
                } else if (ordinal2 == 1) {
                    zoomLevel = ZoomLevel.FAR;
                } else {
                    if (ordinal2 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    zoomLevel = gridInteractionController.zoomOriginBeforeNear;
                }
                if (gridInteractionController.pinchBaseZoom != ZoomLevel.FAR) {
                    coerceIn = RangesKt___RangesKt.coerceIn((-f13) / 0.693f, RecyclerView.DECELERATION_RATE, 1.0f);
                    float f1422 = coerceIn;
                    if (!gridInteractionController.pinchHasTargetCard) {
                    }
                    gridConfig2 = gridConfig;
                    zoomLevel2 = zoomLevel;
                    if (gridInteractionController.pinchHasTargetCard) {
                    }
                    ZoomLevel zoomLevel9222 = gridInteractionController.pinchBaseZoom;
                    zoomLevel9222.getClass();
                    zoomLevel2.getClass();
                    zoomAnimator3.currentZoom = zoomLevel9222;
                    zoomAnimator3.targetZoom = zoomLevel2;
                    zoomAnimator3.transitionProgress = RangesKt___RangesKt.coerceIn(f1422, RecyclerView.DECELERATION_RATE, 1.0f);
                    if (zoomLevel2 == ZoomLevel.FAR) {
                    }
                }
                coerceIn = 0.0f;
                float f14222 = coerceIn;
                if (!gridInteractionController.pinchHasTargetCard) {
                }
                gridConfig2 = gridConfig;
                zoomLevel2 = zoomLevel;
                if (gridInteractionController.pinchHasTargetCard) {
                }
                ZoomLevel zoomLevel92222 = gridInteractionController.pinchBaseZoom;
                zoomLevel92222.getClass();
                zoomLevel2.getClass();
                zoomAnimator3.currentZoom = zoomLevel92222;
                zoomAnimator3.targetZoom = zoomLevel2;
                zoomAnimator3.transitionProgress = RangesKt___RangesKt.coerceIn(f14222, RecyclerView.DECELERATION_RATE, 1.0f);
                if (zoomLevel2 == ZoomLevel.FAR) {
                }
            }
        } else {
            f2 = -3.0f;
        }
        GridRenderParams currentRenderParams$views = this.interactionController.currentRenderParams$views();
        GridInteractionController gridInteractionController2 = this.interactionController;
        ZoomAnimator zoomAnimator4 = gridInteractionController2.zoomAnimator;
        if (!gridInteractionController2.blendingToFarRest) {
            Pair pair = gridInteractionController2.trackingCell;
            if (pair != null && (gridConfig3 = gridInteractionController2.gridConfig) != null) {
                if (zoomAnimator4.isAnimating()) {
                    float easedProgress2 = zoomAnimator4.getEasedProgress();
                    Pair position2 = GridLayout.position(((Number) pair.first).intValue(), ((Number) pair.second).intValue(), gridConfig3, GridLayout.getRenderParams(zoomAnimator4.targetZoom, gridConfig3));
                    float floatValue5 = ((Number) position2.first).floatValue();
                    float floatValue6 = ((Number) position2.second).floatValue();
                    float f24 = zoomAnimator4.targetZoom == ZoomLevel.NEAR ? 1.0f : 0.0f;
                    float f25 = 1.0f - (((currentRenderParams$views.cameraZ - f2) / (gridInteractionController2.trackingStartCameraZ - f2)) * (1.0f - easedProgress2));
                    float f26 = gridInteractionController2.trackingStartPanX;
                    zoomAnimator4.panX = CameraState$Type$EnumUnboxingLocalUtility.m(floatValue5, f26, f25, f26);
                    float f27 = gridInteractionController2.trackingStartPanY;
                    zoomAnimator4.panY = ((((-floatValue6) + f24) - f27) * f25) + f27;
                } else {
                    gridInteractionController2.trackingCell = null;
                }
            }
        } else if (zoomAnimator4.isAnimating()) {
            float easedProgress3 = 1.0f - (((currentRenderParams$views.cameraZ - f2) / (gridInteractionController2.pinchStartCameraZ - f2)) * (1.0f - zoomAnimator4.getEasedProgress()));
            float f28 = gridInteractionController2.pinchStartPanX;
            zoomAnimator4.panX = CameraState$Type$EnumUnboxingLocalUtility.m(gridInteractionController2.pinchFarTargetPanX, f28, easedProgress3, f28);
            float f29 = gridInteractionController2.pinchStartPanY;
            zoomAnimator4.panY = CameraState$Type$EnumUnboxingLocalUtility.m(gridInteractionController2.pinchFarTargetPanY, f29, easedProgress3, f29);
        } else {
            zoomAnimator4.panX = gridInteractionController2.pinchFarTargetPanX;
            zoomAnimator4.panY = gridInteractionController2.pinchFarTargetPanY;
            gridInteractionController2.blendingToFarRest = false;
            GridConfig gridConfig8 = gridInteractionController2.gridConfig;
            if (gridConfig8 != null) {
                Pair findNearestCanonicalOrigin = GridLayout.findNearestCanonicalOrigin(zoomAnimator4.panX, zoomAnimator4.panY, GridLayout.getRenderParams(ZoomLevel.FAR, gridConfig8), gridConfig8, null);
                float floatValue7 = ((Number) findNearestCanonicalOrigin.first).floatValue();
                float floatValue8 = ((Number) findNearestCanonicalOrigin.second).floatValue();
                zoomAnimator4.panX -= floatValue7;
                zoomAnimator4.panY -= floatValue8;
                zoomAnimator4.farTileOriginY = RecyclerView.DECELERATION_RATE;
                Pair farPanBounds = gridInteractionController2.farPanBounds(gridConfig8);
                float floatValue9 = ((Number) farPanBounds.first).floatValue();
                float floatValue10 = ((Number) farPanBounds.second).floatValue();
                zoomAnimator4.farPanMinY = floatValue9;
                zoomAnimator4.farPanMaxY = floatValue10;
            }
        }
        updateCamera(currentRenderParams$views);
        boolean isAnimating = this.zoomAnimator.isAnimating();
        ZoomAnimator zoomAnimator5 = this.zoomAnimator;
        ZoomLevel zoomLevel12 = zoomAnimator5.targetZoom;
        ZoomLevel zoomLevel13 = ZoomLevel.NEAR;
        boolean z10 = zoomLevel12 == zoomLevel13 || (isAnimating && zoomAnimator5.currentZoom == zoomLevel13);
        boolean z11 = !isAnimating && zoomLevel12 == zoomLevel13;
        this.updateTransforms.clear();
        this.updateTextureIndices.clear();
        this.updateCanonicalIndices.clear();
        this.updateFadeMultipliers.clear();
        float coerceIn4 = RangesKt___RangesKt.coerceIn(f, RecyclerView.DECELERATION_RATE, 0.05f);
        GridInteractionController gridInteractionController3 = this.interactionController;
        ZoomAnimator zoomAnimator6 = this.zoomAnimator;
        ZoomLevel zoomLevel14 = zoomAnimator6.targetZoom;
        ZoomLevel zoomLevel15 = ZoomLevel.MEDIUM;
        boolean z12 = zoomLevel14 == zoomLevel15;
        boolean z13 = z12 && !zoomAnimator6.isAnimating();
        boolean z14 = z12 && zoomAnimator6.isAnimating();
        boolean z15 = (this.centerCardCol == Integer.MIN_VALUE && this.centerCardZCurrent == f2) ? false : true;
        this.centerCardLiftEngaged = false;
        if (z13 || z14) {
            this.centerCardZLeaveStart = Float.NaN;
            boolean z16 = z13 && gridInteractionController3.isUserInteracting();
            boolean z17 = z13 && gridInteractionController3.isFlingSettling;
            boolean z18 = z17 && gridInteractionController3.flingTargetCol != Integer.MIN_VALUE && zoomAnimator6.panAnimProgress >= 0.5f;
            this.centerCardLiftEngaged = z18;
            if (!z16 && (!z17 || z18)) {
                Pair pair2 = z18 ? new Pair(Integer.valueOf(gridInteractionController3.flingTargetCol), Integer.valueOf(gridInteractionController3.flingTargetRow)) : (zoomAnimator6.isPinchDriven && gridInteractionController3.pinchHasTargetCard) ? new Pair(Integer.valueOf(gridInteractionController3.pinchTargetCardCol), Integer.valueOf(gridInteractionController3.pinchTargetCardRow)) : GridLayout.findNearestCellIndices(zoomAnimator6.panX, zoomAnimator6.panY, gridConfig7, currentRenderParams$views);
                int intValue4 = ((Number) pair2.first).intValue();
                int intValue5 = ((Number) pair2.second).intValue();
                if (intValue4 == this.centerCardCol && intValue5 == this.centerCardRow) {
                    this.centerCardSettleTime += coerceIn4;
                } else {
                    this.centerCardZVelocity = RecyclerView.DECELERATION_RATE;
                    this.centerCardCol = intValue4;
                    this.centerCardRow = intValue5;
                    this.centerCardSettleTime = RecyclerView.DECELERATION_RATE;
                    wakeAnimationLoop();
                }
                if (z14) {
                    this.centerCardZCurrent = (((currentRenderParams$views.cameraZ - (-3.0f)) / 12.25f) * (zoomAnimator6.getEasedProgress() * 2.95f)) - 3.0f;
                    this.centerCardZVelocity = RecyclerView.DECELERATION_RATE;
                    wakeAnimationLoop();
                } else {
                    GridLayout.springStep(this.centerCardZCurrent, (z18 || this.centerCardSettleTime >= this.centerCardSettleDelay) ? -0.05f : -3.0f, this.centerCardZVelocity, this.centerZSpringStiffness, this.centerZSpringDamping, coerceIn4, this.centerZSpringScratch);
                    float[] fArr2 = this.centerZSpringScratch;
                    this.centerCardZCurrent = fArr2[0];
                    this.centerCardZVelocity = fArr2[1];
                    if (isCenterZAnimating()) {
                        wakeAnimationLoop();
                    }
                }
            } else if (z15) {
                this.centerCardSettleTime = RecyclerView.DECELERATION_RATE;
                boolean z19 = true;
                f3 = 1.0f;
                f4 = -3.0f;
                GridLayout.springStep(this.centerCardZCurrent, -3.0f, this.centerCardZVelocity, this.centerZSpringStiffness, this.centerZSpringDamping, coerceIn4, this.centerZSpringScratch);
                float[] fArr3 = this.centerZSpringScratch;
                float f30 = fArr3[0];
                this.centerCardZCurrent = f30;
                this.centerCardZVelocity = fArr3[1];
                if (Math.abs(f30 - (-3.0f)) >= 0.001f || Math.abs(this.centerCardZVelocity) >= 0.001f) {
                    wakeAnimationLoop();
                    r24 = z19;
                } else {
                    this.centerCardCol = PKIFailureInfo.systemUnavail;
                    this.centerCardRow = PKIFailureInfo.systemUnavail;
                    this.centerCardZCurrent = -3.0f;
                    this.centerCardZVelocity = RecyclerView.DECELERATION_RATE;
                    r24 = z19;
                }
            }
            r24 = 1;
            f3 = 1.0f;
            f4 = -3.0f;
        } else {
            if (!z15) {
                f11 = f2;
                this.centerCardZLeaveStart = Float.NaN;
            } else if (zoomAnimator6.currentZoom == zoomLevel15 && zoomAnimator6.isAnimating()) {
                if (Float.isNaN(this.centerCardZLeaveStart)) {
                    this.centerCardZLeaveStart = this.centerCardZCurrent;
                }
                this.centerCardZCurrent = (((currentRenderParams$views.cameraZ - (-3.0f)) / 12.25f) * ((1.0f - zoomAnimator6.getEasedProgress()) * (this.centerCardZLeaveStart - f2))) - 3.0f;
                this.centerCardZVelocity = RecyclerView.DECELERATION_RATE;
                wakeAnimationLoop();
                f3 = 1.0f;
                f4 = f2;
                r24 = 1;
            } else {
                this.centerCardCol = PKIFailureInfo.systemUnavail;
                this.centerCardRow = PKIFailureInfo.systemUnavail;
                f11 = f2;
                this.centerCardZCurrent = f11;
                this.centerCardZVelocity = RecyclerView.DECELERATION_RATE;
                this.centerCardZLeaveStart = Float.NaN;
            }
            f4 = f11;
            r24 = 1;
            f3 = 1.0f;
        }
        float[] fArr4 = this.nearEulerVelocity;
        float[] fArr5 = this.nearEulerCurrent;
        float[] fArr6 = this.nearEulerTarget;
        if (this.nearRotationSettling) {
            float sqrt = ((float) Math.sqrt(30.0d)) * 1.4f;
            boolean z20 = r24;
            for (int i8 = 0; i8 < 3; i8++) {
                GridLayout.springStep(fArr5[i8], fArr6[i8], fArr4[i8], 30.0f, sqrt, coerceIn4, this.nearRotationSpringScratch);
                float[] fArr7 = this.nearRotationSpringScratch;
                fArr5[i8] = fArr7[0];
                float f31 = fArr7[r24];
                fArr4[i8] = f31;
                if (Math.abs(fArr5[i8] - fArr6[i8]) > 0.001f || Math.abs(f31) > 0.01f) {
                    z20 = false;
                }
            }
            this.nearDragRotation = new Quat(fArr5);
            if (z20) {
                this.nearDragRotation = new Quat(fArr6);
                this.nearRotationSettling = false;
            }
        }
        if (z11) {
            int i9 = this.zoomAnimator.focusedCardIndex;
            boolean containsKey = this.tagSlotFormFactors.containsKey(Integer.valueOf(i9));
            ZoomAnimator zoomAnimator7 = this.zoomAnimator;
            Pair position3 = GridLayout.position(zoomAnimator7.focusedCol, zoomAnimator7.focusedRow, gridConfig7, currentRenderParams$views);
            float floatValue11 = ((Number) position3.first).floatValue();
            float floatValue12 = ((Number) position3.second).floatValue();
            if (!containsKey) {
                int[] iArr3 = this.cardBatchIndex;
                int i10 = (i9 < 0 || i9 >= iArr3.length) ? -1 : iArr3[i9];
                if (i10 >= 0) {
                    ArrayList arrayList2 = this.transformPool;
                    while (arrayList2.size() <= 0) {
                        arrayList2.add(new Transform());
                    }
                    Transform transform = (Transform) arrayList2.get(0);
                    ZoomAnimator zoomAnimator8 = this.zoomAnimator;
                    f5 = f3;
                    transform.setPosition(new Vector3(floatValue11 - zoomAnimator8.panX, floatValue12 + zoomAnimator8.panY, f4));
                    transform.setScale(this.cardScale);
                    transform.setRotation(this.nearDragRotation);
                    this.updateTransforms.add(transform);
                    this.updateTextureIndices.add(Integer.valueOf(i10));
                    this.updateCanonicalIndices.add(Integer.valueOf(i9));
                    this.updateFadeMultipliers.add(Float.valueOf(f5));
                    list = EmptyList.INSTANCE;
                    gridConfig4 = gridConfig7;
                    gridRenderParams = currentRenderParams$views;
                    z = z11;
                    f8 = f4;
                    f7 = RecyclerView.DECELERATION_RATE;
                }
            }
            f5 = f3;
            list = EmptyList.INSTANCE;
            gridConfig4 = gridConfig7;
            gridRenderParams = currentRenderParams$views;
            z = z11;
            f8 = f4;
            f7 = RecyclerView.DECELERATION_RATE;
        } else {
            f5 = f3;
            if (isAnimating && z10) {
                ZoomAnimator zoomAnimator9 = this.zoomAnimator;
                f6 = zoomAnimator9.targetZoom == ZoomLevel.NEAR ? zoomAnimator9.getEasedProgress() : f5 - zoomAnimator9.getEasedProgress();
            } else {
                f6 = RecyclerView.DECELERATION_RATE;
            }
            ZoomAnimator zoomAnimator10 = this.zoomAnimator;
            if (zoomAnimator10.isAnimating()) {
                zoomLevel5 = ZoomLevel.MEDIUM;
            } else {
                ZoomLevel zoomLevel16 = zoomAnimator10.targetZoom;
                if (zoomLevel16 != ZoomLevel.FAR || zoomAnimator10.panAnimProgress >= f5) {
                    zoomLevel4 = zoomLevel16;
                    ZoomAnimator zoomAnimator11 = this.zoomAnimator;
                    gridRenderParams = currentRenderParams$views;
                    float f32 = zoomAnimator11.panX;
                    float f33 = zoomAnimator11.panY;
                    float f34 = this.screenAspectRatio;
                    gridConfig4 = gridConfig7;
                    float f35 = RecyclerView.DECELERATION_RATE;
                    List computeVisibleCells = GridLayout.computeVisibleCells(gridConfig4, gridRenderParams, f32, f33, zoomLevel4, f34);
                    this.visibleTagCells.clear();
                    it = computeVisibleCells.iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        GridCell gridCell = (GridCell) it.next();
                        if (this.tagSlotFormFactors.containsKey(Integer.valueOf(gridCell.canonicalIndex))) {
                            this.visibleTagCells.add(gridCell);
                            f9 = f4;
                        } else {
                            if (z10) {
                                int i12 = gridCell.virtualCol;
                                ZoomAnimator zoomAnimator12 = this.zoomAnimator;
                                if (i12 == zoomAnimator12.focusedCol && gridCell.virtualRow == zoomAnimator12.focusedRow) {
                                    z2 = r24;
                                    Quat slerp = (z2 || f6 <= f35) ? CARD_HOME_FACE_UP_RESTING : CARD_HOME_FACE_UP_RESTING.slerp(NEAR_CARD_ROTATION, f6);
                                    int[] iArr4 = this.cardBatchIndex;
                                    f9 = f4;
                                    int i13 = gridCell.canonicalIndex;
                                    i3 = (i13 >= 0 || i13 >= iArr4.length) ? -1 : iArr4[i13];
                                    if (i3 >= 0) {
                                        float nearFade = nearFade(isAnimating, z10, z2) * gridCell.opacity;
                                        int i14 = i11 + 1;
                                        ArrayList arrayList3 = this.transformPool;
                                        float f36 = f35;
                                        while (arrayList3.size() <= i11) {
                                            arrayList3.add(new Transform());
                                        }
                                        Transform transform2 = (Transform) arrayList3.get(i11);
                                        Iterator it4 = it;
                                        boolean z21 = z11;
                                        int i15 = i3;
                                        transform2.setPosition(new Vector3(gridCell.worldX, gridCell.worldY, (gridCell.virtualCol == this.centerCardCol && gridCell.virtualRow == this.centerCardRow) ? this.centerCardZCurrent : -3.0f));
                                        transform2.setScale(this.cardScale);
                                        transform2.setRotation(slerp);
                                        this.updateTransforms.add(transform2);
                                        this.updateTextureIndices.add(Integer.valueOf(i15));
                                        this.updateCanonicalIndices.add(Integer.valueOf(gridCell.canonicalIndex));
                                        this.updateFadeMultipliers.add(Float.valueOf(nearFade));
                                        f4 = f9;
                                        f35 = f36;
                                        it = it4;
                                        z11 = z21;
                                        i11 = i14;
                                    }
                                }
                            }
                            z2 = false;
                            if (z2) {
                            }
                            int[] iArr42 = this.cardBatchIndex;
                            f9 = f4;
                            int i132 = gridCell.canonicalIndex;
                            if (i132 >= 0) {
                            }
                            if (i3 >= 0) {
                            }
                        }
                        f4 = f9;
                        f35 = f35;
                        it = it;
                        z11 = z11;
                    }
                    z = z11;
                    f7 = f35;
                    f8 = f4;
                    list = this.visibleTagCells;
                } else {
                    zoomLevel5 = ZoomLevel.MEDIUM;
                }
            }
            zoomLevel4 = zoomLevel5;
            ZoomAnimator zoomAnimator112 = this.zoomAnimator;
            gridRenderParams = currentRenderParams$views;
            float f322 = zoomAnimator112.panX;
            float f332 = zoomAnimator112.panY;
            float f342 = this.screenAspectRatio;
            gridConfig4 = gridConfig7;
            float f352 = RecyclerView.DECELERATION_RATE;
            List computeVisibleCells2 = GridLayout.computeVisibleCells(gridConfig4, gridRenderParams, f322, f332, zoomLevel4, f342);
            this.visibleTagCells.clear();
            it = computeVisibleCells2.iterator();
            int i112 = 0;
            while (it.hasNext()) {
            }
            z = z11;
            f7 = f352;
            f8 = f4;
            list = this.visibleTagCells;
        }
        HashMap hashMap2 = this.cellTagControllers;
        Vector3 vector33 = IDENTITY_SCALE;
        LinkedHashMap linkedHashMap = this.tagScales;
        GridInteractionController gridInteractionController4 = this.interactionController;
        ArrayList arrayList4 = this.firstEditionDecalTransformsThisFrame;
        HashMap hashMap3 = this.tagInstanceTransformsThisFrame;
        HashSet hashSet = this.visibleTagControllerKeys;
        ZoomAnimator zoomAnimator13 = this.zoomAnimator;
        int i16 = zoomAnimator13.focusedCardIndex;
        float floatValue13 = ((Number) this._animationTime.getValue()).floatValue();
        List list2 = list;
        float f37 = this.lastTagTickTime;
        if (f37 < f7) {
            hashMap = hashMap2;
            vector3 = vector33;
            coerceIn2 = f7;
        } else {
            hashMap = hashMap2;
            vector3 = vector33;
            coerceIn2 = RangesKt___RangesKt.coerceIn(floatValue13 - f37, f7, 0.05f);
        }
        this.lastTagTickTime = floatValue13;
        hashSet.clear();
        Iterator it5 = hashMap3.entrySet().iterator();
        while (it5.hasNext()) {
            ((List) ((Map.Entry) it5.next()).getValue()).clear();
        }
        Iterator it6 = this.tagInstancedPools.keySet().iterator();
        while (it6.hasNext()) {
            TagFormFactor tagFormFactor = (TagFormFactor) it6.next();
            if (hashMap3.get(tagFormFactor) == null) {
                it3 = it6;
                hashMap3.put(tagFormFactor, new ArrayList());
            } else {
                it3 = it6;
            }
            it6 = it3;
        }
        arrayList4.clear();
        boolean z22 = (zoomAnimator13.targetZoom != ZoomLevel.MEDIUM || zoomAnimator13.isAnimating() || gridInteractionController4.isUserInteracting() || gridInteractionController4.isFlingSettling) ? false : r24;
        if (z) {
            c = ' ';
            if (this.tagSlotFormFactors.containsKey(Integer.valueOf(i16))) {
                TagFormFactor tagFormFactor2 = (TagFormFactor) this.tagSlotFormFactors.get(Integer.valueOf(i16));
                if (tagFormFactor2 == null) {
                    gridConfig5 = gridConfig4;
                    instancedCardBatch = this.instancedBatch;
                    if (instancedCardBatch != null) {
                        instancedCardBatch.updateInstanceBuffer(this.updateTransforms, this.updateTextureIndices, this.updateFadeMultipliers);
                    }
                    ZoomAnimator zoomAnimator14 = this.zoomAnimator;
                    zoomLevel6 = zoomAnimator14.targetZoom;
                    zoomLevel7 = ZoomLevel.NEAR;
                    if (zoomLevel6 != zoomLevel7) {
                        z8 = false;
                        this.nearRotationSettling = false;
                        this.nearDragRotation = NEAR_CARD_ROTATION;
                        f10 = RecyclerView.DECELERATION_RATE;
                        this.lastDragDeltaX = RecyclerView.DECELERATION_RATE;
                        this.lastDragDeltaY = RecyclerView.DECELERATION_RATE;
                    } else {
                        f10 = RecyclerView.DECELERATION_RATE;
                        z8 = false;
                    }
                    easedProgress = zoomLevel6 == zoomLevel7 ? zoomAnimator14.getEasedProgress() : zoomAnimator14.currentZoom == zoomLevel7 ? f5 - zoomAnimator14.getEasedProgress() : f10;
                    StateFlowImpl stateFlowImpl = this._currentZoomLevel;
                    if (easedProgress < 0.7f) {
                        ZoomLevel zoomLevel17 = this.zoomAnimator.targetZoom;
                        zoomLevel7 = zoomLevel17 == zoomLevel7 ? ZoomLevel.MEDIUM : zoomLevel17;
                    }
                    stateFlowImpl.setValue(zoomLevel7);
                    StateFlowImpl stateFlowImpl2 = this._focusedCardIndex;
                    zoomAnimator2 = this.zoomAnimator;
                    if (zoomAnimator2.targetZoom == ZoomLevel.MEDIUM) {
                        gridConfig6 = gridConfig5;
                        Pair findNearestCellIndices2 = GridLayout.findNearestCellIndices(zoomAnimator2.panX, zoomAnimator2.panY, gridConfig6, gridRenderParams);
                        Integer cardMetadataIndex = GridLayout.cardMetadataIndex(((Number) findNearestCellIndices2.second).intValue(), ((Number) findNearestCellIndices2.first).intValue(), gridConfig6);
                        i4 = cardMetadataIndex != null ? cardMetadataIndex.intValue() : this.zoomAnimator.focusedCardIndex;
                    } else {
                        gridConfig6 = gridConfig5;
                        i4 = zoomAnimator2.focusedCardIndex;
                    }
                    Integer valueOf2 = Integer.valueOf(i4);
                    stateFlowImpl2.getClass();
                    stateFlowImpl2.updateState(null, valueOf2);
                    InstancedCardBatch instancedCardBatch2 = this.instancedBatch;
                    boolean booleanValue = instancedCardBatch2 != null ? ((Boolean) instancedCardBatch2._texturesReady.getValue()).booleanValue() : this.cards.isEmpty();
                    boolean z23 = (this.tagSlotFormFactors.isEmpty() && this.tagInstancedPools.isEmpty() && this.engine.glesVersion >= 3) ? z8 : r24;
                    if (!((Boolean) this._contentReady.getValue()).booleanValue() && booleanValue && z23) {
                        StateFlowImpl stateFlowImpl3 = this._contentReady;
                        Boolean bool = Boolean.TRUE;
                        stateFlowImpl3.getClass();
                        stateFlowImpl3.updateState(null, bool);
                    }
                    updateOverlayBounds(gridConfig6, gridRenderParams);
                }
                Pair position4 = GridLayout.position(zoomAnimator13.focusedCol, zoomAnimator13.focusedRow, gridConfig4, gridRenderParams);
                float floatValue14 = ((Number) position4.first).floatValue();
                float floatValue15 = ((Number) position4.second).floatValue();
                long j = (zoomAnimator13.focusedCol << 32) | (zoomAnimator13.focusedRow & BodyPartID.bodyIdMax);
                hashSet.add(Long.valueOf(j));
                WandPose wandPose = WandPose.Active;
                TagPoseController obtainController = obtainController(j, wandPose, tagFormFactor2);
                obtainController.setPose(wandPose);
                WandPoseController.Output tick = obtainController.tick(floatValue13, coerceIn2);
                boolean isAnimating2 = obtainController.isAnimating();
                Quat defaultRotation = GridLayout.defaultRotation(tagFormFactor2);
                Vector3 vector34 = (Vector3) linkedHashMap.get(tagFormFactor2);
                if (vector34 == null) {
                    vector34 = vector3;
                }
                Transform obtainInstanceTransform = obtainInstanceTransform(tagFormFactor2);
                float f38 = floatValue14 - zoomAnimator13.panX;
                Vector3 vector35 = tick.positionOffset;
                float f39 = tick.opacity;
                float f40 = f38 + vector35.x;
                gridConfig5 = gridConfig4;
                float f41 = floatValue15 + zoomAnimator13.panY + vector35.y;
                float f42 = vector35.z + f8;
                arrayList = arrayList4;
                obtainInstanceTransform.setPosition(new Vector3(f40, f41, f42));
                float f43 = tick.scale;
                int ordinal3 = tagFormFactor2.ordinal();
                float f44 = ((ordinal3 == 2 || ordinal3 == 5) ? gridRenderParams.miniCardScaleMultiplier : f5) * f43;
                if (f44 != f5) {
                    vector34 = new Vector3(vector34.x * f44, vector34.y * f44, vector34.z * f44);
                }
                obtainInstanceTransform.setScale(vector34);
                obtainInstanceTransform.setRotation(defaultRotation.times(tick.rotation));
                obtainInstanceTransform._modelMatrix = obtainInstanceTransform.computeModelMatrix();
                appendTagInstance(tagFormFactor2, obtainInstanceTransform, f39);
                appendFirstEditionDecalIfNeeded(i16, obtainInstanceTransform, f39);
                z3 = isAnimating2;
                HashMap hashMap4 = hashMap3;
                zoomAnimator = zoomAnimator13;
                float[] fArr8 = EMPTY_FLOATS;
                for (Map.Entry entry : this.tagInstancedPools.entrySet()) {
                    TagFormFactor tagFormFactor3 = (TagFormFactor) entry.getKey();
                    InstancedTagPool instancedTagPool2 = (InstancedTagPool) entry.getValue();
                    HashMap hashMap5 = hashMap4;
                    List list3 = (List) hashMap5.get(tagFormFactor3);
                    if (list3 == null) {
                        list3 = EmptyList.INSTANCE;
                    }
                    float[] fArr9 = list3.isEmpty() ? fArr8 : (float[]) MapsKt__MapsKt.getValue(this.tagInstanceOpacityScratch, tagFormFactor3);
                    Iterator it7 = instancedTagPool2.geometries.iterator();
                    while (it7.hasNext()) {
                        ((InstancedTagSubMeshGeometry) it7.next()).setInstances(list3, fArr9);
                    }
                    hashMap4 = hashMap5;
                }
                instancedTagPool = this.firstEditionDecalPool;
                if (instancedTagPool != null) {
                    if (!arrayList.isEmpty()) {
                        fArr8 = this.firstEditionDecalOpacityScratch;
                    }
                    Iterator it8 = instancedTagPool.geometries.iterator();
                    while (it8.hasNext()) {
                        ((InstancedTagSubMeshGeometry) it8.next()).setInstances(arrayList, fArr8);
                    }
                }
                if (!zoomAnimator.isAnimating() && hashMap.size() > hashSet.size()) {
                    it2 = hashMap.keySet().iterator();
                    while (it2.hasNext()) {
                        if (!hashSet.contains(it2.next())) {
                            it2.remove();
                        }
                    }
                }
                boolean z24 = this.hasActiveTag;
                this.hasActiveTag = z3;
                if (z3 && !z24) {
                    wakeAnimationLoop();
                }
                instancedCardBatch = this.instancedBatch;
                if (instancedCardBatch != null) {
                }
                ZoomAnimator zoomAnimator142 = this.zoomAnimator;
                zoomLevel6 = zoomAnimator142.targetZoom;
                zoomLevel7 = ZoomLevel.NEAR;
                if (zoomLevel6 != zoomLevel7) {
                }
                if (zoomLevel6 == zoomLevel7) {
                }
                StateFlowImpl stateFlowImpl4 = this._currentZoomLevel;
                if (easedProgress < 0.7f) {
                }
                stateFlowImpl4.setValue(zoomLevel7);
                StateFlowImpl stateFlowImpl22 = this._focusedCardIndex;
                zoomAnimator2 = this.zoomAnimator;
                if (zoomAnimator2.targetZoom == ZoomLevel.MEDIUM) {
                }
                Integer valueOf22 = Integer.valueOf(i4);
                stateFlowImpl22.getClass();
                stateFlowImpl22.updateState(null, valueOf22);
                InstancedCardBatch instancedCardBatch22 = this.instancedBatch;
                if (instancedCardBatch22 != null) {
                }
                if (this.tagSlotFormFactors.isEmpty()) {
                }
                if (!((Boolean) this._contentReady.getValue()).booleanValue()) {
                    StateFlowImpl stateFlowImpl32 = this._contentReady;
                    Boolean bool2 = Boolean.TRUE;
                    stateFlowImpl32.getClass();
                    stateFlowImpl32.updateState(null, bool2);
                }
                updateOverlayBounds(gridConfig6, gridRenderParams);
            }
        } else {
            c = ' ';
        }
        gridConfig5 = gridConfig4;
        arrayList = arrayList4;
        if (isAnimating) {
            ZoomLevel zoomLevel18 = zoomAnimator13.targetZoom;
            ZoomLevel zoomLevel19 = ZoomLevel.FAR;
            if (zoomLevel18 == zoomLevel19 || zoomAnimator13.currentZoom == zoomLevel19) {
                list2 = CollectionsKt.sortedWith(list2, new b.C0008b(5));
            }
        }
        Iterator it9 = list2.iterator();
        boolean z25 = false;
        while (it9.hasNext()) {
            GridCell gridCell2 = (GridCell) it9.next();
            Map map = this.tagSlotFormFactors;
            Iterator it10 = it9;
            int i17 = gridCell2.canonicalIndex;
            boolean z26 = z22;
            int i18 = gridCell2.virtualRow;
            boolean z27 = z25;
            int i19 = gridCell2.virtualCol;
            HashMap hashMap6 = hashMap3;
            TagFormFactor tagFormFactor4 = (TagFormFactor) map.get(Integer.valueOf(i17));
            if (tagFormFactor4 == null) {
                it9 = it10;
                z22 = z26;
                z25 = z27;
                hashMap3 = hashMap6;
            } else {
                boolean z28 = (i17 == i16 && i19 == zoomAnimator13.focusedCol && i18 == zoomAnimator13.focusedRow) ? r24 : false;
                ZoomLevel zoomLevel20 = zoomAnimator13.targetZoom;
                ZoomAnimator zoomAnimator15 = zoomAnimator13;
                boolean z29 = (zoomLevel20 == ZoomLevel.NEAR && z28) ? r24 : false;
                if (z10 && z28) {
                    z4 = z29;
                    z5 = r24;
                } else {
                    z4 = z29;
                    z5 = false;
                }
                int i20 = i16;
                WandPose wandPose2 = (z4 || (((z26 || ((isAnimating && zoomLevel20 == ZoomLevel.MEDIUM) || this.centerCardLiftEngaged)) && i19 == this.centerCardCol && i18 == this.centerCardRow) ? r24 : false)) ? WandPose.Active : WandPose.Still;
                Quat defaultRotation2 = GridLayout.defaultRotation(tagFormFactor4);
                Vector3 vector36 = (Vector3) linkedHashMap.get(tagFormFactor4);
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                if (vector36 == null) {
                    vector32 = vector3;
                    z7 = isAnimating;
                    z6 = z10;
                } else {
                    vector32 = vector36;
                    z6 = z10;
                    z7 = isAnimating;
                }
                long j2 = (i19 << c) | (i18 & BodyPartID.bodyIdMax);
                hashSet.add(Long.valueOf(j2));
                TagPoseController obtainController2 = obtainController(j2, wandPose2, tagFormFactor4);
                obtainController2.setPose(wandPose2);
                WandPoseController.Output tick2 = obtainController2.tick(floatValue13, coerceIn2);
                if (obtainController2.isAnimating()) {
                    z27 = r24;
                }
                Transform obtainInstanceTransform2 = obtainInstanceTransform(tagFormFactor4);
                float f45 = gridCell2.worldX;
                Vector3 vector37 = tick2.positionOffset;
                float f46 = coerceIn2;
                float f47 = floatValue13;
                obtainInstanceTransform2.setPosition(new Vector3(f45 + vector37.x, gridCell2.worldY + vector37.y, ((i19 == this.centerCardCol && i18 == this.centerCardRow) ? this.centerCardZCurrent : -3.0f) + vector37.z));
                float f48 = tick2.scale;
                int ordinal4 = tagFormFactor4.ordinal();
                float f49 = ((ordinal4 == 2 || ordinal4 == 5) ? gridRenderParams.miniCardScaleMultiplier : f5) * f48;
                if (f49 != f5) {
                    vector32 = new Vector3(vector32.x * f49, vector32.y * f49, vector32.z * f49);
                }
                obtainInstanceTransform2.setScale(vector32);
                obtainInstanceTransform2.setRotation(defaultRotation2.times(tick2.rotation));
                obtainInstanceTransform2._modelMatrix = obtainInstanceTransform2.computeModelMatrix();
                boolean z30 = z7;
                boolean z31 = z6;
                float nearFade2 = nearFade(z30, z31, z5) * gridCell2.opacity * tick2.opacity;
                appendTagInstance(tagFormFactor4, obtainInstanceTransform2, nearFade2);
                appendFirstEditionDecalIfNeeded(i17, obtainInstanceTransform2, nearFade2);
                isAnimating = z30;
                z10 = z31;
                it9 = it10;
                z22 = z26;
                z25 = z27;
                hashMap3 = hashMap6;
                zoomAnimator13 = zoomAnimator15;
                i16 = i20;
                linkedHashMap = linkedHashMap2;
                coerceIn2 = f46;
                floatValue13 = f47;
            }
        }
        z3 = z25;
        HashMap hashMap42 = hashMap3;
        zoomAnimator = zoomAnimator13;
        float[] fArr82 = EMPTY_FLOATS;
        while (r3.hasNext()) {
        }
        instancedTagPool = this.firstEditionDecalPool;
        if (instancedTagPool != null) {
        }
        if (!zoomAnimator.isAnimating()) {
            it2 = hashMap.keySet().iterator();
            while (it2.hasNext()) {
            }
        }
        boolean z242 = this.hasActiveTag;
        this.hasActiveTag = z3;
        if (z3) {
            wakeAnimationLoop();
        }
        instancedCardBatch = this.instancedBatch;
        if (instancedCardBatch != null) {
        }
        ZoomAnimator zoomAnimator1422 = this.zoomAnimator;
        zoomLevel6 = zoomAnimator1422.targetZoom;
        zoomLevel7 = ZoomLevel.NEAR;
        if (zoomLevel6 != zoomLevel7) {
        }
        if (zoomLevel6 == zoomLevel7) {
        }
        StateFlowImpl stateFlowImpl42 = this._currentZoomLevel;
        if (easedProgress < 0.7f) {
        }
        stateFlowImpl42.setValue(zoomLevel7);
        StateFlowImpl stateFlowImpl222 = this._focusedCardIndex;
        zoomAnimator2 = this.zoomAnimator;
        if (zoomAnimator2.targetZoom == ZoomLevel.MEDIUM) {
        }
        Integer valueOf222 = Integer.valueOf(i4);
        stateFlowImpl222.getClass();
        stateFlowImpl222.updateState(null, valueOf222);
        InstancedCardBatch instancedCardBatch222 = this.instancedBatch;
        if (instancedCardBatch222 != null) {
        }
        if (this.tagSlotFormFactors.isEmpty()) {
        }
        if (!((Boolean) this._contentReady.getValue()).booleanValue()) {
        }
        updateOverlayBounds(gridConfig6, gridRenderParams);
    }

    public final void wakeAnimationLoop() {
        this.animationWake.mo1159trySendJP2dKIU(Unit.INSTANCE);
    }

    public final void zoomIn() {
        GridInteractionController gridInteractionController = this.interactionController;
        ZoomAnimator zoomAnimator = gridInteractionController.zoomAnimator;
        if (gridInteractionController.isInitialized && !zoomAnimator.isAnimating()) {
            gridInteractionController.isFlingSettling = false;
            GridConfig gridConfig = gridInteractionController.gridConfig;
            if (gridConfig == null) {
                return;
            }
            ZoomLevel zoomLevel = zoomAnimator.targetZoom;
            int ordinal = zoomLevel.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 || ordinal == 2) {
                    return;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            ZoomLevel zoomLevel2 = ZoomLevel.MEDIUM;
            float f = zoomAnimator.panX;
            float f2 = zoomAnimator.panY;
            float f3 = GridLayout.getRenderParams(zoomLevel, gridConfig).cameraZ;
            zoomAnimator.zoomTo(zoomLevel2);
            gridInteractionController.setUpMediumTrackingBlend(gridConfig, zoomLevel, f, f2, f3);
            CardDesignLibraryScene$$ExternalSyntheticLambda0 cardDesignLibraryScene$$ExternalSyntheticLambda0 = gridInteractionController.onInteractionChanged;
            if (cardDesignLibraryScene$$ExternalSyntheticLambda0 != null) {
                cardDesignLibraryScene$$ExternalSyntheticLambda0.invoke();
            }
        }
    }

    public final void zoomOut() {
        ZoomLevel zoomLevel;
        int ordinal;
        ZoomLevel zoomLevel2;
        GridInteractionController gridInteractionController = this.interactionController;
        ZoomAnimator zoomAnimator = gridInteractionController.zoomAnimator;
        if (gridInteractionController.isInitialized && !zoomAnimator.isAnimating()) {
            gridInteractionController.isFlingSettling = false;
            GridConfig gridConfig = gridInteractionController.gridConfig;
            if (gridConfig == null || (ordinal = (zoomLevel = zoomAnimator.targetZoom).ordinal()) == 0) {
                return;
            }
            if (ordinal == 1) {
                zoomLevel2 = ZoomLevel.FAR;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                zoomLevel2 = gridInteractionController.zoomOriginBeforeNear;
            }
            float f = zoomAnimator.panX;
            float f2 = zoomAnimator.panY;
            float f3 = GridLayout.getRenderParams(zoomLevel, gridConfig).cameraZ;
            zoomAnimator.zoomTo(zoomLevel2);
            int ordinal2 = zoomLevel2.ordinal();
            if (ordinal2 == 0) {
                Pair findNearestCanonicalOrigin = GridLayout.findNearestCanonicalOrigin(f, f2, GridLayout.getRenderParams(ZoomLevel.FAR, gridConfig), gridConfig, GridLayout.getRenderParams(zoomLevel, gridConfig));
                float floatValue = ((Number) findNearestCanonicalOrigin.first).floatValue();
                float floatValue2 = ((Number) findNearestCanonicalOrigin.second).floatValue();
                zoomAnimator.farTileOriginY = floatValue2;
                Pair farPanBounds = gridInteractionController.farPanBounds(gridConfig);
                float floatValue3 = ((Number) farPanBounds.first).floatValue();
                float floatValue4 = ((Number) farPanBounds.second).floatValue();
                float f4 = floatValue3 + floatValue2;
                zoomAnimator.farPanMinY = f4;
                zoomAnimator.farPanMaxY = floatValue2 + floatValue4;
                gridInteractionController.pinchStartPanX = f;
                gridInteractionController.pinchStartPanY = f2;
                gridInteractionController.pinchStartCameraZ = f3;
                gridInteractionController.pinchFarTargetPanX = floatValue;
                gridInteractionController.pinchFarTargetPanY = f4;
                gridInteractionController.trackingCell = null;
                gridInteractionController.blendingToFarRest = true;
                zoomAnimator.panAnimProgress = 1.0f;
            } else if (ordinal2 == 1) {
                gridInteractionController.setUpMediumTrackingBlend(gridConfig, zoomLevel, f, f2, f3);
            } else if (ordinal2 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            CardDesignLibraryScene$$ExternalSyntheticLambda0 cardDesignLibraryScene$$ExternalSyntheticLambda0 = gridInteractionController.onInteractionChanged;
            if (cardDesignLibraryScene$$ExternalSyntheticLambda0 != null) {
                cardDesignLibraryScene$$ExternalSyntheticLambda0.invoke();
            }
        }
    }
}
