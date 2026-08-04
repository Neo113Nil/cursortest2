package com.gamericefishpro.space.f5;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h2.w1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public y(p0 navigator, String str) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.a = navigator;
        this.b = str;
        this.c = new LinkedHashMap();
        this.e = new ArrayList();
        this.d = new LinkedHashMap();
    }

    public x a() {
        x xVarC = c();
        xVarC.getClass();
        w1 w1Var = xVarC.e;
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            String argumentName = (String) entry.getKey();
            i argument = (i) entry.getValue();
            Intrinsics.checkNotNullParameter(argumentName, "argumentName");
            Intrinsics.checkNotNullParameter(argument, "argument");
            w1Var.getClass();
            Intrinsics.checkNotNullParameter(argumentName, "argumentName");
            Intrinsics.checkNotNullParameter(argument, "argument");
            ((LinkedHashMap) w1Var.d).put(argumentName, argument);
        }
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            final v navDeepLink = (v) obj;
            Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
            w1Var.getClass();
            Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
            final int i2 = 0;
            ArrayList arrayListE = h.e((LinkedHashMap) w1Var.d, new Function1() { // from class: com.gamericefishpro.space.i5.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    boolean zContains;
                    String key = (String) obj2;
                    switch (i2) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            Intrinsics.checkNotNullParameter(key, "key");
                            zContains = navDeepLink.c().contains(key);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(key, "key");
                            zContains = navDeepLink.c().contains(key);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListE.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + navDeepLink.a + " can't be used to open destination " + ((x) w1Var.b) + ".\nFollowing required arguments are missing: " + arrayListE).toString());
            }
            ((ArrayList) w1Var.c).add(navDeepLink);
        }
        for (Map.Entry entry2 : ((LinkedHashMap) this.d).entrySet()) {
            int iIntValue = ((Number) entry2.getKey()).intValue();
            if (entry2.getValue() != null) {
                throw new ClassCastException();
            }
            Intrinsics.checkNotNullParameter(null, "action");
            if (xVarC instanceof a) {
                throw new UnsupportedOperationException("Cannot add action " + iIntValue + " to " + xVarC + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            }
            if (iIntValue == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            xVarC.v.e(iIntValue, null);
        }
        String str = (String) this.b;
        if (str != null) {
            w1Var.getClass();
            if (StringsKt.u(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String uriPattern = "android-app://androidx.navigation/".concat(str);
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            final v vVar = new v(uriPattern);
            final int i3 = 1;
            ArrayList arrayListE2 = h.e((LinkedHashMap) w1Var.d, new Function1() { // from class: com.gamericefishpro.space.i5.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    boolean zContains;
                    String key = (String) obj2;
                    switch (i3) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            Intrinsics.checkNotNullParameter(key, "key");
                            zContains = vVar.c().contains(key);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(key, "key");
                            zContains = vVar.c().contains(key);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListE2.isEmpty()) {
                StringBuilder sbL = com.gamericefishpro.space.m5.a.l("Cannot set route \"", str, "\" for destination ");
                sbL.append((x) w1Var.b);
                sbL.append(". Following required arguments are missing: ");
                sbL.append(arrayListE2);
                throw new IllegalArgumentException(sbL.toString().toString());
            }
            w1Var.f = com.gamericefishpro.space.oh.i.b(new com.gamericefishpro.space.a3.b(10, uriPattern));
            w1Var.a = uriPattern.hashCode();
            w1Var.e = str;
        }
        return xVarC;
    }

    public abstract Object b();

    public x c() {
        return ((p0) this.a).a();
    }

    public void d(com.gamericefishpro.space.r6.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.c) {
            try {
                if (((LinkedHashSet) this.d).remove(listener) && ((LinkedHashSet) this.d).isEmpty()) {
                    g();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                ((com.gamericefishpro.space.c8.p) ((com.gamericefishpro.space.r5.b) this.a).v).execute(new com.gamericefishpro.space.bb.h(11, CollectionsKt.L((LinkedHashSet) this.d), this));
                Unit unit = Unit.a;
            }
        }
    }

    public abstract void f();

    public abstract void g();

    public y(Context context, com.gamericefishpro.space.r5.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }
}
