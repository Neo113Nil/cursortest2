package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r1a extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ w1a s;
    public final /* synthetic */ e23 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1a(w1a w1aVar, e23 e23Var, int i) {
        super(2);
        this.r = i;
        this.s = w1aVar;
        this.t = e23Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                View view = (View) obj;
                jc8 jc8Var = (jc8) obj2;
                w1a w1aVar = this.s;
                w1aVar.i.remove(view);
                if (jc8Var != null) {
                    e23 G = bg3.G(view);
                    e23 e23Var = this.t;
                    if (G == null) {
                        G = e23Var;
                    }
                    w1a.i(w1aVar, e23Var.a, G.b, null, jc8Var);
                }
                return Boolean.TRUE;
            default:
                View view2 = (View) obj;
                jc8 jc8Var2 = (jc8) obj2;
                w1a w1aVar2 = this.s;
                gao gaoVar = w1aVar2.a;
                WeakHashMap weakHashMap = w1aVar2.i;
                Rect rect = (Rect) gaoVar.a;
                boolean z = true;
                boolean z2 = view2.isShown() && view2.getGlobalVisibleRect(rect) && view2.getWidth() == rect.width() && view2.getHeight() == rect.height();
                if (z2 && Intrinsics.d(weakHashMap.get(view2), Boolean.TRUE)) {
                    z = false;
                } else {
                    weakHashMap.put(view2, Boolean.valueOf(z2));
                    if (jc8Var2 != null) {
                        e23 G2 = bg3.G(view2);
                        e23 e23Var2 = this.t;
                        if (G2 == null) {
                            G2 = e23Var2;
                        }
                        w1a.i(w1aVar2, e23Var2.a, G2.b, view2, jc8Var2);
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
