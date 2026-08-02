package com.yandex.plus.bdui;

import defpackage.md;

/* loaded from: classes4.dex */
public final /* synthetic */ class o {
    public final /* synthetic */ com.yandex.plus.log.api.b a;

    public void a(md mdVar, Throwable th) {
        mdVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            bVar.a(aVar, "ActionDispatcherFactory", "Action " + mdVar + " dispatch failed!", th);
        }
    }
}
