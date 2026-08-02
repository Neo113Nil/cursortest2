package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ar extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f10117a;

    /* renamed from: b, reason: collision with root package name */
    private String f10118b;

    public ar(XmlPullParser xmlPullParser) {
        this.f10117a = xmlPullParser.getAttributeValue(null, "creativeType");
        this.f10118b = ay.a(xmlPullParser);
    }

    private String b() {
        return this.f10117a;
    }

    public final String a() {
        return this.f10118b;
    }
}
