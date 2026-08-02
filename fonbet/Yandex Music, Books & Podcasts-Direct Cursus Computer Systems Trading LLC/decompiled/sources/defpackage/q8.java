package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public abstract class q8 implements xjn {
    public final String a;
    public final Object b;
    public final Object c;
    public Object d;

    public q8(q8 q8Var, String str, String str2) {
        this.c = q8Var;
        this.a = str;
        this.b = str2;
        this.d = new LinkedList();
    }

    public static int g(String str, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e) {
            throw r7k.b(null, e);
        }
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e) {
            throw r7k.b(null, e);
        }
    }

    public static int i(String str, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new o9r(str, 0);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e) {
            throw r7k.b(null, e);
        }
    }

    public abstract Object b();

    public Object c(String str) {
        LinkedList linkedList = (LinkedList) this.d;
        for (int i = 0; i < linkedList.size(); i++) {
            Pair pair = (Pair) linkedList.get(i);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
        }
        q8 q8Var = (q8) this.c;
        if (q8Var == null) {
            return null;
        }
        return q8Var.c(str);
    }

    public boolean d(String str) {
        return false;
    }

    public Object e(XmlPullParser xmlPullParser) {
        boolean z = false;
        int i = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            q8 q8Var = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (((String) this.b).equals(name)) {
                    j(xmlPullParser);
                    z = true;
                } else if (z) {
                    if (i > 0) {
                        i++;
                    } else if (d(name)) {
                        j(xmlPullParser);
                    } else {
                        boolean equals = "QualityLevel".equals(name);
                        String str = this.a;
                        if (equals) {
                            q8Var = new q9r(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            q8Var = new p9r(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            q8Var = new s9r(this, str);
                        }
                        if (q8Var == null) {
                            i = 1;
                        } else {
                            a(q8Var.e(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z && i == 0) {
                    k(xmlPullParser);
                }
            } else if (!z) {
                continue;
            } else if (i > 0) {
                i--;
            } else {
                String name2 = xmlPullParser.getName();
                f(xmlPullParser);
                if (!d(name2)) {
                    return b();
                }
            }
            xmlPullParser.next();
        }
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, s9f s9fVar) {
        s9fVar.getClass();
        Object obj2 = this.d;
        if (obj2 != null) {
            return obj2;
        }
        Object m = m((SharedPreferences) this.b, this.c, this.a);
        this.d = m;
        return m;
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public void l(Object obj, String str) {
        ((LinkedList) this.d).add(Pair.create(str, obj));
    }

    public abstract Object m(SharedPreferences sharedPreferences, Object obj, String str);

    public abstract void n(SharedPreferences sharedPreferences, Object obj, String str);

    @Override // defpackage.xjn
    public void setValue(Object obj, s9f s9fVar, Object obj2) {
        s9fVar.getClass();
        this.d = obj2;
        n((SharedPreferences) this.b, obj2, this.a);
    }

    public q8(SharedPreferences sharedPreferences, Object obj, String str) {
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        this.c = obj;
        this.a = str;
    }

    public void a(Object obj) {
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public void k(XmlPullParser xmlPullParser) {
    }
}
