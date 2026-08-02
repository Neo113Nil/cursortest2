package defpackage;

import com.yandex.passport.common.ui.compose.theme.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class lsj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ lsj(boolean z, yci yciVar, boolean z2, int i, int i2) {
        this.a = 0;
        this.b = z;
        this.d = yciVar;
        this.c = z2;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                yci yciVar = (yci) this.d;
                ((Integer) obj2).getClass();
                o2g.h(rvf.R(this.e | 1), this.f, (hq5) obj, yciVar, this.b, this.c);
                break;
            case 1:
                yci yciVar2 = (yci) this.d;
                ((Integer) obj2).getClass();
                e9q.i(rvf.R(this.e | 1), this.f, (hq5) obj, yciVar2, this.b, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                d.a(this.b, this.c, (wn5) this.d, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lsj(boolean z, boolean z2, Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.c = z2;
        this.d = obj;
        this.e = i;
        this.f = i2;
    }
}
