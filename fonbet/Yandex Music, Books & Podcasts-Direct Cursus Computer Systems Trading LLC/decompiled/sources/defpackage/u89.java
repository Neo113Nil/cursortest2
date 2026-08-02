package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class u89 implements ux8, a0c {
    public static final qc9 f = new qc9(y7k.a);
    public final hs4 a;
    public final bs4 b;
    public final le3 c;
    public final LinkedHashMap d;
    public final ArrayList e;

    public u89(q89 q89Var) {
        z89.c0.getClass();
        hs4 hs4Var = y89.b;
        this.a = hs4Var;
        this.b = x89.a;
        this.c = new le3(hs4Var, q89Var);
        this.d = new LinkedHashMap();
        this.e = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    @Override // defpackage.ux8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        Object obj;
        JSONObject jSONObject;
        w1g w1gVar;
        w1g qygVar;
        List n = dp8Var.n();
        bs4 bs4Var = this.b;
        if (n != null) {
            Iterator it = n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((rx8) obj).a, "lottie")) {
                        break;
                    }
                }
            }
            rx8 rx8Var = (rx8) obj;
            if (rx8Var != null && (jSONObject = rx8Var.b) != null) {
                bgg bggVar = view instanceof bgg ? (bgg) view : null;
                if (bggVar == null) {
                    bs4Var.getClass();
                    return;
                }
                s0a delegate = bggVar.getDelegate();
                pyg pygVar = delegate instanceof pyg ? (pyg) delegate : null;
                if (pygVar == null) {
                    bs4Var.getClass();
                    return;
                }
                ckj ckjVar = pygVar.l;
                szb d = e5f.d(f, jSONObject, "lottie_url", vct.e, kzj.C);
                if (d != null) {
                    qygVar = new ryg(((Uri) d.a(xzbVar)).toString());
                } else {
                    JSONObject optJSONObject = jSONObject.optJSONObject("lottie_json");
                    if (optJSONObject == null) {
                        w1gVar = null;
                        if (w1gVar == null && !w1gVar.equals(pygVar.k)) {
                            pygVar.c = null;
                            ckjVar.clear();
                            pygVar.b.d();
                            bgg bggVar2 = pygVar.a;
                            bggVar2.setExternalImage(null);
                            bggVar2.setImageTransformer(null);
                            bggVar2.setImageDrawable(null);
                            pygVar.k = w1gVar;
                            ckjVar.clear();
                            kuo kuoVar = new kuo(new f44(this, w1gVar, view, gc8Var, dp8Var, pygVar, jSONObject, xzbVar, (Continuation) null), bggVar);
                            WeakHashMap weakHashMap = wdu.a;
                            if (bggVar.isAttachedToWindow()) {
                                kuoVar.c();
                            }
                            bggVar.addOnAttachStateChangeListener(kuoVar);
                            bggVar.setTag(R.id.lottie_on_attach_to_window_listener, kuoVar);
                            return;
                        }
                        return;
                    }
                    qygVar = new qyg(optJSONObject);
                }
                w1gVar = qygVar;
                if (w1gVar == null) {
                    return;
                }
                pygVar.c = null;
                ckjVar.clear();
                pygVar.b.d();
                bgg bggVar22 = pygVar.a;
                bggVar22.setExternalImage(null);
                bggVar22.setImageTransformer(null);
                bggVar22.setImageDrawable(null);
                pygVar.k = w1gVar;
                ckjVar.clear();
                kuo kuoVar2 = new kuo(new f44(this, w1gVar, view, gc8Var, dp8Var, pygVar, jSONObject, xzbVar, (Continuation) null), bggVar);
                WeakHashMap weakHashMap2 = wdu.a;
                if (bggVar.isAttachedToWindow()) {
                }
                bggVar.addOnAttachStateChangeListener(kuoVar2);
                bggVar.setTag(R.id.lottie_on_attach_to_window_listener, kuoVar2);
                return;
            }
        }
        bs4Var.getClass();
    }

    @Override // defpackage.ux8
    public final boolean c(dp8 dp8Var) {
        List list;
        JSONObject jSONObject;
        if ((dp8Var instanceof i19) && (list = ((i19) dp8Var).r) != null) {
            List<rx8> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (rx8 rx8Var : list2) {
                if (Intrinsics.d(rx8Var.a, "lottie") && (jSONObject = rx8Var.b) != null && (jSONObject.has("lottie_url") || jSONObject.has("lottie_json"))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ux8
    public final void d(View view) {
        bgg bggVar = view instanceof bgg ? (bgg) view : null;
        if (bggVar == null || (bggVar.getDelegate() instanceof pyg)) {
            return;
        }
        pyg pygVar = new pyg(bggVar);
        czg czgVar = pygVar.b;
        boolean add = ((HashSet) czgVar.l.a).add(fzg.a);
        if (czgVar.a != null && add) {
            czgVar.c();
        }
        this.a.getClass();
        czgVar.h = "/";
        bggVar.setDelegate(pygVar);
    }

    @Override // defpackage.ux8
    public final void e(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        bgg bggVar = view instanceof bgg ? (bgg) view : null;
        bs4 bs4Var = this.b;
        if (bggVar == null) {
            bs4Var.getClass();
            return;
        }
        s0a delegate = bggVar.getDelegate();
        pyg pygVar = delegate instanceof pyg ? (pyg) delegate : null;
        if (pygVar == null) {
            bs4Var.getClass();
            return;
        }
        ckj ckjVar = pygVar.l;
        Object tag = bggVar.getTag(R.id.lottie_on_attach_to_window_listener);
        kuo kuoVar = tag instanceof kuo ? (kuo) tag : null;
        if (kuoVar != null) {
            mm6 mm6Var = kuoVar.c;
            if (mm6Var != null) {
                gld.L(mm6Var, null);
            }
            kuoVar.c = null;
            bggVar.removeOnAttachStateChangeListener(kuoVar);
        }
        pygVar.c = null;
        ckjVar.clear();
        pygVar.b.d();
        bgg bggVar2 = pygVar.a;
        bggVar2.setExternalImage(null);
        bggVar2.setImageTransformer(null);
        bggVar2.setImageDrawable(null);
        pygVar.k = null;
        ckjVar.clear();
        l();
    }

    @Override // defpackage.ux8
    public final void f(dp8 dp8Var, xzb xzbVar, hf9 hf9Var) {
        h(dp8Var, xzbVar, hf9Var);
    }

    @Override // defpackage.ux8
    public final void g(dp8 dp8Var, xzb xzbVar) {
        h(dp8Var, xzbVar, null);
    }

    @Override // defpackage.a0c
    public final List getSubscriptions() {
        return this.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r0.equals("https") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        r7.toString();
        r0 = r7.toString();
        r8.getClass();
        r0.getClass();
        ((defpackage.w89) r8.a.getValue()).a(null, r0);
        r9.invoke(new defpackage.ipt(r7, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r0.equals("asset") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        r9.invoke(new defpackage.ipt(r7, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (r0.equals("http") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r0.equals("res") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (r0.equals("divkit-asset") == false) goto L45;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(dp8 dp8Var, xzb xzbVar, hf9 hf9Var) {
        Object obj;
        JSONObject jSONObject;
        List n = dp8Var.n();
        if (n != null) {
            Iterator it = n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((rx8) obj).a, "lottie")) {
                        break;
                    }
                }
            }
            rx8 rx8Var = (rx8) obj;
            if (rx8Var == null || (jSONObject = rx8Var.b) == null) {
                return;
            }
            szb d = e5f.d(f, jSONObject, "lottie_url", vct.e, kzj.C);
            if (d != null) {
                Uri uri = (Uri) d.a(xzbVar);
                t89 t89Var = new t89(hf9Var != null ? hf9Var.k0("lottie") : null, 0);
                le3 le3Var = this.c;
                le3Var.getClass();
                q89 q89Var = (q89) le3Var.b;
                String scheme = uri.getScheme();
                if (scheme != null) {
                    switch (scheme.hashCode()) {
                        case -1951681592:
                            break;
                        case 112800:
                            break;
                        case 3213448:
                            break;
                        case 93121264:
                            break;
                        case 99617003:
                            break;
                    }
                    return;
                }
                uri.getScheme();
                t89Var.invoke(new ipt(uri, null));
            }
        }
    }
}
