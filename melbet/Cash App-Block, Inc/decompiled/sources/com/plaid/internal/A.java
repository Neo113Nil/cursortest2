package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes5.dex */
public final class A implements Parcelable {
    public static final Parcelable.Creator<A> CREATOR = new b();
    public final String a;
    public final String b;
    public final long c;

    @Deprecated
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.ChannelInfo", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("id", false);
            pluginGeneratedSerialDescriptor.addElement("secret", false);
            pluginGeneratedSerialDescriptor.addElement("polling_interval_ms", false);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, stringSerializer, LongSerializer.INSTANCE};
        }

        @Override // kotlinx.serialization.KSerializer
        public final Object deserialize(Decoder decoder) {
            decoder.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i = 0;
            String str = null;
            String str2 = null;
            long j = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                } else if (decodeElementIndex == 1) {
                    str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                        return null;
                    }
                    j = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                }
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new A(i, str, str2, j);
        }

        @Override // kotlinx.serialization.KSerializer
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.KSerializer
        public final void serialize(Encoder encoder, Object obj) {
            A a2 = (A) obj;
            encoder.getClass();
            a2.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, a2.a);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, a2.b);
            beginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 2, a2.c);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] typeParametersSerializers() {
            return TuplesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }

    public static final class b implements Parcelable.Creator<A> {
        @Override // android.os.Parcelable.Creator
        public final A createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new A(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final A[] newArray(int i) {
            return new A[i];
        }
    }

    @Deprecated
    public A(int i, @SerialName("id") String str, @SerialName("secret") String str2, @SerialName("polling_interval_ms") long j) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, a.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a2 = (A) obj;
        return Intrinsics.areEqual(this.a, a2.a) && Intrinsics.areEqual(this.b, a2.b) && this.c == a2.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + C0322x.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.c, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChannelInfo(channelId=", this.a, ", channelSecret=", this.b, ", pollingInterval="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }

    public A(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
