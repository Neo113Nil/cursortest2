package x2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.Wv;
import j3.C4614c;
import w.AbstractC5128c;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5189a extends S2.a {
    public static final Parcelable.Creator<C5189a> CREATOR = new C4614c(15);

    /* renamed from: n, reason: collision with root package name */
    public final String f41845n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41846u;

    /* renamed from: v, reason: collision with root package name */
    public final int f41847v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f41848w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f41849x;

    public C5189a(String str, int i, int i4, boolean z6, boolean z9) {
        this.f41845n = str;
        this.f41846u = i;
        this.f41847v = i4;
        this.f41848w = z6;
        this.f41849x = z9;
    }

    public static C5189a a() {
        return new C5189a(12451000, 12451000, true, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 2, this.f41845n);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f41846u);
        com.bumptech.glide.e.w(parcel, 4, 4);
        parcel.writeInt(this.f41847v);
        com.bumptech.glide.e.w(parcel, 5, 4);
        parcel.writeInt(this.f41848w ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 6, 4);
        parcel.writeInt(this.f41849x ? 1 : 0);
        com.bumptech.glide.e.z(parcel, x9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5189a(int i, int i4, boolean z6, boolean z9) {
        this(Wv.i(r1, com.anythink.core.common.d.j.f13164z, r0), i, i4, z6, z9);
        String str;
        if (z6) {
            str = "0";
        } else {
            str = "1";
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 13 + 2);
        AbstractC5128c.g(sb, "afma-sdk-a-v", i, com.anythink.core.common.d.j.f13164z, i4);
    }
}
