package com.google.mlkit.vision.face.internal;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.camera.core.impl.AutoValue_StateObservable_ErrorWrapper;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.StateObservable$ObserverWrapper;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.camera.video.Recorder;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.media3.common.FlagSet;
import androidx.media3.ui.PlayerView;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.navigationevent.NavigationEvent_androidKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.android.volley.toolbox.HurlStack;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.internal.attributes.ViewScopeInstrumentationType;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzl;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.reflect.jvm.internal.types.KTypeSubstitutorKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes4.dex */
public final class zzm implements Observable, zzb {
    public boolean zza;
    public final Object zzb;
    public final Object zzc;
    public int zzd;
    public Object zze;
    public Object zzf;

    public zzm(CoroutineScope coroutineScope, DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda0) {
        coroutineScope.getClass();
        this.zzb = coroutineScope;
        this.zzc = dialogHostKt$$ExternalSyntheticLambda0;
        Object obj = new Object();
        this.zze = obj;
        synchronized (obj) {
            this.zzf = JobKt.launch$default(coroutineScope, null, null, new ThumbNode$onAttach$1(this, (Continuation) null, 11), 3);
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(Executor executor, Observable.Observer observer) {
        StateObservable$ObserverWrapper stateObservable$ObserverWrapper;
        synchronized (this.zzb) {
            removeObserverLocked(observer);
            stateObservable$ObserverWrapper = new StateObservable$ObserverWrapper((AtomicReference) this.zzc, executor, observer);
            ((HashMap) this.zze).put(observer, stateObservable$ObserverWrapper);
            ((CopyOnWriteArraySet) this.zzf).add(stateObservable$ObserverWrapper);
        }
        stateObservable$ObserverWrapper.update(0);
    }

    public Recorder.AnonymousClass1 build() {
        Intent intent = (Intent) this.zzb;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.zza);
        ((HurlStack) this.zzc).getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = (Bundle) this.zzf;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.zzd);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            if (((ActivityOptions) this.zze) == null) {
                this.zze = ActivityOptions.makeBasic();
            }
            PlayerView.Api34.setShareIdentityEnabled((ActivityOptions) this.zze);
        }
        if (i >= 36) {
            if (((ActivityOptions) this.zze) == null) {
                this.zze = ActivityOptions.makeBasic();
            }
            NavigationEvent_androidKt.setAllowPassThroughOnTouchOutside((ActivityOptions) this.zze, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = (ActivityOptions) this.zze;
        return new Recorder.AnonymousClass1(3, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    @Override // androidx.camera.core.impl.Observable
    public ListenableFuture fetchData() {
        Object obj = ((AtomicReference) this.zzc).get();
        return obj instanceof AutoValue_StateObservable_ErrorWrapper ? new ImmediateFuture$ImmediateFailedFuture(((AutoValue_StateObservable_ErrorWrapper) obj).error, 0) : Futures.immediateFuture(obj);
    }

    public void release() {
        synchronized (this.zze) {
            try {
                if (this.zza) {
                    return;
                }
                this.zza = true;
                StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) this.zzf;
                Continuation continuation = null;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                }
                this.zzf = null;
                JobKt.launch$default((CoroutineScope) this.zzb, null, null, new DiskLruCache$launchCleanup$1(this, continuation, 7), 3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(Observable.Observer observer) {
        synchronized (this.zzb) {
            removeObserverLocked(observer);
        }
    }

    public void removeObserverLocked(Observable.Observer observer) {
        StateObservable$ObserverWrapper stateObservable$ObserverWrapper = (StateObservable$ObserverWrapper) ((HashMap) this.zze).remove(observer);
        if (stateObservable$ObserverWrapper != null) {
            stateObservable$ObserverWrapper.mActive.set(false);
            ((CopyOnWriteArraySet) this.zzf).remove(stateObservable$ObserverWrapper);
        }
    }

    public void setColorScheme() {
        ((Intent) this.zzb).putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", 0);
    }

    public void setShareState(int i) {
        Intent intent = (Intent) this.zzb;
        if (i < 0 || i > 2) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid value for the shareState argument");
            return;
        }
        this.zzd = i;
        if (i == 1) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        } else if (i == 2) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        } else {
            intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
        }
    }

    public void updateStateInternal(Object obj) {
        Iterator it;
        int i;
        synchronized (this.zzb) {
            try {
                if (Objects.equals(((AtomicReference) this.zzc).getAndSet(obj), obj)) {
                    return;
                }
                int i2 = this.zzd + 1;
                this.zzd = i2;
                if (this.zza) {
                    return;
                }
                this.zza = true;
                Iterator it2 = ((CopyOnWriteArraySet) this.zzf).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((StateObservable$ObserverWrapper) it2.next()).update(i2);
                    } else {
                        synchronized (this.zzb) {
                            try {
                                if (this.zzd == i2) {
                                    this.zza = false;
                                    return;
                                } else {
                                    it = ((CopyOnWriteArraySet) this.zzf).iterator();
                                    i = this.zzd;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i2 = i;
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.google.mlkit.vision.face.internal.zzb
    public Pair zza(InputImage inputImage) {
        com.google.android.gms.internal.mlkit_vision_face.zzf[] zzfVarArr;
        if (((com.google.android.gms.internal.mlkit_vision_face.zzj) this.zzf) == null) {
            zzd();
        }
        com.google.android.gms.internal.mlkit_vision_face.zzj zzjVar = (com.google.android.gms.internal.mlkit_vision_face.zzj) this.zzf;
        if (zzjVar == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        try {
            zzp zzpVar = new zzp(inputImage.zzd, inputImage.zze, 0, CommonConvertUtils.convertToMVRotation(inputImage.zzf), SystemClock.elapsedRealtime());
            if (inputImage.zzg != 35 || this.zzd < 201500000) {
                ObjectWrapper objectWrapper = new ObjectWrapper(KTypeSubstitutorKt.convertToNv21Buffer(inputImage));
                Parcel zza = zzjVar.zza();
                int i = com.google.android.gms.internal.mlkit_vision_face.zzc.$r8$clinit;
                zza.writeStrongBinder(objectWrapper);
                zza.writeInt(1);
                zzpVar.writeToParcel(zza, 0);
                Parcel zzb = zzjVar.zzb(zza, 1);
                com.google.android.gms.internal.mlkit_vision_face.zzf[] zzfVarArr2 = (com.google.android.gms.internal.mlkit_vision_face.zzf[]) zzb.createTypedArray(com.google.android.gms.internal.mlkit_vision_face.zzf.CREATOR);
                zzb.recycle();
                zzfVarArr = zzfVarArr2;
            } else {
                Image.Plane[] planes = inputImage.getPlanes();
                zzae.checkNotNull(planes);
                zzfVarArr = zzjVar.zzf(new ObjectWrapper(planes[0].getBuffer()), new ObjectWrapper(planes[1].getBuffer()), new ObjectWrapper(planes[2].getBuffer()), planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzpVar);
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.mlkit_vision_face.zzf zzfVar : zzfVarArr) {
                arrayList.add(new Face(zzfVar));
            }
            ((FaceDetectorOptions) this.zzc).getClass();
            AtomicBoolean atomicBoolean = zzh.zza;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Face) it.next()).zzb = -1;
            }
            return new Pair(arrayList, null);
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to detect with legacy face detector");
        }
    }

    @Override // com.google.mlkit.vision.face.internal.zzb
    public void zzb() {
        com.google.android.gms.internal.mlkit_vision_face.zzj zzjVar = (com.google.android.gms.internal.mlkit_vision_face.zzj) this.zzf;
        if (zzjVar != null) {
            try {
                zzjVar.zzc(zzjVar.zza(), 3);
            } catch (RemoteException e) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e);
            }
            this.zzf = null;
        }
    }

    @Override // com.google.mlkit.vision.face.internal.zzb
    public boolean zzd() {
        com.google.android.gms.internal.mlkit_vision_face.zzm zzkVar;
        int i;
        Context context = (Context) this.zzb;
        FaceDetectorOptions faceDetectorOptions = (FaceDetectorOptions) this.zzc;
        boolean z = false;
        if (((com.google.android.gms.internal.mlkit_vision_face.zzj) this.zzf) != null) {
            return false;
        }
        try {
            IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
            int i2 = zzl.$r8$clinit;
            int i3 = 8;
            if (instantiate == null) {
                zzkVar = null;
            } else {
                IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                zzkVar = queryLocalInterface instanceof com.google.android.gms.internal.mlkit_vision_face.zzm ? (com.google.android.gms.internal.mlkit_vision_face.zzm) queryLocalInterface : new com.google.android.gms.internal.mlkit_vision_face.zzk(instantiate, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 8);
            }
            ObjectWrapper objectWrapper = new ObjectWrapper(context);
            faceDetectorOptions.getClass();
            if (((com.google.android.gms.internal.mlkit_vision_face.zzj) this.zzf) == null) {
                int i4 = faceDetectorOptions.zza;
                if (i4 != 1) {
                    if (i4 == 2) {
                        i = 1;
                        this.zzf = ((com.google.android.gms.internal.mlkit_vision_face.zzk) zzkVar).zzd(objectWrapper, new com.google.android.gms.internal.mlkit_vision_face.zzh(0, i, 0, false, false, faceDetectorOptions.zzf));
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i4, "Invalid landmark type: "));
                    }
                }
                i = 0;
                this.zzf = ((com.google.android.gms.internal.mlkit_vision_face.zzk) zzkVar).zzd(objectWrapper, new com.google.android.gms.internal.mlkit_vision_face.zzh(0, i, 0, false, false, faceDetectorOptions.zzf));
            }
            if (((com.google.android.gms.internal.mlkit_vision_face.zzj) this.zzf) == null && !this.zza) {
                Log.d("LegacyFaceDelegate", "Request face optional module download.");
                OptionalModuleUtils.requestDownload(context, "barcode");
                this.zza = true;
            }
            zzoc zzocVar = (zzoc) this.zze;
            AtomicReference atomicReference = zzj.zza;
            zzocVar.zzf(new FlagSet.Builder(z, zzks.NO_ERROR, i3), zzkt.ON_DEVICE_FACE_LOAD);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to create legacy face detector.");
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException(13, e2, "Failed to load deprecated vision dynamite module.");
        }
    }

    public zzm(Context context, FaceDetectorOptions faceDetectorOptions, zzoc zzocVar) {
        this.zzb = context;
        this.zzc = faceDetectorOptions;
        GoogleApiAvailabilityLight.zza.getClass();
        this.zzd = GoogleApiAvailabilityLight.getApkVersion(context);
        this.zze = zzocVar;
    }

    public zzm(int i, InternalLogger internalLogger, ViewScopeInstrumentationType viewScopeInstrumentationType, int i2) {
        viewScopeInstrumentationType = (i2 & 4) != 0 ? null : viewScopeInstrumentationType;
        if (i != 0) {
            internalLogger.getClass();
            this.zzd = i;
            this.zzb = internalLogger;
            this.zzc = viewScopeInstrumentationType;
            return;
        }
        throw null;
    }

    public zzm(Object obj) {
        this.zzb = new Object();
        this.zzd = 0;
        this.zza = false;
        this.zze = new HashMap();
        this.zzf = new CopyOnWriteArraySet();
        this.zzc = new AtomicReference(obj);
    }

    public zzm() {
        this.zzb = new Intent("android.intent.action.VIEW");
        this.zzc = new HurlStack(3);
        this.zzd = 0;
        this.zza = true;
    }
}
