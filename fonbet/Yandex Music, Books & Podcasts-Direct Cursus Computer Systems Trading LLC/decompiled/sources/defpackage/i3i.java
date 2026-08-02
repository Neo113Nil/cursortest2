package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class i3i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public static final HashMap e = new HashMap();
    public final WeakReference c;
    public final LinkedHashSet a = new LinkedHashSet();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicBoolean d = new AtomicBoolean(false);

    public i3i(Activity activity) {
        this.c = new WeakReference(activity);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:6:0x0037). Please report as a decompilation issue!!! */
    public final void a(View view) {
        Set set = bp6.a;
        if (set.contains(this)) {
            return;
        }
        try {
            e8h e8hVar = new e8h(this, view, false, 5);
            if (!set.contains(this)) {
                try {
                    Thread currentThread = Thread.currentThread();
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    if (currentThread == mainLooper.getThread()) {
                        e8hVar.run();
                    } else {
                        this.b.post(e8hVar);
                    }
                } catch (Throwable th) {
                    bp6.a(this, th);
                }
            }
        } catch (Throwable th2) {
            bp6.a(this, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[Catch: all -> 0x00e6, TRY_LEAVE, TryCatch #1 {all -> 0x00e6, blocks: (B:4:0x000c, B:6:0x0019, B:8:0x0023, B:13:0x0032, B:15:0x0038, B:19:0x0042, B:20:0x005f, B:22:0x0065, B:24:0x0077, B:25:0x0086, B:28:0x0098, B:30:0x009e, B:33:0x00b0, B:60:0x00cd, B:65:0x00ac, B:38:0x00d3, B:51:0x00dd, B:42:0x00ea, B:43:0x00ee, B:46:0x00f8, B:71:0x0094, B:74:0x0101, B:77:0x0105, B:78:0x010c, B:79:0x010d, B:80:0x0114, B:68:0x0090, B:62:0x00a8, B:57:0x00bc), top: B:3:0x000c, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view) {
        String str;
        String str2;
        boolean z;
        LinkedHashSet linkedHashSet = this.a;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            String obj = ((EditText) view).getText().toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String obj2 = StringsKt.t0(obj).toString();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj2.toLowerCase();
            lowerCase.getClass();
            if (lowerCase.length() != 0 && !linkedHashSet.contains(lowerCase) && lowerCase.length() <= 100) {
                linkedHashSet.add(lowerCase);
                HashMap hashMap = new HashMap();
                ArrayList J = b3i.J(view);
                CopyOnWriteArraySet copyOnWriteArraySet = h3i.d;
                Iterator it = new HashSet(h3i.a()).iterator();
                ArrayList arrayList = null;
                while (it.hasNext()) {
                    h3i h3iVar = (h3i) it.next();
                    String replace = "r2".equals(h3iVar.c()) ? new Regex("[^\\d.]").replace(lowerCase, "") : lowerCase;
                    if (!bp6.a.contains(h3iVar)) {
                        try {
                            str = h3iVar.c;
                        } catch (Throwable th) {
                            bp6.a(h3iVar, th);
                        }
                        if (str.length() > 0) {
                            if (!bp6.a.contains(h3iVar)) {
                                try {
                                    str2 = h3iVar.c;
                                } catch (Throwable th2) {
                                    bp6.a(h3iVar, th2);
                                }
                                z = false;
                                if (!bp6.a.contains(b3i.class)) {
                                    try {
                                        replace.getClass();
                                        str2.getClass();
                                        z = new Regex(str2).e(replace);
                                    } catch (Throwable th3) {
                                        bp6.a(b3i.class, th3);
                                    }
                                }
                                if (z) {
                                }
                            }
                            str2 = null;
                            z = false;
                            if (!bp6.a.contains(b3i.class)) {
                            }
                            if (z) {
                            }
                        }
                        if (b3i.T(J, h3iVar.b())) {
                            if (arrayList == null) {
                                arrayList = b3i.H(view);
                            }
                            if (b3i.T(arrayList, h3iVar.b())) {
                                kjn.b(h3iVar.c(), hashMap, replace);
                            }
                        } else {
                            kjn.b(h3iVar.c(), hashMap, replace);
                        }
                    }
                    str = null;
                    if (str.length() > 0) {
                    }
                    if (b3i.T(J, h3iVar.b())) {
                    }
                }
                bg3.Y(hashMap);
            }
        } catch (Throwable th4) {
            bp6.a(this, th4);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (bp6.a.contains(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th) {
                bp6.a(this, th);
                return;
            }
        }
        if (view2 != null) {
            a(view2);
        }
    }
}
