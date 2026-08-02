package defpackage;

import android.net.Uri;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.transfer.version2.internal.screens.common.MobileProvidersListItemData$Contact$Type;
import com.ybsdk.feature.transfer.version2.internal.screens.common.TransferContactsUtils$Companion$ElementsType;
import com.ybsdk.feature.transfer.version2.internal.screens.common.a;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactState$SelectedContact$Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class st20 implements ev31 {
    public qt20 a;
    public final ph01 b;

    public st20(qh01 qh01Var) {
        this.b = new ph01((a) ((srb) qh01Var.a.a).get(), TransferContactsUtils$Companion$ElementsType.MOBILE_PROVIDERS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0298  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        boolean z;
        List singletonList;
        jfb0 jfb0Var;
        boolean z2;
        List singletonList2;
        jfb0 jfb0Var2;
        List list;
        ?? r7;
        boolean z3;
        Pair pair;
        bj01 bj01Var;
        jfb0 jfb0Var3;
        boolean z4;
        jfb0 jfb0Var4;
        jt20 jt20Var = (jt20) obj;
        if (jt20Var.g) {
            return new ot20(lnb1.b());
        }
        u8j0 u8j0Var = jt20Var.e;
        String str = jt20Var.d;
        u8j0 u8j0Var2 = jt20Var.a;
        u8j0 u8j0Var3 = jt20Var.f;
        jfb0 jfb0Var5 = (jfb0) u8j0Var.a();
        it20 it20Var = jt20Var.c;
        ph01 ph01Var = this.b;
        EmptyList emptyList = EmptyList.a;
        if (jfb0Var5 == null) {
            singletonList = emptyList;
        } else {
            boolean l = jl40.l((it20Var == null || (jfb0Var = it20Var.a) == null) ? null : jfb0Var.b(), jfb0Var5.b());
            cu20 cu20Var = new cu20(jfb0Var5, MobileProvidersListItemData$Contact$Type.CLIPBOARD);
            Text.Constant i = g8e.i(Text.Companion, jfb0Var5.a());
            Text.Resource resource = new Text.Resource(dzh0.ybsdk_transfer_transfer_copied_text);
            int i2 = vxg0.ybsdk_transfer_ic_copy_with_background;
            ph01Var.getClass();
            vno vnoVar = new vno(i2, 7);
            Integer valueOf = Integer.valueOf(vxg0.ybsdk_ic_arrow_select);
            if (l) {
                if ((it20Var != null ? it20Var.b : null) == MobilePaymentSelectContactState$SelectedContact$Status.CHECKING) {
                    z = true;
                    singletonList = Collections.singletonList(new bj01(cu20Var, i, resource, vnoVar, valueOf, z, 64));
                }
            }
            z = false;
            singletonList = Collections.singletonList(new bj01(cu20Var, i, resource, vnoVar, valueOf, z, 64));
        }
        jfb0 jfb0Var6 = (jfb0) u8j0Var3.a();
        if (jfb0Var6 == null) {
            singletonList2 = emptyList;
        } else {
            boolean l2 = jl40.l((it20Var == null || (jfb0Var2 = it20Var.a) == null) ? null : jfb0Var2.b(), jfb0Var6.b());
            Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_transfer_mobile_payments_phone_myself_title);
            cu20 cu20Var2 = new cu20(jfb0Var6, MobileProvidersListItemData$Contact$Type.MYSELF);
            Text.Constant constant = new Text.Constant(jfb0Var6.a());
            ph01Var.getClass();
            n2v0 n2v0Var = new n2v0(27, h);
            Integer valueOf2 = Integer.valueOf(vxg0.ybsdk_ic_arrow_select);
            if (l2) {
                if ((it20Var != null ? it20Var.b : null) == MobilePaymentSelectContactState$SelectedContact$Status.CHECKING) {
                    z2 = true;
                    singletonList2 = Collections.singletonList(new bj01(cu20Var2, h, constant, n2v0Var, valueOf2, z2, 64));
                }
            }
            z2 = false;
            singletonList2 = Collections.singletonList(new bj01(cu20Var2, h, constant, n2v0Var, valueOf2, z2, 64));
        }
        if (u8j0Var2 instanceof s8j0) {
            list = Collections.singletonList(ph01Var.a());
        } else {
            if (!(u8j0Var2 instanceof t8j0) && !(u8j0Var2 instanceof r8j0)) {
                w511.b();
                return null;
            }
            list = emptyList;
        }
        List list2 = (List) u8j0Var2.a();
        if (list2 == null) {
            list2 = emptyList;
        }
        List list3 = list2;
        int d = gw00.d(tcc.n(list3, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj2 : list3) {
            linkedHashMap.put(((v9e) obj2).b.b(), obj2);
        }
        tsx tsxVar = (tsx) jt20Var.b.a();
        if (tsxVar != null) {
            ArrayList arrayList = tsxVar.a;
            r7 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r7.add(((ssx) it.next()).a);
            }
        } else {
            r7 = 0;
        }
        if (r7 != 0) {
            emptyList = r7;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : emptyList) {
            String str2 = (String) obj3;
            jfb0 jfb0Var7 = (jfb0) u8j0Var3.a();
            if (!jl40.l(str2, jfb0Var7 != null ? jfb0Var7.b() : null)) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            v9e v9eVar = (v9e) linkedHashMap.get(str3);
            if (v9eVar == null) {
                com.google.i18n.phonenumbers.a aVar = jfb0.h;
                jfb0 c = wi91.c(str3);
                v9eVar = c == null ? null : new v9e("", c, null);
            }
            if (v9eVar != null) {
                arrayList3.add(v9eVar);
            }
        }
        Object obj4 = null;
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((v9e) it3.next()).b.b());
        }
        Set N0 = kotlin.collections.a.N0(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list3) {
            if (!N0.contains(((v9e) obj5).b.b())) {
                arrayList5.add(obj5);
            }
        }
        List<v9e> b = ph01Var.b(str, kotlin.collections.a.m0(arrayList5, arrayList3));
        ArrayList arrayList6 = new ArrayList(tcc.n(b, 10));
        for (v9e v9eVar2 : b) {
            jfb0 jfb0Var8 = v9eVar2.b;
            Uri uri = v9eVar2.c;
            String str4 = v9eVar2.a;
            boolean l3 = jl40.l(jfb0Var8.b(), (it20Var == null || (jfb0Var4 = it20Var.a) == null) ? obj4 : jfb0Var4.b());
            String a = jfb0Var8.a();
            if (l3) {
                if ((it20Var != null ? it20Var.b : obj4) == MobilePaymentSelectContactState$SelectedContact$Status.CHECKING) {
                    z4 = true;
                    cu20 cu20Var3 = new cu20(jfb0Var8, MobileProvidersListItemData$Contact$Type.CONTACT_LIST);
                    b bVar = Text.Companion;
                    if (str4.length() != 0) {
                        a = str4;
                    }
                    Text.Constant i3 = g8e.i(bVar, a);
                    Text.Constant constant2 = str4.length() <= 0 ? new Text.Constant(jfb0Var8.a()) : null;
                    String uri2 = uri == null ? uri.toString() : null;
                    arrayList6.add(new bj01(cu20Var3, i3, constant2, (uri2 != null || evu0.J(uri2)) ? evu0.J(str4) ? new n2v0(27, new Text.Constant(str4)) : new vno(vxg0.ybsdk_default_avatar, 7) : new r3k0(str4, String.valueOf(uri)), Integer.valueOf(vxg0.ybsdk_ic_arrow_select), jfb0Var8.c(), !z4, z4));
                    obj4 = null;
                }
            }
            z4 = false;
            cu20 cu20Var32 = new cu20(jfb0Var8, MobileProvidersListItemData$Contact$Type.CONTACT_LIST);
            b bVar2 = Text.Companion;
            if (str4.length() != 0) {
            }
            Text.Constant i32 = g8e.i(bVar2, a);
            if (str4.length() <= 0) {
            }
            if (uri == null) {
            }
            if (uri2 != null) {
            }
            arrayList6.add(new bj01(cu20Var32, i32, constant2, (uri2 != null || evu0.J(uri2)) ? evu0.J(str4) ? new n2v0(27, new Text.Constant(str4)) : new vno(vxg0.ybsdk_default_avatar, 7) : new r3k0(str4, String.valueOf(uri)), Integer.valueOf(vxg0.ybsdk_ic_arrow_select), jfb0Var8.c(), !z4, z4));
            obj4 = null;
        }
        if (!arrayList6.isEmpty() || it20Var == null) {
            z3 = true;
            singletonList2 = (arrayList6.size() != 1 || it20Var == null) ? kotlin.collections.a.m0(arrayList6, kotlin.collections.a.m0(list, kotlin.collections.a.m0(singletonList2, singletonList))) : kotlin.collections.a.m0(arrayList6, kotlin.collections.a.m0(singletonList2, singletonList));
        } else {
            String b2 = it20Var.a.b();
            jfb0 jfb0Var9 = (jfb0) u8j0Var3.a();
            if (jl40.l(b2, jfb0Var9 != null ? jfb0Var9.b() : null)) {
                z3 = true;
            } else {
                z3 = true;
                singletonList2 = null;
            }
        }
        if (singletonList2 == null) {
            if (it20Var == null || (jfb0Var3 = it20Var.a) == null) {
                bj01Var = null;
            } else {
                bj01Var = new bj01(new cu20(jfb0Var3, MobileProvidersListItemData$Contact$Type.CONTACT_LIST), g8e.i(Text.Companion, jfb0Var3.a()), null, new vno(vxg0.ybsdk_default_avatar, 7), Integer.valueOf(vxg0.ybsdk_ic_arrow_select), (jl40.l(jfb0Var3.b(), jfb0Var3.b()) && it20Var.b == MobilePaymentSelectContactState$SelectedContact$Status.CHECKING) ? z3 : false, 64);
            }
            pair = new Pair(scc.h(bj01Var), Boolean.TRUE);
        } else {
            pair = new Pair(singletonList2, Boolean.FALSE);
        }
        List list4 = (List) pair.getFirst();
        boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
        qt20 qt20Var = this.a;
        qt20 qt20Var2 = new qt20(list4, (vi01.c(qt20Var != null ? qt20Var.a : null, singletonList2) || booleanValue) ? z3 : false, new pt20(ph01Var.c.h(str) ? g8e.i(Text.Companion, "+7 ") : null, str));
        this.a = qt20Var2;
        return qt20Var2;
    }
}
