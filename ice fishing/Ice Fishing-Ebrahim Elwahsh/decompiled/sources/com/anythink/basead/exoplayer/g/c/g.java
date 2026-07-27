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
    public final long f7534a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7535b;

    public /* synthetic */ g(long j9, long j10, byte b9) {
        this(j9, j10);
    }

    public static g a(s sVar, long j9, ac acVar) {
        long a9 = a(sVar, j9);
        return new g(a9, acVar.a(a9));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7534a);
        parcel.writeLong(this.f7535b);
    }

    private g(long j9, long j10) {
        this.f7534a = j9;
        this.f7535b = j10;
    }

    public static long a(s sVar, long j9) {
        long d2 = sVar.d();
        return (128 & d2) != 0 ? 8589934591L & ((((d2 & 1) << 32) | sVar.h()) + j9) : com.anythink.basead.exoplayer.b.f6539b;
    }
}
