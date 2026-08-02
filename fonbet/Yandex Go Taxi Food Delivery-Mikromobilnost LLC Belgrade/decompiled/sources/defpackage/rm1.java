package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.a;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class rm1 {
    public static final /* synthetic */ kgx[] k;
    public final ViewGroup a;
    public final sm1 b;
    public final kse c;
    public final h3y d;
    public final ViewGroup f;
    public final ViewGroup g;
    public final i3y j;
    public final ArrayList e = new ArrayList();
    public final lh00 h = new lh00();
    public final rp3 i = new rp3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("clickHandleJob", 0, "getClickHandleJob()Lkotlinx/coroutines/Job;", rm1.class);
        qoi0.a.getClass();
        k = new kgx[]{mutablePropertyReference1Impl};
    }

    public rm1(ViewGroup viewGroup, sls slsVar, sm1 sm1Var, kse kseVar, h3y h3yVar) {
        this.a = viewGroup;
        this.b = sm1Var;
        this.c = kseVar;
        this.d = h3yVar;
        this.f = (ViewGroup) viewGroup.findViewById(e9h0.ai_bot_actions_container);
        this.g = (ViewGroup) viewGroup.findViewById(e9h0.added_buttons_container);
        this.j = a.a(new jc0(4, slsVar));
    }

    public final void a() {
        this.a.setVisibility(8);
        this.f.setVisibility(8);
        lh00 lh00Var = this.h;
        lh00Var.a.clear();
        lh00Var.b.clear();
        this.g.setVisibility(8);
        kgx kgxVar = k[0];
        this.i.a(null);
    }
}
