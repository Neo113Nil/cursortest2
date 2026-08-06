package com.yandex.varioqub.config.impl;

import android.util.Log;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;

/* loaded from: classes.dex */
public final class e implements AdapterIdentifiersCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f2768a;

    public e(g gVar) {
        this.f2768a = gVar;
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onError(String str) {
        this.f2768a.getClass();
        boolean z2 = C.f2746a;
        if (z2 && z2) {
            Log.e("Varioqub/Varioqub/IdentifierProvider", str, null);
        }
        l.a(3);
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onSuccess(String str) {
        this.f2768a.getClass();
        String str2 = "received deviceId from adapter - " + str;
        if (C.f2746a) {
            Log.d("Varioqub/IdentifierProvider", str2);
        }
        this.f2768a.f2773d = str;
        l.a(3);
    }
}
