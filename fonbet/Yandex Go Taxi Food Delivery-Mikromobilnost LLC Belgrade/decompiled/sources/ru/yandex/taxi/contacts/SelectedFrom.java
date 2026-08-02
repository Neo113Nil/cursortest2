package ru.yandex.taxi.contacts;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ugq0;
import defpackage.w0q0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/contacts/SelectedFrom;", "", "", "analyticsName", "Ljava/lang/String;", "getAnalyticsName", "()Ljava/lang/String;", "Companion", "ugq0", "CONTACTS", "LAST_CONTACTS", "MANUAL", "STANDALONE", "SUGGEST", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SelectedFrom {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SelectedFrom[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final SelectedFrom CONTACTS;
    public static final ugq0 Companion;
    public static final SelectedFrom LAST_CONTACTS;
    public static final SelectedFrom MANUAL;
    public static final SelectedFrom STANDALONE;
    public static final SelectedFrom SUGGEST;
    private final String analyticsName;

    static {
        SelectedFrom selectedFrom = new SelectedFrom("CONTACTS", 0, ContactsFragment.WEBVIEW_NAME);
        CONTACTS = selectedFrom;
        SelectedFrom selectedFrom2 = new SelectedFrom("LAST_CONTACTS", 1, "last_orders");
        LAST_CONTACTS = selectedFrom2;
        SelectedFrom selectedFrom3 = new SelectedFrom("MANUAL", 2, "manual");
        MANUAL = selectedFrom3;
        SelectedFrom selectedFrom4 = new SelectedFrom("STANDALONE", 3, "standalone");
        STANDALONE = selectedFrom4;
        SelectedFrom selectedFrom5 = new SelectedFrom("SUGGEST", 4, "suggest");
        SUGGEST = selectedFrom5;
        SelectedFrom[] selectedFromArr = {selectedFrom, selectedFrom2, selectedFrom3, selectedFrom4, selectedFrom5};
        $VALUES = selectedFromArr;
        $ENTRIES = kotlin.enums.a.a(selectedFromArr);
        Companion = new ugq0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(29));
    }

    public SelectedFrom(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static SelectedFrom valueOf(String str) {
        return (SelectedFrom) Enum.valueOf(SelectedFrom.class, str);
    }

    public static SelectedFrom[] values() {
        return (SelectedFrom[]) $VALUES.clone();
    }
}
