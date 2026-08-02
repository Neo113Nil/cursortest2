package defpackage;

import com.yandex.go.deeplink.a;
import com.yandex.go.navigation.UserPhotoUploadingEntryPoint;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class uq21 implements vpr {
    public final /* synthetic */ a a;
    public final /* synthetic */ oep0 b;
    public final /* synthetic */ boolean c;

    public uq21(a aVar, oep0 oep0Var, boolean z) {
        this.a = aVar;
        this.b = oep0Var;
        this.c = z;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        yvf0 yvf0Var = this.a.b;
        if (((Boolean) obj).booleanValue() && !gtq0.u((m950) yvf0Var.get())) {
            ((pep0) this.b).f((m950) yvf0Var.get(), new hr21(UserPhotoUploadingEntryPoint.DEEPLINK, this.c, 4), hxx.a);
        }
        return zy11.a;
    }
}
