package defpackage;

import android.graphics.Rect;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class rd0 extends uif implements ryc {
    public final /* synthetic */ sd0 r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd0(sd0 sd0Var, int i) {
        super(4);
        this.r = sd0Var;
        this.s = i;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        sd0 sd0Var = this.r;
        sd0Var.a.h(sd0Var.c, this.s, new Rect(intValue, intValue2, intValue3, intValue4));
        return Unit.a;
    }
}
