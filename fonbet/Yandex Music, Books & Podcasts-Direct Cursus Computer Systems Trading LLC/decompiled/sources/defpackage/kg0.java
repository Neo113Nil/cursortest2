package defpackage;

import android.widget.RemoteViews;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kg0 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg0(g1r g1rVar, yci yciVar, int i) {
        super(2);
        this.r = 11;
        wn5 wn5Var = vo5.a;
        this.u = g1rVar;
        this.t = yciVar;
        this.s = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        int i2 = this.s;
        Object obj3 = this.u;
        Object obj4 = this.t;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                xv7.q((yci) obj4, (Function2) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                wn5 wn5Var = zn5.a;
                ild.b((RemoteViews) obj4, (ukd) obj3, (hq5) obj, i2 | 1);
                break;
            case 2:
                ((Number) obj2).intValue();
                qn0.a((mn0) obj4, (List) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                ksw.j(rvf.R(i2 | 1), (hq5) obj, (yci) obj4, (Function1) obj3);
                break;
            case 4:
                ((Number) obj2).intValue();
                ((wn5) obj4).d(rvf.R(i2) | 1, (hq5) obj, obj3);
                break;
            case 5:
                ((Number) obj2).intValue();
                qzm[] qzmVarArr = (qzm[]) obj4;
                etn.m((qzm[]) Arrays.copyOf(qzmVarArr, qzmVarArr.length), (Function2) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                etn.l((qzm) obj4, (Function2) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 7:
                ((Number) obj2).intValue();
                wct.f((qbs) obj4, (wn5) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 8:
                ((Number) obj2).intValue();
                lf7.h((mmq) obj3, (yci) obj4, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 9:
                ((Number) obj2).intValue();
                xv7.m((jag) obj3, (yci) obj4, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 10:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    ((ttf) obj4).b(i2, obj3, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            case 11:
                ((Number) obj2).intValue();
                wn5 wn5Var2 = vo5.a;
                tyf.a((g1r) obj3, (yci) obj4, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 12:
                ((Number) obj2).intValue();
                l1r.c((wn5) obj4, (Function2) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
            case 13:
                ((Number) obj2).intValue();
                xcs.a((ges) obj4, (Function2) obj3, (hq5) obj, rvf.R(i2 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                ((d8t) obj4).a(rvf.R(i2 | 1), (hq5) obj, obj3);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg0(int i, ttf ttfVar, Object obj) {
        super(2);
        this.r = 10;
        this.t = ttfVar;
        this.s = i;
        this.u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg0(int i, int i2, yci yciVar, Object obj) {
        super(2);
        this.r = i2;
        this.u = obj;
        this.t = yciVar;
        this.s = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg0(RemoteViews remoteViews, ukd ukdVar, int i) {
        super(2);
        this.r = 1;
        wn5 wn5Var = zn5.a;
        this.t = remoteViews;
        this.u = ukdVar;
        this.s = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg0(Object obj, Object obj2, int i, int i2) {
        super(2);
        this.r = i2;
        this.t = obj;
        this.u = obj2;
        this.s = i;
    }
}
