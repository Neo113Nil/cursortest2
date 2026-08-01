package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class c extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f9392a;

    /* renamed from: b, reason: collision with root package name */
    private String f9393b;

    public c(XmlPullParser xmlPullParser) {
        this.f9392a = xmlPullParser.getAttributeValue(null, com.anythink.expressad.foundation.g.a.i);
        this.f9393b = ay.a(xmlPullParser);
    }

    private String a() {
        return this.f9392a;
    }

    private String b() {
        return this.f9393b;
    }
}
