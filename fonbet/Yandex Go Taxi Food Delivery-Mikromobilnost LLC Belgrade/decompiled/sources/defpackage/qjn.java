package defpackage;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaData;
import ru.rt.ebs.cryptosdk.core.storage.file.IFileManager;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;
import ru.rt.ebs.cryptosdk.core.verification.ebs.data.a;
import ru.rt.ebs.cryptosdk.core.verification.ebs.data.c;
import ru.rt.ebs.cryptosdk.core.verification.ebs.data.d;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.exceptions.EbsVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.BioSampleType;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.EbsToken;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.Negotiate;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.UploadNegotiateResult;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.VerificationsNegotiateRequest;

/* loaded from: classes4.dex */
public final class qjn implements y2v {
    public final xin a;
    public final u3u b;
    public final IFileManager c;
    public final IKeyStorage d;

    public qjn(xin xinVar, u3u u3uVar, IFileManager iFileManager, IKeyStorage iKeyStorage) {
        this.a = xinVar;
        this.b = u3uVar;
        this.c = iFileManager;
        this.d = iKeyStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, JSONObject jSONObject, MetaData metaData, BioSampleType bioSampleType, String str2, ContinuationImpl continuationImpl) {
        d dVar;
        int i;
        Throwable th;
        Throwable th2;
        FileInputStream fileInputStream;
        JSONArray optJSONArray;
        String str3 = "liveness_action";
        if (continuationImpl instanceof d) {
            dVar = (d) continuationImpl;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
                Object obj = dVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dVar.d;
                if (i != 0) {
                    b.b(obj);
                    FileInputStream fileInputStream2 = new FileInputStream(x2b1.b(this.c, bioSampleType.getFileName(), null, 6));
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        ArrayList i3 = scc.i(new mm40(bioSampleType.getContentName(), bioSampleType.getContentType(), fileInputStream2, bioSampleType.getFileName()));
                        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("liveness_action")) != null) {
                            i3.add(new mm40(str3, new ByteArrayInputStream(optJSONArray.toString().getBytes(uza.a))));
                        }
                        i3.add(new mm40(kju0.j, new ByteArrayInputStream(this.b.h(metaData).getBytes(uza.a))));
                        xin xinVar = this.a;
                        Map e = gw00.e(new Pair("session_id", str));
                        Map e2 = gw00.e(new Pair("Client-Type", "application/vnd.ebs.v1.mobile.android+json"));
                        dVar.a = fileInputStream2;
                        dVar.d = 1;
                        obj = xinVar.Vg(str2, e, e2, i3, dVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        fileInputStream = fileInputStream2;
                        throw th2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileInputStream = dVar.a;
                    try {
                        b.b(obj);
                    } catch (Throwable th5) {
                        th2 = th5;
                        try {
                            throw th2;
                        } catch (Throwable th6) {
                            ooc.g(fileInputStream, th2);
                            throw th6;
                        }
                    }
                }
                ooc.g(fileInputStream, null);
                return obj;
            }
        }
        dVar = new d(this, continuationImpl);
        Object obj2 = dVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dVar.d;
        if (i != 0) {
        }
        ooc.g(fileInputStream, null);
        return obj2;
    }

    public final void b() {
        for (BioSampleType bioSampleType : BioSampleType.values()) {
            String fileName = bioSampleType.getFileName();
            IFileManager iFileManager = this.c;
            iFileManager.rewriteFile(fileName, "");
            iFileManager.deleteFile(bioSampleType.getFileName(), "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Token token, VerificationsNegotiateRequest verificationsNegotiateRequest, ContinuationImpl continuationImpl) {
        a aVar;
        int i;
        JSONArray optJSONArray;
        if (continuationImpl instanceof a) {
            aVar = (a) continuationImpl;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar2.c;
                JSONArray jSONArray = null;
                if (i != 0) {
                    b.b(obj);
                    Map z = g8e.z("session_id", token.getValue());
                    Map z2 = g8e.z("Client-Type", "application/vnd.ebs.v1.mobile.android+json");
                    aVar2.c = 1;
                    obj = this.a.Ug(str, z, z2, verificationsNegotiateRequest, aVar2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                JSONObject jSONObject = (JSONObject) obj;
                pjn pjnVar = new pjn();
                optJSONArray = jSONObject.optJSONArray("liveness_action");
                if (optJSONArray != null) {
                    JSONArray b = fab1.b(optJSONArray, pjnVar);
                    int length = b.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        JSONObject optJSONObject = b.optJSONObject(i3);
                        if (optJSONObject != null) {
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("actions");
                            optJSONObject.put("actions", optJSONArray2 != null ? fab1.b(optJSONArray2, pjnVar) : null);
                        }
                    }
                    jSONArray = b;
                }
                jSONObject.put("liveness_action", jSONArray);
                return new Negotiate(jSONObject);
            }
        }
        aVar = new a(this, continuationImpl);
        a aVar22 = aVar;
        Object obj2 = aVar22.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar22.c;
        JSONArray jSONArray2 = null;
        if (i != 0) {
        }
        JSONObject jSONObject2 = (JSONObject) obj2;
        pjn pjnVar2 = new pjn();
        optJSONArray = jSONObject2.optJSONArray("liveness_action");
        if (optJSONArray != null) {
        }
        jSONObject2.put("liveness_action", jSONArray2);
        return new Negotiate(jSONObject2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Token token, MetaData metaData, Negotiate negotiate, String str, ContinuationImpl continuationImpl) {
        ru.rt.ebs.cryptosdk.core.verification.ebs.data.b bVar;
        int i;
        String b;
        if (continuationImpl instanceof ru.rt.ebs.cryptosdk.core.verification.ebs.data.b) {
            bVar = (ru.rt.ebs.cryptosdk.core.verification.ebs.data.b) continuationImpl;
            int i2 = bVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.c = i2 - Integer.MIN_VALUE;
                ru.rt.ebs.cryptosdk.core.verification.ebs.data.b bVar2 = bVar;
                Object obj = bVar2.a;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar2.c;
                if (i != 0) {
                    b.b(obj);
                    String value = token.getValue();
                    JSONObject negotiate2 = negotiate.getNegotiate();
                    BioSampleType bioSampleType = BioSampleType.VIDEO;
                    bVar2.c = 1;
                    obj = a(value, negotiate2, metaData, bioSampleType, str, bVar2);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                ywu ywuVar = (ywu) obj;
                b = d2b1.b(ywuVar, "Location");
                if (!evu0.J(b)) {
                    throw new EbsVerificationEbsException("Server didn't send the esia verification url");
                }
                String b2 = d2b1.b(ywuVar, "Verification-Token");
                if (evu0.J(b2)) {
                    throw new EbsVerificationEbsException("Server didn't send the verification token");
                }
                String b3 = d2b1.b(ywuVar, "Session-Expires");
                if (evu0.J(b3)) {
                    throw new EbsVerificationEbsException("Server didn't send session expiration time");
                }
                return new UploadNegotiateResult(b, new EbsToken(b2, b3));
            }
        }
        bVar = new ru.rt.ebs.cryptosdk.core.verification.ebs.data.b(this, continuationImpl);
        ru.rt.ebs.cryptosdk.core.verification.ebs.data.b bVar22 = bVar;
        Object obj3 = bVar22.a;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar22.c;
        if (i != 0) {
        }
        ywu ywuVar2 = (ywu) obj3;
        b = d2b1.b(ywuVar2, "Location");
        if (!evu0.J(b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, Token token, MetaData metaData, ContinuationImpl continuationImpl) {
        c cVar;
        int i;
        String b;
        if (continuationImpl instanceof c) {
            cVar = (c) continuationImpl;
            int i2 = cVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.c = i2 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.a;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar2.c;
                if (i != 0) {
                    b.b(obj);
                    String value = token.getValue();
                    BioSampleType bioSampleType = BioSampleType.PHOTO;
                    cVar2.c = 1;
                    obj = a(value, null, metaData, bioSampleType, str, cVar2);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                ywu ywuVar = (ywu) obj;
                b = d2b1.b(ywuVar, "Verification-Token");
                if (!evu0.J(b)) {
                    throw new EbsVerificationEbsException("Server didn't send the verification token");
                }
                String b2 = d2b1.b(ywuVar, "Session-Expires");
                if (evu0.J(b2)) {
                    throw new EbsVerificationEbsException("Server didn't send session expiration time");
                }
                return new EbsToken(b, b2);
            }
        }
        cVar = new c(this, continuationImpl);
        c cVar22 = cVar;
        Object obj3 = cVar22.a;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar22.c;
        if (i != 0) {
        }
        ywu ywuVar2 = (ywu) obj3;
        b = d2b1.b(ywuVar2, "Verification-Token");
        if (!evu0.J(b)) {
        }
    }
}
