package defpackage;

import android.text.InputFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class p49 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ j79 s;
    public final /* synthetic */ szb t;
    public final /* synthetic */ xzb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p49(j79 j79Var, szb szbVar, xzb xzbVar, int i) {
        super(1);
        this.r = i;
        this.s = j79Var;
        this.t = szbVar;
        this.u = xzbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.setHighlightColor(((Number) this.t.a(this.u)).intValue());
                break;
            case 1:
                this.s.setInputHint((String) this.t.a(this.u));
                break;
            case 2:
                long longValue = ((Number) this.t.a(this.u)).longValue();
                long j = longValue >> 31;
                this.s.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE)});
                break;
            default:
                long longValue2 = ((Number) this.t.a(this.u)).longValue();
                long j2 = longValue2 >> 31;
                this.s.setMaxLines((j2 == 0 || j2 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                break;
        }
        return Unit.a;
    }
}
