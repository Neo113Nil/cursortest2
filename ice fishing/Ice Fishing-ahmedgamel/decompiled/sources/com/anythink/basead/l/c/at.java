package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class at extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f10119a;

    /* renamed from: b, reason: collision with root package name */
    private String f10120b;

    public at(XmlPullParser xmlPullParser) {
        this.f10119a = xmlPullParser.getAttributeValue(null, "event");
        this.f10120b = ay.a(xmlPullParser);
    }

    public final String a() {
        return this.f10119a;
    }

    public final String b() {
        return this.f10120b;
    }

    private void a(String str) {
        this.f10119a = str;
    }
}
