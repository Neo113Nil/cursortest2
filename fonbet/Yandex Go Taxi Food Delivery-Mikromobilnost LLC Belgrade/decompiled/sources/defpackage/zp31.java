package defpackage;

import android.view.View;
import androidx.core.view.b;
import defpackage.bvf0;
import java.util.WeakHashMap;
import kotlinx.coroutines.a;

/* loaded from: classes2.dex */
public abstract class zp31 {
    public static final int a = nah0.ybsdk_view_scope_id;

    public static final tse a(final View view) {
        WeakHashMap weakHashMap = b.a;
        if (!view.isAttachedToWindow()) {
            x4c.g("Trying to get viewScope when view is not attached", null, view.getClass().getName(), null, 10);
        }
        int i = a;
        Object tag = view.getTag(i);
        if (tag != null) {
            tse tseVar = (tse) tag;
            if (a.n(tseVar.getCoroutineContext()).isActive() || !view.isAttachedToWindow()) {
                return tseVar;
            }
        }
        qhw0 a2 = jl40.a();
        sjh sjhVar = uyj.a;
        final ike a3 = bvf0.a(cvw.U(a2, o400.a.x));
        view.setTag(i, a3);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.ybsdk.core.utils.ui.ViewCoroutineScopeKt$viewScope$2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                view.removeOnAttachStateChangeListener(this);
                bvf0.j(a3, null);
            }
        });
        return a3;
    }
}
