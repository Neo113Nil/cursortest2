package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class s9r extends q8 {
    public final String e;
    public final LinkedList f;
    public int g;
    public String h;
    public long i;
    public String j;
    public String k;
    public int l;
    public int m;
    public int n;
    public int o;
    public String p;
    public ArrayList q;
    public long r;

    public s9r(q8 q8Var, String str) {
        super(q8Var, str, "StreamIndex");
        this.e = str;
        this.f = new LinkedList();
    }

    @Override // defpackage.q8
    public final void a(Object obj) {
        if (obj instanceof dsc) {
            this.f.add((dsc) obj);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 m9r, still in use, count: 2, list:
          (r3v0 m9r) from 0x0082: MOVE (r26v0 m9r) = (r3v0 m9r) (LINE:131)
          (r3v0 m9r) from 0x004e: MOVE (r26v4 m9r) = (r3v0 m9r) (LINE:79)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.q8
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s9r.b():java.lang.Object");
    }

    @Override // defpackage.q8
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // defpackage.q8
    public final void j(XmlPullParser xmlPullParser) {
        int i = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new o9r("Type", 0);
            }
            if (!CameraProperty.AUDIO.equalsIgnoreCase(attributeValue)) {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    i = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw r7k.b("Invalid key value[" + attributeValue + "]", null);
                    }
                    i = 3;
                }
            }
            this.g = i;
            l(Integer.valueOf(i), "Type");
            if (this.g == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new o9r("Subtype", 0);
                }
                this.h = attributeValue2;
            } else {
                this.h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            l(this.h, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.j = attributeValue3;
            l(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new o9r("Url", 0);
            }
            this.k = attributeValue4;
            this.l = q8.g("MaxWidth", xmlPullParser);
            this.m = q8.g("MaxHeight", xmlPullParser);
            this.n = q8.g("DisplayWidth", xmlPullParser);
            this.o = q8.g("DisplayHeight", xmlPullParser);
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.p = attributeValue5;
            l(attributeValue5, "Language");
            long g = q8.g("TimeScale", xmlPullParser);
            this.i = g;
            if (g == -1) {
                this.i = ((Long) c("TimeScale")).longValue();
            }
            this.q = new ArrayList();
            return;
        }
        int size = this.q.size();
        long h = q8.h(xmlPullParser, "t", -9223372036854775807L);
        if (h == -9223372036854775807L) {
            if (size == 0) {
                h = 0;
            } else {
                if (this.r == -1) {
                    throw r7k.b("Unable to infer start time", null);
                }
                h = this.r + ((Long) this.q.get(size - 1)).longValue();
            }
        }
        this.q.add(Long.valueOf(h));
        this.r = q8.h(xmlPullParser, "d", -9223372036854775807L);
        long h2 = q8.h(xmlPullParser, "r", 1L);
        if (h2 > 1 && this.r == -9223372036854775807L) {
            throw r7k.b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j = i;
            if (j >= h2) {
                return;
            }
            this.q.add(Long.valueOf((this.r * j) + h));
            i++;
        }
    }
}
