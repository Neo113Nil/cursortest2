package defpackage;

import com.yandex.plus.bdui.analytics.c;
import com.yandex.plus.bdui.plus.analytics.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class gqj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ gqj(Function0 function0, Function0 function02, int i) {
        this.a = i;
        this.b = function0;
        this.c = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                kyf kyfVar = (kyf) obj;
                kyfVar.getClass();
                switch (hqj.a[kyfVar.ordinal()]) {
                    case 1:
                    case 2:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    case 3:
                        Function0 function0 = this.b;
                        if (function0 != null) {
                            function0.invoke();
                            break;
                        }
                        break;
                    case 4:
                        Function0 function02 = this.c;
                        if (function02 != null) {
                            function02.invoke();
                            break;
                        }
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                return Unit.a;
            default:
                c cVar = (c) obj;
                cVar.getClass();
                return b.k(cVar, new i3v(this.b, this.c, 1));
        }
    }
}
