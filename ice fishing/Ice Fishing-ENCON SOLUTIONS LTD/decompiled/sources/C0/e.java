package C0;

import C.l;
import a.AbstractC0083a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import q0.AbstractC1035a;

/* loaded from: classes.dex */
public final class e extends AbstractC1035a {
    public static final Parcelable.Creator<e> CREATOR = new l(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f142a;

    /* renamed from: b, reason: collision with root package name */
    public final String f143b;

    public e(ArrayList arrayList, String str) {
        this.f142a = arrayList;
        this.f143b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        ArrayList arrayList = this.f142a;
        if (arrayList != null) {
            int y3 = AbstractC0083a.y(parcel, 1);
            parcel.writeStringList(arrayList);
            AbstractC0083a.z(parcel, y3);
        }
        AbstractC0083a.v(parcel, 2, this.f143b);
        AbstractC0083a.z(parcel, y2);
    }
}
