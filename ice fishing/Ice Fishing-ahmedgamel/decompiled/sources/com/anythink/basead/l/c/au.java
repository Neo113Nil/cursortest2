package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class au extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10121a = "TrackingEvents";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10122b = "Tracking";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<at> f10123c = new ArrayList<>();

    public au(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10121a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f10122b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10122b);
                    this.f10123c.add(new at(xmlPullParser));
                    xmlPullParser.require(3, null, f10122b);
                }
            }
        }
    }

    public final ArrayList<at> a() {
        return this.f10123c;
    }
}
