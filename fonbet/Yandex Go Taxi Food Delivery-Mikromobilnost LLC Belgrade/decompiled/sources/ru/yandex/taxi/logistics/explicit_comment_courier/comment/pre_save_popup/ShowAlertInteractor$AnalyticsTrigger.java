package ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/ShowAlertInteractor$AnalyticsTrigger", "", "Lru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/ShowAlertInteractor$AnalyticsTrigger;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SUMMARY", "DETAILS", "explicit_comment_courier"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShowAlertInteractor$AnalyticsTrigger {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShowAlertInteractor$AnalyticsTrigger[] $VALUES;
    public static final ShowAlertInteractor$AnalyticsTrigger DETAILS;
    public static final ShowAlertInteractor$AnalyticsTrigger SUMMARY;
    private final String value;

    static {
        ShowAlertInteractor$AnalyticsTrigger showAlertInteractor$AnalyticsTrigger = new ShowAlertInteractor$AnalyticsTrigger("SUMMARY", 0, "d2d_comment_summary");
        SUMMARY = showAlertInteractor$AnalyticsTrigger;
        ShowAlertInteractor$AnalyticsTrigger showAlertInteractor$AnalyticsTrigger2 = new ShowAlertInteractor$AnalyticsTrigger("DETAILS", 1, "d2d_comment_details_card");
        DETAILS = showAlertInteractor$AnalyticsTrigger2;
        ShowAlertInteractor$AnalyticsTrigger[] showAlertInteractor$AnalyticsTriggerArr = {showAlertInteractor$AnalyticsTrigger, showAlertInteractor$AnalyticsTrigger2};
        $VALUES = showAlertInteractor$AnalyticsTriggerArr;
        $ENTRIES = a.a(showAlertInteractor$AnalyticsTriggerArr);
    }

    public ShowAlertInteractor$AnalyticsTrigger(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShowAlertInteractor$AnalyticsTrigger valueOf(String str) {
        return (ShowAlertInteractor$AnalyticsTrigger) Enum.valueOf(ShowAlertInteractor$AnalyticsTrigger.class, str);
    }

    public static ShowAlertInteractor$AnalyticsTrigger[] values() {
        return (ShowAlertInteractor$AnalyticsTrigger[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
