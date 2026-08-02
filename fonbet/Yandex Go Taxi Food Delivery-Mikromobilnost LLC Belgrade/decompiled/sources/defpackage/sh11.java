package defpackage;

import android.content.Context;
import com.yandex.go.trusted_contacts.ui.b;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class sh11 extends ad5 {
    public final zuj0 A;
    public final r0 B;
    public Set C;
    public final ih11 x;
    public final zg11 y;
    public final a201 z;

    public sh11(ih11 ih11Var, zg11 zg11Var, a201 a201Var, zuj0 zuj0Var) {
        super(jh11.class);
        this.x = ih11Var;
        this.y = zg11Var;
        this.z = a201Var;
        this.A = zuj0Var;
        this.B = bvf0.c(Boolean.FALSE);
        this.C = EmptySet.a;
    }

    @Override // defpackage.ad5
    public final mse Ig() {
        return new z93(this);
    }

    public final void Kg(wg11 wg11Var) {
        b bVar = new b(this);
        glr0 glr0Var = this.x.a;
        kcz0 kcz0Var = glr0Var.F.a;
        glr0Var.z(new ej1((Context) ((tbg) kcz0Var.a).get(), (w030) ((xvf0) kcz0Var.b).get(), wg11Var, 21), new elr0(1, bVar));
    }

    public final void close() {
        boolean equals = this.y.a().equals(this.C);
        glr0 glr0Var = this.x.a;
        if (equals) {
            glr0Var.r(new qu(9));
        } else {
            glr0Var.r(new of11(2));
        }
    }
}
