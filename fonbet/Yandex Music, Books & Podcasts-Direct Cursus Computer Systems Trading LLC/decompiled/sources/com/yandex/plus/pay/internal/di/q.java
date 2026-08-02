package com.yandex.plus.pay.internal.di;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import defpackage.b6e;
import defpackage.ie5;
import defpackage.oxa;
import defpackage.qnb;

/* loaded from: classes5.dex */
public final class q {
    public final /* synthetic */ ie5 a;

    public q(ie5 ie5Var) {
        this.a = ie5Var;
    }

    public final oxa a() {
        qnb qnbVar;
        i iVar = (i) this.a.a;
        DisplayMetrics displayMetrics = iVar.j.getResources().getDisplayMetrics();
        Build.MODEL.getClass();
        displayMetrics.getClass();
        String valueOf = String.valueOf(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        String valueOf2 = String.valueOf(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels));
        String valueOf3 = String.valueOf(displayMetrics.densityDpi);
        String valueOf4 = String.valueOf(Build.VERSION.SDK_INT);
        Build.MANUFACTURER.getClass();
        String b = iVar.s.b();
        String str = b == null ? "" : b;
        String a = iVar.s.a();
        String str2 = a == null ? "" : a;
        String str3 = iVar.i;
        Context context = iVar.j;
        context.getClass();
        Long g = com.yandex.plus.home.common.utils.a.g(context);
        int longValue = g != null ? (int) g.longValue() : -1;
        String c = iVar.c();
        int ordinal = com.yandex.plus.home.plaque.animator.internal.utils.a.h(com.yandex.plus.pay.common.api.model.a.b, iVar.j).ordinal();
        if (ordinal == 0) {
            qnbVar = qnb.Android;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            qnbVar = qnb.AndroidTv;
        }
        return new oxa(valueOf, valueOf2, str, str2, str3, longValue, c, qnbVar, valueOf4, valueOf3);
    }
}
