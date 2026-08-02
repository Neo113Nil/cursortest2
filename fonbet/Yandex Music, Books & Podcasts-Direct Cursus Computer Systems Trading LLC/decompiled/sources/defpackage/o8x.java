package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o8x extends aww implements uax {
    @Override // defpackage.uax
    public final List n() {
        Parcel N0 = N0(M0(), 3);
        ArrayList createTypedArrayList = N0.createTypedArrayList(zej.CREATOR);
        N0.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.uax
    public final int[] t() {
        Parcel N0 = N0(M0(), 4);
        int[] createIntArray = N0.createIntArray();
        N0.recycle();
        return createIntArray;
    }
}
