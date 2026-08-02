package defpackage;

import android.view.View;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class s1a extends uif implements tyc {
    public final /* synthetic */ int r;
    public final /* synthetic */ w1a s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1a(w1a w1aVar, int i) {
        super(5);
        this.r = i;
        this.s = w1aVar;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.r) {
            case 0:
                gc8 gc8Var = (gc8) obj;
                xzb xzbVar = (xzb) obj2;
                View view = (View) obj3;
                jc8 jc8Var = (jc8) obj4;
                wj9 wj9Var = (wj9) obj5;
                boolean z = wj9Var instanceof l1a;
                w1a w1aVar = this.s;
                if (z) {
                    w1aVar.g(gc8Var, xzbVar, view, jc8Var, t75.c(wj9Var), c5b.a);
                } else if (wj9Var instanceof tw8) {
                    w1aVar.g(gc8Var, xzbVar, view, jc8Var, c5b.a, t75.c(wj9Var));
                }
                break;
            default:
                gc8 gc8Var2 = (gc8) obj;
                xzb xzbVar2 = (xzb) obj2;
                wj9 wj9Var2 = (wj9) obj5;
                boolean z2 = wj9Var2 instanceof l1a;
                w1a w1aVar2 = this.s;
                if (z2) {
                    w1aVar2.e(gc8Var2, xzbVar2, null, wj9Var2, 0, w1aVar2.d);
                } else if (wj9Var2 instanceof tw8) {
                    w1aVar2.e(gc8Var2, xzbVar2, null, wj9Var2, 0, w1aVar2.e);
                }
                break;
        }
        return Unit.a;
    }
}
