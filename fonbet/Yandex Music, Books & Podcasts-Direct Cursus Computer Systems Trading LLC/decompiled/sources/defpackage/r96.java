package defpackage;

import android.content.Context;
import com.yandex.passport.common.mvi.f;
import com.yandex.passport.common.mvi.i;
import com.yandex.passport.common.mvi.j;
import com.yandex.passport.internal.ui.bouncer.model.c1;
import com.yandex.passport.internal.ui.bouncer.model.h2;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.a;
import com.yandex.passport.internal.ui.bouncer.model.middleware.c;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public abstract class r96 {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;

    public r96(Context context, j4w j4wVar) {
        this.a = j4wVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.e = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(f fVar, cg6 cg6Var) {
        i iVar;
        int i;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.l = i2 - Integer.MIN_VALUE;
                Object obj = iVar.j;
                nm6 nm6Var = nm6.a;
                i = iVar.l;
                if (i == 0) {
                    if (i == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    qgg.h0(obj);
                    xdr xdrVar = (xdr) this.d;
                    j jVar = new j(0, fVar);
                    iVar.l = 1;
                    xdrVar.collect(jVar, iVar);
                    return;
                }
            }
        }
        iVar = new i(this, cg6Var);
        Object obj2 = iVar.j;
        nm6 nm6Var2 = nm6.a;
        i = iVar.l;
        if (i == 0) {
        }
    }

    public abstract Object b();

    public void c(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.d;
            if (obj2 == null || !obj2.equals(obj)) {
                this.d = obj;
                ((j4w) this.a).d.execute(new qf0(18, CollectionsKt.w0((LinkedHashSet) this.e), this));
            }
        }
    }

    public abstract void d();

    public abstract void e();

    public r96(c1 c1Var, a aVar, c cVar, h2 h2Var, l1 l1Var) {
        this.a = aVar;
        this.b = cVar;
        this.c = h2Var;
        this.d = ydr.a(l1Var);
        this.e = y0q.b(0, 5, null, 5);
    }
}
