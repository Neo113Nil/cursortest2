package defpackage;

import java.math.RoundingMode;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class r9r extends q8 {
    public final LinkedList e;
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public int k;
    public boolean l;
    public l9r m;

    public r9r(String str) {
        super((q8) null, str, "SmoothStreamingMedia");
        this.k = -1;
        this.m = null;
        this.e = new LinkedList();
    }

    @Override // defpackage.q8
    public final void a(Object obj) {
        if (obj instanceof m9r) {
            this.e.add((m9r) obj);
        } else if (obj instanceof l9r) {
            vq1.A(this.m == null);
            this.m = (l9r) obj;
        }
    }

    @Override // defpackage.q8
    public final Object b() {
        l9r l9rVar;
        long g0;
        LinkedList linkedList = this.e;
        int size = linkedList.size();
        m9r[] m9rVarArr = new m9r[size];
        linkedList.toArray(m9rVarArr);
        l9r l9rVar2 = this.m;
        if (l9rVar2 != null) {
            pqa pqaVar = new pqa(new oqa(l9rVar2.a, null, "video/mp4", l9rVar2.b));
            for (int i = 0; i < size; i++) {
                m9r m9rVar = m9rVarArr[i];
                int i2 = m9rVar.a;
                if (i2 == 2 || i2 == 1) {
                    dsc[] dscVarArr = m9rVar.j;
                    for (int i3 = 0; i3 < dscVarArr.length; i3++) {
                        bsc a = dscVarArr[i3].a();
                        a.q = pqaVar;
                        dscVarArr[i3] = new dsc(a);
                    }
                }
            }
        }
        int i4 = this.f;
        int i5 = this.g;
        long j = this.h;
        long j2 = this.i;
        long j3 = this.j;
        int i6 = this.k;
        boolean z = this.l;
        l9r l9rVar3 = this.m;
        long j4 = -9223372036854775807L;
        if (j2 == 0) {
            l9rVar = l9rVar3;
            g0 = -9223372036854775807L;
        } else {
            int i7 = dvt.a;
            l9rVar = l9rVar3;
            g0 = dvt.g0(j2, 1000000L, j, RoundingMode.DOWN);
        }
        if (j3 != 0) {
            int i8 = dvt.a;
            j4 = dvt.g0(j3, 1000000L, j, RoundingMode.DOWN);
        }
        return new n9r(i4, i5, g0, j4, i6, z, l9rVar, m9rVarArr);
    }

    @Override // defpackage.q8
    public final void j(XmlPullParser xmlPullParser) {
        this.f = q8.i("MajorVersion", xmlPullParser);
        this.g = q8.i("MinorVersion", xmlPullParser);
        this.h = q8.h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new o9r("Duration", 0);
        }
        try {
            this.i = Long.parseLong(attributeValue);
            this.j = q8.h(xmlPullParser, "DVRWindowLength", 0L);
            this.k = q8.g("LookaheadCount", xmlPullParser);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            l(Long.valueOf(this.h), "TimeScale");
        } catch (NumberFormatException e) {
            throw r7k.b(null, e);
        }
    }
}
