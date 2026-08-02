package com.google.android.libraries.places.internal;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes4.dex */
public final class zzbtw implements zzbsm {
    public static final byte[] zza = {48, PnmConstants.PBM_TEXT_CODE, PnmConstants.PGM_TEXT_CODE, PnmConstants.PPM_TEXT_CODE, PnmConstants.PBM_RAW_CODE, PnmConstants.PGM_RAW_CODE, PnmConstants.PPM_RAW_CODE, PnmConstants.PAM_RAW_CODE, 56, 57, 65, 66, 67, 68, 69, 70};

    private zzbtw() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r0 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        java.lang.System.arraycopy(r9, 0, r1, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r0 >= r9.length) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        r2 = r10 + 1;
        r6 = r9[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r6 < 32) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r6 >= 126) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r6 != 37) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        r1[r10] = r6;
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r1[r10] = 37;
        r8 = com.google.android.libraries.places.internal.zzbtw.zza;
        r1[r2] = r8[(r6 >> 4) & 15];
        r1[r10 + 2] = r8[r6 & 15];
        r10 = r10 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        return java.util.Arrays.copyOf(r1, r10);
     */
    @Override // com.google.android.libraries.places.internal.zzbsm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zza(Object obj) {
        byte[] bytes = ((String) obj).getBytes(StandardCharsets.UTF_8);
        int i = 0;
        while (true) {
            int length = bytes.length;
            if (i >= length) {
                return bytes;
            }
            byte b = bytes[i];
            if (b < 32 || b >= 126 || b == 37) {
                break;
            }
            i++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsm
    public final /* bridge */ /* synthetic */ Object zzb(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length) {
                return new String(bArr, 0);
            }
            byte b = bArr[i];
            if (b < 32 || b >= 126 || (b == 37 && i + 2 < length)) {
                break;
            }
            i++;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        int i2 = 0;
        while (true) {
            int length2 = bArr.length;
            if (i2 >= length2) {
                return new String(allocate.array(), 0, allocate.position(), StandardCharsets.UTF_8);
            }
            int i3 = i2 + 1;
            if (bArr[i2] == 37 && i2 + 2 < length2) {
                try {
                    allocate.put((byte) Integer.parseInt(new String(bArr, i3, 2, StandardCharsets.US_ASCII), 16));
                    i2 += 3;
                } catch (NumberFormatException unused) {
                }
            }
            allocate.put(bArr[i2]);
            i2 = i3;
        }
    }
}
