package com.google.android.gms.internal.ads;

import O.C0321a;
import O.C0323b;
import O.C0344t;
import android.os.Trace;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.consent_sdk.C4379v;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import l.C4648e;
import t0.AbstractC4990E;
import t0.AbstractC5003S;
import t0.AbstractC5027v;
import t0.AbstractC5031z;
import t0.C4991F;
import t0.C4994I;
import t0.C4995J;
import t0.C5000O;
import t0.C5004T;
import t0.C5013h;

/* renamed from: com.google.android.gms.internal.ads.oP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3675oP {

    /* renamed from: a, reason: collision with root package name */
    public int f32897a;

    /* renamed from: b, reason: collision with root package name */
    public int f32898b;

    /* renamed from: c, reason: collision with root package name */
    public Object f32899c;

    /* renamed from: d, reason: collision with root package name */
    public Object f32900d;

    /* renamed from: e, reason: collision with root package name */
    public Object f32901e;

    /* renamed from: f, reason: collision with root package name */
    public Object f32902f;

    /* renamed from: g, reason: collision with root package name */
    public Object f32903g;

    /* renamed from: h, reason: collision with root package name */
    public Object f32904h;

    public C3675oP(DP dp, DP dp2, int i, int i6, VO vo, C2932ah c2932ah, AbstractC3604n8 abstractC3604n8, Object obj) {
        this.f32899c = dp;
        this.f32900d = dp2;
        this.f32897a = i;
        this.f32898b = i6;
        this.f32901e = vo;
        this.f32902f = c2932ah;
        this.f32903g = abstractC3604n8;
        this.f32904h = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3675oP l(JsonReader jsonReader) {
        boolean z3;
        String nextString;
        boolean z6;
        char c9;
        int i;
        C3675oP c3675oP = new C3675oP();
        c3675oP.f32897a = 1;
        List list = Collections.EMPTY_LIST;
        c3675oP.f32902f = list;
        c3675oP.f32903g = list;
        c3675oP.f32898b = 1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i6 = 7;
            int i9 = 3;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        z3 = false;
                        break;
                    }
                    z3 = -1;
                    break;
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        z3 = 3;
                        break;
                    }
                    z3 = -1;
                    break;
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        z3 = 2;
                        break;
                    }
                    z3 = -1;
                    break;
                case -1734348803:
                    if (nextName.equals("client_side_pingback_url")) {
                        z3 = 7;
                        break;
                    }
                    z3 = -1;
                    break;
                case -1324537865:
                    if (nextName.equals("privacy_options_required")) {
                        z3 = 6;
                        break;
                    }
                    z3 = -1;
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        z3 = 5;
                        break;
                    }
                    z3 = -1;
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        z3 = 4;
                        break;
                    }
                    z3 = -1;
                    break;
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        z3 = true;
                        break;
                    }
                    z3 = -1;
                    break;
                default:
                    z3 = -1;
                    break;
            }
            switch (z3) {
                case false:
                    nextString = jsonReader.nextString();
                    switch (nextString) {
                        case "CONSENT_SIGNAL_UNKNOWN":
                            i6 = 1;
                            c3675oP.f32897a = i6;
                            break;
                        case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                            i6 = 2;
                            c3675oP.f32897a = i6;
                            break;
                        case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                            i6 = 3;
                            c3675oP.f32897a = i6;
                            break;
                        case "CONSENT_SIGNAL_SUFFICIENT":
                            i6 = 4;
                            c3675oP.f32897a = i6;
                            break;
                        case "CONSENT_SIGNAL_COLLECT_CONSENT":
                            i6 = 5;
                            c3675oP.f32897a = i6;
                            break;
                        case "CONSENT_SIGNAL_NOT_REQUIRED":
                            i6 = 6;
                            c3675oP.f32897a = i6;
                            break;
                        case "CONSENT_SIGNAL_ERROR":
                            c3675oP.f32897a = i6;
                            break;
                        case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION":
                            i6 = 8;
                            c3675oP.f32897a = i6;
                            break;
                        default:
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                    }
                case true:
                    c3675oP.f32899c = jsonReader.nextString();
                    break;
                case true:
                    c3675oP.f32900d = jsonReader.nextString();
                    break;
                case true:
                    c3675oP.f32901e = jsonReader.nextString();
                    break;
                case true:
                    c3675oP.f32902f = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ((List) c3675oP.f32902f).add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case true:
                    c3675oP.f32903g = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        C4379v c4379v = new C4379v();
                        c4379v.f35772b = 1;
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            int hashCode = nextName2.hashCode();
                            if (hashCode != -2105551094) {
                                if (hashCode == 1583758243 && nextName2.equals("action_type")) {
                                    z6 = false;
                                }
                                z6 = -1;
                            } else {
                                if (nextName2.equals("args_json")) {
                                    z6 = true;
                                }
                                z6 = -1;
                            }
                            if (!z6) {
                                String nextString2 = jsonReader.nextString();
                                int hashCode2 = nextString2.hashCode();
                                if (hashCode2 == 64208429) {
                                    if (nextString2.equals("CLEAR")) {
                                        c9 = 2;
                                        if (c9 != 0) {
                                        }
                                        c4379v.f35772b = i;
                                    }
                                    c9 = 65535;
                                    if (c9 != 0) {
                                    }
                                    c4379v.f35772b = i;
                                } else if (hashCode2 != 82862015) {
                                    if (hashCode2 == 1856333582 && nextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                        c9 = 0;
                                        if (c9 != 0) {
                                            i = 1;
                                        } else if (c9 == 1) {
                                            i = 2;
                                        } else {
                                            if (c9 != 2) {
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString2));
                                            }
                                            i = 3;
                                        }
                                        c4379v.f35772b = i;
                                    }
                                    c9 = 65535;
                                    if (c9 != 0) {
                                    }
                                    c4379v.f35772b = i;
                                } else {
                                    if (nextString2.equals("WRITE")) {
                                        c9 = 1;
                                        if (c9 != 0) {
                                        }
                                        c4379v.f35772b = i;
                                    }
                                    c9 = 65535;
                                    if (c9 != 0) {
                                    }
                                    c4379v.f35772b = i;
                                }
                            } else if (!z6) {
                                jsonReader.skipValue();
                            } else {
                                c4379v.f35771a = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        ((List) c3675oP.f32903g).add(c4379v);
                    }
                    jsonReader.endArray();
                    break;
                case true:
                    String nextString3 = jsonReader.nextString();
                    int hashCode3 = nextString3.hashCode();
                    if (hashCode3 != -1888946261) {
                        if (hashCode3 != 389487519) {
                            if (hashCode3 == 433141802 && nextString3.equals("UNKNOWN")) {
                            }
                        } else if (nextString3.equals("REQUIRED")) {
                        }
                    } else if (nextString3.equals("NOT_REQUIRED")) {
                    }
                    if (r8 == 0) {
                        i9 = 1;
                    } else if (r8 == 1) {
                        i9 = 2;
                    } else if (r8 != 2) {
                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString3));
                    }
                    c3675oP.f32898b = i9;
                    break;
                case true:
                    c3675oP.f32904h = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c3675oP;
    }

    public void a(AbstractC5003S abstractC5003S, boolean z3) {
        RecyclerView.j(abstractC5003S);
        RecyclerView recyclerView = (RecyclerView) this.f32904h;
        C5004T c5004t = recyclerView.f5240P0;
        if (c5004t != null) {
            a0.b bVar = c5004t.f40611e;
            View view = abstractC5003S.f40593a;
            O.X.o(view, bVar != null ? (C0323b) ((WeakHashMap) bVar.f4233f).remove(view) : null);
        }
        if (z3 && recyclerView.f5227I0 != null) {
            recyclerView.f5272y.e(abstractC5003S);
        }
        abstractC5003S.f40609r = null;
        C4995J c9 = c();
        c9.getClass();
        int i = abstractC5003S.f40598f;
        ArrayList arrayList = c9.a(i).f40558a;
        if (((C4994I) c9.f40562a.get(i)).f40559b <= arrayList.size()) {
            return;
        }
        abstractC5003S.m();
        arrayList.add(abstractC5003S);
    }

    public int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f32904h;
        if (i >= 0 && i < recyclerView.f5227I0.b()) {
            return !recyclerView.f5227I0.f40578g ? i : recyclerView.f5268w.l(i, 0);
        }
        StringBuilder i6 = AbstractC4404f.i(i, "invalid position ", ". State item count is ");
        i6.append(recyclerView.f5227I0.b());
        i6.append(recyclerView.y());
        throw new IndexOutOfBoundsException(i6.toString());
    }

    public C4995J c() {
        if (((C4995J) this.f32903g) == null) {
            C4995J c4995j = new C4995J();
            c4995j.f40562a = new SparseArray();
            c4995j.f40563b = 0;
            this.f32903g = c4995j;
        }
        return (C4995J) this.f32903g;
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.f32901e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f5208Y0;
        C2780Sl c2780Sl = ((RecyclerView) this.f32904h).f5225H0;
        int[] iArr2 = c2780Sl.f27546c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c2780Sl.f27547d = 0;
    }

    public void e(int i) {
        ArrayList arrayList = (ArrayList) this.f32901e;
        a((AbstractC5003S) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public void f(View view) {
        AbstractC5003S I8 = RecyclerView.I(view);
        boolean j6 = I8.j();
        RecyclerView recyclerView = (RecyclerView) this.f32904h;
        if (j6) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I8.i()) {
            I8.f40605n.j(I8);
        } else if (I8.p()) {
            I8.f40601j &= -33;
        }
        g(I8);
        if (recyclerView.f5260q0 == null || I8.g()) {
            return;
        }
        recyclerView.f5260q0.d(I8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(AbstractC5003S abstractC5003S) {
        boolean z3;
        boolean z6;
        boolean i = abstractC5003S.i();
        boolean z9 = true;
        RecyclerView recyclerView = (RecyclerView) this.f32904h;
        View view = abstractC5003S.f40593a;
        if (i || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC5003S.i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC5003S.j()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC5003S + recyclerView.y());
        }
        if (abstractC5003S.o()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.y());
        }
        if ((abstractC5003S.f40601j & 16) == 0) {
            WeakHashMap weakHashMap = O.X.f2054a;
            if (view.hasTransientState()) {
                z3 = true;
                AbstractC5027v abstractC5027v = recyclerView.f5216D;
                if (abstractC5003S.g()) {
                    z9 = false;
                } else {
                    if (this.f32898b <= 0 || (abstractC5003S.f40601j & 526) != 0) {
                        z6 = false;
                    } else {
                        ArrayList arrayList = (ArrayList) this.f32901e;
                        int size = arrayList.size();
                        if (size >= this.f32898b && size > 0) {
                            e(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.f5208Y0;
                        if (size > 0) {
                            C2780Sl c2780Sl = recyclerView.f5225H0;
                            int i6 = abstractC5003S.f40595c;
                            if (c2780Sl.f27546c != null) {
                                int i9 = c2780Sl.f27547d * 2;
                                for (int i10 = 0; i10 < i9; i10 += 2) {
                                    if (c2780Sl.f27546c[i10] == i6) {
                                        break;
                                    }
                                }
                            }
                            int i11 = size - 1;
                            loop1: while (i11 >= 0) {
                                int i12 = ((AbstractC5003S) arrayList.get(i11)).f40595c;
                                C2780Sl c2780Sl2 = recyclerView.f5225H0;
                                if (c2780Sl2.f27546c == null) {
                                    break;
                                }
                                int i13 = c2780Sl2.f27547d * 2;
                                for (int i14 = 0; i14 < i13; i14 += 2) {
                                    if (c2780Sl2.f27546c[i14] == i12) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i11 + 1;
                        }
                        arrayList.add(size, abstractC5003S);
                        z6 = true;
                    }
                    if (z6) {
                        z9 = false;
                    } else {
                        a(abstractC5003S, true);
                    }
                    r1 = z6;
                }
                recyclerView.f5272y.e(abstractC5003S);
                if (r1 && !z9 && z3) {
                    abstractC5003S.f40609r = null;
                    return;
                }
                return;
            }
        }
        z3 = false;
        AbstractC5027v abstractC5027v2 = recyclerView.f5216D;
        if (abstractC5003S.g()) {
        }
        recyclerView.f5272y.e(abstractC5003S);
        if (r1) {
        }
    }

    public void h(View view) {
        AbstractC5031z abstractC5031z;
        AbstractC5003S I8 = RecyclerView.I(view);
        boolean z3 = (I8.f40601j & 12) != 0;
        RecyclerView recyclerView = (RecyclerView) this.f32904h;
        if (!z3 && I8.k() && (abstractC5031z = recyclerView.f5260q0) != null) {
            C5013h c5013h = (C5013h) abstractC5031z;
            if (I8.c().isEmpty() && c5013h.f40679g && !I8.f()) {
                if (((ArrayList) this.f32900d) == null) {
                    this.f32900d = new ArrayList();
                }
                I8.f40605n = this;
                I8.f40606o = true;
                ((ArrayList) this.f32900d).add(I8);
                return;
            }
        }
        if (I8.f() && !I8.h() && !recyclerView.f5216D.f40781b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        I8.f40605n = this;
        I8.f40606o = false;
        ((ArrayList) this.f32899c).add(I8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0438, code lost:
    
        if (r11.f() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e5, code lost:
    
        if (r11.f40598f != 0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0547 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC5003S i(int i, long j6) {
        boolean z3;
        AbstractC5003S abstractC5003S;
        boolean z6;
        long j9;
        C0323b c0323b;
        boolean z9;
        View view;
        boolean z10;
        AbstractC5027v abstractC5027v;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        long j10;
        AccessibilityManager accessibilityManager;
        boolean z11;
        boolean z12;
        ViewGroup.LayoutParams layoutParams2;
        C4991F c4991f;
        int i6;
        View view2;
        int c9;
        boolean z13;
        int size;
        int l9;
        boolean z14 = true;
        RecyclerView recyclerView = (RecyclerView) this.f32904h;
        if (i < 0 || i >= recyclerView.f5227I0.b()) {
            StringBuilder h9 = AbstractC4404f.h(i, i, "Invalid item position ", "(", "). Item count:");
            h9.append(recyclerView.f5227I0.b());
            h9.append(recyclerView.y());
            throw new IndexOutOfBoundsException(h9.toString());
        }
        C5000O c5000o = recyclerView.f5227I0;
        if (c5000o.f40578g) {
            ArrayList arrayList2 = (ArrayList) this.f32900d;
            if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        abstractC5003S = (AbstractC5003S) ((ArrayList) this.f32900d).get(i9);
                        if (!abstractC5003S.p() && abstractC5003S.b() == i) {
                            abstractC5003S.a(32);
                            break;
                        }
                        i9++;
                    } else if (recyclerView.f5216D.f40781b && (l9 = recyclerView.f5268w.l(i, 0)) > 0 && l9 < recyclerView.f5216D.a()) {
                        long b9 = recyclerView.f5216D.b(l9);
                        for (int i10 = 0; i10 < size; i10++) {
                            AbstractC5003S abstractC5003S2 = (AbstractC5003S) ((ArrayList) this.f32900d).get(i10);
                            if (!abstractC5003S2.p() && abstractC5003S2.f40597e == b9) {
                                abstractC5003S2.a(32);
                                abstractC5003S = abstractC5003S2;
                                break;
                            }
                        }
                    }
                }
            }
            abstractC5003S = null;
            z3 = abstractC5003S != null;
        } else {
            z3 = false;
            abstractC5003S = null;
        }
        ArrayList arrayList3 = (ArrayList) this.f32901e;
        ArrayList arrayList4 = (ArrayList) this.f32899c;
        if (abstractC5003S == null) {
            int size2 = arrayList4.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AbstractC5003S abstractC5003S3 = (AbstractC5003S) arrayList4.get(i11);
                if (!abstractC5003S3.p() && abstractC5003S3.b() == i && !abstractC5003S3.f() && (c5000o.f40578g || !abstractC5003S3.h())) {
                    abstractC5003S3.a(32);
                    z6 = true;
                    abstractC5003S = abstractC5003S3;
                    break;
                }
            }
            ArrayList arrayList5 = (ArrayList) recyclerView.f5270x.f38406w;
            int size3 = arrayList5.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size3) {
                    z6 = z14;
                    view2 = null;
                    break;
                }
                view2 = (View) arrayList5.get(i12);
                AbstractC5003S I8 = RecyclerView.I(view2);
                z6 = z14;
                if (I8.b() == i && !I8.f() && !I8.h()) {
                    break;
                }
                i12++;
                z14 = z6;
            }
            if (view2 == null) {
                int size4 = arrayList3.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size4) {
                        abstractC5003S = null;
                        break;
                    }
                    AbstractC5003S abstractC5003S4 = (AbstractC5003S) arrayList3.get(i13);
                    if (!abstractC5003S4.f() && abstractC5003S4.b() == i && !abstractC5003S4.d()) {
                        arrayList3.remove(i13);
                        abstractC5003S = abstractC5003S4;
                        break;
                    }
                    i13++;
                }
            } else {
                AbstractC5003S I9 = RecyclerView.I(view2);
                j4.g gVar = recyclerView.f5270x;
                int indexOfChild = ((RecyclerView) ((C4648e) gVar.f38404u).f38761u).indexOfChild(view2);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                }
                C3381j1 c3381j1 = (C3381j1) gVar.f38405v;
                if (!c3381j1.e(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                }
                c3381j1.b(indexOfChild);
                gVar.v(view2);
                j4.g gVar2 = recyclerView.f5270x;
                int indexOfChild2 = ((RecyclerView) ((C4648e) gVar2.f38404u).f38761u).indexOfChild(view2);
                if (indexOfChild2 != -1) {
                    C3381j1 c3381j12 = (C3381j1) gVar2.f38405v;
                    if (!c3381j12.e(indexOfChild2)) {
                        c9 = indexOfChild2 - c3381j12.c(indexOfChild2);
                        if (c9 != -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + I9 + recyclerView.y());
                        }
                        recyclerView.f5270x.c(c9);
                        h(view2);
                        I9.a(8224);
                        abstractC5003S = I9;
                    }
                }
                c9 = -1;
                if (c9 != -1) {
                }
            }
            if (abstractC5003S != null) {
                if (abstractC5003S.h()) {
                    z13 = c5000o.f40578g;
                } else {
                    int i14 = abstractC5003S.f40595c;
                    if (i14 < 0 || i14 >= recyclerView.f5216D.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC5003S + recyclerView.y());
                    }
                    if (!c5000o.f40578g) {
                        recyclerView.f5216D.getClass();
                    }
                    AbstractC5027v abstractC5027v2 = recyclerView.f5216D;
                    if (!abstractC5027v2.f40781b || abstractC5003S.f40597e == abstractC5027v2.b(abstractC5003S.f40595c)) {
                        z13 = z6;
                    }
                    z13 = false;
                }
                if (z13) {
                    z3 = z6;
                } else {
                    abstractC5003S.a(4);
                    if (abstractC5003S.i()) {
                        recyclerView.removeDetachedView(abstractC5003S.f40593a, false);
                        abstractC5003S.f40605n.j(abstractC5003S);
                    } else if (abstractC5003S.p()) {
                        abstractC5003S.f40601j &= -33;
                    }
                    g(abstractC5003S);
                    abstractC5003S = null;
                }
            }
        } else {
            z6 = true;
        }
        if (abstractC5003S == null) {
            int l10 = recyclerView.f5268w.l(i, 0);
            if (l10 < 0 || l10 >= recyclerView.f5216D.a()) {
                StringBuilder h10 = AbstractC4404f.h(i, l10, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                h10.append(c5000o.b());
                h10.append(recyclerView.y());
                throw new IndexOutOfBoundsException(h10.toString());
            }
            recyclerView.f5216D.getClass();
            AbstractC5027v abstractC5027v3 = recyclerView.f5216D;
            j9 = 3;
            if (abstractC5027v3.f40781b) {
                long b10 = abstractC5027v3.b(l10);
                int size5 = arrayList4.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        abstractC5003S = (AbstractC5003S) arrayList4.get(size5);
                        if (abstractC5003S.f40597e == b10 && !abstractC5003S.p()) {
                            if (abstractC5003S.f40598f == 0) {
                                abstractC5003S.a(32);
                                if (abstractC5003S.h() && !c5000o.f40578g) {
                                    abstractC5003S.f40601j = (abstractC5003S.f40601j & (-15)) | 2;
                                }
                            } else {
                                arrayList4.remove(size5);
                                View view3 = abstractC5003S.f40593a;
                                recyclerView.removeDetachedView(view3, false);
                                AbstractC5003S I10 = RecyclerView.I(view3);
                                I10.f40605n = null;
                                I10.f40606o = false;
                                I10.f40601j &= -33;
                                g(I10);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList3.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            AbstractC5003S abstractC5003S5 = (AbstractC5003S) arrayList3.get(size6);
                            if (abstractC5003S5.f40597e != b10 || abstractC5003S5.d()) {
                                size6--;
                            } else if (abstractC5003S5.f40598f == 0) {
                                arrayList3.remove(size6);
                                abstractC5003S = abstractC5003S5;
                            } else {
                                e(size6);
                            }
                        }
                        abstractC5003S = null;
                    }
                }
                if (abstractC5003S != null) {
                    abstractC5003S.f40595c = l10;
                    z3 = z6;
                }
            }
            if (abstractC5003S == null) {
                C4994I c4994i = (C4994I) c().f40562a.get(0);
                if (c4994i != null) {
                    ArrayList arrayList6 = c4994i.f40558a;
                    if (!arrayList6.isEmpty()) {
                        for (int size7 = arrayList6.size() - 1; size7 >= 0; size7--) {
                            if (!((AbstractC5003S) arrayList6.get(size7)).d()) {
                                abstractC5003S = (AbstractC5003S) arrayList6.remove(size7);
                                break;
                            }
                        }
                    }
                }
                abstractC5003S = null;
                if (abstractC5003S != null) {
                    abstractC5003S.m();
                    int[] iArr = RecyclerView.f5208Y0;
                }
            }
            if (abstractC5003S == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j6 != Long.MAX_VALUE) {
                    long j11 = ((C4995J) this.f32903g).a(0).f40560c;
                    if (!((j11 == 0 || j11 + nanoTime < j6) ? z6 : false)) {
                        return null;
                    }
                }
                c0323b = null;
                AbstractC5027v abstractC5027v4 = recyclerView.f5216D;
                abstractC5027v4.getClass();
                try {
                    int i15 = K.n.f1485a;
                    Trace.beginSection("RV CreateView");
                    abstractC5003S = abstractC5027v4.d(recyclerView);
                    View view4 = abstractC5003S.f40593a;
                    if (view4.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    abstractC5003S.f40598f = 0;
                    Trace.endSection();
                    int[] iArr2 = RecyclerView.f5208Y0;
                    RecyclerView D8 = RecyclerView.D(view4);
                    if (D8 != null) {
                        abstractC5003S.f40594b = new WeakReference(D8);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C4994I a9 = ((C4995J) this.f32903g).a(0);
                    long j12 = a9.f40560c;
                    if (j12 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j12 / 4) * 3);
                    }
                    a9.f40560c = nanoTime2;
                    if (z3 && !c5000o.f40578g) {
                        i6 = abstractC5003S.f40601j;
                        if ((i6 & 8192) == 0 ? z6 : false) {
                            abstractC5003S.f40601j = i6 & (-8193);
                            if (c5000o.f40580j) {
                                AbstractC5031z.b(abstractC5003S);
                                AbstractC5031z abstractC5031z = recyclerView.f5260q0;
                                abstractC5003S.c();
                                abstractC5031z.getClass();
                                C0344t c0344t = new C0344t();
                                c0344t.a(abstractC5003S);
                                recyclerView.T(abstractC5003S, c0344t);
                            }
                        }
                    }
                    z9 = c5000o.f40578g;
                    view = abstractC5003S.f40593a;
                    if (z9 || !abstractC5003S.e()) {
                        if (abstractC5003S.e()) {
                            if (!((abstractC5003S.f40601j & 2) != 0 ? z6 : false)) {
                            }
                        }
                        z10 = false;
                        int l11 = recyclerView.f5268w.l(i, 0);
                        abstractC5003S.f40609r = recyclerView;
                        int i16 = abstractC5003S.f40598f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j6 != Long.MAX_VALUE) {
                            long j13 = ((C4995J) this.f32903g).a(i16).f40561d;
                            if (j13 != 0 && j13 + nanoTime3 >= j6) {
                                z12 = false;
                                z11 = z6;
                                layoutParams2 = view.getLayoutParams();
                                if (layoutParams2 != null) {
                                    c4991f = (C4991F) recyclerView.generateDefaultLayoutParams();
                                    view.setLayoutParams(c4991f);
                                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                                    c4991f = (C4991F) layoutParams2;
                                } else {
                                    c4991f = (C4991F) recyclerView.generateLayoutParams(layoutParams2);
                                    view.setLayoutParams(c4991f);
                                }
                                c4991f.f40554a = abstractC5003S;
                                c4991f.f40557d = (z3 || !z12) ? z10 : z11;
                                return abstractC5003S;
                            }
                        }
                        abstractC5027v = recyclerView.f5216D;
                        abstractC5027v.getClass();
                        abstractC5003S.f40595c = l11;
                        if (abstractC5027v.f40781b) {
                            abstractC5003S.f40597e = abstractC5027v.b(l11);
                        }
                        abstractC5003S.f40601j = (abstractC5003S.f40601j & (-520)) | 1;
                        int i17 = K.n.f1485a;
                        Trace.beginSection("RV OnBindView");
                        abstractC5003S.c();
                        abstractC5027v.c(abstractC5003S, l11);
                        arrayList = abstractC5003S.f40602k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        abstractC5003S.f40601j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof C4991F) {
                            ((C4991F) layoutParams).f40556c = z6;
                        }
                        Trace.endSection();
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        C4994I a10 = ((C4995J) this.f32903g).a(abstractC5003S.f40598f);
                        j10 = a10.f40561d;
                        if (j10 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j10 / 4) * j9);
                        }
                        a10.f40561d = nanoTime4;
                        accessibilityManager = recyclerView.f5241Q;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z11 = true;
                        } else {
                            WeakHashMap weakHashMap = O.X.f2054a;
                            z11 = true;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            C5004T c5004t = recyclerView.f5240P0;
                            if (c5004t != null) {
                                a0.b bVar = c5004t.f40611e;
                                if (bVar != null) {
                                    View.AccessibilityDelegate d2 = O.X.d(view);
                                    C0323b c0323b2 = d2 == null ? c0323b : d2 instanceof C0321a ? ((C0321a) d2).f2060a : new C0323b(d2);
                                    if (c0323b2 != null && c0323b2 != bVar) {
                                        ((WeakHashMap) bVar.f4233f).put(view, c0323b2);
                                    }
                                }
                                O.X.o(view, bVar);
                            }
                        }
                        if (c5000o.f40578g) {
                            abstractC5003S.f40599g = i;
                        }
                        z12 = z11;
                        layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 != null) {
                        }
                        c4991f.f40554a = abstractC5003S;
                        c4991f.f40557d = (z3 || !z12) ? z10 : z11;
                        return abstractC5003S;
                    }
                    abstractC5003S.f40599g = i;
                    z11 = z6;
                    z12 = false;
                    z10 = false;
                    layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 != null) {
                    }
                    c4991f.f40554a = abstractC5003S;
                    c4991f.f40557d = (z3 || !z12) ? z10 : z11;
                    return abstractC5003S;
                } catch (Throwable th) {
                    int i18 = K.n.f1485a;
                    Trace.endSection();
                    throw th;
                }
            }
        } else {
            j9 = 3;
        }
        c0323b = null;
        if (z3) {
            i6 = abstractC5003S.f40601j;
            if ((i6 & 8192) == 0 ? z6 : false) {
            }
        }
        z9 = c5000o.f40578g;
        view = abstractC5003S.f40593a;
        if (z9) {
        }
        if (abstractC5003S.e()) {
        }
        z10 = false;
        int l112 = recyclerView.f5268w.l(i, 0);
        abstractC5003S.f40609r = recyclerView;
        int i162 = abstractC5003S.f40598f;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j6 != Long.MAX_VALUE) {
        }
        abstractC5027v = recyclerView.f5216D;
        abstractC5027v.getClass();
        abstractC5003S.f40595c = l112;
        if (abstractC5027v.f40781b) {
        }
        abstractC5003S.f40601j = (abstractC5003S.f40601j & (-520)) | 1;
        int i172 = K.n.f1485a;
        Trace.beginSection("RV OnBindView");
        abstractC5003S.c();
        abstractC5027v.c(abstractC5003S, l112);
        arrayList = abstractC5003S.f40602k;
        if (arrayList != null) {
        }
        abstractC5003S.f40601j &= -1025;
        layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C4991F) {
        }
        Trace.endSection();
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        C4994I a102 = ((C4995J) this.f32903g).a(abstractC5003S.f40598f);
        j10 = a102.f40561d;
        if (j10 != 0) {
        }
        a102.f40561d = nanoTime42;
        accessibilityManager = recyclerView.f5241Q;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (c5000o.f40578g) {
        }
        z12 = z11;
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
        }
        c4991f.f40554a = abstractC5003S;
        c4991f.f40557d = (z3 || !z12) ? z10 : z11;
        return abstractC5003S;
    }

    public void j(AbstractC5003S abstractC5003S) {
        if (abstractC5003S.f40606o) {
            ((ArrayList) this.f32900d).remove(abstractC5003S);
        } else {
            ((ArrayList) this.f32899c).remove(abstractC5003S);
        }
        abstractC5003S.f40605n = null;
        abstractC5003S.f40606o = false;
        abstractC5003S.f40601j &= -33;
    }

    public void k() {
        AbstractC4990E abstractC4990E = ((RecyclerView) this.f32904h).f5218E;
        this.f32898b = this.f32897a + (abstractC4990E != null ? abstractC4990E.f40548j : 0);
        ArrayList arrayList = (ArrayList) this.f32901e;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f32898b; size--) {
            e(size);
        }
    }

    public /* synthetic */ C3675oP m(VO vo) {
        return new C3675oP((DP) this.f32899c, (DP) this.f32900d, this.f32897a, this.f32898b, vo, (C2932ah) this.f32902f, (AbstractC3604n8) this.f32903g, this.f32904h);
    }

    public /* synthetic */ boolean n() {
        return Objects.equals(((DP) this.f32899c).f24431o, com.anythink.basead.exoplayer.k.o.f8465w);
    }
}
