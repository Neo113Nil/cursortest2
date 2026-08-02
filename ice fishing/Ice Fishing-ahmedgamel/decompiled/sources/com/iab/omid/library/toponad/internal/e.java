package com.iab.omid.library.toponad.internal;

import android.view.View;
import com.iab.omid.library.toponad.adsession.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.toponad.weakreference.a f37013a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37014b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f37015c;

    /* renamed from: d, reason: collision with root package name */
    private final String f37016d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f37013a = new com.iab.omid.library.toponad.weakreference.a(view);
        this.f37014b = view.getClass().getCanonicalName();
        this.f37015c = friendlyObstructionPurpose;
        this.f37016d = str;
    }

    public String a() {
        return this.f37016d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f37015c;
    }

    public com.iab.omid.library.toponad.weakreference.a c() {
        return this.f37013a;
    }

    public String d() {
        return this.f37014b;
    }
}
