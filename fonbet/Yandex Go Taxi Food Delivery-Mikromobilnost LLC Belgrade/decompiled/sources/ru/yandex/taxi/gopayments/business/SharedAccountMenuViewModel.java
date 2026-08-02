package ru.yandex.taxi.gopayments.business;

import com.yandex.go.payments.api.shared.model.BusinessAccountMenuItemPosition;
import defpackage.d82;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes6.dex */
public final class SharedAccountMenuViewModel {
    public final String a;
    public final String b;
    public final boolean c;
    public final BadgeType d;
    public final Runnable e;
    public final BusinessAccountMenuItemPosition f;
    public final String g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/gopayments/business/SharedAccountMenuViewModel$BadgeType;", "", "CREATE", "PROTECTION", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class BadgeType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ BadgeType[] $VALUES;
        public static final BadgeType CREATE;
        public static final BadgeType NONE;
        public static final BadgeType PROTECTION;

        static {
            BadgeType badgeType = new BadgeType("CREATE", 0);
            CREATE = badgeType;
            BadgeType badgeType2 = new BadgeType("PROTECTION", 1);
            PROTECTION = badgeType2;
            BadgeType badgeType3 = new BadgeType(JCP.RAW_PREFIX, 2);
            NONE = badgeType3;
            BadgeType[] badgeTypeArr = {badgeType, badgeType2, badgeType3};
            $VALUES = badgeTypeArr;
            $ENTRIES = a.a(badgeTypeArr);
        }

        public static BadgeType valueOf(String str) {
            return (BadgeType) Enum.valueOf(BadgeType.class, str);
        }

        public static BadgeType[] values() {
            return (BadgeType[]) $VALUES.clone();
        }
    }

    public SharedAccountMenuViewModel() {
        this("", null, false, BadgeType.NONE, new d82(1), BusinessAccountMenuItemPosition.ORIGINAL, "");
    }

    public SharedAccountMenuViewModel(String str, String str2, boolean z, BadgeType badgeType, Runnable runnable, BusinessAccountMenuItemPosition businessAccountMenuItemPosition, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = badgeType;
        this.e = runnable;
        this.f = businessAccountMenuItemPosition;
        this.g = str3;
    }
}
