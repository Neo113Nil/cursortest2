package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final /* synthetic */ class Ko implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4653c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4655e;

    public /* synthetic */ Ko(Object obj, String str, String str2, Object obj2, int i2) {
        this.f4651a = i2;
        this.f4654d = obj;
        this.f4652b = str;
        this.f4653c = str2;
        this.f4655e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4651a) {
            case 0:
                F0.a((F0) this.f4654d, this.f4652b, this.f4653c, (String) this.f4655e);
                break;
            default:
                L0.a((L0) this.f4654d, this.f4652b, this.f4653c, (PluginErrorDetails) this.f4655e);
                break;
        }
    }
}
