package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class h extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f10182a;

    /* renamed from: b, reason: collision with root package name */
    private String f10183b;

    public h(XmlPullParser xmlPullParser) {
        this.f10182a = xmlPullParser.getAttributeValue(null, "id");
        this.f10183b = ay.a(xmlPullParser);
    }

    private String b() {
        return this.f10182a;
    }

    public final String a() {
        return this.f10183b;
    }
}
