package defpackage;

import android.content.SharedPreferences;
import com.yandex.quark.utils.Disposable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class sya0 implements uza0, eya0, oza0 {
    public final hq60 a;
    public final prd b;
    public final uza0 c;
    public final s2b0 d;
    public final qc20 e;

    public sya0(hq60 hq60Var, prd prdVar, uza0 uza0Var, s2b0 s2b0Var, qc20 qc20Var) {
        this.a = hq60Var;
        this.b = prdVar;
        this.c = uza0Var;
        this.d = s2b0Var;
        this.e = qc20Var;
        uza0Var.b(new oya0(this));
    }

    @Override // defpackage.eya0
    public final mya0 a(cya0 cya0Var) {
        return qh91.b(this.a, cya0Var);
    }

    @Override // defpackage.uza0
    public final Disposable b(oya0 oya0Var) {
        return this.c.b(oya0Var);
    }

    @Override // defpackage.eya0
    public final List c(List list) {
        return this.a.c(list);
    }

    @Override // defpackage.oza0
    public final void d(List list, dya0 dya0Var) {
        this.b.d(list, new og7(3, this, dya0Var));
    }

    @Override // defpackage.oza0
    public final void e(og7 og7Var) {
        ai91.d(this, og7Var);
    }

    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mya0 mya0Var = (mya0) it.next();
            SharedPreferences sharedPreferences = this.d.a;
            cya0 a = mya0Var.a();
            Set<String> M0 = a.M0(sharedPreferences.getStringSet("permissions", EmptySet.a));
            M0.add(a.a());
            sharedPreferences.edit().putStringSet("permissions", M0).apply();
            cya0 a2 = mya0Var.a();
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = ((SharedPreferences) this.e.a).edit();
            edit.putLong(a2.a(), currentTimeMillis);
            edit.apply();
        }
    }
}
