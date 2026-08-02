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
import com.IceFishing.LiveIceFishing.k;
import com.google.android.gms.internal.ads.A5;
import com.google.android.gms.internal.ads.AbstractC2792Sd;
import com.google.android.gms.internal.ads.AbstractC2927a6;
import com.google.android.gms.internal.ads.AbstractC4271z5;
import com.google.android.gms.internal.ads.B5;
import com.google.android.gms.internal.ads.C2753Pp;
import com.google.android.gms.internal.ads.C2948aa;
import com.google.android.gms.internal.ads.C2981b6;
import com.google.android.gms.internal.ads.C3088d6;
import com.google.android.gms.internal.ads.C3091d9;
import com.google.android.gms.internal.ads.C3249g6;
import com.google.android.gms.internal.ads.C3306h9;
import com.google.android.gms.internal.ads.C3318hL;
import com.google.android.gms.internal.ads.C3360i9;
import com.google.android.gms.internal.ads.C3504ku;
import com.google.android.gms.internal.ads.C3516l5;
import com.google.android.gms.internal.ads.C3520l9;
import com.google.android.gms.internal.ads.C3523lC;
import com.google.android.gms.internal.ads.C3574m9;
import com.google.android.gms.internal.ads.C3682o9;
import com.google.android.gms.internal.ads.C3717or;
import com.google.android.gms.internal.ads.C3793qC;
import com.google.android.gms.internal.ads.C4005u9;
import com.google.android.gms.internal.ads.C4059v9;
import com.google.android.gms.internal.ads.C5;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.EnumC3628n9;
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
import g8.s;
import h.C4544H;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import l.m;
import l.x;
import m.C4700g;
import m.C4708k;
import r2.C4906k;
import w1.w;
import w2.C5140B;
import w2.z;
import x2.C5189a;

/* loaded from: classes.dex */
public class h implements f3.c, KD, Eu, x {

    /* renamed from: n, reason: collision with root package name */
    public boolean f1806n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1807u;

    public h(int i) {
        switch (i) {
            case 5:
                this.f1807u = new SparseBooleanArray();
                break;
            case 9:
                this.f1807u = new Handler(Looper.getMainLooper(), new I3.a(1));
                break;
            default:
                Y5 y52 = new Y5();
                V2 v22 = new V2(22);
                R5 r52 = new R5(M5.f27036b, 0, new V2(false));
                r52.f27931w = v22;
                this.f1807u = new C2981b6(y52, r52);
                this.f1806n = false;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object a(Object obj) {
        long j6;
        C3504ku c3504ku = (C3504ku) this.f1807u;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f1806n) {
            ((Context) c3504ku.f32445u).deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(C3520l9.P(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (C3318hL e9) {
                int i = z.f41712b;
                x2.i.c("Unable to deserialize proto from offline signals database:");
                x2.i.c(e9.getMessage());
            }
        }
        query.close();
        Context context = (Context) c3504ku.f32445u;
        C3574m9 A9 = C3682o9.A();
        String packageName = context.getPackageName();
        A9.h();
        ((C3682o9) A9.f28504u).F(packageName);
        String str = Build.MODEL;
        A9.h();
        ((C3682o9) A9.f28504u).G();
        int w3 = SK.w(sQLiteDatabase, 0);
        A9.h();
        ((C3682o9) A9.f28504u).C(w3);
        A9.h();
        ((C3682o9) A9.f28504u).B(arrayList);
        int w6 = SK.w(sQLiteDatabase, 1);
        A9.h();
        ((C3682o9) A9.f28504u).D(w6);
        int w9 = SK.w(sQLiteDatabase, 3);
        A9.h();
        ((C3682o9) A9.f28504u).I(w9);
        C4906k.f40186C.f40198k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        A9.h();
        ((C3682o9) A9.f28504u).E(currentTimeMillis);
        Cursor M8 = SK.M(sQLiteDatabase, 2);
        if (M8.getCount() > 0) {
            M8.moveToNext();
            j6 = M8.getLong(M8.getColumnIndexOrThrow("value"));
        } else {
            j6 = 0;
        }
        M8.close();
        A9.h();
        ((C3682o9) A9.f28504u).H(j6);
        C3682o9 c3682o9 = (C3682o9) A9.j();
        int size = arrayList.size();
        long j9 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C3520l9 c3520l9 = (C3520l9) arrayList.get(i4);
            if (c3520l9.O() == 2 && c3520l9.N() > j9) {
                j9 = c3520l9.N();
            }
        }
        if (j9 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j9));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        C3091d9 c3091d9 = (C3091d9) c3504ku.f32446v;
        synchronized (c3091d9) {
            if (c3091d9.f30488c) {
                try {
                    Z9 z9 = c3091d9.f30487b;
                    z9.h();
                    ((C2948aa) z9.f28504u).I(c3682o9);
                } catch (NullPointerException e10) {
                    C4906k.f40186C.f40196h.d("AdMobClearcutLogger.modify", e10);
                }
            }
            C5189a c5189a = (C5189a) c3504ku.f32447w;
            C4005u9 B3 = C4059v9.B();
            int i6 = c5189a.f41846u;
            B3.h();
            ((C4059v9) B3.f28504u).C(i6);
            int i9 = c5189a.f41847v;
            B3.h();
            ((C4059v9) B3.f28504u).D(i9);
            int i10 = true != c5189a.f41848w ? 2 : 0;
            B3.h();
            ((C4059v9) B3.f28504u).A(i10);
            C4059v9 c4059v9 = (C4059v9) B3.j();
            synchronized (c3091d9) {
                if (c3091d9.f30488c) {
                    try {
                        Z9 z92 = c3091d9.f30487b;
                        W9 w92 = (W9) ((C2948aa) z92.f28504u).A().s();
                        w92.h();
                        ((X9) w92.f28504u).C(c4059v9);
                        z92.h();
                        ((C2948aa) z92.f28504u).G((X9) w92.j());
                    } catch (NullPointerException e11) {
                        C4906k.f40186C.f40196h.d("AdMobClearcutLogger.modify", e11);
                    }
                }
            }
        }
        c3091d9.b(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        SK.P(sQLiteDatabase, "failed_requests");
        SK.P(sQLiteDatabase, "total_requests");
        SK.P(sQLiteDatabase, "completed_requests");
        return null;
    }

    @Override // l.x
    public void b(m mVar, boolean z6) {
        C4708k c4708k;
        if (this.f1806n) {
            return;
        }
        this.f1806n = true;
        C4544H c4544h = (C4544H) this.f1807u;
        ActionMenuView actionMenuView = c4544h.f37844a.f39151a.f4579n;
        if (actionMenuView != null && (c4708k = actionMenuView.f4530M) != null) {
            c4708k.f();
            C4700g c4700g = c4708k.f39237M;
            if (c4700g != null && c4700g.b()) {
                c4700g.i.dismiss();
            }
        }
        c4544h.f37845b.onPanelClosed(108, mVar);
        this.f1806n = false;
    }

    @Override // f3.c
    public Object c() {
        return HsdpDeepLinkServiceFactory.lambda$createInternal$0((Context) this.f1807u, this.f1806n);
    }

    public boolean d() {
        return this.f1806n;
    }

    @Override // l.x
    public boolean e(m mVar) {
        ((C4544H) this.f1807u).f37845b.onMenuOpened(108, mVar);
        return true;
    }

    public boolean f(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((g) this.f1807u) == null) {
            return d();
        }
        char c9 = 2;
        for (int i4 = 0; i4 < i && c9 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            h hVar = i.f1808a;
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

    public void g() {
        this.f1806n = false;
    }

    public void h(byte b9) {
        ((I1.a) this.f1807u).p(String.valueOf(b9));
    }

    public void i(char c9) {
        I1.a aVar = (I1.a) this.f1807u;
        aVar.c(aVar.f1303u, 1);
        char[] cArr = (char[]) aVar.f1304v;
        int i = aVar.f1303u;
        aVar.f1303u = i + 1;
        cArr[i] = c9;
    }

    public void j(int i) {
        ((I1.a) this.f1807u).p(String.valueOf(i));
    }

    public void k(long j6) {
        ((I1.a) this.f1807u).p(String.valueOf(j6));
    }

    public void l(String v9) {
        kotlin.jvm.internal.h.e(v9, "v");
        ((I1.a) this.f1807u).p(v9);
    }

    public void m(short s9) {
        ((I1.a) this.f1807u).p(String.valueOf(s9));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
    
        if (r2.equals(com.anythink.expressad.foundation.g.a.f.f19910e) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo10n(Object obj) {
        List list;
        List asList;
        ArrayList arrayList;
        Iterator it;
        char c9;
        Bundle bundle = (Bundle) obj;
        C2753Pp c2753Pp = (C2753Pp) this.f1807u;
        if (((C5140B) c2753Pp.f256u).t()) {
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
                    EnumC3628n9 enumC3628n9 = (EnumC3628n9) C2753Pp.f27653B.get(MA.b("network", MA.b("device", bundle)).getInt("active_network_state", -1), EnumC3628n9.UNSPECIFIED);
                    C3306h9 A9 = C3360i9.A();
                    int i4 = bundle.getInt("cnt", -2);
                    int i6 = bundle.getInt("gnt", 0);
                    if (i4 == -1) {
                        c2753Pp.f27654A = 2;
                    } else {
                        c2753Pp.f27654A = 1;
                        if (i4 == 0) {
                            A9.h();
                            ((C3360i9) A9.f28504u).B(2);
                        } else if (i4 != 1) {
                            A9.h();
                            ((C3360i9) A9.f28504u).B(1);
                        } else {
                            A9.h();
                            ((C3360i9) A9.f28504u).B(3);
                        }
                        switch (i6) {
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
                        ((C3360i9) A9.f28504u).C(i);
                    }
                    ((S0.e) c2753Pp.f257v).E(new Xw(this, this.f1806n, arrayList, (C3360i9) A9.j(), enumC3628n9));
                    return;
                }
                String str = (String) it.next();
                switch (str.hashCode()) {
                    case -1396342996:
                        break;
                    case -1052618729:
                        if (str.equals(com.anythink.expressad.foundation.g.a.f.f19906a)) {
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
                        if (str.equals(com.anythink.expressad.foundation.g.a.f.f19909d)) {
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
            int i9 = 3;
            c9 = 0;
            if (it.hasNext()) {
            }
            arrayList.add(c9 != 0 ? c9 != 1 ? c9 != 2 ? c9 != 3 ? Q9.AD_FORMAT_TYPE_UNSPECIFIED : Q9.REWARD_BASED_VIDEO_AD : Q9.NATIVE_APP_INSTALL : Q9.INTERSTITIAL : Q9.BANNER);
        }
    }

    public void o(String value) {
        int i;
        kotlin.jvm.internal.h.e(value, "value");
        I1.a aVar = (I1.a) this.f1807u;
        aVar.c(aVar.f1303u, value.length() + 2);
        char[] cArr = (char[]) aVar.f1304v;
        int i4 = aVar.f1303u;
        int i6 = i4 + 1;
        cArr[i4] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i6);
        int i9 = length + i6;
        int i10 = i6;
        while (i10 < i9) {
            char c9 = cArr[i10];
            byte[] bArr = s.f37771b;
            if (c9 < bArr.length && bArr[c9] != 0) {
                int length2 = value.length();
                for (int i11 = i10 - i6; i11 < length2; i11++) {
                    aVar.c(i10, 2);
                    char charAt = value.charAt(i11);
                    byte[] bArr2 = s.f37771b;
                    if (charAt < bArr2.length) {
                        byte b9 = bArr2[charAt];
                        if (b9 == 0) {
                            i = i10 + 1;
                            ((char[]) aVar.f1304v)[i10] = charAt;
                        } else {
                            if (b9 == 1) {
                                String str = s.f37770a[charAt];
                                kotlin.jvm.internal.h.b(str);
                                aVar.c(i10, str.length());
                                str.getChars(0, str.length(), (char[]) aVar.f1304v, i10);
                                int length3 = str.length() + i10;
                                aVar.f1303u = length3;
                                i10 = length3;
                            } else {
                                char[] cArr2 = (char[]) aVar.f1304v;
                                cArr2[i10] = '\\';
                                cArr2[i10 + 1] = (char) b9;
                                i10 += 2;
                                aVar.f1303u = i10;
                            }
                        }
                    } else {
                        i = i10 + 1;
                        ((char[]) aVar.f1304v)[i10] = charAt;
                    }
                    i10 = i;
                }
                aVar.c(i10, 1);
                ((char[]) aVar.f1304v)[i10] = '\"';
                aVar.f1303u = i10 + 1;
                return;
            }
            i10++;
        }
        cArr[i9] = '\"';
        aVar.f1303u = i9 + 1;
    }

    public synchronized void p(w wVar, boolean z6) {
        try {
            if (!this.f1806n && !z6) {
                this.f1806n = true;
                wVar.a();
                this.f1806n = false;
            }
            ((Handler) this.f1807u).obtainMessage(1, wVar).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void s() {
        boolean z6 = this.f1806n;
        String a9 = L5.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
        if (z6) {
            return;
        }
        try {
            HashMap hashMap = AbstractC2927a6.f29795a;
            C3516l5 c3516l5 = new C3516l5(4);
            c3516l5.e(N5.f27233n, C3249g6.f(H5.f26003s));
            c3516l5.e(N5.f27241u, V2.n(0L));
            c3516l5.e(N5.f27243v, V2.n(1L));
            c3516l5.e(N5.f27245w, V2.n(2L));
            c3516l5.e(N5.f27247x, V2.n(3L));
            c3516l5.e(N5.f27249y, V2.n(4L));
            c3516l5.e(N5.f27251z, V2.n(7L));
            c3516l5.e(N5.f27191A, V2.n(-1L));
            c3516l5.e(N5.f27193B, V2.n(-2L));
            c3516l5.e(N5.f27195C, C3249g6.f(G5.f25705b));
            c3516l5.e(N5.f27196D, C3249g6.f(G5.f25707d));
            c3516l5.e(N5.f27198E, C3249g6.f(G5.f25712j));
            c3516l5.e(N5.f27200F, C3249g6.f(G5.f25713k));
            c3516l5.e(N5.f27202G, C3249g6.f(G5.f25716n));
            c3516l5.e(N5.f27204H, C3249g6.f(H5.f25998n));
            c3516l5.e(N5.f27206I, C3249g6.f(G5.f25709f));
            c3516l5.e(N5.J, C3249g6.f(G5.f25710g));
            c3516l5.e(N5.f27209K, C3249g6.f(G5.f25711h));
            c3516l5.e(N5.f27211L, C3249g6.f(G5.i));
            c3516l5.e(N5.f27213M, C3249g6.f(H5.f25993h));
            c3516l5.e(N5.f27215N, C3249g6.f(H5.f25994j));
            c3516l5.e(N5.f27219P, C3249g6.f(G5.f25717o));
            c3516l5.e(N5.f27220Q, C3249g6.f(G5.f25718p));
            c3516l5.e(N5.f27221R, C3249g6.f(G5.f25721s));
            c3516l5.e(N5.f27222S, C3249g6.f(G5.f25722t));
            c3516l5.e(N5.f27223T, C3249g6.f(G5.f25723u));
            c3516l5.e(N5.f27224U, C3249g6.f(G5.f25724v));
            c3516l5.e(N5.f27225V, C3249g6.f(H5.f25987b));
            c3516l5.e(N5.f27226W, C3249g6.f(H5.f25989d));
            c3516l5.e(N5.f27227X, C3249g6.f(H5.f25990e));
            c3516l5.e(N5.Y, C3249g6.f(H5.f25991f));
            c3516l5.e(N5.f27228Z, C3249g6.f(H5.f25995k));
            c3516l5.e(N5.f27229i0, C3249g6.f(H5.f25996l));
            c3516l5.e(N5.f27230j0, C3249g6.f(H5.f26000p));
            c3516l5.e(N5.f27231k0, C3249g6.f(H5.f26001q));
            c3516l5.e(N5.f27232l0, C3249g6.f(H5.f26005u));
            c3516l5.e(N5.m0, C3249g6.f(H5.f26006v));
            c3516l5.e(N5.f27234n0, C3249g6.f(K5.f26601b));
            c3516l5.e(N5.f27235o0, C3249g6.f(K5.f26603d));
            c3516l5.e(N5.f27244v0, C3249g6.f(K5.f26604e));
            c3516l5.e(N5.f27236p0, C3249g6.f(K5.f26608j));
            c3516l5.e(N5.f27237q0, C3249g6.f(K5.f26609k));
            c3516l5.e(N5.f27238r0, C3249g6.f(K5.f26612n));
            c3516l5.e(N5.f27239s0, C3249g6.f(K5.f26615q));
            c3516l5.e(N5.f27240t0, C3249g6.f(G5.f25719q));
            c3516l5.e(N5.f27242u0, C3249g6.f(K5.f26610l));
            c3516l5.e(N5.f27246w0, C3249g6.f(G5.f25714l));
            c3516l5.e(N5.f27248x0, C3249g6.f(K5.f26606g));
            c3516l5.e(N5.f27250y0, C3249g6.f(K5.f26607h));
            c3516l5.e(N5.f27217O, C3249g6.f(H5.i));
            c3516l5.e(N5.f27252z0, C3249g6.f(K5.f26614p));
            c3516l5.e(N5.f27192A0, C3249g6.f(H5.f25997m));
            c3516l5.e(N5.f27194B0, C3249g6.f(K5.f26613o));
            c3516l5.e(N5.C0, C3249g6.f(H5.f25988c));
            c3516l5.e(N5.f27197D0, C3249g6.f(K5.f26602c));
            c3516l5.e(N5.f27199E0, C3249g6.f(G5.f25720r));
            c3516l5.e(N5.f27201F0, C3249g6.f(K5.f26611m));
            c3516l5.e(N5.f27203G0, C3249g6.f(G5.f25708e));
            c3516l5.e(N5.f27205H0, C3249g6.f(K5.f26605f));
            c3516l5.e(N5.f27207I0, C3249g6.f(H5.f26004t));
            c3516l5.e(N5.f27208J0, C3249g6.f(G5.f25706c));
            c3516l5.e(N5.f27210K0, C3249g6.f(K5.i));
            c3516l5.e(N5.f27212L0, C3249g6.f(H5.f25999o));
            c3516l5.e(N5.f27214M0, C3249g6.f(G5.f25715m));
            c3516l5.e(N5.f27216N0, C3249g6.f(H5.f26002r));
            c3516l5.e(N5.f27218O0, C3249g6.f(H5.f25992g));
            C3793qC s9 = c3516l5.s(true);
            long j6 = -1;
            while (true) {
                C2981b6 c2981b6 = (C2981b6) this.f1807u;
                if (j6 < -82) {
                    for (int i = 82; i < 1159; i++) {
                        c2981b6.f30002a.b(C3249g6.a(null));
                    }
                    this.f1806n = true;
                    return;
                }
                N5 n52 = (N5) hashMap.get(Long.valueOf(j6));
                if (n52 == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 36);
                    sb.append(a9);
                    sb.append(j6);
                    throw new B0.c(sb.toString());
                }
                c2981b6.f30002a.b((C3249g6) s9.get(n52));
                j6--;
            }
        } catch (X5 e9) {
            throw new D5(C5.f24798u, e9);
        }
    }

    public void t(int i) {
        AbstractC2792Sd.H(!this.f1806n);
        ((SparseBooleanArray) this.f1807u).append(i, true);
    }

    public XO u() {
        AbstractC2792Sd.H(!this.f1806n);
        this.f1806n = true;
        return new XO((SparseBooleanArray) this.f1807u);
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
                boolean z6 = this.f1806n;
                C2981b6 c2981b6 = (C2981b6) this.f1807u;
                if (z6) {
                    c9 = 0;
                    j6 = 2;
                    obj = null;
                } else {
                    String a9 = L5.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
                    try {
                        HashMap hashMap = AbstractC2927a6.f29795a;
                        C3516l5 c3516l5 = new C3516l5(7, false);
                        c9 = 0;
                        c3516l5.e(N5.f27233n, C3249g6.f(H5.f26003s));
                        c3516l5.e(N5.f27241u, V2.n(0L));
                        c3516l5.e(N5.f27243v, V2.n(1L));
                        c3516l5.e(N5.f27245w, V2.n(2L));
                        c3516l5.e(N5.f27247x, V2.n(3L));
                        c3516l5.e(N5.f27249y, V2.n(4L));
                        c3516l5.e(N5.f27251z, V2.n(7L));
                        j6 = 2;
                        c3516l5.e(N5.f27191A, V2.n(-1L));
                        c3516l5.e(N5.f27193B, V2.n(-2L));
                        c3516l5.e(N5.f27195C, C3249g6.f(G5.f25705b));
                        c3516l5.e(N5.f27196D, C3249g6.f(G5.f25707d));
                        c3516l5.e(N5.f27198E, C3249g6.f(G5.f25712j));
                        c3516l5.e(N5.f27200F, C3249g6.f(G5.f25713k));
                        c3516l5.e(N5.f27202G, C3249g6.f(G5.f25716n));
                        c3516l5.e(N5.f27204H, C3249g6.f(H5.f25998n));
                        c3516l5.e(N5.f27206I, C3249g6.f(G5.f25709f));
                        c3516l5.e(N5.J, C3249g6.f(G5.f25710g));
                        c3516l5.e(N5.f27209K, C3249g6.f(G5.f25711h));
                        c3516l5.e(N5.f27211L, C3249g6.f(G5.i));
                        c3516l5.e(N5.f27213M, C3249g6.f(H5.f25993h));
                        c3516l5.e(N5.f27215N, C3249g6.f(H5.f25994j));
                        c3516l5.e(N5.f27219P, C3249g6.f(G5.f25717o));
                        c3516l5.e(N5.f27220Q, C3249g6.f(G5.f25718p));
                        c3516l5.e(N5.f27221R, C3249g6.f(G5.f25721s));
                        c3516l5.e(N5.f27222S, C3249g6.f(G5.f25722t));
                        c3516l5.e(N5.f27223T, C3249g6.f(G5.f25723u));
                        c3516l5.e(N5.f27224U, C3249g6.f(G5.f25724v));
                        c3516l5.e(N5.f27225V, C3249g6.f(H5.f25987b));
                        c3516l5.e(N5.f27226W, C3249g6.f(H5.f25989d));
                        c3516l5.e(N5.f27227X, C3249g6.f(H5.f25990e));
                        c3516l5.e(N5.Y, C3249g6.f(H5.f25991f));
                        c3516l5.e(N5.f27228Z, C3249g6.f(H5.f25995k));
                        c3516l5.e(N5.f27229i0, C3249g6.f(H5.f25996l));
                        c3516l5.e(N5.f27230j0, C3249g6.f(H5.f26000p));
                        c3516l5.e(N5.f27231k0, C3249g6.f(H5.f26001q));
                        c3516l5.e(N5.f27232l0, C3249g6.f(H5.f26005u));
                        c3516l5.e(N5.m0, C3249g6.f(H5.f26006v));
                        c3516l5.e(N5.f27234n0, C3249g6.f(K5.f26601b));
                        c3516l5.e(N5.f27235o0, C3249g6.f(K5.f26603d));
                        c3516l5.e(N5.f27244v0, C3249g6.f(K5.f26604e));
                        c3516l5.e(N5.f27236p0, C3249g6.f(K5.f26608j));
                        c3516l5.e(N5.f27237q0, C3249g6.f(K5.f26609k));
                        c3516l5.e(N5.f27238r0, C3249g6.f(K5.f26612n));
                        c3516l5.e(N5.f27239s0, C3249g6.f(K5.f26615q));
                        c3516l5.e(N5.f27240t0, C3249g6.f(G5.f25719q));
                        c3516l5.e(N5.f27242u0, C3249g6.f(K5.f26610l));
                        c3516l5.e(N5.f27246w0, C3249g6.f(G5.f25714l));
                        c3516l5.e(N5.f27248x0, C3249g6.f(K5.f26606g));
                        c3516l5.e(N5.f27250y0, C3249g6.f(K5.f26607h));
                        c3516l5.e(N5.f27217O, C3249g6.f(H5.i));
                        c3516l5.e(N5.f27252z0, C3249g6.f(K5.f26614p));
                        c3516l5.e(N5.f27192A0, C3249g6.f(H5.f25997m));
                        c3516l5.e(N5.f27194B0, C3249g6.f(K5.f26613o));
                        c3516l5.e(N5.C0, C3249g6.f(H5.f25988c));
                        c3516l5.e(N5.f27197D0, C3249g6.f(K5.f26602c));
                        c3516l5.e(N5.f27199E0, C3249g6.f(G5.f25720r));
                        c3516l5.e(N5.f27201F0, C3249g6.f(K5.f26611m));
                        c3516l5.e(N5.f27203G0, C3249g6.f(G5.f25708e));
                        c3516l5.e(N5.f27205H0, C3249g6.f(K5.f26605f));
                        c3516l5.e(N5.f27207I0, C3249g6.f(H5.f26004t));
                        c3516l5.e(N5.f27208J0, C3249g6.f(G5.f25706c));
                        c3516l5.e(N5.f27210K0, C3249g6.f(K5.i));
                        c3516l5.e(N5.f27212L0, C3249g6.f(H5.f25999o));
                        c3516l5.e(N5.f27214M0, C3249g6.f(G5.f25715m));
                        c3516l5.e(N5.f27216N0, C3249g6.f(H5.f26002r));
                        c3516l5.e(N5.f27218O0, C3249g6.f(H5.f25992g));
                        C3793qC o4 = c3516l5.o();
                        for (long j10 = -1; j10 >= -82; j10--) {
                            N5 n52 = (N5) hashMap.get(Long.valueOf(j10));
                            if (n52 == null) {
                                StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 36);
                                sb.append(a9);
                                sb.append(j10);
                                throw new B0.c(sb.toString());
                            }
                            c2981b6.f30002a.b((C3249g6) o4.get(n52));
                        }
                        obj = null;
                        for (int i = 82; i < 1159; i++) {
                            c2981b6.f30002a.b(C3249g6.a(null));
                        }
                        this.f1806n = true;
                    } catch (X5 e9) {
                        throw new D5(C5.f24798u, e9);
                    }
                }
                R5 r52 = c2981b6.f30004c;
                try {
                    r52.b(0L);
                    r52.f27930v = new V2(21);
                    String a10 = L5.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo");
                    String a11 = L5.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=");
                    R5 r53 = c2981b6.f30004c;
                    try {
                        int g9 = r53.g();
                        int i4 = ((g9 & 65535) << 16) >> 16;
                        int i6 = (((g9 >> 16) & 65535) << 16) >> 16;
                        if (i4 != -14426) {
                            throw new A5(a10.concat(String.format(L5.a("e1Hk+x0="), Short.valueOf((short) i4))));
                        }
                        if (i6 != 5) {
                            throw new A5(a11.concat(String.format(L5.a("e1Hk+x0="), Short.valueOf((short) i6))));
                        }
                        String a12 = L5.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1");
                        try {
                            int g10 = r53.g();
                            if (g10 != 1182321202) {
                                throw new A5(a12.concat(String.format(L5.a("e1Hk9x0="), Integer.valueOf(g10))));
                            }
                            try {
                                int[] iArr = {r53.g()};
                                int[] iArr2 = AbstractC4271z5.f36067a;
                                V2 v22 = (V2) r53.f27931w;
                                int i9 = iArr[c9];
                                v22.getClass();
                                r53.f27930v = new C3516l5(new I1.a(i9, 5, iArr2));
                                try {
                                    r53.b(96L);
                                    C3523lC c3523lC = E5.f25301a;
                                    Optional.empty();
                                    optional.isPresent();
                                    C3249g6 a13 = C3249g6.a(obj);
                                    Y5 y52 = c2981b6.f30002a;
                                    y52.b(a13);
                                    y52.b(C3249g6.a(obj));
                                    C3717or c3717or = c2981b6.f30003b;
                                    c3717or.b(0L, 0L, y52.f29431b);
                                    while (!((ArrayDeque) c3717or.f33740u).isEmpty()) {
                                        long c10 = r53.c();
                                        try {
                                            try {
                                                try {
                                                } catch (C3088d6 unused) {
                                                    b52 = B5.f24616w;
                                                }
                                            } catch (W5 unused2) {
                                                b52 = B5.f24615v;
                                            }
                                        } catch (Q5 unused3) {
                                            b52 = B5.f24599O;
                                        }
                                        try {
                                            of = y52.d(r53.f()).p().apply(c2981b6);
                                        } catch (Throwable unused4) {
                                            b52 = B5.f24600P;
                                            of = Optional.of(b52);
                                            optional2 = (Optional) of;
                                            if (optional2.isPresent()) {
                                            }
                                        }
                                        optional2 = (Optional) of;
                                        if (optional2.isPresent()) {
                                            if (!E5.f25301a.contains(optional2.get())) {
                                                throw new D5(C5.f24796A, (B5) optional2.get(), c10);
                                            }
                                            Object obj2 = optional2.get();
                                            long c11 = r53.c();
                                            do {
                                                try {
                                                    j9 = c2981b6.f30003b.E().f28476c;
                                                    Optional a14 = c2981b6.a();
                                                    if (a14.isPresent() && a14.get() == B5.f24601Q) {
                                                        throw new D5(C5.f24796A, (B5) obj2, c11);
                                                    }
                                                    if (a14.isPresent()) {
                                                        throw new D5(C5.f24796A, (B5) a14.get(), c11);
                                                    }
                                                } catch (V5 unused5) {
                                                    throw new D5(C5.f24796A, (B5) obj2, c11);
                                                }
                                            } while (j9 != j6);
                                        }
                                    }
                                    try {
                                        C3249g6 c12 = y52.c();
                                        y52.c();
                                        return c12.h();
                                    } catch (W5 e10) {
                                        throw new D5(C5.f24802y, e10);
                                    } catch (C3088d6 e11) {
                                        throw new D5(C5.f24803z, e11);
                                    }
                                } catch (P5 e12) {
                                    e = e12;
                                    throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                                } catch (Q5 e13) {
                                    e = e13;
                                    throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                                }
                            } catch (Q5 e14) {
                                throw new D5(C5.f24801x, e14);
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
                throw new D5(C5.f24799v, e19);
            }
        } catch (U5 e20) {
            throw new D5(C5.f24800w, e20);
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        int i = z.f41712b;
        x2.i.c("Failed to get signals bundle");
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
        boolean z6 = false;
        boolean z9 = false;
        C2981b6 c2981b6 = (C2981b6) this.f1807u;
        try {
            if (!this.f1806n) {
                s();
            }
            R5 r52 = c2981b6.f30004c;
            try {
                r52.b(0L);
                r52.f27930v = new V2(z9 ? 1 : 0);
                R5 r53 = c2981b6.f30004c;
                try {
                    int g9 = r53.g();
                    int i4 = ((g9 & 65535) << 16) >> 16;
                    int i6 = (((g9 >> 16) & 65535) << 16) >> 16;
                    if (i4 != -14426) {
                        throw new A5(L5.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo").concat(String.format(L5.a("e1Hk+x0="), Short.valueOf((short) i4))));
                    }
                    if (i6 != 5) {
                        throw new A5(L5.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=").concat(String.format(L5.a("e1Hk+x0="), Short.valueOf((short) i6))));
                    }
                    int[] iArr = {171029949, 1356422403, 1913211838, 215266853, 506454572, 1309457854, 56236614, 1696779465, 30245415};
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    int f2 = k.f(((~i9) & i10) | iArr[2], (i9 & iArr[3]) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % 30245415);
                    try {
                        int g10 = r53.g();
                        if (g10 != f2) {
                            throw new A5(L5.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1").concat(String.format(L5.a("e1Hk9x0="), Integer.valueOf(g10))));
                        }
                        try {
                            int[] iArr2 = {r53.g()};
                            int[] iArr3 = AbstractC4271z5.f36067a;
                            V2 v22 = (V2) r53.f27931w;
                            int i11 = iArr2[0];
                            v22.getClass();
                            r53.f27930v = new C3516l5(new I1.a(i11, 5, iArr3));
                            try {
                                r53.b(j6);
                                C3523lC c3523lC = E5.f25301a;
                                Optional.empty();
                                Object a9 = true != optional.isPresent() ? C3249g6.a(null) : optional.get();
                                C3249g6 g11 = a9 instanceof C3249g6 ? (C3249g6) a9 : C3249g6.g(a9);
                                Y5 y52 = c2981b6.f30002a;
                                y52.b(g11);
                                y52.b(C3249g6.a(null));
                                C3717or c3717or = c2981b6.f30003b;
                                c3717or.b(0L, 0L, y52.f29431b);
                                while (!((ArrayDeque) c3717or.f33740u).isEmpty()) {
                                    long c10 = r53.c();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    obj = y52.d(r53.f()).p().apply(c2981b6);
                                                } catch (Throwable unused) {
                                                    b52 = B5.f24600P;
                                                    obj = Optional.of(b52);
                                                    optional2 = (Optional) obj;
                                                    if (optional2.isPresent()) {
                                                    }
                                                }
                                            } catch (C3088d6 unused2) {
                                                b52 = B5.f24616w;
                                            }
                                        } catch (W5 unused3) {
                                            b52 = B5.f24615v;
                                        }
                                    } catch (Q5 unused4) {
                                        b52 = B5.f24599O;
                                    }
                                    optional2 = (Optional) obj;
                                    if (optional2.isPresent()) {
                                        if (!E5.f25301a.contains(optional2.get())) {
                                            throw new D5(C5.f24796A, (B5) optional2.get(), c10);
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
                                        long j10 = jArr[z6 ? 1 : 0];
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
                                                j9 = c2981b6.f30003b.E().f28476c;
                                                Optional a10 = c2981b6.a();
                                                if (a10.isPresent() && a10.get() == B5.f24601Q) {
                                                    throw new D5(C5.f24796A, (B5) obj2, c11);
                                                }
                                                if (a10.isPresent()) {
                                                    throw new D5(C5.f24796A, (B5) a10.get(), c11);
                                                }
                                            } catch (V5 unused5) {
                                                throw new D5(C5.f24796A, (B5) obj2, c11);
                                            }
                                        } while (j9 != (j18 ^ j19));
                                        i = 9;
                                        c9 = 5;
                                        z6 = false;
                                    }
                                }
                                try {
                                    C3249g6 c12 = y52.c();
                                    y52.c();
                                    return c12.h();
                                } catch (W5 e9) {
                                    throw new D5(C5.f24802y, e9);
                                } catch (C3088d6 e10) {
                                    throw new D5(C5.f24803z, e10);
                                }
                            } catch (P5 e11) {
                                e = e11;
                                throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                            } catch (Q5 e12) {
                                e = e12;
                                throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
                            }
                        } catch (Q5 e13) {
                            throw new D5(C5.f24801x, e13);
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
            throw new D5(C5.f24800w, e18);
        } catch (X5 e19) {
            throw new D5(C5.f24799v, e19);
        }
    }

    public /* synthetic */ h(Object obj) {
        this.f1807u = obj;
    }

    public /* synthetic */ h(Object obj, boolean z6) {
        this.f1807u = obj;
        this.f1806n = z6;
    }

    public h(I1.a aVar) {
        this.f1807u = aVar;
        this.f1806n = true;
    }

    public h(g gVar, boolean z6) {
        this(gVar);
        this.f1806n = z6;
    }

    public void q() {
    }

    public void r() {
    }
}
