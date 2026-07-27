package com.iab.omid.library.toponad.adsession;

import android.view.View;
import com.iab.omid.library.toponad.internal.c;
import com.iab.omid.library.toponad.internal.e;
import com.iab.omid.library.toponad.internal.f;
import com.iab.omid.library.toponad.internal.i;
import com.iab.omid.library.toponad.publisher.AdSessionStatePublisher;
import com.iab.omid.library.toponad.publisher.b;
import com.iab.omid.library.toponad.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f36206a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f36207b;

    /* renamed from: c, reason: collision with root package name */
    private final f f36208c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.toponad.weakreference.a f36209d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f36210e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f36211f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f36212g;

    /* renamed from: h, reason: collision with root package name */
    private final String f36213h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f36214j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f36215k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f36214j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f36212g) {
            return;
        }
        this.f36208c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f36209d.get();
    }

    public List<e> d() {
        return this.f36208c.a();
    }

    public boolean e() {
        return this.f36215k != null;
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f36212g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f36211f && !this.f36212g;
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void finish() {
        if (this.f36212g) {
            return;
        }
        this.f36209d.clear();
        removeAllFriendlyObstructions();
        this.f36212g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f36210e = null;
        this.f36215k = null;
    }

    public boolean g() {
        return this.f36212g;
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public String getAdSessionId() {
        return this.f36213h;
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f36210e;
    }

    public boolean h() {
        return this.f36207b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f36207b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f36211f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f36214j = true;
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f36212g || c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f36212g) {
            return;
        }
        this.f36208c.b();
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f36212g) {
            return;
        }
        this.f36208c.c(view);
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f36215k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void start() {
        if (this.f36211f || this.f36210e == null) {
            return;
        }
        this.f36211f = true;
        c.c().c(this);
        this.f36210e.a(i.c().b());
        this.f36210e.a(com.iab.omid.library.toponad.internal.a.a().b());
        this.f36210e.a(this, this.f36206a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f36208c = new f();
        this.f36211f = false;
        this.f36212g = false;
        this.f36207b = adSessionConfiguration;
        this.f36206a = adSessionContext;
        this.f36213h = str;
        b(null);
        this.f36210e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.toponad.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f36210e.i();
        c.c().a(this);
        this.f36210e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> b9 = c.c().b();
        if (b9 == null || b9.isEmpty()) {
            return;
        }
        for (a aVar : b9) {
            if (aVar != this && aVar.c() == view) {
                aVar.f36209d.clear();
            }
        }
    }

    private void b(View view) {
        this.f36209d = new com.iab.omid.library.toponad.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.toponad.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.toponad.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f36215k.onPossibleObstructionsDetected(this.f36213h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f36214j = true;
    }
}
