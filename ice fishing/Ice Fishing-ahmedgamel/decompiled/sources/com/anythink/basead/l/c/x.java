package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class x extends ay {

    /* renamed from: c, reason: collision with root package name */
    private static final String f10231c = "AdVerifications";

    /* renamed from: d, reason: collision with root package name */
    private static final String f10232d = "Extension";

    /* renamed from: a, reason: collision with root package name */
    private String f10233a;

    /* renamed from: b, reason: collision with root package name */
    private e f10234b;

    public x(XmlPullParser xmlPullParser) {
        this.f10233a = xmlPullParser.getAttributeValue(null, "type");
        xmlPullParser.require(2, null, f10232d);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f10231c)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10231c);
                    this.f10234b = new e(xmlPullParser);
                    xmlPullParser.require(3, null, f10231c);
                }
            }
        }
    }

    private String b() {
        return this.f10233a;
    }

    public final e a() {
        return this.f10234b;
    }
}
