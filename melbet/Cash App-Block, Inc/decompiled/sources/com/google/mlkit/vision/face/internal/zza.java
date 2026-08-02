package com.google.mlkit.vision.face.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.media3.common.FlagSet;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzoy;
import com.google.android.gms.internal.mlkit_vision_face.zzoz;
import com.google.android.gms.internal.mlkit_vision_face.zzpa;
import com.google.android.gms.internal.mlkit_vision_face.zzpb;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.jvm.internal.types.KTypeSubstitutorKt;

/* loaded from: classes4.dex */
public final class zza implements zzb {
    public final Context zza;
    public final FaceDetectorOptions zzb;
    public boolean zzc;
    public boolean zzd;
    public boolean zze;
    public final zzoc zzf;
    public zzoy zzh;

    public zza(Context context, FaceDetectorOptions faceDetectorOptions, zzoc zzocVar) {
        this.zza = context;
        this.zzb = faceDetectorOptions;
        this.zzf = zzocVar;
    }

    public static boolean zzc(Context context) {
        return DynamiteModule.getLocalVersion(context, "com.google.mlkit.dynamite.face") > 0;
    }

    @Override // com.google.mlkit.vision.face.internal.zzb
    public final Pair zza(InputImage inputImage) {
        ArrayList arrayList;
        if (this.zzh == null) {
            zzd();
        }
        if (!this.zzc) {
            try {
                zzoy zzoyVar = this.zzh;
                if (zzoyVar != null) {
                    zzoyVar.zzc(zzoyVar.zza(), 1);
                }
                this.zzc = true;
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to init face detector.");
            }
        }
        zzoy zzoyVar2 = this.zzh;
        if (zzoyVar2 != null) {
            if (inputImage.zzg == -1) {
                ByteBuffer convertToNv21Buffer = KTypeSubstitutorKt.convertToNv21Buffer(inputImage);
                int i = inputImage.zzd;
                int i2 = inputImage.zze;
                int i3 = inputImage.zzf;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                inputImage = new InputImage(convertToNv21Buffer, i, i2, i3);
                InputImage.zzc(17, 3, i2, i, convertToNv21Buffer.limit(), i3, elapsedRealtime);
            }
            int i4 = inputImage.zzg;
            int i5 = inputImage.zzd;
            int i6 = inputImage.zze;
            int convertToMVRotation = CommonConvertUtils.convertToMVRotation(inputImage.zzf);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            ObjectWrapper imageDataWrapper = com.google.mlkit.vision.common.internal.zzc.getImageDataWrapper(inputImage);
            try {
                Parcel zza = zzoyVar2.zza();
                int i7 = com.google.android.gms.internal.mlkit_vision_face.zzc.$r8$clinit;
                zza.writeStrongBinder(imageDataWrapper);
                zza.writeInt(1);
                int zzb = MooncakeHeaderViewKt.zzb(zza, 20293);
                MooncakeHeaderViewKt.zza(zza, 1, 4);
                zza.writeInt(i4);
                MooncakeHeaderViewKt.zza(zza, 2, 4);
                zza.writeInt(i5);
                MooncakeHeaderViewKt.zza(zza, 3, 4);
                zza.writeInt(i6);
                MooncakeHeaderViewKt.zza(zza, 4, 4);
                zza.writeInt(convertToMVRotation);
                MooncakeHeaderViewKt.zza(zza, 5, 8);
                zza.writeLong(elapsedRealtime2);
                MooncakeHeaderViewKt.zzc(zza, zzb);
                Parcel zzb2 = zzoyVar2.zzb(zza, 3);
                ArrayList createTypedArrayList = zzb2.createTypedArrayList(zzow.CREATOR);
                zzb2.recycle();
                arrayList = new ArrayList();
                Iterator it = createTypedArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Face((zzow) it.next()));
                }
                this.zzb.getClass();
                AtomicBoolean atomicBoolean = zzh.zza;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((Face) it2.next()).zzb = -1;
                }
            } catch (RemoteException e2) {
                throw new MlKitException(13, e2, "Failed to run face detector.");
            }
        } else {
            arrayList = null;
        }
        return new Pair(arrayList, null);
    }

    @Override // com.google.mlkit.vision.face.internal.zzb
    public final void zzb() {
        try {
            zzoy zzoyVar = this.zzh;
            if (zzoyVar != null) {
                zzoyVar.zzc(zzoyVar.zza(), 2);
                this.zzh = null;
            }
        } catch (RemoteException e) {
            Log.e("DecoupledFaceDelegate", "Failed to release face detector.", e);
        }
        this.zzc = false;
    }

    @Override // com.google.mlkit.vision.face.internal.zzb
    public final boolean zzd() {
        if (this.zzh != null) {
            return this.zzd;
        }
        Context context = this.zza;
        int localVersion = DynamiteModule.getLocalVersion(context, "com.google.mlkit.dynamite.face");
        int i = 8;
        zzkt zzktVar = zzkt.ON_DEVICE_FACE_LOAD;
        zzoc zzocVar = this.zzf;
        if (localVersion > 0) {
            this.zzd = true;
            try {
                zzf();
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to create thick face detector.");
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException(13, e2, "Failed to load the bundled face module.");
            }
        } else {
            this.zzd = false;
            try {
                zzf();
            } catch (RemoteException e3) {
                boolean z = this.zzd;
                AtomicReference atomicReference = zzj.zza;
                zzocVar.zzf(new FlagSet.Builder(z, zzks.OPTIONAL_MODULE_INIT_ERROR, i), zzktVar);
                throw new MlKitException(13, e3, "Failed to create thin face detector.");
            } catch (DynamiteModule.LoadingException e4) {
                if (!this.zze) {
                    OptionalModuleUtils.requestDownload(context, "face");
                    this.zze = true;
                }
                boolean z2 = this.zzd;
                AtomicReference atomicReference2 = zzj.zza;
                zzocVar.zzf(new FlagSet.Builder(z2, zzks.OPTIONAL_MODULE_NOT_AVAILABLE, i), zzktVar);
                throw new MlKitException(14, e4, "Waiting for the face module to be downloaded. Please wait.");
            }
        }
        boolean z3 = this.zzd;
        AtomicReference atomicReference3 = zzj.zza;
        zzocVar.zzf(new FlagSet.Builder(z3, zzks.NO_ERROR, i), zzktVar);
        return this.zzd;
    }

    public final zzoy zze(DynamiteModule.VersionPolicy versionPolicy, String str, String str2, zzou zzouVar) {
        zzpb zzozVar;
        Context context = this.zza;
        IBinder instantiate = DynamiteModule.load(context, versionPolicy, str).instantiate(str2);
        int i = zzpa.$r8$clinit;
        zzoy zzoyVar = null;
        if (instantiate == null) {
            zzozVar = null;
        } else {
            IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
            zzozVar = queryLocalInterface instanceof zzpb ? (zzpb) queryLocalInterface : new zzoz(instantiate, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator", 8);
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        zzoz zzozVar2 = (zzoz) zzozVar;
        Parcel zza = zzozVar2.zza();
        int i2 = com.google.android.gms.internal.mlkit_vision_face.zzc.$r8$clinit;
        zza.writeStrongBinder(objectWrapper);
        zza.writeInt(1);
        zzouVar.writeToParcel(zza, 0);
        Parcel zzb = zzozVar2.zzb(zza, 1);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
            zzoyVar = queryLocalInterface2 instanceof zzoy ? (zzoy) queryLocalInterface2 : new zzoy(readStrongBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector", 8);
        }
        zzb.recycle();
        return zzoyVar;
    }

    public final void zzf() {
        FaceDetectorOptions faceDetectorOptions = this.zzb;
        faceDetectorOptions.getClass();
        if (this.zzh == null) {
            zzou zzouVar = new zzou(1, faceDetectorOptions.zza, 1, 1, false, faceDetectorOptions.zzf);
            this.zzh = this.zzd ? zze(DynamiteModule.PREFER_LOCAL, "com.google.mlkit.dynamite.face", "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator", zzouVar) : zze(DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.face", "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", zzouVar);
        }
    }
}
