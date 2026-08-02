package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.bumptech.glide.a;
import com.connectsdk.service.airplay.PListParser;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d1o implements Handler.Callback {
    public static final ddl k = new ddl();
    public volatile b1o a;
    public final Handler d;
    public final ddl e;
    public final rvc i;
    public final aqd j;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final xy0 f = new xy0(0);
    public final xy0 g = new xy0(0);
    public final Bundle h = new Bundle();

    public d1o(qzc qzcVar) {
        ddl ddlVar = k;
        this.e = ddlVar;
        this.d = new Handler(Looper.getMainLooper(), this);
        this.j = new aqd(ddlVar);
        this.i = (osd.h && osd.g) ? ((Map) qzcVar.b).containsKey(ild.class) ? new cfc() : new ovn() : new rre(21);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(List list, Map map) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar != null && oVar.getView() != null) {
                map.put(oVar.getView(), oVar);
                c(oVar.getChildFragmentManager().c.f(), map);
            }
        }
    }

    public final void b(FragmentManager fragmentManager, xy0 xy0Var) {
        Fragment fragment;
        if (Build.VERSION.SDK_INT >= 26) {
            for (Fragment fragment2 : fragmentManager.getFragments()) {
                if (fragment2.getView() != null) {
                    xy0Var.put(fragment2.getView(), fragment2);
                    b(fragment2.getChildFragmentManager(), xy0Var);
                }
            }
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Bundle bundle = this.h;
            bundle.putInt(PListParser.TAG_KEY, i);
            try {
                fragment = fragmentManager.getFragment(bundle, PListParser.TAG_KEY);
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                xy0Var.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager(), xy0Var);
            }
            i = i2;
        }
    }

    public final b1o d(Activity activity, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        c1o h = h(fragmentManager, fragment);
        b1o b1oVar = h.d;
        if (b1oVar != null) {
            return b1oVar;
        }
        a a = a.a(activity);
        vm7 vm7Var = h.a;
        z6n z6nVar = h.b;
        this.e.getClass();
        b1o b1oVar2 = new b1o(a, vm7Var, z6nVar, activity);
        if (z) {
            b1oVar2.b();
        }
        h.d = b1oVar2;
        return b1oVar2;
    }

    public final b1o e(Activity activity) {
        if (xut.i()) {
            return f(activity.getApplicationContext());
        }
        if (activity instanceof t) {
            return g((t) activity);
        }
        if (activity.isDestroyed()) {
            xq0.x("You cannot start a load for a destroyed activity");
            return null;
        }
        this.i.getClass();
        FragmentManager fragmentManager = activity.getFragmentManager();
        Activity a = a(activity);
        return d(activity, fragmentManager, null, a == null || !a.isFinishing());
    }

    public final b1o f(Context context) {
        if (context == null) {
            xq0.x("You cannot start a load on a null Context");
            return null;
        }
        char[] cArr = xut.a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof t) {
                return g((t) context);
            }
            if (context instanceof Activity) {
                return e((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return f(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        a a = a.a(context.getApplicationContext());
                        ddl ddlVar = this.e;
                        b2c b2cVar = new b2c();
                        aaw aawVar = new aaw(21);
                        Context applicationContext = context.getApplicationContext();
                        ddlVar.getClass();
                        this.a = new b1o(a, b2cVar, aawVar, applicationContext);
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    public final b1o g(t tVar) {
        if (xut.i()) {
            return f(tVar.getApplicationContext());
        }
        if (tVar.isDestroyed()) {
            xq0.x("You cannot start a load for a destroyed activity");
            return null;
        }
        this.i.getClass();
        Activity a = a(tVar);
        return this.j.j(tVar, a.a(tVar.getApplicationContext()), tVar.getLifecycle(), tVar.getSupportFragmentManager(), a == null || !a.isFinishing());
    }

    public final c1o h(FragmentManager fragmentManager, Fragment fragment) {
        HashMap hashMap = this.b;
        c1o c1oVar = (c1o) hashMap.get(fragmentManager);
        if (c1oVar != null) {
            return c1oVar;
        }
        c1o c1oVar2 = (c1o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (c1oVar2 == null) {
            c1oVar2 = new c1o();
            c1oVar2.f = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                c1oVar2.a(fragment.getActivity());
            }
            hashMap.put(fragmentManager, c1oVar2);
            fragmentManager.beginTransaction().add(c1oVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return c1oVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0123 A[ADDED_TO_REGION] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = message.arg1 == 1;
        int i = message.what;
        Handler handler = this.d;
        Object obj = null;
        if (i == 1) {
            FragmentManager fragmentManager3 = (FragmentManager) message.obj;
            HashMap hashMap = this.b;
            c1o c1oVar = (c1o) hashMap.get(fragmentManager3);
            c1o c1oVar2 = (c1o) fragmentManager3.findFragmentByTag("com.bumptech.glide.manager");
            if (c1oVar2 != c1oVar) {
                if (c1oVar2 != null && c1oVar2.d != null) {
                    throw new IllegalStateException("We've added two fragments with requests! Old: " + c1oVar2 + " New: " + c1oVar);
                }
                if (!z3 && !fragmentManager3.isDestroyed()) {
                    FragmentTransaction add = fragmentManager3.beginTransaction().add(c1oVar, "com.bumptech.glide.manager");
                    if (c1oVar2 != null) {
                        add.remove(c1oVar2);
                    }
                    add.commitAllowingStateLoss();
                    handler.obtainMessage(1, 1, 0, fragmentManager3).sendToTarget();
                    if (Log.isLoggable("RMRetriever", 3)) {
                        Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
                    }
                    z2 = true;
                    z = false;
                    fragmentManager2 = null;
                    if (Log.isLoggable("RMRetriever", 5)) {
                    }
                    return z2;
                }
                if (Log.isLoggable("RMRetriever", 5)) {
                    if (fragmentManager3.isDestroyed()) {
                        Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added");
                    } else {
                        Log.w("RMRetriever", "Tried adding Fragment twice and failed twice, giving up!");
                    }
                }
                c1oVar.a.e();
            }
            obj = hashMap.remove(fragmentManager3);
            fragmentManager = fragmentManager3;
            z2 = true;
            fragmentManager2 = fragmentManager;
            if (Log.isLoggable("RMRetriever", 5)) {
            }
            return z2;
        }
        if (i != 2) {
            z = false;
            fragmentManager2 = null;
            if (Log.isLoggable("RMRetriever", 5) && z && obj == null) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + fragmentManager2);
            }
            return z2;
        }
        y yVar = (y) message.obj;
        HashMap hashMap2 = this.c;
        psr psrVar = (psr) hashMap2.get(yVar);
        psr psrVar2 = (psr) yVar.D("com.bumptech.glide.manager");
        if (psrVar2 != psrVar) {
            if (!z3 && !yVar.L) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                aVar.d(0, psrVar, "com.bumptech.glide.manager", 1);
                if (psrVar2 != null) {
                    aVar.m(psrVar2);
                }
                if (aVar.i) {
                    xq0.q("This transaction is already being added to the back stack");
                    return false;
                }
                aVar.j = false;
                aVar.t.A(aVar, true);
                handler.obtainMessage(2, 1, 0, yVar).sendToTarget();
                if (Log.isLoggable("RMRetriever", 3)) {
                    Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
                }
                z2 = true;
                z = false;
                fragmentManager2 = null;
                if (Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + fragmentManager2);
                }
                return z2;
            }
            if (yVar.L) {
                if (Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                }
            } else if (Log.isLoggable("RMRetriever", 6)) {
                Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
            }
            psrVar.g.e();
        }
        obj = hashMap2.remove(yVar);
        fragmentManager = yVar;
        z2 = true;
        fragmentManager2 = fragmentManager;
        if (Log.isLoggable("RMRetriever", 5)) {
        }
        return z2;
    }
}
