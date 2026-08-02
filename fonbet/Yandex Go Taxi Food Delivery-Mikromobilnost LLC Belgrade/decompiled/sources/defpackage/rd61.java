package defpackage;

import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.j;
import com.google.android.gms.internal.play_billing.l;
import java.io.Serializable;
import java.util.function.Function;
import ru.yandex.taxi.zonemodes.ZoneModesInteractorImpl$saveZoneModeForOrder$$inlined$computeIfAbsentCompat$1;

/* loaded from: classes2.dex */
public final /* synthetic */ class rd61 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ rd61(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                return ((ZoneModesInteractorImpl$saveZoneModeForOrder$$inlined$computeIfAbsentCompat$1) serializable).invoke(obj);
            default:
                int i2 = g.a;
                String str = ((ks5) obj).a.c;
                ot91 r = j.r();
                qu91 r2 = l.r();
                r2.e();
                l.s((l) r2.b, "subs:" + ((String) serializable) + ":" + str);
                r.e();
                j.s((j) r.b, (l) r2.d());
                l.r();
                throw null;
        }
    }
}
