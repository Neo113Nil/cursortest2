package com.anythink.expressad.g;

import android.content.Context;
import com.anythink.expressad.foundation.g.f.n;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements com.anythink.expressad.b {

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, String> f19792a;

    /* renamed from: b, reason: collision with root package name */
    private Context f19793b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19794c = false;

    private void a() {
        this.f19794c = false;
        try {
            n.a(this.f19793b);
            com.anythink.expressad.foundation.b.b.a().a(f19792a, this.f19793b);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.b
    public final void a(Map<String, String> map, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f19793b = applicationContext;
        f19792a = map;
        this.f19794c = false;
        try {
            n.a(applicationContext);
            com.anythink.expressad.foundation.b.b.a().a(f19792a, this.f19793b);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }
}
