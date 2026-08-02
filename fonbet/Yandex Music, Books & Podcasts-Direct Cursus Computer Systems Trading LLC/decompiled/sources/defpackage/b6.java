package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.passport.internal.methods.f;
import com.yandex.passport.sloth.r0;
import com.yandex.plus.home.datasource.openapi.models.u6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.c;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.home.r;
import com.yandex.plus.webview.api.contract.message.d;
import com.yandex.pulse.ComponentParams;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public abstract class b6 implements wc3, fft, hdu, lci, f {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public b6(ComponentParams componentParams) {
        this.a = 11;
        componentParams.getClass();
        this.b = componentParams;
        Map<String, String> map = componentParams.variations;
        map.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            key.getClass();
            String value = entry.getValue();
            value.getClass();
            arrayList.add(new oe5(key, value));
        }
        Object[] array = arrayList.toArray(new oe5[0]);
        if (array == null) {
            jj4.j("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            throw null;
        }
        this.c = (oe5[]) array;
    }

    public static Map M(SslError sslError) {
        String str = "";
        sslError.getClass();
        String url = sslError.getUrl();
        url.getClass();
        Uri parse = Uri.parse(url);
        try {
            String scheme = parse.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            String authority = parse.getAuthority();
            if (authority == null) {
                authority = "";
            }
            String path = parse.getPath();
            if (path == null) {
                path = "";
            }
            str = String.format("%s://%s%s", Arrays.copyOf(new Object[]{scheme, authority, path}, 3));
        } catch (Exception unused) {
        }
        return uah.e(new Pair("primary_error", String.valueOf(sslError.getPrimaryError())), new Pair("safe_url", str), new Pair("certificate", sslError.getCertificate().toString()));
    }

    public abstract void A();

    public abstract void C();

    @Override // com.yandex.passport.internal.methods.f
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Enum f(Bundle bundle) {
        bundle.getClass();
        lm4 lm4Var = (lm4) this.c;
        String str = (String) this.b;
        int i = bundle.getInt(str);
        Class b = lm4Var.b();
        b.getClass();
        Enum[] enumArr = (Enum[]) b.getEnumConstants();
        Enum r2 = null;
        if (enumArr != null) {
            int length = enumArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Enum r5 = enumArr[i2];
                if (r5.ordinal() == i) {
                    r2 = r5;
                    break;
                }
                i2++;
            }
        }
        if (r2 != null) {
            return r2;
        }
        e7o.f("can't get required enum ".concat(str));
        return null;
    }

    public abstract Object E(q1f q1fVar);

    public void F() {
        k1l k1lVar = (k1l) this.b;
        k1lVar.getClass();
        k1lVar.a(PauseCommand.INSTANCE, a3t.a);
        ((o) this.c).b();
    }

    public abstract int[] G(int i);

    public abstract void H(ys2 ys2Var);

    public abstract void I();

    public abstract q1f J(Object obj);

    public void K() {
        i();
        IntentFilter k = k();
        if (k.countActions() == 0) {
            return;
        }
        if (((l83) this.b) == null) {
            this.b = new l83(1, this);
        }
        ((er0) this.c).k.registerReceiver((l83) this.b, k);
    }

    public abstract void L();

    public abstract void N();

    @Override // defpackage.wc3
    public void a() {
        gld.L((tf6) this.c, null);
    }

    @Override // defpackage.wc3
    public void d(az6 az6Var) {
        q6k.y((eu1) this.b, az6Var);
    }

    @Override // defpackage.fft
    public View e() {
        return (View) ((jyr) this.c).getValue();
    }

    @Override // com.yandex.passport.internal.methods.f
    public void g(Bundle bundle, Object obj) {
        Enum r3 = (Enum) obj;
        r3.getClass();
        bundle.putInt((String) this.b, r3.ordinal());
    }

    @Override // defpackage.hdu
    public Context getCtx() {
        return (Context) this.b;
    }

    @Override // com.yandex.passport.internal.methods.f
    public String getKey() {
        return (String) this.b;
    }

    public abstract void h();

    public void i() {
        l83 l83Var = (l83) this.b;
        if (l83Var != null) {
            try {
                ((er0) this.c).k.unregisterReceiver(l83Var);
            } catch (IllegalArgumentException unused) {
            }
            this.b = null;
        }
    }

    public abstract IntentFilter k();

    public d l() {
        return new d(new c(r6.Companion.serializer(), (x3f) ((jyr) this.c).getValue(), 0), (a) this.b);
    }

    public h m() {
        return new h(new c(v1.Companion.serializer(), (x3f) ((jyr) this.c).getValue(), 1), (a) this.b);
    }

    public void n(Object obj) {
        ((Function1) q6k.F((eu1) this.b)).invoke(obj);
    }

    public abstract int[] o(int i);

    public abstract int p();

    public Object q(String str) {
        Object obj = ((Map) ((jyr) this.c).getValue()).get(str);
        if (obj != null) {
            return obj;
        }
        wvs.h((String) ((Function1) this.b).invoke(str));
        return null;
    }

    public MenuItem r(MenuItem menuItem) {
        if (!(menuItem instanceof nsr)) {
            return menuItem;
        }
        nsr nsrVar = (nsr) menuItem;
        if (((ciq) this.c) == null) {
            this.c = new ciq(0);
        }
        MenuItem menuItem2 = (MenuItem) ((ciq) this.c).get(nsrVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        wxh wxhVar = new wxh((Context) this.b, nsrVar);
        ((ciq) this.c).put(nsrVar, wxhVar);
        return wxhVar;
    }

    public int[] s(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.c;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String t() {
        String str = (String) this.b;
        if (str != null) {
            return str;
        }
        Intrinsics.j("text");
        throw null;
    }

    public String toString() {
        String b6Var;
        switch (this.a) {
            case 14:
                String str = (String) this.c;
                b6 b6Var2 = (b6) this.b;
                if (b6Var2 == null || (b6Var = b6Var2.toString()) == null) {
                    return str;
                }
                return b6Var + '.' + str;
            default:
                return super.toString();
        }
    }

    public Object u() {
        return h4a.j.b(this, true);
    }

    public Object v() {
        return h4a.j.b(this, false);
    }

    public void w(View view) {
        view.getClass();
    }

    public abstract void x();

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        Context context = (Context) this.b;
        Class cls = (Class) this.c;
        return new g5n(context, kkpVar.n(File.class, cls), kkpVar.n(Uri.class, cls), cls);
    }

    public abstract View z(hdu hduVar);

    public void B() {
    }

    public b6(b6 b6Var, String str) {
        this.a = 14;
        str.getClass();
        this.b = b6Var;
        this.c = str;
    }

    public b6(k1l k1lVar, o oVar) {
        this.a = 3;
        k1lVar.getClass();
        this.b = k1lVar;
        this.c = oVar;
    }

    public b6(Function1 function1) {
        this.a = 17;
        this.b = function1;
        this.c = btf.b(com.yandex.plus.di.a.a);
    }

    public b6(Object obj, String str) {
        this.a = 8;
        str.getClass();
        this.b = str;
        this.c = obj;
    }

    public b6(View view, a aVar) {
        this.a = 18;
        view.getClass();
        aVar.getClass();
        this.b = view;
        this.c = gld.e(e.c(a4g.n(), aVar));
        view.addOnAttachStateChangeListener(new r(4, this));
    }

    public b6(a aVar) {
        this.a = 19;
        aVar.getClass();
        this.b = aVar;
        this.c = btf.b(new u6(23));
    }

    public b6(Context context, int i) {
        this.a = i;
        switch (i) {
            case 10:
                context.getClass();
                this.b = context;
                this.c = btf.b(new v1e(23, this));
                break;
            default:
                this.b = context;
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b6(r0 r0Var) {
        this(16, r0Var, r0);
        this.a = 16;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
    }

    public b6(int i) {
        this.a = 9;
        this.c = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.c).add(new gqa());
        }
    }

    public b6(int i, byte b) {
        this.a = i;
        switch (i) {
            case 6:
                dq7 dq7Var = ca8.a;
                bsd bsdVar = j5h.a;
                bsdVar.getClass();
                this.b = new eu1(null);
                this.c = gld.e(bsdVar);
                break;
            default:
                this.c = new int[2];
                break;
        }
    }

    public b6(mc4 mc4Var, ks3 ks3Var) {
        this.a = 0;
        mc4Var.getClass();
        ks3Var.getClass();
        this.b = mc4Var;
        this.c = ks3Var;
    }

    public /* synthetic */ b6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public b6(er0 er0Var) {
        this.a = 2;
        this.c = er0Var;
    }
}
