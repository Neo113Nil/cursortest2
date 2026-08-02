package com.google.android.play.core.review.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;
import android.util.Log;
import androidx.camera.video.VideoEncoderSession;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.IMultiInstanceInvalidationService$Stub$Proxy;
import androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1;
import androidx.room.MultiInstanceInvalidationService$binder$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.core.appupdate.internal.zzx;

/* loaded from: classes4.dex */
public final class zzr implements ServiceConnection {
    public final /* synthetic */ int $r8$classId;
    public Object zza;

    public /* synthetic */ zzr(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.room.IMultiInstanceInvalidationService] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IMultiInstanceInvalidationService$Stub$Proxy iMultiInstanceInvalidationService$Stub$Proxy;
        IInterface queryLocalInterface;
        switch (this.$r8$classId) {
            case 0:
                zzt zztVar = (zzt) this.zza;
                zztVar.zzc.zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                zztVar.zzc().post(new com.google.android.play.core.review.zzf(this, iBinder));
                break;
            case 1:
                componentName.getClass();
                iBinder.getClass();
                VideoEncoderSession videoEncoderSession = (VideoEncoderSession) this.zza;
                int i = MultiInstanceInvalidationService$binder$1.$r8$clinit;
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface(IMultiInstanceInvalidationService.DESCRIPTOR);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof IMultiInstanceInvalidationService)) {
                    IMultiInstanceInvalidationService$Stub$Proxy iMultiInstanceInvalidationService$Stub$Proxy2 = new IMultiInstanceInvalidationService$Stub$Proxy();
                    iMultiInstanceInvalidationService$Stub$Proxy2.mRemote = iBinder;
                    iMultiInstanceInvalidationService$Stub$Proxy = iMultiInstanceInvalidationService$Stub$Proxy2;
                } else {
                    iMultiInstanceInvalidationService$Stub$Proxy = (IMultiInstanceInvalidationService) queryLocalInterface2;
                }
                videoEncoderSession.mSurfaceRequest = iMultiInstanceInvalidationService$Stub$Proxy;
                try {
                    videoEncoderSession.mVideoEncoderState = iMultiInstanceInvalidationService$Stub$Proxy.registerCallback((MultiInstanceInvalidationClient$invalidationCallback$1) videoEncoderSession.mReleasedCompleter, (String) videoEncoderSession.mExecutor);
                    break;
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
                    return;
                }
                break;
            case 2:
                zzx zzxVar = (zzx) this.zza;
                zzxVar.zzc.zzd("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                zzxVar.zzc().post(new com.google.android.play.core.appupdate.internal.zzt(this, iBinder));
                break;
            default:
                if (((Context) this.zza) == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Custom Tabs Service connected before an applicationcontext has been provided.");
                    break;
                } else {
                    int i2 = ICustomTabsService.Stub.$r8$clinit;
                    if (iBinder != null && (queryLocalInterface = iBinder.queryLocalInterface(ICustomTabsService.DESCRIPTOR)) != null && (queryLocalInterface instanceof ICustomTabsService)) {
                    }
                    componentName.getClass();
                    break;
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                zzt zztVar = (zzt) this.zza;
                zztVar.zzc.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                zztVar.zzc().post(new zzn(this, i));
                break;
            case 1:
                componentName.getClass();
                ((VideoEncoderSession) this.zza).mSurfaceRequest = null;
                break;
            case 2:
                zzx zzxVar = (zzx) this.zza;
                zzxVar.zzc.zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                zzxVar.zzc().post(new com.google.android.play.core.appupdate.internal.zzr(this, 1));
                break;
            default:
                componentName.getClass();
                break;
        }
    }

    public /* synthetic */ zzr() {
        this.$r8$classId = 3;
    }
}
