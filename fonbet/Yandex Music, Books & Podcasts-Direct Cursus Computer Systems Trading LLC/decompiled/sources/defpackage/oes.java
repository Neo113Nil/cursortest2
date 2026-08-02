package defpackage;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class oes extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ TextView s;
    public final /* synthetic */ szb t;
    public final /* synthetic */ szb u;
    public final /* synthetic */ xzb v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oes(TextView textView, szb szbVar, szb szbVar2, xzb xzbVar, int i) {
        super(1);
        this.r = i;
        this.s = textView;
        this.t = szbVar;
        this.u = szbVar2;
        this.v = xzbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                int ordinal = ((jk9) this.u.a(this.v)).ordinal();
                int i = 1;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i = 2;
                    } else if (ordinal != 2) {
                        b6e.s();
                        break;
                    } else {
                        i = 0;
                    }
                }
                this.s.setTextSize(i, ((Number) this.t.a(r0)).longValue());
                break;
            case 1:
                szb szbVar = this.t;
                xzb xzbVar = this.v;
                this.s.setLetterSpacing(((float) ((Number) szbVar.a(xzbVar)).doubleValue()) / ((Number) this.u.a(xzbVar)).floatValue());
                break;
            default:
                woe.b(this.s, this.t, this.u, this.v);
                break;
        }
        return Unit.a;
    }
}
