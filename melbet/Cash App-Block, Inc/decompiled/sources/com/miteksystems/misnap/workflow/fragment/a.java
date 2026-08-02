package com.miteksystems.misnap.workflow.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;

/* loaded from: classes4.dex */
public final class a implements CalendarConstraints.DateValidator {
    public static final C0010a CREATOR = new C0010a();
    public final long a;
    public final long b;

    /* renamed from: com.miteksystems.misnap.workflow.fragment.a$a, reason: collision with other inner class name */
    public final class C0010a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean isValid(long j) {
        return j <= this.b && this.a <= j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
