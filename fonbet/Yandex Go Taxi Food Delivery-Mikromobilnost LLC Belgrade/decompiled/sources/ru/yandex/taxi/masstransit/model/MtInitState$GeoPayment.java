package ru.yandex.taxi.masstransit.model;

import defpackage.bn30;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.pj40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class MtInitState$GeoPayment implements bn30 {
    public final ExitBehavior a;
    public final pj40 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/masstransit/model/MtInitState$GeoPayment$ExitBehavior;", "", "OpenTransportMain", "DismissMassTransitMode", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ExitBehavior {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ExitBehavior[] $VALUES;
        public static final ExitBehavior DismissMassTransitMode;
        public static final ExitBehavior OpenTransportMain;

        static {
            ExitBehavior exitBehavior = new ExitBehavior("OpenTransportMain", 0);
            OpenTransportMain = exitBehavior;
            ExitBehavior exitBehavior2 = new ExitBehavior("DismissMassTransitMode", 1);
            DismissMassTransitMode = exitBehavior2;
            ExitBehavior[] exitBehaviorArr = {exitBehavior, exitBehavior2};
            $VALUES = exitBehaviorArr;
            $ENTRIES = kotlin.enums.a.a(exitBehaviorArr);
        }

        public static ExitBehavior valueOf(String str) {
            return (ExitBehavior) Enum.valueOf(ExitBehavior.class, str);
        }

        public static ExitBehavior[] values() {
            return (ExitBehavior[]) $VALUES.clone();
        }
    }

    public MtInitState$GeoPayment(ExitBehavior exitBehavior, pj40 pj40Var) {
        this.a = exitBehavior;
        this.b = pj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtInitState$GeoPayment)) {
            return false;
        }
        MtInitState$GeoPayment mtInitState$GeoPayment = (MtInitState$GeoPayment) obj;
        return this.a == mtInitState$GeoPayment.a && jl40.l(this.b, mtInitState$GeoPayment.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GeoPayment(exitBehavior=" + this.a + ", utmParams=" + this.b + Extension.C_BRAKE;
    }

    public MtInitState$GeoPayment() {
        this(ExitBehavior.OpenTransportMain, pj40.c);
    }
}
