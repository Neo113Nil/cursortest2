package defpackage;

import com.yandex.passport.internal.ui.challenge.delete.a0;
import com.yandex.passport.internal.ui.challenge.delete.d0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r0;
import com.yandex.plus.home.feature.webviews.internal.stories.list.adapter.b;
import com.yandex.plus.home.feature.webviews.internal.stories.list.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class pl3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ pl3(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        a0 a0Var = a0.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(v84.a);
                return Unit.a;
            case 1:
                Boolean bool = (Boolean) function1.invoke(v84.b);
                bool.booleanValue();
                return bool;
            case 2:
                function1.invoke(v84.a);
                return Unit.a;
            case 3:
                function1.invoke(j0s.a);
                return Unit.a;
            case 4:
                function1.invoke(j0s.b);
                return Unit.a;
            case 5:
                function1.invoke(swt.a);
                return Unit.a;
            case 6:
                function1.invoke(swt.b);
                return Unit.a;
            case 7:
                function1.invoke(d0.a);
                return Unit.a;
            case 8:
                function1.invoke(a0Var);
                return Unit.a;
            case 9:
                function1.invoke(a0Var);
                return Unit.a;
            case 10:
                function1.invoke(r0.b);
                return Unit.a;
            default:
                s9f[] s9fVarArr = f.i;
                return new b(function1);
        }
    }
}
