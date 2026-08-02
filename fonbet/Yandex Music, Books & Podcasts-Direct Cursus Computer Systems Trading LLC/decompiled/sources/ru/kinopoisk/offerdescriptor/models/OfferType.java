package ru.kinopoisk.offerdescriptor.models;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.j66;
import defpackage.qdb;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/kinopoisk/offerdescriptor/models/OfferType;", "", "(Ljava/lang/String;I)V", "OPTION", "TARIFF", "COMPOSITE", "FALLBACK", "ANY", "android_billing_offerdescriptor_core"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class OfferType {
    private static final /* synthetic */ qdb $ENTRIES;
    private static final /* synthetic */ OfferType[] $VALUES;
    public static final OfferType OPTION = new OfferType("OPTION", 0);
    public static final OfferType TARIFF = new OfferType("TARIFF", 1);
    public static final OfferType COMPOSITE = new OfferType("COMPOSITE", 2);
    public static final OfferType FALLBACK = new OfferType("FALLBACK", 3);
    public static final OfferType ANY = new OfferType("ANY", 4);

    private static final /* synthetic */ OfferType[] $values() {
        return new OfferType[]{OPTION, TARIFF, COMPOSITE, FALLBACK, ANY};
    }

    static {
        OfferType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = j66.Q($values);
    }

    private OfferType(String str, int i) {
    }

    @NotNull
    public static qdb getEntries() {
        return $ENTRIES;
    }

    public static OfferType valueOf(String str) {
        return (OfferType) Enum.valueOf(OfferType.class, str);
    }

    public static OfferType[] values() {
        return (OfferType[]) $VALUES.clone();
    }
}
