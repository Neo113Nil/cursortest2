package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.room.Room;
import androidx.tracing.Trace;
import com.fillr.e;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzym;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyo;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.zzc;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public final class zzo implements zzm {
    public static final zzdk zza;
    public boolean zzb;
    public boolean zzc;
    public boolean zzd;
    public final Context zze;
    public final BarcodeScannerOptions zzf;
    public final zzwp zzg;
    public zzyl zzh;

    static {
        zzcq zzcqVar = zzcs.zza;
        Object[] objArr = {"com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite"};
        Trace.zza(2, objArr);
        zza = new zzdk(2, objArr);
    }

    public zzo(Context context, BarcodeScannerOptions barcodeScannerOptions, zzwp zzwpVar) {
        this.zze = context;
        this.zzf = barcodeScannerOptions;
        this.zzg = zzwpVar;
    }

    public static boolean zzd(Context context) {
        return DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final ArrayList zza(InputImage inputImage) {
        if (this.zzh == null) {
            zzc();
        }
        zzyl zzylVar = this.zzh;
        zzae.checkNotNull(zzylVar);
        if (!this.zzb) {
            try {
                zzylVar.zzc(zzylVar.zza(), 1);
                this.zzb = true;
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to init barcode scanner.");
            }
        }
        int i = inputImage.zzd;
        int i2 = inputImage.zzg;
        if (i2 == 35) {
            Image.Plane[] planes = inputImage.getPlanes();
            zzae.checkNotNull(planes);
            i = planes[0].getRowStride();
        }
        int i3 = inputImage.zze;
        int convertToMVRotation = CommonConvertUtils.convertToMVRotation(inputImage.zzf);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ObjectWrapper imageDataWrapper = zzc.getImageDataWrapper(inputImage);
        try {
            Parcel zza2 = zzylVar.zza();
            int i4 = com.google.android.gms.internal.mlkit_vision_barcode.zzc.$r8$clinit;
            zza2.writeStrongBinder(imageDataWrapper);
            zza2.writeInt(1);
            int zzb = MooncakeHeaderViewKt.zzb(zza2, 20293);
            MooncakeHeaderViewKt.zza(zza2, 1, 4);
            zza2.writeInt(i2);
            MooncakeHeaderViewKt.zza(zza2, 2, 4);
            zza2.writeInt(i);
            MooncakeHeaderViewKt.zza(zza2, 3, 4);
            zza2.writeInt(i3);
            MooncakeHeaderViewKt.zza(zza2, 4, 4);
            zza2.writeInt(convertToMVRotation);
            MooncakeHeaderViewKt.zza(zza2, 5, 8);
            zza2.writeLong(elapsedRealtime);
            MooncakeHeaderViewKt.zzc(zza2, zzb);
            Parcel zzb2 = zzylVar.zzb(zza2, 3);
            ArrayList createTypedArrayList = zzb2.createTypedArrayList(zzyb.CREATOR);
            zzb2.recycle();
            ArrayList arrayList = new ArrayList();
            Iterator it = createTypedArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(new Barcode(new zzr((zzyb) it.next(), 11)));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new MlKitException(13, e2, "Failed to run barcode scanner.");
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final void zzb() {
        zzyl zzylVar = this.zzh;
        if (zzylVar != null) {
            try {
                zzylVar.zzc(zzylVar.zza(), 2);
            } catch (RemoteException e) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.zzh = null;
            this.zzb = false;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final boolean zzc() {
        if (this.zzh != null) {
            return this.zzc;
        }
        Context context = this.zze;
        boolean zzd = zzd(context);
        zzwp zzwpVar = this.zzg;
        if (zzd) {
            this.zzc = true;
            try {
                this.zzh = zze(DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to create thick barcode scanner.");
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException(13, e2, "Failed to load the bundled barcode module.");
            }
        } else {
            boolean z = false;
            this.zzc = false;
            Feature[] featureArr = OptionalModuleUtils.EMPTY_FEATURES;
            GoogleApiAvailabilityLight.zza.getClass();
            int apkVersion = GoogleApiAvailabilityLight.getApkVersion(context);
            zzdk zzdkVar = zza;
            if (apkVersion >= 221500000) {
                try {
                    zzw areModulesAvailable = new zay(context, null, zay.zae, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS).areModulesAvailable(new com.google.mlkit.common.sdkinternal.zzo(OptionalModuleUtils.zza(OptionalModuleUtils.zzb, zzdkVar), 1));
                    e eVar = new e();
                    areModulesAvailable.getClass();
                    areModulesAvailable.addOnFailureListener(TaskExecutors.MAIN_THREAD, eVar);
                    z = ((ModuleAvailabilityResponse) Room.await(areModulesAvailable)).zaa;
                } catch (InterruptedException | ExecutionException e3) {
                    Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e3);
                }
            } else {
                try {
                    zzcq listIterator = zzdkVar.listIterator(0);
                    while (listIterator.hasNext()) {
                        DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, (String) listIterator.next());
                    }
                    z = true;
                } catch (DynamiteModule.LoadingException unused) {
                }
            }
            if (!z) {
                if (!this.zzd) {
                    Object[] objArr = {"barcode", "tflite_dynamite"};
                    Trace.zza(2, objArr);
                    OptionalModuleUtils.requestDownload(context, new zzdk(2, objArr));
                    this.zzd = true;
                }
                zzb.zze(zzwpVar, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.zzh = zze(DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e4) {
                zzb.zze(zzwpVar, zzrb.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException(13, e4, "Failed to create thin barcode scanner.");
            }
        }
        zzb.zze(zzwpVar, zzrb.NO_ERROR);
        return this.zzc;
    }

    public final zzyl zze(DynamiteModule.VersionPolicy versionPolicy, String str, String str2) {
        IInterface zzymVar;
        Context context = this.zze;
        IBinder instantiate = DynamiteModule.load(context, versionPolicy, str).instantiate(str2);
        int i = zzyn.$r8$clinit;
        zzyl zzylVar = null;
        if (instantiate == null) {
            zzymVar = null;
        } else {
            IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
            zzymVar = queryLocalInterface instanceof zzyo ? (zzyo) queryLocalInterface : new zzym(instantiate, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator", 7);
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        BarcodeScannerOptions barcodeScannerOptions = this.zzf;
        int i2 = barcodeScannerOptions.zza;
        int i3 = barcodeScannerOptions.zzd != null ? 1 : 0;
        zzym zzymVar2 = (zzym) zzymVar;
        Parcel zza2 = zzymVar2.zza();
        int i4 = com.google.android.gms.internal.mlkit_vision_barcode.zzc.$r8$clinit;
        zza2.writeStrongBinder(objectWrapper);
        zza2.writeInt(1);
        int zzb = MooncakeHeaderViewKt.zzb(zza2, 20293);
        MooncakeHeaderViewKt.zza(zza2, 1, 4);
        zza2.writeInt(i2);
        MooncakeHeaderViewKt.zza(zza2, 2, 4);
        zza2.writeInt(i3);
        MooncakeHeaderViewKt.zzc(zza2, zzb);
        Parcel zzb2 = zzymVar2.zzb(zza2, 1);
        IBinder readStrongBinder = zzb2.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            zzylVar = queryLocalInterface2 instanceof zzyl ? (zzyl) queryLocalInterface2 : new zzyl(readStrongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner", 7);
        }
        zzb2.recycle();
        return zzylVar;
    }
}
