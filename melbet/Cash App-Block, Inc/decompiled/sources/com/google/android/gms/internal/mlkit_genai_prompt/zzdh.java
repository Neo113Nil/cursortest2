package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.google.android.gms.internal.maps.zzb;
import com.stripe.android.model.parsers.TokenJsonParser;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final class zzdh extends zzb implements zzar {
    public final /* synthetic */ Executor zza;
    public final /* synthetic */ zzdb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdb zzdbVar, Executor executor) {
        super("com.google.android.apps.aicore.aidl.ICortanaStateCallback", 4);
        this.zza = executor;
        Objects.requireNonNull(zzdbVar);
        this.zzb = zzdbVar;
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(Parcel parcel, int i) {
        if (i != 2) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzl.zza(parcel, ParcelFileDescriptor.CREATOR);
        zzl.zzb(parcel);
        zzdb zzdbVar = this.zzb;
        ParcelFileDescriptor parcelFileDescriptor2 = zzdbVar.zza;
        final zzfr zzfrVar = new zzfr();
        Object[] objArr = new Object[4];
        Pair create = Pair.create(parcelFileDescriptor, parcelFileDescriptor2);
        create.getClass();
        int zza = TokenJsonParser.zza(4, 1);
        if (zza > 4) {
            objArr = Arrays.copyOf(objArr, zza);
        }
        objArr[0] = create;
        zzfrVar.zza = zzil.zzi(1, objArr);
        zzfrVar.zzb = this.zza;
        final zzeo zzeoVar = zzdbVar.zzh;
        ((zzir) zzfrVar.zza).forEach(new Consumer() { // from class: com.google.android.gms.internal.mlkit_genai_prompt.zzfp
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Executor) zzfr.this.zzb).execute(new zzfq(0, (Pair) obj, zzeoVar));
            }
        });
        return true;
    }
}
