package ru.kinopoisk.sdk.easylogin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b6e;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.ouj;
import defpackage.su4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public interface H3 extends Parcelable {
    @NotNull
    default String a() {
        if (this instanceof b) {
            return "Lg";
        }
        if (this instanceof c) {
            return "Samsung";
        }
        if (this instanceof a) {
            return "AndroidTv";
        }
        b6e.s();
        return null;
    }

    @NotNull
    /* renamed from: b */
    String getC();

    /* renamed from: c */
    boolean getD();

    @NotNull
    /* renamed from: getName */
    String getB();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/H3$b;", "Lru/kinopoisk/sdk/easylogin/internal/H3;", "android_easylogin_tvauth_mobilecore"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class b implements H3 {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        @NotNull
        public final String a;

        @NotNull
        public final String b;

        @NotNull
        public final String c;
        public final boolean d;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            dfi.s(str, str2, str3);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.H3
        @NotNull
        /* renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.H3
        /* renamed from: c, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b) && Intrinsics.d(this.c, bVar.c) && this.d == bVar.d;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.H3
        @NotNull
        /* renamed from: getName, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + C1292y0.a(this.c, C1292y0.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            boolean z = this.d;
            StringBuilder m = f1d.m("Lg(id=", str, ", name=", str2, ", model=");
            m.append(str3);
            m.append(", isMock=");
            m.append(z);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public /* synthetic */ b(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? false : z);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/H3$c;", "Lru/kinopoisk/sdk/easylogin/internal/H3;", "android_easylogin_tvauth_mobilecore"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class c implements H3 {

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        @NotNull
        public final String a;

        @NotNull
        public final String b;

        @NotNull
        public final String c;
        public final boolean d;

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            dfi.s(str, str2, str3);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.H3
        @NotNull
        /* renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.H3
        /* renamed from: c, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.a, cVar.a) && Intrinsics.d(this.b, cVar.b) && Intrinsics.d(this.c, cVar.c) && this.d == cVar.d;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.H3
        @NotNull
        /* renamed from: getName, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + C1292y0.a(this.c, C1292y0.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            boolean z = this.d;
            StringBuilder m = f1d.m("Samsung(id=", str, ", name=", str2, ", model=");
            m.append(str3);
            m.append(", isMock=");
            m.append(z);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public /* synthetic */ c(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? false : z);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/H3$a;", "Lru/kinopoisk/sdk/easylogin/internal/H3;", "android_easylogin_tvauth_mobilecore"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class a implements H3 {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C0026a();
        public final String a;
        public final String b;

        @NotNull
        public final String c;

        @NotNull
        public final String d;
        public final boolean e;

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.H3$a$a, reason: collision with other inner class name */
        public static final class C0026a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(String str, String str2, @NotNull String str3, @NotNull String str4, boolean z) {
            str3.getClass();
            str4.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = z;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.H3
        @NotNull
        /* renamed from: b, reason: from getter */
        public final String getC() {
            return this.d;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.H3
        /* renamed from: c, reason: from getter */
        public final boolean getD() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d) && this.e == aVar.e;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.H3
        @NotNull
        /* renamed from: getName, reason: from getter */
        public final String getB() {
            return this.c;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return Boolean.hashCode(this.e) + C1292y0.a(this.d, C1292y0.a(this.c, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            String str4 = this.d;
            boolean z = this.e;
            StringBuilder m = f1d.m("AndroidTv(googleDeviceId=", str, ", kinopoiskDeviceId=", str2, ", name=");
            su4.v(m, str3, ", model=", str4, ", isMock=");
            return ouj.r(m, z, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i & 16) != 0 ? false : z);
        }
    }
}
