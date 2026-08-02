package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class w71 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ w71(a81 a81Var, ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                c81 c81Var = (c81) obj;
                c81Var.getClass();
                break;
            case 1:
                c81 c81Var2 = (c81) obj;
                c81Var2.getClass();
                break;
            case 2:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.i(jfpVar, new ky4(1, this.b.size()));
                break;
            case 3:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.i(jfpVar2, new ky4(1, this.b.size()));
                break;
            case 4:
                drf drfVar = (drf) obj;
                drfVar.getClass();
                wfm wfmVar = drfVar instanceof wfm ? (wfm) drfVar : null;
                if (wfmVar != null && wfmVar.d() == f73.d) {
                    this.b.add(wfmVar);
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                this.b.add(str);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ w71(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }
}
