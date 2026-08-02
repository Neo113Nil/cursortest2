package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* loaded from: classes5.dex */
public final class xnb implements Serializable {
    private static final long serialVersionUID = -6024911025449780478L;
    public Throwable a;
    public ArrayList b = new ArrayList();
    public ArrayList c = new ArrayList();
    public HashMap d = new HashMap();

    public xnb(RuntimeException runtimeException) {
        this.a = runtimeException;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.a = (Throwable) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        this.b = new ArrayList(readInt);
        this.c = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.b.add((jqg) objectInputStream.readObject());
            int readInt2 = objectInputStream.readInt();
            Object[] objArr = new Object[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                objArr[i2] = objectInputStream.readObject();
            }
            this.c.add(objArr);
        }
        int readInt3 = objectInputStream.readInt();
        this.d = new HashMap();
        for (int i3 = 0; i3 < readInt3; i3++) {
            this.d.put((String) objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.a);
        int size = this.b.size();
        objectOutputStream.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutputStream.writeObject((jqg) this.b.get(i));
            Object[] objArr = (Object[]) this.c.get(i);
            objectOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (obj instanceof Serializable) {
                    objectOutputStream.writeObject(obj);
                } else {
                    objectOutputStream.writeObject("[Object could not be serialized: " + obj.getClass().getName() + "]");
                }
            }
        }
        objectOutputStream.writeInt(this.d.keySet().size());
        for (String str : this.d.keySet()) {
            objectOutputStream.writeObject(str);
            Object obj2 = this.d.get(str);
            if (obj2 instanceof Serializable) {
                objectOutputStream.writeObject(obj2);
            } else {
                objectOutputStream.writeObject("[Object could not be serialized: " + obj2.getClass().getName() + "]");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Locale locale) {
        String str;
        ResourceBundle bundle;
        StringBuilder sb = new StringBuilder();
        int size = this.b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jqg jqgVar = (jqg) this.b.get(i2);
            Object[] objArr = (Object[]) this.c.get(i2);
            jqgVar.getClass();
            try {
                bundle = ResourceBundle.getBundle("assets/" + jqg.class.getName().replaceAll("\\.", "/"), locale);
            } catch (MissingResourceException unused) {
            }
            if (bundle.getLocale().getLanguage().equals(locale.getLanguage())) {
                str = bundle.getString(jqgVar.toString());
                sb.append(new MessageFormat(str, locale).format(objArr));
                i++;
                if (i >= size) {
                    sb.append(": ");
                }
            }
            str = jqgVar.a;
            sb.append(new MessageFormat(str, locale).format(objArr));
            i++;
            if (i >= size) {
            }
        }
        return sb.toString();
    }
}
