package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k74 extends l9 {

    @NonNull
    public static final Parcelable.Creator<k74> CREATOR;
    public static final qex q = new qex(false);
    public static final agx r = new agx(0);
    public static final g74 s;
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final mnf d;
    public final boolean e;
    public final g74 f;
    public final boolean g;
    public final double h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final List l;
    public final boolean m;
    public final boolean n;
    public final qex o;
    public agx p;

    static {
        new lfj().a();
        s = new g74("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new oex(17);
    }

    public k74(String str, ArrayList arrayList, boolean z, mnf mnfVar, boolean z2, g74 g74Var, boolean z3, double d, boolean z4, boolean z5, boolean z6, ArrayList arrayList2, boolean z7, boolean z8, qex qexVar, agx agxVar) {
        this.a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.c = z;
        this.d = mnfVar == null ? new mnf() : mnfVar;
        this.e = z2;
        this.f = g74Var;
        this.g = z3;
        this.h = d;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = arrayList2;
        this.m = z7;
        this.n = z8;
        this.o = qexVar;
        this.p = agxVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.l0(parcel, 3, Collections.unmodifiableList(this.b));
        o8g.q0(4, 4, parcel);
        parcel.writeInt(this.c ? 1 : 0);
        o8g.i0(parcel, 5, this.d, i);
        o8g.q0(6, 4, parcel);
        parcel.writeInt(this.e ? 1 : 0);
        o8g.i0(parcel, 7, this.f, i);
        o8g.q0(8, 4, parcel);
        parcel.writeInt(this.g ? 1 : 0);
        o8g.q0(9, 8, parcel);
        parcel.writeDouble(this.h);
        o8g.q0(10, 4, parcel);
        parcel.writeInt(this.i ? 1 : 0);
        o8g.q0(11, 4, parcel);
        parcel.writeInt(this.j ? 1 : 0);
        o8g.q0(12, 4, parcel);
        parcel.writeInt(this.k ? 1 : 0);
        o8g.l0(parcel, 13, Collections.unmodifiableList(this.l));
        o8g.q0(14, 4, parcel);
        parcel.writeInt(this.m ? 1 : 0);
        o8g.q0(15, 4, parcel);
        parcel.writeInt(0);
        o8g.q0(16, 4, parcel);
        parcel.writeInt(this.n ? 1 : 0);
        o8g.i0(parcel, 17, this.o, i);
        o8g.i0(parcel, 18, this.p, i);
        o8g.p0(parcel, o0);
    }
}
