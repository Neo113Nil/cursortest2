package com.yandex.passport.internal.storage;

import defpackage.ca8;
import defpackage.dq7;
import defpackage.hip;
import defpackage.mn7;
import defpackage.nm6;
import defpackage.pjt;
import defpackage.q5b;
import defpackage.x97;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class q implements hip {
    public static final q a = new q();
    public static final q5b b = q5b.a;

    @Override // defpackage.hip
    public final Object a() {
        return b;
    }

    @Override // defpackage.hip
    public final Object b(Object obj, OutputStream outputStream, Continuation continuation) {
        dq7 dq7Var = ca8.a;
        Object V = x97.V(mn7.d, new a(outputStream, (Set) obj, null, 2), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.hip
    public final Object c(FileInputStream fileInputStream, Continuation continuation) {
        dq7 dq7Var = ca8.a;
        return x97.V(mn7.d, new pjt(fileInputStream, null, 18), continuation);
    }
}
