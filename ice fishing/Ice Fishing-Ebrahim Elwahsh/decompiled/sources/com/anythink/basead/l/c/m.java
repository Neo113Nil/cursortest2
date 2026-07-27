package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class m extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9581a = "CompanionAds";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9582b = "Companion";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<l> f9583c = new ArrayList<>();

    public m(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9581a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9582b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9582b);
                    this.f9583c.add(new l(xmlPullParser));
                    xmlPullParser.require(3, null, f9582b);
                }
            }
        }
    }

    public final ArrayList<l> a() {
        return this.f9583c;
    }
}
