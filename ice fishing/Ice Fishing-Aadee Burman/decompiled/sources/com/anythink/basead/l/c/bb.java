package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class bb extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9370a = "VideoClicks";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9371b = "ClickThrough";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9372c = "ClickTracking";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9373d = "CustomClick";

    /* renamed from: e, reason: collision with root package name */
    private j f9374e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<k> f9375f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<t> f9376g = new ArrayList<>();

    public bb(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9370a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9371b)) {
                    xmlPullParser.require(2, null, f9371b);
                    this.f9374e = new j(xmlPullParser);
                    xmlPullParser.require(3, null, f9371b);
                } else if (name != null && name.equals(f9372c)) {
                    xmlPullParser.require(2, null, f9372c);
                    this.f9375f.add(new k(xmlPullParser));
                    xmlPullParser.require(3, null, f9372c);
                } else if (name == null || !name.equals(f9373d)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9373d);
                    this.f9376g.add(new t(xmlPullParser));
                    xmlPullParser.require(3, null, f9373d);
                }
            }
        }
    }

    private ArrayList<t> c() {
        return this.f9376g;
    }

    public final j a() {
        return this.f9374e;
    }

    public final ArrayList<k> b() {
        return this.f9375f;
    }
}
