package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class pen extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ LinkedHashMap s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pen(LinkedHashMap linkedHashMap, int i) {
        super(1);
        this.r = i;
        this.s = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                String str = (String) obj;
                str.getClass();
                this.s.put("-experiments", str);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                this.s.put("slots", str2);
                break;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                this.s.put("-service", str3);
                break;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                this.s.put("-source", str4);
                break;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                this.s.put("-referrer", str5);
                break;
            default:
                String str6 = (String) obj;
                str6.getClass();
                if (str6.length() > 7000) {
                    str6 = mlr.K(7000, str6).concat("...(cut)");
                }
                this.s.put("-stack", str6);
                break;
        }
        return Unit.a;
    }
}
