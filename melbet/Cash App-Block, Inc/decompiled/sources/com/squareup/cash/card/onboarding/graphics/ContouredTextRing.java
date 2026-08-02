package com.squareup.cash.card.onboarding.graphics;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.card.onboarding.core.CardAssetManager$release$1;
import com.squareup.cash.card.onboarding.core.ContouredMarquee;
import com.squareup.cash.card.onboarding.core.ContouredTextMaterial;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import com.squareup.cash.graphics.swampgl.components.Transform;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ContouredTextRing {
    public final Function1 addEntity;
    public final Function1 awaitHostReady;
    public volatile float baseOpacity;
    public final Context context;
    public final Engine engine;
    public volatile Entity entity;
    public final String entityId;
    public final long frameDelayMs;
    public volatile JobSupport geometryLoadJob;
    public volatile boolean loadStarted;
    public final Function0 markDirty;
    public final ContouredMarquee marquee;
    public final ContouredTextMaterial material;
    public volatile Pair pendingText;
    public volatile JobSupport textUploadJob;
    public volatile int textureId;
    public final Transform transform;
    public volatile JobSupport visibilityAnimationJob;
    public volatile float visibilityFade;
    public volatile boolean visible;

    public ContouredTextRing(Context context, Engine engine, String str, Transform transform, Function1 function1, Function1 function12, Function0 function0) {
        context.getClass();
        engine.getClass();
        this.context = context;
        this.engine = engine;
        this.entityId = str;
        this.transform = transform;
        this.awaitHostReady = function1;
        this.addEntity = function12;
        this.markDirty = function0;
        ContouredTextMaterial contouredTextMaterial = new ContouredTextMaterial();
        this.material = contouredTextMaterial;
        this.baseOpacity = 1.0f;
        this.visibilityFade = 1.0f;
        Object systemService = context.getSystemService("display");
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        long refreshRate = (long) (1000.0f / (display != null ? display.getRefreshRate() : 60.0f));
        long j = refreshRate < 1 ? 1L : refreshRate;
        this.frameDelayMs = j;
        this.marquee = new ContouredMarquee(engine, new SsnViewKt$$ExternalSyntheticLambda4(this, 16), new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 5), function0, j);
        contouredTextMaterial.opacity = this.baseOpacity * this.visibilityFade;
        contouredTextMaterial._dirty.tryEmit(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$animateVisibility(ContouredTextRing contouredTextRing, float f, ContinuationImpl continuationImpl) {
        ContouredTextRing$animateVisibility$1 contouredTextRing$animateVisibility$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        float f2;
        long nanoTime;
        long j;
        long nanoTime2;
        float f3;
        long j2;
        contouredTextRing.getClass();
        if (continuationImpl instanceof ContouredTextRing$animateVisibility$1) {
            contouredTextRing$animateVisibility$1 = (ContouredTextRing$animateVisibility$1) continuationImpl;
            int i2 = contouredTextRing$animateVisibility$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                contouredTextRing$animateVisibility$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = contouredTextRing$animateVisibility$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contouredTextRing$animateVisibility$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    f2 = contouredTextRing.visibilityFade;
                    nanoTime = System.nanoTime();
                    j = 350;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nanoTime = contouredTextRing$animateVisibility$1.J$1;
                    j = contouredTextRing$animateVisibility$1.J$0;
                    float f4 = contouredTextRing$animateVisibility$1.F$1;
                    float f5 = contouredTextRing$animateVisibility$1.F$0;
                    SafeTrace.throwOnFailure(obj);
                    f2 = f4;
                    f = f5;
                }
                do {
                    nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
                    if (nanoTime2 < j) {
                        contouredTextRing.visibilityFade = f;
                        contouredTextRing.applyOpacity();
                        return Unit.INSTANCE;
                    }
                    float f6 = nanoTime2 / j;
                    if (f6 < 0.5f) {
                        f3 = 2.0f * f6 * f6;
                    } else {
                        float f7 = 1.0f - f6;
                        f3 = 1.0f - ((2.0f * f7) * f7);
                    }
                    contouredTextRing.visibilityFade = CameraState$Type$EnumUnboxingLocalUtility.m(f, f2, f3, f2);
                    contouredTextRing.applyOpacity();
                    j2 = contouredTextRing.frameDelayMs;
                    contouredTextRing$animateVisibility$1.F$0 = f;
                    contouredTextRing$animateVisibility$1.F$1 = f2;
                    contouredTextRing$animateVisibility$1.J$0 = j;
                    contouredTextRing$animateVisibility$1.J$1 = nanoTime;
                    contouredTextRing$animateVisibility$1.label = 1;
                } while (JobKt.delay(j2, contouredTextRing$animateVisibility$1) != coroutineSingletons);
                return coroutineSingletons;
            }
        }
        contouredTextRing$animateVisibility$1 = new ContouredTextRing$animateVisibility$1(contouredTextRing, continuationImpl);
        Object obj2 = contouredTextRing$animateVisibility$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contouredTextRing$animateVisibility$1.label;
        if (i != 0) {
        }
        do {
            nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
            if (nanoTime2 < j) {
            }
        } while (JobKt.delay(j2, contouredTextRing$animateVisibility$1) != coroutineSingletons);
        return coroutineSingletons;
    }

    public final void applyOpacity() {
        ContouredTextMaterial contouredTextMaterial = this.material;
        contouredTextMaterial.opacity = this.baseOpacity * this.visibilityFade;
        contouredTextMaterial._dirty.tryEmit(Unit.INSTANCE);
        this.markDirty.invoke();
    }

    public final void dispose() {
        ContouredMarquee contouredMarquee = this.marquee;
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
        JobSupport jobSupport = this.geometryLoadJob;
        if (jobSupport != null) {
            jobSupport.cancel(null);
        }
        this.geometryLoadJob = null;
        JobSupport jobSupport2 = this.textUploadJob;
        if (jobSupport2 != null) {
            jobSupport2.cancel(null);
        }
        this.textUploadJob = null;
        JobSupport jobSupport3 = this.visibilityAnimationJob;
        if (jobSupport3 != null) {
            jobSupport3.cancel(null);
        }
        this.visibilityAnimationJob = null;
        int i = this.textureId;
        if (i > 0) {
            this.textureId = 0;
            this.engine.launch(new CardAssetManager$release$1(i, null, 1));
        }
    }

    public final void setRepeatCount() {
        ContouredTextMaterial contouredTextMaterial = this.material;
        contouredTextMaterial.textureScaleX = 4.0f;
        contouredTextMaterial._dirty.tryEmit(Unit.INSTANCE);
        this.markDirty.invoke();
    }

    public final void setText(int i, String str) {
        str.getClass();
        this.pendingText = new Pair(str, Integer.valueOf(i));
        if (this.loadStarted) {
            JobSupport jobSupport = this.textUploadJob;
            if (jobSupport != null) {
                jobSupport.cancel(null);
            }
            this.textUploadJob = (JobSupport) this.engine.launch(new ContouredTextRing$uploadText$1(this, str, i, null));
        }
    }

    public final void setVisible(boolean z, boolean z2) {
        int i = 1;
        boolean z3 = this.visible != z;
        this.visible = z;
        Continuation continuation = null;
        if (z && !this.loadStarted) {
            this.loadStarted = true;
            this.geometryLoadJob = (JobSupport) this.engine.launch(new RealMRIFactory$sign$2.AnonymousClass1(this, new MeshGeometry(this.context, this.engine, "text_ring.cashmesh"), continuation, i));
            Pair pair = this.pendingText;
            if (pair != null) {
                String str = (String) pair.first;
                int intValue = ((Number) pair.second).intValue();
                JobSupport jobSupport = this.textUploadJob;
                if (jobSupport != null) {
                    jobSupport.cancel(null);
                }
                this.textUploadJob = (JobSupport) this.engine.launch(new ContouredTextRing$uploadText$1(this, str, intValue, null));
            }
        }
        if (!z3 || this.textureId <= 0) {
            Entity entity = this.entity;
            if (entity != null) {
                entity.setVisible(z);
            }
        } else {
            JobSupport jobSupport2 = this.visibilityAnimationJob;
            if (jobSupport2 != null) {
                jobSupport2.cancel(null);
            }
            this.visibilityAnimationJob = (JobSupport) this.engine.launch(new ContouredTextRing$setVisible$1(z, this, null));
        }
        this.marquee.setActive(z, z2);
        this.markDirty.invoke();
    }
}
