package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.bumptech.glide.load.resource.gif.GifFrameLoader;
import com.fillr.n;
import com.google.android.material.snackbar.SnackbarManager$SnackbarRecord;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzm implements Handler.Callback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzm(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.$r8$classId) {
            case 0:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    CameraState$Type$EnumUnboxingLocalUtility.m(i, "Received response to request: ", "MessengerIpcClient");
                }
                zzp zzpVar = (zzp) this.zza;
                synchronized (zzpVar) {
                    try {
                        zzr zzrVar = (zzr) zzpVar.zze.get(i);
                        if (zzrVar != null) {
                            zzpVar.zze.remove(i);
                            zzpVar.zzf();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (zzrVar.$r8$classId) {
                                    case 0:
                                        if (!data.getBoolean("ack", false)) {
                                            zzrVar.zzc(new zzt("Invalid response to one way request", null));
                                            break;
                                        } else {
                                            zzrVar.zzd(null);
                                            break;
                                        }
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        zzrVar.zzd(bundle);
                                        break;
                                }
                            } else {
                                zzrVar.zzc(new zzt("Not supported by GmsCore", null));
                            }
                        } else {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                        }
                    } finally {
                    }
                }
                return true;
            case 1:
                GifFrameLoader gifFrameLoader = (GifFrameLoader) this.zza;
                int i2 = message.what;
                if (i2 == 1) {
                    gifFrameLoader.onFrameReady((GifFrameLoader.DelayTarget) message.obj);
                    return true;
                }
                if (i2 == 2) {
                    gifFrameLoader.requestManager.clear((GifFrameLoader.DelayTarget) message.obj);
                }
                return false;
            default:
                if (message.what != 0) {
                    return false;
                }
                n nVar = (n) this.zza;
                SnackbarManager$SnackbarRecord snackbarManager$SnackbarRecord = (SnackbarManager$SnackbarRecord) message.obj;
                synchronized (nVar.a) {
                    if (((SnackbarManager$SnackbarRecord) nVar.c) == snackbarManager$SnackbarRecord || ((SnackbarManager$SnackbarRecord) nVar.d) == snackbarManager$SnackbarRecord) {
                        nVar.cancelSnackbarLocked(snackbarManager$SnackbarRecord, 2);
                    }
                }
                return true;
        }
    }
}
