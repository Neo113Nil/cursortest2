package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o0 implements e4.d {

    /* renamed from: a, reason: collision with root package name */
    public final x4.l f693a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f694b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f695c;

    /* renamed from: d, reason: collision with root package name */
    public final ac.m f696d;

    public o0(x4.l lVar, y0 y0Var) {
        pc.j.e(lVar, "savedStateRegistry");
        this.f693a = lVar;
        this.f696d = bc.a0.y(new n0(0, y0Var));
    }

    @Override // e4.d
    public final Bundle a() {
        Bundle e10 = bc.a0.e((ac.i[]) Arrays.copyOf(new ac.i[0], 0));
        Bundle bundle = this.f695c;
        if (bundle != null) {
            e10.putAll(bundle);
        }
        for (Map.Entry entry : ((p0) this.f696d.getValue()).f703b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a6 = ((d.i) ((j0) entry.getValue()).f682a.f1820e).a();
            if (!a6.isEmpty()) {
                pc.j.e(str, "key");
                e10.putBundle(str, a6);
            }
        }
        this.f694b = false;
        return e10;
    }

    public final void b() {
        if (this.f694b) {
            return;
        }
        Bundle b2 = this.f693a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle e10 = bc.a0.e((ac.i[]) Arrays.copyOf(new ac.i[0], 0));
        Bundle bundle = this.f695c;
        if (bundle != null) {
            e10.putAll(bundle);
        }
        if (b2 != null) {
            e10.putAll(b2);
        }
        this.f695c = e10;
        this.f694b = true;
    }
}
