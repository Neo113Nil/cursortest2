package com.anythink.basead.exoplayer.b;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6581a = new a().a();

    /* renamed from: b, reason: collision with root package name */
    public final int f6582b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6583c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6584d;

    /* renamed from: e, reason: collision with root package name */
    private AudioAttributes f6585e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f6586a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f6587b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f6588c = 1;

        private a c(int i) {
            this.f6587b = i;
            return this;
        }

        public final a a(int i) {
            this.f6586a = i;
            return this;
        }

        public final a b(int i) {
            this.f6588c = i;
            return this;
        }

        public final b a() {
            return new b(this.f6586a, this.f6587b, this.f6588c, (byte) 0);
        }
    }

    public /* synthetic */ b(int i, int i4, int i9, byte b9) {
        this(i, i4, i9);
    }

    public final AudioAttributes a() {
        if (this.f6585e == null) {
            this.f6585e = new AudioAttributes.Builder().setContentType(this.f6582b).setFlags(this.f6583c).setUsage(this.f6584d).build();
        }
        return this.f6585e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f6582b == bVar.f6582b && this.f6583c == bVar.f6583c && this.f6584d == bVar.f6584d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f6582b + 527) * 31) + this.f6583c) * 31) + this.f6584d;
    }

    private b(int i, int i4, int i9) {
        this.f6582b = i;
        this.f6583c = i4;
        this.f6584d = i9;
    }
}
