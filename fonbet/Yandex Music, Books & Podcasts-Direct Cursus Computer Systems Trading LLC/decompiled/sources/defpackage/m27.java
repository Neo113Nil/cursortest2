package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m27 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ o27 b;

    public /* synthetic */ m27(o27 o27Var, int i) {
        this.a = i;
        this.b = o27Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0, (android.widget.ScrollView) r2.b) == false) goto L13;
     */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                if (Intrinsics.d(uri.getHost(), "close_legal") && Intrinsics.d(uri.getScheme(), "payment-sdk")) {
                    ((tu2) this.b.k.getValue()).l.l(nxi.c);
                }
                break;
            default:
                hw8 hw8Var = (hw8) obj;
                o27 o27Var = this.b;
                gc8 gc8Var = o27Var.g;
                if (gc8Var != null) {
                    ViewParent parent = gc8Var.getParent();
                    qec qecVar = o27Var.i;
                    if (qecVar == null) {
                        xq0.q("Required value was null.");
                        break;
                    } else {
                        break;
                    }
                }
                gc8 gc8Var2 = new gc8((vb8) o27Var.p.getValue(), null, 0, 6, null);
                gc8Var2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                gc8Var2.setId(View.generateViewId());
                o27Var.g = gc8Var2;
                qec qecVar2 = o27Var.i;
                if (qecVar2 == null) {
                    xq0.q("Required value was null.");
                    break;
                } else {
                    if (((ScrollView) qecVar2.b).getChildCount() == 0) {
                        qec qecVar3 = o27Var.i;
                        if (qecVar3 == null) {
                            xq0.q("Required value was null.");
                            break;
                        } else {
                            ((ScrollView) qecVar3.b).addView(o27Var.g);
                        }
                    }
                    gc8 gc8Var3 = o27Var.g;
                    if (gc8Var3 != null) {
                        rv8 rv8Var = hw8Var.a;
                        gc8Var3.M(rv8Var, new dw8(rv8Var.b));
                    }
                    gc8 gc8Var4 = o27Var.g;
                    if (gc8Var4 != null) {
                        gc8Var4.post(new jt6(10, hw8Var, o27Var));
                    }
                    break;
                }
        }
        return Unit.a;
    }
}
