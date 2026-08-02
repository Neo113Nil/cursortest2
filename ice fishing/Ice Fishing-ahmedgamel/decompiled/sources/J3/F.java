package J3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class F extends V.b {
    public static final Parcelable.Creator<F> CREATOR = new A3.b(4);

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f1457v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1458w;

    public F(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1457v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1458w = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f1457v) + "}";
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f1457v, parcel, i);
        parcel.writeInt(this.f1458w ? 1 : 0);
    }
}
