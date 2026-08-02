package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class zde extends eee {
    private static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(k5r.i(readInt, "Invalid key count "));
        }
        x0 x0Var = new x0(4);
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            Objects.requireNonNull(readObject);
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException(k5r.i(readInt2, "Invalid value count "));
            }
            tde u = yde.u();
            for (int i3 = 0; i3 < readInt2; i3++) {
                Object readObject2 = objectInputStream.readObject();
                Objects.requireNonNull(readObject2);
                u.a(readObject2);
            }
            x0Var.V(readObject, u.f());
            i += readInt2;
        }
        try {
            cee r = x0Var.r();
            kpm kpmVar = dee.a;
            kpmVar.getClass();
            try {
                ((Field) kpmVar.b).set(this, r);
                kpm kpmVar2 = dee.b;
                kpmVar2.getClass();
                try {
                    ((Field) kpmVar2.b).set(this, Integer.valueOf(i));
                } catch (IllegalAccessException e) {
                    xq0.w(e);
                }
            } catch (IllegalAccessException e2) {
                xq0.w(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(a().size());
        for (Map.Entry entry : a().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public final yde d(Object obj) {
        yde ydeVar = (yde) this.d.get(obj);
        if (ydeVar != null) {
            return ydeVar;
        }
        ude udeVar = yde.b;
        return qsn.e;
    }
}
