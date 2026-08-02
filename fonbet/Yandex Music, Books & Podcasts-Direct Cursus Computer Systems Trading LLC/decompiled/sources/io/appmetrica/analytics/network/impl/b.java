package io.appmetrica.analytics.network.impl;

import defpackage.uif;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class b extends uif implements Function0 {
    public final /* synthetic */ HttpsURLConnection a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.a = httpsURLConnection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.getErrorStream();
    }
}
