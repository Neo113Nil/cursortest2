package ru.rt.ebs.cryptosdk.core.registration.controllers;

import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/rt/ebs/cryptosdk/core/registration/controllers/IRegistrationController;", "", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "registrationToken", "Lzy11;", "register", "(Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;)V", "updateRegistration", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IRegistrationController {
    void register(Token registrationToken);

    Object updateRegistration(Continuation<? super zy11> continuation);
}
