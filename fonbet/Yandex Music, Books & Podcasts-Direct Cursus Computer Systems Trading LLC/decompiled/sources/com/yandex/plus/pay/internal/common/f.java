package com.yandex.plus.pay.internal.common;

import defpackage.b6e;
import defpackage.g8m;

/* loaded from: classes5.dex */
public final class f implements com.yandex.plus.log.api.b {
    public final g8m a;

    public f(g8m g8mVar) {
        g8mVar.getClass();
        this.a = g8mVar;
    }

    @Override // com.yandex.plus.log.api.b
    public final void a(com.yandex.plus.log.api.a aVar, String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        int ordinal = aVar.ordinal();
        g8m g8mVar = this.a;
        if (ordinal == 0) {
            g8mVar.getClass();
            g8m.a(2, str, str2, th);
            return;
        }
        if (ordinal == 1) {
            g8mVar.getClass();
            g8m.a(3, str, str2, th);
            return;
        }
        if (ordinal == 2) {
            g8mVar.getClass();
            g8m.a(4, str, str2, th);
            return;
        }
        if (ordinal == 3) {
            g8mVar.getClass();
            g8m.a(5, str, str2, th);
        } else if (ordinal == 4) {
            g8mVar.getClass();
            g8m.a(6, str, str2, th);
        } else if (ordinal != 5) {
            b6e.s();
        } else {
            g8mVar.getClass();
            g8m.a(7, str, str2, th);
        }
    }

    @Override // com.yandex.plus.log.api.b
    public final boolean b(com.yandex.plus.log.api.a aVar) {
        return true;
    }

    @Override // com.yandex.plus.log.api.b
    public final void c(com.yandex.plus.log.api.a aVar, String str, String str2) {
        str.getClass();
        str2.getClass();
        a(aVar, str, str2, null);
    }
}
