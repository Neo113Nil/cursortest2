package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class ae0 extends osc {
    public static final n8h c;
    public final hoj a;
    public Context b;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        n8h n8hVar = null;
        try {
            try {
                n8h n8hVar2 = (n8h) ioj.class.asSubclass(n8h.class).getConstructor(null).newInstance(null);
                n8hVar2.getClass();
                n8hVar = n8hVar2;
            } catch (Exception e) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e);
            }
        } catch (ClassCastException e2) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e2);
        }
        c = n8hVar;
    }

    public ae0(String str) {
        if (c != null) {
            this.a = new hoj(str);
        } else {
            qq6.d("Unable to load OkHttpChannelProvider");
            throw null;
        }
    }

    @Override // defpackage.osc, defpackage.f8g
    public final f8g C(Executor executor) {
        this.a.C(executor);
        return this;
    }

    @Override // defpackage.osc, defpackage.f8g
    public final f8g I(List list) {
        this.a.I(list);
        return this;
    }

    @Override // defpackage.osc, defpackage.f8g
    public final f8g L(Executor executor) {
        this.a.L(executor);
        return this;
    }

    @Override // defpackage.osc
    public final f8g j0() {
        return this.a;
    }

    @Override // defpackage.osc, defpackage.f8g
    public final t7h k() {
        return new zd0(this.a.k(), this.b);
    }

    public ae0(hoj hojVar) {
        this.a = hojVar;
    }
}
