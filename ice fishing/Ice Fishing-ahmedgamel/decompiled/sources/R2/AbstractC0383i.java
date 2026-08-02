package R2;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import m.c1;

/* renamed from: R2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0383i extends AbstractC0380f implements P2.c {

    /* renamed from: W, reason: collision with root package name */
    public final Set f2824W;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0383i(Context context, Looper looper, int i, c1 c1Var, P2.i iVar, P2.j jVar) {
        super(context, looper, r3, r4, i, new C0386l(iVar), new C0386l(jVar), (String) c1Var.f39196x);
        I a9 = I.a(context);
        O2.e eVar = O2.e.f2268d;
        w.h(iVar);
        w.h(jVar);
        Set set = (Set) c1Var.f39193u;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2824W = set;
    }

    @Override // P2.c
    public final Set a() {
        return m() ? this.f2824W : Collections.EMPTY_SET;
    }

    @Override // R2.AbstractC0380f
    public final Account q() {
        return null;
    }

    @Override // R2.AbstractC0380f
    public final Set t() {
        return this.f2824W;
    }
}
