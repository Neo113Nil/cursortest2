package com.google.firebase.sessions;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.aec;
import defpackage.afc;
import defpackage.bfc;
import defpackage.eg0;
import defpackage.fib;
import defpackage.ghh;
import defpackage.h73;
import defpackage.iec;
import defpackage.kac;
import defpackage.kn5;
import defpackage.m5n;
import defpackage.nj2;
import defpackage.o9t;
import defpackage.ox7;
import defpackage.s8a;
import defpackage.sec;
import defpackage.soe;
import defpackage.svn;
import defpackage.szm;
import defpackage.t77;
import defpackage.tec;
import defpackage.tvn;
import defpackage.u75;
import defpackage.uzm;
import defpackage.vm5;
import defpackage.vnj;
import defpackage.wxf;
import defpackage.zec;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lvm5;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "afc", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    @NotNull
    public static final String LIBRARY_NAME = "fire-sessions";

    @Deprecated
    @NotNull
    public static final String TAG = "FirebaseSessions";

    @NotNull
    private static final afc Companion = new afc();

    @NotNull
    private static final m5n appContext = m5n.a(Context.class);

    @NotNull
    private static final m5n firebaseApp = m5n.a(aec.class);

    @NotNull
    private static final m5n firebaseInstallationsApi = m5n.a(iec.class);

    @NotNull
    private static final m5n backgroundDispatcher = new m5n(nj2.class, a.class);

    @NotNull
    private static final m5n blockingDispatcher = new m5n(h73.class, a.class);

    @NotNull
    private static final m5n transportFactory = m5n.a(o9t.class);

    @NotNull
    private static final m5n firebaseSessionsComponent = m5n.a(tec.class);

    static {
        try {
            int i = zec.a;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sec getComponents$lambda$0(kn5 kn5Var) {
        return (sec) ((t77) ((tec) kn5Var.k(firebaseSessionsComponent))).i.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tec getComponents$lambda$1(kn5 kn5Var) {
        Object k = kn5Var.k(appContext);
        k.getClass();
        Object k2 = kn5Var.k(backgroundDispatcher);
        k2.getClass();
        Object k3 = kn5Var.k(blockingDispatcher);
        k3.getClass();
        Object k4 = kn5Var.k(firebaseApp);
        k4.getClass();
        Object k5 = kn5Var.k(firebaseInstallationsApi);
        k5.getClass();
        uzm j = kn5Var.j(transportFactory);
        j.getClass();
        t77 t77Var = new t77();
        t77Var.a = soe.a((aec) k4);
        soe a = soe.a((Context) k);
        t77Var.b = a;
        t77Var.c = s8a.a(new fib(a, 4));
        t77Var.d = soe.a((CoroutineContext) k2);
        t77Var.e = soe.a((iec) k5);
        szm a2 = s8a.a(new fib(t77Var.a, 1));
        t77Var.f = a2;
        t77Var.g = s8a.a(new svn(a2, t77Var.d, 0));
        t77Var.h = s8a.a(new svn(t77Var.c, s8a.a(new tvn((szm) t77Var.d, (szm) t77Var.e, t77Var.f, t77Var.g, s8a.a(new fib(s8a.a(new fib(t77Var.b, 2)), 6)))), 3));
        t77Var.i = s8a.a(new bfc(t77Var.a, t77Var.h, t77Var.d, s8a.a(new fib(t77Var.b, 5))));
        t77Var.j = s8a.a(new svn(t77Var.d, s8a.a(new fib(t77Var.b, 3)), 1));
        t77Var.k = s8a.a(new tvn(t77Var.a, (szm) t77Var.e, t77Var.h, s8a.a(new fib(soe.a(j), 0)), (szm) t77Var.d));
        t77Var.l = s8a.a(ghh.g);
        t77Var.m = s8a.a(new svn(t77Var.l, s8a.a(vnj.h), 2));
        return t77Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<vm5> getComponents() {
        eg0 b = vm5.b(sec.class);
        b.c = LIBRARY_NAME;
        b.a(ox7.a(firebaseSessionsComponent));
        b.f = new kac(9);
        b.j(2);
        vm5 b2 = b.b();
        eg0 b3 = vm5.b(tec.class);
        b3.c = "fire-sessions-component";
        b3.a(ox7.a(appContext));
        b3.a(ox7.a(backgroundDispatcher));
        b3.a(ox7.a(blockingDispatcher));
        b3.a(ox7.a(firebaseApp));
        b3.a(ox7.a(firebaseInstallationsApi));
        b3.a(new ox7(transportFactory, 1, 1));
        b3.f = new kac(10);
        return u75.h(b2, b3.b(), wxf.q(LIBRARY_NAME, "2.1.2"));
    }
}
