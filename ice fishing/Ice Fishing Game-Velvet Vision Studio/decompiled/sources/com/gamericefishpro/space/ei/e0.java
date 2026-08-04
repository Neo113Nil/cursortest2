package com.gamericefishpro.space.ei;

import java.util.Collection;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class e0 {
    public static Collection a(Collection collection) {
        if ((collection instanceof com.gamericefishpro.space.fi.a) && !(collection instanceof com.gamericefishpro.space.fi.b)) {
            e(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return collection;
        } catch (ClassCastException e) {
            Intrinsics.g(e, e0.class.getName());
            throw e;
        }
    }

    public static Map b(Object obj) {
        if ((obj instanceof com.gamericefishpro.space.fi.a) && !(obj instanceof com.gamericefishpro.space.fi.e)) {
            e(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            Intrinsics.g(e, e0.class.getName());
            throw e;
        }
    }

    public static void c(int i, Object obj) {
        if (obj == null || d(i, obj)) {
            return;
        }
        e(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean d(int i, Object obj) {
        int arity;
        if (obj instanceof com.gamericefishpro.space.oh.d) {
            if (obj instanceof h) {
                arity = ((h) obj).getArity();
            } else if (obj instanceof Function0) {
                arity = 0;
            } else if (obj instanceof Function1) {
                arity = 1;
            } else if (obj instanceof Function2) {
                arity = 2;
            } else if (obj instanceof com.gamericefishpro.space.di.c) {
                arity = 3;
            } else if (obj instanceof com.gamericefishpro.space.di.d) {
                arity = 4;
            } else {
                boolean z = obj instanceof com.gamericefishpro.space.b1.e;
                if (z) {
                    arity = 5;
                } else if (z) {
                    arity = 6;
                } else if (z) {
                    arity = 7;
                } else if (z) {
                    arity = 8;
                } else if (z) {
                    arity = 9;
                } else if (z) {
                    arity = 10;
                } else if (z) {
                    arity = 11;
                } else if (z) {
                    arity = 13;
                } else if (z) {
                    arity = 14;
                } else if (z) {
                    arity = 15;
                } else if (z) {
                    arity = 16;
                } else if (z) {
                    arity = 17;
                } else if (z) {
                    arity = 18;
                } else if (z) {
                    arity = 19;
                } else if (z) {
                    arity = 20;
                } else {
                    arity = z ? 21 : -1;
                }
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    public static void e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        Intrinsics.g(classCastException, e0.class.getName());
        throw classCastException;
    }
}
