package com.anythink.expressad.g;

import android.content.Context;
import com.anythink.expressad.foundation.g.f.n;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements com.anythink.expressad.b {

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, String> f19950a;

    /* renamed from: b, reason: collision with root package name */
    private Context f19951b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19952c = false;

    private void a() {
        this.f19952c = false;
        try {
            n.a(this.f19951b);
            com.anythink.expressad.foundation.b.b.a().a(f19950a, this.f19951b);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.b
    public final void a(Map<String, String> map, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f19951b = applicationContext;
        f19950a = map;
        this.f19952c = false;
        try {
            n.a(applicationContext);
            com.anythink.expressad.foundation.b.b.a().a(f19950a, this.f19951b);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }
}
