package g4;

import android.os.Bundle;
import androidx.lifecycle.n0;
import androidx.lifecycle.p;
import d.h;
import e4.e;
import java.util.LinkedHashMap;
import u7.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f2507a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f2508b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2511e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f2512f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2513g;

    /* renamed from: c, reason: collision with root package name */
    public final d f2509c = new d();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2510d = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f2514h = true;

    public a(e eVar, n0 n0Var) {
        this.f2507a = eVar;
        this.f2508b = n0Var;
    }

    public final void a() {
        e eVar = this.f2507a;
        if (eVar.h().f723c != p.f698h) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f2511e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f2508b.invoke();
        eVar.h().a(new h(2, this));
        this.f2511e = true;
    }
}
