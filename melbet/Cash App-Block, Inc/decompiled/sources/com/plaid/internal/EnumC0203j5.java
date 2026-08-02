package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.j5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC0203j5 implements Parcelable {
    public static final Parcelable.Creator<EnumC0203j5> CREATOR;
    public static final a Companion;
    public static final EnumC0203j5 DEVELOPMENT;
    public static final EnumC0203j5 DEVENV;
    public static final EnumC0203j5 PRODUCTION;
    public static final EnumC0203j5 SANDBOX;
    public static final Map<String, EnumC0203j5> b;
    public static final /* synthetic */ EnumC0203j5[] c;
    public static final /* synthetic */ EnumEntries d;
    public final String a;

    /* renamed from: com.plaid.internal.j5$a */
    public static final class a {
        public static EnumC0203j5 a(String str) {
            str.getClass();
            EnumC0203j5 enumC0203j5 = (EnumC0203j5) EnumC0203j5.b.get(str);
            return enumC0203j5 == null ? EnumC0203j5.SANDBOX : enumC0203j5;
        }
    }

    static {
        EnumC0203j5 enumC0203j5 = new EnumC0203j5("PRODUCTION", 0, "production");
        PRODUCTION = enumC0203j5;
        EnumC0203j5 enumC0203j52 = new EnumC0203j5("DEVELOPMENT", 1, "development");
        DEVELOPMENT = enumC0203j52;
        EnumC0203j5 enumC0203j53 = new EnumC0203j5("SANDBOX", 2, "sandbox");
        SANDBOX = enumC0203j53;
        EnumC0203j5 enumC0203j54 = new EnumC0203j5("DEVENV", 3, "devenv");
        DEVENV = enumC0203j54;
        EnumC0203j5[] enumC0203j5Arr = {enumC0203j5, enumC0203j52, enumC0203j53, enumC0203j54};
        c = enumC0203j5Arr;
        d = new EnumEntriesList(enumC0203j5Arr);
        Companion = new a();
        CREATOR = new Parcelable.Creator<EnumC0203j5>() { // from class: com.plaid.internal.j5.b
            @Override // android.os.Parcelable.Creator
            public final EnumC0203j5 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return EnumC0203j5.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EnumC0203j5[] newArray(int i) {
                return new EnumC0203j5[i];
            }
        };
        b = MapsKt__MapsKt.mapOf(new Pair("production", enumC0203j5), new Pair("development", enumC0203j52), new Pair("sandbox", enumC0203j53), new Pair("devenv", enumC0203j54));
    }

    public EnumC0203j5(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumEntries getEntries() {
        return d;
    }

    public static EnumC0203j5 valueOf(String str) {
        return (EnumC0203j5) Enum.valueOf(EnumC0203j5.class, str);
    }

    public static EnumC0203j5[] values() {
        return (EnumC0203j5[]) c.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getJson() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
