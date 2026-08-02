package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class vz2 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ j03 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vz2(j03 j03Var, int i) {
        super(1);
        this.r = i;
        this.s = j03Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        j03 j03Var = this.s;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return new ihk((String) list.get(0), (String) list.get(1), j03Var.m);
            case 1:
                fgk fgkVar = (fgk) obj;
                fgkVar.getClass();
                ((x60) j03Var.g).a(gut.p0());
                return fgkVar;
            case 2:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                LinkedHashMap linkedHashMap = sqg.a;
                uwf.l("Check status polling failed: " + r7wVar.getMessage());
                ((x60) j03Var.g).a(gut.h0(r7wVar.getMessage()));
                return nif.c(r7wVar);
            case 3:
                fgk fgkVar2 = (fgk) obj;
                fgkVar2.getClass();
                ((x60) j03Var.g).a(gut.p0());
                return fgkVar2;
            default:
                r7w r7wVar2 = (r7w) obj;
                r7wVar2.getClass();
                LinkedHashMap linkedHashMap2 = sqg.a;
                uwf.l("Check status polling failed: " + r7wVar2.getMessage());
                ((x60) j03Var.g).a(gut.h0(r7wVar2.getMessage()));
                return nif.c(r7wVar2);
        }
    }
}
