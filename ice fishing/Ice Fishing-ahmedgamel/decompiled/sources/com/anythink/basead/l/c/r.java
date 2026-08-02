package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class r extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10225a = "CreativeExtensions";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10226b = "CreativeExtension";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<q> f10227c = new ArrayList<>();

    private r(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10225a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f10226b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10226b);
                    this.f10227c.add(new q(xmlPullParser));
                    xmlPullParser.require(3, null, f10226b);
                }
            }
        }
    }

    private ArrayList<q> a() {
        return this.f10227c;
    }
}
