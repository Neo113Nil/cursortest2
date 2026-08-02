package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.plaid.internal.I0;
import com.plaid.internal.J0;
import com.plaid.internal.K0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes5.dex */
public final class L0 implements Parcelable {
    public static final Parcelable.Creator<L0> CREATOR = new b();
    public final String a;
    public final I0 b;
    public final K0 c;
    public final J0 d;
    public final boolean e;

    @Deprecated
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedOpenLinkConfiguration", aVar, 5);
            pluginGeneratedSerialDescriptor.addElement("embedded_workflow_session_id", false);
            pluginGeneratedSerialDescriptor.addElement("open_link_action_default", true);
            pluginGeneratedSerialDescriptor.addElement("open_link_action_with_institution_id", true);
            pluginGeneratedSerialDescriptor.addElement("open_link_action_link_with_account_numbers", true);
            pluginGeneratedSerialDescriptor.addElement("is_polling", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(I0.a.a), BuiltinSerializersKt.getNullable(K0.a.a), BuiltinSerializersKt.getNullable(J0.a.a), BooleanSerializer.INSTANCE};
        }

        @Override // kotlinx.serialization.KSerializer
        public final Object deserialize(Decoder decoder) {
            decoder.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            boolean z = true;
            int i = 0;
            boolean z2 = false;
            String str = null;
            I0 i0 = null;
            K0 k0 = null;
            J0 j0 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                } else if (decodeElementIndex == 1) {
                    i0 = (I0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, I0.a.a, i0);
                    i |= 2;
                } else if (decodeElementIndex == 2) {
                    k0 = (K0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, K0.a.a, k0);
                    i |= 4;
                } else if (decodeElementIndex == 3) {
                    j0 = (J0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, J0.a.a, j0);
                    i |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                        return null;
                    }
                    z2 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                }
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new L0(i, str, i0, k0, j0, z2);
        }

        @Override // kotlinx.serialization.KSerializer
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.KSerializer
        public final void serialize(Encoder encoder, Object obj) {
            L0 l0 = (L0) obj;
            encoder.getClass();
            l0.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, l0.a);
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || l0.b != null) {
                beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, I0.a.a, l0.b);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || l0.c != null) {
                beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, K0.a.a, l0.c);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || l0.d != null) {
                beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, J0.a.a, l0.d);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || l0.e) {
                beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 4, l0.e);
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] typeParametersSerializers() {
            return TuplesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }

    public static final class b implements Parcelable.Creator<L0> {
        @Override // android.os.Parcelable.Creator
        public final L0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new L0(parcel.readString(), parcel.readInt() == 0 ? null : I0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : K0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? J0.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final L0[] newArray(int i) {
            return new L0[i];
        }
    }

    @Deprecated
    public L0(int i, @SerialName("embedded_workflow_session_id") String str, @SerialName("open_link_action_default") I0 i0, @SerialName("open_link_action_with_institution_id") K0 k0, @SerialName("open_link_action_link_with_account_numbers") J0 j0, @SerialName("is_polling") boolean z) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, a.b);
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = i0;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = k0;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = j0;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l0 = (L0) obj;
        return Intrinsics.areEqual(this.a, l0.a) && Intrinsics.areEqual(this.b, l0.b) && Intrinsics.areEqual(this.c, l0.c) && Intrinsics.areEqual(this.d, l0.d) && this.e == l0.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        I0 i0 = this.b;
        int hashCode2 = (hashCode + (i0 == null ? 0 : i0.hashCode())) * 31;
        K0 k0 = this.c;
        int hashCode3 = (hashCode2 + (k0 == null ? 0 : k0.a.hashCode())) * 31;
        J0 j0 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (j0 != null ? j0.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        I0 i0 = this.b;
        K0 k0 = this.c;
        J0 j0 = this.d;
        boolean z = this.e;
        StringBuilder sb = new StringBuilder("EmbeddedOpenLinkConfiguration(embeddedWorkflowSessionId=");
        sb.append(str);
        sb.append(", openLinkActionDefault=");
        sb.append(i0);
        sb.append(", openLinkActionWithInstitutionId=");
        sb.append(k0);
        sb.append(", openLinkActionLinkWithAccountNumbers=");
        sb.append(j0);
        sb.append(", isPolling=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        if (this.b == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(1);
        }
        K0 k0 = this.c;
        if (k0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(k0.a);
        }
        if (this.d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(1);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }

    public L0(String str, I0 i0, K0 k0, J0 j0, boolean z) {
        str.getClass();
        this.a = str;
        this.b = i0;
        this.c = k0;
        this.d = j0;
        this.e = z;
    }
}
