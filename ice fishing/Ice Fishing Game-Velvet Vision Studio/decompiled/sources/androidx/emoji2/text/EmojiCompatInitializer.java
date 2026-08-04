package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import com.gamericefishpro.space.g6.a;
import com.gamericefishpro.space.g6.b;
import com.gamericefishpro.space.s4.k;
import com.gamericefishpro.space.s4.l;
import com.gamericefishpro.space.s4.r;
import com.gamericefishpro.space.z4.u;
import com.gamericefishpro.space.z4.w;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // com.gamericefishpro.space.g6.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // com.gamericefishpro.space.g6.b
    public final Object b(Context context) {
        Object objB;
        r rVar = new r(new com.gamericefishpro.space.b9.b(context, 4));
        rVar.a = 1;
        if (k.k == null) {
            synchronized (k.j) {
                try {
                    if (k.k == null) {
                        k.k = new k(rVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.e) {
            try {
                objB = aVarC.a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        w wVarG = ((u) objB).g();
        wVarG.a(new l(this, wVarG));
        return Boolean.TRUE;
    }
}
