package defpackage;

import com.yandex.plus.pay.ui.core.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class iw5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;

    public /* synthetic */ iw5(String str, Function0 function0, boolean z, yci yciVar, int i) {
        this.a = 3;
        this.b = str;
        this.c = function0;
        this.e = z;
        this.d = yciVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                u2x.n(rvf.R(this.f | 1), (hq5) obj, this.d, this.b, this.c, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ksw.z(rvf.R(this.f | 1), (hq5) obj, this.d, this.b, this.c, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ox6.s(rvf.R(this.f | 1), (hq5) obj, this.d, this.b, this.c, this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                dag.g(rvf.R(this.f | 1), (hq5) obj, this.d, this.b, this.c, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                b.e(rvf.R(385), this.f, (hq5) obj, this.d, this.b, this.c, this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ iw5(String str, Function0 function0, yci yciVar, boolean z, int i, int i2, byte b) {
        this.a = i2;
        this.b = str;
        this.c = function0;
        this.d = yciVar;
        this.e = z;
        this.f = i;
    }

    public /* synthetic */ iw5(String str, boolean z, Function0 function0, yci yciVar, int i) {
        this.a = 2;
        this.b = str;
        this.e = z;
        this.c = function0;
        this.d = yciVar;
        this.f = i;
    }

    public /* synthetic */ iw5(Function0 function0, yci yciVar, boolean z, String str, int i, int i2) {
        this.a = 4;
        this.b = str;
        this.c = function0;
        this.d = yciVar;
        this.e = z;
        this.f = i2;
    }
}
