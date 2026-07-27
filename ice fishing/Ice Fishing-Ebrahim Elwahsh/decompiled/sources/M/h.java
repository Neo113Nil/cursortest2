package M;

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
import c8.t;
import com.google.android.gms.internal.ads.A5;
import com.google.android.gms.internal.ads.AbstractC2655Lg;
import com.google.android.gms.internal.ads.AbstractC2720Pd;
import com.google.android.gms.internal.ads.AbstractC4153x5;
import com.google.android.gms.internal.ads.B5;
import com.google.android.gms.internal.ads.C2593Hm;
import com.google.android.gms.internal.ads.C2783Sp;
import com.google.android.gms.internal.ads.C2911a6;
import com.google.android.gms.internal.ads.C2914a9;
import com.google.android.gms.internal.ads.C3020c6;
import com.google.android.gms.internal.ads.C3132e9;
import com.google.android.gms.internal.ads.C3187f9;
import com.google.android.gms.internal.ads.C3350i9;
import com.google.android.gms.internal.ads.C3398j5;
import com.google.android.gms.internal.ads.C3402j9;
import com.google.android.gms.internal.ads.C3510l9;
import com.google.android.gms.internal.ads.C3526lP;
import com.google.android.gms.internal.ads.C3602mu;
import com.google.android.gms.internal.ads.C3675oC;
import com.google.android.gms.internal.ads.C3761pr;
import com.google.android.gms.internal.ads.C3833r9;
import com.google.android.gms.internal.ads.C3845rL;
import com.google.android.gms.internal.ads.C3887s9;
import com.google.android.gms.internal.ads.C3944tC;
import com.google.android.gms.internal.ads.C4207y5;
import com.google.android.gms.internal.ads.C5;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.EnumC3456k9;
import com.google.android.gms.internal.ads.EnumC4261z5;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.Gu;
import com.google.android.gms.internal.ads.H5;
import com.google.android.gms.internal.ads.I5;
import com.google.android.gms.internal.ads.J5;
import com.google.android.gms.internal.ads.K5;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.M5;
import com.google.android.gms.internal.ads.N5;
import com.google.android.gms.internal.ads.N9;
import com.google.android.gms.internal.ads.O5;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.R5;
import com.google.android.gms.internal.ads.S5;
import com.google.android.gms.internal.ads.T2;
import com.google.android.gms.internal.ads.T5;
import com.google.android.gms.internal.ads.T9;
import com.google.android.gms.internal.ads.U5;
import com.google.android.gms.internal.ads.U9;
import com.google.android.gms.internal.ads.V5;
import com.google.android.gms.internal.ads.W9;
import com.google.android.gms.internal.ads.X5;
import com.google.android.gms.internal.ads.X9;
import com.google.android.gms.internal.ads.Y5;
import com.google.android.gms.internal.ads.Zw;
import h.C4541H;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import l.l;
import l.w;
import m.C4735g;
import m.C4743k;
import p2.j;
import t2.C;
import t2.E;
import u1.x;
import u2.C5107a;

/* loaded from: classes.dex */
public class h implements LD, Gu, w {

    /* renamed from: n, reason: collision with root package name */
    public boolean f1827n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1828u;

    public h(int i) {
        switch (i) {
            case 5:
                this.f1828u = new SparseBooleanArray();
                break;
            case 8:
                this.f1828u = new Handler(Looper.getMainLooper(), new E3.a(1));
                break;
            default:
                V5 v52 = new V5();
                T2 t22 = new T2(22);
                O5 o52 = new O5(J5.f25734b, 0, new T2(false));
                o52.f26651w = t22;
                this.f1828u = new Y5(v52, o52);
                this.f1827n = false;
                break;
        }
    }

    public boolean a() {
        return this.f1827n;
    }

    @Override // com.google.android.gms.internal.ads.Gu
    public Object b(Object obj) {
        long j9;
        C3602mu c3602mu = (C3602mu) this.f1828u;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f1827n) {
            ((Context) c3602mu.f32774u).deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(C3350i9.P(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (C3845rL e6) {
                int i = C.f40822b;
                u2.i.c("Unable to deserialize proto from offline signals database:");
                u2.i.c(e6.getMessage());
            }
        }
        query.close();
        Context context = (Context) c3602mu.f32774u;
        C3402j9 A8 = C3510l9.A();
        String packageName = context.getPackageName();
        A8.h();
        ((C3510l9) A8.f30000u).F(packageName);
        String str = Build.MODEL;
        A8.h();
        ((C3510l9) A8.f30000u).G();
        int r9 = AbstractC2655Lg.r(sQLiteDatabase, 0);
        A8.h();
        ((C3510l9) A8.f30000u).C(r9);
        A8.h();
        ((C3510l9) A8.f30000u).B(arrayList);
        int r10 = AbstractC2655Lg.r(sQLiteDatabase, 1);
        A8.h();
        ((C3510l9) A8.f30000u).D(r10);
        int r11 = AbstractC2655Lg.r(sQLiteDatabase, 3);
        A8.h();
        ((C3510l9) A8.f30000u).I(r11);
        j.f39798C.f39810k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        A8.h();
        ((C3510l9) A8.f30000u).E(currentTimeMillis);
        Cursor A9 = AbstractC2655Lg.A(sQLiteDatabase, 2);
        if (A9.getCount() > 0) {
            A9.moveToNext();
            j9 = A9.getLong(A9.getColumnIndexOrThrow("value"));
        } else {
            j9 = 0;
        }
        A9.close();
        A8.h();
        ((C3510l9) A8.f30000u).H(j9);
        C3510l9 c3510l9 = (C3510l9) A8.j();
        int size = arrayList.size();
        long j10 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C3350i9 c3350i9 = (C3350i9) arrayList.get(i4);
            if (c3350i9.O() == 2 && c3350i9.N() > j10) {
                j10 = c3350i9.N();
            }
        }
        if (j10 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j10));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        C2914a9 c2914a9 = (C2914a9) c3602mu.f32775v;
        synchronized (c2914a9) {
            if (c2914a9.f29177c) {
                try {
                    W9 w9 = c2914a9.f29176b;
                    w9.h();
                    ((X9) w9.f30000u).I(c3510l9);
                } catch (NullPointerException e9) {
                    j.f39798C.f39808h.d("AdMobClearcutLogger.modify", e9);
                }
            }
            C5107a c5107a = (C5107a) c3602mu.f32776w;
            C3833r9 B8 = C3887s9.B();
            int i9 = c5107a.f41218u;
            B8.h();
            ((C3887s9) B8.f30000u).C(i9);
            int i10 = c5107a.f41219v;
            B8.h();
            ((C3887s9) B8.f30000u).D(i10);
            int i11 = true != c5107a.f41220w ? 2 : 0;
            B8.h();
            ((C3887s9) B8.f30000u).A(i11);
            C3887s9 c3887s9 = (C3887s9) B8.j();
            synchronized (c2914a9) {
                if (c2914a9.f29177c) {
                    try {
                        W9 w92 = c2914a9.f29176b;
                        T9 t9 = (T9) ((X9) w92.f30000u).A().s();
                        t9.h();
                        ((U9) t9.f30000u).C(c3887s9);
                        w92.h();
                        ((X9) w92.f30000u).G((U9) t9.j());
                    } catch (NullPointerException e10) {
                        j.f39798C.f39808h.d("AdMobClearcutLogger.modify", e10);
                    }
                }
            }
        }
        c2914a9.b(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        AbstractC2655Lg.C(sQLiteDatabase, "failed_requests");
        AbstractC2655Lg.C(sQLiteDatabase, "total_requests");
        AbstractC2655Lg.C(sQLiteDatabase, "completed_requests");
        return null;
    }

    public boolean c(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((g) this.f1828u) == null) {
            return a();
        }
        char c4 = 2;
        for (int i4 = 0; i4 < i && c4 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            h hVar = i.f1829a;
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
                            c4 = 2;
                            break;
                    }
                }
                c4 = 0;
            }
            c4 = 1;
        }
        if (c4 == 0) {
            return true;
        }
        if (c4 != 1) {
            return a();
        }
        return false;
    }

    public void d() {
        this.f1827n = false;
    }

    @Override // l.w
    public void e(l lVar, boolean z8) {
        C4743k c4743k;
        if (this.f1827n) {
            return;
        }
        this.f1827n = true;
        C4541H c4541h = (C4541H) this.f1828u;
        ActionMenuView actionMenuView = c4541h.f38031a.f39353a.f4724n;
        if (actionMenuView != null && (c4743k = actionMenuView.f4677M) != null) {
            c4743k.f();
            C4735g c4735g = c4743k.f39439M;
            if (c4735g != null && c4735g.b()) {
                c4735g.i.dismiss();
            }
        }
        c4541h.f38032b.onPanelClosed(108, lVar);
        this.f1827n = false;
    }

    public void f(byte b9) {
        ((G1.a) this.f1828u).o(String.valueOf(b9));
    }

    @Override // l.w
    public boolean g(l lVar) {
        ((C4541H) this.f1828u).f38032b.onMenuOpened(108, lVar);
        return true;
    }

    public void h(char c4) {
        G1.a aVar = (G1.a) this.f1828u;
        aVar.c(aVar.f1194u, 1);
        char[] cArr = (char[]) aVar.f1195v;
        int i = aVar.f1194u;
        aVar.f1194u = i + 1;
        cArr[i] = c4;
    }

    public void i(int i) {
        ((G1.a) this.f1828u).o(String.valueOf(i));
    }

    public void j(long j9) {
        ((G1.a) this.f1828u).o(String.valueOf(j9));
    }

    public void k(String v6) {
        kotlin.jvm.internal.h.e(v6, "v");
        ((G1.a) this.f1828u).o(v6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
    
        if (r2.equals(com.anythink.expressad.foundation.g.a.f.f19281e) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo7l(Object obj) {
        List list;
        List asList;
        ArrayList arrayList;
        Iterator it;
        char c4;
        Bundle bundle = (Bundle) obj;
        C2783Sp c2783Sp = (C2783Sp) this.f1828u;
        if (((E) c2783Sp.f683u).t()) {
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
                c4 = 0;
                if (it.hasNext()) {
                    EnumC3456k9 enumC3456k9 = (EnumC3456k9) C2783Sp.f27620B.get(AbstractC2720Pd.b("network", AbstractC2720Pd.b("device", bundle)).getInt("active_network_state", -1), EnumC3456k9.UNSPECIFIED);
                    C3132e9 A8 = C3187f9.A();
                    int i4 = bundle.getInt("cnt", -2);
                    int i9 = bundle.getInt("gnt", 0);
                    if (i4 == -1) {
                        c2783Sp.f27621A = 2;
                    } else {
                        c2783Sp.f27621A = 1;
                        if (i4 == 0) {
                            A8.h();
                            ((C3187f9) A8.f30000u).B(2);
                        } else if (i4 != 1) {
                            A8.h();
                            ((C3187f9) A8.f30000u).B(1);
                        } else {
                            A8.h();
                            ((C3187f9) A8.f30000u).B(3);
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
                        A8.h();
                        ((C3187f9) A8.f30000u).C(i);
                    }
                    ((C2593Hm) c2783Sp.f684v).e(new Zw(this, this.f1827n, arrayList, (C3187f9) A8.j(), enumC3456k9));
                    return;
                }
                String str = (String) it.next();
                switch (str.hashCode()) {
                    case -1396342996:
                        break;
                    case -1052618729:
                        if (str.equals(com.anythink.expressad.foundation.g.a.f.f19277a)) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 604727084:
                        if (str.equals(com.anythink.expressad.foundation.g.a.f.f19280d)) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                arrayList.add(c4 != 0 ? c4 != 1 ? c4 != 2 ? c4 != 3 ? N9.AD_FORMAT_TYPE_UNSPECIFIED : N9.REWARD_BASED_VIDEO_AD : N9.NATIVE_APP_INSTALL : N9.INTERSTITIAL : N9.BANNER);
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
            c4 = 0;
            if (it.hasNext()) {
            }
            arrayList.add(c4 != 0 ? c4 != 1 ? c4 != 2 ? c4 != 3 ? N9.AD_FORMAT_TYPE_UNSPECIFIED : N9.REWARD_BASED_VIDEO_AD : N9.NATIVE_APP_INSTALL : N9.INTERSTITIAL : N9.BANNER);
        }
    }

    public void m(short s3) {
        ((G1.a) this.f1828u).o(String.valueOf(s3));
    }

    public void n(String value) {
        int i;
        kotlin.jvm.internal.h.e(value, "value");
        G1.a aVar = (G1.a) this.f1828u;
        aVar.c(aVar.f1194u, value.length() + 2);
        char[] cArr = (char[]) aVar.f1195v;
        int i4 = aVar.f1194u;
        int i9 = i4 + 1;
        cArr[i4] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i9);
        int i10 = length + i9;
        int i11 = i9;
        while (i11 < i10) {
            char c4 = cArr[i11];
            byte[] bArr = t.f5803b;
            if (c4 < bArr.length && bArr[c4] != 0) {
                int length2 = value.length();
                for (int i12 = i11 - i9; i12 < length2; i12++) {
                    aVar.c(i11, 2);
                    char charAt = value.charAt(i12);
                    byte[] bArr2 = t.f5803b;
                    if (charAt < bArr2.length) {
                        byte b9 = bArr2[charAt];
                        if (b9 == 0) {
                            i = i11 + 1;
                            ((char[]) aVar.f1195v)[i11] = charAt;
                        } else {
                            if (b9 == 1) {
                                String str = t.f5802a[charAt];
                                kotlin.jvm.internal.h.b(str);
                                aVar.c(i11, str.length());
                                str.getChars(0, str.length(), (char[]) aVar.f1195v, i11);
                                int length3 = str.length() + i11;
                                aVar.f1194u = length3;
                                i11 = length3;
                            } else {
                                char[] cArr2 = (char[]) aVar.f1195v;
                                cArr2[i11] = '\\';
                                cArr2[i11 + 1] = (char) b9;
                                i11 += 2;
                                aVar.f1194u = i11;
                            }
                        }
                    } else {
                        i = i11 + 1;
                        ((char[]) aVar.f1195v)[i11] = charAt;
                    }
                    i11 = i;
                }
                aVar.c(i11, 1);
                ((char[]) aVar.f1195v)[i11] = '\"';
                aVar.f1194u = i11 + 1;
                return;
            }
            i11++;
        }
        cArr[i10] = '\"';
        aVar.f1194u = i10 + 1;
    }

    public synchronized void o(x xVar, boolean z8) {
        try {
            if (!this.f1827n && !z8) {
                this.f1827n = true;
                xVar.a();
                this.f1827n = false;
            }
            ((Handler) this.f1828u).obtainMessage(1, xVar).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        int i = C.f40822b;
        u2.i.c("Failed to get signals bundle");
    }

    public void s() {
        boolean z8 = this.f1827n;
        String a9 = I5.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
        if (z8) {
            return;
        }
        try {
            HashMap hashMap = X5.f28604a;
            C3398j5 c3398j5 = new C3398j5(4);
            c3398j5.h(K5.f25918n, C3020c6.f(F5.f24917s));
            c3398j5.h(K5.f25926u, T2.n(0L));
            c3398j5.h(K5.f25928v, T2.n(1L));
            c3398j5.h(K5.f25930w, T2.n(2L));
            c3398j5.h(K5.f25932x, T2.n(3L));
            c3398j5.h(K5.f25934y, T2.n(4L));
            c3398j5.h(K5.f25936z, T2.n(7L));
            c3398j5.h(K5.f25875A, T2.n(-1L));
            c3398j5.h(K5.f25877B, T2.n(-2L));
            c3398j5.h(K5.f25879C, C3020c6.f(E5.f24640b));
            c3398j5.h(K5.f25880D, C3020c6.f(E5.f24642d));
            c3398j5.h(K5.f25882E, C3020c6.f(E5.f24647j));
            c3398j5.h(K5.f25884F, C3020c6.f(E5.f24648k));
            c3398j5.h(K5.f25886G, C3020c6.f(E5.f24651n));
            c3398j5.h(K5.f25888H, C3020c6.f(F5.f24912n));
            c3398j5.h(K5.f25890I, C3020c6.f(E5.f24644f));
            c3398j5.h(K5.J, C3020c6.f(E5.f24645g));
            c3398j5.h(K5.f25893K, C3020c6.f(E5.f24646h));
            c3398j5.h(K5.f25895L, C3020c6.f(E5.i));
            c3398j5.h(K5.f25897M, C3020c6.f(F5.f24907h));
            c3398j5.h(K5.f25899N, C3020c6.f(F5.f24908j));
            c3398j5.h(K5.f25903P, C3020c6.f(E5.f24652o));
            c3398j5.h(K5.f25905Q, C3020c6.f(E5.f24653p));
            c3398j5.h(K5.f25907R, C3020c6.f(E5.f24656s));
            c3398j5.h(K5.f25909S, C3020c6.f(E5.f24657t));
            c3398j5.h(K5.f25911T, C3020c6.f(E5.f24658u));
            c3398j5.h(K5.f25913U, C3020c6.f(E5.f24659v));
            c3398j5.h(K5.f25914V, C3020c6.f(F5.f24901b));
            c3398j5.h(K5.f25915W, C3020c6.f(F5.f24903d));
            c3398j5.h(K5.f25916X, C3020c6.f(F5.f24904e));
            c3398j5.h(K5.Y, C3020c6.f(F5.f24905f));
            c3398j5.h(K5.f25917Z, C3020c6.f(F5.f24909k));
            c3398j5.h(K5.f25919n0, C3020c6.f(F5.f24910l));
            c3398j5.h(K5.f25920o0, C3020c6.f(F5.f24914p));
            c3398j5.h(K5.f25921p0, C3020c6.f(F5.f24915q));
            c3398j5.h(K5.f25922q0, C3020c6.f(F5.f24919u));
            c3398j5.h(K5.f25923r0, C3020c6.f(F5.f24920v));
            c3398j5.h(K5.f25924s0, C3020c6.f(H5.f25288b));
            c3398j5.h(K5.f25925t0, C3020c6.f(H5.f25290d));
            c3398j5.h(K5.f25876A0, C3020c6.f(H5.f25291e));
            c3398j5.h(K5.f25927u0, C3020c6.f(H5.f25295j));
            c3398j5.h(K5.f25929v0, C3020c6.f(H5.f25296k));
            c3398j5.h(K5.f25931w0, C3020c6.f(H5.f25299n));
            c3398j5.h(K5.f25933x0, C3020c6.f(H5.f25302q));
            c3398j5.h(K5.f25935y0, C3020c6.f(E5.f24654q));
            c3398j5.h(K5.f25937z0, C3020c6.f(H5.f25297l));
            c3398j5.h(K5.f25878B0, C3020c6.f(E5.f24649l));
            c3398j5.h(K5.C0, C3020c6.f(H5.f25293g));
            c3398j5.h(K5.f25881D0, C3020c6.f(H5.f25294h));
            c3398j5.h(K5.f25901O, C3020c6.f(F5.i));
            c3398j5.h(K5.f25883E0, C3020c6.f(H5.f25301p));
            c3398j5.h(K5.f25885F0, C3020c6.f(F5.f24911m));
            c3398j5.h(K5.f25887G0, C3020c6.f(H5.f25300o));
            c3398j5.h(K5.f25889H0, C3020c6.f(F5.f24902c));
            c3398j5.h(K5.f25891I0, C3020c6.f(H5.f25289c));
            c3398j5.h(K5.f25892J0, C3020c6.f(E5.f24655r));
            c3398j5.h(K5.f25894K0, C3020c6.f(H5.f25298m));
            c3398j5.h(K5.f25896L0, C3020c6.f(E5.f24643e));
            c3398j5.h(K5.f25898M0, C3020c6.f(H5.f25292f));
            c3398j5.h(K5.f25900N0, C3020c6.f(F5.f24918t));
            c3398j5.h(K5.f25902O0, C3020c6.f(E5.f24641c));
            c3398j5.h(K5.f25904P0, C3020c6.f(H5.i));
            c3398j5.h(K5.f25906Q0, C3020c6.f(F5.f24913o));
            c3398j5.h(K5.f25908R0, C3020c6.f(E5.f24650m));
            c3398j5.h(K5.f25910S0, C3020c6.f(F5.f24916r));
            c3398j5.h(K5.f25912T0, C3020c6.f(F5.f24906g));
            C3944tC s3 = c3398j5.s(true);
            long j9 = -1;
            while (true) {
                Y5 y52 = (Y5) this.f1828u;
                if (j9 < -82) {
                    for (int i = 82; i < 1159; i++) {
                        y52.f28787a.b(C3020c6.a(null));
                    }
                    this.f1827n = true;
                    return;
                }
                K5 k52 = (K5) hashMap.get(Long.valueOf(j9));
                if (k52 == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 36);
                    sb.append(a9);
                    sb.append(j9);
                    throw new B0.c(sb.toString());
                }
                y52.f28787a.b((C3020c6) s3.get(k52));
                j9--;
            }
        } catch (U5 e6) {
            throw new B5(A5.f23822u, e6);
        }
    }

    public void t(int i) {
        PA.T(!this.f1827n);
        ((SparseBooleanArray) this.f1828u).append(i, true);
    }

    public C3526lP u() {
        PA.T(!this.f1827n);
        this.f1827n = true;
        return new C3526lP((SparseBooleanArray) this.f1828u);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0434 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03fd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(Optional optional) {
        char c4;
        long j9;
        Object obj;
        EnumC4261z5 enumC4261z5;
        Object of;
        Optional optional2;
        long j10;
        try {
            try {
                boolean z8 = this.f1827n;
                Y5 y52 = (Y5) this.f1828u;
                if (z8) {
                    c4 = 0;
                    j9 = 2;
                    obj = null;
                } else {
                    String a9 = I5.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
                    try {
                        HashMap hashMap = X5.f28604a;
                        C3398j5 c3398j5 = new C3398j5(7, false);
                        c4 = 0;
                        c3398j5.h(K5.f25918n, C3020c6.f(F5.f24917s));
                        c3398j5.h(K5.f25926u, T2.n(0L));
                        c3398j5.h(K5.f25928v, T2.n(1L));
                        c3398j5.h(K5.f25930w, T2.n(2L));
                        c3398j5.h(K5.f25932x, T2.n(3L));
                        c3398j5.h(K5.f25934y, T2.n(4L));
                        c3398j5.h(K5.f25936z, T2.n(7L));
                        j9 = 2;
                        c3398j5.h(K5.f25875A, T2.n(-1L));
                        c3398j5.h(K5.f25877B, T2.n(-2L));
                        c3398j5.h(K5.f25879C, C3020c6.f(E5.f24640b));
                        c3398j5.h(K5.f25880D, C3020c6.f(E5.f24642d));
                        c3398j5.h(K5.f25882E, C3020c6.f(E5.f24647j));
                        c3398j5.h(K5.f25884F, C3020c6.f(E5.f24648k));
                        c3398j5.h(K5.f25886G, C3020c6.f(E5.f24651n));
                        c3398j5.h(K5.f25888H, C3020c6.f(F5.f24912n));
                        c3398j5.h(K5.f25890I, C3020c6.f(E5.f24644f));
                        c3398j5.h(K5.J, C3020c6.f(E5.f24645g));
                        c3398j5.h(K5.f25893K, C3020c6.f(E5.f24646h));
                        c3398j5.h(K5.f25895L, C3020c6.f(E5.i));
                        c3398j5.h(K5.f25897M, C3020c6.f(F5.f24907h));
                        c3398j5.h(K5.f25899N, C3020c6.f(F5.f24908j));
                        c3398j5.h(K5.f25903P, C3020c6.f(E5.f24652o));
                        c3398j5.h(K5.f25905Q, C3020c6.f(E5.f24653p));
                        c3398j5.h(K5.f25907R, C3020c6.f(E5.f24656s));
                        c3398j5.h(K5.f25909S, C3020c6.f(E5.f24657t));
                        c3398j5.h(K5.f25911T, C3020c6.f(E5.f24658u));
                        c3398j5.h(K5.f25913U, C3020c6.f(E5.f24659v));
                        c3398j5.h(K5.f25914V, C3020c6.f(F5.f24901b));
                        c3398j5.h(K5.f25915W, C3020c6.f(F5.f24903d));
                        c3398j5.h(K5.f25916X, C3020c6.f(F5.f24904e));
                        c3398j5.h(K5.Y, C3020c6.f(F5.f24905f));
                        c3398j5.h(K5.f25917Z, C3020c6.f(F5.f24909k));
                        c3398j5.h(K5.f25919n0, C3020c6.f(F5.f24910l));
                        c3398j5.h(K5.f25920o0, C3020c6.f(F5.f24914p));
                        c3398j5.h(K5.f25921p0, C3020c6.f(F5.f24915q));
                        c3398j5.h(K5.f25922q0, C3020c6.f(F5.f24919u));
                        c3398j5.h(K5.f25923r0, C3020c6.f(F5.f24920v));
                        c3398j5.h(K5.f25924s0, C3020c6.f(H5.f25288b));
                        c3398j5.h(K5.f25925t0, C3020c6.f(H5.f25290d));
                        c3398j5.h(K5.f25876A0, C3020c6.f(H5.f25291e));
                        c3398j5.h(K5.f25927u0, C3020c6.f(H5.f25295j));
                        c3398j5.h(K5.f25929v0, C3020c6.f(H5.f25296k));
                        c3398j5.h(K5.f25931w0, C3020c6.f(H5.f25299n));
                        c3398j5.h(K5.f25933x0, C3020c6.f(H5.f25302q));
                        c3398j5.h(K5.f25935y0, C3020c6.f(E5.f24654q));
                        c3398j5.h(K5.f25937z0, C3020c6.f(H5.f25297l));
                        c3398j5.h(K5.f25878B0, C3020c6.f(E5.f24649l));
                        c3398j5.h(K5.C0, C3020c6.f(H5.f25293g));
                        c3398j5.h(K5.f25881D0, C3020c6.f(H5.f25294h));
                        c3398j5.h(K5.f25901O, C3020c6.f(F5.i));
                        c3398j5.h(K5.f25883E0, C3020c6.f(H5.f25301p));
                        c3398j5.h(K5.f25885F0, C3020c6.f(F5.f24911m));
                        c3398j5.h(K5.f25887G0, C3020c6.f(H5.f25300o));
                        c3398j5.h(K5.f25889H0, C3020c6.f(F5.f24902c));
                        c3398j5.h(K5.f25891I0, C3020c6.f(H5.f25289c));
                        c3398j5.h(K5.f25892J0, C3020c6.f(E5.f24655r));
                        c3398j5.h(K5.f25894K0, C3020c6.f(H5.f25298m));
                        c3398j5.h(K5.f25896L0, C3020c6.f(E5.f24643e));
                        c3398j5.h(K5.f25898M0, C3020c6.f(H5.f25292f));
                        c3398j5.h(K5.f25900N0, C3020c6.f(F5.f24918t));
                        c3398j5.h(K5.f25902O0, C3020c6.f(E5.f24641c));
                        c3398j5.h(K5.f25904P0, C3020c6.f(H5.i));
                        c3398j5.h(K5.f25906Q0, C3020c6.f(F5.f24913o));
                        c3398j5.h(K5.f25908R0, C3020c6.f(E5.f24650m));
                        c3398j5.h(K5.f25910S0, C3020c6.f(F5.f24916r));
                        c3398j5.h(K5.f25912T0, C3020c6.f(F5.f24906g));
                        C3944tC p6 = c3398j5.p();
                        for (long j11 = -1; j11 >= -82; j11--) {
                            K5 k52 = (K5) hashMap.get(Long.valueOf(j11));
                            if (k52 == null) {
                                StringBuilder sb = new StringBuilder(String.valueOf(j11).length() + 36);
                                sb.append(a9);
                                sb.append(j11);
                                throw new B0.c(sb.toString());
                            }
                            y52.f28787a.b((C3020c6) p6.get(k52));
                        }
                        obj = null;
                        for (int i = 82; i < 1159; i++) {
                            y52.f28787a.b(C3020c6.a(null));
                        }
                        this.f1827n = true;
                    } catch (U5 e6) {
                        throw new B5(A5.f23822u, e6);
                    }
                }
                O5 o52 = y52.f28789c;
                try {
                    o52.a(0L);
                    o52.f26650v = new T2(21);
                    String a10 = I5.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo");
                    String a11 = I5.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=");
                    O5 o53 = y52.f28789c;
                    try {
                        int f6 = o53.f();
                        int i4 = ((f6 & 65535) << 16) >> 16;
                        int i9 = (((f6 >> 16) & 65535) << 16) >> 16;
                        if (i4 != -14426) {
                            throw new C4207y5(a10.concat(String.format(I5.a("e1Hk+x0="), Short.valueOf((short) i4))));
                        }
                        if (i9 != 5) {
                            throw new C4207y5(a11.concat(String.format(I5.a("e1Hk+x0="), Short.valueOf((short) i9))));
                        }
                        String a12 = I5.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1");
                        try {
                            int f9 = o53.f();
                            if (f9 != 1182321202) {
                                throw new C4207y5(a12.concat(String.format(I5.a("e1Hk9x0="), Integer.valueOf(f9))));
                            }
                            try {
                                int[] iArr = {o53.f()};
                                int[] iArr2 = AbstractC4153x5.f35125a;
                                T2 t22 = (T2) o53.f26651w;
                                int i10 = iArr[c4];
                                t22.getClass();
                                o53.f26650v = new C3398j5(new G1.a(i10, 7, iArr2));
                                try {
                                    o53.a(96L);
                                    C3675oC c3675oC = C5.f24141a;
                                    Optional.empty();
                                    optional.isPresent();
                                    C3020c6 a13 = C3020c6.a(obj);
                                    V5 v52 = y52.f28787a;
                                    v52.b(a13);
                                    v52.b(C3020c6.a(obj));
                                    C3761pr c3761pr = y52.f28788b;
                                    c3761pr.z(0L, 0L, v52.f28211b);
                                    while (!((ArrayDeque) c3761pr.f33523u).isEmpty()) {
                                        long c9 = o53.c();
                                        try {
                                            try {
                                                try {
                                                } catch (C2911a6 unused) {
                                                    enumC4261z5 = EnumC4261z5.f35475w;
                                                }
                                            } catch (T5 unused2) {
                                                enumC4261z5 = EnumC4261z5.f35474v;
                                            }
                                        } catch (N5 unused3) {
                                            enumC4261z5 = EnumC4261z5.f35457O;
                                        }
                                        try {
                                            of = v52.d(o53.e()).p().apply(y52);
                                        } catch (Throwable unused4) {
                                            enumC4261z5 = EnumC4261z5.f35458P;
                                            of = Optional.of(enumC4261z5);
                                            optional2 = (Optional) of;
                                            if (optional2.isPresent()) {
                                            }
                                        }
                                        optional2 = (Optional) of;
                                        if (optional2.isPresent()) {
                                            if (!C5.f24141a.contains(optional2.get())) {
                                                throw new B5(A5.f23820A, (EnumC4261z5) optional2.get(), c9);
                                            }
                                            Object obj2 = optional2.get();
                                            long c10 = o53.c();
                                            do {
                                                try {
                                                    j10 = y52.f28788b.E().f27117c;
                                                    Optional a14 = y52.a();
                                                    if (a14.isPresent() && a14.get() == EnumC4261z5.f35459Q) {
                                                        throw new B5(A5.f23820A, (EnumC4261z5) obj2, c10);
                                                    }
                                                    if (a14.isPresent()) {
                                                        throw new B5(A5.f23820A, (EnumC4261z5) a14.get(), c10);
                                                    }
                                                } catch (S5 unused5) {
                                                    throw new B5(A5.f23820A, (EnumC4261z5) obj2, c10);
                                                }
                                            } while (j10 != j9);
                                        }
                                    }
                                    try {
                                        C3020c6 c11 = v52.c();
                                        v52.c();
                                        return c11.h();
                                    } catch (T5 e9) {
                                        throw new B5(A5.f23826y, e9);
                                    } catch (C2911a6 e10) {
                                        throw new B5(A5.f23827z, e10);
                                    }
                                } catch (M5 e11) {
                                    e = e11;
                                    throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
                                } catch (N5 e12) {
                                    e = e12;
                                    throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
                                }
                            } catch (N5 e13) {
                                throw new B5(A5.f23825x, e13);
                            }
                        } catch (N5 e14) {
                            throw new C4207y5(I5.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e14);
                        }
                    } catch (N5 e15) {
                        throw new C4207y5(I5.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e15);
                    }
                } catch (M5 e16) {
                    e = e16;
                    throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
                } catch (N5 e17) {
                    e = e17;
                    throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
                }
            } catch (R5 e18) {
                throw new B5(A5.f23824w, e18);
            }
        } catch (U5 e19) {
            throw new B5(A5.f23823v, e19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(long j9, Optional optional) {
        EnumC4261z5 enumC4261z5;
        Object obj;
        Optional optional2;
        char c4 = 7;
        int i = 9;
        boolean z8 = false;
        boolean z9 = false;
        Y5 y52 = (Y5) this.f1828u;
        try {
            if (!this.f1827n) {
                s();
            }
            O5 o52 = y52.f28789c;
            try {
                o52.a(0L);
                o52.f26650v = new T2(z9 ? 1 : 0);
                O5 o53 = y52.f28789c;
                try {
                    int f6 = o53.f();
                    int i4 = ((f6 & 65535) << 16) >> 16;
                    int i9 = (((f6 >> 16) & 65535) << 16) >> 16;
                    if (i4 != -14426) {
                        throw new C4207y5(I5.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo").concat(String.format(I5.a("e1Hk+x0="), Short.valueOf((short) i4))));
                    }
                    if (i9 != 5) {
                        throw new C4207y5(I5.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=").concat(String.format(I5.a("e1Hk+x0="), Short.valueOf((short) i9))));
                    }
                    int[] iArr = {171029949, 1356422403, 1913211838, 215266853, 506454572, 1309457854, 56236614, 1696779465, 30245415};
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    int g9 = com.anythink.basead.b.c.i.g(((~i10) & i11) | iArr[2], (i10 & iArr[3]) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % 30245415);
                    try {
                        int f9 = o53.f();
                        if (f9 != g9) {
                            throw new C4207y5(I5.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1").concat(String.format(I5.a("e1Hk9x0="), Integer.valueOf(f9))));
                        }
                        try {
                            int[] iArr2 = {o53.f()};
                            int[] iArr3 = AbstractC4153x5.f35125a;
                            T2 t22 = (T2) o53.f26651w;
                            int i12 = iArr2[0];
                            t22.getClass();
                            o53.f26650v = new C3398j5(new G1.a(i12, 7, iArr3));
                            try {
                                o53.a(j9);
                                C3675oC c3675oC = C5.f24141a;
                                Optional.empty();
                                Object a9 = true != optional.isPresent() ? C3020c6.a(null) : optional.get();
                                C3020c6 g10 = a9 instanceof C3020c6 ? (C3020c6) a9 : C3020c6.g(a9);
                                V5 v52 = y52.f28787a;
                                v52.b(g10);
                                v52.b(C3020c6.a(null));
                                C3761pr c3761pr = y52.f28788b;
                                c3761pr.z(0L, 0L, v52.f28211b);
                                while (!((ArrayDeque) c3761pr.f33523u).isEmpty()) {
                                    long c9 = o53.c();
                                    char c10 = c4;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    obj = v52.d(o53.e()).p().apply(y52);
                                                } catch (Throwable unused) {
                                                    enumC4261z5 = EnumC4261z5.f35458P;
                                                    obj = Optional.of(enumC4261z5);
                                                    optional2 = (Optional) obj;
                                                    if (optional2.isPresent()) {
                                                    }
                                                }
                                            } catch (C2911a6 unused2) {
                                                enumC4261z5 = EnumC4261z5.f35475w;
                                            }
                                        } catch (T5 unused3) {
                                            enumC4261z5 = EnumC4261z5.f35474v;
                                        }
                                    } catch (N5 unused4) {
                                        enumC4261z5 = EnumC4261z5.f35457O;
                                    }
                                    optional2 = (Optional) obj;
                                    if (optional2.isPresent()) {
                                        c4 = c10;
                                    } else {
                                        if (!C5.f24141a.contains(optional2.get())) {
                                            throw new B5(A5.f23820A, (EnumC4261z5) optional2.get(), c9);
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
                                        long j10 = jArr[z8 ? 1 : 0];
                                        long j11 = jArr[1];
                                        long j12 = jArr[2];
                                        long j13 = jArr[3];
                                        long j14 = jArr[4];
                                        long j15 = jArr[5];
                                        long j16 = jArr[6];
                                        long j17 = jArr[c10];
                                        V5 v53 = v52;
                                        long j18 = (((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + j16;
                                        long j19 = j17 % 988992210;
                                        long c11 = o53.c();
                                        while (true) {
                                            try {
                                                C3761pr c3761pr2 = c3761pr;
                                                long j20 = y52.f28788b.E().f27117c;
                                                Optional a10 = y52.a();
                                                if (a10.isPresent() && a10.get() == EnumC4261z5.f35459Q) {
                                                    throw new B5(A5.f23820A, (EnumC4261z5) obj2, c11);
                                                }
                                                if (a10.isPresent()) {
                                                    throw new B5(A5.f23820A, (EnumC4261z5) a10.get(), c11);
                                                }
                                                if (j20 == (j18 ^ j19)) {
                                                    v52 = v53;
                                                    c4 = c10;
                                                    c3761pr = c3761pr2;
                                                    i = 9;
                                                    z8 = false;
                                                    break;
                                                }
                                                c3761pr = c3761pr2;
                                            } catch (S5 unused5) {
                                                throw new B5(A5.f23820A, (EnumC4261z5) obj2, c11);
                                            }
                                        }
                                    }
                                }
                                V5 v54 = v52;
                                try {
                                    C3020c6 c12 = v54.c();
                                    v54.c();
                                    return c12.h();
                                } catch (T5 e6) {
                                    throw new B5(A5.f23826y, e6);
                                } catch (C2911a6 e9) {
                                    throw new B5(A5.f23827z, e9);
                                }
                            } catch (M5 e10) {
                                e = e10;
                                throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
                            } catch (N5 e11) {
                                e = e11;
                                throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
                            }
                        } catch (N5 e12) {
                            throw new B5(A5.f23825x, e12);
                        }
                    } catch (N5 e13) {
                        throw new C4207y5(I5.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), (Throwable) e13);
                    }
                } catch (N5 e14) {
                    throw new C4207y5(I5.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), (Throwable) e14);
                }
            } catch (M5 e15) {
                e = e15;
                throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
            } catch (N5 e16) {
                e = e16;
                throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
            }
        } catch (R5 e17) {
            throw new B5(A5.f23824w, e17);
        } catch (U5 e18) {
            throw new B5(A5.f23823v, e18);
        }
    }

    public /* synthetic */ h(Object obj) {
        this.f1828u = obj;
    }

    public /* synthetic */ h(Object obj, boolean z8) {
        this.f1827n = z8;
        this.f1828u = obj;
    }

    public h(G1.a aVar) {
        this.f1828u = aVar;
        this.f1827n = true;
    }

    public h(g gVar, boolean z8) {
        this(gVar);
        this.f1827n = z8;
    }

    public void p() {
    }

    public void r() {
    }
}
