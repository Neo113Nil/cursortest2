package com.google.firebase.encoders.proto;

import androidx.recyclerview.widget.RecyclerView;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzcr;
import com.google.android.gms.internal.mlkit_vision_face.zzda;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder$$ExternalSyntheticLambda0;
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
public final class ProtobufDataEncoderContext implements ObjectEncoderContext {
    public final ObjectEncoder fallbackEncoder;
    public final HashMap objectEncoders;
    public OutputStream output;
    public final zzda valueEncoderContext = new zzda(this, 5);
    public final HashMap valueEncoders;
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final FieldDescriptor MAP_KEY_DESC = new FieldDescriptor("key", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(1))));
    public static final FieldDescriptor MAP_VALUE_DESC = new FieldDescriptor("value", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(2))));
    public static final JsonDataEncoderBuilder$$ExternalSyntheticLambda0 DEFAULT_MAP_ENCODER = new JsonDataEncoderBuilder$$ExternalSyntheticLambda0(1);

    public ProtobufDataEncoderContext(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ObjectEncoder objectEncoder) {
        this.output = byteArrayOutputStream;
        this.objectEncoders = hashMap;
        this.valueEncoders = hashMap2;
        this.fallbackEncoder = objectEncoder;
    }

    public static int getTag(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        TransportImpl$$ExternalSyntheticLambda0.m$1("Field has no @Protobuf config");
        return 0;
    }

    public final void add(FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(UTF_8);
            writeVarInt32(bytes.length);
            this.output.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                add(fieldDescriptor, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                doEncode(DEFAULT_MAP_ENCODER, fieldDescriptor, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == 0.0d) {
                return;
            }
            writeVarInt32((getTag(fieldDescriptor) << 3) | 1);
            this.output.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == RecyclerView.DECELERATION_RATE) {
                return;
            }
            writeVarInt32((getTag(fieldDescriptor) << 3) | 5);
            this.output.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            add(fieldDescriptor, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            add(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
            writeVarInt32(bArr.length);
            this.output.write(bArr);
            return;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.objectEncoders.get(obj.getClass());
        if (objectEncoder != null) {
            doEncode(objectEncoder, fieldDescriptor, obj, z);
            return;
        }
        ValueEncoder valueEncoder = (ValueEncoder) this.valueEncoders.get(obj.getClass());
        if (valueEncoder != null) {
            zzda zzdaVar = this.valueEncoderContext;
            zzdaVar.zza = false;
            zzdaVar.zzc = fieldDescriptor;
            zzdaVar.zzb = z;
            valueEncoder.encode(obj, zzdaVar);
            return;
        }
        if (obj instanceof ProtoEnum) {
            add(fieldDescriptor, ((ProtoEnum) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            add(fieldDescriptor, ((Enum) obj).ordinal(), true);
        } else {
            doEncode(this.fallbackEncoder, fieldDescriptor, obj, z);
        }
    }

    public final void doEncode(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        zzcr zzcrVar = new zzcr(5);
        zzcrVar.zza = 0L;
        try {
            OutputStream outputStream = this.output;
            this.output = zzcrVar;
            try {
                objectEncoder.encode(obj, this);
                this.output = outputStream;
                long j = zzcrVar.zza;
                zzcrVar.close();
                if (z && j == 0) {
                    return;
                }
                writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
                writeVarInt64(j);
                objectEncoder.encode(obj, this);
            } catch (Throwable th) {
                this.output = outputStream;
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

    public final void writeVarInt32(int i) {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.output;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    public final void writeVarInt64(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.output;
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
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        add(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        add(fieldDescriptor, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        add(fieldDescriptor, j, true);
        return this;
    }

    public final void add(FieldDescriptor fieldDescriptor, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            int ordinal = protobuf.intEncoding().ordinal();
            if (ordinal == 0) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt32(i);
                return;
            } else if (ordinal == 1) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt32((i << 1) ^ (i >> 31));
                return;
            } else {
                if (ordinal != 2) {
                    return;
                }
                writeVarInt32((protobuf.tag() << 3) | 5);
                this.output.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                return;
            }
        }
        TransportImpl$$ExternalSyntheticLambda0.m$1("Field has no @Protobuf config");
    }

    public final void add(FieldDescriptor fieldDescriptor, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            int ordinal = protobuf.intEncoding().ordinal();
            if (ordinal == 0) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt64(j);
                return;
            } else if (ordinal == 1) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt64((j >> 63) ^ (j << 1));
                return;
            } else {
                if (ordinal != 2) {
                    return;
                }
                writeVarInt32((protobuf.tag() << 3) | 1);
                this.output.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                return;
            }
        }
        TransportImpl$$ExternalSyntheticLambda0.m$1("Field has no @Protobuf config");
    }
}
