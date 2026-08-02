package defpackage;

import com.yandex.passport.internal.ui.bouncer.chooser.d;
import com.yandex.passport.internal.ui.common.screen.b;
import com.yandex.passport.internal.ui.common.screen.c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class vav implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vav(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                qgg.x((oav) this.d, (jav) this.e, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                d.a((List) this.d, (Function1) this.e, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                b.c((c) this.d, (Function0) this.e, (Function1) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
        }
        return Unit.a;
    }
}
