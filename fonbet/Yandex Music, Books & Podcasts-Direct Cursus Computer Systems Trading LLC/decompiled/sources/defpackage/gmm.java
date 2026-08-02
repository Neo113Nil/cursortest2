package defpackage;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"Lgmm;", "Lsjn;", "Landroid/content/Context;", "Lwb7;", "Lhmm;", "datastore-preferences_release"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class gmm implements sjn {
    public final String a;
    public final xyn b;
    public final Function1 c;
    public final mm6 d;
    public final Object e;
    public volatile zlm f;

    public gmm(String str, xyn xynVar, Function1 function1, mm6 mm6Var) {
        str.getClass();
        function1.getClass();
        mm6Var.getClass();
        this.a = str;
        this.b = xynVar;
        this.c = function1;
        this.d = mm6Var;
        this.e = new Object();
    }

    @Override // defpackage.sjn
    public final Object getValue(Object obj, s9f s9fVar) {
        zlm zlmVar;
        Context context = (Context) obj;
        context.getClass();
        s9fVar.getClass();
        zlm zlmVar2 = this.f;
        if (zlmVar2 != null) {
            return zlmVar2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    xyn xynVar = this.b;
                    Function1 function1 = this.c;
                    applicationContext.getClass();
                    this.f = dmm.a(xynVar, (List) function1.invoke(applicationContext), this.d, new fmm(applicationContext, this));
                }
                zlmVar = this.f;
                zlmVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zlmVar;
    }
}
