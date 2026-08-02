package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class b extends ay {

    /* renamed from: a, reason: collision with root package name */
    private final String f10148a;

    /* renamed from: b, reason: collision with root package name */
    private String f10149b;

    public b(XmlPullParser xmlPullParser) {
        this.f10148a = xmlPullParser.getAttributeValue(null, "xmlEncoded");
        this.f10149b = ay.a(xmlPullParser);
    }

    private String a() {
        return this.f10148a;
    }

    private String b() {
        return this.f10149b;
    }
}
