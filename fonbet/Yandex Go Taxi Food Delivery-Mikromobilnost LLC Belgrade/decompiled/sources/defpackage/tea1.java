package defpackage;

import java.io.StringReader;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import ru.CryptoPro.JCP.tools.HexString;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public abstract class tea1 {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static au2 d;
    public static mgv e;

    public static String a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i] = (char) (c2 ^ HexString.CHAR_SPACE);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wk71 b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!nja1.d(newPullParser, "x:xmpmeta")) {
            dy31.g(null, "Couldn't find xmp metadata");
            return null;
        }
        p481 p481Var = t31.b;
        wk2 wk2Var = wk2.x;
        long j = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (nja1.d(newPullParser, "rdf:Description")) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String a2 = nja1.a(newPullParser, a[i2]);
                    if (a2 == null) {
                        i2++;
                    } else {
                        if (Integer.parseInt(a2) != 1) {
                            break;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            String a3 = nja1.a(newPullParser, b[i3]);
                            if (a3 != null) {
                                j = Long.parseLong(a3);
                            } else {
                                i3++;
                            }
                        }
                        j = -9223372036854775807L;
                        while (true) {
                            if (i >= 2) {
                                p481 p481Var2 = t31.b;
                                wk2Var = wk2.x;
                                break;
                            }
                            String a4 = nja1.a(newPullParser, c[i]);
                            if (a4 != null) {
                                wk2Var = t31.n(new ih71("image/jpeg", 0L, 0L), new ih71("video/mp4", Long.parseLong(a4), 0L));
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else if (nja1.d(newPullParser, "Container:Directory")) {
                wk2Var = c(newPullParser, "Container", "Item");
            } else if (nja1.d(newPullParser, "GContainer:Directory")) {
                wk2Var = c(newPullParser, "GContainer", "GContainerItem");
            }
            if (nja1.c(newPullParser, "x:xmpmeta")) {
                if (!wk2Var.isEmpty()) {
                    return new wk71(j, wk2Var);
                }
            }
        }
        return null;
    }

    public static wk2 c(XmlPullParser xmlPullParser, String str, String str2) {
        p481 p481Var = t31.b;
        ela1.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i = 0;
        do {
            xmlPullParser.next();
            if (nja1.d(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a2 = nja1.a(xmlPullParser, concat3);
                String a3 = nja1.a(xmlPullParser, concat4);
                String a4 = nja1.a(xmlPullParser, concat5);
                String a5 = nja1.a(xmlPullParser, concat6);
                if (a2 == null || a3 == null) {
                    return wk2.x;
                }
                ih71 ih71Var = new ih71(a2, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L);
                int i2 = i + 1;
                if (objArr.length < i2) {
                    objArr = Arrays.copyOf(objArr, jr71.a(objArr.length, i2));
                }
                objArr[i] = ih71Var;
                i = i2;
            }
        } while (!nja1.c(xmlPullParser, concat2));
        return t31.p(i, objArr);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:340)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:272)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:77)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:57)
        */
    public static boolean d(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r6.length()
            if (r6 != r7) goto L7
            goto L31
        L7:
            int r1 = r7.length()
            r2 = 0
            if (r0 == r1) goto Lf
            goto L30
        Lf:
            r1 = r2
        L10:
            if (r1 >= r0) goto L31
            char r3 = r6.charAt(r1)
            char r4 = r7.charAt(r1)
            if (r3 != r4) goto L1d
            goto L2d
        L1d:
            r3 = r3 | 32
            int r3 = r3 + (-97)
            char r3 = (char) r3
            r5 = 26
            if (r3 >= r5) goto L30
            r4 = r4 | 32
            int r4 = r4 + (-97)
            char r4 = (char) r4
            if (r3 != r4) goto L30
        L2d:
            int r1 = r1 + 1
            goto L10
        L30:
            return r2
        L31:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tea1.d(java.lang.String, java.lang.String):boolean");
    }

    public static String e(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i] = (char) (c2 ^ HexString.CHAR_SPACE);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static final au2 f() {
        au2 au2Var = d;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Exclamation", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        long j = iq2.g;
        a6t0 a6t0Var = new a6t0(j);
        uq90 uq90Var = new uq90();
        uq90Var.k(11.0f, 14.0f);
        uq90Var.i(-0.25f, -6.0f);
        uq90Var.g(2.5f);
        uq90Var.h(13.0f, 14.0f);
        uq90Var.c();
        uq90Var.j(13.5f, 17.0f);
        uq90Var.b(1.5f, 1.5f, true, true, -3.0f, 0.0f);
        uq90Var.b(1.5f, 1.5f, false, true, 3.0f, 0.0f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", uq90Var.a);
        a6t0 a6t0Var2 = new a6t0(j);
        uq90 e2 = nnm.e(10.74f, 2.2f);
        e2.e(0.82f, -0.27f, 1.7f, -0.27f, 2.52f, 0.0f);
        e2.e(0.88f, 0.28f, 1.52f, 0.93f, 2.1f, 1.73f);
        e2.b(40.0f, 40.0f, false, true, 2.0f, 3.24f);
        e2.i(3.33f, 5.73f);
        e2.m(1.18f, 2.0f, 1.8f, 3.3f);
        e2.e(0.39f, 0.89f, 0.64f, 1.76f, 0.44f, 2.64f);
        e2.b(4.0f, 4.0f, false, true, -1.26f, 2.13f);
        e2.b(4.4f, 4.4f, false, true, -2.54f, 0.93f);
        e2.e(-0.98f, 0.1f, -2.23f, 0.1f, -3.8f, 0.1f);
        e2.f(8.67f);
        e2.e(-1.57f, 0.0f, -2.82f, 0.0f, -3.8f, -0.1f);
        e2.b(4.4f, 4.4f, false, true, -2.54f, -0.93f);
        e2.b(4.0f, 4.0f, false, true, -1.26f, -2.13f);
        e2.e(-0.2f, -0.88f, 0.05f, -1.75f, 0.45f, -2.64f);
        e2.m(0.6f, -1.3f, 1.79f, -3.3f);
        e2.i(3.33f, -5.73f);
        e2.b(40.0f, 40.0f, false, true, 2.0f, -3.24f);
        e2.b(4.4f, 4.4f, false, true, 2.1f, -1.73f);
        e2.k(1.9f, 1.9f);
        e2.b(2.0f, 2.0f, false, false, -1.27f, 0.0f);
        e2.e(-0.25f, 0.08f, -0.57f, 0.3f, -1.08f, 1.0f);
        e2.e(-0.5f, 0.7f, -1.09f, 1.7f, -1.91f, 3.11f);
        e2.h(5.1f, 13.85f);
        e2.a(38.0f, 38.0f, false, false, 3.38f, 17.0f);
        e2.e(-0.34f, 0.78f, -0.38f, 1.16f, -0.32f, 1.41f);
        e2.b(2.0f, 2.0f, false, false, 0.63f, 1.07f);
        e2.e(0.19f, 0.17f, 0.55f, 0.34f, 1.4f, 0.42f);
        e2.e(0.85f, 0.1f, 2.0f, 0.1f, 3.64f, 0.1f);
        e2.g(6.54f);
        e2.e(1.64f, 0.0f, 2.79f, 0.0f, 3.64f, -0.1f);
        e2.e(0.85f, -0.08f, 1.21f, -0.25f, 1.4f, -0.42f);
        e2.b(2.0f, 2.0f, false, false, 0.63f, -1.07f);
        e2.e(0.06f, -0.25f, 0.02f, -0.63f, -0.32f, -1.4f);
        e2.b(38.0f, 38.0f, false, false, -1.73f, -3.16f);
        e2.h(15.62f, 8.2f);
        e2.b(39.0f, 39.0f, false, false, -1.9f, -3.1f);
        e2.e(-0.52f, -0.7f, -0.84f, -0.93f, -1.09f, -1.0f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", e2.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        d = a2;
        return a2;
    }
}
