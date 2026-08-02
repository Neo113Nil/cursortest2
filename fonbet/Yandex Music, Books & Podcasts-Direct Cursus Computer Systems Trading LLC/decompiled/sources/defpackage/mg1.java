package defpackage;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class mg1 {
    public final jyr a;
    public final jyr b;

    public mg1(int i) {
        switch (i) {
            case 2:
                this.a = btf.b(new bv7(25));
                this.b = l18.b.b(hag.I(skr.class), true);
                break;
            case 3:
                bdt I = hag.I(Context.class);
                l18 l18Var = l18.b;
                this.a = l18Var.b(I, true);
                this.b = l18Var.b(hag.I(zzp.class), true);
                break;
            case 4:
                this.a = btf.b(new h8v(27));
                this.b = btf.b(new h8v(28));
                break;
            default:
                bdt I2 = hag.I(Context.class);
                l18 l18Var2 = l18.b;
                this.a = l18Var2.b(I2, true);
                l18Var2.b(hag.I(k8w.class), true);
                this.b = btf.b(new z3(27, this));
                break;
        }
    }

    public static String a(Date date) {
        date.getClass();
        tn tnVar = (tn) swf.H().d.getValue();
        tnVar.getClass();
        Calendar.getInstance().setTimeInMillis(System.currentTimeMillis());
        Calendar.getInstance().setTime(date);
        String replace = tnVar.b.r(date).replace(' ', (char) 160);
        replace.getClass();
        return replace;
    }

    public mg1(final bve bveVar) {
        final int i = 0;
        this.a = btf.b(new Function0() { // from class: ph7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        bve bveVar2 = bveVar;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(ljk.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        return ((ljk) qdcVar.C(I)).a(bveVar2, new lik(vik.e, null, null), false);
                    default:
                        bve bveVar3 = bveVar;
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(pjk.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        return ((pjk) qdcVar2.C(I2)).a(bveVar3);
                }
            }
        });
        final int i2 = 1;
        this.b = btf.b(new Function0() { // from class: ph7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        bve bveVar2 = bveVar;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(ljk.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        return ((ljk) qdcVar.C(I)).a(bveVar2, new lik(vik.e, null, null), false);
                    default:
                        bve bveVar3 = bveVar;
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(pjk.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        return ((pjk) qdcVar2.C(I2)).a(bveVar3);
                }
            }
        });
    }
}
