package ru.yandex.taxi.deeplinks;

import android.net.Uri;
import defpackage.cvu0;
import defpackage.k4o;
import kotlin.Metadata;

/* loaded from: classes9.dex */
public final class ExternalSchemesInteractor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/deeplinks/ExternalSchemesInteractor$ExternalScheme;", "", "", "scheme", "Ljava/lang/String;", "BANK", "deeplinks"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ExternalScheme {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ExternalScheme[] $VALUES;
        public static final ExternalScheme BANK;
        private final String scheme = "yandexbank";

        static {
            ExternalScheme externalScheme = new ExternalScheme();
            BANK = externalScheme;
            ExternalScheme[] externalSchemeArr = {externalScheme};
            $VALUES = externalSchemeArr;
            $ENTRIES = kotlin.enums.a.a(externalSchemeArr);
        }

        public static ExternalScheme valueOf(String str) {
            return (ExternalScheme) Enum.valueOf(ExternalScheme.class, str);
        }

        public static ExternalScheme[] values() {
            return (ExternalScheme[]) $VALUES.clone();
        }

        public final boolean a(Uri uri) {
            return cvu0.t(this.scheme, uri.getScheme(), true);
        }
    }

    public static boolean a(Uri uri) {
        return ExternalScheme.BANK.a(uri);
    }
}
