package com.anythink.expressad.out;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected Map<String, Object> f20807a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f20808b;

    public a() {
    }

    public abstract boolean a();

    public abstract void b();

    private a(Map<String, Object> map, Context context) {
        this.f20807a = map;
        this.f20808b = context;
    }
}
