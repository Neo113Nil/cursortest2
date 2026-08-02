package r2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2606He;
import com.google.android.gms.internal.ads.C4244yf;
import com.google.android.gms.internal.ads.InterfaceC2488Af;
import java.util.Collections;
import java.util.List;
import w2.D;
import w2.u;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4896a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40144a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40145b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2488Af f40146c;

    /* renamed from: d, reason: collision with root package name */
    public final C2606He f40147d = new C2606He(false, Collections.EMPTY_LIST);

    public C4896a(Context context, InterfaceC2488Af interfaceC2488Af) {
        this.f40144a = context;
        this.f40146c = interfaceC2488Af;
    }

    public final boolean a() {
        InterfaceC2488Af interfaceC2488Af = this.f40146c;
        return ((interfaceC2488Af == null || !((C4244yf) interfaceC2488Af).f35977g.f36142y) && !this.f40147d.f26086n) || this.f40145b;
    }

    public final void b(String str) {
        List<String> list;
        C2606He c2606He = this.f40147d;
        InterfaceC2488Af interfaceC2488Af = this.f40146c;
        if ((interfaceC2488Af == null || !((C4244yf) interfaceC2488Af).f35977g.f36142y) && !c2606He.f26086n) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (interfaceC2488Af != null) {
            ((C4244yf) interfaceC2488Af).b(3, str, null);
            return;
        }
        if (!c2606He.f26086n || (list = c2606He.f26087u) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                D d9 = C4906k.f40186C.f40191c;
                new u(this.f40144a, "", replace, null).l();
            }
        }
    }
}
