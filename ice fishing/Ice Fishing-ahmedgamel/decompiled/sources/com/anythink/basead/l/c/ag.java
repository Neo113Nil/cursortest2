package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ag extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9248a = "Icons";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9249b = "Icon";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<ab> f9250c = new ArrayList<>();

    public ag(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9248a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9249b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9249b);
                    this.f9250c.add(new ab(xmlPullParser));
                    xmlPullParser.require(3, null, f9249b);
                }
            }
        }
    }

    public final ArrayList<ab> a() {
        return this.f9250c;
    }
}
