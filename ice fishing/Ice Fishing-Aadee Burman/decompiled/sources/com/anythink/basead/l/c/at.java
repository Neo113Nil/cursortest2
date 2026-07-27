package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class at extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f9333a;

    /* renamed from: b, reason: collision with root package name */
    private String f9334b;

    public at(XmlPullParser xmlPullParser) {
        this.f9333a = xmlPullParser.getAttributeValue(null, "event");
        this.f9334b = ay.a(xmlPullParser);
    }

    public final String a() {
        return this.f9333a;
    }

    public final String b() {
        return this.f9334b;
    }

    private void a(String str) {
        this.f9333a = str;
    }
}
