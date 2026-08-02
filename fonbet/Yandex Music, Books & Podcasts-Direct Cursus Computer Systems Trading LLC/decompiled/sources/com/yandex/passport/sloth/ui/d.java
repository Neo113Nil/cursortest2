package com.yandex.passport.sloth.ui;

import android.app.Activity;
import android.content.Context;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class d {
    public final g a;
    public final com.yandex.passport.sloth.ui.string.b b;
    public final com.yandex.passport.sloth.ui.dependencies.d c;
    public final Activity d;

    public d(Context context, g gVar, com.yandex.passport.sloth.ui.string.b bVar, com.yandex.passport.sloth.ui.dependencies.d dVar) {
        context.getClass();
        this.a = gVar;
        this.b = bVar;
        this.c = dVar;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            this.d = activity;
        } else {
            xq0.q("Trying to use Sloth without Activity UI");
            throw null;
        }
    }
}
