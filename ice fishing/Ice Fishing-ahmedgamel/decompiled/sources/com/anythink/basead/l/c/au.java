package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class au extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9335a = "TrackingEvents";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9336b = "Tracking";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<at> f9337c = new ArrayList<>();

    public au(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9335a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9336b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9336b);
                    this.f9337c.add(new at(xmlPullParser));
                    xmlPullParser.require(3, null, f9336b);
                }
            }
        }
    }

    public final ArrayList<at> a() {
        return this.f9337c;
    }
}
