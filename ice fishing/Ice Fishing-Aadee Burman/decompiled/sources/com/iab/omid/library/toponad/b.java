package com.iab.omid.library.toponad;

import android.content.Context;
import com.iab.omid.library.toponad.internal.i;
import com.iab.omid.library.toponad.internal.j;
import com.iab.omid.library.toponad.utils.e;
import com.iab.omid.library.toponad.utils.g;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f36220a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.5.2-Toponad";
    }

    public void c() {
        g.a();
        com.iab.omid.library.toponad.internal.a.a().d();
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.toponad.internal.b.g().a(context);
        com.iab.omid.library.toponad.utils.a.a(context);
        com.iab.omid.library.toponad.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.toponad.internal.g.b().a(context);
        com.iab.omid.library.toponad.internal.a.a().a(context);
        j.b().a(context);
    }

    public boolean b() {
        return this.f36220a;
    }

    public void a(boolean z3) {
        this.f36220a = z3;
    }
}
