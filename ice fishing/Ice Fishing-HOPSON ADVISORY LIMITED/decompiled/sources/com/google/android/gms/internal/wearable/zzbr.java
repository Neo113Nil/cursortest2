package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzbq;
import com.google.android.gms.internal.wearable.zzbr;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public abstract class zzbr<MessageType extends zzbr<MessageType, BuilderType>, BuilderType extends zzbq<MessageType, BuilderType>> implements zzel {
    protected transient int zza = 0;

    protected static void zzK(Iterable iterable, List list) {
        zzbq.zzp(iterable, list);
    }

    @Override // com.google.android.gms.internal.wearable.zzel
    public final zzcg zzH() {
        try {
            int zzT = zzT();
            zzcg zzcgVar = zzcg.zza;
            byte[] bArr = new byte[zzT];
            int i = zzcn.zzb;
            zzcl zzclVar = new zzcl(bArr, 0, zzT);
            zzag(zzclVar);
            zzclVar.zzw();
            return new zzcf(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] zzI() {
        try {
            int zzT = zzT();
            byte[] bArr = new byte[zzT];
            int i = zzcn.zzb;
            zzcl zzclVar = new zzcl(bArr, 0, zzT);
            zzag(zzclVar);
            zzclVar.zzw();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    int zzJ(zzey zzeyVar) {
        throw null;
    }
}
