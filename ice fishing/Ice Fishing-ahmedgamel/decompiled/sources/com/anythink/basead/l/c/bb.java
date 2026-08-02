package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class bb extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10156a = "VideoClicks";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10157b = "ClickThrough";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10158c = "ClickTracking";

    /* renamed from: d, reason: collision with root package name */
    private static final String f10159d = "CustomClick";

    /* renamed from: e, reason: collision with root package name */
    private j f10160e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<k> f10161f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<t> f10162g = new ArrayList<>();

    public bb(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10156a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f10157b)) {
                    xmlPullParser.require(2, null, f10157b);
                    this.f10160e = new j(xmlPullParser);
                    xmlPullParser.require(3, null, f10157b);
                } else if (name != null && name.equals(f10158c)) {
                    xmlPullParser.require(2, null, f10158c);
                    this.f10161f.add(new k(xmlPullParser));
                    xmlPullParser.require(3, null, f10158c);
                } else if (name == null || !name.equals(f10159d)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10159d);
                    this.f10162g.add(new t(xmlPullParser));
                    xmlPullParser.require(3, null, f10159d);
                }
            }
        }
    }

    private ArrayList<t> c() {
        return this.f10162g;
    }

    public final j a() {
        return this.f10160e;
    }

    public final ArrayList<k> b() {
        return this.f10161f;
    }
}
