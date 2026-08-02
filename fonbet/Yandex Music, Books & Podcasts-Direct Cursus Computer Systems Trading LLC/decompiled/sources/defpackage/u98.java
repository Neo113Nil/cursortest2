package defpackage;

import android.view.View;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class u98 implements xhu {
    public boolean a;
    public boolean b;
    public boolean c;
    public final Object d;

    public u98() {
        this.a = true;
        this.d = new ArrayDeque();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0022 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:7:0x000b, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:17:0x0022, B:20:0x002a), top: B:6:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        boolean z;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while (!arrayDeque.isEmpty()) {
                if (!this.b && this.a) {
                    z = false;
                    if (z) {
                        break;
                    }
                    Runnable runnable = (Runnable) arrayDeque.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                z = true;
                if (z) {
                }
            }
        } finally {
            this.c = false;
        }
    }

    @Override // defpackage.xhu
    public kqv h(View view, kqv kqvVar, weg wegVar) {
        if (this.a) {
            wegVar.d = kqvVar.a() + wegVar.d;
        }
        boolean z = view.getLayoutDirection() == 1;
        if (this.b) {
            if (z) {
                wegVar.c = kqvVar.b() + wegVar.c;
            } else {
                wegVar.a = kqvVar.b() + wegVar.a;
            }
        }
        if (this.c) {
            if (z) {
                wegVar.a = kqvVar.c() + wegVar.a;
            } else {
                wegVar.c = kqvVar.c() + wegVar.c;
            }
        }
        view.setPaddingRelative(wegVar.a, wegVar.b, wegVar.c, wegVar.d);
        ((ix6) this.d).h(view, kqvVar, wegVar);
        return kqvVar;
    }

    public u98(boolean z, boolean z2, boolean z3, ix6 ix6Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = ix6Var;
    }
}
