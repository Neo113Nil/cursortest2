package io.flutter.plugins.webviewflutter;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.cyt0;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lio/flutter/plugins/webviewflutter/SslErrorType;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "cyt0", "DATE_INVALID", Card.EXPIRED, "ID_MISMATCH", "INVALID", "NOT_YET_VALID", "UNTRUSTED", "UNKNOWN", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SslErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SslErrorType[] $VALUES;
    public static final cyt0 Companion;
    public static final SslErrorType DATE_INVALID;
    public static final SslErrorType EXPIRED;
    public static final SslErrorType ID_MISMATCH;
    public static final SslErrorType INVALID;
    public static final SslErrorType NOT_YET_VALID;
    public static final SslErrorType UNKNOWN;
    public static final SslErrorType UNTRUSTED;
    private final int raw;

    static {
        SslErrorType sslErrorType = new SslErrorType("DATE_INVALID", 0, 0);
        DATE_INVALID = sslErrorType;
        SslErrorType sslErrorType2 = new SslErrorType(Card.EXPIRED, 1, 1);
        EXPIRED = sslErrorType2;
        SslErrorType sslErrorType3 = new SslErrorType("ID_MISMATCH", 2, 2);
        ID_MISMATCH = sslErrorType3;
        SslErrorType sslErrorType4 = new SslErrorType("INVALID", 3, 3);
        INVALID = sslErrorType4;
        SslErrorType sslErrorType5 = new SslErrorType("NOT_YET_VALID", 4, 4);
        NOT_YET_VALID = sslErrorType5;
        SslErrorType sslErrorType6 = new SslErrorType("UNTRUSTED", 5, 5);
        UNTRUSTED = sslErrorType6;
        SslErrorType sslErrorType7 = new SslErrorType("UNKNOWN", 6, 6);
        UNKNOWN = sslErrorType7;
        SslErrorType[] sslErrorTypeArr = {sslErrorType, sslErrorType2, sslErrorType3, sslErrorType4, sslErrorType5, sslErrorType6, sslErrorType7};
        $VALUES = sslErrorTypeArr;
        $ENTRIES = kotlin.enums.a.a(sslErrorTypeArr);
        Companion = new cyt0();
    }

    public SslErrorType(String str, int i, int i2) {
        this.raw = i2;
    }

    public static SslErrorType valueOf(String str) {
        return (SslErrorType) Enum.valueOf(SslErrorType.class, str);
    }

    public static SslErrorType[] values() {
        return (SslErrorType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
