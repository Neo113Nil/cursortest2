package defpackage;

import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ihe implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ ihe(String str, int i, boolean z, yci yciVar, int i2) {
        this.a = 4;
        this.b = str;
        this.e = i;
        this.d = z;
        this.c = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                jhe.g(rvf.R(this.e | 1), (hq5) obj, this.c, this.b, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                wdg.i(rvf.R(this.e | 1), (hq5) obj, this.c, this.b, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                o2g.y(rvf.R(this.e | 1), (hq5) obj, this.c, this.b, this.d);
                break;
            case 3:
                ((Integer) obj2).getClass();
                qgg.y(rvf.R(this.e | 1), (hq5) obj, this.c, this.b, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                c.a(this.e, R, (hq5) obj, this.c, this.b, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ihe(String str, yci yciVar, boolean z, int i) {
        this.a = 1;
        this.b = str;
        this.c = yciVar;
        this.d = z;
        this.e = i;
    }

    public /* synthetic */ ihe(String str, boolean z, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.d = z;
        this.c = yciVar;
        this.e = i;
    }
}
