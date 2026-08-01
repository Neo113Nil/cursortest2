package k;

import a.AbstractC0078a;
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
import g.AbstractC0155a;
import java.io.IOException;
import l.MenuC0229m;
import l.p;
import m.AbstractC0265l0;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184h extends MenuInflater {
    public static final Class[] e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f3354f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3355a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3356b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3357c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3358d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f3354f = clsArr;
    }

    public C0184h(Context context) {
        super(context);
        this.f3357c = context;
        Object[] objArr = {context};
        this.f3355a = objArr;
        this.f3356b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        C0183g c0183g = new C0183g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
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
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        z2 = r4;
                        z4 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r4 = z2;
                        i = 2;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        c0183g.f3332b = 0;
                        c0183g.f3333c = 0;
                        c0183g.f3334d = 0;
                        c0183g.e = 0;
                        c0183g.f3335f = r4;
                        c0183g.f3336g = r4;
                    } else if (name2.equals("item")) {
                        if (!c0183g.f3337h) {
                            p pVar = c0183g.f3353z;
                            if (pVar == null || !pVar.f3760b.hasSubMenu()) {
                                c0183g.f3337h = r4;
                                c0183g.b(c0183g.f3331a.add(c0183g.f3332b, c0183g.i, c0183g.j, c0183g.f3338k));
                            } else {
                                c0183g.f3337h = r4;
                                c0183g.b(c0183g.f3331a.addSubMenu(c0183g.f3332b, c0183g.i, c0183g.j, c0183g.f3338k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z2 = r4;
                        z3 = z2;
                    }
                }
                z2 = r4;
            } else {
                if (!z4) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C0184h c0184h = c0183g.f3330E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c0184h.f3357c.obtainStyledAttributes(attributeSet, AbstractC0155a.f3046p);
                        c0183g.f3332b = obtainStyledAttributes.getResourceId(r4, 0);
                        c0183g.f3333c = obtainStyledAttributes.getInt(3, 0);
                        c0183g.f3334d = obtainStyledAttributes.getInt(4, 0);
                        c0183g.e = obtainStyledAttributes.getInt(5, 0);
                        c0183g.f3335f = obtainStyledAttributes.getBoolean(2, r4);
                        c0183g.f3336g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0184h.f3357c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0155a.f3047q);
                            c0183g.i = obtainStyledAttributes2.getResourceId(2, 0);
                            c0183g.j = (obtainStyledAttributes2.getInt(5, c0183g.f3333c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0183g.f3334d) & 65535);
                            c0183g.f3338k = obtainStyledAttributes2.getText(7);
                            c0183g.f3339l = obtainStyledAttributes2.getText(8);
                            c0183g.f3340m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c0183g.f3341n = string == null ? (char) 0 : string.charAt(0);
                            c0183g.f3342o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c0183g.f3343p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0183g.f3344q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0183g.f3345r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0183g.f3345r = c0183g.e;
                            }
                            c0183g.f3346s = obtainStyledAttributes2.getBoolean(3, false);
                            c0183g.f3347t = obtainStyledAttributes2.getBoolean(4, c0183g.f3335f);
                            c0183g.f3348u = obtainStyledAttributes2.getBoolean(1, c0183g.f3336g);
                            c0183g.f3349v = obtainStyledAttributes2.getInt(21, -1);
                            c0183g.f3352y = obtainStyledAttributes2.getString(12);
                            c0183g.f3350w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0183g.f3351x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && c0183g.f3350w == 0 && c0183g.f3351x == null) {
                                c0183g.f3353z = (p) c0183g.a(string3, f3354f, c0184h.f3356b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c0183g.f3353z = null;
                            }
                            c0183g.f3326A = obtainStyledAttributes2.getText(17);
                            c0183g.f3327B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0183g.f3329D = AbstractC0265l0.b(obtainStyledAttributes2.getInt(19, -1), c0183g.f3329D);
                            } else {
                                c0183g.f3329D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0078a.z(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                c0183g.f3328C = colorStateList;
                            } else {
                                c0183g.f3328C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0183g.f3337h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            c0183g.f3337h = true;
                            SubMenu addSubMenu = c0183g.f3331a.addSubMenu(c0183g.f3332b, c0183g.i, c0183g.j, c0183g.f3338k);
                            c0183g.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = z2;
                        i = 2;
                        z4 = z4;
                    }
                }
                z2 = r4;
            }
            eventType = xmlResourceParser.next();
            r4 = z2;
            i = 2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC0229m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f3357c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC0229m) {
                    MenuC0229m menuC0229m = (MenuC0229m) menu;
                    if (!menuC0229m.f3721p) {
                        menuC0229m.w();
                        z2 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((MenuC0229m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuC0229m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
