package com.yandex.passport.sloth.ui;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.b6e;
import defpackage.ldg;
import defpackage.qs;
import defpackage.uah;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class s0 {
    public final n0 a;
    public final com.yandex.passport.sloth.ui.string.b b;
    public final b1 c;
    public Function0 d;
    public boolean e;
    public c1 f;

    public s0(n0 n0Var, com.yandex.passport.sloth.ui.string.b bVar, b1 b1Var) {
        n0Var.getClass();
        bVar.getClass();
        b1Var.getClass();
        this.a = n0Var;
        this.b = bVar;
        this.c = b1Var;
        this.f = q0.d;
    }

    public static String a(c1 c1Var) {
        if (c1Var.equals(q0.b)) {
            return "ConnectionError";
        }
        if (c1Var.equals(q0.c)) {
            return "Progress";
        }
        if (c1Var.equals(q0.d)) {
            return "WebView";
        }
        b6e.s();
        return null;
    }

    public final void b(c1 c1Var) {
        p0 p0Var = p0.b;
        q0 q0Var = q0.d;
        if (c1Var.equals(this.f)) {
            return;
        }
        if (this.e && c1Var.equals(q0Var)) {
            return;
        }
        boolean equals = c1Var.equals(q0.c);
        n0 n0Var = this.a;
        if (equals) {
            n0Var.f.setVisibility(8);
            j2 j2Var = n0Var.g;
            ((LinearLayout) j2Var.e()).setVisibility(0);
            j2Var.e.setVisibility(0);
            j2Var.g.setVisibility(8);
            j2Var.h.setVisibility(8);
            f(p0Var, false);
        } else if (c1Var.equals(q0Var)) {
            n0Var.f.setVisibility(0);
            ((LinearLayout) n0Var.g.e()).setVisibility(8);
            f(p0Var, false);
        } else if (!c1Var.equals(q0.b)) {
            b6e.s();
            return;
        }
        String a = a(this.f);
        String a2 = a(c1Var);
        this.c.a(new com.yandex.passport.sloth.n0(16, com.yandex.passport.sloth.r0.UI_STATE_CHANGE, uah.e(new Pair("from", a), new Pair("to", a2))));
        this.f = c1Var;
    }

    public final void c() {
        b(q0.b);
        n0 n0Var = this.a;
        n0Var.f.setVisibility(8);
        j2 j2Var = n0Var.g;
        ((LinearLayout) j2Var.e()).setVisibility(0);
        j2Var.e.setVisibility(0);
        j2Var.g.setVisibility(8);
        TextView textView = j2Var.h;
        textView.setVisibility(0);
        textView.setText(((com.yandex.passport.internal.ui.sloth.g) this.b).a(com.yandex.passport.sloth.ui.string.a.c));
        f(p0.b, true);
    }

    public final void d(com.yandex.passport.sloth.ui.string.a aVar, c1 c1Var) {
        n0 n0Var = this.a;
        n0Var.f.setVisibility(8);
        j2 j2Var = n0Var.g;
        ((LinearLayout) j2Var.e()).setVisibility(0);
        j2Var.e.setVisibility(8);
        ImageView imageView = j2Var.g;
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.passport_sloth_unexpected_error);
        TextView textView = j2Var.h;
        textView.setVisibility(0);
        textView.setText(((com.yandex.passport.internal.ui.sloth.g) this.b).a(aVar));
        f(c1Var, false);
    }

    public final void e(Function0 function0) {
        d(com.yandex.passport.sloth.ui.string.a.a, new o0(function0));
    }

    public final void f(c1 c1Var, boolean z) {
        Button button = this.a.g.i;
        Continuation continuation = null;
        if (c1Var.equals(p0.d)) {
            button.setVisibility(8);
            button.setText("");
            button.setOnClickListener(null);
            return;
        }
        if (c1Var.equals(p0.b)) {
            button.setVisibility(z ? 0 : 8);
            button.setText(android.R.string.cancel);
            ldg.B(button, new r0(this, continuation, 0));
            return;
        }
        boolean equals = c1Var.equals(p0.c);
        com.yandex.passport.sloth.ui.string.b bVar = this.b;
        if (equals) {
            button.setVisibility(0);
            button.setText(((com.yandex.passport.internal.ui.sloth.g) bVar).a(com.yandex.passport.sloth.ui.string.a.h));
            ldg.B(button, new r0(this, continuation, 1));
        } else {
            if (!(c1Var instanceof o0)) {
                b6e.s();
                return;
            }
            button.setVisibility(8);
            button.setText(((com.yandex.passport.internal.ui.sloth.g) bVar).a(com.yandex.passport.sloth.ui.string.a.d));
            ldg.B(button, new qs(c1Var, continuation, 22));
        }
    }
}
