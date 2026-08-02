package ru.CryptoPro.JCP.tools;

import defpackage.g8e;
import defpackage.oyr;
import java.util.AbstractCollection;
import java.util.Vector;
import ru.CryptoPro.JCP.pref.ConfigurationException;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
public abstract class ClassConfig {
    public static final String STRING_DELIMITER = ",";
    public final String a;
    public final String b;
    public final String c;
    public final JCPPref preferences;

    public ClassConfig(Class cls, String str, String str2, String str3) {
        this.preferences = new JCPPref(cls);
        this.b = str;
        this.c = str2;
        this.a = str3;
    }

    public final Vector a(String str, boolean[] zArr) {
        String[] split = str.split(",");
        Vector vector = new Vector();
        for (String str2 : split) {
            try {
                Object loadClass = loadClass(str2);
                if (loadClass != null) {
                    vector.add(loadClass);
                } else {
                    zArr[0] = false;
                }
            } catch (Throwable th) {
                JCPLogger.subThrown(th);
                zArr[0] = false;
            }
        }
        return vector;
    }

    public boolean addClass(String str) throws ConfigurationException {
        if (loadClass(str) != null) {
            return addClassUnchecked(str);
        }
        throw new ConfigurationException(this.a);
    }

    public boolean addClassUnchecked(String str) {
        String current = getCurrent();
        boolean z = false;
        for (String str2 : current.split(",")) {
            if (str2.equals(str)) {
                z = true;
            }
        }
        if (!z) {
            this.preferences.put(this.b, g8e.p(current, ",", str));
        }
        return !z;
    }

    public void clear() {
        this.preferences.remove(this.b);
    }

    public AbstractCollection convert(String str) {
        return a(str, new boolean[]{true});
    }

    public String getCurrent() {
        return this.preferences.get(this.b, getDefault());
    }

    public String getCurrentWithoutLogger() {
        return this.preferences.getWithoutLogger(this.b, getDefault());
    }

    public String getDefault() {
        return this.c;
    }

    public abstract boolean isValid(Class cls);

    public boolean isValid(String str) {
        boolean[] zArr = {true};
        a(str, zArr);
        return zArr[0];
    }

    public Object loadClass(String str) {
        Class<?> cls;
        String str2 = this.a;
        try {
            cls = Class.forName(str, false, ClassConfig.class.getClassLoader());
        } catch (ClassNotFoundException e) {
            JCPLogger.thrown(str2, e);
            cls = null;
        }
        if (cls == null || !isValid(cls)) {
            JCPLogger.thrown(str2, new Exception(oyr.p("Class ", str, " not found or not valid")));
            return null;
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e2) {
            JCPLogger.thrown(str2, e2);
            return null;
        }
    }

    public void removeClass(String str) {
        String[] split = getCurrent().split(",");
        StringBuffer stringBuffer = new StringBuffer(str.length() + 1);
        boolean z = false;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(str)) {
                z = true;
            } else {
                stringBuffer.append(split[i]);
                stringBuffer.append(",");
            }
        }
        if (z) {
            if (stringBuffer.length() <= 0) {
                clear();
            } else {
                this.preferences.put(this.b, stringBuffer.deleteCharAt(stringBuffer.length() - 1).toString());
            }
        }
    }

    public void resetDefault() {
        this.preferences.put(this.b, getDefault());
    }

    public void set(String str) throws ConfigurationException {
        if (!isValid(str)) {
            throw new ConfigurationException(this.a);
        }
        this.preferences.put(this.b, str);
    }

    public void setDefault() {
        this.preferences.put(this.b, getCurrent());
    }
}
