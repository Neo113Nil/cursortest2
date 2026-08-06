package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907ym implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final Am f7252a;

    /* renamed from: b, reason: collision with root package name */
    public C0364dm f7253b;

    /* renamed from: c, reason: collision with root package name */
    public Jl f7254c;

    /* renamed from: d, reason: collision with root package name */
    public final RequestDataHolder f7255d;

    /* renamed from: e, reason: collision with root package name */
    public final ConfigProvider f7256e;

    /* renamed from: f, reason: collision with root package name */
    public final ResponseDataHolder f7257f;

    /* renamed from: g, reason: collision with root package name */
    public final FullUrlFormer f7258g;

    /* renamed from: h, reason: collision with root package name */
    public final Rl f7259h;

    public C0907ym(Am am, FullUrlFormer<C0312bm> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<C0312bm> configProvider) {
        this(am, new Rl(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "Startup task for component: " + this.f7252a.f4163a.f4230f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f7258g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f7255d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f7257f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0312bm) this.f7256e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((Al) C0610na.f6575I.z()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f7255d.setHeader("Accept-Encoding", "encrypted");
        return this.f7252a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z2) {
        if (z2) {
            return;
        }
        this.f7254c = Jl.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C0364dm handle = this.f7259h.handle(this.f7257f);
        this.f7253b = handle;
        return handle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
        this.f7254c = Jl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f7254c = Jl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f7253b == null || this.f7257f.getResponseHeaders() == null) {
            return;
        }
        this.f7252a.a(this.f7253b, (C0312bm) this.f7256e.getConfig(), this.f7257f.getResponseHeaders());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
        if (this.f7254c == null) {
            this.f7254c = Jl.UNKNOWN;
        }
        this.f7252a.a(this.f7254c);
    }

    public C0907ym(Am am, Rl rl, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f7252a = am;
        this.f7259h = rl;
        this.f7255d = requestDataHolder;
        this.f7257f = responseDataHolder;
        this.f7256e = configProvider;
        this.f7258g = fullUrlFormer;
        fullUrlFormer.setHosts(((C0312bm) configProvider.getConfig()).k());
    }
}
