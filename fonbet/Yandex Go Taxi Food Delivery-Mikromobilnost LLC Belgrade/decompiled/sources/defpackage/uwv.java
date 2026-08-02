package defpackage;

import android.content.Context;
import kotlin.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IEbsCryptoSdkConfig;
import ru.rt.ebs.cryptosdk.core.common.entities.models.ISdkDispatchers;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController;
import ru.rt.ebs.cryptosdk.core.initialization.controllers.b;
import ru.rt.ebs.cryptosdk.core.initialization.controllers.c;
import ru.rt.ebs.cryptosdk.core.initialization.controllers.e;
import ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController;
import ru.rt.ebs.cryptosdk.core.registration.controllers.IRegistrationController;
import ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController;
import ru.rt.ebs.cryptosdk.core.security.entities.models.TLSOptions;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;

/* loaded from: classes4.dex */
public final class uwv implements IInitializationController {
    public final reu a;
    public final Context b;
    public final ISecurityController c;
    public final IRegistrationController d;
    public final IMetadataController e;
    public final ICommonController f;
    public final ISdkDispatchers g;
    public final i3y h = a.a(new twv(this, 0));
    public int i;
    public boolean j;

    public uwv(reu reuVar, Context context, ISecurityController iSecurityController, IRegistrationController iRegistrationController, IMetadataController iMetadataController, ICommonController iCommonController, ISdkDispatchers iSdkDispatchers) {
        this.a = reuVar;
        this.b = context;
        this.c = iSecurityController;
        this.d = iRegistrationController;
        this.e = iMetadataController;
        this.f = iCommonController;
        this.g = iSdkDispatchers;
    }

    @Override // ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController
    public final void flushRegistration() {
        if (isInitializedSdk()) {
            this.i = 6;
        }
        this.j = false;
    }

    @Override // ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController
    public final void initializeSdk(IEbsCryptoSdkConfig iEbsCryptoSdkConfig, TLSOptions tLSOptions, Token token) {
        IKeyStorage iKeyStorage = (IKeyStorage) this.a.b;
        int i = 1;
        if (this.i == 0) {
            this.f.checkRoot(new twv(this, i));
            this.i = 1;
        }
        int i2 = this.i;
        ISecurityController iSecurityController = this.c;
        if (i2 == 1) {
            iSecurityController.init(this.b);
            this.i = 2;
        }
        iSecurityController.verifyImmediately();
        this.i = 3;
        if (!iKeyStorage.getBoolean("ebs.cryptosdk.core.initialization.isBioRngInitialized", false)) {
            iSecurityController.initializeBioRNG();
            iKeyStorage.putBoolean("ebs.cryptosdk.core.initialization.isBioRngInitialized", true).save();
        }
        this.i = 4;
        if (!iSecurityController.isLicenseStatusOk()) {
            iSecurityController.installNewLicense(token);
        }
        this.i = 5;
        iSecurityController.getTLSFactory().init(tLSOptions).getOrCreateGostTLSProvider();
        this.i = 6;
        this.d.register(iEbsCryptoSdkConfig.getKpmToken());
        this.i = 7;
        tje.N((tse) this.h.getValue(), null, null, new ru.rt.ebs.cryptosdk.core.initialization.controllers.a(this, null), 3);
    }

    @Override // ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController
    public final boolean isInitializedSdk() {
        return this.i == 7;
    }

    @Override // ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController
    public final boolean isUpdateRegistration() {
        return this.j;
    }

    @Override // ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController
    public final void release() {
        flushRegistration();
        this.i = 0;
        bvf0.j((tse) this.h.getValue(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateRegistration(Continuation continuation) {
        b bVar;
        int i;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.c = i2 - Integer.MIN_VALUE;
                Object obj = bVar.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.c;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (!this.j) {
                    jse io2 = this.g.io();
                    c cVar = new c(this, null);
                    bVar.c = 1;
                    if (tje.k0(io2, cVar, bVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        bVar = new b(this, continuation);
        Object obj2 = bVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.c;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController
    public final void updateRegistrationNotSuspend() {
        this.f.checkVerifyIntegrity();
        tje.X(new e(this, null));
    }
}
