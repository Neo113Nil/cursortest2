package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.TuplesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* renamed from: com.plaid.internal.d7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC0151d7 implements Parcelable {
    public static final Parcelable.Creator<EnumC0151d7> CREATOR;
    public static final c Companion;

    @SerialName("NO_SMS_AUTOFILL")
    public static final EnumC0151d7 NO_SMS_AUTOFILL;

    @SerialName("SMS_RECEIVER")
    public static final EnumC0151d7 SMS_RECEIVER;
    public static final Lazy<KSerializer> a;
    public static final /* synthetic */ EnumC0151d7[] b;
    public static final /* synthetic */ EnumEntries c;

    @Deprecated
    /* renamed from: com.plaid.internal.d7$a */
    public static final class a implements GeneratedSerializer {
        public static final a a = new a();
        public static final /* synthetic */ EnumDescriptor b;

        static {
            EnumDescriptor enumDescriptor = new EnumDescriptor("com.plaid.internal.workflow.model.SmsAutofillType", 2);
            enumDescriptor.addElement("SMS_RECEIVER", false);
            enumDescriptor.addElement("NO_SMS_AUTOFILL", false);
            b = enumDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            return new KSerializer[0];
        }

        @Override // kotlinx.serialization.KSerializer
        public final Object deserialize(Decoder decoder) {
            decoder.getClass();
            return EnumC0151d7.values()[decoder.decodeEnum(b)];
        }

        @Override // kotlinx.serialization.KSerializer
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.KSerializer
        public final void serialize(Encoder encoder, Object obj) {
            EnumC0151d7 enumC0151d7 = (EnumC0151d7) obj;
            encoder.getClass();
            enumC0151d7.getClass();
            encoder.encodeEnum(b, enumC0151d7.ordinal());
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] typeParametersSerializers() {
            return TuplesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.plaid.internal.d7$c] */
    static {
        EnumC0151d7 enumC0151d7 = new EnumC0151d7("SMS_RECEIVER", 0);
        SMS_RECEIVER = enumC0151d7;
        EnumC0151d7 enumC0151d72 = new EnumC0151d7("NO_SMS_AUTOFILL", 1);
        NO_SMS_AUTOFILL = enumC0151d72;
        EnumC0151d7[] enumC0151d7Arr = {enumC0151d7, enumC0151d72};
        b = enumC0151d7Arr;
        c = new EnumEntriesList(enumC0151d7Arr);
        Companion = new Object() { // from class: com.plaid.internal.d7.c
        };
        CREATOR = new Parcelable.Creator<EnumC0151d7>() { // from class: com.plaid.internal.d7.d
            @Override // android.os.Parcelable.Creator
            public final EnumC0151d7 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return EnumC0151d7.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EnumC0151d7[] newArray(int i) {
                return new EnumC0151d7[i];
            }
        };
        a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<KSerializer>() { // from class: com.plaid.internal.d7.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.a;
            }
        });
    }

    public EnumC0151d7(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return c;
    }

    public static EnumC0151d7 valueOf(String str) {
        return (EnumC0151d7) Enum.valueOf(EnumC0151d7.class, str);
    }

    public static EnumC0151d7[] values() {
        return (EnumC0151d7[]) b.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
