package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController;
import ru.rt.ebs.cryptosdk.core.network.entities.models.https.request.HttpsMethod;
import ru.rt.ebs.cryptosdk.core.registration.controllers.IRegistrationController;
import ru.rt.ebs.cryptosdk.core.registration.controllers.a;
import ru.rt.ebs.cryptosdk.core.registration.entities.exceptions.EmptyTokenRegistrationEbsException;
import ru.rt.ebs.cryptosdk.core.registration.entities.exceptions.RegistrationEbsException;
import ru.rt.ebs.cryptosdk.core.registration.entities.models.RegisterInstanceRequest;
import ru.rt.ebs.cryptosdk.core.registration.entities.models.RegisterInstanceResponse;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;

/* loaded from: classes4.dex */
public final class wqi0 implements IRegistrationController {
    public final eri0 a;
    public final IMetadataController b;

    public wqi0(eri0 eri0Var, IMetadataController iMetadataController) {
        this.a = eri0Var;
        this.b = iMetadataController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.registration.controllers.IRegistrationController
    public final void register(Token token) {
        boolean z;
        eri0 eri0Var = this.a;
        IKeyStorage iKeyStorage = eri0Var.b;
        Token token2 = new Token(iKeyStorage.getString("ebs.cryptosdk.core.registration.installID", ""));
        if (evu0.J(token2.getValue())) {
            iKeyStorage.putString("ebs.cryptosdk.core.registration.installID", new Token(this.b.getDeviceId()).getValue()).save();
            token2 = new Token(iKeyStorage.getString("ebs.cryptosdk.core.registration.installID", ""));
            z = true;
        } else {
            z = false;
        }
        if (evu0.J(new Token(iKeyStorage.getString("ebs.cryptosdk.core.registration.programID", "")).getValue()) || z) {
            if (evu0.J(token.getValue())) {
                throw new EmptyTokenRegistrationEbsException();
            }
            try {
                h9e h9eVar = eri0Var.a;
                Map i = b.i(new Pair("Content-Type", "application/json;charset=UTF-8"), new Pair("Authorization", "Bearer ".concat(token.toString())));
                RegisterInstanceRequest registerInstanceRequest = new RegisterInstanceRequest(token2.getValue());
                HttpsMethod httpsMethod = HttpsMethod.POST;
                zwu zwuVar = new zwu("kpm/api/v1/RegUnit");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : i.entrySet()) {
                    linkedHashMap3.put((String) entry.getKey(), Collections.singletonList((String) entry.getValue()));
                }
                RegisterInstanceResponse registerInstanceResponse = (RegisterInstanceResponse) ((qwu) h9eVar.b).e(new xwu(httpsMethod, zwuVar, linkedHashMap, linkedHashMap2, linkedHashMap3, registerInstanceRequest, arrayList), RegisterInstanceResponse.class);
                if (registerInstanceResponse.getProgramID().length() == 0) {
                    throw new RegistrationEbsException("ProgramID is empty");
                }
                iKeyStorage.putString("ebs.cryptosdk.core.registration.programID", new Token(registerInstanceResponse.getProgramID()).getValue()).save();
            } catch (Exception e) {
                throw new RegistrationEbsException(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // ru.rt.ebs.cryptosdk.core.registration.controllers.IRegistrationController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateRegistration(Continuation continuation) {
        a aVar;
        int i;
        eri0 eri0Var = this.a;
        IKeyStorage iKeyStorage = eri0Var.b;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i2 = aVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.d = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.b;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.d;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Token token = new Token(iKeyStorage.getString("ebs.cryptosdk.core.registration.installID", ""));
                        Token token2 = new Token(iKeyStorage.getString("ebs.cryptosdk.core.registration.programID", ""));
                        if (evu0.J(token.getValue()) || evu0.J(token2.getValue())) {
                            throw new EmptyTokenRegistrationEbsException();
                        }
                        aVar.a = this;
                        aVar.d = 1;
                        if (eri0Var.a(token, token2, aVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wqi0 wqi0Var = aVar.a;
                        kotlin.b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Exception e) {
            if (EbsException.INSTANCE.isRemoveProgramIDException(e)) {
                this.a.b.remove("ebs.cryptosdk.core.registration.programID").save();
            }
            throw e;
        }
        aVar = new a(this, continuation);
        Object obj2 = aVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.d;
    }
}
