package defpackage;

import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.sloth.ui.c1;
import com.yandex.passport.sloth.ui.dependencies.c;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.checkout.content.controller.i0;
import com.yandex.plus.bdui.s;
import com.yandex.plus.log.api.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class npu implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ npu(int i, p pVar, b bVar) {
        this.a = 11;
        this.c = i;
        this.d = pVar;
        this.b = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                f8g.e((wpu) this.d, (Function0) this.b, (hq5) obj, rvf.R(this.c | 1));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                ppu.a((xpu) this.d, (Function0) this.b, (hq5) obj, rvf.R(this.c | 1));
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                hdg.x((zru) this.d, (sai) this.b, (hq5) obj, rvf.R(this.c | 1));
                return Unit.a;
            case 3:
                ((Integer) obj2).intValue();
                o8g.h((z8v) this.d, (n7v) this.b, (hq5) obj, rvf.R(this.c | 1));
                return Unit.a;
            case 4:
                jav javVar = (jav) this.d;
                nav navVar = (nav) this.b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                javVar.a(booleanValue, navVar, this.c, str);
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                qgg.v((jav) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                wjv.h((qo6) this.d, (w4k) this.b, (hq5) obj, rvf.R(this.c | 1));
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                szf.B((ukd) this.d, (plv) this.b, (hq5) obj, rvf.R(this.c | 1));
                return Unit.a;
            case 8:
                ((Integer) obj2).intValue();
                hdg.B((Function0) this.b, (wvv) this.d, (hq5) obj, rvf.R(this.c | 1));
                return Unit.a;
            case 9:
                ((Integer) obj2).intValue();
                zwf.n((z1w) this.d, (fvf) this.b, (hq5) obj, rvf.R(this.c | 1));
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                c1.b((c) this.d, (String) this.b, (hq5) obj, rvf.R(1), this.c);
                return Unit.a;
            default:
                p pVar = (p) this.d;
                b bVar = (b) this.b;
                m mVar = (m) obj2;
                ((s) obj).getClass();
                mVar.getClass();
                return new i0(mVar, this.c, pVar, bVar);
        }
    }

    public /* synthetic */ npu(wpu wpuVar, Function0 function0, int i) {
        this.a = 0;
        this.d = wpuVar;
        this.b = function0;
        this.c = i;
    }

    public /* synthetic */ npu(xpu xpuVar, Function0 function0, int i) {
        this.a = 1;
        this.d = xpuVar;
        this.b = function0;
        this.c = i;
    }

    public /* synthetic */ npu(zru zruVar, sai saiVar, int i) {
        this.a = 2;
        this.d = zruVar;
        this.b = saiVar;
        this.c = i;
    }

    public /* synthetic */ npu(c cVar, String str, int i, int i2) {
        this.a = 10;
        this.d = cVar;
        this.b = str;
        this.c = i2;
    }

    public /* synthetic */ npu(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }

    public /* synthetic */ npu(Function0 function0, wvv wvvVar, int i) {
        this.a = 8;
        this.b = function0;
        this.d = wvvVar;
        this.c = i;
    }
}
