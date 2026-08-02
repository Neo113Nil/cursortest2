package com.yandex.passport.internal.ui.util;

import android.os.Looper;
import defpackage.voi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends voi {
    @Override // defpackage.voi
    public final void m(Object obj) {
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            l(obj);
        } else {
            super.m(obj);
        }
    }
}
