package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class lba implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ lba(laa laaVar, Function0 function0, Function0 function02, boolean z, d85 d85Var, int i, int i2, int i3) {
        this.f = laaVar;
        this.g = function0;
        this.h = function02;
        this.c = z;
        this.i = d85Var;
        this.b = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                etn.r((laa) this.f, (Function0) this.g, (Function0) this.h, this.c, (d85) this.i, this.b, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                rvf.j((Function1) this.f, (tmb) this.g, (yci) this.h, this.b, this.c, (hmj) this.i, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                neg.b((String) this.f, (nzj) this.g, (yci) this.h, (String) this.i, this.c, this.b, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lba(String str, nzj nzjVar, yci yciVar, String str2, boolean z, int i, int i2, int i3) {
        this.f = str;
        this.g = nzjVar;
        this.h = yciVar;
        this.i = str2;
        this.c = z;
        this.b = i;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ lba(Function1 function1, tmb tmbVar, yci yciVar, int i, boolean z, hmj hmjVar, int i2, int i3) {
        this.f = function1;
        this.g = tmbVar;
        this.h = yciVar;
        this.b = i;
        this.c = z;
        this.i = hmjVar;
        this.d = i2;
        this.e = i3;
    }
}
