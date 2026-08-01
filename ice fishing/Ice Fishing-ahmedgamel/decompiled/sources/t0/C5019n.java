package t0;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import s1.InterfaceC4970e;
import u1.C5061A;
import u1.C5065d;
import v1.C5106c;
import y1.C5222q;

/* renamed from: t0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5019n implements com.bumptech.glide.load.data.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40733n;

    /* renamed from: u, reason: collision with root package name */
    public Object f40734u;

    /* renamed from: v, reason: collision with root package name */
    public Object f40735v;

    public C5019n(C5061A c5061a, C5222q c5222q) {
        this.f40733n = 1;
        this.f40735v = c5061a;
        this.f40734u = c5222q;
    }

    public static int b(int i, int i6) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i9++;
            if (i9 == i6) {
                i10++;
                i9 = 0;
            } else if (i9 > i6) {
                i10++;
                i9 = 1;
            }
        }
        return i9 + 1 > i6 ? i10 + 1 : i10;
    }

    public Object a(v1.g gVar) {
        HashMap hashMap = (HashMap) this.f40735v;
        C5106c c5106c = (C5106c) hashMap.get(gVar);
        if (c5106c == null) {
            c5106c = new C5106c(gVar);
            hashMap.put(gVar, c5106c);
        } else {
            gVar.a();
        }
        C5106c c5106c2 = c5106c.f41364d;
        c5106c2.f41363c = c5106c.f41363c;
        c5106c.f41363c.f41364d = c5106c2;
        C5106c c5106c3 = (C5106c) this.f40734u;
        c5106c.f41364d = c5106c3;
        C5106c c5106c4 = c5106c3.f41363c;
        c5106c.f41363c = c5106c4;
        c5106c4.f41364d = c5106c;
        c5106c.f41364d.f41363c = c5106c;
        ArrayList arrayList = c5106c.f41362b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c5106c.f41362b.remove(size - 1);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.c
    public void c(Exception exc) {
        C5061A c5061a = (C5061A) this.f40735v;
        C5222q c5222q = (C5222q) this.f40734u;
        C5222q c5222q2 = c5061a.f41043y;
        if (c5222q2 == null || c5222q2 != c5222q) {
            return;
        }
        C5061A c5061a2 = (C5061A) this.f40735v;
        C5222q c5222q3 = (C5222q) this.f40734u;
        u1.i iVar = c5061a2.f41039u;
        C5065d c5065d = c5061a2.f41044z;
        com.bumptech.glide.load.data.d dVar = c5222q3.f41822c;
        iVar.c(c5065d, exc, dVar, dVar.d());
    }

    public void d() {
        ((SparseIntArray) this.f40734u).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        z.i iVar;
        char c9;
        z.n nVar = new z.n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    iVar = null;
                } catch (IOException e9) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e9);
                } catch (XmlPullParserException e10) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e10);
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c10 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c10 = 6;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c10 = 7;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c10 = 5;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c10 = '\t';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c10 = '\b';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                    iVar = z.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    iVar = z.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    iVar = z.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.f42112d.f42140a = true;
                                    break;
                                case 3:
                                    iVar = z.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.f42112d.f42155h0 = 1;
                                    break;
                                case 4:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f42110b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f42113e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f42112d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f42111c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    z.b.a(context, xmlResourceParser, iVar.f42114f);
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c9 = 3;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c9 = 1;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c9 = 2;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c9 = 0;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                default:
                                    c9 = 65535;
                                    break;
                            }
                            if (c9 == 0) {
                                ((SparseArray) this.f40735v).put(identifier, nVar);
                                return;
                            } else if (c9 == 1 || c9 == 2 || c9 == 3) {
                                nVar.f42210c.put(Integer.valueOf(iVar.f42109a), iVar);
                                iVar = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f40735v).put(identifier, nVar);
                return;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public void f(Object obj) {
        C5061A c5061a = (C5061A) this.f40735v;
        C5222q c5222q = (C5222q) this.f40734u;
        C5222q c5222q2 = c5061a.f41043y;
        if (c5222q2 == null || c5222q2 != c5222q) {
            return;
        }
        C5061A c5061a2 = (C5061A) this.f40735v;
        C5222q c5222q3 = (C5222q) this.f40734u;
        u1.k kVar = c5061a2.f41038n.f41073p;
        if (obj != null && kVar.a(c5222q3.f41822c.d())) {
            c5061a2.f41042x = obj;
            c5061a2.f41039u.l(2);
        } else {
            u1.i iVar = c5061a2.f41039u;
            InterfaceC4970e interfaceC4970e = c5222q3.f41820a;
            com.bumptech.glide.load.data.d dVar = c5222q3.f41822c;
            iVar.a(interfaceC4970e, obj, dVar, dVar.d(), c5061a2.f41044z);
        }
    }

    public void g(v1.g gVar, Object obj) {
        HashMap hashMap = (HashMap) this.f40735v;
        C5106c c5106c = (C5106c) hashMap.get(gVar);
        if (c5106c == null) {
            c5106c = new C5106c(gVar);
            c5106c.f41364d = c5106c;
            C5106c c5106c2 = (C5106c) this.f40734u;
            c5106c.f41364d = c5106c2.f41364d;
            c5106c.f41363c = c5106c2;
            c5106c2.f41364d = c5106c;
            c5106c.f41364d.f41363c = c5106c;
            hashMap.put(gVar, c5106c);
        } else {
            gVar.a();
        }
        if (c5106c.f41362b == null) {
            c5106c.f41362b = new ArrayList();
        }
        c5106c.f41362b.add(obj);
    }

    public Object h() {
        C5106c c5106c = (C5106c) this.f40734u;
        C5106c c5106c2 = c5106c.f41364d;
        while (true) {
            if (c5106c2.equals(c5106c)) {
                return null;
            }
            ArrayList arrayList = c5106c2.f41362b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object remove = size > 0 ? c5106c2.f41362b.remove(size - 1) : null;
            if (remove != null) {
                return remove;
            }
            C5106c c5106c3 = c5106c2.f41364d;
            c5106c3.f41363c = c5106c2.f41363c;
            c5106c2.f41363c.f41364d = c5106c3;
            HashMap hashMap = (HashMap) this.f40735v;
            v1.g gVar = c5106c2.f41361a;
            hashMap.remove(gVar);
            gVar.a();
            c5106c2 = c5106c2.f41364d;
        }
    }

    public String toString() {
        switch (this.f40733n) {
            case 2:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C5106c c5106c = (C5106c) this.f40734u;
                C5106c c5106c2 = c5106c.f41363c;
                boolean z3 = false;
                while (!c5106c2.equals(c5106c)) {
                    sb.append('{');
                    sb.append(c5106c2.f41361a);
                    sb.append(':');
                    ArrayList arrayList = c5106c2.f41362b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c5106c2 = c5106c2.f41363c;
                    z3 = true;
                }
                if (z3) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C5019n(int i) {
        this.f40733n = i;
        switch (i) {
            case 2:
                this.f40734u = new C5106c(null);
                this.f40735v = new HashMap();
                break;
            case 3:
                break;
            default:
                this.f40734u = new SparseIntArray();
                this.f40735v = new SparseIntArray();
                break;
        }
    }
}
