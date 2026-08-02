package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.domain.u;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final /* synthetic */ class qet0 implements bms {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ set0 a;
    public final /* synthetic */ PointType b;
    public final /* synthetic */ Address c;
    public final /* synthetic */ SourcePicker w;
    public final /* synthetic */ ModalViewOrigin x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ qet0(set0 set0Var, PointType pointType, Address address, SourcePicker sourcePicker, ModalViewOrigin modalViewOrigin, boolean z, boolean z2, boolean z3) {
        this.a = set0Var;
        this.b = pointType;
        this.c = address;
        this.w = sourcePicker;
        this.x = modalViewOrigin;
        this.y = z;
        this.z = z2;
        this.A = z3;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        final set0 set0Var = this.a;
        h3y h3yVar = set0Var.i;
        ModalViewOrigin modalViewOrigin = (ModalViewOrigin) obj;
        Address address = (Address) obj2;
        ((Boolean) obj3).getClass();
        if (!((Boolean) obj4).booleanValue()) {
            u uVar = (u) h3yVar.get();
            final PointType pointType = this.b;
            final Address address2 = this.c;
            final SourcePicker sourcePicker = this.w;
            final ModalViewOrigin modalViewOrigin2 = this.x;
            final boolean z = this.y;
            final boolean z2 = this.z;
            final boolean z3 = this.A;
            uVar.c(modalViewOrigin, address, new Runnable() { // from class: ret0
                @Override // java.lang.Runnable
                public final void run() {
                    set0.this.a(pointType, address2, sourcePicker, modalViewOrigin2, z, z2, z3);
                }
            });
        } else if (address != null && !address.X1()) {
            ((u) h3yVar.get()).d(RouteSelectorOpenReason.SUMMARY);
        }
        return zy11.a;
    }
}
