package com.google.maps.android.compose;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.credentials.CredentialManager$createCredential$2$callback$1;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.yf$$ExternalSyntheticLambda10;
import coil3.request.OneShotDisposable;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzg;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.zza;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class CameraPositionState {
    public static final WorkLauncherImpl Saver = new WorkLauncherImpl(8, new MarkerKt$$ExternalSyntheticLambda10(17), new yf$$ExternalSyntheticLambda10(25));
    public boolean isLiteMode;
    public final ParcelableSnapshotMutableState rawPosition$delegate;
    public final ParcelableSnapshotMutableState isMoving$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public final ParcelableSnapshotMutableState cameraMoveStartedReason$delegate = Updater.mutableStateOf$default(CameraMoveStartedReason.NO_MOVEMENT_YET);
    public final Unit lock = Unit.INSTANCE;
    public final ParcelableSnapshotMutableState map$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState onMapChanged$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState movementOwner$delegate = Updater.mutableStateOf$default(null);

    public interface OnMapChangedCallback {
        default void onCancelLocked() {
        }

        void onMapChangedLocked(GoogleMap googleMap);
    }

    public CameraPositionState(CameraPosition cameraPosition) {
        this.rawPosition$delegate = Updater.mutableStateOf$default(cameraPosition);
    }

    public static final void access$performAnimateCameraLocked(CameraPositionState cameraPositionState, final GoogleMap googleMap, OneShotDisposable oneShotDisposable, int i, CancellableContinuationImpl cancellableContinuationImpl) {
        if (cameraPositionState.isLiteMode) {
            googleMap.moveCamera(oneShotDisposable);
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Unit.INSTANCE);
            return;
        }
        CredentialManager$createCredential$2$callback$1 credentialManager$createCredential$2$callback$1 = new CredentialManager$createCredential$2$callback$1(cancellableContinuationImpl);
        if (i == Integer.MAX_VALUE) {
            googleMap.getClass();
            try {
                zzae.checkNotNull(oneShotDisposable, "CameraUpdate must not be null.");
                zzg zzgVar = googleMap.zza;
                IObjectWrapper iObjectWrapper = (IObjectWrapper) oneShotDisposable.job;
                zza zzaVar = new zza(credentialManager$createCredential$2$callback$1);
                Parcel zza = zzgVar.zza();
                zzc.zzg(zza, iObjectWrapper);
                zzc.zzg(zza, zzaVar);
                zzgVar.zzc(zza, 6);
            } catch (RemoteException e) {
                TransportImpl$$ExternalSyntheticLambda0.m(e);
                return;
            }
        } else {
            googleMap.getClass();
            try {
                zzae.checkNotNull(oneShotDisposable, "CameraUpdate must not be null.");
                zzg zzgVar2 = googleMap.zza;
                IObjectWrapper iObjectWrapper2 = (IObjectWrapper) oneShotDisposable.job;
                zza zzaVar2 = new zza(credentialManager$createCredential$2$callback$1);
                Parcel zza2 = zzgVar2.zza();
                zzc.zzg(zza2, iObjectWrapper2);
                zza2.writeInt(i);
                zzc.zzg(zza2, zzaVar2);
                zzgVar2.zzc(zza2, 7);
            } catch (RemoteException e2) {
                TransportImpl$$ExternalSyntheticLambda0.m(e2);
                return;
            }
        }
        OnMapChangedCallback onMapChangedCallback = new OnMapChangedCallback() { // from class: com.google.maps.android.compose.CameraPositionState$$ExternalSyntheticLambda2
            @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
            public final void onMapChangedLocked(GoogleMap googleMap2) {
                if (googleMap2 == null) {
                    GoogleMap.this.stopAnimation();
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("New GoogleMap unexpectedly set while an animation was still running");
                }
            }
        };
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = cameraPositionState.onMapChanged$delegate;
        OnMapChangedCallback onMapChangedCallback2 = (OnMapChangedCallback) parcelableSnapshotMutableState.getValue();
        if (onMapChangedCallback2 != null) {
            onMapChangedCallback2.onCancelLocked();
        }
        parcelableSnapshotMutableState.setValue(onMapChangedCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animate(final OneShotDisposable oneShotDisposable, final int i, ContinuationImpl continuationImpl) {
        CameraPositionState$animate$1 cameraPositionState$animate$1;
        int i2;
        Job job;
        if (continuationImpl instanceof CameraPositionState$animate$1) {
            cameraPositionState$animate$1 = (CameraPositionState$animate$1) continuationImpl;
            int i3 = cameraPositionState$animate$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                cameraPositionState$animate$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = cameraPositionState$animate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cameraPositionState$animate$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Job job2 = (Job) cameraPositionState$animate$1.getContext().get(Job.Key.$$INSTANCE);
                    try {
                        cameraPositionState$animate$1.L$1 = job2;
                        cameraPositionState$animate$1.label = 1;
                        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(cameraPositionState$animate$1));
                        cancellableContinuationImpl.initCancellability();
                        synchronized (Unit.INSTANCE) {
                            try {
                                this.movementOwner$delegate.setValue(job2);
                                GoogleMap map = getMap();
                                if (map == null) {
                                    OnMapChangedCallback onMapChangedCallback = new OnMapChangedCallback() { // from class: com.google.maps.android.compose.CameraPositionState$animate$2$1$animateOnMapAvailable$1
                                        @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
                                        public final void onCancelLocked() {
                                            Result.Companion companion = Result.Companion;
                                            CancellableContinuationImpl.this.resumeWith(new Result.Failure(new CancellationException("Animation cancelled")));
                                        }

                                        @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
                                        public final void onMapChangedLocked(GoogleMap googleMap) {
                                            CancellableContinuationImpl cancellableContinuationImpl2 = CancellableContinuationImpl.this;
                                            if (googleMap != null) {
                                                CameraPositionState.access$performAnimateCameraLocked(this, googleMap, oneShotDisposable, i, cancellableContinuationImpl2);
                                            } else {
                                                Result.Companion companion = Result.Companion;
                                                cancellableContinuationImpl2.resumeWith(new Result.Failure(new CancellationException("internal error; no GoogleMap available")));
                                                a$$ExternalSyntheticBUOutline0.m$1("internal error; no GoogleMap available to animate position");
                                            }
                                        }
                                    };
                                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.onMapChanged$delegate;
                                    OnMapChangedCallback onMapChangedCallback2 = (OnMapChangedCallback) parcelableSnapshotMutableState.getValue();
                                    if (onMapChangedCallback2 != null) {
                                        onMapChangedCallback2.onCancelLocked();
                                    }
                                    parcelableSnapshotMutableState.setValue(onMapChangedCallback);
                                    cancellableContinuationImpl.invokeOnCancellation(new Latch$await$2$2(18, this, onMapChangedCallback));
                                } else {
                                    access$performAnimateCameraLocked(this, map, oneShotDisposable, i, cancellableContinuationImpl);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        job = job2;
                    } catch (Throwable th2) {
                        th = th2;
                        job = job2;
                        synchronized (this.lock) {
                            if (job != null) {
                                if (this.movementOwner$delegate.getValue() == job) {
                                    this.movementOwner$delegate.setValue(null);
                                    GoogleMap map2 = getMap();
                                    if (map2 != null) {
                                        map2.stopAnimation();
                                    }
                                }
                            }
                        }
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    job = cameraPositionState$animate$1.L$1;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        synchronized (this.lock) {
                        }
                    }
                }
                synchronized (this.lock) {
                    if (job != null) {
                        if (this.movementOwner$delegate.getValue() == job) {
                            this.movementOwner$delegate.setValue(null);
                            GoogleMap map3 = getMap();
                            if (map3 != null) {
                                map3.stopAnimation();
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        cameraPositionState$animate$1 = new CameraPositionState$animate$1(this, continuationImpl);
        Object obj2 = cameraPositionState$animate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = cameraPositionState$animate$1.label;
        if (i2 != 0) {
        }
        synchronized (this.lock) {
        }
    }

    public final GoogleMap getMap() {
        return (GoogleMap) this.map$delegate.getValue();
    }

    public final void setMap$maps_compose_release(GoogleMap googleMap) {
        synchronized (this.lock) {
            try {
                if (getMap() == null && googleMap == null) {
                    return;
                }
                if (getMap() != null && googleMap != null) {
                    throw new IllegalStateException("CameraPositionState may only be associated with one GoogleMap at a time");
                }
                this.map$delegate.setValue(googleMap);
                if (googleMap == null) {
                    this.isMoving$delegate.setValue(Boolean.FALSE);
                } else {
                    googleMap.moveCamera(CameraUpdateFactory.newCameraPosition((CameraPosition) this.rawPosition$delegate.getValue()));
                }
                OnMapChangedCallback onMapChangedCallback = (OnMapChangedCallback) this.onMapChanged$delegate.getValue();
                if (onMapChangedCallback != null) {
                    this.onMapChanged$delegate.setValue(null);
                    onMapChangedCallback.onMapChangedLocked(googleMap);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setPosition(CameraPosition cameraPosition) {
        synchronized (this.lock) {
            GoogleMap map = getMap();
            if (map == null) {
                this.rawPosition$delegate.setValue(cameraPosition);
            } else {
                map.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
            }
        }
    }
}
