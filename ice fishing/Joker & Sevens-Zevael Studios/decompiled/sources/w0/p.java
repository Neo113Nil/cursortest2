package w0;

import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m.f1;
import m.r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7591a;

    public /* synthetic */ p(int i10) {
        this.f7591a = i10;
    }

    public static q a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = p.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new q();
        }
        q0.f f10 = q0.i.f5720h.f();
        for (int i10 = 0; i10 < readInt; i10++) {
            f10.add(parcel.readValue(classLoader));
        }
        return new q(f10.d());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f7591a) {
            case 0:
                return a(parcel, null);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new f1(parcel, null);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new r1(parcel, null);
            default:
                if (parcel.readParcelable(null) == null) {
                    return o3.b.f5181h;
                }
                throw new IllegalStateException("superState must be null");
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f7591a) {
            case 0:
                return new q[i10];
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new f1[i10];
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new r1[i10];
            default:
                return new o3.b[i10];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f7591a) {
            case 0:
                return a(parcel, classLoader);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new f1(parcel, classLoader);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new r1(parcel, classLoader);
            default:
                if (parcel.readParcelable(classLoader) == null) {
                    return o3.b.f5181h;
                }
                throw new IllegalStateException("superState must be null");
        }
    }
}
