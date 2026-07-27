package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC0508p;
import androidx.lifecycle.InterfaceC0498f;
import androidx.lifecycle.InterfaceC0513v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements B0.b {
    @Override // B0.b
    public final Object create(Context context) {
        Object obj;
        q qVar = new q(new l(context));
        qVar.f4883a = 1;
        if (j.f4887k == null) {
            synchronized (j.f4886j) {
                try {
                    if (j.f4887k == null) {
                        j.f4887k = new j(qVar);
                    }
                } finally {
                }
            }
        }
        B0.a c4 = B0.a.c(context);
        c4.getClass();
        synchronized (B0.a.f65e) {
            try {
                obj = c4.f66a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c4.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final AbstractC0508p lifecycle = ((InterfaceC0513v) obj).getLifecycle();
        lifecycle.a(new InterfaceC0498f(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0498f
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
