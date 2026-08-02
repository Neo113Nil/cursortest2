package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.AdjustConfig;
import com.yandex.go.zone.model.Zone;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes6.dex */
public final class va1 implements vpr {
    public final /* synthetic */ wa1 a;

    public va1(wa1 wa1Var) {
        this.a = wa1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[SYNTHETIC] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        List list;
        Iterator it;
        Object obj2;
        AdjustConfig.ConfigRule configRule;
        List list2;
        Object obj3;
        jd90 jd90Var;
        fnx0 fnx0Var = (fnx0) obj;
        Zone g = this.a.b.g();
        fnx0 fnx0Var2 = ((k) this.a.c).j.g;
        String str2 = null;
        AdjustConfig adjustConfig = (g == null || (jd90Var = g.z) == null) ? null : (AdjustConfig) jd90Var.a(AdjustConfig.class);
        wa1 wa1Var = this.a;
        if (adjustConfig != null && (list2 = adjustConfig.b) != null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                AdjustConfig.ConfigRule configRule2 = (AdjustConfig.ConfigRule) obj3;
                if (jl40.l(configRule2.c, fnx0Var.d) || configRule2.a.contains(fnx0Var.c.b)) {
                    break;
                }
            }
            AdjustConfig.ConfigRule configRule3 = (AdjustConfig.ConfigRule) obj3;
            if (configRule3 != null) {
                str = configRule3.b;
                if (fnx0Var2 != null && adjustConfig != null && (list = adjustConfig.b) != null) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = it.next();
                            AdjustConfig.ConfigRule configRule4 = (AdjustConfig.ConfigRule) obj2;
                            if (jl40.l(configRule4.c, fnx0Var2.d) || configRule4.a.contains(fnx0Var2.c.b)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    configRule = (AdjustConfig.ConfigRule) obj2;
                    if (configRule != null) {
                        str2 = configRule.b;
                    }
                }
                if (!jl40.l(str2, str) && str != null) {
                    ((j) wa1Var.a).v(str);
                }
                return zy11.a;
            }
        }
        str = null;
        if (fnx0Var2 != null) {
            it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            configRule = (AdjustConfig.ConfigRule) obj2;
            if (configRule != null) {
            }
        }
        if (!jl40.l(str2, str)) {
            ((j) wa1Var.a).v(str);
        }
        return zy11.a;
    }
}
