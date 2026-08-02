package ru.yandex.logistics.sdk.cargo_form.impl.ui;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.hwd0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements PointerInputEventHandler {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        Object E0 = ((androidx.compose.ui.input.pointer.g) hwd0Var).E0(new CargoFormScreen$CargoFormRoot$2$1$1(this.a, null), continuation);
        return E0 == CoroutineSingletons.COROUTINE_SUSPENDED ? E0 : zy11.a;
    }
}
