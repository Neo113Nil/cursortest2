package com.google.android.gms.internal.measurement;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzacb {
    protected transient int zza;

    public final byte[] zzcd() {
        try {
            zzadu zzaduVar = (zzadu) this;
            int zzcq = zzaduVar.zzcq();
            byte[] bArr = new byte[zzcq];
            boolean z = zzada.zzc;
            zzacx zzacxVar = new zzacx(bArr, zzcq);
            zzaduVar.zzcH(zzacxVar);
            zzacxVar.zzH();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            OptionalProvider$$ExternalSyntheticLambda0.m(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), (Throwable) e);
            return null;
        }
    }

    public abstract int zzcf(zzafp zzafpVar);
}
