package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data;

import defpackage.fse;
import defpackage.noh;
import defpackage.st2;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ st2 c;
    public final /* synthetic */ long w;
    public final /* synthetic */ fse x;
    public final /* synthetic */ vpr y;

    public c(Ref$ObjectRef ref$ObjectRef, tse tseVar, st2 st2Var, long j, fse fseVar, vpr vprVar) {
        this.a = ref$ObjectRef;
        this.b = tseVar;
        this.c = st2Var;
        this.w = j;
        this.x = fseVar;
        this.y = vprVar;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [T, qoh] */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Ref$ObjectRef ref$ObjectRef = this.a;
        noh nohVar = (noh) ref$ObjectRef.element;
        if (nohVar != null) {
            nohVar.a(null);
        }
        ref$ObjectRef.element = tje.h(this.b, this.c.c, null, new FeedbackRemoteDataSourceKt$debounce$1$1$1$1(this.w, this.x, this.y, obj, null), 2);
        return zy11.a;
    }
}
