package defpackage;

import com.yandex.div.core.view2.Div2View;

/* loaded from: classes11.dex */
public final /* synthetic */ class rsu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tsu b;

    public /* synthetic */ rsu(tsu tsuVar, int i) {
        this.a = i;
        this.b = tsuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        tsu tsuVar = this.b;
        switch (i) {
            case 0:
                omk omkVar = (omk) tsuVar.j.get();
                if (omkVar != null) {
                    Div2View div2View = tsuVar.a;
                    div2View.setData(omkVar, div2View.getDataTag());
                    break;
                }
                break;
            default:
                tsuVar.b(usu.c);
                break;
        }
    }
}
