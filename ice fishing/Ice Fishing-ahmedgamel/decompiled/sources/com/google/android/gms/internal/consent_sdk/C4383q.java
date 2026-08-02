package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.C2524Ch;

/* renamed from: com.google.android.gms.internal.consent_sdk.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4383q extends WebView {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f36505w = 0;

    /* renamed from: n, reason: collision with root package name */
    public final Handler f36506n;

    /* renamed from: u, reason: collision with root package name */
    public final C2524Ch f36507u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f36508v;

    public C4383q(r rVar, Handler handler, C2524Ch c2524Ch) {
        super(rVar);
        this.f36508v = false;
        this.f36506n = handler;
        this.f36507u = c2524Ch;
    }

    public final void a(String str, String str2) {
        this.f36506n.post(new RunnableC4363l(1, this, str + "(" + str2 + ");"));
    }
}
