package com.yandex.metrica.push.utils;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
class c implements Callable<String> {
    final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // java.util.concurrent.Callable
    public String call() throws Exception {
        String a;
        a = this.a.a();
        return a;
    }
}
