package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class atm {
    public static final atm a = new atm();

    public static ArrayList a(Context context) {
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = c5b.a;
        }
        ArrayList O = CollectionsKt.O(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        Iterator it = O.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            oc2 oc2Var = new oc2();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                jj4.j("Null processName");
                return null;
            }
            oc2Var.a = str2;
            oc2Var.b = runningAppProcessInfo.pid;
            byte b = (byte) (oc2Var.e | 1);
            oc2Var.c = runningAppProcessInfo.importance;
            oc2Var.e = (byte) (b | 2);
            oc2Var.d = Intrinsics.d(str2, str);
            oc2Var.e = (byte) (oc2Var.e | 4);
            arrayList2.add(oc2Var.a());
        }
        return arrayList2;
    }

    public final dq6 b(Context context) {
        Object obj;
        String str;
        context.getClass();
        int myPid = Process.myPid();
        Iterator it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((pc2) ((dq6) obj)).b == myPid) {
                break;
            }
        }
        dq6 dq6Var = (dq6) obj;
        if (dq6Var != null) {
            return dq6Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            str = Process.myProcessName();
            str.getClass();
        } else if (i < 28 || (str = Application.getProcessName()) == null) {
            str = "";
        }
        oc2 oc2Var = new oc2();
        oc2Var.a = str;
        oc2Var.b = myPid;
        byte b = (byte) (oc2Var.e | 1);
        oc2Var.c = 0;
        oc2Var.d = false;
        oc2Var.e = (byte) (((byte) (b | 2)) | 4);
        return oc2Var.a();
    }
}
