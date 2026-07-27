package F;

import O.X;
import P2.J;
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
import com.google.android.gms.internal.consent_sdk.AbstractC4391y;
import g.AbstractC4518a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import m.AbstractC4694j0;
import m.C4710s;
import org.xmlpull.v1.XmlPullParserException;
import t0.C4986A;
import t0.C4988C;
import u0.C5052b;
import u0.C5056f;
import v0.AbstractC5103a;
import v7.C5135p;
import w7.C5154a;
import w7.C5156c;
import z0.C5247c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f853a;

    /* renamed from: b, reason: collision with root package name */
    public int f854b;

    /* renamed from: c, reason: collision with root package name */
    public Object f855c;

    /* renamed from: d, reason: collision with root package name */
    public Object f856d;

    public /* synthetic */ d(byte b9, int i) {
        this.f853a = i;
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
        int i6;
        int i9;
        float f3;
        float f9;
        int i10;
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
        TypedArray f10 = b.f(resources, theme, asAttributeSet, C.a.f242d);
        float f11 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : f10.getFloat(8, 0.0f);
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? f10.getFloat(9, 0.0f) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? f10.getFloat(10, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? f10.getFloat(11, 0.0f) : 0.0f;
        float f15 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : f10.getFloat(3, 0.0f);
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? f10.getFloat(4, 0.0f) : 0.0f;
        int i11 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : f10.getInt(2, 0);
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f10.getColor(0, 0) : 0;
        boolean z3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? f10.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            i6 = 0;
            i9 = f10.getColor(1, 0);
        } else {
            i6 = 0;
            i9 = 0;
        }
        int i12 = 1;
        int i13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? f10.getInt(6, i6) : 0;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? f10.getFloat(5, 0.0f) : 0.0f;
        f10.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f18 = f17;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f3 = f11;
            if (next2 == i12) {
                f9 = f12;
                break;
            }
            int depth2 = xml.getDepth();
            f9 = f12;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f19 = b.f(resources, theme, asAttributeSet, C.a.f243e);
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
            f11 = f3;
            f12 = f9;
            i12 = 1;
        }
        s sVar = arrayList2.size() > 0 ? new s(arrayList2, arrayList) : null;
        if (sVar == null) {
            if (!z3) {
                i10 = 1;
                sVar = new s(color, i9, 1, (byte) 0);
                if (i11 == i10) {
                    if (i11 != 2) {
                        radialGradient = new LinearGradient(f3, f9, f13, f14, (int[]) sVar.f2840u, (float[]) sVar.f2841v, i13 != i10 ? i13 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
                    } else {
                        radialGradient = new SweepGradient(f15, f16, (int[]) sVar.f2840u, (float[]) sVar.f2841v);
                    }
                } else {
                    if (f18 <= 0.0f) {
                        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                    }
                    radialGradient = new RadialGradient(f15, f16, f18, (int[]) sVar.f2840u, (float[]) sVar.f2841v, i13 != 1 ? i13 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
                }
                return new d(radialGradient, (ColorStateList) null, 0);
            }
            sVar = new s(color, color2, i9);
        }
        i10 = 1;
        if (i11 == i10) {
        }
        return new d(radialGradient, (ColorStateList) null, 0);
    }

    public static void e(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z3 = false;
        while (i <= length) {
            boolean z6 = kotlin.jvm.internal.h.f(str.charAt(!z3 ? i : length), 32) <= 0;
            if (z3) {
                if (!z6) {
                    break;
                } else {
                    length--;
                }
            } else if (z6) {
                i++;
            } else {
                z3 = true;
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
        ImageView imageView = (ImageView) this.f855c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC4694j0.a(drawable);
        }
        if (drawable == null || (hVar = (i8.h) this.f856d) == null) {
            return;
        }
        C4710s.e(drawable, hVar, imageView.getDrawableState());
    }

    public M3.a b() {
        boolean z3 = true;
        if (!AbstractC4391y.d() && !((ArrayList) this.f855c).contains(AbstractC4391y.a((Context) this.f856d))) {
            z3 = false;
        }
        return new M3.a(z3, this);
    }

    public f4.b c() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        String str = (String) this.f855c;
        return new f4.b(this.f854b, ((Long) this.f856d).longValue(), str);
    }

    public String f() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f854b + 1;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = ((Object[]) this.f855c)[i6];
            if (obj instanceof c8.e) {
                c8.e eVar = (c8.e) obj;
                if (!kotlin.jvm.internal.h.a(eVar.d(), c8.i.f5652c)) {
                    int i9 = ((int[]) this.f856d)[i6];
                    if (i9 >= 0) {
                        sb.append(com.anythink.core.common.d.j.f12378z);
                        sb.append(eVar.f(i9));
                    }
                } else if (((int[]) this.f856d)[i6] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f856d)[i6]);
                    sb.append("]");
                }
            } else if (obj != g8.m.f37720a) {
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
        return ((Shader) this.f855c) == null && (colorStateList = (ColorStateList) this.f856d) != null && colorStateList.isStateful();
    }

    public void h(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f855c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC4518a.f37593f;
        j4.g s9 = j4.g.s(context, attributeSet, iArr, i);
        X.n(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) s9.f38405v, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) s9.f38405v;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = com.bumptech.glide.g.e(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC4694j0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                U.f.c(imageView, s9.h(2));
            }
            if (typedArray.hasValue(3)) {
                U.f.d(imageView, AbstractC4694j0.b(typedArray.getInt(3, -1), null));
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
    public void j(C5247c c5247c) {
        boolean z3;
        ArrayList arrayList;
        Cursor E8 = c5247c.E("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (E8.moveToFirst()) {
                if (E8.getInt(0) == 0) {
                    z3 = true;
                    E8.close();
                    F1.a aVar = (F1.a) this.f856d;
                    F1.a.o(c5247c);
                    if (!z3) {
                        J q8 = F1.a.q(c5247c);
                        if (!q8.f2449a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + q8.f2450b);
                        }
                    }
                    c5247c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    c5247c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) aVar.f903u;
                    arrayList = workDatabase_Impl.f5371f;
                    if (arrayList == null) {
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((K0.b) workDatabase_Impl.f5371f.get(i)).getClass();
                        }
                        return;
                    }
                    return;
                }
            }
            z3 = false;
            E8.close();
            F1.a aVar2 = (F1.a) this.f856d;
            F1.a.o(c5247c);
            if (!z3) {
            }
            c5247c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c5247c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) aVar2.f903u;
            arrayList = workDatabase_Impl2.f5371f;
            if (arrayList == null) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.bumptech.glide.d.c(E8, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(C5247c c5247c) {
        boolean z3;
        C5056f c5056f;
        Cursor E8 = c5247c.E("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (E8.moveToFirst()) {
                if (E8.getInt(0) != 0) {
                    z3 = true;
                    E8.close();
                    if (z3) {
                        J q8 = F1.a.q(c5247c);
                        if (!q8.f2449a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + q8.f2450b);
                        }
                        c5247c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        c5247c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    } else {
                        Cursor F8 = c5247c.F(new D2.b("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = F8.moveToFirst() ? F8.getString(0) : null;
                            F8.close();
                            if (!"5181942b9ebc31ce68dacb56c16fd79f".equals(string) && !"ae2044fb577e65ee8bb576ca48a2f06e".equals(string)) {
                                throw new IllegalStateException(u1.h.f("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 5181942b9ebc31ce68dacb56c16fd79f, found: ", string));
                            }
                        } finally {
                        }
                    }
                    F1.a aVar = (F1.a) this.f856d;
                    ((WorkDatabase_Impl) aVar.f903u).f5366a = c5247c;
                    c5247c.A("PRAGMA foreign_keys = ON");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) aVar.f903u;
                    workDatabase_Impl.getClass();
                    c5056f = workDatabase_Impl.f5369d;
                    c5056f.getClass();
                    synchronized (c5056f.f41008k) {
                        if (c5056f.f41004f) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            c5247c.A("PRAGMA temp_store = MEMORY;");
                            c5247c.A("PRAGMA recursive_triggers='ON';");
                            c5247c.A("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            c5056f.c(c5247c);
                            c5056f.f41005g = c5247c.k("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            c5056f.f41004f = true;
                        }
                    }
                    ArrayList arrayList = ((WorkDatabase_Impl) aVar.f903u).f5371f;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((K0.b) ((WorkDatabase_Impl) aVar.f903u).f5371f.get(i)).getClass();
                            c5247c.b();
                            try {
                                c5247c.A("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - K0.m.f1526a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                c5247c.G();
                                c5247c.z();
                            } catch (Throwable th) {
                                c5247c.z();
                                throw th;
                            }
                        }
                    }
                    this.f855c = null;
                    return;
                }
            }
            z3 = false;
            E8.close();
            if (z3) {
            }
            F1.a aVar2 = (F1.a) this.f856d;
            ((WorkDatabase_Impl) aVar2.f903u).f5366a = c5247c;
            c5247c.A("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) aVar2.f903u;
            workDatabase_Impl2.getClass();
            c5056f = workDatabase_Impl2.f5369d;
            c5056f.getClass();
            synchronized (c5056f.f41008k) {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0085 A[EDGE_INSN: B:86:0x0085->B:69:0x0085 BREAK  A[LOOP:3: B:48:0x0022->B:70:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(C5247c c5247c, int i, int i6) {
        LinkedHashSet linkedHashSet;
        Iterable iterable;
        TreeMap treeMap;
        boolean z3;
        C5052b c5052b = (C5052b) this.f855c;
        F1.a aVar = (F1.a) this.f856d;
        if (c5052b != null) {
            C4986A c4986a = c5052b.f40987d;
            c4986a.getClass();
            if (i == i6) {
                iterable = C5135p.f41439n;
            } else {
                boolean z6 = i6 > i;
                ArrayList arrayList = new ArrayList();
                int i9 = i;
                do {
                    if (z6) {
                        if (i9 >= i6) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) c4986a.f40530n).get(Integer.valueOf(i9));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer targetVersion : z6 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z6) {
                                int i10 = i9 + 1;
                                kotlin.jvm.internal.h.d(targetVersion, "targetVersion");
                                int intValue = targetVersion.intValue();
                                if (i10 <= intValue && intValue <= i6) {
                                    Object obj = treeMap.get(targetVersion);
                                    kotlin.jvm.internal.h.b(obj);
                                    arrayList.add(obj);
                                    i9 = targetVersion.intValue();
                                    z3 = true;
                                    break;
                                }
                            } else {
                                kotlin.jvm.internal.h.d(targetVersion, "targetVersion");
                                int intValue2 = targetVersion.intValue();
                                if (i6 <= intValue2 && intValue2 < i9) {
                                    Object obj2 = treeMap.get(targetVersion);
                                    kotlin.jvm.internal.h.b(obj2);
                                    arrayList.add(obj2);
                                    i9 = targetVersion.intValue();
                                    z3 = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z3 = false;
                    } else {
                        if (i9 <= i6) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) c4986a.f40530n).get(Integer.valueOf(i9));
                        if (treeMap == null) {
                        }
                    }
                } while (z3);
                iterable = null;
            }
            if (iterable != null) {
                C5156c c5156c = new C5156c(10);
                Cursor E8 = c5247c.E("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (E8.moveToNext()) {
                    try {
                        c5156c.add(E8.getString(0));
                    } finally {
                    }
                }
                E8.close();
                ListIterator listIterator = d6.c.b(c5156c).listIterator(0);
                while (true) {
                    C5154a c5154a = (C5154a) listIterator;
                    if (!c5154a.hasNext()) {
                        break;
                    }
                    String triggerName = (String) c5154a.next();
                    kotlin.jvm.internal.h.d(triggerName, "triggerName");
                    if (Q7.q.R(triggerName, "room_fts_content_sync_")) {
                        c5247c.A("DROP TRIGGER IF EXISTS ".concat(triggerName));
                    }
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((AbstractC5103a) it.next()).a(c5247c);
                }
                J q8 = F1.a.q(c5247c);
                if (!q8.f2449a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + q8.f2450b);
                }
                c5247c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c5247c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                return;
            }
        }
        C5052b c5052b2 = (C5052b) this.f855c;
        if (c5052b2 != null) {
            if (!((i <= i6 || !c5052b2.f40993k) && c5052b2.f40992j && ((linkedHashSet = c5052b2.f40994l) == null || !linkedHashSet.contains(Integer.valueOf(i))))) {
                c5247c.A("DROP TABLE IF EXISTS `Dependency`");
                c5247c.A("DROP TABLE IF EXISTS `WorkSpec`");
                c5247c.A("DROP TABLE IF EXISTS `WorkTag`");
                c5247c.A("DROP TABLE IF EXISTS `SystemIdInfo`");
                c5247c.A("DROP TABLE IF EXISTS `WorkName`");
                c5247c.A("DROP TABLE IF EXISTS `WorkProgress`");
                c5247c.A("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) aVar.f903u;
                ArrayList arrayList2 = workDatabase_Impl.f5371f;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((K0.b) workDatabase_Impl.f5371f.get(i11)).getClass();
                    }
                }
                F1.a.o(c5247c);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i + " to " + i6 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public String toString() {
        switch (this.f853a) {
            case 6:
                return f();
            case 7:
            default:
                return super.toString();
            case 8:
                StringBuilder sb = new StringBuilder();
                if (((i8.s) this.f855c) == i8.s.f38224v) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f854b);
                sb.append(' ');
                sb.append((String) this.f856d);
                return sb.toString();
        }
    }

    public d(Context context) {
        this.f853a = 1;
        this.f855c = new ArrayList();
        this.f854b = 0;
        this.f856d = context.getApplicationContext();
    }

    public d(i8.s sVar, int i, String str) {
        this.f853a = 8;
        this.f855c = sVar;
        this.f854b = i;
        this.f856d = str;
    }

    public d(R6.a aVar) {
        this.f853a = 2;
        this.f855c = new ConcurrentLinkedDeque();
        this.f854b = 1;
        this.f856d = aVar;
    }

    public d(C5052b c5052b, F1.a aVar) {
        this.f853a = 9;
        this.f853a = 9;
        this.f854b = 16;
        this.f855c = c5052b;
        this.f856d = aVar;
    }

    public d(ImageView imageView) {
        this.f853a = 7;
        this.f854b = 0;
        this.f855c = imageView;
    }

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f853a = 0;
        this.f855c = shader;
        this.f856d = colorStateList;
        this.f854b = i;
    }

    public d(N1.h hVar) {
        this.f853a = 10;
        this.f856d = O1.d.a(150, new C4988C(1, this));
        this.f855c = hVar;
    }

    public void i(C5247c c5247c) {
    }
}
