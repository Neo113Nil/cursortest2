package defpackage;

import com.yandex.messaging.core.net.entities.PreferencesBucket;

/* loaded from: classes15.dex */
public final class s5b0 {
    public final v5b0 a;
    public final h3y b;

    public s5b0(v5b0 v5b0Var, h3y h3yVar) {
        this.a = v5b0Var;
        this.b = h3yVar;
    }

    public final void a(PreferencesBucket preferencesBucket, l020 l020Var) {
        if (!((rey0) this.b.get()).c) {
            return;
        }
        v5b0 v5b0Var = this.a;
        if (l020Var != null) {
            v5b0Var.getClass();
            l020Var.v0(preferencesBucket);
            return;
        }
        l020 C = v5b0Var.a.C();
        try {
            C.v0(preferencesBucket);
            C.s();
            C.close();
        } finally {
        }
    }
}
