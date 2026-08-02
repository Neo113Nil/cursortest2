package defpackage;

import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.ui.challenge.webview.i;
import com.yandex.passport.internal.ui.common.web.d;
import com.yandex.plus.core.network.api.utils.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class x9v implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ x9v(wsv wsvVar, String str, String str2, Function0 function0, Function0 function02, int i) {
        this.a = 2;
        this.d = wsvVar;
        this.g = str;
        this.e = str2;
        this.b = function0;
        this.c = function02;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                hdg.y((Function0) this.b, (Function0) this.c, (Function0) this.d, (r4v) this.g, (yci) this.e, (hq5) obj, rvf.R(this.f | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                f8g.h((xsv) this.g, (Function0) this.b, (Function0) this.c, (Function0) this.d, (yci) this.e, (hq5) obj, rvf.R(this.f | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                f8g.i((wsv) this.d, (String) this.g, (String) this.e, (Function0) this.b, (Function0) this.c, (hq5) obj, rvf.R(this.f | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                asq.s((String) this.d, (yci) this.e, (yci) this.g, (Function0) this.b, (Function0) this.c, (hq5) obj, rvf.R(this.f | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                zwf.r((j2w) this.c, (fvf) this.d, (Function2) this.g, (pyc) this.e, (Function0) this.b, (hq5) obj, rvf.R(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                a.c((i) this.b, (o0) this.c, (d) this.d, (xpi) this.g, (Function1) this.e, (hq5) obj, rvf.R(this.f | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x9v(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.g = obj4;
        this.e = obj5;
        this.f = i;
    }

    public /* synthetic */ x9v(xsv xsvVar, Function0 function0, Function0 function02, Function0 function03, yci yciVar, int i) {
        this.a = 1;
        this.g = xsvVar;
        this.b = function0;
        this.c = function02;
        this.d = function03;
        this.e = yciVar;
        this.f = i;
    }

    public /* synthetic */ x9v(j2w j2wVar, fvf fvfVar, Function2 function2, pyc pycVar, Function0 function0, int i) {
        this.a = 4;
        this.c = j2wVar;
        this.d = fvfVar;
        this.g = function2;
        this.e = pycVar;
        this.b = function0;
        this.f = i;
    }

    public /* synthetic */ x9v(String str, yci yciVar, yci yciVar2, Function0 function0, Function0 function02, int i) {
        this.a = 3;
        this.d = str;
        this.e = yciVar;
        this.g = yciVar2;
        this.b = function0;
        this.c = function02;
        this.f = i;
    }
}
