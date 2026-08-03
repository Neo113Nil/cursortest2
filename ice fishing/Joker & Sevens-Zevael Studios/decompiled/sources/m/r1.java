package m;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r1 extends o3.b {
    public static final Parcelable.Creator<r1> CREATOR = new w0.p(2);

    /* renamed from: i, reason: collision with root package name */
    public int f4433i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4434j;

    public r1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4433i = parcel.readInt();
        this.f4434j = parcel.readInt() != 0;
    }

    @Override // o3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f4433i);
        parcel.writeInt(this.f4434j ? 1 : 0);
    }
}
