package ru.yandex.logistics.sdk.cargo_form.impl.photocomments;

import defpackage.f4l0;
import defpackage.s5s;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class a {
    public final f4l0 a;
    public final s5s b;

    public a(f4l0 f4l0Var, s5s s5sVar) {
        this.a = f4l0Var;
        this.b = s5sVar;
    }

    public final Object a(Continuation continuation) {
        Object k = e.k(this.a.d(), new FormPhotocommentsAddressListener$listenForAddressChanges$2(this, null), continuation);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : zy11.a;
    }
}
