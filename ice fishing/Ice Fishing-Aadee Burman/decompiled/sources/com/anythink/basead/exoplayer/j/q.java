package com.anythink.basead.exoplayer.j;

import com.anythink.basead.exoplayer.j.s;

/* loaded from: classes.dex */
public final class q extends s.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f8212a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super h> f8213b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8214c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8215d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8216e;

    public q(String str) {
        this(str, null);
    }

    private p b(s.f fVar) {
        return new p(this.f8212a, null, this.f8213b, this.f8214c, this.f8215d, this.f8216e, fVar);
    }

    @Override // com.anythink.basead.exoplayer.j.s.a
    public final /* synthetic */ s a(s.f fVar) {
        return new p(this.f8212a, null, this.f8213b, this.f8214c, this.f8215d, this.f8216e, fVar);
    }

    public q(String str, aa<? super h> aaVar) {
        this(str, aaVar, (byte) 0);
    }

    private q(String str, aa<? super h> aaVar, byte b9) {
        this.f8212a = str;
        this.f8213b = aaVar;
        this.f8214c = 8000;
        this.f8215d = 8000;
        this.f8216e = false;
    }
}
