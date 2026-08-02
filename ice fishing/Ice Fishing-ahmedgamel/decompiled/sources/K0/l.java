package K0;

import android.content.Context;
import com.google.android.gms.internal.ads.C3451jv;
import y0.InterfaceC5196a;
import y0.InterfaceC5197b;
import z0.C5218g;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements InterfaceC5196a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f1634n;

    public /* synthetic */ l(Context context) {
        this.f1634n = context;
    }

    @Override // y0.InterfaceC5196a
    public InterfaceC5197b c(C3451jv c3451jv) {
        Context context = this.f1634n;
        F.d callback = (F.d) c3451jv.f32128x;
        kotlin.jvm.internal.h.e(callback, "callback");
        String str = (String) c3451jv.f32127w;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new C5218g(context, str, callback, true, true);
    }
}
