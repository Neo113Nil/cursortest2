package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzdb;
import com.google.android.gms.internal.wearable.zzdg;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public class zzdb<MessageType extends zzdg<MessageType, BuilderType>, BuilderType extends zzdb<MessageType, BuilderType>> extends zzbq<MessageType, BuilderType> {
    protected zzdg zza;
    private final zzdg zzb;

    protected zzdb(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzL()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzO();
    }

    @Override // com.google.android.gms.internal.wearable.zzem
    public final boolean zzaf() {
        boolean zzd;
        zzd = zzdg.zzd(this.zza, false);
        return zzd;
    }

    @Override // com.google.android.gms.internal.wearable.zzem
    public final /* synthetic */ zzel zzai() {
        throw null;
    }

    protected final void zzq() {
        if (this.zza.zzL()) {
            return;
        }
        zzr();
    }

    protected void zzr() {
        zzdg zzO = this.zzb.zzO();
        zzeu.zza().zzb(zzO.getClass()).zzd(zzO, this.zza);
        this.zza = zzO;
    }

    @Override // com.google.android.gms.internal.wearable.zzbq
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdb zzo() {
        zzdb zzdbVar = (zzdb) this.zzb.zzG(5, null, null);
        zzdbVar.zza = zzw();
        return zzdbVar;
    }

    @Override // com.google.android.gms.internal.wearable.zzek
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public MessageType zzw() {
        if (!this.zza.zzL()) {
            return (MessageType) this.zza;
        }
        this.zza.zzQ();
        return (MessageType) this.zza;
    }

    public final MessageType zzv() {
        MessageType zzw = zzw();
        if (zzw.zzaf()) {
            return zzw;
        }
        throw new zzfh(zzw);
    }
}
