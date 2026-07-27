package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class r extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9596a = "CreativeExtensions";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9597b = "CreativeExtension";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<q> f9598c = new ArrayList<>();

    private r(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9596a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9597b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9597b);
                    this.f9598c.add(new q(xmlPullParser));
                    xmlPullParser.require(3, null, f9597b);
                }
            }
        }
    }

    private ArrayList<q> a() {
        return this.f9598c;
    }
}
