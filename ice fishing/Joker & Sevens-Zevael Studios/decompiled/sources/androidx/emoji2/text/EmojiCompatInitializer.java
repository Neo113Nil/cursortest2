package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k4.a;
import k4.b;
import q3.i;
import q3.j;
import q3.l;
import q3.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // k4.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // k4.b
    public final Object b(Context context) {
        Object obj;
        l lVar = new l();
        lVar.f5771a = context.getApplicationContext();
        r rVar = new r(lVar);
        rVar.f5788b = 1;
        if (i.f5758k == null) {
            synchronized (i.f5757j) {
                try {
                    if (i.f5758k == null) {
                        i.f5758k = new i(rVar);
                    }
                } finally {
                }
            }
        }
        a c3 = a.c(context);
        c3.getClass();
        synchronized (a.f3628e) {
            try {
                obj = c3.f3629a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c3.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        w h10 = ((u) obj).h();
        h10.a(new j(this, h10));
        return Boolean.TRUE;
    }
}
