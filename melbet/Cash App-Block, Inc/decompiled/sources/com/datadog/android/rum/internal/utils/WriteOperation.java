package com.datadog.android.rum.internal.utils;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.StateSet;
import android.view.Display;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.card.onboarding.CardContouredText;
import com.squareup.cash.card.onboarding.core.CardAssetManager;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$ContouredText;
import com.squareup.cash.card.onboarding.core.CardGeometry;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.core.ContouredMarquee;
import com.squareup.cash.card.onboarding.core.ContouredTextMaterial;
import com.squareup.cash.card.onboarding.core.ContouredTextOverlay$dispose$1$1;
import com.squareup.cash.card.onboarding.core.ContouredTextOverlay$update$1;
import com.squareup.cash.card.onboarding.core.ContouredTextOverlay$updateTexture$1;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.graphics.swampgl.components.Transform;
import com.squareup.workflow1.InterceptedRenderContext$send$1;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class WriteOperation {
    public Object advancedRumMonitor;
    public Object eventSource;
    public int eventType;
    public Object onError;
    public Object onSuccess;
    public Object rumDataWriter;
    public Object sdkCore;
    public Object writeScope;

    public WriteOperation(Context context, Engine engine, CardAssetManager cardAssetManager) {
        context.getClass();
        engine.getClass();
        cardAssetManager.getClass();
        this.sdkCore = engine;
        this.writeScope = cardAssetManager;
        Object systemService = context.getSystemService("display");
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        long refreshRate = (long) (1000.0f / (display != null ? display.getRefreshRate() : 60.0f));
        long j = refreshRate < 1 ? 1L : refreshRate;
        CardGeometry cardGeometry = new CardGeometry(context, engine, "cash_card_text.cashmesh");
        this.onError = cardGeometry;
        ContouredTextMaterial contouredTextMaterial = new ContouredTextMaterial();
        this.onSuccess = contouredTextMaterial;
        this.eventSource = new ContouredMarquee(engine, new SsnViewKt$$ExternalSyntheticLambda4(this, 14), new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 4), new CardScene$$ExternalSyntheticLambda1(15), j);
        Entity entity = new Entity("contoured_text", cardGeometry, contouredTextMaterial, new Transform());
        entity.setNeedsDoubleSidedRendering(false);
        entity.depthWrite = false;
        entity.setVisible(false);
        this.advancedRumMonitor = entity;
    }

    public void addStateShapeAppearanceModel(int[] iArr, ShapeAppearanceModel shapeAppearanceModel) {
        int i = this.eventType;
        if (i == 0 || iArr.length == 0) {
            this.sdkCore = shapeAppearanceModel;
        }
        int[][] iArr2 = (int[][]) this.writeScope;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.writeScope = iArr3;
            ShapeAppearanceModel[] shapeAppearanceModelArr = new ShapeAppearanceModel[i2];
            System.arraycopy((ShapeAppearanceModel[]) this.onError, 0, shapeAppearanceModelArr, 0, i);
            this.onError = shapeAppearanceModelArr;
        }
        int[][] iArr4 = (int[][]) this.writeScope;
        int i3 = this.eventType;
        iArr4[i3] = iArr;
        ((ShapeAppearanceModel[]) this.onError)[i3] = shapeAppearanceModel;
        this.eventType = i3 + 1;
    }

    public StateListShapeAppearanceModel build() {
        if (this.eventType == 0) {
            return null;
        }
        return new StateListShapeAppearanceModel(this);
    }

    public void initialize() {
        this.sdkCore = new ShapeAppearanceModel();
        this.writeScope = new int[10][];
        this.onError = new ShapeAppearanceModel[10];
    }

    public void notifyEventWriteFailure(Exception exc) {
        InternalSdkCore internalSdkCore = (InternalSdkCore) this.sdkCore;
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(InternalLogger.Target.USER);
        if (exc != null) {
            mutableListOf.add(InternalLogger.Target.TELEMETRY);
        }
        DBUtil.log$default(internalSdkCore.getInternalLogger(), 5, mutableListOf, WriteOperation$submit$1$1.INSTANCE$2, exc, 48);
        AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) this.advancedRumMonitor;
        if (advancedRumMonitor != null) {
            if (Intrinsics.areEqual((Function1) this.onError, WriteOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1.INSTANCE)) {
                DBUtil.log$default(internalSdkCore.getInternalLogger(), 4, InternalLogger.Target.MAINTAINER, WriteOperation$submit$1$1.INSTANCE$3, null, false, 56);
            }
            ((Function1) this.onError).invoke(advancedRumMonitor);
        }
    }

    public void submit() {
        ((Function1) this.writeScope).invoke(new InterceptedRenderContext$send$1(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object update(CardContouredText cardContouredText, boolean z, ContinuationImpl continuationImpl) {
        ContouredTextOverlay$update$1 contouredTextOverlay$update$1;
        int i;
        ContouredMarquee contouredMarquee;
        Entity entity;
        int i2;
        if (continuationImpl instanceof ContouredTextOverlay$update$1) {
            contouredTextOverlay$update$1 = (ContouredTextOverlay$update$1) continuationImpl;
            int i3 = contouredTextOverlay$update$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                contouredTextOverlay$update$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = contouredTextOverlay$update$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contouredTextOverlay$update$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    contouredTextOverlay$update$1.L$0 = cardContouredText;
                    contouredTextOverlay$update$1.Z$0 = z;
                    contouredTextOverlay$update$1.label = 1;
                    if (updateTexture(cardContouredText, contouredTextOverlay$update$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = contouredTextOverlay$update$1.Z$0;
                    cardContouredText = contouredTextOverlay$update$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                contouredMarquee = (ContouredMarquee) this.eventSource;
                entity = (Entity) this.advancedRumMonitor;
                ContouredTextMaterial contouredTextMaterial = (ContouredTextMaterial) this.onSuccess;
                if (cardContouredText != null || (i2 = this.eventType) <= 0) {
                    entity.setVisible(false);
                    contouredMarquee.setActive(false, z);
                } else {
                    contouredTextMaterial.textureId = i2;
                    SharedFlowImpl sharedFlowImpl = contouredTextMaterial._dirty;
                    Unit unit = Unit.INSTANCE;
                    sharedFlowImpl.tryEmit(unit);
                    contouredTextMaterial.opacity = cardContouredText.opacity;
                    sharedFlowImpl.tryEmit(unit);
                    contouredTextMaterial.textureScaleX = cardContouredText.repeatCount;
                    sharedFlowImpl.tryEmit(unit);
                    contouredTextMaterial.textureScaleY = 1.0f;
                    sharedFlowImpl.tryEmit(unit);
                    entity.setVisible(true);
                    contouredMarquee.setActive(true, z);
                }
                return Unit.INSTANCE;
            }
        }
        contouredTextOverlay$update$1 = new ContouredTextOverlay$update$1(this, continuationImpl);
        Object obj3 = contouredTextOverlay$update$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contouredTextOverlay$update$1.label;
        if (i != 0) {
        }
        contouredMarquee = (ContouredMarquee) this.eventSource;
        entity = (Entity) this.advancedRumMonitor;
        ContouredTextMaterial contouredTextMaterial2 = (ContouredTextMaterial) this.onSuccess;
        if (cardContouredText != null) {
        }
        entity.setVisible(false);
        contouredMarquee.setActive(false, z);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateTexture(CardContouredText cardContouredText, ContinuationImpl continuationImpl) {
        ContouredTextOverlay$updateTexture$1 contouredTextOverlay$updateTexture$1;
        int i;
        WriteOperation writeOperation;
        CancellationException cancellationException;
        Job job;
        CompletableDeferredImpl completableDeferredImpl;
        CardAssetManager$AssetKey$ContouredText cardAssetManager$AssetKey$ContouredText;
        WriteOperation writeOperation2;
        Engine engine = (Engine) this.sdkCore;
        try {
            if (continuationImpl instanceof ContouredTextOverlay$updateTexture$1) {
                contouredTextOverlay$updateTexture$1 = (ContouredTextOverlay$updateTexture$1) continuationImpl;
                int i2 = contouredTextOverlay$updateTexture$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    contouredTextOverlay$updateTexture$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = contouredTextOverlay$updateTexture$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = contouredTextOverlay$updateTexture$1.label;
                    int i3 = 1;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (cardContouredText == null) {
                            CardAssetManager$AssetKey$ContouredText cardAssetManager$AssetKey$ContouredText2 = (CardAssetManager$AssetKey$ContouredText) this.rumDataWriter;
                            if (cardAssetManager$AssetKey$ContouredText2 != null) {
                                engine.launch(new ContouredTextOverlay$dispose$1$1(this, cardAssetManager$AssetKey$ContouredText2, continuation, i3));
                            }
                            this.rumDataWriter = null;
                            this.eventType = 0;
                            return Unit.INSTANCE;
                        }
                        Integer num = cardContouredText.color;
                        CardAssetManager$AssetKey$ContouredText cardAssetManager$AssetKey$ContouredText3 = new CardAssetManager$AssetKey$ContouredText(cardContouredText.text, num != null ? num.intValue() : -16777216);
                        if (cardAssetManager$AssetKey$ContouredText3.equals((CardAssetManager$AssetKey$ContouredText) this.rumDataWriter) && this.eventType > 0) {
                            return Unit.INSTANCE;
                        }
                        CardAssetManager$AssetKey$ContouredText cardAssetManager$AssetKey$ContouredText4 = (CardAssetManager$AssetKey$ContouredText) this.rumDataWriter;
                        int i4 = 2;
                        if (cardAssetManager$AssetKey$ContouredText4 != null) {
                            engine.launch(new ContouredTextOverlay$dispose$1$1(this, cardAssetManager$AssetKey$ContouredText4, continuation, i4));
                        }
                        CompletableDeferredImpl completableDeferredImpl2 = new CompletableDeferredImpl();
                        writeOperation = this;
                        Job launch = engine.launch(new DataStoreImpl$readDataOrHandleCorruption$3(completableDeferredImpl2, writeOperation, cardAssetManager$AssetKey$ContouredText3, continuation, 8));
                        ((JobSupport) launch).invokeOnCompletion(new CardScene$$ExternalSyntheticLambda3(i4, completableDeferredImpl2));
                        try {
                            contouredTextOverlay$updateTexture$1.L$1 = cardAssetManager$AssetKey$ContouredText3;
                            contouredTextOverlay$updateTexture$1.L$2 = completableDeferredImpl2;
                            contouredTextOverlay$updateTexture$1.L$3 = (JobSupport) launch;
                            contouredTextOverlay$updateTexture$1.L$4 = writeOperation;
                            contouredTextOverlay$updateTexture$1.label = 1;
                            obj = completableDeferredImpl2.awaitInternal(contouredTextOverlay$updateTexture$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            job = launch;
                            completableDeferredImpl = completableDeferredImpl2;
                            writeOperation2 = writeOperation;
                            cardAssetManager$AssetKey$ContouredText = cardAssetManager$AssetKey$ContouredText3;
                        } catch (CancellationException e) {
                            cancellationException = e;
                            job = launch;
                            completableDeferredImpl = completableDeferredImpl2;
                            cardAssetManager$AssetKey$ContouredText = cardAssetManager$AssetKey$ContouredText3;
                            job.cancel(null);
                            job.invokeOnCompletion(new CaptureCheckFaceKt$$ExternalSyntheticLambda11(11, completableDeferredImpl, writeOperation, cardAssetManager$AssetKey$ContouredText));
                            throw cancellationException;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        writeOperation2 = contouredTextOverlay$updateTexture$1.L$4;
                        job = contouredTextOverlay$updateTexture$1.L$3;
                        completableDeferredImpl = contouredTextOverlay$updateTexture$1.L$2;
                        cardAssetManager$AssetKey$ContouredText = contouredTextOverlay$updateTexture$1.L$1;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            writeOperation = this;
                        } catch (CancellationException e2) {
                            cancellationException = e2;
                            writeOperation = this;
                            job.cancel(null);
                            job.invokeOnCompletion(new CaptureCheckFaceKt$$ExternalSyntheticLambda11(11, completableDeferredImpl, writeOperation, cardAssetManager$AssetKey$ContouredText));
                            throw cancellationException;
                        }
                    }
                    writeOperation2.eventType = ((Number) obj).intValue();
                    writeOperation.rumDataWriter = cardAssetManager$AssetKey$ContouredText;
                    return Unit.INSTANCE;
                }
            }
            writeOperation2.eventType = ((Number) obj).intValue();
            writeOperation.rumDataWriter = cardAssetManager$AssetKey$ContouredText;
            return Unit.INSTANCE;
        } catch (CancellationException e3) {
            cancellationException = e3;
            job.cancel(null);
            job.invokeOnCompletion(new CaptureCheckFaceKt$$ExternalSyntheticLambda11(11, completableDeferredImpl, writeOperation, cardAssetManager$AssetKey$ContouredText));
            throw cancellationException;
        }
        contouredTextOverlay$updateTexture$1 = new ContouredTextOverlay$updateTexture$1(this, continuationImpl);
        Object obj2 = contouredTextOverlay$updateTexture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contouredTextOverlay$updateTexture$1.label;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    public void updateTransform(Transform transform) {
        transform.getClass();
        Entity entity = (Entity) this.advancedRumMonitor;
        boolean visible = entity.getVisible();
        Transform transform2 = entity.transform;
        if (visible) {
            transform2.setPosition((Vector3) transform._position.getValue());
            transform2.setRotation((Quat) transform._rotation.getValue());
            transform2.setScale(transform.getScale());
        }
    }

    public WriteOperation(ShapeAppearanceModel shapeAppearanceModel) {
        initialize();
        addStateShapeAppearanceModel(StateSet.WILD_CARD, shapeAppearanceModel);
    }
}
