package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ba extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9521a = "JavaScriptResource";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9522b = "VerificationParameters";

    /* renamed from: c, reason: collision with root package name */
    private String f9523c;

    /* renamed from: d, reason: collision with root package name */
    private String f9524d;

    /* renamed from: e, reason: collision with root package name */
    private String f9525e;

    /* renamed from: f, reason: collision with root package name */
    private String f9526f;

    public ba(XmlPullParser xmlPullParser) {
        this.f9523c = xmlPullParser.getAttributeValue(null, "vendor");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9521a)) {
                    xmlPullParser.require(2, null, f9521a);
                    this.f9526f = xmlPullParser.getAttributeValue(null, "apiFramework");
                    this.f9524d = ay.a(xmlPullParser);
                    xmlPullParser.require(3, null, f9521a);
                } else if (name == null || !name.equals(f9522b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9522b);
                    this.f9525e = ay.a(xmlPullParser);
                    xmlPullParser.require(3, null, f9522b);
                }
            }
        }
    }

    private String a() {
        return this.f9523c;
    }

    private String b() {
        return this.f9524d;
    }

    private String c() {
        return this.f9525e;
    }

    private String d() {
        return this.f9526f;
    }
}
