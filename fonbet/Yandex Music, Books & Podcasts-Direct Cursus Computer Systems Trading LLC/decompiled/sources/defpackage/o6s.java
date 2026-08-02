package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.data.Format;
import ru.yandex.video.m3.data.TargetFormat;

/* loaded from: classes6.dex */
public final class o6s extends y8p {
    public final TargetFormat d;
    public final boolean e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6s(TargetFormat targetFormat, arr arrVar, arr arrVar2, boolean z, int i) {
        super(arrVar, arrVar2);
        arrVar.getClass();
        this.d = targetFormat;
        this.e = z;
        this.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0239  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [c5b] */
    @Override // defpackage.y8p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a8w d(xvs xvsVar, int[] iArr, yk2 yk2Var, yde ydeVar) {
        int[] iArr2;
        String str;
        List list;
        ?? r4;
        int[] iArr3 = iArr;
        xvsVar.getClass();
        iArr3.getClass();
        yk2Var.getClass();
        ydeVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int length = iArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            dsc dscVar = xvsVar.d[iArr3[i2]];
            dscVar.getClass();
            Format format = new Format(dscVar.u, dscVar.v, dscVar.j);
            arrayList.add(format);
            List list2 = (List) linkedHashMap.get(Integer.valueOf(format.getHeight()));
            if (list2 == null) {
                list2 = new ArrayList();
            }
            list2.add(new n6s(iArr3[i2], format));
            linkedHashMap.put(Integer.valueOf(format.getHeight()), list2);
        }
        List list3 = c5b.a;
        TargetFormat targetFormat = this.d;
        boolean z = true;
        r0t r0tVar = null;
        if (targetFormat != null) {
            if (this.e) {
                r4 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    int i3 = this.f;
                    if (i3 <= 0) {
                        Iterator it = ((Iterable) entry.getValue()).iterator();
                        if (!it.hasNext()) {
                            wvs.n();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int bitrate = ((n6s) next).b.getBitrate();
                            do {
                                Object next2 = it.next();
                                int bitrate2 = ((n6s) next2).b.getBitrate();
                                if (bitrate < bitrate2) {
                                    next = next2;
                                    bitrate = bitrate2;
                                }
                            } while (it.hasNext());
                        }
                        r4.add(next);
                    } else {
                        r4.add(CollectionsKt.o0((Iterable) entry.getValue(), new t1n(8)).get(Math.min(i3, ((List) entry.getValue()).size() - 1)));
                    }
                }
            } else {
                loop9: for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    List list4 = (List) entry2.getValue();
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            Format format2 = ((n6s) it2.next()).b;
                            if (format2.getHeight() < targetFormat.getMinSize().getHeight() || format2.getWidth() < targetFormat.getMinSize().getWidth() || format2.getHeight() > targetFormat.getMaxSize().getHeight() || format2.getWidth() > targetFormat.getMaxSize().getWidth()) {
                            }
                        }
                    }
                    r4 = (List) entry2.getValue();
                }
                r4 = c5b.a;
            }
            if (r4.size() <= 1) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it3 = ((Iterable) entry3.getValue()).iterator();
                    while (it3.hasNext()) {
                        linkedHashSet.add(Integer.valueOf(((n6s) it3.next()).b.getBitrate()));
                    }
                    linkedHashMap2.put(entry3.getKey(), Integer.valueOf(linkedHashSet.size()));
                }
                Set keySet = linkedHashMap.keySet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : keySet) {
                    Integer num = (Integer) linkedHashMap2.get(Integer.valueOf(((Number) obj).intValue()));
                    if ((num != null ? num.intValue() : 0) > 1) {
                        arrayList2.add(obj);
                    }
                }
                List list5 = (List) linkedHashMap.get((Integer) CollectionsKt.b0(arrayList2));
                if (list5 == null) {
                    list5 = c5b.a;
                }
                if (list5.size() > 1) {
                    list3 = list5;
                    str = "FEW_USABLE_FORMATS_FALLBACK";
                    if (list3.isEmpty()) {
                        if (list3.size() != 1) {
                            List list6 = list3;
                            if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                                Iterator it4 = list6.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    if (!(((n6s) it4.next()).b.getBitrate() == ((n6s) list3.get(0)).b.getBitrate())) {
                                        z = false;
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                iArr3 = new int[list3.size()];
                                for (Object obj2 : list6) {
                                    int i4 = i + 1;
                                    if (i < 0) {
                                        u75.n();
                                        throw null;
                                    }
                                    iArr3[i] = ((n6s) obj2).a;
                                    i = i4;
                                }
                            }
                        }
                        str = "JUST_ONE_USABLE_FORMATS";
                    } else {
                        str = "ZERO_USABLE_FORMATS";
                    }
                }
            }
            str = null;
            list3 = r4;
            if (list3.isEmpty()) {
            }
        } else {
            Iterator it5 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                if (((List) ((Map.Entry) it5.next()).getValue()).size() > 1) {
                    i = 1;
                    break;
                }
            }
            if (i == 0) {
                iArr2 = iArr3;
                str = null;
                list = list3;
                if (str != null) {
                    List list7 = list;
                    ArrayList arrayList3 = new ArrayList(v75.o(list7, 10));
                    Iterator it6 = list7.iterator();
                    while (it6.hasNext()) {
                        arrayList3.add(((n6s) it6.next()).b);
                    }
                    r0tVar = new r0t(str, targetFormat, arrayList, arrayList3);
                }
                long j = 25000;
                return new p6s(r0tVar, (arr) this.b, xvsVar, iArr2, yk2Var, 10000, j, j, ydeVar, (arr) this.c);
            }
            str = "TOO_MANY_USABLE_FORMATS";
        }
        iArr2 = iArr3;
        list = list3;
        if (str != null) {
        }
        long j2 = 25000;
        return new p6s(r0tVar, (arr) this.b, xvsVar, iArr2, yk2Var, 10000, j2, j2, ydeVar, (arr) this.c);
    }
}
