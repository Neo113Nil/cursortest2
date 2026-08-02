package defpackage;

import com.ybsdk.api.f;
import com.ybsdk.navigation.NavigationFragment;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class w750 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ NavigationFragment b;

    public /* synthetic */ w750(NavigationFragment navigationFragment, int i) {
        this.a = i;
        this.b = navigationFragment;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        NavigationFragment navigationFragment = this.b;
        switch (i) {
            case 0:
                tn90 tn90Var = (tn90) obj;
                if (jl40.l(tn90Var, sn90.a)) {
                    return zy11Var;
                }
                if (!(tn90Var instanceof rn90)) {
                    w511.b();
                    return null;
                }
                ((f) ((h9g) navigationFragment.getSdkViewComponent()).G1.get()).e(((rn90) tn90Var).a);
                navigationFragment.warmUpWebViewPassportCookies();
                return zy11Var;
            default:
                if (((Long) obj) == null) {
                    navigationFragment.getRouter().d();
                }
                return zy11Var;
        }
    }
}
