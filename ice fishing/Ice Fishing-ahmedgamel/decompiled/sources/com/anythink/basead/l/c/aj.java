package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class aj extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10059a = "Linear";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10060b = "AdParameters";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10061c = "Duration";

    /* renamed from: d, reason: collision with root package name */
    private static final String f10062d = "MediaFiles";

    /* renamed from: e, reason: collision with root package name */
    private static final String f10063e = "TrackingEvents";

    /* renamed from: f, reason: collision with root package name */
    private static final String f10064f = "VideoClicks";

    /* renamed from: g, reason: collision with root package name */
    private static final String f10065g = "Icons";

    /* renamed from: h, reason: collision with root package name */
    private String f10066h;
    private b i;

    /* renamed from: j, reason: collision with root package name */
    private v f10067j;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<ak> f10068k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<at> f10069l;

    /* renamed from: m, reason: collision with root package name */
    private bb f10070m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<ab> f10071n;

    public aj(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10059a);
        this.f10066h = xmlPullParser.getAttributeValue(null, "skipoffset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f10060b)) {
                    xmlPullParser.require(2, null, f10060b);
                    this.i = new b(xmlPullParser);
                    xmlPullParser.require(3, null, f10060b);
                } else if (name != null && name.equals(f10061c)) {
                    xmlPullParser.require(2, null, f10061c);
                    this.f10067j = new v(xmlPullParser);
                    xmlPullParser.require(3, null, f10061c);
                } else if (name != null && name.equals(f10062d)) {
                    xmlPullParser.require(2, null, f10062d);
                    this.f10068k = new al(xmlPullParser).a();
                    xmlPullParser.require(3, null, f10062d);
                } else if (name != null && name.equals(f10063e)) {
                    xmlPullParser.require(2, null, f10063e);
                    this.f10069l = new au(xmlPullParser).a();
                    xmlPullParser.require(3, null, f10063e);
                } else if (name != null && name.equals(f10064f)) {
                    xmlPullParser.require(2, null, f10064f);
                    this.f10070m = new bb(xmlPullParser);
                    xmlPullParser.require(3, null, f10064f);
                } else if (name == null || !name.equals(f10065g)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10065g);
                    this.f10071n = new ag(xmlPullParser).a();
                    xmlPullParser.require(3, null, f10065g);
                }
            }
        }
    }

    private b f() {
        return this.i;
    }

    private ArrayList<ab> g() {
        return this.f10071n;
    }

    public final String a() {
        return this.f10066h;
    }

    public final v b() {
        return this.f10067j;
    }

    public final ArrayList<ak> c() {
        return this.f10068k;
    }

    public final ArrayList<at> d() {
        return this.f10069l;
    }

    public final bb e() {
        return this.f10070m;
    }
}
