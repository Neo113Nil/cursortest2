package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.C4236yh;

/* renamed from: com.google.android.gms.internal.consent_sdk.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4373q extends WebView {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f35899w = 0;

    /* renamed from: n, reason: collision with root package name */
    public final Handler f35900n;

    /* renamed from: u, reason: collision with root package name */
    public final C4236yh f35901u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f35902v;

    public C4373q(r rVar, Handler handler, C4236yh c4236yh) {
        super(rVar);
        this.f35902v = false;
        this.f35900n = handler;
        this.f35901u = c4236yh;
    }

    public final void a(String str, String str2) {
        this.f35900n.post(new RunnableC4353l(1, this, str + "(" + str2 + ");"));
    }
}
