package defpackage;

import android.graphics.Rect;
import com.yandex.go.taxi.summary.verticalsummary.repository.MarginSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class uep0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ vep0 b;

    public /* synthetic */ uep0(vep0 vep0Var, int i) {
        this.a = i;
        this.b = vep0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        LinkedHashMap linkedHashMap;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        vep0 vep0Var = this.b;
        switch (i) {
            case 0:
                vep0Var.c.b.Lc("VerticalSummaryOverlay", (Rect) obj);
                break;
            default:
                Rect rect = (Rect) obj;
                lh31 lh31Var = vep0Var.g;
                MarginSource marginSource = MarginSource.ExternalState;
                r0 r0Var = lh31Var.a;
                do {
                    value = r0Var.getValue();
                    linkedHashMap = new LinkedHashMap((Map) value);
                    linkedHashMap.put(marginSource, rect);
                } while (!r0Var.k(value, linkedHashMap));
        }
        return zy11Var;
    }
}
