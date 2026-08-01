package androidx.emoji2.text;

import B.b;
import V.j;
import V.k;
import V.s;
import android.content.Context;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.InterfaceC0101s;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import n0.C0308a;
import n0.InterfaceC0309b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0309b {
    @Override // n0.InterfaceC0309b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // n0.InterfaceC0309b
    public final Object b(Context context) {
        Object obj;
        s sVar = new s(new b(context));
        sVar.f1210a = 1;
        if (j.f1213k == null) {
            synchronized (j.j) {
                try {
                    if (j.f1213k == null) {
                        j.f1213k = new j(sVar);
                    }
                } finally {
                }
            }
        }
        C0308a c2 = C0308a.c(context);
        c2.getClass();
        synchronized (C0308a.e) {
            try {
                obj = c2.f4111a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        C0103u d2 = ((InterfaceC0101s) obj).d();
        d2.a(new k(this, d2));
        return Boolean.TRUE;
    }
}
