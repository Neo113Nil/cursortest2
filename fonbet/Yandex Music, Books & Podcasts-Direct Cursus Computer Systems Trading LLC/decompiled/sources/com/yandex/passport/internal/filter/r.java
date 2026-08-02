package com.yandex.passport.internal.filter;

import android.content.Context;
import com.yandex.passport.internal.report.reporters.d1;
import defpackage.aym;
import defpackage.bmm;
import defpackage.ern;
import defpackage.gmm;
import defpackage.hmm;
import defpackage.q0v;
import defpackage.s9f;
import defpackage.xyn;

/* loaded from: classes4.dex */
public final class r {
    public static final n d;
    public static final /* synthetic */ s9f[] e;
    public static final hmm.a f;
    public static final String g;
    public final Context a;
    public final d1 b;
    public final gmm c;

    static {
        aym aymVar = new aym(r.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        ern.a.getClass();
        e = new s9f[]{aymVar};
        d = new n();
        f = new hmm.a("filter_rules");
        g = "FilterRulesStorage";
    }

    public r(Context context, d1 d1Var) {
        context.getClass();
        d1Var.getClass();
        this.a = context;
        this.b = d1Var;
        this.c = bmm.a(g, new xyn(new q0v(23, this)), 12);
    }
}
