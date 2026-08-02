package com.yandex.plus.pay.log.impl;

import defpackage.b6e;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class c implements com.yandex.plus.log.api.b {
    @Override // com.yandex.plus.log.api.b
    public final void a(com.yandex.plus.log.api.a aVar, String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        String str3 = "[" + str + "] " + str2;
        Timber.Tree tag = Timber.INSTANCE.tag("PlusPay");
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            tag.v(th, str3, new Object[0]);
            return;
        }
        if (ordinal == 1) {
            tag.d(th, str3, new Object[0]);
            return;
        }
        if (ordinal == 2) {
            tag.i(th, str3, new Object[0]);
            return;
        }
        if (ordinal == 3) {
            tag.w(th, str3, new Object[0]);
            return;
        }
        if (ordinal == 4) {
            tag.e(th, str3, new Object[0]);
        } else if (ordinal == 5) {
            tag.wtf(th, str3, new Object[0]);
        } else {
            b6e.s();
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
