package N6;

import android.graphics.Color;
import com.google.android.gms.internal.ads.C4159xO;
import com.google.android.gms.internal.ads.InterfaceC3529lo;
import com.google.android.gms.internal.ads.InterfaceC3742pl;
import com.google.android.gms.internal.ads.InterfaceC4213yO;
import com.google.android.gms.internal.ads.X6;
import h1.D;
import i1.AbstractC4579a;
import j1.AbstractC4603g;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i implements InterfaceC3742pl, InterfaceC3529lo, D {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1973n;

    /* renamed from: u, reason: collision with root package name */
    public int f1974u;

    public /* synthetic */ i(int i) {
        this.f1973n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public /* synthetic */ void mo1a(Object obj) {
        switch (this.f1973n) {
            case 4:
                ((t2.l) obj).H3(this.f1974u);
                break;
            case 8:
                ((InterfaceC4213yO) obj).b(this.f1974u);
                break;
            case 9:
                ((InterfaceC4213yO) obj).d(this.f1974u);
                break;
            default:
                ((InterfaceC4213yO) obj).a(this.f1974u);
                break;
        }
    }

    @Override // h1.D
    public Object b(AbstractC4579a abstractC4579a, float f3) {
        int i;
        int i6;
        int argb;
        float f9;
        ArrayList arrayList = new ArrayList();
        int i9 = 1;
        int i10 = 0;
        boolean z3 = abstractC4579a.I() == 1;
        if (z3) {
            abstractC4579a.b();
        }
        while (abstractC4579a.D()) {
            arrayList.add(Float.valueOf((float) abstractC4579a.F()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f1974u = 2;
        }
        if (z3) {
            abstractC4579a.z();
        }
        if (this.f1974u == -1) {
            this.f1974u = arrayList.size() / 4;
        }
        int i11 = this.f1974u;
        float[] fArr = new float[i11];
        int[] iArr = new int[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i = this.f1974u * 4;
            if (i12 >= i) {
                break;
            }
            int i15 = i12 / 4;
            double floatValue = ((Float) arrayList.get(i12)).floatValue();
            int i16 = i10;
            int i17 = i12 % 4;
            if (i17 == 0) {
                if (i15 > 0) {
                    float f10 = (float) floatValue;
                    if (fArr[i15 - 1] >= f10) {
                        fArr[i15] = f10 + 0.01f;
                    }
                }
                fArr[i15] = (float) floatValue;
            } else if (i17 == i9) {
                i13 = (int) (floatValue * 255.0d);
            } else if (i17 == 2) {
                i14 = (int) (floatValue * 255.0d);
            } else if (i17 == 3) {
                iArr[i15] = Color.argb(com.anythink.basead.exoplayer.k.p.f8473b, i13, i14, (int) (floatValue * 255.0d));
            }
            i12++;
            i10 = i16;
            i9 = 1;
        }
        int i18 = i10;
        e1.c cVar = new e1.c(fArr, iArr);
        if (arrayList.size() <= i) {
            return cVar;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i19 = i18;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i19] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i19] = ((Float) arrayList.get(i)).floatValue();
                i19++;
            }
            i++;
        }
        float[] fArr4 = cVar.f37109a;
        if (fArr4.length == 0) {
            fArr4 = fArr2;
        } else if (size != 0) {
            int length = fArr4.length + size;
            float[] fArr5 = new float[length];
            int i20 = i18;
            int i21 = i20;
            int i22 = i21;
            int i23 = i22;
            while (i20 < length) {
                float f11 = i22 < fArr4.length ? fArr4[i22] : Float.NaN;
                float f12 = i23 < size ? fArr2[i23] : Float.NaN;
                if (Float.isNaN(f12) || f11 < f12) {
                    fArr5[i20] = f11;
                    i22++;
                } else if (Float.isNaN(f11) || f12 < f11) {
                    fArr5[i20] = f12;
                    i23++;
                } else {
                    fArr5[i20] = f11;
                    i22++;
                    i23++;
                    i21++;
                }
                i20++;
            }
            fArr4 = i21 == 0 ? fArr5 : Arrays.copyOf(fArr5, length - i21);
        }
        int length2 = fArr4.length;
        int[] iArr2 = new int[length2];
        for (int i24 = i18; i24 < length2; i24++) {
            float f13 = fArr4[i24];
            int binarySearch = Arrays.binarySearch(fArr, f13);
            int binarySearch2 = Arrays.binarySearch(fArr2, f13);
            int[] iArr3 = cVar.f37110b;
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f14 = fArr3[binarySearch2];
                if (iArr3.length >= 2 && f13 != fArr[i18]) {
                    for (int i25 = 1; i25 < i11; i25++) {
                        float f15 = fArr[i25];
                        if (f15 >= f13 || i25 == i11 - 1) {
                            if (i25 != i11 - 1 || f13 < f15) {
                                int i26 = i25 - 1;
                                float f16 = fArr[i26];
                                int l9 = O3.b.l(iArr3[i26], iArr3[i25], (f13 - f16) / (f15 - f16));
                                i6 = Color.argb((int) (f14 * 255.0f), Color.red(l9), Color.green(l9), Color.blue(l9));
                            } else {
                                i6 = Color.argb((int) (f14 * 255.0f), Color.red(iArr3[i25]), Color.green(iArr3[i25]), Color.blue(iArr3[i25]));
                            }
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                i6 = iArr3[i18];
                iArr2[i24] = i6;
            } else {
                int i27 = iArr3[binarySearch];
                if (size >= 2 && f13 > fArr2[i18]) {
                    for (int i28 = 1; i28 < size; i28++) {
                        float f17 = fArr2[i28];
                        if (f17 >= f13 || i28 == size - 1) {
                            if (f17 <= f13) {
                                f9 = fArr3[i28];
                            } else {
                                int i29 = i28 - 1;
                                float f18 = fArr2[i29];
                                f9 = AbstractC4603g.f(fArr3[i29], fArr3[i28], (f13 - f18) / (f17 - f18));
                            }
                            argb = Color.argb((int) (f9 * 255.0f), Color.red(i27), Color.green(i27), Color.blue(i27));
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                argb = Color.argb((int) (fArr3[i18] * 255.0f), Color.red(i27), Color.green(i27), Color.blue(i27));
                iArr2[i24] = argb;
            }
        }
        return new e1.c(fArr4, iArr2);
    }

    public int c() {
        int i = this.f1974u;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public /* synthetic */ i(int i, int i6) {
        this.f1973n = i6;
        this.f1974u = i;
    }

    public /* synthetic */ i(i iVar) {
        this.f1973n = 6;
        this.f1974u = iVar.f1974u;
    }

    public /* synthetic */ i(C4159xO c4159xO, int i) {
        this.f1973n = 9;
        this.f1974u = i;
    }

    public /* synthetic */ i(C4159xO c4159xO, int i, long j6) {
        this.f1973n = 8;
        this.f1974u = i;
    }

    public /* synthetic */ i(C4159xO c4159xO, int i, X6 x62, X6 x63) {
        this.f1973n = 10;
        this.f1974u = i;
    }

    public i() {
        this.f1973n = 0;
        this.f1974u = j.f1975n.getAndIncrement();
    }
}
