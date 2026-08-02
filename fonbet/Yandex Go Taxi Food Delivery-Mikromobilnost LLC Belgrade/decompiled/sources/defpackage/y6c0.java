package defpackage;

import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import com.yandex.go.places.impl.navigation.common.stack.a;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class y6c0 extends a {
    public final /* synthetic */ com.yandex.go.places.impl.navigation.discovery.map.a a;

    public y6c0(com.yandex.go.places.impl.navigation.discovery.map.a aVar) {
        this.a = aVar;
    }

    @Override // com.yandex.go.places.impl.navigation.common.stack.a
    public final Object a(bcc0 bcc0Var, boolean z, Continuation continuation) {
        dm80 dm80Var = bcc0Var.a;
        PlacesNavigationEntry$Source placesNavigationEntry$Source = bcc0Var.b;
        boolean z2 = dm80Var instanceof xl80;
        com.yandex.go.places.impl.navigation.discovery.map.a aVar = this.a;
        if (z2) {
            return com.yandex.go.places.impl.navigation.discovery.map.a.k0(aVar, (xl80) dm80Var, false, placesNavigationEntry$Source).u0(continuation);
        }
        if (dm80Var instanceof yl80) {
            return com.yandex.go.places.impl.navigation.discovery.map.a.l0(aVar, (yl80) dm80Var, placesNavigationEntry$Source).u0(continuation);
        }
        if ((dm80Var instanceof ul80) || (dm80Var instanceof vl80) || (dm80Var instanceof zl80) || (dm80Var instanceof am80) || (dm80Var instanceof wl80) || (dm80Var instanceof cm80) || (dm80Var instanceof bm80)) {
            return zy11.a;
        }
        w511.b();
        return null;
    }
}
