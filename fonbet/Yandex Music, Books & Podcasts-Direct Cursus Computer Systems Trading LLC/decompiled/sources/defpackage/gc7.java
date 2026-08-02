package defpackage;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¨\u0006\u0005"}, d2 = {"Lgc7;", "T", "Lsjn;", "Landroid/content/Context;", "Lwb7;", "datastore_release"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class gc7<T> implements sjn {
    public final String a;
    public final hip b;
    public final Function1 c;
    public final mm6 d;
    public final Object e = new Object();
    public volatile okq f;

    public gc7(String str, hip hipVar, Function1 function1, mm6 mm6Var) {
        this.a = str;
        this.b = hipVar;
        this.c = function1;
        this.d = mm6Var;
    }

    @Override // defpackage.sjn
    public final Object getValue(Object obj, s9f s9fVar) {
        okq okqVar;
        Context context = (Context) obj;
        s9fVar.getClass();
        okq okqVar2 = this.f;
        if (okqVar2 != null) {
            return okqVar2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    hip hipVar = this.b;
                    Function1 function1 = this.c;
                    applicationContext.getClass();
                    this.f = ac7.a(hipVar, null, (List) function1.invoke(applicationContext), this.d, new fc7(applicationContext, this));
                }
                okqVar = this.f;
                okqVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return okqVar;
    }
}
