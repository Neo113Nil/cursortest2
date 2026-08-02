package com.yandex.passport.internal.ui.sloth.menu;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.passport.sloth.ui.j2;
import defpackage.g2k;
import defpackage.ldg;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class p {
    public final i a;
    public final com.yandex.passport.sloth.ui.string.b b;

    public p(i iVar, com.yandex.passport.sloth.ui.string.b bVar) {
        iVar.getClass();
        bVar.getClass();
        this.a = iVar;
        this.b = bVar;
    }

    public final void a(Function0 function0, boolean z) {
        j2 j2Var = this.a.e;
        ((LinearLayout) j2Var.e()).setVisibility(0);
        j2Var.e.setVisibility(8);
        j2Var.g.setVisibility(0);
        TextView textView = j2Var.h;
        textView.setVisibility(0);
        com.yandex.passport.sloth.ui.string.a aVar = z ? com.yandex.passport.sloth.ui.string.a.c : com.yandex.passport.sloth.ui.string.a.a;
        com.yandex.passport.internal.ui.sloth.g gVar = (com.yandex.passport.internal.ui.sloth.g) this.b;
        textView.setText(gVar.a(aVar));
        Button button = j2Var.i;
        button.setVisibility(0);
        button.setText(gVar.a(com.yandex.passport.sloth.ui.string.a.d));
        ldg.B(button, new g2k(function0, null, 1));
    }
}
