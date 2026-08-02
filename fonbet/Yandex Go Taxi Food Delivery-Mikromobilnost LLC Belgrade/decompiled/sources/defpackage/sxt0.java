package defpackage;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser;
import androidx.media3.exoplayer.smoothstreaming.manifest.a;
import java.math.RoundingMode;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class sxt0 extends a {
    public final LinkedList e;
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public int k;
    public boolean l;
    public nxt0 m;

    public sxt0(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.k = -1;
        this.m = null;
        this.e = new LinkedList();
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final void a(Object obj) {
        if (obj instanceof oxt0) {
            this.e.add((oxt0) obj);
        } else if (obj instanceof nxt0) {
            d6z.x(this.m == null);
            this.m = (nxt0) obj;
        }
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final Object b() {
        long e0;
        LinkedList linkedList = this.e;
        int size = linkedList.size();
        oxt0[] oxt0VarArr = new oxt0[size];
        linkedList.toArray(oxt0VarArr);
        if (this.m != null) {
            nxt0 nxt0Var = this.m;
            DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(nxt0Var.a, "video/mp4", nxt0Var.b));
            for (int i = 0; i < size; i++) {
                oxt0 oxt0Var = oxt0VarArr[i];
                int i2 = oxt0Var.a;
                if (i2 == 2 || i2 == 1) {
                    androidx.media3.common.a[] aVarArr = oxt0Var.j;
                    for (int i3 = 0; i3 < aVarArr.length; i3++) {
                        f7s a = aVarArr[i3].a();
                        a.q = drmInitData;
                        aVarArr[i3] = new androidx.media3.common.a(a);
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
        nxt0 nxt0Var2 = this.m;
        long j4 = -9223372036854775807L;
        if (j2 == 0) {
            e0 = -9223372036854775807L;
        } else {
            int i7 = tw21.a;
            e0 = tw21.e0(j2, 1000000L, j, RoundingMode.DOWN);
        }
        if (j3 != 0) {
            int i8 = tw21.a;
            j4 = tw21.e0(j3, 1000000L, j, RoundingMode.DOWN);
        }
        return new pxt0(i4, i5, e0, j4, i6, z, nxt0Var2, oxt0VarArr);
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final void j(XmlPullParser xmlPullParser) {
        this.f = a.i(xmlPullParser, "MajorVersion");
        this.g = a.i(xmlPullParser, "MinorVersion");
        this.h = a.h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new SsManifestParser.MissingFieldException("Duration");
        }
        try {
            this.i = Long.parseLong(attributeValue);
            this.j = a.h(xmlPullParser, "DVRWindowLength", 0L);
            this.k = a.g(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            l(Long.valueOf(this.h), "TimeScale");
        } catch (NumberFormatException e) {
            throw ParserException.b(e, null);
        }
    }
}
