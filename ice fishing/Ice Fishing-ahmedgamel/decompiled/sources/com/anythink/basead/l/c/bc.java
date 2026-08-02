package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class bc extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10163a = "Wrapper";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10164b = "AdSystem";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10165c = "Impression";

    /* renamed from: d, reason: collision with root package name */
    private static final String f10166d = "VASTAdTagURI";

    /* renamed from: e, reason: collision with root package name */
    private static final String f10167e = "Error";

    /* renamed from: f, reason: collision with root package name */
    private static final String f10168f = "Creatives";

    /* renamed from: g, reason: collision with root package name */
    private static final String f10169g = "Extensions";

    /* renamed from: h, reason: collision with root package name */
    private String f10170h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f10171j;

    /* renamed from: k, reason: collision with root package name */
    private c f10172k;

    /* renamed from: l, reason: collision with root package name */
    private az f10173l;

    /* renamed from: m, reason: collision with root package name */
    private w f10174m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<ah> f10175n;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<p> f10176o;

    /* renamed from: p, reason: collision with root package name */
    private y f10177p;

    public bc(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10163a);
        this.f10170h = xmlPullParser.getAttributeValue(null, "followAdditionalWrappers");
        this.i = xmlPullParser.getAttributeValue(null, "allowMultipleAds");
        this.f10171j = xmlPullParser.getAttributeValue(null, "fallbackOnNoAd");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f10164b)) {
                    xmlPullParser.require(2, null, f10164b);
                    this.f10172k = new c(xmlPullParser);
                    xmlPullParser.require(3, null, f10164b);
                } else if (name != null && name.equals(f10167e)) {
                    xmlPullParser.require(2, null, f10167e);
                    this.f10174m = new w(xmlPullParser);
                    xmlPullParser.require(3, null, f10167e);
                } else if (name != null && name.equals(f10166d)) {
                    xmlPullParser.require(2, null, f10166d);
                    this.f10173l = new az(xmlPullParser);
                    xmlPullParser.require(3, null, f10166d);
                } else if (name != null && name.equals(f10165c)) {
                    if (this.f10175n == null) {
                        this.f10175n = new ArrayList<>();
                    }
                    xmlPullParser.require(2, null, f10165c);
                    this.f10175n.add(new ah(xmlPullParser));
                    xmlPullParser.require(3, null, f10165c);
                } else if (name != null && name.equals(f10168f)) {
                    xmlPullParser.require(2, null, f10168f);
                    this.f10176o = new s(xmlPullParser).a();
                    xmlPullParser.require(3, null, f10168f);
                } else if (name == null || !name.equals(f10169g)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10169g);
                    this.f10177p = new y(xmlPullParser);
                    xmlPullParser.require(3, null, f10169g);
                }
            }
        }
    }

    private String d() {
        return this.i;
    }

    private String e() {
        return this.f10171j;
    }

    private c f() {
        return this.f10172k;
    }

    private w g() {
        return this.f10174m;
    }

    private y h() {
        return this.f10177p;
    }

    public final az a() {
        return this.f10173l;
    }

    public final ArrayList<ah> b() {
        return this.f10175n;
    }

    public final ArrayList<p> c() {
        return this.f10176o;
    }
}
