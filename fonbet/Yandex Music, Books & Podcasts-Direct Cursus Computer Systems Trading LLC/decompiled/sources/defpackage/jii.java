package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jii extends View.BaseSavedState {

    @NotNull
    public static final Parcelable.ClassLoaderCreator<jii> CREATOR = new w6k(9);
    public Integer a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        Integer num = this.a;
        parcel.writeInt(num != null ? num.intValue() : -1);
    }
}
