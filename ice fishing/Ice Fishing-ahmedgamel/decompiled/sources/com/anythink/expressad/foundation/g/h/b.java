package com.anythink.expressad.foundation.g.h;

import android.content.Context;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20354a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static WeakHashMap<Context, c> f20355b = new WeakHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private c f20356c;

    /* renamed from: d, reason: collision with root package name */
    private Context f20357d;

    private b(Context context) {
        this.f20357d = context;
        if (f20355b.get(context) != null) {
            this.f20356c = f20355b.get(this.f20357d);
            return;
        }
        c cVar = new c(this.f20357d, 5);
        this.f20356c = cVar;
        f20355b.put(this.f20357d, cVar);
    }

    private void a(a aVar) {
        this.f20356c.a(aVar);
    }
}
