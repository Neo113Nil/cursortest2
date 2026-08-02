package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* loaded from: classes.dex */
public final class ngx extends l9 {
    public static final Parcelable.Creator<ngx> CREATOR = new oex(21);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.k0(parcel, 1, this.a);
        o8g.e0(parcel, 2, this.b);
        o8g.i0(parcel, 3, this.c, i);
        o8g.c0(parcel, 4, this.d);
        o8g.p0(parcel, o0);
    }
}
