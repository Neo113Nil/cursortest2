package defpackage;

import android.view.View;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.e;
import java.util.function.Consumer;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final /* synthetic */ class vd2 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vd2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((View) obj2).setBackgroundColor(((Integer) obj).intValue());
                break;
            case 1:
                d130 d130Var = (d130) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    d130Var.h();
                    break;
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                v2w0 v2w0Var = ((e) obj2).f0;
                bool.booleanValue();
                r0 r0Var = v2w0Var.a;
                r0Var.getClass();
                r0Var.m(null, bool);
                break;
        }
    }
}
