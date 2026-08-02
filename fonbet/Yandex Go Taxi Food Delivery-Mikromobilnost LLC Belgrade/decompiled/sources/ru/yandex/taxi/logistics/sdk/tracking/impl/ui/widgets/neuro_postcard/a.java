package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard;

import defpackage.czh;
import defpackage.j360;
import defpackage.tje;
import defpackage.vni;

/* loaded from: classes5.dex */
public final class a implements vni {
    public final /* synthetic */ int a;
    public final /* synthetic */ j360 b;

    public /* synthetic */ a(j360 j360Var, int i) {
        this.a = i;
        this.b = j360Var;
    }

    public final void a(String str) {
        int i = this.a;
        j360 j360Var = this.b;
        switch (i) {
            case 0:
                tje.N(j360Var.k, null, null, new NeuroPostcardListenerImpl$handleAddSignature$callback$1$onButtonClick$1(j360Var, str, null), 3);
                czh czhVar = (czh) j360Var.b.c;
                if (czhVar != null) {
                    czhVar.dismiss();
                    break;
                }
                break;
            default:
                tje.N(j360Var.k, null, null, new NeuroPostcardListenerImpl$handleOpenPrompt$callback$1$onButtonClick$1(j360Var, str, null), 3);
                czh czhVar2 = (czh) j360Var.b.c;
                if (czhVar2 != null) {
                    czhVar2.dismiss();
                    break;
                }
                break;
        }
    }
}
