package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/X4;", "Lru/kinopoisk/sdk/easylogin/internal/wb;", "android_cast_connectivitymobile_core"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class X4 extends AbstractC1277wb {
    public final String c;
    public final Throwable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X4(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        super(null, null, 3, null);
        str = (i & 1) != 0 ? null : str;
        th = (i & 2) != 0 ? null : th;
        this.c = str;
        this.d = th;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.AbstractC1277wb, java.lang.Throwable
    /* renamed from: getCause */
    public final Throwable getB() {
        return this.d;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.AbstractC1277wb, java.lang.Throwable
    /* renamed from: getMessage */
    public final String getA() {
        return this.c;
    }
}
