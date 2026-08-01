package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class l extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9399a = "Companion";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9400b = "StaticResource";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9401c = "IFrameResource";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9402d = "HTMLResource";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9403e = "AdParameters";

    /* renamed from: f, reason: collision with root package name */
    private static final String f9404f = "AltText";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9405g = "CompanionClickThrough";

    /* renamed from: h, reason: collision with root package name */
    private static final String f9406h = "CompanionClickTracking";
    private static final String i = "TrackingEvents";

    /* renamed from: j, reason: collision with root package name */
    private String f9407j;

    /* renamed from: k, reason: collision with root package name */
    private String f9408k;

    /* renamed from: l, reason: collision with root package name */
    private String f9409l;

    /* renamed from: m, reason: collision with root package name */
    private String f9410m;

    /* renamed from: n, reason: collision with root package name */
    private String f9411n;

    /* renamed from: o, reason: collision with root package name */
    private String f9412o;

    /* renamed from: p, reason: collision with root package name */
    private String f9413p;

    /* renamed from: q, reason: collision with root package name */
    private String f9414q;

    /* renamed from: r, reason: collision with root package name */
    private String f9415r;

    /* renamed from: s, reason: collision with root package name */
    private ar f9416s;

    /* renamed from: t, reason: collision with root package name */
    private aa f9417t;

    /* renamed from: u, reason: collision with root package name */
    private z f9418u;

    /* renamed from: v, reason: collision with root package name */
    private b f9419v;

    /* renamed from: w, reason: collision with root package name */
    private g f9420w;

    /* renamed from: x, reason: collision with root package name */
    private n f9421x;

    /* renamed from: y, reason: collision with root package name */
    private o f9422y;

    /* renamed from: z, reason: collision with root package name */
    private ArrayList<at> f9423z;

    public l(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9399a);
        this.f9407j = xmlPullParser.getAttributeValue(null, "id");
        this.f9408k = xmlPullParser.getAttributeValue(null, "width");
        this.f9409l = xmlPullParser.getAttributeValue(null, "height");
        this.f9410m = xmlPullParser.getAttributeValue(null, "assetWidth");
        this.f9411n = xmlPullParser.getAttributeValue(null, "assetHeight");
        this.f9412o = xmlPullParser.getAttributeValue(null, "expandedWidth");
        this.f9413p = xmlPullParser.getAttributeValue(null, "expandedHeight");
        this.f9414q = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f9415r = xmlPullParser.getAttributeValue(null, "adSlotID");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9400b)) {
                    xmlPullParser.require(2, null, f9400b);
                    this.f9416s = new ar(xmlPullParser);
                    xmlPullParser.require(3, null, f9400b);
                } else if (name != null && name.equals(f9401c)) {
                    xmlPullParser.require(2, null, f9401c);
                    this.f9417t = new aa(xmlPullParser);
                    xmlPullParser.require(3, null, f9401c);
                } else if (name != null && name.equals(f9402d)) {
                    xmlPullParser.require(2, null, f9402d);
                    this.f9418u = new z(xmlPullParser);
                    xmlPullParser.require(3, null, f9402d);
                } else if (name != null && name.equals(f9403e)) {
                    xmlPullParser.require(2, null, f9403e);
                    this.f9419v = new b(xmlPullParser);
                    xmlPullParser.require(3, null, f9403e);
                } else if (name != null && name.equals(f9404f)) {
                    xmlPullParser.require(2, null, f9404f);
                    this.f9420w = new g(xmlPullParser);
                    xmlPullParser.require(3, null, f9404f);
                } else if (name != null && name.equals(f9405g)) {
                    xmlPullParser.require(2, null, f9405g);
                    this.f9421x = new n(xmlPullParser);
                    xmlPullParser.require(3, null, f9405g);
                } else if (name != null && name.equals(f9406h)) {
                    xmlPullParser.require(2, null, f9406h);
                    this.f9422y = new o(xmlPullParser);
                    xmlPullParser.require(3, null, f9406h);
                } else if (name == null || !name.equals(i)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, i);
                    this.f9423z = new au(xmlPullParser).a();
                    xmlPullParser.require(3, null, i);
                }
            }
        }
    }

    private String i() {
        return this.f9407j;
    }

    private String j() {
        return this.f9410m;
    }

    private String k() {
        return this.f9411n;
    }

    private String l() {
        return this.f9412o;
    }

    private String m() {
        return this.f9413p;
    }

    private String n() {
        return this.f9414q;
    }

    private String o() {
        return this.f9415r;
    }

    private b p() {
        return this.f9419v;
    }

    private g q() {
        return this.f9420w;
    }

    public final String a() {
        return this.f9408k;
    }

    public final String b() {
        return this.f9409l;
    }

    public final ar c() {
        return this.f9416s;
    }

    public final aa d() {
        return this.f9417t;
    }

    public final z e() {
        return this.f9418u;
    }

    public final n f() {
        return this.f9421x;
    }

    public final o g() {
        return this.f9422y;
    }

    public final ArrayList<at> h() {
        return this.f9423z;
    }
}
