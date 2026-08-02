package defpackage;

import com.yandex.messaging.internal.LocalMessageRef;

/* loaded from: classes15.dex */
public final /* synthetic */ class yzw implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzw b;
    public final /* synthetic */ LocalMessageRef c;
    public final /* synthetic */ j3b w;
    public final /* synthetic */ y2r x;
    public final /* synthetic */ nu10 y;

    public /* synthetic */ yzw(zzw zzwVar, LocalMessageRef localMessageRef, j3b j3bVar, y2r y2rVar, nu10 nu10Var, int i) {
        this.a = i;
        this.b = zzwVar;
        this.c = localMessageRef;
        this.w = j3bVar;
        this.x = y2rVar;
        this.y = nu10Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        nu10 nu10Var = this.y;
        y2r y2rVar = this.x;
        j3b j3bVar = this.w;
        LocalMessageRef localMessageRef = this.c;
        zzw zzwVar = this.b;
        switch (i) {
            case 0:
                zzwVar.c.k(localMessageRef, j3bVar, y2rVar, nu10Var);
                break;
            default:
                zzwVar.c.g(localMessageRef, j3bVar, y2rVar, nu10Var);
                break;
        }
        return zy11Var;
    }
}
