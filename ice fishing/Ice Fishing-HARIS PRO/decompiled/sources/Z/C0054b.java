package Z;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.EnumC0097n;
import java.util.ArrayList;

/* renamed from: Z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054b implements Parcelable {
    public static final Parcelable.Creator<C0054b> CREATOR = new F0.b(3);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1528a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1529b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1530c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1531d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1532f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1533g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1534h;
    public final CharSequence i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1535k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1536l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1537m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1538n;

    public C0054b(C0053a c0053a) {
        int size = c0053a.f1511a.size();
        this.f1528a = new int[size * 6];
        if (!c0053a.f1516g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1529b = new ArrayList(size);
        this.f1530c = new int[size];
        this.f1531d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            U u2 = (U) c0053a.f1511a.get(i2);
            int i3 = i + 1;
            this.f1528a[i] = u2.f1487a;
            ArrayList arrayList = this.f1529b;
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = u2.f1488b;
            arrayList.add(abstractComponentCallbacksC0070s != null ? abstractComponentCallbacksC0070s.e : null);
            int[] iArr = this.f1528a;
            iArr[i3] = u2.f1489c ? 1 : 0;
            iArr[i + 2] = u2.f1490d;
            iArr[i + 3] = u2.e;
            int i4 = i + 5;
            iArr[i + 4] = u2.f1491f;
            i += 6;
            iArr[i4] = u2.f1492g;
            this.f1530c[i2] = u2.f1493h.ordinal();
            this.f1531d[i2] = u2.i.ordinal();
        }
        this.e = c0053a.f1515f;
        this.f1532f = c0053a.i;
        this.f1533g = c0053a.f1526s;
        this.f1534h = c0053a.j;
        this.i = c0053a.f1518k;
        this.j = c0053a.f1519l;
        this.f1535k = c0053a.f1520m;
        this.f1536l = c0053a.f1521n;
        this.f1537m = c0053a.f1522o;
        this.f1538n = c0053a.f1523p;
    }

    public final void a(C0053a c0053a) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f1528a;
            boolean z2 = true;
            if (i >= iArr.length) {
                c0053a.f1515f = this.e;
                c0053a.i = this.f1532f;
                c0053a.f1516g = true;
                c0053a.j = this.f1534h;
                c0053a.f1518k = this.i;
                c0053a.f1519l = this.j;
                c0053a.f1520m = this.f1535k;
                c0053a.f1521n = this.f1536l;
                c0053a.f1522o = this.f1537m;
                c0053a.f1523p = this.f1538n;
                return;
            }
            U u2 = new U();
            int i3 = i + 1;
            u2.f1487a = iArr[i];
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Instantiate " + c0053a + " op #" + i2 + " base fragment #" + iArr[i3]);
            }
            u2.f1493h = EnumC0097n.values()[this.f1530c[i2]];
            u2.i = EnumC0097n.values()[this.f1531d[i2]];
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z2 = false;
            }
            u2.f1489c = z2;
            int i5 = iArr[i4];
            u2.f1490d = i5;
            int i6 = iArr[i + 3];
            u2.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            u2.f1491f = i8;
            i += 6;
            int i9 = iArr[i7];
            u2.f1492g = i9;
            c0053a.f1512b = i5;
            c0053a.f1513c = i6;
            c0053a.f1514d = i8;
            c0053a.e = i9;
            c0053a.b(u2);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1528a);
        parcel.writeStringList(this.f1529b);
        parcel.writeIntArray(this.f1530c);
        parcel.writeIntArray(this.f1531d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f1532f);
        parcel.writeInt(this.f1533g);
        parcel.writeInt(this.f1534h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.f1535k, parcel, 0);
        parcel.writeStringList(this.f1536l);
        parcel.writeStringList(this.f1537m);
        parcel.writeInt(this.f1538n ? 1 : 0);
    }

    public C0054b(Parcel parcel) {
        this.f1528a = parcel.createIntArray();
        this.f1529b = parcel.createStringArrayList();
        this.f1530c = parcel.createIntArray();
        this.f1531d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f1532f = parcel.readString();
        this.f1533g = parcel.readInt();
        this.f1534h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.f1535k = (CharSequence) creator.createFromParcel(parcel);
        this.f1536l = parcel.createStringArrayList();
        this.f1537m = parcel.createStringArrayList();
        this.f1538n = parcel.readInt() != 0;
    }
}
