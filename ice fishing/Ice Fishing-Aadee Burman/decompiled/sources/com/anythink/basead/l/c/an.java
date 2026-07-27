package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class an extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9323a = "NonLinearAds";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9324b = "NonLinear";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9325c = "TrackingEvents";

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<am> f9326d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<at> f9327e;

    public an(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9323a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9324b)) {
                    xmlPullParser.require(2, null, f9324b);
                    this.f9326d.add(new am(xmlPullParser));
                    xmlPullParser.require(3, null, f9324b);
                } else if (name == null || !name.equals(f9325c)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9325c);
                    this.f9327e = new au(xmlPullParser).a();
                    xmlPullParser.require(3, null, f9325c);
                }
            }
        }
    }

    private ArrayList<am> b() {
        return this.f9326d;
    }

    public final ArrayList<at> a() {
        return this.f9327e;
    }
}
