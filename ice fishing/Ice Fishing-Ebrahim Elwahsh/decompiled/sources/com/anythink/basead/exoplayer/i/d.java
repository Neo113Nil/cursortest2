package com.anythink.basead.exoplayer.i;

import com.anythink.basead.exoplayer.h.ae;
import com.anythink.basead.exoplayer.i.f;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8119a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8120b;

    public d(ae aeVar, int i) {
        this(aeVar, i, 0, null);
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final void a(long j9, long j10) {
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int b() {
        return 0;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int c() {
        return this.f8119a;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final Object d() {
        return this.f8120b;
    }

    public d(ae aeVar, int i, int i4, Object obj) {
        super(aeVar, i);
        this.f8119a = i4;
        this.f8120b = obj;
    }

    public static final class a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private final int f8121a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f8122b;

        public a() {
            this.f8121a = 0;
            this.f8122b = null;
        }

        private d b(ae aeVar, int... iArr) {
            C0544a.a(iArr.length == 1);
            return new d(aeVar, iArr[0], this.f8121a, this.f8122b);
        }

        @Override // com.anythink.basead.exoplayer.i.f.a
        public final /* synthetic */ f a(ae aeVar, int[] iArr) {
            C0544a.a(iArr.length == 1);
            return new d(aeVar, iArr[0], this.f8121a, this.f8122b);
        }

        private a(int i, Object obj) {
            this.f8121a = i;
            this.f8122b = obj;
        }
    }
}
