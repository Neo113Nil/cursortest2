package ru.yandex.taxi.persuggest.repository.models;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/persuggest/repository/models/FinalSuggestScreen;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SUPERAPP", "MAIN", "SUMMARY", "FAVORITES", "AFTER_SUMMARY_CLARIFY_POINT", "AFTER_ORDER_CLARIFY_POINT", "ADDRESS_CONFIRMATION", "DEEPLINK", "ADDRESSES_SUFFIX", "ADDRESSES_EDIT_SUFFIX", "UNSUPPORTED", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FinalSuggestScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FinalSuggestScreen[] $VALUES;
    public static final FinalSuggestScreen ADDRESSES_EDIT_SUFFIX;
    public static final FinalSuggestScreen ADDRESSES_SUFFIX;
    public static final FinalSuggestScreen ADDRESS_CONFIRMATION;
    public static final FinalSuggestScreen AFTER_ORDER_CLARIFY_POINT;
    public static final FinalSuggestScreen AFTER_SUMMARY_CLARIFY_POINT;
    public static final FinalSuggestScreen DEEPLINK;
    public static final FinalSuggestScreen FAVORITES;
    public static final FinalSuggestScreen MAIN;
    public static final FinalSuggestScreen SUMMARY;
    public static final FinalSuggestScreen SUPERAPP;
    public static final FinalSuggestScreen UNSUPPORTED;
    private final String value;

    static {
        FinalSuggestScreen finalSuggestScreen = new FinalSuggestScreen("SUPERAPP", 0, "superapp");
        SUPERAPP = finalSuggestScreen;
        FinalSuggestScreen finalSuggestScreen2 = new FinalSuggestScreen("MAIN", 1, "main");
        MAIN = finalSuggestScreen2;
        FinalSuggestScreen finalSuggestScreen3 = new FinalSuggestScreen("SUMMARY", 2, "summary");
        SUMMARY = finalSuggestScreen3;
        FinalSuggestScreen finalSuggestScreen4 = new FinalSuggestScreen("FAVORITES", 3, "favorites.addresses.edit");
        FAVORITES = finalSuggestScreen4;
        FinalSuggestScreen finalSuggestScreen5 = new FinalSuggestScreen("AFTER_SUMMARY_CLARIFY_POINT", 4, "after_summary_clarify_point");
        AFTER_SUMMARY_CLARIFY_POINT = finalSuggestScreen5;
        FinalSuggestScreen finalSuggestScreen6 = new FinalSuggestScreen("AFTER_ORDER_CLARIFY_POINT", 5, "after_order_clarify_point");
        AFTER_ORDER_CLARIFY_POINT = finalSuggestScreen6;
        FinalSuggestScreen finalSuggestScreen7 = new FinalSuggestScreen("ADDRESS_CONFIRMATION", 6, "address_confirmation");
        ADDRESS_CONFIRMATION = finalSuggestScreen7;
        FinalSuggestScreen finalSuggestScreen8 = new FinalSuggestScreen("DEEPLINK", 7, Constants.DEEPLINK);
        DEEPLINK = finalSuggestScreen8;
        FinalSuggestScreen finalSuggestScreen9 = new FinalSuggestScreen("ADDRESSES_SUFFIX", 8, ".addresses");
        ADDRESSES_SUFFIX = finalSuggestScreen9;
        FinalSuggestScreen finalSuggestScreen10 = new FinalSuggestScreen("ADDRESSES_EDIT_SUFFIX", 9, ".addresses.edit");
        ADDRESSES_EDIT_SUFFIX = finalSuggestScreen10;
        FinalSuggestScreen finalSuggestScreen11 = new FinalSuggestScreen("UNSUPPORTED", 10, "unsupported");
        UNSUPPORTED = finalSuggestScreen11;
        FinalSuggestScreen[] finalSuggestScreenArr = {finalSuggestScreen, finalSuggestScreen2, finalSuggestScreen3, finalSuggestScreen4, finalSuggestScreen5, finalSuggestScreen6, finalSuggestScreen7, finalSuggestScreen8, finalSuggestScreen9, finalSuggestScreen10, finalSuggestScreen11};
        $VALUES = finalSuggestScreenArr;
        $ENTRIES = a.a(finalSuggestScreenArr);
    }

    public FinalSuggestScreen(String str, int i, String str2) {
        this.value = str2;
    }

    public static FinalSuggestScreen valueOf(String str) {
        return (FinalSuggestScreen) Enum.valueOf(FinalSuggestScreen.class, str);
    }

    public static FinalSuggestScreen[] values() {
        return (FinalSuggestScreen[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
