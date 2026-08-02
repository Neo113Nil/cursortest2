package defpackage;

import android.util.DisplayMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class hl9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ wl9 s;
    public final /* synthetic */ ouq t;
    public final /* synthetic */ ix8 u;
    public final /* synthetic */ xzb v;
    public final /* synthetic */ DisplayMetrics w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl9(wl9 wl9Var, ouq ouqVar, ix8 ix8Var, xzb xzbVar, DisplayMetrics displayMetrics, int i) {
        super(1);
        this.r = i;
        this.s = wl9Var;
        this.t = ouqVar;
        this.u = ix8Var;
        this.v = xzbVar;
        this.w = displayMetrics;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int w;
        int w2;
        switch (this.r) {
            case 0:
                long longValue = ((Number) obj).longValue();
                int ordinal = ((jk9) this.u.g.a(this.v)).ordinal();
                DisplayMetrics displayMetrics = this.w;
                if (ordinal == 0) {
                    w = bg3.w(Long.valueOf(longValue), displayMetrics);
                } else if (ordinal == 1) {
                    w = bg3.Z(Long.valueOf(longValue), displayMetrics);
                } else if (ordinal != 2) {
                    b6e.s();
                    break;
                } else {
                    long j = longValue >> 31;
                    w = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                this.t.c = w;
                wl9 wl9Var = this.s;
                wl9Var.requestLayout();
                wl9Var.invalidate();
                break;
            default:
                long longValue2 = ((Number) obj).longValue();
                int ordinal2 = ((jk9) this.u.g.a(this.v)).ordinal();
                DisplayMetrics displayMetrics2 = this.w;
                if (ordinal2 == 0) {
                    w2 = bg3.w(Long.valueOf(longValue2), displayMetrics2);
                } else if (ordinal2 == 1) {
                    w2 = bg3.Z(Long.valueOf(longValue2), displayMetrics2);
                } else if (ordinal2 != 2) {
                    b6e.s();
                    break;
                } else {
                    long j2 = longValue2 >> 31;
                    w2 = (j2 == 0 || j2 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                this.t.d = w2;
                wl9 wl9Var2 = this.s;
                wl9Var2.requestLayout();
                wl9Var2.invalidate();
                break;
        }
        return Unit.a;
    }
}
