package C0;

import C.l;
import a.AbstractC0083a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import q0.AbstractC1035a;

/* loaded from: classes.dex */
public final class b extends AbstractC1035a {
    public static final Parcelable.Creator<b> CREATOR = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f138a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f140c;

    public b(int i2, int i3, Intent intent) {
        this.f138a = i2;
        this.f139b = i3;
        this.f140c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.A(parcel, 1, 4);
        parcel.writeInt(this.f138a);
        AbstractC0083a.A(parcel, 2, 4);
        parcel.writeInt(this.f139b);
        AbstractC0083a.u(parcel, 3, this.f140c, i2);
        AbstractC0083a.z(parcel, y2);
    }
}
