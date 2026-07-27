package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class bc extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9534a = "Wrapper";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9535b = "AdSystem";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9536c = "Impression";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9537d = "VASTAdTagURI";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9538e = "Error";

    /* renamed from: f, reason: collision with root package name */
    private static final String f9539f = "Creatives";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9540g = "Extensions";

    /* renamed from: h, reason: collision with root package name */
    private String f9541h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f9542j;

    /* renamed from: k, reason: collision with root package name */
    private c f9543k;

    /* renamed from: l, reason: collision with root package name */
    private az f9544l;

    /* renamed from: m, reason: collision with root package name */
    private w f9545m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<ah> f9546n;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<p> f9547o;

    /* renamed from: p, reason: collision with root package name */
    private y f9548p;

    public bc(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9534a);
        this.f9541h = xmlPullParser.getAttributeValue(null, "followAdditionalWrappers");
        this.i = xmlPullParser.getAttributeValue(null, "allowMultipleAds");
        this.f9542j = xmlPullParser.getAttributeValue(null, "fallbackOnNoAd");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9535b)) {
                    xmlPullParser.require(2, null, f9535b);
                    this.f9543k = new c(xmlPullParser);
                    xmlPullParser.require(3, null, f9535b);
                } else if (name != null && name.equals(f9538e)) {
                    xmlPullParser.require(2, null, f9538e);
                    this.f9545m = new w(xmlPullParser);
                    xmlPullParser.require(3, null, f9538e);
                } else if (name != null && name.equals(f9537d)) {
                    xmlPullParser.require(2, null, f9537d);
                    this.f9544l = new az(xmlPullParser);
                    xmlPullParser.require(3, null, f9537d);
                } else if (name != null && name.equals(f9536c)) {
                    if (this.f9546n == null) {
                        this.f9546n = new ArrayList<>();
                    }
                    xmlPullParser.require(2, null, f9536c);
                    this.f9546n.add(new ah(xmlPullParser));
                    xmlPullParser.require(3, null, f9536c);
                } else if (name != null && name.equals(f9539f)) {
                    xmlPullParser.require(2, null, f9539f);
                    this.f9547o = new s(xmlPullParser).a();
                    xmlPullParser.require(3, null, f9539f);
                } else if (name == null || !name.equals(f9540g)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9540g);
                    this.f9548p = new y(xmlPullParser);
                    xmlPullParser.require(3, null, f9540g);
                }
            }
        }
    }

    private String d() {
        return this.i;
    }

    private String e() {
        return this.f9542j;
    }

    private c f() {
        return this.f9543k;
    }

    private w g() {
        return this.f9545m;
    }

    private y h() {
        return this.f9548p;
    }

    public final az a() {
        return this.f9544l;
    }

    public final ArrayList<ah> b() {
        return this.f9546n;
    }

    public final ArrayList<p> c() {
        return this.f9547o;
    }
}
