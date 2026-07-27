package com.anythink.basead.k;

import com.iab.omid.library.toponad.adsession.media.InteractionType;
import com.iab.omid.library.toponad.adsession.media.MediaEvents;

/* loaded from: classes.dex */
public final class d implements com.anythink.basead.j.d {

    /* renamed from: a, reason: collision with root package name */
    MediaEvents f9131a;

    /* renamed from: b, reason: collision with root package name */
    private a f9132b = a.UNKNOWN;

    public enum a {
        UNKNOWN,
        START,
        FIRST,
        SECOND,
        THIRD;

        private static /* synthetic */ a[] a() {
            return new a[]{UNKNOWN, START, FIRST, SECOND, THIRD};
        }
    }

    public d(MediaEvents mediaEvents) {
        this.f9131a = mediaEvents;
    }

    @Override // com.anythink.basead.j.d
    public final void a(float f3, float f9) {
        a aVar;
        if (this.f9131a == null || (aVar = a.START) == this.f9132b || aVar.ordinal() <= this.f9132b.ordinal()) {
            return;
        }
        this.f9131a.start(f3, f9);
        this.f9132b = aVar;
    }

    @Override // com.anythink.basead.j.d
    public final void b() {
        a aVar;
        if (this.f9131a == null || (aVar = a.SECOND) == this.f9132b || aVar.ordinal() <= this.f9132b.ordinal()) {
            return;
        }
        this.f9131a.midpoint();
        this.f9132b = aVar;
    }

    @Override // com.anythink.basead.j.d
    public final void c() {
        a aVar;
        if (this.f9131a == null || (aVar = a.THIRD) == this.f9132b || aVar.ordinal() <= this.f9132b.ordinal()) {
            return;
        }
        this.f9131a.thirdQuartile();
        this.f9132b = aVar;
    }

    @Override // com.anythink.basead.j.d
    public final void d() {
        MediaEvents mediaEvents = this.f9131a;
        if (mediaEvents != null) {
            mediaEvents.complete();
        }
    }

    @Override // com.anythink.basead.j.d
    public final void e() {
        MediaEvents mediaEvents = this.f9131a;
        if (mediaEvents != null) {
            mediaEvents.pause();
        }
    }

    @Override // com.anythink.basead.j.d
    public final void f() {
        MediaEvents mediaEvents = this.f9131a;
        if (mediaEvents != null) {
            mediaEvents.resume();
        }
    }

    @Override // com.anythink.basead.j.d
    public final void g() {
        MediaEvents mediaEvents = this.f9131a;
        if (mediaEvents != null) {
            mediaEvents.bufferStart();
        }
    }

    @Override // com.anythink.basead.j.d
    public final void h() {
        MediaEvents mediaEvents = this.f9131a;
        if (mediaEvents != null) {
            mediaEvents.bufferFinish();
        }
    }

    @Override // com.anythink.basead.j.d
    public final void i() {
        MediaEvents mediaEvents = this.f9131a;
        if (mediaEvents != null) {
            mediaEvents.skipped();
        }
    }

    @Override // com.anythink.basead.j.d
    public final void j() {
        MediaEvents mediaEvents = this.f9131a;
        if (mediaEvents != null) {
            mediaEvents.adUserInteraction(InteractionType.CLICK);
        }
    }

    @Override // com.anythink.basead.j.d
    public final void a() {
        a aVar;
        if (this.f9131a == null || (aVar = a.FIRST) == this.f9132b || aVar.ordinal() <= this.f9132b.ordinal()) {
            return;
        }
        this.f9131a.firstQuartile();
        this.f9132b = aVar;
    }

    @Override // com.anythink.basead.j.d
    public final void a(float f3) {
        MediaEvents mediaEvents = this.f9131a;
        if (mediaEvents != null) {
            mediaEvents.volumeChange(f3);
        }
    }
}
