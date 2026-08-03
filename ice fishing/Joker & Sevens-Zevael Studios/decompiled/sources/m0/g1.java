package m0;

import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g1 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4592a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4592a) {
            case 0:
                return new h1(parcel.readFloat());
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new i1(parcel.readInt());
            default:
                return new j1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f4592a) {
            case 0:
                return new h1[i10];
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new i1[i10];
            default:
                return new j1[i10];
        }
    }
}
