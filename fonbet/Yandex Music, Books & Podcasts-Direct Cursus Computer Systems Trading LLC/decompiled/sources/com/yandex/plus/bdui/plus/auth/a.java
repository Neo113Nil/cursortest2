package com.yandex.plus.bdui.plus.auth;

import com.yandex.passport.internal.ui.social.i;
import defpackage.buu;
import defpackage.tf6;
import defpackage.x97;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class a {
    public final buu a;
    public final com.yandex.plus.log.api.b b;
    public final kotlinx.coroutines.a c;
    public volatile b d;
    public final ReentrantLock e;
    public boolean f;
    public final LinkedHashSet g;

    public a(b bVar, buu buuVar, com.yandex.plus.log.api.b bVar2, kotlinx.coroutines.a aVar) {
        bVar2.getClass();
        aVar.getClass();
        this.a = buuVar;
        this.b = bVar2;
        this.c = aVar;
        this.d = bVar;
        this.e = new ReentrantLock();
        this.g = new LinkedHashSet();
    }

    public final void a(tf6 tf6Var, Function1 function1) {
        tf6Var.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "DefaultPlusAuthController", "authorize()");
        }
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            this.g.add(function1);
            boolean z = true;
            if (!this.f) {
                this.f = true;
                x97.y(tf6Var, this.c, null, new i(this, null, 5), 2);
                z = false;
            }
            if (!z) {
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "DefaultPlusAuthController", "authorize(); launched");
                }
            } else {
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
                if (bVar.b(aVar2)) {
                    bVar.c(aVar2, "DefaultPlusAuthController", "authorize(); alreday was launched!");
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
