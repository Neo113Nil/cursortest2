package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class an extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10109a = "NonLinearAds";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10110b = "NonLinear";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10111c = "TrackingEvents";

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<am> f10112d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<at> f10113e;

    public an(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10109a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f10110b)) {
                    xmlPullParser.require(2, null, f10110b);
                    this.f10112d.add(new am(xmlPullParser));
                    xmlPullParser.require(3, null, f10110b);
                } else if (name == null || !name.equals(f10111c)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10111c);
                    this.f10113e = new au(xmlPullParser).a();
                    xmlPullParser.require(3, null, f10111c);
                }
            }
        }
    }

    private ArrayList<am> b() {
        return this.f10112d;
    }

    public final ArrayList<at> a() {
        return this.f10113e;
    }
}
