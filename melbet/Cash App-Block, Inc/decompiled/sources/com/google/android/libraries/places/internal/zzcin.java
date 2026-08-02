package com.google.android.libraries.places.internal;

import com.google.common.io.BaseEncoding$StandardBaseEncoding;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcin {
    static {
        Logger.getLogger(zzcin.class.getName());
    }

    private zzcin() {
    }

    public static byte[][] zzc(ArrayList arrayList) {
        int size = arrayList.size();
        int i = size + size;
        byte[][] bArr = new byte[i][];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zzcji zzcjiVar = (zzcji) it.next();
            bArr[i2] = zzcjiVar.zzf.zzk();
            bArr[i2 + 1] = zzcjiVar.zzg.zzk();
            i2 += 2;
        }
        Logger logger = zzcgn.zza;
        int i3 = 0;
        while (i3 < i) {
            byte[] bArr2 = bArr[i3];
            int i4 = i3 + 1;
            byte[] bArr3 = bArr[i4];
            byte[] bArr4 = zzcgn.zzb;
            if (zzcgn.zzc(bArr2, bArr4)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        ArrayList arrayList2 = new ArrayList(i + 10);
                        for (int i5 = 0; i5 < i3; i5++) {
                            arrayList2.add(bArr[i5]);
                        }
                        while (i3 < i) {
                            byte[] bArr5 = bArr[i3];
                            byte[] bArr6 = bArr[i3 + 1];
                            if (zzcgn.zzc(bArr5, bArr4)) {
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i6 <= length) {
                                        if (i6 == length || bArr6[i6] == 44) {
                                            byte[] decode = BaseEncoding$StandardBaseEncoding.BASE64.decode(new String(bArr6, i7, i6 - i7, StandardCharsets.US_ASCII));
                                            arrayList2.add(bArr5);
                                            arrayList2.add(decode);
                                            i7 = i6 + 1;
                                        }
                                        i6++;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i3 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i4] = BaseEncoding$StandardBaseEncoding.BASE64.decode(new String(bArr3, StandardCharsets.US_ASCII));
            }
            i3 += 2;
        }
        return bArr;
    }
}
