package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yrk0 implements dpk {
    public static final yrk0 a = new yrk0();

    public static final void a(wrk0 wrk0Var, rvo rvoVar, View view) {
        view.setForeground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}}, new int[]{((Number) wrk0Var.a.a(rvoVar)).intValue()}), null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.dpk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        JSONObject jSONObject;
        wrk0 wrk0Var;
        Object obj;
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (zrk0.a.contains(((bpk) obj).a)) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar != null) {
                jSONObject = bpkVar.b;
                new nlv();
                tls tlsVar = b.b;
                int i = 19;
                kbs kbsVar = new kbs(i);
                rms rmsVar = wm11.f;
                a aVar = new a("color", "@{theme == 'dark' || theme == 'ultimaDark' ? '#26E0DEDA' : '#1221201F'}", tlsVar, kbsVar, eg90.a, rmsVar, null);
                if (jSONObject != null) {
                    wrk0Var = new wrk0(aVar, false);
                } else {
                    ?? a2 = pdx.a(jSONObject, "color", tlsVar, new kbs(i), rmsVar);
                    if (a2 != 0) {
                        aVar = a2;
                    }
                    wrk0Var = new wrk0(aVar, jSONObject.optBoolean("preserve_divkit_animations"));
                }
                if (!wrk0Var.b) {
                    view.setOnTouchListener(null);
                }
                a(wrk0Var, rvoVar, view);
                tje.F(view).a(wrk0Var.a.c(rvoVar, new ga1(13, wrk0Var, rvoVar, view)));
            }
        }
        jSONObject = null;
        new nlv();
        tls tlsVar2 = b.b;
        int i2 = 19;
        kbs kbsVar2 = new kbs(i2);
        rms rmsVar2 = wm11.f;
        a aVar2 = new a("color", "@{theme == 'dark' || theme == 'ultimaDark' ? '#26E0DEDA' : '#1221201F'}", tlsVar2, kbsVar2, eg90.a, rmsVar2, null);
        if (jSONObject != null) {
        }
        if (!wrk0Var.b) {
        }
        a(wrk0Var, rvoVar, view);
        tje.F(view).a(wrk0Var.a.c(rvoVar, new ga1(13, wrk0Var, rvoVar, view)));
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions = egkVar.getExtensions();
        if (extensions == null) {
            extensions = EmptyList.a;
        }
        List list = extensions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zrk0.a.contains(((bpk) it.next()).a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        tje.m(view);
        view.setForeground(null);
    }
}
