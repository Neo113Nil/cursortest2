package ru.kinopoisk.sdk.easylogin.internal.impl;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.squareup.anvil.annotations.ContributesBinding;
import defpackage.ern;
import defpackage.lm4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1082i9;
import ru.kinopoisk.sdk.easylogin.internal.C1201r3;
import ru.kinopoisk.sdk.easylogin.internal.I;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1184q;
import ru.kinopoisk.sdk.easylogin.internal.J;
import ru.kinopoisk.sdk.easylogin.internal.M4;

@ContributesBinding(scope = J.class)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0007J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/AnalyticsErrorMapperImpl;", "Lru/kinopoisk/sdk/easylogin/internal/q;", "<init>", "()V", "", "", "extractTitle", "(Ljava/lang/Throwable;)Ljava/lang/String;", "throwable", "Lru/kinopoisk/sdk/easylogin/internal/r3$a;", "getErrorType", "(Ljava/lang/Throwable;)Lru/kinopoisk/sdk/easylogin/internal/r3$a;", "Lru/kinopoisk/sdk/easylogin/internal/r3$f;", "getSelectionErrorType", "(Ljava/lang/Throwable;)Lru/kinopoisk/sdk/easylogin/internal/r3$f;", "Lru/kinopoisk/sdk/easylogin/internal/r3$e;", "getCastErrorType", "(Ljava/lang/Throwable;)Lru/kinopoisk/sdk/easylogin/internal/r3$e;", "Lru/kinopoisk/sdk/easylogin/internal/r3$b;", "getPlayerErrorType", "(Ljava/lang/Throwable;)Lru/kinopoisk/sdk/easylogin/internal/r3$b;", "getErrorTitle", "getErrorMessage", "getRequestId", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class AnalyticsErrorMapperImpl implements InterfaceC1184q {

    @NotNull
    public static final AnalyticsErrorMapperImpl INSTANCE = new AnalyticsErrorMapperImpl();

    private AnalyticsErrorMapperImpl() {
    }

    @NotNull
    public final String extractTitle(@NotNull Throwable th) {
        String extractTitle;
        th.getClass();
        Throwable cause = th.getCause();
        if (cause != null && (extractTitle = extractTitle(cause)) != null) {
            return extractTitle;
        }
        if (th instanceof I) {
            return null;
        }
        lm4 a = ern.a(th.getClass());
        String f = a.f();
        if (f != null) {
            int length = f.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (Character.isUpperCase(f.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                return f.substring(i);
            }
            String h = a.h();
            if (h != null) {
                return h;
            }
        }
        return "";
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1184q
    @NotNull
    public C1201r3.e getCastErrorType(@NotNull Throwable throwable) {
        throwable.getClass();
        return C1201r3.e.AppError;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1184q
    @NotNull
    public String getErrorMessage(@NotNull Throwable throwable) {
        throwable.getClass();
        throwable.getClass();
        return C1082i9.a(new StringBuilder(), throwable, "", 0).toString();
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1184q
    @NotNull
    public String getErrorTitle(@NotNull Throwable throwable) {
        throwable.getClass();
        return extractTitle(throwable);
    }

    @NotNull
    public C1201r3.a getErrorType(@NotNull Throwable throwable) {
        throwable.getClass();
        return C1201r3.a.AppError;
    }

    @NotNull
    public C1201r3.b getPlayerErrorType(@NotNull Throwable throwable) {
        throwable.getClass();
        return C1201r3.b.Unknown;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public String getRequestId(@NotNull Throwable throwable) {
        throwable.getClass();
        throwable.getClass();
        while (!(throwable instanceof M4)) {
            throwable = throwable.getCause();
            if (throwable == 0) {
                return "";
            }
        }
        ((M4) throwable).getClass();
        return "";
    }

    @NotNull
    public C1201r3.f getSelectionErrorType(@NotNull Throwable throwable) {
        throwable.getClass();
        return C1201r3.f.AppError;
    }
}
