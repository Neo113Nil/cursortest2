package defpackage;

import com.yandex.go.zone.repository.ZoneCacheEntry;
import com.yandex.go.zone.repository.h;
import core.flex.ui.OrientationAwareRecyclerView;
import java.util.Map;

/* loaded from: classes8.dex */
public final /* synthetic */ class ugw0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ugw0(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                OrientationAwareRecyclerView orientationAwareRecyclerView = (OrientationAwareRecyclerView) obj2;
                orientationAwareRecyclerView.setPadding(orientationAwareRecyclerView.getPaddingLeft(), orientationAwareRecyclerView.getPaddingTop(), orientationAwareRecyclerView.getPaddingRight(), ((t1w) obj).g + i2);
                return Boolean.FALSE;
            default:
                return Boolean.valueOf(((h) obj2).c((ZoneCacheEntry) ((Map.Entry) obj).getValue(), i2, 0));
        }
    }
}
