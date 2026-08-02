package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class tq2 extends uif implements Function1 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ View s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(View view) {
        super(1);
        this.s = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ((sq1) this.s).setAspectRatio((float) ((Number) obj).doubleValue());
                break;
            default:
                wdu.s(this.s, (String) obj);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(bz2 bz2Var, View view) {
        super(1);
        this.s = view;
    }
}
