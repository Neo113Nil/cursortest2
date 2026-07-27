package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class aq extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f9328a;

    /* renamed from: b, reason: collision with root package name */
    private String f9329b;

    /* renamed from: c, reason: collision with root package name */
    private String f9330c;

    public aq(XmlPullParser xmlPullParser) {
        this.f9328a = xmlPullParser.getAttributeValue(null, "model");
        this.f9329b = xmlPullParser.getAttributeValue(null, "currency");
        this.f9330c = ay.a(xmlPullParser);
    }

    private String a() {
        return this.f9328a;
    }

    private String b() {
        return this.f9329b;
    }

    private String c() {
        return this.f9330c;
    }
}
