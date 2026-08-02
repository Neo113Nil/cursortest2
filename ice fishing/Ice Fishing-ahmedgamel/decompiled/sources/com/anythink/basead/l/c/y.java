package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class y extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10235a = "Extensions";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10236b = "Extension";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<x> f10237c = new ArrayList<>();

    public y(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10235a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f10236b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10236b);
                    this.f10237c.add(new x(xmlPullParser));
                    xmlPullParser.require(3, null, f10236b);
                }
            }
        }
    }

    public final ArrayList<x> a() {
        return this.f10237c;
    }
}
