package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class r extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9439a = "CreativeExtensions";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9440b = "CreativeExtension";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<q> f9441c = new ArrayList<>();

    private r(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9439a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9440b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9440b);
                    this.f9441c.add(new q(xmlPullParser));
                    xmlPullParser.require(3, null, f9440b);
                }
            }
        }
    }

    private ArrayList<q> a() {
        return this.f9441c;
    }
}
