package com.iab.omid.library.toponad.walking.async;

import com.iab.omid.library.toponad.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f37088c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f37089d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f37090e;

    public a(b.InterfaceC0173b interfaceC0173b, HashSet<String> hashSet, JSONObject jSONObject, long j6) {
        super(interfaceC0173b);
        this.f37088c = new HashSet<>(hashSet);
        this.f37089d = jSONObject;
        this.f37090e = j6;
    }
}
