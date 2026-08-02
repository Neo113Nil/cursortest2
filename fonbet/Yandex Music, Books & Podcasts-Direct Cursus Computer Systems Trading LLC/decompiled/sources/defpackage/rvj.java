package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class rvj {
    public final cwj a;
    public final wbc b;
    public final ad6 c;
    public final os8 d;
    public final fkn e;
    public final fkn f;

    public rvj(cwj cwjVar, wbc wbcVar, ad6 ad6Var, os8 os8Var, qyf qyfVar) {
        cwjVar.getClass();
        this.a = cwjVar;
        this.b = wbcVar;
        this.c = ad6Var;
        this.d = os8Var;
        this.e = cwjVar.F;
        this.f = cwjVar.E;
        ox6.B(cwjVar.G, qyfVar, new fmi(12, this));
    }

    public final void a() {
        cwj cwjVar = this.a;
        cwjVar.getClass();
        x97.y(ot0.F(cwjVar), null, null, new yvj(cwjVar, null, 0), 3);
    }

    public final void b(boolean z) {
        CharSequence text;
        boolean z2;
        LinkedHashMap linkedHashMap = this.d.b;
        Continuation continuation = null;
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                View view = (View) ((Map.Entry) it.next()).getValue();
                if (view.getVisibility() == 0) {
                    TextView textView = view instanceof TextView ? (TextView) view : null;
                    if (textView != null && (text = textView.getText()) != null && text.length() > 0) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        z2 = false;
        boolean z3 = z && z2;
        cwj cwjVar = this.a;
        cwjVar.getClass();
        x97.y(ot0.F(cwjVar), null, null, new bwj(cwjVar, z3, continuation, 0), 3);
    }
}
