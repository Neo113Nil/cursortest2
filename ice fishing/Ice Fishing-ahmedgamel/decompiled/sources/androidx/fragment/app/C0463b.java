package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463b implements Parcelable {
    public static final Parcelable.Creator<C0463b> CREATOR = new B8.d(20);

    /* renamed from: A, reason: collision with root package name */
    public final int f4922A;

    /* renamed from: B, reason: collision with root package name */
    public final CharSequence f4923B;

    /* renamed from: C, reason: collision with root package name */
    public final int f4924C;

    /* renamed from: D, reason: collision with root package name */
    public final CharSequence f4925D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f4926E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f4927F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f4928G;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f4929n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4930u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f4931v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f4932w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4933x;

    /* renamed from: y, reason: collision with root package name */
    public final String f4934y;

    /* renamed from: z, reason: collision with root package name */
    public final int f4935z;

    public C0463b(C0462a c0462a) {
        int size = c0462a.f4897a.size();
        this.f4929n = new int[size * 6];
        if (!c0462a.f4903g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f4930u = new ArrayList(size);
        this.f4931v = new int[size];
        this.f4932w = new int[size];
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            W w3 = (W) c0462a.f4897a.get(i4);
            int i6 = i + 1;
            this.f4929n[i] = w3.f4878a;
            ArrayList arrayList = this.f4930u;
            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = w3.f4879b;
            arrayList.add(abstractComponentCallbacksC0479s != null ? abstractComponentCallbacksC0479s.f5034x : null);
            int[] iArr = this.f4929n;
            iArr[i6] = w3.f4880c ? 1 : 0;
            iArr[i + 2] = w3.f4881d;
            iArr[i + 3] = w3.f4882e;
            int i9 = i + 5;
            iArr[i + 4] = w3.f4883f;
            i += 6;
            iArr[i9] = w3.f4884g;
            this.f4931v[i4] = w3.f4885h.ordinal();
            this.f4932w[i4] = w3.i.ordinal();
        }
        this.f4933x = c0462a.f4902f;
        this.f4934y = c0462a.f4904h;
        this.f4935z = c0462a.f4913r;
        this.f4922A = c0462a.i;
        this.f4923B = c0462a.f4905j;
        this.f4924C = c0462a.f4906k;
        this.f4925D = c0462a.f4907l;
        this.f4926E = c0462a.f4908m;
        this.f4927F = c0462a.f4909n;
        this.f4928G = c0462a.f4910o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f4929n);
        parcel.writeStringList(this.f4930u);
        parcel.writeIntArray(this.f4931v);
        parcel.writeIntArray(this.f4932w);
        parcel.writeInt(this.f4933x);
        parcel.writeString(this.f4934y);
        parcel.writeInt(this.f4935z);
        parcel.writeInt(this.f4922A);
        TextUtils.writeToParcel(this.f4923B, parcel, 0);
        parcel.writeInt(this.f4924C);
        TextUtils.writeToParcel(this.f4925D, parcel, 0);
        parcel.writeStringList(this.f4926E);
        parcel.writeStringList(this.f4927F);
        parcel.writeInt(this.f4928G ? 1 : 0);
    }

    public C0463b(Parcel parcel) {
        this.f4929n = parcel.createIntArray();
        this.f4930u = parcel.createStringArrayList();
        this.f4931v = parcel.createIntArray();
        this.f4932w = parcel.createIntArray();
        this.f4933x = parcel.readInt();
        this.f4934y = parcel.readString();
        this.f4935z = parcel.readInt();
        this.f4922A = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f4923B = (CharSequence) creator.createFromParcel(parcel);
        this.f4924C = parcel.readInt();
        this.f4925D = (CharSequence) creator.createFromParcel(parcel);
        this.f4926E = parcel.createStringArrayList();
        this.f4927F = parcel.createStringArrayList();
        this.f4928G = parcel.readInt() != 0;
    }
}
