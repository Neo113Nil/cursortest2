package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469b implements Parcelable {
    public static final Parcelable.Creator<C0469b> CREATOR = new F0.a(18);

    /* renamed from: A, reason: collision with root package name */
    public final int f5066A;

    /* renamed from: B, reason: collision with root package name */
    public final CharSequence f5067B;

    /* renamed from: C, reason: collision with root package name */
    public final int f5068C;

    /* renamed from: D, reason: collision with root package name */
    public final CharSequence f5069D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f5070E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f5071F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f5072G;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f5073n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f5074u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f5075v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f5076w;

    /* renamed from: x, reason: collision with root package name */
    public final int f5077x;

    /* renamed from: y, reason: collision with root package name */
    public final String f5078y;

    /* renamed from: z, reason: collision with root package name */
    public final int f5079z;

    public C0469b(C0468a c0468a) {
        int size = c0468a.f5041a.size();
        this.f5073n = new int[size * 6];
        if (!c0468a.f5047g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f5074u = new ArrayList(size);
        this.f5075v = new int[size];
        this.f5076w = new int[size];
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            W w9 = (W) c0468a.f5041a.get(i4);
            int i9 = i + 1;
            this.f5073n[i] = w9.f5022a;
            ArrayList arrayList = this.f5074u;
            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = w9.f5023b;
            arrayList.add(abstractComponentCallbacksC0485s != null ? abstractComponentCallbacksC0485s.f5178x : null);
            int[] iArr = this.f5073n;
            iArr[i9] = w9.f5024c ? 1 : 0;
            iArr[i + 2] = w9.f5025d;
            iArr[i + 3] = w9.f5026e;
            int i10 = i + 5;
            iArr[i + 4] = w9.f5027f;
            i += 6;
            iArr[i10] = w9.f5028g;
            this.f5075v[i4] = w9.f5029h.ordinal();
            this.f5076w[i4] = w9.i.ordinal();
        }
        this.f5077x = c0468a.f5046f;
        this.f5078y = c0468a.f5048h;
        this.f5079z = c0468a.f5057r;
        this.f5066A = c0468a.i;
        this.f5067B = c0468a.f5049j;
        this.f5068C = c0468a.f5050k;
        this.f5069D = c0468a.f5051l;
        this.f5070E = c0468a.f5052m;
        this.f5071F = c0468a.f5053n;
        this.f5072G = c0468a.f5054o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f5073n);
        parcel.writeStringList(this.f5074u);
        parcel.writeIntArray(this.f5075v);
        parcel.writeIntArray(this.f5076w);
        parcel.writeInt(this.f5077x);
        parcel.writeString(this.f5078y);
        parcel.writeInt(this.f5079z);
        parcel.writeInt(this.f5066A);
        TextUtils.writeToParcel(this.f5067B, parcel, 0);
        parcel.writeInt(this.f5068C);
        TextUtils.writeToParcel(this.f5069D, parcel, 0);
        parcel.writeStringList(this.f5070E);
        parcel.writeStringList(this.f5071F);
        parcel.writeInt(this.f5072G ? 1 : 0);
    }

    public C0469b(Parcel parcel) {
        this.f5073n = parcel.createIntArray();
        this.f5074u = parcel.createStringArrayList();
        this.f5075v = parcel.createIntArray();
        this.f5076w = parcel.createIntArray();
        this.f5077x = parcel.readInt();
        this.f5078y = parcel.readString();
        this.f5079z = parcel.readInt();
        this.f5066A = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f5067B = (CharSequence) creator.createFromParcel(parcel);
        this.f5068C = parcel.readInt();
        this.f5069D = (CharSequence) creator.createFromParcel(parcel);
        this.f5070E = parcel.createStringArrayList();
        this.f5071F = parcel.createStringArrayList();
        this.f5072G = parcel.readInt() != 0;
    }
}
