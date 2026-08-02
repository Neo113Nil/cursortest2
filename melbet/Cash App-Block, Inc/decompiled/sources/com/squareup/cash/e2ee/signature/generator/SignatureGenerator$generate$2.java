package com.squareup.cash.e2ee.signature.generator;

import androidx.datastore.core.SimpleActor;
import app.cash.api.ApiResult;
import app.cash.trifle.KeyHandle;
import app.cash.trifle.Trifle;
import app.cash.trifle.protos.api.alpha.MobileCertificateRequest;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.fillr.m1;
import com.google.android.gms.internal.common.zzx;
import com.squareup.cash.e2ee.signature.Signature;
import com.squareup.cash.e2ee.signature.service.SigningCertificateService;
import com.squareup.cash.e2ee.trifle.RealTrifleLogger;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.e2ee.trifle.TrifleAction;
import com.squareup.cash.e2ee.trifle.TrifleError;
import com.squareup.cash.e2ee.trifle.TrifleService;
import com.squareup.protos.cash.deviceintegritly.api.GetSignedCertificateRequest;
import com.squareup.protos.cash.deviceintegritly.api.GetSignedCertificateResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SignatureGenerator$generate$2 extends SuspendLambda implements Function2 {
    public byte[] L$0;
    public int label;
    public final /* synthetic */ SimpleActor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureGenerator$generate$2(SimpleActor simpleActor, Continuation continuation) {
        super(2, continuation);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SignatureGenerator$generate$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SignatureGenerator$generate$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        SimpleActor simpleActor = this.this$0;
        TrifleService trifleService = (TrifleService) simpleActor.consumeMessage;
        RealTrifleLogger realTrifleLogger = (RealTrifleLogger) simpleActor.messageQueue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            realTrifleLogger.logAction(TrifleAction.GenerateCertificate);
            RealTrifleService realTrifleService = (RealTrifleService) trifleService;
            RealTrifleLogger realTrifleLogger2 = realTrifleService.trifleLogger;
            realTrifleLogger2.logAction(TrifleAction.GenerateKeyHandle);
            try {
                realTrifleService.trifle.getClass();
                String str = "com.squareup.cash.sign.sign." + UUID.randomUUID();
                new KeyHandle(str);
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                bytes.getClass();
                RealTrifleService realTrifleService2 = (RealTrifleService) trifleService;
                RealTrifleLogger realTrifleLogger3 = realTrifleService2.trifleLogger;
                realTrifleLogger3.logAction(TrifleAction.GenerateMobileCertificateRequest);
                try {
                    Trifle trifle = realTrifleService2.trifle;
                    KeyHandle keyHandle = zzx.toKeyHandle(bytes);
                    trifle.getClass();
                    KeyPair keyPair$trifle_release = keyHandle.getKeyPair$trifle_release();
                    keyPair$trifle_release.getClass();
                    AndroidSvg androidSvg = new AndroidSvg(keyPair$trifle_release);
                    X500Name x500Name = new X500Name("CN=E2EE_cert_singing_entity");
                    SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(((KeyPair) androidSvg.svg).getPublic().getEncoded());
                    subjectPublicKeyInfo.getClass();
                    PKCS10CertificationRequest build = new PKCS10CertificationRequestBuilder(x500Name, subjectPublicKeyInfo).build(androidSvg);
                    ByteString.Companion companion = ByteString.Companion;
                    byte[] encoded = build.getEncoded();
                    encoded.getClass();
                    m1 m1Var = new m1(ByteString.Companion.of$default(encoded));
                    ByteString.Companion companion2 = ByteString.Companion;
                    byte[] encoded2 = ((PKCS10CertificationRequest) m1Var.a).getEncoded();
                    encoded2.getClass();
                    ByteString of$default = ByteString.Companion.of$default(encoded2);
                    ByteString byteString = ByteString.EMPTY;
                    byte[] encode = new MobileCertificateRequest(0, of$default, byteString).encode();
                    realTrifleLogger.logAction(TrifleAction.FetchCertificate);
                    SigningCertificateService signingCertificateService = (SigningCertificateService) simpleActor.scope;
                    ByteString.Companion companion3 = ByteString.Companion;
                    GetSignedCertificateRequest getSignedCertificateRequest = new GetSignedCertificateRequest(ByteString.Companion.of$default(encode), null, null, byteString);
                    this.L$0 = bytes;
                    this.label = 1;
                    Object signedCertificate = signingCertificateService.getSignedCertificate(getSignedCertificateRequest, this);
                    if (signedCertificate == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = signedCertificate;
                    bArr = bytes;
                } catch (Exception e) {
                    realTrifleLogger3.logError(TrifleError.MobileCertificateRequestGenerationFailed.INSTANCE, null);
                    throw e;
                }
            } catch (Exception e2) {
                realTrifleLogger2.logError(TrifleError.KeyHandleGenerationFailed.INSTANCE, null);
                throw e2;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bArr = this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        ApiResult apiResult = (ApiResult) obj;
        if (!(apiResult instanceof ApiResult.Success)) {
            if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    throw ((ApiResult.Failure.NetworkFailure) apiResult).error;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            TrifleError.CertificateFetchingFailed certificateFetchingFailed = TrifleError.CertificateFetchingFailed.INSTANCE;
            int i2 = ((ApiResult.Failure.HttpFailure) apiResult).code;
            realTrifleLogger.logError(certificateFetchingFailed, Thread$State$EnumUnboxingLocalUtility.m("http_failure_code", String.valueOf(i2)));
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Http Failure with code "));
            return null;
        }
        List list = ((GetSignedCertificateResponse) ((ApiResult.Success) apiResult).response).trifle_certificate_chain;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ByteString) it.next()).toByteArray());
        }
        realTrifleLogger.logAction(TrifleAction.ValidateCertificate);
        try {
            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(((RealTrifleService) trifleService).m3522verifyCertsIoAF18A(arrayList));
            if (m4120exceptionOrNullimpl != null) {
                if (m4120exceptionOrNullimpl instanceof TrifleError.NotValidYetCertificate) {
                    realTrifleLogger.logError((TrifleError) m4120exceptionOrNullimpl, null);
                } else {
                    realTrifleLogger.logError(TrifleError.InvalidCertificateFetched.INSTANCE, null);
                }
            }
        } catch (Exception unused) {
            realTrifleLogger.logError(TrifleError.CertificateValidationFailed.INSTANCE, null);
        }
        return new Signature(arrayList, bArr);
    }
}
