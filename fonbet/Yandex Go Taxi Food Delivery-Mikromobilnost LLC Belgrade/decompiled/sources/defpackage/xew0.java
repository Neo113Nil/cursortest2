package defpackage;

import defpackage.tje;
import defpackage.xew0;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.stories.domain.b;

/* loaded from: classes14.dex */
public final class xew0 extends h55 {
    public final b D;
    public final gnu0 E;
    public final yvf0 F;
    public final zuj0 G;
    public ki6 H;

    public xew0(b bVar, gnu0 gnu0Var, yvf0 yvf0Var, zuj0 zuj0Var) {
        super(null);
        this.D = bVar;
        this.E = gnu0Var;
        this.F = yvf0Var;
        this.G = zuj0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        ki6 ki6Var = this.H;
        if (ki6Var != null) {
            this.E.c.remove(ki6Var);
        }
        this.H = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    @Override // defpackage.h55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Object obj) {
        x3 x3Var;
        npu0 npu0Var;
        emu0 emu0Var = (emu0) obj;
        List list = emu0Var.b;
        List list2 = list;
        ki6 ki6Var = null;
        if (list2 == null || list2.isEmpty()) {
            x3Var = null;
        } else {
            x3Var = list.size() == 1 ? new mpu0((String) a.P(list)) : new lpu0(list, (String) a.P(list));
        }
        if (x3Var != null) {
            String str = emu0Var.a;
            String str2 = str != null ? str : null;
            if (str2 != null) {
                npu0Var = new npu0(x3Var, str2, emu0Var.c != null ? Float.valueOf(r0.intValue()) : null, false, 120);
                if (npu0Var != null) {
                    r(new oxv0(7));
                    return;
                }
                ui2 ui2Var = emu0Var.d;
                if (ui2Var != null) {
                    ki6Var = new ki6(ui2Var, this.G);
                    this.E.c.add(ki6Var);
                }
                this.H = ki6Var;
                A((m950) this.F.get(), npu0Var, new sy60() { // from class: com.yandex.go.superapp.impl.router.b
                    @Override // defpackage.sy60
                    public final void a() {
                        xew0 xew0Var = xew0.this;
                        tje.N(xew0Var.o(), null, null, new SuperappStoriesRouterImpl$goBackWithResult$1(xew0Var, null), 3);
                    }
                });
                return;
            }
        }
        npu0Var = null;
        if (npu0Var != null) {
        }
    }
}
