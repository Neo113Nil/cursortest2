package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import kotlin.Deprecated;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes5.dex */
public final class J0 implements Parcelable {
    public static final Parcelable.Creator<J0> CREATOR = new b();

    @Deprecated
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            b = new PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedOpenLinkActionLinkWithAccountNumbers", aVar, 0);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            return new KSerializer[0];
        }

        @Override // kotlinx.serialization.KSerializer
        public final Object deserialize(Decoder decoder) {
            decoder.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
            if (decodeElementIndex == -1) {
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new J0(0);
            }
            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
            return null;
        }

        @Override // kotlinx.serialization.KSerializer
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.KSerializer
        public final void serialize(Encoder encoder, Object obj) {
            encoder.getClass();
            ((J0) obj).getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            encoder.beginStructure(pluginGeneratedSerialDescriptor).endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] typeParametersSerializers() {
            return TuplesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }

    public static final class b implements Parcelable.Creator<J0> {
        @Override // android.os.Parcelable.Creator
        public final J0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return new J0();
        }

        @Override // android.os.Parcelable.Creator
        public final J0[] newArray(int i) {
            return new J0[i];
        }
    }

    public J0() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }

    @Deprecated
    public J0(int i) {
    }
}
