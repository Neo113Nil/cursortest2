package defpackage;

import com.yandex.plus.pay.ui.core.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class fd3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ yci e;

    public /* synthetic */ fd3(String str, boolean z, Function0 function0, yci yciVar, int i) {
        this.a = 1;
        this.b = str;
        this.c = z;
        this.d = function0;
        this.e = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                kg5.b(rvf.R(3457), (hq5) obj, this.e, this.b, this.d, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                zwf.e(rvf.R(1), (hq5) obj, this.e, this.b, this.d, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                b.f(rvf.R(385), (hq5) obj, this.e, this.b, this.d, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fd3(Function0 function0, yci yciVar, boolean z, String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.d = function0;
        this.e = yciVar;
        this.c = z;
    }
}
