package defpackage;

import com.adjust.sdk.Constants;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class sou0 extends rou0 {
    public final yvf0 b;

    public sou0(vrt0 vrt0Var) {
        this.b = vrt0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        String a = ((qou0) obj).a();
        if (a == null || evu0.J(a)) {
            jst.e.j(new IllegalArgumentException("id parameter is empty"));
        } else {
            ((pep0) oep0Var).f((m950) this.b.get(), new npu0((x3) new mpu0(a), deeplinkSource == DeeplinkSource.PUSH ? Constants.PUSH : Constants.DEEPLINK, (Float) null, false, HProv.PP_SAME_MEDIA), hxx.a);
        }
        return zy11.a;
    }
}
