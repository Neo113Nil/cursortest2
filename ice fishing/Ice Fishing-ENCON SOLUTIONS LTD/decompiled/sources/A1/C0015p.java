package A1;

import android.os.Parcel;

/* renamed from: A1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015p extends RuntimeException {
    public C0015p(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
