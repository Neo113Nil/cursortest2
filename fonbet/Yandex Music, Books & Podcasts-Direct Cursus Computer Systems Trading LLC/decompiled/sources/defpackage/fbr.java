package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fbr extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fbr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be A[Catch: Exception -> 0x0114, TRY_LEAVE, TryCatch #7 {Exception -> 0x0114, blocks: (B:25:0x0075, B:29:0x0088, B:34:0x0098, B:40:0x00be, B:42:0x00d8, B:46:0x00f3, B:48:0x00f8, B:49:0x011f, B:64:0x014b, B:69:0x0116, B:72:0x00ea, B:77:0x00d5, B:82:0x00b6, B:88:0x0084, B:85:0x0080, B:74:0x00d1, B:79:0x00ae, B:44:0x00dd, B:52:0x012f, B:59:0x0146, B:55:0x0136), top: B:24:0x0075, inners: #0, #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.TimerTask, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        WeakReference weakReference;
        Activity activity;
        boolean z;
        BasePendingResult basePendingResult;
        int i = this.a;
        Object[] objArr = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                tao taoVar = (tao) obj;
                taoVar.d = Boolean.TRUE;
                ArrayList a = tao.a(taoVar);
                for (int i2 = 0; i2 < a.size(); i2++) {
                    vjp vjpVar = (vjp) a.get(i2);
                    if (vjpVar != null) {
                        ((pwe) taoVar.c).onFound(vjpVar);
                    }
                }
                break;
            case 1:
                seu seuVar = (seu) obj;
                try {
                    Handler handler = null;
                    if (!bp6.a.contains(seu.class)) {
                        try {
                            weakReference = seuVar.b;
                        } catch (Throwable th) {
                            bp6.a(seu.class, th);
                        }
                        activity = (Activity) weakReference.get();
                        View E = ot0.E(activity);
                        if (activity != null && E != null) {
                            Object simpleName = activity.getClass().getSimpleName();
                            teu teuVar = ds4.a;
                            if (!bp6.a.contains(ds4.class)) {
                                try {
                                    z = ds4.f.get();
                                } catch (Throwable th2) {
                                    bp6.a(ds4.class, th2);
                                }
                                if (!z) {
                                    break;
                                } else {
                                    FutureTask futureTask = new FutureTask(new z68(E));
                                    if (!bp6.a.contains(seu.class)) {
                                        try {
                                            handler = seuVar.a;
                                        } catch (Throwable th3) {
                                            bp6.a(seu.class, th3);
                                        }
                                    }
                                    handler.post(futureTask);
                                    Object obj2 = "";
                                    try {
                                        obj2 = (String) futureTask.get(1L, TimeUnit.SECONDS);
                                    } catch (Exception e) {
                                        Log.e(seu.a(), "Failed to take screenshot.", e);
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("screenname", simpleName);
                                        jSONObject.put("screenshot", obj2);
                                        JSONArray jSONArray = new JSONArray();
                                        jSONArray.put(qeu.d(E));
                                        jSONObject.put("view", jSONArray);
                                    } catch (JSONException unused) {
                                        Log.e(seu.a(), "Failed to create JSONObject");
                                    }
                                    String jSONObject2 = jSONObject.toString();
                                    jSONObject2.getClass();
                                    Set set = bp6.a;
                                    if (!set.contains(seu.class)) {
                                        try {
                                            if (!set.contains(seuVar)) {
                                                try {
                                                    j3c.d().execute(new e8h(seuVar, jSONObject2, objArr == true ? 1 : 0, 26));
                                                    break;
                                                } catch (Throwable th4) {
                                                    bp6.a(seuVar, th4);
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            bp6.a(seu.class, th5);
                                            return;
                                        }
                                    }
                                }
                            }
                            z = false;
                            if (!z) {
                            }
                        }
                    }
                    weakReference = null;
                    activity = (Activity) weakReference.get();
                    View E2 = ot0.E(activity);
                    if (activity != null) {
                        Object simpleName2 = activity.getClass().getSimpleName();
                        teu teuVar2 = ds4.a;
                        if (!bp6.a.contains(ds4.class)) {
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                } catch (Exception e2) {
                    Log.e(seu.a(), "UI Component tree indexing failure!", e2);
                    return;
                }
                break;
            case 2:
                ((x0q) obj).a(Boolean.TRUE);
                break;
            case 3:
                v3x v3xVar = (v3x) obj;
                xun xunVar = v3xVar.e;
                HashSet hashSet = v3xVar.a;
                msg msgVar = xun.l;
                xunVar.x(hashSet);
                xunVar.b.postDelayed(this, v3xVar.b);
                break;
            default:
                wmh wmhVar = (wmh) obj;
                ArrayDeque arrayDeque = (ArrayDeque) wmhVar.h;
                if (!arrayDeque.isEmpty() && ((BasePendingResult) wmhVar.k) == null && wmhVar.a != 0) {
                    xun xunVar2 = (xun) wmhVar.c;
                    int[] e3 = d94.e(arrayDeque);
                    xunVar2.getClass();
                    y1g.B("Must be called from the main thread.");
                    if (xunVar2.y()) {
                        r1x r1xVar = new r1x(xunVar2, e3);
                        xun.z(r1xVar);
                        basePendingResult = r1xVar;
                    } else {
                        basePendingResult = xun.t();
                    }
                    wmhVar.k = basePendingResult;
                    basePendingResult.h(new dfx(wmhVar, 1));
                    arrayDeque.clear();
                    break;
                }
                break;
        }
    }
}
