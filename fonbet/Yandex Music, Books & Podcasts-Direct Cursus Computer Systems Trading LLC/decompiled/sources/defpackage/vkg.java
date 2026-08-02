package defpackage;

import com.yandex.passport.internal.ui.common.screen.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class vkg implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ vkg(con conVar, wov wovVar, boolean z, boolean z2, int i, int i2, int i3) {
        this.a = i3;
        this.f = conVar;
        this.g = wovVar;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ((ogp) this.f).e(this.b, this.c, (kle) this.g, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                wyf.i(this.b, (yci) this.f, (e9g) this.g, this.c, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                fxf.g((con) this.f, (vov) this.g, this.b, this.c, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                fxf.h((con) this.f, (uov) this.g, this.b, this.c, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            case 4:
                ((Integer) obj2).getClass();
                rzf.p(this.b, (yci) this.f, (ihv) this.g, this.c, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                e.a((Throwable) this.f, this.b, this.c, (Function0) this.g, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vkg(Object obj, boolean z, boolean z2, Object obj2, int i, int i2, int i3) {
        this.a = i3;
        this.f = obj;
        this.b = z;
        this.c = z2;
        this.g = obj2;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ vkg(boolean z, yci yciVar, Enum r3, boolean z2, int i, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.f = yciVar;
        this.g = r3;
        this.c = z2;
        this.d = i;
        this.e = i2;
    }
}
