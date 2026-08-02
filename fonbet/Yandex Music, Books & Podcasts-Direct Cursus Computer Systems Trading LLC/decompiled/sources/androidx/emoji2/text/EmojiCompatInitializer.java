package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.cqc;
import defpackage.dzf;
import defpackage.lme;
import defpackage.nsh;
import defpackage.nyf;
import defpackage.r3b;
import defpackage.s3b;
import defpackage.sg1;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements lme {
    @Override // defpackage.lme
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.lme
    public final Object create(Context context) {
        Object obj;
        cqc cqcVar = new cqc(new sg1(context, 3));
        cqcVar.a = 1;
        if (r3b.k == null) {
            synchronized (r3b.j) {
                try {
                    if (r3b.k == null) {
                        r3b.k = new r3b(cqcVar);
                    }
                } finally {
                }
            }
        }
        nsh z = nsh.z(context);
        z.getClass();
        synchronized (nsh.g) {
            try {
                obj = ((HashMap) z.b).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = z.f(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        nyf lifecycle = ((dzf) obj).getLifecycle();
        lifecycle.a(new s3b(this, lifecycle));
        return Boolean.TRUE;
    }
}
