package defpackage;

import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.sticky_widgets.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class qn1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qn1(CharSequence charSequence, boolean z, int i, int i2) {
        this.a = i2;
        this.b = charSequence;
        this.c = z;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = this.c;
        CharSequence charSequence = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.b(charSequence, z, fidVar, vng.O(49));
                break;
            case 1:
                vpb1.i(charSequence, z, fidVar, vng.O(1));
                break;
            default:
                vpb1.e(charSequence, z, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
