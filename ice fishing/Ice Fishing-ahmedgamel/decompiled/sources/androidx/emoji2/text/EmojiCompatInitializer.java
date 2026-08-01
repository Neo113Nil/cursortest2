package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC0498p;
import androidx.lifecycle.InterfaceC0488f;
import androidx.lifecycle.InterfaceC0503v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements B0.b {
    @Override // B0.b
    public final Object create(Context context) {
        Object obj;
        q qVar = new q(new V2.b(context));
        qVar.f4768a = 1;
        if (j.f4772k == null) {
            synchronized (j.f4771j) {
                try {
                    if (j.f4772k == null) {
                        j.f4772k = new j(qVar);
                    }
                } finally {
                }
            }
        }
        B0.a c9 = B0.a.c(context);
        c9.getClass();
        synchronized (B0.a.f93e) {
            try {
                obj = c9.f94a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c9.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final AbstractC0498p lifecycle = ((InterfaceC0503v) obj).getLifecycle();
        lifecycle.a(new InterfaceC0488f(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0488f
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
