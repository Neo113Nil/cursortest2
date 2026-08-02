package com.yandex.passport.internal.ui.util;

import android.os.Build;
import android.view.View;
import android.view.Window;
import defpackage.knn;
import defpackage.lqv;
import defpackage.mqv;
import defpackage.nqv;
import defpackage.oqv;
import defpackage.q5g;
import defpackage.y5g;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public class c extends com.yandex.plus.core.network.api.utils.a {
    @Override // com.yandex.plus.core.network.api.utils.a
    public void C(@NotNull r rVar, @NotNull r rVar2, @NotNull Window window, @NotNull View view, boolean z, boolean z2) {
        rVar.getClass();
        rVar2.getClass();
        window.getClass();
        view.getClass();
        q5g.I(window, false);
        window.setStatusBarColor(z ? rVar.b : rVar.a);
        window.setNavigationBarColor(z2 ? rVar2.b : rVar2.a);
        knn knnVar = new knn(view);
        int i = Build.VERSION.SDK_INT;
        y5g oqvVar = i >= 35 ? new oqv(window, knnVar) : i >= 30 ? new nqv(window, knnVar) : i >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar);
        oqvVar.k0(!z);
        oqvVar.j0(!z2);
    }
}
