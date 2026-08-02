package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class u60 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ LinkedHashMap s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u60(LinkedHashMap linkedHashMap, int i) {
        super(2);
        this.r = i;
        this.s = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                this.s.put(str2, str);
                break;
            case 1:
                String str3 = (String) obj2;
                str3.getClass();
                this.s.put("known.".concat(str3), obj);
                break;
            case 2:
                q1f q1fVar = (q1f) obj;
                String str4 = (String) obj2;
                q1fVar.getClass();
                str4.getClass();
                Serializable T = bkp.T(q1fVar);
                if (T != null) {
                    this.s.put(str4, T);
                }
                break;
            case 3:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                str5.getClass();
                str6.getClass();
                LinkedHashMap linkedHashMap = this.s;
                s7w s7wVar = (s7w) linkedHashMap.get(str6);
                if (s7wVar == null) {
                    s7wVar = new s7w();
                }
                s7wVar.a.add(str5);
                linkedHashMap.put(str6, s7wVar);
                break;
            case 4:
                q1f q1fVar2 = (q1f) obj;
                String str7 = (String) obj2;
                q1fVar2.getClass();
                str7.getClass();
                if (q1fVar2.a == r1f.c) {
                    this.s.put(str7, ((jkr) q1fVar2).b);
                }
                break;
            case 5:
                q1f q1fVar3 = (q1f) obj;
                String str8 = (String) obj2;
                q1fVar3.getClass();
                str8.getClass();
                this.s.put(str8, new chc(null, new LinkedHashMap(), q1fVar3));
                break;
            case 6:
                q1f q1fVar4 = (q1f) obj;
                String str9 = (String) obj2;
                q1fVar4.getClass();
                str9.getClass();
                this.s.put(str9, new chc(null, new LinkedHashMap(), q1fVar4));
                break;
            case 7:
                q1f q1fVar5 = (q1f) obj;
                String str10 = (String) obj2;
                q1fVar5.getClass();
                str10.getClass();
                Serializable T2 = bkp.T(q1fVar5);
                if (T2 != null) {
                    this.s.put(str10, T2);
                }
                break;
            case 8:
                q1f q1fVar6 = (q1f) obj;
                String str11 = (String) obj2;
                q1fVar6.getClass();
                str11.getClass();
                this.s.put(str11, q1fVar6);
                break;
            default:
                q1f q1fVar7 = (q1f) obj;
                String str12 = (String) obj2;
                q1fVar7.getClass();
                str12.getClass();
                this.s.put(str12, q1fVar7);
                break;
        }
        return Unit.a;
    }
}
