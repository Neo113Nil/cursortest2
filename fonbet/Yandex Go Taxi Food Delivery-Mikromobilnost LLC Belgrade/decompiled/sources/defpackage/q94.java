package defpackage;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.a;
import com.yandex.div.json.expressions.Expression;

/* loaded from: classes9.dex */
public final /* synthetic */ class q94 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ q94(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                View view2 = (View) obj;
                ((View.OnClickListener) obj3).onClick(view);
                String str = (String) ((sls) obj2).invoke();
                if (str != null && !evu0.J(str)) {
                    udq0.N(view2, str);
                    break;
                }
                break;
            default:
                jzv inputFocusTracker = ((Div2View) obj2).getInputFocusTracker();
                if (((Boolean) ((Expression) obj3).a((rvo) obj)).booleanValue()) {
                    a.m(view, inputFocusTracker);
                    break;
                }
                break;
        }
    }
}
