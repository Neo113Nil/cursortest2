package ru.yandex.taxi.masstransit.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.um20;
import defpackage.xn11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/MtMainRedirectExperiment;", "Lxn11;", "Companion", "RedirectVertical", "ru/yandex/taxi/masstransit/experiment/c", "ru/yandex/taxi/masstransit/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MtMainRedirectExperiment implements xn11 {
    public static final c Companion = new c();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(23))};
    public final RedirectVertical b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/MtMainRedirectExperiment$RedirectVertical;", "", "Companion", "ru/yandex/taxi/masstransit/experiment/d", "HUB", "TRANSPORT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RedirectVertical {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RedirectVertical[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final RedirectVertical HUB;
        public static final RedirectVertical TRANSPORT;

        static {
            RedirectVertical redirectVertical = new RedirectVertical("HUB", 0);
            HUB = redirectVertical;
            RedirectVertical redirectVertical2 = new RedirectVertical("TRANSPORT", 1);
            TRANSPORT = redirectVertical2;
            RedirectVertical[] redirectVerticalArr = {redirectVertical, redirectVertical2};
            $VALUES = redirectVerticalArr;
            $ENTRIES = kotlin.enums.a.a(redirectVerticalArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(24));
        }

        public static RedirectVertical valueOf(String str) {
            return (RedirectVertical) Enum.valueOf(RedirectVertical.class, str);
        }

        public static RedirectVertical[] values() {
            return (RedirectVertical[]) $VALUES.clone();
        }
    }

    public /* synthetic */ MtMainRedirectExperiment(int i, RedirectVertical redirectVertical) {
        if ((i & 1) == 0) {
            this.b = RedirectVertical.TRANSPORT;
        } else {
            this.b = redirectVertical;
        }
    }

    public MtMainRedirectExperiment() {
        this(0);
    }

    public MtMainRedirectExperiment(int i) {
        this.b = RedirectVertical.TRANSPORT;
    }
}
