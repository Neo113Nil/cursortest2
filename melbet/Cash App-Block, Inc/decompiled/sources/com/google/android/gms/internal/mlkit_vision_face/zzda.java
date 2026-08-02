package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.proto.ProtobufDataEncoderContext;

/* loaded from: classes4.dex */
public final class zzda implements ValueEncoderContext {
    public final /* synthetic */ int $r8$classId;
    public boolean zza = false;
    public boolean zzb = false;
    public FieldDescriptor zzc;
    public final ObjectEncoderContext zzd;

    public /* synthetic */ zzda(ObjectEncoderContext objectEncoderContext, int i) {
        this.$r8$classId = i;
        this.zzd = objectEncoderContext;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String str) {
        int i = this.$r8$classId;
        ObjectEncoderContext objectEncoderContext = this.zzd;
        switch (i) {
            case 0:
                if (!this.zza) {
                    this.zza = true;
                    ((zzcw) objectEncoderContext).zzc(this.zzc, str, this.zzb);
                    break;
                } else {
                    TransportImpl$$ExternalSyntheticLambda0.m$1("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 1:
                if (!this.zza) {
                    this.zza = true;
                    ((com.google.android.gms.internal.mlkit_genai_prompt.zzlo) objectEncoderContext).zzc(this.zzc, str, this.zzb);
                    break;
                } else {
                    TransportImpl$$ExternalSyntheticLambda0.m$1("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 2:
                if (!this.zza) {
                    this.zza = true;
                    ((com.google.android.gms.internal.mlkit_vision_barcode.zzfg) objectEncoderContext).zzc(this.zzc, str, this.zzb);
                    break;
                } else {
                    TransportImpl$$ExternalSyntheticLambda0.m$1("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 3:
                if (!this.zza) {
                    this.zza = true;
                    ((com.google.android.gms.internal.mlkit_vision_common.zzak) objectEncoderContext).zzc(this.zzc, str, this.zzb);
                    break;
                } else {
                    TransportImpl$$ExternalSyntheticLambda0.m$1("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 4:
                if (!this.zza) {
                    this.zza = true;
                    ((zzcz) objectEncoderContext).zzc(this.zzc, str, this.zzb);
                    break;
                } else {
                    TransportImpl$$ExternalSyntheticLambda0.m$1("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            default:
                if (!this.zza) {
                    this.zza = true;
                    ((ProtobufDataEncoderContext) objectEncoderContext).add(this.zzc, str, this.zzb);
                    break;
                } else {
                    TransportImpl$$ExternalSyntheticLambda0.m$1("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
        }
        return null;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) {
        int i = this.$r8$classId;
        ObjectEncoderContext objectEncoderContext = this.zzd;
        switch (i) {
            case 0:
                if (!this.zza) {
                    this.zza = true;
                    ((zzcw) objectEncoderContext).zzd$3(this.zzc, z ? 1 : 0, this.zzb);
                    break;
                } else {
                    TransportImpl$$ExternalSyntheticLambda0.m$1("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 1:
                if (!this.zza) {
                    this.zza = true;
                    ((com.google.android.gms.internal.mlkit_genai_prompt.zzlo) objectEncoderContext).zzd(this.zzc, z ? 1 : 0, this.zzb);
                    break;
                } else {
                    TransportImpl$$ExternalSyntheticLambda0.m$1("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 2:
                if (!this.zza) {
                    this.zza = true;
                    ((com.google.android.gms.internal.mlkit_vision_barcode.zzfg) objectEncoderContext).zzd$1(this.zzc, z ? 1 : 0, this.zzb);
                    break;
                } else {
                    TransportImpl$$ExternalSyntheticLambda0.m$1("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 3:
                if (!this.zza) {
                    this.zza = true;
                    ((com.google.android.gms.internal.mlkit_vision_common.zzak) objectEncoderContext).zzd$2(this.zzc, z ? 1 : 0, this.zzb);
                    break;
                } else {
                    TransportImpl$$ExternalSyntheticLambda0.m$1("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            case 4:
                if (!this.zza) {
                    this.zza = true;
                    ((zzcz) objectEncoderContext).zzd$4(this.zzc, z ? 1 : 0, this.zzb);
                    break;
                } else {
                    TransportImpl$$ExternalSyntheticLambda0.m$1("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
            default:
                if (!this.zza) {
                    this.zza = true;
                    ((ProtobufDataEncoderContext) objectEncoderContext).add(this.zzc, z ? 1 : 0, this.zzb);
                    break;
                } else {
                    TransportImpl$$ExternalSyntheticLambda0.m$1("Cannot encode a second value in the ValueEncoderContext");
                    break;
                }
        }
        return null;
    }
}
