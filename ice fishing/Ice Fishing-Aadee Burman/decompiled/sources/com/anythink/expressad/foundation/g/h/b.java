package com.anythink.expressad.foundation.g.h;

import android.content.Context;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19567a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static WeakHashMap<Context, c> f19568b = new WeakHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private c f19569c;

    /* renamed from: d, reason: collision with root package name */
    private Context f19570d;

    private b(Context context) {
        this.f19570d = context;
        if (f19568b.get(context) != null) {
            this.f19569c = f19568b.get(this.f19570d);
            return;
        }
        c cVar = new c(this.f19570d, 5);
        this.f19569c = cVar;
        f19568b.put(this.f19570d, cVar);
    }

    private void a(a aVar) {
        this.f19569c.a(aVar);
    }
}
