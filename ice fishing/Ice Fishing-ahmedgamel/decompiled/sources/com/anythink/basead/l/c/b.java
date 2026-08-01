package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class b extends ay {

    /* renamed from: a, reason: collision with root package name */
    private final String f9362a;

    /* renamed from: b, reason: collision with root package name */
    private String f9363b;

    public b(XmlPullParser xmlPullParser) {
        this.f9362a = xmlPullParser.getAttributeValue(null, "xmlEncoded");
        this.f9363b = ay.a(xmlPullParser);
    }

    private String a() {
        return this.f9362a;
    }

    private String b() {
        return this.f9363b;
    }
}
