package V0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class C extends T.b {
    public static final Parcelable.Creator<C> CREATOR = new B.h(8);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f1259c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1260d;

    public C(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1259c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1260d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f1259c) + "}";
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f1259c, parcel, i);
        parcel.writeInt(this.f1260d ? 1 : 0);
    }
}
