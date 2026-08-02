package com.anythink.basead.l.b;

import android.text.TextUtils;
import android.util.Xml;
import com.anythink.basead.exoplayer.k.o;
import com.anythink.basead.l.c.ah;
import com.anythink.basead.l.c.ai;
import com.anythink.basead.l.c.ak;
import com.anythink.basead.l.c.at;
import com.anythink.basead.l.c.av;
import com.anythink.basead.l.c.k;
import com.anythink.basead.l.c.l;
import com.anythink.basead.l.c.p;
import com.anythink.basead.l.c.x;
import com.anythink.basead.l.e;
import com.anythink.basead.l.f;
import com.anythink.expressad.foundation.d.d;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class b extends com.anythink.basead.l.b.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9958a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f9959b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9960c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f9961d = {o.f9234e, o.f9236g, o.f9235f, "video/mkv"};

    /* renamed from: e, reason: collision with root package name */
    private static final String f9962e = "b";

    /* renamed from: f, reason: collision with root package name */
    private boolean f9963f;

    /* renamed from: g, reason: collision with root package name */
    private volatile b f9964g;

    /* renamed from: k, reason: collision with root package name */
    private av f9967k;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<at> f9965h = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<ah> f9966j = new ArrayList<>();
    private ArrayList<k> i = new ArrayList<>();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0036, code lost:
    
        r4 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(String str) {
        int indexOf;
        this.f9963f = false;
        String str2 = null;
        if (str != null) {
            try {
                if (!str.isEmpty() && (indexOf = str.indexOf("<")) > 0) {
                    str2 = str.substring(indexOf);
                }
            } catch (Throwable th) {
                throw new com.anythink.basead.l.b("-3", th.getLocalizedMessage());
            }
        }
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        this.f9967k = new av(newPullParser);
        this.f9963f = true;
    }

    public static String e(b bVar) {
        com.anythink.basead.l.c.a aVar = bVar.f9967k.a().get(0);
        if (aVar == null || aVar.a() == null || aVar.a().b() == null) {
            return null;
        }
        return aVar.a().b().a();
    }

    private ArrayList<at> g() {
        return this.f9965h;
    }

    private List<String> h() {
        ArrayList arrayList = new ArrayList();
        if (this.f9964g != null) {
            this.f9964g.h();
            arrayList.addAll(this.f9964g.h());
        }
        return arrayList;
    }

    private List<String> i() {
        ArrayList arrayList = new ArrayList();
        if (this.f9964g != null) {
            this.f9964g.i();
            arrayList.addAll(this.f9964g.i());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r1.f9964g.j() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean j() {
        if (this.f9963f) {
            if (this.f9964g != null) {
            }
            return true;
        }
        return false;
    }

    private b k() {
        return this.f9964g;
    }

    public final ArrayList<ah> a() {
        return this.f9966j;
    }

    public final ArrayList<k> b() {
        return this.i;
    }

    public final av c() {
        return this.f9967k;
    }

    public final String d() {
        if (this.f9967k.a() == null) {
            return null;
        }
        Iterator<com.anythink.basead.l.c.a> it = this.f9967k.a().iterator();
        while (it.hasNext()) {
            com.anythink.basead.l.c.a next = it.next();
            if (next.b() != null && next.b().a() != null) {
                return next.b().a().a();
            }
        }
        return null;
    }

    public final String f(b bVar) {
        b bVar2 = this;
        while (bVar2.f9964g != null) {
            b bVar3 = bVar2.f9964g;
            b bVar4 = bVar2.f9964g;
            bVar2 = bVar3;
            bVar = bVar4;
        }
        com.anythink.basead.l.c.a aVar = bVar.f9967k.a().get(0);
        if (aVar.a().e() == null) {
            return null;
        }
        Iterator<p> it = aVar.a().e().iterator();
        while (it.hasNext()) {
            p next = it.next();
            if (next.a() != null && next.a().e() != null && next.a().e().a() != null) {
                return next.a().e().a().a();
            }
        }
        return null;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f9968a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f9969b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f9970c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f9971d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f9972e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f9973f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final int f9974g = 6;

        /* renamed from: h, reason: collision with root package name */
        public static final int f9975h = 7;
        public static final int i = 8;

        /* renamed from: j, reason: collision with root package name */
        public static final int f9976j = 9;

        /* renamed from: k, reason: collision with root package name */
        public static final int f9977k = 10;

        /* renamed from: l, reason: collision with root package name */
        public static final int f9978l = 11;

        /* renamed from: m, reason: collision with root package name */
        public static final int f9979m = 12;

        /* renamed from: n, reason: collision with root package name */
        public static final int f9980n = 13;

        /* renamed from: o, reason: collision with root package name */
        public static final int f9981o = 14;

        /* renamed from: p, reason: collision with root package name */
        public static final int f9982p = 15;

        /* renamed from: q, reason: collision with root package name */
        public static final int f9983q = 16;

        /* renamed from: r, reason: collision with root package name */
        public static final int f9984r = 17;

        /* renamed from: s, reason: collision with root package name */
        public static final int f9985s = 18;

        /* renamed from: t, reason: collision with root package name */
        public static final int f9986t = 19;

        /* renamed from: u, reason: collision with root package name */
        public static final int f9987u = 20;

        /* renamed from: v, reason: collision with root package name */
        public static final int f9988v = 21;

        /* renamed from: w, reason: collision with root package name */
        public static final String[] f9989w = {"creativeView", d.cg, "firstQuartile", d.ci, "thirdQuartile", d.ck, "mute", d.cm, d.co, "rewind", d.cp, "fullscreen", "exitFullscreen", "expand", "collapse", "acceptInvitation", "acceptInvitationLinear", "closeLinear", d.cs, "skip", "error", "impression", "click"};

        /* renamed from: x, reason: collision with root package name */
        private int f9990x;

        /* renamed from: y, reason: collision with root package name */
        private String f9991y;

        private a(String str, String str2) {
            this.f9990x = a(str);
            this.f9991y = str2;
        }

        private static int a(String str) {
            int i4 = 0;
            while (true) {
                String[] strArr = f9989w;
                if (i4 >= strArr.length) {
                    return -1;
                }
                if (strArr[i4].equals(str)) {
                    return i4;
                }
                i4++;
            }
        }

        private String b() {
            return this.f9991y;
        }

        private int a() {
            return this.f9990x;
        }
    }

    private static String b(String str) {
        int indexOf;
        if (str == null || str.isEmpty() || (indexOf = str.indexOf("<")) <= 0) {
            return null;
        }
        return str.substring(indexOf);
    }

    private static boolean c(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            while (true) {
                String[] strArr = f9961d;
                if (i >= strArr.length) {
                    break;
                }
                if (str.equalsIgnoreCase(strArr[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public final String a(b bVar, int i, int i4) {
        ArrayList arrayList = new ArrayList();
        if (this.f9964g != null) {
            this.f9964g.a(this.f9964g, i, i4);
            return null;
        }
        Iterator<p> it = bVar.f9967k.a().get(i).a().e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p next = it.next();
            if (next.a() != null && next.a().c() != null) {
                Iterator<ak> it2 = next.a().c().iterator();
                while (it2.hasNext()) {
                    ak next2 = it2.next();
                    if (c(next2.b())) {
                        arrayList.add(next2);
                    }
                }
                if (arrayList.size() != 0) {
                    int i6 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            i6 = i10;
                            break;
                        }
                        ak akVar = (ak) arrayList.get(i6);
                        int parseInt = e.b((CharSequence) akVar.c()) ? 0 : Integer.parseInt(akVar.c());
                        if (parseInt == i4) {
                            break;
                        }
                        int abs = Math.abs(i4 - parseInt);
                        if (i9 == 0 || abs < i9) {
                            i10 = i6;
                            i9 = abs;
                        }
                        i6++;
                    }
                    return ((ak) arrayList.get(i6)).a();
                }
            }
        }
        return null;
    }

    public final void g(b bVar) {
        this.f9964g = bVar;
    }

    public final int e() {
        try {
            return Integer.parseInt(this.f9967k.a().get(0).a().e().get(0).a().c().get(0).c());
        } catch (Exception unused) {
            return 0;
        }
    }

    private static ArrayList<ah> b(av avVar, int i) {
        com.anythink.basead.l.c.a aVar = avVar.a().get(i);
        if (aVar.a() != null) {
            return aVar.a().d();
        }
        if (aVar.b() != null) {
            return aVar.b().b();
        }
        return null;
    }

    public static String c(b bVar) {
        com.anythink.basead.l.c.a aVar = bVar.f9967k.a().get(0);
        if (aVar == null || aVar.a() == null || aVar.a().c() == null) {
            return null;
        }
        return aVar.a().c().a();
    }

    private static com.anythink.basead.l.c.e d(b bVar, int i) {
        ArrayList<x> a9;
        com.anythink.basead.l.c.a aVar = bVar.f9967k.a().get(i);
        if (aVar != null && aVar.a() != null) {
            if (aVar.a().g() != null) {
                return aVar.a().g();
            }
            if (aVar.a().f() != null && (a9 = aVar.a().f().a()) != null) {
                Iterator<x> it = a9.iterator();
                while (it.hasNext()) {
                    x next = it.next();
                    if (next.a() != null) {
                        return next.a();
                    }
                }
            }
        }
        return null;
    }

    private static ArrayList<k> c(av avVar, int i) {
        com.anythink.basead.l.c.a aVar = avVar.a().get(i);
        if (aVar.a() != null) {
            if (aVar.a().e() == null) {
                return null;
            }
            Iterator<p> it = aVar.a().e().iterator();
            while (it.hasNext()) {
                p next = it.next();
                if (next.a() != null && next.a().e() != null && next.a().e().b() != null) {
                    return next.a().e().b();
                }
            }
            return null;
        }
        if (aVar.b() == null || aVar.b().c() == null || aVar.b().c() == null) {
            return null;
        }
        Iterator<p> it2 = aVar.b().c().iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.a() != null && next2.a().e() != null && next2.a().e().b() != null) {
                return next2.a().e().b();
            }
        }
        return null;
    }

    public final int f() {
        try {
            return Integer.parseInt(this.f9967k.a().get(0).a().e().get(0).a().c().get(0).d());
        } catch (Exception unused) {
            return 0;
        }
    }

    public final ArrayList<at> b(b bVar, int i) {
        if (a(bVar.f9967k, i) != null) {
            this.f9965h.addAll(a(bVar.f9967k, i));
        }
        if (bVar.f9964g != null) {
            b(bVar.f9964g, i);
        }
        return this.f9965h;
    }

    public static String d(b bVar) {
        com.anythink.basead.l.c.a aVar = bVar.f9967k.a().get(0);
        if (aVar == null || aVar.a() == null || aVar.a().a() == null) {
            return null;
        }
        return aVar.a().a().a();
    }

    public final String b(b bVar) {
        for (b bVar2 = this; bVar2.f9964g != null; bVar2 = bVar2.f9964g) {
        }
        com.anythink.basead.l.c.a aVar = bVar.f9967k.a().get(0);
        if (aVar == null || aVar.a() == null || aVar.a().e() == null) {
            return null;
        }
        Iterator<p> it = aVar.a().e().iterator();
        while (it.hasNext()) {
            p next = it.next();
            if (next.a() != null) {
                return next.a().b().a();
            }
        }
        return null;
    }

    public final ArrayList<ah> a(b bVar, int i) {
        if (b(bVar.f9967k, i) != null) {
            this.f9966j.addAll(b(bVar.f9967k, i));
        }
        if (bVar.f9964g != null) {
            a(bVar.f9964g, i);
        }
        return this.f9966j;
    }

    public final ArrayList<k> c(b bVar, int i) {
        ArrayList<k> b9;
        com.anythink.basead.l.c.a aVar = bVar.f9967k.a().get(i);
        if (aVar.a() != null) {
            if (aVar.a().e() != null) {
                Iterator<p> it = aVar.a().e().iterator();
                while (it.hasNext()) {
                    p next = it.next();
                    if (next.a() != null && next.a().e() != null && next.a().e().b() != null) {
                        b9 = next.a().e().b();
                        break;
                    }
                }
            }
            b9 = null;
        } else {
            if (aVar.b() != null && aVar.b().c() != null && aVar.b().c() != null) {
                Iterator<p> it2 = aVar.b().c().iterator();
                while (it2.hasNext()) {
                    p next2 = it2.next();
                    if (next2.a() != null && next2.a().e() != null && next2.a().e().b() != null) {
                        b9 = next2.a().e().b();
                        break;
                    }
                }
            }
            b9 = null;
        }
        if (b9 != null) {
            this.i.addAll(b9);
        }
        if (bVar.f9964g != null) {
            c(bVar.f9964g, i);
        }
        return this.i;
    }

    private static ArrayList<at> a(av avVar, int i) {
        com.anythink.basead.l.c.a aVar = avVar.a().get(i);
        if (aVar.a() != null) {
            if (aVar.a().e() == null) {
                return null;
            }
            Iterator<p> it = aVar.a().e().iterator();
            while (it.hasNext()) {
                p next = it.next();
                if (next.a() != null) {
                    return next.a().d();
                }
            }
            return null;
        }
        if (aVar.b() == null || aVar.b().c() == null || aVar.b().c() == null) {
            return null;
        }
        Iterator<p> it2 = aVar.b().c().iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.a() != null) {
                return next2.a().d();
            }
            if (next2.c() != null) {
                return next2.c().a();
            }
        }
        return null;
    }

    public final ArrayList<String> a(f.a aVar) {
        Iterator<at> it = this.f9965h.iterator();
        ArrayList<String> arrayList = new ArrayList<>();
        while (it.hasNext()) {
            at next = it.next();
            if (next.a().equals(a.f9989w[aVar.ordinal()])) {
                arrayList.add(next.b());
            }
        }
        return arrayList;
    }

    public final String a(b bVar) {
        for (b bVar2 = this; bVar2.f9964g != null; bVar2 = bVar2.f9964g) {
        }
        com.anythink.basead.l.c.a aVar = bVar.f9967k.a().get(0);
        if (aVar == null || aVar.a() == null || aVar.a().e() == null) {
            return null;
        }
        Iterator<p> it = aVar.a().e().iterator();
        while (it.hasNext()) {
            p next = it.next();
            if (next.a() != null) {
                return next.a().a();
            }
        }
        return null;
    }

    public static l a(ai aiVar) {
        l lVar;
        l lVar2 = null;
        if (aiVar.e() == null) {
            return null;
        }
        Iterator<p> it = aiVar.e().iterator();
        while (it.hasNext()) {
            ArrayList<l> b9 = it.next().b();
            if (b9 != null && b9.size() != 0) {
                for (int i = 0; i < b9.size(); i++) {
                    try {
                        lVar = b9.get(i);
                        if (lVar == null && lVar2 == null) {
                            throw new IllegalArgumentException("No companions to compare");
                        }
                    } catch (IllegalArgumentException e9) {
                        e9.getMessage();
                    }
                    if (lVar2 != null) {
                        Integer a9 = a(lVar);
                        Integer a10 = a(lVar2);
                        if (a9 == null && a10 == null) {
                            throw new IllegalArgumentException("No companion resources to compare");
                        }
                        if (a10 != null) {
                            if (a9.intValue() >= a10.intValue()) {
                                if (a9.intValue() <= a10.intValue()) {
                                    int a11 = a(lVar.a(), lVar.b());
                                    int a12 = a(lVar2.a(), lVar2.b());
                                    if (a11 >= a12) {
                                        if (a11 <= a12) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    lVar2 = lVar;
                }
            }
        }
        return lVar2;
    }

    private static int a(l lVar, l lVar2) {
        int a9;
        int a10;
        if (lVar == null && lVar2 == null) {
            throw new IllegalArgumentException("No companions to compare");
        }
        if (lVar == null) {
            return 2;
        }
        if (lVar2 == null) {
            return 1;
        }
        Integer a11 = a(lVar);
        Integer a12 = a(lVar2);
        if (a11 == null && a12 == null) {
            throw new IllegalArgumentException("No companion resources to compare");
        }
        if (a11 == null) {
            return 2;
        }
        if (a12 == null || a11.intValue() < a12.intValue()) {
            return 1;
        }
        if (a11.intValue() <= a12.intValue() && (a9 = a(lVar.a(), lVar.b())) >= (a10 = a(lVar2.a(), lVar2.b()))) {
            return a9 > a10 ? 1 : 0;
        }
        return 2;
    }

    private static int a(String str, String str2) {
        return (e.b((CharSequence) str) ? 0 : Integer.parseInt(str)) * (e.b((CharSequence) str2) ? 0 : Integer.parseInt(str2));
    }

    public static Integer a(l lVar) {
        if (lVar == null) {
            return null;
        }
        if (lVar.e() != null) {
            return 1;
        }
        if (lVar.c() != null) {
            return 2;
        }
        return lVar.d() != null ? 3 : null;
    }

    public static at a(ArrayList<at> arrayList) {
        if (arrayList == null) {
            return null;
        }
        Iterator<at> it = arrayList.iterator();
        while (it.hasNext()) {
            at next = it.next();
            if (next.a().equals("creativeView")) {
                return next;
            }
        }
        return null;
    }

    private void a(String str) {
        int indexOf;
        String str2 = null;
        if (str != null && !str.isEmpty() && (indexOf = str.indexOf("<")) > 0) {
            str2 = str.substring(indexOf);
        }
        if (str2 != null) {
            str = str2;
        }
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        this.f9967k = new av(newPullParser);
    }
}
