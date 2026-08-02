package k;

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
import g.AbstractC4528a;
import java.io.IOException;
import l.p;
import m.AbstractC4707j0;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4632i extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f38546e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f38547f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f38548a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f38549b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f38550c;

    /* renamed from: d, reason: collision with root package name */
    public Object f38551d;

    static {
        Class[] clsArr = {Context.class};
        f38546e = clsArr;
        f38547f = clsArr;
    }

    public C4632i(Context context) {
        super(context);
        this.f38550c = context;
        Object[] objArr = {context};
        this.f38548a = objArr;
        this.f38549b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v59 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r42;
        int i;
        XmlResourceParser xmlResourceParser2;
        boolean z6;
        ColorStateList colorStateList;
        C4631h c4631h = new C4631h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            i = 2;
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
        boolean z9 = false;
        boolean z10 = false;
        String str = null;
        while (!z9) {
            if (eventType == r42) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z10 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z6 = r42;
                        z10 = false;
                        str = null;
                        eventType = xmlResourceParser2.next();
                        r42 = z6;
                        i = 2;
                        z10 = z10;
                    } else if (name2.equals("group")) {
                        c4631h.f38522b = 0;
                        c4631h.f38523c = 0;
                        c4631h.f38524d = 0;
                        c4631h.f38525e = 0;
                        c4631h.f38526f = r42;
                        c4631h.f38527g = r42;
                    } else if (name2.equals("item")) {
                        if (!c4631h.f38528h) {
                            p pVar = c4631h.f38545z;
                            if (pVar == null || !pVar.f38786b.hasSubMenu()) {
                                c4631h.f38528h = r42;
                                c4631h.b(c4631h.f38521a.add(c4631h.f38522b, c4631h.i, c4631h.f38529j, c4631h.f38530k));
                            } else {
                                c4631h.f38528h = r42;
                                c4631h.b(c4631h.f38521a.addSubMenu(c4631h.f38522b, c4631h.i, c4631h.f38529j, c4631h.f38530k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlResourceParser2 = xmlResourceParser;
                        z6 = r42;
                        z9 = z6;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z6 = r42;
            } else {
                if (!z10) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C4632i c4632i = c4631h.f38520E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c4632i.f38550c.obtainStyledAttributes(attributeSet, AbstractC4528a.f37565q);
                        c4631h.f38522b = obtainStyledAttributes.getResourceId(r42, 0);
                        c4631h.f38523c = obtainStyledAttributes.getInt(3, 0);
                        c4631h.f38524d = obtainStyledAttributes.getInt(4, 0);
                        c4631h.f38525e = obtainStyledAttributes.getInt(5, 0);
                        c4631h.f38526f = obtainStyledAttributes.getBoolean(2, r42);
                        c4631h.f38527g = obtainStyledAttributes.getBoolean(0, r42);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            l4.g r9 = l4.g.r(c4632i.f38550c, attributeSet, AbstractC4528a.f37566r);
                            TypedArray typedArray = (TypedArray) r9.f38917v;
                            c4631h.i = typedArray.getResourceId(2, 0);
                            c4631h.f38529j = (typedArray.getInt(5, c4631h.f38523c) & (-65536)) | (typedArray.getInt(6, c4631h.f38524d) & 65535);
                            c4631h.f38530k = typedArray.getText(7);
                            c4631h.f38531l = typedArray.getText(8);
                            c4631h.f38532m = typedArray.getResourceId(0, 0);
                            String string = typedArray.getString(9);
                            c4631h.f38533n = string == null ? (char) 0 : string.charAt(0);
                            c4631h.f38534o = typedArray.getInt(16, 4096);
                            String string2 = typedArray.getString(10);
                            c4631h.f38535p = string2 == null ? (char) 0 : string2.charAt(0);
                            c4631h.f38536q = typedArray.getInt(20, 4096);
                            if (typedArray.hasValue(11)) {
                                c4631h.f38537r = typedArray.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c4631h.f38537r = c4631h.f38525e;
                            }
                            c4631h.f38538s = typedArray.getBoolean(3, false);
                            c4631h.f38539t = typedArray.getBoolean(4, c4631h.f38526f);
                            c4631h.f38540u = typedArray.getBoolean(1, c4631h.f38527g);
                            c4631h.f38541v = typedArray.getInt(21, -1);
                            c4631h.f38544y = typedArray.getString(12);
                            c4631h.f38542w = typedArray.getResourceId(13, 0);
                            c4631h.f38543x = typedArray.getString(15);
                            String string3 = typedArray.getString(14);
                            boolean z11 = string3 != null;
                            if (z11 && c4631h.f38542w == 0 && c4631h.f38543x == null) {
                                c4631h.f38545z = (p) c4631h.a(string3, f38547f, c4632i.f38549b);
                            } else {
                                if (z11) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c4631h.f38545z = null;
                            }
                            c4631h.f38516A = typedArray.getText(17);
                            c4631h.f38517B = typedArray.getText(22);
                            if (typedArray.hasValue(19)) {
                                c4631h.f38519D = AbstractC4707j0.b(typedArray.getInt(19, -1), c4631h.f38519D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                c4631h.f38519D = null;
                            }
                            if (typedArray.hasValue(18)) {
                                c4631h.f38518C = r9.h(18);
                            } else {
                                c4631h.f38518C = colorStateList;
                            }
                            r9.t();
                            c4631h.f38528h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            z6 = true;
                        } else if (name3.equals("menu")) {
                            z6 = true;
                            c4631h.f38528h = true;
                            SubMenu addSubMenu = c4631h.f38521a.addSubMenu(c4631h.f38522b, c4631h.i, c4631h.f38529j, c4631h.f38530k);
                            c4631h.b(addSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            b(xmlResourceParser2, attributeSet, addSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            z6 = true;
                            str = name3;
                            z10 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r42 = z6;
                        i = 2;
                        z10 = z10;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z6 = r42;
            }
            eventType = xmlResourceParser2.next();
            r42 = z6;
            i = 2;
            z10 = z10;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof l.m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z6 = false;
        try {
            try {
                xmlResourceParser = this.f38550c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof l.m) {
                    l.m mVar = (l.m) menu;
                    if (!mVar.f38739I) {
                        mVar.w();
                        z6 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z6) {
                    ((l.m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th) {
            if (z6) {
                ((l.m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
