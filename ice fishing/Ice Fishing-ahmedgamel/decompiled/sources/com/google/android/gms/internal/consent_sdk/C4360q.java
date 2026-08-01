package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.C2504Ch;

/* renamed from: com.google.android.gms.internal.consent_sdk.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4360q extends WebView {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f35736w = 0;

    /* renamed from: n, reason: collision with root package name */
    public final Handler f35737n;

    /* renamed from: u, reason: collision with root package name */
    public final C2504Ch f35738u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f35739v;

    public C4360q(r rVar, Handler handler, C2504Ch c2504Ch) {
        super(rVar);
        this.f35739v = false;
        this.f35737n = handler;
        this.f35738u = c2504Ch;
    }

    public final void a(String str, String str2) {
        this.f35737n.post(new RunnableC4340l(1, this, str + "(" + str2 + ");"));
    }
}
