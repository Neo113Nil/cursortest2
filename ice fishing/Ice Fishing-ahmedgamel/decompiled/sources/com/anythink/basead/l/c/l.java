package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class l extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10185a = "Companion";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10186b = "StaticResource";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10187c = "IFrameResource";

    /* renamed from: d, reason: collision with root package name */
    private static final String f10188d = "HTMLResource";

    /* renamed from: e, reason: collision with root package name */
    private static final String f10189e = "AdParameters";

    /* renamed from: f, reason: collision with root package name */
    private static final String f10190f = "AltText";

    /* renamed from: g, reason: collision with root package name */
    private static final String f10191g = "CompanionClickThrough";

    /* renamed from: h, reason: collision with root package name */
    private static final String f10192h = "CompanionClickTracking";
    private static final String i = "TrackingEvents";

    /* renamed from: j, reason: collision with root package name */
    private String f10193j;

    /* renamed from: k, reason: collision with root package name */
    private String f10194k;

    /* renamed from: l, reason: collision with root package name */
    private String f10195l;

    /* renamed from: m, reason: collision with root package name */
    private String f10196m;

    /* renamed from: n, reason: collision with root package name */
    private String f10197n;

    /* renamed from: o, reason: collision with root package name */
    private String f10198o;

    /* renamed from: p, reason: collision with root package name */
    private String f10199p;

    /* renamed from: q, reason: collision with root package name */
    private String f10200q;

    /* renamed from: r, reason: collision with root package name */
    private String f10201r;

    /* renamed from: s, reason: collision with root package name */
    private ar f10202s;

    /* renamed from: t, reason: collision with root package name */
    private aa f10203t;

    /* renamed from: u, reason: collision with root package name */
    private z f10204u;

    /* renamed from: v, reason: collision with root package name */
    private b f10205v;

    /* renamed from: w, reason: collision with root package name */
    private g f10206w;

    /* renamed from: x, reason: collision with root package name */
    private n f10207x;

    /* renamed from: y, reason: collision with root package name */
    private o f10208y;

    /* renamed from: z, reason: collision with root package name */
    private ArrayList<at> f10209z;

    public l(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10185a);
        this.f10193j = xmlPullParser.getAttributeValue(null, "id");
        this.f10194k = xmlPullParser.getAttributeValue(null, "width");
        this.f10195l = xmlPullParser.getAttributeValue(null, "height");
        this.f10196m = xmlPullParser.getAttributeValue(null, "assetWidth");
        this.f10197n = xmlPullParser.getAttributeValue(null, "assetHeight");
        this.f10198o = xmlPullParser.getAttributeValue(null, "expandedWidth");
        this.f10199p = xmlPullParser.getAttributeValue(null, "expandedHeight");
        this.f10200q = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f10201r = xmlPullParser.getAttributeValue(null, "adSlotID");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f10186b)) {
                    xmlPullParser.require(2, null, f10186b);
                    this.f10202s = new ar(xmlPullParser);
                    xmlPullParser.require(3, null, f10186b);
                } else if (name != null && name.equals(f10187c)) {
                    xmlPullParser.require(2, null, f10187c);
                    this.f10203t = new aa(xmlPullParser);
                    xmlPullParser.require(3, null, f10187c);
                } else if (name != null && name.equals(f10188d)) {
                    xmlPullParser.require(2, null, f10188d);
                    this.f10204u = new z(xmlPullParser);
                    xmlPullParser.require(3, null, f10188d);
                } else if (name != null && name.equals(f10189e)) {
                    xmlPullParser.require(2, null, f10189e);
                    this.f10205v = new b(xmlPullParser);
                    xmlPullParser.require(3, null, f10189e);
                } else if (name != null && name.equals(f10190f)) {
                    xmlPullParser.require(2, null, f10190f);
                    this.f10206w = new g(xmlPullParser);
                    xmlPullParser.require(3, null, f10190f);
                } else if (name != null && name.equals(f10191g)) {
                    xmlPullParser.require(2, null, f10191g);
                    this.f10207x = new n(xmlPullParser);
                    xmlPullParser.require(3, null, f10191g);
                } else if (name != null && name.equals(f10192h)) {
                    xmlPullParser.require(2, null, f10192h);
                    this.f10208y = new o(xmlPullParser);
                    xmlPullParser.require(3, null, f10192h);
                } else if (name == null || !name.equals(i)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, i);
                    this.f10209z = new au(xmlPullParser).a();
                    xmlPullParser.require(3, null, i);
                }
            }
        }
    }

    private String i() {
        return this.f10193j;
    }

    private String j() {
        return this.f10196m;
    }

    private String k() {
        return this.f10197n;
    }

    private String l() {
        return this.f10198o;
    }

    private String m() {
        return this.f10199p;
    }

    private String n() {
        return this.f10200q;
    }

    private String o() {
        return this.f10201r;
    }

    private b p() {
        return this.f10205v;
    }

    private g q() {
        return this.f10206w;
    }

    public final String a() {
        return this.f10194k;
    }

    public final String b() {
        return this.f10195l;
    }

    public final ar c() {
        return this.f10202s;
    }

    public final aa d() {
        return this.f10203t;
    }

    public final z e() {
        return this.f10204u;
    }

    public final n f() {
        return this.f10207x;
    }

    public final o g() {
        return this.f10208y;
    }

    public final ArrayList<at> h() {
        return this.f10209z;
    }
}
