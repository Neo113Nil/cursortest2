package com.gamericefishpro.space.u6;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase_Impl;
import com.gamericefishpro.space.d4.l1;
import com.gamericefishpro.space.d4.o1;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.l6.t;
import com.gamericefishpro.space.l6.w;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.s5.v;
import com.gamericefishpro.space.t0.f1;
import com.gamericefishpro.space.t0.h2;
import com.gamericefishpro.space.u0.k0;
import com.gamericefishpro.space.z4.b0;
import com.gamericefishpro.space.z4.z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.e1.j, com.gamericefishpro.space.d4.p, w, com.gamericefishpro.space.r9.a, OnCompleteListener, k0 {
    public Object d;
    public Object e;

    public /* synthetic */ c(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    @Override // com.gamericefishpro.space.u0.k0
    public List a(Integer num) {
        List listA = ((k0) this.d).a(null);
        h2 h2Var = (h2) this.e;
        int i = h2Var.v;
        return i < 0 ? listA : CollectionsKt.F(f.l(h2Var, num, i, Integer.valueOf(h2Var.E(h2Var.b, i))), listA);
    }

    @Override // com.gamericefishpro.space.e1.j
    public Object b(Object obj) {
        return ((Function1) this.e).invoke(obj);
    }

    @Override // com.gamericefishpro.space.e1.j
    public Object c(com.gamericefishpro.space.e1.b bVar, Object obj) {
        return ((Function2) this.d).invoke(bVar, obj);
    }

    public void d() {
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.e = null;
    }

    @Override // com.gamericefishpro.space.r9.a
    public Object e(Task task) {
        Bundle bundle;
        com.gamericefishpro.space.r8.b bVar = (com.gamericefishpro.space.r8.b) this.d;
        Bundle bundle2 = (Bundle) this.e;
        bVar.getClass();
        return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? bVar.a(bundle2).k(com.gamericefishpro.space.r8.h.i, com.gamericefishpro.space.r8.d.v) : task;
    }

    public void f(int i) {
        int[] iArr = (int[]) this.d;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.d;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public File g() {
        if (((File) this.d) == null) {
            synchronized (this) {
                try {
                    if (((File) this.d) == null) {
                        com.gamericefishpro.space.wa.g gVar = (com.gamericefishpro.space.wa.g) this.e;
                        gVar.a();
                        this.d = new File(gVar.a.getFilesDir(), "PersistedInstallation." + ((com.gamericefishpro.space.wa.g) this.e).d() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.d;
    }

    public ArrayList h(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.d;
        v vVarB = v.b(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            vVarB.p(1);
        } else {
            vVarB.i(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorL.getCount());
            while (cursorL.moveToNext()) {
                arrayList.add(cursorL.isNull(0) ? null : cursorL.getString(0));
            }
            return arrayList;
        } finally {
            cursorL.close();
            vVarB.c();
        }
    }

    public l0 i() {
        return (l0) ((f1) this.e).getValue();
    }

    public String j(String str) {
        String str2 = (String) this.e;
        Resources resources = (Resources) this.d;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void k(com.gamericefishpro.space.pb.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.a);
            jSONObject.put("Status", com.gamericefishpro.space.i3.e.b(bVar.b));
            jSONObject.put("AuthToken", bVar.c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.g);
            com.gamericefishpro.space.wa.g gVar = (com.gamericefishpro.space.wa.g) this.e;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(g())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    @Override // com.gamericefishpro.space.d4.p
    public o1 l(View view, o1 o1Var) {
        boolean z;
        boolean z2;
        com.gamericefishpro.space.b4.f fVar = (com.gamericefishpro.space.b4.f) this.d;
        com.gamericefishpro.space.d9.d dVar = (com.gamericefishpro.space.d9.d) this.e;
        int i = dVar.a;
        int i2 = dVar.b;
        int i3 = dVar.c;
        l1 l1Var = o1Var.a;
        com.gamericefishpro.space.u3.b bVarG = l1Var.g(519);
        com.gamericefishpro.space.u3.b bVarG2 = l1Var.g(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) fVar.e;
        int i4 = bVarG.b;
        int i5 = bVarG.c;
        int i6 = bVarG.a;
        bottomSheetBehavior.w = i4;
        boolean z3 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.o;
        if (z4) {
            int i7 = l1Var.l().d;
            bottomSheetBehavior.v = i7;
            paddingBottom = i3 + i7;
        }
        int i8 = paddingBottom;
        if (bottomSheetBehavior.p) {
            paddingLeft = (z3 ? i2 : i) + i6;
        }
        int i9 = paddingLeft;
        if (bottomSheetBehavior.q) {
            if (!z3) {
                i = i2;
            }
            paddingRight = i + i5;
        }
        int i10 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.s || marginLayoutParams.leftMargin == i6) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.u) {
            int i11 = marginLayoutParams.topMargin;
            int i12 = bVarG.b;
            if (i11 != i12) {
                marginLayoutParams.topMargin = i12;
                z2 = true;
            } else {
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(i9, view.getPaddingTop(), i10, i8);
        boolean z5 = fVar.d;
        if (z5) {
            bottomSheetBehavior.m = bVarG2.d;
        }
        if (!z4 && !z5) {
            return o1Var;
        }
        bottomSheetBehavior.I();
        return o1Var;
    }

    public void m(com.gamericefishpro.space.d9.h hVar) {
        boolean z;
        b0 b0Var = (b0) this.d;
        synchronized (b0Var.a) {
            z = b0Var.d == b0.i;
            b0Var.d = hVar;
        }
        if (z) {
            com.gamericefishpro.space.o.b bVarM = com.gamericefishpro.space.o.b.M();
            z zVar = b0Var.h;
            com.gamericefishpro.space.o.d dVar = bVarM.c;
            if (dVar.e == null) {
                synchronized (dVar.c) {
                    try {
                        if (dVar.e == null) {
                            dVar.e = com.gamericefishpro.space.o.d.f(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            dVar.e.post(zVar);
        }
        if (hVar instanceof com.gamericefishpro.space.l6.v) {
            ((com.gamericefishpro.space.w6.j) this.e).i((com.gamericefishpro.space.l6.v) hVar);
        } else if (hVar instanceof t) {
            ((com.gamericefishpro.space.w6.j) this.e).j(((t) hVar).i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0105 A[Catch: IOException -> 0x008d, XmlPullParserException -> 0x0090, TryCatch #2 {IOException -> 0x008d, XmlPullParserException -> 0x0090, blocks: (B:19:0x005e, B:96:0x0205, B:27:0x0070, B:28:0x007e, B:30:0x0083, B:37:0x0093, B:45:0x00ad, B:40:0x009c, B:43:0x00a5, B:46:0x00bb, B:50:0x00ca, B:52:0x00d2, B:53:0x00dc, B:62:0x0105, B:63:0x010c, B:64:0x0124, B:56:0x00e5, B:58:0x00ed, B:59:0x00fb, B:65:0x0125, B:67:0x012d, B:68:0x013b, B:71:0x0145, B:72:0x0150, B:73:0x0168, B:74:0x0169, B:77:0x0173, B:78:0x017e, B:79:0x0196, B:80:0x0197, B:82:0x019f, B:83:0x01a8, B:86:0x01b2, B:87:0x01bc, B:88:0x01d4, B:89:0x01d5, B:92:0x01df, B:93:0x01e9, B:94:0x0201, B:95:0x0202), top: B:104:0x005e }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void n(Context context, XmlResourceParser xmlResourceParser) {
        com.gamericefishpro.space.n3.o oVar = new com.gamericefishpro.space.n3.o();
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
                    int eventType = xmlResourceParser.getEventType();
                    com.gamericefishpro.space.n3.j jVarD = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (jVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        jVarD.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (jVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        jVarD.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        jVarD = com.gamericefishpro.space.n3.o.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (jVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        jVarD.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (jVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        jVarD.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        jVarD = com.gamericefishpro.space.n3.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        jVarD.d.a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (jVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        com.gamericefishpro.space.n3.b.a(context, xmlResourceParser, jVarD.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        jVarD = com.gamericefishpro.space.n3.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        jVarD.d.g0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (jVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        com.gamericefishpro.space.n3.b.a(context, xmlResourceParser, jVarD.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        jVarD = com.gamericefishpro.space.n3.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        oVar.c.put(Integer.valueOf(jVarD.a), jVarD);
                                        jVarD = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        oVar.c.put(Integer.valueOf(jVarD.a), jVarD);
                                        jVarD = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        oVar.c.put(Integer.valueOf(jVarD.a), jVarD);
                                        jVarD = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.e).put(identifier, oVar);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                ((SparseArray) this.e).put(identifier, oVar);
                return;
            }
        }
    }

    public void o() {
        ((com.gamericefishpro.space.b6.b) this.d).a();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        com.gamericefishpro.space.sa.d dVar = (com.gamericefishpro.space.sa.d) this.d;
        com.gamericefishpro.space.r9.h hVar = (com.gamericefishpro.space.r9.h) this.e;
        synchronized (dVar.f) {
            dVar.e.remove(hVar);
        }
    }

    public void p(Bundle source) {
        com.gamericefishpro.space.b6.b bVar = (com.gamericefishpro.space.b6.b) this.d;
        com.gamericefishpro.space.z5.e eVar = bVar.a;
        if (!bVar.e) {
            bVar.a();
        }
        if (eVar.g().c.a(com.gamericefishpro.space.z4.p.v)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.g().c).toString());
        }
        if (bVar.g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleB = null;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter("androidx.lifecycle.BundlableSavedStateRegistry.key", "key");
            if (source.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleB = f.B("androidx.lifecycle.BundlableSavedStateRegistry.key", source);
            }
        }
        bVar.f = bundleB;
        bVar.g = true;
    }

    public void q(Bundle source) {
        Intrinsics.checkNotNullParameter(source, "outBundle");
        com.gamericefishpro.space.b6.b bVar = (com.gamericefishpro.space.b6.b) this.d;
        Intrinsics.checkNotNullParameter(source, "outBundle");
        m0.c();
        Bundle source2 = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source2, "source");
        Bundle from = bVar.f;
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            source2.putAll(from);
        }
        synchronized (bVar.c) {
            try {
                for (Map.Entry entry : bVar.d.entrySet()) {
                    com.gamericefishpro.space.z5.f.b(source2, (String) entry.getKey(), ((com.gamericefishpro.space.z5.d) entry.getValue()).a());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Intrinsics.checkNotNullParameter(source2, "source");
        if (source2.isEmpty()) {
            return;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        com.gamericefishpro.space.z5.f.b(source, "androidx.lifecycle.BundlableSavedStateRegistry.key", source2);
    }

    public com.gamericefishpro.space.pb.b r() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(g());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = com.gamericefishpro.space.pb.b.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i3 = com.gamericefishpro.space.i3.e.c(5)[iOptInt];
        if (i3 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i3 != 0) {
            return new com.gamericefishpro.space.pb.b(strOptString, i3, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i3 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    public void s() {
        if (((com.gamericefishpro.space.y1.b) this.e) != null) {
            this.e = null;
            ((com.gamericefishpro.space.y.z) this.d).F0(true);
        }
    }

    public void t(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.d)) {
            map = new HashMap((Map) this.d);
        }
        synchronized (((Map) this.e)) {
            map2 = new HashMap((Map) this.e);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((com.gamericefishpro.space.r9.h) entry2.getKey()).b(new com.gamericefishpro.space.t8.d(status));
            }
        }
    }

    public c(com.gamericefishpro.space.b6.b bVar) {
        this.d = bVar;
        this.e = new s(bVar);
    }

    public c(int i) {
        switch (i) {
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                this.d = new b0();
                this.e = new com.gamericefishpro.space.w6.j();
                m(w.s);
                break;
            case 15:
                this.d = Collections.synchronizedMap(new WeakHashMap());
                this.e = Collections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.d = new com.gamericefishpro.space.v0.e(new Reference[16]);
                this.e = new ReferenceQueue();
                break;
        }
    }
}
