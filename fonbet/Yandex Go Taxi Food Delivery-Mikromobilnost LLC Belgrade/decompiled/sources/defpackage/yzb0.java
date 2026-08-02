package defpackage;

import ru.yandex.taxi.widget.map.PinSlot;

/* loaded from: classes10.dex */
public final class yzb0 extends dv31 {
    public final /* synthetic */ PinSlot k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzb0(PinSlot pinSlot, PinSlot pinSlot2) {
        super(pinSlot, e0c0.a);
        this.k = pinSlot2;
    }

    @Override // defpackage.dv31
    public final void a(Object obj, Object obj2) {
    }

    @Override // defpackage.dv31
    public final void d(Object obj, Object obj2) {
        i1c0 i1c0Var;
        f0c0 f0c0Var = (f0c0) obj2;
        PinSlot pinSlot = this.k;
        i1c0Var = pinSlot.pinStyle;
        pinSlot.refreshStateValues(f0c0Var, i1c0Var);
        if ((((f0c0) obj) instanceof zzb0) != (f0c0Var instanceof zzb0)) {
            pinSlot.requestLayout();
        }
        pinSlot.invalidate();
    }

    @Override // defpackage.dv31
    public final void f(float f) {
    }
}
