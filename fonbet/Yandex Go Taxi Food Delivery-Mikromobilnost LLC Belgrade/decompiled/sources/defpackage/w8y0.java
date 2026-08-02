package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.panorama.PanoramaAnalytics$UserInteractAction;

/* loaded from: classes6.dex */
public final class w8y0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8y0 b;

    public /* synthetic */ w8y0(y8y0 y8y0Var, int i) {
        this.a = i;
        this.b = y8y0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        y8y0 y8y0Var = this.b;
        switch (i) {
            case 0:
                a8y0 a8y0Var = y8y0Var.z;
                s8y0 s8y0Var = y8y0Var.y;
                tb90 tb90Var = s8y0Var.a;
                a8y0Var.e(tb90Var.a, s8y0Var.b, s8y0Var.c, tb90Var.c, PanoramaAnalytics$UserInteractAction.Move);
                break;
            default:
                a8y0 a8y0Var2 = y8y0Var.z;
                s8y0 s8y0Var2 = y8y0Var.y;
                tb90 tb90Var2 = s8y0Var2.a;
                a8y0Var2.e(tb90Var2.a, s8y0Var2.b, s8y0Var2.c, tb90Var2.c, PanoramaAnalytics$UserInteractAction.Zoom);
                break;
        }
        return zy11Var;
    }
}
