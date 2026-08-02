package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.toolbar.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class fdi implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ fdi(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                mfhVar.getClass();
                ffhVar.getClass();
                int intValue = ((Number) this.b.invoke(mfhVar)).intValue();
                ksk M = ffhVar.M(ga6.b(((ga6) obj3).a, 0, 0, intValue, intValue, 3));
                return mfh.m0(mfhVar, M.a, M.b, new zj(M, 3));
            default:
                String str = (String) obj;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                str.getClass();
                this.b.invoke(new b(str, (String) obj2, booleanValue));
                return Unit.a;
        }
    }
}
