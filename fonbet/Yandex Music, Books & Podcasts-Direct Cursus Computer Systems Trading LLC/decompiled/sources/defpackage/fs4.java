package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fs4 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
    public final WeakReference a;
    public ArrayList b;
    public final HashSet c;
    public final String d;

    public fs4(View view, Handler handler, HashSet hashSet, String str) {
        handler.getClass();
        hashSet.getClass();
        this.a = new WeakReference(view);
        this.c = hashSet;
        this.d = str;
        handler.postDelayed(this, 200L);
    }

    public final void a(es4 es4Var, View view, qhb qhbVar) {
        View a = es4Var.a();
        if (a != null) {
            String str = es4Var.b;
            View.OnClickListener f = qeu.f(a);
            boolean z = (f instanceof zr4) && ((zr4) f).e;
            HashSet hashSet = this.c;
            if (hashSet.contains(str) || z) {
                return;
            }
            zr4 zr4Var = null;
            if (!bp6.a.contains(bs4.class)) {
                try {
                    zr4 zr4Var2 = new zr4();
                    zr4Var2.a = qhbVar;
                    zr4Var2.b = new WeakReference(a);
                    zr4Var2.c = new WeakReference(view);
                    zr4Var2.d = qeu.f(a);
                    zr4Var2.e = true;
                    zr4Var = zr4Var2;
                } catch (Throwable th) {
                    bp6.a(bs4.class, th);
                }
            }
            a.setOnClickListener(zr4Var);
            hashSet.add(str);
        }
    }

    public final void b(es4 es4Var, View view, qhb qhbVar) {
        AdapterView adapterView = (AdapterView) es4Var.a();
        if (adapterView != null) {
            String str = es4Var.b;
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            boolean z = (onItemClickListener instanceof as4) && ((as4) onItemClickListener).e;
            HashSet hashSet = this.c;
            if (hashSet.contains(str) || z) {
                return;
            }
            as4 as4Var = null;
            if (!bp6.a.contains(bs4.class)) {
                try {
                    as4 as4Var2 = new as4();
                    as4Var2.a = qhbVar;
                    as4Var2.b = new WeakReference(adapterView);
                    as4Var2.c = new WeakReference(view);
                    as4Var2.d = adapterView.getOnItemClickListener();
                    as4Var2.e = true;
                    as4Var = as4Var2;
                } catch (Throwable th) {
                    bp6.a(bs4.class, th);
                }
            }
            adapterView.setOnItemClickListener(as4Var);
            hashSet.add(str);
        }
    }

    public final void c(es4 es4Var, View view, qhb qhbVar) {
        View a = es4Var.a();
        if (a != null) {
            String str = es4Var.b;
            View.OnTouchListener g = qeu.g(a);
            boolean z = (g instanceof len) && ((len) g).e;
            HashSet hashSet = this.c;
            if (hashSet.contains(str) || z) {
                return;
            }
            len lenVar = null;
            if (!bp6.a.contains(men.class)) {
                try {
                    lenVar = new len(qhbVar, view, a);
                } catch (Throwable th) {
                    bp6.a(men.class, th);
                }
            }
            a.setOnTouchListener(lenVar);
            hashSet.add(str);
        }
    }

    public final void d() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            WeakReference weakReference = this.a;
            if (weakReference.get() != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    qhb qhbVar = (qhb) arrayList.get(i);
                    View view = (View) weakReference.get();
                    if (qhbVar != null) {
                        String str = qhbVar.d;
                        if (view != null) {
                            String str2 = this.d;
                            if (str == null || str.length() == 0 || str.equals(str2)) {
                                List unmodifiableList = Collections.unmodifiableList(qhbVar.b);
                                unmodifiableList.getClass();
                                if (unmodifiableList.size() <= 25) {
                                    Iterator it = j66.R(view, unmodifiableList, 0, -1, str2).iterator();
                                    while (it.hasNext()) {
                                        es4 es4Var = (es4) it.next();
                                        try {
                                            View a = es4Var.a();
                                            if (a != null) {
                                                View a2 = qeu.a(a);
                                                if (a2 != null && qeu.c.m(a, a2)) {
                                                    c(es4Var, view, qhbVar);
                                                } else if (!c.v(a.getClass().getName(), "com.facebook.react", false)) {
                                                    if (!(a instanceof AdapterView)) {
                                                        a(es4Var, view, qhbVar);
                                                    } else if (a instanceof ListView) {
                                                        b(es4Var, view, qhbVar);
                                                    }
                                                }
                                            }
                                        } catch (Exception unused) {
                                            bp6.a.contains(gs4.class);
                                            HashSet hashSet = j3c.a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            n8c b = q8c.b(j3c.c());
            if (b != null && b.g) {
                JSONArray jSONArray = b.h;
                ArrayList arrayList = new ArrayList();
                if (jSONArray != null) {
                    try {
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            jSONObject.getClass();
                            arrayList.add(quj.Q(jSONObject));
                        }
                    } catch (IllegalArgumentException | JSONException unused) {
                    }
                }
                this.b = arrayList;
                View view = (View) this.a.get();
                if (view != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    viewTreeObserver.getClass();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    d();
                }
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}
