package ru.rt.ebs.cryptosdk.core.network.entities.models.https.request;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/rt/ebs/cryptosdk/core/network/entities/models/https/request/HttpsMethod;", "", "GET", "POST", "OPTIONS", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class HttpsMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HttpsMethod[] $VALUES;
    public static final HttpsMethod GET;
    public static final HttpsMethod OPTIONS;
    public static final HttpsMethod POST;

    static {
        HttpsMethod httpsMethod = new HttpsMethod("GET", 0);
        GET = httpsMethod;
        HttpsMethod httpsMethod2 = new HttpsMethod("POST", 1);
        POST = httpsMethod2;
        HttpsMethod httpsMethod3 = new HttpsMethod("OPTIONS", 2);
        OPTIONS = httpsMethod3;
        HttpsMethod[] httpsMethodArr = {httpsMethod, httpsMethod2, httpsMethod3};
        $VALUES = httpsMethodArr;
        $ENTRIES = a.a(httpsMethodArr);
    }

    public static HttpsMethod valueOf(String str) {
        return (HttpsMethod) Enum.valueOf(HttpsMethod.class, str);
    }

    public static HttpsMethod[] values() {
        return (HttpsMethod[]) $VALUES.clone();
    }
}
