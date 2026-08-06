package com.yandex.varioqub.config.impl;

import android.util.Log;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;

/* loaded from: classes.dex */
public final class f implements AdapterIdentifiersCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f2769a;

    public f(g gVar) {
        this.f2769a = gVar;
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onError(String str) {
        this.f2769a.f2771b.countDown();
        this.f2769a.getClass();
        boolean z2 = C.f2746a;
        if (z2 && z2) {
            Log.e("Varioqub/Varioqub/IdentifierProvider", str, null);
        }
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onSuccess(String str) {
        this.f2769a.getClass();
        String str2 = "received userId from adapter - " + str;
        if (C.f2746a) {
            Log.d("Varioqub/IdentifierProvider", str2);
        }
        g gVar = this.f2769a;
        gVar.f2772c = str;
        gVar.f2771b.countDown();
    }
}
