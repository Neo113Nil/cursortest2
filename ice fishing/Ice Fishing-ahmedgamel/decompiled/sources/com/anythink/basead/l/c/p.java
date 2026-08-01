package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class p extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9427a = "Creative";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9428b = "CreativeExtensions";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9429c = "Linear";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9430d = "CompanionAds";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9431e = "NonLinearAds";

    /* renamed from: f, reason: collision with root package name */
    private String f9432f;

    /* renamed from: g, reason: collision with root package name */
    private String f9433g;

    /* renamed from: h, reason: collision with root package name */
    private String f9434h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<q> f9435j;

    /* renamed from: k, reason: collision with root package name */
    private aj f9436k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<l> f9437l;

    /* renamed from: m, reason: collision with root package name */
    private an f9438m;

    public p(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9427a);
        this.f9432f = xmlPullParser.getAttributeValue(null, "id");
        this.f9433g = xmlPullParser.getAttributeValue(null, "sequence");
        this.f9434h = xmlPullParser.getAttributeValue(null, "adID");
        this.i = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9428b)) {
                    if (name != null && name.equals(f9429c)) {
                        xmlPullParser.require(2, null, f9429c);
                        this.f9436k = new aj(xmlPullParser);
                        xmlPullParser.require(3, null, f9429c);
                    } else if (name != null && name.equals(f9430d)) {
                        xmlPullParser.require(2, null, f9430d);
                        this.f9437l = new m(xmlPullParser).a();
                        xmlPullParser.require(3, null, f9430d);
                    } else if (name != null && name.equals(f9431e)) {
                        xmlPullParser.require(2, null, f9431e);
                        this.f9438m = new an(xmlPullParser);
                        xmlPullParser.require(3, null, f9431e);
                    }
                }
                ay.b(xmlPullParser);
            }
        }
    }

    private String d() {
        return this.f9432f;
    }

    private String e() {
        return this.f9433g;
    }

    private String f() {
        return this.f9434h;
    }

    private String g() {
        return this.i;
    }

    public final aj a() {
        return this.f9436k;
    }

    public final ArrayList<l> b() {
        return this.f9437l;
    }

    public final an c() {
        return this.f9438m;
    }

    private void a(ArrayList<l> arrayList) {
        this.f9437l = arrayList;
    }
}
