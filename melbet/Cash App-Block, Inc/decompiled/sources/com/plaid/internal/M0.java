package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.plaid.internal.L0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.EmptyList;
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
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes5.dex */
public final class M0 implements Parcelable {
    public static final Parcelable.Creator<M0> CREATOR = new b();
    public static final KSerializer[] j = {null, null, null, null, null, null, null, null, new HashSetSerializer(StringSerializer.INSTANCE, 1)};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final L0 h;
    public final List<String> i;

    @Deprecated
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedSessionInfo", aVar, 9);
            pluginGeneratedSerialDescriptor.addElement("link_token", false);
            pluginGeneratedSerialDescriptor.addElement("link_open_id", false);
            pluginGeneratedSerialDescriptor.addElement("link_persistent_id", false);
            pluginGeneratedSerialDescriptor.addElement("institution_id", true);
            pluginGeneratedSerialDescriptor.addElement("webview_fallback_id", true);
            pluginGeneratedSerialDescriptor.addElement("enable_account_select", true);
            pluginGeneratedSerialDescriptor.addElement("embedded_workflow_session_id", true);
            pluginGeneratedSerialDescriptor.addElement("embedded_open_link_configuration", true);
            pluginGeneratedSerialDescriptor.addElement("web3_valid_chains", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = M0.j;
            KSerializer nullable = BuiltinSerializersKt.getNullable(L0.a.a);
            KSerializer kSerializer = kSerializerArr[8];
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, nullable, kSerializer};
        }

        @Override // kotlinx.serialization.KSerializer
        public final Object deserialize(Decoder decoder) {
            decoder.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            KSerializer[] kSerializerArr = M0.j;
            List list = null;
            boolean z = true;
            L0 l0 = null;
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            boolean z2 = false;
            String str6 = null;
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
                        str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        str5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        z2 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        l0 = (L0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, L0.a.a, l0);
                        i |= 128;
                        break;
                    case 8:
                        list = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list);
                        i |= 256;
                        break;
                    default:
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                        return null;
                }
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new M0(i, str, str2, str3, str4, str5, z2, str6, l0, list);
        }

        @Override // kotlinx.serialization.KSerializer
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.KSerializer
        public final void serialize(Encoder encoder, Object obj) {
            M0 m0 = (M0) obj;
            encoder.getClass();
            m0.getClass();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            KSerializer[] kSerializerArr = M0.j;
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, m0.a);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, m0.b);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, m0.c);
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || !Intrinsics.areEqual(m0.d, "")) {
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, m0.d);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || !Intrinsics.areEqual(m0.e, "")) {
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, m0.e);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || m0.f) {
                beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 5, m0.f);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || !Intrinsics.areEqual(m0.g, "")) {
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 6, m0.g);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || m0.h != null) {
                beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, L0.a.a, m0.h);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor) || !Intrinsics.areEqual(m0.i, EmptyList.INSTANCE)) {
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], m0.i);
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] typeParametersSerializers() {
            return TuplesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }

    public static final class b implements Parcelable.Creator<M0> {
        @Override // android.os.Parcelable.Creator
        public final M0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new M0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : L0.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final M0[] newArray(int i) {
            return new M0[i];
        }
    }

    @Deprecated
    public M0(int i, @SerialName("link_token") String str, @SerialName("link_open_id") String str2, @SerialName("link_persistent_id") String str3, @SerialName("institution_id") String str4, @SerialName("webview_fallback_id") String str5, @SerialName("enable_account_select") boolean z, @SerialName("embedded_workflow_session_id") String str6, @SerialName("embedded_open_link_configuration") L0 l0, @SerialName("web3_valid_chains") List list) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, a.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l0;
        }
        if ((i & 256) == 0) {
            this.i = EmptyList.INSTANCE;
        } else {
            this.i = list;
        }
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0)) {
            return false;
        }
        M0 m0 = (M0) obj;
        return Intrinsics.areEqual(this.a, m0.a) && Intrinsics.areEqual(this.b, m0.b) && Intrinsics.areEqual(this.c, m0.c) && Intrinsics.areEqual(this.d, m0.d) && Intrinsics.areEqual(this.e, m0.e) && this.f == m0.f && Intrinsics.areEqual(this.g, m0.g) && Intrinsics.areEqual(this.h, m0.h) && Intrinsics.areEqual(this.i, m0.i);
    }

    public final int hashCode() {
        int a2 = C0322x.a(this.g, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(C0322x.a(this.e, C0322x.a(this.d, C0322x.a(this.c, C0322x.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31, this.f), 31);
        L0 l0 = this.h;
        return this.i.hashCode() + ((a2 + (l0 == null ? 0 : l0.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        boolean z = this.f;
        String str6 = this.g;
        L0 l0 = this.h;
        List<String> list = this.i;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EmbeddedSessionInfo(linkToken=", str, ", linkOpenId=", str2, ", linkPersistentId=");
        Boxes$$ExternalSyntheticOutline1.m(m, str3, ", institutionId=", str4, ", webviewFallbackId=");
        NavAction$$ExternalSyntheticOutline0.m(m, str5, ", enableAccountSelect=", z, ", embeddedWorkflowSessionId=");
        m.append(str6);
        m.append(", embeddedOpenLinkConfiguration=");
        m.append(l0);
        m.append(", web3ValidChains=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(m, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        L0 l0 = this.h;
        if (l0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            l0.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.i);
    }

    public M0(String str, String str2, String str3, String str4, String str5, boolean z, String str6, L0 l0, ArrayList arrayList) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        arrayList.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = str6;
        this.h = l0;
        this.i = arrayList;
    }
}
