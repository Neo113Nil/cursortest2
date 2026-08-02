package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class nub implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9n b;
    public final /* synthetic */ gdn c;
    public final /* synthetic */ u6k d;
    public final /* synthetic */ aqi e;
    public final /* synthetic */ aqi f;
    public final /* synthetic */ aqi g;

    public /* synthetic */ nub(s9n s9nVar, gdn gdnVar, u6k u6kVar, aqi aqiVar, aqi aqiVar2, aqi aqiVar3, int i) {
        this.a = i;
        this.b = s9nVar;
        this.c = gdnVar;
        this.d = u6kVar;
        this.e = aqiVar;
        this.f = aqiVar2;
        this.g = aqiVar3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = this.b.c;
                if (this.c.c && i > 0) {
                    sj2.j(this.e, this.f, this.g, i, 0);
                    u6k u6kVar = this.d;
                    u6kVar.i(u6kVar.h() + 1);
                }
                break;
            case 1:
                int i2 = this.b.c;
                if (this.c.c) {
                    aqi aqiVar = this.e;
                    if (i2 < u75.g((List) aqiVar.getValue())) {
                        sj2.j(this.f, this.g, aqiVar, i2, u75.g((List) aqiVar.getValue()));
                        u6k u6kVar2 = this.d;
                        u6kVar2.i(u6kVar2.h() + 1);
                    }
                }
                break;
            case 2:
                int i3 = this.b.c;
                if (this.c.c && i3 > 0) {
                    sj2.j(this.e, this.f, this.g, i3, i3 - 1);
                    u6k u6kVar3 = this.d;
                    u6kVar3.i(u6kVar3.h() + 1);
                }
                break;
            default:
                int i4 = this.b.c;
                if (this.c.c) {
                    aqi aqiVar2 = this.e;
                    if (i4 < u75.g((List) aqiVar2.getValue())) {
                        sj2.j(this.f, this.g, aqiVar2, i4, i4 + 1);
                        u6k u6kVar4 = this.d;
                        u6kVar4.i(u6kVar4.h() + 1);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
