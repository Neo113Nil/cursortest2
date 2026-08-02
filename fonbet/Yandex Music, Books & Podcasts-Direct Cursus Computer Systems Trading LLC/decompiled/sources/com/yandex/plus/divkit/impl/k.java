package com.yandex.plus.divkit.impl;

import defpackage.y7k;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements y7k {
    public final /* synthetic */ com.yandex.plus.log.api.b b;
    public final /* synthetic */ String c;

    public /* synthetic */ k(com.yandex.plus.log.api.b bVar, String str) {
        this.b = bVar;
        this.c = str;
    }

    @Override // defpackage.y7k
    public final void a(Exception exc) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            String message = exc.getMessage();
            if (message == null) {
                message = "DivKit parsing error!";
            }
            bVar.a(aVar, this.c, message, exc);
        }
    }
}
