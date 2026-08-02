package N6;

import a.AbstractC0426a;
import android.graphics.Color;
import com.google.android.gms.internal.ads.C4182xO;
import com.google.android.gms.internal.ads.InterfaceC3606mo;
import com.google.android.gms.internal.ads.InterfaceC3765pl;
import com.google.android.gms.internal.ads.InterfaceC4236yO;
import com.google.android.gms.internal.ads.X6;
import j1.D;
import java.util.ArrayList;
import java.util.Arrays;
import k1.AbstractC4640b;
import l1.AbstractC4672g;

/* loaded from: classes2.dex */
public final class i implements InterfaceC3765pl, InterfaceC3606mo, D {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2061n;

    /* renamed from: u, reason: collision with root package name */
    public int f2062u;

    public /* synthetic */ i(int i) {
        this.f2061n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public /* synthetic */ void mo5a(Object obj) {
        switch (this.f2061n) {
            case 4:
                ((v2.l) obj).C3(this.f2062u);
                break;
            case 8:
                ((InterfaceC4236yO) obj).b(this.f2062u);
                break;
            case 9:
                ((InterfaceC4236yO) obj).d(this.f2062u);
                break;
            default:
                ((InterfaceC4236yO) obj).a(this.f2062u);
                break;
        }
    }

    @Override // j1.D
    public Object b(AbstractC4640b abstractC4640b, float f2) {
        int i;
        int i4;
        int argb;
        float f9;
        ArrayList arrayList = new ArrayList();
        int i6 = 1;
        int i9 = 0;
        boolean z6 = abstractC4640b.I() == 1;
        if (z6) {
            abstractC4640b.b();
        }
        while (abstractC4640b.D()) {
            arrayList.add(Float.valueOf((float) abstractC4640b.F()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f2062u = 2;
        }
        if (z6) {
            abstractC4640b.z();
        }
        if (this.f2062u == -1) {
            this.f2062u = arrayList.size() / 4;
        }
        int i10 = this.f2062u;
        float[] fArr = new float[i10];
        int[] iArr = new int[i10];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i = this.f2062u * 4;
            if (i11 >= i) {
                break;
            }
            int i14 = i11 / 4;
            double floatValue = ((Float) arrayList.get(i11)).floatValue();
            int i15 = i9;
            int i16 = i11 % 4;
            if (i16 == 0) {
                if (i14 > 0) {
                    float f10 = (float) floatValue;
                    if (fArr[i14 - 1] >= f10) {
                        fArr[i14] = f10 + 0.01f;
                    }
                }
                fArr[i14] = (float) floatValue;
            } else if (i16 == i6) {
                i12 = (int) (floatValue * 255.0d);
            } else if (i16 == 2) {
                i13 = (int) (floatValue * 255.0d);
            } else if (i16 == 3) {
                iArr[i14] = Color.argb(com.anythink.basead.exoplayer.k.p.f9259b, i12, i13, (int) (floatValue * 255.0d));
            }
            i11++;
            i9 = i15;
            i6 = 1;
        }
        int i17 = i9;
        g1.c cVar = new g1.c(fArr, iArr);
        if (arrayList.size() <= i) {
            return cVar;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i18 = i17;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i18] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i18] = ((Float) arrayList.get(i)).floatValue();
                i18++;
            }
            i++;
        }
        float[] fArr4 = cVar.f37585a;
        if (fArr4.length == 0) {
            fArr4 = fArr2;
        } else if (size != 0) {
            int length = fArr4.length + size;
            float[] fArr5 = new float[length];
            int i19 = i17;
            int i20 = i19;
            int i21 = i20;
            int i22 = i21;
            while (i19 < length) {
                float f11 = i21 < fArr4.length ? fArr4[i21] : Float.NaN;
                float f12 = i22 < size ? fArr2[i22] : Float.NaN;
                if (Float.isNaN(f12) || f11 < f12) {
                    fArr5[i19] = f11;
                    i21++;
                } else if (Float.isNaN(f11) || f12 < f11) {
                    fArr5[i19] = f12;
                    i22++;
                } else {
                    fArr5[i19] = f11;
                    i21++;
                    i22++;
                    i20++;
                }
                i19++;
            }
            fArr4 = i20 == 0 ? fArr5 : Arrays.copyOf(fArr5, length - i20);
        }
        int length2 = fArr4.length;
        int[] iArr2 = new int[length2];
        for (int i23 = i17; i23 < length2; i23++) {
            float f13 = fArr4[i23];
            int binarySearch = Arrays.binarySearch(fArr, f13);
            int binarySearch2 = Arrays.binarySearch(fArr2, f13);
            int[] iArr3 = cVar.f37586b;
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f14 = fArr3[binarySearch2];
                if (iArr3.length >= 2 && f13 != fArr[i17]) {
                    for (int i24 = 1; i24 < i10; i24++) {
                        float f15 = fArr[i24];
                        if (f15 >= f13 || i24 == i10 - 1) {
                            if (i24 != i10 - 1 || f13 < f15) {
                                int i25 = i24 - 1;
                                float f16 = fArr[i25];
                                int e9 = AbstractC0426a.e(iArr3[i25], iArr3[i24], (f13 - f16) / (f15 - f16));
                                i4 = Color.argb((int) (f14 * 255.0f), Color.red(e9), Color.green(e9), Color.blue(e9));
                            } else {
                                i4 = Color.argb((int) (f14 * 255.0f), Color.red(iArr3[i24]), Color.green(iArr3[i24]), Color.blue(iArr3[i24]));
                            }
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                i4 = iArr3[i17];
                iArr2[i23] = i4;
            } else {
                int i26 = iArr3[binarySearch];
                if (size >= 2 && f13 > fArr2[i17]) {
                    for (int i27 = 1; i27 < size; i27++) {
                        float f17 = fArr2[i27];
                        if (f17 >= f13 || i27 == size - 1) {
                            if (f17 <= f13) {
                                f9 = fArr3[i27];
                            } else {
                                int i28 = i27 - 1;
                                float f18 = fArr2[i28];
                                f9 = AbstractC4672g.f(fArr3[i28], fArr3[i27], (f13 - f18) / (f17 - f18));
                            }
                            argb = Color.argb((int) (f9 * 255.0f), Color.red(i26), Color.green(i26), Color.blue(i26));
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                argb = Color.argb((int) (fArr3[i17] * 255.0f), Color.red(i26), Color.green(i26), Color.blue(i26));
                iArr2[i23] = argb;
            }
        }
        return new g1.c(fArr4, iArr2);
    }

    public int c() {
        int i = this.f2062u;
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

    public /* synthetic */ i(int i, int i4) {
        this.f2061n = i4;
        this.f2062u = i;
    }

    public /* synthetic */ i(i iVar) {
        this.f2061n = 6;
        this.f2062u = iVar.f2062u;
    }

    public /* synthetic */ i(C4182xO c4182xO, int i) {
        this.f2061n = 9;
        this.f2062u = i;
    }

    public /* synthetic */ i(C4182xO c4182xO, int i, long j6) {
        this.f2061n = 8;
        this.f2062u = i;
    }

    public /* synthetic */ i(C4182xO c4182xO, int i, X6 x62, X6 x63) {
        this.f2061n = 10;
        this.f2062u = i;
    }

    public i() {
        this.f2061n = 0;
        this.f2062u = j.f2063n.getAndIncrement();
    }
}
