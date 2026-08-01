package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class x extends ay {

    /* renamed from: c, reason: collision with root package name */
    private static final String f9445c = "AdVerifications";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9446d = "Extension";

    /* renamed from: a, reason: collision with root package name */
    private String f9447a;

    /* renamed from: b, reason: collision with root package name */
    private e f9448b;

    public x(XmlPullParser xmlPullParser) {
        this.f9447a = xmlPullParser.getAttributeValue(null, "type");
        xmlPullParser.require(2, null, f9446d);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9445c)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9445c);
                    this.f9448b = new e(xmlPullParser);
                    xmlPullParser.require(3, null, f9445c);
                }
            }
        }
    }

    private String b() {
        return this.f9447a;
    }

    public final e a() {
        return this.f9448b;
    }
}
