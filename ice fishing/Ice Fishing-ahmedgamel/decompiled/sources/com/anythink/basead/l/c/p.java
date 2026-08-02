package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class p extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10213a = "Creative";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10214b = "CreativeExtensions";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10215c = "Linear";

    /* renamed from: d, reason: collision with root package name */
    private static final String f10216d = "CompanionAds";

    /* renamed from: e, reason: collision with root package name */
    private static final String f10217e = "NonLinearAds";

    /* renamed from: f, reason: collision with root package name */
    private String f10218f;

    /* renamed from: g, reason: collision with root package name */
    private String f10219g;

    /* renamed from: h, reason: collision with root package name */
    private String f10220h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<q> f10221j;

    /* renamed from: k, reason: collision with root package name */
    private aj f10222k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<l> f10223l;

    /* renamed from: m, reason: collision with root package name */
    private an f10224m;

    public p(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10213a);
        this.f10218f = xmlPullParser.getAttributeValue(null, "id");
        this.f10219g = xmlPullParser.getAttributeValue(null, "sequence");
        this.f10220h = xmlPullParser.getAttributeValue(null, "adID");
        this.i = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f10214b)) {
                    if (name != null && name.equals(f10215c)) {
                        xmlPullParser.require(2, null, f10215c);
                        this.f10222k = new aj(xmlPullParser);
                        xmlPullParser.require(3, null, f10215c);
                    } else if (name != null && name.equals(f10216d)) {
                        xmlPullParser.require(2, null, f10216d);
                        this.f10223l = new m(xmlPullParser).a();
                        xmlPullParser.require(3, null, f10216d);
                    } else if (name != null && name.equals(f10217e)) {
                        xmlPullParser.require(2, null, f10217e);
                        this.f10224m = new an(xmlPullParser);
                        xmlPullParser.require(3, null, f10217e);
                    }
                }
                ay.b(xmlPullParser);
            }
        }
    }

    private String d() {
        return this.f10218f;
    }

    private String e() {
        return this.f10219g;
    }

    private String f() {
        return this.f10220h;
    }

    private String g() {
        return this.i;
    }

    public final aj a() {
        return this.f10222k;
    }

    public final ArrayList<l> b() {
        return this.f10223l;
    }

    public final an c() {
        return this.f10224m;
    }

    private void a(ArrayList<l> arrayList) {
        this.f10223l = arrayList;
    }
}
