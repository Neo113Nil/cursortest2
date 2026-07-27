package com.anythink.expressad.foundation.g.h;

import android.content.Context;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19725a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static WeakHashMap<Context, c> f19726b = new WeakHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private c f19727c;

    /* renamed from: d, reason: collision with root package name */
    private Context f19728d;

    private b(Context context) {
        this.f19728d = context;
        if (f19726b.get(context) != null) {
            this.f19727c = f19726b.get(this.f19728d);
            return;
        }
        c cVar = new c(this.f19728d, 5);
        this.f19727c = cVar;
        f19726b.put(this.f19728d, cVar);
    }

    private void a(a aVar) {
        this.f19727c.a(aVar);
    }
}
