package L3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.internal.ads.A5;
import com.google.android.gms.internal.ads.AbstractC2772Sd;
import com.google.android.gms.internal.ads.AbstractC2904a6;
import com.google.android.gms.internal.ads.AbstractC4248z5;
import com.google.android.gms.internal.ads.B5;
import com.google.android.gms.internal.ads.C2733Pp;
import com.google.android.gms.internal.ads.C2925aa;
import com.google.android.gms.internal.ads.C2958b6;
import com.google.android.gms.internal.ads.C3065d6;
import com.google.android.gms.internal.ads.C3068d9;
import com.google.android.gms.internal.ads.C3226g6;
import com.google.android.gms.internal.ads.C3283h9;
import com.google.android.gms.internal.ads.C3295hL;
import com.google.android.gms.internal.ads.C3337i9;
import com.google.android.gms.internal.ads.C3481ku;
import com.google.android.gms.internal.ads.C3493l5;
import com.google.android.gms.internal.ads.C3497l9;
import com.google.android.gms.internal.ads.C3500lC;
import com.google.android.gms.internal.ads.C3551m9;
import com.google.android.gms.internal.ads.C3659o9;
import com.google.android.gms.internal.ads.C3694or;
import com.google.android.gms.internal.ads.C3770qC;
import com.google.android.gms.internal.ads.C3982u9;
import com.google.android.gms.internal.ads.C4036v9;
import com.google.android.gms.internal.ads.C5;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.EnumC3605n9;
import com.google.android.gms.internal.ads.Eu;
import com.google.android.gms.internal.ads.G5;
import com.google.android.gms.internal.ads.H5;
import com.google.android.gms.internal.ads.K5;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.L5;
import com.google.android.gms.internal.ads.M5;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.N5;
import com.google.android.gms.internal.ads.P5;
import com.google.android.gms.internal.ads.Q5;
import com.google.android.gms.internal.ads.Q9;
import com.google.android.gms.internal.ads.R5;
import com.google.android.gms.internal.ads.SK;
import com.google.android.gms.internal.ads.U5;
import com.google.android.gms.internal.ads.V2;
import com.google.android.gms.internal.ads.V5;
import com.google.android.gms.internal.ads.W5;
import com.google.android.gms.internal.ads.W9;
import com.google.android.gms.internal.ads.X5;
import com.google.android.gms.internal.ads.X9;
import com.google.android.gms.internal.ads.XO;
import com.google.android.gms.internal.ads.Xw;
import com.google.android.gms.internal.ads.Y5;
import com.google.android.gms.internal.ads.Z9;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import h.C4539G;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import m.C4687g;
import m.C4695k;
import p2.C4835j;
import u2.C5069B;
import v2.C5110a;

/* loaded from: classes2.dex */
public /* synthetic */ class h implements d3.c, KD, Eu, l.x {

    /* renamed from: n, reason: collision with root package name */
    public boolean f1696n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1697u;

    public h(int i) {
        switch (i) {
            case 5:
                this.f1697u = new SparseBooleanArray();
                break;
            case 9:
                this.f1697u = new Handler(Looper.getMainLooper(), new G3.a(1));
                break;
            default:
                Y5 y52 = new Y5();
                V2 v22 = new V2(22);
                R5 r52 = new R5(M5.f26245b, 0, new V2(false));
                r52.f27175w = v22;
                this.f1697u = new C2958b6(y52, r52);
                this.f1696n = false;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object a(Object obj) {
        long j6;
        C3481ku c3481ku = (C3481ku) this.f1697u;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f1696n) {
            ((Context) c3481ku.f31663u).deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(C3497l9.P(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (C3295hL e9) {
                int i = u2.z.f41319b;
                v2.i.c("Unable to deserialize proto from offline signals database:");
                v2.i.c(e9.getMessage());
            }
        }
        query.close();
        Context context = (Context) c3481ku.f31663u;
        C3551m9 A9 = C3659o9.A();
        String packageName = context.getPackageName();
        A9.h();
        ((C3659o9) A9.f27721u).F(packageName);
        String str = Build.MODEL;
        A9.h();
        ((C3659o9) A9.f27721u).G();
        int w6 = SK.w(sQLiteDatabase, 0);
        A9.h();
        ((C3659o9) A9.f27721u).C(w6);
        A9.h();
        ((C3659o9) A9.f27721u).B(arrayList);
        int w9 = SK.w(sQLiteDatabase, 1);
        A9.h();
        ((C3659o9) A9.f27721u).D(w9);
        int w10 = SK.w(sQLiteDatabase, 3);
        A9.h();
        ((C3659o9) A9.f27721u).I(w10);
        C4835j.f39730C.f39742k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        A9.h();
        ((C3659o9) A9.f27721u).E(currentTimeMillis);
        Cursor M8 = SK.M(sQLiteDatabase, 2);
        if (M8.getCount() > 0) {
            M8.moveToNext();
            j6 = M8.getLong(M8.getColumnIndexOrThrow("value"));
        } else {
            j6 = 0;
        }
        M8.close();
        A9.h();
        ((C3659o9) A9.f27721u).H(j6);
        C3659o9 c3659o9 = (C3659o9) A9.j();
        int size = arrayList.size();
        long j9 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            C3497l9 c3497l9 = (C3497l9) arrayList.get(i6);
            if (c3497l9.O() == 2 && c3497l9.N() > j9) {
                j9 = c3497l9.N();
            }
        }
        if (j9 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j9));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        C3068d9 c3068d9 = (C3068d9) c3481ku.f31664v;
        synchronized (c3068d9) {
            if (c3068d9.f29716c) {
                try {
                    Z9 z9 = c3068d9.f29715b;
                    z9.h();
                    ((C2925aa) z9.f27721u).I(c3659o9);
                } catch (NullPointerException e10) {
                    C4835j.f39730C.f39740h.d("AdMobClearcutLogger.modify", e10);
                }
            }
            C5110a c5110a = (C5110a) c3481ku.f31665w;
            C3982u9 B9 = C4036v9.B();
            int i9 = c5110a.f41389u;
            B9.h();
            ((C4036v9) B9.f27721u).C(i9);
            int i10 = c5110a.f41390v;
            B9.h();
            ((C4036v9) B9.f27721u).D(i10);
            int i11 = true != c5110a.f41391w ? 2 : 0;
            B9.h();
            ((C4036v9) B9.f27721u).A(i11);
            C4036v9 c4036v9 = (C4036v9) B9.j();
            synchronized (c3068d9) {
                if (c3068d9.f29716c) {
                    try {
                        Z9 z92 = c3068d9.f29715b;
                        W9 w92 = (W9) ((C2925aa) z92.f27721u).A().s();
                        w92.h();
                        ((X9) w92.f27721u).C(c4036v9);
                        z92.h();
                        ((C2925aa) z92.f27721u).G((X9) w92.j());
                    } catch (NullPointerException e11) {
                        C4835j.f39730C.f39740h.d("AdMobClearcutLogger.modify", e11);
                    }
                }
            }
        }
        c3068d9.b(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        SK.P(sQLiteDatabase, "failed_requests");
        SK.P(sQLiteDatabase, "total_requests");
        SK.P(sQLiteDatabase, "completed_requests");
        return null;
    }

    @Override // l.x
    public void b(l.m mVar, boolean z3) {
        C4695k c4695k;
        if (this.f1696n) {
            return;
        }
        this.f1696n = true;
        C4539G c4539g = (C4539G) this.f1697u;
        ActionMenuView actionMenuView = c4539g.f37818a.f39081a.f4609n;
        if (actionMenuView != null && (c4695k = actionMenuView.f4562M) != null) {
            c4695k.f();
            C4687g c4687g = c4695k.f39168M;
            if (c4687g != null && c4687g.b()) {
                c4687g.i.dismiss();
            }
        }
        c4539g.f37819b.onPanelClosed(108, mVar);
        this.f1696n = false;
    }

    @Override // d3.c
    public Object c() {
        return HsdpDeepLinkServiceFactory.lambda$createInternal$0((Context) this.f1697u, this.f1696n);
    }

    public boolean d() {
        return this.f1696n;
    }

    public boolean e(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((M.g) this.f1697u) == null) {
            return d();
        }
        char c9 = 2;
        for (int i6 = 0; i6 < i && c9 == 2; i6++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i6));
            h hVar = M.h.f1775a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c9 = 2;
                            break;
                    }
                }
                c9 = 0;
            }
            c9 = 1;
        }
        if (c9 == 0) {
            return true;
        }
        if (c9 != 1) {
            return d();
        }
        return false;
    }

    public void f() {
        this.f1696n = false;
    }

    public void g(byte b9) {
        ((G1.a) this.f1697u).p(String.valueOf(b9));
    }

    public void h(char c9) {
        G1.a aVar = (G1.a) this.f1697u;
        aVar.e(aVar.f1050u, 1);
        char[] cArr = (char[]) aVar.f1051v;
        int i = aVar.f1050u;
        aVar.f1050u = i + 1;
        cArr[i] = c9;
    }

    public void i(int i) {
        ((G1.a) this.f1697u).p(String.valueOf(i));
    }

    @Override // l.x
    public boolean j(l.m mVar) {
        ((C4539G) this.f1697u).f37819b.onMenuOpened(108, mVar);
        return true;
    }

    public void k(long j6) {
        ((G1.a) this.f1697u).p(String.valueOf(j6));
    }

    public void l(String v9) {
        kotlin.jvm.internal.h.e(v9, "v");
        ((G1.a) this.f1697u).p(v9);
    }

    public void m(short s9) {
        ((G1.a) this.f1697u).p(String.valueOf(s9));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
    
        if (r2.equals(com.anythink.expressad.foundation.g.a.f.f19123e) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo11n(Object obj) {
        List list;
        List asList;
        ArrayList arrayList;
        Iterator it;
        char c9;
        Bundle bundle = (Bundle) obj;
        C2733Pp c2733Pp = (C2733Pp) this.f1697u;
        if (((C5069B) c2733Pp.f731u).t()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            asList = (List) obj2;
        } else if (obj2 instanceof String[]) {
            asList = Arrays.asList((String[]) obj2);
        } else {
            list = Collections.EMPTY_LIST;
            arrayList = new ArrayList();
            it = list.iterator();
            while (true) {
                int i = 3;
                c9 = 0;
                if (it.hasNext()) {
                    EnumC3605n9 enumC3605n9 = (EnumC3605n9) C2733Pp.f26866B.get(MA.b("network", MA.b("device", bundle)).getInt("active_network_state", -1), EnumC3605n9.UNSPECIFIED);
                    C3283h9 A9 = C3337i9.A();
                    int i6 = bundle.getInt("cnt", -2);
                    int i9 = bundle.getInt("gnt", 0);
                    if (i6 == -1) {
                        c2733Pp.f26867A = 2;
                    } else {
                        c2733Pp.f26867A = 1;
                        if (i6 == 0) {
                            A9.h();
                            ((C3337i9) A9.f27721u).B(2);
                        } else if (i6 != 1) {
                            A9.h();
                            ((C3337i9) A9.f27721u).B(1);
                        } else {
                            A9.h();
                            ((C3337i9) A9.f27721u).B(3);
                        }
                        switch (i9) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                i = 2;
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                break;
                            case 13:
                                i = 4;
                                break;
                            default:
                                i = 1;
                                break;
                        }
                        A9.h();
                        ((C3337i9) A9.f27721u).C(i);
                    }
                    ((S0.e) c2733Pp.f732v).m(new Xw(this, this.f1696n, arrayList, (C3337i9) A9.j(), enumC3605n9));
                    return;
                }
                String str = (String) it.next();
                switch (str.hashCode()) {
                    case -1396342996:
                        break;
                    case -1052618729:
                        if (str.equals(com.anythink.expressad.foundation.g.a.f.f19119a)) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c9 = 3;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 604727084:
                        if (str.equals(com.anythink.expressad.foundation.g.a.f.f19122d)) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                arrayList.add(c9 != 0 ? c9 != 1 ? c9 != 2 ? c9 != 3 ? Q9.AD_FORMAT_TYPE_UNSPECIFIED : Q9.REWARD_BASED_VIDEO_AD : Q9.NATIVE_APP_INSTALL : Q9.INTERSTITIAL : Q9.BANNER);
            }
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj3 : asList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        list = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = list.iterator();
        while (true) {
            int i10 = 3;
            c9 = 0;
            if (it.hasNext()) {
            }
            arrayList.add(c9 != 0 ? c9 != 1 ? c9 != 2 ? c9 != 3 ? Q9.AD_FORMAT_TYPE_UNSPECIFIED : Q9.REWARD_BASED_VIDEO_AD : Q9.NATIVE_APP_INSTALL : Q9.INTERSTITIAL : Q9.BANNER);
        }
    }

    public void o(String value) {
        int i;
        kotlin.jvm.internal.h.e(value, "value");
        G1.a aVar = (G1.a) this.f1697u;
        aVar.e(aVar.f1050u, value.length() + 2);
        char[] cArr = (char[]) aVar.f1051v;
        int i6 = aVar.f1050u;
        int i9 = i6 + 1;
        cArr[i6] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i9);
        int i10 = length + i9;
        int i11 = i9;
        while (i11 < i10) {
            char c9 = cArr[i11];
            byte[] bArr = g8.s.f37745b;
            if (c9 < bArr.length && bArr[c9] != 0) {
                int length2 = value.length();
                for (int i12 = i11 - i9; i12 < length2; i12++) {
                    aVar.e(i11, 2);
                    char charAt = value.charAt(i12);
                    byte[] bArr2 = g8.s.f37745b;
                    if (charAt < bArr2.length) {
                        byte b9 = bArr2[charAt];
                        if (b9 == 0) {
                            i = i11 + 1;
                            ((char[]) aVar.f1051v)[i11] = charAt;
                        } else {
                            if (b9 == 1) {
                                String str = g8.s.f37744a[charAt];
                                kotlin.jvm.internal.h.b(str);
                                aVar.e(i11, str.length());
                                str.getChars(0, str.length(), (char[]) aVar.f1051v, i11);
                                int length3 = str.length() + i11;
                                aVar.f1050u = length3;
                                i11 = length3;
                            } else {
                                char[] cArr2 = (char[]) aVar.f1051v;
                                cArr2[i11] = '\\';
                                cArr2[i11 + 1] = (char) b9;
                                i11 += 2;
                                aVar.f1050u = i11;
                            }
                        }
                    } else {
                        i = i11 + 1;
                        ((char[]) aVar.f1051v)[i11] = charAt;
                    }
                    i11 = i;
                }
                aVar.e(i11, 1);
                ((char[]) aVar.f1051v)[i11] = '\"';
                aVar.f1050u = i11 + 1;
                return;
            }
            i11++;
        }
        cArr[i10] = '\"';
        aVar.f1050u = i10 + 1;
    }

    public synchronized void p(u1.x xVar, boolean z3) {
        try {
            if (!this.f1696n && !z3) {
                this.f1696n = true;
                xVar.a();
                this.f1696n = false;
            }
            ((Handler) this.f1697u).obtainMessage(1, xVar).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void s() {
        boolean z3 = this.f1696n;
        String a9 = L5.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
        if (z3) {
            return;
        }
        try {
            HashMap hashMap = AbstractC2904a6.f29025a;
            C3493l5 c3493l5 = new C3493l5(4);
            c3493l5.e(N5.f26449n, C3226g6.f(H5.f25231s));
            c3493l5.e(N5.f26457u, V2.n(0L));
            c3493l5.e(N5.f26459v, V2.n(1L));
            c3493l5.e(N5.f26461w, V2.n(2L));
            c3493l5.e(N5.f26463x, V2.n(3L));
            c3493l5.e(N5.f26465y, V2.n(4L));
            c3493l5.e(N5.f26467z, V2.n(7L));
            c3493l5.e(N5.f26406A, V2.n(-1L));
            c3493l5.e(N5.f26408B, V2.n(-2L));
            c3493l5.e(N5.f26410C, C3226g6.f(G5.f24915b));
            c3493l5.e(N5.f26411D, C3226g6.f(G5.f24917d));
            c3493l5.e(N5.f26413E, C3226g6.f(G5.f24922j));
            c3493l5.e(N5.f26415F, C3226g6.f(G5.f24923k));
            c3493l5.e(N5.f26417G, C3226g6.f(G5.f24926n));
            c3493l5.e(N5.f26419H, C3226g6.f(H5.f25226n));
            c3493l5.e(N5.f26421I, C3226g6.f(G5.f24919f));
            c3493l5.e(N5.J, C3226g6.f(G5.f24920g));
            c3493l5.e(N5.f26424K, C3226g6.f(G5.f24921h));
            c3493l5.e(N5.f26426L, C3226g6.f(G5.i));
            c3493l5.e(N5.f26428M, C3226g6.f(H5.f25221h));
            c3493l5.e(N5.f26430N, C3226g6.f(H5.f25222j));
            c3493l5.e(N5.f26434P, C3226g6.f(G5.f24927o));
            c3493l5.e(N5.f26436Q, C3226g6.f(G5.f24928p));
            c3493l5.e(N5.f26438R, C3226g6.f(G5.f24931s));
            c3493l5.e(N5.f26440S, C3226g6.f(G5.f24932t));
            c3493l5.e(N5.f26442T, C3226g6.f(G5.f24933u));
            c3493l5.e(N5.f26444U, C3226g6.f(G5.f24934v));
            c3493l5.e(N5.f26445V, C3226g6.f(H5.f25215b));
            c3493l5.e(N5.f26446W, C3226g6.f(H5.f25217d));
            c3493l5.e(N5.f26447X, C3226g6.f(H5.f25218e));
            c3493l5.e(N5.Y, C3226g6.f(H5.f25219f));
            c3493l5.e(N5.f26448Z, C3226g6.f(H5.f25223k));
            c3493l5.e(N5.f26450n0, C3226g6.f(H5.f25224l));
            c3493l5.e(N5.f26451o0, C3226g6.f(H5.f25228p));
            c3493l5.e(N5.f26452p0, C3226g6.f(H5.f25229q));
            c3493l5.e(N5.f26453q0, C3226g6.f(H5.f25233u));
            c3493l5.e(N5.f26454r0, C3226g6.f(H5.f25234v));
            c3493l5.e(N5.f26455s0, C3226g6.f(K5.f25849b));
            c3493l5.e(N5.f26456t0, C3226g6.f(K5.f25851d));
            c3493l5.e(N5.f26407A0, C3226g6.f(K5.f25852e));
            c3493l5.e(N5.f26458u0, C3226g6.f(K5.f25856j));
            c3493l5.e(N5.f26460v0, C3226g6.f(K5.f25857k));
            c3493l5.e(N5.f26462w0, C3226g6.f(K5.f25860n));
            c3493l5.e(N5.f26464x0, C3226g6.f(K5.f25863q));
            c3493l5.e(N5.f26466y0, C3226g6.f(G5.f24929q));
            c3493l5.e(N5.f26468z0, C3226g6.f(K5.f25858l));
            c3493l5.e(N5.f26409B0, C3226g6.f(G5.f24924l));
            c3493l5.e(N5.C0, C3226g6.f(K5.f25854g));
            c3493l5.e(N5.f26412D0, C3226g6.f(K5.f25855h));
            c3493l5.e(N5.f26432O, C3226g6.f(H5.i));
            c3493l5.e(N5.f26414E0, C3226g6.f(K5.f25862p));
            c3493l5.e(N5.f26416F0, C3226g6.f(H5.f25225m));
            c3493l5.e(N5.f26418G0, C3226g6.f(K5.f25861o));
            c3493l5.e(N5.f26420H0, C3226g6.f(H5.f25216c));
            c3493l5.e(N5.f26422I0, C3226g6.f(K5.f25850c));
            c3493l5.e(N5.f26423J0, C3226g6.f(G5.f24930r));
            c3493l5.e(N5.f26425K0, C3226g6.f(K5.f25859m));
            c3493l5.e(N5.f26427L0, C3226g6.f(G5.f24918e));
            c3493l5.e(N5.f26429M0, C3226g6.f(K5.f25853f));
            c3493l5.e(N5.f26431N0, C3226g6.f(H5.f25232t));
            c3493l5.e(N5.f26433O0, C3226g6.f(G5.f24916c));
            c3493l5.e(N5.f26435P0, C3226g6.f(K5.i));
            c3493l5.e(N5.f26437Q0, C3226g6.f(H5.f25227o));
            c3493l5.e(N5.f26439R0, C3226g6.f(G5.f24925m));
            c3493l5.e(N5.f26441S0, C3226g6.f(H5.f25230r));
            c3493l5.e(N5.f26443T0, C3226g6.f(H5.f25220g));
            C3770qC s9 = c3493l5.s(true);
            long j6 = -1;
            while (true) {
                C2958b6 c2958b6 = (C2958b6) this.f1697u;
                if (j6 < -82) {
                    for (int i = 82; i < 1159; i++) {
                        c2958b6.f29214a.b(C3226g6.a(null));
                    }
                    this.f1696n = true;
                    return;
                }
                N5 n52 = (N5) hashMap.get(Long.valueOf(j6));
                if (n52 == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 36);
                    sb.append(a9);
                    sb.append(j6);
                    throw new B0.c(sb.toString());
                }
                c2958b6.f29214a.b((C3226g6) s9.get(n52));
                j6--;
            }
        } catch (X5 e9) {
            throw new D5(C5.f24035u, e9);
        }
    }

    public void t(int i) {
        AbstractC2772Sd.H(!this.f1696n);
        ((SparseBooleanArray) this.f1697u).append(i, true);
    }

    public XO u() {
        AbstractC2772Sd.H(!this.f1696n);
        this.f1696n = true;
        return new XO((SparseBooleanArray) this.f1697u);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0434 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03fd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(Optional optional) {
        char c9;
        long j6;
        Object obj;
        B5 b52;
        Object of;
        Optional optional2;
        long j9;
        try {
            try {
                boolean z3 = this.f1696n;
                C2958b6 c2958b6 = (C2958b6) this.f1697u;
                if (z3) {
                    c9 = 0;
                    j6 = 2;
                    obj = null;
                } else {
                    String a9 = L5.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
                    try {
                        HashMap hashMap = AbstractC2904a6.f29025a;
                        C3493l5 c3493l5 = new C3493l5(7, false);
                        c9 = 0;
                        c3493l5.e(N5.f26449n, C3226g6.f(H5.f25231s));
                        c3493l5.e(N5.f26457u, V2.n(0L));
                        c3493l5.e(N5.f26459v, V2.n(1L));
                        c3493l5.e(N5.f26461w, V2.n(2L));
                        c3493l5.e(N5.f26463x, V2.n(3L));
                        c3493l5.e(N5.f26465y, V2.n(4L));
                        c3493l5.e(N5.f26467z, V2.n(7L));
                        j6 = 2;
                        c3493l5.e(N5.f26406A, V2.n(-1L));
                        c3493l5.e(N5.f26408B, V2.n(-2L));
                        c3493l5.e(N5.f26410C, C3226g6.f(G5.f24915b));
                        c3493l5.e(N5.f26411D, C3226g6.f(G5.f24917d));
                        c3493l5.e(N5.f26413E, C3226g6.f(G5.f24922j));
                        c3493l5.e(N5.f26415F, C3226g6.f(G5.f24923k));
                        c3493l5.e(N5.f26417G, C3226g6.f(G5.f24926n));
                        c3493l5.e(N5.f26419H, C3226g6.f(H5.f25226n));
                        c3493l5.e(N5.f26421I, C3226g6.f(G5.f24919f));
                        c3493l5.e(N5.J, C3226g6.f(G5.f24920g));
                        c3493l5.e(N5.f26424K, C3226g6.f(G5.f24921h));
                        c3493l5.e(N5.f26426L, C3226g6.f(G5.i));
                        c3493l5.e(N5.f26428M, C3226g6.f(H5.f25221h));
                        c3493l5.e(N5.f26430N, C3226g6.f(H5.f25222j));
                        c3493l5.e(N5.f26434P, C3226g6.f(G5.f24927o));
                        c3493l5.e(N5.f26436Q, C3226g6.f(G5.f24928p));
                        c3493l5.e(N5.f26438R, C3226g6.f(G5.f24931s));
                        c3493l5.e(N5.f26440S, C3226g6.f(G5.f24932t));
                        c3493l5.e(N5.f26442T, C3226g6.f(G5.f24933u));
                        c3493l5.e(N5.f26444U, C3226g6.f(G5.f24934v));
                        c3493l5.e(N5.f26445V, C3226g6.f(H5.f25215b));
                        c3493l5.e(N5.f26446W, C3226g6.f(H5.f25217d));
                        c3493l5.e(N5.f26447X, C3226g6.f(H5.f25218e));
                        c3493l5.e(N5.Y, C3226g6.f(H5.f25219f));
                        c3493l5.e(N5.f26448Z, C3226g6.f(H5.f25223k));
                        c3493l5.e(N5.f26450n0, C3226g6.f(H5.f25224l));
                        c3493l5.e(N5.f26451o0, C3226g6.f(H5.f25228p));
                        c3493l5.e(N5.f26452p0, C3226g6.f(H5.f25229q));
                        c3493l5.e(N5.f26453q0, C3226g6.f(H5.f25233u));
                        c3493l5.e(N5.f26454r0, C3226g6.f(H5.f25234v));
                        c3493l5.e(N5.f26455s0, C3226g6.f(K5.f25849b));
                        c3493l5.e(N5.f26456t0, C3226g6.f(K5.f25851d));
                        c3493l5.e(N5.f26407A0, C3226g6.f(K5.f25852e));
                        c3493l5.e(N5.f26458u0, C3226g6.f(K5.f25856j));
                        c3493l5.e(N5.f26460v0, C3226g6.f(K5.f25857k));
                        c3493l5.e(N5.f26462w0, C3226g6.f(K5.f25860n));
                        c3493l5.e(N5.f26464x0, C3226g6.f(K5.f25863q));
                        c3493l5.e(N5.f26466y0, C3226g6.f(G5.f24929q));
                        c3493l5.e(N5.f26468z0, C3226g6.f(K5.f25858l));
                        c3493l5.e(N5.f26409B0, C3226g6.f(G5.f24924l));
                        c3493l5.e(N5.C0, C3226g6.f(K5.f25854g));
                        c3493l5.e(N5.f26412D0, C3226g6.f(K5.f25855h));
                        c3493l5.e(N5.f26432O, C3226g6.f(H5.i));
                        c3493l5.e(N5.f26414E0, C3226g6.f(K5.f25862p));
                        c3493l5.e(N5.f26416F0, C3226g6.f(H5.f25225m));
                        c3493l5.e(N5.f26418G0, C3226g6.f(K5.f25861o));
                        c3493l5.e(N5.f26420H0, C3226g6.f(H5.f25216c));
                        c3493l5.e(N5.f26422I0, C3226g6.f(K5.f25850c));
                        c3493l5.e(N5.f26423J0, C3226g6.f(G5.f24930r));
                        c3493l5.e(N5.f26425K0, C3226g6.f(K5.f25859m));
                        c3493l5.e(N5.f26427L0, C3226g6.f(G5.f24918e));
                        c3493l5.e(N5.f26429M0, C3226g6.f(K5.f25853f));
                        c3493l5.e(N5.f26431N0, C3226g6.f(H5.f25232t));
                        c3493l5.e(N5.f26433O0, C3226g6.f(G5.f24916c));
                        c3493l5.e(N5.f26435P0, C3226g6.f(K5.i));
                        c3493l5.e(N5.f26437Q0, C3226g6.f(H5.f25227o));
                        c3493l5.e(N5.f26439R0, C3226g6.f(G5.f24925m));
                        c3493l5.e(N5.f26441S0, C3226g6.f(H5.f25230r));
                        c3493l5.e(N5.f26443T0, C3226g6.f(H5.f25220g));
                        C3770qC o6 = c3493l5.o();
                        for (long j10 = -1; j10 >= -82; j10--) {
                            N5 n52 = (N5) hashMap.get(Long.valueOf(j10));
                            if (n52 == null) {
                                StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 36);
                                sb.append(a9);
                                sb.append(j10);
                                throw new B0.c(sb.toString());
                            }
                            c2958b6.f29214a.b((C3226g6) o6.get(n52));
                        }
                        obj = null;
                        for (int i = 82; i < 1159; i++) {
                            c2958b6.f29214a.b(C3226g6.a(null));
                        }
                        this.f1696n = true;
                    } catch (X5 e9) {
                        throw new D5(C5.f24035u, e9);
                    }
                }
                R5 r52 = c2958b6.f29216c;
                try {
                    r52.b(0L);
                    r52.f27174v = new V2(21);
                    String a10 = L5.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo");
                    String a11 = L5.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=");
                    R5 r53 = c2958b6.f29216c;
                    try {
                        int g4 = r53.g();
                        int i6 = ((g4 & 65535) << 16) >> 16;
                        int i9 = (((g4 >> 16) & 65535) << 16) >> 16;
                        if (i6 != -14426) {
                            throw new A5(a10.concat(String.format(L5.a("e1Hk+x0="), Short.valueOf((short) i6))));
                        }
                        if (i9 != 5) {
                            throw new A5(a11.concat(String.format(L5.a("e1Hk+x0="), Short.valueOf((short) i9))));
                        }
                        String a12 = L5.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1");
                        try {
                            int g9 = r53.g();
                            if (g9 != 1182321202) {
                                throw new A5(a12.concat(String.format(L5.a("e1Hk9x0="), Integer.valueOf(g9))));
                            }
                            try {
                                int[] iArr = {r53.g()};
                                int[] iArr2 = AbstractC4248z5.f35283a;
                                V2 v22 = (V2) r53.f27175w;
                                int i10 = iArr[c9];
                                v22.getClass();
                                r53.f27174v = new C3493l5(new G1.a(i10, 5, iArr2));
                                try {
                                    r53.b(96L);
                                    C3500lC c3500lC = E5.f24540a;
                                    Optional.empty();
                                    optional.isPresent();
                                    C3226g6 a13 = C3226g6.a(obj);
                                    Y5 y52 = c2958b6.f29214a;
                                    y52.b(a13);
                                    y52.b(C3226g6.a(obj));
                                    C3694or c3694or = c2958b6.f29215b;
                                    c3694or.b(0L, 0L, y52.f28654b);
                                    while (!((ArrayDeque) c3694or.f32954u).isEmpty()) {
                                        long c10 = r53.c();
                                        try {
                                            try {
                                                try {
                                                } catch (C3065d6 unused) {
                                                    b52 = B5.f23845w;
                                                }
                                            } catch (W5 unused2) {
                                                b52 = B5.f23844v;
                                            }
                                        } catch (Q5 unused3) {
                                            b52 = B5.f23827O;
                                        }
                                        try {
                                            of = y52.d(r53.f()).p().apply(c2958b6);
                                        } catch (Throwable unused4) {
                                            b52 = B5.f23828P;
                                            of = Optional.of(b52);
                                            optional2 = (Optional) of;
                                            if (optional2.isPresent()) {
                                            }
                                        }
                                        optional2 = (Optional) of;
                                        if (optional2.isPresent()) {
                                            if (!E5.f24540a.contains(optional2.get())) {
                                                throw new D5(C5.f24033A, (B5) optional2.get(), c10);
                                            }
                                            Object obj2 = optional2.get();
                                            long c11 = r53.c();
                                            do {
                                                try {
                                                    j9 = c2958b6.f29215b.E().f27693c;
                                                    Optional a14 = c2958b6.a();
                                                    if (a14.isPresent() && a14.get() == B5.f23829Q) {
                                                        throw new D5(C5.f24033A, (B5) obj2, c11);
                                                    }
                                                    if (a14.isPresent()) {
                                                        throw new D5(C5.f24033A, (B5) a14.get(), c11);
                                                    }
                                                } catch (V5 unused5) {
                                                    throw new D5(C5.f24033A, (B5) obj2, c11);
                                                }
                                            } while (j9 != j6);
                                        }
                                    }
                                    try {
                                        C3226g6 c12 = y52.c();
                                        y52.c();
                                        return c12.h();
                                    } catch (W5 e10) {
                                        throw new D5(C5.f24039y, e10);
                                    } catch (C3065d6 e11) {
                                        throw new D5(C5.f24040z, e11);
                                    }
                                } catch (P5 e12) {
                                    e = e12;
                                    throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                                } catch (Q5 e13) {
                                    e = e13;
                                    throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                                }
                            } catch (Q5 e14) {
                                throw new D5(C5.f24038x, e14);
                            }
                        } catch (Q5 e15) {
                            throw new A5(L5.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e15);
                        }
                    } catch (Q5 e16) {
                        throw new A5(L5.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e16);
                    }
                } catch (P5 e17) {
                    e = e17;
                    throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                } catch (Q5 e18) {
                    e = e18;
                    throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                }
            } catch (X5 e19) {
                throw new D5(C5.f24036v, e19);
            }
        } catch (U5 e20) {
            throw new D5(C5.f24037w, e20);
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        int i = u2.z.f41319b;
        v2.i.c("Failed to get signals bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(long j6, Optional optional) {
        B5 b52;
        Object obj;
        Optional optional2;
        long j9;
        int i = 9;
        char c9 = 5;
        boolean z3 = false;
        boolean z6 = false;
        C2958b6 c2958b6 = (C2958b6) this.f1697u;
        try {
            if (!this.f1696n) {
                s();
            }
            R5 r52 = c2958b6.f29216c;
            try {
                r52.b(0L);
                r52.f27174v = new V2(z6 ? 1 : 0);
                R5 r53 = c2958b6.f29216c;
                try {
                    int g4 = r53.g();
                    int i6 = ((g4 & 65535) << 16) >> 16;
                    int i9 = (((g4 >> 16) & 65535) << 16) >> 16;
                    if (i6 != -14426) {
                        throw new A5(L5.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo").concat(String.format(L5.a("e1Hk+x0="), Short.valueOf((short) i6))));
                    }
                    if (i9 != 5) {
                        throw new A5(L5.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=").concat(String.format(L5.a("e1Hk+x0="), Short.valueOf((short) i9))));
                    }
                    int[] iArr = {171029949, 1356422403, 1913211838, 215266853, 506454572, 1309457854, 56236614, 1696779465, 30245415};
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    int g9 = com.anythink.basead.exoplayer.f.f.g(((~i10) & i11) | iArr[2], (i10 & iArr[3]) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % 30245415);
                    try {
                        int g10 = r53.g();
                        if (g10 != g9) {
                            throw new A5(L5.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1").concat(String.format(L5.a("e1Hk9x0="), Integer.valueOf(g10))));
                        }
                        try {
                            int[] iArr2 = {r53.g()};
                            int[] iArr3 = AbstractC4248z5.f35283a;
                            V2 v22 = (V2) r53.f27175w;
                            int i12 = iArr2[0];
                            v22.getClass();
                            r53.f27174v = new C3493l5(new G1.a(i12, 5, iArr3));
                            try {
                                r53.b(j6);
                                C3500lC c3500lC = E5.f24540a;
                                Optional.empty();
                                Object a9 = true != optional.isPresent() ? C3226g6.a(null) : optional.get();
                                C3226g6 g11 = a9 instanceof C3226g6 ? (C3226g6) a9 : C3226g6.g(a9);
                                Y5 y52 = c2958b6.f29214a;
                                y52.b(g11);
                                y52.b(C3226g6.a(null));
                                C3694or c3694or = c2958b6.f29215b;
                                c3694or.b(0L, 0L, y52.f28654b);
                                while (!((ArrayDeque) c3694or.f32954u).isEmpty()) {
                                    long c10 = r53.c();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    obj = y52.d(r53.f()).p().apply(c2958b6);
                                                } catch (Throwable unused) {
                                                    b52 = B5.f23828P;
                                                    obj = Optional.of(b52);
                                                    optional2 = (Optional) obj;
                                                    if (optional2.isPresent()) {
                                                    }
                                                }
                                            } catch (C3065d6 unused2) {
                                                b52 = B5.f23845w;
                                            }
                                        } catch (W5 unused3) {
                                            b52 = B5.f23844v;
                                        }
                                    } catch (Q5 unused4) {
                                        b52 = B5.f23827O;
                                    }
                                    optional2 = (Optional) obj;
                                    if (optional2.isPresent()) {
                                        if (!E5.f24540a.contains(optional2.get())) {
                                            throw new D5(C5.f24033A, (B5) optional2.get(), c10);
                                        }
                                        Object obj2 = optional2.get();
                                        long[] jArr = new long[i];
                                        // fill-array-data instruction
                                        jArr[0] = 1598171894;
                                        jArr[1] = 600979209;
                                        jArr[2] = 180618323;
                                        jArr[3] = 2704454472L;
                                        jArr[4] = 3601187955L;
                                        jArr[5] = 4055661621L;
                                        jArr[6] = 545343058;
                                        jArr[7] = 1815320763;
                                        jArr[8] = 988992210;
                                        long j10 = jArr[z3 ? 1 : 0];
                                        long j11 = jArr[1];
                                        long j12 = jArr[2];
                                        long j13 = jArr[3];
                                        long j14 = jArr[4];
                                        long j15 = jArr[c9];
                                        long j16 = jArr[6];
                                        long j17 = jArr[7];
                                        long j18 = (((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + j16;
                                        long j19 = j17 % 988992210;
                                        long c11 = r53.c();
                                        do {
                                            try {
                                                j9 = c2958b6.f29215b.E().f27693c;
                                                Optional a10 = c2958b6.a();
                                                if (a10.isPresent() && a10.get() == B5.f23829Q) {
                                                    throw new D5(C5.f24033A, (B5) obj2, c11);
                                                }
                                                if (a10.isPresent()) {
                                                    throw new D5(C5.f24033A, (B5) a10.get(), c11);
                                                }
                                            } catch (V5 unused5) {
                                                throw new D5(C5.f24033A, (B5) obj2, c11);
                                            }
                                        } while (j9 != (j18 ^ j19));
                                        i = 9;
                                        c9 = 5;
                                        z3 = false;
                                    }
                                }
                                try {
                                    C3226g6 c12 = y52.c();
                                    y52.c();
                                    return c12.h();
                                } catch (W5 e9) {
                                    throw new D5(C5.f24039y, e9);
                                } catch (C3065d6 e10) {
                                    throw new D5(C5.f24040z, e10);
                                }
                            } catch (P5 e11) {
                                e = e11;
                                throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                            } catch (Q5 e12) {
                                e = e12;
                                throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                            }
                        } catch (Q5 e13) {
                            throw new D5(C5.f24038x, e13);
                        }
                    } catch (Q5 e14) {
                        throw new A5(L5.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), (Throwable) e14);
                    }
                } catch (Q5 e15) {
                    throw new A5(L5.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), (Throwable) e15);
                }
            } catch (P5 e16) {
                e = e16;
                throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
            } catch (Q5 e17) {
                e = e17;
                throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
            }
        } catch (U5 e18) {
            throw new D5(C5.f24037w, e18);
        } catch (X5 e19) {
            throw new D5(C5.f24036v, e19);
        }
    }

    public /* synthetic */ h(Object obj) {
        this.f1697u = obj;
    }

    public /* synthetic */ h(Object obj, boolean z3) {
        this.f1697u = obj;
        this.f1696n = z3;
    }

    public h(G1.a aVar) {
        this.f1697u = aVar;
        this.f1696n = true;
    }

    public h(M.g gVar, boolean z3) {
        this(gVar);
        this.f1696n = z3;
    }

    public void q() {
    }

    public void r() {
    }
}
