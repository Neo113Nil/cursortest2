package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ae extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9400a = "IconClicks";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9401b = "IconClickThrough";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9402c = "IconClickTracking";

    /* renamed from: d, reason: collision with root package name */
    private ac f9403d;

    /* renamed from: e, reason: collision with root package name */
    private ad f9404e;

    public ae(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9400a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9401b)) {
                    xmlPullParser.require(2, null, f9401b);
                    this.f9403d = new ac(xmlPullParser);
                    xmlPullParser.require(3, null, f9401b);
                } else if (name == null || !name.equals(f9402c)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9402c);
                    this.f9404e = new ad(xmlPullParser);
                    xmlPullParser.require(3, null, f9402c);
                }
            }
        }
    }

    private ac a() {
        return this.f9403d;
    }

    private ad b() {
        return this.f9404e;
    }
}
