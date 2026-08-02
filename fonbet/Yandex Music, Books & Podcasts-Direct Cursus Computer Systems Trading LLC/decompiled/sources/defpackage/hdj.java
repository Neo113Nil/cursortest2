package defpackage;

import com.yandex.passport.common.ui.progress.c;
import com.yandex.passport.internal.ui.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class hdj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hdj(g0t g0tVar, boolean z, cdj cdjVar, boolean z2, int i) {
        this.a = 0;
        this.d = g0tVar;
        this.b = z;
        this.e = cdjVar;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(3073);
                asq.i((g0t) this.d, this.b, (cdj) this.e, this.c, (hq5) obj, R);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                q7g.g(this.b, (Function0) this.d, (yci) this.e, this.c, (hq5) obj, R2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(1);
                u7g.p((po6) this.d, this.b, this.c, (yci) this.e, (hq5) obj, R3);
                break;
            default:
                ((Integer) obj2).getClass();
                int R4 = rvf.R(1);
                a.j((c) this.d, this.b, this.c, (yci) this.e, (hq5) obj, R4);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hdj(Object obj, boolean z, boolean z2, yci yciVar, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = z;
        this.c = z2;
        this.e = yciVar;
    }

    public /* synthetic */ hdj(boolean z, Function0 function0, yci yciVar, boolean z2, int i) {
        this.a = 1;
        this.b = z;
        this.d = function0;
        this.e = yciVar;
        this.c = z2;
    }
}
