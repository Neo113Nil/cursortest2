package X2;

import D.x;
import I1.d;
import O.InterfaceC0340j;
import O.W;
import O.X;
import Q7.j;
import R7.c;
import S0.f;
import S7.AbstractC0410y;
import S7.C0402p;
import X7.s;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.basead.exoplayer.k.p;
import f6.C4522a;
import f6.g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import k6.C4647a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.u;
import l6.i;
import n6.AbstractC4775a;
import n6.C4776b;
import n6.C4779e;
import p7.C4853a;
import w.AbstractC5128c;
import y6.C5210a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: n, reason: collision with root package name */
    public static Context f3756n = null;

    /* renamed from: u, reason: collision with root package name */
    public static Boolean f3757u = null;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f3758v = false;

    /* renamed from: w, reason: collision with root package name */
    public static Method f3759w = null;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f3760x = false;

    /* renamed from: y, reason: collision with root package name */
    public static Field f3761y;

    public static final void b(d dVar, String name, String value) {
        h.e(dVar, "<this>");
        h.e(name, "name");
        h.e(value, "value");
        ArrayList arrayList = dVar.f1308n;
        arrayList.add(name);
        arrayList.add(j.G0(value).toString());
    }

    public static final double c(double d9, c cVar, c targetUnit) {
        h.e(targetUnit, "targetUnit");
        long convert = targetUnit.f2897n.convert(1L, cVar.f2897n);
        return convert > 0 ? d9 * convert : d9 / r8.convert(1L, r9);
    }

    public static final long d(long j6, c sourceUnit, c targetUnit) {
        h.e(sourceUnit, "sourceUnit");
        h.e(targetUnit, "targetUnit");
        return targetUnit.f2897n.convert(j6, sourceUnit.f2897n);
    }

    public static final void e(int i, int i4) {
        if (i <= i4) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i4 + ").");
    }

    public static boolean f(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = X.f2142a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = W.f2138d;
        W w3 = (W) view.getTag(C5248R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (w3 == null) {
            w3 = new W();
            w3.f2139a = null;
            w3.f2140b = null;
            w3.f2141c = null;
            view.setTag(C5248R.id.tag_unhandled_key_event_manager, w3);
        }
        WeakReference weakReference2 = w3.f2141c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        w3.f2141c = new WeakReference(keyEvent);
        if (w3.f2140b == null) {
            w3.f2140b = new SparseArray();
        }
        SparseArray sparseArray = w3.f2140b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(C5248R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g(InterfaceC0340j interfaceC0340j, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z6 = false;
        if (interfaceC0340j != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0340j.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f3758v) {
                            try {
                                f3759w = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f3758v = true;
                        }
                        Method method = f3759w;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z6 = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z6) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (X.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f3760x) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f3761y = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f3760x = true;
                }
                Field field = f3761y;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (X.c(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && X.c(view, keyEvent)) || interfaceC0340j.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final C7.b h(Enum[] entries) {
        h.e(entries, "entries");
        return new C7.b(entries);
    }

    public static ArrayList i(G6.b bVar) {
        C4647a c4647a;
        int i = 1;
        ArrayList arrayList = new ArrayList();
        for (I6.d dVar : bVar.f1184v) {
            J6.b bVar2 = dVar.f1357v;
            String str = dVar.f1359x;
            if (str.isEmpty()) {
                str = null;
            }
            C4853a c4853a = C4853a.f39847c;
            K1.c cVar = new K1.c(i);
            if (str == null) {
                str = null;
            }
            cVar.d(f.r(bVar2.f1581v));
            C4853a a9 = C4853a.a(cVar.a(), str);
            for (I6.f fVar : dVar.f1358w) {
                H6.h hVar = fVar.f1361v;
                String str2 = hVar.f1267v;
                int i4 = Y6.a.f3909e;
                C4522a r9 = f.r(hVar.f1269x);
                String str3 = hVar.f1268w;
                if (str3.isEmpty()) {
                    str3 = null;
                }
                String str4 = fVar.f1363x;
                if (str4 == null) {
                    str4 = null;
                }
                Y6.a a10 = Y6.a.a(str2, str3, str4, r9);
                for (I6.b bVar3 : fVar.f1362w) {
                    long j6 = bVar3.f1351v;
                    byte b9 = (byte) (((byte) i) | 2);
                    i[] values = i.values();
                    int length = values.length;
                    int i6 = 0;
                    while (i6 < length) {
                        int i9 = i;
                        i iVar = values[i6];
                        if (iVar.f39000n == bVar3.f1353x.f1390n) {
                            H6.b bVar4 = bVar3.f1355z;
                            g a11 = bVar4 != null ? com.bumptech.glide.f.a(bVar4) : null;
                            C4522a r10 = f.r(bVar3.f1345A);
                            String c9 = bVar3.f1348D.c();
                            String c10 = bVar3.f1349E.c();
                            C4779e c4779e = C4779e.f39662c[((byte) (bVar3.f1347C & p.f9259b)) & 255];
                            C4776b c4776b = AbstractC4775a.f39659a;
                            if (c10 != null) {
                                C4647a c4647a2 = C4647a.f38601f;
                                if (c10.length() == 16 && !"0000000000000000".contentEquals(c10)) {
                                    char[] cArr = k6.f.f38616a;
                                    int length2 = c10.length();
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < length2) {
                                            if (!k6.f.f38618c[c10.charAt(i10)]) {
                                                break;
                                            }
                                            i10++;
                                        } else if (c9 != null && c9.length() == 32 && !"00000000000000000000000000000000".contentEquals(c9)) {
                                            int length3 = c9.length();
                                            for (int i11 = 0; i11 < length3; i11++) {
                                                if (k6.f.f38618c[c9.charAt(i11)]) {
                                                }
                                            }
                                            c4647a = new C4647a(c9, c10, c4779e, c4776b, true);
                                        }
                                    }
                                }
                            }
                            c4647a = new C4647a("00000000000000000000000000000000", "0000000000000000", c4779e, c4776b, false);
                            C4647a c4647a3 = c4647a;
                            int size = r10.size() + bVar3.f1346B;
                            byte b10 = (byte) (b9 | 4);
                            if (b10 != 7) {
                                StringBuilder sb = new StringBuilder();
                                if ((b10 & 1) == 0) {
                                    sb.append(" timestampEpochNanos");
                                }
                                if ((b10 & 2) == 0) {
                                    sb.append(" observedTimestampEpochNanos");
                                }
                                if ((b10 & 4) == 0) {
                                    sb.append(" totalAttributeCount");
                                }
                                throw new IllegalStateException("Missing required properties:" + ((Object) sb));
                            }
                            arrayList.add(new C5210a(a9, a10, j6, bVar3.f1352w, c4647a3, iVar, bVar3.f1354y, size, r10, a11, bVar3.f1350F));
                            i = i9;
                        } else {
                            i6++;
                            i = i9;
                        }
                    }
                    throw new IllegalArgumentException();
                }
            }
        }
        return arrayList;
    }

    public static final void k(String name) {
        h.e(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i = 0; i < length; i++) {
            char charAt = name.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                A8.b.f(16);
                String num = Integer.toString(charAt, 16);
                h.d(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(name);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void l(String value, String name) {
        h.e(value, "value");
        h.e(name, "name");
        int length = value.length();
        for (int i = 0; i < length; i++) {
            char charAt = value.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                A8.b.f(16);
                String num = Integer.toString(charAt, 16);
                h.d(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(name);
                sb.append(" value");
                sb.append(j8.c.i(name) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static synchronized boolean m(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f3756n;
            if (context2 != null && (bool = f3757u) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f3757u = null;
            if (V2.b.f()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f3757u = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f3757u = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f3757u = Boolean.FALSE;
                }
            }
            f3756n = applicationContext;
            return f3757u.booleanValue();
        }
    }

    public static final boolean p(String method) {
        h.e(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    public static final Object q(s sVar, s sVar2, I7.p pVar) {
        Object c0402p;
        Object K7;
        try {
            if (pVar instanceof B7.a) {
                u.b(2, pVar);
                c0402p = pVar.invoke(sVar2, sVar);
            } else {
                c0402p = A8.b.x(pVar, sVar2, sVar);
            }
        } catch (Throwable th) {
            c0402p = new C0402p(th, false);
        }
        A7.a aVar = A7.a.f215n;
        if (c0402p == aVar || (K7 = sVar.K(c0402p)) == AbstractC0410y.f3094e) {
            return aVar;
        }
        if (K7 instanceof C0402p) {
            throw ((C0402p) K7).f3066a;
        }
        return AbstractC0410y.w(K7);
    }

    public static String r(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i4 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i4, indexOf);
            sb.append(s(objArr[i]));
            i4 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(s(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String s(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e9) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String p9 = x.p(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(p9), (Throwable) e9);
            String name2 = e9.getClass().getName();
            StringBuilder sb = new StringBuilder(p9.length() + 8 + name2.length() + 1);
            AbstractC5128c.h(sb, "<", p9, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public abstract void j(G3.u uVar, float f2, float f9);

    public abstract View n(int i);

    public abstract boolean o();
}
