package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class yme0 extends GeneratedMessageLite implements au10 {
    private static final yme0 DEFAULT_INSTANCE;
    private static volatile qf90 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private pqw strings_ = ivf0.w;

    static {
        yme0 yme0Var = new yme0();
        DEFAULT_INSTANCE = yme0Var;
        GeneratedMessageLite.m(yme0.class, yme0Var);
    }

    public static void p(yme0 yme0Var, Iterable iterable) {
        pqw pqwVar = yme0Var.strings_;
        if (!((q9) pqwVar).a) {
            int size = pqwVar.size();
            yme0Var.strings_ = ((ivf0) pqwVar).d(size == 0 ? 10 : size * 2);
        }
        List list = yme0Var.strings_;
        Charset charset = tqw.a;
        if (iterable instanceof j7y) {
            List c = ((j7y) iterable).c();
            if (list != null) {
                ny61.u();
                return;
            }
            list.size();
            Iterator it = c.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof ByteString) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                ByteString.f(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof k2f0) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size2 = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                    list.remove(size3);
                }
                ny61.t(str);
                return;
            }
            list.add(obj);
        }
    }

    public static yme0 q() {
        return DEFAULT_INSTANCE;
    }

    public static xme0 s() {
        return (xme0) ((l) DEFAULT_INSTANCE.f(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object f(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        qf90 qf90Var;
        switch (tme0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new yme0();
            case 2:
                return new xme0(DEFAULT_INSTANCE);
            case 3:
                return new v9i0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                qf90 qf90Var2 = PARSER;
                if (qf90Var2 != null) {
                    return qf90Var2;
                }
                synchronized (yme0.class) {
                    try {
                        qf90Var = PARSER;
                        if (qf90Var == null) {
                            qf90Var = new pxs(DEFAULT_INSTANCE);
                            PARSER = qf90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return qf90Var;
            case 6:
                return (byte) 1;
            default:
                w511.u();
            case 7:
                return null;
        }
    }

    public final pqw r() {
        return this.strings_;
    }
}
