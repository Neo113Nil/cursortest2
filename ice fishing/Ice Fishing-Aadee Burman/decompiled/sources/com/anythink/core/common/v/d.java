package com.anythink.core.common.v;

import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.common.h.bv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16728a = "anythink_imp_check";

    /* renamed from: b, reason: collision with root package name */
    public static int f16729b = 999;

    /* renamed from: c, reason: collision with root package name */
    public static int f16730c = 888;

    /* renamed from: d, reason: collision with root package name */
    public static int f16731d = 5;

    /* renamed from: e, reason: collision with root package name */
    private static volatile d f16732e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Integer> f16733f = Arrays.asList(50, 15, 8, 22, 28, 59, 6, 37, 3);

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, List<Integer>> f16734g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, String> f16735h = new HashMap();
    private final Map<String, List<Integer>> i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, String> f16736j = new HashMap();

    public interface a {
        void a();

        void b();
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter == null) {
            return "";
        }
        try {
            com.anythink.core.common.h.n trackingInfo = aTBaseAdAdapter.getTrackingInfo();
            bv unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
            if (trackingInfo == null) {
                return "";
            }
            String M8 = trackingInfo.M();
            String b9 = b(trackingInfo, unitGroupInfo);
            if (TextUtils.isEmpty(b9) || TextUtils.isEmpty(M8)) {
                return "";
            }
            return this.f16736j.get(M8 + "_" + b9);
        } catch (Exception e9) {
            e9.printStackTrace();
            return "";
        }
    }

    public final boolean b(ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter != null) {
            try {
                bv unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
                if (unitGroupInfo == null || !this.f16733f.contains(Integer.valueOf(unitGroupInfo.g())) || unitGroupInfo.bg() != 1) {
                    return true;
                }
                List<Integer> a9 = a(unitGroupInfo, false);
                if (a9.isEmpty()) {
                    return true;
                }
                return a(aTBaseAdAdapter, a9, false);
            } catch (Throwable th) {
                D.y.w("check imp error", th.getMessage() + ", " + q.a(th.getStackTrace()));
            }
        }
        return true;
    }

    public final boolean c(ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter != null) {
            try {
                bv unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
                if (unitGroupInfo == null || !this.f16733f.contains(Integer.valueOf(unitGroupInfo.g())) || unitGroupInfo.bj() != 1) {
                    return true;
                }
                List<Integer> a9 = a(unitGroupInfo, true);
                if (a9.isEmpty()) {
                    return true;
                }
                return a(aTBaseAdAdapter, a9, true);
            } catch (Throwable th) {
                D.y.w("check reward error", th.getMessage() + ", " + q.a(th.getStackTrace()));
            }
        }
        return true;
    }

    public final void d(ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter != null) {
            try {
                com.anythink.core.common.h.n trackingInfo = aTBaseAdAdapter.getTrackingInfo();
                if (trackingInfo != null) {
                    String M8 = trackingInfo.M();
                    String b9 = b(trackingInfo, aTBaseAdAdapter.getUnitGroupInfo());
                    if (TextUtils.isEmpty(b9) || TextUtils.isEmpty(M8)) {
                        return;
                    }
                    String str = M8 + "_" + b9;
                    if (this.f16734g.containsKey(str)) {
                        Objects.toString(this.f16734g.remove(str));
                    }
                    if (this.f16735h.containsKey(str)) {
                        this.f16735h.remove(str);
                    }
                    if (this.i.containsKey(str)) {
                        Objects.toString(this.i.remove(str));
                    }
                    if (this.f16736j.containsKey(str)) {
                        this.f16736j.remove(str);
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public static d a() {
        if (f16732e == null) {
            synchronized (d.class) {
                try {
                    if (f16732e == null) {
                        f16732e = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16732e;
    }

    public final boolean a(ATBaseAdAdapter aTBaseAdAdapter) {
        JSONArray bm;
        String[] b9;
        if (aTBaseAdAdapter != null) {
            try {
                bv unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
                if (unitGroupInfo == null || !this.f16733f.contains(Integer.valueOf(unitGroupInfo.g())) || unitGroupInfo.bg() != 1 || (bm = unitGroupInfo.bm()) == null || bm.length() <= 0 || (b9 = b()) == null || b9.length <= 0) {
                    return true;
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < b9.length; i++) {
                    sb.append(b9[i]);
                    if (i != b9.length - 1) {
                        sb.append("\n");
                    }
                }
                String str = "";
                String name = aTBaseAdAdapter.getClass().getName();
                int lastIndexOf = name.lastIndexOf(com.anythink.core.common.d.j.f12378z);
                if (lastIndexOf != -1) {
                    str = name.substring(0, lastIndexOf);
                }
                boolean a9 = a(b9, str, bm);
                com.anythink.core.common.u.e.a(aTBaseAdAdapter.getTrackingInfo(), sb.toString(), a9);
                return a9;
            } catch (Throwable th) {
                D.y.w("check imp error", th.getMessage() + ", " + q.a(th.getStackTrace()));
            }
        }
        return true;
    }

    private static String[] b() {
        try {
            Class<?> cls = Class.forName(ah.a("mdyd1odqj1Wkuhdg"));
            Object[] objArr = (Object[]) cls.getMethod(ah.a("jhwVwdfnWudfh"), new Class[0]).invoke(cls.getMethod(ah.a("fxuuhqwWkuhdg"), new Class[0]).invoke(null, new Object[0]), new Object[0]);
            if (objArr == null || objArr.length <= 0) {
                return null;
            }
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = objArr[i].toString();
            }
            return strArr;
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    private static String b(com.anythink.core.common.h.n nVar, bv bvVar) {
        com.anythink.core.common.h.ad R8;
        String aJ = nVar.aJ();
        return (bvVar == null || !bvVar.o() || (R8 = bvVar.R()) == null || TextUtils.isEmpty(R8.getOriginRequestId())) ? aJ : R8.getOriginRequestId();
    }

    public final void a(final ATBaseAdAdapter aTBaseAdAdapter, final a aVar) {
        if (aTBaseAdAdapter != null) {
            try {
                bv unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
                if (unitGroupInfo != null && unitGroupInfo.g() == 50) {
                    if (!unitGroupInfo.o()) {
                        aVar.a();
                        return;
                    }
                    if (unitGroupInfo.bg() != 1) {
                        aVar.a();
                        return;
                    }
                    String e9 = e(aTBaseAdAdapter);
                    if (!TextUtils.isEmpty(e9)) {
                        if (e9.equals("0")) {
                            aVar.a();
                            return;
                        }
                        return;
                    } else {
                        com.anythink.core.common.d.t.b();
                        com.anythink.core.common.d.t.b(new Runnable() { // from class: com.anythink.core.common.v.d.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar2;
                                String e10 = d.this.e(aTBaseAdAdapter);
                                if (TextUtils.isEmpty(e10)) {
                                    a aVar3 = aVar;
                                    if (aVar3 != null) {
                                        aVar3.a();
                                        return;
                                    }
                                    return;
                                }
                                if (!e10.equals("0") || (aVar2 = aVar) == null) {
                                    return;
                                }
                                aVar2.a();
                            }
                        }, com.anythink.expressad.video.module.a.a.m.ai);
                        return;
                    }
                }
            } catch (Throwable th) {
                D.y.w("check checkWinResult error", th.getMessage() + ", " + q.a(th.getStackTrace()));
            }
        }
        aVar.a();
    }

    private static List<Integer> a(bv bvVar, boolean z3) {
        JSONArray bi;
        JSONArray bh;
        ArrayList arrayList = new ArrayList();
        try {
            int i = 0;
            if (bvVar.o()) {
                if (z3) {
                    bh = bvVar.bk();
                } else {
                    bh = bvVar.bh();
                }
                if (bh != null && bh.length() > 0) {
                    while (i < bh.length()) {
                        arrayList.add((Integer) bh.get(i));
                        i++;
                    }
                }
            } else {
                if (z3) {
                    bi = bvVar.bl();
                } else {
                    bi = bvVar.bi();
                }
                if (bi != null && bi.length() > 0) {
                    while (i < bi.length()) {
                        arrayList.add((Integer) bi.get(i));
                        i++;
                    }
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return arrayList;
    }

    public final boolean a(com.anythink.core.common.h.n nVar, bv bvVar) {
        if (nVar == null) {
            return true;
        }
        try {
            String M8 = nVar.M();
            String b9 = b(nVar, bvVar);
            String aK = nVar.aK();
            if (TextUtils.isEmpty(aK) || (!aK.equals("0") && !aK.equals("2"))) {
                if (TextUtils.isEmpty(b9) || TextUtils.isEmpty(M8)) {
                    return true;
                }
                String str = M8 + "_" + b9;
                List<Integer> list = this.i.get(str);
                List<Integer> list2 = this.f16734g.get(str);
                Objects.toString(list2);
                Objects.toString(list2);
                if (list2 == null) {
                    return false;
                }
                if (list != null) {
                    return !list.contains(Integer.valueOf(f16729b));
                }
                return true;
            }
            return false;
        } catch (Exception e9) {
            e9.printStackTrace();
            return true;
        }
    }

    private boolean a(ATBaseAdAdapter aTBaseAdAdapter, List<Integer> list, boolean z3) {
        if (aTBaseAdAdapter == null) {
            return true;
        }
        try {
            com.anythink.core.common.h.n trackingInfo = aTBaseAdAdapter.getTrackingInfo();
            bv unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
            if (trackingInfo == null || list == null) {
                return true;
            }
            String M8 = trackingInfo.M();
            String b9 = b(trackingInfo, unitGroupInfo);
            if (TextUtils.isEmpty(b9) || TextUtils.isEmpty(M8)) {
                return true;
            }
            String str = M8 + "_" + b9;
            List<Integer> list2 = this.f16734g.get(str);
            String str2 = this.f16735h.get(str);
            Objects.toString(list2);
            list.toString();
            if (list2 == null || new HashSet(list2).containsAll(list)) {
                return true;
            }
            if (z3) {
                com.anythink.core.common.u.e.c(trackingInfo, list2.toString(), str2);
                return false;
            }
            com.anythink.core.common.u.e.b(trackingInfo, list2.toString(), str2);
            return false;
        } catch (Exception e9) {
            e9.printStackTrace();
            return true;
        }
    }

    private static boolean a(String[] strArr, String str, JSONArray jSONArray) {
        int i;
        try {
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        if (!TextUtils.isEmpty(str) && jSONArray != null) {
            int i6 = -1;
            for (int i9 = 0; i9 < strArr.length; i9++) {
                String str2 = strArr[i9];
                if (str2 != null && str2.startsWith(str)) {
                    i6 = i9;
                }
            }
            if (i6 != -1 && (i = i6 + 1) < strArr.length) {
                String str3 = strArr[i];
                if (!TextUtils.isEmpty(str3) && jSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        String str4 = (String) jSONArray.get(i10);
                        if (!TextUtils.isEmpty(str4) && str3.startsWith(str4)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final void a(com.anythink.core.common.h.n nVar, bv bvVar, int i, String str) {
        List<Integer> list;
        List<Integer> list2;
        if (nVar != null) {
            try {
                String M8 = nVar.M();
                String b9 = b(nVar, bvVar);
                if (TextUtils.isEmpty(b9) || TextUtils.isEmpty(M8)) {
                    return;
                }
                String str2 = M8 + "_" + b9;
                if (i != f16730c && i != f16729b) {
                    List<Integer> list3 = this.f16734g.get(str2);
                    if (list3 != null) {
                        boolean contains = list3.contains(Integer.valueOf(i));
                        list2 = list3;
                        if (!contains) {
                            list3.add(Integer.valueOf(i));
                            list2 = list3;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(i));
                        this.f16734g.put(str2, arrayList);
                        list2 = arrayList;
                    }
                    if (i == f16731d && !TextUtils.isEmpty(str)) {
                        this.f16735h.put(str2, str);
                    }
                    nVar.a(list2);
                    list2.toString();
                    return;
                }
                try {
                    List<Integer> list4 = this.i.get(str2);
                    if (list4 != null) {
                        boolean contains2 = list4.contains(Integer.valueOf(i));
                        list = list4;
                        if (!contains2) {
                            list4.add(Integer.valueOf(i));
                            list = list4;
                        }
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(i));
                        this.i.put(str2, arrayList2);
                        list = arrayList2;
                    }
                    if (i == f16730c && !TextUtils.isEmpty(str)) {
                        this.f16736j.put(str2, str);
                    }
                    list.toString();
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void a(com.anythink.core.common.h.n nVar, bv bvVar, int i) {
        try {
            a(nVar, bvVar, i, null);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void a(int i, String str, String str2) {
        List<Integer> list;
        try {
            List<Integer> list2 = this.i.get(str);
            if (list2 != null) {
                boolean contains = list2.contains(Integer.valueOf(i));
                list = list2;
                if (!contains) {
                    list2.add(Integer.valueOf(i));
                    list = list2;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(i));
                this.i.put(str, arrayList);
                list = arrayList;
            }
            if (i == f16730c && !TextUtils.isEmpty(str2)) {
                this.f16736j.put(str, str2);
            }
            list.toString();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }
}
