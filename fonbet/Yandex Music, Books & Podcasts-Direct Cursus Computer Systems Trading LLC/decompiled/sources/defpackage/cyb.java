package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class cyb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eyb b;

    public /* synthetic */ cyb(eyb eybVar, int i) {
        this.a = i;
        this.b = eybVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                str.getClass();
                return new g06((Context) this.b.a.a, str);
            default:
                str.getClass();
                eyb eybVar = this.b;
                return new fyb(str, (Context) eybVar.a.a, eybVar.a().b);
        }
    }
}
