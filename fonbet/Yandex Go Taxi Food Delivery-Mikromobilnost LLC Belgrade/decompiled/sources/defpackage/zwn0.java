package defpackage;

import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;
import java.util.List;

/* loaded from: classes13.dex */
public final class zwn0 {
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final ywn0 e;
    public final ScootersLiveAction f;
    public final boolean g;

    public zwn0(String str, String str2, List list, List list2, ywn0 ywn0Var, ScootersLiveAction scootersLiveAction, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = ywn0Var;
        this.f = scootersLiveAction;
        this.g = z;
        if (list2.size() != 3) {
            jst.e.u("Expanded actions must be of size 3");
        }
        if (list.size() != 2) {
            jst.e.u("Collapsed actions must be of size 2");
        }
    }
}
