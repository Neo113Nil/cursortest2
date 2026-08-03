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
import java.io.IOException;
import l.h;
import m.c0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f3579e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f3580f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3581a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3582b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3583c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3584d;

    static {
        Class[] clsArr = {Context.class};
        f3579e = clsArr;
        f3580f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f3583c = context;
        Object[] objArr = {context};
        this.f3581a = objArr;
        this.f3582b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0208, code lost:
    
        if (r8 != null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i10;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        c cVar = new c(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = cVar.f3553a;
            if (eventType != i10) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z11 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i10 = 2;
                        z10 = z10;
                        z11 = z11;
                    } else if (name2.equals("group")) {
                        cVar.f3554b = 0;
                        cVar.f3555c = 0;
                        cVar.f3556d = 0;
                        cVar.f3557e = 0;
                        cVar.f3558f = true;
                        cVar.f3559g = true;
                    } else if (name2.equals("item")) {
                        if (!cVar.f3560h) {
                            cVar.f3560h = true;
                            cVar.b(menu2.add(cVar.f3554b, cVar.f3561i, cVar.f3562j, cVar.f3563k));
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z10 = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z10 = z10;
            } else {
                if (!z11) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.f3583c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f2921l);
                        cVar.f3554b = obtainStyledAttributes.getResourceId(1, 0);
                        cVar.f3555c = obtainStyledAttributes.getInt(3, 0);
                        cVar.f3556d = obtainStyledAttributes.getInt(4, 0);
                        cVar.f3557e = obtainStyledAttributes.getInt(5, 0);
                        cVar.f3558f = obtainStyledAttributes.getBoolean(2, true);
                        cVar.f3559g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i.a.f2922m);
                            cVar.f3561i = obtainStyledAttributes2.getResourceId(2, 0);
                            cVar.f3562j = (obtainStyledAttributes2.getInt(5, cVar.f3555c) & (-65536)) | (obtainStyledAttributes2.getInt(6, cVar.f3556d) & 65535);
                            cVar.f3563k = obtainStyledAttributes2.getText(7);
                            cVar.f3564l = obtainStyledAttributes2.getText(8);
                            cVar.f3565m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            cVar.f3566n = string == null ? (char) 0 : string.charAt(0);
                            cVar.f3567o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            cVar.f3568p = string2 == null ? (char) 0 : string2.charAt(0);
                            cVar.f3569q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                cVar.f3570r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                cVar.f3570r = cVar.f3557e;
                            }
                            cVar.f3571s = obtainStyledAttributes2.getBoolean(3, false);
                            cVar.f3572t = obtainStyledAttributes2.getBoolean(4, cVar.f3558f);
                            cVar.f3573u = obtainStyledAttributes2.getBoolean(1, cVar.f3559g);
                            cVar.f3574v = obtainStyledAttributes2.getInt(21, -1);
                            cVar.f3577y = obtainStyledAttributes2.getString(12);
                            cVar.f3575w = obtainStyledAttributes2.getResourceId(13, 0);
                            cVar.f3576x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z12 = string3 != null;
                            if (z12 && cVar.f3575w == 0 && cVar.f3576x == null) {
                                if (cVar.a(string3, f3580f, this.f3582b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z12) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            cVar.f3578z = obtainStyledAttributes2.getText(17);
                            cVar.A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                cVar.C = c0.b(obtainStyledAttributes2.getInt(19, -1), cVar.C);
                            } else {
                                cVar.C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (obtainStyledAttributes2.hasValue(18) && (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) != 0) {
                                    Object obj = j.a.f3284a;
                                    colorStateList = context.getColorStateList(resourceId);
                                }
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                cVar.B = colorStateList;
                            } else {
                                cVar.B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            cVar.f3560h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            cVar.f3560h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(cVar.f3554b, cVar.f3561i, cVar.f3562j, cVar.f3563k);
                            cVar.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z11 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i10 = 2;
                        z10 = z10;
                        z11 = z11;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z10 = z10;
            }
            eventType = xmlPullParser2.next();
            i10 = 2;
            z10 = z10;
            z11 = z11;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof h)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f3583c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
