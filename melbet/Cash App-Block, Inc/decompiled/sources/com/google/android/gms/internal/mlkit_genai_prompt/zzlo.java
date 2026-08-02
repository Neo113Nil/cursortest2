package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.recyclerview.widget.RecyclerView;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzda;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzlo implements ObjectEncoderContext {
    public static final Charset zza = Charset.forName("UTF-8");
    public static final FieldDescriptor zzb = new FieldDescriptor("key", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("value", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(2))));
    public static final zzyj zzd = new zzyj(2);
    public OutputStream zze;
    public final HashMap zzf;
    public final HashMap zzg;
    public final ObjectEncoder zzh;
    public final zzda zzi = new zzda(this, 1);

    public zzlo(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ObjectEncoder objectEncoder) {
        this.zze = byteArrayOutputStream;
        this.zzf = hashMap;
        this.zzg = hashMap2;
        this.zzh = objectEncoder;
    }

    public static int zzh(FieldDescriptor fieldDescriptor) {
        zzlm zzlmVar = (zzlm) fieldDescriptor.getProperty(zzlm.class);
        if (zzlmVar != null) {
            return zzlmVar.zza();
        }
        TransportImpl$$ExternalSyntheticLambda0.m$1("Field has no @Protobuf config");
        return 0;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        zzd(fieldDescriptor, i, true);
        return this;
    }

    public final void zzc(FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            zzn((zzh(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zze.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                zzc(fieldDescriptor, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzk(zzd, fieldDescriptor, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == 0.0d) {
                return;
            }
            zzn((zzh(fieldDescriptor) << 3) | 1);
            this.zze.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == RecyclerView.DECELERATION_RATE) {
                return;
            }
            zzn((zzh(fieldDescriptor) << 3) | 5);
            this.zze.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            zze(fieldDescriptor, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            zzd(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            zzn((zzh(fieldDescriptor) << 3) | 2);
            zzn(bArr.length);
            this.zze.write(bArr);
            return;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
        if (objectEncoder != null) {
            zzk(objectEncoder, fieldDescriptor, obj, z);
            return;
        }
        ValueEncoder valueEncoder = (ValueEncoder) this.zzg.get(obj.getClass());
        if (valueEncoder != null) {
            zzda zzdaVar = this.zzi;
            zzdaVar.zza = false;
            zzdaVar.zzc = fieldDescriptor;
            zzdaVar.zzb = z;
            valueEncoder.encode(obj, zzdaVar);
            return;
        }
        if (obj instanceof zzlk) {
            zzd(fieldDescriptor, ((zzlk) obj).zza(), true);
        } else if (obj instanceof Enum) {
            zzd(fieldDescriptor, ((Enum) obj).ordinal(), true);
        } else {
            zzk(this.zzh, fieldDescriptor, obj, z);
        }
    }

    public final void zzd(FieldDescriptor fieldDescriptor, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        zzlm zzlmVar = (zzlm) fieldDescriptor.getProperty(zzlm.class);
        if (zzlmVar == null) {
            TransportImpl$$ExternalSyntheticLambda0.m$1("Field has no @Protobuf config");
            return;
        }
        int ordinal = zzlmVar.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzlmVar.zza() << 3);
            zzn(i);
        } else if (ordinal == 1) {
            zzn(zzlmVar.zza() << 3);
            zzn((i + i) ^ (i >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            zzn((zzlmVar.zza() << 3) | 5);
            this.zze.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    public final void zze(FieldDescriptor fieldDescriptor, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        zzlm zzlmVar = (zzlm) fieldDescriptor.getProperty(zzlm.class);
        if (zzlmVar == null) {
            TransportImpl$$ExternalSyntheticLambda0.m$1("Field has no @Protobuf config");
            return;
        }
        int ordinal = zzlmVar.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzlmVar.zza() << 3);
            zzo(j);
        } else if (ordinal == 1) {
            zzn(zzlmVar.zza() << 3);
            zzo((j >> 63) ^ (j + j));
        } else {
            if (ordinal != 2) {
                return;
            }
            zzn((zzlmVar.zza() << 3) | 1);
            this.zze.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void zzk(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        com.google.android.gms.internal.mlkit_vision_face.zzcr zzcrVar = new com.google.android.gms.internal.mlkit_vision_face.zzcr(1);
        zzcrVar.zza = 0L;
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzcrVar;
            try {
                objectEncoder.encode(obj, this);
                this.zze = outputStream;
                long j = zzcrVar.zza;
                zzcrVar.close();
                if (z && j == 0) {
                    return;
                }
                zzn((zzh(fieldDescriptor) << 3) | 2);
                zzo(j);
                objectEncoder.encode(obj, this);
            } catch (Throwable th) {
                this.zze = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zzcrVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void zzn(int i) {
        while (true) {
            long j = i & (-128);
            int i2 = i & 127;
            OutputStream outputStream = this.zze;
            if (j == 0) {
                outputStream.write(i2);
                return;
            } else {
                outputStream.write(i2 | 128);
                i >>>= 7;
            }
        }
    }

    public final void zzo(long j) {
        while (true) {
            long j2 = (-128) & j;
            int i = ((int) j) & 127;
            OutputStream outputStream = this.zze;
            if (j2 == 0) {
                outputStream.write(i);
                return;
            } else {
                outputStream.write(i | 128);
                j >>>= 7;
            }
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        zze(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        zzc(fieldDescriptor, obj, true);
        return this;
    }
}
