package com.plaid.internal;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.A;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* renamed from: com.plaid.internal.v4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0309v4 {
    public final int a;
    public final String b;
    public final String c;
    public final A d;

    @Deprecated
    /* renamed from: com.plaid.internal.v4$a */
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.url.OutOfProcessWebviewFallbackJson", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement("mode", false);
            pluginGeneratedSerialDescriptor.addElement("url", false);
            pluginGeneratedSerialDescriptor.addElement("webview_fallback_id", false);
            pluginGeneratedSerialDescriptor.addElement("channel_from_webview", false);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{IntSerializer.INSTANCE, stringSerializer, stringSerializer, A.a.a};
        }

        @Override // kotlinx.serialization.KSerializer
        public final Object deserialize(Decoder decoder) {
            decoder.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            boolean z = true;
            int i = 0;
            int i2 = 0;
            String str = null;
            String str2 = null;
            A a2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    i2 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                } else if (decodeElementIndex == 1) {
                    str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                } else if (decodeElementIndex == 2) {
                    str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                        return null;
                    }
                    a2 = (A) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, A.a.a, a2);
                    i |= 8;
                }
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C0309v4(i, i2, str, str2, a2);
        }

        @Override // kotlinx.serialization.KSerializer
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.KSerializer
        public final void serialize(Encoder encoder, Object obj) {
            C0309v4 c0309v4 = (C0309v4) obj;
            encoder.getClass();
            c0309v4.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            beginStructure.encodeIntElement(0, c0309v4.a, pluginGeneratedSerialDescriptor);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, c0309v4.b);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, c0309v4.c);
            beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, A.a.a, c0309v4.d);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] typeParametersSerializers() {
            return TuplesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }

    @Deprecated
    public C0309v4(int i, @SerialName("mode") int i2, @SerialName("url") String str, @SerialName("webview_fallback_id") String str2, @SerialName("channel_from_webview") A a2) {
        if (15 != (i & 15)) {
            TuplesKt.throwMissingFieldException(i, 15, a.b);
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0309v4)) {
            return false;
        }
        C0309v4 c0309v4 = (C0309v4) obj;
        return this.a == c0309v4.a && Intrinsics.areEqual(this.b, c0309v4.b) && Intrinsics.areEqual(this.c, c0309v4.c) && Intrinsics.areEqual(this.d, c0309v4.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + C0322x.a(this.c, C0322x.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        A a2 = this.d;
        StringBuilder m = re$$ExternalSyntheticOutline0.m("OutOfProcessWebviewFallbackJson(mode=", i, ", url=", str, ", webviewFallbackId=");
        m.append(str2);
        m.append(", channelInfo=");
        m.append(a2);
        m.append(")");
        return m.toString();
    }
}
