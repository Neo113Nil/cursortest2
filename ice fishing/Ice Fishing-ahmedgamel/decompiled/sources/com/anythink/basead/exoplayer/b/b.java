package com.anythink.basead.exoplayer.b;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f7210a = new a().a();

    /* renamed from: b, reason: collision with root package name */
    public final int f7211b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7212c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7213d;

    /* renamed from: e, reason: collision with root package name */
    private AudioAttributes f7214e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f7215a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f7216b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f7217c = 1;

        private a c(int i) {
            this.f7216b = i;
            return this;
        }

        public final a a(int i) {
            this.f7215a = i;
            return this;
        }

        public final a b(int i) {
            this.f7217c = i;
            return this;
        }

        public final b a() {
            return new b(this.f7215a, this.f7216b, this.f7217c, (byte) 0);
        }
    }

    public /* synthetic */ b(int i, int i4, int i6, byte b9) {
        this(i, i4, i6);
    }

    public final AudioAttributes a() {
        if (this.f7214e == null) {
            this.f7214e = new AudioAttributes.Builder().setContentType(this.f7211b).setFlags(this.f7212c).setUsage(this.f7213d).build();
        }
        return this.f7214e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f7211b == bVar.f7211b && this.f7212c == bVar.f7212c && this.f7213d == bVar.f7213d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7211b + 527) * 31) + this.f7212c) * 31) + this.f7213d;
    }

    private b(int i, int i4, int i6) {
        this.f7211b = i;
        this.f7212c = i4;
        this.f7213d = i6;
    }
}
