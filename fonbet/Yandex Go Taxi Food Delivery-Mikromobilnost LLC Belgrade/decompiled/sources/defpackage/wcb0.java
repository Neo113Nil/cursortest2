package defpackage;

import com.ybsdk.feature.pfm.internal.ui.PfmTransactionsDataSkeletonType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wcb0 {
    public final List a;
    public final u8j0 b;
    public final List c;
    public final PfmTransactionsDataSkeletonType d;
    public final String e;
    public final String f;
    public final Set g;
    public final s4r h;
    public final yfq0 i;

    public wcb0(List list, u8j0 u8j0Var, List list2, PfmTransactionsDataSkeletonType pfmTransactionsDataSkeletonType, String str, String str2, Set set, s4r s4rVar, yfq0 yfq0Var) {
        this.a = list;
        this.b = u8j0Var;
        this.c = list2;
        this.d = pfmTransactionsDataSkeletonType;
        this.e = str;
        this.f = str2;
        this.g = set;
        this.h = s4rVar;
        this.i = yfq0Var;
    }

    public static wcb0 a(wcb0 wcb0Var, u8j0 u8j0Var, List list, PfmTransactionsDataSkeletonType pfmTransactionsDataSkeletonType, String str, String str2, Set set, s4r s4rVar, yfq0 yfq0Var, int i) {
        u8j0 u8j0Var2 = u8j0Var;
        List list2 = wcb0Var.a;
        if ((i & 2) != 0) {
            u8j0Var2 = wcb0Var.b;
        }
        if ((i & 4) != 0) {
            list = wcb0Var.c;
        }
        if ((i & 8) != 0) {
            pfmTransactionsDataSkeletonType = wcb0Var.d;
        }
        if ((i & 16) != 0) {
            str = wcb0Var.e;
        }
        if ((i & 32) != 0) {
            str2 = wcb0Var.f;
        }
        if ((i & 64) != 0) {
            set = wcb0Var.g;
        }
        if ((i & 128) != 0) {
            s4rVar = wcb0Var.h;
        }
        if ((i & 256) != 0) {
            yfq0Var = wcb0Var.i;
        }
        yfq0 yfq0Var2 = yfq0Var;
        wcb0Var.getClass();
        s4r s4rVar2 = s4rVar;
        Set set2 = set;
        String str3 = str2;
        String str4 = str;
        PfmTransactionsDataSkeletonType pfmTransactionsDataSkeletonType2 = pfmTransactionsDataSkeletonType;
        return new wcb0(list2, u8j0Var2, list, pfmTransactionsDataSkeletonType2, str4, str3, set2, s4rVar2, yfq0Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final g9b0 b(List list) {
        g9b0 g9b0Var;
        Set d = d();
        if (d != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            g9b0 g9b0Var2 = null;
            while (it.hasNext()) {
                String str = ((h9b0) it.next()).a;
                Iterator it2 = d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        g9b0Var = 0;
                        break;
                    }
                    g9b0Var = it2.next();
                    if (((g9b0) g9b0Var).b.equals(str)) {
                        break;
                    }
                }
                g9b0Var2 = g9b0Var;
                if (g9b0Var2 != null) {
                    d = g9b0Var2.d;
                }
            }
            return g9b0Var2;
        }
        return null;
    }

    public final Set c() {
        List list = this.i.a;
        Set d = d();
        if (d == null) {
            return EmptySet.a;
        }
        if (!list.isEmpty()) {
            g9b0 b = b(list);
            if (b != null && b.a()) {
                return b.d;
            }
            List K = a.K(list);
            Set set = null;
            if (K.isEmpty()) {
                K = null;
            }
            if (K != null) {
                g9b0 b2 = b(K);
                Set set2 = b2 != null ? b2.d : null;
                if (set2 != null && !set2.isEmpty()) {
                    set = set2;
                }
            }
            if (set != null) {
                return set;
            }
        }
        return d;
    }

    public final Set d() {
        LinkedHashMap linkedHashMap;
        r9b0 r9b0Var = (r9b0) this.b.a();
        if (r9b0Var != null) {
            linkedHashMap = new LinkedHashMap(r9b0Var.e);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                r9b0 r9b0Var2 = (r9b0) ((u8j0) it.next()).a();
                if (r9b0Var2 != null) {
                    linkedHashMap.putAll(r9b0Var2.e);
                }
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        String str = this.e;
        return (Set) linkedHashMap.get(str != null ? new rcb0(str) : null);
    }

    public final Set e() {
        r9b0 r9b0Var;
        r9b0 r9b0Var2 = (r9b0) this.b.a();
        Set set = null;
        Set set2 = r9b0Var2 != null ? r9b0Var2.c : null;
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof r8j0) {
                arrayList.add(obj);
            }
        }
        r8j0 r8j0Var = (r8j0) a.b0(arrayList);
        if (r8j0Var != null && (r9b0Var = (r9b0) r8j0Var.a()) != null) {
            set = r9b0Var.c;
        }
        return set == null ? set2 : set;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (this != obj) {
            if (obj instanceof wcb0) {
                wcb0 wcb0Var = (wcb0) obj;
                if (this.a.equals(wcb0Var.a) && this.b.equals(wcb0Var.b) && this.c.equals(wcb0Var.c) && this.d == wcb0Var.d) {
                    String str = wcb0Var.e;
                    String str2 = this.e;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals) {
                                String str3 = wcb0Var.f;
                                String str4 = this.f;
                                if (str4 == null) {
                                    if (str3 == null) {
                                        equals2 = true;
                                        if (equals2 && jl40.l(this.g, wcb0Var.g) && jl40.l(this.h, wcb0Var.h) && this.i.equals(wcb0Var.i)) {
                                        }
                                    }
                                    equals2 = false;
                                    if (equals2) {
                                    }
                                } else {
                                    if (str3 != null) {
                                        equals2 = str4.equals(str3);
                                        if (equals2) {
                                        }
                                    }
                                    equals2 = false;
                                    if (equals2) {
                                    }
                                }
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int e = g8e.e(this.g, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        s4r s4rVar = this.h;
        return this.i.a.hashCode() + ((e + (s4rVar != null ? s4rVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.e;
        String a = str == null ? "null" : rcb0.a(str);
        String str2 = this.f;
        String a2 = str2 != null ? rcb0.a(str2) : "null";
        StringBuilder sb = new StringBuilder("PfmState(bottomBarItems=");
        sb.append(this.a);
        sb.append(", pfmTransactionsInitialResult=");
        sb.append(this.b);
        sb.append(", pfmTransactionsPagingResult=");
        sb.append(this.c);
        sb.append(", pfmTransactionsDataSkeletonType=");
        sb.append(this.d);
        sb.append(", currentSectionKey=");
        g8e.D(sb, a, ", fallbackDateFilerAfterResetSectionKey=", a2, ", selectedFilters=");
        sb.append(this.g);
        sb.append(", bottomSheetContent=");
        sb.append(this.h);
        sb.append(", selectedCategoriesInfo=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
