package com.anythink.expressad.g;

import android.content.Context;
import com.anythink.expressad.foundation.g.f.n;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements com.anythink.expressad.b {

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, String> f20579a;

    /* renamed from: b, reason: collision with root package name */
    private Context f20580b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20581c = false;

    private void a() {
        this.f20581c = false;
        try {
            n.a(this.f20580b);
            com.anythink.expressad.foundation.b.b.a().a(f20579a, this.f20580b);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.b
    public final void a(Map<String, String> map, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f20580b = applicationContext;
        f20579a = map;
        this.f20581c = false;
        try {
            n.a(applicationContext);
            com.anythink.expressad.foundation.b.b.a().a(f20579a, this.f20580b);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }
}
