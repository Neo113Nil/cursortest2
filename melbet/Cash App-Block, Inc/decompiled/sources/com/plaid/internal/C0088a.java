package com.plaid.internal;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* renamed from: com.plaid.internal.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0088a {
    public final String a;

    @Deprecated
    /* renamed from: com.plaid.internal.a$a, reason: collision with other inner class name */
    public static final class C0016a implements GeneratedSerializer {
        public static final C0016a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            C0016a c0016a = new C0016a();
            a = c0016a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.core.webview.ActionMessage", c0016a, 1);
            pluginGeneratedSerialDescriptor.addElement("action", false);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE};
        }

        @Override // kotlinx.serialization.KSerializer
        public final Object deserialize(Decoder decoder) {
            decoder.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            boolean z = true;
            int i = 0;
            String str = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else {
                    if (decodeElementIndex != 0) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                        return null;
                    }
                    str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i = 1;
                }
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C0088a(i, str);
        }

        @Override // kotlinx.serialization.KSerializer
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.KSerializer
        public final void serialize(Encoder encoder, Object obj) {
            C0088a c0088a = (C0088a) obj;
            encoder.getClass();
            c0088a.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, c0088a.a);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] typeParametersSerializers() {
            return TuplesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }

    /* renamed from: com.plaid.internal.a$b */
    public static final class b {
        public static void a() {
            C0016a c0016a = C0016a.a;
        }
    }

    @Deprecated
    public C0088a(int i, @SerialName("action") String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, C0016a.b);
            throw null;
        }
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0088a) && Intrinsics.areEqual(this.a, ((C0088a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActionMessage(action=", this.a, ")");
    }
}
