package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.collections.EmptyList;
import kotlin.sequences.b;

/* loaded from: classes13.dex */
public final /* synthetic */ class san0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx40 b;

    public /* synthetic */ san0(xx40 xx40Var, int i) {
        this.a = i;
        this.b = xx40Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        char c = 1;
        xx40 xx40Var = this.b;
        int i2 = 0;
        View view = (View) obj;
        switch (i) {
            case 0:
                return Boolean.valueOf(view.getVisibility() == 0 && xx40Var.c(view.getId()));
            default:
                return new tan0(view.getId(), view.getHeight(), view.getPaddingTop(), view instanceof ViewGroup ? b.s(new yw01(b.g(new jr31((ViewGroup) view, 0), new san0(xx40Var, i2)), new san0(xx40Var, c == true ? 1 : 0))) : EmptyList.a);
        }
    }
}
