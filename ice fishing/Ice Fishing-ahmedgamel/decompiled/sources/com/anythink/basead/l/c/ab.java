package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ab extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9225a = "Icon";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9226b = "StaticResource";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9227c = "IFrameResource";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9228d = "HTMLResource";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9229e = "IconClicks";

    /* renamed from: f, reason: collision with root package name */
    private static final String f9230f = "IconViewTracking";

    /* renamed from: g, reason: collision with root package name */
    private String f9231g;

    /* renamed from: h, reason: collision with root package name */
    private String f9232h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f9233j;

    /* renamed from: k, reason: collision with root package name */
    private String f9234k;

    /* renamed from: l, reason: collision with root package name */
    private String f9235l;

    /* renamed from: m, reason: collision with root package name */
    private String f9236m;

    /* renamed from: n, reason: collision with root package name */
    private String f9237n;

    /* renamed from: o, reason: collision with root package name */
    private ar f9238o;

    /* renamed from: p, reason: collision with root package name */
    private aa f9239p;

    /* renamed from: q, reason: collision with root package name */
    private z f9240q;

    /* renamed from: r, reason: collision with root package name */
    private ae f9241r;

    /* renamed from: s, reason: collision with root package name */
    private af f9242s;

    public ab(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9225a);
        this.f9231g = xmlPullParser.getAttributeValue(null, "program");
        this.f9232h = xmlPullParser.getAttributeValue(null, "width");
        this.i = xmlPullParser.getAttributeValue(null, "height");
        this.f9233j = xmlPullParser.getAttributeValue(null, "xPosition");
        this.f9234k = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f9235l = xmlPullParser.getAttributeValue(null, "duration");
        this.f9236m = xmlPullParser.getAttributeValue(null, "offset");
        this.f9237n = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9226b)) {
                    xmlPullParser.require(2, null, f9226b);
                    this.f9238o = new ar(xmlPullParser);
                    xmlPullParser.require(3, null, f9226b);
                } else if (name != null && name.equals(f9227c)) {
                    xmlPullParser.require(2, null, f9227c);
                    this.f9239p = new aa(xmlPullParser);
                    xmlPullParser.require(3, null, f9227c);
                } else if (name != null && name.equals(f9228d)) {
                    xmlPullParser.require(2, null, f9228d);
                    this.f9240q = new z(xmlPullParser);
                    xmlPullParser.require(3, null, f9228d);
                } else if (name != null && name.equals(f9229e)) {
                    xmlPullParser.require(2, null, f9229e);
                    this.f9241r = new ae(xmlPullParser);
                    xmlPullParser.require(3, null, f9229e);
                } else if (name == null || !name.equals(f9230f)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9230f);
                    this.f9242s = new af(xmlPullParser);
                    xmlPullParser.require(3, null, f9230f);
                }
            }
        }
    }

    private String a() {
        return this.f9231g;
    }

    private String b() {
        return this.f9232h;
    }

    private String c() {
        return this.i;
    }

    private String d() {
        return this.f9233j;
    }

    private String e() {
        return this.f9234k;
    }

    private String f() {
        return this.f9235l;
    }

    private String g() {
        return this.f9236m;
    }

    private String h() {
        return this.f9237n;
    }
}
