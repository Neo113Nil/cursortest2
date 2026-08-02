package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ak extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f10072a;

    /* renamed from: b, reason: collision with root package name */
    private String f10073b;

    /* renamed from: c, reason: collision with root package name */
    private String f10074c;

    /* renamed from: d, reason: collision with root package name */
    private String f10075d;

    /* renamed from: e, reason: collision with root package name */
    private String f10076e;

    /* renamed from: f, reason: collision with root package name */
    private String f10077f;

    /* renamed from: g, reason: collision with root package name */
    private String f10078g;

    /* renamed from: h, reason: collision with root package name */
    private String f10079h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f10080j;

    /* renamed from: k, reason: collision with root package name */
    private String f10081k;

    /* renamed from: l, reason: collision with root package name */
    private String f10082l;

    /* renamed from: m, reason: collision with root package name */
    private String f10083m;

    /* renamed from: n, reason: collision with root package name */
    private String f10084n;

    public ak(XmlPullParser xmlPullParser) {
        this.f10072a = xmlPullParser.getAttributeValue(null, "id");
        this.f10074c = xmlPullParser.getAttributeValue(null, "delivery");
        this.f10075d = xmlPullParser.getAttributeValue(null, "type");
        this.f10076e = xmlPullParser.getAttributeValue(null, "bitrate");
        this.f10077f = xmlPullParser.getAttributeValue(null, "minBitrate");
        this.f10078g = xmlPullParser.getAttributeValue(null, "maxBitrate");
        this.f10079h = xmlPullParser.getAttributeValue(null, "width");
        this.i = xmlPullParser.getAttributeValue(null, "height");
        this.f10080j = xmlPullParser.getAttributeValue(null, "xPosition");
        this.f10081k = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f10082l = xmlPullParser.getAttributeValue(null, "duration");
        this.f10083m = xmlPullParser.getAttributeValue(null, "offset");
        this.f10084n = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f10073b = ay.a(xmlPullParser);
    }

    private String e() {
        return this.f10072a;
    }

    private String f() {
        return this.f10074c;
    }

    private String g() {
        return this.f10076e;
    }

    private String h() {
        return this.f10077f;
    }

    private String i() {
        return this.f10078g;
    }

    private String j() {
        return this.f10080j;
    }

    private String k() {
        return this.f10081k;
    }

    private String l() {
        return this.f10082l;
    }

    private String m() {
        return this.f10083m;
    }

    private String n() {
        return this.f10084n;
    }

    public final String a() {
        return this.f10073b;
    }

    public final String b() {
        return this.f10075d;
    }

    public final String c() {
        return this.f10079h;
    }

    public final String d() {
        return this.i;
    }
}
