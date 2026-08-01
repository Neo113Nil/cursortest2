package com.iab.omid.library.toponad.internal;

import android.view.View;
import com.iab.omid.library.toponad.adsession.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.toponad.weakreference.a f36246a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36247b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f36248c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36249d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f36246a = new com.iab.omid.library.toponad.weakreference.a(view);
        this.f36247b = view.getClass().getCanonicalName();
        this.f36248c = friendlyObstructionPurpose;
        this.f36249d = str;
    }

    public String a() {
        return this.f36249d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f36248c;
    }

    public com.iab.omid.library.toponad.weakreference.a c() {
        return this.f36246a;
    }

    public String d() {
        return this.f36247b;
    }
}
