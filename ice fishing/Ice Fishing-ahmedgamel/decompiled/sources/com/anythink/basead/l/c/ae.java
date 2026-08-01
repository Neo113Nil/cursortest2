package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ae extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9243a = "IconClicks";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9244b = "IconClickThrough";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9245c = "IconClickTracking";

    /* renamed from: d, reason: collision with root package name */
    private ac f9246d;

    /* renamed from: e, reason: collision with root package name */
    private ad f9247e;

    public ae(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9243a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9244b)) {
                    xmlPullParser.require(2, null, f9244b);
                    this.f9246d = new ac(xmlPullParser);
                    xmlPullParser.require(3, null, f9244b);
                } else if (name == null || !name.equals(f9245c)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9245c);
                    this.f9247e = new ad(xmlPullParser);
                    xmlPullParser.require(3, null, f9245c);
                }
            }
        }
    }

    private ac a() {
        return this.f9246d;
    }

    private ad b() {
        return this.f9247e;
    }
}
