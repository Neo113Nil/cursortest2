package com.google.android.gms.internal.ads;

import O.C0326a;
import O.C0328b;
import O.C0349t;
import android.os.Trace;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.consent_sdk.C4402v;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import l.C4659e;
import t0.AbstractC4987C;
import t0.AbstractC5000P;
import t0.AbstractC5026v;
import t0.AbstractC5030z;
import t0.C4988D;
import t0.C4991G;
import t0.C4992H;
import t0.C4997M;
import t0.C5001Q;
import t0.C5012h;

/* renamed from: com.google.android.gms.internal.ads.oP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3698oP {

    /* renamed from: a, reason: collision with root package name */
    public int f33684a;

    /* renamed from: b, reason: collision with root package name */
    public int f33685b;

    /* renamed from: c, reason: collision with root package name */
    public Object f33686c;

    /* renamed from: d, reason: collision with root package name */
    public Object f33687d;

    /* renamed from: e, reason: collision with root package name */
    public Object f33688e;

    /* renamed from: f, reason: collision with root package name */
    public Object f33689f;

    /* renamed from: g, reason: collision with root package name */
    public Object f33690g;

    /* renamed from: h, reason: collision with root package name */
    public Object f33691h;

    public C3698oP(DP dp, DP dp2, int i, int i4, VO vo, C2955ah c2955ah, AbstractC3627n8 abstractC3627n8, Object obj) {
        this.f33686c = dp;
        this.f33687d = dp2;
        this.f33684a = i;
        this.f33685b = i4;
        this.f33688e = vo;
        this.f33689f = c2955ah;
        this.f33690g = abstractC3627n8;
        this.f33691h = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3698oP l(JsonReader jsonReader) {
        boolean z6;
        String nextString;
        boolean z9;
        char c9;
        int i;
        C3698oP c3698oP = new C3698oP();
        c3698oP.f33684a = 1;
        List list = Collections.EMPTY_LIST;
        c3698oP.f33689f = list;
        c3698oP.f33690g = list;
        c3698oP.f33685b = 1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i4 = 7;
            int i6 = 3;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        z6 = false;
                        break;
                    }
                    z6 = -1;
                    break;
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        z6 = 3;
                        break;
                    }
                    z6 = -1;
                    break;
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        z6 = 2;
                        break;
                    }
                    z6 = -1;
                    break;
                case -1734348803:
                    if (nextName.equals("client_side_pingback_url")) {
                        z6 = 7;
                        break;
                    }
                    z6 = -1;
                    break;
                case -1324537865:
                    if (nextName.equals("privacy_options_required")) {
                        z6 = 6;
                        break;
                    }
                    z6 = -1;
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        z6 = 5;
                        break;
                    }
                    z6 = -1;
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        z6 = 4;
                        break;
                    }
                    z6 = -1;
                    break;
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        z6 = true;
                        break;
                    }
                    z6 = -1;
                    break;
                default:
                    z6 = -1;
                    break;
            }
            switch (z6) {
                case false:
                    nextString = jsonReader.nextString();
                    switch (nextString) {
                        case "CONSENT_SIGNAL_UNKNOWN":
                            i4 = 1;
                            c3698oP.f33684a = i4;
                            break;
                        case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                            i4 = 2;
                            c3698oP.f33684a = i4;
                            break;
                        case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                            i4 = 3;
                            c3698oP.f33684a = i4;
                            break;
                        case "CONSENT_SIGNAL_SUFFICIENT":
                            i4 = 4;
                            c3698oP.f33684a = i4;
                            break;
                        case "CONSENT_SIGNAL_COLLECT_CONSENT":
                            i4 = 5;
                            c3698oP.f33684a = i4;
                            break;
                        case "CONSENT_SIGNAL_NOT_REQUIRED":
                            i4 = 6;
                            c3698oP.f33684a = i4;
                            break;
                        case "CONSENT_SIGNAL_ERROR":
                            c3698oP.f33684a = i4;
                            break;
                        case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION":
                            i4 = 8;
                            c3698oP.f33684a = i4;
                            break;
                        default:
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                    }
                case true:
                    c3698oP.f33686c = jsonReader.nextString();
                    break;
                case true:
                    c3698oP.f33687d = jsonReader.nextString();
                    break;
                case true:
                    c3698oP.f33688e = jsonReader.nextString();
                    break;
                case true:
                    c3698oP.f33689f = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ((List) c3698oP.f33689f).add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case true:
                    c3698oP.f33690g = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        C4402v c4402v = new C4402v();
                        c4402v.f36541b = 1;
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            int hashCode = nextName2.hashCode();
                            if (hashCode != -2105551094) {
                                if (hashCode == 1583758243 && nextName2.equals("action_type")) {
                                    z9 = false;
                                }
                                z9 = -1;
                            } else {
                                if (nextName2.equals("args_json")) {
                                    z9 = true;
                                }
                                z9 = -1;
                            }
                            if (!z9) {
                                String nextString2 = jsonReader.nextString();
                                int hashCode2 = nextString2.hashCode();
                                if (hashCode2 == 64208429) {
                                    if (nextString2.equals("CLEAR")) {
                                        c9 = 2;
                                        if (c9 != 0) {
                                        }
                                        c4402v.f36541b = i;
                                    }
                                    c9 = 65535;
                                    if (c9 != 0) {
                                    }
                                    c4402v.f36541b = i;
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
                                        c4402v.f36541b = i;
                                    }
                                    c9 = 65535;
                                    if (c9 != 0) {
                                    }
                                    c4402v.f36541b = i;
                                } else {
                                    if (nextString2.equals("WRITE")) {
                                        c9 = 1;
                                        if (c9 != 0) {
                                        }
                                        c4402v.f36541b = i;
                                    }
                                    c9 = 65535;
                                    if (c9 != 0) {
                                    }
                                    c4402v.f36541b = i;
                                }
                            } else if (!z9) {
                                jsonReader.skipValue();
                            } else {
                                c4402v.f36540a = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        ((List) c3698oP.f33690g).add(c4402v);
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
                        i6 = 1;
                    } else if (r8 == 1) {
                        i6 = 2;
                    } else if (r8 != 2) {
                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString3));
                    }
                    c3698oP.f33685b = i6;
                    break;
                case true:
                    c3698oP.f33691h = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c3698oP;
    }

    public void a(AbstractC5000P abstractC5000P, boolean z6) {
        RecyclerView.j(abstractC5000P);
        RecyclerView recyclerView = (RecyclerView) this.f33691h;
        C5001Q c5001q = recyclerView.f5197K0;
        if (c5001q != null) {
            a0.b bVar = c5001q.f40661e;
            View view = abstractC5000P.f40643a;
            O.X.o(view, bVar != null ? (C0328b) ((WeakHashMap) bVar.f4210f).remove(view) : null);
        }
        if (z6 && recyclerView.f5184D0 != null) {
            recyclerView.f5238y.i(abstractC5000P);
        }
        abstractC5000P.f40659r = null;
        C4992H c9 = c();
        c9.getClass();
        int i = abstractC5000P.f40648f;
        ArrayList arrayList = c9.a(i).f40608a;
        if (((C4991G) c9.f40612a.get(i)).f40609b <= arrayList.size()) {
            return;
        }
        abstractC5000P.m();
        arrayList.add(abstractC5000P);
    }

    public int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f33691h;
        if (i >= 0 && i < recyclerView.f5184D0.b()) {
            return !recyclerView.f5184D0.f40628g ? i : recyclerView.f5234w.l(i, 0);
        }
        StringBuilder k9 = Wv.k(i, "invalid position ", ". State item count is ");
        k9.append(recyclerView.f5184D0.b());
        k9.append(recyclerView.y());
        throw new IndexOutOfBoundsException(k9.toString());
    }

    public C4992H c() {
        if (((C4992H) this.f33690g) == null) {
            C4992H c4992h = new C4992H();
            c4992h.f40612a = new SparseArray();
            c4992h.f40613b = 0;
            this.f33690g = c4992h;
        }
        return (C4992H) this.f33690g;
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.f33688e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f5175T0;
        C2817Tl c2817Tl = ((RecyclerView) this.f33691h).C0;
        int[] iArr2 = c2817Tl.f28575c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c2817Tl.f28576d = 0;
    }

    public void e(int i) {
        ArrayList arrayList = (ArrayList) this.f33688e;
        a((AbstractC5000P) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public void f(View view) {
        AbstractC5000P I8 = RecyclerView.I(view);
        boolean j6 = I8.j();
        RecyclerView recyclerView = (RecyclerView) this.f33691h;
        if (j6) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I8.i()) {
            I8.f40655n.j(I8);
        } else if (I8.p()) {
            I8.f40651j &= -33;
        }
        g(I8);
        if (recyclerView.f5221l0 == null || I8.g()) {
            return;
        }
        recyclerView.f5221l0.d(I8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(AbstractC5000P abstractC5000P) {
        boolean z6;
        boolean z9;
        boolean i = abstractC5000P.i();
        boolean z10 = true;
        RecyclerView recyclerView = (RecyclerView) this.f33691h;
        View view = abstractC5000P.f40643a;
        if (i || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC5000P.i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC5000P.j()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC5000P + recyclerView.y());
        }
        if (abstractC5000P.o()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.y());
        }
        if ((abstractC5000P.f40651j & 16) == 0) {
            WeakHashMap weakHashMap = O.X.f2142a;
            if (view.hasTransientState()) {
                z6 = true;
                AbstractC5026v abstractC5026v = recyclerView.f5183D;
                if (abstractC5000P.g()) {
                    z10 = false;
                } else {
                    if (this.f33685b <= 0 || (abstractC5000P.f40651j & 526) != 0) {
                        z9 = false;
                    } else {
                        ArrayList arrayList = (ArrayList) this.f33688e;
                        int size = arrayList.size();
                        if (size >= this.f33685b && size > 0) {
                            e(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.f5175T0;
                        if (size > 0) {
                            C2817Tl c2817Tl = recyclerView.C0;
                            int i4 = abstractC5000P.f40645c;
                            if (c2817Tl.f28575c != null) {
                                int i6 = c2817Tl.f28576d * 2;
                                for (int i9 = 0; i9 < i6; i9 += 2) {
                                    if (c2817Tl.f28575c[i9] == i4) {
                                        break;
                                    }
                                }
                            }
                            int i10 = size - 1;
                            loop1: while (i10 >= 0) {
                                int i11 = ((AbstractC5000P) arrayList.get(i10)).f40645c;
                                C2817Tl c2817Tl2 = recyclerView.C0;
                                if (c2817Tl2.f28575c == null) {
                                    break;
                                }
                                int i12 = c2817Tl2.f28576d * 2;
                                for (int i13 = 0; i13 < i12; i13 += 2) {
                                    if (c2817Tl2.f28575c[i13] == i11) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i10 + 1;
                        }
                        arrayList.add(size, abstractC5000P);
                        z9 = true;
                    }
                    if (z9) {
                        z10 = false;
                    } else {
                        a(abstractC5000P, true);
                    }
                    r1 = z9;
                }
                recyclerView.f5238y.i(abstractC5000P);
                if (r1 && !z10 && z6) {
                    abstractC5000P.f40659r = null;
                    return;
                }
                return;
            }
        }
        z6 = false;
        AbstractC5026v abstractC5026v2 = recyclerView.f5183D;
        if (abstractC5000P.g()) {
        }
        recyclerView.f5238y.i(abstractC5000P);
        if (r1) {
        }
    }

    public void h(View view) {
        AbstractC5030z abstractC5030z;
        AbstractC5000P I8 = RecyclerView.I(view);
        boolean z6 = (I8.f40651j & 12) != 0;
        RecyclerView recyclerView = (RecyclerView) this.f33691h;
        if (!z6 && I8.k() && (abstractC5030z = recyclerView.f5221l0) != null) {
            C5012h c5012h = (C5012h) abstractC5030z;
            if (I8.c().isEmpty() && c5012h.f40729g && !I8.f()) {
                if (((ArrayList) this.f33687d) == null) {
                    this.f33687d = new ArrayList();
                }
                I8.f40655n = this;
                I8.f40656o = true;
                ((ArrayList) this.f33687d).add(I8);
                return;
            }
        }
        if (I8.f() && !I8.h() && !recyclerView.f5183D.f40830b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        I8.f40655n = this;
        I8.f40656o = false;
        ((ArrayList) this.f33686c).add(I8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0438, code lost:
    
        if (r11.f() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e5, code lost:
    
        if (r11.f40648f != 0) goto L110;
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
    public AbstractC5000P i(int i, long j6) {
        boolean z6;
        AbstractC5000P abstractC5000P;
        boolean z9;
        long j9;
        C0328b c0328b;
        boolean z10;
        View view;
        boolean z11;
        AbstractC5026v abstractC5026v;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        long j10;
        AccessibilityManager accessibilityManager;
        boolean z12;
        boolean z13;
        ViewGroup.LayoutParams layoutParams2;
        C4988D c4988d;
        int i4;
        View view2;
        int d9;
        boolean z14;
        int size;
        int l9;
        boolean z15 = true;
        RecyclerView recyclerView = (RecyclerView) this.f33691h;
        if (i < 0 || i >= recyclerView.f5184D0.b()) {
            StringBuilder j11 = Wv.j(i, i, "Invalid item position ", "(", "). Item count:");
            j11.append(recyclerView.f5184D0.b());
            j11.append(recyclerView.y());
            throw new IndexOutOfBoundsException(j11.toString());
        }
        C4997M c4997m = recyclerView.f5184D0;
        if (c4997m.f40628g) {
            ArrayList arrayList2 = (ArrayList) this.f33687d;
            if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        abstractC5000P = (AbstractC5000P) ((ArrayList) this.f33687d).get(i6);
                        if (!abstractC5000P.p() && abstractC5000P.b() == i) {
                            abstractC5000P.a(32);
                            break;
                        }
                        i6++;
                    } else if (recyclerView.f5183D.f40830b && (l9 = recyclerView.f5234w.l(i, 0)) > 0 && l9 < recyclerView.f5183D.a()) {
                        long b9 = recyclerView.f5183D.b(l9);
                        for (int i9 = 0; i9 < size; i9++) {
                            AbstractC5000P abstractC5000P2 = (AbstractC5000P) ((ArrayList) this.f33687d).get(i9);
                            if (!abstractC5000P2.p() && abstractC5000P2.f40647e == b9) {
                                abstractC5000P2.a(32);
                                abstractC5000P = abstractC5000P2;
                                break;
                            }
                        }
                    }
                }
            }
            abstractC5000P = null;
            z6 = abstractC5000P != null;
        } else {
            z6 = false;
            abstractC5000P = null;
        }
        ArrayList arrayList3 = (ArrayList) this.f33688e;
        ArrayList arrayList4 = (ArrayList) this.f33686c;
        if (abstractC5000P == null) {
            int size2 = arrayList4.size();
            for (int i10 = 0; i10 < size2; i10++) {
                AbstractC5000P abstractC5000P3 = (AbstractC5000P) arrayList4.get(i10);
                if (!abstractC5000P3.p() && abstractC5000P3.b() == i && !abstractC5000P3.f() && (c4997m.f40628g || !abstractC5000P3.h())) {
                    abstractC5000P3.a(32);
                    z9 = true;
                    abstractC5000P = abstractC5000P3;
                    break;
                }
            }
            ArrayList arrayList5 = (ArrayList) recyclerView.f5236x.f38918w;
            int size3 = arrayList5.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size3) {
                    z9 = z15;
                    view2 = null;
                    break;
                }
                view2 = (View) arrayList5.get(i11);
                AbstractC5000P I8 = RecyclerView.I(view2);
                z9 = z15;
                if (I8.b() == i && !I8.f() && !I8.h()) {
                    break;
                }
                i11++;
                z15 = z9;
            }
            if (view2 == null) {
                int size4 = arrayList3.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size4) {
                        abstractC5000P = null;
                        break;
                    }
                    AbstractC5000P abstractC5000P4 = (AbstractC5000P) arrayList3.get(i12);
                    if (!abstractC5000P4.f() && abstractC5000P4.b() == i && !abstractC5000P4.d()) {
                        arrayList3.remove(i12);
                        abstractC5000P = abstractC5000P4;
                        break;
                    }
                    i12++;
                }
            } else {
                AbstractC5000P I9 = RecyclerView.I(view2);
                l4.g gVar = recyclerView.f5236x;
                int indexOfChild = ((RecyclerView) ((C4659e) gVar.f38916u).f38688u).indexOfChild(view2);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                }
                C3404j1 c3404j1 = (C3404j1) gVar.f38917v;
                if (!c3404j1.f(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                }
                c3404j1.c(indexOfChild);
                gVar.v(view2);
                l4.g gVar2 = recyclerView.f5236x;
                int indexOfChild2 = ((RecyclerView) ((C4659e) gVar2.f38916u).f38688u).indexOfChild(view2);
                if (indexOfChild2 != -1) {
                    C3404j1 c3404j12 = (C3404j1) gVar2.f38917v;
                    if (!c3404j12.f(indexOfChild2)) {
                        d9 = indexOfChild2 - c3404j12.d(indexOfChild2);
                        if (d9 != -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + I9 + recyclerView.y());
                        }
                        recyclerView.f5236x.c(d9);
                        h(view2);
                        I9.a(8224);
                        abstractC5000P = I9;
                    }
                }
                d9 = -1;
                if (d9 != -1) {
                }
            }
            if (abstractC5000P != null) {
                if (abstractC5000P.h()) {
                    z14 = c4997m.f40628g;
                } else {
                    int i13 = abstractC5000P.f40645c;
                    if (i13 < 0 || i13 >= recyclerView.f5183D.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC5000P + recyclerView.y());
                    }
                    if (!c4997m.f40628g) {
                        recyclerView.f5183D.getClass();
                    }
                    AbstractC5026v abstractC5026v2 = recyclerView.f5183D;
                    if (!abstractC5026v2.f40830b || abstractC5000P.f40647e == abstractC5026v2.b(abstractC5000P.f40645c)) {
                        z14 = z9;
                    }
                    z14 = false;
                }
                if (z14) {
                    z6 = z9;
                } else {
                    abstractC5000P.a(4);
                    if (abstractC5000P.i()) {
                        recyclerView.removeDetachedView(abstractC5000P.f40643a, false);
                        abstractC5000P.f40655n.j(abstractC5000P);
                    } else if (abstractC5000P.p()) {
                        abstractC5000P.f40651j &= -33;
                    }
                    g(abstractC5000P);
                    abstractC5000P = null;
                }
            }
        } else {
            z9 = true;
        }
        if (abstractC5000P == null) {
            int l10 = recyclerView.f5234w.l(i, 0);
            if (l10 < 0 || l10 >= recyclerView.f5183D.a()) {
                StringBuilder j12 = Wv.j(i, l10, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                j12.append(c4997m.b());
                j12.append(recyclerView.y());
                throw new IndexOutOfBoundsException(j12.toString());
            }
            recyclerView.f5183D.getClass();
            AbstractC5026v abstractC5026v3 = recyclerView.f5183D;
            j9 = 3;
            if (abstractC5026v3.f40830b) {
                long b10 = abstractC5026v3.b(l10);
                int size5 = arrayList4.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        abstractC5000P = (AbstractC5000P) arrayList4.get(size5);
                        if (abstractC5000P.f40647e == b10 && !abstractC5000P.p()) {
                            if (abstractC5000P.f40648f == 0) {
                                abstractC5000P.a(32);
                                if (abstractC5000P.h() && !c4997m.f40628g) {
                                    abstractC5000P.f40651j = (abstractC5000P.f40651j & (-15)) | 2;
                                }
                            } else {
                                arrayList4.remove(size5);
                                View view3 = abstractC5000P.f40643a;
                                recyclerView.removeDetachedView(view3, false);
                                AbstractC5000P I10 = RecyclerView.I(view3);
                                I10.f40655n = null;
                                I10.f40656o = false;
                                I10.f40651j &= -33;
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
                            AbstractC5000P abstractC5000P5 = (AbstractC5000P) arrayList3.get(size6);
                            if (abstractC5000P5.f40647e != b10 || abstractC5000P5.d()) {
                                size6--;
                            } else if (abstractC5000P5.f40648f == 0) {
                                arrayList3.remove(size6);
                                abstractC5000P = abstractC5000P5;
                            } else {
                                e(size6);
                            }
                        }
                        abstractC5000P = null;
                    }
                }
                if (abstractC5000P != null) {
                    abstractC5000P.f40645c = l10;
                    z6 = z9;
                }
            }
            if (abstractC5000P == null) {
                C4991G c4991g = (C4991G) c().f40612a.get(0);
                if (c4991g != null) {
                    ArrayList arrayList6 = c4991g.f40608a;
                    if (!arrayList6.isEmpty()) {
                        for (int size7 = arrayList6.size() - 1; size7 >= 0; size7--) {
                            if (!((AbstractC5000P) arrayList6.get(size7)).d()) {
                                abstractC5000P = (AbstractC5000P) arrayList6.remove(size7);
                                break;
                            }
                        }
                    }
                }
                abstractC5000P = null;
                if (abstractC5000P != null) {
                    abstractC5000P.m();
                    int[] iArr = RecyclerView.f5175T0;
                }
            }
            if (abstractC5000P == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j6 != Long.MAX_VALUE) {
                    long j13 = ((C4992H) this.f33690g).a(0).f40610c;
                    if (!((j13 == 0 || j13 + nanoTime < j6) ? z9 : false)) {
                        return null;
                    }
                }
                c0328b = null;
                AbstractC5026v abstractC5026v4 = recyclerView.f5183D;
                abstractC5026v4.getClass();
                try {
                    int i14 = K.n.f1594a;
                    Trace.beginSection("RV CreateView");
                    abstractC5000P = abstractC5026v4.d(recyclerView);
                    View view4 = abstractC5000P.f40643a;
                    if (view4.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    abstractC5000P.f40648f = 0;
                    Trace.endSection();
                    int[] iArr2 = RecyclerView.f5175T0;
                    RecyclerView D8 = RecyclerView.D(view4);
                    if (D8 != null) {
                        abstractC5000P.f40644b = new WeakReference(D8);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C4991G a9 = ((C4992H) this.f33690g).a(0);
                    long j14 = a9.f40610c;
                    if (j14 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j14 / 4) * 3);
                    }
                    a9.f40610c = nanoTime2;
                    if (z6 && !c4997m.f40628g) {
                        i4 = abstractC5000P.f40651j;
                        if ((i4 & 8192) == 0 ? z9 : false) {
                            abstractC5000P.f40651j = i4 & (-8193);
                            if (c4997m.f40630j) {
                                AbstractC5030z.b(abstractC5000P);
                                AbstractC5030z abstractC5030z = recyclerView.f5221l0;
                                abstractC5000P.c();
                                abstractC5030z.getClass();
                                C0349t c0349t = new C0349t();
                                c0349t.a(abstractC5000P);
                                recyclerView.T(abstractC5000P, c0349t);
                            }
                        }
                    }
                    z10 = c4997m.f40628g;
                    view = abstractC5000P.f40643a;
                    if (z10 || !abstractC5000P.e()) {
                        if (abstractC5000P.e()) {
                            if (!((abstractC5000P.f40651j & 2) != 0 ? z9 : false)) {
                            }
                        }
                        z11 = false;
                        int l11 = recyclerView.f5234w.l(i, 0);
                        abstractC5000P.f40659r = recyclerView;
                        int i15 = abstractC5000P.f40648f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j6 != Long.MAX_VALUE) {
                            long j15 = ((C4992H) this.f33690g).a(i15).f40611d;
                            if (j15 != 0 && j15 + nanoTime3 >= j6) {
                                z13 = false;
                                z12 = z9;
                                layoutParams2 = view.getLayoutParams();
                                if (layoutParams2 != null) {
                                    c4988d = (C4988D) recyclerView.generateDefaultLayoutParams();
                                    view.setLayoutParams(c4988d);
                                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                                    c4988d = (C4988D) layoutParams2;
                                } else {
                                    c4988d = (C4988D) recyclerView.generateLayoutParams(layoutParams2);
                                    view.setLayoutParams(c4988d);
                                }
                                c4988d.f40604a = abstractC5000P;
                                c4988d.f40607d = (z6 || !z13) ? z11 : z12;
                                return abstractC5000P;
                            }
                        }
                        abstractC5026v = recyclerView.f5183D;
                        abstractC5026v.getClass();
                        abstractC5000P.f40645c = l11;
                        if (abstractC5026v.f40830b) {
                            abstractC5000P.f40647e = abstractC5026v.b(l11);
                        }
                        abstractC5000P.f40651j = (abstractC5000P.f40651j & (-520)) | 1;
                        int i16 = K.n.f1594a;
                        Trace.beginSection("RV OnBindView");
                        abstractC5000P.c();
                        abstractC5026v.c(abstractC5000P, l11);
                        arrayList = abstractC5000P.f40652k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        abstractC5000P.f40651j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof C4988D) {
                            ((C4988D) layoutParams).f40606c = z9;
                        }
                        Trace.endSection();
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        C4991G a10 = ((C4992H) this.f33690g).a(abstractC5000P.f40648f);
                        j10 = a10.f40611d;
                        if (j10 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j10 / 4) * j9);
                        }
                        a10.f40611d = nanoTime4;
                        accessibilityManager = recyclerView.f5208Q;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z12 = true;
                        } else {
                            WeakHashMap weakHashMap = O.X.f2142a;
                            z12 = true;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            C5001Q c5001q = recyclerView.f5197K0;
                            if (c5001q != null) {
                                a0.b bVar = c5001q.f40661e;
                                if (bVar != null) {
                                    View.AccessibilityDelegate d10 = O.X.d(view);
                                    C0328b c0328b2 = d10 == null ? c0328b : d10 instanceof C0326a ? ((C0326a) d10).f2148a : new C0328b(d10);
                                    if (c0328b2 != null && c0328b2 != bVar) {
                                        ((WeakHashMap) bVar.f4210f).put(view, c0328b2);
                                    }
                                }
                                O.X.o(view, bVar);
                            }
                        }
                        if (c4997m.f40628g) {
                            abstractC5000P.f40649g = i;
                        }
                        z13 = z12;
                        layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 != null) {
                        }
                        c4988d.f40604a = abstractC5000P;
                        c4988d.f40607d = (z6 || !z13) ? z11 : z12;
                        return abstractC5000P;
                    }
                    abstractC5000P.f40649g = i;
                    z12 = z9;
                    z13 = false;
                    z11 = false;
                    layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 != null) {
                    }
                    c4988d.f40604a = abstractC5000P;
                    c4988d.f40607d = (z6 || !z13) ? z11 : z12;
                    return abstractC5000P;
                } catch (Throwable th) {
                    int i17 = K.n.f1594a;
                    Trace.endSection();
                    throw th;
                }
            }
        } else {
            j9 = 3;
        }
        c0328b = null;
        if (z6) {
            i4 = abstractC5000P.f40651j;
            if ((i4 & 8192) == 0 ? z9 : false) {
            }
        }
        z10 = c4997m.f40628g;
        view = abstractC5000P.f40643a;
        if (z10) {
        }
        if (abstractC5000P.e()) {
        }
        z11 = false;
        int l112 = recyclerView.f5234w.l(i, 0);
        abstractC5000P.f40659r = recyclerView;
        int i152 = abstractC5000P.f40648f;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j6 != Long.MAX_VALUE) {
        }
        abstractC5026v = recyclerView.f5183D;
        abstractC5026v.getClass();
        abstractC5000P.f40645c = l112;
        if (abstractC5026v.f40830b) {
        }
        abstractC5000P.f40651j = (abstractC5000P.f40651j & (-520)) | 1;
        int i162 = K.n.f1594a;
        Trace.beginSection("RV OnBindView");
        abstractC5000P.c();
        abstractC5026v.c(abstractC5000P, l112);
        arrayList = abstractC5000P.f40652k;
        if (arrayList != null) {
        }
        abstractC5000P.f40651j &= -1025;
        layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C4988D) {
        }
        Trace.endSection();
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        C4991G a102 = ((C4992H) this.f33690g).a(abstractC5000P.f40648f);
        j10 = a102.f40611d;
        if (j10 != 0) {
        }
        a102.f40611d = nanoTime42;
        accessibilityManager = recyclerView.f5208Q;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (c4997m.f40628g) {
        }
        z13 = z12;
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
        }
        c4988d.f40604a = abstractC5000P;
        c4988d.f40607d = (z6 || !z13) ? z11 : z12;
        return abstractC5000P;
    }

    public void j(AbstractC5000P abstractC5000P) {
        if (abstractC5000P.f40656o) {
            ((ArrayList) this.f33687d).remove(abstractC5000P);
        } else {
            ((ArrayList) this.f33686c).remove(abstractC5000P);
        }
        abstractC5000P.f40655n = null;
        abstractC5000P.f40656o = false;
        abstractC5000P.f40651j &= -33;
    }

    public void k() {
        AbstractC4987C abstractC4987C = ((RecyclerView) this.f33691h).f5185E;
        this.f33685b = this.f33684a + (abstractC4987C != null ? abstractC4987C.f40598j : 0);
        ArrayList arrayList = (ArrayList) this.f33688e;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f33685b; size--) {
            e(size);
        }
    }

    public /* synthetic */ C3698oP m(VO vo) {
        return new C3698oP((DP) this.f33686c, (DP) this.f33687d, this.f33684a, this.f33685b, vo, (C2955ah) this.f33689f, (AbstractC3627n8) this.f33690g, this.f33691h);
    }

    public /* synthetic */ boolean n() {
        return Objects.equals(((DP) this.f33686c).f25176o, com.anythink.basead.exoplayer.k.o.f9251w);
    }
}
