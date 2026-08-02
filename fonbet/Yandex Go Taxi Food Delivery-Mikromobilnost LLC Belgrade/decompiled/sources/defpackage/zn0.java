package defpackage;

import ru.yandex.taxi.preorder.suggested.selection.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class zn0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ zn0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        CharSequence charSequence = (CharSequence) obj;
        switch (i) {
            case 0:
                aVar.O.setSubtitle(charSequence);
                break;
            case 1:
                aVar.O.setTrailCompanionText(charSequence);
                break;
            default:
                aVar.O.setTrailCompanionSubtext(charSequence);
                break;
        }
        return zy11Var;
    }
}
