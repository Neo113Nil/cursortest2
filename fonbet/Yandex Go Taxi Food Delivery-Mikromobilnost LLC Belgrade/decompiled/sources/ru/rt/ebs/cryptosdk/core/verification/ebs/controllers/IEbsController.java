package ru.rt.ebs.cryptosdk.core.verification.ebs.controllers;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.zy11;
import java.net.URI;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.Negotiate;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.NegotiateHandler;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.PhotoHandler;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H¦@¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fH¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0013\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fH¦@¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0019H¦@¢\u0006\u0004\b\u001a\u0010\u0004J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/ebs/controllers/IEbsController;", "", "Lzy11;", "initVerification", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/net/URI;", "url", "", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, "", "isAppendPort", "initVerificationHost", "(Ljava/net/URI;IZ)V", "clearVerification", "clearBioSamples", "", "initNegotiate", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/NegotiateHandler;", "fetchNegotiateHandler", "Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/Negotiate;", "negotiate", "setResultNegotiate", "(Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/Negotiate;)V", "uploadNegotiate", "Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/PhotoHandler;", "fetchPhotoHandler", "uploadPhoto", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IEbsController {
    Object clearBioSamples(Continuation<? super zy11> continuation);

    Object clearVerification(Continuation<? super zy11> continuation);

    Object fetchNegotiateHandler(Continuation<? super NegotiateHandler> continuation);

    Object fetchPhotoHandler(Continuation<? super PhotoHandler> continuation);

    Object initNegotiate(String str, Continuation<? super zy11> continuation);

    Object initVerification(Continuation<? super zy11> continuation);

    void initVerificationHost(URI url, int port, boolean isAppendPort);

    void setResultNegotiate(Negotiate negotiate);

    Object uploadNegotiate(String str, Continuation<? super zy11> continuation);

    Object uploadPhoto(String str, Continuation<? super zy11> continuation);
}
