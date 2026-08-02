package ru.yandex.taxi.diagnostic;

import android.util.Base64;
import defpackage.evu0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uza;
import defpackage.wls;
import defpackage.xby;
import defpackage.yzn;
import defpackage.zy11;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.diagnostic.DiagnosticModeInteractor$sendReport$encryptedContent$1", f = "DiagnosticModeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class DiagnosticModeInteractor$sendReport$encryptedContent$1 extends SuspendLambda implements wls {
    int label;

    public DiagnosticModeInteractor$sendReport$encryptedContent$1() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiagnosticModeInteractor$sendReport$encryptedContent$1(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiagnosticModeInteractor$sendReport$encryptedContent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        byte[] encoded = ((SecretKey) yzn.a.getValue()).getEncoded();
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            String obj2 = evu0.k0("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1FfUVZ34Eh9LmCgYqQWa590NAfZetIwU\nmHkN9V8ymIKrgXOpmVV5Jb+uNT4wrCUsepJl9OXD8LfgwwWkBwCPHk5rYgnCg5DExrk+GEfVhHpK\nLS568zlZ42GxfjyTSJ2LYja6u/oFBztSJonrlgsktQstEk/GuDl2NGJA6hfhFEQVK+ptrkCJT6Vm\nTWgW9rOO7gzrovdtfsSlbgvoLVfPET33T3RJ5xcFvK8AEnrEAbG3eF+FlkGQZgnqSVP4Khotb2tS\nbK+ui2oo9pYkcrTozZlHo1+cjpwmeBgyNbVuGs1bfcB1mEJQ0pAmvKHXBanXqC2vtc8iox8qZjFL\nCq4e6wIDAQAB\n").toString();
            Charset charset = uza.a;
            PublicKey generatePublic = keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decode(obj2.getBytes(charset), 0)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
            cipher.init(1, generatePublic);
            return new String(Base64.encode(cipher.doFinal(encoded), 2), charset);
        } catch (Exception e) {
            xby.l(jst.e, "DIAGNOSTIC:ENCRYPTION_ERROR", null, e, "Failed to encrypt diagnostic data", 2);
            return "";
        }
    }
}
