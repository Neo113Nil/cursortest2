package com.google.android.gms.internal.mlkit_genai_prompt;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzyj implements ObjectEncoder {
    public static final zzyj zza = new zzyj(0);
    public static final zzyj zza$1 = new zzyj(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzyj(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                if (obj == null) {
                    return;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
            case 1:
                if (obj == null) {
                    return;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
                objectEncoderContext.add(zzlo.zzb, entry.getKey());
                objectEncoderContext.add(zzlo.zzc, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
