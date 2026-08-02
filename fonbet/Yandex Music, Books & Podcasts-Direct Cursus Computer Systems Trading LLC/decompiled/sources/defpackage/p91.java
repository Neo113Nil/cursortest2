package defpackage;

import com.yandex.passport.internal.ui.common.screen.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class p91 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ p91(q91 q91Var, Function0 function0, yci yciVar, boolean z, Function0 function02, int i, int i2) {
        this.a = 0;
        this.h = q91Var;
        this.b = function0;
        this.d = yciVar;
        this.e = z;
        this.c = function02;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                wct.a((q91) this.h, (Function0) this.b, this.d, this.e, (Function0) this.c, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                o2g.i((wn5) this.h, (Function0) this.b, (Function0) this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ngg.c((po6) this.h, (bg5) this.b, this.d, (pyc) this.c, this.e, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
            case 3:
                ((Integer) obj2).getClass();
                o5g.f((Function1) this.h, (Function0) this.b, (l6n) this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                b.b(this.e, (Function0) this.b, this.d, (String) this.h, (String) this.c, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ p91(po6 po6Var, bg5 bg5Var, yci yciVar, pyc pycVar, boolean z, int i, int i2) {
        this.a = 2;
        this.h = po6Var;
        this.b = bg5Var;
        this.d = yciVar;
        this.c = pycVar;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ p91(syc sycVar, Function0 function0, Object obj, yci yciVar, boolean z, int i, int i2, int i3) {
        this.a = i3;
        this.h = sycVar;
        this.b = function0;
        this.c = obj;
        this.d = yciVar;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ p91(boolean z, Function0 function0, yci yciVar, String str, String str2, int i, int i2) {
        this.a = 4;
        this.e = z;
        this.b = function0;
        this.d = yciVar;
        this.h = str;
        this.c = str2;
        this.f = i;
        this.g = i2;
    }
}
