package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class a extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10004a = "Ad";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10005b = "InLine";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10006c = "Wrapper";

    /* renamed from: d, reason: collision with root package name */
    private ai f10007d;

    /* renamed from: e, reason: collision with root package name */
    private bc f10008e;

    /* renamed from: f, reason: collision with root package name */
    private String f10009f;

    /* renamed from: g, reason: collision with root package name */
    private String f10010g;

    public a(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10004a);
        this.f10009f = xmlPullParser.getAttributeValue(null, "id");
        this.f10010g = xmlPullParser.getAttributeValue(null, "sequence");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f10005b)) {
                    xmlPullParser.require(2, null, f10005b);
                    this.f10007d = new ai(xmlPullParser);
                    xmlPullParser.require(3, null, f10005b);
                } else if (name == null || !name.equals(f10006c)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10006c);
                    this.f10008e = new bc(xmlPullParser);
                    xmlPullParser.require(3, null, f10006c);
                }
            }
        }
    }

    private String c() {
        return this.f10009f;
    }

    private String d() {
        return this.f10010g;
    }

    public final ai a() {
        return this.f10007d;
    }

    public final bc b() {
        return this.f10008e;
    }
}
