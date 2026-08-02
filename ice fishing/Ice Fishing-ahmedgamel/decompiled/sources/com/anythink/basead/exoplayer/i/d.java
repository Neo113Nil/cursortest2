package com.anythink.basead.exoplayer.i;

import com.anythink.basead.exoplayer.h.ae;
import com.anythink.basead.exoplayer.i.f;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8748a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8749b;

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
        return this.f8748a;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final Object d() {
        return this.f8749b;
    }

    public d(ae aeVar, int i, int i4, Object obj) {
        super(aeVar, i);
        this.f8748a = i4;
        this.f8749b = obj;
    }

    public static final class a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private final int f8750a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f8751b;

        public a() {
            this.f8750a = 0;
            this.f8751b = null;
        }

        private d b(ae aeVar, int... iArr) {
            com.anythink.basead.exoplayer.k.a.a(iArr.length == 1);
            return new d(aeVar, iArr[0], this.f8750a, this.f8751b);
        }

        @Override // com.anythink.basead.exoplayer.i.f.a
        public final /* synthetic */ f a(ae aeVar, int[] iArr) {
            com.anythink.basead.exoplayer.k.a.a(iArr.length == 1);
            return new d(aeVar, iArr[0], this.f8750a, this.f8751b);
        }

        private a(int i, Object obj) {
            this.f8750a = i;
            this.f8751b = obj;
        }
    }
}
