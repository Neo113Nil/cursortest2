package defpackage;

import android.content.Context;
import com.yandex.plus.home.c;
import defpackage.ab90;
import defpackage.b5d0;
import defpackage.coc0;
import defpackage.cop0;
import defpackage.i3f;
import defpackage.lzc0;
import defpackage.n4u0;
import defpackage.n8s;
import defpackage.p4d0;
import defpackage.pgz;
import defpackage.r8s;
import defpackage.va90;
import defpackage.vit;
import defpackage.vog;
import defpackage.whh;
import defpackage.x3m;
import defpackage.yo40;
import defpackage.zhd0;
import kotlin.a;

/* loaded from: classes8.dex */
public final class vog {
    public final i3y a = a.a(new cue(17));
    public final i3y b;
    public final i3y c;

    public vog(final lzc0 lzc0Var) {
        this.b = a.a(new sbc(3, lzc0Var));
        this.c = a.a(new sls() { // from class: com.yandex.plus.home.plaque.plugin.internal.di.a
            @Override // defpackage.sls
            public final Object invoke() {
                lzc0 lzc0Var2 = lzc0.this;
                p4d0 p4d0Var = lzc0Var2.a;
                cop0 cop0Var = ((c) p4d0Var).b;
                b5d0 b5d0Var = cop0Var.g;
                n4u0 n4u0Var = cop0Var.e;
                zhd0 zhd0Var = lzc0Var2.b;
                n8s yo40Var = zhd0Var != null ? new yo40(zhd0Var) : new whh();
                vog vogVar = this;
                pgz b = vogVar.b();
                x3m x3mVar = new x3m(b5d0Var, n4u0Var, yo40Var, b);
                Context context = cop0Var.a;
                i3f i3fVar = new i3f(2, x3mVar, context, n4u0Var);
                com.yandex.plus.plaquesdk.widget.a aVar = new com.yandex.plus.plaquesdk.widget.a(b5d0Var, context, (coc0) x3mVar.a.getValue(), (r8s) x3mVar.b.getValue(), new vit(20, new va90(new ab90(context, i3fVar))), i3fVar, yo40Var, b);
                return new com.yandex.plus.home.plaque.plugin.internal.proxy.a(kotlin.a.a(new b(p4d0Var, vogVar, aVar)), kotlin.a.a(new b(p4d0Var, lzc0Var2, aVar, vogVar)), new DataModule$plaqueRepository$2$3(p4d0Var, null));
            }
        });
    }

    public static final String a(vog vogVar, hmd0 hmd0Var) {
        vogVar.getClass();
        if (hmd0Var instanceof dmd0) {
            return "Frozen";
        }
        if (hmd0Var instanceof emd0) {
            return "HasPlus";
        }
        if (hmd0Var instanceof fmd0) {
            return "NoPlus";
        }
        if (hmd0Var instanceof gmd0) {
            return "Unauthorized";
        }
        w511.b();
        return null;
    }

    public final pgz b() {
        return (pgz) this.a.getValue();
    }
}
