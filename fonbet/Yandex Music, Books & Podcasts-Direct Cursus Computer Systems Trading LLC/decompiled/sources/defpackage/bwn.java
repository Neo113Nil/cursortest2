package defpackage;

import com.yandex.music.design.components.removable.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class bwn implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ bwn(ja0 ja0Var, yci yciVar, boolean z, long j, wn5 wn5Var, int i, int i2) {
        this.e = ja0Var;
        this.f = yciVar;
        this.c = z;
        this.b = j;
        this.g = wn5Var;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(24577);
                a.a((ja0) this.e, (yci) this.f, this.c, this.b, (wn5) this.g, (hq5) obj, R, this.d);
                break;
            default:
                ((Integer) obj2).intValue();
                ezf.p((sdr) this.e, this.b, this.c, (l0v) this.f, (m5v) this.g, (hq5) obj, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bwn(sdr sdrVar, long j, boolean z, l0v l0vVar, m5v m5vVar, int i) {
        this.e = sdrVar;
        this.b = j;
        this.c = z;
        this.f = l0vVar;
        this.g = m5vVar;
        this.d = i;
    }
}
