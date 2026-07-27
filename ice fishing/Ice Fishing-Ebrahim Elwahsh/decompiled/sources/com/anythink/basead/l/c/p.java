package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class p extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9584a = "Creative";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9585b = "CreativeExtensions";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9586c = "Linear";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9587d = "CompanionAds";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9588e = "NonLinearAds";

    /* renamed from: f, reason: collision with root package name */
    private String f9589f;

    /* renamed from: g, reason: collision with root package name */
    private String f9590g;

    /* renamed from: h, reason: collision with root package name */
    private String f9591h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<q> f9592j;

    /* renamed from: k, reason: collision with root package name */
    private aj f9593k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<l> f9594l;

    /* renamed from: m, reason: collision with root package name */
    private an f9595m;

    public p(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9584a);
        this.f9589f = xmlPullParser.getAttributeValue(null, "id");
        this.f9590g = xmlPullParser.getAttributeValue(null, "sequence");
        this.f9591h = xmlPullParser.getAttributeValue(null, "adID");
        this.i = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9585b)) {
                    if (name != null && name.equals(f9586c)) {
                        xmlPullParser.require(2, null, f9586c);
                        this.f9593k = new aj(xmlPullParser);
                        xmlPullParser.require(3, null, f9586c);
                    } else if (name != null && name.equals(f9587d)) {
                        xmlPullParser.require(2, null, f9587d);
                        this.f9594l = new m(xmlPullParser).a();
                        xmlPullParser.require(3, null, f9587d);
                    } else if (name != null && name.equals(f9588e)) {
                        xmlPullParser.require(2, null, f9588e);
                        this.f9595m = new an(xmlPullParser);
                        xmlPullParser.require(3, null, f9588e);
                    }
                }
                ay.b(xmlPullParser);
            }
        }
    }

    private String d() {
        return this.f9589f;
    }

    private String e() {
        return this.f9590g;
    }

    private String f() {
        return this.f9591h;
    }

    private String g() {
        return this.i;
    }

    public final aj a() {
        return this.f9593k;
    }

    public final ArrayList<l> b() {
        return this.f9594l;
    }

    public final an c() {
        return this.f9595m;
    }

    private void a(ArrayList<l> arrayList) {
        this.f9594l = arrayList;
    }
}
