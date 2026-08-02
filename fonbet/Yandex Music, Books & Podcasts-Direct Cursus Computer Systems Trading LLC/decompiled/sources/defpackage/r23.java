package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.ott.data.dto.c;

/* loaded from: classes5.dex */
public final class r23 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r23(String str, int i) {
        super(1);
        this.r = i;
        this.s = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                cj4 cj4Var = (cj4) obj;
                cj4Var.getClass();
                return new qv3(this.s, cj4Var.d);
            case 1:
                mi2 mi2Var = (mi2) obj;
                mi2Var.getClass();
                if (mi2Var instanceof mi2) {
                    return Boolean.valueOf(CollectionsKt.I(mi2Var.a, this.s));
                }
                b6e.s();
                return null;
            case 2:
                wfp.k((jfp) obj, this.s);
                return Unit.a;
            case 3:
                jfp jfpVar = (jfp) obj;
                wfp.k(jfpVar, this.s);
                wfp.q(jfpVar, 5);
                return Unit.a;
            case 4:
                jfp jfpVar2 = (jfp) obj;
                wfp.k(jfpVar2, this.s);
                wfp.q(jfpVar2, 5);
                return Unit.a;
            case 5:
                jfp jfpVar3 = (jfp) obj;
                wfp.k(jfpVar3, this.s);
                wfp.q(jfpVar3, 5);
                return Unit.a;
            case 6:
                c cVar = (c) obj;
                cVar.getClass();
                String str = this.s;
                str.getClass();
                cVar.b = str;
                return Unit.a;
            case 7:
                jfp jfpVar4 = (jfp) obj;
                wfp.o(jfpVar4, this.s);
                wfp.x(jfpVar4, 0.0f);
                return Unit.a;
            case 8:
                wfp.k((jfp) obj, this.s);
                return Unit.a;
            case 9:
                jom jomVar = (jom) obj;
                jomVar.getClass();
                String str2 = this.s;
                jomVar.g = new it7(str2);
                jomVar.i = str2;
                return Unit.a;
            case 10:
                return Boolean.valueOf(Intrinsics.d(((pin) obj).getId(), this.s));
            default:
                jfp jfpVar5 = (jfp) obj;
                wfp.k(jfpVar5, this.s);
                wfp.q(jfpVar5, 5);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r23(Set set, r0o r0oVar, List list, String str) {
        super(1);
        this.r = 1;
        this.s = str;
    }
}
