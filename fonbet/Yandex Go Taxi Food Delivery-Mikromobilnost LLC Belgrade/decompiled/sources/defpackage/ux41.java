package defpackage;

import ru.yandex.taxi.widget.wheel.PickerView;
import ru.yandex.taxi.widget.wheel.WheelView;

/* loaded from: classes6.dex */
public final class ux41 {
    public final WheelView a;
    public final WheelView b;
    public final WheelView c;
    public final a441 d;
    public final tx41 e;

    public ux41(PickerView pickerView, h2r h2rVar) {
        WheelView wheelView = (WheelView) pickerView.findViewById(ndh0.options1);
        this.a = wheelView;
        WheelView wheelView2 = (WheelView) pickerView.findViewById(ndh0.options2);
        this.b = wheelView2;
        WheelView wheelView3 = (WheelView) pickerView.findViewById(ndh0.options3);
        this.c = wheelView3;
        tx41 tx41Var = new tx41(this, h2rVar);
        a441 a441Var = new a441(4, this, h2rVar);
        this.d = a441Var;
        tx41 tx41Var2 = new tx41(h2rVar, this);
        this.e = tx41Var2;
        wheelView.setListener(tx41Var);
        wheelView2.setListener(a441Var);
        wheelView3.setListener(tx41Var2);
    }
}
