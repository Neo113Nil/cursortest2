package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public final class ygi extends g7 {
    private static final long serialVersionUID = 0;
    public transient yqr f;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        Objects.requireNonNull(readObject);
        this.f = (yqr) readObject;
        Object readObject2 = objectInputStream.readObject();
        Objects.requireNonNull(readObject2);
        Map map = (Map) readObject2;
        this.d = map;
        this.e = 0;
        for (Collection collection : map.values()) {
            o2g.L(!collection.isEmpty());
            this.e = collection.size() + this.e;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f);
        objectOutputStream.writeObject(this.d);
    }

    @Override // defpackage.y7
    public final Map d() {
        Map map = this.d;
        return map instanceof NavigableMap ? new r7(this, (NavigableMap) this.d) : map instanceof SortedMap ? new u7(this, (SortedMap) this.d) : new p7(this, this.d);
    }

    @Override // defpackage.y7
    public final Collection e() {
        return (List) this.f.get();
    }

    @Override // defpackage.y7
    public final Set f() {
        Map map = this.d;
        return map instanceof NavigableMap ? new s7(this, (NavigableMap) this.d) : map instanceof SortedMap ? new v7(this, (SortedMap) this.d) : new q7(this, this.d);
    }
}
