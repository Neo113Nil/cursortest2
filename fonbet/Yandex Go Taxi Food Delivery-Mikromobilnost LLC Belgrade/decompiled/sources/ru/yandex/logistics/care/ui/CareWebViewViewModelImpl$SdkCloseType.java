package ru.yandex.logistics.care.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/logistics/care/ui/CareWebViewViewModelImpl$SdkCloseType", "", "Lru/yandex/logistics/care/ui/CareWebViewViewModelImpl$SdkCloseType;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NATIVE_BUTTON", "JS_SIGNAL", "sdk-care"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CareWebViewViewModelImpl$SdkCloseType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CareWebViewViewModelImpl$SdkCloseType[] $VALUES;
    public static final CareWebViewViewModelImpl$SdkCloseType JS_SIGNAL;
    public static final CareWebViewViewModelImpl$SdkCloseType NATIVE_BUTTON;
    private final String value;

    static {
        CareWebViewViewModelImpl$SdkCloseType careWebViewViewModelImpl$SdkCloseType = new CareWebViewViewModelImpl$SdkCloseType("NATIVE_BUTTON", 0, "native_button");
        NATIVE_BUTTON = careWebViewViewModelImpl$SdkCloseType;
        CareWebViewViewModelImpl$SdkCloseType careWebViewViewModelImpl$SdkCloseType2 = new CareWebViewViewModelImpl$SdkCloseType("JS_SIGNAL", 1, "js_signal");
        JS_SIGNAL = careWebViewViewModelImpl$SdkCloseType2;
        CareWebViewViewModelImpl$SdkCloseType[] careWebViewViewModelImpl$SdkCloseTypeArr = {careWebViewViewModelImpl$SdkCloseType, careWebViewViewModelImpl$SdkCloseType2};
        $VALUES = careWebViewViewModelImpl$SdkCloseTypeArr;
        $ENTRIES = kotlin.enums.a.a(careWebViewViewModelImpl$SdkCloseTypeArr);
    }

    public CareWebViewViewModelImpl$SdkCloseType(String str, int i, String str2) {
        this.value = str2;
    }

    public static CareWebViewViewModelImpl$SdkCloseType valueOf(String str) {
        return (CareWebViewViewModelImpl$SdkCloseType) Enum.valueOf(CareWebViewViewModelImpl$SdkCloseType.class, str);
    }

    public static CareWebViewViewModelImpl$SdkCloseType[] values() {
        return (CareWebViewViewModelImpl$SdkCloseType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
