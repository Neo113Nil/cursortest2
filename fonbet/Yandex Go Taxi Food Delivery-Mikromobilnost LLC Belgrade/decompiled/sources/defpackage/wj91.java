package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes11.dex */
public abstract class wj91 {
    public static final y60 a = new y60(18);

    public static final asw a(vv90 vv90Var) {
        asw aswVar = vv90Var instanceof asw ? (asw) vv90Var : null;
        if (aswVar != null) {
            return aswVar;
        }
        kbs.g("Incorrect PaymentApi provided");
        return null;
    }

    public static void b(tt5 tt5Var, final prr prrVar) {
        xv10 xv10Var;
        rs10 ld2Var = (prrVar == null || (xv10Var = prrVar.a) == null) ? new ld2() : xv10Var.f();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", ld2Var, obj);
        if (prrVar != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: jsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i2 = i;
                    prr prrVar2 = prrVar;
                    switch (i2) {
                        case 0:
                            long longValue = ((Long) ((List) obj2).get(0)).longValue();
                            try {
                                xv10 xv10Var2 = prrVar2.a;
                                ((w4u) xv10Var2.b).j(longValue, (orr) xv10Var2.x);
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            List list = (List) obj2;
                            orr orrVar = (orr) list.get(0);
                            String str = (String) list.get(1);
                            try {
                                prrVar2.getClass();
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            try {
                                String[] list2 = orrVar.a.list(str);
                                g2 = Collections.singletonList(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                ce5Var.a(g2);
                                return;
                            } catch (IOException e) {
                                throw new RuntimeException(e.getMessage());
                            }
                        default:
                            List list3 = (List) obj2;
                            orr orrVar2 = (orr) list3.get(0);
                            String str2 = (String) list3.get(1);
                            try {
                                prrVar2.getClass();
                                g3 = Collections.singletonList(((psr) orrVar2.b.a).c(str2));
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", ld2Var, obj);
        if (prrVar != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: jsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i2;
                    prr prrVar2 = prrVar;
                    switch (i22) {
                        case 0:
                            long longValue = ((Long) ((List) obj2).get(0)).longValue();
                            try {
                                xv10 xv10Var2 = prrVar2.a;
                                ((w4u) xv10Var2.b).j(longValue, (orr) xv10Var2.x);
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            List list = (List) obj2;
                            orr orrVar = (orr) list.get(0);
                            String str = (String) list.get(1);
                            try {
                                prrVar2.getClass();
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            try {
                                String[] list2 = orrVar.a.list(str);
                                g2 = Collections.singletonList(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                ce5Var.a(g2);
                                return;
                            } catch (IOException e) {
                                throw new RuntimeException(e.getMessage());
                            }
                        default:
                            List list3 = (List) obj2;
                            orr orrVar2 = (orr) list3.get(0);
                            String str2 = (String) list3.get(1);
                            try {
                                prrVar2.getClass();
                                g3 = Collections.singletonList(((psr) orrVar2.b.a).c(str2));
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", ld2Var, obj);
        if (prrVar == null) {
            m2vVar3.G(null);
        } else {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: jsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i3;
                    prr prrVar2 = prrVar;
                    switch (i22) {
                        case 0:
                            long longValue = ((Long) ((List) obj2).get(0)).longValue();
                            try {
                                xv10 xv10Var2 = prrVar2.a;
                                ((w4u) xv10Var2.b).j(longValue, (orr) xv10Var2.x);
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            List list = (List) obj2;
                            orr orrVar = (orr) list.get(0);
                            String str = (String) list.get(1);
                            try {
                                prrVar2.getClass();
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            try {
                                String[] list2 = orrVar.a.list(str);
                                g2 = Collections.singletonList(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                ce5Var.a(g2);
                                return;
                            } catch (IOException e) {
                                throw new RuntimeException(e.getMessage());
                            }
                        default:
                            List list3 = (List) obj2;
                            orr orrVar2 = (orr) list3.get(0);
                            String str2 = (String) list3.get(1);
                            try {
                                prrVar2.getClass();
                                g3 = Collections.singletonList(((psr) orrVar2.b.a).c(str2));
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                    }
                }
            });
        }
    }

    public static final void c(View view) {
        view.requestFocus();
        view.post(new ce0(view, 10));
    }

    public static final List d(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return EmptyList.a;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            u5y u5yVar = (u5y) arrayList.get(i3);
            int index = u5yVar.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(u5yVar);
            }
        }
        xcc.q(arrayList2, a);
        return arrayList2;
    }

    public static final Context e(int i, Context context) {
        return i == 0 ? context : new ContextThemeWrapper(context, i);
    }
}
