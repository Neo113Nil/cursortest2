package com.plaid.internal;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.google.gson.annotations.SerializedName;
import com.plaid.internal.U3;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes5.dex */
public final class E1 {

    @SerializedName("available")
    private final Double a;

    @SerializedName("current")
    private final Double b;

    @SerializedName("currency")
    private final String c;

    @SerializedName("localized")
    private final U3 d;

    @Deprecated
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.url.LinkAccountResponseBalance", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement("available", true);
            pluginGeneratedSerialDescriptor.addElement("current", true);
            pluginGeneratedSerialDescriptor.addElement("currency", true);
            pluginGeneratedSerialDescriptor.addElement("localized", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(doubleSerializer), BuiltinSerializersKt.getNullable(doubleSerializer), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(U3.a.a)};
        }

        @Override // kotlinx.serialization.KSerializer
        public final Object deserialize(Decoder decoder) {
            decoder.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            boolean z = true;
            int i = 0;
            Double d = null;
            Double d2 = null;
            String str = null;
            U3 u3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    d = (Double) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, DoubleSerializer.INSTANCE, d);
                    i |= 1;
                } else if (decodeElementIndex == 1) {
                    d2 = (Double) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, DoubleSerializer.INSTANCE, d2);
                    i |= 2;
                } else if (decodeElementIndex == 2) {
                    str = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str);
                    i |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                        return null;
                    }
                    u3 = (U3) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, U3.a.a, u3);
                    i |= 8;
                }
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new E1(i, d, d2, str, u3);
        }

        @Override // kotlinx.serialization.KSerializer
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.KSerializer
        public final void serialize(Encoder encoder, Object obj) {
            E1 e1 = (E1) obj;
            encoder.getClass();
            e1.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            E1.a(e1, beginStructure, pluginGeneratedSerialDescriptor);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] typeParametersSerializers() {
            return TuplesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }

    @Deprecated
    public E1(int i, Double d, Double d2, String str, U3 u3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = u3;
        }
    }

    public static final /* synthetic */ void a(E1 e1, CompositeEncoder compositeEncoder, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || e1.a != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, DoubleSerializer.INSTANCE, e1.a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || e1.b != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, DoubleSerializer.INSTANCE, e1.b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || e1.c != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, e1.c);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) && e1.d == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, U3.a.a, e1.d);
    }

    public final String b() {
        return this.c;
    }

    public final Double c() {
        return this.b;
    }

    public final U3 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E1)) {
            return false;
        }
        E1 e1 = (E1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) e1.a) && Intrinsics.areEqual((Object) this.b, (Object) e1.b) && Intrinsics.areEqual(this.c, e1.c) && Intrinsics.areEqual(this.d, e1.d);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        U3 u3 = this.d;
        return hashCode3 + (u3 != null ? u3.hashCode() : 0);
    }

    public final String toString() {
        return "LinkAccountResponseBalance(available=" + this.a + ", current=" + this.b + ", currency=" + this.c + ", localized=" + this.d + ")";
    }

    public E1() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final Double a() {
        return this.a;
    }
}
