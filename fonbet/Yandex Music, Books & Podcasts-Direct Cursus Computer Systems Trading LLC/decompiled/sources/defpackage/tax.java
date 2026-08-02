package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* loaded from: classes3.dex */
public final class tax {
    public final ikx a;
    public final e5x b;
    public final Context c;

    public tax(ikx ikxVar, e5x e5xVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = ikxVar;
        this.b = e5xVar;
        this.c = context;
    }

    public final onx a() {
        String packageName = this.c.getPackageName();
        ikx ikxVar = this.a;
        hox hoxVar = ikxVar.a;
        if (hoxVar != null) {
            ikx.e.e("requestUpdateInfo(%s)", packageName);
            i8s i8sVar = new i8s();
            hoxVar.a().post(new ogx(hoxVar, i8sVar, i8sVar, new ogx(ikxVar, i8sVar, packageName, i8sVar), 2));
            return i8sVar.a;
        }
        yee yeeVar = ikx.e;
        Object[] objArr = {-9};
        yeeVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", yee.f(yeeVar.a, "onError(%d)", objArr));
        }
        return ywf.v(new ooe(-9));
    }
}
