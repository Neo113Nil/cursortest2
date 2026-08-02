package ru.kinopoisk.sdk.easylogin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.o9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1166o9 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C1166o9> CREATOR = new a();
    public final boolean a;

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.o9$a */
    public static final class a implements Parcelable.Creator<C1166o9> {
        @Override // android.os.Parcelable.Creator
        public final C1166o9 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new C1166o9(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final C1166o9[] newArray(int i) {
            return new C1166o9[i];
        }
    }

    public C1166o9(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
    }
}
