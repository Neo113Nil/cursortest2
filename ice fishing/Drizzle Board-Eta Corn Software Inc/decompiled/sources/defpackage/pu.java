package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class pu {
    public static final /* synthetic */ int b2ZJblxo = 0;
    public final VM67d7Sv MdtA4re8;
    public final String NCTxEWno;
    public final a80 P7K7Inc8;
    public CharSequence VgvYg0wo;
    public ru wxUZMvaN;

    static {
        new LinkedHashMap();
    }

    public pu(wv wvVar) {
        LinkedHashMap linkedHashMap = xv.NCTxEWno;
        this.NCTxEWno = fn.OxcuoDLp(wvVar.getClass());
        this.MdtA4re8 = new VM67d7Sv(this);
        this.P7K7Inc8 = new a80(0);
    }

    public final st MdtA4re8(int i) {
        st stVar;
        a80 a80Var = this.P7K7Inc8;
        if (a80Var.MdtA4re8() == 0) {
            stVar = null;
        } else {
            a80Var.getClass();
            stVar = (st) ej0.eVhOlqcC(a80Var, i);
        }
        if (stVar != null) {
            return stVar;
        }
        ru ruVar = this.wxUZMvaN;
        if (ruVar != null) {
            return ruVar.MdtA4re8(i);
        }
        return null;
    }

    public final int[] NCTxEWno(pu puVar) {
        q0 q0Var = new q0();
        while (true) {
            VM67d7Sv vM67d7Sv = this.MdtA4re8;
            ru ruVar = this.wxUZMvaN;
            if ((puVar != null ? puVar.wxUZMvaN : null) != null) {
                ru ruVar2 = puVar.wxUZMvaN;
                ruVar2.getClass();
                if (ruVar2.Qr9iLBAD(vM67d7Sv.qoPGr6Ce) == this) {
                    q0Var.addFirst(this);
                    break;
                }
            }
            if (ruVar == null || ruVar.Qr9iLBAD.qoPGr6Ce != vM67d7Sv.qoPGr6Ce) {
                q0Var.addFirst(this);
            }
            if (fn.qoPGr6Ce(ruVar, puVar) || ruVar == null) {
                break;
            }
            this = ruVar;
        }
        List B1cjorwa = x5.B1cjorwa(q0Var);
        ArrayList arrayList = new ArrayList(z5.bvfAo0eO(B1cjorwa, 10));
        Iterator it = B1cjorwa.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((pu) it.next()).MdtA4re8.qoPGr6Ce));
        }
        return x5.CTE3lpUp(arrayList);
    }

    public void P7K7Inc8(Context context, AttributeSet attributeSet) {
        String valueOf;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, v00.VgvYg0wo);
        obtainAttributes.getClass();
        String string = obtainAttributes.getString(2);
        int i = 1;
        VM67d7Sv vM67d7Sv = this.MdtA4re8;
        if (string == null) {
            vM67d7Sv.qoPGr6Ce = 0;
            vM67d7Sv.wxUZMvaN = null;
        } else {
            vM67d7Sv.getClass();
            if (ba0.WYNAV5pd(string)) {
                m1.sjUBp5pO("Cannot have an empty route");
                return;
            }
            String concat = "android-app://androidx.navigation/".concat(string);
            ArrayList i7xS8jrb = le0.i7xS8jrb((LinkedHashMap) vM67d7Sv.VgvYg0wo, new qu(new mu(concat, null, null), i));
            if (!i7xS8jrb.isEmpty()) {
                StringBuilder b2ZJblxo2 = q70.b2ZJblxo("Cannot set route \"", string, "\" for destination ");
                b2ZJblxo2.append((pu) vM67d7Sv.NCTxEWno);
                b2ZJblxo2.append(". Following required arguments are missing: ");
                b2ZJblxo2.append(i7xS8jrb);
                throw new IllegalArgumentException(b2ZJblxo2.toString().toString());
            }
            vM67d7Sv.qoPGr6Ce = concat.hashCode();
            vM67d7Sv.wxUZMvaN = null;
        }
        vM67d7Sv.P7K7Inc8 = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            vM67d7Sv.qoPGr6Ce = resourceId;
            vM67d7Sv.wxUZMvaN = null;
            if (resourceId <= 16777215) {
                valueOf = String.valueOf(resourceId);
            } else {
                try {
                    valueOf = context.getResources().getResourceName(resourceId);
                    valueOf.getClass();
                } catch (Resources.NotFoundException unused) {
                    valueOf = String.valueOf(resourceId);
                }
            }
            vM67d7Sv.wxUZMvaN = valueOf;
        }
        this.VgvYg0wo = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0376, code lost:
    
        if (defpackage.le0.i7xS8jrb(r2, new defpackage.ku(r10, r5)).isEmpty() != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017f, code lost:
    
        if (r6 == false) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0379  */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, mu] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r5v24, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ou VgvYg0wo(f0 f0Var) {
        boolean z;
        boolean matches;
        ArrayList arrayList;
        int i;
        int i2;
        boolean matches2;
        cb0 cb0Var;
        ?? r24;
        int i3;
        int i4;
        ou ouVar;
        o20 o20Var;
        f0 qoPGr6Ce;
        List list;
        List list2;
        ArrayList arrayList2;
        int i5;
        Throwable th;
        f0 qoPGr6Ce2;
        f0 qoPGr6Ce3;
        ?? r10;
        VM67d7Sv vM67d7Sv = this.MdtA4re8;
        LinkedHashMap linkedHashMap = (LinkedHashMap) vM67d7Sv.VgvYg0wo;
        String str = (String) f0Var.VgvYg0wo;
        String str2 = (String) f0Var.wxUZMvaN;
        Uri uri = (Uri) f0Var.MdtA4re8;
        ArrayList arrayList3 = (ArrayList) vM67d7Sv.MdtA4re8;
        Throwable th2 = null;
        if (arrayList3.isEmpty()) {
            return null;
        }
        int size = arrayList3.size();
        ou ouVar2 = null;
        for (int i6 = 0; i6 < size; i6 = i2) {
            Object obj = arrayList3.get(i6);
            int i7 = i6 + 1;
            ?? r11 = (mu) obj;
            r11.getClass();
            cb0 cb0Var2 = r11.lDXGDhIF;
            cb0 cb0Var3 = r11.P7K7Inc8;
            String str3 = r11.MdtA4re8;
            String str4 = r11.NCTxEWno;
            Throwable th3 = th2;
            if (((o20) cb0Var3.getValue()) == null) {
                z = true;
                matches = true;
            } else if (uri == null) {
                z = true;
                matches = false;
            } else {
                z = true;
                o20 o20Var2 = (o20) cb0Var3.getValue();
                o20Var2.getClass();
                String uri2 = uri.toString();
                uri2.getClass();
                matches = o20Var2.NCTxEWno.matcher(uri2).matches();
            }
            if (matches) {
                if (str4 == null ? z : str2 == null ? false : str4.equals(str2)) {
                    if (str3 == null) {
                        matches2 = z;
                    } else if (str == null) {
                        matches2 = false;
                    } else {
                        o20 o20Var3 = (o20) cb0Var2.getValue();
                        o20Var3.getClass();
                        matches2 = o20Var3.NCTxEWno.matcher(str).matches();
                    }
                    if (matches2) {
                        if (uri != null) {
                            uri.getClass();
                            o20 o20Var4 = (o20) r11.P7K7Inc8.getValue();
                            if (o20Var4 == null || (qoPGr6Ce2 = o20Var4.qoPGr6Ce(uri.toString())) == null) {
                                arrayList = arrayList3;
                            } else {
                                arrayList = arrayList3;
                                final ?? VgvYg0wo = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                                if (r11.MdtA4re8(qoPGr6Ce2, VgvYg0wo, linkedHashMap) && (!((Boolean) r11.b2ZJblxo.getValue()).booleanValue() || r11.wxUZMvaN(uri, VgvYg0wo, linkedHashMap))) {
                                    String fragment = uri.getFragment();
                                    o20 o20Var5 = (o20) r11.OnDfzHZD.getValue();
                                    if (o20Var5 == null || (qoPGr6Ce3 = o20Var5.qoPGr6Ce(String.valueOf(fragment))) == null) {
                                        i = size;
                                        i2 = i7;
                                        cb0Var = cb0Var2;
                                    } else {
                                        List list3 = (List) r11.k3x7lurq.getValue();
                                        i = size;
                                        i2 = i7;
                                        cb0Var = cb0Var2;
                                        ArrayList arrayList4 = new ArrayList(z5.bvfAo0eO(list3, 10));
                                        Iterator it = list3.iterator();
                                        int i8 = 0;
                                        while (it.hasNext()) {
                                            Object next = it.next();
                                            Iterator it2 = it;
                                            int i9 = i8 + 1;
                                            if (i8 < 0) {
                                                y5.ZyZthT5G();
                                                throw th3;
                                            }
                                            String str5 = (String) next;
                                            ar NCTxEWno = ((br) qoPGr6Ce3.VgvYg0wo).NCTxEWno(i9);
                                            if (NCTxEWno != null) {
                                                String decode = Uri.decode(NCTxEWno.qoPGr6Ce);
                                                decode.getClass();
                                                r10 = decode;
                                            } else {
                                                r10 = th3;
                                            }
                                            if (r10 == 0) {
                                                r10 = "";
                                            }
                                            f0 f0Var2 = qoPGr6Ce3;
                                            try {
                                                mu.VgvYg0wo(VgvYg0wo, str5, r10, (tt) linkedHashMap.get(str5));
                                                arrayList4.add(xe0.qoPGr6Ce);
                                                i8 = i9;
                                                it = it2;
                                                qoPGr6Ce3 = f0Var2;
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }
                                    }
                                    final int i10 = 0;
                                    boolean isEmpty = le0.i7xS8jrb(linkedHashMap, new zk() { // from class: ku
                                        @Override // defpackage.zk
                                        public final Object ow5vqvCr(Object obj2) {
                                            boolean containsKey;
                                            int i11 = i10;
                                            Bundle bundle = VgvYg0wo;
                                            String str6 = (String) obj2;
                                            switch (i11) {
                                                case 0:
                                                    str6.getClass();
                                                    containsKey = bundle.containsKey(str6);
                                                    break;
                                                default:
                                                    str6.getClass();
                                                    containsKey = bundle.containsKey(str6);
                                                    break;
                                            }
                                            return Boolean.valueOf(!containsKey);
                                        }
                                    }).isEmpty();
                                    th = VgvYg0wo;
                                }
                            }
                            i = size;
                            i2 = i7;
                            cb0Var = cb0Var2;
                            th = th3;
                            r24 = th;
                        } else {
                            arrayList = arrayList3;
                            i = size;
                            i2 = i7;
                            cb0Var = cb0Var2;
                            r24 = th3;
                        }
                        String str6 = r11.qoPGr6Ce;
                        if (uri == null || str6 == null) {
                            i3 = 0;
                        } else {
                            List<String> pathSegments = uri.getPathSegments();
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            List<String> pathSegments2 = parse.getPathSegments();
                            pathSegments.getClass();
                            pathSegments2.getClass();
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            for (Object obj2 : pathSegments) {
                                if (pathSegments2.contains(obj2)) {
                                    linkedHashSet.add(obj2);
                                }
                            }
                            i3 = linkedHashSet.size();
                        }
                        boolean z2 = (str2 == null || !str2.equals(str4)) ? false : z;
                        if (str != null && str3 != null) {
                            o20 o20Var6 = (o20) cb0Var.getValue();
                            o20Var6.getClass();
                            if (o20Var6.NCTxEWno.matcher(str).matches()) {
                                Pattern compile = Pattern.compile("/");
                                compile.getClass();
                                Matcher matcher = compile.matcher(str3);
                                if (matcher.find()) {
                                    ArrayList arrayList5 = new ArrayList(10);
                                    int i11 = 0;
                                    while (true) {
                                        arrayList5.add(str3.subSequence(i11, matcher.start()).toString());
                                        i11 = matcher.end();
                                        if (!matcher.find()) {
                                            break;
                                        }
                                        z = true;
                                    }
                                    arrayList5.add(str3.subSequence(i11, str3.length()).toString());
                                    list = arrayList5;
                                } else {
                                    list = ra.FySoLYna(str3.toString());
                                }
                                boolean isEmpty2 = list.isEmpty();
                                List list4 = wf.NCTxEWno;
                                if (!isEmpty2) {
                                    ListIterator listIterator = list.listIterator(list.size());
                                    while (listIterator.hasPrevious()) {
                                        if (((String) listIterator.previous()).length() != 0) {
                                            list2 = x5.N2kLh4D5(list, listIterator.nextIndex() + 1);
                                            break;
                                        }
                                    }
                                }
                                list2 = list4;
                                String str7 = (String) list2.get(0);
                                String str8 = (String) list2.get(z ? 1 : 0);
                                Pattern compile2 = Pattern.compile("/");
                                compile2.getClass();
                                Matcher matcher2 = compile2.matcher(str);
                                if (matcher2.find()) {
                                    ArrayList arrayList6 = new ArrayList(10);
                                    int i12 = 0;
                                    do {
                                        arrayList6.add(str.subSequence(i12, matcher2.start()).toString());
                                        i12 = matcher2.end();
                                    } while (matcher2.find());
                                    arrayList6.add(str.subSequence(i12, str.length()).toString());
                                    arrayList2 = arrayList6;
                                } else {
                                    arrayList2 = ra.FySoLYna(str.toString());
                                }
                                if (!arrayList2.isEmpty()) {
                                    ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                                    while (listIterator2.hasPrevious()) {
                                        if (((String) listIterator2.previous()).length() != 0) {
                                            i5 = 1;
                                            list4 = x5.N2kLh4D5(arrayList2, listIterator2.nextIndex() + 1);
                                            break;
                                        }
                                    }
                                }
                                i5 = 1;
                                String str9 = (String) list4.get(0);
                                String str10 = (String) list4.get(i5);
                                i4 = fn.qoPGr6Ce(str7, str9) ? 2 : 0;
                                if (fn.qoPGr6Ce(str8, str10)) {
                                    i4++;
                                }
                                if (r24 == 0) {
                                    if (z2 || i4 > -1) {
                                        final Bundle VgvYg0wo2 = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                                        if (uri != null && (o20Var = (o20) cb0Var3.getValue()) != null && (qoPGr6Ce = o20Var.qoPGr6Ce(uri.toString())) != null) {
                                            r11.MdtA4re8(qoPGr6Ce, VgvYg0wo2, linkedHashMap);
                                            if (((Boolean) r11.b2ZJblxo.getValue()).booleanValue()) {
                                                r11.wxUZMvaN(uri, VgvYg0wo2, linkedHashMap);
                                            }
                                        }
                                        final int i13 = 1;
                                    }
                                    th2 = th3;
                                    arrayList3 = arrayList;
                                    size = i;
                                }
                                ouVar = new ou((pu) vM67d7Sv.NCTxEWno, r24, r11.sjUBp5pO, i3, z2, i4);
                                if (ouVar2 != null || ouVar.compareTo(ouVar2) > 0) {
                                    th2 = th3;
                                    ouVar2 = ouVar;
                                    arrayList3 = arrayList;
                                    size = i;
                                }
                                th2 = th3;
                                arrayList3 = arrayList;
                                size = i;
                            }
                        }
                        i4 = -1;
                        if (r24 == 0) {
                        }
                        ouVar = new ou((pu) vM67d7Sv.NCTxEWno, r24, r11.sjUBp5pO, i3, z2, i4);
                        if (ouVar2 != null) {
                        }
                        th2 = th3;
                        ouVar2 = ouVar;
                        arrayList3 = arrayList;
                        size = i;
                    }
                }
            }
            arrayList = arrayList3;
            i = size;
            i2 = i7;
            th2 = th3;
            arrayList3 = arrayList;
            size = i;
        }
        return ouVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof pu)) {
                VM67d7Sv vM67d7Sv = this.MdtA4re8;
                ArrayList arrayList = (ArrayList) vM67d7Sv.MdtA4re8;
                pu puVar = (pu) obj;
                a80 a80Var = puVar.P7K7Inc8;
                VM67d7Sv vM67d7Sv2 = puVar.MdtA4re8;
                boolean equals = arrayList.equals((ArrayList) vM67d7Sv2.MdtA4re8);
                a80 a80Var2 = this.P7K7Inc8;
                if (a80Var2.MdtA4re8() == a80Var.MdtA4re8()) {
                    Iterator it = l60.I5GHvsYW(new b80(a80Var2)).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!fn.qoPGr6Ce(ej0.eVhOlqcC(a80Var2, intValue), ej0.eVhOlqcC(a80Var, intValue))) {
                        }
                    }
                    z = true;
                    if (wxUZMvaN().size() == puVar.wxUZMvaN().size()) {
                        Set<Map.Entry> entrySet = wxUZMvaN().entrySet();
                        entrySet.getClass();
                        for (Map.Entry entry : entrySet) {
                            if (puVar.wxUZMvaN().containsKey(entry.getKey()) && fn.qoPGr6Ce(puVar.wxUZMvaN().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z2 = true;
                        if (vM67d7Sv.qoPGr6Ce == vM67d7Sv2.qoPGr6Ce || !fn.qoPGr6Ce((String) vM67d7Sv.P7K7Inc8, (String) vM67d7Sv2.P7K7Inc8) || !equals || !z || !z2) {
                        }
                    }
                    z2 = false;
                    if (vM67d7Sv.qoPGr6Ce == vM67d7Sv2.qoPGr6Ce) {
                    }
                }
                z = false;
                if (wxUZMvaN().size() == puVar.wxUZMvaN().size()) {
                }
                z2 = false;
                if (vM67d7Sv.qoPGr6Ce == vM67d7Sv2.qoPGr6Ce) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        VM67d7Sv vM67d7Sv = this.MdtA4re8;
        int i = vM67d7Sv.qoPGr6Ce * 31;
        String str = (String) vM67d7Sv.P7K7Inc8;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) vM67d7Sv.MdtA4re8;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            mu muVar = (mu) obj;
            int i3 = hashCode * 31;
            String str2 = muVar.qoPGr6Ce;
            int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = muVar.NCTxEWno;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = muVar.MdtA4re8;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        a80 a80Var = this.P7K7Inc8;
        a80Var.getClass();
        int i4 = 0;
        while (true) {
            if (!(i4 < a80Var.MdtA4re8())) {
                break;
            }
            int i5 = i4 + 1;
            st stVar = (st) a80Var.wxUZMvaN(i4);
            int i6 = ((hashCode * 31) + stVar.qoPGr6Ce) * 31;
            xu xuVar = stVar.NCTxEWno;
            hashCode = i6 + (xuVar != null ? xuVar.hashCode() : 0);
            Bundle bundle = stVar.MdtA4re8;
            if (bundle != null) {
                hashCode = e50.wxUZMvaN(bundle) + (hashCode * 31);
            }
            i4 = i5;
        }
        for (String str5 : wxUZMvaN().keySet()) {
            int MdtA4re8 = q70.MdtA4re8(str5, hashCode * 31, 31);
            Object obj2 = wxUZMvaN().get(str5);
            hashCode = MdtA4re8 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public final Bundle qoPGr6Ce(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.MdtA4re8.VgvYg0wo;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle VgvYg0wo = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            tt ttVar = (tt) entry.getValue();
            ttVar.getClass();
            str.getClass();
            if (ttVar.MdtA4re8 && (obj = ttVar.wxUZMvaN) != null) {
                ttVar.qoPGr6Ce.VgvYg0wo(VgvYg0wo, str, obj);
            }
        }
        if (bundle != null) {
            VgvYg0wo.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                tt ttVar2 = (tt) entry2.getValue();
                ttVar2.getClass();
                ev evVar = ttVar2.qoPGr6Ce;
                str2.getClass();
                if (ttVar2.NCTxEWno || !VgvYg0wo.containsKey(str2) || !m50.b2ZJblxo(str2, VgvYg0wo)) {
                    try {
                        evVar.qoPGr6Ce(str2, VgvYg0wo);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder b2ZJblxo2 = q70.b2ZJblxo("Wrong argument type for '", str2, "' in argument savedState. ");
                b2ZJblxo2.append(evVar.NCTxEWno());
                b2ZJblxo2.append(" expected.");
                throw new IllegalArgumentException(b2ZJblxo2.toString().toString());
            }
        }
        return VgvYg0wo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("(");
        VM67d7Sv vM67d7Sv = this.MdtA4re8;
        String str = (String) vM67d7Sv.wxUZMvaN;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(vM67d7Sv.qoPGr6Ce));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = (String) vM67d7Sv.P7K7Inc8;
        if (str2 != null && !ba0.WYNAV5pd(str2)) {
            sb.append(" route=");
            sb.append((String) vM67d7Sv.P7K7Inc8);
        }
        if (this.VgvYg0wo != null) {
            sb.append(" label=");
            sb.append(this.VgvYg0wo);
        }
        return sb.toString();
    }

    public final Map wxUZMvaN() {
        return zq.LfKQckgD((LinkedHashMap) this.MdtA4re8.VgvYg0wo);
    }
}
