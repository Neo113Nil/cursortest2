package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.a;
import kotlin.text.Regex;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.preorder.summary.solid.sourcedestination.b;

/* loaded from: classes6.dex */
public final /* synthetic */ class uov0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ uov0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        hst hstVar;
        String str;
        b bVar;
        int i = this.a;
        int i2 = 0;
        b bVar2 = this.b;
        switch (i) {
            case 0:
                xcv0 xcv0Var = bVar2.e.a;
                HashMap q = tse0.q(xcv0Var);
                HashMap hashMap = new HashMap();
                Regex regex = sho.a;
                xcv0Var.a.a(sb2.q("Summary.DropTransitPoints", q), q, 1, hashMap);
                cpv0 cpv0Var = bVar2.g;
                com.yandex.go.route.interactor.b bVar3 = cpv0Var.b;
                int a = cpv0Var.h.a();
                if (a > 0) {
                    List list = bVar3.a.a.G.b;
                    if (!list.isEmpty()) {
                        ArrayList arrayList = new ArrayList(a);
                        int i3 = a - 1;
                        while (i2 < i3) {
                            arrayList.add(list.get(i2));
                            i2++;
                        }
                        arrayList.add(a.Z(list));
                        bVar3.o(arrayList);
                        bVar = cpv0Var.A;
                        if (bVar != null) {
                            bVar.c();
                        }
                        break;
                    } else {
                        hstVar = jst.e;
                        str = "Try to limit stops from route without stops";
                    }
                } else {
                    bVar3.getClass();
                    hstVar = jst.e;
                    str = "Try to limit stops with invalid max count";
                }
                g8e.A(hstVar, str);
                bVar = cpv0Var.A;
                if (bVar != null) {
                }
            default:
                FrameLayout frameLayout = bVar2.a;
                c.q(frameLayout, wrh0.summary_source_destination_layout, true);
                int i4 = wfh0.solid_summary_remove_stops;
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                View view = (View) rp31.d(frameLayout, i4);
                c.z(new uov0(bVar2, i2), view);
                bVar2.p = view;
                SourceDestinationComponent sourceDestinationComponent = (SourceDestinationComponent) ((View) rp31.d(frameLayout, wfh0.source_destination_component));
                sourceDestinationComponent.setSourceTrailClickListener(bVar2.r);
                sourceDestinationComponent.setSourceDestinationListener(bVar2.t);
                sourceDestinationComponent.setStopPointsDelegate(bVar2.h);
                if (bVar2.j.a instanceof p81) {
                    sourceDestinationComponent.setInputMinHeight(tje.r(mrg0.list_item_component_size_L, sourceDestinationComponent.getContext()));
                } else {
                    sourceDestinationComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON);
                }
                bVar2.a(sourceDestinationComponent);
                bVar2.n = sourceDestinationComponent;
                break;
        }
        return zy11.a;
    }
}
