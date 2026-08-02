package androidx.emoji2.text;

import A1.C0266h;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC0502p;
import androidx.lifecycle.InterfaceC0492f;
import androidx.lifecycle.InterfaceC0507v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements B0.b {
    @Override // B0.b
    public final Object create(Context context) {
        Object obj;
        q qVar = new q(new C0266h(context));
        qVar.f4736a = 1;
        if (j.f4740k == null) {
            synchronized (j.f4739j) {
                try {
                    if (j.f4740k == null) {
                        j.f4740k = new j(qVar);
                    }
                } finally {
                }
            }
        }
        B0.a c9 = B0.a.c(context);
        c9.getClass();
        synchronized (B0.a.f249e) {
            try {
                obj = c9.f250a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c9.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final AbstractC0502p lifecycle = ((InterfaceC0507v) obj).getLifecycle();
        lifecycle.a(new InterfaceC0492f(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0492f
            public final void onResume() {
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new m(), 500L);
                lifecycle.b(this);
            }
        });
        return Boolean.TRUE;
    }

    @Override // B0.b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
