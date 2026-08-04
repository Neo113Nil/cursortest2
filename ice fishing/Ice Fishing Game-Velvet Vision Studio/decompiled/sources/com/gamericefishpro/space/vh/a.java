package com.gamericefishpro.space.vh;

import com.gamericefishpro.space.oh.n;
import com.gamericefishpro.space.oh.p;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements com.gamericefishpro.space.th.a, d, Serializable {
    private final com.gamericefishpro.space.th.a completion;

    public a(com.gamericefishpro.space.th.a aVar) {
        this.completion = aVar;
    }

    public com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        com.gamericefishpro.space.th.a aVar = this.completion;
        if (aVar instanceof d) {
            return (d) aVar;
        }
        return null;
    }

    public final com.gamericefishpro.space.th.a getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Intrinsics.checkNotNullParameter(this, "<this>");
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        f.a.getClass();
        Intrinsics.checkNotNullParameter(this, "continuation");
        com.gamericefishpro.space.r5.b bVar = f.c;
        com.gamericefishpro.space.r5.b bVar2 = f.b;
        if (bVar == null) {
            try {
                com.gamericefishpro.space.r5.b bVar3 = new com.gamericefishpro.space.r5.b(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 7);
                f.c = bVar3;
                bVar = bVar3;
            } catch (Exception unused2) {
                f.c = bVar2;
                bVar = bVar2;
            }
        }
        if (bVar != bVar2 && (method = (Method) bVar.e) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) bVar.i) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) bVar.v;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // com.gamericefishpro.space.th.a
    public final void resumeWith(Object obj) {
        com.gamericefishpro.space.th.a frame = this;
        while (true) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            a aVar = (a) frame;
            com.gamericefishpro.space.th.a aVar2 = aVar.completion;
            Intrinsics.b(aVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == com.gamericefishpro.space.uh.a.d) {
                    return;
                } else {
                    n nVar = p.d;
                }
            } catch (Throwable th) {
                n nVar2 = p.d;
                obj = com.gamericefishpro.space.wa.b.q(th);
            }
            aVar.releaseIntercepted();
            if (!(aVar2 instanceof a)) {
                aVar2.resumeWith(obj);
                return;
            }
            frame = aVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
