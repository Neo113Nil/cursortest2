package p2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2586He;
import com.google.android.gms.internal.ads.C4221yf;
import com.google.android.gms.internal.ads.InterfaceC2468Af;
import java.util.Collections;
import java.util.List;
import u2.D;
import u2.u;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4826a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39689a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39690b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2468Af f39691c;

    /* renamed from: d, reason: collision with root package name */
    public final C2586He f39692d = new C2586He(false, Collections.EMPTY_LIST);

    public C4826a(Context context, InterfaceC2468Af interfaceC2468Af) {
        this.f39689a = context;
        this.f39691c = interfaceC2468Af;
    }

    public final boolean a() {
        InterfaceC2468Af interfaceC2468Af = this.f39691c;
        return ((interfaceC2468Af == null || !((C4221yf) interfaceC2468Af).f35187g.f35369y) && !this.f39692d.f25333n) || this.f39690b;
    }

    public final void b(String str) {
        List<String> list;
        C2586He c2586He = this.f39692d;
        InterfaceC2468Af interfaceC2468Af = this.f39691c;
        if ((interfaceC2468Af == null || !((C4221yf) interfaceC2468Af).f35187g.f35369y) && !c2586He.f25333n) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (interfaceC2468Af != null) {
            ((C4221yf) interfaceC2468Af).b(3, str, null);
            return;
        }
        if (!c2586He.f25333n || (list = c2586He.f25334u) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                D d2 = C4835j.f39730C.f39735c;
                new u(this.f39689a, "", replace, null).l();
            }
        }
    }
}
