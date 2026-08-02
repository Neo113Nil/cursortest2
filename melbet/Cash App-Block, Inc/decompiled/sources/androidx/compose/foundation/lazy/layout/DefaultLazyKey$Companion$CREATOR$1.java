package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class DefaultLazyKey$Companion$CREATOR$1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new DefaultLazyKey(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DefaultLazyKey[i];
    }
}
