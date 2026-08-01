package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class aj extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9273a = "Linear";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9274b = "AdParameters";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9275c = "Duration";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9276d = "MediaFiles";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9277e = "TrackingEvents";

    /* renamed from: f, reason: collision with root package name */
    private static final String f9278f = "VideoClicks";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9279g = "Icons";

    /* renamed from: h, reason: collision with root package name */
    private String f9280h;
    private b i;

    /* renamed from: j, reason: collision with root package name */
    private v f9281j;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<ak> f9282k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<at> f9283l;

    /* renamed from: m, reason: collision with root package name */
    private bb f9284m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<ab> f9285n;

    public aj(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9273a);
        this.f9280h = xmlPullParser.getAttributeValue(null, "skipoffset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9274b)) {
                    xmlPullParser.require(2, null, f9274b);
                    this.i = new b(xmlPullParser);
                    xmlPullParser.require(3, null, f9274b);
                } else if (name != null && name.equals(f9275c)) {
                    xmlPullParser.require(2, null, f9275c);
                    this.f9281j = new v(xmlPullParser);
                    xmlPullParser.require(3, null, f9275c);
                } else if (name != null && name.equals(f9276d)) {
                    xmlPullParser.require(2, null, f9276d);
                    this.f9282k = new al(xmlPullParser).a();
                    xmlPullParser.require(3, null, f9276d);
                } else if (name != null && name.equals(f9277e)) {
                    xmlPullParser.require(2, null, f9277e);
                    this.f9283l = new au(xmlPullParser).a();
                    xmlPullParser.require(3, null, f9277e);
                } else if (name != null && name.equals(f9278f)) {
                    xmlPullParser.require(2, null, f9278f);
                    this.f9284m = new bb(xmlPullParser);
                    xmlPullParser.require(3, null, f9278f);
                } else if (name == null || !name.equals(f9279g)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9279g);
                    this.f9285n = new ag(xmlPullParser).a();
                    xmlPullParser.require(3, null, f9279g);
                }
            }
        }
    }

    private b f() {
        return this.i;
    }

    private ArrayList<ab> g() {
        return this.f9285n;
    }

    public final String a() {
        return this.f9280h;
    }

    public final v b() {
        return this.f9281j;
    }

    public final ArrayList<ak> c() {
        return this.f9282k;
    }

    public final ArrayList<at> d() {
        return this.f9283l;
    }

    public final bb e() {
        return this.f9284m;
    }
}
