package K0;

import android.content.Context;
import com.google.android.gms.internal.ads.C3428jv;
import y0.InterfaceC5201a;
import z0.C5251g;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements InterfaceC5201a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1525a;

    public /* synthetic */ l(Context context) {
        this.f1525a = context;
    }

    @Override // y0.InterfaceC5201a
    public y0.b a(C3428jv c3428jv) {
        Context context = this.f1525a;
        F.d callback = (F.d) c3428jv.f31349x;
        kotlin.jvm.internal.h.e(callback, "callback");
        String str = (String) c3428jv.f31348w;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new C5251g(context, str, callback, true, true);
    }
}
