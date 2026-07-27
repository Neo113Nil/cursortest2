package h8;

import O.InterfaceC0354p;
import S0.i;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.F;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.BP;
import com.google.android.gms.internal.ads.C3112dq;
import com.google.android.gms.internal.ads.C3183f5;
import com.google.android.gms.internal.ads.C3320hg;
import com.google.android.gms.internal.ads.FA;
import com.google.android.gms.internal.ads.InterfaceC3128e5;
import com.google.android.gms.internal.ads.W;
import com.icefishing.icefishingliveapp.SplashActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k4.m;
import kotlin.jvm.internal.h;
import l.InterfaceC4682j;
import l.SubMenuC4672D;
import l.l;
import l.w;
import m.C4743k;
import q2.r;
import s1.InterfaceC4989b;
import t0.AbstractC5032P;
import t0.C5020D;
import t0.C5038a;
import u2.f;
import v0.AbstractC5116a;
import y1.C5221A;
import y1.C5227b;
import y1.C5228c;
import y1.InterfaceC5244s;
import y1.InterfaceC5245t;
import y1.y;

/* loaded from: classes2.dex */
public final class d implements w, InterfaceC4682j, InterfaceC3128e5, u2.e, InterfaceC5245t, InterfaceC4989b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38260n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f38261u;

    public /* synthetic */ d(int i, Object obj) {
        this.f38260n = i;
        this.f38261u = obj;
    }

    public void a(AbstractC5116a... migrations) {
        h.e(migrations, "migrations");
        for (AbstractC5116a abstractC5116a : migrations) {
            int i = abstractC5116a.f41328a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f38261u;
            Integer valueOf = Integer.valueOf(i);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i4 = abstractC5116a.f41329b;
            if (treeMap.containsKey(Integer.valueOf(i4))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i4)) + " with " + abstractC5116a);
            }
            treeMap.put(Integer.valueOf(i4), abstractC5116a);
        }
    }

    @Override // s1.InterfaceC4989b
    public boolean b(Object obj, File file, s1.h hVar) {
        InputStream inputStream = (InputStream) obj;
        C3112dq c3112dq = (C3112dq) this.f38261u;
        byte[] bArr = (byte[]) c3112dq.f(com.anythink.basead.exoplayer.b.aX, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e6) {
                        e = e6;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        c3112dq.k(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c3112dq.k(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c3112dq.k(bArr);
                return true;
            } catch (IOException e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128e5
    public void c(C3183f5 c3183f5) {
        ((C3320hg) this.f38261u).b(c3183f5);
    }

    public void d(C5038a c5038a) {
        int i = c5038a.f40667a;
        RecyclerView recyclerView = (RecyclerView) this.f38261u;
        if (i == 1) {
            recyclerView.f5330E.W(c5038a.f40668b, c5038a.f40669c);
            return;
        }
        if (i == 2) {
            recyclerView.f5330E.Z(c5038a.f40668b, c5038a.f40669c);
        } else if (i == 4) {
            recyclerView.f5330E.a0(c5038a.f40668b, c5038a.f40669c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f5330E.Y(c5038a.f40668b, c5038a.f40669c);
        }
    }

    @Override // l.w
    public void e(l lVar, boolean z8) {
        if (lVar instanceof SubMenuC4672D) {
            ((SubMenuC4672D) lVar).f38882S.k().c(false);
        }
        w wVar = ((C4743k) this.f38261u).f39447x;
        if (wVar != null) {
            wVar.e(lVar, z8);
        }
    }

    public AbstractC5032P f(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f38261u;
        int l9 = recyclerView.f5382x.l();
        int i4 = 0;
        AbstractC5032P abstractC5032P = null;
        while (true) {
            if (i4 >= l9) {
                break;
            }
            AbstractC5032P I2 = RecyclerView.I(recyclerView.f5382x.k(i4));
            if (I2 != null && !I2.h() && I2.f40617c == i) {
                if (!((ArrayList) recyclerView.f5382x.f39327d).contains(I2.f40615a)) {
                    abstractC5032P = I2;
                    break;
                }
                abstractC5032P = I2;
            }
            i4++;
        }
        if (abstractC5032P == null || ((ArrayList) recyclerView.f5382x.f39327d).contains(abstractC5032P.f40615a)) {
            return null;
        }
        return abstractC5032P;
    }

    @Override // l.w
    public boolean g(l lVar) {
        C4743k c4743k = (C4743k) this.f38261u;
        if (lVar == c4743k.f39445v) {
            return false;
        }
        ((SubMenuC4672D) lVar).f38883T.getClass();
        c4743k.getClass();
        w wVar = c4743k.f39447x;
        if (wVar != null) {
            return wVar.g(lVar);
        }
        return false;
    }

    @Override // u2.e
    public void h(JsonWriter jsonWriter) {
        Object obj = f.f41231b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = (byte[]) this.f38261u;
        int length = bArr.length;
        String encodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(encodeToString);
        } else {
            String d2 = u2.d.d(encodeToString, "MD5");
            if (d2 != null) {
                jsonWriter.name("bodydigest").value(d2);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    @Override // y1.InterfaceC5245t
    public InterfaceC5244s i(y yVar) {
        switch (this.f38260n) {
            case 13:
                return new C5228c(1, (C5221A) this.f38261u);
            default:
                return new C5227b((Resources) this.f38261u, yVar.b(Uri.class, InputStream.class));
        }
    }

    @Override // l.InterfaceC4682j
    public void j(l lVar) {
        Toolbar toolbar = (Toolbar) this.f38261u;
        C4743k c4743k = toolbar.f4724n.f4677M;
        if (c4743k == null || !c4743k.k()) {
            Iterator it = toolbar.f4727p0.f2298b.iterator();
            while (it.hasNext()) {
                ((F) ((InterfaceC0354p) it.next())).f4936a.s();
            }
        }
        h4.c cVar = toolbar.f4739x0;
        if (cVar != null) {
            cVar.j(lVar);
        }
    }

    public void k(int i, int i4) {
        int i9;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.f38261u;
        int l9 = recyclerView.f5382x.l();
        int i11 = i4 + i;
        for (int i12 = 0; i12 < l9; i12++) {
            View k6 = recyclerView.f5382x.k(i12);
            AbstractC5032P I2 = RecyclerView.I(k6);
            if (I2 != null && !I2.o() && (i10 = I2.f40617c) >= i && i10 < i11) {
                I2.a(2);
                I2.a(1024);
                ((C5020D) k6.getLayoutParams()).f40578c = true;
            }
        }
        BP bp = recyclerView.f5376u;
        ArrayList arrayList = (ArrayList) bp.f24039e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC5032P abstractC5032P = (AbstractC5032P) arrayList.get(size);
            if (abstractC5032P != null && (i9 = abstractC5032P.f40617c) >= i && i9 < i11) {
                abstractC5032P.a(2);
                bp.e(size);
            }
        }
        recyclerView.f5346M0 = true;
    }

    public void l(int i, int i4) {
        RecyclerView recyclerView = (RecyclerView) this.f38261u;
        int l9 = recyclerView.f5382x.l();
        for (int i9 = 0; i9 < l9; i9++) {
            AbstractC5032P I2 = RecyclerView.I(recyclerView.f5382x.k(i9));
            if (I2 != null && !I2.o() && I2.f40617c >= i) {
                I2.l(i4, false);
                recyclerView.f5339I0.f40599f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f5376u.f24039e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC5032P abstractC5032P = (AbstractC5032P) arrayList.get(i10);
            if (abstractC5032P != null && abstractC5032P.f40617c >= i) {
                abstractC5032P.l(i4, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f5344L0 = true;
    }

    public void m(int i, int i4) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        RecyclerView recyclerView = (RecyclerView) this.f38261u;
        int l9 = recyclerView.f5382x.l();
        int i16 = -1;
        if (i < i4) {
            i10 = i;
            i9 = i4;
            i11 = -1;
        } else {
            i9 = i;
            i10 = i4;
            i11 = 1;
        }
        for (int i17 = 0; i17 < l9; i17++) {
            AbstractC5032P I2 = RecyclerView.I(recyclerView.f5382x.k(i17));
            if (I2 != null && (i15 = I2.f40617c) >= i10 && i15 <= i9) {
                if (i15 == i) {
                    I2.l(i4 - i, false);
                } else {
                    I2.l(i11, false);
                }
                recyclerView.f5339I0.f40599f = true;
            }
        }
        BP bp = recyclerView.f5376u;
        bp.getClass();
        if (i < i4) {
            i13 = i;
            i12 = i4;
        } else {
            i12 = i;
            i13 = i4;
            i16 = 1;
        }
        ArrayList arrayList = (ArrayList) bp.f24039e;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            AbstractC5032P abstractC5032P = (AbstractC5032P) arrayList.get(i18);
            if (abstractC5032P != null && (i14 = abstractC5032P.f40617c) >= i13 && i14 <= i12) {
                if (i14 == i) {
                    abstractC5032P.l(i4 - i, false);
                } else {
                    abstractC5032P.l(i16, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f5344L0 = true;
    }

    public void n() {
        NetworkInfo activeNetworkInfo;
        boolean z8 = m.f38788d.getBoolean("app_AppOpenAdStatus", false);
        String string = m.f38788d.getString("AppOpenID", "");
        i iVar = (i) this.f38261u;
        if (!z8 || string.isEmpty() || (activeNetworkInfo = ((ConnectivityManager) ((SplashActivity) iVar.f2904x).getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            ((h4.c) iVar.f2901u).E();
            return;
        }
        Log.d("Workingdone", "5");
        if (z8) {
            Log.d("Workingdone", "6");
        } else {
            Log.d("Workingdone", "7");
            ((h4.c) iVar.f2903w).E();
        }
    }

    @Override // l.InterfaceC4682j
    public boolean o(l lVar, MenuItem menuItem) {
        h4.c cVar = ((Toolbar) this.f38261u).f4739x0;
        return false;
    }

    public void p(FA fa) {
        W w9 = (W) this.f38261u;
        w9.getClass();
        String str = fa.f24924b;
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Vc)).booleanValue()) {
                w9.f28333b = str;
            }
        }
        int i = fa.f24923a;
        switch (i) {
            case 8152:
                w9.d(new HashMap(), "onLMDOverlayOpened");
                break;
            case 8153:
                w9.d(new HashMap(), "onLMDOverlayClicked");
                break;
            case 8155:
                w9.d(new HashMap(), "onLMDOverlayClose");
                break;
            case 8157:
                w9.f28333b = null;
                w9.f28334c = null;
                w9.f28332a = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(i));
                w9.d(hashMap, "onLMDOverlayFailedToOpen");
                break;
        }
    }

    public d(W w9) {
        this.f38260n = 6;
        Objects.requireNonNull(w9);
        this.f38261u = w9;
    }

    public d(com.anythink.core.common.n.b.a.e eVar) {
        this.f38260n = 0;
        this.f38261u = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), eVar);
    }

    public d(int i) {
        this.f38260n = i;
        switch (i) {
            case 11:
                this.f38261u = new ArrayDeque();
                break;
            case 12:
            default:
                this.f38261u = new LinkedHashMap();
                break;
            case 13:
                this.f38261u = new C5221A(7);
                break;
        }
    }
}
