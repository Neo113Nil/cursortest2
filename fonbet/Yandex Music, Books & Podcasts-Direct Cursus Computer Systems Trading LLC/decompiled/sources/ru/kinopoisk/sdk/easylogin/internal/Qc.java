package ru.kinopoisk.sdk.easylogin.internal;

import android.view.View;
import android.view.ViewGroup;
import defpackage.h5n;
import defpackage.hqv;
import defpackage.jj4;
import defpackage.kqv;
import defpackage.ndu;
import defpackage.wdu;
import defpackage.zne;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Qc {
    public static final kqv a(boolean z, View view, Function1 function1, boolean z2, boolean z3, boolean z4, boolean z5, View view2, kqv kqvVar) {
        view2.getClass();
        kqvVar.getClass();
        hqv hqvVar = kqvVar.a;
        hqv hqvVar2 = kqvVar.a;
        zne g = hqvVar.g(647);
        g.getClass();
        boolean z6 = z && hqvVar2.q(8);
        int i = z6 ? hqvVar2.g(8).d : g.d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            jj4.j("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z2) {
            marginLayoutParams.leftMargin = g.a;
        }
        if (z3) {
            marginLayoutParams.rightMargin = g.c;
        }
        if (z4) {
            marginLayoutParams.topMargin = g.b;
        }
        if (z5 || z6) {
            marginLayoutParams.bottomMargin = i;
        }
        view.setLayoutParams(marginLayoutParams);
        if (function1 != null) {
            function1.invoke(g);
        }
        return kqv.b;
    }

    public static final void a(@NotNull View view) {
        view.getClass();
        h5n h5nVar = new h5n(0, view);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(view, h5nVar);
    }
}
