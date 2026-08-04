package com.gamericefishpro.space.i2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.gamericefishpro.space.R;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m2 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final com.gamericefishpro.space.si.l0 a(Context context) {
        com.gamericefishpro.space.si.l0 l0Var;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object objL = linkedHashMap.get(context);
                if (objL == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    com.gamericefishpro.space.ri.e eVarA = com.gamericefishpro.space.hj.c.a(-1, 6, null);
                    com.gamericefishpro.space.l4.p pVar = new com.gamericefishpro.space.l4.p(new k2(contentResolver, uriFor, new l2(eVarA, com.gamericefishpro.space.a.a.f(Looper.getMainLooper())), eVarA, context, null));
                    com.gamericefishpro.space.pi.u1 u1VarD = com.gamericefishpro.space.pi.a0.d();
                    com.gamericefishpro.space.wi.e eVar = com.gamericefishpro.space.pi.k0.a;
                    objL = com.gamericefishpro.space.si.e0.l(pVar, new com.gamericefishpro.space.ui.c(kotlin.coroutines.e.c(u1VarD, com.gamericefishpro.space.ui.m.a)), new com.gamericefishpro.space.si.k0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objL);
                }
                l0Var = (com.gamericefishpro.space.si.l0) objL;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l0Var;
    }

    public static final com.gamericefishpro.space.t0.u b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof com.gamericefishpro.space.t0.u) {
            return (com.gamericefishpro.space.t0.u) tag;
        }
        return null;
    }
}
