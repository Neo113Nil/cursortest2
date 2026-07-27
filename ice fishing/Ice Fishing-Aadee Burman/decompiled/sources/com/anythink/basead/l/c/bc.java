package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class bc extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9377a = "Wrapper";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9378b = "AdSystem";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9379c = "Impression";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9380d = "VASTAdTagURI";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9381e = "Error";

    /* renamed from: f, reason: collision with root package name */
    private static final String f9382f = "Creatives";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9383g = "Extensions";

    /* renamed from: h, reason: collision with root package name */
    private String f9384h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f9385j;

    /* renamed from: k, reason: collision with root package name */
    private c f9386k;

    /* renamed from: l, reason: collision with root package name */
    private az f9387l;

    /* renamed from: m, reason: collision with root package name */
    private w f9388m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<ah> f9389n;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<p> f9390o;

    /* renamed from: p, reason: collision with root package name */
    private y f9391p;

    public bc(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9377a);
        this.f9384h = xmlPullParser.getAttributeValue(null, "followAdditionalWrappers");
        this.i = xmlPullParser.getAttributeValue(null, "allowMultipleAds");
        this.f9385j = xmlPullParser.getAttributeValue(null, "fallbackOnNoAd");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9378b)) {
                    xmlPullParser.require(2, null, f9378b);
                    this.f9386k = new c(xmlPullParser);
                    xmlPullParser.require(3, null, f9378b);
                } else if (name != null && name.equals(f9381e)) {
                    xmlPullParser.require(2, null, f9381e);
                    this.f9388m = new w(xmlPullParser);
                    xmlPullParser.require(3, null, f9381e);
                } else if (name != null && name.equals(f9380d)) {
                    xmlPullParser.require(2, null, f9380d);
                    this.f9387l = new az(xmlPullParser);
                    xmlPullParser.require(3, null, f9380d);
                } else if (name != null && name.equals(f9379c)) {
                    if (this.f9389n == null) {
                        this.f9389n = new ArrayList<>();
                    }
                    xmlPullParser.require(2, null, f9379c);
                    this.f9389n.add(new ah(xmlPullParser));
                    xmlPullParser.require(3, null, f9379c);
                } else if (name != null && name.equals(f9382f)) {
                    xmlPullParser.require(2, null, f9382f);
                    this.f9390o = new s(xmlPullParser).a();
                    xmlPullParser.require(3, null, f9382f);
                } else if (name == null || !name.equals(f9383g)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9383g);
                    this.f9391p = new y(xmlPullParser);
                    xmlPullParser.require(3, null, f9383g);
                }
            }
        }
    }

    private String d() {
        return this.i;
    }

    private String e() {
        return this.f9385j;
    }

    private c f() {
        return this.f9386k;
    }

    private w g() {
        return this.f9388m;
    }

    private y h() {
        return this.f9391p;
    }

    public final az a() {
        return this.f9387l;
    }

    public final ArrayList<ah> b() {
        return this.f9389n;
    }

    public final ArrayList<p> c() {
        return this.f9390o;
    }
}
