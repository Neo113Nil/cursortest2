package com.gamericefishpro.space.e1;

import com.gamericefishpro.space.d0.p;
import com.gamericefishpro.space.t0.n;
import com.gamericefishpro.space.t0.r;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final com.gamericefishpro.space.u6.c a = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.d0.b(2), new p(19));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Object b(Object[] objArr, j jVar, Function0 function0, r rVar, int i) {
        return c(Arrays.copyOf(objArr, objArr.length), jVar, function0, rVar, 384 | ((i << 3) & 7168), 0);
    }

    public static final Object c(Object[] objArr, j jVar, Function0 function0, r rVar, int i, int i2) {
        Object[] objArr2;
        j jVar2;
        final Object obj;
        Object objE;
        final String string = Long.toString(rVar.T, CharsKt.checkRadix(36));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Intrinsics.c(jVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final f fVar = (f) rVar.j(h.a);
        Object objP = rVar.P();
        Object obj2 = n.a;
        if (objP == obj2) {
            Object objB = (fVar == null || (objE = fVar.e(string)) == null) ? null : jVar.b(objE);
            if (objB == null) {
                objB = function0.invoke();
            }
            objArr2 = objArr;
            jVar2 = jVar;
            Object bVar = new b(jVar2, fVar, string, objB, objArr2);
            rVar.k0(bVar);
            objP = bVar;
        } else {
            objArr2 = objArr;
            jVar2 = jVar;
        }
        final b bVar2 = (b) objP;
        Object objInvoke = Arrays.equals(objArr2, bVar2.w) ? bVar2.v : null;
        if (objInvoke == null) {
            objInvoke = function0.invoke();
        }
        boolean zH = rVar.h(bVar2) | ((((i & 112) ^ 48) > 32 && rVar.h(jVar2)) || (i & 48) == 32) | rVar.h(fVar) | rVar.f(string) | rVar.h(objInvoke) | rVar.h(objArr2);
        Object objP2 = rVar.P();
        if (zH || objP2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objInvoke;
            final j jVar3 = jVar2;
            Object obj3 = new Function0() { // from class: com.gamericefishpro.space.e1.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    b bVar3 = bVar2;
                    f fVar2 = bVar3.e;
                    f fVar3 = fVar;
                    boolean z2 = true;
                    if (fVar2 != fVar3) {
                        bVar3.e = fVar3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = bVar3.i;
                    String str2 = string;
                    if (Intrinsics.a(str, str2)) {
                        z2 = z;
                    } else {
                        bVar3.i = str2;
                    }
                    bVar3.d = jVar3;
                    bVar3.v = obj;
                    bVar3.w = objArr3;
                    e eVar = bVar3.y;
                    if (eVar != null && z2) {
                        ((com.gamericefishpro.space.a8.c) eVar).J();
                        bVar3.y = null;
                        bVar3.b();
                    }
                    return Unit.a;
                }
            };
            rVar.k0(obj3);
            objP2 = obj3;
        } else {
            obj = objInvoke;
        }
        com.gamericefishpro.space.t0.i.g((Function0) objP2, rVar);
        return obj;
    }

    public static final d d(r rVar) {
        rVar.a0(1967007413);
        Object[] objArr = new Object[0];
        Object objP = rVar.P();
        if (objP == n.a) {
            objP = new com.gamericefishpro.space.a5.h(12);
            rVar.k0(objP);
        }
        d dVar = (d) b(objArr, d.w, (Function0) objP, rVar, 384);
        dVar.i = (f) rVar.j(h.a);
        rVar.p(false);
        return dVar;
    }
}
