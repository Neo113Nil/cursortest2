package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459b implements Parcelable {
    public static final Parcelable.Creator<C0459b> CREATOR = new B8.d(20);

    /* renamed from: A, reason: collision with root package name */
    public final int f4954A;

    /* renamed from: B, reason: collision with root package name */
    public final CharSequence f4955B;

    /* renamed from: C, reason: collision with root package name */
    public final int f4956C;

    /* renamed from: D, reason: collision with root package name */
    public final CharSequence f4957D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f4958E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f4959F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f4960G;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f4961n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4962u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f4963v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f4964w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4965x;

    /* renamed from: y, reason: collision with root package name */
    public final String f4966y;

    /* renamed from: z, reason: collision with root package name */
    public final int f4967z;

    public C0459b(C0458a c0458a) {
        int size = c0458a.f4929a.size();
        this.f4961n = new int[size * 6];
        if (!c0458a.f4935g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f4962u = new ArrayList(size);
        this.f4963v = new int[size];
        this.f4964w = new int[size];
        int i = 0;
        for (int i6 = 0; i6 < size; i6++) {
            W w6 = (W) c0458a.f4929a.get(i6);
            int i9 = i + 1;
            this.f4961n[i] = w6.f4910a;
            ArrayList arrayList = this.f4962u;
            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = w6.f4911b;
            arrayList.add(abstractComponentCallbacksC0475s != null ? abstractComponentCallbacksC0475s.f5066x : null);
            int[] iArr = this.f4961n;
            iArr[i9] = w6.f4912c ? 1 : 0;
            iArr[i + 2] = w6.f4913d;
            iArr[i + 3] = w6.f4914e;
            int i10 = i + 5;
            iArr[i + 4] = w6.f4915f;
            i += 6;
            iArr[i10] = w6.f4916g;
            this.f4963v[i6] = w6.f4917h.ordinal();
            this.f4964w[i6] = w6.i.ordinal();
        }
        this.f4965x = c0458a.f4934f;
        this.f4966y = c0458a.f4936h;
        this.f4967z = c0458a.f4945r;
        this.f4954A = c0458a.i;
        this.f4955B = c0458a.f4937j;
        this.f4956C = c0458a.f4938k;
        this.f4957D = c0458a.f4939l;
        this.f4958E = c0458a.f4940m;
        this.f4959F = c0458a.f4941n;
        this.f4960G = c0458a.f4942o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f4961n);
        parcel.writeStringList(this.f4962u);
        parcel.writeIntArray(this.f4963v);
        parcel.writeIntArray(this.f4964w);
        parcel.writeInt(this.f4965x);
        parcel.writeString(this.f4966y);
        parcel.writeInt(this.f4967z);
        parcel.writeInt(this.f4954A);
        TextUtils.writeToParcel(this.f4955B, parcel, 0);
        parcel.writeInt(this.f4956C);
        TextUtils.writeToParcel(this.f4957D, parcel, 0);
        parcel.writeStringList(this.f4958E);
        parcel.writeStringList(this.f4959F);
        parcel.writeInt(this.f4960G ? 1 : 0);
    }

    public C0459b(Parcel parcel) {
        this.f4961n = parcel.createIntArray();
        this.f4962u = parcel.createStringArrayList();
        this.f4963v = parcel.createIntArray();
        this.f4964w = parcel.createIntArray();
        this.f4965x = parcel.readInt();
        this.f4966y = parcel.readString();
        this.f4967z = parcel.readInt();
        this.f4954A = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f4955B = (CharSequence) creator.createFromParcel(parcel);
        this.f4956C = parcel.readInt();
        this.f4957D = (CharSequence) creator.createFromParcel(parcel);
        this.f4958E = parcel.createStringArrayList();
        this.f4959F = parcel.createStringArrayList();
        this.f4960G = parcel.readInt() != 0;
    }
}
