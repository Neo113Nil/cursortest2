package com.anythink.basead.k;

import android.view.View;
import com.iab.omid.library.toponad.adsession.AdEvents;
import com.iab.omid.library.toponad.adsession.AdSession;
import com.iab.omid.library.toponad.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.toponad.adsession.media.MediaEvents;
import java.util.List;

/* loaded from: classes.dex */
public class b implements com.anythink.basead.j.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f9125a = "b";

    /* renamed from: b, reason: collision with root package name */
    private AdSession f9126b;

    /* renamed from: c, reason: collision with root package name */
    private AdEvents f9127c;

    /* renamed from: d, reason: collision with root package name */
    private MediaEvents f9128d;

    public b(AdSession adSession, boolean z3) {
        this.f9126b = adSession;
        this.f9127c = AdEvents.createAdEvents(adSession);
        if (z3) {
            this.f9128d = MediaEvents.createMediaEvents(this.f9126b);
        }
    }

    @Override // com.anythink.basead.j.b
    public final void a(View view) {
        AdSession adSession = this.f9126b;
        if (adSession == null || view == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    @Override // com.anythink.basead.j.b
    public final void b() {
        AdSession adSession = this.f9126b;
        if (adSession != null) {
            adSession.finish();
        }
    }

    @Override // com.anythink.basead.j.b
    public final com.anythink.basead.j.a c() {
        AdEvents adEvents;
        if (this.f9126b == null || (adEvents = this.f9127c) == null) {
            return null;
        }
        return new a(adEvents);
    }

    @Override // com.anythink.basead.j.b
    public final com.anythink.basead.j.d d() {
        MediaEvents mediaEvents;
        if (this.f9126b == null || (mediaEvents = this.f9128d) == null) {
            return null;
        }
        return new d(mediaEvents);
    }

    @Override // com.anythink.basead.j.b
    public final void a() {
        AdSession adSession = this.f9126b;
        if (adSession != null) {
            adSession.start();
        }
    }

    @Override // com.anythink.basead.j.b
    public final void b(View view) {
        AdSession adSession = this.f9126b;
        if (adSession == null || view == null) {
            return;
        }
        adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.CLOSE_AD, null);
    }

    @Override // com.anythink.basead.j.b
    public final void a(List<View> list) {
        list.size();
        if (this.f9126b == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            this.f9126b.addFriendlyObstruction(list.get(i), FriendlyObstructionPurpose.OTHER, null);
        }
    }
}
