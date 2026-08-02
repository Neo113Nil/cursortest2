package ru.yandex.taxi.scooters.presentation.finish_info;

import defpackage.bvf0;
import defpackage.eln0;
import defpackage.zuo0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.o;

/* loaded from: classes6.dex */
public final class b {
    public final o a;
    public final eln0 b;

    public b(o oVar, eln0 eln0Var) {
        this.a = oVar;
        this.b = eln0Var;
    }

    public final Object a(zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        return bvf0.n(new ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2(zuo0Var, this, null), continuationImpl);
    }
}
