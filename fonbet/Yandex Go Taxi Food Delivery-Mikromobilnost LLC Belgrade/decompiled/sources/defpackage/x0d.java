package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import flex.trim.memory.ComponentCallbacks2Handler$attach$1;

/* loaded from: classes9.dex */
public final class x0d {
    public ComponentCallbacks2Handler$attach$1 a;

    public final void a(ViewGroup viewGroup) {
        Context context;
        ComponentCallbacks2Handler$attach$1 componentCallbacks2Handler$attach$1 = this.a;
        if (componentCallbacks2Handler$attach$1 != null) {
            Context applicationContext = (viewGroup == null || (context = viewGroup.getContext()) == null) ? null : context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).unregisterComponentCallbacks(componentCallbacks2Handler$attach$1);
            }
            this.a = null;
        }
    }
}
