package defpackage;

import android.view.View;
import com.yandex.plus.core.locale.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class xvb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ xvb(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((oa8) obj).getClass();
                break;
            case 1:
                ((oa8) obj).getClass();
                break;
            case 2:
                ((oa8) obj).getClass();
                View view = this.b;
                view.setKeepScreenOn(true);
                break;
            case 3:
                b.D(((Integer) obj).intValue(), this.b);
                break;
            default:
                int intValue = ((Integer) obj).intValue();
                View view2 = this.b;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), intValue);
                break;
        }
        return Unit.a;
    }
}
