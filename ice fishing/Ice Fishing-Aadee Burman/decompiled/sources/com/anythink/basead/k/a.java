package com.anythink.basead.k;

import com.iab.omid.library.toponad.adsession.AdEvents;
import com.iab.omid.library.toponad.adsession.media.Position;
import com.iab.omid.library.toponad.adsession.media.VastProperties;

/* loaded from: classes.dex */
public class a implements com.anythink.basead.j.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f9123a = "a";

    /* renamed from: b, reason: collision with root package name */
    private AdEvents f9124b;

    public a(AdEvents adEvents) {
        this.f9124b = adEvents;
    }

    @Override // com.anythink.basead.j.a
    public final void a() {
        AdEvents adEvents = this.f9124b;
        if (adEvents != null) {
            adEvents.impressionOccurred();
        }
    }

    @Override // com.anythink.basead.j.a
    public final void a(boolean z3) {
        AdEvents adEvents = this.f9124b;
        if (adEvents != null) {
            if (z3) {
                this.f9124b.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
            } else {
                adEvents.loaded();
            }
        }
    }
}
