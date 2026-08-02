package defpackage;

import com.yandex.go.eboks.objects.domain.model.a;
import com.yandex.mapkit.map.VisibleRegion;
import java.util.List;

/* loaded from: classes12.dex */
public final class shn {
    public final VisibleRegion a;
    public final boolean b;
    public final List c;
    public final a d;

    public /* synthetic */ shn(VisibleRegion visibleRegion, a aVar, int i) {
        this(visibleRegion, (i & 2) == 0, null, (i & 8) != 0 ? null : aVar);
    }

    public shn(VisibleRegion visibleRegion, boolean z, List list, a aVar) {
        this.a = visibleRegion;
        this.b = z;
        this.c = list;
        this.d = aVar;
    }
}
