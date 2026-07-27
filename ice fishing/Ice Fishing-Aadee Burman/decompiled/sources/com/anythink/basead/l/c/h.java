package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class h extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f9396a;

    /* renamed from: b, reason: collision with root package name */
    private String f9397b;

    public h(XmlPullParser xmlPullParser) {
        this.f9396a = xmlPullParser.getAttributeValue(null, "id");
        this.f9397b = ay.a(xmlPullParser);
    }

    private String b() {
        return this.f9396a;
    }

    public final String a() {
        return this.f9397b;
    }
}
