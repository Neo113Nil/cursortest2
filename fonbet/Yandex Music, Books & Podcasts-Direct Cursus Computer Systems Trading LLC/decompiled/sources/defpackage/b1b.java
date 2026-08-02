package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class b1b {
    public static final int a = Color.argb(230, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE);
    public static final int b = Color.argb(128, 27, 27, 27);

    public static final void a(hn5 hn5Var, zyr zyrVar, zyr zyrVar2) {
        hn5Var.getClass();
        View decorView = hn5Var.getWindow().getDecorView();
        decorView.getClass();
        Function1 function1 = zyrVar.d;
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) function1.invoke(resources)).booleanValue();
        Function1 function12 = zyrVar2.d;
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean booleanValue2 = ((Boolean) function12.invoke(resources2)).booleanValue();
        int i = Build.VERSION.SDK_INT;
        vnj g1bVar = i >= 30 ? new g1b() : i >= 29 ? new f1b() : i >= 28 ? new e1b() : i >= 26 ? new d1b() : new c1b();
        Window window = hn5Var.getWindow();
        window.getClass();
        g1bVar.Q(zyrVar, zyrVar2, window, decorView, booleanValue, booleanValue2);
        Window window2 = hn5Var.getWindow();
        window2.getClass();
        g1bVar.h(window2);
    }

    public static void b(hq0 hq0Var) {
        rvr rvrVar = rvr.t;
        a(hq0Var, new zyr(0, 0, 0, rvrVar), new zyr(a, b, 0, rvrVar));
    }
}
