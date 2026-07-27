package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ak extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f9443a;

    /* renamed from: b, reason: collision with root package name */
    private String f9444b;

    /* renamed from: c, reason: collision with root package name */
    private String f9445c;

    /* renamed from: d, reason: collision with root package name */
    private String f9446d;

    /* renamed from: e, reason: collision with root package name */
    private String f9447e;

    /* renamed from: f, reason: collision with root package name */
    private String f9448f;

    /* renamed from: g, reason: collision with root package name */
    private String f9449g;

    /* renamed from: h, reason: collision with root package name */
    private String f9450h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f9451j;

    /* renamed from: k, reason: collision with root package name */
    private String f9452k;

    /* renamed from: l, reason: collision with root package name */
    private String f9453l;

    /* renamed from: m, reason: collision with root package name */
    private String f9454m;

    /* renamed from: n, reason: collision with root package name */
    private String f9455n;

    public ak(XmlPullParser xmlPullParser) {
        this.f9443a = xmlPullParser.getAttributeValue(null, "id");
        this.f9445c = xmlPullParser.getAttributeValue(null, "delivery");
        this.f9446d = xmlPullParser.getAttributeValue(null, "type");
        this.f9447e = xmlPullParser.getAttributeValue(null, "bitrate");
        this.f9448f = xmlPullParser.getAttributeValue(null, "minBitrate");
        this.f9449g = xmlPullParser.getAttributeValue(null, "maxBitrate");
        this.f9450h = xmlPullParser.getAttributeValue(null, "width");
        this.i = xmlPullParser.getAttributeValue(null, "height");
        this.f9451j = xmlPullParser.getAttributeValue(null, "xPosition");
        this.f9452k = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f9453l = xmlPullParser.getAttributeValue(null, "duration");
        this.f9454m = xmlPullParser.getAttributeValue(null, "offset");
        this.f9455n = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f9444b = ay.a(xmlPullParser);
    }

    private String e() {
        return this.f9443a;
    }

    private String f() {
        return this.f9445c;
    }

    private String g() {
        return this.f9447e;
    }

    private String h() {
        return this.f9448f;
    }

    private String i() {
        return this.f9449g;
    }

    private String j() {
        return this.f9451j;
    }

    private String k() {
        return this.f9452k;
    }

    private String l() {
        return this.f9453l;
    }

    private String m() {
        return this.f9454m;
    }

    private String n() {
        return this.f9455n;
    }

    public final String a() {
        return this.f9444b;
    }

    public final String b() {
        return this.f9446d;
    }

    public final String c() {
        return this.f9450h;
    }

    public final String d() {
        return this.i;
    }
}
