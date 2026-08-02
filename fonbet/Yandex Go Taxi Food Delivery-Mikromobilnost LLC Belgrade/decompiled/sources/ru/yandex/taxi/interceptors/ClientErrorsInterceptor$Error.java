package ru.yandex.taxi.interceptors;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0083\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/interceptors/ClientErrorsInterceptor$Error", "", "Lru/yandex/taxi/interceptors/ClientErrorsInterceptor$Error;", "Companion", "ru/yandex/taxi/interceptors/b", "UNAUTHORIZED", "BLOCKED", "go-client-android.libs:network_utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ClientErrorsInterceptor$Error {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClientErrorsInterceptor$Error[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ClientErrorsInterceptor$Error BLOCKED;
    public static final b Companion;
    public static final ClientErrorsInterceptor$Error UNAUTHORIZED;

    static {
        ClientErrorsInterceptor$Error clientErrorsInterceptor$Error = new ClientErrorsInterceptor$Error("UNAUTHORIZED", 0);
        UNAUTHORIZED = clientErrorsInterceptor$Error;
        ClientErrorsInterceptor$Error clientErrorsInterceptor$Error2 = new ClientErrorsInterceptor$Error("BLOCKED", 1);
        BLOCKED = clientErrorsInterceptor$Error2;
        ClientErrorsInterceptor$Error[] clientErrorsInterceptor$ErrorArr = {clientErrorsInterceptor$Error, clientErrorsInterceptor$Error2};
        $VALUES = clientErrorsInterceptor$ErrorArr;
        $ENTRIES = kotlin.enums.a.a(clientErrorsInterceptor$ErrorArr);
        Companion = new b();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new a(0));
    }

    public static ClientErrorsInterceptor$Error valueOf(String str) {
        return (ClientErrorsInterceptor$Error) Enum.valueOf(ClientErrorsInterceptor$Error.class, str);
    }

    public static ClientErrorsInterceptor$Error[] values() {
        return (ClientErrorsInterceptor$Error[]) $VALUES.clone();
    }
}
