package ru.yandex.taxi.scooters.presentation.feedback.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rrq;
import defpackage.thp;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/presentation/feedback/data/model/FeedbackAttachments;", "", "Companion", "Requirement", "rrq", "ru/yandex/taxi/scooters/presentation/feedback/data/model/a", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeedbackAttachments {
    public static final rrq Companion = new rrq();
    public static final i3y[] c;
    public static final FeedbackAttachments d;
    public final Requirement a;
    public final Requirement b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/scooters/presentation/feedback/data/model/FeedbackAttachments$Requirement;", "", "Companion", "ru/yandex/taxi/scooters/presentation/feedback/data/model/b", JCP.RAW_PREFIX, "OPTIONAL", "REQUIRED", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Requirement {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Requirement[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final Requirement NONE;
        public static final Requirement OPTIONAL;
        public static final Requirement REQUIRED;

        static {
            Requirement requirement = new Requirement(JCP.RAW_PREFIX, 0);
            NONE = requirement;
            Requirement requirement2 = new Requirement("OPTIONAL", 1);
            OPTIONAL = requirement2;
            Requirement requirement3 = new Requirement("REQUIRED", 2);
            REQUIRED = requirement3;
            Requirement[] requirementArr = {requirement, requirement2, requirement3};
            $VALUES = requirementArr;
            $ENTRIES = kotlin.enums.a.a(requirementArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new thp(23));
        }

        public static Requirement valueOf(String str) {
            return (Requirement) Enum.valueOf(Requirement.class, str);
        }

        public static Requirement[] values() {
            return (Requirement[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new thp(21)), kotlin.a.b(lazyThreadSafetyMode, new thp(22))};
        d = new FeedbackAttachments(0);
    }

    public /* synthetic */ FeedbackAttachments(int i, Requirement requirement, Requirement requirement2) {
        this.a = (i & 1) == 0 ? Requirement.NONE : requirement;
        if ((i & 2) == 0) {
            this.b = Requirement.NONE;
        } else {
            this.b = requirement2;
        }
    }

    public FeedbackAttachments() {
        this(0);
    }

    public FeedbackAttachments(Requirement requirement, Requirement requirement2) {
        this.a = requirement;
        this.b = requirement2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FeedbackAttachments(int i) {
        this(r1, r1);
        Requirement requirement = Requirement.NONE;
    }
}
