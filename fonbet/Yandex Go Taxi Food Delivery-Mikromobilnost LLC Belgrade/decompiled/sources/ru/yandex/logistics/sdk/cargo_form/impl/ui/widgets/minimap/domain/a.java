package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap.domain;

import defpackage.dci;
import defpackage.doe;
import defpackage.t6u0;
import defpackage.u6u0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes5.dex */
public final class a {
    public final u6u0 a;
    public final dci b;

    public a(u6u0 u6u0Var, dci dciVar) {
        this.a = u6u0Var;
        this.b = dciVar;
    }

    public final Object a(doe doeVar, t6u0 t6u0Var, Continuation continuation) {
        return ru.yandex.taxi.logistics.sdk.utils.a.a(new MiniMapInteractor$getImageByCoordinates$2(this, this.a.a(doeVar, t6u0Var), null), (SuspendLambda) continuation);
    }
}
