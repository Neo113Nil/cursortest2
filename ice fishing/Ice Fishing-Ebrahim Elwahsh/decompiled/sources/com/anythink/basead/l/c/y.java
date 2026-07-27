package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class y extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9606a = "Extensions";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9607b = "Extension";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<x> f9608c = new ArrayList<>();

    public y(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9606a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9607b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9607b);
                    this.f9608c.add(new x(xmlPullParser));
                    xmlPullParser.require(3, null, f9607b);
                }
            }
        }
    }

    public final ArrayList<x> a() {
        return this.f9608c;
    }
}
