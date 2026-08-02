package com.yandex.plus.home.plaque.plugin.internal;

import com.yandex.plus.core.debug.panel.internal.presentation.view.l;
import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class a extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, Continuation continuation) {
        super(continuation);
        this.l = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
