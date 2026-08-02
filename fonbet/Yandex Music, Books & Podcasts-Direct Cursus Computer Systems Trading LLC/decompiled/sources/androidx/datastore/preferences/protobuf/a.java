package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0000a;
import androidx.datastore.preferences.protobuf.j;
import defpackage.awf;
import defpackage.jj4;
import defpackage.wzh;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0000a<MessageType, BuilderType>> implements wzh {
    protected int memoizedHashCode;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0000a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0000a<MessageType, BuilderType>> implements Cloneable {
    }

    public static void a(Iterable iterable, List list) {
        Charset charset = u.a;
        if (iterable instanceof awf) {
            List e = ((awf) iterable).e();
            awf awfVar = (awf) list;
            int size = list.size();
            for (Object obj : e) {
                if (obj == null) {
                    String str = "Element at index " + (awfVar.size() - size) + " is null.";
                    for (int size2 = awfVar.size() - 1; size2 >= size; size2--) {
                        awfVar.remove(size2);
                    }
                    jj4.j(str);
                    return;
                }
                if (obj instanceof g) {
                    awfVar.J((g) obj);
                } else {
                    awfVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof m0) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                jj4.j(str2);
                return;
            }
            list.add(obj2);
        }
    }

    public final int b(r0 r0Var) {
        s sVar = (s) this;
        int i = sVar.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int e = r0Var.e(this);
        sVar.memoizedSerializedSize = e;
        return e;
    }

    public final void c(OutputStream outputStream) {
        s sVar = (s) this;
        int g = sVar.g();
        Logger logger = j.b;
        if (g > 4096) {
            g = 4096;
        }
        j.c cVar = new j.c(outputStream, g);
        sVar.m(cVar);
        if (cVar.f > 0) {
            cVar.K();
        }
    }
}
