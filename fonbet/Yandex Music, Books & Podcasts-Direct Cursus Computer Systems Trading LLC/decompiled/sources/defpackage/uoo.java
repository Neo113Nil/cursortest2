package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uoo {
    public final bnh a;
    public fq0 b;

    public uoo(bnh bnhVar) {
        this.a = bnhVar;
    }

    public final Bundle a(String str) {
        bnh bnhVar = this.a;
        if (!bnhVar.b) {
            xq0.q("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = (Bundle) bnhVar.h;
        if (bundle == null) {
            return null;
        }
        Bundle w = bundle.containsKey(str) ? lsq.w(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            bnhVar.h = null;
        }
        return w;
    }

    public final too b() {
        too tooVar;
        bnh bnhVar = this.a;
        synchronized (((l3l) bnhVar.f)) {
            Iterator it = ((LinkedHashMap) bnhVar.g).entrySet().iterator();
            do {
                tooVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                too tooVar2 = (too) entry.getValue();
                if (Intrinsics.d(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    tooVar = tooVar2;
                }
            } while (tooVar == null);
        }
        return tooVar;
    }

    public final void c(String str, too tooVar) {
        tooVar.getClass();
        bnh bnhVar = this.a;
        synchronized (((l3l) bnhVar.f)) {
            if (((LinkedHashMap) bnhVar.g).containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((LinkedHashMap) bnhVar.g).put(str, tooVar);
        }
    }

    public final void d() {
        if (!this.a.c) {
            xq0.q("Can not perform this action after onSaveInstanceState");
            return;
        }
        fq0 fq0Var = this.b;
        if (fq0Var == null) {
            fq0Var = new fq0(this);
        }
        this.b = fq0Var;
        try {
            xwf.class.getDeclaredConstructor(null);
            fq0 fq0Var2 = this.b;
            if (fq0Var2 != null) {
                ((LinkedHashSet) fq0Var2.b).add(xwf.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + xwf.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
