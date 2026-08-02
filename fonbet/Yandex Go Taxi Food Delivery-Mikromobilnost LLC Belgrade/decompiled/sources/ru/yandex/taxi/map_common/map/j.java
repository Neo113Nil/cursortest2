package ru.yandex.taxi.map_common.map;

import defpackage.al00;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public final class j implements vpr {
    public final /* synthetic */ al00 a;

    public j(al00 al00Var) {
        this.a = al00Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        this.a.d.f(false, new MapKitGlobalExperimentsInteractor$listenForExperiments$1$1((List) obj, null));
        return zy11.a;
    }
}
