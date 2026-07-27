package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ak extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f9286a;

    /* renamed from: b, reason: collision with root package name */
    private String f9287b;

    /* renamed from: c, reason: collision with root package name */
    private String f9288c;

    /* renamed from: d, reason: collision with root package name */
    private String f9289d;

    /* renamed from: e, reason: collision with root package name */
    private String f9290e;

    /* renamed from: f, reason: collision with root package name */
    private String f9291f;

    /* renamed from: g, reason: collision with root package name */
    private String f9292g;

    /* renamed from: h, reason: collision with root package name */
    private String f9293h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f9294j;

    /* renamed from: k, reason: collision with root package name */
    private String f9295k;

    /* renamed from: l, reason: collision with root package name */
    private String f9296l;

    /* renamed from: m, reason: collision with root package name */
    private String f9297m;

    /* renamed from: n, reason: collision with root package name */
    private String f9298n;

    public ak(XmlPullParser xmlPullParser) {
        this.f9286a = xmlPullParser.getAttributeValue(null, "id");
        this.f9288c = xmlPullParser.getAttributeValue(null, "delivery");
        this.f9289d = xmlPullParser.getAttributeValue(null, "type");
        this.f9290e = xmlPullParser.getAttributeValue(null, "bitrate");
        this.f9291f = xmlPullParser.getAttributeValue(null, "minBitrate");
        this.f9292g = xmlPullParser.getAttributeValue(null, "maxBitrate");
        this.f9293h = xmlPullParser.getAttributeValue(null, "width");
        this.i = xmlPullParser.getAttributeValue(null, "height");
        this.f9294j = xmlPullParser.getAttributeValue(null, "xPosition");
        this.f9295k = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f9296l = xmlPullParser.getAttributeValue(null, "duration");
        this.f9297m = xmlPullParser.getAttributeValue(null, "offset");
        this.f9298n = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f9287b = ay.a(xmlPullParser);
    }

    private String e() {
        return this.f9286a;
    }

    private String f() {
        return this.f9288c;
    }

    private String g() {
        return this.f9290e;
    }

    private String h() {
        return this.f9291f;
    }

    private String i() {
        return this.f9292g;
    }

    private String j() {
        return this.f9294j;
    }

    private String k() {
        return this.f9295k;
    }

    private String l() {
        return this.f9296l;
    }

    private String m() {
        return this.f9297m;
    }

    private String n() {
        return this.f9298n;
    }

    public final String a() {
        return this.f9287b;
    }

    public final String b() {
        return this.f9289d;
    }

    public final String c() {
        return this.f9293h;
    }

    public final String d() {
        return this.i;
    }
}
