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
import c.AbstractC0131a;
import d.AbstractC0142a;
import g.j;
import h.AbstractC0227x;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: f.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f2864e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2865f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2866a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2867b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2868c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2869d;

    static {
        Class[] clsArr = {Context.class};
        f2864e = clsArr;
        f2865f = clsArr;
    }

    public C0149d(Context context) {
        super(context);
        this.f2868c = context;
        Object[] objArr = {context};
        this.f2866a = objArr;
        this.f2867b = objArr;
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
        C0148c c0148c = new C0148c(this, menu);
        Menu menu2 = c0148c.f2839a;
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
                        c0148c.f2840b = 0;
                        c0148c.f2841c = 0;
                        c0148c.f2842d = 0;
                        c0148c.f2843e = 0;
                        c0148c.f2844f = r5;
                        c0148c.f2845g = r5;
                    } else if (name2.equals("item")) {
                        if (!c0148c.f2846h) {
                            c0148c.f2846h = r5;
                            c0148c.b(menu2.add(c0148c.f2840b, c0148c.f2847i, c0148c.f2848j, c0148c.f2849k));
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
                    C0149d c0149d = c0148c.f2838D;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c0149d.f2868c.obtainStyledAttributes(attributeSet, AbstractC0131a.f2629l);
                        c0148c.f2840b = obtainStyledAttributes.getResourceId(r5, 0);
                        c0148c.f2841c = obtainStyledAttributes.getInt(3, 0);
                        c0148c.f2842d = obtainStyledAttributes.getInt(4, 0);
                        c0148c.f2843e = obtainStyledAttributes.getInt(5, 0);
                        c0148c.f2844f = obtainStyledAttributes.getBoolean(2, r5);
                        c0148c.f2845g = obtainStyledAttributes.getBoolean(0, r5);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0149d.f2868c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0131a.f2630m);
                            c0148c.f2847i = obtainStyledAttributes2.getResourceId(2, 0);
                            c0148c.f2848j = (obtainStyledAttributes2.getInt(5, c0148c.f2841c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0148c.f2842d) & 65535);
                            c0148c.f2849k = obtainStyledAttributes2.getText(7);
                            c0148c.f2850l = obtainStyledAttributes2.getText(8);
                            c0148c.f2851m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c0148c.f2852n = string == null ? (char) 0 : string.charAt(0);
                            c0148c.f2853o = obtainStyledAttributes2.getInt(16, Base64Utils.IO_BUFFER_SIZE);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c0148c.f2854p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0148c.f2855q = obtainStyledAttributes2.getInt(20, Base64Utils.IO_BUFFER_SIZE);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0148c.f2856r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0148c.f2856r = c0148c.f2843e;
                            }
                            c0148c.f2857s = obtainStyledAttributes2.getBoolean(3, false);
                            c0148c.t = obtainStyledAttributes2.getBoolean(4, c0148c.f2844f);
                            c0148c.f2858u = obtainStyledAttributes2.getBoolean(1, c0148c.f2845g);
                            c0148c.f2859v = obtainStyledAttributes2.getInt(21, -1);
                            c0148c.f2862y = obtainStyledAttributes2.getString(12);
                            c0148c.f2860w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0148c.f2861x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && c0148c.f2860w == 0 && c0148c.f2861x == null) {
                                if (c0148c.a(string3, f2865f, c0149d.f2867b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z5) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c0148c.f2863z = obtainStyledAttributes2.getText(17);
                            c0148c.f2835A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0148c.f2837C = AbstractC0227x.c(obtainStyledAttributes2.getInt(19, -1), c0148c.f2837C);
                            } else {
                                c0148c.f2837C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (obtainStyledAttributes2.hasValue(18) && (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) != 0) {
                                    Object obj = AbstractC0142a.f2825a;
                                    colorStateList = context.getColorStateList(resourceId);
                                }
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                c0148c.f2836B = colorStateList;
                            } else {
                                c0148c.f2836B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0148c.f2846h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            c0148c.f2846h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(c0148c.f2840b, c0148c.f2847i, c0148c.f2848j, c0148c.f2849k);
                            c0148c.b(addSubMenu.getItem());
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
                    xmlResourceParser = this.f2868c.getResources().getLayout(i2);
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
