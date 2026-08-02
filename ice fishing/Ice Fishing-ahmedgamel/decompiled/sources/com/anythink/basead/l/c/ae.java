package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ae extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10029a = "IconClicks";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10030b = "IconClickThrough";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10031c = "IconClickTracking";

    /* renamed from: d, reason: collision with root package name */
    private ac f10032d;

    /* renamed from: e, reason: collision with root package name */
    private ad f10033e;

    public ae(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10029a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f10030b)) {
                    xmlPullParser.require(2, null, f10030b);
                    this.f10032d = new ac(xmlPullParser);
                    xmlPullParser.require(3, null, f10030b);
                } else if (name == null || !name.equals(f10031c)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10031c);
                    this.f10033e = new ad(xmlPullParser);
                    xmlPullParser.require(3, null, f10031c);
                }
            }
        }
    }

    private ac a() {
        return this.f10032d;
    }

    private ad b() {
        return this.f10033e;
    }
}
