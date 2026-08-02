package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.zzaj;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public abstract class zzcc {
    public static Context zzb;
    public static volatile zze zzc;
    public static final ConcurrentLinkedQueue zzd = new ConcurrentLinkedQueue();

    public static zze zza(Context context) {
        zzae.checkNotNull(context);
        Log.d("zzcc", "preferredRenderer: ".concat("null"));
        if (zzc == null) {
            int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
            if (isGooglePlayServicesAvailable != 0) {
                throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
            }
            zzc = zze(context, 0);
            try {
                int zzd2 = zzc.zzd();
                String packageName = context.getPackageName();
                if (zzd2 != 2 || packageName.equals("com.google.android.apps.photos")) {
                    Log.d("zzcc", "not early loading native code");
                } else {
                    Log.d("zzcc", "early loading native code");
                    try {
                        zzc.zzn(new ObjectWrapper(zzd(context, 0)));
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    } catch (UnsatisfiedLinkError unused) {
                        Log.w("zzcc", "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                        zzb = null;
                        zzc = zze(context, 1);
                    }
                }
                try {
                    zzc.zzl(new ObjectWrapper(zzd(context, 0).getResources()));
                    while (true) {
                        ConcurrentLinkedQueue concurrentLinkedQueue = zzd;
                        if (concurrentLinkedQueue.isEmpty()) {
                            break;
                        }
                        try {
                            zzaj zzajVar = (zzaj) concurrentLinkedQueue.poll();
                            zzae.checkNotNull(zzajVar);
                            zzc.zzk(new ObjectWrapper(zzajVar.zza), zzajVar.zzb);
                        } catch (RemoteException e2) {
                            throw new RuntimeRemoteException(e2);
                        }
                    }
                } catch (RemoteException e3) {
                    throw new RuntimeRemoteException(e3);
                }
            } catch (RemoteException e4) {
                throw new RuntimeRemoteException(e4);
            }
        }
        return zzc;
    }

    public static Context zzd(Context context, int i) {
        Context remoteContext;
        Context context2 = zzb;
        if (context2 != null) {
            return context2;
        }
        String str = i == 1 ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            remoteContext = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, str).zzk;
        } catch (Exception e) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                Log.e("zzcc", "Failed to load maps module, use pre-Chimera", e);
                remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
            } else {
                try {
                    Log.d("zzcc", "Attempting to load maps_dynamite again.");
                    remoteContext = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").zzk;
                } catch (Exception e2) {
                    Log.e("zzcc", "Failed to load maps module, use pre-Chimera", e2);
                    remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
                }
            }
        }
        zzb = remoteContext;
        if (remoteContext != null) {
            return remoteContext;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1("Unable to load maps module, maps container context is null");
        return null;
    }

    public static zze zze(Context context, int i) {
        Log.i("zzcc", "Making Creator dynamically");
        ClassLoader classLoader = zzd(context, i).getClassLoader();
        try {
            zzae.checkNotNull(classLoader);
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                IBinder iBinder = (IBinder) loadClass.newInstance();
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    return queryLocalInterface instanceof zze ? (zze) queryLocalInterface : new zze(iBinder);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
                return null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(loadClass.getName()), e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(loadClass.getName()), e2);
            }
        } catch (ClassNotFoundException e3) {
            a$$ExternalSyntheticBUOutline0.m("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e3);
            return null;
        }
    }
}
