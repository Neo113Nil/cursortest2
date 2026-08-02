package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class aq extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f10114a;

    /* renamed from: b, reason: collision with root package name */
    private String f10115b;

    /* renamed from: c, reason: collision with root package name */
    private String f10116c;

    public aq(XmlPullParser xmlPullParser) {
        this.f10114a = xmlPullParser.getAttributeValue(null, "model");
        this.f10115b = xmlPullParser.getAttributeValue(null, "currency");
        this.f10116c = ay.a(xmlPullParser);
    }

    private String a() {
        return this.f10114a;
    }

    private String b() {
        return this.f10115b;
    }

    private String c() {
        return this.f10116c;
    }
}
