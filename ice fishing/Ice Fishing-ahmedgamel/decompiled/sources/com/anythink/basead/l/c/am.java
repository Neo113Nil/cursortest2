package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class am extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10088a = "NonLinear";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10089b = "StaticResource";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10090c = "IFrameResource";

    /* renamed from: d, reason: collision with root package name */
    private static final String f10091d = "HTMLResource";

    /* renamed from: e, reason: collision with root package name */
    private static final String f10092e = "AdParameters";

    /* renamed from: f, reason: collision with root package name */
    private static final String f10093f = "NonLinearClickThrough";

    /* renamed from: g, reason: collision with root package name */
    private static final String f10094g = "NonLinearClickTracking";

    /* renamed from: h, reason: collision with root package name */
    private String f10095h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f10096j;

    /* renamed from: k, reason: collision with root package name */
    private String f10097k;

    /* renamed from: l, reason: collision with root package name */
    private String f10098l;

    /* renamed from: m, reason: collision with root package name */
    private String f10099m;

    /* renamed from: n, reason: collision with root package name */
    private String f10100n;

    /* renamed from: o, reason: collision with root package name */
    private String f10101o;

    /* renamed from: p, reason: collision with root package name */
    private String f10102p;

    /* renamed from: q, reason: collision with root package name */
    private ar f10103q;

    /* renamed from: r, reason: collision with root package name */
    private aa f10104r;

    /* renamed from: s, reason: collision with root package name */
    private z f10105s;

    /* renamed from: t, reason: collision with root package name */
    private b f10106t;

    /* renamed from: u, reason: collision with root package name */
    private ao f10107u;

    /* renamed from: v, reason: collision with root package name */
    private ap f10108v;

    public am(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10088a);
        this.f10095h = xmlPullParser.getAttributeValue(null, "id");
        this.i = xmlPullParser.getAttributeValue(null, "width");
        this.f10096j = xmlPullParser.getAttributeValue(null, "height");
        this.f10097k = xmlPullParser.getAttributeValue(null, "expandedWidth");
        this.f10098l = xmlPullParser.getAttributeValue(null, "expandedHeight");
        this.f10099m = xmlPullParser.getAttributeValue(null, "scalable");
        this.f10100n = xmlPullParser.getAttributeValue(null, "maintainAspectRatio");
        this.f10101o = xmlPullParser.getAttributeValue(null, "minSuggestedDuration");
        this.f10102p = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f10089b)) {
                    xmlPullParser.require(2, null, f10089b);
                    this.f10103q = new ar(xmlPullParser);
                    xmlPullParser.require(3, null, f10089b);
                } else if (name != null && name.equals(f10090c)) {
                    xmlPullParser.require(2, null, f10090c);
                    this.f10104r = new aa(xmlPullParser);
                    xmlPullParser.require(3, null, f10090c);
                } else if (name != null && name.equals(f10091d)) {
                    xmlPullParser.require(2, null, f10091d);
                    this.f10105s = new z(xmlPullParser);
                    xmlPullParser.require(3, null, f10091d);
                } else if (name != null && name.equals(f10092e)) {
                    xmlPullParser.require(2, null, f10092e);
                    this.f10106t = new b(xmlPullParser);
                    xmlPullParser.require(3, null, f10092e);
                } else if (name != null && name.equals(f10093f)) {
                    xmlPullParser.require(2, null, f10093f);
                    this.f10107u = new ao(xmlPullParser);
                    xmlPullParser.require(3, null, f10093f);
                } else if (name == null || !name.equals(f10094g)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10094g);
                    this.f10108v = new ap(xmlPullParser);
                    xmlPullParser.require(3, null, f10094g);
                }
            }
        }
    }

    private String a() {
        return this.f10095h;
    }

    private String b() {
        return this.i;
    }

    private String c() {
        return this.f10096j;
    }

    private String d() {
        return this.f10097k;
    }

    private String e() {
        return this.f10098l;
    }

    private String f() {
        return this.f10099m;
    }

    private String g() {
        return this.f10100n;
    }

    private String h() {
        return this.f10101o;
    }

    private String i() {
        return this.f10102p;
    }

    private ar j() {
        return this.f10103q;
    }

    private aa k() {
        return this.f10104r;
    }

    private z l() {
        return this.f10105s;
    }

    private b m() {
        return this.f10106t;
    }

    private ao n() {
        return this.f10107u;
    }

    private ap o() {
        return this.f10108v;
    }
}
