package ru.CryptoPro.JCSP.MSCAPI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.params.DefaultCSPProvider;

/* loaded from: classes4.dex */
public class ReaderInfo implements Serializable {
    private static final String c = "ru.CryptoPro.JCSP.Pane.resources.panel";
    private static final ResourceBundle d = ResourceBundle.getBundle("ru.CryptoPro.JCSP.Pane.resources.panel");
    protected final Lock a;
    protected final Lock b;
    private final String e;
    private final int f;
    private final List g = new ArrayList(3);
    private final ReadWriteLock h;

    public ReaderInfo(String str, int i, List list) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.h = reentrantReadWriteLock;
        this.a = reentrantReadWriteLock.readLock();
        this.b = reentrantReadWriteLock.writeLock();
        this.e = str;
        this.f = i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            addProvider((cl_7) it.next());
        }
    }

    public void addProvider(cl_7 cl_7Var) {
        this.b.lock();
        try {
            if (!this.g.contains(cl_7Var)) {
                this.g.add(cl_7Var);
            }
        } finally {
            this.b.unlock();
        }
    }

    public boolean containsProviderType(int i) {
        this.a.lock();
        try {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                if (((cl_7) it.next()).b == i) {
                    this.a.unlock();
                    return true;
                }
            }
            this.a.unlock();
            return false;
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ReaderInfo)) {
            cl_9.a(this.e, ((ReaderInfo) obj).e, true);
        }
        return false;
    }

    public int getIndex() {
        return this.f;
    }

    public String getInfo() {
        StringBuffer stringBuffer = new StringBuffer("* ");
        ResourceBundle resourceBundle = d;
        stringBuffer.append(resourceBundle.getString("reader.name"));
        stringBuffer.append(" ");
        stringBuffer.append(this.e);
        stringBuffer.append("\n* ");
        stringBuffer.append(resourceBundle.getString("reader.alias"));
        stringBuffer.append(" ");
        stringBuffer.append(getReaderPseudo());
        stringBuffer.append("\n* ");
        stringBuffer.append(resourceBundle.getString("reader.providers"));
        stringBuffer.append("\n");
        this.a.lock();
        try {
            for (cl_7 cl_7Var : this.g) {
                stringBuffer.append("*** ");
                stringBuffer.append(cl_7Var.a);
                stringBuffer.append(Extension.COLON_SPACE);
                stringBuffer.append(cl_7Var.b);
                stringBuffer.append("\n");
            }
            this.a.unlock();
            return stringBuffer.toString();
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    public String getProviderName(int i) {
        this.a.lock();
        try {
            String str = null;
            int i2 = 0;
            for (cl_7 cl_7Var : this.g) {
                if (cl_7Var.b == i) {
                    str = cl_7Var.a;
                    i2++;
                }
            }
            if (i2 > 1) {
                String providerNameByType = DefaultCSPProvider.getProviderNameByType(i);
                for (cl_7 cl_7Var2 : this.g) {
                    if (cl_7Var2.a.equalsIgnoreCase(providerNameByType) && cl_7Var2.b == i) {
                        this.a.unlock();
                        return providerNameByType;
                    }
                }
                JCSPLogger.fine("WARNING: default pane provider " + providerNameByType + " does not support key store type " + this.e + ". Provider " + str + " has been chosen because it supports " + this.e);
            }
            this.a.unlock();
            return str;
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    public List getProviderNames(int i) {
        ArrayList arrayList = new ArrayList(3);
        this.a.lock();
        try {
            for (cl_7 cl_7Var : this.g) {
                if (cl_7Var.b == i) {
                    arrayList.add(cl_7Var.a);
                }
            }
            this.a.unlock();
            return Collections.unmodifiableList(arrayList);
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    public List getProviderTypes(String str, List list) {
        if (str == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.a.lock();
        try {
            for (cl_7 cl_7Var : this.g) {
                if (cl_7Var.a.equalsIgnoreCase(str)) {
                    arrayList.add(Integer.valueOf(cl_7Var.b));
                }
            }
            this.a.unlock();
            return Collections.unmodifiableList(arrayList);
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    public List getProviders() {
        this.a.lock();
        try {
            return Collections.unmodifiableList(this.g);
        } finally {
            this.a.unlock();
        }
    }

    public String getReaderName() {
        return this.e;
    }

    public String getReaderPseudo() {
        if (getIndex() < 0) {
            return getReaderName();
        }
        return getReaderName() + getIndex();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, Integer.valueOf(this.f)});
    }

    public String toString() {
        return this.e;
    }

    public List getProviderTypes() {
        ArrayList arrayList = new ArrayList();
        this.a.lock();
        try {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((cl_7) it.next()).b));
            }
            this.a.unlock();
            return Collections.unmodifiableList(arrayList);
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }
}
