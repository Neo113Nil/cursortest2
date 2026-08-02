package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.NetcastTVService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1201r3 {

    @NotNull
    public final InterfaceC1269w3 a;

    @NotNull
    public final InterfaceC1229t3 b;

    @NotNull
    public final InterfaceC1256v3 c;

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r3$a */
    public enum a {
        AppError,
        /* JADX INFO: Fake field, exist only in values array */
        NetworkError,
        /* JADX INFO: Fake field, exist only in values array */
        ParserError,
        /* JADX INFO: Fake field, exist only in values array */
        BackendError
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r3$b */
    public enum b {
        /* JADX INFO: Fake field, exist only in values array */
        Drm,
        /* JADX INFO: Fake field, exist only in values array */
        DrmProxy,
        /* JADX INFO: Fake field, exist only in values array */
        Playback,
        /* JADX INFO: Fake field, exist only in values array */
        Preparing,
        /* JADX INFO: Fake field, exist only in values array */
        Audio,
        /* JADX INFO: Fake field, exist only in values array */
        Connection,
        /* JADX INFO: Fake field, exist only in values array */
        Communication,
        /* JADX INFO: Fake field, exist only in values array */
        WatchRejection,
        /* JADX INFO: Fake field, exist only in values array */
        Authorization,
        Unknown
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r3$c */
    public static final class c {
        public static final c a;
        public static final /* synthetic */ c[] b;

        static {
            c cVar = new c();
            a = cVar;
            b = new c[]{cVar};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) b.clone();
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r3$d */
    public enum d {
        /* JADX INFO: Fake field, exist only in values array */
        AirPlay("air_play"),
        GoogleCast("google_cast"),
        Quasar("quasar"),
        /* JADX INFO: Fake field, exist only in values array */
        Miracast("miracast"),
        SmartView("smart_view"),
        LgCast("lg_cast"),
        KinopoiskCast("kinopoisk_cast");


        @NotNull
        public final String a;

        d(String str) {
            this.a = str;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r3$e */
    public enum e {
        AppError("app_error"),
        /* JADX INFO: Fake field, exist only in values array */
        NetworkError("network_error"),
        /* JADX INFO: Fake field, exist only in values array */
        ParserError("parser_error"),
        /* JADX INFO: Fake field, exist only in values array */
        BackendError("backend_error"),
        /* JADX INFO: Fake field, exist only in values array */
        ReceiverError("receiver_error");


        @NotNull
        public final String a;

        e(String str) {
            this.a = str;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r3$f */
    public enum f {
        AppError,
        /* JADX INFO: Fake field, exist only in values array */
        NetworkError,
        /* JADX INFO: Fake field, exist only in values array */
        ParserError,
        /* JADX INFO: Fake field, exist only in values array */
        BackendError,
        /* JADX INFO: Fake field, exist only in values array */
        EmptySelection
    }

    public C1201r3(@NotNull InterfaceC1269w3 interfaceC1269w3, @NotNull InterfaceC1229t3 interfaceC1229t3, @NotNull InterfaceC1256v3 interfaceC1256v3) {
        interfaceC1269w3.getClass();
        interfaceC1229t3.getClass();
        interfaceC1256v3.getClass();
        this.a = interfaceC1269w3;
        this.b = interfaceC1229t3;
        this.c = interfaceC1256v3;
    }

    public final void a(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        hashMap.putAll(this.b.getGlobalParams().a);
        hashMap.putAll(this.c.getPlatformParams().a);
        this.a.trackEvent(str, hashMap);
    }

    public static HashMap a(int i, HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", Integer.valueOf(i));
        hashMap2.put(NetcastTVService.UDAP_API_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }
}
