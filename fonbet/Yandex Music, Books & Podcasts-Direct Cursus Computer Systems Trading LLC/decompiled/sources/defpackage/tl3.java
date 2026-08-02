package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class tl3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;

    public /* synthetic */ tl3(int i, long j, boolean z) {
        this.a = i;
        this.b = z;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.a;
        int i3 = R.string.listen;
        boolean z = this.b;
        switch (i2) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                if (z) {
                    if (!z) {
                        b6e.s();
                        return null;
                    }
                    i3 = R.string.pause;
                }
                if (!z) {
                    i = R.drawable.ic_play_mid_24;
                } else {
                    if (!z) {
                        b6e.s();
                        return null;
                    }
                    i = R.drawable.ic_pause_mid_24;
                }
                gae.b(a0g.E(i, 0, hq5Var), rvf.M(i3, hq5Var), null, this.c, hq5Var, 0, 4);
                return Unit.a;
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                w4k E = a0g.E(z ? R.drawable.ic_pause_round_32 : R.drawable.ic_play_round_32, 0, hq5Var2);
                if (z) {
                    i3 = R.string.pause;
                }
                gae.b(E, rvf.M(i3, hq5Var2), null, this.c, hq5Var2, 0, 4);
                return Unit.a;
        }
    }
}
