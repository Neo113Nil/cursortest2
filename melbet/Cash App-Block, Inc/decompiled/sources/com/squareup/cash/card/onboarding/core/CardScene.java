package com.squareup.cash.card.onboarding.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.opengl.GLES30;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.glance.session.SessionWorker$doWork$2$1;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.paging.Pager$pageFetcher$2;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.RequestQueue;
import com.datadog.android.rum.internal.utils.WriteOperation;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahe;
import com.google.mlkit.vision.text.internal.zzr;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.card.onboarding.CardContouredText;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardStudioViewKt$ThemedCard$1$4$1;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.card.onboarding.core.HeatMaskRenderer;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.graphics.swampgl.components.SharedBufferGeometry;
import com.squareup.cash.graphics.swampgl.components.Transform;
import com.squareup.cash.graphics.swampgl.components.ibl.IblComponent;
import com.squareup.protos.franklin.cards.CardTheme;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class CardScene extends Scene {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final StateFlowImpl _copyPanTextureReady;
    public boolean activeSlotIsA;
    public final CardAssetManager assetManager;
    public CardGeometry cardGeometry;
    public final Context context;
    public WriteOperation contouredTextOverlay;
    public CardAssetManager$AssetKey$CopyPan copyPanAssetKey;
    public SharedBufferGeometry copyPanGeometry;
    public JWECryptoParts copyPanPool;
    public int copyPanTextureId;
    public float crossfadeProgress;
    public Bitmap currentIconBitmap;
    public float currentIndicatorRadius;
    public final Engine engine;
    public final HeatMaskRenderer.Config heatMaskConfig;
    public HeatMaskRenderer heatMaskRenderer;
    public Job heatRenderLoopJob;
    public final Lazy initialHeatBitmap$delegate;
    public boolean isMoodCard;
    public boolean isTransitioning;
    public CardTheme.Identifier loadedCardId;
    public Entity slotAEntity;
    public CardMaterial slotAMaterial;
    public final Transform slotATransform;
    public Entity slotBEntity;
    public CardMaterial slotBMaterial;
    public final Transform slotBTransform;

    static {
        new Quat(0.055956185f, 0.084961325f, -0.083761916f, 0.9912797f).times(new Quat((float) Math.toRadians(-90.0d), new float[]{1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE}));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardScene(Context context, Engine engine) {
        super(engine);
        HeatMaskRenderer.Config config = new HeatMaskRenderer.Config();
        context.getClass();
        engine.getClass();
        this.context = context;
        this.engine = engine;
        this.heatMaskConfig = config;
        this.assetManager = new CardAssetManager(context, engine);
        this.camera.setPosition(new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f));
        this.camera.setTarget(new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
        this.camera.setUp(new Vector3(RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE));
        this.camera.setFov(45.0f);
        this.camera.setFovIsHorizontal(true);
        this.camera.setNear(0.1f);
        this.camera.setFar(20.0f);
        IblComponent iblComponent = new IblComponent(context, engine);
        iblComponent.setIntensity(1.28f);
        setIblData(iblComponent);
        this.slotATransform = new Transform();
        this.slotBTransform = new Transform();
        this.activeSlotIsA = true;
        this.currentIndicatorRadius = 0.4f;
        this._copyPanTextureReady = FlowKt.MutableStateFlow(Boolean.FALSE);
        this.initialHeatBitmap$delegate = LazyKt.lazy(new CardScene$$ExternalSyntheticLambda0(this, 1));
    }

    public final void addHeat(float f, float f2, float f3) {
        zzr zzrVar;
        HeatMaskRenderer heatMaskRenderer;
        HeatMaskRenderer heatMaskRenderer2 = this.heatMaskRenderer;
        if (heatMaskRenderer2 != null && this.heatRenderLoopJob == null) {
            this.heatRenderLoopJob = this.glLauncher.launch(new Scene.AnonymousClass1(heatMaskRenderer2, (Continuation) null, 15));
        }
        boolean z = this.activeSlotIsA;
        CardMaterial cardMaterial = z ? this.slotAMaterial : this.slotBMaterial;
        CardMaterial cardMaterial2 = z ? this.slotBMaterial : this.slotAMaterial;
        if (this.isTransitioning && this.crossfadeProgress > 0.5f) {
            cardMaterial = cardMaterial2;
        }
        if (cardMaterial == null || (zzrVar = cardMaterial.heatMaskProvider) == null || (heatMaskRenderer = ((CardScene) zzrVar.zza).heatMaskRenderer) == null) {
            return;
        }
        long nanoTime = System.nanoTime();
        if (nanoTime - heatMaskRenderer.lastAddTimeNanos < heatMaskRenderer.minAddIntervalNanos) {
            return;
        }
        heatMaskRenderer.lastAddTimeNanos = nanoTime;
        synchronized (heatMaskRenderer.pendingHeatPoints) {
            heatMaskRenderer.pendingHeatPoints.add(new HeatMaskRenderer.HeatPoint(f, f2, f3));
            heatMaskRenderer.hasHeat = true;
        }
    }

    public final void addHeatFromTouch(float f, float f2, float f3, float f4, float f5) {
        Entity cardEntity$views;
        Pair pair;
        if (!this.isMoodCard || (cardEntity$views = getCardEntity$views()) == null || (pair = zzahe.touchToTextureUV(this.camera, f, f2, f3, f4, cardEntity$views)) == null) {
            return;
        }
        addHeat(((Number) pair.first).floatValue(), ((Number) pair.second).floatValue(), f5);
    }

    public final void completeTransition() {
        if (this.isTransitioning) {
            boolean z = this.activeSlotIsA;
            this.activeSlotIsA = !z;
            CardMaterial cardMaterial = !z ? this.slotAMaterial : this.slotBMaterial;
            if (cardMaterial != null) {
                cardMaterial.crossfadeMultiplier = 1.0f;
            }
            CardMaterial cardMaterial2 = !z ? this.slotBMaterial : this.slotAMaterial;
            if (cardMaterial2 != null) {
                cardMaterial2.crossfadeMultiplier = RecyclerView.DECELERATION_RATE;
            }
            this.isTransitioning = false;
            this.crossfadeProgress = RecyclerView.DECELERATION_RATE;
            this.disableDepthTest = false;
            markDirty();
        }
    }

    public final void configureCamera(float f, float f2) {
        RequestQueue requestQueue = this.camera;
        requestQueue.setFov(f);
        requestQueue.setPosition(new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f2));
    }

    public final Transform currentCardTransform() {
        boolean z = this.activeSlotIsA;
        Transform transform = this.slotBTransform;
        Transform transform2 = this.slotATransform;
        Transform transform3 = z ? transform2 : transform;
        if (!z) {
            transform = transform2;
        }
        return (!this.isTransitioning || this.crossfadeProgress <= 0.5f) ? transform3 : transform;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Scene
    public final void dispose() {
        int i;
        super.dispose();
        JWECryptoParts jWECryptoParts = this.copyPanPool;
        if (jWECryptoParts != null) {
            ArrayList arrayList = (ArrayList) jWECryptoParts.cipherText;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((CopyPanMaterial) ((Pair) it.next()).second).getClass();
            }
            arrayList.clear();
            jWECryptoParts.authenticationTag = EmptyList.INSTANCE;
        }
        Continuation continuation = null;
        this.copyPanPool = null;
        CardAssetManager$AssetKey$CopyPan cardAssetManager$AssetKey$CopyPan = this.copyPanAssetKey;
        int i2 = 0;
        if (cardAssetManager$AssetKey$CopyPan != null) {
            this.engine.launch(new CardScene$dispose$1$1(this, cardAssetManager$AssetKey$CopyPan, continuation, i2));
        }
        this.copyPanAssetKey = null;
        this.copyPanTextureId = 0;
        SharedBufferGeometry sharedBufferGeometry = this.copyPanGeometry;
        if (sharedBufferGeometry != null && (i = sharedBufferGeometry.vaoId) != 0) {
            if (i != 0) {
                GLES30.glDeleteVertexArrays(1, new int[]{i}, 0);
            }
            sharedBufferGeometry.vaoId = 0;
        }
        this.copyPanGeometry = null;
        WriteOperation writeOperation = this.contouredTextOverlay;
        if (writeOperation != null) {
            ContouredMarquee contouredMarquee = (ContouredMarquee) writeOperation.eventSource;
            Job job = contouredMarquee.marqueeJob;
            if (job != null) {
                job.cancel(null);
            }
            contouredMarquee.marqueeJob = null;
            Job job2 = contouredMarquee.decelerationJob;
            if (job2 != null) {
                job2.cancel(null);
            }
            contouredMarquee.decelerationJob = null;
            ((ContouredTextMaterial) writeOperation.onSuccess).getClass();
            CardAssetManager$AssetKey$ContouredText cardAssetManager$AssetKey$ContouredText = (CardAssetManager$AssetKey$ContouredText) writeOperation.rumDataWriter;
            if (cardAssetManager$AssetKey$ContouredText != null) {
                ((Engine) writeOperation.sdkCore).launch(new ContouredTextOverlay$dispose$1$1(writeOperation, cardAssetManager$AssetKey$ContouredText, continuation, i2));
            }
            writeOperation.rumDataWriter = null;
            writeOperation.eventType = 0;
            ((CardGeometry) writeOperation.onError).dispose();
        }
        this.contouredTextOverlay = null;
        CardGeometry cardGeometry = this.cardGeometry;
        if (cardGeometry != null) {
            cardGeometry.dispose();
        }
        this.cardGeometry = null;
        CardMaterial cardMaterial = this.slotAMaterial;
        if (cardMaterial != null) {
            cardMaterial.dispose();
        }
        this.slotAMaterial = null;
        CardMaterial cardMaterial2 = this.slotBMaterial;
        if (cardMaterial2 != null) {
            cardMaterial2.dispose();
        }
        this.slotBMaterial = null;
        this.slotAEntity = null;
        this.slotBEntity = null;
        this.loadedCardId = null;
        HeatMaskRenderer heatMaskRenderer = this.heatMaskRenderer;
        if (heatMaskRenderer != null) {
            Job job3 = this.heatRenderLoopJob;
            if (job3 != null) {
                job3.cancel(null);
            }
            this.heatRenderLoopJob = null;
            this.glLauncher.launch(new CardScene$disposeHeatMask$1(heatMaskRenderer, continuation, i2));
            this.heatMaskRenderer = null;
        }
        CardAssetManager cardAssetManager = this.assetManager;
        cardAssetManager.core.launch(new Pager$pageFetcher$2(cardAssetManager, continuation, 4));
        IblComponent iblComponent = this._iblData;
        if (iblComponent != null) {
            iblComponent.release();
        }
    }

    public final Object ensureHeatMaskRendererInitialized(boolean z, ContinuationImpl continuationImpl) {
        this.isMoodCard = z;
        GLLauncher gLLauncher = this.glLauncher;
        Continuation continuation = null;
        if (!z) {
            Job job = this.heatRenderLoopJob;
            if (job != null) {
                job.cancel(null);
            }
            this.heatRenderLoopJob = null;
            HeatMaskRenderer heatMaskRenderer = this.heatMaskRenderer;
            if (heatMaskRenderer != null) {
                gLLauncher.launch(new CardScene$disposeHeatMask$1(heatMaskRenderer, continuation, 1));
            }
            return Unit.INSTANCE;
        }
        HeatMaskRenderer heatMaskRenderer2 = this.heatMaskRenderer;
        if (heatMaskRenderer2 == null) {
            Bitmap bitmap = (Bitmap) this.initialHeatBitmap$delegate.getValue();
            int i = 0;
            HeatMaskRenderer heatMaskRenderer3 = new HeatMaskRenderer(bitmap, new CardScene$$ExternalSyntheticLambda0(this, i), new CardScene$$ExternalSyntheticLambda1(i), this.heatMaskConfig);
            gLLauncher.launch(new SessionWorker$doWork$2$1(heatMaskRenderer3, bitmap, continuation, 5));
            this.heatMaskRenderer = heatMaskRenderer3;
            heatMaskRenderer2 = heatMaskRenderer3;
        }
        Object first = FlowKt.first(heatMaskRenderer2.ready, new SessionWorkerKt$runSession$5(2, continuation, 3), continuationImpl);
        return first == CoroutineSingletons.COROUTINE_SUSPENDED ? first : Unit.INSTANCE;
    }

    public final Entity getCardEntity$views() {
        boolean z = this.activeSlotIsA;
        return (!this.isTransitioning || this.crossfadeProgress <= 0.5f) ? z ? this.slotAEntity : this.slotBEntity : z ? this.slotBEntity : this.slotAEntity;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object prepareTransition(CardModelView.ViewModel viewModel, ContinuationImpl continuationImpl) {
        CardScene$prepareTransition$1 cardScene$prepareTransition$1;
        Object obj;
        int i;
        EquatableBitmap equatableBitmap;
        boolean z;
        CardMaterial cardMaterial;
        IblComponent iblComponent;
        boolean z2;
        CardModelView.ViewModel viewModel2;
        Transform transform;
        CardMaterial cardMaterial2;
        CardMaterial cardMaterial3;
        CardModelView.ViewModel viewModel3;
        CardGeometry cardGeometry;
        CardModelView.ViewModel viewModel4 = viewModel;
        if (continuationImpl instanceof CardScene$prepareTransition$1) {
            cardScene$prepareTransition$1 = (CardScene$prepareTransition$1) continuationImpl;
            int i2 = cardScene$prepareTransition$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cardScene$prepareTransition$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = cardScene$prepareTransition$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardScene$prepareTransition$1.label;
                GLLauncher gLLauncher = this.glLauncher;
                Continuation continuation = null;
                int i3 = 2;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (this.isTransitioning) {
                        completeTransition();
                    }
                    CardGeometry cardGeometry2 = this.cardGeometry;
                    Engine engine = this.engine;
                    Context context = this.context;
                    if (cardGeometry2 == null) {
                        CardGeometry cardGeometry3 = new CardGeometry(context, engine);
                        this.cardGeometry = cardGeometry3;
                        gLLauncher.launch(new PagingDataPresenter$collectFrom$2(cardGeometry3, this, continuation, 29));
                    }
                    WriteOperation writeOperation = this.contouredTextOverlay;
                    if (writeOperation == null) {
                        writeOperation = new WriteOperation(context, engine, this.assetManager);
                        this.contouredTextOverlay = writeOperation;
                        addEntity((Entity) writeOperation.advancedRumMonitor);
                    }
                    CardContouredText cardContouredText = viewModel4.contouredText;
                    boolean z3 = viewModel4.isCardLocked;
                    cardScene$prepareTransition$1.L$0 = viewModel4;
                    cardScene$prepareTransition$1.L$1 = null;
                    cardScene$prepareTransition$1.label = 1;
                    if (writeOperation.update(cardContouredText, z3, cardScene$prepareTransition$1) != obj) {
                        equatableBitmap = null;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        transform = cardScene$prepareTransition$1.L$3;
                        equatableBitmap = cardScene$prepareTransition$1.L$1;
                        CardModelView.ViewModel viewModel5 = cardScene$prepareTransition$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        viewModel2 = viewModel5;
                        cardMaterial2 = new CardMaterial(viewModel2, this.assetManager, this.engine, equatableBitmap, new zzr(this, 18));
                        cardMaterial2.crossfadeMultiplier = RecyclerView.DECELERATION_RATE;
                        try {
                            ReadonlyStateFlow readonlyStateFlow = cardMaterial2.ready;
                            SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(i3, continuation, 4);
                            cardScene$prepareTransition$1.L$0 = viewModel2;
                            cardScene$prepareTransition$1.L$1 = null;
                            cardScene$prepareTransition$1.L$3 = transform;
                            cardScene$prepareTransition$1.L$6 = cardMaterial2;
                            cardScene$prepareTransition$1.label = 3;
                            obj2 = FlowKt.first(readonlyStateFlow, sessionWorkerKt$runSession$5, cardScene$prepareTransition$1);
                            if (obj2 != obj) {
                                cardMaterial3 = cardMaterial2;
                                viewModel3 = viewModel2;
                                ((Boolean) obj2).getClass();
                                cardGeometry = this.cardGeometry;
                                if (cardGeometry != null) {
                                }
                                this.disableDepthTest = true;
                                this.isTransitioning = true;
                                this.crossfadeProgress = RecyclerView.DECELERATION_RATE;
                                return Unit.INSTANCE;
                            }
                            return obj;
                        } catch (CancellationException e) {
                            e = e;
                            cardMaterial3 = cardMaterial2;
                            cardMaterial3.dispose();
                            throw e;
                        }
                    }
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cardMaterial3 = cardScene$prepareTransition$1.L$6;
                    transform = cardScene$prepareTransition$1.L$3;
                    viewModel3 = cardScene$prepareTransition$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj2);
                    } catch (CancellationException e2) {
                        e = e2;
                        cardMaterial3.dispose();
                        throw e;
                    }
                    try {
                        ((Boolean) obj2).getClass();
                        cardGeometry = this.cardGeometry;
                        if (cardGeometry != null) {
                            boolean z4 = this.activeSlotIsA;
                            String str = z4 ? "card_slot_b" : "card_slot_a";
                            Entity entity = z4 ? this.slotBEntity : this.slotAEntity;
                            if (entity != null) {
                                removeEntity(entity.id);
                            }
                            Entity entity2 = new Entity(str, cardGeometry, cardMaterial3, transform);
                            entity2.setNeedsDoubleSidedRendering(CollectionsKt.contains(CollectionsKt__CollectionsKt.listOf((Object[]) new CardTheme.Identifier[]{CardTheme.Identifier.HOLO_ID, CardTheme.Identifier.GLITTER_ID, CardTheme.Identifier.TORTOISE_ID}), viewModel3.id));
                            if (this.activeSlotIsA) {
                                this.slotBMaterial = cardMaterial3;
                                this.slotBEntity = entity2;
                            } else {
                                this.slotAMaterial = cardMaterial3;
                                this.slotAEntity = entity2;
                            }
                            Bitmap bitmap = this.currentIconBitmap;
                            if (bitmap != null) {
                                gLLauncher.launch(new CardScene$applyIconToMaterial$1(cardMaterial3, bitmap, this, continuation, 0));
                            }
                            addEntity(entity2);
                            Entity entity3 = this.activeSlotIsA ? this.slotAEntity : this.slotBEntity;
                            if (entity3 != null) {
                                removeEntity(entity3.id);
                                addEntity(entity3);
                            }
                        }
                        this.disableDepthTest = true;
                        this.isTransitioning = true;
                        this.crossfadeProgress = RecyclerView.DECELERATION_RATE;
                        return Unit.INSTANCE;
                    } catch (CancellationException e3) {
                        e = e3;
                        cardMaterial3.dispose();
                        throw e;
                    }
                }
                EquatableBitmap equatableBitmap2 = cardScene$prepareTransition$1.L$1;
                CardModelView.ViewModel viewModel6 = cardScene$prepareTransition$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                equatableBitmap = equatableBitmap2;
                viewModel4 = viewModel6;
                z = this.activeSlotIsA;
                Transform transform2 = this.slotATransform;
                Transform transform3 = this.slotBTransform;
                Transform transform4 = !z ? transform3 : transform2;
                if (!z) {
                    transform2 = transform3;
                }
                transform4.setPosition((Vector3) transform2._position.getValue());
                transform4.setRotation((Quat) transform2._rotation.getValue());
                transform4.setScale(transform2.getScale());
                cardMaterial = !this.activeSlotIsA ? this.slotBMaterial : this.slotAMaterial;
                if (cardMaterial != null) {
                    cardMaterial.dispose();
                }
                iblComponent = this._iblData;
                if (iblComponent != null) {
                    iblComponent.setIntensity(viewModel4.indirectLightIntensity / 25000.0f);
                }
                z2 = viewModel4.backgroundImage != CardTheme.BackgroundImage.MOOD;
                cardScene$prepareTransition$1.L$0 = viewModel4;
                cardScene$prepareTransition$1.L$1 = equatableBitmap;
                cardScene$prepareTransition$1.L$3 = transform4;
                cardScene$prepareTransition$1.label = 2;
                if (ensureHeatMaskRendererInitialized(z2, cardScene$prepareTransition$1) != obj) {
                    viewModel2 = viewModel4;
                    transform = transform4;
                    cardMaterial2 = new CardMaterial(viewModel2, this.assetManager, this.engine, equatableBitmap, new zzr(this, 18));
                    cardMaterial2.crossfadeMultiplier = RecyclerView.DECELERATION_RATE;
                    ReadonlyStateFlow readonlyStateFlow2 = cardMaterial2.ready;
                    SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$52 = new SessionWorkerKt$runSession$5(i3, continuation, 4);
                    cardScene$prepareTransition$1.L$0 = viewModel2;
                    cardScene$prepareTransition$1.L$1 = null;
                    cardScene$prepareTransition$1.L$3 = transform;
                    cardScene$prepareTransition$1.L$6 = cardMaterial2;
                    cardScene$prepareTransition$1.label = 3;
                    obj2 = FlowKt.first(readonlyStateFlow2, sessionWorkerKt$runSession$52, cardScene$prepareTransition$1);
                    if (obj2 != obj) {
                    }
                }
                return obj;
            }
        }
        cardScene$prepareTransition$1 = new CardScene$prepareTransition$1(this, continuationImpl);
        Object obj22 = cardScene$prepareTransition$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardScene$prepareTransition$1.label;
        GLLauncher gLLauncher2 = this.glLauncher;
        Continuation continuation2 = null;
        int i32 = 2;
        if (i != 0) {
        }
        z = this.activeSlotIsA;
        Transform transform22 = this.slotATransform;
        Transform transform32 = this.slotBTransform;
        if (!z) {
        }
        if (!z) {
        }
        transform4.setPosition((Vector3) transform22._position.getValue());
        transform4.setRotation((Quat) transform22._rotation.getValue());
        transform4.setScale(transform22.getScale());
        if (!this.activeSlotIsA) {
        }
        if (cardMaterial != null) {
        }
        iblComponent = this._iblData;
        if (iblComponent != null) {
        }
        if (viewModel4.backgroundImage != CardTheme.BackgroundImage.MOOD) {
        }
        cardScene$prepareTransition$1.L$0 = viewModel4;
        cardScene$prepareTransition$1.L$1 = equatableBitmap;
        cardScene$prepareTransition$1.L$3 = transform4;
        cardScene$prepareTransition$1.label = 2;
        if (ensureHeatMaskRendererInitialized(z2, cardScene$prepareTransition$1) != obj) {
        }
        return obj;
    }

    public final void setChildrenLocal(List list) {
        SharedBufferGeometry sharedBufferGeometry;
        int i;
        list.getClass();
        SharedBufferGeometry sharedBufferGeometry2 = this.copyPanGeometry;
        if (sharedBufferGeometry2 != null) {
            sharedBufferGeometry = sharedBufferGeometry2;
        } else {
            CardGeometry cardGeometry = this.cardGeometry;
            if (cardGeometry == null) {
                sharedBufferGeometry = null;
            } else {
                SharedBufferGeometry sharedBufferGeometry3 = new SharedBufferGeometry(cardGeometry);
                this.copyPanGeometry = sharedBufferGeometry3;
                sharedBufferGeometry = sharedBufferGeometry3;
            }
        }
        if (sharedBufferGeometry != null && (i = this.copyPanTextureId) > 0) {
            JWECryptoParts jWECryptoParts = this.copyPanPool;
            if (jWECryptoParts == null) {
                int i2 = 0;
                CardStudioViewKt$ThemedCard$1$4$1 cardStudioViewKt$ThemedCard$1$4$1 = new CardStudioViewKt$ThemedCard$1$4$1(1, this, CardScene.class, "addEntity", "addEntity(Lcom/squareup/cash/graphics/swampgl/components/Entity;)V", i2, 27);
                WandScene$ring$3 wandScene$ring$3 = new WandScene$ring$3(0, this, CardScene.class, "markDirty", "markDirty()V", i2, 15);
                JWECryptoParts jWECryptoParts2 = new JWECryptoParts();
                jWECryptoParts2.header = sharedBufferGeometry;
                jWECryptoParts2.encryptedKey = cardStudioViewKt$ThemedCard$1$4$1;
                jWECryptoParts2.iv = wandScene$ring$3;
                jWECryptoParts2.cipherText = new ArrayList();
                jWECryptoParts2.authenticationTag = EmptyList.INSTANCE;
                this.copyPanPool = jWECryptoParts2;
                jWECryptoParts = jWECryptoParts2;
            }
            Transform currentCardTransform = currentCardTransform();
            ArrayList arrayList = (ArrayList) jWECryptoParts.cipherText;
            currentCardTransform.getClass();
            if (i <= 0) {
                return;
            }
            while (list.size() > arrayList.size()) {
                int size = arrayList.size();
                CopyPanMaterial copyPanMaterial = new CopyPanMaterial();
                Entity entity = new Entity(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(size, "copy_pan_"), (SharedBufferGeometry) jWECryptoParts.header, copyPanMaterial, new Transform());
                entity.setNeedsDoubleSidedRendering(false);
                entity.depthWrite = false;
                entity.setVisible(false);
                arrayList.add(new Pair(entity, copyPanMaterial));
                ((CardStudioViewKt$ThemedCard$1$4$1) jWECryptoParts.encryptedKey).invoke(entity);
            }
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                CardModelView.PanEntity panEntity = (CardModelView.PanEntity) obj;
                Pair pair = (Pair) arrayList.get(i3);
                Entity entity2 = (Entity) pair.first;
                CopyPanMaterial copyPanMaterial2 = (CopyPanMaterial) pair.second;
                copyPanMaterial2.textureId = i;
                SharedFlowImpl sharedFlowImpl = copyPanMaterial2._dirty;
                Unit unit = Unit.INSTANCE;
                sharedFlowImpl.tryEmit(unit);
                copyPanMaterial2.panOpacity = panEntity.opacity;
                sharedFlowImpl.tryEmit(unit);
                entity2.setVisible(panEntity.opacity > 0.001f);
                i3 = i4;
            }
            int size2 = arrayList.size();
            for (int size3 = list.size(); size3 < size2; size3++) {
                ((Entity) ((Pair) arrayList.get(size3)).first).setVisible(false);
            }
            jWECryptoParts.authenticationTag = list;
            jWECryptoParts.repositionEntities(currentCardTransform);
            ((WandScene$ring$3) jWECryptoParts.iv).invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateCard(CardModelView.ViewModel viewModel, Quat quat, Vector4 vector4, EquatableBitmap equatableBitmap, ContinuationImpl continuationImpl) {
        CardScene$updateCard$1 cardScene$updateCard$1;
        Object obj;
        int i;
        int i2;
        Quat quat2;
        Vector4 vector42;
        CardModelView.ViewModel viewModel2;
        EquatableBitmap equatableBitmap2;
        WriteOperation writeOperation;
        CardContouredText cardContouredText;
        char c;
        boolean z;
        Vector4 vector43;
        EquatableBitmap equatableBitmap3;
        WriteOperation writeOperation2;
        CardModelView.ViewModel viewModel3;
        Quat quat3;
        JWECryptoParts jWECryptoParts;
        WriteOperation writeOperation3;
        IblComponent iblComponent;
        boolean z2;
        WriteOperation writeOperation4;
        boolean z3;
        EquatableBitmap equatableBitmap4;
        CardModelView.ViewModel viewModel4;
        Transform transform;
        CardMaterial cardMaterial;
        Object join;
        WriteOperation writeOperation5;
        CardModelView.ViewModel viewModel5;
        CardModelView.ViewModel viewModel6;
        CardMaterial cardMaterial2;
        CardGeometry cardGeometry;
        Entity entity;
        if (continuationImpl instanceof CardScene$updateCard$1) {
            cardScene$updateCard$1 = (CardScene$updateCard$1) continuationImpl;
            int i3 = cardScene$updateCard$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                cardScene$updateCard$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = cardScene$updateCard$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardScene$updateCard$1.label;
                GLLauncher gLLauncher = this.glLauncher;
                Engine engine = this.engine;
                Context context = this.context;
                int i4 = 2;
                Continuation continuation = null;
                if (i != 0) {
                    i2 = 0;
                    SafeTrace.throwOnFailure(obj2);
                    if (this.isTransitioning) {
                        completeTransition();
                    }
                    cardScene$updateCard$1.L$0 = viewModel;
                    quat2 = quat;
                    cardScene$updateCard$1.L$1 = quat2;
                    vector42 = vector4;
                    cardScene$updateCard$1.L$2 = vector42;
                    cardScene$updateCard$1.L$3 = equatableBitmap;
                    cardScene$updateCard$1.label = 1;
                    if (updateCopyPanTexture(viewModel, cardScene$updateCard$1) != obj) {
                        viewModel2 = viewModel;
                        equatableBitmap2 = equatableBitmap;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        writeOperation2 = cardScene$updateCard$1.L$4;
                        equatableBitmap3 = cardScene$updateCard$1.L$3;
                        i2 = 0;
                        vector43 = cardScene$updateCard$1.L$2;
                        quat3 = cardScene$updateCard$1.L$1;
                        viewModel3 = cardScene$updateCard$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        c = 1;
                        if (this.cardGeometry == null) {
                            CardGeometry cardGeometry2 = new CardGeometry(context, engine);
                            this.cardGeometry = cardGeometry2;
                            gLLauncher.launch(new PagingDataPresenter$collectFrom$2(cardGeometry2, this, continuation, 29));
                        }
                        Transform transform2 = !this.activeSlotIsA ? this.slotATransform : this.slotBTransform;
                        float[] fArr = vector43.vector;
                        transform2.setPosition(new Vector3(fArr[i2], fArr[c], fArr[2]));
                        transform2.setRotation(new Quat(quat3.x, quat3.y, quat3.z, quat3.w));
                        jWECryptoParts = this.copyPanPool;
                        if (jWECryptoParts != null) {
                            jWECryptoParts.repositionEntities(currentCardTransform());
                        }
                        writeOperation3 = this.contouredTextOverlay;
                        if (writeOperation3 != null) {
                            writeOperation3.updateTransform(currentCardTransform());
                        }
                        iblComponent = this._iblData;
                        if (iblComponent != null) {
                            iblComponent.setIntensity(viewModel3.indirectLightIntensity / 25000.0f);
                        }
                        boolean contains = CollectionsKt.contains(CollectionsKt__CollectionsKt.listOf((Object[]) new CardTheme.Identifier[]{CardTheme.Identifier.HOLO_ID, CardTheme.Identifier.GLITTER_ID, CardTheme.Identifier.TORTOISE_ID}), viewModel3.id);
                        z2 = viewModel3.backgroundImage != CardTheme.BackgroundImage.MOOD ? c : i2;
                        cardScene$updateCard$1.L$0 = viewModel3;
                        cardScene$updateCard$1.L$1 = null;
                        cardScene$updateCard$1.L$2 = null;
                        cardScene$updateCard$1.L$3 = equatableBitmap3;
                        cardScene$updateCard$1.L$4 = writeOperation2;
                        cardScene$updateCard$1.L$5 = transform2;
                        cardScene$updateCard$1.Z$0 = contains;
                        cardScene$updateCard$1.label = 3;
                        if (ensureHeatMaskRendererInitialized(z2, cardScene$updateCard$1) != obj) {
                            writeOperation4 = writeOperation2;
                            z3 = contains;
                            equatableBitmap4 = equatableBitmap3;
                            viewModel4 = viewModel3;
                            transform = transform2;
                            if (!this.activeSlotIsA) {
                            }
                            if (cardMaterial != null) {
                            }
                        }
                        return obj;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z3 = cardScene$updateCard$1.Z$0;
                            writeOperation5 = cardScene$updateCard$1.L$4;
                            viewModel5 = cardScene$updateCard$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                            entity = !this.activeSlotIsA ? this.slotAEntity : this.slotBEntity;
                            if (entity != null) {
                                entity.setNeedsDoubleSidedRendering(z3);
                            }
                            markDirty();
                            viewModel6 = viewModel5;
                            writeOperation4 = writeOperation5;
                            writeOperation4.updateTransform(currentCardTransform());
                            this.loadedCardId = viewModel6.id;
                            return Unit.INSTANCE;
                        }
                        z3 = cardScene$updateCard$1.Z$0;
                        cardMaterial2 = cardScene$updateCard$1.L$7;
                        transform = cardScene$updateCard$1.L$5;
                        writeOperation4 = cardScene$updateCard$1.L$4;
                        CardModelView.ViewModel viewModel7 = cardScene$updateCard$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj2);
                            viewModel6 = viewModel7;
                            try {
                                ((Boolean) obj2).getClass();
                                cardGeometry = this.cardGeometry;
                                if (cardGeometry != null) {
                                    Entity entity2 = new Entity(this.activeSlotIsA ? "card_slot_a" : "card_slot_b", cardGeometry, cardMaterial2, transform);
                                    entity2.setNeedsDoubleSidedRendering(z3);
                                    if (this.activeSlotIsA) {
                                        this.slotAMaterial = cardMaterial2;
                                        this.slotAEntity = entity2;
                                    } else {
                                        this.slotBMaterial = cardMaterial2;
                                        this.slotBEntity = entity2;
                                    }
                                    Bitmap bitmap = this.currentIconBitmap;
                                    if (bitmap != null) {
                                        gLLauncher.launch(new CardScene$applyIconToMaterial$1(cardMaterial2, bitmap, this, continuation, 0));
                                    }
                                    addEntity(entity2);
                                }
                                writeOperation4.updateTransform(currentCardTransform());
                                this.loadedCardId = viewModel6.id;
                                return Unit.INSTANCE;
                            } catch (CancellationException e) {
                                e = e;
                                cardMaterial2.dispose();
                                throw e;
                            }
                        } catch (CancellationException e2) {
                            e = e2;
                            cardMaterial2.dispose();
                            throw e;
                        }
                    }
                    z3 = cardScene$updateCard$1.Z$0;
                    transform = cardScene$updateCard$1.L$5;
                    writeOperation4 = cardScene$updateCard$1.L$4;
                    EquatableBitmap equatableBitmap5 = cardScene$updateCard$1.L$3;
                    CardModelView.ViewModel viewModel8 = cardScene$updateCard$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    equatableBitmap4 = equatableBitmap5;
                    viewModel4 = viewModel8;
                    i2 = 0;
                    cardMaterial = !this.activeSlotIsA ? this.slotAMaterial : this.slotBMaterial;
                    if (cardMaterial != null) {
                        CardMaterial cardMaterial3 = new CardMaterial(viewModel4, this.assetManager, this.engine, equatableBitmap4, new zzr(this, 18));
                        viewModel6 = viewModel4;
                        try {
                            ReadonlyStateFlow readonlyStateFlow = cardMaterial3.ready;
                            SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(i4, continuation, 5);
                            cardScene$updateCard$1.L$0 = viewModel6;
                            cardScene$updateCard$1.L$1 = null;
                            cardScene$updateCard$1.L$2 = null;
                            cardScene$updateCard$1.L$3 = null;
                            cardScene$updateCard$1.L$4 = writeOperation4;
                            cardScene$updateCard$1.L$5 = transform;
                            cardScene$updateCard$1.L$7 = cardMaterial3;
                            cardScene$updateCard$1.Z$0 = z3;
                            cardScene$updateCard$1.label = 4;
                            Object first = FlowKt.first(readonlyStateFlow, sessionWorkerKt$runSession$5, cardScene$updateCard$1);
                            if (first != obj) {
                                cardMaterial2 = cardMaterial3;
                                obj2 = first;
                                ((Boolean) obj2).getClass();
                                cardGeometry = this.cardGeometry;
                                if (cardGeometry != null) {
                                }
                                writeOperation4.updateTransform(currentCardTransform());
                                this.loadedCardId = viewModel6.id;
                                return Unit.INSTANCE;
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            cardMaterial2 = cardMaterial3;
                            cardMaterial2.dispose();
                            throw e;
                        }
                    } else {
                        CardModelView.ViewModel viewModel9 = viewModel4;
                        EquatableBitmap equatableBitmap6 = equatableBitmap4;
                        cardScene$updateCard$1.L$0 = viewModel9;
                        cardScene$updateCard$1.L$1 = null;
                        cardScene$updateCard$1.L$2 = null;
                        cardScene$updateCard$1.L$3 = null;
                        cardScene$updateCard$1.L$4 = writeOperation4;
                        cardScene$updateCard$1.L$5 = null;
                        cardScene$updateCard$1.Z$0 = z3;
                        cardScene$updateCard$1.label = 5;
                        SingleCardMaterialPlugin singleCardMaterialPlugin = cardMaterial.cardPlugin;
                        if (singleCardMaterialPlugin == null) {
                            Timber.Forest forest = Timber.Forest;
                            forest.tag("CardMaterial");
                            forest.w("update() called before plugin initialized, ignoring", new Object[i2]);
                            join = Unit.INSTANCE;
                        } else {
                            singleCardMaterialPlugin.currentCustomizationOverride = equatableBitmap6;
                            join = ((JobSupport) singleCardMaterialPlugin.glLauncher.launch(new SingleCardMaterialPlugin$update$2(singleCardMaterialPlugin, viewModel9, SingleCardMaterialPlugin.createTextureKeys(viewModel9, equatableBitmap6), System.currentTimeMillis(), System.currentTimeMillis() - System.currentTimeMillis(), null))).join(cardScene$updateCard$1);
                            if (join != obj) {
                                join = Unit.INSTANCE;
                            }
                            if (join != obj) {
                                join = Unit.INSTANCE;
                            }
                        }
                        if (join != obj) {
                            writeOperation5 = writeOperation4;
                            viewModel5 = viewModel9;
                            if (!this.activeSlotIsA) {
                            }
                            if (entity != null) {
                            }
                            markDirty();
                            viewModel6 = viewModel5;
                            writeOperation4 = writeOperation5;
                            writeOperation4.updateTransform(currentCardTransform());
                            this.loadedCardId = viewModel6.id;
                            return Unit.INSTANCE;
                        }
                    }
                    return obj;
                }
                i2 = 0;
                equatableBitmap2 = cardScene$updateCard$1.L$3;
                vector42 = cardScene$updateCard$1.L$2;
                Quat quat4 = cardScene$updateCard$1.L$1;
                viewModel2 = cardScene$updateCard$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                quat2 = quat4;
                writeOperation = this.contouredTextOverlay;
                if (writeOperation == null) {
                    writeOperation = new WriteOperation(context, engine, this.assetManager);
                    this.contouredTextOverlay = writeOperation;
                    addEntity((Entity) writeOperation.advancedRumMonitor);
                }
                cardContouredText = viewModel2.contouredText;
                c = 1;
                z = viewModel2.isCardLocked;
                cardScene$updateCard$1.L$0 = viewModel2;
                cardScene$updateCard$1.L$1 = quat2;
                cardScene$updateCard$1.L$2 = vector42;
                cardScene$updateCard$1.L$3 = equatableBitmap2;
                cardScene$updateCard$1.L$4 = writeOperation;
                cardScene$updateCard$1.label = 2;
                if (writeOperation.update(cardContouredText, z, cardScene$updateCard$1) != obj) {
                    vector43 = vector42;
                    equatableBitmap3 = equatableBitmap2;
                    writeOperation2 = writeOperation;
                    viewModel3 = viewModel2;
                    quat3 = quat2;
                    if (this.cardGeometry == null) {
                    }
                    if (!this.activeSlotIsA) {
                    }
                    float[] fArr2 = vector43.vector;
                    transform2.setPosition(new Vector3(fArr2[i2], fArr2[c], fArr2[2]));
                    transform2.setRotation(new Quat(quat3.x, quat3.y, quat3.z, quat3.w));
                    jWECryptoParts = this.copyPanPool;
                    if (jWECryptoParts != null) {
                    }
                    writeOperation3 = this.contouredTextOverlay;
                    if (writeOperation3 != null) {
                    }
                    iblComponent = this._iblData;
                    if (iblComponent != null) {
                    }
                    boolean contains2 = CollectionsKt.contains(CollectionsKt__CollectionsKt.listOf((Object[]) new CardTheme.Identifier[]{CardTheme.Identifier.HOLO_ID, CardTheme.Identifier.GLITTER_ID, CardTheme.Identifier.TORTOISE_ID}), viewModel3.id);
                    if (viewModel3.backgroundImage != CardTheme.BackgroundImage.MOOD) {
                    }
                    cardScene$updateCard$1.L$0 = viewModel3;
                    cardScene$updateCard$1.L$1 = null;
                    cardScene$updateCard$1.L$2 = null;
                    cardScene$updateCard$1.L$3 = equatableBitmap3;
                    cardScene$updateCard$1.L$4 = writeOperation2;
                    cardScene$updateCard$1.L$5 = transform2;
                    cardScene$updateCard$1.Z$0 = contains2;
                    cardScene$updateCard$1.label = 3;
                    if (ensureHeatMaskRendererInitialized(z2, cardScene$updateCard$1) != obj) {
                    }
                }
                return obj;
            }
        }
        cardScene$updateCard$1 = new CardScene$updateCard$1(this, continuationImpl);
        Object obj22 = cardScene$updateCard$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardScene$updateCard$1.label;
        GLLauncher gLLauncher2 = this.glLauncher;
        Engine engine2 = this.engine;
        Context context2 = this.context;
        int i42 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        writeOperation = this.contouredTextOverlay;
        if (writeOperation == null) {
        }
        cardContouredText = viewModel2.contouredText;
        c = 1;
        z = viewModel2.isCardLocked;
        cardScene$updateCard$1.L$0 = viewModel2;
        cardScene$updateCard$1.L$1 = quat2;
        cardScene$updateCard$1.L$2 = vector42;
        cardScene$updateCard$1.L$3 = equatableBitmap2;
        cardScene$updateCard$1.L$4 = writeOperation;
        cardScene$updateCard$1.label = 2;
        if (writeOperation.update(cardContouredText, z, cardScene$updateCard$1) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateCopyPanTexture(CardModelView.ViewModel viewModel, ContinuationImpl continuationImpl) {
        CardScene$updateCopyPanTexture$1 cardScene$updateCopyPanTexture$1;
        int i;
        Engine engine;
        Continuation continuation;
        CardScene cardScene;
        CancellationException cancellationException;
        CompletableDeferredImpl completableDeferredImpl;
        CardAssetManager$AssetKey$CopyPan cardAssetManager$AssetKey$CopyPan;
        CardScene cardScene2;
        try {
            try {
                if (continuationImpl instanceof CardScene$updateCopyPanTexture$1) {
                    cardScene$updateCopyPanTexture$1 = (CardScene$updateCopyPanTexture$1) continuationImpl;
                    int i2 = cardScene$updateCopyPanTexture$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        cardScene$updateCopyPanTexture$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = cardScene$updateCopyPanTexture$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = cardScene$updateCopyPanTexture$1.label;
                        StateFlowImpl stateFlowImpl = this._copyPanTextureReady;
                        engine = this.engine;
                        int i3 = 1;
                        continuation = null;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            Paint paint = CardModelView.REMOVE_PAINT;
                            CardAssetManager$AssetKey$CopyPan cardAssetManager$AssetKey$CopyPan2 = new CardAssetManager$AssetKey$CopyPan(CardModelView.Companion.toCardBack(viewModel));
                            if (cardAssetManager$AssetKey$CopyPan2.equals(this.copyPanAssetKey) && this.copyPanTextureId > 0) {
                                return Unit.INSTANCE;
                            }
                            Boolean bool = Boolean.FALSE;
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, bool);
                            CardAssetManager$AssetKey$CopyPan cardAssetManager$AssetKey$CopyPan3 = this.copyPanAssetKey;
                            if (cardAssetManager$AssetKey$CopyPan3 != null) {
                                engine.launch(new CardScene$dispose$1$1(this, cardAssetManager$AssetKey$CopyPan3, continuation, i3));
                            }
                            CompletableDeferredImpl completableDeferredImpl2 = new CompletableDeferredImpl();
                            cardScene = this;
                            ((JobSupport) engine.launch(new DataStoreImpl$readDataOrHandleCorruption$3(completableDeferredImpl2, cardScene, cardAssetManager$AssetKey$CopyPan2, continuation, 7))).invokeOnCompletion(new CardScene$$ExternalSyntheticLambda3(0, completableDeferredImpl2));
                            try {
                                cardScene$updateCopyPanTexture$1.L$2 = cardAssetManager$AssetKey$CopyPan2;
                                cardScene$updateCopyPanTexture$1.L$3 = completableDeferredImpl2;
                                cardScene$updateCopyPanTexture$1.L$5 = cardScene;
                                cardScene$updateCopyPanTexture$1.label = 1;
                                obj = completableDeferredImpl2.awaitInternal(cardScene$updateCopyPanTexture$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                completableDeferredImpl = completableDeferredImpl2;
                                cardScene2 = cardScene;
                                cardAssetManager$AssetKey$CopyPan = cardAssetManager$AssetKey$CopyPan2;
                            } catch (CancellationException e) {
                                cancellationException = e;
                                completableDeferredImpl = completableDeferredImpl2;
                                cardAssetManager$AssetKey$CopyPan = cardAssetManager$AssetKey$CopyPan2;
                                if (!completableDeferredImpl.isCompleted()) {
                                }
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            cardScene2 = cardScene$updateCopyPanTexture$1.L$5;
                            completableDeferredImpl = cardScene$updateCopyPanTexture$1.L$3;
                            cardAssetManager$AssetKey$CopyPan = cardScene$updateCopyPanTexture$1.L$2;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                cardScene = this;
                            } catch (CancellationException e2) {
                                cancellationException = e2;
                                cardScene = this;
                                if (!completableDeferredImpl.isCompleted()) {
                                }
                            }
                        }
                        cardScene2.copyPanTextureId = ((Number) obj).intValue();
                        cardScene.copyPanAssetKey = cardAssetManager$AssetKey$CopyPan;
                        Boolean bool2 = Boolean.TRUE;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, bool2);
                        return Unit.INSTANCE;
                    }
                }
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, bool2);
                return Unit.INSTANCE;
            } catch (CancellationException e3) {
                cancellationException = e3;
                if (!completableDeferredImpl.isCompleted()) {
                    throw cancellationException;
                }
                if (completableDeferredImpl.isCancelled()) {
                    throw cancellationException;
                }
                engine.launch(new CardScene$dispose$1$1(cardScene, cardAssetManager$AssetKey$CopyPan, continuation, 2));
                throw cancellationException;
            }
            cardScene2.copyPanTextureId = ((Number) obj).intValue();
            cardScene.copyPanAssetKey = cardAssetManager$AssetKey$CopyPan;
            Boolean bool22 = Boolean.TRUE;
        } catch (CancellationException e4) {
            cancellationException = e4;
        }
        cardScene$updateCopyPanTexture$1 = new CardScene$updateCopyPanTexture$1(this, continuationImpl);
        Object obj2 = cardScene$updateCopyPanTexture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardScene$updateCopyPanTexture$1.label;
        StateFlowImpl stateFlowImpl2 = this._copyPanTextureReady;
        engine = this.engine;
        int i32 = 1;
        continuation = null;
        if (i != 0) {
        }
    }

    public final void updateTransform(Quat quat, Vector4 vector4) {
        quat.getClass();
        vector4.getClass();
        float[] fArr = vector4.vector;
        Vector3 vector3 = new Vector3(fArr[0], fArr[1], fArr[2]);
        Transform transform = this.slotATransform;
        transform.setPosition(vector3);
        transform.setRotation(new Quat(quat.x, quat.y, quat.z, quat.w));
        Vector3 vector32 = new Vector3(fArr[0], fArr[1], fArr[2]);
        Transform transform2 = this.slotBTransform;
        transform2.setPosition(vector32);
        transform2.setRotation(new Quat(quat.x, quat.y, quat.z, quat.w));
        JWECryptoParts jWECryptoParts = this.copyPanPool;
        if (jWECryptoParts != null) {
            jWECryptoParts.repositionEntities(currentCardTransform());
        }
        WriteOperation writeOperation = this.contouredTextOverlay;
        if (writeOperation != null) {
            writeOperation.updateTransform(currentCardTransform());
        }
        markDirty();
    }
}
