package F;

import O.X;
import R2.J;
import S0.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.consent_sdk.AbstractC4414y;
import g.AbstractC4528a;
import h4.C4575b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import m.AbstractC4707j0;
import m.C4723s;
import m.R0;
import org.xmlpull.v1.XmlPullParserException;
import r2.C4900e;
import u0.C5053b;
import u0.C5057f;
import v0.AbstractC5095a;
import v7.C5125p;
import w.AbstractC5128c;
import w7.C5153a;
import w7.C5155c;
import z0.C5214c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f916a;

    /* renamed from: b, reason: collision with root package name */
    public int f917b;

    /* renamed from: c, reason: collision with root package name */
    public Object f918c;

    /* renamed from: d, reason: collision with root package name */
    public Object f919d;

    public /* synthetic */ d(byte b9, int i) {
        this.f916a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e2, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r5.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d d(Resources resources, int i, Resources.Theme theme) {
        int next;
        int i4;
        int i6;
        float f2;
        float f9;
        int i9;
        Shader radialGradient;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b9 = c.b(resources, xml, asAttributeSet, theme);
                return new d((Shader) null, b9, b9.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f10 = b.f(resources, theme, asAttributeSet, C.a.f308d);
        float f11 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : f10.getFloat(8, 0.0f);
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? f10.getFloat(9, 0.0f) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? f10.getFloat(10, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? f10.getFloat(11, 0.0f) : 0.0f;
        float f15 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : f10.getFloat(3, 0.0f);
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? f10.getFloat(4, 0.0f) : 0.0f;
        int i10 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : f10.getInt(2, 0);
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f10.getColor(0, 0) : 0;
        boolean z6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? f10.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            i4 = 0;
            i6 = f10.getColor(1, 0);
        } else {
            i4 = 0;
            i6 = 0;
        }
        int i11 = 1;
        int i12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? f10.getInt(6, i4) : 0;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? f10.getFloat(5, 0.0f) : 0.0f;
        f10.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f18 = f17;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f2 = f11;
            if (next2 == i11) {
                f9 = f12;
                break;
            }
            int depth2 = xml.getDepth();
            f9 = f12;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f19 = b.f(resources, theme, asAttributeSet, C.a.f309e);
                boolean hasValue = f19.hasValue(0);
                boolean hasValue2 = f19.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = f19.getColor(0, 0);
                float f20 = f19.getFloat(1, 0.0f);
                f19.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f20));
            }
            f11 = f2;
            f12 = f9;
            i11 = 1;
        }
        s sVar = arrayList2.size() > 0 ? new s(arrayList2, arrayList) : null;
        if (sVar == null) {
            if (!z6) {
                i9 = 1;
                sVar = new s(color, i6, 1, (byte) 0);
                if (i10 == i9) {
                    if (i10 != 2) {
                        radialGradient = new LinearGradient(f2, f9, f13, f14, (int[]) sVar.f2969u, (float[]) sVar.f2970v, i12 != i9 ? i12 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
                    } else {
                        radialGradient = new SweepGradient(f15, f16, (int[]) sVar.f2969u, (float[]) sVar.f2970v);
                    }
                } else {
                    if (f18 <= 0.0f) {
                        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                    }
                    radialGradient = new RadialGradient(f15, f16, f18, (int[]) sVar.f2969u, (float[]) sVar.f2970v, i12 != 1 ? i12 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
                }
                return new d(radialGradient, (ColorStateList) null, 0);
            }
            sVar = new s(color, color2, i6);
        }
        i9 = 1;
        if (i10 == i9) {
        }
        return new d(radialGradient, (ColorStateList) null, 0);
    }

    public static void e(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z6 = false;
        while (i <= length) {
            boolean z9 = kotlin.jvm.internal.h.f(str.charAt(!z6 ? i : length), 32) <= 0;
            if (z6) {
                if (!z9) {
                    break;
                } else {
                    length--;
                }
            } else if (z9) {
                i++;
            } else {
                z6 = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e9) {
            Log.w("SupportSQLite", "delete failed: ", e9);
        }
    }

    public void a() {
        i8.h hVar;
        ImageView imageView = (ImageView) this.f918c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC4707j0.a(drawable);
        }
        if (drawable == null || (hVar = (i8.h) this.f919d) == null) {
            return;
        }
        C4723s.e(drawable, hVar, imageView.getDrawableState());
    }

    public O3.a b() {
        boolean z6 = true;
        if (!AbstractC4414y.d() && !((ArrayList) this.f918c).contains(AbstractC4414y.a((Context) this.f919d))) {
            z6 = false;
        }
        return new O3.a(z6, this);
    }

    public C4575b c() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        String str = (String) this.f918c;
        return new C4575b(this.f917b, ((Long) this.f919d).longValue(), str);
    }

    public String f() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f917b + 1;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj = ((Object[]) this.f918c)[i4];
            if (obj instanceof c8.e) {
                c8.e eVar = (c8.e) obj;
                if (!kotlin.jvm.internal.h.a(eVar.d(), c8.i.f5828c)) {
                    int i6 = ((int[]) this.f919d)[i4];
                    if (i6 >= 0) {
                        sb.append(com.anythink.core.common.d.j.f13164z);
                        sb.append(eVar.f(i6));
                    }
                } else if (((int[]) this.f919d)[i4] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f919d)[i4]);
                    sb.append("]");
                }
            } else if (obj != g8.m.f37745a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    public boolean g() {
        ColorStateList colorStateList;
        return ((Shader) this.f918c) == null && (colorStateList = (ColorStateList) this.f919d) != null && colorStateList.isStateful();
    }

    public void h(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f918c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC4528a.f37555f;
        l4.g s9 = l4.g.s(context, attributeSet, iArr, i);
        X.n(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) s9.f38917v, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) s9.f38917v;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = com.bumptech.glide.g.h(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC4707j0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                U.f.c(imageView, s9.h(2));
            }
            if (typedArray.hasValue(3)) {
                U.f.d(imageView, AbstractC4707j0.b(typedArray.getInt(3, -1), null));
            }
            s9.t();
        } catch (Throwable th) {
            s9.t();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(C5214c c5214c) {
        boolean z6;
        ArrayList arrayList;
        Cursor E8 = c5214c.E("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (E8.moveToFirst()) {
                if (E8.getInt(0) == 0) {
                    z6 = true;
                    E8.close();
                    n4.c cVar = (n4.c) this.f919d;
                    n4.c.z(c5214c);
                    if (!z6) {
                        J A9 = n4.c.A(c5214c);
                        if (!A9.f2770a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + A9.f2771b);
                        }
                    }
                    c5214c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    c5214c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f39658u;
                    arrayList = workDatabase_Impl.f5336f;
                    if (arrayList == null) {
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((K0.b) workDatabase_Impl.f5336f.get(i)).getClass();
                        }
                        return;
                    }
                    return;
                }
            }
            z6 = false;
            E8.close();
            n4.c cVar2 = (n4.c) this.f919d;
            n4.c.z(c5214c);
            if (!z6) {
            }
            c5214c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c5214c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) cVar2.f39658u;
            arrayList = workDatabase_Impl2.f5336f;
            if (arrayList == null) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.bumptech.glide.d.h(E8, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(C5214c c5214c) {
        boolean z6;
        C5057f c5057f;
        Cursor E8 = c5214c.E("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (E8.moveToFirst()) {
                if (E8.getInt(0) != 0) {
                    z6 = true;
                    E8.close();
                    if (z6) {
                        J A9 = n4.c.A(c5214c);
                        if (!A9.f2770a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + A9.f2771b);
                        }
                        c5214c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        c5214c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    } else {
                        Cursor F8 = c5214c.F(new F2.b("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 5));
                        try {
                            String string = F8.moveToFirst() ? F8.getString(0) : null;
                            F8.close();
                            if (!"5181942b9ebc31ce68dacb56c16fd79f".equals(string) && !"ae2044fb577e65ee8bb576ca48a2f06e".equals(string)) {
                                throw new IllegalStateException(AbstractC5128c.f("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 5181942b9ebc31ce68dacb56c16fd79f, found: ", string));
                            }
                        } finally {
                        }
                    }
                    n4.c cVar = (n4.c) this.f919d;
                    ((WorkDatabase_Impl) cVar.f39658u).f5331a = c5214c;
                    c5214c.A("PRAGMA foreign_keys = ON");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f39658u;
                    workDatabase_Impl.getClass();
                    c5057f = workDatabase_Impl.f5334d;
                    c5057f.getClass();
                    synchronized (c5057f.f40973k) {
                        if (c5057f.f40969f) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            c5214c.A("PRAGMA temp_store = MEMORY;");
                            c5214c.A("PRAGMA recursive_triggers='ON';");
                            c5214c.A("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            c5057f.c(c5214c);
                            c5057f.f40970g = c5214c.k("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            c5057f.f40969f = true;
                        }
                    }
                    ArrayList arrayList = ((WorkDatabase_Impl) cVar.f39658u).f5336f;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((K0.b) ((WorkDatabase_Impl) cVar.f39658u).f5336f.get(i)).getClass();
                            c5214c.b();
                            try {
                                c5214c.A("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - K0.m.f1635a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                c5214c.G();
                                c5214c.z();
                            } catch (Throwable th) {
                                c5214c.z();
                                throw th;
                            }
                        }
                    }
                    this.f918c = null;
                    return;
                }
            }
            z6 = false;
            E8.close();
            if (z6) {
            }
            n4.c cVar2 = (n4.c) this.f919d;
            ((WorkDatabase_Impl) cVar2.f39658u).f5331a = c5214c;
            c5214c.A("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) cVar2.f39658u;
            workDatabase_Impl2.getClass();
            c5057f = workDatabase_Impl2.f5334d;
            c5057f.getClass();
            synchronized (c5057f.f40973k) {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0085 A[EDGE_INSN: B:86:0x0085->B:69:0x0085 BREAK  A[LOOP:3: B:48:0x0022->B:70:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(C5214c c5214c, int i, int i4) {
        LinkedHashSet linkedHashSet;
        Iterable iterable;
        TreeMap treeMap;
        boolean z6;
        C5053b c5053b = (C5053b) this.f918c;
        n4.c cVar = (n4.c) this.f919d;
        if (c5053b != null) {
            R0 r02 = c5053b.f40952d;
            r02.getClass();
            if (i == i4) {
                iterable = C5125p.f41221n;
            } else {
                boolean z9 = i4 > i;
                ArrayList arrayList = new ArrayList();
                int i6 = i;
                do {
                    if (z9) {
                        if (i6 >= i4) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) r02.f39127n).get(Integer.valueOf(i6));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer targetVersion : z9 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z9) {
                                int i9 = i6 + 1;
                                kotlin.jvm.internal.h.d(targetVersion, "targetVersion");
                                int intValue = targetVersion.intValue();
                                if (i9 <= intValue && intValue <= i4) {
                                    Object obj = treeMap.get(targetVersion);
                                    kotlin.jvm.internal.h.b(obj);
                                    arrayList.add(obj);
                                    i6 = targetVersion.intValue();
                                    z6 = true;
                                    break;
                                }
                            } else {
                                kotlin.jvm.internal.h.d(targetVersion, "targetVersion");
                                int intValue2 = targetVersion.intValue();
                                if (i4 <= intValue2 && intValue2 < i6) {
                                    Object obj2 = treeMap.get(targetVersion);
                                    kotlin.jvm.internal.h.b(obj2);
                                    arrayList.add(obj2);
                                    i6 = targetVersion.intValue();
                                    z6 = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z6 = false;
                    } else {
                        if (i6 <= i4) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) r02.f39127n).get(Integer.valueOf(i6));
                        if (treeMap == null) {
                        }
                    }
                } while (z6);
                iterable = null;
            }
            if (iterable != null) {
                C5155c c5155c = new C5155c(10);
                Cursor E8 = c5214c.E("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (E8.moveToNext()) {
                    try {
                        c5155c.add(E8.getString(0));
                    } finally {
                    }
                }
                E8.close();
                ListIterator listIterator = Z2.d.g(c5155c).listIterator(0);
                while (true) {
                    C5153a c5153a = (C5153a) listIterator;
                    if (!c5153a.hasNext()) {
                        break;
                    }
                    String triggerName = (String) c5153a.next();
                    kotlin.jvm.internal.h.d(triggerName, "triggerName");
                    if (Q7.q.h0(triggerName, "room_fts_content_sync_")) {
                        c5214c.A("DROP TRIGGER IF EXISTS ".concat(triggerName));
                    }
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((AbstractC5095a) it.next()).a(c5214c);
                }
                J A9 = n4.c.A(c5214c);
                if (!A9.f2770a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + A9.f2771b);
                }
                c5214c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c5214c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                return;
            }
        }
        C5053b c5053b2 = (C5053b) this.f918c;
        if (c5053b2 != null) {
            if (!((i <= i4 || !c5053b2.f40958k) && c5053b2.f40957j && ((linkedHashSet = c5053b2.f40959l) == null || !linkedHashSet.contains(Integer.valueOf(i))))) {
                c5214c.A("DROP TABLE IF EXISTS `Dependency`");
                c5214c.A("DROP TABLE IF EXISTS `WorkSpec`");
                c5214c.A("DROP TABLE IF EXISTS `WorkTag`");
                c5214c.A("DROP TABLE IF EXISTS `SystemIdInfo`");
                c5214c.A("DROP TABLE IF EXISTS `WorkName`");
                c5214c.A("DROP TABLE IF EXISTS `WorkProgress`");
                c5214c.A("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f39658u;
                ArrayList arrayList2 = workDatabase_Impl.f5336f;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((K0.b) workDatabase_Impl.f5336f.get(i10)).getClass();
                    }
                }
                n4.c.z(c5214c);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i + " to " + i4 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public String toString() {
        switch (this.f916a) {
            case 5:
                return f();
            case 8:
                StringBuilder sb = new StringBuilder();
                if (((i8.s) this.f918c) == i8.s.f38343v) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f917b);
                sb.append(' ');
                sb.append((String) this.f919d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public d(Context context) {
        this.f916a = 1;
        this.f918c = new ArrayList();
        this.f917b = 0;
        this.f919d = context.getApplicationContext();
    }

    public d(i8.s sVar, int i, String str) {
        this.f916a = 8;
        this.f918c = sVar;
        this.f917b = i;
        this.f919d = str;
    }

    public d(R6.a aVar) {
        this.f916a = 2;
        this.f918c = new ConcurrentLinkedDeque();
        this.f917b = 1;
        this.f919d = aVar;
    }

    public d(C5053b c5053b, n4.c cVar) {
        this.f916a = 9;
        this.f916a = 9;
        this.f917b = 16;
        this.f918c = c5053b;
        this.f919d = cVar;
    }

    public d(ImageView imageView) {
        this.f916a = 7;
        this.f917b = 0;
        this.f918c = imageView;
    }

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f916a = 0;
        this.f918c = shader;
        this.f919d = colorStateList;
        this.f917b = i;
    }

    public d(P1.h hVar) {
        this.f916a = 10;
        this.f919d = Q1.d.a(150, new C4900e(this));
        this.f918c = hVar;
    }

    public void i(C5214c c5214c) {
    }
}
