package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class kf0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ aqi s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf0(aqi aqiVar, int i) {
        super(1);
        this.r = i;
        this.s = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        aqi aqiVar = this.s;
        switch (i) {
            case 0:
                Configuration configuration = new Configuration((Configuration) obj);
                qs5 qs5Var = AndroidCompositionLocals_androidKt.a;
                aqiVar.setValue(configuration);
                break;
            case 1:
                r9s r9sVar = (r9s) obj;
                aqiVar.setValue(r9sVar.c ? r9sVar.b : r9sVar.a);
                break;
            case 2:
                List list = (List) obj;
                if (aqiVar != null) {
                    aqiVar.setValue(list);
                }
                break;
            case 3:
                aqiVar.setValue((cds) obj);
                break;
            case 4:
                ((Function1) aqiVar.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
                break;
            case 5:
                wof wofVar = (wof) obj;
                wofVar.getClass();
                aqiVar.setValue(new enj(wofVar.S(0L)));
                break;
            case 6:
                break;
            case 7:
                aqiVar.setValue((ydp) obj);
                break;
            case 8:
                jpa jpaVar = (jpa) obj;
                long j = ((d85) aqiVar.getValue()).a;
                float n0 = jpaVar.n0(uvr.a);
                float n02 = jpaVar.n0(uvr.b);
                float f = n02 / 2;
                jpaVar.s(j, swf.i(f, enj.f(jpaVar.y0())), swf.i(n0 - f, enj.f(jpaVar.y0())), (r18 & 8) != 0 ? 0.0f : n02, (r18 & 16) != 0 ? 0 : 1);
                break;
            default:
                ((Function1) aqiVar.getValue()).invoke(new enj(((enj) obj).a));
                break;
        }
        return Unit.a;
    }
}
