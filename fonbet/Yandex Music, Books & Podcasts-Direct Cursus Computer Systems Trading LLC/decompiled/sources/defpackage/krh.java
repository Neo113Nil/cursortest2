package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class krh {
    public static yld c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public krh(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        xq0.q("The media router service must only be accessed on the application's main thread.");
    }

    public static yld c() {
        yld yldVar = c;
        if (yldVar != null) {
            return yldVar;
        }
        xq0.q("getGlobalRouter cannot be called when sGlobal is null");
        return null;
    }

    public static krh d(Context context) {
        if (context == null) {
            xq0.x("context must not be null");
            return null;
        }
        b();
        if (c == null) {
            c = new yld(context.getApplicationContext());
        }
        ArrayList arrayList = c.i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                krh krhVar = new krh(context);
                arrayList.add(new WeakReference(krhVar));
                return krhVar;
            }
            krh krhVar2 = (krh) ((WeakReference) arrayList.get(size)).get();
            if (krhVar2 == null) {
                arrayList.remove(size);
            } else if (krhVar2.a == context) {
                return krhVar2;
            }
        }
    }

    public static MediaSessionCompat$Token e() {
        yld yldVar = c;
        if (yldVar == null) {
            return null;
        }
        vx6 vx6Var = yldVar.C;
        if (vx6Var != null) {
            osh oshVar = (osh) vx6Var.b;
            if (oshVar != null) {
                return ((esh) oshVar.a).c;
            }
            return null;
        }
        osh oshVar2 = yldVar.D;
        if (oshVar2 != null) {
            return ((esh) oshVar2.a).c;
        }
        return null;
    }

    public static ArrayList f() {
        b();
        return c().j;
    }

    public static irh g() {
        b();
        return c().e();
    }

    public static boolean h() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        mrh mrhVar = c().u;
        return mrhVar == null || (bundle = mrhVar.d) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static void j(irh irhVar) {
        if (irhVar == null) {
            xq0.x("route must not be null");
        } else {
            b();
            c().i(irhVar, 3);
        }
    }

    public static void k(int i) {
        if (i < 0 || i > 3) {
            xq0.x("Unsupported reason to unselect route");
            return;
        }
        b();
        yld c2 = c();
        irh c3 = c2.c();
        if (c2.e() != c3) {
            c2.i(c3, i);
        }
    }

    public final void a(crh crhVar, erh erhVar, int i) {
        frh frhVar;
        crh crhVar2;
        if (crhVar == null) {
            xq0.x("selector must not be null");
            return;
        }
        if (erhVar == null) {
            xq0.x("callback must not be null");
            return;
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((frh) arrayList.get(i2)).b == erhVar) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            frhVar = new frh(this, erhVar);
            arrayList.add(frhVar);
        } else {
            frhVar = (frh) arrayList.get(i2);
        }
        boolean z2 = true;
        if (i != frhVar.d) {
            frhVar.d = i;
            z = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        frhVar.e = elapsedRealtime;
        crh crhVar3 = frhVar.c;
        crhVar3.a();
        crhVar.a();
        if (crhVar3.b.containsAll(crhVar.b)) {
            z2 = z;
        } else {
            crh crhVar4 = frhVar.c;
            if (crhVar4 == null) {
                xq0.x("selector must not be null");
                return;
            }
            crhVar4.a();
            ArrayList<String> arrayList2 = !crhVar4.b.isEmpty() ? new ArrayList<>(crhVar4.b) : null;
            ArrayList c2 = crhVar.c();
            if (!c2.isEmpty()) {
                Iterator it = c2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str == null) {
                        xq0.x("category must not be null");
                        return;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                crhVar2 = crh.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                crhVar2 = new crh(bundle, arrayList2);
            }
            frhVar.c = crhVar2;
        }
        if (z2) {
            c().k();
        }
    }

    public final void i(erh erhVar) {
        if (erhVar == null) {
            xq0.x("callback must not be null");
            return;
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((frh) arrayList.get(i)).b == erhVar) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            c().k();
        }
    }
}
