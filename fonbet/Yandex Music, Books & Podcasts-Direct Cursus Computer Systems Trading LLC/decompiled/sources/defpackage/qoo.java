package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class qoo implements too {
    public final uoo a;
    public boolean b;
    public Bundle c;
    public final jyr d;

    public qoo(uoo uooVar, kfu kfuVar) {
        uooVar.getClass();
        this.a = uooVar;
        this.d = btf.b(new b6n(27, kfuVar));
    }

    @Override // defpackage.too
    public final Bundle a() {
        e5b.a.getClass();
        Bundle K = cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            K.putAll(bundle);
        }
        for (Map.Entry entry : ((roo) this.d.getValue()).k.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((ym5) ((noo) entry.getValue()).b.e).a();
            if (!a.isEmpty()) {
                str.getClass();
                K.putBundle(str, a);
            }
        }
        this.b = false;
        return K;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle a = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        e5b.a.getClass();
        Bundle K = cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            K.putAll(bundle);
        }
        if (a != null) {
            K.putAll(a);
        }
        this.c = K;
        this.b = true;
    }
}
