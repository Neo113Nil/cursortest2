package com.plaid.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.google.gson.annotations.SerializedName;
import com.plaid.internal.E1;
import com.plaid.internal.F1;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes5.dex */
public final class D1 {
    public static final b g = new b();

    @SerializedName("_id")
    private final String a;

    @SerializedName("meta")
    private final F1 b;

    @SerializedName("type")
    private final String c;

    @SerializedName("subtype")
    private final String d;

    @SerializedName("verification_status")
    private final String e;

    @SerializedName("balance")
    private final E1 f;

    @Deprecated
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.url.LinkAccountResponseAccount", aVar, 6);
            pluginGeneratedSerialDescriptor.addElement("_id", true);
            pluginGeneratedSerialDescriptor.addElement("meta", true);
            pluginGeneratedSerialDescriptor.addElement("type", true);
            pluginGeneratedSerialDescriptor.addElement("subtype", true);
            pluginGeneratedSerialDescriptor.addElement("verification_status", true);
            pluginGeneratedSerialDescriptor.addElement("balance", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(F1.a.a), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(E1.a.a)};
        }

        @Override // kotlinx.serialization.KSerializer
        public final Object deserialize(Decoder decoder) {
            decoder.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            boolean z = true;
            int i = 0;
            String str = null;
            F1 f1 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            E1 e1 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        f1 = (F1) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, F1.a.a, f1);
                        i |= 2;
                        break;
                    case 2:
                        str2 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str2);
                        i |= 4;
                        break;
                    case 3:
                        str3 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, str3);
                        i |= 8;
                        break;
                    case 4:
                        str4 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, str4);
                        i |= 16;
                        break;
                    case 5:
                        e1 = (E1) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, E1.a.a, e1);
                        i |= 32;
                        break;
                    default:
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                        return null;
                }
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new D1(i, str, f1, str2, str3, str4, e1);
        }

        @Override // kotlinx.serialization.KSerializer
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.KSerializer
        public final void serialize(Encoder encoder, Object obj) {
            D1 d1 = (D1) obj;
            encoder.getClass();
            d1.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            D1.a(d1, beginStructure, pluginGeneratedSerialDescriptor);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] typeParametersSerializers() {
            return TuplesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }

    public static final class b {
        public static void a() {
            a aVar = a.a;
        }
    }

    @Deprecated
    public D1(int i, String str, F1 f1, String str2, String str3, String str4, E1 e1) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f1;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = e1;
        }
    }

    public static final /* synthetic */ void a(D1 d1, CompositeEncoder compositeEncoder, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || !Intrinsics.areEqual(d1.a, "")) {
            compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 0, d1.a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || d1.b != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, F1.a.a, d1.b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || d1.c != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, d1.c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || d1.d != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, d1.d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || d1.e != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, d1.e);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) && d1.f == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, E1.a.a, d1.f);
    }

    public final F1 b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D1)) {
            return false;
        }
        D1 d1 = (D1) obj;
        return Intrinsics.areEqual(this.a, d1.a) && Intrinsics.areEqual(this.b, d1.b) && Intrinsics.areEqual(this.c, d1.c) && Intrinsics.areEqual(this.d, d1.d) && Intrinsics.areEqual(this.e, d1.e) && Intrinsics.areEqual(this.f, d1.f);
    }

    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        F1 f1 = this.b;
        int hashCode2 = (hashCode + (f1 == null ? 0 : f1.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        E1 e1 = this.f;
        return hashCode5 + (e1 != null ? e1.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        F1 f1 = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        E1 e1 = this.f;
        StringBuilder sb = new StringBuilder("LinkAccountResponseAccount(_id=");
        sb.append(str);
        sb.append(", meta=");
        sb.append(f1);
        sb.append(", type=");
        Boxes$$ExternalSyntheticOutline1.m(sb, str2, ", subtype=", str3, ", verification_status=");
        sb.append(str4);
        sb.append(", balance=");
        sb.append(e1);
        sb.append(")");
        return sb.toString();
    }

    public D1() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final E1 a() {
        return this.f;
    }
}
