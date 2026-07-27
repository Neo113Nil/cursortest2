package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class am extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9302a = "NonLinear";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9303b = "StaticResource";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9304c = "IFrameResource";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9305d = "HTMLResource";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9306e = "AdParameters";

    /* renamed from: f, reason: collision with root package name */
    private static final String f9307f = "NonLinearClickThrough";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9308g = "NonLinearClickTracking";

    /* renamed from: h, reason: collision with root package name */
    private String f9309h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f9310j;

    /* renamed from: k, reason: collision with root package name */
    private String f9311k;

    /* renamed from: l, reason: collision with root package name */
    private String f9312l;

    /* renamed from: m, reason: collision with root package name */
    private String f9313m;

    /* renamed from: n, reason: collision with root package name */
    private String f9314n;

    /* renamed from: o, reason: collision with root package name */
    private String f9315o;

    /* renamed from: p, reason: collision with root package name */
    private String f9316p;

    /* renamed from: q, reason: collision with root package name */
    private ar f9317q;

    /* renamed from: r, reason: collision with root package name */
    private aa f9318r;

    /* renamed from: s, reason: collision with root package name */
    private z f9319s;

    /* renamed from: t, reason: collision with root package name */
    private b f9320t;

    /* renamed from: u, reason: collision with root package name */
    private ao f9321u;

    /* renamed from: v, reason: collision with root package name */
    private ap f9322v;

    public am(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9302a);
        this.f9309h = xmlPullParser.getAttributeValue(null, "id");
        this.i = xmlPullParser.getAttributeValue(null, "width");
        this.f9310j = xmlPullParser.getAttributeValue(null, "height");
        this.f9311k = xmlPullParser.getAttributeValue(null, "expandedWidth");
        this.f9312l = xmlPullParser.getAttributeValue(null, "expandedHeight");
        this.f9313m = xmlPullParser.getAttributeValue(null, "scalable");
        this.f9314n = xmlPullParser.getAttributeValue(null, "maintainAspectRatio");
        this.f9315o = xmlPullParser.getAttributeValue(null, "minSuggestedDuration");
        this.f9316p = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9303b)) {
                    xmlPullParser.require(2, null, f9303b);
                    this.f9317q = new ar(xmlPullParser);
                    xmlPullParser.require(3, null, f9303b);
                } else if (name != null && name.equals(f9304c)) {
                    xmlPullParser.require(2, null, f9304c);
                    this.f9318r = new aa(xmlPullParser);
                    xmlPullParser.require(3, null, f9304c);
                } else if (name != null && name.equals(f9305d)) {
                    xmlPullParser.require(2, null, f9305d);
                    this.f9319s = new z(xmlPullParser);
                    xmlPullParser.require(3, null, f9305d);
                } else if (name != null && name.equals(f9306e)) {
                    xmlPullParser.require(2, null, f9306e);
                    this.f9320t = new b(xmlPullParser);
                    xmlPullParser.require(3, null, f9306e);
                } else if (name != null && name.equals(f9307f)) {
                    xmlPullParser.require(2, null, f9307f);
                    this.f9321u = new ao(xmlPullParser);
                    xmlPullParser.require(3, null, f9307f);
                } else if (name == null || !name.equals(f9308g)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9308g);
                    this.f9322v = new ap(xmlPullParser);
                    xmlPullParser.require(3, null, f9308g);
                }
            }
        }
    }

    private String a() {
        return this.f9309h;
    }

    private String b() {
        return this.i;
    }

    private String c() {
        return this.f9310j;
    }

    private String d() {
        return this.f9311k;
    }

    private String e() {
        return this.f9312l;
    }

    private String f() {
        return this.f9313m;
    }

    private String g() {
        return this.f9314n;
    }

    private String h() {
        return this.f9315o;
    }

    private String i() {
        return this.f9316p;
    }

    private ar j() {
        return this.f9317q;
    }

    private aa k() {
        return this.f9318r;
    }

    private z l() {
        return this.f9319s;
    }

    private b m() {
        return this.f9320t;
    }

    private ao n() {
        return this.f9321u;
    }

    private ap o() {
        return this.f9322v;
    }
}
