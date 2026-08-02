package defpackage;

import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.presentation.base.BaseActivity;

/* loaded from: classes4.dex */
public final class ug61 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseActivity b;

    public /* synthetic */ ug61(BaseActivity baseActivity, int i) {
        this.a = i;
        this.b = baseActivity;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        BaseActivity baseActivity = this.b;
        switch (i) {
            case 0:
                baseActivity.onViewStateChanged((tt11) obj);
                break;
            default:
                baseActivity.onViewEffect((xs11) obj);
                break;
        }
        return zy11Var;
    }
}
