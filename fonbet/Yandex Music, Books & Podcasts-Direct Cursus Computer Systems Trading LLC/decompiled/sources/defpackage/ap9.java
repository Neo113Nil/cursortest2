package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ap9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ lp9 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap9(lp9 lp9Var, int i) {
        super(1);
        this.r = i;
        this.s = lp9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.getDivider().setBackgroundColor(((Number) obj).intValue());
                break;
            case 1:
                this.s.getDivider().setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                break;
            case 2:
                this.s.getViewPager().setOnInterceptTouchEventListener(((Boolean) obj).booleanValue() ? o6c.m : null);
                break;
            default:
                xo9 divTabsAdapter = this.s.getDivTabsAdapter();
                if (divTabsAdapter != null) {
                    divTabsAdapter.b();
                }
                break;
        }
        return Unit.a;
    }
}
