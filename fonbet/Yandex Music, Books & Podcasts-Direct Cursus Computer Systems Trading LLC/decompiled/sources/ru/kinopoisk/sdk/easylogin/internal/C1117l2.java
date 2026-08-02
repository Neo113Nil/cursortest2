package ru.kinopoisk.sdk.easylogin.internal;

import android.app.ActivityManager;
import android.content.Intent;
import defpackage.c5b;
import defpackage.r7o;
import defpackage.z7o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.l2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1117l2 {
    @NotNull
    public static final Intent a(@NotNull androidx.fragment.app.t tVar) {
        tVar.getClass();
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:11|(2:13|(4:15|16|17|18))|19|20|22|18|9) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0 = defpackage.z7o.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(@NotNull androidx.fragment.app.t tVar) {
        Intent intent;
        Intent intent2;
        tVar.getClass();
        Object systemService = tVar.getSystemService("activity");
        systemService.getClass();
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) systemService).getAppTasks();
        if (appTasks == null) {
            appTasks = c5b.a;
        }
        if (appTasks.size() <= 1) {
            appTasks = null;
        }
        if (appTasks != null) {
            for (ActivityManager.AppTask appTask : appTasks) {
                intent = appTask.getTaskInfo().baseIntent;
                if (!Intrinsics.d(intent.getAction(), "android.intent.action.MAIN")) {
                    intent2 = appTask.getTaskInfo().baseIntent;
                    if (!Intrinsics.d(intent2.getAction(), "android.intent.action.VIEW")) {
                        appTask.finishAndRemoveTask();
                    }
                }
                r7o r7oVar = z7o.b;
                appTask.moveToFront();
            }
        }
    }
}
