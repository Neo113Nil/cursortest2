package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class voo {
    public final bnh a;
    public final uoo b;

    public voo(bnh bnhVar) {
        this.a = bnhVar;
        this.b = new uoo(bnhVar);
    }

    public final void a(Bundle bundle) {
        bnh bnhVar = this.a;
        woo wooVar = (woo) bnhVar.d;
        if (!bnhVar.a) {
            bnhVar.a();
        }
        if (wooVar.getLifecycle().b().compareTo(lyf.d) >= 0) {
            l1j.m(wooVar.getLifecycle().b(), "performRestore cannot be called when owner is ");
            return;
        }
        if (bnhVar.b) {
            xq0.q("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = lsq.w(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        bnhVar.h = bundle2;
        bnhVar.b = true;
    }

    public final void b(Bundle bundle) {
        bundle.getClass();
        bnh bnhVar = this.a;
        e5b.a.getClass();
        Bundle K = cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = (Bundle) bnhVar.h;
        if (bundle2 != null) {
            K.putAll(bundle2);
        }
        synchronized (((l3l) bnhVar.f)) {
            for (Map.Entry entry : ((LinkedHashMap) bnhVar.g).entrySet()) {
                String str = (String) entry.getKey();
                Bundle a = ((too) entry.getValue()).a();
                str.getClass();
                K.putBundle(str, a);
            }
        }
        if (K.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", K);
    }
}
