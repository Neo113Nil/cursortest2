package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.uah;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/u3;", "", "android_analytics_evgen_mobileevgen"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.u3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1243u3 {

    @NotNull
    public final Map<String, Object> a;

    public C1243u3(A7 a7, X2 x2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 4) != 0 ? "" : str;
        a7.getClass();
        x2.getClass();
        str.getClass();
        this.a = uah.e(new Pair("paymentMethod", a7.a), new Pair("distribution", x2.a), new Pair("yandexPlayerVersion", str));
    }
}
