package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.repository.FormInternalOverrideRepository", f = "FormInternalOverrideRepository.kt", l = {145}, m = "onOverrideNotFoundAfterReload", v = 2)
/* loaded from: classes5.dex */
final class FormInternalOverrideRepository$onOverrideNotFoundAfterReload$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormInternalOverrideRepository$onOverrideNotFoundAfterReload$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.b(this.this$0, this);
    }
}
