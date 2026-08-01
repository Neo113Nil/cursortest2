package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new F0.b(11);

    /* renamed from: a, reason: collision with root package name */
    public final i f2740a;

    /* renamed from: b, reason: collision with root package name */
    public final i f2741b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2742c;

    /* renamed from: d, reason: collision with root package name */
    public int f2743d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f2744f;

    /* renamed from: g, reason: collision with root package name */
    public int f2745g;

    public k(int i, int i2, int i3, int i4) {
        this.f2743d = i;
        this.e = i2;
        this.f2744f = i3;
        this.f2742c = i4;
        this.f2745g = i >= 12 ? 1 : 0;
        this.f2740a = new i(59);
        this.f2741b = new i(i4 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final int b() {
        if (this.f2742c == 1) {
            return this.f2743d % 24;
        }
        int i = this.f2743d;
        if (i % 12 == 0) {
            return 12;
        }
        return this.f2745g == 1 ? i - 12 : i;
    }

    public final void c(int i) {
        if (this.f2742c == 1) {
            this.f2743d = i;
        } else {
            this.f2743d = (i % 12) + (this.f2745g != 1 ? 0 : 12);
        }
    }

    public final void d(int i) {
        if (i != this.f2745g) {
            this.f2745g = i;
            int i2 = this.f2743d;
            if (i2 < 12 && i == 1) {
                this.f2743d = i2 + 12;
            } else {
                if (i2 < 12 || i != 0) {
                    return;
                }
                this.f2743d = i2 - 12;
            }
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
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f2743d == kVar.f2743d && this.e == kVar.e && this.f2742c == kVar.f2742c && this.f2744f == kVar.f2744f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2742c), Integer.valueOf(this.f2743d), Integer.valueOf(this.e), Integer.valueOf(this.f2744f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2743d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f2744f);
        parcel.writeInt(this.f2742c);
    }
}
