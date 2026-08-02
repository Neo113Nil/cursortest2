package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class c extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f10178a;

    /* renamed from: b, reason: collision with root package name */
    private String f10179b;

    public c(XmlPullParser xmlPullParser) {
        this.f10178a = xmlPullParser.getAttributeValue(null, com.anythink.expressad.foundation.g.a.i);
        this.f10179b = ay.a(xmlPullParser);
    }

    private String a() {
        return this.f10178a;
    }

    private String b() {
        return this.f10179b;
    }
}
