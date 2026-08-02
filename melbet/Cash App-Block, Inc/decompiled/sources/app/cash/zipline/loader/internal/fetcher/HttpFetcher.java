package app.cash.zipline.loader.internal.fetcher;

import app.cash.zipline.EventListener;
import app.cash.zipline.ZiplineManifest;
import app.cash.zipline.internal.SerializersKt;
import app.cash.zipline.loader.ZiplineHttpClient;
import app.cash.zipline.loader.internal.InternalJniKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzf;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonImpl;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.WriteModeKt;
import okhttp3.HttpUrl;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class HttpFetcher implements Fetcher {
    public static final EmptyList MANIFEST_REQUEST_HEADERS = EmptyList.INSTANCE;
    public static final List ZIPLINE_REQUEST_HEADERS = CollectionsKt__CollectionsJVMKt.listOf(new Pair("Cache-Control", "no-store"));
    public final ZiplineHttpClient httpClient;

    public HttpFetcher(ZiplineHttpClient ziplineHttpClient) {
        this.httpClient = ziplineHttpClient;
    }

    public static JsonObject withBaseUrl$zipline_loader_release(String str, JsonElement jsonElement) {
        jsonElement.getClass();
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(JsonElementKt.getJsonObject(jsonElement));
        JsonElement jsonElement2 = (JsonElement) linkedHashMap.remove("unsigned");
        LinkedHashMap linkedHashMap2 = jsonElement2 != null ? new LinkedHashMap(JsonElementKt.getJsonObject(jsonElement2)) : new LinkedHashMap();
        linkedHashMap2.remove("baseUrl");
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("baseUrl", JsonElementKt.JsonPrimitive(str));
        linkedHashMap3.putAll(linkedHashMap2);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("unsigned", new JsonObject(linkedHashMap3));
        linkedHashMap4.putAll(linkedHashMap);
        return new JsonObject(linkedHashMap4);
    }

    @Override // app.cash.zipline.loader.internal.fetcher.Fetcher
    public final Object fetch(String str, EventListener eventListener, String str2, ByteString byteString, long j, String str3, String str4, ContinuationImpl continuationImpl) {
        return fetchByteString(str, eventListener, str3, str4, ZIPLINE_REQUEST_HEADERS, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchByteString(String str, EventListener eventListener, String str2, String str3, List list, ContinuationImpl continuationImpl) {
        HttpFetcher$fetchByteString$1 httpFetcher$fetchByteString$1;
        int i;
        Exception e;
        Object obj;
        try {
            if (continuationImpl instanceof HttpFetcher$fetchByteString$1) {
                httpFetcher$fetchByteString$1 = (HttpFetcher$fetchByteString$1) continuationImpl;
                int i2 = httpFetcher$fetchByteString$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    httpFetcher$fetchByteString$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = httpFetcher$fetchByteString$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = httpFetcher$fetchByteString$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        if (str2 != null) {
                            zzf zzfVar = InternalJniKt.ecdsaP256;
                            str3.getClass();
                            HttpUrl.Builder builder = new HttpUrl.Builder();
                            builder.parse$okhttp(null, str2);
                            HttpUrl resolve = builder.build().resolve(str3);
                            resolve.getClass();
                            str3 = resolve.url;
                        }
                        Object downloadStart = eventListener.downloadStart(str, str3);
                        try {
                            ZiplineHttpClient ziplineHttpClient = this.httpClient;
                            httpFetcher$fetchByteString$1.L$0 = str;
                            httpFetcher$fetchByteString$1.L$1 = eventListener;
                            httpFetcher$fetchByteString$1.L$5 = str3;
                            httpFetcher$fetchByteString$1.L$6 = downloadStart;
                            httpFetcher$fetchByteString$1.label = 1;
                            obj2 = ziplineHttpClient.download(str3, list, httpFetcher$fetchByteString$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj = downloadStart;
                        } catch (Exception e2) {
                            e = e2;
                            obj = downloadStart;
                            eventListener.downloadFailed(str, str3, e, obj);
                            throw e;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = httpFetcher$fetchByteString$1.L$6;
                        String str4 = httpFetcher$fetchByteString$1.L$5;
                        eventListener = httpFetcher$fetchByteString$1.L$1;
                        String str5 = httpFetcher$fetchByteString$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj2);
                            str3 = str4;
                            str = str5;
                        } catch (Exception e3) {
                            str3 = str4;
                            str = str5;
                            e = e3;
                            eventListener.downloadFailed(str, str3, e, obj);
                            throw e;
                        }
                    }
                    ByteString byteString = (ByteString) obj2;
                    eventListener.downloadEnd(str, str3, obj);
                    return byteString;
                }
            }
            ByteString byteString2 = (ByteString) obj2;
            eventListener.downloadEnd(str, str3, obj);
            return byteString2;
        } catch (Exception e4) {
            e = e4;
            eventListener.downloadFailed(str, str3, e, obj);
            throw e;
        }
        httpFetcher$fetchByteString$1 = new HttpFetcher$fetchByteString$1(this, continuationImpl);
        Object obj22 = httpFetcher$fetchByteString$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = httpFetcher$fetchByteString$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchManifest(String str, EventListener eventListener, String str2, long j, ContinuationImpl continuationImpl) {
        HttpFetcher$fetchManifest$1 httpFetcher$fetchManifest$1;
        int i;
        String str3;
        EventListener eventListener2;
        String str4;
        String utf8;
        if (continuationImpl instanceof HttpFetcher$fetchManifest$1) {
            httpFetcher$fetchManifest$1 = (HttpFetcher$fetchManifest$1) continuationImpl;
            int i2 = httpFetcher$fetchManifest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                httpFetcher$fetchManifest$1.label = i2 - PKIFailureInfo.systemUnavail;
                HttpFetcher$fetchManifest$1 httpFetcher$fetchManifest$12 = httpFetcher$fetchManifest$1;
                Object obj = httpFetcher$fetchManifest$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = httpFetcher$fetchManifest$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    httpFetcher$fetchManifest$12.L$0 = str;
                    httpFetcher$fetchManifest$12.L$1 = eventListener;
                    httpFetcher$fetchManifest$12.L$2 = str2;
                    httpFetcher$fetchManifest$12.J$0 = j;
                    httpFetcher$fetchManifest$12.label = 1;
                    obj = fetchByteString(str, eventListener, null, str2, MANIFEST_REQUEST_HEADERS, httpFetcher$fetchManifest$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                    str3 = str;
                    eventListener2 = eventListener;
                    str4 = str2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = httpFetcher$fetchManifest$12.J$0;
                    str4 = httpFetcher$fetchManifest$12.L$2;
                    eventListener2 = httpFetcher$fetchManifest$12.L$1;
                    str3 = httpFetcher$fetchManifest$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                utf8 = ((ByteString) obj).utf8();
                if (utf8.length() <= 655360) {
                    Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(utf8.length(), "manifest larger than 655360: "));
                    return null;
                }
                try {
                    Json.Default r15 = Json.Default;
                    r15.getClass();
                    JsonObject withBaseUrl$zipline_loader_release = withBaseUrl$zipline_loader_release(str4, (JsonElement) r15.decodeFromString(utf8, JsonElementSerializer.INSTANCE));
                    String encodeToString = r15.encodeToString(JsonElement.Companion.serializer(), withBaseUrl$zipline_loader_release);
                    ByteString.Companion companion = ByteString.Companion;
                    ByteString encodeUtf8 = ByteString.Companion.encodeUtf8(encodeToString);
                    JsonImpl jsonImpl = SerializersKt.jsonForManifest;
                    jsonImpl.getClass();
                    KSerializer serializer = ZiplineManifest.Companion.serializer();
                    serializer.getClass();
                    return new LoadedManifest(encodeUtf8, (ZiplineManifest) WriteModeKt.readJson(jsonImpl, withBaseUrl$zipline_loader_release, serializer), j);
                } catch (Exception e) {
                    eventListener2.manifestParseFailed(e, str3);
                    throw e;
                }
            }
        }
        httpFetcher$fetchManifest$1 = new HttpFetcher$fetchManifest$1(this, continuationImpl);
        HttpFetcher$fetchManifest$1 httpFetcher$fetchManifest$122 = httpFetcher$fetchManifest$1;
        Object obj3 = httpFetcher$fetchManifest$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = httpFetcher$fetchManifest$122.label;
        if (i != 0) {
        }
        utf8 = ((ByteString) obj3).utf8();
        if (utf8.length() <= 655360) {
        }
    }
}
