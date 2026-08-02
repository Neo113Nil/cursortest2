package defpackage;

import java.net.URI;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;
import ru.rt.ebs.cryptosdk.core.storage.keystore.KeyStorageType;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.exceptions.IllegalStateVerificationFlowEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationResult;

/* loaded from: classes4.dex */
public final class y831 implements IVerificationSessionController {
    public final c1x0 a;
    public final b3v b;
    public final ICommonController c;
    public s421 d;

    public y831(c1x0 c1x0Var, b3v b3vVar, ICommonController iCommonController) {
        this.a = c1x0Var;
        this.b = b3vVar;
        this.c = iCommonController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final void cancelVerification() {
        this.c.checkVerifyIntegrity();
        s421 s421Var = this.d;
        if (s421Var != null) {
            s421Var.c = VerificationResult.Cancel.INSTANCE;
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final void createSession(VerificationRequestScheme verificationRequestScheme) {
        this.d = new s421(verificationRequestScheme, VerificationResult.Empty.INSTANCE, sqb1.b());
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final void errorVerification(Exception exc) {
        Object obj;
        if (EbsException.INSTANCE.isEbsNoSecurityProcess(exc)) {
            s421 s421Var = this.d;
            if (s421Var != null) {
                createSession(((VerificationRequestScheme) s421Var.b).empty());
            }
            b3v b3vVar = this.b;
            g1o g1oVar = (g1o) b3vVar;
            int i = djx.a[KeyStorageType.MEMORY.ordinal()];
            if (i == 1) {
                obj = loe0.class;
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                obj = si10.class;
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) g1oVar.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (entry.getValue().getClass().equals(obj)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((IKeyStorage) ((Map.Entry) it.next()).getValue()).release();
            }
        }
        s421 s421Var2 = this.d;
        if (s421Var2 != null) {
            s421Var2.c = new VerificationResult.Error(exc);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final String getCookieAdapterValue() {
        String setCookieAdapterValue;
        VerificationRequestScheme verificationRequestScheme = getVerificationRequestScheme();
        VerificationRequestScheme.WithoutEsia withoutEsia = verificationRequestScheme instanceof VerificationRequestScheme.WithoutEsia ? (VerificationRequestScheme.WithoutEsia) verificationRequestScheme : null;
        return (withoutEsia == null || (setCookieAdapterValue = withoutEsia.getSetCookieAdapterValue()) == null) ? "" : setCookieAdapterValue;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final Token getCookieVrf() {
        s421 s421Var = this.d;
        return s421Var != null ? (Token) s421Var.w : new Token("");
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final URI getEbsLocation() {
        VerificationRequestScheme verificationRequestScheme = getVerificationRequestScheme();
        if (verificationRequestScheme instanceof VerificationRequestScheme.FZ115) {
            s421 s421Var = this.d;
            if (s421Var != null) {
                return (URI) s421Var.x;
            }
            return null;
        }
        if (verificationRequestScheme instanceof VerificationRequestScheme.WithoutEsia) {
            return ((VerificationRequestScheme.WithoutEsia) verificationRequestScheme).getUploadUri();
        }
        w511.b();
        return null;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final Token getResSecret() {
        return new Token(((IKeyStorage) this.a.a).getString("verification_session.res_secret", ""));
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final VerificationRequestScheme getVerificationRequestScheme() {
        s421 s421Var = this.d;
        if (s421Var != null) {
            return (VerificationRequestScheme) s421Var.b;
        }
        throw new IllegalStateVerificationFlowEbsException("Session is empty");
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final VerificationResult getVerificationResult() {
        VerificationResult verificationResult;
        this.c.checkVerifyIntegrity();
        s421 s421Var = this.d;
        return (s421Var == null || (verificationResult = (VerificationResult) s421Var.c) == null) ? VerificationResult.Empty.INSTANCE : verificationResult;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final boolean isActive() {
        return this.d != null;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final void release() {
        this.d = null;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final void removeResSecret() {
        ((IKeyStorage) this.a.a).remove("verification_session.res_secret").save();
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final void setCookieVrf(Token token) {
        s421 s421Var = this.d;
        if (s421Var != null) {
            s421Var.w = token;
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final void setEbsLocation(URI uri) {
        s421 s421Var = this.d;
        if (s421Var != null) {
            s421Var.x = uri;
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final void setResSecret(Token token) {
        ((IKeyStorage) this.a.a).putString("verification_session.res_secret", token.getValue()).save();
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController
    public final void successfulVerification() {
        this.c.checkVerifyIntegrity();
        s421 s421Var = this.d;
        if (s421Var != null) {
            s421Var.c = new VerificationResult.Success((Token) s421Var.w);
        }
    }
}
