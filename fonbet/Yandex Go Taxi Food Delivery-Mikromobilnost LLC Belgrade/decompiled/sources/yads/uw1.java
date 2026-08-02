package yads;

import defpackage.pg61;
import defpackage.w511;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes7.dex */
public final class uw1 extends i {
    private static final long serialVersionUID = 0;
    public transient pg61 y;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.y = (pg61) objectInputStream.readObject();
        Map map = (Map) objectInputStream.readObject();
        this.w = map;
        this.x = 0;
        for (Collection collection : map.values()) {
            if (collection.isEmpty()) {
                w511.q();
                return;
            }
            this.x = collection.size() + this.x;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.y);
        objectOutputStream.writeObject(this.w);
    }
}
