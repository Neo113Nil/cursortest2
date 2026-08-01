package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ar extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f9331a;

    /* renamed from: b, reason: collision with root package name */
    private String f9332b;

    public ar(XmlPullParser xmlPullParser) {
        this.f9331a = xmlPullParser.getAttributeValue(null, "creativeType");
        this.f9332b = ay.a(xmlPullParser);
    }

    private String b() {
        return this.f9331a;
    }

    public final String a() {
        return this.f9332b;
    }
}
