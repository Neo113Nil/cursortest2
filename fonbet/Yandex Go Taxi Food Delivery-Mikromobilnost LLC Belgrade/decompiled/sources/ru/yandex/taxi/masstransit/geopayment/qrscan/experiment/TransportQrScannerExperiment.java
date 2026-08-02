package ru.yandex.taxi.masstransit.geopayment.qrscan.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.k801;
import defpackage.xn11;
import defpackage.y411;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/qrscan/experiment/TransportQrScannerExperiment;", "Lxn11;", "Companion", "a", "QrTarget", "y411", "x411", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransportQrScannerExperiment implements xn11 {
    public static final y411 Companion = new y411();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(20))};
    public final List b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/qrscan/experiment/TransportQrScannerExperiment$QrTarget;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/qrscan/experiment/d", "TRANSPORT_PAYMENT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class QrTarget {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ QrTarget[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final QrTarget TRANSPORT_PAYMENT;

        static {
            QrTarget qrTarget = new QrTarget("TRANSPORT_PAYMENT", 0);
            TRANSPORT_PAYMENT = qrTarget;
            QrTarget[] qrTargetArr = {qrTarget};
            $VALUES = qrTargetArr;
            $ENTRIES = kotlin.enums.a.a(qrTargetArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(23));
        }

        public static QrTarget valueOf(String str) {
            return (QrTarget) Enum.valueOf(QrTarget.class, str);
        }

        public static QrTarget[] values() {
            return (QrTarget[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TransportQrScannerExperiment(int i, List list) {
        if ((i & 1) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public TransportQrScannerExperiment(int i) {
        this.b = EmptyList.a;
    }

    public TransportQrScannerExperiment() {
        this(0);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/qrscan/experiment/TransportQrScannerExperiment$a;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/qrscan/experiment/b", "ru/yandex/taxi/masstransit/geopayment/qrscan/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final c Companion = new c();
        public static final i3y[] c;
        public final QrTarget a;
        public final List b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new k801(21)), kotlin.a.b(lazyThreadSafetyMode, new k801(22))};
        }

        public /* synthetic */ a(int i, QrTarget qrTarget, List list) {
            this.a = (i & 1) == 0 ? null : qrTarget;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public a() {
            this.a = null;
            this.b = EmptyList.a;
        }
    }
}
