package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Parcel;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.api.Status;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONObject;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.g;

/* loaded from: classes6.dex */
public final class c5p implements e5l, suq, fxh, lci, gpt, ic, tev, pun, c2x, u0x, ymx {
    public final /* synthetic */ int a;
    public Object b;

    public c5p(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new h1b();
                break;
            case 10:
            default:
                this.b = new AtomicInteger(0);
                break;
            case 11:
                break;
        }
    }

    @Override // defpackage.fxh
    public boolean B(hxh hxhVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.fxh
    public void a(hxh hxhVar) {
        Toolbar toolbar = (Toolbar) this.b;
        dg dgVar = toolbar.a.t;
        if (dgVar == null || !dgVar.k()) {
            Iterator it = toolbar.G.b.iterator();
            while (it.hasNext()) {
                ((ttc) ((hyh) it.next())).a.t(hxhVar);
            }
        }
        gao gaoVar = toolbar.x0;
        if (gaoVar != null) {
            gaoVar.a(hxhVar);
        }
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        int i = 0;
        switch (this.a) {
            case 18:
                yyw yywVar = new yyw(0, (i8s) obj2);
                pzw pzwVar = (pzw) ((kzw) obj).s();
                coo cooVar = (coo) this.b;
                Parcel X = pzwVar.X();
                int i2 = ezw.a;
                X.writeStrongBinder(yywVar);
                ezw.c(X, cooVar);
                pzwVar.p0(X, 2);
                break;
            default:
                efx efxVar = new efx(i, (i8s) obj2);
                f1x f1xVar = (f1x) ((dix) obj).s();
                String[] strArr = (String[]) this.b;
                Parcel M0 = f1xVar.M0();
                y4x.d(M0, efxVar);
                M0.writeStringArray(strArr);
                f1xVar.P0(M0, 5);
                break;
        }
    }

    @Override // defpackage.ymx
    public jnx b(Class cls) {
        for (int i = 0; i < 2; i++) {
            ymx ymxVar = ((ymx[]) this.b)[i];
            if (ymxVar.l(cls)) {
                return ymxVar.b(cls);
            }
        }
        qq6.d("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.tev
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) lg3.J(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // defpackage.u0x
    public Object d() {
        return ((k81) this.b).a;
    }

    @Override // defpackage.suq
    public xdr e() {
        return (xdr) this.b;
    }

    public bpp g(JSONObject jSONObject) {
        spp ujlVar;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            ujlVar = new mvn(20);
        } else {
            ujlVar = new ujl();
        }
        return ujlVar.f((ddl) this.b, jSONObject);
    }

    @Override // defpackage.tev
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) lg3.J(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // defpackage.tev
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) lg3.J(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getWebkitToCompatConverter());
    }

    @Override // defpackage.tev
    public String[] i() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // defpackage.ymx
    public boolean l(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((ymx[]) this.b)[i].l(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.c2x
    public void n(String str, long j, long j2, long j3) {
        o3x o3xVar = (o3x) this.b;
        try {
            o3xVar.g(new i3x(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            msg msgVar = xun.l;
            Log.e(msgVar.a, msgVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = o3xVar.q.i.iterator();
        while (it.hasNext()) {
            ((wun) it.next()).g(str, j, 2103, j2, j3);
        }
    }

    @Override // defpackage.e5l
    public PlaybackScope p() {
        return new g(Page.SEARCH, (String) ((vdr) this.b).getValue());
    }

    @Override // defpackage.ic
    public boolean r(View view) {
        bjt bjtVar = (bjt) this.b;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) bjtVar.d;
        if (viewPager2.r) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.gpt
    public ca7 s(Uri uri) {
        return new yq1((ContentResolver) this.b, uri, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[LOOP:0: B:8:0x0034->B:10:0x003a, LOOP_END] */
    @Override // defpackage.c2x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(String str, long j, int i, Object obj, long j2, long j3) {
        int i2;
        Iterator it;
        o3x o3xVar = (o3x) this.b;
        try {
            i2 = i;
            try {
                o3xVar.g(new i3x(new Status(i2, null, null, null), 2));
            } catch (IllegalStateException e) {
                e = e;
                msg msgVar = xun.l;
                Log.e(msgVar.a, msgVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = o3xVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e2) {
            e = e2;
            i2 = i;
        }
        it = o3xVar.q.i.iterator();
        while (it.hasNext()) {
            ((wun) it.next()).g(str, j, i2, j2, j3);
            i2 = i;
        }
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new hpt(this);
    }

    public /* synthetic */ c5p(omd omdVar, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ c5p(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public c5p(xdr xdrVar) {
        this.a = 0;
        xdrVar.getClass();
        this.b = xdrVar;
    }

    public c5p(String str, Locale locale) {
        this.a = 17;
        this.b = DateTimeFormatter.ofPattern(str, locale);
    }

    public c5p(ArrayList arrayList) {
        this.a = 4;
        this.b = ydr.a(arrayList);
    }

    @Override // defpackage.suq
    public void c(int i) {
    }

    @Override // defpackage.suq
    public void f(int i) {
    }
}
