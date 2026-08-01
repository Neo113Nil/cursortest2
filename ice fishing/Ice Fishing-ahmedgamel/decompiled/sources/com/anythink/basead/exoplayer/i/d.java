package com.anythink.basead.exoplayer.i;

import com.anythink.basead.exoplayer.h.ae;
import com.anythink.basead.exoplayer.i.f;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    private final int f7962a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7963b;

    public d(ae aeVar, int i) {
        this(aeVar, i, 0, null);
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final void a(long j6, long j9) {
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int b() {
        return 0;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int c() {
        return this.f7962a;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final Object d() {
        return this.f7963b;
    }

    public d(ae aeVar, int i, int i6, Object obj) {
        super(aeVar, i);
        this.f7962a = i6;
        this.f7963b = obj;
    }

    public static final class a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private final int f7964a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f7965b;

        public a() {
            this.f7964a = 0;
            this.f7965b = null;
        }

        private d b(ae aeVar, int... iArr) {
            com.anythink.basead.exoplayer.k.a.a(iArr.length == 1);
            return new d(aeVar, iArr[0], this.f7964a, this.f7965b);
        }

        @Override // com.anythink.basead.exoplayer.i.f.a
        public final /* synthetic */ f a(ae aeVar, int[] iArr) {
            com.anythink.basead.exoplayer.k.a.a(iArr.length == 1);
            return new d(aeVar, iArr[0], this.f7964a, this.f7965b);
        }

        private a(int i, Object obj) {
            this.f7964a = i;
            this.f7965b = obj;
        }
    }
}
