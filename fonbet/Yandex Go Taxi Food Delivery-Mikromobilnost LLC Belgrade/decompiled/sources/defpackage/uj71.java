package defpackage;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes7.dex */
public final class uj71 implements zc81 {
    public final xf81 a;
    public final fv71 b;
    public final qg71 c;

    public uj71() {
        xf81 xf81Var = new xf81();
        fv71 fv71Var = new fv71();
        qg71 qg71Var = new qg71();
        this.a = xf81Var;
        this.b = fv71Var;
        this.c = qg71Var;
    }

    @Override // defpackage.zc81
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ArrayList f(XmlPullParser xmlPullParser, zy2 zy2Var) {
        ArrayList arrayList = new ArrayList();
        this.a.getClass();
        xmlPullParser.require(2, null, "MediaFiles");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (jl40.l(name, "MediaFile")) {
                    this.c.getClass();
                    arrayList.add(qg71.a(xmlPullParser));
                } else if (jl40.l(name, "InteractiveCreativeFile")) {
                    this.b.getClass();
                    bs71 a = fv71.a(xmlPullParser);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } else {
                    xf81.b(xmlPullParser);
                }
            }
        }
        return arrayList;
    }
}
