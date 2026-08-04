package com.gamericefishpro.space.aj;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.ei.g;
import com.gamericefishpro.space.f5.d0;
import com.gamericefishpro.space.f5.l;
import com.gamericefishpro.space.fj.c;
import com.gamericefishpro.space.hj.d;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.r;
import com.gamericefishpro.space.u6.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;

    public /* synthetic */ a(Context context, int i) {
        this.d = i;
        this.e = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.jj.a module = (com.gamericefishpro.space.jj.a) obj;
                Intrinsics.checkNotNullParameter(module, "$this$module");
                final Context context = this.e;
                if (context instanceof Application) {
                    final int i = 0;
                    Function2 function2 = new Function2() { // from class: com.gamericefishpro.space.aj.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            com.gamericefishpro.space.pj.a single = (com.gamericefishpro.space.pj.a) obj2;
                            com.gamericefishpro.space.lj.a it = (com.gamericefishpro.space.lj.a) obj3;
                            switch (i) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    Intrinsics.checkNotNullParameter(single, "$this$single");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return (Application) context;
                                default:
                                    Intrinsics.checkNotNullParameter(single, "$this$single");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return context;
                            }
                        }
                    };
                    com.gamericefishpro.space.mj.b bVar = com.gamericefishpro.space.nj.a.e;
                    com.gamericefishpro.space.fj.a beanDefinition = new com.gamericefishpro.space.fj.a(bVar, b0.a(Application.class), function2, com.gamericefishpro.space.fj.b.d, g0.d);
                    Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
                    d factory = new d(beanDefinition);
                    module.a(factory);
                    c cVar = new c(module, factory);
                    g clazz = b0.a(Context.class);
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    Intrinsics.checkNotNullParameter(clazz, "clazz");
                    ArrayList arrayListE = CollectionsKt.E(beanDefinition.e, clazz);
                    Intrinsics.checkNotNullParameter(arrayListE, "<set-?>");
                    beanDefinition.e = arrayListE;
                    String mapping = com.gamericefishpro.space.qj.a.a(clazz) + "::" + bVar;
                    Intrinsics.checkNotNullParameter(mapping, "mapping");
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    module.c.put(mapping, factory);
                } else {
                    final int i2 = 1;
                    com.gamericefishpro.space.fj.a beanDefinition2 = new com.gamericefishpro.space.fj.a(com.gamericefishpro.space.nj.a.e, b0.a(Context.class), new Function2() { // from class: com.gamericefishpro.space.aj.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            com.gamericefishpro.space.pj.a single = (com.gamericefishpro.space.pj.a) obj2;
                            com.gamericefishpro.space.lj.a it = (com.gamericefishpro.space.lj.a) obj3;
                            switch (i2) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    Intrinsics.checkNotNullParameter(single, "$this$single");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return (Application) context;
                                default:
                                    Intrinsics.checkNotNullParameter(single, "$this$single");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return context;
                            }
                        }
                    }, com.gamericefishpro.space.fj.b.d, g0.d);
                    Intrinsics.checkNotNullParameter(beanDefinition2, "beanDefinition");
                    d factory2 = new d(beanDefinition2);
                    module.a(factory2);
                    Intrinsics.checkNotNullParameter(module, "module");
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                }
                return Unit.a;
            default:
                Bundle source = (Bundle) obj;
                d0 d0VarT = d5.t(this.e);
                if (source != null) {
                    source.setClassLoader(d0VarT.a.getClassLoader());
                }
                com.gamericefishpro.space.i5.g gVar = d0VarT.b;
                LinkedHashMap linkedHashMap = gVar.m;
                if (source == null) {
                    bool = null;
                } else {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:navigatorState", "key");
                    gVar.d = source.containsKey("android-support-nav:controller:navigatorState") ? f.B("android-support-nav:controller:navigatorState", source) : null;
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:backStack", "key");
                    gVar.e = source.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) f.C("android-support-nav:controller:backStack", source).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackDestIds", "key");
                    if (source.containsKey("android-support-nav:controller:backStackDestIds")) {
                        Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackIds", "key");
                        if (source.containsKey("android-support-nav:controller:backStackIds")) {
                            Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackDestIds", "key");
                            int[] intArray = source.getIntArray("android-support-nav:controller:backStackDestIds");
                            if (intArray == null) {
                                com.gamericefishpro.space.wa.b.K("android-support-nav:controller:backStackDestIds");
                                throw null;
                            }
                            Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackIds", "key");
                            ArrayList<String> stringArrayList = source.getStringArrayList("android-support-nav:controller:backStackIds");
                            if (stringArrayList == null) {
                                com.gamericefishpro.space.wa.b.K("android-support-nav:controller:backStackIds");
                                throw null;
                            }
                            int length = intArray.length;
                            int i3 = 0;
                            int i4 = 0;
                            while (i3 < length) {
                                int i5 = i4 + 1;
                                com.gamericefishpro.space.i5.g gVar2 = gVar;
                                gVar.l.put(Integer.valueOf(intArray[i3]), !Intrinsics.a(stringArrayList.get(i4), "") ? stringArrayList.get(i4) : null);
                                i3++;
                                i4 = i5;
                                gVar = gVar2;
                            }
                        }
                    }
                    bool = null;
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackStates", "key");
                    if (source.containsKey("android-support-nav:controller:backStackStates")) {
                        Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackStates", "key");
                        ArrayList<String> stringArrayList2 = source.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            com.gamericefishpro.space.wa.b.K("android-support-nav:controller:backStackStates");
                            throw null;
                        }
                        int size = stringArrayList2.size();
                        int i6 = 0;
                        while (i6 < size) {
                            String str = stringArrayList2.get(i6);
                            i6++;
                            String str2 = str;
                            if (f.n("android-support-nav:controller:backStackStates:" + str2, source)) {
                                ArrayList arrayListC = f.C("android-support-nav:controller:backStackStates:" + str2, source);
                                r rVar = new r(arrayListC.size());
                                int size2 = arrayListC.size();
                                int i7 = 0;
                                while (i7 < size2) {
                                    Object obj2 = arrayListC.get(i7);
                                    i7++;
                                    rVar.addLast(new l((Bundle) obj2));
                                }
                                linkedHashMap.put(str2, rVar);
                            }
                        }
                    }
                }
                if (source != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:deepLinkHandled", "key");
                    boolean z = source.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean boolValueOf = (z || !source.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : bool;
                    d0VarT.e = boolValueOf != null ? boolValueOf.booleanValue() : false;
                }
                return d0VarT;
        }
    }
}
