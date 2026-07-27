package com.anythink.basead.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.ac;
import com.anythink.basead.exoplayer.k.s;

/* loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() { // from class: com.anythink.basead.exoplayer.g.c.g.1
        private static g a(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ g[] newArray(int i) {
            return new g[i];
        }

        private static g[] a(int i) {
            return new g[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f7377a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7378b;

    public /* synthetic */ g(long j6, long j9, byte b9) {
        this(j6, j9);
    }

    public static g a(s sVar, long j6, ac acVar) {
        long a9 = a(sVar, j6);
        return new g(a9, acVar.a(a9));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7377a);
        parcel.writeLong(this.f7378b);
    }

    private g(long j6, long j9) {
        this.f7377a = j6;
        this.f7378b = j9;
    }

    public static long a(s sVar, long j6) {
        long d2 = sVar.d();
        return (128 & d2) != 0 ? 8589934591L & ((((d2 & 1) << 32) | sVar.h()) + j6) : com.anythink.basead.exoplayer.b.f6382b;
    }
}
