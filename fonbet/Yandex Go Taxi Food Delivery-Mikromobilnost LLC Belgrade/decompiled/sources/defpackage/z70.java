package defpackage;

import android.net.Uri;
import com.yandex.passport.internal.social.esia.EsiaBindWebClient;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.network.entities.models.https.request.HttpsMethod;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;
import ru.rt.ebs.cryptosdk.core.verification.adapter.data.a;
import ru.rt.ebs.cryptosdk.core.verification.adapter.data.c;
import ru.rt.ebs.cryptosdk.core.verification.adapter.data.d;
import ru.rt.ebs.cryptosdk.core.verification.adapter.data.e;
import ru.rt.ebs.cryptosdk.core.verification.adapter.entities.exceptions.AdapterVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.adapter.entities.models.EsiaAuthenticationUrl;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.EbsToken;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes4.dex */
public final class z70 {
    public final c70 a;
    public final IKeyStorage b;
    public final Set c;

    public z70(c70 c70Var, IKeyStorage iKeyStorage, Set set) {
        this.a = c70Var;
        this.b = iKeyStorage;
        this.c = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        a aVar;
        int i;
        Uri parse;
        if (continuationImpl instanceof a) {
            aVar = (a) continuationImpl;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
                Object obj = aVar.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.e;
                if (i != 0) {
                    b.b(obj);
                    String string = this.b.getString("adapter.esia_authentication_cookie", "");
                    aVar.a = this;
                    aVar.b = str;
                    aVar.e = 1;
                    obj = this.a.Ug(str, string, aVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = aVar.b;
                    this = aVar.a;
                    b.b(obj);
                }
                String obj2 = evu0.k0(d2b1.b((ywu) obj, "Location")).toString();
                parse = Uri.parse(obj2);
                if (juf0.c(parse, this.c)) {
                    throw new AdapterVerificationEbsException("Incorrect service address");
                }
                String queryParameter = parse.getQueryParameter("session_id");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                if (evu0.J(queryParameter)) {
                    throw new AdapterVerificationEbsException("Vrf session empty exception");
                }
                String queryParameter2 = Uri.parse(str).getQueryParameter(ClidProvider.STATE);
                if (evu0.J(queryParameter2 != null ? queryParameter2 : "")) {
                    throw new AdapterVerificationEbsException("Vrf state empty exception");
                }
                return new sjn(URI.create(obj2), new Token(queryParameter));
            }
        }
        aVar = new a(this, continuationImpl);
        Object obj3 = aVar.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.e;
        if (i != 0) {
        }
        String obj22 = evu0.k0(d2b1.b((ywu) obj3, "Location")).toString();
        parse = Uri.parse(obj22);
        if (juf0.c(parse, this.c)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        ru.rt.ebs.cryptosdk.core.verification.adapter.data.b bVar;
        int i;
        Uri parse;
        if (continuationImpl instanceof ru.rt.ebs.cryptosdk.core.verification.adapter.data.b) {
            bVar = (ru.rt.ebs.cryptosdk.core.verification.adapter.data.b) continuationImpl;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
                Object obj = bVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.d;
                if (i != 0) {
                    b.b(obj);
                    bVar.a = this;
                    bVar.d = 1;
                    obj = this.a.Ug(str, str2, bVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = bVar.a;
                    b.b(obj);
                }
                this.getClass();
                String obj2 = evu0.k0(d2b1.b((ywu) obj, "Location")).toString();
                parse = Uri.parse(obj2);
                if (juf0.c(parse, this.c)) {
                    throw new AdapterVerificationEbsException("Incorrect service address");
                }
                String queryParameter = parse.getQueryParameter(EsiaBindWebClient.REDIRECT_PARAM_NAME);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                if (evu0.J(queryParameter)) {
                    throw new AdapterVerificationEbsException("Esia redirect empty URL exception");
                }
                return new EsiaAuthenticationUrl(obj2, queryParameter);
            }
        }
        bVar = new ru.rt.ebs.cryptosdk.core.verification.adapter.data.b(this, continuationImpl);
        Object obj3 = bVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.d;
        if (i != 0) {
        }
        this.getClass();
        String obj22 = evu0.k0(d2b1.b((ywu) obj3, "Location")).toString();
        parse = Uri.parse(obj22);
        if (juf0.c(parse, this.c)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        c cVar;
        int i;
        String queryParameter;
        if (continuationImpl instanceof c) {
            cVar = (c) continuationImpl;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
                Object obj = cVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.d;
                if (i != 0) {
                    b.b(obj);
                    cVar.a = this;
                    cVar.d = 1;
                    obj = this.a.Ug(str, str2, cVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = cVar.a;
                    b.b(obj);
                }
                this.getClass();
                queryParameter = Uri.parse(evu0.k0(d2b1.b((ywu) obj, "Location")).toString()).getQueryParameter("res_secret");
                if (queryParameter != null || queryParameter.length() == 0) {
                    throw new AdapterVerificationEbsException("Res secret empty exception");
                }
                return new Token(queryParameter);
            }
        }
        cVar = new c(this, continuationImpl);
        Object obj2 = cVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.d;
        if (i != 0) {
        }
        this.getClass();
        queryParameter = Uri.parse(evu0.k0(d2b1.b((ywu) obj2, "Location")).toString()).getQueryParameter("res_secret");
        if (queryParameter != null) {
        }
        throw new AdapterVerificationEbsException("Res secret empty exception");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Token token, EbsToken ebsToken, String str, ContinuationImpl continuationImpl) {
        d dVar;
        int i;
        String queryParameter;
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
                    Map i3 = kotlin.collections.b.i(new Pair("verify_token", ebsToken.getVerificationToken()), new Pair("expired", ebsToken.getTokenExpires()), new Pair("sid", token.getValue()));
                    Map z = g8e.z("Cookie", String.format("adapter=%s", Arrays.copyOf(new Object[]{str}, 1)));
                    dVar.a = this;
                    dVar.d = 1;
                    HttpsMethod httpsMethod = HttpsMethod.GET;
                    zwu zwuVar = new zwu("vrf/result");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : i3.entrySet()) {
                        linkedHashMap2.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (!z.isEmpty()) {
                        Collection values = z.values();
                        if (!(values instanceof Collection) || !values.isEmpty()) {
                            Iterator it = values.iterator();
                            while (it.hasNext()) {
                                if (((String) it.next()).length() <= 0) {
                                    break;
                                }
                            }
                        }
                        for (Map.Entry entry2 : z.entrySet()) {
                            linkedHashMap3.put((String) entry2.getKey(), Collections.singletonList((String) entry2.getValue()));
                        }
                    }
                    obj = ((qwu) this.a.b).d(new xwu(httpsMethod, zwuVar, linkedHashMap, linkedHashMap2, linkedHashMap3, null, arrayList), dVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = dVar.a;
                    b.b(obj);
                }
                this.getClass();
                queryParameter = Uri.parse(evu0.k0(d2b1.b((ywu) obj, "Location")).toString()).getQueryParameter("res_secret");
                if (queryParameter != null || queryParameter.length() == 0) {
                    throw new AdapterVerificationEbsException("Res secret empty exception");
                }
                return new Token(queryParameter);
            }
        }
        dVar = new d(this, continuationImpl);
        Object obj2 = dVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dVar.d;
        if (i != 0) {
        }
        this.getClass();
        queryParameter = Uri.parse(evu0.k0(d2b1.b((ywu) obj2, "Location")).toString()).getQueryParameter("res_secret");
        if (queryParameter != null) {
        }
        throw new AdapterVerificationEbsException("Res secret empty exception");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Token token, ContinuationImpl continuationImpl) {
        e eVar;
        int i;
        Uri parse;
        if (continuationImpl instanceof e) {
            eVar = (e) continuationImpl;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
                Object obj = eVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eVar.d;
                if (i != 0) {
                    b.b(obj);
                    String value = token.getValue();
                    eVar.a = this;
                    eVar.d = 1;
                    HttpsMethod httpsMethod = HttpsMethod.GET;
                    zwu zwuVar = new zwu("public/authentication");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    ArrayList arrayList = new ArrayList();
                    linkedHashMap2.put("sid", value);
                    obj = ((qwu) this.a.b).d(new xwu(httpsMethod, zwuVar, linkedHashMap, linkedHashMap2, linkedHashMap3, null, arrayList), eVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = eVar.a;
                    b.b(obj);
                }
                ywu ywuVar = (ywu) obj;
                this.getClass();
                String obj2 = evu0.k0(d2b1.b(ywuVar, "Location")).toString();
                parse = Uri.parse(obj2);
                if (juf0.c(parse, this.c)) {
                    throw new AdapterVerificationEbsException("Incorrect service address");
                }
                String queryParameter = parse.getQueryParameter(EsiaBindWebClient.REDIRECT_PARAM_NAME);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                if (evu0.J(queryParameter)) {
                    throw new AdapterVerificationEbsException("Esia redirect empty URL exception");
                }
                EsiaAuthenticationUrl esiaAuthenticationUrl = new EsiaAuthenticationUrl(obj2, queryParameter);
                List list = (List) ywuVar.b.get("Set-Cookie");
                if (list == null) {
                    list = EmptyList.a;
                }
                return new hbo(esiaAuthenticationUrl, list);
            }
        }
        eVar = new e(this, continuationImpl);
        Object obj3 = eVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eVar.d;
        if (i != 0) {
        }
        ywu ywuVar2 = (ywu) obj3;
        this.getClass();
        String obj22 = evu0.k0(d2b1.b(ywuVar2, "Location")).toString();
        parse = Uri.parse(obj22);
        if (juf0.c(parse, this.c)) {
        }
    }
}
