package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class uv2 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ aqi s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv2(aqi aqiVar, int i) {
        super(0);
        this.r = i;
        this.s = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                aqi aqiVar = this.s;
                if (aqiVar != null) {
                    return (List) aqiVar.getValue();
                }
                return null;
            case 1:
                Boolean bool = (Boolean) this.s.getValue();
                bool.booleanValue();
                return bool;
            case 2:
                return new bsf((Function1) this.s.getValue());
            case 3:
                return (ttf) ((Function0) this.s.getValue()).invoke();
            case 4:
                return new vuf((Function1) this.s.getValue());
            case 5:
                return new enj(((enj) this.s.getValue()).a);
            default:
                return (udo) this.s.getValue();
        }
    }
}
