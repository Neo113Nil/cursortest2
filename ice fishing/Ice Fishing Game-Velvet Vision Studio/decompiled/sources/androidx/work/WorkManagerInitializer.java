package androidx.work;

import android.content.Context;
import com.gamericefishpro.space.g6.b;
import com.gamericefishpro.space.l6.c;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.m6.o;
import com.gamericefishpro.space.v8.l;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements b {
    static {
        q.d("WrkMgrInitializer");
    }

    @Override // com.gamericefishpro.space.g6.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.gamericefishpro.space.g6.b
    public final Object b(Context context) {
        q.c().getClass();
        o.b(context, new c(new l(7)));
        return o.a(context);
    }
}
