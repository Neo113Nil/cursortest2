package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class mfj extends l9 {

    @NonNull
    public static final Parcelable.Creator<mfj> CREATOR;
    public static final vcx I;
    public static final int[] J;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final uax F;
    public final boolean G;
    public final boolean H;
    public final ArrayList a;
    public final int[] b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        ccx ccxVar = hcx.d;
        Object[] objArr = {MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                jj4.j(k5r.i(i, "at index "));
                return;
            }
        }
        I = hcx.t(2, objArr);
        J = new int[]{0, 1};
        CREATOR = new pnx(1);
    }

    public mfj(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder, boolean z, boolean z2) {
        uax o8xVar;
        this.a = new ArrayList(list);
        this.b = Arrays.copyOf(iArr, iArr.length);
        this.c = j;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = i10;
        this.o = i11;
        this.p = i12;
        this.q = i13;
        this.r = i14;
        this.s = i15;
        this.t = i16;
        this.u = i17;
        this.v = i18;
        this.w = i19;
        this.x = i20;
        this.y = i21;
        this.z = i22;
        this.A = i23;
        this.B = i24;
        this.C = i25;
        this.D = i26;
        this.E = i27;
        this.G = z;
        this.H = z2;
        if (iBinder == null) {
            o8xVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            o8xVar = queryLocalInterface instanceof uax ? (uax) queryLocalInterface : new o8x(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 2);
        }
        this.F = o8xVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.l0(parcel, 2, this.a);
        int[] iArr = this.b;
        o8g.e0(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        o8g.q0(4, 8, parcel);
        parcel.writeLong(this.c);
        o8g.j0(parcel, 5, this.d);
        o8g.q0(6, 4, parcel);
        parcel.writeInt(this.e);
        o8g.q0(7, 4, parcel);
        parcel.writeInt(this.f);
        o8g.q0(8, 4, parcel);
        parcel.writeInt(this.g);
        o8g.q0(9, 4, parcel);
        parcel.writeInt(this.h);
        o8g.q0(10, 4, parcel);
        parcel.writeInt(this.i);
        o8g.q0(11, 4, parcel);
        parcel.writeInt(this.j);
        o8g.q0(12, 4, parcel);
        parcel.writeInt(this.k);
        o8g.q0(13, 4, parcel);
        parcel.writeInt(this.l);
        o8g.q0(14, 4, parcel);
        parcel.writeInt(this.m);
        o8g.q0(15, 4, parcel);
        parcel.writeInt(this.n);
        o8g.q0(16, 4, parcel);
        parcel.writeInt(this.o);
        o8g.q0(17, 4, parcel);
        parcel.writeInt(this.p);
        o8g.q0(18, 4, parcel);
        parcel.writeInt(this.q);
        o8g.q0(19, 4, parcel);
        parcel.writeInt(this.r);
        o8g.q0(20, 4, parcel);
        parcel.writeInt(this.s);
        o8g.q0(21, 4, parcel);
        parcel.writeInt(this.t);
        o8g.q0(22, 4, parcel);
        parcel.writeInt(this.u);
        o8g.q0(23, 4, parcel);
        parcel.writeInt(this.v);
        o8g.q0(24, 4, parcel);
        parcel.writeInt(this.w);
        o8g.q0(25, 4, parcel);
        parcel.writeInt(this.x);
        o8g.q0(26, 4, parcel);
        parcel.writeInt(this.y);
        o8g.q0(27, 4, parcel);
        parcel.writeInt(this.z);
        o8g.q0(28, 4, parcel);
        parcel.writeInt(this.A);
        o8g.q0(29, 4, parcel);
        parcel.writeInt(this.B);
        o8g.q0(30, 4, parcel);
        parcel.writeInt(this.C);
        o8g.q0(31, 4, parcel);
        parcel.writeInt(this.D);
        o8g.q0(32, 4, parcel);
        parcel.writeInt(this.E);
        uax uaxVar = this.F;
        o8g.d0(parcel, 33, uaxVar == null ? null : uaxVar.asBinder());
        o8g.q0(34, 4, parcel);
        parcel.writeInt(this.G ? 1 : 0);
        o8g.q0(35, 4, parcel);
        parcel.writeInt(this.H ? 1 : 0);
        o8g.p0(parcel, o0);
    }
}
