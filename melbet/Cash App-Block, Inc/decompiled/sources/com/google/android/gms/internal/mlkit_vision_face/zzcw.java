package com.google.android.gms.internal.mlkit_vision_face;

import androidx.recyclerview.widget.RecyclerView;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
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
public final class zzcw implements ObjectEncoderContext {
    public static final Charset zza = Charset.forName("UTF-8");
    public static final FieldDescriptor zzb = new FieldDescriptor("key", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("value", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(2))));
    public static final zzcv zzd = zzcv.zza;
    public OutputStream zze;
    public final HashMap zzf;
    public final HashMap zzg;
    public final ObjectEncoder zzh;
    public final zzda zzi = new zzda(this, 0);

    public zzcw(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ObjectEncoder objectEncoder) {
        this.zze = byteArrayOutputStream;
        this.zzf = hashMap;
        this.zzg = hashMap2;
        this.zzh = objectEncoder;
    }

    public static int zzh(FieldDescriptor fieldDescriptor) {
        zzcu zzcuVar = (zzcu) fieldDescriptor.getProperty(zzcu.class);
        if (zzcuVar != null) {
            return zzcuVar.zza();
        }
        TransportImpl$$ExternalSyntheticLambda0.m$1("Field has no @Protobuf config");
        return 0;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        zzd$3(fieldDescriptor, i, true);
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
            zzn$3((zzh(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn$3(bytes.length);
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
                zzk$3(zzd, fieldDescriptor, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == 0.0d) {
                return;
            }
            zzn$3((zzh(fieldDescriptor) << 3) | 1);
            this.zze.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == RecyclerView.DECELERATION_RATE) {
                return;
            }
            zzn$3((zzh(fieldDescriptor) << 3) | 5);
            this.zze.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            zze$3(fieldDescriptor, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            zzd$3(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            zzn$3((zzh(fieldDescriptor) << 3) | 2);
            zzn$3(bArr.length);
            this.zze.write(bArr);
            return;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
        if (objectEncoder != null) {
            zzk$3(objectEncoder, fieldDescriptor, obj, z);
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
        if (obj instanceof zzcs) {
            zzd$3(fieldDescriptor, ((zzcs) obj).zza(), true);
        } else if (obj instanceof Enum) {
            zzd$3(fieldDescriptor, ((Enum) obj).ordinal(), true);
        } else {
            zzk$3(this.zzh, fieldDescriptor, obj, z);
        }
    }

    public final void zzd$3(FieldDescriptor fieldDescriptor, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        zzcu zzcuVar = (zzcu) fieldDescriptor.getProperty(zzcu.class);
        if (zzcuVar == null) {
            TransportImpl$$ExternalSyntheticLambda0.m$1("Field has no @Protobuf config");
            return;
        }
        int ordinal = zzcuVar.zzb().ordinal();
        if (ordinal == 0) {
            zzn$3(zzcuVar.zza() << 3);
            zzn$3(i);
        } else if (ordinal == 1) {
            zzn$3(zzcuVar.zza() << 3);
            zzn$3((i + i) ^ (i >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            zzn$3((zzcuVar.zza() << 3) | 5);
            this.zze.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    public final void zze$3(FieldDescriptor fieldDescriptor, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        zzcu zzcuVar = (zzcu) fieldDescriptor.getProperty(zzcu.class);
        if (zzcuVar == null) {
            TransportImpl$$ExternalSyntheticLambda0.m$1("Field has no @Protobuf config");
            return;
        }
        int ordinal = zzcuVar.zzb().ordinal();
        if (ordinal == 0) {
            zzn$3(zzcuVar.zza() << 3);
            zzo$3(j);
        } else if (ordinal == 1) {
            zzn$3(zzcuVar.zza() << 3);
            zzo$3((j >> 63) ^ (j + j));
        } else {
            if (ordinal != 2) {
                return;
            }
            zzn$3((zzcuVar.zza() << 3) | 1);
            this.zze.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void zzk$3(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        zzcr zzcrVar = new zzcr(0);
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
                zzn$3((zzh(fieldDescriptor) << 3) | 2);
                zzo$3(j);
                objectEncoder.encode(obj, this);
            } catch (Throwable th) {
                this.zze = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zzcrVar.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void zzn$3(int i) {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.zze;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    public final void zzo$3(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.zze;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        zze$3(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        zzc(fieldDescriptor, obj, true);
        return this;
    }
}
