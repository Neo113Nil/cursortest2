package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class z7i implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ryc b;
    public final /* synthetic */ c8i c;
    public final /* synthetic */ spd d;

    public /* synthetic */ z7i(ryc rycVar, c8i c8iVar, spd spdVar, int i) {
        this.a = i;
        this.b = rycVar;
        this.c = c8iVar;
        this.d = spdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                bool.booleanValue();
                String str = (String) obj2;
                str.getClass();
                this.b.invoke(this.c, this.d, bool, str);
                break;
            default:
                bool.getClass();
                String str2 = (String) obj2;
                str2.getClass();
                this.b.invoke(this.c, this.d, bool, str2);
                break;
        }
        return Unit.a;
    }
}
