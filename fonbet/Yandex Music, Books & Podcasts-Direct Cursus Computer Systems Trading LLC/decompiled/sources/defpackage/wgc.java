package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class wgc extends uif implements Function2 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ zgc s;
    public final /* synthetic */ LinkedHashMap t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgc(zgc zgcVar, LinkedHashMap linkedHashMap) {
        super(2);
        this.s = zgcVar;
        this.t = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                String str = (String) obj2;
                ((q1f) obj).getClass();
                str.getClass();
                this.t.put(str, this.s.c);
                break;
            default:
                q1f q1fVar = (q1f) obj;
                String str2 = (String) obj2;
                q1fVar.getClass();
                str2.getClass();
                zgc zgcVar = this.s;
                this.t.put(str2, new chc(zgcVar.b, zgcVar.c, q1fVar));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgc(LinkedHashMap linkedHashMap, zgc zgcVar) {
        super(2);
        this.t = linkedHashMap;
        this.s = zgcVar;
    }
}
