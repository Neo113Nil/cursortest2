package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.RemovePlayableCommand;
import com.yandex.plus.divkit.utils.c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class as7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ as7(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n7q n7qVar;
        List B;
        int i;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((Number) ((sdr) this.c).getValue()).intValue() == this.b);
            case 1:
                ((pwq) this.c).p(this.b);
                return Unit.a;
            case 2:
                ml4 ml4Var = (ml4) this.c;
                o3k o3kVar = ml4Var.a;
                double abs = Math.abs(o3kVar.k());
                int i2 = this.b;
                return Boolean.valueOf((abs < 0.5d && ml4Var.a() == i2) || (((double) Math.abs(o3kVar.k())) > 0.5d && ((Number) o3kVar.v.getValue()).intValue() % ml4Var.b == i2));
            case 3:
                uu5 uu5Var = (uu5) this.c;
                j1t j1tVar = (j1t) uu5Var.d;
                n3m n3mVar = (n3m) uu5Var.f;
                mqs mqsVar = (mqs) uu5Var.a;
                mqsVar.getClass();
                d6l x = p6g.x((e6l) ((f7l) n3mVar.b).c.getValue());
                if (x != null && (n7qVar = x.a) != null && (B = y7g.B(n7qVar)) != null && (i = this.b) >= 0 && i < B.size() && Intrinsics.d(((mwk) B.get(i)).a(), mqsVar)) {
                    ((k1l) n3mVar.c).a(new RemovePlayableCommand(i), new b3t("queue_remove"));
                }
                j1tVar.m();
                j1tVar.dismiss();
                return Unit.a;
            case 4:
                y8u y8uVar = (y8u) this.c;
                if (this.b == 1) {
                    y8uVar.f();
                } else {
                    y8uVar.s();
                }
                return Boolean.TRUE;
            case 5:
                return vq2.a(this.b * ((d24) this.c).e);
            case 6:
                ((u6k) this.c).i(this.b);
                return Unit.a;
            default:
                return ((c) this.c).c + '[' + this.b + ']';
        }
    }

    public /* synthetic */ as7(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
