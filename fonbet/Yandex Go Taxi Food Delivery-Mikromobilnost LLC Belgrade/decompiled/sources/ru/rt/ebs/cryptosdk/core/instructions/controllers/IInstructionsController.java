package ru.rt.ebs.cryptosdk.core.instructions.controllers;

import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/rt/ebs/cryptosdk/core/instructions/controllers/IInstructionsController;", "", "Lzy11;", "updateInstructionsMetadata", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fetchInstructionsData", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IInstructionsController {
    Object fetchInstructionsData(Continuation<? super String> continuation);

    Object updateInstructionsMetadata(Continuation<? super zy11> continuation);
}
