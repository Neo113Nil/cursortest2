package com.yandex.passport.internal.ui.base;

import android.content.Context;
import android.content.Intent;
import defpackage.wvs;

/* loaded from: classes4.dex */
public final class l {
    public final com.yandex.passport.legacy.lx.g a;
    public final int b;

    public l(com.yandex.passport.legacy.lx.g gVar, int i) {
        this.a = gVar;
        this.b = i;
    }

    public final Intent a(Context context) {
        try {
            return (Intent) this.a.b(context);
        } catch (Exception e) {
            wvs.m(e);
            return null;
        }
    }
}
