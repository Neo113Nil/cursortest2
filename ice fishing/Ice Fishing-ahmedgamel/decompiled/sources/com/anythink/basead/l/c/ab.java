package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ab extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10011a = "Icon";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10012b = "StaticResource";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10013c = "IFrameResource";

    /* renamed from: d, reason: collision with root package name */
    private static final String f10014d = "HTMLResource";

    /* renamed from: e, reason: collision with root package name */
    private static final String f10015e = "IconClicks";

    /* renamed from: f, reason: collision with root package name */
    private static final String f10016f = "IconViewTracking";

    /* renamed from: g, reason: collision with root package name */
    private String f10017g;

    /* renamed from: h, reason: collision with root package name */
    private String f10018h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f10019j;

    /* renamed from: k, reason: collision with root package name */
    private String f10020k;

    /* renamed from: l, reason: collision with root package name */
    private String f10021l;

    /* renamed from: m, reason: collision with root package name */
    private String f10022m;

    /* renamed from: n, reason: collision with root package name */
    private String f10023n;

    /* renamed from: o, reason: collision with root package name */
    private ar f10024o;

    /* renamed from: p, reason: collision with root package name */
    private aa f10025p;

    /* renamed from: q, reason: collision with root package name */
    private z f10026q;

    /* renamed from: r, reason: collision with root package name */
    private ae f10027r;

    /* renamed from: s, reason: collision with root package name */
    private af f10028s;

    public ab(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10011a);
        this.f10017g = xmlPullParser.getAttributeValue(null, "program");
        this.f10018h = xmlPullParser.getAttributeValue(null, "width");
        this.i = xmlPullParser.getAttributeValue(null, "height");
        this.f10019j = xmlPullParser.getAttributeValue(null, "xPosition");
        this.f10020k = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f10021l = xmlPullParser.getAttributeValue(null, "duration");
        this.f10022m = xmlPullParser.getAttributeValue(null, "offset");
        this.f10023n = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f10012b)) {
                    xmlPullParser.require(2, null, f10012b);
                    this.f10024o = new ar(xmlPullParser);
                    xmlPullParser.require(3, null, f10012b);
                } else if (name != null && name.equals(f10013c)) {
                    xmlPullParser.require(2, null, f10013c);
                    this.f10025p = new aa(xmlPullParser);
                    xmlPullParser.require(3, null, f10013c);
                } else if (name != null && name.equals(f10014d)) {
                    xmlPullParser.require(2, null, f10014d);
                    this.f10026q = new z(xmlPullParser);
                    xmlPullParser.require(3, null, f10014d);
                } else if (name != null && name.equals(f10015e)) {
                    xmlPullParser.require(2, null, f10015e);
                    this.f10027r = new ae(xmlPullParser);
                    xmlPullParser.require(3, null, f10015e);
                } else if (name == null || !name.equals(f10016f)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10016f);
                    this.f10028s = new af(xmlPullParser);
                    xmlPullParser.require(3, null, f10016f);
                }
            }
        }
    }

    private String a() {
        return this.f10017g;
    }

    private String b() {
        return this.f10018h;
    }

    private String c() {
        return this.i;
    }

    private String d() {
        return this.f10019j;
    }

    private String e() {
        return this.f10020k;
    }

    private String f() {
        return this.f10021l;
    }

    private String g() {
        return this.f10022m;
    }

    private String h() {
        return this.f10023n;
    }
}
