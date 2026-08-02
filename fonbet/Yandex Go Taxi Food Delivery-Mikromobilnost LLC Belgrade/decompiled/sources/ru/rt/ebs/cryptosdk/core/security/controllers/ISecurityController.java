package ru.rt.ebs.cryptosdk.core.security.controllers;

import android.content.Context;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.security.entities.models.ITLSFactory;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H&¢\u0006\u0004\b\u0017\u0010\u0010¨\u0006\u0018"}, d2 = {"Lru/rt/ebs/cryptosdk/core/security/controllers/ISecurityController;", "", "Landroid/content/Context;", "context", "Lzy11;", "init", "(Landroid/content/Context;)V", "", "isInitialized", "()Z", "isLicenseStatusOk", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "serialNumber", "installNewLicense", "(Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;)V", "verifyImmediately", "()V", "verify", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeBioRNG", "Lru/rt/ebs/cryptosdk/core/security/entities/models/ITLSFactory;", "getTLSFactory", "()Lru/rt/ebs/cryptosdk/core/security/entities/models/ITLSFactory;", "release", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ISecurityController {
    ITLSFactory getTLSFactory();

    void init(Context context);

    void initializeBioRNG();

    void installNewLicense(Token serialNumber);

    boolean isInitialized();

    boolean isLicenseStatusOk();

    void release();

    Object verify(Continuation<? super zy11> continuation);

    void verifyImmediately();
}
