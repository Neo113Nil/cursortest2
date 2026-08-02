package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ba extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10150a = "JavaScriptResource";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10151b = "VerificationParameters";

    /* renamed from: c, reason: collision with root package name */
    private String f10152c;

    /* renamed from: d, reason: collision with root package name */
    private String f10153d;

    /* renamed from: e, reason: collision with root package name */
    private String f10154e;

    /* renamed from: f, reason: collision with root package name */
    private String f10155f;

    public ba(XmlPullParser xmlPullParser) {
        this.f10152c = xmlPullParser.getAttributeValue(null, "vendor");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f10150a)) {
                    xmlPullParser.require(2, null, f10150a);
                    this.f10155f = xmlPullParser.getAttributeValue(null, "apiFramework");
                    this.f10153d = ay.a(xmlPullParser);
                    xmlPullParser.require(3, null, f10150a);
                } else if (name == null || !name.equals(f10151b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10151b);
                    this.f10154e = ay.a(xmlPullParser);
                    xmlPullParser.require(3, null, f10151b);
                }
            }
        }
    }

    private String a() {
        return this.f10152c;
    }

    private String b() {
        return this.f10153d;
    }

    private String c() {
        return this.f10154e;
    }

    private String d() {
        return this.f10155f;
    }
}
