package defpackage;

import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class vv extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ArrayList s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(ArrayList arrayList) {
        super(1);
        this.r = 0;
        rv rvVar = rv.a;
        this.s = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2;
        switch (this.r) {
            case 0:
                break;
            case 1:
                this.s.get(((Number) obj).intValue());
                break;
            case 2:
                jsk jskVar = (jsk) obj;
                ArrayList arrayList = this.s;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    jsk.g(jskVar, (ksk) arrayList.get(i3), 0, 0);
                }
                break;
            case 3:
                jsk jskVar2 = (jsk) obj;
                ArrayList arrayList2 = this.s;
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    int i4 = 0;
                    while (true) {
                        jsk.g(jskVar2, (ksk) arrayList2.get(i4), 0, 0);
                        if (i4 != size2) {
                            i4++;
                        }
                    }
                }
                break;
            case 4:
                jsk jskVar3 = (jsk) obj;
                ArrayList arrayList3 = this.s;
                int size3 = arrayList3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    jskVar3.d((ksk) arrayList3.get(i5), 0, 0, 0.0f);
                }
                break;
            case 5:
                jsk jskVar4 = (jsk) obj;
                ArrayList arrayList4 = this.s;
                int size4 = arrayList4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    jsk.g(jskVar4, (ksk) arrayList4.get(i6), 0, 0);
                }
                break;
            case 6:
                this.s.get(((Number) obj).intValue());
                break;
            case 7:
                this.s.get(((Number) obj).intValue());
                break;
            case 8:
                hcj hcjVar = (hcj) this.s.get(((Number) obj).intValue());
                if (hcjVar instanceof fcj) {
                    i = 1;
                } else if (!(hcjVar instanceof gcj)) {
                    b6e.s();
                    break;
                } else {
                    i = 2;
                }
                break;
            case 9:
                this.s.get(((Number) obj).intValue());
                break;
            case 10:
                this.s.get(((Number) obj).intValue());
                break;
            case 11:
                this.s.get(((Number) obj).intValue());
                break;
            case 12:
                this.s.get(((Number) obj).intValue());
                break;
            case 13:
                this.s.get(((Number) obj).intValue());
                break;
            case 14:
                this.s.get(((Number) obj).intValue());
                break;
            case 15:
                this.s.get(((Number) obj).intValue());
                break;
            case 16:
                this.s.get(((Number) obj).intValue());
                break;
            case 17:
                this.s.get(((Number) obj).intValue());
                break;
            case 18:
                this.s.get(((Number) obj).intValue());
                break;
            case 19:
                oyc oycVar = (oyc) obj;
                oycVar.getClass();
                break;
            case 20:
                oyc oycVar2 = (oyc) obj;
                oycVar2.getClass();
                break;
            case 21:
                oyc oycVar3 = (oyc) obj;
                oycVar3.getClass();
                break;
            case 22:
                oyc oycVar4 = (oyc) obj;
                oycVar4.getClass();
                break;
            case 23:
                this.s.get(((Number) obj).intValue());
                break;
            case 24:
                this.s.get(((Number) obj).intValue());
                break;
            case 25:
                this.s.get(((Number) obj).intValue());
                break;
            case 26:
                this.s.get(((Number) obj).intValue());
                break;
            case 27:
                jsk jskVar5 = (jsk) obj;
                ArrayList arrayList5 = this.s;
                int size5 = arrayList5.size();
                int i7 = 0;
                while (i7 < size5) {
                    nfh nfhVar = (nfh) arrayList5.get(i7);
                    List list = nfhVar.b;
                    boolean z = nfhVar.i;
                    if (nfhVar.m == Integer.MIN_VALUE) {
                        vme.a("position() should be called first");
                    }
                    int size6 = list.size();
                    int i8 = 0;
                    while (i8 < size6) {
                        ksk kskVar = (ksk) list.get(i8);
                        int[] iArr = nfhVar.k;
                        int i9 = i8 * 2;
                        int i10 = i7;
                        long j = (iArr[i9 + 1] & 4294967295L) | (iArr[i9] << 32);
                        if (nfhVar.h) {
                            int i11 = z ? (int) (j >> 32) : (nfhVar.m - ((int) (j >> 32))) - (z ? kskVar.b : kskVar.a);
                            j = ((z ? (nfhVar.m - ((int) (j & 4294967295L))) - (z ? kskVar.b : kskVar.a) : (int) (j & 4294967295L)) & 4294967295L) | (i11 << 32);
                        }
                        long d = wpe.d(j, nfhVar.c);
                        if (z) {
                            jsk.m(jskVar5, kskVar, d);
                        } else {
                            jsk.k(jskVar5, kskVar, d);
                        }
                        i8++;
                        i7 = i10;
                    }
                    i7++;
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                this.s.get(((Number) obj).intValue());
                break;
            default:
                ozl ozlVar = (ozl) this.s.get(((Number) obj).intValue());
                if (ozlVar instanceof jzl) {
                    i2 = 1;
                } else if (ozlVar instanceof kzl) {
                    i2 = 2;
                } else if (ozlVar instanceof lzl) {
                    i2 = 3;
                } else if (!(ozlVar instanceof nzl)) {
                    b6e.s();
                    break;
                } else {
                    i2 = 4;
                }
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vv(ArrayList arrayList, int i) {
        super(1);
        this.r = i;
        this.s = arrayList;
    }
}
