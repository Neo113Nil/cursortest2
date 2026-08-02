package defpackage;

import com.google.common.cache.b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class big implements Serializable {
    private static final long serialVersionUID = 1;
    public final b a;

    public big(b bVar) {
        this.a = bVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    public Object writeReplace() {
        return new cig(this.a);
    }
}
