package defpackage;

import android.text.Spanned;
import android.view.MotionEvent;
import com.yandex.pulse.metrics.c;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class az6 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az6(v29 v29Var, i39 i39Var) {
        super(1);
        this.r = 19;
        this.s = i39Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 1;
        switch (this.r) {
            case 0:
                ((sdk) obj).getClass();
                cz6 cz6Var = (cz6) this.s;
                f2a f2aVar = cz6Var.x;
                if (f2aVar != null) {
                    f2aVar.setPaymentApi(cz6Var.m);
                }
                f2a f2aVar2 = cz6Var.x;
                if (f2aVar2 != null) {
                    f2aVar2.c();
                }
                return Unit.a;
            case 1:
                v17 v17Var = (v17) obj;
                gc8 gc8Var = ((o17) this.s).i;
                if (gc8Var != null) {
                    gc8Var.N("challenger_screen_currentState", v17Var.a);
                }
                return Unit.a;
            case 2:
                i27 i27Var = (i27) this.s;
                if (Intrinsics.d((nxi) obj, nxi.d)) {
                    x97.y(wyf.F(i27Var.getLifecycle()), null, null, new h27(i27Var, null == true ? 1 : 0, i), 3);
                }
                return Unit.a;
            case 3:
                o27 o27Var = (o27) this.s;
                if (Intrinsics.d((nxi) obj, nxi.e)) {
                    x97.y(wyf.F(o27Var.getLifecycle()), null, null, new n27(o27Var, null == true ? 1 : 0, 2), 3);
                }
                return Unit.a;
            case 4:
                ueg uegVar = (ueg) obj;
                uegVar.getClass();
                uegVar.j = (Throwable) this.s;
                return Unit.a;
            case 5:
                xdr xdrVar = ((vb7) this.s).e;
                ob7 ob7Var = ob7.a;
                xdrVar.getClass();
                xdrVar.m(null, ob7Var);
                return Unit.a;
            case 6:
                pf7 pf7Var = (pf7) obj;
                if7 if7Var = (if7) this.s;
                gc8 gc8Var2 = if7Var.b;
                d51 d51Var = d51.l;
                synchronized (d51Var) {
                }
                if (qht.a.a()) {
                    if7.a(if7Var, pf7Var);
                } else {
                    g23 d = gc8Var2.getViewComponent$div_release().d();
                    f23 a = d.a();
                    try {
                        d51Var.p(new zg(d, a, if7Var, pf7Var, 3));
                    } catch (Throwable th) {
                        g23.b(a);
                        throw th;
                    }
                }
                return Unit.a;
            case 7:
                lb7 lb7Var = (lb7) obj;
                lb7Var.getClass();
                lb7Var.a = (t6t) this.s;
                return Unit.a;
            case 8:
                ((es3) this.s).cancel();
                return Unit.a;
            case 9:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                cg2 cg2Var = (cg2) this.s;
                cg2Var.c = booleanValue;
                return cg2Var.a();
            case 10:
                drb drbVar = (drb) obj;
                drbVar.getClass();
                drbVar.a = new dw1(false);
                drbVar.c = new lnm((ssm) this.s);
                drbVar.b = new xqr(true, true, true);
                drbVar.e = "RESET_AND_RESTART";
                drbVar.d = 3;
                return Unit.a;
            case 11:
                ((bxh) obj).getClass();
                return Unit.a;
            case 12:
                obj.getClass();
                l7h.a();
                ((xr7) this.s).e.onNext(obj);
                return Unit.a;
            case 13:
                ((gln) this.s).b(c.FINITE_SUM_FIELD_NUMBER, null);
                return Unit.a;
            case 14:
                ((IOException) obj).getClass();
                k78 k78Var = (k78) this.s;
                byte[] bArr = cvt.a;
                k78Var.j = true;
                return Unit.a;
            case 15:
                ((l78) this.s).k = true;
                return Unit.a;
            case 16:
                if (((jc8) obj) instanceof ob8) {
                    ((zx0) this.s).removeLast();
                }
                return Unit.a;
            case 17:
                ((v19) this.s).setImageScale(vq1.i0((g39) obj));
                return Unit.a;
            case 18:
                long longValue = ((Number) obj).longValue();
                long j = longValue >> 31;
                ((d29) this.s).setColumnCount((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                return Unit.a;
            case 19:
                ((i39) this.s).setImageScale(vq1.i0((g39) obj));
                return Unit.a;
            case 20:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                j79 j79Var = (j79) this.s;
                if (!booleanValue2 && j79Var.isFocused()) {
                    wdp.X(j79Var);
                }
                j79Var.setEnabled$div_release(booleanValue2);
                return Unit.a;
            case 21:
                ((oc9) this.s).setOnInterceptTouchEventListener(((Boolean) obj).booleanValue() ? o6c.m : null);
                return Unit.a;
            case 22:
                ((wl9) this.s).setInteractive(((Boolean) obj).booleanValue());
                return Unit.a;
            case 23:
                return ((dg0) obj).a.rawQuery("\n    SELECT raw_json_id, raw_json_data\n    FROM raw_json\n    WHERE raw_json_id IN\n ".concat(CollectionsKt.X((LinkedHashSet) this.s, "', '", "('", "')", null, 56)), new String[0]);
            case 24:
                ((x2b) this.s).setEllipsis((Spanned) obj);
                return Unit.a;
            case 25:
                fmq fmqVar = (fmq) ((dxr) this.s).a;
                fmqVar.b = true;
                fmqVar.x((MotionEvent) obj);
                return Unit.a;
            case 26:
                ((kxt) this.s).h((kxt) obj);
                return Unit.a;
            case 27:
                String str = (String) obj;
                Iterator it = ((bz9) this.s).f.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(str);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((se9) this.s).e(((Boolean) obj).booleanValue());
                return Unit.a;
            default:
                ((w1a) this.s).c.removeCallbacksAndMessages((Map) obj);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az6(int i, Object obj) {
        super(1);
        this.r = i;
        this.s = obj;
    }
}
