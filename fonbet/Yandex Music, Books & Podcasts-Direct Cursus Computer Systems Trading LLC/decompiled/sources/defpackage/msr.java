package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class msr extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public msr(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r3 == 1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r15 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (r3 == r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r3 == 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r8 = r17;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0252, code lost:
    
        r3 = r8.next();
        r4 = 2;
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        r3 = r17.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r10 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r3.equals(r11) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        r8 = r17;
        r10 = false;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r3.equals("group") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r2.b = 0;
        r2.c = 0;
        r2.d = 0;
        r2.e = 0;
        r2.f = true;
        r2.g = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r3.equals("item") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r2.h != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        r3 = r2.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (r3.b.hasSubMenu() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        r2.h = true;
        r2.b(r15.addSubMenu(r2.b, r2.i, r2.j, r2.k).getItem());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
    
        r2.h = true;
        r2.b(r15.add(r2.b, r2.i, r2.j, r2.k));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        if (r3.equals("menu") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
    
        r8 = r17;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r10 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        r3 = r17.getName();
        r14 = r3.equals("group");
        r8 = r16.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c9, code lost:
    
        if (r14 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
    
        r3 = r8.obtainStyledAttributes(r18, defpackage.ken.q);
        r2.b = r3.getResourceId(1, 0);
        r2.c = r3.getInt(3, 0);
        r2.d = r3.getInt(4, 0);
        r2.e = r3.getInt(5, 0);
        r2.f = r3.getBoolean(2, true);
        r2.g = r3.getBoolean(0, true);
        r3.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
    
        if (r3.equals("item") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        r3 = defpackage.lum.V(r8, r18, defpackage.ken.r);
        r8 = (android.content.res.TypedArray) r3.b;
        r2.i = r8.getResourceId(2, 0);
        r2.j = (r8.getInt(6, r2.d) & 65535) | (r8.getInt(5, r2.c) & (-65536));
        r2.k = r8.getText(7);
        r2.l = r8.getText(8);
        r2.m = r8.getResourceId(0, 0);
        r13 = r8.getString(9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0146, code lost:
    
        if (r13 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0148, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014e, code lost:
    
        r2.n = r13;
        r2.o = r8.getInt(16, 4096);
        r13 = r8.getString(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0160, code lost:
    
        if (r13 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0162, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0168, code lost:
    
        r2.p = r13;
        r2.q = r8.getInt(20, 4096);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0178, code lost:
    
        if (r8.hasValue(11) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017a, code lost:
    
        r2.r = r8.getBoolean(11, false) ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0185, code lost:
    
        r2.s = r8.getBoolean(3, false);
        r2.t = r8.getBoolean(4, r2.f);
        r2.u = r8.getBoolean(1, r2.g);
        r2.v = r8.getInt(21, -1);
        r2.y = r8.getString(12);
        r2.w = r8.getResourceId(13, 0);
        r2.x = r8.getString(15);
        r4 = r8.getString(14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c2, code lost:
    
        if (r4 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c4, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c7, code lost:
    
        if (r13 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01cb, code lost:
    
        if (r2.w != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01cf, code lost:
    
        if (r2.x != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d1, code lost:
    
        r2.z = (defpackage.txh) r2.a(r4, defpackage.msr.f, r16.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ea, code lost:
    
        r2.A = r8.getText(17);
        r2.B = r8.getText(22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0200, code lost:
    
        if (r8.hasValue(19) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0202, code lost:
    
        r2.D = defpackage.xpa.c(r8.getInt(19, -1), r2.D);
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0219, code lost:
    
        if (r8.hasValue(18) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x021b, code lost:
    
        r2.C = r3.J(18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0224, code lost:
    
        r3.f0();
        r2.h = false;
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0222, code lost:
    
        r2.C = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0210, code lost:
    
        r4 = null;
        r2.D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01de, code lost:
    
        if (r13 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e0, code lost:
    
        android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e7, code lost:
    
        r2.z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c6, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0181, code lost:
    
        r2.r = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0164, code lost:
    
        r13 = r13.charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014a, code lost:
    
        r13 = r13.charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0231, code lost:
    
        if (r3.equals("menu") == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0233, code lost:
    
        r2.h = true;
        r3 = r15.addSubMenu(r2.b, r2.i, r2.j, r2.k);
        r2.b(r3.getItem());
        r8 = r17;
        b(r8, r18, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x024e, code lost:
    
        r8 = r17;
        r11 = r3;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0259, code lost:
    
        defpackage.wvs.p("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x025e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        r9 = false;
        r10 = false;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r9 != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        lsr lsrVar = new lsr(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            int i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    wvs.p("Expecting menu, got ".concat(name));
                    return;
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof hxh)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof hxh) {
                    hxh hxhVar = (hxh) menu;
                    if (!hxhVar.p) {
                        hxhVar.w();
                        z = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((hxh) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((hxh) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
