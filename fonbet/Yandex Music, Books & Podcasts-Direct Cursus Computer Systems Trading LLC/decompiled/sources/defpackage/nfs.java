package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public abstract class nfs {
    public static final js3 a = new js3("NO_THREAD_ELEMENTS", 2);
    public static final j1p b = new j1p(15);
    public static final j1p c = new j1p(16);
    public static final j1p d = new j1p(17);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof zfs)) {
            Object fold = coroutineContext.fold(null, c);
            fold.getClass();
            ((mfs) fold).restoreThreadContext(coroutineContext, obj);
            return;
        }
        zfs zfsVar = (zfs) obj;
        mfs[] mfsVarArr = zfsVar.c;
        int length = mfsVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            mfs mfsVar = mfsVarArr[length];
            mfsVar.getClass();
            mfsVar.restoreThreadContext(coroutineContext, zfsVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, b);
        fold.getClass();
        return fold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        return obj == 0 ? a : obj instanceof Integer ? coroutineContext.fold(new zfs(((Number) obj).intValue(), coroutineContext), d) : ((mfs) obj).updateThreadContext(coroutineContext);
    }
}
