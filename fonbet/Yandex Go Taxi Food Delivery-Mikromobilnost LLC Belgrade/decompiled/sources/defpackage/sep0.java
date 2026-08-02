package defpackage;

import android.graphics.Rect;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class sep0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ wep0 b;

    public /* synthetic */ sep0(wep0 wep0Var, int i) {
        this.a = i;
        this.b = wep0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wep0 wep0Var = this.b;
        switch (i) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    wep0Var.c.b(null, wep0Var.d);
                    break;
                } else {
                    wep0Var.c.a(null, wep0Var.d);
                    break;
                }
            default:
                d7k0 d7k0Var = wep0Var.b;
                d7k0Var.a.Lc(d7k0Var.b, (Rect) obj);
                break;
        }
        return zy11Var;
    }
}
