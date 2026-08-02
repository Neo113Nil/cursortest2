package ru.kinopoisk.sdk.easylogin.api;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.j66;
import defpackage.qdb;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/kinopoisk/sdk/easylogin/api/EasyLoginMode;", "", "(Ljava/lang/String;I)V", "StartWithConfirmation", "ContinueWithConfirmation", "FastConnection", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class EasyLoginMode {
    private static final /* synthetic */ qdb $ENTRIES;
    private static final /* synthetic */ EasyLoginMode[] $VALUES;
    public static final EasyLoginMode StartWithConfirmation = new EasyLoginMode("StartWithConfirmation", 0);
    public static final EasyLoginMode ContinueWithConfirmation = new EasyLoginMode("ContinueWithConfirmation", 1);
    public static final EasyLoginMode FastConnection = new EasyLoginMode("FastConnection", 2);

    private static final /* synthetic */ EasyLoginMode[] $values() {
        return new EasyLoginMode[]{StartWithConfirmation, ContinueWithConfirmation, FastConnection};
    }

    static {
        EasyLoginMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = j66.Q($values);
    }

    private EasyLoginMode(String str, int i) {
    }

    @NotNull
    public static qdb getEntries() {
        return $ENTRIES;
    }

    public static EasyLoginMode valueOf(String str) {
        return (EasyLoginMode) Enum.valueOf(EasyLoginMode.class, str);
    }

    public static EasyLoginMode[] values() {
        return (EasyLoginMode[]) $VALUES.clone();
    }
}
