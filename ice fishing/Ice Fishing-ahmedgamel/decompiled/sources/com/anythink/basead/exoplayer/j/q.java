package com.anythink.basead.exoplayer.j;

import com.anythink.basead.exoplayer.j.s;

/* loaded from: classes.dex */
public final class q extends s.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f8998a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super h> f8999b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9000c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9001d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9002e;

    public q(String str) {
        this(str, null);
    }

    private p b(s.f fVar) {
        return new p(this.f8998a, null, this.f8999b, this.f9000c, this.f9001d, this.f9002e, fVar);
    }

    @Override // com.anythink.basead.exoplayer.j.s.a
    public final /* synthetic */ s a(s.f fVar) {
        return new p(this.f8998a, null, this.f8999b, this.f9000c, this.f9001d, this.f9002e, fVar);
    }

    public q(String str, aa<? super h> aaVar) {
        this(str, aaVar, (byte) 0);
    }

    private q(String str, aa<? super h> aaVar, byte b9) {
        this.f8998a = str;
        this.f8999b = aaVar;
        this.f9000c = 8000;
        this.f9001d = 8000;
        this.f9002e = false;
    }
}
