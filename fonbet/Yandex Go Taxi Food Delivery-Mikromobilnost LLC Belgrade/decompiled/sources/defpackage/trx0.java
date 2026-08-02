package defpackage;

import com.yandex.go.zone.dto.objects.VerticalMode;
import com.yandex.go.zone.model.Zone;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class trx0 {
    public final r0 a = bvf0.c(null);
    public final r0 b = bvf0.c(null);
    public final r0 c = bvf0.c(null);
    public final r0 d;
    public final ConcurrentHashMap e;
    public volatile String f;
    public volatile fnx0 g;
    public volatile String h;

    public trx0() {
        EmptyList emptyList = EmptyList.a;
        VerticalMode verticalMode = VerticalMode.WITHOUT_SELECTOR;
        Zone.Companion.getClass();
        this.d = bvf0.c(new dk31(emptyList, verticalMode, Zone.H, b.f()));
        this.e = new ConcurrentHashMap();
        this.f = "";
        this.h = "";
    }

    public final mth a() {
        return new mth(this.c, 6);
    }

    public final mth b() {
        return new mth(this.a, 6);
    }
}
