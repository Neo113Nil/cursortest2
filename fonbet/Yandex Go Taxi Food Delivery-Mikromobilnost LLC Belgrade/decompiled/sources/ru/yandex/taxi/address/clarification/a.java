package ru.yandex.taxi.address.clarification;

import defpackage.a01;
import defpackage.ffx;
import defpackage.qa0;
import defpackage.sy0;
import java.util.function.Consumer;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public final class a extends sy0 {
    public final n0 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(a01 a01Var, qa0 qa0Var) {
        super(e.c(r0), a01Var, new AddressMapPickerClarificationPayloadCompat$1(1, qa0Var, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.d = b;
    }
}
