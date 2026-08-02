package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class eoo extends AbsSavedState {

    @NotNull
    public static final Parcelable.Creator<eoo> CREATOR = new z8o(20);
    public final String a;
    public final String b;
    public final Bundle c;

    public eoo(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        if (readString == null) {
            xq0.q("Can't read slabClassName");
            throw null;
        }
        this.a = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            xq0.q("Can't read instanceId");
            throw null;
        }
        this.b = readString2;
        Bundle readBundle = parcel.readBundle(eoo.class.getClassLoader());
        if (readBundle != null) {
            this.c = readBundle;
        } else {
            xq0.q("Can't read bundle");
            throw null;
        }
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeBundle(this.c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoo(Parcelable parcelable, String str, String str2, Bundle bundle) {
        super(parcelable);
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }
}
