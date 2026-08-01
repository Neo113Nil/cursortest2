package com.anythink.basead.exoplayer.b;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6424a = new a().a();

    /* renamed from: b, reason: collision with root package name */
    public final int f6425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6426c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6427d;

    /* renamed from: e, reason: collision with root package name */
    private AudioAttributes f6428e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f6429a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f6430b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f6431c = 1;

        private a c(int i) {
            this.f6430b = i;
            return this;
        }

        public final a a(int i) {
            this.f6429a = i;
            return this;
        }

        public final a b(int i) {
            this.f6431c = i;
            return this;
        }

        public final b a() {
            return new b(this.f6429a, this.f6430b, this.f6431c, (byte) 0);
        }
    }

    public /* synthetic */ b(int i, int i6, int i9, byte b9) {
        this(i, i6, i9);
    }

    public final AudioAttributes a() {
        if (this.f6428e == null) {
            this.f6428e = new AudioAttributes.Builder().setContentType(this.f6425b).setFlags(this.f6426c).setUsage(this.f6427d).build();
        }
        return this.f6428e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f6425b == bVar.f6425b && this.f6426c == bVar.f6426c && this.f6427d == bVar.f6427d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f6425b + 527) * 31) + this.f6426c) * 31) + this.f6427d;
    }

    private b(int i, int i6, int i9) {
        this.f6425b = i;
        this.f6426c = i6;
        this.f6427d = i9;
    }
}
