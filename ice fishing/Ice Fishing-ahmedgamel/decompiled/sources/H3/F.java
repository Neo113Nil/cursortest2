package H3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class F extends V.b {
    public static final Parcelable.Creator<F> CREATOR = new B.g(3);

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f1101v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1102w;

    public F(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1101v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1102w = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f1101v) + "}";
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f1101v, parcel, i);
        parcel.writeInt(this.f1102w ? 1 : 0);
    }
}
