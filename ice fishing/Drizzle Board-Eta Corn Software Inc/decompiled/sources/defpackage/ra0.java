package defpackage;

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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ra0 extends MenuInflater {
    public static final Class[] P7K7Inc8;
    public static final Class[] VgvYg0wo;
    public final Context MdtA4re8;
    public final Object[] NCTxEWno;
    public final Object[] qoPGr6Ce;
    public Object wxUZMvaN;

    static {
        Class[] clsArr = {Context.class};
        VgvYg0wo = clsArr;
        P7K7Inc8 = clsArr;
    }

    public ra0(Context context) {
        super(context);
        this.MdtA4re8 = context;
        Object[] objArr = {context};
        this.qoPGr6Ce = objArr;
        this.NCTxEWno = objArr;
    }

    public static Object qoPGr6Ce(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? qoPGr6Ce(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void NCTxEWno(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        qa0 qa0Var = new qa0(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
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
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = qa0Var.qoPGr6Ce;
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    } else if (name2.equals("group")) {
                        qa0Var.NCTxEWno = 0;
                        qa0Var.MdtA4re8 = 0;
                        qa0Var.wxUZMvaN = 0;
                        qa0Var.VgvYg0wo = 0;
                        qa0Var.P7K7Inc8 = true;
                        qa0Var.b2ZJblxo = true;
                    } else if (name2.equals("item")) {
                        if (!qa0Var.Qr9iLBAD) {
                            ds dsVar = qa0Var.DK9slbsy;
                            if (dsVar == null || !dsVar.NCTxEWno.hasSubMenu()) {
                                qa0Var.Qr9iLBAD = true;
                                qa0Var.NCTxEWno(menu2.add(qa0Var.NCTxEWno, qa0Var.jb9XjC4I, qa0Var.eVhOlqcC, qa0Var.k3x7lurq));
                            } else {
                                qa0Var.Qr9iLBAD = true;
                                qa0Var.NCTxEWno(menu2.addSubMenu(qa0Var.NCTxEWno, qa0Var.jb9XjC4I, qa0Var.eVhOlqcC, qa0Var.k3x7lurq).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.MdtA4re8;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z00.sjUBp5pO);
                        qa0Var.NCTxEWno = obtainStyledAttributes.getResourceId(1, 0);
                        qa0Var.MdtA4re8 = obtainStyledAttributes.getInt(3, 0);
                        qa0Var.wxUZMvaN = obtainStyledAttributes.getInt(4, 0);
                        qa0Var.VgvYg0wo = obtainStyledAttributes.getInt(5, 0);
                        qa0Var.P7K7Inc8 = obtainStyledAttributes.getBoolean(2, true);
                        qa0Var.b2ZJblxo = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, z00.OxcuoDLp);
                            qa0Var.jb9XjC4I = obtainStyledAttributes2.getResourceId(2, 0);
                            qa0Var.eVhOlqcC = (obtainStyledAttributes2.getInt(5, qa0Var.MdtA4re8) & (-65536)) | (obtainStyledAttributes2.getInt(6, qa0Var.wxUZMvaN) & 65535);
                            qa0Var.k3x7lurq = obtainStyledAttributes2.getText(7);
                            qa0Var.ow5vqvCr = obtainStyledAttributes2.getText(8);
                            qa0Var.OnDfzHZD = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            qa0Var.ygLcUYwZ = string == null ? (char) 0 : string.charAt(0);
                            qa0Var.lDXGDhIF = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            qa0Var.sjUBp5pO = string2 == null ? (char) 0 : string2.charAt(0);
                            qa0Var.OxcuoDLp = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                qa0Var.amk52bBQ = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                qa0Var.amk52bBQ = qa0Var.VgvYg0wo;
                            }
                            qa0Var.KlHjfFWx = obtainStyledAttributes2.getBoolean(3, false);
                            qa0Var.Ey6iv0m0 = obtainStyledAttributes2.getBoolean(4, qa0Var.P7K7Inc8);
                            qa0Var.I5GHvsYW = obtainStyledAttributes2.getBoolean(1, qa0Var.b2ZJblxo);
                            qa0Var.RXQxj5Oe = obtainStyledAttributes2.getInt(21, -1);
                            qa0Var.WYNAV5pd = obtainStyledAttributes2.getString(12);
                            qa0Var.FySoLYna = obtainStyledAttributes2.getResourceId(13, 0);
                            qa0Var.gjV1z5T1 = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && qa0Var.FySoLYna == 0 && qa0Var.gjV1z5T1 == null) {
                                qa0Var.DK9slbsy = (ds) qa0Var.qoPGr6Ce(string3, P7K7Inc8, this.NCTxEWno);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                qa0Var.DK9slbsy = null;
                            }
                            qa0Var.lwWCatUu = obtainStyledAttributes2.getText(17);
                            qa0Var.U0LaHZX7 = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                qa0Var.Mq3SeTnW = ud.NCTxEWno(obtainStyledAttributes2.getInt(19, -1), qa0Var.Mq3SeTnW);
                            } else {
                                qa0Var.Mq3SeTnW = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = w30.RXQxj5Oe(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                qa0Var.i7xS8jrb = colorStateList;
                            } else {
                                qa0Var.i7xS8jrb = null;
                            }
                            obtainStyledAttributes2.recycle();
                            qa0Var.Qr9iLBAD = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            qa0Var.Qr9iLBAD = true;
                            SubMenu addSubMenu = menu2.addSubMenu(qa0Var.NCTxEWno, qa0Var.jb9XjC4I, qa0Var.eVhOlqcC, qa0Var.k3x7lurq);
                            qa0Var.NCTxEWno(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            NCTxEWno(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof yr)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.MdtA4re8.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof yr) {
                    yr yrVar = (yr) menu;
                    if (!yrVar.sjUBp5pO) {
                        yrVar.FySoLYna();
                        z = true;
                    }
                }
                NCTxEWno(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((yr) menu).RXQxj5Oe();
                }
                xmlResourceParser.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((yr) menu).RXQxj5Oe();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
