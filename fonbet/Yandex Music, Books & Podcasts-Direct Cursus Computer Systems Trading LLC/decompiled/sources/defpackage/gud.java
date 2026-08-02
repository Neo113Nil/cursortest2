package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class gud implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nyf b;
    public final /* synthetic */ long c;

    public /* synthetic */ gud(nyf nyfVar, long j, int i) {
        this.a = i;
        this.b = nyfVar;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        oa8 oa8Var = (oa8) obj;
        switch (this.a) {
            case 0:
                oa8Var.getClass();
                final int i = 0;
                final long j = this.c;
                uyf uyfVar = new uyf() { // from class: hud
                    @Override // defpackage.uyf
                    public final void Q(dzf dzfVar, kyf kyfVar) {
                        int i2 = i;
                        long j2 = j;
                        switch (i2) {
                            case 0:
                                if (iud.a[kyfVar.ordinal()] == 1 && j2 != 16) {
                                    bcb.a = j2;
                                    break;
                                }
                                break;
                            default:
                                if (qgs.a[kyfVar.ordinal()] == 1 && j2 != 16) {
                                    int i3 = wg2.a;
                                    break;
                                }
                                break;
                        }
                    }
                };
                nyf nyfVar = this.b;
                nyfVar.a(uyfVar);
                return new mf0(4, nyfVar, uyfVar);
            default:
                oa8Var.getClass();
                final int i2 = 1;
                final long j2 = this.c;
                uyf uyfVar2 = new uyf() { // from class: hud
                    @Override // defpackage.uyf
                    public final void Q(dzf dzfVar, kyf kyfVar) {
                        int i22 = i2;
                        long j22 = j2;
                        switch (i22) {
                            case 0:
                                if (iud.a[kyfVar.ordinal()] == 1 && j22 != 16) {
                                    bcb.a = j22;
                                    break;
                                }
                                break;
                            default:
                                if (qgs.a[kyfVar.ordinal()] == 1 && j22 != 16) {
                                    int i3 = wg2.a;
                                    break;
                                }
                                break;
                        }
                    }
                };
                nyf nyfVar2 = this.b;
                nyfVar2.a(uyfVar2);
                return new mf0(13, nyfVar2, uyfVar2);
        }
    }
}
