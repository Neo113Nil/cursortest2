package ru.kinopoisk.sdk.easylogin.internal.impl;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.j66;
import defpackage.qdb;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/Lang;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "En", "Ar", "Ru", "NotSupported", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class Lang {
    private static final /* synthetic */ qdb $ENTRIES;
    private static final /* synthetic */ Lang[] $VALUES;

    @NotNull
    private final String eventValue;
    public static final Lang En = new Lang("En", 0, "en");
    public static final Lang Ar = new Lang("Ar", 1, "ar");
    public static final Lang Ru = new Lang("Ru", 2, "ru");
    public static final Lang NotSupported = new Lang("NotSupported", 3, "not_supported");

    private static final /* synthetic */ Lang[] $values() {
        return new Lang[]{En, Ar, Ru, NotSupported};
    }

    static {
        Lang[] $values = $values();
        $VALUES = $values;
        $ENTRIES = j66.Q($values);
    }

    private Lang(String str, int i, String str2) {
        this.eventValue = str2;
    }

    @NotNull
    public static qdb getEntries() {
        return $ENTRIES;
    }

    public static Lang valueOf(String str) {
        return (Lang) Enum.valueOf(Lang.class, str);
    }

    public static Lang[] values() {
        return (Lang[]) $VALUES.clone();
    }

    @NotNull
    public final String getEventValue() {
        return this.eventValue;
    }
}
