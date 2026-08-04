package com.gamericefishpro.space.hj;

import com.gamericefishpro.space.f1.h;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public final com.gamericefishpro.space.fj.a a;

    public b(com.gamericefishpro.space.fj.a beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
        this.a = beanDefinition;
    }

    public Object a(com.gamericefishpro.space.b1.d context) throws h {
        Intrinsics.checkNotNullParameter(context, "context");
        com.gamericefishpro.space.g1.b bVar = (com.gamericefishpro.space.g1.b) context.d;
        StringBuilder sb = new StringBuilder("| (+) '");
        com.gamericefishpro.space.fj.a aVar = this.a;
        sb.append(aVar);
        sb.append('\'');
        bVar.i(sb.toString());
        try {
            com.gamericefishpro.space.lj.a aVar2 = (com.gamericefishpro.space.lj.a) context.v;
            if (aVar2 == null) {
                aVar2 = new com.gamericefishpro.space.lj.a(3, null);
            }
            return aVar.c.invoke((com.gamericefishpro.space.pj.a) context.e, aVar2);
        } catch (Exception parent) {
            Intrinsics.checkNotNullParameter(parent, "e");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(parent);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = parent.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                if (StringsKt.r(className, "sun.reflect")) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb2.append(CollectionsKt.A(arrayList, "\n\t", null, null, null, 62));
            String msg = "* Instance creation error : could not create instance for '" + aVar + "': " + sb2.toString();
            bVar.getClass();
            Intrinsics.checkNotNullParameter(msg, "msg");
            bVar.m(com.gamericefishpro.space.ij.a.v, msg);
            String msg2 = "Could not create instance for '" + aVar + '\'';
            Intrinsics.checkNotNullParameter(msg2, "msg");
            Intrinsics.checkNotNullParameter(parent, "parent");
            throw new h(msg2, parent);
        }
    }

    public abstract Object b(com.gamericefishpro.space.b1.d dVar);
}
