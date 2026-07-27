package f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import c.AbstractC0097a;
import d.AbstractC0110a;
import g.j;
import h.AbstractC0180y;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: f.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f1913e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f1914f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1915a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1916b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1917c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1918d;

    static {
        Class[] clsArr = {Context.class};
        f1913e = clsArr;
        f1914f = clsArr;
    }

    public C0139d(Context context) {
        super(context);
        this.f1917c = context;
        Object[] objArr = {context};
        this.f1915a = objArr;
        this.f1916b = objArr;
    }

    public static Object a(Context context) {
        return context instanceof Activity ? context : context instanceof ContextWrapper ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0211, code lost:
    
        if (r4 != null) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r5;
        int i2;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        C0138c c0138c = new C0138c(this, menu);
        Menu menu2 = c0138c.f1888a;
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r5 = 1;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == r5) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        z2 = r5;
                        z4 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r5 = z2;
                        i2 = 2;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        c0138c.f1889b = 0;
                        c0138c.f1890c = 0;
                        c0138c.f1891d = 0;
                        c0138c.f1892e = 0;
                        c0138c.f1893f = r5;
                        c0138c.f1894g = r5;
                    } else if (name2.equals("item")) {
                        if (!c0138c.f1895h) {
                            c0138c.f1895h = r5;
                            c0138c.b(menu2.add(c0138c.f1889b, c0138c.f1896i, c0138c.f1897j, c0138c.f1898k));
                        }
                    } else if (name2.equals("menu")) {
                        z2 = r5;
                        z3 = z2;
                    }
                }
                z2 = r5;
            } else {
                if (!z4) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C0139d c0139d = c0138c.f1887D;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c0139d.f1917c.obtainStyledAttributes(attributeSet, AbstractC0097a.f1648l);
                        c0138c.f1889b = obtainStyledAttributes.getResourceId(r5, 0);
                        c0138c.f1890c = obtainStyledAttributes.getInt(3, 0);
                        c0138c.f1891d = obtainStyledAttributes.getInt(4, 0);
                        c0138c.f1892e = obtainStyledAttributes.getInt(5, 0);
                        c0138c.f1893f = obtainStyledAttributes.getBoolean(2, r5);
                        c0138c.f1894g = obtainStyledAttributes.getBoolean(0, r5);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0139d.f1917c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f1649m);
                            c0138c.f1896i = obtainStyledAttributes2.getResourceId(2, 0);
                            c0138c.f1897j = (obtainStyledAttributes2.getInt(5, c0138c.f1890c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0138c.f1891d) & 65535);
                            c0138c.f1898k = obtainStyledAttributes2.getText(7);
                            c0138c.f1899l = obtainStyledAttributes2.getText(8);
                            c0138c.f1900m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c0138c.f1901n = string == null ? (char) 0 : string.charAt(0);
                            c0138c.f1902o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c0138c.f1903p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0138c.f1904q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0138c.r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0138c.r = c0138c.f1892e;
                            }
                            c0138c.f1905s = obtainStyledAttributes2.getBoolean(3, false);
                            c0138c.f1906t = obtainStyledAttributes2.getBoolean(4, c0138c.f1893f);
                            c0138c.f1907u = obtainStyledAttributes2.getBoolean(1, c0138c.f1894g);
                            c0138c.f1908v = obtainStyledAttributes2.getInt(21, -1);
                            c0138c.f1911y = obtainStyledAttributes2.getString(12);
                            c0138c.f1909w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0138c.f1910x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && c0138c.f1909w == 0 && c0138c.f1910x == null) {
                                if (c0138c.a(string3, f1914f, c0139d.f1916b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z5) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c0138c.f1912z = obtainStyledAttributes2.getText(17);
                            c0138c.f1884A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0138c.f1886C = AbstractC0180y.c(obtainStyledAttributes2.getInt(19, -1), c0138c.f1886C);
                            } else {
                                c0138c.f1886C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (obtainStyledAttributes2.hasValue(18) && (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) != 0) {
                                    Object obj = AbstractC0110a.f1780a;
                                    colorStateList = context.getColorStateList(resourceId);
                                }
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                c0138c.f1885B = colorStateList;
                            } else {
                                c0138c.f1885B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0138c.f1895h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            c0138c.f1895h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(c0138c.f1889b, c0138c.f1896i, c0138c.f1897j, c0138c.f1898k);
                            c0138c.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r5 = z2;
                        i2 = 2;
                        z4 = z4;
                    }
                }
                z2 = r5;
            }
            eventType = xmlResourceParser.next();
            r5 = z2;
            i2 = 2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof j)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f1917c.getResources().getLayout(i2);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
