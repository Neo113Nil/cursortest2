package defpackage;

import android.util.Pair;
import androidx.media3.common.a;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public abstract class yv00 extends x001 {
    private xv00 currentMappedTrackInfo;

    public final xv00 getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // defpackage.x001
    public final void onSelectionActivated(Object obj) {
        this.currentMappedTrackInfo = (xv00) obj;
    }

    public abstract Pair selectTracks(xv00 xv00Var, int[][][] iArr, int[] iArr2, sf10 sf10Var, a9z0 a9z0Var);

    @Override // defpackage.x001
    public final y001 selectTracks(iyi0[] iyi0VarArr, yzz0 yzz0Var, sf10 sf10Var, a9z0 a9z0Var) throws ExoPlaybackException {
        int[][][] iArr;
        int i;
        boolean z;
        int[] iArr2;
        yzz0 yzz0Var2 = yzz0Var;
        boolean z2 = true;
        int[] iArr3 = new int[iyi0VarArr.length + 1];
        int length = iyi0VarArr.length + 1;
        xzz0[][] xzz0VarArr = new xzz0[length][];
        int[][][] iArr4 = new int[iyi0VarArr.length + 1][][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = yzz0Var2.a;
            xzz0VarArr[i2] = new xzz0[i3];
            iArr4[i2] = new int[i3][];
        }
        int length2 = iyi0VarArr.length;
        int[] iArr5 = new int[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            iArr5[i4] = iyi0VarArr[i4].supportsMixedMimeTypeAdaptation();
        }
        int i5 = 0;
        while (i5 < yzz0Var2.a) {
            xzz0 a = yzz0Var2.a(i5);
            int i6 = a.c;
            a[] aVarArr = a.d;
            int i7 = a.a;
            boolean z3 = i6 == 5 ? z2 : false;
            int length3 = iyi0VarArr.length;
            boolean z4 = z2;
            int i8 = 0;
            int i9 = 0;
            while (i8 < iyi0VarArr.length) {
                iyi0 iyi0Var = iyi0VarArr[i8];
                int i10 = 0;
                int i11 = 0;
                while (i11 < i7) {
                    i10 = Math.max(i10, iyi0Var.supportsFormat(aVarArr[i11]) & 7);
                    i11++;
                    iArr3 = iArr3;
                }
                int[] iArr6 = iArr3;
                boolean z5 = iArr6[i8] == 0 ? z4 : false;
                if (i10 > i9 || (i10 == i9 && z3 && !z4 && z5)) {
                    i9 = i10;
                    z4 = z5;
                    length3 = i8;
                }
                i8++;
                iArr3 = iArr6;
            }
            int[] iArr7 = iArr3;
            if (length3 == iyi0VarArr.length) {
                iArr2 = new int[i7];
            } else {
                iyi0 iyi0Var2 = iyi0VarArr[length3];
                int[] iArr8 = new int[i7];
                for (int i12 = 0; i12 < i7; i12++) {
                    iArr8[i12] = iyi0Var2.supportsFormat(aVarArr[i12]);
                }
                iArr2 = iArr8;
            }
            int i13 = iArr7[length3];
            xzz0VarArr[length3][i13] = a;
            iArr4[length3][i13] = iArr2;
            iArr7[length3] = i13 + 1;
            i5++;
            yzz0Var2 = yzz0Var;
            z2 = z4;
            iArr3 = iArr7;
        }
        int[] iArr9 = iArr3;
        boolean z6 = z2;
        yzz0[] yzz0VarArr = new yzz0[iyi0VarArr.length];
        String[] strArr = new String[iyi0VarArr.length];
        int[] iArr10 = new int[iyi0VarArr.length];
        for (int i14 = 0; i14 < iyi0VarArr.length; i14++) {
            int i15 = iArr9[i14];
            yzz0VarArr[i14] = new yzz0((xzz0[]) tw21.Y(i15, xzz0VarArr[i14]));
            iArr4[i14] = (int[][]) tw21.Y(i15, iArr4[i14]);
            strArr[i14] = iyi0VarArr[i14].getName();
            iArr10[i14] = iyi0VarArr[i14].getTrackType();
        }
        xv00 xv00Var = new xv00(iArr10, yzz0VarArr, iArr5, iArr4, new yzz0((xzz0[]) tw21.Y(iArr9[iyi0VarArr.length], xzz0VarArr[iyi0VarArr.length])));
        Pair selectTracks = selectTracks(xv00Var, iArr4, iArr5, sf10Var, a9z0Var);
        l001[] l001VarArr = (l001[]) selectTracks.second;
        List[] listArr = new List[l001VarArr.length];
        for (int i16 = 0; i16 < l001VarArr.length; i16++) {
            l001 l001Var = l001VarArr[i16];
            listArr[i16] = l001Var != null ? ImmutableList.r(l001Var) : ImmutableList.p();
        }
        ImmutableList.a aVar = new ImmutableList.a();
        int i17 = 0;
        while (i17 < xv00Var.a) {
            yzz0[] yzz0VarArr2 = xv00Var.c;
            yzz0 yzz0Var3 = yzz0VarArr2[i17];
            List list = listArr[i17];
            int i18 = 0;
            while (i18 < yzz0Var3.a) {
                xzz0 a2 = yzz0Var3.a(i18);
                int i19 = yzz0VarArr2[i17].a(i18).a;
                int[] iArr11 = new int[i19];
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    iArr = xv00Var.e;
                    if (i20 >= i19) {
                        break;
                    }
                    if ((iArr[i17][i18][i20] & 7) == 4) {
                        iArr11[i21] = i20;
                        i21++;
                    }
                    i20++;
                }
                int[] copyOf = Arrays.copyOf(iArr11, i21);
                int i22 = 16;
                String str = null;
                List[] listArr2 = listArr;
                int i23 = 0;
                boolean z7 = false;
                int i24 = 0;
                while (i23 < copyOf.length) {
                    String str2 = yzz0VarArr2[i17].a(i18).d[copyOf[i23]].n;
                    int i25 = i24 + 1;
                    if (i24 == 0) {
                        str = str2;
                    } else {
                        z7 |= !Objects.equals(str, str2);
                    }
                    i22 = Math.min(i22, iArr[i17][i18][i23] & 24);
                    i23++;
                    i24 = i25;
                }
                if (z7) {
                    i22 = Math.min(i22, xv00Var.d[i17]);
                }
                boolean z8 = i22 != 0 ? z6 : false;
                int i26 = a2.a;
                int[] iArr12 = new int[i26];
                boolean[] zArr = new boolean[i26];
                int i27 = 0;
                while (i27 < a2.a) {
                    iArr12[i27] = iArr[i17][i18][i27] & 7;
                    int i28 = 0;
                    while (true) {
                        if (i28 >= list.size()) {
                            i = i17;
                            z = false;
                            break;
                        }
                        l001 l001Var2 = (l001) list.get(i28);
                        i = i17;
                        if (l001Var2.getTrackGroup().equals(a2) && l001Var2.indexOf(i27) != -1) {
                            z = z6;
                            break;
                        }
                        i28++;
                        i17 = i;
                    }
                    zArr[i27] = z;
                    i27++;
                    i17 = i;
                }
                aVar.a(new q801(a2, z8, iArr12, zArr));
                i18++;
                i17 = i17;
                listArr = listArr2;
            }
            i17++;
        }
        int i29 = 0;
        while (true) {
            yzz0 yzz0Var4 = xv00Var.f;
            if (i29 >= yzz0Var4.a) {
                return new y001((lyi0[]) selectTracks.first, (loo[]) selectTracks.second, new r801(aVar.g()), xv00Var);
            }
            xzz0 a3 = yzz0Var4.a(i29);
            int[] iArr13 = new int[a3.a];
            Arrays.fill(iArr13, 0);
            aVar.a(new q801(a3, false, iArr13, new boolean[a3.a]));
            i29++;
        }
    }
}
