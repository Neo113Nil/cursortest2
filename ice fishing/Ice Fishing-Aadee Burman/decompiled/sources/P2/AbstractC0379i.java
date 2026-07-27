package P2;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import m.b1;

/* renamed from: P2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0379i extends AbstractC0376f implements N2.c {

    /* renamed from: W, reason: collision with root package name */
    public final Set f2503W;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0379i(Context context, Looper looper, int i, b1 b1Var, N2.i iVar, N2.j jVar) {
        super(context, looper, r3, r4, i, new C0382l(iVar), new C0382l(jVar), (String) b1Var.f39125x);
        I a9 = I.a(context);
        M2.e eVar = M2.e.f1842d;
        w.h(iVar);
        w.h(jVar);
        Set set = (Set) b1Var.f39122u;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2503W = set;
    }

    @Override // N2.c
    public final Set b() {
        return m() ? this.f2503W : Collections.EMPTY_SET;
    }

    @Override // P2.AbstractC0376f
    public final Account q() {
        return null;
    }

    @Override // P2.AbstractC0376f
    public final Set t() {
        return this.f2503W;
    }
}
