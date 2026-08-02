package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class s extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10228a = "Creatives";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10229b = "Creative";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<p> f10230c = new ArrayList<>();

    public s(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10228a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f10229b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10229b);
                    this.f10230c.add(new p(xmlPullParser));
                    xmlPullParser.require(3, null, f10229b);
                }
            }
        }
    }

    public final ArrayList<p> a() {
        return this.f10230c;
    }
}
