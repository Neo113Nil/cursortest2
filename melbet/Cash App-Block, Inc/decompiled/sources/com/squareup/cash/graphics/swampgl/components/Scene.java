package com.squareup.cash.graphics.swampgl.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.pipe.compat.Camera2CaptureSequence;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.media3.exoplayer.RendererHolder;
import androidx.paging.Pager$pageFetcher$2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import com.android.volley.RequestQueue;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.advertising.presenters.FullscreenAdPresenter;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.api.ContextKt;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter$verify$result$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.backend.RealBoostSyncer;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.TagOrderConfirmationPresenter;
import com.squareup.cash.card.onboarding.core.HeatMaskRenderer;
import com.squareup.cash.card.onboarding.screens.TagOrderConfirmationScreen;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.routers.core.BackgroundRouter;
import com.squareup.cash.clientrouting.routers.offers.OffersRouter;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.google.pay.GooglePayService;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.EngineFrameScheduler$SceneGroup;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.PerformanceMetrics;
import com.squareup.cash.graphics.swampgl.components.ibl.CubemapFace;
import com.squareup.cash.graphics.swampgl.components.ibl.IblAssetData;
import com.squareup.cash.graphics.swampgl.components.ibl.IblComponent;
import com.squareup.cash.graphics.swampgl.components.ibl.IblMipLevel;
import com.squareup.cash.graphics.swampgl.gl.RealGlOperations;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.investing.components.InvestingHomeView$2$1;
import com.squareup.cash.money.applets.sections.RealAppletTileServerRecommendationProvider;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.observability.backend.real.bugsnag.BugsnagClientSandboxSetupTeardown;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.presenters.OffersDetailsPresenterV2$models$1$1$1;
import com.squareup.cash.support.chat.backend.real.RealChatSurveyService;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.discover.api.app.v2.api.GetMoneyTabAppletsRequest;
import com.squareup.protos.cash.discover.api.app.v2.service.AppletsService;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageViewRequest;
import com.squareup.protos.cash.semaphore.api.SemaphoreService;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.CompleteDigitalWalletTokenProvisioningRequest;
import com.squareup.protos.franklin.app.EndFlowRequest;
import com.squareup.protos.franklin.app.GetFeatureFlagsRequest;
import com.squareup.protos.franklin.app.GetRewardsRequest;
import com.squareup.protos.franklin.app.GetRewardsResponse;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest$Request$Request$EndFlowRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.common.DigitalWalletToken$Issuer;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.RewardsData;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.investing.GetCustomerInvestmentSettingsRequest;
import com.squareup.protos.franklin.investing.GetCustomerInvestmentSettingsResponse;
import com.squareup.protos.franklin.investing.InvestingService;
import com.squareup.protos.rewardly.app.RewardlyExternalAppService;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.Cache;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.SafeTrace;
import timber.log.Timber;
import utils.StringUtilsKt;

/* loaded from: classes6.dex */
public abstract class Scene {
    public static final Regex GLES_VERSION_PATTERN = new Regex("OpenGL ES (\\d+)");
    public final SharedFlowImpl _dirty;
    public final LinkedHashMap _entities;
    public IblComponent _iblData;
    public final RequestQueue camera;
    public Job cameraObserverJob;
    public float clearColorA;
    public float clearColorB;
    public float clearColorG;
    public float clearColorR;
    public boolean depthProgramLinkFailed;
    public final ReadonlySharedFlow dirty;
    public boolean disableDepthTest;
    public final LinkedHashMap entityObserverJobs;
    public Lazy frameShadowState;
    public final GLLauncher glLauncher;
    public int glesMajorVersion;
    public Job iblObserverJob;
    public int instancedDepthProgram;
    public float lastFov;
    public String lastReadyStateLog;
    public int lastRenderHeight;
    public int lastRenderWidth;
    public int maxFragmentTextureUnits;
    public int nonInstancedDepthProgram;
    public final ScenePerformanceTracker performanceTracker;
    public final RealStrongMemoryCache shaderManager;
    public final ArrayList shadowCasterScratch;
    public RendererHolder shadowMap;
    public boolean shadowReady;
    public volatile Lazy shadowState;

    public Scene(Engine engine) {
        engine.getClass();
        this.glLauncher = engine;
        this.shaderManager = new RealStrongMemoryCache(9);
        this.performanceTracker = new ScenePerformanceTracker(new RealGooglePayer$$ExternalSyntheticLambda0(this, 8));
        this._entities = new LinkedHashMap();
        this.entityObserverJobs = new LinkedHashMap();
        this.shadowCasterScratch = new ArrayList();
        this.glesMajorVersion = -1;
        this.maxFragmentTextureUnits = -1;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 1, null, 4);
        this._dirty = MutableSharedFlow$default;
        RequestQueue requestQueue = new RequestQueue();
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
        requestQueue.mSequenceGenerator = MutableStateFlow;
        StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
        requestQueue.mCurrentRequests = MutableStateFlow2;
        StateFlowImpl MutableStateFlow3 = FlowKt.MutableStateFlow(new Vector3(RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE));
        requestQueue.mCacheQueue = MutableStateFlow3;
        StateFlowImpl MutableStateFlow4 = FlowKt.MutableStateFlow(Float.valueOf(60.0f));
        requestQueue.mNetworkQueue = MutableStateFlow4;
        StateFlowImpl MutableStateFlow5 = FlowKt.MutableStateFlow(Float.valueOf(0.1f));
        requestQueue.mCache = MutableStateFlow5;
        StateFlowImpl MutableStateFlow6 = FlowKt.MutableStateFlow(Float.valueOf(100.0f));
        requestQueue.mNetwork = MutableStateFlow6;
        StateFlowImpl MutableStateFlow7 = FlowKt.MutableStateFlow(Boolean.TRUE);
        requestQueue.mDelivery = MutableStateFlow7;
        StateFlowImpl MutableStateFlow8 = FlowKt.MutableStateFlow(Float.valueOf(1.0f));
        requestQueue.mDispatchers = MutableStateFlow8;
        int i = 0;
        requestQueue.mCacheDispatcher = new Camera$special$$inlined$map$1(FlowKt.merge(MutableStateFlow, MutableStateFlow2, MutableStateFlow3, MutableStateFlow4, MutableStateFlow5, MutableStateFlow6, MutableStateFlow7, MutableStateFlow8), i);
        requestQueue.mFinishedListeners = new float[16];
        requestQueue.mEventListeners = new float[16];
        requestQueue.updateViewMatrix();
        requestQueue.updateProjectionMatrix();
        this.camera = requestQueue;
        this.dirty = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.cameraObserverJob = engine.launch(new AnonymousClass1(this, (Continuation) null, i));
    }

    public static void setMatrixUniform(RealUniformBinder realUniformBinder, String str, float[] fArr) {
        fArr.getClass();
        int uniformLocation = realUniformBinder.getUniformLocation(str);
        if (uniformLocation >= 0) {
            GLES20.glUniformMatrix4fv(uniformLocation, 1, false, fArr, 0);
        }
    }

    public final void addEntity(Entity entity) {
        entity.getClass();
        String str = entity.id;
        removeEntity(str);
        this._entities.put(str, entity);
        this.entityObserverJobs.put(str, this.glLauncher.launch(new RealMRIFactory$sign$2.AnonymousClass1(entity, this, null, 10)));
        markDirty();
    }

    public void bindShadowUniforms(RealUniformBinder realUniformBinder, boolean z) {
        if (!z) {
            realUniformBinder.setFloat("uShadowsEnabled", RecyclerView.DECELERATION_RATE);
            return;
        }
        Lazy lazy = this.frameShadowState;
        RendererHolder rendererHolder = this.shadowMap;
        if (!this.shadowReady || rendererHolder == null || lazy == null) {
            realUniformBinder.setFloat("uShadowsEnabled", RecyclerView.DECELERATION_RATE);
            return;
        }
        float[] fArr = (float[]) lazy.value;
        realUniformBinder.setFloat("uShadowsEnabled", 1.0f);
        realUniformBinder.setFloat("uShadowMapTexel", 4.8828125E-4f);
        realUniformBinder.setFloat("uShadowBiasMin", 0.001f);
        realUniformBinder.setFloat("uShadowBiasMax", 0.001f);
        realUniformBinder.setFloat("uShadowStrength", 1.0f);
        realUniformBinder.setFloat("uShadowAtlasGrid", 1.0f);
        realUniformBinder.setInt(0, "uUsePcf");
        realUniformBinder.setInt(11, "uShadowMap");
        int uniformLocation = realUniformBinder.getUniformLocation("uLightViewProjection");
        if (uniformLocation >= 0) {
            GLES20.glUniformMatrix4fv(uniformLocation, 1, false, fArr, 0);
        }
        GLES20.glActiveTexture(33995);
        GLES20.glBindTexture(3553, rendererHolder.index);
    }

    public void dispose() {
        RendererHolder rendererHolder = this.shadowMap;
        int i = this.nonInstancedDepthProgram;
        int i2 = this.instancedDepthProgram;
        Continuation continuation = null;
        this.shadowMap = null;
        this.shadowReady = false;
        this.shadowState = null;
        this.nonInstancedDepthProgram = 0;
        this.instancedDepthProgram = 0;
        this.depthProgramLinkFailed = false;
        if (rendererHolder != null || i != 0 || i2 != 0) {
            this.glLauncher.launch(new Scene$dispose$1(rendererHolder, i, i2, null));
        }
        Job job = this.cameraObserverJob;
        if (job != null) {
            job.cancel(null);
        }
        this.cameraObserverJob = null;
        Job job2 = this.iblObserverJob;
        if (job2 != null) {
            job2.cancel(null);
        }
        this.iblObserverJob = null;
        IblComponent iblComponent = this._iblData;
        if (iblComponent != null) {
            this.glLauncher.launch(new Scene$iblData$1(iblComponent, continuation, 1));
        }
        this._iblData = null;
        Iterator it = this.entityObserverJobs.values().iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(null);
        }
        this.entityObserverJobs.clear();
        this.glLauncher.launch(new Pager$pageFetcher$2(this, continuation, 11));
    }

    public final List getEntities() {
        return CollectionsKt.toList(this._entities.values());
    }

    public final boolean isSceneReady() {
        if (!getEntities().isEmpty()) {
            for (Entity entity : getEntities()) {
                if (entity.getVisible() && ((Boolean) entity.geometry.getReady().getValue()).booleanValue() && ((Boolean) entity.material.getReady().getValue()).booleanValue()) {
                    this.lastReadyStateLog = null;
                    return true;
                }
            }
            if (!Intrinsics.areEqual(this.lastReadyStateLog, "Scene not ready: no visible entities are fully loaded")) {
                this.lastReadyStateLog = "Scene not ready: no visible entities are fully loaded";
                Timber.Forest forest = Timber.Forest;
                forest.tag("Scene");
                forest.d("Scene not ready: no visible entities are fully loaded", new Object[0]);
            }
        } else if (!Intrinsics.areEqual(this.lastReadyStateLog, "Scene not ready: no entities")) {
            this.lastReadyStateLog = "Scene not ready: no entities";
            Timber.Forest forest2 = Timber.Forest;
            forest2.tag("Scene");
            forest2.d("Scene not ready: no entities", new Object[0]);
            return false;
        }
        return false;
    }

    public final void markDirty() {
        this._dirty.tryEmit(Unit.INSTANCE);
    }

    public final void removeEntity(String str) {
        if (this._entities.remove(str) != null) {
            Job job = (Job) this.entityObserverJobs.remove(str);
            if (job != null) {
                job.cancel(null);
            }
            markDirty();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0147, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x014f, code lost:
    
        r21.shadowReady = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00e9, code lost:
    
        if (r13 >= 3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r13 >= 3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0152, code lost:
    
        r21.shadowReady = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
    
        if (r21.maxFragmentTextureUnits >= 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
    
        r13 = new int[1];
        android.opengl.GLES20.glGetIntegerv(34930, r13, 0);
        r21.maxFragmentTextureUnits = r13[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        if (r21.maxFragmentTextureUnits <= 11) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
    
        r13 = r21.shadowMap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
    
        if (r13 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
    
        r13 = new androidx.media3.exoplayer.RendererHolder();
        r13.initialize();
        r21.shadowMap = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0111, code lost:
    
        if (r21.depthProgramLinkFailed != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0115, code lost:
    
        if (r21.nonInstancedDepthProgram != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        r21.nonInstancedDepthProgram = io.noties.markwon.utils.ColorUtils.linkProgram("\n    precision highp float;\n    attribute vec3 aPosition;\n    uniform mat4 uModelMatrix;\n    uniform mat4 uLightViewProjection;\n    void main() {\n      gl_Position = uLightViewProjection * uModelMatrix * vec4(aPosition, 1.0);\n    }\n  ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0121, code lost:
    
        if (r21.instancedDepthProgram != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0123, code lost:
    
        r21.instancedDepthProgram = io.noties.markwon.utils.ColorUtils.linkProgram("\n    precision highp float;\n    attribute vec3 aPosition;\n    attribute vec4 aInstanceModel0;\n    attribute vec4 aInstanceModel1;\n    attribute vec4 aInstanceModel2;\n    attribute vec4 aInstanceModel3;\n    uniform mat4 uLightViewProjection;\n    void main() {\n      mat4 model = mat4(aInstanceModel0, aInstanceModel1, aInstanceModel2, aInstanceModel3);\n      gl_Position = uLightViewProjection * model * vec4(aPosition, 1.0);\n    }\n  ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012d, code lost:
    
        if (r21.nonInstancedDepthProgram == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0131, code lost:
    
        if (r21.instancedDepthProgram != 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0134, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
    
        r21.depthProgramLinkFailed = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013b, code lost:
    
        if (r13.primaryRequiresReset == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013f, code lost:
    
        if (r21.nonInstancedDepthProgram == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0143, code lost:
    
        if (r21.instancedDepthProgram == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0145, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0148, code lost:
    
        r21.shadowReady = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014a, code lost:
    
        if (r15 == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0308 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void render(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ScenePerformanceTracker scenePerformanceTracker;
        long currentTimeMillis;
        boolean z;
        long j;
        boolean z2;
        long j2;
        float f;
        String str;
        Integer intOrNull;
        if (i <= 0 || i2 <= 0) {
            Timber.Forest forest = Timber.Forest;
            forest.tag("Scene");
            forest.e("Invalid dimensions: " + i + "x" + i2, new Object[0]);
            return;
        }
        if (!isSceneReady()) {
            GLES20.glViewport(0, 0, i, i2);
            GLES20.glClearColor(this.clearColorR, this.clearColorG, this.clearColorB, this.clearColorA);
            GLES20.glClear(16640);
            return;
        }
        RequestQueue requestQueue = this.camera;
        if (i != this.lastRenderWidth || i2 != this.lastRenderHeight || ((Number) ((StateFlowImpl) requestQueue.mNetworkQueue).getValue()).floatValue() != this.lastFov) {
            this.lastRenderWidth = i;
            this.lastRenderHeight = i2;
            this.lastFov = ((Number) ((StateFlowImpl) requestQueue.mNetworkQueue).getValue()).floatValue();
            requestQueue.setAspectRatio(i / i2);
        }
        Lazy lazy = this.shadowState;
        this.frameShadowState = lazy;
        int i9 = 3042;
        if (lazy != null) {
            float[] fArr = (float[]) lazy.value;
            this.shadowCasterScratch.clear();
            for (Entity entity : this._entities.values()) {
                if (entity.getVisible() && entity.castsShadow) {
                    this.shadowCasterScratch.add(entity);
                }
            }
            if (!this.shadowCasterScratch.isEmpty()) {
                if (this.frameShadowState != null) {
                    int i10 = this.glesMajorVersion;
                    if (i10 < 0) {
                        String glGetString = GLES20.glGetString(7938);
                        if (glGetString == null) {
                            glGetString = "";
                        }
                        MatcherMatchResult find = GLES_VERSION_PATTERN.find(glGetString);
                        int intValue = (find == null || (str = (String) ((MatcherMatchResult$groupValues$1) find.getGroupValues()).get(1)) == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue();
                        this.glesMajorVersion = intValue;
                    }
                    GLES20.glViewport(0, 0, i, i2);
                    GLES20.glClearColor(this.clearColorR, this.clearColorG, this.clearColorB, this.clearColorA);
                    GLES20.glClear(i3);
                    GLES20.glEnable(i6);
                    GLES20.glEnable(i4);
                    GLES20.glBlendFunc(770, 771);
                    GLES20.glEnable(2929);
                    GLES20.glDepthMask(true);
                    if (this.disableDepthTest) {
                        GLES20.glDisable(2929);
                        GLES20.glBlendFunc(1, 771);
                        GLES20.glCullFace(i5);
                        for (Entity entity2 : getEntities()) {
                            if (entity2.getVisible() && entity2.getNeedsDoubleSidedRendering()) {
                                renderEntity(entity2);
                            }
                        }
                        GLES20.glCullFace(i7);
                        i8 = 0;
                        for (Entity entity3 : getEntities()) {
                            if (entity3.getVisible()) {
                                i8++;
                                renderEntity(entity3);
                            }
                        }
                    } else {
                        i8 = 0;
                        for (Entity entity4 : getEntities()) {
                            if (entity4.getVisible()) {
                                i8++;
                                if (entity4.getNeedsDoubleSidedRendering()) {
                                    GLES20.glCullFace(i5);
                                    GLES20.glDepthMask(false);
                                    renderEntity(entity4);
                                    GLES20.glCullFace(i7);
                                    GLES20.glDepthMask(entity4.depthWrite);
                                    renderEntity(entity4);
                                } else {
                                    GLES20.glCullFace(i7);
                                    GLES20.glDepthMask(entity4.depthWrite);
                                    renderEntity(entity4);
                                }
                                GLES20.glDepthMask(true);
                            }
                        }
                    }
                    scenePerformanceTracker = this.performanceTracker;
                    int size = getEntities().size();
                    scenePerformanceTracker.lastRenderedEntityCount = i8;
                    currentTimeMillis = System.currentTimeMillis();
                    long j3 = scenePerformanceTracker.engineFrameCount;
                    z = j3 == 0;
                    if (scenePerformanceTracker.timeToFirstFrame == 0 && z) {
                        scenePerformanceTracker.timeToFirstFrame = currentTimeMillis - scenePerformanceTracker.startTime;
                    }
                    long j4 = scenePerformanceTracker.lastFrameTime;
                    j = j4 > 0 ? currentTimeMillis - j4 : 0L;
                    scenePerformanceTracker.lastFrameTime = currentTimeMillis;
                    if (j > 0 || j >= 100) {
                        z2 = z;
                    } else {
                        z2 = z;
                        long j5 = scenePerformanceTracker.averageFrameTimeMs;
                        if (j5 != 0) {
                            j = ((j5 * 9) + j) / 10;
                        }
                        scenePerformanceTracker.averageFrameTimeMs = j;
                    }
                    long j6 = j3 + 1;
                    scenePerformanceTracker.engineFrameCount = j6;
                    j2 = currentTimeMillis - scenePerformanceTracker.lastEngineFpsTime;
                    if (j2 >= 500) {
                        scenePerformanceTracker.engineFps = (j6 * 1000.0f) / j2;
                        scenePerformanceTracker.lastEngineFpsTime = currentTimeMillis;
                        scenePerformanceTracker.engineFrameCount = 0L;
                    }
                    if (!z2 || currentTimeMillis - scenePerformanceTracker.lastPerformanceUpdate >= 500) {
                        scenePerformanceTracker.lastPerformanceUpdate = currentTimeMillis;
                        f = scenePerformanceTracker.engineFps;
                        float f2 = RecyclerView.DECELERATION_RATE;
                        if (f <= RecyclerView.DECELERATION_RATE) {
                            long j7 = scenePerformanceTracker.averageFrameTimeMs;
                            if (j7 > 0) {
                                f = 1000.0f / j7;
                            }
                            StateFlowImpl stateFlowImpl = scenePerformanceTracker._metrics;
                            PerformanceMetrics performanceMetrics = new PerformanceMetrics(f2, scenePerformanceTracker.averageFrameTimeMs, ((Number) scenePerformanceTracker.shaderCompileTimeProvider.invoke()).longValue(), scenePerformanceTracker.timeToFirstFrame, size, scenePerformanceTracker.lastRenderedEntityCount, i, i2);
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, performanceMetrics);
                        }
                        f2 = f;
                        StateFlowImpl stateFlowImpl2 = scenePerformanceTracker._metrics;
                        PerformanceMetrics performanceMetrics2 = new PerformanceMetrics(f2, scenePerformanceTracker.averageFrameTimeMs, ((Number) scenePerformanceTracker.shaderCompileTimeProvider.invoke()).longValue(), scenePerformanceTracker.timeToFirstFrame, size, scenePerformanceTracker.lastRenderedEntityCount, i, i2);
                        stateFlowImpl2.getClass();
                        stateFlowImpl2.updateState(null, performanceMetrics2);
                    }
                    return;
                }
                RendererHolder rendererHolder = null;
                if (rendererHolder != null) {
                    rendererHolder.bindForWriting();
                    GLES20.glEnable(2929);
                    GLES20.glDisable(3042);
                    GLES20.glEnable(32823);
                    i3 = 16640;
                    i5 = IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA;
                    GLES20.glPolygonOffset(2.0f, 4.0f);
                    Iterator it = this.shadowCasterScratch.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        Entity entity5 = (Entity) next;
                        int i11 = i9;
                        if (((Boolean) entity5.geometry.getReady().getValue()).booleanValue()) {
                            boolean isInstanced = entity5.geometry.isInstanced();
                            int i12 = isInstanced ? this.instancedDepthProgram : this.nonInstancedDepthProgram;
                            if (i12 != 0) {
                                GLES20.glUseProgram(i12);
                                GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(i12, "uLightViewProjection"), 1, false, fArr, 0);
                                if (!isInstanced) {
                                    GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(i12, "uModelMatrix"), 1, false, entity5.transform._modelMatrix, 0);
                                }
                                boolean z3 = entity5.castsShadowFromBackFacesOnly || !entity5.getNeedsDoubleSidedRendering();
                                GLES20.glEnable(2884);
                                GLES20.glCullFace(z3 ? 1028 : 1029);
                                entity5.geometry.draw();
                            }
                        }
                        i9 = i11;
                    }
                    i4 = i9;
                    i6 = 2884;
                    i7 = IptcConstants.IMAGE_RESOURCE_BLOCK_RAW_IMAGE_MODE;
                    GLES20.glEnable(2884);
                    GLES20.glCullFace(IptcConstants.IMAGE_RESOURCE_BLOCK_RAW_IMAGE_MODE);
                    GLES20.glDisable(32823);
                    GLES20.glBindFramebuffer(36160, ((int[]) rendererHolder.secondaryRenderer)[0]);
                    int[] iArr = (int[]) rendererHolder.primaryRenderer;
                    GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.shadowCasterScratch.clear();
                    GLES20.glViewport(0, 0, i, i2);
                    GLES20.glClearColor(this.clearColorR, this.clearColorG, this.clearColorB, this.clearColorA);
                    GLES20.glClear(i3);
                    GLES20.glEnable(i6);
                    GLES20.glEnable(i4);
                    GLES20.glBlendFunc(770, 771);
                    GLES20.glEnable(2929);
                    GLES20.glDepthMask(true);
                    if (this.disableDepthTest) {
                    }
                    scenePerformanceTracker = this.performanceTracker;
                    int size2 = getEntities().size();
                    scenePerformanceTracker.lastRenderedEntityCount = i8;
                    currentTimeMillis = System.currentTimeMillis();
                    long j32 = scenePerformanceTracker.engineFrameCount;
                    if (j32 == 0) {
                    }
                    if (scenePerformanceTracker.timeToFirstFrame == 0) {
                        scenePerformanceTracker.timeToFirstFrame = currentTimeMillis - scenePerformanceTracker.startTime;
                    }
                    long j42 = scenePerformanceTracker.lastFrameTime;
                    if (j42 > 0) {
                    }
                    scenePerformanceTracker.lastFrameTime = currentTimeMillis;
                    if (j > 0) {
                    }
                    z2 = z;
                    long j62 = j32 + 1;
                    scenePerformanceTracker.engineFrameCount = j62;
                    j2 = currentTimeMillis - scenePerformanceTracker.lastEngineFpsTime;
                    if (j2 >= 500) {
                    }
                    if (z2) {
                    }
                    scenePerformanceTracker.lastPerformanceUpdate = currentTimeMillis;
                    f = scenePerformanceTracker.engineFps;
                    float f22 = RecyclerView.DECELERATION_RATE;
                    if (f <= RecyclerView.DECELERATION_RATE) {
                    }
                    f22 = f;
                    StateFlowImpl stateFlowImpl22 = scenePerformanceTracker._metrics;
                    PerformanceMetrics performanceMetrics22 = new PerformanceMetrics(f22, scenePerformanceTracker.averageFrameTimeMs, ((Number) scenePerformanceTracker.shaderCompileTimeProvider.invoke()).longValue(), scenePerformanceTracker.timeToFirstFrame, size2, scenePerformanceTracker.lastRenderedEntityCount, i, i2);
                    stateFlowImpl22.getClass();
                    stateFlowImpl22.updateState(null, performanceMetrics22);
                }
                this.shadowCasterScratch.clear();
            }
        }
        i3 = 16640;
        i4 = 3042;
        i5 = IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA;
        i6 = 2884;
        i7 = IptcConstants.IMAGE_RESOURCE_BLOCK_RAW_IMAGE_MODE;
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glClearColor(this.clearColorR, this.clearColorG, this.clearColorB, this.clearColorA);
        GLES20.glClear(i3);
        GLES20.glEnable(i6);
        GLES20.glEnable(i4);
        GLES20.glBlendFunc(770, 771);
        GLES20.glEnable(2929);
        GLES20.glDepthMask(true);
        if (this.disableDepthTest) {
        }
        scenePerformanceTracker = this.performanceTracker;
        int size22 = getEntities().size();
        scenePerformanceTracker.lastRenderedEntityCount = i8;
        currentTimeMillis = System.currentTimeMillis();
        long j322 = scenePerformanceTracker.engineFrameCount;
        if (j322 == 0) {
        }
        if (scenePerformanceTracker.timeToFirstFrame == 0) {
        }
        long j422 = scenePerformanceTracker.lastFrameTime;
        if (j422 > 0) {
        }
        scenePerformanceTracker.lastFrameTime = currentTimeMillis;
        if (j > 0) {
        }
        z2 = z;
        long j622 = j322 + 1;
        scenePerformanceTracker.engineFrameCount = j622;
        j2 = currentTimeMillis - scenePerformanceTracker.lastEngineFpsTime;
        if (j2 >= 500) {
        }
        if (z2) {
        }
        scenePerformanceTracker.lastPerformanceUpdate = currentTimeMillis;
        f = scenePerformanceTracker.engineFps;
        float f222 = RecyclerView.DECELERATION_RATE;
        if (f <= RecyclerView.DECELERATION_RATE) {
        }
        f222 = f;
        StateFlowImpl stateFlowImpl222 = scenePerformanceTracker._metrics;
        PerformanceMetrics performanceMetrics222 = new PerformanceMetrics(f222, scenePerformanceTracker.averageFrameTimeMs, ((Number) scenePerformanceTracker.shaderCompileTimeProvider.invoke()).longValue(), scenePerformanceTracker.timeToFirstFrame, size22, scenePerformanceTracker.lastRenderedEntityCount, i, i2);
        stateFlowImpl222.getClass();
        stateFlowImpl222.updateState(null, performanceMetrics222);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01dc, code lost:
    
        okio.Path$$ExternalSyntheticBUOutline0.m$1((java.lang.Object) defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0.m(r14, "IBL mip level ", " out of range (0-3)"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01e3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void renderEntity(Entity entity) {
        String str;
        int[] iArr;
        ArrayList arrayList;
        int i;
        Iterator it;
        Integer num;
        if (((Boolean) entity.geometry.getReady().getValue()).booleanValue() && ((Boolean) entity.material.getReady().getValue()).booleanValue()) {
            try {
                int orCompileShader = this.shaderManager.getOrCompileShader(entity);
                GLES20.glUseProgram(orCompileShader);
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.shaderManager.cache;
                Integer valueOf = Integer.valueOf(orCompileShader);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new RealUniformBinder(orCompileShader);
                    linkedHashMap.put(valueOf, obj);
                }
                RealUniformBinder realUniformBinder = (RealUniformBinder) obj;
                int i2 = realUniformBinder.maxAutoTextureUnit;
                if (i2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        GLES20.glActiveTexture(i3 + 33984);
                        GLES20.glBindTexture(3553, 0);
                        GLES20.glBindTexture(34067, 0);
                        if (i3 == i2) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                GLES20.glActiveTexture(33984);
                realUniformBinder.nextTextureUnit = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i4, "uIblCubemapMip");
                    if (i4 < 0 || i4 >= 4) {
                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i4, "IBL mip level ", " out of range (0-3)"));
                        return;
                    }
                    realUniformBinder.setInt(i4 + 12, m);
                }
                IblComponent iblComponent = this._iblData;
                if (iblComponent == null || !((Boolean) iblComponent.ready.$$delegate_0.getValue()).booleanValue()) {
                    str = "Scene";
                    realUniformBinder.setFloat("uIblNumMipLevels", 1.0f);
                    realUniformBinder.setFloat("uIblIntensity", RecyclerView.DECELERATION_RATE);
                } else {
                    IblAssetData iblAssetData = iblComponent.currentAsset;
                    if (iblAssetData == null) {
                        str = "Scene";
                    } else {
                        ArrayList arrayList2 = iblAssetData.mipLevels;
                        int[] iArr2 = iblComponent.iblTextureIds;
                        RealGlOperations realGlOperations = iblComponent.glTexOps;
                        int identityHashCode = System.identityHashCode(iblAssetData);
                        if (iblComponent.iblTexturesInitialized && (num = iblComponent.lastIblAssetHash) != null && num.intValue() == identityHashCode) {
                            str = "Scene";
                            iArr = iArr2;
                            arrayList = arrayList2;
                        } else {
                            int size = arrayList2.size();
                            if (size > 4) {
                                size = 4;
                            }
                            Timber.Forest forest = Timber.Forest;
                            iArr = iArr2;
                            forest.tag("IblComponent");
                            arrayList = arrayList2;
                            str = "Scene";
                            forest.d("Uploading IBL with " + size + " mip levels", new Object[0]);
                            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CubemapFace[]{CubemapFace.POSITIVE_X, CubemapFace.NEGATIVE_X, CubemapFace.POSITIVE_Y, CubemapFace.NEGATIVE_Y, CubemapFace.POSITIVE_Z, CubemapFace.NEGATIVE_Z});
                            Iterator it2 = arrayList.iterator();
                            int i5 = 0;
                            while (true) {
                                List list = listOf;
                                if (!it2.hasNext()) {
                                    iblComponent.iblTexturesInitialized = true;
                                    iblComponent.lastIblAssetHash = Integer.valueOf(System.identityHashCode(iblAssetData));
                                    Timber.Forest forest2 = Timber.Forest;
                                    forest2.tag("IblComponent");
                                    forest2.d("IBL upload complete", new Object[0]);
                                    break;
                                }
                                Object next = it2.next();
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    throw null;
                                }
                                IblMipLevel iblMipLevel = (IblMipLevel) next;
                                if (i5 < size) {
                                    if (iArr[i5] == 0) {
                                        realGlOperations.getClass();
                                        i = size;
                                        int[] iArr3 = new int[1];
                                        it = it2;
                                        GLES20.glGenTextures(1, iArr3, 0);
                                        iArr[i5] = iArr3[0];
                                    } else {
                                        i = size;
                                        it = it2;
                                    }
                                    int i7 = iArr[i5];
                                    if (i5 < 0 || i5 >= 4) {
                                        break;
                                    }
                                    realGlOperations.getClass();
                                    GLES20.glActiveTexture(i5 + 33996);
                                    GLES20.glBindTexture(34067, i7);
                                    GLES20.glTexParameteri(34067, 10241, 9729);
                                    GLES20.glTexParameteri(34067, 10240, 9729);
                                    GLES20.glTexParameteri(34067, 10242, 33071);
                                    GLES20.glTexParameteri(34067, 10243, 33071);
                                    int i8 = 0;
                                    for (Object obj2 : list) {
                                        int i9 = i8 + 1;
                                        if (i8 < 0) {
                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                            throw null;
                                        }
                                        Bitmap bitmap = (Bitmap) iblMipLevel.faces.get((CubemapFace) obj2);
                                        if (bitmap != null) {
                                            GLUtils.texImage2D(i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? 34074 : 34073 : 34072 : 34071 : 34070 : 34069, 0, bitmap, 0);
                                        }
                                        i8 = i9;
                                    }
                                } else {
                                    i = size;
                                    it = it2;
                                }
                                listOf = list;
                                i5 = i6;
                                size = i;
                                it2 = it;
                            }
                        }
                        int size2 = arrayList.size();
                        int i10 = 4;
                        if (size2 > 4) {
                            size2 = 4;
                        }
                        int i11 = 0;
                        while (i11 < size2) {
                            if (i11 < 0 || i11 >= i10) {
                                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i11, "IBL mip level ", " out of range (0-3)"));
                                return;
                            }
                            realGlOperations.getClass();
                            GLES20.glActiveTexture(i11 + 33996);
                            GLES20.glBindTexture(34067, iArr[i11]);
                            i11++;
                            i10 = 4;
                        }
                        for (int i12 = 0; i12 < size2; i12++) {
                            realGlOperations.getClass();
                            int glGetUniformLocation = GLES20.glGetUniformLocation(orCompileShader, "uIblCubemapMip" + i12);
                            if (i12 < 0 || i12 >= 4) {
                                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i12, "IBL mip level ", " out of range (0-3)"));
                                return;
                            }
                            int i13 = i12 + 12;
                            if (glGetUniformLocation >= 0) {
                                GLES20.glUniform1i(glGetUniformLocation, i13);
                            }
                        }
                        realGlOperations.getClass();
                        int glGetUniformLocation2 = GLES20.glGetUniformLocation(orCompileShader, "uIblNumMipLevels");
                        if (glGetUniformLocation2 >= 0) {
                            GLES20.glUniform1f(glGetUniformLocation2, size2);
                        }
                        int glGetUniformLocation3 = GLES20.glGetUniformLocation(orCompileShader, "uIblIntensity");
                        if (glGetUniformLocation3 >= 0) {
                            GLES20.glUniform1f(glGetUniformLocation3, iblComponent._intensity);
                        }
                    }
                }
                bindShadowUniforms(realUniformBinder, entity.receivesShadows);
                setMatrixUniform(realUniformBinder, "uProjectionMatrix", (float[]) this.camera.mEventListeners);
                setMatrixUniform(realUniformBinder, "uViewMatrix", (float[]) this.camera.mFinishedListeners);
                setMatrixUniform(realUniformBinder, "uModelMatrix", entity.transform._modelMatrix);
                realUniformBinder.setFloat3("uCameraPosition", this.camera.getPosition().x, this.camera.getPosition().y, this.camera.getPosition().z);
                entity.material.bind(realUniformBinder);
                entity.geometry.draw();
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    Timber.Forest forest3 = Timber.Forest;
                    forest3.tag(str);
                    forest3.e(CameraSelector$$ExternalSyntheticOutline0.m("GL error drawing '", entity.id, "': 0x", Integer.toHexString(glGetError)), new Object[0]);
                }
            } catch (Exception e) {
                Timber.Forest forest4 = Timber.Forest;
                forest4.tag("Scene");
                forest4.e("Failed to get shader for entity ".concat(entity.id), new Object[0], e);
            }
        }
    }

    public final void setIblData(IblComponent iblComponent) {
        IblComponent iblComponent2 = this._iblData;
        if (iblComponent2 == iblComponent) {
            return;
        }
        this._iblData = iblComponent;
        Job job = this.iblObserverJob;
        Continuation continuation = null;
        if (job != null) {
            job.cancel(null);
        }
        this.iblObserverJob = null;
        GLLauncher gLLauncher = this.glLauncher;
        if (iblComponent2 != null) {
            gLLauncher.launch(new Scene$iblData$1(iblComponent2, continuation, 0));
        }
        this.iblObserverJob = gLLauncher.launch(new RealMRIFactory$sign$2.AnonymousClass1(iblComponent, this, continuation, 11));
        markDirty();
    }

    public final void setShadowConfig(ToolbarTuckTargets toolbarTuckTargets) {
        Lazy lazy = this.shadowState;
        if ((lazy != null ? (ToolbarTuckTargets) lazy.initializer : null) == toolbarTuckTargets) {
            return;
        }
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        float[] fArr4 = (float[]) toolbarTuckTargets.endCornerCenterX$delegate;
        float f = fArr4[0];
        float[] fArr5 = (float[]) toolbarTuckTargets.startCornerCenterX$delegate;
        float f2 = f - fArr5[0];
        float f3 = fArr4[1] - fArr5[1];
        float f4 = fArr4[2] - fArr5[2];
        float sqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3) + (f2 * f2));
        float[] fArr6 = Math.abs((sqrt > RecyclerView.DECELERATION_RATE ? 1 : (sqrt == RecyclerView.DECELERATION_RATE ? 0 : -1)) > 0 ? f3 / sqrt : 0.0f) > 0.99f ? new float[]{RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f} : new float[]{RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE};
        Matrix.setLookAtM(fArr, 0, fArr5[0], fArr5[1], fArr5[2], fArr4[0], fArr4[1], fArr4[2], fArr6[0], fArr6[1], fArr6[2]);
        Matrix.orthoM(fArr2, 0, -1.4f, 1.4f, -1.4f, 1.4f, 7.0f, 12.0f);
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr, 0);
        this.shadowState = new Lazy(4, toolbarTuckTargets, fArr3);
        markDirty();
    }

    /* renamed from: com.squareup.cash.graphics.swampgl.components.Scene$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ Object this$0;

        /* renamed from: com.squareup.cash.graphics.swampgl.components.Scene$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00591 implements FlowCollector {
            public final /* synthetic */ int $r8$classId;
            public final /* synthetic */ Scene this$0;

            public /* synthetic */ C00591(Scene scene, int i) {
                this.$r8$classId = i;
                this.this$0 = scene;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                int i = this.$r8$classId;
                Scene scene = this.this$0;
                switch (i) {
                    case 0:
                        scene.markDirty();
                        break;
                    case 1:
                        scene.markDirty();
                        break;
                    default:
                        scene.markDirty();
                        break;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RendererHolder rendererHolder, int i, Continuation continuation) {
            super(1, continuation);
            this.$r8$classId = 16;
            this.this$0 = rendererHolder;
            this.label = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1((Scene) obj, continuation, 0);
                case 1:
                    return new AnonymousClass1((CapturePipelineImpl) obj, continuation, 1);
                case 2:
                    return new AnonymousClass1((UseCaseCameraRequestControlImpl) obj, continuation, 2);
                case 3:
                    return new AnonymousClass1((Camera2CaptureSequence) obj, continuation, 3);
                case 4:
                    return new AnonymousClass1((SelectionManager) obj, continuation, 4);
                case 5:
                    return new AnonymousClass1((TextFieldSelectionManager) obj, continuation, 5);
                case 6:
                    return new AnonymousClass1((TooltipStateImpl) obj, continuation, 6);
                case 7:
                    return new AnonymousClass1((SharedPreferencesMigration) obj, continuation, 7);
                case 8:
                    return new AnonymousClass1((DataStoreImpl$readDataOrHandleCorruption$3) obj, continuation, 8);
                case 9:
                    return new AnonymousClass1((FullscreenAdPresenter) obj, continuation, 9);
                case 10:
                    return new AnonymousClass1((LocalCashBalancePresenter) obj, continuation, 10);
                case 11:
                    return new AnonymousClass1((VerifyAliasPresenter$verify$result$1) obj, continuation, 11);
                case 12:
                    return new AnonymousClass1((DataStoreImpl$readDataOrHandleCorruption$3) obj, continuation, 12);
                case 13:
                    return new AnonymousClass1((RealBoostSyncer) obj, continuation, 13);
                case 14:
                    return new AnonymousClass1((TagOrderConfirmationPresenter) obj, continuation, 14);
                case 15:
                    return new AnonymousClass1((HeatMaskRenderer) obj, continuation, 15);
                case 16:
                    return new AnonymousClass1((RendererHolder) obj, this.label, continuation);
                case 17:
                    return new AnonymousClass1((BackgroundRouter) obj, continuation, 17);
                case 18:
                    return new AnonymousClass1((OffersRouter) obj, continuation, 18);
                case 19:
                    return new AnonymousClass1((RealProfileSyncer) obj, continuation, 19);
                case 20:
                    return new AnonymousClass1((RealFeatureFlagManager) obj, continuation, 20);
                case 21:
                    return new AnonymousClass1((DisclosurePresenter) obj, continuation, 21);
                case 22:
                    return new AnonymousClass1((EngineFrameScheduler$SceneGroup) obj, continuation, 22);
                case 23:
                    return new AnonymousClass1((MeshGeometry) obj, continuation, 23);
                case 24:
                    return new AnonymousClass1((IblComponent) obj, continuation, 24);
                case 25:
                    return new AnonymousClass1((RealInvestingSyncer) obj, continuation, 25);
                case 26:
                    return new AnonymousClass1((RealAppletTileServerRecommendationProvider) obj, continuation, 26);
                case 27:
                    return new AnonymousClass1((BugsnagClientSandboxSetupTeardown) obj, continuation, 27);
                case 28:
                    return new AnonymousClass1((RealChatSurveyService) obj, continuation, 28);
                default:
                    return new AnonymousClass1((GetOrFetchSync) obj, continuation, 29);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Continuation continuation = (Continuation) obj;
            switch (this.$r8$classId) {
                case 22:
                    ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                    break;
            }
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:239:0x04c7, code lost:
        
            if (r8.processNewBoostsDataInternal(r3, r20) == r1) goto L200;
         */
        /* JADX WARN: Code restructure failed: missing block: B:241:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:245:0x0491, code lost:
        
            if (r3 == r1) goto L200;
         */
        /* JADX WARN: Code restructure failed: missing block: B:368:0x0686, code lost:
        
            if (r0 == r1) goto L307;
         */
        /* JADX WARN: Code restructure failed: missing block: B:370:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:372:0x0664, code lost:
        
            if (r8.updateClipboardEntry$foundation(r20) == r1) goto L307;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object acquireSession;
            Context context;
            String str;
            Object rewardsDirect;
            Object submitBlocker;
            Object withContext;
            Object withContext2;
            Object customerInvestmentSettings;
            Object invoke$default;
            int i = this.$r8$classId;
            int i2 = 4;
            int i3 = 20;
            Object[] objArr = 0;
            Object obj2 = this.this$0;
            int i4 = 1;
            Continuation continuation = null;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Scene scene = (Scene) obj2;
                        Camera$special$$inlined$map$1 camera$special$$inlined$map$1 = (Camera$special$$inlined$map$1) scene.camera.mCacheDispatcher;
                        C00591 c00591 = new C00591(scene, objArr == true ? 1 : 0);
                        this.label = 1;
                        if (camera$special$$inlined$map$1.collect(c00591, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        Object frameMetadata = ((CapturePipelineImpl) obj2).getFrameMetadata(this);
                        return frameMetadata == coroutineSingletons2 ? coroutineSingletons2 : frameMetadata;
                    }
                    if (i6 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    try {
                        if (i7 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOnAsync");
                            }
                            CameraGraphImpl graph = ((UseCaseCameraRequestControlImpl) obj2).useCaseGraphContext.getGraph();
                            this.label = 1;
                            acquireSession = graph.acquireSession(this);
                            if (acquireSession == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            acquireSession = obj;
                        }
                        AutoCloseable autoCloseable = (AutoCloseable) acquireSession;
                        try {
                            CompletableDeferredImpl torchOn = ((CameraGraphSessionImpl) autoCloseable).setTorchOn();
                            Cache.Companion.closeFinally(autoCloseable, null);
                            return torchOn;
                        } finally {
                        }
                    } catch (CancellationException e) {
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
                        }
                        return UseCaseCameraRequestControlImpl.submitFailedResult;
                    }
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        Object awaitInternal = ((Camera2CaptureSequence) obj2).hasStarted.awaitInternal(this);
                        if (awaitInternal != coroutineSingletons4) {
                            awaitInternal = Unit.INSTANCE;
                        }
                        if (awaitInternal == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    } else {
                        if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 4:
                    SelectionManager selectionManager = (SelectionManager) obj2;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Pair contextTextAndSelection$foundation = selectionManager.getContextTextAndSelection$foundation();
                        if (contextTextAndSelection$foundation != null) {
                            AnnotatedString annotatedString = (AnnotatedString) contextTextAndSelection$foundation.first;
                            long j = ((TextRange) contextTextAndSelection$foundation.second).packedValue;
                            PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = selectionManager.platformSelectionBehaviors;
                            if (platformSelectionBehaviorsImpl != null) {
                                this.label = 1;
                                Object m438onShowContextMenuOrSelectionToolbarSbBc2M = platformSelectionBehaviorsImpl.m438onShowContextMenuOrSelectionToolbarSbBc2M(annotatedString, j, this);
                                if (m438onShowContextMenuOrSelectionToolbarSbBc2M != coroutineSingletons5) {
                                    m438onShowContextMenuOrSelectionToolbarSbBc2M = Unit.INSTANCE;
                                }
                                if (m438onShowContextMenuOrSelectionToolbarSbBc2M == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                            }
                        }
                    } else {
                        if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 5:
                    TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj2;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        break;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            textFieldSelectionManager.textToolbarShownViaProvider = true;
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    Pair access$getContextTextAndSelection = TextFieldSelectionManager.access$getContextTextAndSelection(textFieldSelectionManager);
                    if (access$getContextTextAndSelection != null) {
                        String str2 = (String) access$getContextTextAndSelection.first;
                        long j2 = ((TextRange) access$getContextTextAndSelection.second).packedValue;
                        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl2 = textFieldSelectionManager.platformSelectionBehaviors;
                        if (platformSelectionBehaviorsImpl2 != null) {
                            this.label = 2;
                            Object m438onShowContextMenuOrSelectionToolbarSbBc2M2 = platformSelectionBehaviorsImpl2.m438onShowContextMenuOrSelectionToolbarSbBc2M(str2, j2, this);
                            if (m438onShowContextMenuOrSelectionToolbarSbBc2M2 != coroutineSingletons6) {
                                m438onShowContextMenuOrSelectionToolbarSbBc2M2 = Unit.INSTANCE;
                                break;
                            }
                        }
                    }
                    textFieldSelectionManager.textToolbarShownViaProvider = true;
                    return Unit.INSTANCE;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        TooltipStateImpl tooltipStateImpl = (TooltipStateImpl) obj2;
                        this.label = 1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                        cancellableContinuationImpl.initCancellability();
                        tooltipStateImpl.transition.setTargetState(Boolean.TRUE);
                        tooltipStateImpl.job = cancellableContinuationImpl;
                        if (cancellableContinuationImpl.getResult() == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SharedPreferencesMigration sharedPreferencesMigration = (SharedPreferencesMigration) obj2;
                        this.label = 1;
                        SharedPreferences.Editor edit = ((SharedPreferences) sharedPreferencesMigration.sharedPrefs$delegate.getValue()).edit();
                        LinkedHashSet linkedHashSet = sharedPreferencesMigration.keySet;
                        if (linkedHashSet == null) {
                            edit.clear();
                        } else {
                            Iterator it = linkedHashSet.iterator();
                            while (it.hasNext()) {
                                edit.remove((String) it.next());
                            }
                        }
                        if (!edit.commit()) {
                            a$$ExternalSyntheticBUOutline0.m$4("Unable to delete migrated keys from SharedPreferences.");
                            return null;
                        }
                        if (((SharedPreferences) sharedPreferencesMigration.sharedPrefs$delegate.getValue()).getAll().isEmpty() && (context = sharedPreferencesMigration.context) != null && (str = sharedPreferencesMigration.name) != null) {
                            SharedPreferencesMigration.Api24Impl.deleteSharedPreferences(context, str);
                        }
                        if (linkedHashSet != null) {
                            linkedHashSet.clear();
                        }
                        if (Unit.INSTANCE == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                    } else {
                        if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        Object invoke = ((DataStoreImpl$readDataOrHandleCorruption$3) obj2).invoke(this);
                        return invoke == coroutineSingletons9 ? coroutineSingletons9 : invoke;
                    }
                    if (i13 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 9:
                    FullscreenAdPresenter fullscreenAdPresenter = (FullscreenAdPresenter) obj2;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    AppMessageClientService appMessageClientService = fullscreenAdPresenter.service;
                    ReportAppMessageViewRequest reportAppMessageViewRequest = new ReportAppMessageViewRequest(fullscreenAdPresenter.args.token);
                    this.label = 1;
                    Object reportAppMessageView = appMessageClientService.reportAppMessageView(reportAppMessageViewRequest, this);
                    return reportAppMessageView == coroutineSingletons10 ? coroutineSingletons10 : reportAppMessageView;
                case 10:
                    LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj2;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    AppMessageClientService appMessageClientService2 = (AppMessageClientService) localCashBalancePresenter.store;
                    ReportAppMessageViewRequest reportAppMessageViewRequest2 = new ReportAppMessageViewRequest(((SheetAppMessage) localCashBalancePresenter.syncer).messageToken);
                    this.label = 1;
                    Object reportAppMessageView2 = appMessageClientService2.reportAppMessageView(reportAppMessageViewRequest2, this);
                    return reportAppMessageView2 == coroutineSingletons11 ? coroutineSingletons11 : reportAppMessageView2;
                case 11:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        Object invoke2 = ((VerifyAliasPresenter$verify$result$1) obj2).invoke(this);
                        return invoke2 == coroutineSingletons12 ? coroutineSingletons12 : invoke2;
                    }
                    if (i16 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 12:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        Object invoke3 = ((DataStoreImpl$readDataOrHandleCorruption$3) obj2).invoke(this);
                        return invoke3 == coroutineSingletons13 ? coroutineSingletons13 : invoke3;
                    }
                    if (i17 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 13:
                    RealBoostSyncer realBoostSyncer = (RealBoostSyncer) obj2;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RewardlyExternalAppService rewardlyExternalAppService = realBoostSyncer.service;
                        GetRewardsRequest getRewardsRequest = new GetRewardsRequest(ByteString.EMPTY);
                        this.label = 1;
                        rewardsDirect = rewardlyExternalAppService.getRewardsDirect(getRewardsRequest, this);
                        break;
                    } else {
                        if (i18 != 1) {
                            if (i18 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        rewardsDirect = obj;
                    }
                    ApiResult apiResult = (ApiResult) rewardsDirect;
                    if (apiResult instanceof ApiResult.Failure) {
                        Timber.Forest.e("Failed to update rewards.", new Object[0]);
                    } else {
                        if (!(apiResult instanceof ApiResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.d("Successfully updated rewards.", new Object[0]);
                        realBoostSyncer.lastUpdated = realBoostSyncer.clock.millis();
                        RewardsData rewardsData = ((GetRewardsResponse) ((ApiResult.Success) apiResult).response).rewards_data;
                        this.label = 2;
                        break;
                    }
                    return Unit.INSTANCE;
                case 14:
                    TagOrderConfirmationPresenter tagOrderConfirmationPresenter = (TagOrderConfirmationPresenter) obj2;
                    TagOrderConfirmationScreen tagOrderConfirmationScreen = tagOrderConfirmationPresenter.args;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        AppService appService = tagOrderConfirmationPresenter.appService;
                        ClientScenario clientScenario = tagOrderConfirmationScreen.blockersData.clientScenario;
                        clientScenario.getClass();
                        String str3 = tagOrderConfirmationScreen.blockersData.flowToken;
                        SubmitBlockerRequest.Request.Builder builder = new SubmitBlockerRequest.Request.Builder();
                        String str4 = tagOrderConfirmationScreen.blockersData.blockerId;
                        str4.getClass();
                        builder.blocker_descriptor_id = str4;
                        builder.request = new SubmitBlockerRequest$Request$Request$EndFlowRequest(new EndFlowRequest(tagOrderConfirmationScreen.blockersData.requestContext, (String) (objArr2 == true ? 1 : 0), 6));
                        SubmitBlockerRequest submitBlockerRequest = new SubmitBlockerRequest(null, CollectionsKt__CollectionsJVMKt.listOf(builder.build()), 11);
                        this.label = 1;
                        submitBlocker = appService.submitBlocker(clientScenario, str3, submitBlockerRequest, this);
                        if (submitBlocker == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    } else {
                        if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        submitBlocker = obj;
                    }
                    ApiResult apiResult2 = (ApiResult) submitBlocker;
                    if (apiResult2 instanceof ApiResult.Success) {
                        SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) ((ApiResult.Success) apiResult2).response;
                        ResponseContext mergeResponseContexts = ContextKt.mergeResponseContexts(submitBlockerResponse.app_response_context, submitBlockerResponse.blocker_response_context, submitBlockerResponse.flow_response_context);
                        return Matcher$$ExternalSyntheticOutline0.m(mergeResponseContexts, mergeResponseContexts);
                    }
                    if (apiResult2 instanceof ApiResult.Failure) {
                        return apiResult2;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                case 15:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealAppConfigManager$update$2$2 realAppConfigManager$update$2$2 = new RealAppConfigManager$update$2$2((HeatMaskRenderer) obj2, objArr3 == true ? 1 : 0, i4);
                        this.label = 1;
                        if (JobKt.coroutineScope(realAppConfigManager$update$2$2, this) == coroutineSingletons16) {
                            return coroutineSingletons16;
                        }
                    } else {
                        if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 16:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    RendererHolder rendererHolder = (RendererHolder) obj2;
                    if (rendererHolder != null) {
                        rendererHolder.dispose();
                    }
                    int i21 = this.label;
                    if (i21 != 0) {
                        GLES20.glDeleteProgram(i21);
                    }
                    return Unit.INSTANCE;
                case 17:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 != 0) {
                        if (i22 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealAfterpayAppletRepository realAfterpayAppletRepository = ((BackgroundRouter) obj2).afterpayAppletRepository;
                    this.label = 1;
                    Object refreshAfterpayApplet = realAfterpayAppletRepository.refreshAfterpayApplet(this);
                    return refreshAfterpayApplet == coroutineSingletons18 ? coroutineSingletons18 : refreshAfterpayApplet;
                case 18:
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.label;
                    if (i23 != 0) {
                        if (i23 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealOffersTabRepository realOffersTabRepository = ((OffersRouter) obj2).offersTabRepository;
                    this.label = 1;
                    Object refreshHome = realOffersTabRepository.refreshHome(null, this);
                    return refreshHome == coroutineSingletons19 ? coroutineSingletons19 : refreshHome;
                case 19:
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 != 0) {
                        if (i24 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealProfileSyncer realProfileSyncer = (RealProfileSyncer) obj2;
                    CoroutineContext coroutineContext = realProfileSyncer.ioDispatcher;
                    GooglePayPresenter$models$1$1 googlePayPresenter$models$1$1 = new GooglePayPresenter$models$1$1(realProfileSyncer, objArr4 == true ? 1 : 0, 5);
                    this.label = 1;
                    Object withContext3 = JobKt.withContext(coroutineContext, googlePayPresenter$models$1$1, this);
                    return withContext3 == coroutineSingletons20 ? coroutineSingletons20 : withContext3;
                case 20:
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 != 0) {
                        if (i25 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) obj2;
                    SemaphoreService semaphoreService = realFeatureFlagManager.semaphoreService;
                    String valueOf = String.valueOf(realFeatureFlagManager.sdkVersion);
                    GetFeatureFlagsRequest getFeatureFlagsRequest = new GetFeatureFlagsRequest(ByteString.EMPTY);
                    this.label = 1;
                    Object featureFlags = semaphoreService.getFeatureFlags(valueOf, getFeatureFlagsRequest, this);
                    return featureFlags == coroutineSingletons21 ? coroutineSingletons21 : featureFlags;
                case 21:
                    DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                    BlockersScreens.GooglePayCompleteProvisioningScreen googlePayCompleteProvisioningScreen = (BlockersScreens.GooglePayCompleteProvisioningScreen) disclosurePresenter.args;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 != 0) {
                        if (i26 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    GooglePayService googlePayService = (GooglePayService) disclosurePresenter.appService;
                    ClientScenario clientScenario2 = googlePayCompleteProvisioningScreen.blockersData.clientScenario;
                    clientScenario2.getClass();
                    String str5 = googlePayCompleteProvisioningScreen.blockersData.flowToken;
                    RequestContext requestContext = new RequestContext(null, null, null, null, null, null, null, null, 8191);
                    Trigger.Companion companion = DigitalWalletToken$Issuer.Companion;
                    CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest = new CompleteDigitalWalletTokenProvisioningRequest(requestContext, new DigitalWalletTokenProvisioningCompletionData(DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.SUCCESS));
                    this.label = 1;
                    Object completeDigitalWalletTokenProvisioning = googlePayService.completeDigitalWalletTokenProvisioning(clientScenario2, str5, completeDigitalWalletTokenProvisioningRequest, this);
                    return completeDigitalWalletTokenProvisioning == coroutineSingletons22 ? coroutineSingletons22 : completeDigitalWalletTokenProvisioning;
                case 22:
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.label;
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        EngineFrameScheduler$SceneGroup engineFrameScheduler$SceneGroup = (EngineFrameScheduler$SceneGroup) obj2;
                        ReadonlySharedFlow readonlySharedFlow = engineFrameScheduler$SceneGroup.scene.dirty;
                        InvestingHomeView$2$1 investingHomeView$2$1 = new InvestingHomeView$2$1(engineFrameScheduler$SceneGroup, i2);
                        this.label = 1;
                        if (readonlySharedFlow.$$delegate_0.collect(investingHomeView$2$1, this) == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    } else {
                        if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    return null;
                case 23:
                    MeshGeometry meshGeometry = (MeshGeometry) obj2;
                    String str6 = meshGeometry.meshName;
                    StateFlowImpl stateFlowImpl = meshGeometry._ready;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    try {
                        if (i28 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            if (meshGeometry.vboId != 0) {
                                Boolean bool = Boolean.TRUE;
                                stateFlowImpl.getClass();
                                stateFlowImpl.updateState(null, bool);
                                return Unit.INSTANCE;
                            }
                            DefaultScheduler defaultScheduler = Dispatchers.Default;
                            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                            RealProfileManager$profileOrNull$2 realProfileManager$profileOrNull$2 = new RealProfileManager$profileOrNull$2(meshGeometry, objArr5 == true ? 1 : 0, i3);
                            this.label = 1;
                            withContext = JobKt.withContext(defaultIoScheduler, realProfileManager$profileOrNull$2, this);
                            if (withContext == coroutineSingletons24) {
                                return coroutineSingletons24;
                            }
                        } else {
                            if (i28 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            withContext = obj;
                        }
                        MeshData meshData = (MeshData) withContext;
                        float[] fArr = meshData.vertexData;
                        int[] iArr = meshData.indexData;
                        meshGeometry.aabb = meshData.aabb;
                        meshGeometry.vertexStride = 14;
                        meshGeometry.indexCount = iArr.length;
                        meshGeometry.subMeshes = meshData.subMeshes;
                        int[] iArr2 = new int[1];
                        GLES20.glGenBuffers(1, iArr2, 0);
                        meshGeometry.vboId = iArr2[0];
                        FloatBuffer put = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
                        put.position(0);
                        GLES20.glBindBuffer(34962, meshGeometry.vboId);
                        GLES20.glBufferData(34962, fArr.length * 4, put, 35044);
                        GLES20.glBindBuffer(34962, 0);
                        int[] iArr3 = new int[1];
                        GLES20.glGenBuffers(1, iArr3, 0);
                        meshGeometry.iboId = iArr3[0];
                        IntBuffer put2 = ByteBuffer.allocateDirect(iArr.length * 4).order(ByteOrder.nativeOrder()).asIntBuffer().put(iArr);
                        put2.position(0);
                        GLES20.glBindBuffer(34963, meshGeometry.iboId);
                        GLES20.glBufferData(34963, iArr.length * 4, put2, 35044);
                        GLES20.glBindBuffer(34963, 0);
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("MeshGeometry");
                        forest.d(Recorder$$ExternalSyntheticOutline1.m("Loaded mesh '", iArr.length / 3, str6, "': ", " triangles"), new Object[0]);
                        Boolean bool2 = Boolean.TRUE;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, bool2);
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        Timber.Forest forest2 = Timber.Forest;
                        forest2.tag("MeshGeometry");
                        forest2.e(CameraSelector$$ExternalSyntheticOutline0.m("Failed to load mesh '", str6, "': ", e2.getMessage()), new Object[0], e2);
                        e2.getMessage();
                        return Unit.INSTANCE;
                    }
                case 24:
                    IblComponent iblComponent = (IblComponent) obj2;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = this.label;
                    if (i29 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Context context2 = iblComponent.context;
                        this.label = 1;
                        AssetManager assets = context2.getAssets();
                        assets.getClass();
                        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                        withContext2 = JobKt.withContext(DefaultIoScheduler.INSTANCE, new CheckStatusPresenter.AnonymousClass1.C00611("envs/abandoned_hall", assets, continuation, i3), this);
                        if (withContext2 == coroutineSingletons25) {
                            return coroutineSingletons25;
                        }
                    } else {
                        if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        withContext2 = obj;
                    }
                    IblAssetData iblAssetData = (IblAssetData) withContext2;
                    if (iblAssetData != null) {
                        iblComponent.currentAsset = iblAssetData;
                        StateFlowImpl stateFlowImpl2 = iblComponent._ready;
                        Boolean bool3 = Boolean.TRUE;
                        stateFlowImpl2.getClass();
                        stateFlowImpl2.updateState(null, bool3);
                        iblComponent._dirty.tryEmit(Unit.INSTANCE);
                    } else {
                        Timber.Forest forest3 = Timber.Forest;
                        forest3.tag("IblComponent");
                        forest3.e("Failed to load IBL asset: abandoned_hall", new Object[0]);
                    }
                    return Unit.INSTANCE;
                case 25:
                    RealInvestingSyncer realInvestingSyncer = (RealInvestingSyncer) obj2;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = this.label;
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        InvestingService investingService = realInvestingSyncer.investingService;
                        GetCustomerInvestmentSettingsRequest getCustomerInvestmentSettingsRequest = new GetCustomerInvestmentSettingsRequest(null, ByteString.EMPTY);
                        this.label = 1;
                        customerInvestmentSettings = investingService.getCustomerInvestmentSettings(getCustomerInvestmentSettingsRequest, this);
                        if (customerInvestmentSettings == coroutineSingletons26) {
                            return coroutineSingletons26;
                        }
                    } else {
                        if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        customerInvestmentSettings = obj;
                    }
                    ApiResult apiResult3 = (ApiResult) customerInvestmentSettings;
                    if (apiResult3 instanceof ApiResult.Success) {
                        realInvestingSyncer.settingsQueries.transactionWithWrapper(new GLSceneScope$$ExternalSyntheticLambda10(19, realInvestingSyncer, (GetCustomerInvestmentSettingsResponse) ((ApiResult.Success) apiResult3).response));
                    }
                    return Unit.INSTANCE;
                case 26:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = this.label;
                    if (i31 != 0) {
                        if (i31 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    AppletsService appletsService = ((RealAppletTileServerRecommendationProvider) obj2).appletsService;
                    GetMoneyTabAppletsRequest getMoneyTabAppletsRequest = new GetMoneyTabAppletsRequest(ByteString.EMPTY);
                    this.label = 1;
                    Object moneyTabApplets = appletsService.getMoneyTabApplets(getMoneyTabAppletsRequest, this);
                    return moneyTabApplets == coroutineSingletons27 ? coroutineSingletons27 : moneyTabApplets;
                case 27:
                    BugsnagClientSandboxSetupTeardown bugsnagClientSandboxSetupTeardown = (BugsnagClientSandboxSetupTeardown) obj2;
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = this.label;
                    if (i32 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowQuery$mapToList$$inlined$map$1 region = ((RealProfileManager) bugsnagClientSandboxSetupTeardown.profileManager.getValue()).region();
                        OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$1 = new OffersDetailsPresenterV2$models$1$1$1(bugsnagClientSandboxSetupTeardown, 25);
                        this.label = 1;
                        Object collect = region.collect(new MoneyTabPresenter$models$lambda$17$$inlined$map$1.AnonymousClass2(offersDetailsPresenterV2$models$1$1$1, 24), this);
                        if (collect != coroutineSingletons28) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons28) {
                            return coroutineSingletons28;
                        }
                    } else {
                        if (i32 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 28:
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = this.label;
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow = ((RealChatSurveyService) obj2).signOut;
                        this.label = 1;
                        if (FlowKt.first(flow, this) == coroutineSingletons29) {
                            return coroutineSingletons29;
                        }
                    } else {
                        if (i33 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i34 = this.label;
                    if (i34 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        invoke$default = GetOrFetchSync.invoke$default((GetOrFetchSync) obj2, null, this, 3);
                        if (invoke$default == coroutineSingletons30) {
                            return coroutineSingletons30;
                        }
                    } else {
                        if (i34 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        invoke$default = obj;
                    }
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest = ((SynchronizeSessionResponse) invoke$default).manifest;
                    financialConnectionsSessionManifest.getClass();
                    Map map = financialConnectionsSessionManifest.features;
                    return Boolean.valueOf(map != null ? Intrinsics.areEqual(map.get("bank_connections_android_enable_work_manager"), Boolean.TRUE) : false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Continuation continuation, int i) {
            super(1, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }
}
