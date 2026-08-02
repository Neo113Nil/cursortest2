package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class wbh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ yci e;

    public /* synthetic */ wbh(String str, String str2, String str3, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                bfg.b(this.b, this.c, this.d, this.e, (hq5) obj, R);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                bfg.b(this.b, this.c, this.d, this.e, (hq5) obj, R2);
                break;
            default:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(1);
                rzf.e(this.b, this.c, this.d, this.e, (hq5) obj, R3);
                break;
        }
        return Unit.a;
    }
}
