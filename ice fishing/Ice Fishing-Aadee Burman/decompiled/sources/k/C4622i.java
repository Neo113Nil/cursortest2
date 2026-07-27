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
import g.AbstractC4518a;
import java.io.IOException;
import l.p;
import m.AbstractC4694j0;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4622i extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f38534e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f38535f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f38536a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f38537b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f38538c;

    /* renamed from: d, reason: collision with root package name */
    public Object f38539d;

    static {
        Class[] clsArr = {Context.class};
        f38534e = clsArr;
        f38535f = clsArr;
    }

    public C4622i(Context context) {
        super(context);
        this.f38538c = context;
        Object[] objArr = {context};
        this.f38536a = objArr;
        this.f38537b = objArr;
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
        boolean z3;
        ColorStateList colorStateList;
        C4621h c4621h = new C4621h(this, menu);
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
        boolean z6 = false;
        boolean z9 = false;
        String str = null;
        while (!z6) {
            if (eventType == r42) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z9 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z3 = r42;
                        z9 = false;
                        str = null;
                        eventType = xmlResourceParser2.next();
                        r42 = z3;
                        i = 2;
                        z9 = z9;
                    } else if (name2.equals("group")) {
                        c4621h.f38510b = 0;
                        c4621h.f38511c = 0;
                        c4621h.f38512d = 0;
                        c4621h.f38513e = 0;
                        c4621h.f38514f = r42;
                        c4621h.f38515g = r42;
                    } else if (name2.equals("item")) {
                        if (!c4621h.f38516h) {
                            p pVar = c4621h.f38533z;
                            if (pVar == null || !pVar.f38859b.hasSubMenu()) {
                                c4621h.f38516h = r42;
                                c4621h.b(c4621h.f38509a.add(c4621h.f38510b, c4621h.i, c4621h.f38517j, c4621h.f38518k));
                            } else {
                                c4621h.f38516h = r42;
                                c4621h.b(c4621h.f38509a.addSubMenu(c4621h.f38510b, c4621h.i, c4621h.f38517j, c4621h.f38518k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlResourceParser2 = xmlResourceParser;
                        z3 = r42;
                        z6 = z3;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z3 = r42;
            } else {
                if (!z9) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C4622i c4622i = c4621h.f38508E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c4622i.f38538c.obtainStyledAttributes(attributeSet, AbstractC4518a.f37603q);
                        c4621h.f38510b = obtainStyledAttributes.getResourceId(r42, 0);
                        c4621h.f38511c = obtainStyledAttributes.getInt(3, 0);
                        c4621h.f38512d = obtainStyledAttributes.getInt(4, 0);
                        c4621h.f38513e = obtainStyledAttributes.getInt(5, 0);
                        c4621h.f38514f = obtainStyledAttributes.getBoolean(2, r42);
                        c4621h.f38515g = obtainStyledAttributes.getBoolean(0, r42);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            j4.g r9 = j4.g.r(c4622i.f38538c, attributeSet, AbstractC4518a.f37604r);
                            TypedArray typedArray = (TypedArray) r9.f38405v;
                            c4621h.i = typedArray.getResourceId(2, 0);
                            c4621h.f38517j = (typedArray.getInt(5, c4621h.f38511c) & (-65536)) | (typedArray.getInt(6, c4621h.f38512d) & 65535);
                            c4621h.f38518k = typedArray.getText(7);
                            c4621h.f38519l = typedArray.getText(8);
                            c4621h.f38520m = typedArray.getResourceId(0, 0);
                            String string = typedArray.getString(9);
                            c4621h.f38521n = string == null ? (char) 0 : string.charAt(0);
                            c4621h.f38522o = typedArray.getInt(16, 4096);
                            String string2 = typedArray.getString(10);
                            c4621h.f38523p = string2 == null ? (char) 0 : string2.charAt(0);
                            c4621h.f38524q = typedArray.getInt(20, 4096);
                            if (typedArray.hasValue(11)) {
                                c4621h.f38525r = typedArray.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c4621h.f38525r = c4621h.f38513e;
                            }
                            c4621h.f38526s = typedArray.getBoolean(3, false);
                            c4621h.f38527t = typedArray.getBoolean(4, c4621h.f38514f);
                            c4621h.f38528u = typedArray.getBoolean(1, c4621h.f38515g);
                            c4621h.f38529v = typedArray.getInt(21, -1);
                            c4621h.f38532y = typedArray.getString(12);
                            c4621h.f38530w = typedArray.getResourceId(13, 0);
                            c4621h.f38531x = typedArray.getString(15);
                            String string3 = typedArray.getString(14);
                            boolean z10 = string3 != null;
                            if (z10 && c4621h.f38530w == 0 && c4621h.f38531x == null) {
                                c4621h.f38533z = (p) c4621h.a(string3, f38535f, c4622i.f38537b);
                            } else {
                                if (z10) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c4621h.f38533z = null;
                            }
                            c4621h.f38504A = typedArray.getText(17);
                            c4621h.f38505B = typedArray.getText(22);
                            if (typedArray.hasValue(19)) {
                                c4621h.f38507D = AbstractC4694j0.b(typedArray.getInt(19, -1), c4621h.f38507D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                c4621h.f38507D = null;
                            }
                            if (typedArray.hasValue(18)) {
                                c4621h.f38506C = r9.h(18);
                            } else {
                                c4621h.f38506C = colorStateList;
                            }
                            r9.t();
                            c4621h.f38516h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            z3 = true;
                        } else if (name3.equals("menu")) {
                            z3 = true;
                            c4621h.f38516h = true;
                            SubMenu addSubMenu = c4621h.f38509a.addSubMenu(c4621h.f38510b, c4621h.i, c4621h.f38517j, c4621h.f38518k);
                            c4621h.b(addSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            b(xmlResourceParser2, attributeSet, addSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            z3 = true;
                            str = name3;
                            z9 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r42 = z3;
                        i = 2;
                        z9 = z9;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z3 = r42;
            }
            eventType = xmlResourceParser2.next();
            r42 = z3;
            i = 2;
            z9 = z9;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof l.m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z3 = false;
        try {
            try {
                xmlResourceParser = this.f38538c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof l.m) {
                    l.m mVar = (l.m) menu;
                    if (!mVar.f38812I) {
                        mVar.w();
                        z3 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z3) {
                    ((l.m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th) {
            if (z3) {
                ((l.m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
