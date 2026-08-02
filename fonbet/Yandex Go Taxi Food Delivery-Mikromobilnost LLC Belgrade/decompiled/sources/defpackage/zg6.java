package defpackage;

import com.yandex.go.data.repositories.h;
import com.yandex.go.repositories.AvatarStatus;
import com.yandex.go.repositories.e;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class zg6 implements vpr {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public zg6(h hVar, boolean z) {
        this.c = hVar;
        this.b = z;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                tx40 tx40Var = (tx40) obj2;
                if (!z) {
                    tx40Var.setFloatValue(floatValue);
                    break;
                } else {
                    tx40Var.setFloatValue(1.0f - floatValue);
                    break;
                }
            default:
                xq21 xq21Var = (xq21) obj;
                h hVar = (h) obj2;
                r0 r0Var = hVar.i;
                Result result = new Result(xq21Var);
                r0Var.getClass();
                r0Var.m(null, result);
                if (!jl40.l(xq21Var.b, AvatarStatus.NOT_FOUND_STATUS.getText()) || z) {
                    e eVar = hVar.a;
                    String str = xq21Var.a;
                    String str2 = xq21Var.b;
                    r0 r0Var2 = eVar.d;
                    bgv bgvVar = new bgv(str, str2);
                    r0Var2.getClass();
                    r0Var2.m(null, bgvVar);
                    break;
                }
        }
        return zy11Var;
    }

    public zg6(boolean z, tx40 tx40Var) {
        this.b = z;
        this.c = tx40Var;
    }
}
