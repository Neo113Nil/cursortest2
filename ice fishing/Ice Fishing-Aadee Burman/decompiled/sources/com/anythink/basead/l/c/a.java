package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class a extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9218a = "Ad";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9219b = "InLine";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9220c = "Wrapper";

    /* renamed from: d, reason: collision with root package name */
    private ai f9221d;

    /* renamed from: e, reason: collision with root package name */
    private bc f9222e;

    /* renamed from: f, reason: collision with root package name */
    private String f9223f;

    /* renamed from: g, reason: collision with root package name */
    private String f9224g;

    public a(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9218a);
        this.f9223f = xmlPullParser.getAttributeValue(null, "id");
        this.f9224g = xmlPullParser.getAttributeValue(null, "sequence");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9219b)) {
                    xmlPullParser.require(2, null, f9219b);
                    this.f9221d = new ai(xmlPullParser);
                    xmlPullParser.require(3, null, f9219b);
                } else if (name == null || !name.equals(f9220c)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9220c);
                    this.f9222e = new bc(xmlPullParser);
                    xmlPullParser.require(3, null, f9220c);
                }
            }
        }
    }

    private String c() {
        return this.f9223f;
    }

    private String d() {
        return this.f9224g;
    }

    public final ai a() {
        return this.f9221d;
    }

    public final bc b() {
        return this.f9222e;
    }
}
