package defpackage;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.util.Xml;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.yandex.taxi.persuggest.fingerprint.UserFingerprintGnssSession$start$measCallback$1;
import ru.yandex.taxi.persuggest.fingerprint.UserFingerprintGnssSession$start$statusCallback$1;
import ru.yandex.taxi.superapp.f;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes12.dex */
public final /* synthetic */ class zp7 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zp7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int next;
        sm21 onGnssMeasurementsReceived$lambda$0;
        sm21 onSatelliteStatusChanged$lambda$0;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                fq7 fq7Var = (fq7) obj;
                if (fq7Var.c) {
                    ref$BooleanRef.element = false;
                    return fq7Var;
                }
                ref$BooleanRef.element = true;
                return fq7.a(fq7Var, true, false, null, false, 29);
            case 1:
                f fVar = (f) obj2;
                one oneVar = (one) obj;
                long j = fVar.b.x.a().a;
                return (oneVar == null || j != oneVar.a.getValue()) ? new one(gtq0.h(fVar.a, j)) : oneVar;
            case 2:
                tn20 tn20Var = (tn20) obj2;
                tn20 tn20Var2 = (tn20) obj;
                return (!jl40.l(tn20Var2 != null ? tn20Var2.a : null, tn20Var.a) || tn20Var.b - tn20Var2.b >= 10) ? tn20Var : tn20Var2;
            case 3:
                Resources resources = (Resources) obj2;
                int i2 = jth0.list_yandex_player_view;
                String name = ListYandexPlayerView.class.getName();
                try {
                    XmlResourceParser layout = resources.getLayout(i2);
                    do {
                        next = layout.next();
                        if (jl40.l(layout.getName(), name)) {
                            return Xml.asAttributeSet(layout);
                        }
                    } while (next != 1);
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            case 4:
                ol70 ol70Var = (ol70) obj2;
                ol70 ol70Var2 = (ol70) obj;
                return jl40.l(ol70Var2.c, ol70Var.c) ? ol70Var : ol70Var2;
            case 5:
                onGnssMeasurementsReceived$lambda$0 = UserFingerprintGnssSession$start$measCallback$1.onGnssMeasurementsReceived$lambda$0((GnssMeasurementsEvent) obj2, (sm21) obj);
                return onGnssMeasurementsReceived$lambda$0;
            default:
                onSatelliteStatusChanged$lambda$0 = UserFingerprintGnssSession$start$statusCallback$1.onSatelliteStatusChanged$lambda$0((GnssStatus) obj2, (sm21) obj);
                return onSatelliteStatusChanged$lambda$0;
        }
    }
}
