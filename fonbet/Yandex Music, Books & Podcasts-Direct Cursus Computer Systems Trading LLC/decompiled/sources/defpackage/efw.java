package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class efw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qfw b;

    public /* synthetic */ efw(qfw qfwVar, int i) {
        this.a = i;
        this.b = qfwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nsw nswVar = (nsw) obj;
        switch (this.a) {
            case 0:
                nswVar.getClass();
                osw oswVar = ((ndw) this.b.q.getValue()).a;
                oswVar.getClass();
                oswVar.a(f1d.g("YNISON_ANDROID_MUSIC_", nswVar.a), nswVar.b);
                break;
            default:
                nswVar.getClass();
                osw oswVar2 = ((ndw) this.b.q.getValue()).a;
                oswVar2.getClass();
                oswVar2.a(nswVar.a, nswVar.b);
                break;
        }
        return Unit.a;
    }
}
