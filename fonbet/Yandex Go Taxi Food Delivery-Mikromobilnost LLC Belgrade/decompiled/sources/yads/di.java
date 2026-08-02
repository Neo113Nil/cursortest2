package yads;

import android.view.View;
import defpackage.ch61;
import defpackage.ps81;

/* loaded from: classes7.dex */
public final class di implements View.OnClickListener {
    public final ch61 a;
    public final String b;
    public final String c;
    public final ps81 d;

    public di(ch61 ch61Var, String str, String str2, ps81 ps81Var) {
        this.a = ch61Var;
        this.b = str;
        this.c = str2;
        this.d = ps81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d.a(this.c);
        this.a.a(this.b);
    }
}
