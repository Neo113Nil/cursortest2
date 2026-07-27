package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ba extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9364a = "JavaScriptResource";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9365b = "VerificationParameters";

    /* renamed from: c, reason: collision with root package name */
    private String f9366c;

    /* renamed from: d, reason: collision with root package name */
    private String f9367d;

    /* renamed from: e, reason: collision with root package name */
    private String f9368e;

    /* renamed from: f, reason: collision with root package name */
    private String f9369f;

    public ba(XmlPullParser xmlPullParser) {
        this.f9366c = xmlPullParser.getAttributeValue(null, "vendor");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9364a)) {
                    xmlPullParser.require(2, null, f9364a);
                    this.f9369f = xmlPullParser.getAttributeValue(null, "apiFramework");
                    this.f9367d = ay.a(xmlPullParser);
                    xmlPullParser.require(3, null, f9364a);
                } else if (name == null || !name.equals(f9365b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9365b);
                    this.f9368e = ay.a(xmlPullParser);
                    xmlPullParser.require(3, null, f9365b);
                }
            }
        }
    }

    private String a() {
        return this.f9366c;
    }

    private String b() {
        return this.f9367d;
    }

    private String c() {
        return this.f9368e;
    }

    private String d() {
        return this.f9369f;
    }
}
