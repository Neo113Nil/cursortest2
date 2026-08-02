package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class xdu implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ xdu(z5 z5Var, int i) {
        this.a = i;
        this.b = z5Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        int i = this.a;
        z5 z5Var = this.b;
        switch (i) {
            case 0:
                z5Var.m();
                break;
            default:
                Iterator it = ghp.d(weu.a, z5Var.getParent()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    z5Var.m();
                    break;
                }
                break;
        }
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
