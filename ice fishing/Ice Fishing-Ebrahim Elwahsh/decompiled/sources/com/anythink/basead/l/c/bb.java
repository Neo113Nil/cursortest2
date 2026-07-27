package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class bb extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9527a = "VideoClicks";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9528b = "ClickThrough";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9529c = "ClickTracking";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9530d = "CustomClick";

    /* renamed from: e, reason: collision with root package name */
    private j f9531e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<k> f9532f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<t> f9533g = new ArrayList<>();

    public bb(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9527a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9528b)) {
                    xmlPullParser.require(2, null, f9528b);
                    this.f9531e = new j(xmlPullParser);
                    xmlPullParser.require(3, null, f9528b);
                } else if (name != null && name.equals(f9529c)) {
                    xmlPullParser.require(2, null, f9529c);
                    this.f9532f.add(new k(xmlPullParser));
                    xmlPullParser.require(3, null, f9529c);
                } else if (name == null || !name.equals(f9530d)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9530d);
                    this.f9533g.add(new t(xmlPullParser));
                    xmlPullParser.require(3, null, f9530d);
                }
            }
        }
    }

    private ArrayList<t> c() {
        return this.f9533g;
    }

    public final j a() {
        return this.f9531e;
    }

    public final ArrayList<k> b() {
        return this.f9532f;
    }
}
