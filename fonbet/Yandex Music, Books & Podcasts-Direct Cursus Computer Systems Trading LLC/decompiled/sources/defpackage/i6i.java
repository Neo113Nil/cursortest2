package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class i6i implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i6i(mm6 mm6Var, suq suqVar, int i, hvq hvqVar, zd3 zd3Var) {
        this.d = mm6Var;
        this.e = suqVar;
        this.c = i;
        this.f = hvqVar;
        this.b = zd3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                j6i j6iVar = (j6i) this.d;
                kzo kzoVar = (kzo) this.e;
                mqs mqsVar = (mqs) this.f;
                String str = (String) this.b;
                qls qlsVar = (qls) obj;
                qlsVar.getClass();
                j6iVar.l(kzoVar, mqsVar, this.c, str, qlsVar);
                break;
            case 1:
                String str2 = (String) this.b;
                String str3 = (String) this.d;
                final mm6 mm6Var = (mm6) this.e;
                final o3k o3kVar = (o3k) this.f;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.x(jfpVar, -1.0f);
                final int i = 0;
                final int i2 = this.c;
                nw6 nw6Var = new nw6(str2, new Function0() { // from class: a3k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                x97.y(mm6Var, null, null, new l71(o3kVar, i2, null, 5), 3);
                                break;
                            default:
                                x97.y(mm6Var, null, null, new l71(o3kVar, i2, null, 6), 3);
                                break;
                        }
                        return Boolean.TRUE;
                    }
                });
                final int i3 = 1;
                wfp.l(jfpVar, u75.h(nw6Var, new nw6(str3, new Function0() { // from class: a3k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                x97.y(mm6Var, null, null, new l71(o3kVar, i2, null, 5), 3);
                                break;
                            default:
                                x97.y(mm6Var, null, null, new l71(o3kVar, i2, null, 6), 3);
                                break;
                        }
                        return Boolean.TRUE;
                    }
                })));
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.d;
                Function1 function1 = (Function1) this.e;
                mm6 mm6Var2 = (mm6) this.f;
                fvf fvfVar = (fvf) this.b;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vufVar.Z(arrayList.size(), null, new wyl(arrayList, 1), new wn5(new yyl(arrayList, function1, mm6Var2, fvfVar, this.c), -1091073711, true));
                break;
            default:
                mm6 mm6Var3 = (mm6) this.d;
                suq suqVar = (suq) this.e;
                hvq hvqVar = (hvq) this.f;
                zd3 zd3Var = (zd3) this.b;
                tvo tvoVar = (tvo) obj;
                tvoVar.getClass();
                x97.y(mm6Var3, null, null, new lco(tvoVar, suqVar, this.c, hvqVar, zd3Var, (Continuation) null), 3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i6i(j6i j6iVar, kzo kzoVar, mqs mqsVar, int i, String str) {
        this.d = j6iVar;
        this.e = kzoVar;
        this.f = mqsVar;
        this.c = i;
        this.b = str;
    }

    public /* synthetic */ i6i(String str, String str2, mm6 mm6Var, o3k o3kVar, int i) {
        this.b = str;
        this.d = str2;
        this.e = mm6Var;
        this.f = o3kVar;
        this.c = i;
    }

    public /* synthetic */ i6i(ArrayList arrayList, Function1 function1, mm6 mm6Var, fvf fvfVar, int i) {
        this.d = arrayList;
        this.e = function1;
        this.f = mm6Var;
        this.b = fvfVar;
        this.c = i;
    }
}
