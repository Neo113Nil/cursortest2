package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class iwd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g06 b;

    public /* synthetic */ iwd(g06 g06Var, int i) {
        this.a = i;
        this.b = g06Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String uuid;
        switch (this.a) {
            case 0:
                g06 g06Var = this.b;
                Context context = (Context) g06Var.b;
                StringBuilder sb = new StringBuilder(128);
                hwd hwdVar = (hwd) g06Var.c;
                Context context2 = hwdVar.a;
                Function1 function1 = hwdVar.f;
                if (function1 == null) {
                    function1 = gwd.a;
                }
                dgq dgqVar = (dgq) function1.invoke(context2);
                String str = (String) sn4.a.getValue();
                Function0 function0 = hwdVar.g;
                if ((function0 == null || (uuid = (String) function0.invoke()) == null) && (uuid = AppMetricaYandex.getUuid(context2)) == null) {
                    uuid = CommonUrlParts.Values.FALSE_INTEGER;
                }
                String str2 = dgqVar != null ? dgqVar.a : null;
                String str3 = dgqVar != null ? dgqVar.b : null;
                str.getClass();
                sb.append("os=Android; os_version=");
                String str4 = Build.VERSION.RELEASE;
                str4.getClass();
                sb.append(avf.E(str4));
                sb.append("; manufacturer=");
                String str5 = Build.MANUFACTURER;
                str5.getClass();
                sb.append(avf.E(str5));
                sb.append("; model=");
                String str6 = Build.MODEL;
                str6.getClass();
                sb.append(avf.E(str6));
                sb.append("; clid=");
                sb.append(str);
                sb.append("; uuid=");
                sb.append(uuid);
                sb.append("; display_size=");
                DecimalFormat decimalFormat = new DecimalFormat("0.0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
                context.getClass();
                l1b.j(context).getDefaultDisplay().getRealSize(new Point());
                float hypot = (float) Math.hypot(r5.x / lg3.g0(context).xdpi, r5.y / lg3.g0(context).ydpi);
                Float valueOf = Math.abs(hypot) <= Float.MAX_VALUE ? Float.valueOf(hypot) : null;
                sb.append(decimalFormat.format(Float.valueOf(valueOf != null ? valueOf.floatValue() : 0.0f)));
                sb.append("; dpi=");
                sb.append(lg3.g0(context).densityDpi);
                if (str2 != null) {
                    sb.append("; mcc=".concat(str2));
                }
                if (str3 != null) {
                    sb.append("; mnc=".concat(str3));
                }
                return sb.toString();
            default:
                return this.b.n();
        }
    }
}
