package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.ec21;
import defpackage.fc21;
import defpackage.gc21;
import defpackage.ic21;
import defpackage.sls;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class l implements vpr {
    public final /* synthetic */ m a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ sls y;

    public l(m mVar, String str, String str2, Object obj, Object obj2, sls slsVar) {
        this.a = mVar;
        this.b = str;
        this.c = str2;
        this.w = obj;
        this.x = obj2;
        this.y = slsVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        ic21 ic21Var = (ic21) obj;
        if (ic21Var instanceof gc21) {
            Object a = m.a(this.a, ((gc21) ic21Var).b, this.b, this.c, this.w, this.x, continuation);
            if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return a;
            }
        } else if (ic21Var instanceof fc21) {
            Object c = this.a.e.c(new UploadSmartCameraPhotoInteractor$uploadPhotoAsync$1$1$1(this.y, null), continuation);
            if (c == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return c;
            }
        } else if (!(ic21Var instanceof ec21)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
