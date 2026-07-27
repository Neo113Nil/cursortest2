package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ab extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9382a = "Icon";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9383b = "StaticResource";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9384c = "IFrameResource";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9385d = "HTMLResource";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9386e = "IconClicks";

    /* renamed from: f, reason: collision with root package name */
    private static final String f9387f = "IconViewTracking";

    /* renamed from: g, reason: collision with root package name */
    private String f9388g;

    /* renamed from: h, reason: collision with root package name */
    private String f9389h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f9390j;

    /* renamed from: k, reason: collision with root package name */
    private String f9391k;

    /* renamed from: l, reason: collision with root package name */
    private String f9392l;

    /* renamed from: m, reason: collision with root package name */
    private String f9393m;

    /* renamed from: n, reason: collision with root package name */
    private String f9394n;

    /* renamed from: o, reason: collision with root package name */
    private ar f9395o;

    /* renamed from: p, reason: collision with root package name */
    private aa f9396p;

    /* renamed from: q, reason: collision with root package name */
    private z f9397q;

    /* renamed from: r, reason: collision with root package name */
    private ae f9398r;

    /* renamed from: s, reason: collision with root package name */
    private af f9399s;

    public ab(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9382a);
        this.f9388g = xmlPullParser.getAttributeValue(null, "program");
        this.f9389h = xmlPullParser.getAttributeValue(null, "width");
        this.i = xmlPullParser.getAttributeValue(null, "height");
        this.f9390j = xmlPullParser.getAttributeValue(null, "xPosition");
        this.f9391k = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f9392l = xmlPullParser.getAttributeValue(null, "duration");
        this.f9393m = xmlPullParser.getAttributeValue(null, "offset");
        this.f9394n = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9383b)) {
                    xmlPullParser.require(2, null, f9383b);
                    this.f9395o = new ar(xmlPullParser);
                    xmlPullParser.require(3, null, f9383b);
                } else if (name != null && name.equals(f9384c)) {
                    xmlPullParser.require(2, null, f9384c);
                    this.f9396p = new aa(xmlPullParser);
                    xmlPullParser.require(3, null, f9384c);
                } else if (name != null && name.equals(f9385d)) {
                    xmlPullParser.require(2, null, f9385d);
                    this.f9397q = new z(xmlPullParser);
                    xmlPullParser.require(3, null, f9385d);
                } else if (name != null && name.equals(f9386e)) {
                    xmlPullParser.require(2, null, f9386e);
                    this.f9398r = new ae(xmlPullParser);
                    xmlPullParser.require(3, null, f9386e);
                } else if (name == null || !name.equals(f9387f)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9387f);
                    this.f9399s = new af(xmlPullParser);
                    xmlPullParser.require(3, null, f9387f);
                }
            }
        }
    }

    private String a() {
        return this.f9388g;
    }

    private String b() {
        return this.f9389h;
    }

    private String c() {
        return this.i;
    }

    private String d() {
        return this.f9390j;
    }

    private String e() {
        return this.f9391k;
    }

    private String f() {
        return this.f9392l;
    }

    private String g() {
        return this.f9393m;
    }

    private String h() {
        return this.f9394n;
    }
}
