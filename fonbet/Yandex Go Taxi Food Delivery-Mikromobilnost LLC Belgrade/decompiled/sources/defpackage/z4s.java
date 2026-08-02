package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;

/* loaded from: classes5.dex */
public final class z4s {
    public final r0 a = bvf0.c(FormLoadingStateRepository$State.LOADING);

    public final void a(FormLoadingStateRepository$State formLoadingStateRepository$State) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, formLoadingStateRepository$State));
    }
}
