package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import defpackage.c3f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class t5f0 {
    public static final t5f0 a = new t5f0();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> list;
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = EmptyList.a;
        }
        List M = a.M(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : M) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
            i54 i54Var = new i54();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                ny61.t("Null processName");
                return null;
            }
            i54Var.a = str2;
            i54Var.b = runningAppProcessInfo.pid;
            byte b = (byte) (i54Var.e | 1);
            i54Var.c = runningAppProcessInfo.importance;
            i54Var.e = (byte) (b | 2);
            i54Var.d = jl40.l(str2, str);
            i54Var.e = (byte) (i54Var.e | 4);
            arrayList2.add(i54Var.a());
        }
        return arrayList2;
    }

    public final c3f.e.d.a.c b(Context context) {
        Object obj;
        String processName;
        int myPid = Process.myPid();
        Iterator it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((c3f.e.d.a.c) obj).b() == myPid) {
                break;
            }
        }
        c3f.e.d.a.c cVar = (c3f.e.d.a.c) obj;
        if (cVar != null) {
            return cVar;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                processName = "";
            }
        }
        i54 i54Var = new i54();
        i54Var.a = processName;
        i54Var.b = myPid;
        byte b = (byte) (i54Var.e | 1);
        i54Var.c = 0;
        i54Var.d = false;
        i54Var.e = (byte) (((byte) (b | 2)) | 4);
        return i54Var.a();
    }
}
